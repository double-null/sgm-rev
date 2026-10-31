package o7;

import id.p;
import io.bidmachine.BidMachine;
import kotlin.coroutines.jvm.internal.l;
import ud.e1;
import ud.k;
import ud.o0;
import ud.p0;
import ud.t2;
import wc.g0;
import wc.i;
import wc.s;

/* JADX INFO: compiled from: KotlinEngine.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f23135a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o0 f23136b = p0.a(t2.b(null, 1, null).z(e1.a()));

    /* JADX INFO: compiled from: KotlinEngine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.internal.KotlinEngine$init$1", f = "KotlinEngine.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23137h;

        a(zc.f<? super a> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new a(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f23137h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            io.bidmachine.core.a.a(BidMachine.NAME, "Kotlin runtime version is " + i.f27761f);
            return g0.f27756a;
        }
    }

    private h() {
    }

    public static final void a() {
        io.bidmachine.core.a.a(BidMachine.NAME, "Init Kt");
        k.d(f23136b, null, null, new a(null), 3, null);
    }
}
