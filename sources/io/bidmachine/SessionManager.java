package io.bidmachine;

import android.content.Context;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class SessionManager {
    public static final String SESSION_ID_EMPTY = "";
    private static final String TAG = "SessionManager";
    private static volatile SessionManager instance;
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionResetAfterSec;
    private long sessionStartTime;
    private final r7.e versionManager = new r7.e();
    private final SessionManagerKtWrapper sessionManagerKtWrapper = new SessionManagerKtWrapper(this);
    private String sessionId = "";
    private final CopyOnWriteArraySet<a> observers = new CopyOnWriteArraySet<>();

    interface a {
        void a(b bVar);
    }

    enum b {
        START,
        RESUME,
        PAUSE
    }

    private SessionManager() {
        startNewSession();
    }

    static SessionManager get() {
        SessionManager sessionManager = instance;
        if (sessionManager == null) {
            synchronized (SessionManager.class) {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            }
        }
        return sessionManager;
    }

    private long getLastSessionDurationMs() {
        Context context = this.applicationContext;
        if (context != null) {
            return f2.r(context);
        }
        io.bidmachine.core.a.k(TAG, "Context not attached");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewSessionStarted$0(Context context) {
        this.versionManager.k(context, this.sessionManagerKtWrapper);
        f2.z(context);
        f2.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSessionPaused$1(Context context) {
        this.versionManager.i(context, this.sessionManagerKtWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveCurrentSessionDuration$2(Context context) {
        f2.P(context, getSessionDurationMs());
    }

    private void notifyObservers(b bVar) {
        Iterator<a> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void onContextAttached() {
        onNewSessionStarted();
    }

    private void onNewSessionStarted() {
        io.bidmachine.core.h.B(this.applicationContext, new Executable() { // from class: io.bidmachine.b5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                this.f17517a.lambda$onNewSessionStarted$0((Context) obj);
            }
        });
    }

    private void onSessionPaused() {
        io.bidmachine.core.h.B(this.applicationContext, new Executable() { // from class: io.bidmachine.y4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                this.f20506a.lambda$onSessionPaused$1((Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCurrentSessionDuration(final Context context) {
        io.bidmachine.core.h.Q(new Runnable() { // from class: io.bidmachine.a5
            @Override // java.lang.Runnable
            public final void run() {
                this.f16508a.lambda$saveCurrentSessionDuration$2(context);
            }
        });
    }

    void addObserver(a aVar) {
        this.observers.add(aVar);
    }

    synchronized void attachContext(Context context) {
        boolean z10 = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z10) {
            onContextAttached();
        }
    }

    int getLastSessionDurationSec() {
        return (int) (getLastSessionDurationMs() / 1000);
    }

    int getSessionCount() {
        Context context = this.applicationContext;
        if (context != null) {
            return f2.t(context);
        }
        io.bidmachine.core.a.k(TAG, "Context not attached");
        return 0;
    }

    long getSessionDurationMs() {
        if (this.resumeTime == 0) {
            return 0L;
        }
        return io.bidmachine.core.c.a() - this.sessionStartTime;
    }

    int getSessionDurationSec() {
        return (int) (getSessionDurationMs() / 1000);
    }

    String getSessionId() {
        return this.sessionId;
    }

    long getSessionStartTime() {
        return this.sessionStartTime;
    }

    void pause() {
        if (this.resumeTime == 0) {
            return;
        }
        this.pauseTime = io.bidmachine.core.c.a();
        onSessionPaused();
        notifyObservers(b.PAUSE);
        io.bidmachine.core.h.B(this.applicationContext, new Executable() { // from class: io.bidmachine.z4
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                this.f20516a.saveCurrentSessionDuration((Context) obj);
            }
        });
        io.bidmachine.core.a.a(TAG, "Session paused: " + getSessionDurationSec() + " sec.");
    }

    void removeObserver(a aVar) {
        this.observers.remove(aVar);
    }

    void setSessionResetAfter(long j10) {
        this.sessionResetAfterSec = j10;
    }

    void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionStartTime = io.bidmachine.core.c.a();
        this.pauseTime = 0L;
        this.resumeTime = 0L;
        onNewSessionStarted();
        notifyObservers(b.START);
        io.bidmachine.core.a.a(TAG, "New session started");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    void resume() {
        long jA = io.bidmachine.core.c.a();
        long j10 = this.sessionResetAfterSec;
        if (j10 > 0) {
            long j11 = this.pauseTime;
            if (j11 > 0 && jA - j11 >= j10 * 1000) {
                startNewSession();
            } else {
                notifyObservers(b.RESUME);
                io.bidmachine.core.a.a(TAG, cTJaRZ.vXZzFiYHjXNf);
            }
        } else {
            notifyObservers(b.RESUME);
            io.bidmachine.core.a.a(TAG, cTJaRZ.vXZzFiYHjXNf);
        }
        this.resumeTime = jA;
    }
}
