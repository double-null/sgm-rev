package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextCreateContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import wc.g0;

/* JADX INFO: compiled from: ContextCreateDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextCreateDialog extends FacebookDialogBase<ContextCreateContent, Result> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GamingContextCreate.toRequestCode();
    private FacebookCallback<Result> callback;

    /* JADX INFO: compiled from: ContextCreateDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ContextCreateDialog.kt */
    private final class FacebookAppHandler extends FacebookDialogBase<ContextCreateContent, Result>.ModeHandler {
        public FacebookAppHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ContextCreateContent content, boolean z10) {
            t.f(content, "content");
            Activity activityContext = ContextCreateDialog.this.getActivityContext();
            PackageManager packageManager = activityContext != null ? activityContext.getPackageManager() : null;
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z11 = (packageManager != null ? intent.resolveActivity(packageManager) : null) != null;
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            return z11 && ((currentAccessToken != null ? currentAccessToken.getGraphDomain() : null) != null && t.a(FacebookSdk.GAMING, currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ContextCreateContent content) {
            t.f(content, "content");
            AppCall appCallCreateBaseAppCall = ContextCreateDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            bundle.putString("deeplink", "CONTEXT_CREATE");
            if (currentAccessToken != null) {
                bundle.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                bundle.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (content.getSuggestedPlayerID() != null) {
                bundle.putString("player_id", content.getSuggestedPlayerID());
            }
            NativeProtocol.setupProtocolRequestIntent(intent, appCallCreateBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), bundle);
            appCallCreateBaseAppCall.setRequestIntent(intent);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: ContextCreateDialog.kt */
    private final class WebHandler extends FacebookDialogBase<ContextCreateContent, Result>.ModeHandler {
        public WebHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ContextCreateContent content, boolean z10) {
            t.f(content, "content");
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ContextCreateContent content) {
            t.f(content, "content");
            AppCall appCallCreateBaseAppCall = ContextCreateDialog.this.createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString("player_id", content.getSuggestedPlayerID());
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            if (currentAccessToken != null) {
                bundle.putString("dialog_access_token", currentAccessToken.getToken());
            }
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, "context", bundle);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextCreateDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        t.f(activity, "activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallbackImpl$lambda$3(ContextCreateDialog this$0, ResultProcessor resultProcessor, int i10, Intent intent) {
        t.f(this$0, "this$0");
        t.f(resultProcessor, "$resultProcessor");
        return ShareInternalUtility.handleActivityResult(this$0.getRequestCode(), i10, intent, resultProcessor);
    }

    private final void showForCloud(ContextCreateContent contextCreateContent) {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextCreateContent with an invalid access token");
        }
        DaemonRequest.Callback callback = new DaemonRequest.Callback() { // from class: com.facebook.gamingservices.d
            @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                ContextCreateDialog.showForCloud$lambda$2(this.f11071a, graphResponse);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            if (contextCreateContent.getSuggestedPlayerID() != null) {
                jSONObject.put("id", contextCreateContent.getSuggestedPlayerID());
            }
            DaemonRequest.executeAsync(getActivityContext(), jSONObject, callback, SDKMessageEnum.CONTEXT_CREATE);
        } catch (JSONException unused) {
            FacebookCallback<Result> facebookCallback = this.callback;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Context Create Dialog"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showForCloud$lambda$2(ContextCreateDialog this$0, GraphResponse response) {
        g0 g0Var;
        t.f(this$0, "this$0");
        FacebookCallback<Result> facebookCallback = this$0.callback;
        if (facebookCallback != null) {
            FacebookRequestError error = response.getError();
            if (error != null) {
                facebookCallback.onError(new FacebookException(error.getErrorMessage()));
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            if (g0Var == null) {
                t.e(response, "response");
                facebookCallback.onSuccess(new Result(response));
            }
        }
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected List<FacebookDialogBase<ContextCreateContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return kotlin.collections.t.n(new FacebookAppHandler(), new WebHandler());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(CallbackManagerImpl callbackManager, final FacebookCallback<Result> callback) {
        t.f(callbackManager, "callbackManager");
        t.f(callback, "callback");
        this.callback = callback;
        final ResultProcessor resultProcessor = new ResultProcessor(callback) { // from class: com.facebook.gamingservices.ContextCreateDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<ContextCreateDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(callback);
                this.$callback = callback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                t.f(appCall, "appCall");
                if (bundle == null) {
                    onCancel(appCall);
                    return;
                }
                if (bundle.getString("error_message") != null) {
                    this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                    return;
                }
                String string = bundle.getString("id");
                String string2 = bundle.getString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID);
                if (string != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string));
                    this.$callback.onSuccess(new ContextCreateDialog.Result(string));
                } else if (string2 != null) {
                    GamingContext.Companion.setCurrentGamingContext(new GamingContext(string2));
                    this.$callback.onSuccess(new ContextCreateDialog.Result(string2));
                }
                this.$callback.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
            }
        };
        callbackManager.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.gamingservices.c
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i10, Intent intent) {
                return ContextCreateDialog.registerCallbackImpl$lambda$3(this.f11069a, resultProcessor, i10, intent);
            }
        });
    }

    /* JADX INFO: compiled from: ContextCreateDialog.kt */
    public static final class Result {
        private String contextID;

        public Result(String contextID) {
            t.f(contextID, "contextID");
            this.contextID = contextID;
        }

        public final String getContextID() {
            return this.contextID;
        }

        public final void setContextID(String str) {
            this.contextID = str;
        }

        public Result(GraphResponse response) {
            JSONObject jSONObjectOptJSONObject;
            t.f(response, "response");
            try {
                JSONObject jSONObject = response.getJSONObject();
                if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
                    return;
                }
                t.e(jSONObjectOptJSONObject, "optJSONObject(\"data\")");
                this.contextID = jSONObjectOptJSONObject.getString("id");
            } catch (JSONException unused) {
                this.contextID = null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextCreateDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
        t.f(fragment, "fragment");
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(ContextCreateContent content) {
        t.f(content, "content");
        return CloudGameLoginHandler.isRunningInCloud() || new FacebookAppHandler().canShow(content, true) || new WebHandler().canShow(content, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(ContextCreateContent content, Object mode) {
        t.f(content, "content");
        t.f(mode, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(content);
        } else {
            super.showImpl(content, mode);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextCreateDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        t.f(fragment, "fragment");
    }

    private ContextCreateDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}
