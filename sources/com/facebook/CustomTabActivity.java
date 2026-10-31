package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* JADX INFO: compiled from: CustomTabActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabActivity extends Activity {
    private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;
    private BroadcastReceiver closeReceiver;
    public static final Companion Companion = new Companion(null);
    public static final String CUSTOM_TAB_REDIRECT_ACTION = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";
    public static final String DESTROY_ACTION = CustomTabActivity.class.getSimpleName() + ".action_destroy";

    /* JADX INFO: compiled from: CustomTabActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
            intent2.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
            n0.a.b(this).d(intent2);
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabActivity$onActivityResult$closeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent3) {
                    kotlin.jvm.internal.t.f(context, "context");
                    kotlin.jvm.internal.t.f(intent3, "intent");
                    this.this$0.finish();
                }
            };
            n0.a.b(this).c(broadcastReceiver, new IntentFilter(DESTROY_ACTION));
            this.closeReceiver = broadcastReceiver;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(CUSTOM_TAB_REDIRECT_ACTION);
        intent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.closeReceiver;
        if (broadcastReceiver != null) {
            n0.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
