package yd;

import java.util.ArrayList;
import kotlin.collections.b0;
import ud.o0;
import ud.p0;
import ud.q0;
import ud.s0;
import wc.g0;
import wd.u;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.j f28877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd.a f28879c;

    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28880h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f28881i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ xd.d<T> f28882j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ d<T> f28883k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(xd.d<? super T> dVar, d<T> dVar2, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f28882j = dVar;
            this.f28883k = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f28882j, this.f28883k, fVar);
            aVar.f28881i = obj;
            return aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28880h;
            if (i10 == 0) {
                wc.s.b(obj);
                o0 o0Var = (o0) this.f28881i;
                xd.d<T> dVar = this.f28882j;
                u<T> uVarJ = this.f28883k.j(o0Var);
                this.f28880h = 1;
                if (xd.e.h(dVar, uVarJ, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements id.p<wd.s<? super T>, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28884h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f28885i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d<T> f28886j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, zc.f<? super b> fVar) {
            super(2, fVar);
            this.f28886j = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            b bVar = new b(this.f28886j, fVar);
            bVar.f28885i = obj;
            return bVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wd.s<? super T> sVar, zc.f<? super g0> fVar) {
            return ((b) create(sVar, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28884h;
            if (i10 == 0) {
                wc.s.b(obj);
                wd.s<? super T> sVar = (wd.s) this.f28885i;
                d<T> dVar = this.f28886j;
                this.f28884h = 1;
                if (dVar.f(sVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    public d(zc.j jVar, int i10, wd.a aVar) {
        this.f28877a = jVar;
        this.f28878b = i10;
        this.f28879c = aVar;
    }

    static /* synthetic */ <T> Object d(d<T> dVar, xd.d<? super T> dVar2, zc.f<? super g0> fVar) {
        Object objD = p0.d(new a(dVar2, dVar, null), fVar);
        return objD == ad.d.f() ? objD : g0.f27756a;
    }

    @Override // xd.c
    public Object a(xd.d<? super T> dVar, zc.f<? super g0> fVar) {
        return d(this, dVar, fVar);
    }

    protected String b() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[PHI: r4
      0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // yd.j
    public xd.c<T> c(zc.j jVar, int i10, wd.a aVar) {
        zc.j jVarZ = jVar.z(this.f28877a);
        if (aVar == wd.a.SUSPEND) {
            int i11 = this.f28878b;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 != -2 && (i11 = i11 + i10) < 0) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = i11;
                    }
                }
            }
            aVar = this.f28879c;
        }
        return (kotlin.jvm.internal.t.a(jVarZ, this.f28877a) && i10 == this.f28878b && aVar == this.f28879c) ? this : g(jVarZ, i10, aVar);
    }

    protected abstract Object f(wd.s<? super T> sVar, zc.f<? super g0> fVar);

    protected abstract d<T> g(zc.j jVar, int i10, wd.a aVar);

    public final id.p<wd.s<? super T>, zc.f<? super g0>, Object> h() {
        return new b(this, null);
    }

    public final int i() {
        int i10 = this.f28878b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public u<T> j(o0 o0Var) {
        return wd.q.c(o0Var, this.f28877a, i(), this.f28879c, q0.ATOMIC, null, h(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        if (this.f28877a != zc.k.f29181a) {
            arrayList.add("context=" + this.f28877a);
        }
        if (this.f28878b != -3) {
            arrayList.add("capacity=" + this.f28878b);
        }
        if (this.f28879c != wd.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f28879c);
        }
        return s0.a(this) + '[' + b0.V(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
