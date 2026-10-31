package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookRequestError.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {
    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    private static final String ERROR_CODE_FIELD_KEY = "code";
    private static final String ERROR_CODE_KEY = "error_code";
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
    private static final String ERROR_KEY = "error";
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";
    private static final String ERROR_MSG_KEY = "error_msg";
    private static final String ERROR_REASON_KEY = "error_reason";
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";
    private static final String ERROR_TYPE_FIELD_KEY = "type";
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    private final Object batchRequestResult;
    private final Category category;
    private final HttpURLConnection connection;
    private final int errorCode;
    private final String errorMessage;
    private final String errorRecoveryMessage;
    private final String errorType;
    private final String errorUserMessage;
    private final String errorUserTitle;
    private FacebookException exception;
    private final JSONObject requestResult;
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;
    public static final Companion Companion = new Companion(null);
    private static final Range HTTP_RANGE_SUCCESS = new Range(200, 299);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator<FacebookRequestError>() { // from class: com.facebook.FacebookRequestError$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FacebookRequestError createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.t.f(parcel, "parcel");
            return new FacebookRequestError(parcel, (kotlin.jvm.internal.k) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    };

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00cd A[Catch: JSONException -> 0x012b, TryCatch #0 {JSONException -> 0x012b, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:14:0x003f, B:17:0x0049, B:20:0x0053, B:23:0x005b, B:25:0x0061, B:28:0x006b, B:31:0x0075, B:45:0x00cd, B:33:0x0081, B:36:0x008e, B:38:0x0097, B:42:0x00a8, B:47:0x00ee, B:49:0x00f8, B:51:0x0106, B:53:0x010f), top: B:57:0x0012 }] */
        public final FacebookRequestError checkResponseAndCreateError(JSONObject singleResult, Object obj, HttpURLConnection httpURLConnection) {
            String strOptString;
            int iOptInt;
            boolean zOptBoolean;
            String strOptString2;
            String strOptString3;
            String str;
            String str2;
            kotlin.jvm.internal.t.f(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i10 = singleResult.getInt("code");
                    Object stringPropertyAsJSON = Utility.getStringPropertyAsJSON(singleResult, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                    if (stringPropertyAsJSON != null && (stringPropertyAsJSON instanceof JSONObject)) {
                        boolean z10 = true;
                        z10 = false;
                        int iOptInt2 = -1;
                        if (((JSONObject) stringPropertyAsJSON).has("error")) {
                            JSONObject jSONObject = (JSONObject) Utility.getStringPropertyAsJSON((JSONObject) stringPropertyAsJSON, "error", null);
                            strOptString = jSONObject != null ? jSONObject.optString("type", null) : null;
                            String strOptString4 = jSONObject != null ? jSONObject.optString("message", null) : null;
                            int iOptInt3 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt2 = jSONObject != null ? jSONObject.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject != null ? jSONObject.optString(FacebookRequestError.ERROR_USER_MSG_KEY, null) : null;
                            strOptString3 = jSONObject != null ? jSONObject.optString(FacebookRequestError.ERROR_USER_TITLE_KEY, null) : null;
                            zOptBoolean = jSONObject != null ? jSONObject.optBoolean(FacebookRequestError.ERROR_IS_TRANSIENT_KEY, false) : false;
                            str = strOptString4;
                            iOptInt = iOptInt2;
                            iOptInt2 = iOptInt3;
                        } else {
                            if (((JSONObject) stringPropertyAsJSON).has("error_code") || ((JSONObject) stringPropertyAsJSON).has(FacebookRequestError.ERROR_MSG_KEY) || ((JSONObject) stringPropertyAsJSON).has(FacebookRequestError.ERROR_REASON_KEY)) {
                                strOptString = ((JSONObject) stringPropertyAsJSON).optString(FacebookRequestError.ERROR_REASON_KEY, null);
                                String strOptString5 = ((JSONObject) stringPropertyAsJSON).optString(FacebookRequestError.ERROR_MSG_KEY, null);
                                int iOptInt4 = ((JSONObject) stringPropertyAsJSON).optInt("error_code", -1);
                                iOptInt = ((JSONObject) stringPropertyAsJSON).optInt("error_subcode", -1);
                                iOptInt2 = iOptInt4;
                                zOptBoolean = false;
                                strOptString2 = null;
                                strOptString3 = null;
                                str = strOptString5;
                            } else {
                                zOptBoolean = false;
                                iOptInt = -1;
                                str2 = null;
                                str = null;
                                strOptString2 = null;
                                strOptString3 = null;
                            }
                            if (z10) {
                                return new FacebookRequestError(i10, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) stringPropertyAsJSON, singleResult, obj, httpURLConnection, null, zOptBoolean, null);
                            }
                        }
                        str2 = strOptString;
                        if (z10) {
                            return new FacebookRequestError(i10, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) stringPropertyAsJSON, singleResult, obj, httpURLConnection, null, zOptBoolean, null);
                        }
                    }
                    if (!getHTTP_RANGE_SUCCESS$facebook_core_release().contains(i10)) {
                        return new FacebookRequestError(i10, -1, -1, null, null, null, null, singleResult.has("body") ? (JSONObject) Utility.getStringPropertyAsJSON(singleResult, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY) : null, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final synchronized FacebookRequestErrorClassification getErrorClassification() {
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (appSettingsWithoutQuery == null) {
                return FacebookRequestErrorClassification.Companion.getDefaultErrorClassification();
            }
            return appSettingsWithoutQuery.getErrorClassification();
        }

        public final Range getHTTP_RANGE_SUCCESS$facebook_core_release() {
            return FacebookRequestError.HTTP_RANGE_SUCCESS;
        }
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    public static final class Range {
        private final int end;
        private final int start;

        public Range(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }

        public final boolean contains(int i10) {
            return i10 <= this.end && this.start <= i10;
        }
    }

    public /* synthetic */ FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10, kotlin.jvm.internal.k kVar) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z10);
    }

    public static final FacebookRequestError checkResponseAndCreateError(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        return Companion.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
    }

    public static final synchronized FacebookRequestErrorClassification getErrorClassification() {
        return Companion.getErrorClassification();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    public final String getErrorRecoveryMessage() {
        return this.errorRecoveryMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    public final FacebookException getException() {
        return this.exception;
    }

    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
        kotlin.jvm.internal.t.e(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.t.f(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(getErrorMessage());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, kotlin.jvm.internal.k kVar) {
        this(parcel);
    }

    private FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10) {
        boolean z11;
        Category categoryClassify;
        this.requestStatusCode = i10;
        this.errorCode = i11;
        this.subErrorCode = i12;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            z11 = true;
        } else {
            this.exception = new FacebookServiceException(this, getErrorMessage());
            z11 = false;
        }
        if (z11) {
            categoryClassify = Category.OTHER;
        } else {
            categoryClassify = Companion.getErrorClassification().classify(i11, i12, z10);
        }
        this.category = categoryClassify;
        this.errorRecoveryMessage = Companion.getErrorClassification().getRecoveryMessage(categoryClassify);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
