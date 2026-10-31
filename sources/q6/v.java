package q6;

import io.bidmachine.protobuf.Waterfall;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: compiled from: WaterfallNetworkRequest.java */
/* JADX INFO: loaded from: classes4.dex */
public class v extends io.bidmachine.core.b<Waterfall.Result, Waterfall.Configuration, oc.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24461b;

    /* JADX INFO: compiled from: WaterfallNetworkRequest.java */
    private static class b extends io.bidmachine.core.b.g<Waterfall.Result, Waterfall.Configuration, oc.a> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Waterfall.Configuration createSuccessResult(io.bidmachine.core.b<Waterfall.Result, Waterfall.Configuration, oc.a> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return Waterfall.parseFrom(bArr).getResponse();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.core.b.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] obtainData(io.bidmachine.core.b<Waterfall.Result, Waterfall.Configuration, oc.a> bVar, URLConnection uRLConnection, Waterfall.Result result) throws Exception {
            return Waterfall.newBuilder().setRequest(result).build().toByteArray();
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b<Waterfall.Result, Waterfall.Configuration, oc.a> bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
        }
    }

    public v(String str, Waterfall.Result result, int i10) {
        super(io.bidmachine.core.b.e.Post, null, result);
        this.f24460a = str;
        this.f24461b = i10;
        setDataBinder(new b());
    }

    @Override // io.bidmachine.core.b
    protected String getBaseUrl() throws Exception {
        return this.f24460a;
    }

    @Override // io.bidmachine.core.b
    protected void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.f24461b);
        uRLConnection.setReadTimeout(this.f24461b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.core.b
    public oc.a obtainError(URLConnection uRLConnection, int i10) {
        oc.a aVarI;
        if (i10 >= 200 && i10 < 300) {
            return oc.a.f23347s;
        }
        if (i10 >= 400 && i10 < 500) {
            aVarI = oc.a.f23335g;
        } else if (i10 >= 500 && i10 < 600) {
            aVarI = oc.a.f23336h;
        } else {
            aVarI = oc.a.i("Unknown server error");
        }
        return new oc.a(aVarI, i10, "Server returned " + i10 + " code");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.core.b
    public oc.a obtainError(URLConnection uRLConnection, Throwable th) {
        if (th instanceof UnknownHostException) {
            return oc.a.f23333e;
        }
        if (!(th instanceof SocketTimeoutException) && !(th instanceof ConnectTimeoutException)) {
            return oc.a.l("Unknown api request error", th);
        }
        return oc.a.f23334f;
    }
}
