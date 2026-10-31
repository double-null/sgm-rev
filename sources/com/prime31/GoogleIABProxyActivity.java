package com.prime31;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleIABProxyActivity extends Activity {
    private static final int RC_REQUEST = 10001;
    private static final String TAG = "Prime31-Proxy";
    private Boolean _created;
    private Boolean _didCompletePurcaseFlow;

    public GoogleIABProxyActivity() {
        Boolean bool = Boolean.FALSE;
        this._created = bool;
        this._didCompletePurcaseFlow = bool;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this._didCompletePurcaseFlow = Boolean.TRUE;
        IABConstants.logEntering(getClass().getSimpleName(), "onActivityResult", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), intent});
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this._created.booleanValue()) {
            Log.i("Prime31", "activity created twice. stopping one instance");
            return;
        }
        this._created = Boolean.TRUE;
        try {
            String string = getIntent().getExtras().getString(AppLovinEventParameters.PRODUCT_IDENTIFIER);
            getIntent().getExtras().getStringArrayList("oldSkus");
            getIntent().getExtras().getString("itemType");
            getIntent().getExtras().getString(SDKConstants.PARAM_DEVELOPER_PAYLOAD);
            Log.i(TAG, "proxy received action. sku: " + string);
            if (getIntent().getExtras().containsKey("extrasBundle")) {
                Log.i(TAG, "Found extrasBundle. Using getBuyIntentExtraParams and billing version 6");
                getIntent().getExtras().getBundle("extrasBundle");
            }
            finish();
        } catch (Exception e10) {
            Log.i(TAG, "unhandled exception while attempting to purchase item: " + e10.getMessage());
            Log.i(TAG, "going to end the async operation with null data to clear out the queue");
            this._didCompletePurcaseFlow = Boolean.TRUE;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "GoogleIABProxyActivity onDestroy");
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (!this._didCompletePurcaseFlow.booleanValue()) {
            Log.d(TAG, EFLCCdIRcb.yKcENyzRwUq);
        }
        Log.d(TAG, "GoogleIABProxyActivity onStop");
    }
}
