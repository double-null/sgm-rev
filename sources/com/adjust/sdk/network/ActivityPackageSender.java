package com.adjust.sdk.network;

import android.content.Context;
import android.net.Uri;
import be.LNO.fzLzfW;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSigner;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageBuilder;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private int connectionTimeout;
    private Context context;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String subscriptionPath;
    private UrlStrategy urlStrategy;
    private ILogger logger = AdjustFactory.getLogger();
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
    private UtilNetworking.IConnectionOptions connectionOptions = AdjustFactory.getConnectionOptions();

    /* JADX INFO: loaded from: classes.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber f5783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f5784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f5785c;

        public a(IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
            this.f5783a = responseDataCallbackSubscriber;
            this.f5784b = activityPackage;
            this.f5785c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5783a.onResponseDataCallback(ActivityPackageSender.this.sendActivityPackageSync(this.f5784b, this.f5785c));
        }
    }

    public ActivityPackageSender(List<String> list, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.connectionTimeout = i10;
        this.context = context;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), AdjustFactory.getPurchaseVerificationUrl(), list, z10);
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws IOException {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String strGeneratePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (strGeneratePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(strGeneratePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
    }

    private static String extractAuthorizationHeader(Map<String, String> map) {
        return map.remove("authorization");
    }

    private static String extractTargetUrl(Map<String, String> map, ActivityKind activityKind, UrlStrategy urlStrategy) {
        String strRemove = map.remove("endpoint");
        return strRemove != null ? strRemove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb2);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb2);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb2);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private String generateUrlStringForGET(ActivityKind activityKind, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    private String generateUrlStringForPOST(ActivityKind activityKind, String str, Map<String, String> map) {
        String string = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", string);
        return string;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb2) throws UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = URLEncoder.encode(entry.getKey(), Constants.ENCODING);
            String value = entry.getValue();
            String strEncode2 = value != null ? URLEncoder.encode(value, Constants.ENCODING) : "";
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
            sb2.append("&");
        }
    }

    private void localError(Throwable th, String str, ResponseData responseData, int i10) {
        String strErrorMessage = errorMessage(th, str, responseData.activityPackage);
        this.logger.error(strErrorMessage, new Object[0]);
        responseData.message = strErrorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i10);
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            this.logger.error(errorMessage(e10, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = UtilNetworking.extractJsonString(jSONObject, "message");
        responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP);
        String strExtractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (strExtractJsonString != null && strExtractJsonString.equals("opted_out")) {
            responseData.trackingState = TrackingState.OPTED_OUT;
        }
        responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = Util.attributionFromJson(jSONObject.optJSONObject("attribution"), Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(Throwable th, String str, ResponseData responseData, Integer num) {
        String str2 = errorMessage(th, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSendWithUrlStrategy(ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            this.logger.debug("Will not retry with current url strategy, already got a valid json response", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        }
        this.logger.error("Failed with current url strategy and it will not retry", new Object[0]);
        return false;
    }

    private void tryToGetResponse(ResponseData responseData) {
        DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                String strExtractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                                boolean z10 = true;
                                this.logger.verbose("authorizationHeader: %s", strExtractAuthorizationHeader);
                                boolean z11 = responseData.activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION;
                                HttpsURLConnection httpsURLConnectionGenerateHttpsURLConnection = this.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(z11 ? generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters) : generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters)));
                                this.connectionOptions.applyConnectionOptions(httpsURLConnectionGenerateHttpsURLConnection, this.clientSdk, this.connectionTimeout);
                                if (strExtractAuthorizationHeader != null) {
                                    httpsURLConnectionGenerateHttpsURLConnection.setRequestProperty("Authorization", strExtractAuthorizationHeader);
                                }
                                DataOutputStream dataOutputStreamConfigConnectionForGET = z11 ? configConnectionForGET(httpsURLConnectionGenerateHttpsURLConnection) : configConnectionForPOST(httpsURLConnectionGenerateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                                Integer connectionResponse = readConnectionResponse(httpsURLConnectionGenerateHttpsURLConnection, responseData);
                                responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && connectionResponse != null && connectionResponse.intValue() == 200;
                                JSONObject jSONObject = responseData.jsonResponse;
                                if (jSONObject != null && responseData.retryIn == null) {
                                    z10 = false;
                                }
                                responseData.willRetry = z10;
                                if (jSONObject == null) {
                                    responseData.activityPackage.addError(1000);
                                } else if (responseData.retryIn != null) {
                                    responseData.activityPackage.addError(1001);
                                }
                                if (dataOutputStreamConfigConnectionForGET != null) {
                                    try {
                                        dataOutputStreamConfigConnectionForGET.flush();
                                        dataOutputStreamConfigConnectionForGET.close();
                                    } catch (IOException e10) {
                                        this.logger.error(errorMessage(e10, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                                    }
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (IOException e11) {
                                        this.logger.error(errorMessage(e11, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            localError(th2, "Sending SDK package", responseData, ErrorCodes.THROWABLE);
                            if (0 != 0) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (IOException e12) {
                                    this.logger.error(errorMessage(e12, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                                }
                            }
                        }
                    } catch (ProtocolException e13) {
                        localError(e13, "Protocol Error", responseData, 1004);
                        if (0 != 0) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException e14) {
                                this.logger.error(errorMessage(e14, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                            }
                        }
                    }
                } catch (SSLHandshakeException e15) {
                    remoteError(e15, "Certificate failed", responseData, Integer.valueOf(ErrorCodes.SSL_HANDSHAKE_EXCEPTION));
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (IOException e16) {
                            this.logger.error(errorMessage(e16, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                        }
                    }
                }
            } catch (MalformedURLException e17) {
                localError(e17, "Malformed URL", responseData, ErrorCodes.MALFORMED_URL_EXCEPTION);
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e18) {
                        this.logger.error(errorMessage(e18, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                    }
                }
            } catch (IOException e19) {
                remoteError(e19, "Request failed", responseData, Integer.valueOf(ErrorCodes.IO_EXCEPTION));
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (IOException e20) {
                        this.logger.error(errorMessage(e20, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                    }
                }
            }
        } catch (UnsupportedEncodingException e21) {
            localError(e21, "Failed to encode parameters", responseData, 1002);
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e22) {
                    this.logger.error(errorMessage(e22, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (SocketTimeoutException e23) {
            remoteError(e23, "Request timed out", responseData, 1005);
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e24) {
                    this.logger.error(errorMessage(e24, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        }
    }

    private Map<String, String> updateSendingParameters(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        PackageBuilder.addString(map, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return map;
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath != null) {
                return str + this.gdprPath;
            }
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath != null) {
                return str + this.subscriptionPath;
            }
        } else if (activityKind == ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath != null) {
                return str + this.purchaseVerificationPath;
            }
        } else if (this.basePath != null) {
            return str + this.basePath;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    public Integer readConnectionResponse(HttpsURLConnection httpsURLConnection, ResponseData responseData) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Integer numValueOf = null;
        try {
            try {
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseCode >= 400 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
            } catch (IOException e10) {
                this.logger.error(errorMessage(e10, "Connecting and reading response", responseData.activityPackage), new Object[0]);
                if (httpsURLConnection != null) {
                    break;
                }
                if (sb2.length() == 0) {
                    this.logger.error("Empty response string buffer", new Object[0]);
                    return numValueOf;
                }
                if (numValueOf.intValue() == 429) {
                    this.logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                    return numValueOf;
                }
                String string = sb2.toString();
                this.logger.debug("Response string: %s", string);
                parseResponse(responseData, string);
                if (responseData.controlParams != null) {
                    SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
                }
                str = responseData.message;
                if (str != null) {
                    if (numValueOf.intValue() == 200) {
                        this.logger.info("Response message: %s", str);
                    } else {
                        this.logger.error("Response message: %s", str);
                    }
                }
                return numValueOf;
            }
            httpsURLConnection.disconnect();
            if (sb2.length() == 0) {
                this.logger.error("Empty response string buffer", new Object[0]);
                return numValueOf;
            }
            if (numValueOf.intValue() == 429) {
                this.logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return numValueOf;
            }
            String string2 = sb2.toString();
            this.logger.debug("Response string: %s", string2);
            parseResponse(responseData, string2);
            if (responseData.controlParams != null) {
                SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
            }
            str = responseData.message;
            if (str != null) {
                if (numValueOf.intValue() == 200) {
                    this.logger.info("Response message: %s", str);
                } else {
                    this.logger.error("Response message: %s", str);
                }
            }
            return numValueOf;
        } catch (Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(ActivityPackage activityPackage, Map<String, String> map, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new a(responseDataCallbackSubscriber, activityPackage, map));
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData responseDataBuildResponseData;
        do {
            Map<String, String> mapUpdateSendingParameters = updateSendingParameters(map);
            responseDataBuildResponseData = ResponseData.buildResponseData(activityPackage, mapUpdateSendingParameters, signParameters(activityPackage, mapUpdateSendingParameters));
            tryToGetResponse(responseDataBuildResponseData);
        } while (shouldRetryToSendWithUrlStrategy(responseDataBuildResponseData));
        return responseDataBuildResponseData;
    }

    private Map<String, String> signParameters(ActivityPackage activityPackage, Map<String, String> map) {
        HashMap map2 = new HashMap(activityPackage.getParameters());
        if (map != null) {
            map2.putAll(map);
        }
        HashMap map3 = new HashMap();
        map3.put(fzLzfW.tdAGQhUvbT, activityPackage.getClientSdk());
        map3.put("activity_kind", activityPackage.getActivityKind().toString());
        map3.put("endpoint", this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        JSONObject controlParamsJson = SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            Iterator<String> itKeys = controlParamsJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (controlParamsJson.get(next) instanceof String) {
                        map3.put(next, (String) controlParamsJson.get(next));
                    }
                } catch (JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new Object[0]);
                }
            }
        }
        return AdjustSigner.sign(map2, map3, this.context, this.logger);
    }
}
