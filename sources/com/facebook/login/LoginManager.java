package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import d5.LXP.wcAlQCOdREZdI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.b0;
import kotlin.collections.u0;
import rd.PSo.cNMUz;
import rd.c0;
import wc.g0;

/* JADX INFO: compiled from: LoginManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public class LoginManager {
    public static final Companion Companion;
    private static final String EXPRESS_LOGIN_ALLOWED = "express_login_allowed";
    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Set<String> OTHER_PUBLISH_PERMISSIONS;
    private static final String PREFERENCE_LOGIN_MANAGER = "com.facebook.loginManager";
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private static final String TAG;
    private static volatile LoginManager instance;
    private boolean isFamilyLogin;
    private String messengerPageId;
    private boolean resetMessengerState;
    private final SharedPreferences sharedPreferences;
    private boolean shouldSkipAccountDeduplication;
    private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
    private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
    private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
    private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    /* JADX INFO: compiled from: LoginManager.kt */
    private static final class ActivityStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;

        public ActivityStartActivityDelegate(Activity activity) {
            kotlin.jvm.internal.t.f(activity, "activity");
            this.activityContext = activity;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.t.f(intent, "intent");
            getActivityContext().startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: LoginManager.kt */
    static final class AndroidxActivityResultRegistryOwnerStartActivityDelegate implements StartActivityDelegate {
        private final androidx.activity.result.c activityResultRegistryOwner;
        private final CallbackManager callbackManager;

        public AndroidxActivityResultRegistryOwnerStartActivityDelegate(androidx.activity.result.c activityResultRegistryOwner, CallbackManager callbackManager) {
            kotlin.jvm.internal.t.f(activityResultRegistryOwner, "activityResultRegistryOwner");
            kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
            this.activityResultRegistryOwner = activityResultRegistryOwner;
            this.callbackManager = callbackManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startActivityForResult$lambda$0(AndroidxActivityResultRegistryOwnerStartActivityDelegate this$0, LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder launcherHolder, Pair pair) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            kotlin.jvm.internal.t.f(launcherHolder, "$launcherHolder");
            CallbackManager callbackManager = this$0.callbackManager;
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            Object obj = pair.first;
            kotlin.jvm.internal.t.e(obj, "result.first");
            callbackManager.onActivityResult(requestCode, ((Number) obj).intValue(), (Intent) pair.second);
            ActivityResultLauncher<Intent> launcher = launcherHolder.getLauncher();
            if (launcher != null) {
                launcher.d();
            }
            launcherHolder.setLauncher(null);
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            Object obj = this.activityResultRegistryOwner;
            if (obj instanceof Activity) {
                return (Activity) obj;
            }
            return null;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.t.f(intent, "intent");
            final LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder = new LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder();
            loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.setLauncher(this.activityResultRegistryOwner.getActivityResultRegistry().j("facebook-login", new f.a<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.login.LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$1
                @Override // f.a
                public Intent createIntent(Context context, Intent input) {
                    kotlin.jvm.internal.t.f(context, "context");
                    kotlin.jvm.internal.t.f(input, "input");
                    return input;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // f.a
                public Pair<Integer, Intent> parseResult(int i11, Intent intent2) {
                    Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(i11), intent2);
                    kotlin.jvm.internal.t.e(pairCreate, "create(resultCode, intent)");
                    return pairCreate;
                }
            }, new androidx.activity.result.b() { // from class: com.facebook.login.u
                @Override // androidx.activity.result.b
                public final void onActivityResult(Object obj) {
                    LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.startActivityForResult$lambda$0(this.f11157a, loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder, (Pair) obj);
                }
            }));
            ActivityResultLauncher<Intent> launcher = loginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder.getLauncher();
            if (launcher != null) {
                launcher.b(intent);
            }
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> getOtherPublishPermissions() {
            return u0.i("ads_management", "create_event", "rsvp_event");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleLoginStatusError(String str, String str2, String str3, LoginLogger loginLogger, LoginStatusCallback loginStatusCallback) {
            FacebookException facebookException = new FacebookException(str + ": " + str2);
            loginLogger.logLoginStatusError(str3, facebookException);
            loginStatusCallback.onError(facebookException);
        }

        public final LoginResult computeLoginResult(LoginClient.Request request, AccessToken newToken, AuthenticationToken authenticationToken) {
            kotlin.jvm.internal.t.f(request, "request");
            kotlin.jvm.internal.t.f(newToken, "newToken");
            Set<String> permissions = request.getPermissions();
            Set setS0 = b0.s0(b0.L(newToken.getPermissions()));
            if (request.isRerequest()) {
                setS0.retainAll(permissions);
            }
            Set setS1 = b0.s0(b0.L(permissions));
            setS1.removeAll(setS0);
            return new LoginResult(newToken, authenticationToken, setS0, setS1);
        }

        public final Map<String, String> getExtraDataFromIntent(Intent intent) {
            if (intent == null) {
                return null;
            }
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result == null) {
                return null;
            }
            return result.extraData;
        }

        public LoginManager getInstance() {
            if (LoginManager.instance == null) {
                synchronized (this) {
                    LoginManager.instance = new LoginManager();
                    g0 g0Var = g0.f27756a;
                }
            }
            LoginManager loginManager = LoginManager.instance;
            if (loginManager != null) {
                return loginManager;
            }
            kotlin.jvm.internal.t.u("instance");
            return null;
        }

        public final boolean isPublishPermission(String str) {
            if (str != null) {
                return c0.O(str, LoginManager.PUBLISH_PERMISSION_PREFIX, false, 2, null) || c0.O(str, LoginManager.MANAGE_PERMISSION_PREFIX, false, 2, null) || LoginManager.OTHER_PUBLISH_PERMISSIONS.contains(str);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    public final class FacebookLoginActivityResultContract extends f.a<Collection<? extends String>, CallbackManager.ActivityResultParameters> {
        private CallbackManager callbackManager;
        private String loggerID;

        public FacebookLoginActivityResultContract(CallbackManager callbackManager, String str) {
            this.callbackManager = callbackManager;
            this.loggerID = str;
        }

        @Override // f.a
        public /* bridge */ /* synthetic */ Intent createIntent(Context context, Collection<? extends String> collection) {
            return createIntent2(context, (Collection<String>) collection);
        }

        public final CallbackManager getCallbackManager() {
            return this.callbackManager;
        }

        public final String getLoggerID() {
            return this.loggerID;
        }

        public final void setCallbackManager(CallbackManager callbackManager) {
            this.callbackManager = callbackManager;
        }

        public final void setLoggerID(String str) {
            this.loggerID = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public Intent createIntent2(Context context, Collection<String> permissions) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(permissions, "permissions");
            LoginClient.Request requestCreateLoginRequestWithConfig = LoginManager.this.createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, 0 == true ? 1 : 0));
            String str = this.loggerID;
            if (str != null) {
                requestCreateLoginRequestWithConfig.setAuthId(str);
            }
            LoginManager.this.logStartLogin(context, requestCreateLoginRequestWithConfig);
            Intent facebookActivityIntent = LoginManager.this.getFacebookActivityIntent(requestCreateLoginRequestWithConfig);
            if (LoginManager.this.resolveIntent(facebookActivityIntent)) {
                return facebookActivityIntent;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            LoginManager.this.logCompleteLogin(context, LoginClient.Result.Code.ERROR, null, facebookException, false, requestCreateLoginRequestWithConfig);
            throw facebookException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // f.a
        public CallbackManager.ActivityResultParameters parseResult(int i10, Intent intent) {
            LoginManager.onActivityResult$default(LoginManager.this, i10, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            CallbackManager callbackManager = this.callbackManager;
            if (callbackManager != null) {
                callbackManager.onActivityResult(requestCode, i10, intent);
            }
            return new CallbackManager.ActivityResultParameters(requestCode, i10, intent);
        }

        public /* synthetic */ FacebookLoginActivityResultContract(LoginManager loginManager, CallbackManager callbackManager, String str, int i10, kotlin.jvm.internal.k kVar) {
            this((i10 & 1) != 0 ? null : callbackManager, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    private static final class FragmentStartActivityDelegate implements StartActivityDelegate {
        private final Activity activityContext;
        private final FragmentWrapper fragment;

        public FragmentStartActivityDelegate(FragmentWrapper fragment) {
            kotlin.jvm.internal.t.f(fragment, "fragment");
            this.fragment = fragment;
            this.activityContext = fragment.getActivity();
        }

        @Override // com.facebook.login.StartActivityDelegate
        public Activity getActivityContext() {
            return this.activityContext;
        }

        @Override // com.facebook.login.StartActivityDelegate
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.t.f(intent, "intent");
            this.fragment.startActivityForResult(intent, i10);
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    private static final class LoginLoggerHolder {
        public static final LoginLoggerHolder INSTANCE = new LoginLoggerHolder();
        private static LoginLogger logger;

        private LoginLoggerHolder() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000c A[DONT_GENERATE] */
        /* JADX WARN: Instruction removed from duplicated block: B:9:0x000c, please report this as an issue */
        public final synchronized LoginLogger getLogger(Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (logger == null) {
                    logger = new LoginLogger(context, FacebookSdk.getApplicationId());
                }
                return logger;
            }
            context = FacebookSdk.getApplicationContext();
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new LoginLogger(context, FacebookSdk.getApplicationId());
            }
            return logger;
            throw th;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        OTHER_PUBLISH_PERMISSIONS = companion.getOtherPublishPermissions();
        String string = LoginManager.class.toString();
        kotlin.jvm.internal.t.e(string, "LoginManager::class.java.toString()");
        TAG = string;
    }

    public LoginManager() {
        Validate.sdkInitialized();
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, 0);
        kotlin.jvm.internal.t.e(sharedPreferences, "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (!FacebookSdk.hasCustomTabsPrefetching || CustomTabUtils.getChromePackage() == null) {
            return;
        }
        androidx.browser.customtabs.c.a(FacebookSdk.getApplicationContext(), "com.android.chrome", new CustomTabPrefetchHelper());
        androidx.browser.customtabs.c.b(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationContext().getPackageName());
    }

    public static final LoginResult computeLoginResult(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        return Companion.computeLoginResult(request, accessToken, authenticationToken);
    }

    public static /* synthetic */ FacebookLoginActivityResultContract createLogInActivityResultContract$default(LoginManager loginManager, CallbackManager callbackManager, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogInActivityResultContract");
        }
        if ((i10 & 1) != 0) {
            callbackManager = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return loginManager.createLogInActivityResultContract(callbackManager, str);
    }

    private final LoginClient.Request createLoginRequestFromResponse(GraphResponse graphResponse) {
        Set<String> permissions;
        AccessToken accessToken = graphResponse.getRequest().getAccessToken();
        return createLoginRequest((accessToken == null || (permissions = accessToken.getPermissions()) == null) ? null : b0.L(permissions));
    }

    private final void finishLogin(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z10, FacebookCallback<LoginResult> facebookCallback) {
        if (accessToken != null) {
            AccessToken.Companion.setCurrentAccessToken(accessToken);
            Profile.Companion.fetchProfileForCurrentAccessToken();
        }
        if (authenticationToken != null) {
            AuthenticationToken.Companion.setCurrentAuthenticationToken(authenticationToken);
        }
        if (facebookCallback != null) {
            LoginResult loginResultComputeLoginResult = (accessToken == null || request == null) ? null : Companion.computeLoginResult(request, accessToken, authenticationToken);
            if (z10 || (loginResultComputeLoginResult != null && loginResultComputeLoginResult.getRecentlyGrantedPermissions().isEmpty())) {
                facebookCallback.onCancel();
                return;
            }
            if (facebookException != null) {
                facebookCallback.onError(facebookException);
            } else {
                if (accessToken == null || loginResultComputeLoginResult == null) {
                    return;
                }
                setExpressLoginStatus(true);
                facebookCallback.onSuccess(loginResultComputeLoginResult);
            }
        }
    }

    public static final Map<String, String> getExtraDataFromIntent(Intent intent) {
        return Companion.getExtraDataFromIntent(intent);
    }

    public static LoginManager getInstance() {
        return Companion.getInstance();
    }

    private final boolean isExpressLoginAllowed() {
        return this.sharedPreferences.getBoolean(EXPRESS_LOGIN_ALLOWED, true);
    }

    public static final boolean isPublishPermission(String str) {
        return Companion.isPublishPermission(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logCompleteLogin(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z10, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null) {
            return;
        }
        if (request == null) {
            LoginLogger.logUnexpectedError$default(logger, LoginLogger.EVENT_NAME_LOGIN_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(LoginLogger.EVENT_EXTRAS_TRY_LOGIN_ACTIVITY, z10 ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        map2.put(LoginLogger.EVENT_EXTRAS_FROM_SSO, "false");
        logger.logCompleteLogin(request.getAuthId(), map2, code, map, exc, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_COMPLETE : LoginLogger.EVENT_NAME_LOGIN_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStartLogin(Context context, LoginClient.Request request) {
        LoginLogger logger = LoginLoggerHolder.INSTANCE.getLogger(context);
        if (logger == null || request == null) {
            return;
        }
        logger.logStartLogin(request, request.isFamilyLogin() ? LoginLogger.EVENT_NAME_FOA_LOGIN_START : LoginLogger.EVENT_NAME_LOGIN_START);
    }

    private final void loginWithConfiguration(FragmentWrapper fragmentWrapper, LoginConfiguration loginConfiguration) {
        logIn(fragmentWrapper, loginConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onActivityResult$default(LoginManager loginManager, int i10, Intent intent, FacebookCallback facebookCallback, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            facebookCallback = null;
        }
        return loginManager.onActivityResult(i10, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallback$lambda$0(LoginManager this$0, FacebookCallback facebookCallback, int i10, Intent intent) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        return this$0.onActivityResult(i10, intent, facebookCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resolveIntent(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void retrieveLoginStatusImpl(Context context, final LoginStatusCallback loginStatusCallback, long j10) {
        final String applicationId = FacebookSdk.getApplicationId();
        String redirectURI = FacebookSdk.getRedirectURI();
        final String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
        final LoginLogger loginLogger = new LoginLogger(context == null ? FacebookSdk.getApplicationContext() : context, applicationId);
        if (!isExpressLoginAllowed()) {
            loginLogger.logLoginStatusFailure(string);
            loginStatusCallback.onFailure();
            return;
        }
        if (redirectURI == null) {
            loginLogger.logLoginStatusFailure(string);
            loginStatusCallback.onFailure();
            return;
        }
        LoginStatusClient loginStatusClientNewInstance$facebook_common_release = LoginStatusClient.Companion.newInstance$facebook_common_release(context, applicationId, redirectURI, string, FacebookSdk.getGraphApiVersion(), j10, null);
        loginStatusClientNewInstance$facebook_common_release.setCompletedListener(new PlatformServiceClient.CompletedListener() { // from class: com.facebook.login.s
            @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
            public final void completed(Bundle bundle) {
                LoginManager.retrieveLoginStatusImpl$lambda$4(string, loginLogger, loginStatusCallback, applicationId, bundle);
            }
        });
        loginLogger.logLoginStatusStart(string);
        if (loginStatusClientNewInstance$facebook_common_release.start()) {
            return;
        }
        loginLogger.logLoginStatusFailure(string);
        loginStatusCallback.onFailure();
    }

    private final void setExpressLoginStatus(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean(EXPRESS_LOGIN_ALLOWED, z10);
        editorEdit.apply();
    }

    private final void startLogin(StartActivityDelegate startActivityDelegate, LoginClient.Request request) throws FacebookException {
        logStartLogin(startActivityDelegate.getActivityContext(), request);
        Utility.logd(TAG, "auth_logger_id: " + request.getAuthId());
        CallbackManagerImpl.Companion.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.t
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i10, Intent intent) {
                return LoginManager.startLogin$lambda$3(this.f11156a, i10, intent);
            }
        });
        if (tryFacebookActivity(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        logCompleteLogin(startActivityDelegate.getActivityContext(), LoginClient.Result.Code.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean startLogin$lambda$3(LoginManager this$0, int i10, Intent intent) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        return onActivityResult$default(this$0, i10, intent, null, 4, null);
    }

    public static /* synthetic */ void startLoginWithForceConfirmation$facebook_common_release$default(LoginManager loginManager, Activity activity, Collection collection, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoginWithForceConfirmation");
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        loginManager.startLoginWithForceConfirmation$facebook_common_release(activity, collection, str, str2);
    }

    private final boolean tryFacebookActivity(StartActivityDelegate startActivityDelegate, LoginClient.Request request) {
        Intent facebookActivityIntent = getFacebookActivityIntent(request);
        if (!resolveIntent(facebookActivityIntent)) {
            return false;
        }
        try {
            startActivityDelegate.startActivityForResult(facebookActivityIntent, LoginClient.Companion.getLoginRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void validateReadPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (Companion.isPublishPermission(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract() {
        return createLogInActivityResultContract$default(this, null, null, 3, null);
    }

    protected LoginClient.Request createLoginRequest(Collection<String> collection) {
        LoginBehavior loginBehavior = this.loginBehavior;
        Set setT0 = collection != null ? b0.t0(collection) : null;
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(loginBehavior, setT0, defaultAudience, str, applicationId, string, this.loginTargetApp, null, null, null, null, FacebookSdk.getRedirectURI().toString(), FacebookSdk.getIntentUriPackageTarget(), 1920, null);
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        FBLoginSSOLauncher.Companion companion = FBLoginSSOLauncher.Companion;
        String pendingSsoContext = companion.getPendingSsoContext();
        if (pendingSsoContext != null) {
            request.setAndroidSsoContext(pendingSsoContext);
            companion.setPendingSsoContext$facebook_common_release(null);
        }
        return request;
    }

    protected LoginClient.Request createLoginRequestWithConfig(LoginConfiguration loginConfig) {
        String codeVerifier;
        kotlin.jvm.internal.t.f(loginConfig, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            codeVerifier = PKCEUtil.generateCodeChallenge(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        LoginBehavior loginBehavior = this.loginBehavior;
        Set setT0 = b0.t0(loginConfig.getPermissions());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
        LoginTargetApp loginTargetApp = this.loginTargetApp;
        String nonce = loginConfig.getNonce();
        String codeVerifier2 = loginConfig.getCodeVerifier();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, setT0, defaultAudience, str, applicationId, string, loginTargetApp, nonce, codeVerifier2, codeVerifier, codeChallengeMethod, FacebookSdk.getRedirectURI(), FacebookSdk.getIntentUriPackageTarget());
        request.setRerequest(AccessToken.Companion.isCurrentAccessTokenActive());
        request.setMessengerPageId(this.messengerPageId);
        request.setResetMessengerState(this.resetMessengerState);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        FBLoginSSOLauncher.Companion companion = FBLoginSSOLauncher.Companion;
        String pendingSsoContext = companion.getPendingSsoContext();
        if (pendingSsoContext != null) {
            request.setAndroidSsoContext(pendingSsoContext);
            companion.setPendingSsoContext$facebook_common_release(null);
        }
        return request;
    }

    protected LoginClient.Request createReauthorizeRequest() {
        String applicationId = FacebookSdk.getApplicationId();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(LoginBehavior.DIALOG_ONLY, new HashSet(), this.defaultAudience, "reauthorize", applicationId, string, this.loginTargetApp, null, null, null, null, FacebookSdk.getRedirectURI().toString(), FacebookSdk.getIntentUriPackageTarget(), 1920, null);
        request.setFamilyLogin(this.isFamilyLogin);
        request.setShouldSkipAccountDeduplication(this.shouldSkipAccountDeduplication);
        return request;
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.defaultAudience;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.loginBehavior;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.loginTargetApp;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.shouldSkipAccountDeduplication;
    }

    public final boolean isFamilyLogin() {
        return this.isFamilyLogin;
    }

    public final void logIn(Fragment fragment, Collection<String> collection) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void logInWithConfiguration(Fragment fragment, LoginConfiguration loginConfig) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(loginConfig, "loginConfig");
        loginWithConfiguration(new FragmentWrapper(fragment), loginConfig);
    }

    public final void logInWithPublishPermissions(Fragment fragment, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), permissions);
    }

    public final void logInWithReadPermissions(Fragment fragment, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), permissions);
    }

    public void logOut() {
        AccessToken.Companion.setCurrentAccessToken(null);
        AuthenticationToken.Companion.setCurrentAuthenticationToken(null);
        Profile.Companion.setCurrentProfile(null);
        setExpressLoginStatus(false);
    }

    public final boolean onActivityResult(int i10, Intent intent) {
        return onActivityResult$default(this, i10, intent, null, 4, null);
    }

    public final void reauthorizeDataAccess(Activity activity) {
        kotlin.jvm.internal.t.f(activity, "activity");
        startLogin(new ActivityStartActivityDelegate(activity), createReauthorizeRequest());
    }

    public final void registerCallback(CallbackManager callbackManager, final FacebookCallback<LoginResult> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new CallbackManagerImpl.Callback() { // from class: com.facebook.login.q
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i10, Intent intent) {
                return LoginManager.registerCallback$lambda$0(this.f11150a, facebookCallback, i10, intent);
            }
        });
    }

    public final void resolveError(Activity activity, GraphResponse response) {
        kotlin.jvm.internal.t.f(activity, "activity");
        kotlin.jvm.internal.t.f(response, "response");
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(response));
    }

    public final void retrieveLoginStatus(Context context, LoginStatusCallback responseCallback) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(responseCallback, "responseCallback");
        retrieveLoginStatus(context, 5000L, responseCallback);
    }

    public final LoginManager setAuthType(String authType) {
        kotlin.jvm.internal.t.f(authType, "authType");
        this.authType = authType;
        return this;
    }

    public final LoginManager setDefaultAudience(DefaultAudience defaultAudience) {
        kotlin.jvm.internal.t.f(defaultAudience, "defaultAudience");
        this.defaultAudience = defaultAudience;
        return this;
    }

    public final LoginManager setFamilyLogin(boolean z10) {
        this.isFamilyLogin = z10;
        return this;
    }

    public final LoginManager setLoginBehavior(LoginBehavior loginBehavior) {
        kotlin.jvm.internal.t.f(loginBehavior, "loginBehavior");
        this.loginBehavior = loginBehavior;
        return this;
    }

    public final LoginManager setLoginTargetApp(LoginTargetApp targetApp) {
        kotlin.jvm.internal.t.f(targetApp, "targetApp");
        this.loginTargetApp = targetApp;
        return this;
    }

    public final LoginManager setMessengerPageId(String str) {
        this.messengerPageId = str;
        return this;
    }

    public final LoginManager setResetMessengerState(boolean z10) {
        this.resetMessengerState = z10;
        return this;
    }

    public final LoginManager setShouldSkipAccountDeduplication(boolean z10) {
        this.shouldSkipAccountDeduplication = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startLoginWithForceConfirmation$facebook_common_release(Activity activity, Collection<String> permissions, String str, String str2) {
        kotlin.jvm.internal.t.f(activity, "activity");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, 0 == true ? 1 : 0));
        requestCreateLoginRequestWithConfig.setForceConfirmation(true);
        if (str != null) {
            requestCreateLoginRequestWithConfig.setAndroidSsoContext(str);
        }
        if (str2 != null) {
            requestCreateLoginRequestWithConfig.setAuthId(str2);
        }
        startLogin(new ActivityStartActivityDelegate(activity), requestCreateLoginRequestWithConfig);
    }

    public final void unregisterCallback(CallbackManager callbackManager) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).unregisterCallback(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retrieveLoginStatusImpl$lambda$4(String str, LoginLogger logger, LoginStatusCallback responseCallback, String applicationId, Bundle bundle) {
        kotlin.jvm.internal.t.f(str, cNMUz.LXVfxFgQXZDzI);
        kotlin.jvm.internal.t.f(logger, "$logger");
        kotlin.jvm.internal.t.f(responseCallback, "$responseCallback");
        kotlin.jvm.internal.t.f(applicationId, "$applicationId");
        if (bundle == null) {
            logger.logLoginStatusFailure(str);
            responseCallback.onFailure();
            return;
        }
        String string = bundle.getString(NativeProtocol.STATUS_ERROR_TYPE);
        String string2 = bundle.getString(NativeProtocol.STATUS_ERROR_DESCRIPTION);
        if (string != null) {
            Companion.handleLoginStatusError(string, string2, str, logger, responseCallback);
            return;
        }
        String string3 = bundle.getString(NativeProtocol.EXTRA_ACCESS_TOKEN);
        Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_EXPIRES_SECONDS_SINCE_EPOCH, new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeProtocol.EXTRA_PERMISSIONS);
        String string4 = bundle.getString(NativeProtocol.RESULT_ARGS_SIGNED_REQUEST);
        String string5 = bundle.getString("graph_domain");
        Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, NativeProtocol.EXTRA_DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
        String userIDFromSignedRequest = !(string4 == null || string4.length() == 0) ? LoginMethodHandler.Companion.getUserIDFromSignedRequest(string4) : null;
        if (!(string3 == null || string3.length() == 0)) {
            if (!(stringArrayList == null || stringArrayList.isEmpty())) {
                if (!(userIDFromSignedRequest == null || userIDFromSignedRequest.length() == 0)) {
                    AccessToken accessToken = new AccessToken(string3, applicationId, userIDFromSignedRequest, stringArrayList, null, null, null, bundleLongAsDate, null, bundleLongAsDate2, string5);
                    AccessToken.Companion.setCurrentAccessToken(accessToken);
                    Profile.Companion.fetchProfileForCurrentAccessToken();
                    logger.logLoginStatusSuccess(str);
                    responseCallback.onCompleted(accessToken);
                    return;
                }
            }
        }
        logger.logLoginStatusFailure(str);
        responseCallback.onFailure();
    }

    private final void validatePublishPermissions(Collection<String> collection) {
        if (collection == null) {
            return;
        }
        for (String str : collection) {
            if (!Companion.isPublishPermission(str)) {
                throw new FacebookException(EFLCCdIRcb.qkuNIM + str + ") to a request for publish authorization");
            }
        }
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager) {
        return createLogInActivityResultContract$default(this, callbackManager, null, 2, null);
    }

    protected Intent getFacebookActivityIntent(LoginClient.Request request) {
        String str = wcAlQCOdREZdI.BTgCLfaNvPqIR;
        kotlin.jvm.internal.t.f(request, str);
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(str, request);
        intent.putExtra(LoginFragment.REQUEST_KEY, bundle);
        return intent;
    }

    public final void logIn(Fragment fragment, Collection<String> collection, String str) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    public final void logInWithPublishPermissions(Fragment fragment, CallbackManager callbackManager, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity != null) {
            logInWithPublishPermissions(activity, callbackManager, permissions);
            return;
        }
        throw new FacebookException("Cannot obtain activity context on the fragment " + fragment);
    }

    public final void logInWithReadPermissions(Fragment fragment, CallbackManager callbackManager, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity != null) {
            logInWithReadPermissions(activity, callbackManager, permissions);
            return;
        }
        throw new FacebookException("Cannot obtain activity context on the fragment " + fragment);
    }

    public final void loginWithConfiguration(Activity activity, LoginConfiguration loginConfig) {
        kotlin.jvm.internal.t.f(activity, "activity");
        kotlin.jvm.internal.t.f(loginConfig, "loginConfig");
        logIn(activity, loginConfig);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    public boolean onActivityResult(int i10, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        LoginClient.Result.Code code;
        boolean z10;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        boolean z11 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra(LoginFragment.RESULT_KEY);
            if (result != null) {
                request = result.request;
                LoginClient.Result.Code code3 = result.code;
                if (i10 != -1) {
                    z11 = i10 == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z10 = z11;
                authenticationToken = authenticationToken2;
                code = code3;
            } else {
                code = code2;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
                z10 = false;
            }
        } else if (i10 == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z10 = true;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
        } else {
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z10 = false;
        }
        if (facebookException == null && accessToken == null && !z10) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        LoginClient.Request request2 = request;
        logCompleteLogin(null, code, map, facebookException2, true, request2);
        finishLogin(accessToken, authenticationToken, request2, facebookException2, z10, facebookCallback);
        return true;
    }

    public final void resolveError(Fragment fragment, GraphResponse response) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(response, "response");
        resolveError(new FragmentWrapper(fragment), response);
    }

    public final void retrieveLoginStatus(Context context, long j10, LoginStatusCallback responseCallback) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(responseCallback, "responseCallback");
        retrieveLoginStatusImpl(context, responseCallback, j10);
    }

    public final FacebookLoginActivityResultContract createLogInActivityResultContract(CallbackManager callbackManager, String str) {
        return new FacebookLoginActivityResultContract(callbackManager, str);
    }

    public final void logIn(android.app.Fragment fragment, Collection<String> collection) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection);
    }

    public final void reauthorizeDataAccess(Fragment fragment) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        reauthorizeDataAccess(new FragmentWrapper(fragment));
    }

    public final void resolveError(Fragment fragment, CallbackManager callbackManager, GraphResponse response) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(response, "response");
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity != null) {
            resolveError(activity, callbackManager, response);
            return;
        }
        throw new FacebookException("Cannot obtain activity context on the fragment " + fragment);
    }

    private final void reauthorizeDataAccess(FragmentWrapper fragmentWrapper) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createReauthorizeRequest());
    }

    public final void logIn(android.app.Fragment fragment, Collection<String> collection, String str) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        logIn(new FragmentWrapper(fragment), collection, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(FragmentWrapper fragment, Collection<String> collection) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        logIn(fragment, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void logInWithPublishPermissions(android.app.Fragment fragment, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        logInWithPublishPermissions(new FragmentWrapper(fragment), permissions);
    }

    public final void logInWithReadPermissions(android.app.Fragment fragment, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        logInWithReadPermissions(new FragmentWrapper(fragment), permissions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logInWithPublishPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validatePublishPermissions(collection);
        loginWithConfiguration(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logInWithReadPermissions(FragmentWrapper fragmentWrapper, Collection<String> collection) {
        validateReadPermissions(collection);
        logIn(fragmentWrapper, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    public final void resolveError(android.app.Fragment fragment, GraphResponse response) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(response, "response");
        resolveError(new FragmentWrapper(fragment), response);
    }

    private final void resolveError(FragmentWrapper fragmentWrapper, GraphResponse graphResponse) {
        startLogin(new FragmentStartActivityDelegate(fragmentWrapper), createLoginRequestFromResponse(graphResponse));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(FragmentWrapper fragment, Collection<String> collection, String str) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            requestCreateLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new FragmentStartActivityDelegate(fragment), requestCreateLoginRequestWithConfig);
    }

    public final void resolveError(androidx.activity.result.c activityResultRegistryOwner, CallbackManager callbackManager, GraphResponse response) {
        kotlin.jvm.internal.t.f(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(response, "response");
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), createLoginRequestFromResponse(response));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithPublishPermissions(Activity activity, Collection<String> collection) {
        kotlin.jvm.internal.t.f(activity, "activity");
        validatePublishPermissions(collection);
        loginWithConfiguration(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithReadPermissions(Activity activity, Collection<String> collection) {
        kotlin.jvm.internal.t.f(activity, "activity");
        validateReadPermissions(collection);
        logIn(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(Activity activity, Collection<String> collection) {
        kotlin.jvm.internal.t.f(activity, "activity");
        logIn(activity, new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithPublishPermissions(androidx.activity.result.c activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        validatePublishPermissions(permissions);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions, null, 2, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logInWithReadPermissions(androidx.activity.result.c activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        validateReadPermissions(permissions);
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions, null, 2, 0 == true ? 1 : 0));
    }

    public final void logIn(FragmentWrapper fragment, LoginConfiguration loginConfig) {
        kotlin.jvm.internal.t.f(fragment, "fragment");
        kotlin.jvm.internal.t.f(loginConfig, "loginConfig");
        startLogin(new FragmentStartActivityDelegate(fragment), createLoginRequestWithConfig(loginConfig));
    }

    public final void logIn(Activity activity, LoginConfiguration loginConfig) {
        kotlin.jvm.internal.t.f(activity, "activity");
        kotlin.jvm.internal.t.f(loginConfig, "loginConfig");
        if (activity instanceof androidx.activity.result.c) {
            Log.w(TAG, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestWithConfig(loginConfig));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(Activity activity, Collection<String> collection, String str) {
        kotlin.jvm.internal.t.f(activity, "activity");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(collection, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            requestCreateLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new ActivityStartActivityDelegate(activity), requestCreateLoginRequestWithConfig);
    }

    private final void logIn(androidx.activity.result.c cVar, CallbackManager callbackManager, LoginConfiguration loginConfiguration) {
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(cVar, callbackManager), createLoginRequestWithConfig(loginConfiguration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(androidx.activity.result.c activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions, String str) {
        kotlin.jvm.internal.t.f(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        LoginClient.Request requestCreateLoginRequestWithConfig = createLoginRequestWithConfig(new LoginConfiguration(permissions, null, 2, 0 == true ? 1 : 0));
        if (str != null) {
            requestCreateLoginRequestWithConfig.setAuthId(str);
        }
        startLogin(new AndroidxActivityResultRegistryOwnerStartActivityDelegate(activityResultRegistryOwner, callbackManager), requestCreateLoginRequestWithConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void logIn(androidx.activity.result.c activityResultRegistryOwner, CallbackManager callbackManager, Collection<String> permissions) {
        kotlin.jvm.internal.t.f(activityResultRegistryOwner, "activityResultRegistryOwner");
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(permissions, "permissions");
        logIn(activityResultRegistryOwner, callbackManager, new LoginConfiguration(permissions, null, 2, 0 == true ? 1 : 0));
    }
}
