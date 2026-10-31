package ud;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.e0 f26796a = new zd.e0("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zd.e0 f26797b = new zd.e0("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
