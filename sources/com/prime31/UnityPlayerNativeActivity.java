package com.prime31;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import d5.LXP.wcAlQCOdREZdI;

/* JADX INFO: loaded from: classes4.dex */
public class UnityPlayerNativeActivity extends com.unity3d.player.UnityPlayerActivity {
    private ActivityProxyObjectHelper _proxyHelper;

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this._proxyHelper.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this._proxyHelper.invokeZeroParameterMethod("onBackPressed");
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this._proxyHelper.onConfigurationChanged(configuration);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            ActivityProxyObjectHelper activityProxyObjectHelper = new ActivityProxyObjectHelper(this);
            this._proxyHelper = activityProxyObjectHelper;
            activityProxyObjectHelper.onCreate(bundle);
        } catch (Exception e10) {
            Log.i("Prime31", "Failed to create proxyHelper: " + e10.getMessage());
        }
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this._proxyHelper.invokeZeroParameterMethod("onDestroy");
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        this._proxyHelper.onKeyDown(i10, keyEvent);
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this._proxyHelper.onKeyUp(i10, keyEvent);
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this._proxyHelper.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this._proxyHelper.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        this._proxyHelper.invokeZeroParameterMethod("onRestart");
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this._proxyHelper.onRestoreInstanceState(bundle);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this._proxyHelper.invokeZeroParameterMethod("onResume");
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this._proxyHelper.onSaveInstanceState(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this._proxyHelper.invokeZeroParameterMethod("onStart");
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this._proxyHelper.invokeZeroParameterMethod("onStop");
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        this._proxyHelper.onTrimMemory(i10);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this._proxyHelper.onWindowFocusChanged(z10);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this._proxyHelper.invokeZeroParameterMethod(wcAlQCOdREZdI.tNFOLaYmX);
    }
}
