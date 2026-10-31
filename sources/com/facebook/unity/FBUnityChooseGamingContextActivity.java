package com.facebook.unity;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.gamingservices.ContextChooseDialog;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes3.dex */
public class FBUnityChooseGamingContextActivity extends BaseActivity {
    private static String TAG = "com.facebook.unity.FBUnityChooseGamingContextActivity";

    /* JADX INFO: renamed from: com.facebook.unity.FBUnityChooseGamingContextActivity$1, reason: invalid class name */
    class AnonymousClass1 implements FacebookCallback<ContextChooseDialog.Result> {
        final /* synthetic */ UnityMessage val$response;

        AnonymousClass1(UnityMessage unityMessage) {
            this.val$response = unityMessage;
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            this.val$response.putCancelled();
            this.val$response.send();
            FBUnityChooseGamingContextActivity.this.finish();
        }

        @Override // com.facebook.FacebookCallback
        public void onError(FacebookException facebookException) {
            this.val$response.sendError(facebookException.getMessage());
            FBUnityChooseGamingContextActivity.this.finish();
        }

        @Override // com.facebook.FacebookCallback
        public void onSuccess(ContextChooseDialog.Result result) {
            this.val$response.put("contextId", result.getContextID());
            this.val$response.send();
            FBUnityChooseGamingContextActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        VMRunner.invoke("Ix7RAg7OpoacRVLv", new Object[]{this, bundle});
    }
}
