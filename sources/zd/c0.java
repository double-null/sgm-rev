package zd;

import zd.b0;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c0<S extends b0<S>> {
    public static final S b(Object obj) {
        if (obj == a.f29182a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static final boolean c(Object obj) {
        return obj == a.f29182a;
    }

    public static <S extends b0<S>> Object a(Object obj) {
        return obj;
    }
}
