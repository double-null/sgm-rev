package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.l;
import f1.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.j;
import n1.m;
import n1.q;

/* JADX INFO: compiled from: SystemAlarmDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements f1.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f3719k = l.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1.a f3721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f3722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1.d f3723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f3724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f3725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f3726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final List<Intent> f3727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Intent f3728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f3729j;

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f3727h) {
                e eVar2 = e.this;
                eVar2.f3728i = eVar2.f3727h.get(0);
            }
            Intent intent = e.this.f3728i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f3728i.getIntExtra("KEY_START_ID", 0);
                l lVarC = l.c();
                String str = e.f3719k;
                lVarC.a(str, String.format("Processing command %s, %s", e.this.f3728i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = m.b(e.this.f3720a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    l.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    e eVar3 = e.this;
                    eVar3.f3725f.o(eVar3.f3728i, intExtra, eVar3);
                    l.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        l lVarC2 = l.c();
                        String str2 = e.f3719k;
                        lVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        l.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        l.c().a(e.f3719k, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f3731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f3732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3733c;

        b(e eVar, Intent intent, int i10) {
            this.f3731a = eVar;
            this.f3732b = intent;
            this.f3733c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3731a.a(this.f3732b, this.f3733c);
        }
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    interface c {
        void b();
    }

    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f3734a;

        d(e eVar) {
            this.f3734a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3734a.c();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f3726g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f3727h) {
            Iterator<Intent> it = this.f3727h.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock wakeLockB = m.b(this.f3720a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f3724e.p().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        l lVarC = l.c();
        String str = f3719k;
        lVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f3727h) {
            boolean z10 = this.f3727h.isEmpty() ? false : true;
            this.f3727h.add(intent);
            if (!z10) {
                l();
            }
        }
        return true;
    }

    void c() {
        l lVarC = l.c();
        String str = f3719k;
        lVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f3727h) {
            if (this.f3728i != null) {
                l.c().a(str, String.format("Removing command %s", this.f3728i), new Throwable[0]);
                if (!this.f3727h.remove(0).equals(this.f3728i)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f3728i = null;
            }
            j backgroundExecutor = this.f3721b.getBackgroundExecutor();
            if (!this.f3725f.n() && this.f3727h.isEmpty() && !backgroundExecutor.a()) {
                l.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f3729j;
                if (cVar != null) {
                    cVar.b();
                }
            } else if (!this.f3727h.isEmpty()) {
                l();
            }
        }
    }

    f1.d d() {
        return this.f3723d;
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f3720a, str, z10), 0));
    }

    o1.a f() {
        return this.f3721b;
    }

    i g() {
        return this.f3724e;
    }

    q h() {
        return this.f3722c;
    }

    void j() {
        l.c().a(f3719k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3723d.i(this);
        this.f3722c.a();
        this.f3729j = null;
    }

    void k(Runnable runnable) {
        this.f3726g.post(runnable);
    }

    void m(c cVar) {
        if (this.f3729j != null) {
            l.c().b(f3719k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f3729j = cVar;
        }
    }

    e(Context context, f1.d dVar, i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3720a = applicationContext;
        this.f3725f = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f3722c = new q();
        iVar = iVar == null ? i.k(context) : iVar;
        this.f3724e = iVar;
        dVar = dVar == null ? iVar.m() : dVar;
        this.f3723d = dVar;
        this.f3721b = iVar.p();
        dVar.c(this);
        this.f3727h = new ArrayList();
        this.f3728i = null;
        this.f3726g = new Handler(Looper.getMainLooper());
    }
}
