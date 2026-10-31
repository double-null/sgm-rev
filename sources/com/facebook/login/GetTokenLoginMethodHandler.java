package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.u0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {
    private GetTokenClient getTokenClient;
    private final String nameForLogging;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator<GetTokenLoginMethodHandler>() { // from class: com.facebook.login.GetTokenLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetTokenLoginMethodHandler createFromParcel(Parcel source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new GetTokenLoginMethodHandler(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GetTokenLoginMethodHandler[] newArray(int i10) {
            return new GetTokenLoginMethodHandler[i10];
        }
    };

    /* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        kotlin.jvm.internal.t.f(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryAuthorize$lambda$1(GetTokenLoginMethodHandler this$0, LoginClient.Request request, Bundle bundle) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(request, "$request");
        this$0.getTokenCompleted(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void cancel() {
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.cancel();
            getTokenClient.setCompletedListener(null);
            this.getTokenClient = null;
        }
    }

    public final void complete(final LoginClient.Request request, final Bundle result) {
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(result, "result");
        String string = result.getString(NativeProtocol.EXTRA_USER_ID);
        if (!(string == null || string.length() == 0)) {
            onComplete(request, result);
            return;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        String string2 = result.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        kotlin.jvm.internal.t.e(string2, "checkNotNull(result.getS…ocol.EXTRA_ACCESS_TOKEN))");
        Utility.getGraphMeRequestWithCacheAsync(string2, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.login.GetTokenLoginMethodHandler.complete.1
            @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
            public void onSuccess(JSONObject jSONObject) {
                try {
                    result.putString(NativeProtocol.EXTRA_USER_ID, jSONObject != null ? jSONObject.getString("id") : null);
                    this.onComplete(request, result);
                } catch (JSONException e10) {
                    this.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.getLoginClient().getPendingRequest(), "Caught exception", e10.getMessage(), null, 8, null));
                }
            }

            @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
            public void onFailure(FacebookException facebookException) {
                this.getLoginClient().complete(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, this.getLoginClient().getPendingRequest(), EFLCCdIRcb.LvqyRYNhCs, facebookException != null ? facebookException.getMessage() : null, null, 8, null));
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void getTokenCompleted(LoginClient.Request request, Bundle bundle) {
        kotlin.jvm.internal.t.f(request, "request");
        GetTokenClient getTokenClient = this.getTokenClient;
        if (getTokenClient != null) {
            getTokenClient.setCompletedListener(null);
        }
        this.getTokenClient = null;
        getLoginClient().notifyBackgroundProcessingStop();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
            if (stringArrayList == null) {
                stringArrayList = kotlin.collections.t.k();
            }
            Set<String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = u0.e();
            }
            String string = bundle.getString(NativeProtocol.EXTRA_AUTHENTICATION_TOKEN);
            if (permissions.contains("openid")) {
                if (string == null || string.length() == 0) {
                    getLoginClient().tryNextHandler();
                    return;
                }
            }
            if (stringArrayList.containsAll(permissions)) {
                complete(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : permissions) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                addLoggingExtra(LoginLogger.EVENT_EXTRAS_NEW_PERMISSIONS, TextUtils.join(",", hashSet));
            }
            request.setPermissions(hashSet);
        }
        getLoginClient().tryNextHandler();
    }

    public final void onComplete(LoginClient.Request request, Bundle result) {
        LoginClient.Result resultCreateErrorResult$default;
        kotlin.jvm.internal.t.f(request, "request");
        kotlin.jvm.internal.t.f(result, "result");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.Companion;
            resultCreateErrorResult$default = LoginClient.Result.Companion.createCompositeTokenResult(request, companion.createAccessTokenFromNativeLogin(result, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.createAuthenticationTokenFromNativeLogin(result, request.getNonce()));
        } catch (FacebookException e10) {
            resultCreateErrorResult$default = LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.Companion, getLoginClient().getPendingRequest(), null, e10.getMessage(), null, 8, null);
        }
        getLoginClient().completeAndValidate(resultCreateErrorResult$default);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int tryAuthorize(final LoginClient.Request request) {
        kotlin.jvm.internal.t.f(request, "request");
        Context activity = getLoginClient().getActivity();
        if (activity == null) {
            activity = FacebookSdk.getApplicationContext();
        }
        GetTokenClient getTokenClient = new GetTokenClient(activity, request);
        this.getTokenClient = getTokenClient;
        if (!getTokenClient.start()) {
            return 0;
        }
        getLoginClient().notifyBackgroundProcessingStart();
        PlatformServiceClient.CompletedListener completedListener = new PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.m
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(Bundle bundle) {
                GetTokenLoginMethodHandler.tryAuthorize$lambda$1(this.f11144a, request, bundle);
            }
        };
        GetTokenClient getTokenClient2 = this.getTokenClient;
        if (getTokenClient2 != null) {
            getTokenClient2.setCompletedListener(completedListener);
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel source) {
        super(source);
        kotlin.jvm.internal.t.f(source, "source");
        this.nameForLogging = "get_token";
    }
}
