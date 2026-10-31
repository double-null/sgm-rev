package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import kotlin.jvm.internal.h0;
import wc.g0;

/* JADX INFO: compiled from: DialogPresenter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogPresenter {
    public static final DialogPresenter INSTANCE = new DialogPresenter();

    /* JADX INFO: compiled from: DialogPresenter.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface ParameterProvider {
        Bundle getLegacyParameters();

        Bundle getParameters();
    }

    private DialogPresenter() {
    }

    public static final boolean canPresentNativeDialogWithFeature(DialogFeature feature) {
        kotlin.jvm.internal.t.f(feature, "feature");
        return getProtocolVersionForNativeDialog(feature).getProtocolVersion() != -1;
    }

    public static final boolean canPresentWebFallbackDialogWithFeature(DialogFeature feature) {
        kotlin.jvm.internal.t.f(feature, "feature");
        return INSTANCE.getDialogWebFallbackUri(feature) != null;
    }

    private final Uri getDialogWebFallbackUri(DialogFeature dialogFeature) {
        String strName = dialogFeature.name();
        String action = dialogFeature.getAction();
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.Companion.getDialogFeatureConfig(FacebookSdk.getApplicationId(), action, strName);
        if (dialogFeatureConfig != null) {
            return dialogFeatureConfig.getFallbackUrl();
        }
        return null;
    }

    public static final NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature feature) {
        kotlin.jvm.internal.t.f(feature, "feature");
        String applicationId = FacebookSdk.getApplicationId();
        String action = feature.getAction();
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(action, INSTANCE.getVersionSpecForFeature(applicationId, action, feature));
    }

    private final int[] getVersionSpecForFeature(String str, String str2, DialogFeature dialogFeature) {
        int[] versionSpec;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.Companion.getDialogFeatureConfig(str, str2, dialogFeature.name());
        return (dialogFeatureConfig == null || (versionSpec = dialogFeatureConfig.getVersionSpec()) == null) ? new int[]{dialogFeature.getMinVersion()} : versionSpec;
    }

    public static final void logDialogActivity(Context context, String eventName, String outcome) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(eventName, "eventName");
        kotlin.jvm.internal.t.f(outcome, "outcome");
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME, outcome);
        internalAppEventsLogger.logEventImplicitly(eventName, bundle);
    }

    public static final void present(AppCall appCall, Activity activity) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        kotlin.jvm.internal.t.f(activity, "activity");
        activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void setupAppCallForCannotShowError(AppCall appCall) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        setupAppCallForValidationError(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    public static final void setupAppCallForCustomTabDialog(AppCall appCall, String str, Bundle bundle) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), CustomTabUtils.getDefaultRedirectURI());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, str);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundle);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), null);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForNativeDialog(AppCall appCall, ParameterProvider parameterProvider, DialogFeature feature) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        kotlin.jvm.internal.t.f(parameterProvider, "parameterProvider");
        kotlin.jvm.internal.t.f(feature, "feature");
        Context applicationContext = FacebookSdk.getApplicationContext();
        String action = feature.getAction();
        NativeProtocol.ProtocolVersionQueryResult protocolVersionForNativeDialog = getProtocolVersionForNativeDialog(feature);
        int protocolVersion = protocolVersionForNativeDialog.getProtocolVersion();
        if (protocolVersion == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters = NativeProtocol.isVersionCompatibleWithBucketedIntent(protocolVersion) ? parameterProvider.getParameters() : parameterProvider.getLegacyParameters();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent intentCreatePlatformActivityIntent = NativeProtocol.createPlatformActivityIntent(applicationContext, appCall.getCallId().toString(), action, protocolVersionForNativeDialog, parameters);
        if (intentCreatePlatformActivityIntent == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.setRequestIntent(intentCreatePlatformActivityIntent);
    }

    public static final void setupAppCallForValidationError(AppCall appCall, FacebookException facebookException) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        setupAppCallForErrorResult(appCall, facebookException);
    }

    public static final void setupAppCallForWebDialog(AppCall appCall, String str, Bundle bundle) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, bundle);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), str, NativeProtocol.getLatestKnownVersion(), bundle2);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    public static final void setupAppCallForWebFallbackDialog(AppCall appCall, Bundle bundle, DialogFeature feature) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        kotlin.jvm.internal.t.f(feature, "feature");
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        String strName = feature.name();
        Uri dialogWebFallbackUri = INSTANCE.getDialogWebFallbackUri(feature);
        if (dialogWebFallbackUri == null) {
            throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + strName + '\'');
        }
        int latestKnownVersion = NativeProtocol.getLatestKnownVersion();
        String string = appCall.getCallId().toString();
        kotlin.jvm.internal.t.e(string, "appCall.callId.toString()");
        Bundle queryParamsForPlatformActivityIntentWebFallback = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(string, latestKnownVersion, bundle);
        if (queryParamsForPlatformActivityIntentWebFallback == null) {
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        Uri uriBuildUri = dialogWebFallbackUri.isRelative() ? Utility.buildUri(ServerProtocol.getDialogAuthority(), dialogWebFallbackUri.toString(), queryParamsForPlatformActivityIntentWebFallback) : Utility.buildUri(dialogWebFallbackUri.getAuthority(), dialogWebFallbackUri.getPath(), queryParamsForPlatformActivityIntentWebFallback);
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", uriBuildUri.toString());
        bundle2.putBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, true);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), feature.getAction(), NativeProtocol.getLatestKnownVersion(), bundle2);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.activity.result.ActivityResultLauncher] */
    public static final void startActivityForResultWithAndroidX(ActivityResultRegistry registry, final CallbackManager callbackManager, Intent intent, final int i10) {
        kotlin.jvm.internal.t.f(registry, "registry");
        kotlin.jvm.internal.t.f(intent, "intent");
        final h0 h0Var = new h0();
        ?? J = registry.j("facebook-dialog-request-" + i10, new f.a<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.internal.DialogPresenter.startActivityForResultWithAndroidX.1
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
        }, new androidx.activity.result.b() { // from class: com.facebook.internal.a
            @Override // androidx.activity.result.b
            public final void onActivityResult(Object obj) {
                DialogPresenter.startActivityForResultWithAndroidX$lambda$2(callbackManager, i10, h0Var, (Pair) obj);
            }
        });
        h0Var.f21514a = J;
        if (J != 0) {
            J.b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void startActivityForResultWithAndroidX$lambda$2(CallbackManager callbackManager, int i10, h0 launcher, Pair pair) {
        kotlin.jvm.internal.t.f(launcher, "$launcher");
        if (callbackManager == null) {
            callbackManager = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        kotlin.jvm.internal.t.e(obj, "result.first");
        callbackManager.onActivityResult(i10, ((Number) obj).intValue(), (Intent) pair.second);
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) launcher.f21514a;
        if (activityResultLauncher != null) {
            synchronized (activityResultLauncher) {
                activityResultLauncher.d();
                launcher.f21514a = null;
                g0 g0Var = g0.f27756a;
            }
        }
    }

    public static final void setupAppCallForErrorResult(AppCall appCall, FacebookException facebookException) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        if (facebookException == null) {
            return;
        }
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(cTJaRZ.ZyTzHFbxd);
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookException));
        appCall.setRequestIntent(intent);
    }

    public static final void present(AppCall appCall, FragmentWrapper fragmentWrapper) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        kotlin.jvm.internal.t.f(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    public static final void present(AppCall appCall, ActivityResultRegistry registry, CallbackManager callbackManager) {
        kotlin.jvm.internal.t.f(appCall, "appCall");
        kotlin.jvm.internal.t.f(registry, "registry");
        Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent == null) {
            return;
        }
        startActivityForResultWithAndroidX(registry, callbackManager, requestIntent, appCall.getRequestCode());
        appCall.setPending();
    }
}
