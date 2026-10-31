package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentJoinDialogURIBuilder;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import g7.EinF.ZHgPsTG;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TournamentJoinDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TournamentJoinDialog extends FacebookDialogBase<String, Result> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.TournamentJoinDialog.toRequestCode();
    private static final String JOIN_TOURNAMENT_ACCESS_TOKEN_KEY = "access_token";
    private static final String JOIN_TOURNAMENT_ACTION = "com.facebook.games.gaming_services.DEEPLINK";
    private static final String JOIN_TOURNAMENT_CONTENT_TYPE = "text/plain";
    private static final String JOIN_TOURNAMENT_DIALOG = "join_tournament";
    private static final String JOIN_TOURNAMENT_ERROR_MESSAGE_KEY = "error_message";
    private String payload;
    private Number requestID;
    private String tournamentID;

    /* JADX INFO: compiled from: TournamentJoinDialog.kt */
    private final class ChromeCustomTabHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        public ChromeCustomTabHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(String str, boolean z10) {
            return CustomTabUtils.getChromePackage() != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(String str) {
            String applicationId;
            AppCall appCallCreateBaseAppCall = TournamentJoinDialog.this.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            if (currentAccessToken == null || (applicationId = currentAccessToken.getApplicationId()) == null) {
                applicationId = FacebookSdk.getApplicationId();
            }
            bundle.putString("app_id", applicationId);
            bundle.putString("payload", bundle2.toString());
            if (currentAccessToken != null) {
                currentAccessToken.getToken();
            }
            bundle.putString("access_token", currentAccessToken != null ? currentAccessToken.getToken() : null);
            bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, CustomTabUtils.getDefaultRedirectURI());
            DialogPresenter.setupAppCallForCustomTabDialog(appCallCreateBaseAppCall, TournamentJoinDialog.JOIN_TOURNAMENT_DIALOG, bundle);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: TournamentJoinDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TournamentJoinDialog.kt */
    /* JADX INFO: loaded from: classes2.dex */
    private final class FacebookAppHandler extends FacebookDialogBase<String, Result>.ModeHandler {
        public FacebookAppHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(String str, boolean z10) {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            t.e(packageManager, "getApplicationContext().packageManager");
            Intent intent = new Intent(TournamentJoinDialog.JOIN_TOURNAMENT_ACTION);
            intent.setType(TournamentJoinDialog.JOIN_TOURNAMENT_CONTENT_TYPE);
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(String str) {
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AppCall appCallCreateBaseAppCall = TournamentJoinDialog.this.createBaseAppCall();
            Intent intent = new Intent(TournamentJoinDialog.JOIN_TOURNAMENT_ACTION);
            intent.setType(TournamentJoinDialog.JOIN_TOURNAMENT_CONTENT_TYPE);
            if (currentAccessToken == null || currentAccessToken.isExpired()) {
                throw new FacebookException(ZHgPsTG.xXoRmxRLj);
            }
            if (currentAccessToken.getGraphDomain() != null && !t.a(FacebookSdk.GAMING, currentAccessToken.getGraphDomain())) {
                throw new FacebookException("Attempted to present TournamentJoinDialog while user is not gaming logged in");
            }
            NativeProtocol.setupProtocolRequestIntent(intent, appCallCreateBaseAppCall.getCallId().toString(), "", NativeProtocol.PROTOCOL_VERSION_20210906, TournamentJoinDialogURIBuilder.INSTANCE.bundle$facebook_gamingservices_release(currentAccessToken.getApplicationId(), TournamentJoinDialog.this.tournamentID, TournamentJoinDialog.this.payload));
            appCallCreateBaseAppCall.setRequestIntent(intent);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: TournamentJoinDialog.kt */
    public static final class Result {
        private String payload;
        private String requestID;
        private String tournamentID;

        public Result(Bundle results) {
            t.f(results, "results");
            if (results.getString("request") != null) {
                this.requestID = results.getString("request");
            }
            this.tournamentID = results.getString(SDKConstants.PARAM_TOURNAMENTS_ID);
            this.payload = results.getString("payload");
        }

        public final String getPayload() {
            return this.payload;
        }

        public final String getRequestID() {
            return this.requestID;
        }

        public final String getTournamentID() {
            return this.tournamentID;
        }

        public final void setPayload(String str) {
            this.payload = str;
        }

        public final void setRequestID(String str) {
            this.requestID = str;
        }

        public final void setTournamentID(String str) {
            this.tournamentID = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
        t.f(activity, "activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallbackImpl$lambda$0(TournamentJoinDialog this$0, ResultProcessor resultProcessor, int i10, Intent intent) {
        t.f(this$0, "this$0");
        t.f(resultProcessor, "$resultProcessor");
        return ShareInternalUtility.handleActivityResult(this$0.getRequestCode(), i10, intent, resultProcessor);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected List<FacebookDialogBase<String, Result>.ModeHandler> getOrderedModeHandlers() {
        return kotlin.collections.t.n(new FacebookAppHandler(), new ChromeCustomTabHandler());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(CallbackManagerImpl callbackManager, final FacebookCallback<Result> callback) {
        t.f(callbackManager, "callbackManager");
        t.f(callback, "callback");
        final ResultProcessor resultProcessor = new ResultProcessor(callback) { // from class: com.facebook.gamingservices.TournamentJoinDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<TournamentJoinDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(callback);
                this.$callback = callback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                t.f(appCall, "appCall");
                if (bundle != null) {
                    if (bundle.getString("error_message") != null) {
                        this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                        return;
                    } else if (bundle.getString("payload") != null) {
                        this.$callback.onSuccess(new TournamentJoinDialog.Result(bundle));
                        return;
                    }
                }
                onCancel(appCall);
            }
        };
        callbackManager.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.gamingservices.l
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i10, Intent intent) {
                return TournamentJoinDialog.registerCallbackImpl$lambda$0(this.f11077a, resultProcessor, i10, intent);
            }
        });
    }

    public final void show(String str, String str2) {
        this.tournamentID = str;
        this.payload = str2;
        super.showImpl(str, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
        t.f(fragment, "fragment");
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(String str) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return false;
        }
        if (new FacebookAppHandler().canShow(str, true)) {
            return true;
        }
        return new ChromeCustomTabHandler().canShow(str, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(String str, Object mode) {
        t.f(mode, "mode");
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return;
        }
        super.showImpl(str, mode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentJoinDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
        t.f(fragment, "fragment");
    }

    private TournamentJoinDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }
}
