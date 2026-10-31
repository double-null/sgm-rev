package wd;

import wc.g0;
import zd.e0;
import zd.h0;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<Object> f27823a = new l<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27824b = h0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27825c = h0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f27826d = new e0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f27827e = new e0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e0 f27828f = new e0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e0 f27829g = new e0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e0 f27830h = new e0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e0 f27831i = new e0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e0 f27832j = new e0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final e0 f27833k = new e0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final e0 f27834l = new e0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final e0 f27835m = new e0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final e0 f27836n = new e0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final e0 f27837o = new e0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final e0 f27838p = new e0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final e0 f27839q = new e0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final e0 f27840r = new e0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final e0 f27841s = new e0("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: compiled from: BufferedChannel.kt */
    /* synthetic */ class a<E> extends kotlin.jvm.internal.q implements id.p<Long, l<E>, l<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27842a = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return k(l10.longValue(), (l) obj);
        }

        public final l<E> k(long j10, l<E> lVar) {
            return f.x(j10, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(ud.n<? super T> nVar, T t10, id.q<? super Throwable, ? super T, ? super zc.j, g0> qVar) {
        Object objG = nVar.g(t10, null, qVar);
        if (objG == null) {
            return false;
        }
        nVar.h0(objG);
        return true;
    }

    static /* synthetic */ boolean C(ud.n nVar, Object obj, id.q qVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return B(nVar, obj, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> l<E> x(long j10, l<E> lVar) {
        return new l<>(j10, lVar, lVar.y(), 0);
    }

    public static final <E> pd.g<l<E>> y() {
        return a.f27842a;
    }

    public static final e0 z() {
        return f27834l;
    }
}
