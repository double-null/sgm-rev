package be;

import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.concurrent.Executor;
import ud.k0;
import ud.r1;
import zd.f0;
import zd.h0;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends r1 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4484d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k0 f4485e = k0.p0(k.f4502c, h0.e("kotlinx.coroutines.io.parallelism", od.k.d(64, f0.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m0(zc.k.f29181a, runnable);
    }

    @Override // ud.k0
    public void m0(zc.j jVar, Runnable runnable) {
        f4485e.m0(jVar, runnable);
    }

    @Override // ud.k0
    public k0 o0(int i10, String str) {
        return k.f4502c.o0(i10, str);
    }

    @Override // ud.k0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(RHIpdOnfgiYkEj.htCHIHDDSWYafC.toString());
    }
}
