package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import k9.dW.xjwcmjDeOXR;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;
import rd.f0;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: GraphRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GraphRequest {
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final String BATCH_BODY_PARAM = "body";
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final String BATCH_METHOD_PARAM = "method";
    private static final String BATCH_PARAM = "batch";
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final String CAPTION_PARAM = "caption";
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String DEBUG_KEY = "__debug__";
    private static final String DEBUG_MESSAGES_KEY = "messages";
    private static final String DEBUG_MESSAGE_KEY = "message";
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final String DEBUG_PARAM = "debug";
    private static final String DEBUG_SEVERITY_INFO = "info";
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    public static final String FIELDS_PARAM = "fields";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String ME = "me";
    private static final String MIME_BOUNDARY;
    private static final String MY_FRIENDS = "me/friends";
    private static final String MY_PHOTOS = "me/photos";
    private static final String PICTURE_PARAM = "picture";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    private static final String SEARCH = "search";
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String VIDEOS_SUFFIX = "/videos";
    private static String defaultBatchApplicationId;
    private static volatile String userAgent;
    private static final Pattern versionPattern;
    private AccessToken accessToken;
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private boolean forceApplicationRequest;
    private JSONObject graphObject;
    private String graphPath;
    private HttpMethod httpMethod;
    private String overriddenURL;
    private Bundle parameters;
    private Object tag;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = GraphRequest.class.getSimpleName();

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    private static final class Attachment {
        private final GraphRequest request;
        private final Object value;

        public Attachment(GraphRequest request, Object obj) {
            kotlin.jvm.internal.t.f(request, "request");
            this.request = request;
            this.value = obj;
        }

        public final GraphRequest getRequest() {
            return this.request;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface Callback {
        void onCompleted(GraphResponse graphResponse);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final String getBatchAppId(GraphRequestBatch graphRequestBatch) {
            String batchApplicationId = graphRequestBatch.getBatchApplicationId();
            if (batchApplicationId != null && (!graphRequestBatch.isEmpty())) {
                return batchApplicationId;
            }
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.defaultBatchApplicationId;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return FacebookSdk.getApplicationId();
        }

        private final String getDefaultPhotoPathIfNull(String str) {
            return str == null ? GraphRequest.MY_PHOTOS : str;
        }

        private final String getMimeContentType() {
            l0 l0Var = l0.f21527a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.MIME_BOUNDARY}, 1));
            kotlin.jvm.internal.t.e(str, "format(format, *args)");
            return str;
        }

        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        private final boolean hasOnProgressCallbacks(GraphRequestBatch graphRequestBatch) {
            Iterator<GraphRequestBatch.Callback> it = graphRequestBatch.getCallbacks().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = graphRequestBatch.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isGzipCompressible(GraphRequestBatch graphRequestBatch) {
            for (GraphRequest graphRequest : graphRequestBatch) {
                Iterator<String> it = graphRequest.getParameters().keySet().iterator();
                while (it.hasNext()) {
                    if (isSupportedAttachmentType(graphRequest.getParameters().get(it.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean isMeRequest(String str) {
            Matcher matcher = GraphRequest.versionPattern.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                kotlin.jvm.internal.t.e(str, "matcher.group(1)");
            }
            return c0.O(str, "me/", false, 2, null) || c0.O(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedAttachmentType(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedParameterType(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newMeRequest$lambda$0(GraphJSONObjectCallback graphJSONObjectCallback, GraphResponse response) {
            kotlin.jvm.internal.t.f(response, "response");
            if (graphJSONObjectCallback != null) {
                graphJSONObjectCallback.onCompleted(response.getJSONObject(), response);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newPlacesSearchRequest$lambda$1(GraphJSONArrayCallback graphJSONArrayCallback, GraphResponse response) {
            kotlin.jvm.internal.t.f(response, "response");
            if (graphJSONArrayCallback != null) {
                JSONObject jSONObject = response.getJSONObject();
                graphJSONArrayCallback.onCompleted(jSONObject != null ? jSONObject.optJSONArray("data") : null, response);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parameterToString(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
            kotlin.jvm.internal.t.e(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        public final void processGraphObject(JSONObject jSONObject, String str, KeyValueSerializer keyValueSerializer) {
            boolean z10;
            if (isMeRequest(str)) {
                int iI0 = f0.i0(str, ":", 0, false, 6, null);
                int iI1 = f0.i0(str, "?", 0, false, 6, null);
                if (iI0 <= 3 || (iI1 != -1 && iI0 >= iI1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = jSONObject.opt(key);
                boolean z11 = z10 && c0.B(key, "image", true);
                kotlin.jvm.internal.t.e(key, "key");
                kotlin.jvm.internal.t.e(value, "value");
                processGraphObjectProperty(key, value, keyValueSerializer, z11);
            }
        }

        private final void processGraphObjectProperty(String str, Object obj, KeyValueSerializer keyValueSerializer, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        l0 l0Var = l0.f21527a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        kotlin.jvm.internal.t.e(str2, "format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        kotlin.jvm.internal.t.e(objOpt, "jsonObject.opt(propertyName)");
                        processGraphObjectProperty(str2, objOpt, keyValueSerializer, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    kotlin.jvm.internal.t.e(strOptString, "jsonObject.optString(\"id\")");
                    processGraphObjectProperty(str, strOptString, keyValueSerializer, z10);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    kotlin.jvm.internal.t.e(strOptString2, "jsonObject.optString(\"url\")");
                    processGraphObjectProperty(str, strOptString2, keyValueSerializer, z10);
                    return;
                } else {
                    if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                        String string = jSONObject.toString();
                        kotlin.jvm.internal.t.e(string, "jsonObject.toString()");
                        processGraphObjectProperty(str, string, keyValueSerializer, z10);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    l0 l0Var2 = l0.f21527a;
                    String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    kotlin.jvm.internal.t.e(str3, "format(locale, format, *args)");
                    Object objOpt2 = jSONArray.opt(i10);
                    kotlin.jvm.internal.t.e(objOpt2, "jsonArray.opt(i)");
                    processGraphObjectProperty(str3, objOpt2, keyValueSerializer, z10);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                keyValueSerializer.writeString(str, obj.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                kotlin.jvm.internal.t.d(obj, "null cannot be cast to non-null type java.util.Date");
                String str4 = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                kotlin.jvm.internal.t.e(str4, "iso8601DateFormat.format(date)");
                keyValueSerializer.writeString(str, str4);
                return;
            }
            Utility.logd(GraphRequest.TAG, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
        }

        private final void processRequest(GraphRequestBatch graphRequestBatch, Logger logger, int i10, URL url, OutputStream outputStream, boolean z10) throws JSONException, IOException {
            Serializer serializer = new Serializer(outputStream, logger, z10);
            if (i10 != 1) {
                String batchAppId = getBatchAppId(graphRequestBatch);
                if (batchAppId.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                serializer.writeString(GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
                HashMap map = new HashMap();
                serializeRequestsAsJSON(serializer, graphRequestBatch, map);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(map, serializer);
                return;
            }
            GraphRequest graphRequest = graphRequestBatch.get(0);
            HashMap map2 = new HashMap();
            for (String key : graphRequest.getParameters().keySet()) {
                Object obj = graphRequest.getParameters().get(key);
                if (isSupportedAttachmentType(obj)) {
                    kotlin.jvm.internal.t.e(key, "key");
                    map2.put(key, new Attachment(graphRequest, obj));
                }
            }
            if (logger != null) {
                logger.append("  Parameters:\n");
            }
            serializeParameters(graphRequest.getParameters(), serializer, graphRequest);
            if (logger != null) {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(map2, serializer);
            JSONObject graphObject = graphRequest.getGraphObject();
            if (graphObject != null) {
                String path = url.getPath();
                kotlin.jvm.internal.t.e(path, "url.path");
                processGraphObject(graphObject, path, serializer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runCallbacks$lambda$2(ArrayList callbacks, GraphRequestBatch requests) {
            kotlin.jvm.internal.t.f(callbacks, "$callbacks");
            kotlin.jvm.internal.t.f(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Callback callback = (Callback) pair.first;
                Object obj = pair.second;
                kotlin.jvm.internal.t.e(obj, "pair.second");
                callback.onCompleted((GraphResponse) obj);
            }
            Iterator<GraphRequestBatch.Callback> it2 = requests.getCallbacks().iterator();
            while (it2.hasNext()) {
                it2.next().onBatchCompleted(requests);
            }
        }

        private final void serializeAttachments(Map<String, Attachment> map, Serializer serializer) throws IOException {
            for (Map.Entry<String, Attachment> entry : map.entrySet()) {
                if (GraphRequest.Companion.isSupportedAttachmentType(entry.getValue().getValue())) {
                    serializer.writeObject(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        private final void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphRequest) throws IOException {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (isSupportedParameterType(obj)) {
                    kotlin.jvm.internal.t.e(key, "key");
                    serializer.writeObject(key, obj, graphRequest);
                }
            }
        }

        private final void serializeRequestsAsJSON(Serializer serializer, Collection<GraphRequest> collection, Map<String, Attachment> map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = collection.iterator();
            while (it.hasNext()) {
                it.next().serializeToBatch(jSONArray, map);
            }
            serializer.writeRequestsAsJson(GraphRequest.BATCH_PARAM, jSONArray, collection);
        }

        private final void setConnectionContentType(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_TYPE_HEADER, getMimeContentType());
            } else {
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_ENCODING_HEADER, "gzip");
            }
        }

        public final GraphResponse executeAndWait(GraphRequest request) {
            kotlin.jvm.internal.t.f(request, "request");
            List<GraphResponse> listExecuteBatchAndWait = executeBatchAndWait(request);
            if (listExecuteBatchAndWait.size() == 1) {
                return listExecuteBatchAndWait.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        public final List<GraphResponse> executeBatchAndWait(GraphRequest... requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            return executeBatchAndWait(kotlin.collections.o.W(requests));
        }

        public final GraphRequestAsyncTask executeBatchAsync(GraphRequest... requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            return executeBatchAsync(kotlin.collections.o.W(requests));
        }

        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection connection, Collection<GraphRequest> requests) {
            kotlin.jvm.internal.t.f(connection, "connection");
            kotlin.jvm.internal.t.f(requests, "requests");
            return executeConnectionAndWait(connection, new GraphRequestBatch(requests));
        }

        public final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection connection, GraphRequestBatch requests) {
            kotlin.jvm.internal.t.f(connection, "connection");
            kotlin.jvm.internal.t.f(requests, "requests");
            return executeConnectionAsync(null, connection, requests);
        }

        public final String getDefaultBatchApplicationId() {
            return GraphRequest.defaultBatchApplicationId;
        }

        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
            kotlin.jvm.internal.t.f(context, "context");
            if (str == null && accessToken != null) {
                str = accessToken.getApplicationId();
            }
            if (str == null) {
                str = Utility.getMetadataApplicationId(context);
            }
            if (str == null) {
                throw new FacebookException("Facebook App ID cannot be determined");
            }
            String str2 = str + "/custom_audience_third_party_id";
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                }
                String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                if (attributionId != null) {
                    bundle.putString("udid", attributionId);
                }
            }
            if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited())) {
                bundle.putString("limit_event_usage", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            return new GraphRequest(accessToken, str2, bundle, HttpMethod.GET, callback, null, 32, null);
        }

        public final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        public final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, null, null, callback, null, 32, null);
        }

        public final GraphRequest newMeRequest(AccessToken accessToken, final GraphJSONObjectCallback graphJSONObjectCallback) {
            return new GraphRequest(accessToken, "me", null, null, new Callback() { // from class: com.facebook.v
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.newMeRequest$lambda$0(graphJSONObjectCallback, graphResponse);
                }
            }, null, 32, null);
        }

        public final GraphRequest newMyFriendsRequest(AccessToken accessToken, final GraphJSONArrayCallback graphJSONArrayCallback) {
            return new GraphRequest(accessToken, GraphRequest.MY_FRIENDS, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse response) {
                    kotlin.jvm.internal.t.f(response, "response");
                    if (graphJSONArrayCallback != null) {
                        JSONObject jSONObject = response.getJSONObject();
                        graphJSONArrayCallback.onCompleted(jSONObject != null ? jSONObject.optJSONArray("data") : null, response);
                    }
                }
            }, null, 32, null);
        }

        public final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i10, int i11, String str, final GraphJSONArrayCallback graphJSONArrayCallback) {
            if (location == null && Utility.isNullOrEmpty(str)) {
                throw new FacebookException("Either location or searchText must be specified.");
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i11);
            if (location != null) {
                l0 l0Var = l0.f21527a;
                String str2 = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                kotlin.jvm.internal.t.e(str2, "format(locale, format, *args)");
                bundle.putString("center", str2);
                bundle.putInt("distance", i10);
            }
            if (!Utility.isNullOrEmpty(str)) {
                bundle.putString("q", str);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new Callback() { // from class: com.facebook.w
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.newPlacesSearchRequest$lambda$1(graphJSONArrayCallback, graphResponse);
                }
            }, null, 32, null);
        }

        public final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(jSONObject);
            return graphRequest;
        }

        public final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
            return new GraphRequest(accessToken, str, bundle, HttpMethod.POST, callback, null, 32, null);
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap image, String str2, Bundle bundle, Callback callback) {
            kotlin.jvm.internal.t.f(image, "image");
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", image);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        public final void runCallbacks$facebook_core_release(final GraphRequestBatch requests, List<GraphResponse> responses) {
            kotlin.jvm.internal.t.f(requests, "requests");
            kotlin.jvm.internal.t.f(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                GraphRequest graphRequest = requests.get(i10);
                if (graphRequest.getCallback() != null) {
                    arrayList.add(new Pair(graphRequest.getCallback(), responses.get(i10)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.runCallbacks$lambda$2(arrayList, requests);
                    }
                };
                Handler callbackHandler = requests.getCallbackHandler();
                if (callbackHandler != null) {
                    callbackHandler.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
        public final void serializeToUrlConnection$facebook_core_release(GraphRequestBatch requests, HttpURLConnection connection) throws Throwable {
            OutputStream gZIPOutputStream;
            kotlin.jvm.internal.t.f(requests, "requests");
            kotlin.jvm.internal.t.f(connection, "connection");
            Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean zIsGzipCompressible = isGzipCompressible(requests);
            OutputStream outputStream = null;
            HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            setConnectionContentType(connection, zIsGzipCompressible);
            URL url = connection.getURL();
            logger.append("Request:\n");
            logger.appendKeyValue("Id", requests.getId());
            kotlin.jvm.internal.t.e(url, "url");
            logger.appendKeyValue("URL", url);
            Object requestMethod = connection.getRequestMethod();
            kotlin.jvm.internal.t.e(requestMethod, "connection.requestMethod");
            logger.appendKeyValue("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty(GraphRequest.USER_AGENT_HEADER);
            kotlin.jvm.internal.t.e(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            logger.appendKeyValue(GraphRequest.USER_AGENT_HEADER, requestProperty);
            Object requestProperty2 = connection.getRequestProperty(GraphRequest.CONTENT_TYPE_HEADER);
            kotlin.jvm.internal.t.e(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            logger.appendKeyValue(GraphRequest.CONTENT_TYPE_HEADER, requestProperty2);
            connection.setConnectTimeout(requests.getTimeout());
            connection.setReadTimeout(requests.getTimeout());
            if (!(httpMethod == HttpMethod.POST)) {
                logger.log();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (zIsGzipCompressible) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    if (hasOnProgressCallbacks(requests)) {
                        ProgressNoopOutputStream progressNoopOutputStream = new ProgressNoopOutputStream(requests.getCallbackHandler());
                        processRequest(requests, null, size, url, progressNoopOutputStream, zIsGzipCompressible);
                        gZIPOutputStream = new ProgressOutputStream(gZIPOutputStream, requests, progressNoopOutputStream.getProgressMap(), progressNoopOutputStream.getMaxProgress());
                    }
                    processRequest(requests, logger, size, url, gZIPOutputStream, zIsGzipCompressible);
                    gZIPOutputStream.close();
                    logger.log();
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = gZIPOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final void setDefaultBatchApplicationId(String str) {
            GraphRequest.defaultBatchApplicationId = str;
        }

        public final HttpURLConnection toHttpConnection(GraphRequest... requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            return toHttpConnection(kotlin.collections.o.W(requests));
        }

        public final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            return executeBatchAndWait(new GraphRequestBatch(requests));
        }

        public final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            return executeBatchAsync(new GraphRequestBatch(requests));
        }

        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection connection, GraphRequestBatch requests) {
            kotlin.jvm.internal.t.f(connection, "connection");
            kotlin.jvm.internal.t.f(requests, "requests");
            List<GraphResponse> listFromHttpConnection$facebook_core_release = GraphResponse.Companion.fromHttpConnection$facebook_core_release(connection, requests);
            Utility.disconnectQuietly(connection);
            int size = requests.size();
            if (size == listFromHttpConnection$facebook_core_release.size()) {
                runCallbacks$facebook_core_release(requests, listFromHttpConnection$facebook_core_release);
                AccessTokenManager.Companion.getInstance().extendAccessTokenIfNeeded();
                return listFromHttpConnection$facebook_core_release;
            }
            l0 l0Var = l0.f21527a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listFromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2));
            kotlin.jvm.internal.t.e(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }

        public final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection connection, GraphRequestBatch requests) {
            kotlin.jvm.internal.t.f(connection, "connection");
            kotlin.jvm.internal.t.f(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(connection, requests);
            requests.setCallbackHandler(handler);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final HttpURLConnection toHttpConnection(Collection<GraphRequest> requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            Validate.notEmpty(requests, "requests");
            return toHttpConnection(new GraphRequestBatch(requests));
        }

        public final void validateFieldsParamForGetRequests$facebook_core_release(GraphRequestBatch requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            for (GraphRequest graphRequest : requests) {
                if (HttpMethod.GET == graphRequest.getHttpMethod() && Utility.isNullOrEmpty(graphRequest.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GET requests for /");
                    String graphPath = graphRequest.getGraphPath();
                    if (graphPath == null) {
                        graphPath = "";
                    }
                    sb2.append(graphPath);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    companion.log(loggingBehavior, 5, RHIpdOnfgiYkEj.hlsTzStcntwr, sb2.toString());
                }
            }
        }

        private final HttpURLConnection createConnection(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            kotlin.jvm.internal.t.d(uRLConnectionOpenConnection, TwDPD.soLOygiBWwTBWkl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty(GraphRequest.USER_AGENT_HEADER, getUserAgent());
            httpURLConnection.setRequestProperty(GraphRequest.ACCEPT_LANGUAGE_HEADER, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String getUserAgent() {
            if (GraphRequest.userAgent == null) {
                l0 l0Var = l0.f21527a;
                String str = String.format(xjwcmjDeOXR.EGJsMqBuskiQ, Arrays.copyOf(new Object[]{GraphRequest.USER_AGENT_BASE, FacebookSdkVersion.BUILD}, 2));
                kotlin.jvm.internal.t.e(str, "format(format, *args)");
                GraphRequest.userAgent = str;
                String customUserAgent = InternalSettings.getCustomUserAgent();
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.userAgent, customUserAgent}, 2));
                    kotlin.jvm.internal.t.e(str2, "format(locale, format, *args)");
                    GraphRequest.userAgent = str2;
                }
            }
            return GraphRequest.userAgent;
        }

        public final List<GraphResponse> executeBatchAndWait(GraphRequestBatch requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpConnection;
            List<GraphResponse> listExecuteConnectionAndWait;
            kotlin.jvm.internal.t.f(requests, "requests");
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpConnection = toHttpConnection(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpConnection = null;
            } catch (Throwable th) {
                th = th;
                Utility.disconnectQuietly(httpURLConnection);
                throw th;
            }
            try {
                if (httpConnection != null) {
                    listExecuteConnectionAndWait = executeConnectionAndWait(httpConnection, requests);
                } else {
                    List<GraphResponse> listConstructErrorResponses = GraphResponse.Companion.constructErrorResponses(requests.getRequests(), null, new FacebookException(exc));
                    runCallbacks$facebook_core_release(requests, listConstructErrorResponses);
                    listExecuteConnectionAndWait = listConstructErrorResponses;
                }
                Utility.disconnectQuietly(httpConnection);
                return listExecuteConnectionAndWait;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpConnection;
                Utility.disconnectQuietly(httpURLConnection);
                throw th;
            }
        }

        public final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch requests) {
            kotlin.jvm.internal.t.f(requests, "requests");
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(requests);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final HttpURLConnection toHttpConnection(GraphRequestBatch requests) throws Throwable {
            URL url;
            kotlin.jvm.internal.t.f(requests, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).getUrlForSingleRequest());
                } else {
                    url = new URL(ServerProtocol.getGraphUrlBase());
                }
                HttpURLConnection httpURLConnectionCreateConnection = null;
                try {
                    httpURLConnectionCreateConnection = createConnection(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnectionCreateConnection);
                    return httpURLConnectionCreateConnection;
                } catch (IOException e10) {
                    Utility.disconnectQuietly(httpURLConnectionCreateConnection);
                    throw new FacebookException("could not construct request body", e10);
                } catch (JSONException e11) {
                    Utility.disconnectQuietly(httpURLConnectionCreateConnection);
                    throw new FacebookException("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new FacebookException("could not construct URL for request", e12);
            }
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) throws FileNotFoundException {
            kotlin.jvm.internal.t.f(file, "file");
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", parcelFileDescriptorOpen);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
            kotlin.jvm.internal.t.f(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri photoUri, String str2, Bundle bundle, Callback callback) throws FacebookException, FileNotFoundException {
            kotlin.jvm.internal.t.f(photoUri, "photoUri");
            if (Utility.isFileUri(photoUri)) {
                return newUploadPhotoRequest(accessToken, str, new File(photoUri.getPath()), str2, bundle, callback);
            }
            if (Utility.isContentUri(photoUri)) {
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    bundle2.putAll(bundle);
                }
                bundle2.putParcelable("picture", photoUri);
                if (str2 != null) {
                    if (str2.length() > 0) {
                        bundle2.putString("caption", str2);
                    }
                }
                return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
            }
            throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface GraphJSONArrayCallback {
        void onCompleted(JSONArray jSONArray, GraphResponse graphResponse);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface GraphJSONObjectCallback {
        void onCompleted(JSONObject jSONObject, GraphResponse graphResponse);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    private interface KeyValueSerializer {
        void writeString(String str, String str2);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface OnProgressCallback extends Callback {
        void onProgress(long j10, long j11);
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        private final String mimeType;
        private final RESOURCE resource;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(Parcel source) {
                kotlin.jvm.internal.t.f(source, "source");
                return new GraphRequest.ParcelableResourceWithMimeType<>(source, (kotlin.jvm.internal.k) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int i10) {
                return new GraphRequest.ParcelableResourceWithMimeType[i10];
            }
        };

        /* JADX INFO: compiled from: GraphRequest.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, kotlin.jvm.internal.k kVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            kotlin.jvm.internal.t.f(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, i10);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }
    }

    /* JADX INFO: compiled from: GraphRequest.kt */
    private static final class Serializer implements KeyValueSerializer {
        private boolean firstWrite;
        private final Logger logger;
        private final OutputStream outputStream;
        private final boolean useUrlEncode;

        public Serializer(OutputStream outputStream, Logger logger, boolean z10) {
            kotlin.jvm.internal.t.f(outputStream, "outputStream");
            this.outputStream = outputStream;
            this.logger = logger;
            this.firstWrite = true;
            this.useUrlEncode = z10;
        }

        private final RuntimeException getInvalidTypeError() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void write(String format, Object... args) throws IOException {
            kotlin.jvm.internal.t.f(format, "format");
            kotlin.jvm.internal.t.f(args, "args");
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                l0 l0Var = l0.f21527a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.t.e(str, "format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, Constants.ENCODING);
                kotlin.jvm.internal.t.e(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(rd.d.f24999b);
                kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.firstWrite) {
                OutputStream outputStream2 = this.outputStream;
                Charset charset = rd.d.f24999b;
                byte[] bytes2 = "--".getBytes(charset);
                kotlin.jvm.internal.t.e(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.outputStream;
                byte[] bytes3 = GraphRequest.MIME_BOUNDARY.getBytes(charset);
                kotlin.jvm.internal.t.e(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.outputStream;
                byte[] bytes4 = "\r\n".getBytes(charset);
                kotlin.jvm.internal.t.e(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.firstWrite = false;
            }
            OutputStream outputStream5 = this.outputStream;
            l0 l0Var2 = l0.f21527a;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str2 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            kotlin.jvm.internal.t.e(str2, "format(format, *args)");
            byte[] bytes5 = str2.getBytes(rd.d.f24999b);
            kotlin.jvm.internal.t.e(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void writeBitmap(String key, Bitmap bitmap) throws IOException {
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(bitmap, "bitmap");
            writeContentDisposition(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + key, "<Image>");
            }
        }

        public final void writeBytes(String key, byte[] bytes) throws IOException {
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(bytes, "bytes");
            writeContentDisposition(key, key, "content/unknown");
            this.outputStream.write(bytes);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                l0 l0Var = l0.f21527a;
                String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                kotlin.jvm.internal.t.e(str, "format(locale, format, *args)");
                logger.appendKeyValue("    " + key, str);
            }
        }

        public final void writeContentUri(String key, Uri contentUri, String str) throws IOException {
            int iCopyAndCloseInputStream;
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            writeContentDisposition(key, key, str);
            if (this.outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.outputStream).addProgress(Utility.getContentSize(contentUri));
                iCopyAndCloseInputStream = 0;
            } else {
                iCopyAndCloseInputStream = Utility.copyAndCloseInputStream(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri), this.outputStream) + 0;
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                l0 l0Var = l0.f21527a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iCopyAndCloseInputStream)}, 1));
                kotlin.jvm.internal.t.e(str2, "format(locale, format, *args)");
                logger.appendKeyValue("    " + key, str2);
            }
        }

        public final void writeFile(String key, ParcelFileDescriptor descriptor, String str) throws IOException {
            int iCopyAndCloseInputStream;
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            writeContentDisposition(key, key, str);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).addProgress(descriptor.getStatSize());
                iCopyAndCloseInputStream = 0;
            } else {
                iCopyAndCloseInputStream = Utility.copyAndCloseInputStream(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.outputStream) + 0;
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                l0 l0Var = l0.f21527a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iCopyAndCloseInputStream)}, 1));
                kotlin.jvm.internal.t.e(str2, "format(locale, format, *args)");
                logger.appendKeyValue("    " + key, str2);
            }
        }

        public final void writeLine(String format, Object... args) throws IOException {
            kotlin.jvm.internal.t.f(format, "format");
            kotlin.jvm.internal.t.f(args, "args");
            write(format, Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            write("\r\n", new Object[0]);
        }

        public final void writeObject(String key, Object obj, GraphRequest graphRequest) throws IOException {
            kotlin.jvm.internal.t.f(key, "key");
            Closeable closeable = this.outputStream;
            if (closeable instanceof RequestOutputStream) {
                kotlin.jvm.internal.t.d(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((RequestOutputStream) closeable).setCurrentRequest(graphRequest);
            }
            Companion companion = GraphRequest.Companion;
            if (companion.isSupportedParameterType(obj)) {
                writeString(key, companion.parameterToString(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                writeBitmap(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                writeBytes(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                writeContentUri(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                writeFile(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw getInvalidTypeError();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                writeFile(key, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw getInvalidTypeError();
                }
                writeContentUri(key, (Uri) resource, mimeType);
            }
        }

        public final void writeRecordBoundary() throws IOException {
            if (!this.useUrlEncode) {
                writeLine("--%s", GraphRequest.MIME_BOUNDARY);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = "&".getBytes(rd.d.f24999b);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void writeRequestsAsJson(String key, JSONArray requestJsonArray, Collection<GraphRequest> requests) throws JSONException, IOException {
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(requestJsonArray, "requestJsonArray");
            kotlin.jvm.internal.t.f(requests, "requests");
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof RequestOutputStream)) {
                String string = requestJsonArray.toString();
                kotlin.jvm.internal.t.e(string, "requestJsonArray.toString()");
                writeString(key, string);
                return;
            }
            kotlin.jvm.internal.t.d(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            RequestOutputStream requestOutputStream = (RequestOutputStream) closeable;
            writeContentDisposition(key, null, null);
            write("[", new Object[0]);
            int i10 = 0;
            for (GraphRequest graphRequest : requests) {
                int i11 = i10 + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i10 > 0) {
                    write(",%s", jSONObject.toString());
                } else {
                    write("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            write("]", new Object[0]);
            Logger logger = this.logger;
            if (logger != null) {
                String string2 = requestJsonArray.toString();
                kotlin.jvm.internal.t.e(string2, "requestJsonArray.toString()");
                logger.appendKeyValue("    " + key, string2);
            }
        }

        @Override // com.facebook.GraphRequest.KeyValueSerializer
        public void writeString(String key, String value) throws IOException {
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(value, "value");
            writeContentDisposition(key, null, null);
            writeLine("%s", value);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + key, value);
            }
        }

        public final void writeContentDisposition(String str, String str2, String str3) throws IOException {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                l0 l0Var = l0.f21527a;
                String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                kotlin.jvm.internal.t.e(str4, "format(format, *args)");
                byte[] bytes = str4.getBytes(rd.d.f24999b);
                kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            write("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                write("; filename=\"%s\"", str2);
            }
            writeLine("", new Object[0]);
            if (str3 != null) {
                writeLine("%s: %s", wHzciBnJlYkdX.PQKMMFPLlXhvL, str3);
            }
            writeLine("", new Object[0]);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.t.e(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i10 = 0; i10 < iNextInt; i10++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "buffer.toString()");
        MIME_BOUNDARY = string;
        versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final void addCommonParameters() {
        Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token") && Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
            Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString(FORMAT_PARAM, FORMAT_JSON);
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_INFO);
        } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_WARNING);
        }
    }

    private final String appendParametersToBaseUrl(String str, boolean z10) {
        if (!z10 && this.httpMethod == HttpMethod.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str2);
            if (obj == null) {
                obj = "";
            }
            Companion companion = Companion;
            if (companion.isSupportedParameterType(obj)) {
                builderBuildUpon.appendQueryParameter(str2, companion.parameterToString(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                l0 l0Var = l0.f21527a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                kotlin.jvm.internal.t.e(str3, "format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        kotlin.jvm.internal.t.e(string, "uriBuilder.toString()");
        return string;
    }

    public static final GraphResponse executeAndWait(GraphRequest graphRequest) {
        return Companion.executeAndWait(graphRequest);
    }

    public static final List<GraphResponse> executeBatchAndWait(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAndWait(graphRequestBatch);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAsync(graphRequestBatch);
    }

    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    public static final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    private final String getAccessTokenToUseForRequest() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken.getToken();
                Logger.Companion.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final String getClientTokenForRequest() {
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        if (applicationId.length() > 0) {
            if (clientToken.length() > 0) {
                return applicationId + '|' + clientToken;
            }
        }
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    public static final String getDefaultBatchApplicationId() {
        return Companion.getDefaultBatchApplicationId();
    }

    private final String getGraphPathWithVersion() {
        if (versionPattern.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        l0 l0Var = l0.f21527a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        return str;
    }

    private final String getUrlWithGraphPath(String str) {
        if (!isValidGraphRequestForDomain()) {
            str = ServerProtocol.getFacebookGraphUrlBase();
        }
        l0 l0Var = l0.f21527a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, getGraphPathWithVersion()}, 2));
        kotlin.jvm.internal.t.e(str2, "format(format, *args)");
        return str2;
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(FacebookSdk.getApplicationId());
        sb2.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb2.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    private final boolean isValidGraphRequestForDomain() {
        if (kotlin.jvm.internal.t.a(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return !isApplicationRequest();
        }
        return true;
    }

    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    public static final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
        return Companion.newDeleteObjectRequest(accessToken, str, callback);
    }

    public static final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
        return Companion.newGraphPathRequest(accessToken, str, callback);
    }

    public static final GraphRequest newMeRequest(AccessToken accessToken, GraphJSONObjectCallback graphJSONObjectCallback) {
        return Companion.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    public static final GraphRequest newMyFriendsRequest(AccessToken accessToken, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    public static final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i10, int i11, String str, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newPlacesSearchRequest(accessToken, location, i10, i11, str, graphJSONArrayCallback);
    }

    public static final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
        return Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    public static final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
        return Companion.newPostRequestWithBundle(accessToken, str, bundle, callback);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap bitmap, String str2, Bundle bundle, Callback callback) {
        return Companion.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void serializeToBatch(JSONArray jSONArray, Map<String, Attachment> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put(BATCH_METHOD_PARAM, this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.Companion.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (Companion.isSupportedAttachmentType(obj)) {
                l0 l0Var = l0.f21527a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                kotlin.jvm.internal.t.e(str3, "format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new Attachment(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final ArrayList arrayList2 = new ArrayList();
            Companion.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new KeyValueSerializer() { // from class: com.facebook.GraphRequest.serializeToBatch.1
                @Override // com.facebook.GraphRequest.KeyValueSerializer
                public void writeString(String key, String value) throws IOException {
                    kotlin.jvm.internal.t.f(key, "key");
                    kotlin.jvm.internal.t.f(value, "value");
                    ArrayList<String> arrayList3 = arrayList2;
                    l0 l0Var2 = l0.f21527a;
                    String str4 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, Constants.ENCODING)}, 2));
                    kotlin.jvm.internal.t.e(str4, "format(locale, format, *args)");
                    arrayList3.add(str4);
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public static final void setDefaultBatchApplicationId(String str) {
        Companion.setDefaultBatchApplicationId(str);
    }

    private final boolean shouldForceClientTokenForRequest() {
        String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        boolean zU = accessTokenToUseForRequest != null ? f0.U(accessTokenToUseForRequest, "|", false, 2, null) : false;
        if (((accessTokenToUseForRequest == null || !c0.O(accessTokenToUseForRequest, "IG", false, 2, null) || zU) ? false : true) && isApplicationRequest()) {
            return true;
        }
        return (isValidGraphRequestForDomain() || zU) ? false : true;
    }

    public static final HttpURLConnection toHttpConnection(GraphRequestBatch graphRequestBatch) {
        return Companion.toHttpConnection(graphRequestBatch);
    }

    public final GraphRequestAsyncTask executeAsync() {
        return Companion.executeBatchAsync(this);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final String getGraphPath() {
        return this.graphPath;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final Bundle getParameters() {
        return this.parameters;
    }

    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String urlWithGraphPath = getUrlWithGraphPath(ServerProtocol.getGraphUrlBase());
        addCommonParameters();
        Uri uri = Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
        l0 l0Var = l0.f21527a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        kotlin.jvm.internal.t.e(str, "format(format, *args)");
        return str;
    }

    public final Object getTag() {
        return this.tag;
    }

    public final String getUrlForSingleRequest() {
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        String urlWithGraphPath = getUrlWithGraphPath((this.httpMethod == HttpMethod.POST && str2 != null && c0.A(str2, VIDEOS_SUFFIX, false, 2, null)) ? ServerProtocol.getGraphVideoUrlBase() : ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain()));
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath, false);
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public final void setBatchEntryDependsOn(String str) {
        this.batchEntryDependsOn = str;
    }

    public final void setBatchEntryName(String str) {
        this.batchEntryName = str;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z10) {
        this.batchEntryOmitResultOnSuccess = z10;
    }

    public final void setCallback(final Callback callback) {
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new Callback() { // from class: com.facebook.t
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest._set_callback_$lambda$0(callback, graphResponse);
                }
            };
        } else {
            this.callback = callback;
        }
    }

    public final void setForceApplicationRequest(boolean z10) {
        this.forceApplicationRequest = z10;
    }

    public final void setGraphObject(JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final void setGraphPath(String str) {
        this.graphPath = str;
    }

    public final void setHttpMethod(HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    public final void setParameters(Bundle bundle) {
        kotlin.jvm.internal.t.f(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public GraphRequest(AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_callback_$lambda$0(Callback callback, GraphResponse response) {
        kotlin.jvm.internal.t.f(response, "response");
        JSONObject jSONObject = response.getJSONObject();
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(DEBUG_KEY) : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(DEBUG_MESSAGES_KEY) : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                if (strOptString != null && strOptString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (kotlin.jvm.internal.t.a(strOptString2, DEBUG_SEVERITY_WARNING)) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!Utility.isNullOrEmpty(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    Logger.Companion companion = Logger.Companion;
                    String str = TAG;
                    kotlin.jvm.internal.t.e(str, edUJlCZxhVnO.mUDyhXCOLrvji);
                    companion.log(loggingBehavior, str, strOptString);
                }
            }
        }
        if (callback != null) {
            callback.onCompleted(response);
        }
    }

    public static final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> collection) {
        return Companion.executeBatchAndWait(collection);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> collection) {
        return Companion.executeBatchAsync(collection);
    }

    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        return Companion.executeConnectionAndWait(httpURLConnection, collection);
    }

    public static final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri uri, String str2, Bundle bundle, Callback callback) throws FacebookException, FileNotFoundException {
        return Companion.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    public static final HttpURLConnection toHttpConnection(Collection<GraphRequest> collection) {
        return Companion.toHttpConnection(collection);
    }

    public final GraphResponse executeAndWait() {
        return Companion.executeAndWait(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(WKirgUEJJ.VnJQewKOiOr);
        sb2.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.graphPath);
        sb2.append(", graphObject: ");
        sb2.append(this.graphObject);
        sb2.append(", httpMethod: ");
        sb2.append(this.httpMethod);
        sb2.append(", parameters: ");
        sb2.append(this.parameters);
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    public GraphRequest(AccessToken accessToken, String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    public static final List<GraphResponse> executeBatchAndWait(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAndWait(graphRequestArr);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAsync(graphRequestArr);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) throws FileNotFoundException {
        return Companion.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    public static final HttpURLConnection toHttpConnection(GraphRequest... graphRequestArr) {
        return Companion.toHttpConnection(graphRequestArr);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? null : accessToken, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : httpMethod, (i10 & 16) != 0 ? null : callback, (i10 & 32) != 0 ? null : str2);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    public GraphRequest(AccessToken accessToken, URL overriddenURL) {
        kotlin.jvm.internal.t.f(overriddenURL, "overriddenURL");
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = overriddenURL.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }
}
