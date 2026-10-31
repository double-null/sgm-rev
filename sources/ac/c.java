package ac;

import android.os.Environment;
import android.os.StatFs;
import id.p;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.e2;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.y0;
import wb.w;
import wc.g0;
import wc.k;
import wc.m;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: StorageSpaceMonitor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0005c f305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<a> f306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f308e;

    /* JADX INFO: compiled from: StorageSpaceMonitor.kt */
    public interface a {
        default void a(b storageSpaceStat) {
            t.f(storageSpaceStat, "storageSpaceStat");
        }
    }

    /* JADX INFO: compiled from: StorageSpaceMonitor.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final double f312d;

        public b(long j10, long j11) {
            this.f309a = j10;
            this.f310b = j11;
            double d10 = j10 == 0 ? 0.0d : j11 / j10;
            this.f311c = d10;
            this.f312d = ((double) 1) - d10;
        }

        public final double a() {
            return this.f311c;
        }

        public final double b() {
            return this.f312d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f309a == bVar.f309a && this.f310b == bVar.f310b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f309a) * 31) + Long.hashCode(this.f310b);
        }

        public String toString() {
            return "StorageSpaceStat(totalBytes=" + this.f309a + ", availableBytes=" + this.f310b + ')';
        }
    }

    /* JADX INFO: renamed from: ac.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StorageSpaceMonitor.kt */
    public interface InterfaceC0005c {
        b a();
    }

    /* JADX INFO: compiled from: StorageSpaceMonitor.kt */
    public static final class d implements InterfaceC0005c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f313a;

        public d(File targetDir) {
            t.f(targetDir, "targetDir");
            this.f313a = targetDir;
        }

        @Override // ac.c.InterfaceC0005c
        public b a() {
            try {
                StatFs statFs = new StatFs(this.f313a.getAbsolutePath());
                return new b(statFs.getTotalBytes(), statFs.getAvailableBytes());
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: StorageSpaceMonitor.kt */
    static final class e extends u implements id.a<o0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(w wVar) {
            super(0);
            this.f314d = wVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(this.f314d.e()));
        }
    }

    /* JADX INFO: compiled from: StorageSpaceMonitor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.file.StorageSpaceMonitor$start$1", f = "StorageSpaceMonitor.kt", l = {47}, m = "invokeSuspend")
    static final class f extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f315h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f316i;

        f(zc.f<? super f> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            f fVar2 = c.this.new f(fVar);
            fVar2.f316i = obj;
            return fVar2;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o0 o0Var;
            Object objF = ad.d.f();
            int i10 = this.f315h;
            if (i10 == 0) {
                s.b(obj);
                o0Var = (o0) this.f316i;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0Var = (o0) this.f316i;
                s.b(obj);
            }
            while (p0.f(o0Var)) {
                c cVar = c.this;
                try {
                    r.a aVar = r.f27774b;
                    cVar.d();
                    r.c(g0.f27756a);
                } catch (Throwable th) {
                    r.a aVar2 = r.f27774b;
                    r.c(s.a(th));
                }
                long j10 = c.this.f304a;
                this.f316i = o0Var;
                this.f315h = 1;
                if (y0.b(j10, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    public /* synthetic */ c(double d10, w wVar, long j10, InterfaceC0005c interfaceC0005c, kotlin.jvm.internal.k kVar) {
        this(d10, wVar, j10, interfaceC0005c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        b bVarA = this.f305b.a();
        if (bVarA != null && bVarA.a() < this.f308e) {
            Iterator<T> it = this.f306c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(bVarA);
            }
        }
    }

    private final o0 e() {
        return (o0) this.f307d.getValue();
    }

    public final void c(a listener) {
        t.f(listener, "listener");
        this.f306c.add(listener);
    }

    public final b f() {
        return this.f305b.a();
    }

    public final void g() {
        h();
        ud.k.d(e(), null, null, new f(null), 3, null);
    }

    public final void h() {
        e2.f(e().q(), null, 1, null);
    }

    private c(double d10, w wVar, long j10, InterfaceC0005c interfaceC0005c) {
        this.f304a = j10;
        this.f305b = interfaceC0005c;
        this.f306c = new CopyOnWriteArraySet();
        this.f307d = m.a(new e(wVar));
        this.f308e = od.k.h(d10, 0.0d, 1.0d);
    }

    public /* synthetic */ c(double d10, w wVar, long j10, InterfaceC0005c interfaceC0005c, int i10, kotlin.jvm.internal.k kVar) {
        long jS;
        InterfaceC0005c dVar;
        double d11 = (i10 & 1) != 0 ? 0.1d : d10;
        w wVarA = (i10 & 2) != 0 ? w.f27717g.a() : wVar;
        if ((i10 & 4) != 0) {
            sd.a.C0418a c0418a = sd.a.f25407b;
            jS = sd.c.s(10, sd.d.SECONDS);
        } else {
            jS = j10;
        }
        if ((i10 & 8) != 0) {
            File dataDirectory = Environment.getDataDirectory();
            t.e(dataDirectory, "getDataDirectory()");
            dVar = new d(dataDirectory);
        } else {
            dVar = interfaceC0005c;
        }
        this(d11, wVarA, jS, dVar, null);
    }
}
