package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.LoginTargetApp;
import com.facebook.login.R;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: LoginButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public class LoginButton extends FacebookButtonBase {
    private static final int MAX_BUTTON_TRANSPARENCY = 255;
    private static final int MIN_BUTTON_TRANSPARENCY = 0;
    private AccessTokenTracker accessTokenTracker;
    private ActivityResultLauncher<Collection<String>> androidXLoginCaller;
    private CallbackManager callbackManager;
    private boolean confirmLogout;
    private Float customButtonRadius;
    private int customButtonTransparency;
    private final String loggerID;
    private k<? extends LoginManager> loginManagerLazy;
    private String loginText;
    private String logoutText;
    private final LoginButtonProperties properties;
    private boolean toolTipChecked;
    private long toolTipDisplayTime;
    private ToolTipMode toolTipMode;
    private ToolTipPopup toolTipPopup;
    private ToolTipPopup.Style toolTipStyle;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LoginButton.class.getName();

    /* JADX INFO: compiled from: LoginButton.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: LoginButton.kt */
    public static class LoginButtonProperties {
        private String messengerPageId;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        private DefaultAudience defaultAudience = DefaultAudience.FRIENDS;
        private List<String> permissions = t.k();
        private LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        private String authType = ServerProtocol.DIALOG_REREQUEST_AUTH_TYPE;
        private LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

        public final void clearPermissions() {
            this.permissions = t.k();
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

        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        public final List<String> getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        public final void setAuthType(String str) {
            kotlin.jvm.internal.t.f(str, "<set-?>");
            this.authType = str;
        }

        public final void setDefaultAudience(DefaultAudience defaultAudience) {
            kotlin.jvm.internal.t.f(defaultAudience, "<set-?>");
            this.defaultAudience = defaultAudience;
        }

        public final void setLoginBehavior(LoginBehavior loginBehavior) {
            kotlin.jvm.internal.t.f(loginBehavior, "<set-?>");
            this.loginBehavior = loginBehavior;
        }

        public final void setLoginTargetApp(LoginTargetApp loginTargetApp) {
            kotlin.jvm.internal.t.f(loginTargetApp, "<set-?>");
            this.loginTargetApp = loginTargetApp;
        }

        public final void setMessengerPageId(String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(List<String> list) {
            kotlin.jvm.internal.t.f(list, "<set-?>");
            this.permissions = list;
        }

        public final void setResetMessengerState(boolean z10) {
            this.resetMessengerState = z10;
        }

        protected final void setShouldSkipAccountDeduplication(boolean z10) {
            this.shouldSkipAccountDeduplication = z10;
        }
    }

    /* JADX INFO: compiled from: LoginButton.kt */
    protected class LoginClickListener implements View.OnClickListener {
        public LoginClickListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void performLogout$lambda$2(LoginManager loginManager, DialogInterface dialogInterface, int i10) {
            if (CrashShieldHandler.isObjectCrashing(LoginClickListener.class)) {
                return;
            }
            try {
                kotlin.jvm.internal.t.f(loginManager, "$loginManager");
                loginManager.logOut();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, LoginClickListener.class);
            }
        }

        protected LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                LoginManager companion = LoginManager.Companion.getInstance();
                companion.setDefaultAudience(LoginButton.this.getDefaultAudience());
                companion.setLoginBehavior(LoginButton.this.getLoginBehavior());
                companion.setLoginTargetApp(getLoginTargetApp());
                companion.setAuthType(LoginButton.this.getAuthType());
                companion.setFamilyLogin(isFamilyLogin());
                companion.setShouldSkipAccountDeduplication(LoginButton.this.getShouldSkipAccountDeduplication());
                companion.setMessengerPageId(LoginButton.this.getMessengerPageId());
                companion.setResetMessengerState(LoginButton.this.getResetMessengerState());
                return companion;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        protected final LoginTargetApp getLoginTargetApp() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return LoginTargetApp.FACEBOOK;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }

        protected final boolean isFamilyLogin() {
            CrashShieldHandler.isObjectCrashing(this);
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v10) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.t.f(v10, "v");
                    LoginButton.this.callExternalOnClickListener(v10);
                    AccessToken.Companion companion = AccessToken.Companion;
                    AccessToken currentAccessToken = companion.getCurrentAccessToken();
                    boolean zIsCurrentAccessTokenActive = companion.isCurrentAccessTokenActive();
                    if (zIsCurrentAccessTokenActive) {
                        Context context = LoginButton.this.getContext();
                        kotlin.jvm.internal.t.e(context, "context");
                        performLogout(context);
                    } else {
                        performLogin();
                    }
                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(LoginButton.this.getContext());
                    Bundle bundle = new Bundle();
                    bundle.putInt("logging_in", currentAccessToken != null ? 0 : 1);
                    bundle.putInt("access_token_expired", zIsCurrentAccessTokenActive ? 1 : 0);
                    internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_LOGIN_VIEW_USAGE, bundle);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }

        protected final void performLogin() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LoginManager loginManager = getLoginManager();
                ActivityResultLauncher activityResultLauncher = LoginButton.this.androidXLoginCaller;
                if (activityResultLauncher != null) {
                    f.a aVarA = activityResultLauncher.a();
                    kotlin.jvm.internal.t.d(aVarA, "null cannot be cast to non-null type com.facebook.login.LoginManager.FacebookLoginActivityResultContract");
                    LoginManager.FacebookLoginActivityResultContract facebookLoginActivityResultContract = (LoginManager.FacebookLoginActivityResultContract) aVarA;
                    CallbackManager callbackManager = LoginButton.this.getCallbackManager();
                    if (callbackManager == null) {
                        callbackManager = new CallbackManagerImpl();
                    }
                    facebookLoginActivityResultContract.setCallbackManager(callbackManager);
                    activityResultLauncher.b(LoginButton.this.getProperties().getPermissions());
                    return;
                }
                if (LoginButton.this.getFragment() != null) {
                    Fragment fragment = LoginButton.this.getFragment();
                    if (fragment != null) {
                        LoginButton loginButton = LoginButton.this;
                        loginManager.logIn(fragment, loginButton.getProperties().getPermissions(), loginButton.getLoggerID());
                        return;
                    }
                    return;
                }
                if (LoginButton.this.getNativeFragment() == null) {
                    loginManager.logIn(LoginButton.this.getActivity(), LoginButton.this.getProperties().getPermissions(), LoginButton.this.getLoggerID());
                    return;
                }
                android.app.Fragment nativeFragment = LoginButton.this.getNativeFragment();
                if (nativeFragment != null) {
                    LoginButton loginButton2 = LoginButton.this;
                    loginManager.logIn(nativeFragment, loginButton2.getProperties().getPermissions(), loginButton2.getLoggerID());
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }

        protected final void performLogout(Context context) {
            String string;
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.t.f(context, "context");
                final LoginManager loginManager = getLoginManager();
                if (!LoginButton.this.confirmLogout) {
                    loginManager.logOut();
                    return;
                }
                String string2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
                kotlin.jvm.internal.t.e(string2, "resources.getString(R.st…loginview_log_out_action)");
                String string3 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
                kotlin.jvm.internal.t.e(string3, "resources.getString(R.st…_loginview_cancel_action)");
                Profile currentProfile = Profile.Companion.getCurrentProfile();
                if ((currentProfile != null ? currentProfile.getName() : null) != null) {
                    l0 l0Var = l0.f21527a;
                    String string4 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                    kotlin.jvm.internal.t.e(string4, "resources.getString(R.st…k_loginview_logged_in_as)");
                    string = String.format(string4, Arrays.copyOf(new Object[]{currentProfile.getName()}, 1));
                    kotlin.jvm.internal.t.e(string, "format(format, *args)");
                } else {
                    string = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                    kotlin.jvm.internal.t.e(string, "{\n          resources.ge…using_facebook)\n        }");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: com.facebook.login.widget.f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        LoginButton.LoginClickListener.performLogout$lambda$2(loginManager, dialogInterface, i10);
                    }
                }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                builder.create().show();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.facebook.login.widget.LoginButton$ToolTipMode, still in use, count: 1, list:
      (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) from 0x0032: SPUT (r0v0 com.facebook.login.widget.LoginButton$ToolTipMode) (LINE:51) com.facebook.login.widget.LoginButton.ToolTipMode.DEFAULT com.facebook.login.widget.LoginButton$ToolTipMode
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: LoginButton.kt */
    public static final class ToolTipMode {
        AUTOMATIC(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);

        private static final ToolTipMode DEFAULT = new ToolTipMode(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC, 0);
        private final int intValue;
        private final String stringValue;
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: LoginButton.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final ToolTipMode fromInt(int i10) {
                for (ToolTipMode toolTipMode : ToolTipMode.values()) {
                    if (toolTipMode.getIntValue() == i10) {
                        return toolTipMode;
                    }
                }
                return null;
            }

            public final ToolTipMode getDEFAULT() {
                return ToolTipMode.DEFAULT;
            }
        }

        static {
        }

        private ToolTipMode(String str, int i10) {
            super(str, i);
            this.stringValue = str;
            this.intValue = i10;
        }

        public static ToolTipMode valueOf(String str) {
            return (ToolTipMode) Enum.valueOf(ToolTipMode.class, str);
        }

        public static ToolTipMode[] values() {
            return (ToolTipMode[]) $VALUES.clone();
        }

        public final int getIntValue() {
            return this.intValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.stringValue;
        }
    }

    /* JADX INFO: compiled from: LoginButton.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToolTipMode.values().length];
            try {
                iArr[ToolTipMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolTipMode.DISPLAY_ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolTipMode.NEVER_DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected LoginButton(Context context, AttributeSet attributeSet, int i10, int i11, String analyticsButtonCreatedEventName, String analyticsButtonTappedEventName) {
        super(context, attributeSet, i10, i11, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        kotlin.jvm.internal.t.f(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        this.properties = new LoginButtonProperties();
        this.toolTipStyle = ToolTipPopup.Style.BLUE;
        this.toolTipMode = ToolTipMode.Companion.getDEFAULT();
        this.toolTipDisplayTime = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.loginManagerLazy = m.a(LoginButton$loginManagerLazy$1.INSTANCE);
        this.customButtonTransparency = MAX_BUTTON_TRANSPARENCY;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.t.e(string, "randomUUID().toString()");
        this.loggerID = string;
    }

    private final void checkToolTipSettings() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.toolTipMode.ordinal()];
            if (i10 == 1) {
                final String metadataApplicationId = Utility.getMetadataApplicationId(getContext());
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.login.widget.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginButton.checkToolTipSettings$lambda$3(metadataApplicationId, this);
                    }
                });
            } else {
                if (i10 != 2) {
                    return;
                }
                String string = getResources().getString(R.string.com_facebook_tooltip_default);
                kotlin.jvm.internal.t.e(string, "resources.getString(R.st…facebook_tooltip_default)");
                displayToolTip(string);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkToolTipSettings$lambda$3(String appId, final LoginButton this$0) {
        kotlin.jvm.internal.t.f(appId, "$appId");
        kotlin.jvm.internal.t.f(this$0, "this$0");
        final FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(appId, false);
        this$0.getActivity().runOnUiThread(new Runnable() { // from class: com.facebook.login.widget.c
            @Override // java.lang.Runnable
            public final void run() {
                LoginButton.checkToolTipSettings$lambda$3$lambda$2(this.f11162a, fetchedAppSettingsQueryAppSettings);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkToolTipSettings$lambda$3$lambda$2(LoginButton this$0, FetchedAppSettings fetchedAppSettings) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        this$0.showToolTipPerSettings(fetchedAppSettings);
    }

    private final void displayToolTip(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ToolTipPopup toolTipPopup = new ToolTipPopup(str, this);
            toolTipPopup.setStyle(this.toolTipStyle);
            toolTipPopup.setNuxDisplayTime(this.toolTipDisplayTime);
            toolTipPopup.show();
            this.toolTipPopup = toolTipPopup;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final int measureButtonWidth(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + measureTextWidth(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(CallbackManager.ActivityResultParameters activityResultParameters) {
    }

    private final void showToolTipPerSettings(FetchedAppSettings fetchedAppSettings) {
        if (CrashShieldHandler.isObjectCrashing(this) || fetchedAppSettings == null) {
            return;
        }
        try {
            if (fetchedAppSettings.getNuxEnabled() && getVisibility() == 0) {
                displayToolTip(fetchedAppSettings.getNuxContent());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void clearPermissions() {
        this.properties.clearPermissions();
    }

    @Override // com.facebook.FacebookButtonBase
    protected void configureButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(context, "context");
            super.configureButton(context, attributeSet, i10, i11);
            setInternalOnClickListener(getNewLoginClickListener());
            parseLoginButtonAttributes(context, attributeSet, i10, i11);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(com.facebook.common.R.color.com_facebook_blue));
                setLoginText("Continue with Facebook");
            } else {
                this.accessTokenTracker = new AccessTokenTracker() { // from class: com.facebook.login.widget.LoginButton.configureButton.1
                    @Override // com.facebook.AccessTokenTracker
                    protected void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
                        LoginButton.this.setButtonText();
                        LoginButton.this.setButtonIcon();
                    }
                };
            }
            setButtonText();
            setButtonRadius();
            setButtonTransparency();
            setButtonIcon();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void dismissToolTip() {
        ToolTipPopup toolTipPopup = this.toolTipPopup;
        if (toolTipPopup != null) {
            toolTipPopup.dismiss();
        }
        this.toolTipPopup = null;
    }

    public final String getAuthType() {
        return this.properties.getAuthType();
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    public final DefaultAudience getDefaultAudience() {
        return this.properties.getDefaultAudience();
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultStyleResource() {
        return R.style.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.loggerID;
    }

    public final LoginBehavior getLoginBehavior() {
        return this.properties.getLoginBehavior();
    }

    protected final int getLoginButtonContinueLabel() {
        return R.string.com_facebook_loginview_log_in_button_continue;
    }

    protected final int getLoginButtonWidth(int i10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            Resources resources = getResources();
            String string = this.loginText;
            if (string == null) {
                string = resources.getString(R.string.com_facebook_loginview_log_in_button_continue);
                int iMeasureButtonWidth = measureButtonWidth(string);
                if (View.resolveSize(iMeasureButtonWidth, i10) < iMeasureButtonWidth) {
                    string = resources.getString(R.string.com_facebook_loginview_log_in_button);
                }
            }
            return measureButtonWidth(string);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    protected final k<LoginManager> getLoginManagerLazy() {
        return this.loginManagerLazy;
    }

    public final LoginTargetApp getLoginTargetApp() {
        return this.properties.getLoginTargetApp();
    }

    public final String getLoginText() {
        return this.loginText;
    }

    public final String getLogoutText() {
        return this.logoutText;
    }

    public final String getMessengerPageId() {
        return this.properties.getMessengerPageId();
    }

    protected LoginClickListener getNewLoginClickListener() {
        return new LoginClickListener();
    }

    public final List<String> getPermissions() {
        return this.properties.getPermissions();
    }

    protected final LoginButtonProperties getProperties() {
        return this.properties;
    }

    public final boolean getResetMessengerState() {
        return this.properties.getResetMessengerState();
    }

    public final boolean getShouldSkipAccountDeduplication() {
        return this.properties.getShouldSkipAccountDeduplication();
    }

    public final long getToolTipDisplayTime() {
        return this.toolTipDisplayTime;
    }

    public final ToolTipMode getToolTipMode() {
        return this.toolTipMode;
    }

    public final ToolTipPopup.Style getToolTipStyle() {
        return this.toolTipStyle;
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof androidx.activity.result.c) {
                Object context = getContext();
                kotlin.jvm.internal.t.d(context, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                this.androidXLoginCaller = ((androidx.activity.result.c) context).getActivityResultRegistry().j("facebook-login", this.loginManagerLazy.getValue().createLogInActivityResultContract(this.callbackManager, this.loggerID), new androidx.activity.result.b() { // from class: com.facebook.login.widget.d
                    @Override // androidx.activity.result.b
                    public final void onActivityResult(Object obj) {
                        LoginButton.onAttachedToWindow$lambda$0((CallbackManager.ActivityResultParameters) obj);
                    }
                });
            }
            AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker == null || !accessTokenTracker.isTracking()) {
                return;
            }
            accessTokenTracker.startTracking();
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            ActivityResultLauncher<Collection<String>> activityResultLauncher = this.androidXLoginCaller;
            if (activityResultLauncher != null) {
                activityResultLauncher.d();
            }
            AccessTokenTracker accessTokenTracker = this.accessTokenTracker;
            if (accessTokenTracker != null) {
                accessTokenTracker.stopTracking();
            }
            dismissToolTip();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.FacebookButtonBase, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(canvas, "canvas");
            super.onDraw(canvas);
            if (this.toolTipChecked || isInEditMode()) {
                return;
            }
            this.toolTipChecked = true;
            checkToolTipSettings();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onLayout(z10, i10, i11, i12, i13);
            setButtonText();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int loginButtonWidth = getLoginButtonWidth(i10);
            String string = this.logoutText;
            if (string == null) {
                string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                kotlin.jvm.internal.t.e(string, "resources.getString(R.st…loginview_log_out_button)");
            }
            setMeasuredDimension(View.resolveSize(Math.max(loginButtonWidth, measureButtonWidth(string)), i10), compoundPaddingTop);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(changedView, "changedView");
            super.onVisibilityChanged(changedView, i10);
            if (i10 != 0) {
                dismissToolTip();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void parseLoginButtonAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(context, "context");
            ToolTipMode.Companion companion = ToolTipMode.Companion;
            this.toolTipMode = companion.getDEFAULT();
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_login_view, i10, i11);
            kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes, "context\n            .the…efStyleAttr, defStyleRes)");
            try {
                this.confirmLogout = typedArrayObtainStyledAttributes.getBoolean(R.styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(typedArrayObtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(typedArrayObtainStyledAttributes.getString(R.styleable.com_facebook_login_view_com_facebook_logout_text));
                ToolTipMode toolTipModeFromInt = companion.fromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.com_facebook_login_view_com_facebook_tooltip_mode, companion.getDEFAULT().getIntValue()));
                if (toolTipModeFromInt == null) {
                    toolTipModeFromInt = companion.getDEFAULT();
                }
                this.toolTipMode = toolTipModeFromInt;
                int i12 = R.styleable.com_facebook_login_view_com_facebook_login_button_radius;
                if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                    this.customButtonRadius = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.com_facebook_login_view_com_facebook_login_button_transparency, MAX_BUTTON_TRANSPARENCY);
                this.customButtonTransparency = integer;
                int iMax = Math.max(0, integer);
                this.customButtonTransparency = iMax;
                this.customButtonTransparency = Math.min(MAX_BUTTON_TRANSPARENCY, iMax);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void registerCallback(CallbackManager callbackManager, FacebookCallback<LoginResult> callback) {
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(callback, "callback");
        this.loginManagerLazy.getValue().registerCallback(callbackManager, callback);
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public final void setAuthType(String value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.properties.setAuthType(value);
    }

    protected final void setButtonIcon() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(h.a.b(getContext(), com.facebook.common.R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void setButtonRadius() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Float f10 = this.customButtonRadius;
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                    int stateCount = ((StateListDrawable) background).getStateCount();
                    for (int i10 = 0; i10 < stateCount; i10++) {
                        Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i10);
                        GradientDrawable gradientDrawable = stateDrawable instanceof GradientDrawable ? (GradientDrawable) stateDrawable : null;
                        if (gradientDrawable != null) {
                            gradientDrawable.setCornerRadius(fFloatValue);
                        }
                    }
                }
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setCornerRadius(fFloatValue);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void setButtonText() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode() && AccessToken.Companion.isCurrentAccessTokenActive()) {
                String string = this.logoutText;
                if (string == null) {
                    string = resources.getString(R.string.com_facebook_loginview_log_out_button);
                }
                setText(string);
                return;
            }
            String str = this.loginText;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            kotlin.jvm.internal.t.e(string2, "resources.getString(loginButtonContinueLabel)");
            int width = getWidth();
            if (width != 0 && measureButtonWidth(string2) > width) {
                string2 = resources.getString(R.string.com_facebook_loginview_log_in_button);
                kotlin.jvm.internal.t.e(string2, "resources.getString(R.st…_loginview_log_in_button)");
            }
            setText(string2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected final void setButtonTransparency() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            getBackground().setAlpha(this.customButtonTransparency);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setDefaultAudience(DefaultAudience value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.properties.setDefaultAudience(value);
    }

    public final void setLoginBehavior(LoginBehavior value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.properties.setLoginBehavior(value);
    }

    public final void setLoginTargetApp(LoginTargetApp value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.properties.setLoginTargetApp(value);
    }

    public final void setLoginText(String str) {
        this.loginText = str;
        setButtonText();
    }

    public final void setLogoutText(String str) {
        this.logoutText = str;
        setButtonText();
    }

    public final void setMessengerPageId(String str) {
        this.properties.setMessengerPageId(str);
    }

    public final void setPermissions(String... permissions) {
        kotlin.jvm.internal.t.f(permissions, "permissions");
        this.properties.setPermissions(t.o(Arrays.copyOf(permissions, permissions.length)));
    }

    public final void setPublishPermissions(List<String> permissions) {
        kotlin.jvm.internal.t.f(permissions, "permissions");
        this.properties.setPermissions(permissions);
    }

    public final void setReadPermissions(List<String> permissions) {
        kotlin.jvm.internal.t.f(permissions, "permissions");
        this.properties.setPermissions(permissions);
    }

    public final void setResetMessengerState(boolean z10) {
        this.properties.setResetMessengerState(z10);
    }

    public final void setToolTipDisplayTime(long j10) {
        this.toolTipDisplayTime = j10;
    }

    public final void setToolTipMode(ToolTipMode toolTipMode) {
        kotlin.jvm.internal.t.f(toolTipMode, "<set-?>");
        this.toolTipMode = toolTipMode;
    }

    public final void setToolTipStyle(ToolTipPopup.Style style) {
        kotlin.jvm.internal.t.f(style, "<set-?>");
        this.toolTipStyle = style;
    }

    public final void unregisterCallback(CallbackManager callbackManager) {
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        this.loginManagerLazy.getValue().unregisterCallback(callbackManager);
    }

    protected final void setLoginManagerLazy(k<? extends LoginManager> kVar) {
        kotlin.jvm.internal.t.f(kVar, wHzciBnJlYkdX.zENlqXfm);
        this.loginManagerLazy = kVar;
    }

    public final void setPermissions(List<String> value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.properties.setPermissions(value);
    }

    public final void setPublishPermissions(String... permissions) {
        kotlin.jvm.internal.t.f(permissions, "permissions");
        this.properties.setPermissions(t.o(Arrays.copyOf(permissions, permissions.length)));
    }

    public final void setReadPermissions(String... permissions) {
        kotlin.jvm.internal.t.f(permissions, "permissions");
        this.properties.setPermissions(t.o(Arrays.copyOf(permissions, permissions.length)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context) {
        this(context, null, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        kotlin.jvm.internal.t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        kotlin.jvm.internal.t.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginButton(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, AnalyticsEvents.EVENT_LOGIN_BUTTON_CREATE, AnalyticsEvents.EVENT_LOGIN_BUTTON_DID_TAP);
        kotlin.jvm.internal.t.f(context, "context");
    }
}
