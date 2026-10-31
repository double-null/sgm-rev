package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.analytics.events.SDKEvent;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class ApiRequest<RequestDataType, ResponseType> extends io.bidmachine.core.b<RequestDataType, ResponseType, oc.a> {
    static int REQUEST_TIMEOUT = 10000;
    String requiredUrl;
    int timeOut;

    public static class ApiAuctionDataBinder extends ApiResponseAuctionDataBinder {
        @Override // io.bidmachine.ApiRequest.ApiResponseAuctionDataBinder, io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, Object obj) throws Exception {
            return obtainData((io.bidmachine.core.b<Request, Response, oc.a>) bVar, uRLConnection, (Request) obj);
        }

        @Override // io.bidmachine.ApiRequest.ApiResponseAuctionDataBinder
        protected byte[] obtainData(io.bidmachine.core.b<Request, Response, oc.a> bVar, URLConnection uRLConnection, Request request) throws Exception {
            Openrtb.Builder builderNewBuilder = Openrtb.newBuilder();
            builderNewBuilder.setRequest(request);
            builderNewBuilder.setVer("3.0");
            builderNewBuilder.setDomainspec("adcom");
            builderNewBuilder.setDomainver("1.0");
            w4.f("Auction Request", builderNewBuilder);
            return builderNewBuilder.build().toByteArray();
        }
    }

    public static abstract class ApiDataBinder<RequestDataType, ResponseDataType> extends io.bidmachine.core.b.g<RequestDataType, ResponseDataType, oc.a> {
    }

    public static class ApiEventDataBinder extends ApiDataBinder<SDKEvent, Void> {
        @Override // io.bidmachine.core.b.g
        protected Void createSuccessResult(io.bidmachine.core.b<SDKEvent, Void, oc.a> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, Object obj) throws Exception {
            return obtainData((io.bidmachine.core.b<SDKEvent, Void, oc.a>) bVar, uRLConnection, (SDKEvent) obj);
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b<SDKEvent, Void, oc.a> bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
        }

        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ Object createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((io.bidmachine.core.b<SDKEvent, Void, oc.a>) bVar, uRLConnection, bArr);
        }

        protected byte[] obtainData(io.bidmachine.core.b<SDKEvent, Void, oc.a> bVar, URLConnection uRLConnection, SDKEvent sDKEvent) throws Exception {
            if (sDKEvent != null) {
                return sDKEvent.toByteArray();
            }
            return null;
        }
    }

    public static class ApiInitDataBinder extends ApiDataBinder<InitRequest, InitResponse> {
        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ Object createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((io.bidmachine.core.b<InitRequest, InitResponse, oc.a>) bVar, uRLConnection, bArr);
        }

        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, Object obj) throws Exception {
            return obtainData((io.bidmachine.core.b<InitRequest, InitResponse, oc.a>) bVar, uRLConnection, (InitRequest) obj);
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b<InitRequest, InitResponse, oc.a> bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
        }

        @Override // io.bidmachine.core.b.g
        protected InitResponse createSuccessResult(io.bidmachine.core.b<InitRequest, InitResponse, oc.a> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            InitResponse from = InitResponse.parseFrom(bArr);
            w4.f("Init Response", from);
            return from;
        }

        protected byte[] obtainData(io.bidmachine.core.b<InitRequest, InitResponse, oc.a> bVar, URLConnection uRLConnection, InitRequest initRequest) throws Exception {
            w4.f("Init Request", initRequest);
            if (initRequest != null) {
                return initRequest.toByteArray();
            }
            return null;
        }
    }

    public static class ApiResponseAuctionDataBinder extends ApiDataBinder<Request, Response> {
        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ Object createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((io.bidmachine.core.b<Request, Response, oc.a>) bVar, uRLConnection, bArr);
        }

        protected byte[] obtainData(io.bidmachine.core.b<Request, Response, oc.a> bVar, URLConnection uRLConnection, Request request) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b<Request, Response, oc.a> bVar, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
        }

        @Override // io.bidmachine.core.b.g
        protected Response createSuccessResult(io.bidmachine.core.b<Request, Response, oc.a> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            Openrtb from = Openrtb.parseFrom(bArr);
            if (from == null) {
                return null;
            }
            w4.f("Auction Response", from);
            return from.getResponse();
        }

        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ byte[] obtainData(io.bidmachine.core.b bVar, URLConnection uRLConnection, Object obj) throws Exception {
            return obtainData((io.bidmachine.core.b<Request, Response, oc.a>) bVar, uRLConnection, (Request) obj);
        }
    }

    public static class ApiTrackerDataBinder extends ApiDataBinder<Object, String> {
        @Override // io.bidmachine.core.b.g
        protected String createSuccessResult(io.bidmachine.core.b<Object, String, oc.a> bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected byte[] obtainData(io.bidmachine.core.b<Object, String, oc.a> bVar, URLConnection uRLConnection, Object obj) throws Exception {
            return null;
        }

        @Override // io.bidmachine.core.b.g
        protected void prepareHeaders(io.bidmachine.core.b<Object, String, oc.a> bVar, URLConnection uRLConnection) {
            String userAgent = UserAgentManager.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                return;
            }
            uRLConnection.setRequestProperty("User-Agent", userAgent);
        }

        @Override // io.bidmachine.core.b.g
        protected /* bridge */ /* synthetic */ Object createSuccessResult(io.bidmachine.core.b bVar, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return createSuccessResult((io.bidmachine.core.b<Object, String, oc.a>) bVar, uRLConnection, bArr);
        }
    }

    public static class Builder<RequestDataType, ResponseDataType> {
        private io.bidmachine.core.b.InterfaceC0315b<ResponseDataType, oc.a> callback;
        private io.bidmachine.core.b.c cancelCallback;
        private ApiDataBinder<RequestDataType, ResponseDataType> dataBinder;
        private RequestDataType requestData;
        private String url;
        private int timeOut = ApiRequest.REQUEST_TIMEOUT;
        private io.bidmachine.core.b.e method = io.bidmachine.core.b.e.Post;

        /* JADX WARN: Multi-variable type inference failed */
        public ApiRequest<RequestDataType, ResponseDataType> build() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequest = new ApiRequest<>(this.method, null, this.requestData);
            apiRequest.setCallback(this.callback);
            apiRequest.setCancelCallback(this.cancelCallback);
            apiRequest.setDataBinder(this.dataBinder);
            apiRequest.requiredUrl = this.url;
            apiRequest.timeOut = this.timeOut;
            return apiRequest;
        }

        public String getUrl() {
            return this.url;
        }

        public ApiRequest<RequestDataType, ResponseDataType> request() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequestBuild = build();
            apiRequestBuild.request();
            return apiRequestBuild;
        }

        public Builder<RequestDataType, ResponseDataType> setCallback(io.bidmachine.core.b.InterfaceC0315b<ResponseDataType, oc.a> interfaceC0315b) {
            this.callback = interfaceC0315b;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setCancelCallback(io.bidmachine.core.b.c cVar) {
            this.cancelCallback = cVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setDataBinder(ApiDataBinder<RequestDataType, ResponseDataType> apiDataBinder) {
            this.dataBinder = apiDataBinder;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setLoadingTimeOut(int i10) {
            if (i10 <= 0) {
                i10 = ApiRequest.REQUEST_TIMEOUT;
            }
            this.timeOut = i10;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setMethod(io.bidmachine.core.b.e eVar) {
            this.method = eVar;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setRequestData(RequestDataType requestdatatype) {
            this.requestData = requestdatatype;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> url(String str) {
            this.url = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$obtainError$0(Throwable th, URLConnection uRLConnection) {
        return "obtainError: " + th + "(" + uRLConnection + ")";
    }

    @Override // io.bidmachine.core.b
    protected String getBaseUrl() {
        return this.requiredUrl;
    }

    @Override // io.bidmachine.core.b
    protected void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    private ApiRequest(io.bidmachine.core.b.e eVar, String str, RequestDataType requestdatatype) {
        super(eVar, str, requestdatatype);
        addContentEncoder(new io.bidmachine.core.b.d());
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
    public oc.a obtainError(final URLConnection uRLConnection, final Throwable th) {
        io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.q0
            @Override // qc.b
            public final Object get() {
                return ApiRequest.lambda$obtainError$0(th, uRLConnection);
            }
        });
        if (th instanceof UnknownHostException) {
            return oc.a.f23333e;
        }
        if (!(th instanceof SocketTimeoutException) && !(th instanceof ConnectTimeoutException)) {
            return oc.a.l("Unknown api request error", th);
        }
        return oc.a.f23334f;
    }
}
