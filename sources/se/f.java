package se;

import kotlin.jvm.internal.t;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f25431a = new f();

    private f() {
    }

    public static final boolean b(String method) {
        t.f(method, "method");
        return (t.a(method, "GET") || t.a(method, "HEAD")) ? false : true;
    }

    public final boolean a(String method) {
        t.f(method, "method");
        return t.a(method, "POST") || t.a(method, "PATCH") || t.a(method, "PUT") || t.a(method, "DELETE") || t.a(method, "MOVE");
    }

    public final boolean c(String method) {
        t.f(method, "method");
        return !t.a(method, "PROPFIND");
    }

    public final boolean d(String method) {
        t.f(method, "method");
        return t.a(method, "PROPFIND");
    }

    public static final boolean e(String method) {
        t.f(method, "method");
        return t.a(method, "POST") || t.a(method, "PUT") || t.a(method, oqHAiWkeGzWld.cNRq) || t.a(method, "PROPPATCH") || t.a(method, "REPORT");
    }
}
