package com.facebook.unity;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes3.dex */
public class FBUnityDialogsActivity extends BaseActivity {
    public static final String DIALOG_TYPE = "dialog_type";
    public static final String FEED_DIALOG_PARAMS = "feed_dialog_params";
    public static final String SHARE_DIALOG_PARAMS = "share_dialog_params";
    private static String TAG = "com.facebook.unity.FBUnityDialogsActivity";

    /* JADX INFO: renamed from: com.facebook.unity.FBUnityDialogsActivity$1, reason: invalid class name */
    class AnonymousClass1 implements FacebookCallback<Sharer.Result> {
        final /* synthetic */ UnityMessage val$response;

        AnonymousClass1(UnityMessage unityMessage) {
            this.val$response = unityMessage;
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            this.val$response.putCancelled();
            this.val$response.send();
        }

        @Override // com.facebook.FacebookCallback
        public void onError(FacebookException facebookException) {
            this.val$response.sendError(facebookException.getMessage());
        }

        @Override // com.facebook.FacebookCallback
        public void onSuccess(Sharer.Result result) {
            if (result.getPostId() != null) {
                this.val$response.putID(result.getPostId());
            }
            this.val$response.put("posted", Boolean.TRUE);
            this.val$response.send();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        VMRunner.invoke("p3YiVVdh5oj2ghea", new Object[]{this, bundle});
    }
}
