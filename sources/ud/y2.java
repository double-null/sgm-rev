package ud;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y2 {

    /* JADX INFO: compiled from: Timeout.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f26834h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f26835i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f26836j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f26837k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f26838l;

        a(zc.f<? super a> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26837k = obj;
            this.f26838l |= Integer.MIN_VALUE;
            return y2.c(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    public static final TimeoutCancellationException a(long j10, x0 x0Var, b2 b2Var) {
        String strJ;
        z0 z0Var = x0Var instanceof z0 ? (z0) x0Var : null;
        if (z0Var != null) {
            sd.a.C0418a c0418a = sd.a.f25407b;
            strJ = z0Var.J(sd.c.t(j10, sd.d.MILLISECONDS));
            if (strJ == null) {
                strJ = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strJ = "Timed out waiting for " + j10 + " ms";
        }
        return new TimeoutCancellationException(strJ, b2Var);
    }

    private static final <U, T extends U> Object b(x2<U, ? super T> x2Var, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar) {
        d2.g(x2Var, y0.c(x2Var.f29183d.getContext()).L(x2Var.f26830e, x2Var, x2Var.getContext()));
        return ae.b.c(x2Var, x2Var, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ud.x2] */
    public static final <T> Object c(long j10, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) throws Throwable {
        a aVar;
        kotlin.jvm.internal.h0 h0Var;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f26838l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f26838l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f26837k;
        Object objF = ad.d.f();
        int i11 = aVar.f26838l;
        if (i11 == 0) {
            wc.s.b(obj);
            if (j10 <= 0) {
                return null;
            }
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            try {
                aVar.f26835i = pVar;
                aVar.f26836j = h0Var2;
                aVar.f26834h = j10;
                aVar.f26838l = 1;
                ?? r10 = (T) new x2(j10, aVar);
                h0Var2.f21514a = r10;
                Object objB = b(r10, pVar);
                if (objB == ad.d.f()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                return objB == objF ? objF : objB;
            } catch (TimeoutCancellationException e10) {
                e = e10;
                h0Var = h0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) aVar.f26836j;
            try {
                wc.s.b(obj);
                return obj;
            } catch (TimeoutCancellationException e11) {
                e = e11;
            }
        }
        if (e.f21540a == h0Var.f21514a) {
            return null;
        }
        throw e;
    }
}
