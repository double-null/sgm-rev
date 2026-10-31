package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.t;
import ue.a;

/* JADX INFO: compiled from: StreamResetException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23398a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(a errorCode) {
        super(t.n("stream was reset: ", errorCode));
        t.f(errorCode, "errorCode");
        this.f23398a = errorCode;
    }
}
