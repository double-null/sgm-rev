package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.R;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.dumpsys.EndToEndDumper;
import com.facebook.login.LoginFragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: FacebookActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class FacebookActivity extends androidx.fragment.app.e {
    private static final String FRAGMENT_TAG = "SingleFragment";
    public static final String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
    private Fragment currentFragment;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FacebookActivity.class.getName();

    /* JADX INFO: compiled from: FacebookActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    private final void handlePassThroughError() {
        Intent requestIntent = getIntent();
        kotlin.jvm.internal.t.e(requestIntent, "requestIntent");
        FacebookException exceptionFromErrorData = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(requestIntent));
        Intent intent = getIntent();
        kotlin.jvm.internal.t.e(intent, "intent");
        setResult(0, NativeProtocol.createProtocolResultIntent(intent, null, exceptionFromErrorData));
        finish();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(prefix, "prefix");
            kotlin.jvm.internal.t.f(writer, "writer");
            EndToEndDumper companion = EndToEndDumper.Companion.getInstance();
            boolean z10 = false;
            if (companion != null && companion.maybeDump(prefix, writer, strArr)) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final Fragment getCurrentFragment() {
        return this.currentFragment;
    }

    @Override // androidx.lifecycle.e
    public /* bridge */ /* synthetic */ m0.a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    protected Fragment getFragment() {
        Fragment fragment;
        Intent intent = getIntent();
        androidx.fragment.app.n supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.t.e(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentH0 = supportFragmentManager.h0(FRAGMENT_TAG);
        if (fragmentH0 != null) {
            return fragmentH0;
        }
        if (kotlin.jvm.internal.t.a(FacebookDialogFragment.TAG, intent.getAction())) {
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
            fragment = facebookDialogFragment;
        } else {
            LoginFragment loginFragment = new LoginFragment();
            loginFragment.setRetainInstance(true);
            supportFragmentManager.m().b(R.id.com_facebook_fragment_container, loginFragment, FRAGMENT_TAG).f();
            fragment = loginFragment;
        }
        return fragment;
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.t.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.currentFragment;
        if (fragment != null) {
            fragment.onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.isInitialized()) {
            Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
            FacebookSdk.sdkInitialize(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (kotlin.jvm.internal.t.a(PASS_THROUGH_CANCEL_ACTION, intent.getAction())) {
            handlePassThroughError();
        } else {
            this.currentFragment = getFragment();
        }
    }
}
