package com.facebook.unity;

import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.FriendFinderDialog;

/* JADX INFO: loaded from: classes3.dex */
public class FBUnityGamingServicesFriendFinderActivity extends BaseActivity {
    public static final String DIALOG_PARAMS = "dialog_params";
    private static String TAG = "com.facebook.unity.FBUnityGamingServicesFriendFinderActivity";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra(DIALOG_PARAMS);
        final UnityMessage unityMessage = new UnityMessage("OnFriendFinderComplete");
        String string = bundleExtra.getString(Constants.CALLBACK_ID_KEY);
        Log.e(TAG, "callbackID: " + string);
        if (string != null) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        }
        FriendFinderDialog friendFinderDialog = new FriendFinderDialog(this);
        friendFinderDialog.registerCallback(this.mCallbackManager, new FacebookCallback<FriendFinderDialog.Result>() { // from class: com.facebook.unity.FBUnityGamingServicesFriendFinderActivity.1
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
                FBUnityGamingServicesFriendFinderActivity.this.finish();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
                FBUnityGamingServicesFriendFinderActivity.this.finish();
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(FriendFinderDialog.Result result) {
                unityMessage.put(GraphResponse.SUCCESS_KEY, Boolean.TRUE);
                unityMessage.send();
                FBUnityGamingServicesFriendFinderActivity.this.finish();
            }
        });
        friendFinderDialog.show();
    }
}
