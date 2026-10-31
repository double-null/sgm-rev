package se;

import af.q;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.t;
import me.a0;
import me.b0;
import me.c0;
import me.m;
import me.n;
import me.v;
import me.w;
import me.z;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f25424a;

    public a(n cookieJar) {
        t.f(cookieJar, "cookieJar");
        this.f25424a = cookieJar;
    }

    private final String a(List<m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.t.t();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.i());
            sb2.append('=');
            sb2.append(mVar.n());
            i10 = i11;
        }
        String string = sb2.toString();
        t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // me.v
    public b0 intercept(v.a chain) throws IOException {
        c0 c0VarB;
        t.f(chain, "chain");
        z zVarRequest = chain.request();
        z.a aVarI = zVarRequest.i();
        a0 a0VarA = zVarRequest.a();
        if (a0VarA != null) {
            w wVarContentType = a0VarA.contentType();
            if (wVarContentType != null) {
                aVarI.e("Content-Type", wVarContentType.toString());
            }
            long jContentLength = a0VarA.contentLength();
            if (jContentLength != -1) {
                aVarI.e("Content-Length", String.valueOf(jContentLength));
                aVarI.i("Transfer-Encoding");
            } else {
                aVarI.e("Transfer-Encoding", "chunked");
                aVarI.i("Content-Length");
            }
        }
        boolean z10 = false;
        if (zVarRequest.d("Host") == null) {
            aVarI.e("Host", ne.d.S(zVarRequest.j(), false, 1, null));
        }
        if (zVarRequest.d("Connection") == null) {
            aVarI.e("Connection", "Keep-Alive");
        }
        if (zVarRequest.d("Accept-Encoding") == null && zVarRequest.d("Range") == null) {
            aVarI.e("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<m> listB = this.f25424a.b(zVarRequest.j());
        if (!listB.isEmpty()) {
            aVarI.e(OgqfiHA.dOtyKsG, a(listB));
        }
        if (zVarRequest.d("User-Agent") == null) {
            aVarI.e("User-Agent", "okhttp/4.10.0");
        }
        b0 b0VarA = chain.a(aVarI.b());
        e.f(this.f25424a, zVarRequest.j(), b0VarA.s());
        b0.a aVarS = b0VarA.z().s(zVarRequest);
        if (z10 && rd.c0.B("gzip", b0.p(b0VarA, "Content-Encoding", null, 2, null), true) && e.b(b0VarA) && (c0VarB = b0VarA.b()) != null) {
            af.n nVar = new af.n(c0VarB.source());
            aVarS.l(b0VarA.s().d().g("Content-Encoding").g("Content-Length").d());
            aVarS.b(new h(b0.p(b0VarA, "Content-Type", null, 2, null), -1L, q.d(nVar)));
        }
        return aVarS.c();
    }
}
