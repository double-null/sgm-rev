package se;

import java.net.Proxy;
import kotlin.jvm.internal.t;
import me.u;
import me.z;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f25444a = new i();

    private i() {
    }

    private final boolean b(z zVar, Proxy.Type type) {
        return !zVar.g() && type == Proxy.Type.HTTP;
    }

    public final String a(z request, Proxy.Type proxyType) {
        t.f(request, "request");
        t.f(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.h());
        sb2.append(' ');
        i iVar = f25444a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.j());
        } else {
            sb2.append(iVar.c(request.j()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u url) {
        t.f(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + ((Object) strF);
    }
}
