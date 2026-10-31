package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginTargetApp;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: CustomTabMainActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {
    private BroadcastReceiver redirectReceiver;
    private boolean shouldCloseCustomTab = true;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ACTION = CustomTabMainActivity.class.getSimpleName() + ".extra_action";
    public static final String EXTRA_PARAMS = CustomTabMainActivity.class.getSimpleName() + ".extra_params";
    public static final String EXTRA_CHROME_PACKAGE = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";
    public static final String EXTRA_URL = CustomTabMainActivity.class.getSimpleName() + ".extra_url";
    public static final String EXTRA_TARGET_APP = CustomTabMainActivity.class.getSimpleName() + ".extra_targetApp";
    public static final String REFRESH_ACTION = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";
    public static final String NO_ACTIVITY_EXCEPTION = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";

    /* JADX INFO: compiled from: CustomTabMainActivity.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle parseResponseUri(String str) {
            Uri uri = Uri.parse(str);
            Bundle urlQueryString = Utility.parseUrlQueryString(uri.getQuery());
            urlQueryString.putAll(Utility.parseUrlQueryString(uri.getFragment()));
            return urlQueryString;
        }
    }

    /* JADX INFO: compiled from: CustomTabMainActivity.kt */
    /* JADX INFO: loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            try {
                iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void sendResult(int i10, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            n0.a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(EXTRA_URL);
            Bundle responseUri = stringExtra != null ? Companion.parseResponseUri(stringExtra) : new Bundle();
            Intent intent2 = getIntent();
            kotlin.jvm.internal.t.e(intent2, "intent");
            Intent intentCreateProtocolResultIntent = NativeProtocol.createProtocolResultIntent(intent2, responseUri, null);
            if (intentCreateProtocolResultIntent != null) {
                intent = intentCreateProtocolResultIntent;
            }
            setResult(i10, intent);
        } else {
            Intent intent3 = getIntent();
            kotlin.jvm.internal.t.e(intent3, "intent");
            setResult(i10, NativeProtocol.createProtocolResultIntent(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("W9h4zcmApSWD0qAu", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        kotlin.jvm.internal.t.f(intent, "intent");
        super.onNewIntent(intent);
        if (kotlin.jvm.internal.t.a(REFRESH_ACTION, intent.getAction())) {
            n0.a.b(this).d(new Intent(CustomTabActivity.DESTROY_ACTION));
            sendResult(-1, intent);
        } else if (kotlin.jvm.internal.t.a(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            sendResult(-1, intent);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            sendResult(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
