package wc;

/* JADX INFO: compiled from: Standard.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String message) {
        super(message);
        kotlin.jvm.internal.t.f(message, "message");
    }

    public /* synthetic */ p(String str, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
