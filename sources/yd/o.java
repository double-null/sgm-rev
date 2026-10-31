package yd;

import kotlin.jvm.internal.m0;
import wc.g0;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final id.q<xd.d<Object>, Object, zc.f<? super g0>, Object> f28903a;

    /* JADX INFO: compiled from: SafeCollector.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.q implements id.q<xd.d<? super Object>, Object, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28904a = new a();

        a() {
            super(3, xd.d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // id.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xd.d<Object> dVar, Object obj, zc.f<? super g0> fVar) {
            return dVar.b(obj, fVar);
        }
    }

    static {
        a aVar = a.f28904a;
        kotlin.jvm.internal.t.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f28903a = (id.q) m0.d(aVar, 3);
    }
}
