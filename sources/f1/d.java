package f1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import n1.m;

/* JADX INFO: compiled from: Processor.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements b, l1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f14536l = l.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f14538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.work.b f14539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o1.a f14540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f14541e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<e> f14544h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, j> f14543g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, j> f14542f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f14545i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f14546j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PowerManager.WakeLock f14537a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f14547k = new Object();

    /* JADX INFO: compiled from: Processor.java */
    private static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f14548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f14549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ListenableFuture<Boolean> f14550c;

        a(b bVar, String str, ListenableFuture<Boolean> listenableFuture) {
            this.f14548a = bVar;
            this.f14549b = str;
            this.f14550c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f14550c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f14548a.e(this.f14549b, zBooleanValue);
        }
    }

    public d(Context context, androidx.work.b bVar, o1.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f14538b = context;
        this.f14539c = bVar;
        this.f14540d = aVar;
        this.f14541e = workDatabase;
        this.f14544h = list;
    }

    private static boolean d(String str, j jVar) {
        if (jVar == null) {
            l.c().a(f14536l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        jVar.e();
        l.c().a(f14536l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f14547k) {
            if (!(!this.f14542f.isEmpty())) {
                try {
                    this.f14538b.startService(androidx.work.impl.foreground.a.d(this.f14538b));
                } catch (Throwable th) {
                    l.c().b(f14536l, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f14537a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f14537a = null;
                }
            }
        }
    }

    @Override // l1.a
    public void a(String str) {
        synchronized (this.f14547k) {
            this.f14542f.remove(str);
            m();
        }
    }

    @Override // l1.a
    public void b(String str, androidx.work.g gVar) {
        synchronized (this.f14547k) {
            l.c().d(f14536l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j jVarRemove = this.f14543g.remove(str);
            if (jVarRemove != null) {
                if (this.f14537a == null) {
                    PowerManager.WakeLock wakeLockB = m.b(this.f14538b, "ProcessorForegroundLck");
                    this.f14537a = wakeLockB;
                    wakeLockB.acquire();
                }
                this.f14542f.put(str, jVarRemove);
                androidx.core.content.a.k(this.f14538b, androidx.work.impl.foreground.a.c(this.f14538b, str, gVar));
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f14547k) {
            this.f14546j.add(bVar);
        }
    }

    @Override // f1.b
    public void e(String str, boolean z10) {
        synchronized (this.f14547k) {
            this.f14543g.remove(str);
            l.c().a(f14536l, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator<b> it = this.f14546j.iterator();
            while (it.hasNext()) {
                it.next().e(str, z10);
            }
        }
    }

    public boolean f(String str) {
        boolean zContains;
        synchronized (this.f14547k) {
            zContains = this.f14545i.contains(str);
        }
        return zContains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.f14547k) {
            z10 = this.f14543g.containsKey(str) || this.f14542f.containsKey(str);
        }
        return z10;
    }

    public boolean h(String str) {
        boolean zContainsKey;
        synchronized (this.f14547k) {
            zContainsKey = this.f14542f.containsKey(str);
        }
        return zContainsKey;
    }

    public void i(b bVar) {
        synchronized (this.f14547k) {
            this.f14546j.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f14547k) {
            if (g(str)) {
                l.c().a(f14536l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j jVarA = new j.c(this.f14538b, this.f14539c, this.f14540d, this, this.f14541e, str).c(this.f14544h).b(aVar).a();
            ListenableFuture<Boolean> listenableFutureC = jVarA.c();
            listenableFutureC.addListener(new a(this, str, listenableFutureC), this.f14540d.a());
            this.f14543g.put(str, jVarA);
            this.f14540d.getBackgroundExecutor().execute(jVarA);
            l.c().a(f14536l, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean zD;
        synchronized (this.f14547k) {
            boolean z10 = true;
            l.c().a(f14536l, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f14545i.add(str);
            j jVarRemove = this.f14542f.remove(str);
            if (jVarRemove == null) {
                z10 = false;
            }
            if (jVarRemove == null) {
                jVarRemove = this.f14543g.remove(str);
            }
            zD = d(str, jVarRemove);
            if (z10) {
                m();
            }
        }
        return zD;
    }

    public boolean n(String str) {
        boolean zD;
        synchronized (this.f14547k) {
            l.c().a(f14536l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zD = d(str, this.f14542f.remove(str));
        }
        return zD;
    }

    public boolean o(String str) {
        boolean zD;
        synchronized (this.f14547k) {
            l.c().a(f14536l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zD = d(str, this.f14543g.remove(str));
        }
        return zD;
    }
}
