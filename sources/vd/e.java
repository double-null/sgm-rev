package vd;

import android.os.Handler;
import android.os.Looper;
import id.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import od.k;
import ud.d2;
import ud.e1;
import ud.g1;
import ud.m2;
import ud.n;
import wc.g0;
import zc.j;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f27474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f27477f;

    /* JADX INFO: compiled from: Runnable.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f27478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f27479b;

        public a(n nVar, e eVar) {
            this.f27478a = nVar;
            this.f27479b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27478a.D(this.f27479b, g0.f27756a);
        }
    }

    private e(Handler handler, String str, boolean z10) {
        super(null);
        this.f27474c = handler;
        this.f27475d = str;
        this.f27476e = z10;
        this.f27477f = z10 ? this : new e(handler, str, true);
    }

    private final void u0(j jVar, Runnable runnable) {
        d2.c(jVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        e1.b().m0(jVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(e eVar, Runnable runnable) {
        eVar.f27474c.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 x0(e eVar, Runnable runnable, Throwable th) {
        eVar.f27474c.removeCallbacks(runnable);
        return g0.f27756a;
    }

    @Override // vd.f, ud.x0
    public g1 L(long j10, final Runnable runnable, j jVar) {
        if (this.f27474c.postDelayed(runnable, k.g(j10, 4611686018427387903L))) {
            return new g1() { // from class: vd.c
                @Override // ud.g1
                public final void e() {
                    e.w0(this.f27470a, runnable);
                }
            };
        }
        u0(jVar, runnable);
        return m2.f26792a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f27474c == this.f27474c && eVar.f27476e == this.f27476e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27474c) ^ (this.f27476e ? 1231 : 1237);
    }

    @Override // ud.k0
    public void m0(j jVar, Runnable runnable) {
        if (this.f27474c.post(runnable)) {
            return;
        }
        u0(jVar, runnable);
    }

    @Override // ud.k0
    public boolean n0(j jVar) {
        return (this.f27476e && t.a(Looper.myLooper(), this.f27474c.getLooper())) ? false : true;
    }

    @Override // ud.k2, ud.k0
    public String toString() {
        String strR0 = r0();
        if (strR0 != null) {
            return strR0;
        }
        String string = this.f27475d;
        if (string == null) {
            string = this.f27474c.toString();
        }
        if (!this.f27476e) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // ud.x0
    public void u(long j10, n<? super g0> nVar) {
        final a aVar = new a(nVar, this);
        if (this.f27474c.postDelayed(aVar, k.g(j10, 4611686018427387903L))) {
            nVar.H(new l() { // from class: vd.d
                @Override // id.l
                public final Object invoke(Object obj) {
                    return e.x0(this.f27472a, aVar, (Throwable) obj);
                }
            });
        } else {
            u0(nVar.getContext(), aVar);
        }
    }

    @Override // ud.k2
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public e q0() {
        return this.f27477f;
    }

    public /* synthetic */ e(Handler handler, String str, int i10, kotlin.jvm.internal.k kVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public e(Handler handler, String str) {
        this(handler, str, false);
    }
}
