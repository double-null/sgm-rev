package f1;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.l;
import androidx.work.o;
import androidx.work.r;
import androidx.work.v;
import androidx.work.w;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import n1.k;

/* JADX INFO: compiled from: WorkManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f14564j = l.f("WorkManagerImpl");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static i f14565k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static i f14566l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f14567m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f14568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.b f14569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f14570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o1.a f14571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<e> f14572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f14573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n1.g f14574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f14576i;

    public i(Context context, androidx.work.b bVar, o1.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(r.f3830a));
    }

    public static void e(Context context, androidx.work.b bVar) {
        synchronized (f14567m) {
            i iVar = f14565k;
            if (iVar != null && f14566l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f14566l == null) {
                    f14566l = new i(applicationContext, bVar, new o1.b(bVar.l()));
                }
                f14565k = f14566l;
            }
        }
    }

    @Deprecated
    public static i j() {
        synchronized (f14567m) {
            i iVar = f14565k;
            if (iVar != null) {
                return iVar;
            }
            return f14566l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i k(Context context) {
        i iVarJ;
        synchronized (f14567m) {
            iVarJ = j();
            if (iVarJ == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof androidx.work.b.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((androidx.work.b.c) applicationContext).a());
                iVarJ = k(applicationContext);
            }
        }
        return iVarJ;
    }

    private void q(Context context, androidx.work.b bVar, o1.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14568a = applicationContext;
        this.f14569b = bVar;
        this.f14571d = aVar;
        this.f14570c = workDatabase;
        this.f14572e = list;
        this.f14573f = dVar;
        this.f14574g = new n1.g(workDatabase);
        this.f14575h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f14571d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // androidx.work.v
    public o a(String str) {
        n1.a aVarE = n1.a.e(str, this);
        this.f14571d.b(aVarE);
        return aVarE.f();
    }

    @Override // androidx.work.v
    public o c(List<? extends w> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public o f(UUID uuid) {
        n1.a aVarC = n1.a.c(uuid, this);
        this.f14571d.b(aVarC);
        return aVarC.f();
    }

    public List<e> g(Context context, androidx.work.b bVar, o1.a aVar) {
        return Arrays.asList(f.a(context, this), new g1.b(context, bVar, aVar, this));
    }

    public Context h() {
        return this.f14568a;
    }

    public androidx.work.b i() {
        return this.f14569b;
    }

    public n1.g l() {
        return this.f14574g;
    }

    public d m() {
        return this.f14573f;
    }

    public List<e> n() {
        return this.f14572e;
    }

    public WorkDatabase o() {
        return this.f14570c;
    }

    public o1.a p() {
        return this.f14571d;
    }

    public void r() {
        synchronized (f14567m) {
            this.f14575h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f14576i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f14576i = null;
            }
        }
    }

    public void s() {
        h1.g.b(h());
        o().B().k();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f14567m) {
            this.f14576i = pendingResult;
            if (this.f14575h) {
                pendingResult.finish();
                this.f14576i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f14571d.b(new k(this, str, aVar));
    }

    public void w(String str) {
        this.f14571d.b(new n1.l(this, str, true));
    }

    public void x(String str) {
        this.f14571d.b(new n1.l(this, str, false));
    }

    public i(Context context, androidx.work.b bVar, o1.a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.s(context.getApplicationContext(), aVar.getBackgroundExecutor(), z10));
    }

    public i(Context context, androidx.work.b bVar, o1.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        l.e(new l.a(bVar.j()));
        List<e> listG = g(applicationContext, bVar, aVar);
        q(context, bVar, aVar, workDatabase, listG, new d(context, bVar, aVar, workDatabase, listG));
    }
}
