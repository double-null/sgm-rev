package kotlin.collections;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    static final class a<T> extends kotlin.coroutines.jvm.internal.k implements id.p<qd.i<? super List<? extends T>>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f21478h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f21479i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f21480j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f21481k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f21482l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f21483m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f21484n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f21485o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f21486p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f21487q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, zc.f<? super a> fVar) {
            super(2, fVar);
            this.f21483m = i10;
            this.f21484n = i11;
            this.f21485o = it;
            this.f21486p = z10;
            this.f21487q = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            a aVar = new a(this.f21483m, this.f21484n, this.f21485o, this.f21486p, this.f21487q, fVar);
            aVar.f21482l = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:54:0x010a  */
        /* JADX WARN: Code duplicated, block: B:55:0x010c  */
        /* JADX WARN: Code duplicated, block: B:58:0x011f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:80:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0106 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:16:0x0058). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011d -> B:59:0x0120). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:72:0x014e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.w0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // id.p
        public final Object invoke(qd.i<? super List<? extends T>> iVar, zc.f<? super wc.g0> fVar) {
            return ((a) create(iVar, fVar)).invokeSuspend(wc.g0.f27756a);
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.t.f(iterator, "iterator");
        return !iterator.hasNext() ? c0.f21448a : qd.k.a(new a(i10, i11, iterator, z11, z10, null));
    }
}
