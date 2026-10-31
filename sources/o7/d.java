package o7;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rc.j;
import wb.w;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: BidMachineAssetCacheInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23120a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f23121b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f23122c = m.a(b.f23126d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f23123d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile xb.a f23124e;

    /* JADX INFO: compiled from: BidMachineAssetCacheInitializer.kt */
    public static final class a implements ac.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xb.a f23125a;

        a(xb.a aVar) {
            this.f23125a = aVar;
        }

        @Override // ac.c.a
        public void a(ac.c.b storageSpaceStat) {
            t.f(storageSpaceStat, "storageSpaceStat");
            this.f23125a.F();
        }
    }

    /* JADX INFO: compiled from: BidMachineAssetCacheInitializer.kt */
    static final class b extends u implements id.a<ac.c> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23126d = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ac.c invoke() {
            return new ac.c(0.0d, null, 0L, null, 15, null);
        }
    }

    private d() {
    }

    public static final xb.a b(Context context) {
        t.f(context, "context");
        xb.a aVar = f23124e;
        if (aVar != null) {
            return aVar;
        }
        synchronized (f23123d) {
            xb.a aVar2 = f23124e;
            if (aVar2 != null) {
                return aVar2;
            }
            File file = new File(context.getNoBackupFilesDir(), "bm/renderer/cache");
            File file2 = new File(context.getCacheDir(), "bm/renderer/temp");
            j jVar = new j();
            w wVarA = w.f27717g.a();
            xb.a aVar3 = new xb.a(file, new zb.b(context, file2, null, wVarA, jVar, 4, null), f23120a.c(), wVarA, jVar);
            f23124e = aVar3;
            return aVar3;
        }
    }

    private final ac.c c() {
        return (ac.c) f23122c.getValue();
    }

    public final void a(Context context, xb.a.c configuration) {
        t.f(context, "context");
        t.f(configuration, "configuration");
        b(context).t(configuration);
    }

    public final void d(Context context) {
        t.f(context, "context");
        if (f23121b.compareAndSet(false, true)) {
            c().c(new a(b(context)));
            c().g();
        }
    }

    public final void e(Context context) {
        t.f(context, "context");
        b(context).G();
    }
}
