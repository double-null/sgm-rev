package ke;

import com.applovin.shadow.okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f21399c = new p();

    private p() {
    }

    public final void c(char[] array) {
        kotlin.jvm.internal.t.f(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    public final char[] d() {
        return super.b(Http2.INITIAL_MAX_FRAME_SIZE);
    }
}
