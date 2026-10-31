package ue;

import af.a0;
import af.c0;
import af.d0;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;
import me.b0;
import me.x;
import me.y;
import me.z;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements se.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f26991g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f26992h = ne.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<String> f26993i = ne.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.f f26994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final se.g f26995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f26996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile h f26997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f26998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f26999f;

    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final List<b> a(z request) {
            t.f(request, "request");
            me.t tVarF = request.f();
            ArrayList arrayList = new ArrayList(tVarF.size() + 4);
            arrayList.add(new b(b.f26862g, request.h()));
            arrayList.add(new b(b.f26863h, se.i.f25444a.c(request.j())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new b(b.f26865j, strD));
            }
            arrayList.add(new b(b.f26864i, request.j().p()));
            int size = tVarF.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strC = tVarF.c(i10);
                Locale US = Locale.US;
                t.e(US, "US");
                String lowerCase = strC.toLowerCase(US);
                t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!f.f26992h.contains(lowerCase) || (t.a(lowerCase, "te") && t.a(tVarF.e(i10), "trailers"))) {
                    arrayList.add(new b(lowerCase, tVarF.e(i10)));
                }
                i10 = i11;
            }
            return arrayList;
        }

        public final b0.a b(me.t headerBlock, y protocol) throws IOException {
            t.f(headerBlock, "headerBlock");
            t.f(protocol, "protocol");
            me.t.a aVar = new me.t.a();
            int size = headerBlock.size();
            se.k kVarA = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strC = headerBlock.c(i10);
                String strE = headerBlock.e(i10);
                if (t.a(strC, Header.RESPONSE_STATUS_UTF8)) {
                    kVarA = se.k.f25447d.a(t.n("HTTP/1.1 ", strE));
                } else if (!f.f26993i.contains(strC)) {
                    aVar.c(strC, strE);
                }
                i10 = i11;
            }
            if (kVarA != null) {
                return new b0.a().q(protocol).g(kVarA.f25449b).n(kVarA.f25450c).l(aVar.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public f(x client, re.f connection, se.g chain, e http2Connection) {
        t.f(client, "client");
        t.f(connection, "connection");
        t.f(chain, "chain");
        t.f(http2Connection, "http2Connection");
        this.f26994a = connection;
        this.f26995b = chain;
        this.f26996c = http2Connection;
        List<y> listY = client.y();
        y yVar = y.H2_PRIOR_KNOWLEDGE;
        this.f26998e = listY.contains(yVar) ? yVar : y.HTTP_2;
    }

    @Override // se.d
    public void a(z request) throws IOException {
        t.f(request, "request");
        if (this.f26997d != null) {
            return;
        }
        this.f26997d = this.f26996c.q0(f26991g.a(request), request.a() != null);
        if (this.f26999f) {
            h hVar = this.f26997d;
            t.c(hVar);
            hVar.f(ue.a.CANCEL);
            throw new IOException("Canceled");
        }
        h hVar2 = this.f26997d;
        t.c(hVar2);
        d0 d0VarV = hVar2.v();
        long jG = this.f26995b.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d0VarV.g(jG, timeUnit);
        h hVar3 = this.f26997d;
        t.c(hVar3);
        hVar3.G().g(this.f26995b.i(), timeUnit);
    }

    @Override // se.d
    public long b(b0 response) {
        t.f(response, "response");
        if (se.e.b(response)) {
            return ne.d.v(response);
        }
        return 0L;
    }

    @Override // se.d
    public c0 c(b0 response) {
        t.f(response, "response");
        h hVar = this.f26997d;
        t.c(hVar);
        return hVar.p();
    }

    @Override // se.d
    public void cancel() {
        this.f26999f = true;
        h hVar = this.f26997d;
        if (hVar == null) {
            return;
        }
        hVar.f(ue.a.CANCEL);
    }

    @Override // se.d
    public a0 d(z request, long j10) {
        t.f(request, "request");
        h hVar = this.f26997d;
        t.c(hVar);
        return hVar.n();
    }

    @Override // se.d
    public void finishRequest() throws IOException {
        h hVar = this.f26997d;
        t.c(hVar);
        hVar.n().close();
    }

    @Override // se.d
    public void flushRequest() throws IOException {
        this.f26996c.flush();
    }

    @Override // se.d
    public re.f getConnection() {
        return this.f26994a;
    }

    @Override // se.d
    public b0.a readResponseHeaders(boolean z10) throws IOException {
        h hVar = this.f26997d;
        t.c(hVar);
        b0.a aVarB = f26991g.b(hVar.E(), this.f26998e);
        if (z10 && aVarB.h() == 100) {
            return null;
        }
        return aVarB;
    }
}
