package xd;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import wc.g0;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    public static final class a<T> implements xd.d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f28543a;

        public a(h0 h0Var) {
            this.f28543a = h0Var;
        }

        @Override // xd.d
        public Object b(T t10, zc.f<? super g0> fVar) {
            this.f28543a.f21514a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28544h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28545i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f28546j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f28547k;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28546j = obj;
            this.f28547k |= Integer.MIN_VALUE;
            return e.k(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    public static final class c<T> implements xd.d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f28548a;

        public c(h0 h0Var) {
            this.f28548a = h0Var;
        }

        @Override // xd.d
        public Object b(T t10, zc.f<? super g0> fVar) {
            this.f28548a.f21514a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28550i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f28551j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f28552k;

        d(zc.f<? super d> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28551j = obj;
            this.f28552k |= Integer.MIN_VALUE;
            return e.l(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object a(xd.c<? extends T> cVar, zc.f<? super T> fVar) throws Throwable {
        b bVar;
        h0 h0Var;
        AbortFlowException e10;
        xd.d<? super Object> dVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f28547k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f28547k = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f28546j;
        Object objF = ad.d.f();
        int i11 = bVar.f28547k;
        if (i11 == 0) {
            wc.s.b(obj);
            h0 h0Var2 = new h0();
            h0Var2.f21514a = (T) yd.l.f28895a;
            xd.d<? super Object> aVar = new a<>(h0Var2);
            try {
                bVar.f28544h = h0Var2;
                bVar.f28545i = aVar;
                bVar.f28547k = 1;
                if (cVar.a(aVar, bVar) == objF) {
                    return objF;
                }
                h0Var = h0Var2;
            } catch (AbortFlowException e11) {
                h0Var = h0Var2;
                e10 = e11;
                dVar = aVar;
                yd.i.a(e10, dVar);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (a) bVar.f28545i;
            h0Var = (h0) bVar.f28544h;
            try {
                wc.s.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                yd.i.a(e10, dVar);
            }
        }
        T t10 = h0Var.f21514a;
        if (t10 != yd.l.f28895a) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(xd.c<? extends T> cVar, zc.f<? super T> fVar) throws Throwable {
        d dVar;
        h0 h0Var;
        AbortFlowException e10;
        xd.d<? super Object> dVar2;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.f28552k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f28552k = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object obj = dVar.f28551j;
        Object objF = ad.d.f();
        int i11 = dVar.f28552k;
        if (i11 == 0) {
            wc.s.b(obj);
            h0 h0Var2 = new h0();
            xd.d<? super Object> cVar2 = new c<>(h0Var2);
            try {
                dVar.f28549h = h0Var2;
                dVar.f28550i = cVar2;
                dVar.f28552k = 1;
                if (cVar.a(cVar2, dVar) == objF) {
                    return objF;
                }
                h0Var = h0Var2;
            } catch (AbortFlowException e11) {
                h0Var = h0Var2;
                e10 = e11;
                dVar2 = cVar2;
                yd.i.a(e10, dVar2);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar2 = (c) dVar.f28550i;
            h0Var = (h0) dVar.f28549h;
            try {
                wc.s.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                yd.i.a(e10, dVar2);
            }
        }
        return h0Var.f21514a;
    }
}
