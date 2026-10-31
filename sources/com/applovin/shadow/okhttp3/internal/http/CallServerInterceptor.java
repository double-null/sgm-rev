package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.Interceptor;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.RequestBody;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.Okio;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import rd.c0;
import wc.f;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[Catch: IOException -> 0x0098, TRY_LEAVE, TryCatch #2 {IOException -> 0x0098, blocks: (B:15:0x0051, B:17:0x0057, B:26:0x008d, B:28:0x0093, B:18:0x0066, B:19:0x0075, B:21:0x0082), top: B:85:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [com.applovin.shadow.okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.applovin.shadow.okhttp3.Response$Builder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.applovin.shadow.okhttp3.Response$Builder] */
    @Override // com.applovin.shadow.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z10;
        ?? PermitsRequestBody;
        ?? responseHeaders;
        ?? r10;
        t.f(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        t.c(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody requestBodyBody = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            PermitsRequestBody = HttpMethod.permitsRequestBody(request$okhttp.method());
            try {
                if (PermitsRequestBody == 0 || requestBodyBody == null) {
                    exchange$okhttp.noRequestBody();
                    z10 = true;
                    PermitsRequestBody = 0;
                } else {
                    if (c0.B("100-continue", request$okhttp.header("Expect"), true)) {
                        exchange$okhttp.flushRequest();
                        PermitsRequestBody = exchange$okhttp.readResponseHeaders(true);
                        try {
                            exchange$okhttp.responseHeadersStart();
                            z10 = false;
                            r10 = PermitsRequestBody;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange$okhttp.getHasFailure$okhttp()) {
                                responseHeaders = PermitsRequestBody;
                                throw e;
                            }
                        }
                    } else {
                        z10 = true;
                        r10 = 0;
                    }
                    if (r10 != 0) {
                        exchange$okhttp.noRequestBody();
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            PermitsRequestBody = r10;
                            exchange$okhttp.noNewExchangesOnConnection();
                            PermitsRequestBody = r10;
                        }
                    } else if (requestBodyBody.isDuplex()) {
                        exchange$okhttp.flushRequest();
                        requestBodyBody.writeTo(Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, true)));
                    } else {
                        BufferedSink bufferedSinkBuffer = Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, false));
                        requestBodyBody.writeTo(bufferedSinkBuffer);
                        bufferedSinkBuffer.close();
                    }
                }
                if (requestBodyBody != null) {
                    PermitsRequestBody = r10;
                    if (!requestBodyBody.isDuplex()) {
                        PermitsRequestBody = r10;
                        PermitsRequestBody = r10;
                        PermitsRequestBody = r10;
                        exchange$okhttp.finishRequest();
                    }
                } else {
                    PermitsRequestBody = r10;
                    PermitsRequestBody = r10;
                    PermitsRequestBody = r10;
                    exchange$okhttp.finishRequest();
                }
                PermitsRequestBody = r10;
                e = null;
                responseHeaders = PermitsRequestBody;
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            PermitsRequestBody = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange$okhttp.readResponseHeaders(false);
                t.c(responseHeaders);
                if (z10) {
                    exchange$okhttp.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                f.a(e, e13);
                throw e;
            }
        }
        Response responseBuild = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild.code();
        if (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
            t.c(responseHeaders2);
            if (z10) {
                exchange$okhttp.responseHeadersStart();
            }
            responseBuild = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange$okhttp.responseHeadersEnd(responseBuild);
        Response responseBuild2 = (this.forWebSocket && iCode == 101) ? responseBuild.newBuilder().body(Util.EMPTY_RESPONSE).build() : responseBuild.newBuilder().body(exchange$okhttp.openResponseBody(responseBuild)).build();
        if (c0.B(MRAIDPresenter.CLOSE, responseBuild2.request().header("Connection"), true) || c0.B(MRAIDPresenter.CLOSE, Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            ResponseBody responseBodyBody = responseBuild2.body();
            if ((responseBodyBody != null ? responseBodyBody.contentLength() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iCode);
                sb2.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                sb2.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.contentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return responseBuild2;
    }
}
