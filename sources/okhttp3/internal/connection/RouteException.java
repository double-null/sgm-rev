package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.t;
import wc.f;

/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f23396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f23397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        t.f(firstConnectException, "firstConnectException");
        this.f23396a = firstConnectException;
        this.f23397b = firstConnectException;
    }

    public final void b(IOException e10) {
        t.f(e10, "e");
        f.a(this.f23396a, e10);
        this.f23397b = e10;
    }

    public final IOException c() {
        return this.f23396a;
    }

    public final IOException e() {
        return this.f23397b;
    }
}
