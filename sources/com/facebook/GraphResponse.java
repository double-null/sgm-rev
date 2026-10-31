package com.facebook;

import android.util.Log;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: GraphResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GraphResponse {
    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
    private static final String RESPONSE_LOG_TAG = "Response";
    public static final String SUCCESS_KEY = "success";
    private final HttpURLConnection connection;
    private final FacebookRequestError error;
    private final JSONObject graphObject;
    private final JSONArray graphObjectArray;
    private final JSONArray jsonArray;
    private final JSONObject jsonObject;
    private final String rawResponse;
    private final GraphRequest request;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = GraphResponse.class.getCanonicalName();

    /* JADX INFO: compiled from: GraphResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final GraphResponse createResponseFromObject(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object NULL, Object obj) throws JSONException {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                FacebookRequestError facebookRequestErrorCheckResponseAndCreateError = FacebookRequestError.Companion.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
                if (facebookRequestErrorCheckResponseAndCreateError != null) {
                    Log.e(GraphResponse.TAG, facebookRequestErrorCheckResponseAndCreateError.toString());
                    if (facebookRequestErrorCheckResponseAndCreateError.getErrorCode() == 190 && Utility.isCurrentAccessToken(graphRequest.getAccessToken())) {
                        if (facebookRequestErrorCheckResponseAndCreateError.getSubErrorCode() != 493) {
                            AccessToken.Companion.setCurrentAccessToken(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.Companion;
                            AccessToken currentAccessToken = companion.getCurrentAccessToken();
                            boolean z10 = false;
                            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                                z10 = true;
                            }
                            if (z10) {
                                companion.expireCurrentAccessToken();
                            }
                        }
                    }
                    return new GraphResponse(graphRequest, httpURLConnection, facebookRequestErrorCheckResponseAndCreateError);
                }
                Object stringPropertyAsJSON = Utility.getStringPropertyAsJSON(jSONObject, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                if (stringPropertyAsJSON instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) stringPropertyAsJSON;
                    return new GraphResponse(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (stringPropertyAsJSON instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) stringPropertyAsJSON;
                    return new GraphResponse(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                kotlin.jvm.internal.t.e(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new GraphResponse(graphRequest, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + NULL.getClass().getSimpleName());
        }

        private final List<GraphResponse> createResponsesFromObject(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws JSONException, FacebookException {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put(GraphResponse.CODE_KEY, httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e10)));
                    obj2 = obj;
                } catch (JSONException e11) {
                    arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e11)));
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        GraphRequest graphRequest2 = list.get(i10);
                        try {
                            Object obj3 = ((JSONArray) obj2).get(i10);
                            kotlin.jvm.internal.t.e(obj3, "obj");
                            arrayList.add(createResponseFromObject(graphRequest2, httpURLConnection, obj3, obj));
                        } catch (FacebookException e12) {
                            arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e12)));
                        } catch (JSONException e13) {
                            arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e13)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }

        public final List<GraphResponse> constructErrorResponses(List<GraphRequest> requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            kotlin.jvm.internal.t.f(requests, "requests");
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(requests, 10));
            Iterator<T> it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        public final List<GraphResponse> createResponsesFromStream$facebook_core_release(InputStream inputStream, HttpURLConnection httpURLConnection, GraphRequestBatch requests) throws JSONException, FacebookException, IOException {
            kotlin.jvm.internal.t.f(requests, "requests");
            String streamToString = Utility.readStreamToString(inputStream);
            Logger.Companion.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, GraphResponse.RESPONSE_LOG_TAG, "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(streamToString.length()), streamToString);
            return createResponsesFromString$facebook_core_release(streamToString, httpURLConnection, requests);
        }

        public final List<GraphResponse> fromHttpConnection$facebook_core_release(HttpURLConnection connection, GraphRequestBatch requests) {
            List<GraphResponse> listConstructErrorResponses;
            kotlin.jvm.internal.t.f(connection, "connection");
            kotlin.jvm.internal.t.f(requests, "requests");
            InputStream errorStream = null;
            try {
                try {
                    if (!FacebookSdk.isFullyInitialized()) {
                        Log.e(GraphResponse.TAG, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    listConstructErrorResponses = createResponsesFromStream$facebook_core_release(errorStream, connection, requests);
                    Utility.closeQuietly(errorStream);
                    return listConstructErrorResponses;
                } catch (FacebookException e10) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e10);
                    listConstructErrorResponses = constructErrorResponses(requests, connection, e10);
                } catch (Exception e11) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e11);
                    listConstructErrorResponses = constructErrorResponses(requests, connection, new FacebookException(e11));
                }
            } catch (Throwable th) {
                Utility.closeQuietly(null);
                throw th;
            }
        }

        public final List<GraphResponse> createResponsesFromString$facebook_core_release(String responseString, HttpURLConnection httpURLConnection, GraphRequestBatch requests) throws JSONException, FacebookException, IOException {
            kotlin.jvm.internal.t.f(responseString, "responseString");
            kotlin.jvm.internal.t.f(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            kotlin.jvm.internal.t.e(resultObject, "resultObject");
            List<GraphResponse> listCreateResponsesFromObject = createResponsesFromObject(httpURLConnection, requests, resultObject);
            Logger.Companion.log(LoggingBehavior.REQUESTS, GEmOVMyH.ecovdpRsBs, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), Integer.valueOf(responseString.length()), listCreateResponsesFromObject);
            return listCreateResponsesFromObject;
        }
    }

    /* JADX INFO: compiled from: GraphResponse.kt */
    /* JADX INFO: loaded from: classes.dex */
    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        kotlin.jvm.internal.t.f(request, "request");
        this.request = request;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    public static final List<GraphResponse> constructErrorResponses(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        return Companion.constructErrorResponses(list, httpURLConnection, facebookException);
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final FacebookRequestError getError() {
        return this.error;
    }

    public final JSONArray getJSONArray() {
        return this.graphObjectArray;
    }

    public final JSONObject getJSONObject() {
        return this.graphObject;
    }

    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getRawResponse() {
        return this.rawResponse;
    }

    public final GraphRequest getRequest() {
        return this.request;
    }

    public final GraphRequest getRequestForPagedResults(PagingDirection direction) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        kotlin.jvm.internal.t.f(direction, "direction");
        JSONObject jSONObject = this.graphObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("paging")) == null) {
            strOptString = null;
        } else {
            strOptString = direction == PagingDirection.NEXT ? jSONObjectOptJSONObject.optString("next") : jSONObjectOptJSONObject.optString("previous");
        }
        if (Utility.isNullOrEmpty(strOptString)) {
            return null;
        }
        if (strOptString != null && kotlin.jvm.internal.t.a(strOptString, this.request.getUrlForSingleRequest())) {
            return null;
        }
        try {
            return new GraphRequest(this.request.getAccessToken(), new URL(strOptString));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public String toString() {
        String str;
        try {
            l0 l0Var = l0.f21527a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.connection;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.t.e(str, vgmm.vEKmXwK);
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
        kotlin.jvm.internal.t.e(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(rawResponse, "rawResponse");
        kotlin.jvm.internal.t.f(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(error, "error");
    }
}
