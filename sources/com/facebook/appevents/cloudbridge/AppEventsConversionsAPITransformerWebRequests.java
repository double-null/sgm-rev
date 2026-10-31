package com.facebook.appevents.cloudbridge;

import com.adjust.sdk.Constants;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import id.p;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.u0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.t;
import od.h;
import org.json.JSONArray;
import org.json.JSONObject;
import rd.f0;
import wc.g0;
import wc.w;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final int MAX_CACHED_TRANSFORMED_EVENTS = 1000;
    private static final int MAX_PROCESSED_TRANSFORMED_EVENTS = 10;
    public static final int MAX_RETRY_COUNT = 5;
    private static final String TAG = "CAPITransformerWebRequests";
    private static final int TIMEOUT_INTERVAL = 60000;
    public static CloudBridgeCredentials credentials;
    private static int currentRetryCount;
    public static List<Map<String, Object>> transformedEvents;
    public static final AppEventsConversionsAPITransformerWebRequests INSTANCE = new AppEventsConversionsAPITransformerWebRequests();
    private static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = u0.f(200, 202);
    private static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = u0.f(503, 504, 429);

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    public static final class CloudBridgeCredentials {
        private final String accessKey;
        private final String cloudBridgeURL;
        private final String datasetID;

        public CloudBridgeCredentials(String datasetID, String cloudBridgeURL, String accessKey) {
            t.f(datasetID, "datasetID");
            t.f(cloudBridgeURL, "cloudBridgeURL");
            t.f(accessKey, "accessKey");
            this.datasetID = datasetID;
            this.cloudBridgeURL = cloudBridgeURL;
            this.accessKey = accessKey;
        }

        public static /* synthetic */ CloudBridgeCredentials copy$default(CloudBridgeCredentials cloudBridgeCredentials, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cloudBridgeCredentials.datasetID;
            }
            if ((i10 & 2) != 0) {
                str2 = cloudBridgeCredentials.cloudBridgeURL;
            }
            if ((i10 & 4) != 0) {
                str3 = cloudBridgeCredentials.accessKey;
            }
            return cloudBridgeCredentials.copy(str, str2, str3);
        }

        public final String component1() {
            return this.datasetID;
        }

        public final String component2() {
            return this.cloudBridgeURL;
        }

        public final String component3() {
            return this.accessKey;
        }

        public final CloudBridgeCredentials copy(String datasetID, String cloudBridgeURL, String accessKey) {
            t.f(datasetID, "datasetID");
            t.f(cloudBridgeURL, "cloudBridgeURL");
            t.f(accessKey, "accessKey");
            return new CloudBridgeCredentials(datasetID, cloudBridgeURL, accessKey);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloudBridgeCredentials)) {
                return false;
            }
            CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) obj;
            return t.a(this.datasetID, cloudBridgeCredentials.datasetID) && t.a(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && t.a(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        public final String getAccessKey() {
            return this.accessKey;
        }

        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        public final String getDatasetID() {
            return this.datasetID;
        }

        public int hashCode() {
            return (((this.datasetID.hashCode() * 31) + this.cloudBridgeURL.hashCode()) * 31) + this.accessKey.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.datasetID + ", cloudBridgeURL=" + this.cloudBridgeURL + ", accessKey=" + this.accessKey + ')';
        }
    }

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    public static final void configure(String datasetID, String url, String accessKey) {
        t.f(datasetID, "datasetID");
        t.f(url, "url");
        t.f(accessKey, "accessKey");
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        appEventsConversionsAPITransformerWebRequests.setCredentials$facebook_core_release(new CloudBridgeCredentials(datasetID, url, accessKey));
        appEventsConversionsAPITransformerWebRequests.setTransformedEvents$facebook_core_release(new ArrayList());
    }

    public static final String getCredentials() {
        try {
            CloudBridgeCredentials credentials$facebook_core_release = INSTANCE.getCredentials$facebook_core_release();
            if (credentials$facebook_core_release != null) {
                return credentials$facebook_core_release.toString();
            }
            return null;
        } catch (UninitializedPropertyAccessException unused) {
            return null;
        }
    }

    public static /* synthetic */ void handleError$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, Integer num, List list, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 5;
        }
        appEventsConversionsAPITransformerWebRequests.handleError$facebook_core_release(num, list, i10);
    }

    public static /* synthetic */ void makeHttpRequest$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, String str, String str2, String str3, Map map, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 60000;
        }
        appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, str2, str3, map, i10, pVar);
    }

    private final List<Map<String, Object>> transformAppEventRequestForCAPIG(GraphRequest graphRequest) {
        JSONObject graphObject = graphRequest.getGraphObject();
        if (graphObject == null) {
            return null;
        }
        Map<String, ? extends Object> mapU = o0.u(Utility.convertJSONObjectToHashMap(graphObject));
        Object tag = graphRequest.getTag();
        t.d(tag, "null cannot be cast to non-null type kotlin.Any");
        mapU.put("custom_events", tag);
        StringBuilder sb2 = new StringBuilder();
        for (String str : mapU.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(mapU.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nGraph Request data: \n\n%s \n\n", sb2);
        return AppEventsConversionsAPITransformer.INSTANCE.conversionsAPICompatibleEvent$facebook_core_release(mapU);
    }

    public static final void transformGraphRequestAndSendToCAPIGEndPoint(final GraphRequest request) {
        t.f(request, "request");
        Utility.runOnNonUiThread(new Runnable() { // from class: com.facebook.appevents.cloudbridge.b
            @Override // java.lang.Runnable
            public final void run() {
                AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint$lambda$0(request);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transformGraphRequestAndSendToCAPIGEndPoint$lambda$0(GraphRequest request) {
        t.f(request, "$request");
        String graphPath = request.getGraphPath();
        List listK0 = graphPath != null ? f0.K0(graphPath, new String[]{"/"}, false, 0, 6, null) : null;
        if (listK0 == null || listK0.size() != 2) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            String str = appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getDatasetID() + "/events";
            List<Map<String, Object>> listTransformAppEventRequestForCAPIG = appEventsConversionsAPITransformerWebRequests.transformAppEventRequestForCAPIG(request);
            if (listTransformAppEventRequestForCAPIG == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.appendEvents$facebook_core_release(listTransformAppEventRequestForCAPIG);
            int iMin = Math.min(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().size(), 10);
            List listH0 = b0.h0(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release(), new h(0, iMin - 1));
            appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listH0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getAccessKey());
            appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, "POST", new JSONObject(linkedHashMap).toString(), n0.f(w.a("Content-Type", "application/json")), 60000, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(listH0));
        } catch (UninitializedPropertyAccessException e10) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void appendEvents$facebook_core_release(List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            getTransformedEvents$facebook_core_release().addAll(list);
        }
        int iMax = Math.max(0, getTransformedEvents$facebook_core_release().size() - 1000);
        if (iMax > 0) {
            List listJ = b0.J(getTransformedEvents$facebook_core_release(), iMax);
            t.d(listJ, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            setTransformedEvents$facebook_core_release(m0.b(listJ));
        }
    }

    public final CloudBridgeCredentials getCredentials$facebook_core_release() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        t.u("credentials");
        return null;
    }

    public final int getCurrentRetryCount$facebook_core_release() {
        return currentRetryCount;
    }

    public final List<Map<String, Object>> getTransformedEvents$facebook_core_release() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        t.u("transformedEvents");
        return null;
    }

    public final void handleError$facebook_core_release(Integer num, List<? extends Map<String, ? extends Object>> processedEvents, int i10) {
        t.f(processedEvents, "processedEvents");
        if (b0.G(RETRY_EVENTS_HTTP_RESPONSE, num)) {
            if (currentRetryCount >= i10) {
                getTransformedEvents$facebook_core_release().clear();
                currentRetryCount = 0;
            } else {
                getTransformedEvents$facebook_core_release().addAll(0, processedEvents);
                currentRetryCount++;
            }
        }
    }

    public final void makeHttpRequest$facebook_core_release(String urlStr, String requestMethod, String str, Map<String, String> map, int i10, p<? super String, ? super Integer, g0> pVar) {
        Set<String> setKeySet;
        t.f(urlStr, "urlStr");
        t.f(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
            t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str2 : setKeySet) {
                    httpURLConnection.setRequestProperty(str2, map.get(str2));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(i10);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, Constants.ENCODING));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Constants.ENCODING));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fd.b.a(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                g0 g0Var = g0.f27756a;
                fd.b.a(bufferedReader, null);
            }
            String string = sb2.toString();
            t.e(string, "connResponseSB.toString()");
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (pVar != null) {
                pVar.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e10) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "Connection failed, retrying: \n%s", e10.toString());
            if (pVar != null) {
                pVar.invoke(null, 503);
            }
        } catch (IOException e11) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void setCredentials$facebook_core_release(CloudBridgeCredentials cloudBridgeCredentials) {
        t.f(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    public final void setCurrentRetryCount$facebook_core_release(int i10) {
        currentRetryCount = i10;
    }

    public final void setTransformedEvents$facebook_core_release(List<Map<String, Object>> list) {
        t.f(list, "<set-?>");
        transformedEvents = list;
    }
}
