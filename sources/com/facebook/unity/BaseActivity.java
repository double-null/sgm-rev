package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.CallbackManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseActivity extends Activity {
    public static final String ACTIVITY_PARAMS = "activity_params";
    protected CallbackManager mCallbackManager;

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.mCallbackManager.onActivityResult(i10, i11, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mCallbackManager = CallbackManager.Factory.create();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        if (intent == null) {
            intent = new Intent();
        }
        super.startActivityForResult(intent, i10);
    }
}
