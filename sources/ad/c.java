package ad;

import id.p;
import id.q;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.s;
import zc.f;
import zc.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class a extends j {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f323h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f324i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f325j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, p pVar, Object obj) {
            super(fVar);
            this.f324i = pVar;
            this.f325j = obj;
            t.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f323h;
            if (i10 == 0) {
                this.f323h = 1;
                s.b(obj);
                t.d(this.f324i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) m0.d(this.f324i, 2)).invoke(this.f325j, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f323h = 2;
            s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f326h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f327i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f328j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, zc.j jVar, p pVar, Object obj) {
            super(fVar, jVar);
            this.f327i = pVar;
            this.f328j = obj;
            t.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f326h;
            if (i10 == 0) {
                this.f326h = 1;
                s.b(obj);
                t.d(this.f327i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) m0.d(this.f327i, 2)).invoke(this.f328j, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f326h = 2;
            s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: ad.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class C0006c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0006c(f<? super T> fVar) {
            super(fVar);
            t.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f<? super T> fVar, zc.j jVar) {
            super(fVar, jVar);
            t.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            s.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> f<g0> a(p<? super R, ? super f<? super T>, ? extends Object> pVar, R r10, f<? super T> completion) {
        t.f(pVar, "<this>");
        t.f(completion, "completion");
        f<?> fVarA = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, fVarA);
        }
        zc.j context = fVarA.getContext();
        return context == k.f29181a ? new a(fVarA, pVar, r10) : new b(fVarA, context, pVar, r10);
    }

    private static final <T> f<T> b(f<? super T> fVar) {
        zc.j context = fVar.getContext();
        return context == k.f29181a ? new C0006c(fVar) : new d(fVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> f<T> c(f<? super T> fVar) {
        f<T> fVar2;
        t.f(fVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = fVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) fVar : null;
        return (dVar == null || (fVar2 = (f<T>) dVar.intercepted()) == null) ? fVar : fVar2;
    }

    public static <R, T> Object d(p<? super R, ? super f<? super T>, ? extends Object> pVar, R r10, f<? super T> completion) {
        t.f(pVar, "<this>");
        t.f(completion, "completion");
        return ((p) m0.d(pVar, 2)).invoke(r10, b(h.a(completion)));
    }

    public static <R, P, T> Object e(q<? super R, ? super P, ? super f<? super T>, ? extends Object> qVar, R r10, P p10, f<? super T> completion) {
        t.f(qVar, "<this>");
        t.f(completion, "completion");
        return ((q) m0.d(qVar, 3)).invoke(r10, p10, b(h.a(completion)));
    }
}
