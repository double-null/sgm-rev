package com.facebook.unity;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.ArrayList;
import java.util.Arrays;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes3.dex */
public class FBLogin {
    private static void login(String str, FBUnityLoginActivity fBUnityLoginActivity, boolean z10, boolean z11) {
        if (!FacebookSdk.isInitialized()) {
            Log.w(FB.TAG, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        final UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        unityMessage.put("key_hash", FB.getKeyHash());
        UnityParams unityParams = UnityParams.parse(str, "couldn't parse login params: " + str);
        final String string = null;
        ArrayList arrayList = unityParams.hasString("scope").booleanValue() ? new ArrayList(Arrays.asList(unityParams.getString("scope").split(","))) : null;
        if (unityParams.has(Constants.CALLBACK_ID_KEY)) {
            string = unityParams.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        }
        LoginManager.getInstance().registerCallback(fBUnityLoginActivity.getCallbackManager(), new FacebookCallback<LoginResult>() { // from class: com.facebook.unity.FBLogin.1
            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.w(FB.TAG, "Error occurred, ", facebookException);
                unityMessage.sendError(facebookException.getMessage());
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                FBLogin.sendLoginSuccessMessage(loginResult.getAccessToken(), loginResult.getAuthenticationToken(), string);
            }
        });
        LoginManager loginManager = z11 ? LoginManager.getInstance() : LoginManager.getInstance();
        if (z10) {
            loginManager.logInWithPublishPermissions(fBUnityLoginActivity, arrayList);
        } else {
            loginManager.logInWithReadPermissions(fBUnityLoginActivity, arrayList);
        }
    }

    public static void loginForTVWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, true);
    }

    public static void loginForTVWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, true);
    }

    public static void loginWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, false);
    }

    public static void loginWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, false);
    }

    public static void sendLoginSuccessMessage(AccessToken accessToken, AuthenticationToken authenticationToken, String str) {
        UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        addLoginParametersToMessage(unityMessage, accessToken, authenticationToken, str);
        unityMessage.send();
    }

    public static void addLoginParametersToMessage(UnityMessage unityMessage, AccessToken accessToken, AuthenticationToken authenticationToken, String str) {
        unityMessage.put("key_hash", FB.getKeyHash());
        unityMessage.put("opened", Boolean.TRUE);
        unityMessage.put("access_token", accessToken.getToken());
        if (authenticationToken != null) {
            unityMessage.put("auth_token_string", authenticationToken.getToken());
            unityMessage.put(ljglrLUdGZhMhQ.ObcelKfH, authenticationToken.getExpectedNonce());
        }
        unityMessage.put("expiration_timestamp", Long.valueOf(accessToken.getExpires().getTime() / 1000).toString());
        unityMessage.put("user_id", accessToken.getUserId());
        unityMessage.put("permissions", TextUtils.join(",", accessToken.getPermissions()));
        unityMessage.put(zKUlck.Humnvksg, TextUtils.join(",", accessToken.getDeclinedPermissions()));
        unityMessage.put("graph_domain", accessToken.getGraphDomain() != null ? accessToken.getGraphDomain() : AccessToken.DEFAULT_GRAPH_DOMAIN);
        if (accessToken.getLastRefresh() != null) {
            unityMessage.put("last_refresh", Long.valueOf(accessToken.getLastRefresh().getTime() / 1000).toString());
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        unityMessage.put(Constants.CALLBACK_ID_KEY, str);
    }
}
