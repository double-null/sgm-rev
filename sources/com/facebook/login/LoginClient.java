package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.o0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginClient.kt */
/* JADX INFO: loaded from: classes3.dex */
public class LoginClient implements Parcelable {
    private BackgroundProcessingListener backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;
    private Map<String, String> extraData;
    private Fragment fragment;
    private LoginMethodHandler[] handlersToTry;
    private Map<String, String> loggingExtras;
    private LoginLogger loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    private OnCompletedListener onCompletedListener;
    private Request pendingRequest;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LoginClient.class.getSimpleName();
    public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator<LoginClient>() { // from class: com.facebook.login.LoginClient$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginClient createFromParcel(Parcel source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new LoginClient(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LoginClient[] newArray(int i10) {
            return new LoginClient[i10];
        }
    };

    /* JADX INFO: compiled from: LoginClient.kt */
    public interface BackgroundProcessingListener {
        void onBackgroundProcessingStarted();

        void onBackgroundProcessingStopped();
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final String getE2E() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException e10) {
                Utility.logd(LoginClient.TAG, "Failed to create e2e JSON", e10);
            }
            String string = jSONObject.toString();
            kotlin.jvm.internal.t.e(string, "e2e.toString()");
            return string;
        }

        public final int getLoginRequestCode() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    public interface OnCompletedListener {
        void onCompleted(Result result);
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    public static final class Request implements Parcelable {
        private String androidSsoContext;
        private final String applicationId;
        private String authId;
        private String authType;
        private final String codeChallenge;
        private final CodeChallengeMethod codeChallengeMethod;
        private final String codeVerifier;
        private final DefaultAudience defaultAudience;
        private String deviceAuthTargetUserId;
        private String deviceRedirectUriString;
        private boolean forceConfirmation;
        private String intentUriPackageTarget;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private final LoginTargetApp loginTargetApp;
        private String messengerPageId;
        private final String nonce;
        private Set<String> permissions;
        private String redirectURI;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() { // from class: com.facebook.login.LoginClient$Request$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Request createFromParcel(Parcel source) {
                kotlin.jvm.internal.t.f(source, "source");
                return new LoginClient.Request(source, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Request[] newArray(int i10) {
                return new LoginClient.Request[i10];
            }
        };

        /* JADX INFO: compiled from: LoginClient.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public /* synthetic */ Request(Parcel parcel, kotlin.jvm.internal.k kVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getAndroidSsoContext() {
            return this.androidSsoContext;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final String getAuthId() {
            return this.authId;
        }

        public final String getAuthType() {
            return this.authType;
        }

        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        public final boolean getForceConfirmation() {
            return this.forceConfirmation;
        }

        public final String getIntentUriPackageTarget() {
            return this.intentUriPackageTarget;
        }

        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final Set<String> getPermissions() {
            return this.permissions;
        }

        public final String getRedirectURI() {
            return this.redirectURI;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean hasPublishPermission() {
            Iterator<String> it = this.permissions.iterator();
            while (it.hasNext()) {
                if (LoginManager.Companion.isPublishPermission(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean isInstagramLogin() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        public final boolean isRerequest() {
            return this.isRerequest;
        }

        public final void setAndroidSsoContext(String str) {
            this.androidSsoContext = str;
        }

        public final void setAuthId(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.authId = str;
        }

        public final void setAuthType(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.authType = str;
        }

        public final void setDeviceAuthTargetUserId(String str) {
            this.deviceAuthTargetUserId = str;
        }

        public final void setDeviceRedirectUriString(String str) {
            this.deviceRedirectUriString = str;
        }

        public final void setFamilyLogin(boolean z10) {
            this.isFamilyLogin = z10;
        }

        public final void setForceConfirmation(boolean z10) {
            this.forceConfirmation = z10;
        }

        public final void setIntentUriPackageTarget(String str) {
            this.intentUriPackageTarget = str;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(Set<String> set) {
            kotlin.jvm.internal.t.f(set, "<set-?>");
            this.permissions = set;
        }

        public final void setRedirectURI(String str) {
            this.redirectURI = str;
        }

        public final void setRerequest(boolean z10) {
            this.isRerequest = z10;
        }

        public final void setResetMessengerState(boolean z10) {
            this.resetMessengerState = z10;
        }

        public final void setShouldSkipAccountDeduplication(boolean z10) {
            this.shouldSkipAccountDeduplication = z10;
        }

        public final boolean shouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.t.f(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.redirectURI);
            dest.writeString(this.intentUriPackageTarget);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeByte(this.forceConfirmation ? (byte) 1 : (byte) 0);
            dest.writeString(this.androidSsoContext);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            dest.writeString(codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, null, null, null, null, null, null, null, 8128, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, null, null, null, null, null, null, 8064, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp, String str) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, null, null, null, null, null, 7936, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp, String str, String str2) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, null, null, null, null, 7680, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp, String str, String str2, String str3) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, str3, null, null, null, 7168, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp, String str, String str2, String str3, CodeChallengeMethod codeChallengeMethod) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, str3, codeChallengeMethod, null, null, 6144, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String applicationId, String authId, LoginTargetApp loginTargetApp, String str2, String str3, String str4, CodeChallengeMethod codeChallengeMethod, String str5) {
            this(loginBehavior, set, defaultAudience, str, applicationId, authId, loginTargetApp, str2, str3, str4, codeChallengeMethod, str5, null, 4096, null);
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(str, OgqfiHA.fDHUVinJTBeXxWE);
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
        }

        public /* synthetic */ Request(LoginBehavior loginBehavior, Set set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod, String str7, String str8, int i10, kotlin.jvm.internal.k kVar) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, (i10 & 64) != 0 ? LoginTargetApp.FACEBOOK : loginTargetApp, (i10 & 128) != 0 ? null : str4, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : codeChallengeMethod, (i10 & 2048) != 0 ? null : str7, (i10 & 4096) != 0 ? null : str8);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String authType, String applicationId, String authId, LoginTargetApp loginTargetApp, String str, String str2, String str3, CodeChallengeMethod codeChallengeMethod, String str4, String str5) {
            kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.t.f(authType, "authType");
            kotlin.jvm.internal.t.f(applicationId, "applicationId");
            kotlin.jvm.internal.t.f(authId, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = applicationId;
            this.redirectURI = str4;
            this.intentUriPackageTarget = str5;
            this.authId = authId;
            this.loginTargetApp = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str != null) {
                if (!(str.length() == 0)) {
                    this.nonce = str;
                } else {
                    String string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
                    this.nonce = string;
                }
            } else {
                String string2 = UUID.randomUUID().toString();
                kotlin.jvm.internal.t.e(string2, "randomUUID().toString()");
                this.nonce = string2;
            }
            this.codeVerifier = str2;
            this.codeChallenge = str3;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        private Request(Parcel parcel) {
            DefaultAudience defaultAudienceValueOf;
            LoginTargetApp loginTargetAppValueOf;
            this.loginBehavior = LoginBehavior.valueOf(Validate.notNullOrEmpty(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                defaultAudienceValueOf = DefaultAudience.valueOf(string);
            } else {
                defaultAudienceValueOf = DefaultAudience.NONE;
            }
            this.defaultAudience = defaultAudienceValueOf;
            this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
            this.redirectURI = parcel.readString();
            this.intentUriPackageTarget = parcel.readString();
            this.authId = Validate.notNullOrEmpty(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Validate.notNullOrEmpty(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String string2 = parcel.readString();
            if (string2 != null) {
                loginTargetAppValueOf = LoginTargetApp.valueOf(string2);
            } else {
                loginTargetAppValueOf = LoginTargetApp.FACEBOOK;
            }
            this.loginTargetApp = loginTargetAppValueOf;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.forceConfirmation = parcel.readByte() != 0;
            this.androidSsoContext = parcel.readString();
            this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String string3 = parcel.readString();
            this.codeChallengeMethod = string3 != null ? CodeChallengeMethod.valueOf(string3) : null;
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    public static final class Result implements Parcelable {
        public final AuthenticationToken authenticationToken;
        public final Code code;
        public final String errorCode;
        public final String errorMessage;
        public Map<String, String> extraData;
        public Map<String, String> loggingExtras;
        public final Request request;
        public final AccessToken token;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() { // from class: com.facebook.login.LoginClient$Result$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Result createFromParcel(Parcel source) {
                kotlin.jvm.internal.t.f(source, "source");
                return new LoginClient.Result(source, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LoginClient.Result[] newArray(int i10) {
                return new LoginClient.Result[i10];
            }
        };

        /* JADX INFO: compiled from: LoginClient.kt */
        public enum Code {
            SUCCESS(GraphResponse.SUCCESS_KEY),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* JADX INFO: compiled from: LoginClient.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public static /* synthetic */ Result createErrorResult$default(Companion companion, Request request, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return companion.createErrorResult(request, str, str2, str3);
            }

            public final Result createCancelResult(Request request, String str) {
                return new Result(request, Code.CANCEL, null, str, null);
            }

            public final Result createCompositeTokenResult(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result createErrorResult(Request request, String str, String str2) {
                return createErrorResult$default(this, request, str, str2, null, 8, null);
            }

            public final Result createTokenResult(Request request, AccessToken token) {
                kotlin.jvm.internal.t.f(token, "token");
                return new Result(request, Code.SUCCESS, token, null, null);
            }

            public final Result createErrorResult(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }
        }

        public /* synthetic */ Result(Parcel parcel, kotlin.jvm.internal.k kVar) {
            this(parcel);
        }

        public static final Result createCancelResult(Request request, String str) {
            return Companion.createCancelResult(request, str);
        }

        public static final Result createCompositeTokenResult(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
            return Companion.createCompositeTokenResult(request, accessToken, authenticationToken);
        }

        public static final Result createErrorResult(Request request, String str, String str2) {
            return Companion.createErrorResult(request, str, str2);
        }

        public static final Result createTokenResult(Request request, AccessToken accessToken) {
            return Companion.createTokenResult(request, accessToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.t.f(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, i10);
            dest.writeParcelable(this.authenticationToken, i10);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, i10);
            Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
            Utility.writeNonnullStringMapToParcel(dest, this.extraData);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            kotlin.jvm.internal.t.f(code, "code");
        }

        public static final Result createErrorResult(Request request, String str, String str2, String str3) {
            return Companion.createErrorResult(request, str, str2, str3);
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            kotlin.jvm.internal.t.f(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        private Result(Parcel parcel) {
            String string = parcel.readString();
            this.code = Code.valueOf(string == null ? "error" : string);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Utility.readNonnullStringMapFromParcel(parcel);
            this.extraData = Utility.readNonnullStringMapFromParcel(parcel);
        }
    }

    public LoginClient(Fragment fragment) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        this.currentHandler = -1;
        setFragment(fragment);
    }

    private final void addLoggingExtra(String str, String str2, boolean z10) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void completeWithFailure() {
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    public static final String getE2E() {
        return Companion.getE2E();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    private final LoginLogger getLogger() {
        Context activity;
        Request request;
        String applicationId;
        LoginLogger loginLogger = this.loginLogger;
        if (loginLogger != null) {
            String applicationId2 = loginLogger.getApplicationId();
            Request request2 = this.pendingRequest;
            if (!kotlin.jvm.internal.t.a(applicationId2, request2 != null ? request2.getApplicationId() : null)) {
                activity = getActivity();
                if (activity == null) {
                    activity = FacebookSdk.getApplicationContext();
                }
                request = this.pendingRequest;
                if (request != null || (applicationId = request.getApplicationId()) == null) {
                    applicationId = FacebookSdk.getApplicationId();
                }
                loginLogger = new LoginLogger(activity, applicationId);
                this.loginLogger = loginLogger;
            }
        } else {
            activity = getActivity();
            if (activity == null) {
                activity = FacebookSdk.getApplicationContext();
            }
            request = this.pendingRequest;
            if (request != null) {
                applicationId = FacebookSdk.getApplicationId();
            } else {
                applicationId = FacebookSdk.getApplicationId();
            }
            loginLogger = new LoginLogger(activity, applicationId);
            this.loginLogger = loginLogger;
        }
        return loginLogger;
    }

    public static final int getLoginRequestCode() {
        return Companion.getLoginRequestCode();
    }

    private final void logAuthorizationMethodComplete(String str, Result result, Map<String, String> map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private final void notifyOnCompleteListener(Result result) {
        OnCompletedListener onCompletedListener = this.onCompletedListener;
        if (onCompletedListener != null) {
            onCompletedListener.onCompleted(result);
        }
    }

    public final void addExtraData(String key, String value, boolean z10) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        Map<String, String> map = this.extraData;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.extraData == null) {
            this.extraData = map;
        }
        if (map.containsKey(key) && z10) {
            value = map.get(key) + ',' + value;
        }
        map.put(key, value);
    }

    public final void authorize(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.Companion.isCurrentAccessTokenActive() || checkInternetPermission()) {
            this.pendingRequest = request;
            this.handlersToTry = getHandlersToTry(request);
            tryNextHandler();
        }
    }

    public final void cancelCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            currentHandler.cancel();
        }
    }

    public final boolean checkInternetPermission() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        androidx.fragment.app.e activity = getActivity();
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, activity != null ? activity.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_title) : null, activity != null ? activity.getString(com.facebook.common.R.string.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    public final int checkPermission(String permission) {
        kotlin.jvm.internal.t.f(permission, "permission");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            return activity.checkCallingOrSelfPermission(permission);
        }
        return -1;
    }

    public final void complete(Result outcome) {
        kotlin.jvm.internal.t.f(outcome, "outcome");
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), outcome, currentHandler.getMethodLoggingExtras());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(outcome);
    }

    public final void completeAndValidate(Result outcome) {
        kotlin.jvm.internal.t.f(outcome, "outcome");
        if (outcome.token == null || !AccessToken.Companion.isCurrentAccessTokenActive()) {
            complete(outcome);
        } else {
            validateSameFbidAndFinish(outcome);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final androidx.fragment.app.e getActivity() {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final BackgroundProcessingListener getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    public final boolean getCheckedInternetPermission() {
        return this.checkedInternetPermission;
    }

    public final LoginMethodHandler getCurrentHandler() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.currentHandler;
        if (i10 < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i10];
    }

    public final Map<String, String> getExtraData() {
        return this.extraData;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final LoginMethodHandler[] getHandlersToTry() {
        return this.handlersToTry;
    }

    public final boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    public final Map<String, String> getLoggingExtras() {
        return this.loggingExtras;
    }

    public final OnCompletedListener getOnCompletedListener() {
        return this.onCompletedListener;
    }

    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void notifyBackgroundProcessingStart() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStarted();
        }
    }

    public final void notifyBackgroundProcessingStop() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStopped();
        }
    }

    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                tryNextHandler();
                return false;
            }
            LoginMethodHandler currentHandler = getCurrentHandler();
            if (currentHandler != null && (!currentHandler.shouldKeepTrackOfMultipleIntents() || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return currentHandler.onActivityResult(i10, i11, intent);
            }
        }
        return false;
    }

    public final void setBackgroundProcessingListener(BackgroundProcessingListener backgroundProcessingListener) {
        this.backgroundProcessingListener = backgroundProcessingListener;
    }

    public final void setCheckedInternetPermission(boolean z10) {
        this.checkedInternetPermission = z10;
    }

    protected final void setCurrentHandlerIndex(int i10) {
        this.currentHandler = i10;
    }

    public final void setExtraData(Map<String, String> map) {
        this.extraData = map;
    }

    public final void setFragment(Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final void setHandlersToTry(LoginMethodHandler[] loginMethodHandlerArr) {
        this.handlersToTry = loginMethodHandlerArr;
    }

    public final void setLoggingExtras(Map<String, String> map) {
        this.loggingExtras = map;
    }

    public final void setOnCompletedListener(OnCompletedListener onCompletedListener) {
        this.onCompletedListener = onCompletedListener;
    }

    public final void setPendingRequest(Request request) {
        this.pendingRequest = request;
    }

    public final void startOrContinueAuth(Request request) {
        if (getInProgress()) {
            return;
        }
        authorize(request);
    }

    public final boolean tryCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler == null) {
            return false;
        }
        if (currentHandler.needsInternetPermission() && !checkInternetPermission()) {
            addLoggingExtra(LoginLogger.EVENT_EXTRAS_MISSING_INTERNET_PERMISSION, AppEventsConstants.EVENT_PARAM_VALUE_YES, false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int iTryAuthorize = currentHandler.tryAuthorize(request);
        this.numActivitiesReturned = 0;
        if (iTryAuthorize > 0) {
            getLogger().logAuthorizationMethodStart(request.getAuthId(), currentHandler.getNameForLogging(), request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_START : LoginLogger.EVENT_NAME_LOGIN_METHOD_START);
            this.numTotalIntentsFired = iTryAuthorize;
        } else {
            getLogger().logAuthorizationMethodNotTried(request.getAuthId(), currentHandler.getNameForLogging(), request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED : LoginLogger.EVENT_NAME_LOGIN_METHOD_NOT_TRIED);
            addLoggingExtra(LoginLogger.EVENT_EXTRAS_NOT_TRIED, currentHandler.getNameForLogging(), true);
        }
        return iTryAuthorize > 0;
    }

    public final void tryNextHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, null, null, currentHandler.getMethodLoggingExtras());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i10 = this.currentHandler;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i10 + 1;
            if (tryCurrentHandler()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            completeWithFailure();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:6:0x0013, B:8:0x0021, B:10:0x003d, B:9:0x002e), top: B:17:0x0013 }] */
    public final void validateSameFbidAndFinish(Result pendingResult) {
        Result resultCreateCompositeTokenResult;
        kotlin.jvm.internal.t.f(pendingResult, "pendingResult");
        if (pendingResult.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        AccessToken accessToken = pendingResult.token;
        if (currentAccessToken != null) {
            try {
                if (kotlin.jvm.internal.t.a(currentAccessToken.getUserId(), accessToken.getUserId())) {
                    resultCreateCompositeTokenResult = Result.Companion.createCompositeTokenResult(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken);
                } else {
                    resultCreateCompositeTokenResult = Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
                }
            } catch (Exception e10) {
                complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Caught exception", e10.getMessage(), null, 8, null));
                return;
            }
        } else {
            resultCreateCompositeTokenResult = Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        }
        complete(resultCreateCompositeTokenResult);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.t.f(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, i10);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, i10);
        Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
        Utility.writeNonnullStringMapToParcel(dest, this.extraData);
    }

    public LoginMethodHandler[] getHandlersToTry(Request request) {
        kotlin.jvm.internal.t.f(request, "request");
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.isInstagramLogin()) {
            if (loginBehavior.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        return (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
    }

    private final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        String str5 = LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE;
        if (request == null) {
            getLogger().logUnexpectedError(LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        LoginLogger logger = getLogger();
        String authId = request.getAuthId();
        if (request.isFamilyLogin()) {
            str5 = LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE;
        }
        logger.logAuthorizationMethodComplete(authId, str, str2, str3, str4, map, str5);
    }

    public LoginClient(Parcel source) {
        kotlin.jvm.internal.t.f(source, "source");
        this.currentHandler = -1;
        Parcelable[] parcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i10];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.setLoginClient(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i10++;
        }
        this.handlersToTry = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
        this.currentHandler = source.readInt();
        this.pendingRequest = (Request) source.readParcelable(Request.class.getClassLoader());
        Map<String, String> nonnullStringMapFromParcel = Utility.readNonnullStringMapFromParcel(source);
        this.loggingExtras = nonnullStringMapFromParcel != null ? o0.u(nonnullStringMapFromParcel) : null;
        Map<String, String> nonnullStringMapFromParcel2 = Utility.readNonnullStringMapFromParcel(source);
        this.extraData = nonnullStringMapFromParcel2 != null ? o0.u(nonnullStringMapFromParcel2) : null;
    }
}
