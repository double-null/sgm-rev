package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import wc.g0;

/* JADX INFO: compiled from: LoginFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class LoginFragment extends Fragment {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_REQUEST = "request";
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    public static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";
    public static final String RESULT_KEY = "com.facebook.LoginFragment:Result";
    private static final String SAVED_LOGIN_CLIENT = "loginClient";
    private static final String TAG = "LoginFragment";
    private String callingPackage;
    private ActivityResultLauncher<Intent> launcher;
    private LoginClient loginClient;
    private View progressBar;
    private LoginClient.Request request;

    /* JADX INFO: compiled from: LoginFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginFragment$getLoginMethodHandlerCallback$1, reason: invalid class name */
    /* JADX INFO: compiled from: LoginFragment.kt */
    static final class AnonymousClass1 extends kotlin.jvm.internal.u implements id.l<androidx.activity.result.a, g0> {
        final /* synthetic */ androidx.fragment.app.e $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.fragment.app.e eVar) {
            super(1);
            this.$activity = eVar;
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(androidx.activity.result.a aVar) {
            invoke2(aVar);
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.activity.result.a result) {
            kotlin.jvm.internal.t.f(result, "result");
            if (result.b() == -1) {
                LoginFragment.this.getLoginClient().onActivityResult(LoginClient.Companion.getLoginRequestCode(), result.b(), result.a());
            } else {
                this.$activity.finish();
            }
        }
    }

    private final id.l<androidx.activity.result.a, g0> getLoginMethodHandlerCallback(androidx.fragment.app.e eVar) {
        return new AnonymousClass1(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSpinner() {
        View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.t.u("progressBar");
            view = null;
        }
        view.setVisibility(8);
        onSpinnerHidden();
    }

    private final void initializeCallingPackage(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(LoginFragment this$0, LoginClient.Result outcome) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(outcome, "outcome");
        this$0.onLoginClientCompleted(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(id.l tmp0, androidx.activity.result.a aVar) {
        kotlin.jvm.internal.t.f(tmp0, "$tmp0");
        tmp0.invoke(aVar);
    }

    private final void onLoginClientCompleted(LoginClient.Result result) {
        this.request = null;
        int i10 = result.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i10, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSpinner() {
        View view = this.progressBar;
        if (view == null) {
            kotlin.jvm.internal.t.u("progressBar");
            view = null;
        }
        view.setVisibility(0);
        onSpinnerShown();
    }

    protected LoginClient createLoginClient() {
        return new LoginClient(this);
    }

    @Override // androidx.lifecycle.e
    public /* bridge */ /* synthetic */ m0.a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public final ActivityResultLauncher<Intent> getLauncher() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            return activityResultLauncher;
        }
        kotlin.jvm.internal.t.u("launcher");
        return null;
    }

    protected int getLayoutResId() {
        return com.facebook.common.R.layout.com_facebook_login_fragment;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        kotlin.jvm.internal.t.u(SAVED_LOGIN_CLIENT);
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        getLoginClient().onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClientCreateLoginClient = bundle != null ? (LoginClient) bundle.getParcelable(SAVED_LOGIN_CLIENT) : null;
        if (loginClientCreateLoginClient != null) {
            loginClientCreateLoginClient.setFragment(this);
        } else {
            loginClientCreateLoginClient = createLoginClient();
        }
        this.loginClient = loginClientCreateLoginClient;
        getLoginClient().setOnCompletedListener(new LoginClient.OnCompletedListener() { // from class: com.facebook.login.n
            @Override // com.facebook.login.LoginClient.OnCompletedListener
            public final void onCompleted(LoginClient.Result result) {
                LoginFragment.onCreate$lambda$0(this.f11146a, result);
            }
        });
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            return;
        }
        initializeCallingPackage(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(REQUEST_KEY)) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        f.c cVar = new f.c();
        final id.l<androidx.activity.result.a, g0> loginMethodHandlerCallback = getLoginMethodHandlerCallback(activity);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(cVar, new androidx.activity.result.b() { // from class: com.facebook.login.o
            @Override // androidx.activity.result.b
            public final void onActivityResult(Object obj) {
                LoginFragment.onCreate$lambda$1(loginMethodHandlerCallback, (androidx.activity.result.a) obj);
            }
        });
        kotlin.jvm.internal.t.e(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.t.f(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayoutResId(), viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.t.e(viewFindViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.progressBar = viewFindViewById;
        getLoginClient().setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener() { // from class: com.facebook.login.LoginFragment.onCreateView.1
            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStarted() {
                LoginFragment.this.showSpinner();
            }

            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStopped() {
                LoginFragment.this.hideSpinner();
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getLoginClient().cancelCurrentHandler();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            getLoginClient().startOrContinueAuth(this.request);
            return;
        }
        Log.e(TAG, NULL_CALLING_PKG_ERROR_MSG);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.t.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVED_LOGIN_CLIENT, getLoginClient());
    }

    protected void onSpinnerHidden() {
    }

    protected void onSpinnerShown() {
    }
}
