package com.prime31;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.k;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.share.Sharer;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.AppInviteDialog;
import com.facebook.share.widget.GameRequestDialog;
import com.facebook.share.widget.ShareDialog;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.a;
import sc.NfwM.XDucgbzInpQa;
import zb.ZTs.GEmOVMyH;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookPlugin extends FacebookPluginBase {
    private static String _appLaunchUrl = "";
    CallbackManager _callbackManager;
    AppEventsLogger _logger;
    private LoginBehavior _loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

    public static void onCreate(Bundle bundle) {
        FacebookSdk.addLoggingBehavior(LoggingBehavior.REQUESTS);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS);
        FacebookSdk.addLoggingBehavior(LoggingBehavior.DEVELOPER_ERRORS);
        FacebookPluginBase.instance();
        Log.i("Prime31", "calling through to sdkInitialize now");
        FacebookSdk.sdkInitialize(FacebookPluginBase.getActivity().getApplicationContext());
        Log.i("Prime31", "sdkInitialize complete");
        FacebookPluginBase.instance()._callbackManager = CallbackManager.Factory.create();
        FacebookPluginBase.instance()._logger = AppEventsLogger.newLogger(FacebookPluginBase.getActivity());
        LoginManager.getInstance().registerCallback(FacebookPluginBase.instance()._callbackManager, new FacebookCallback<LoginResult>() { // from class: com.prime31.FacebookPlugin.1
            @Override // com.facebook.FacebookCallback
            public void onError(FacebookException facebookException) {
                Log.i("Prime31", "onError: " + facebookException);
                FacebookPluginBase.instance().UnitySendMessage("loginFailed", facebookException.getMessage());
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                Log.i(edUJlCZxhVnO.HZKiymDnM, "onCancel");
                FacebookPluginBase.instance().UnitySendMessage("loginFailed", "canceled");
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                Log.i("Prime31", "onSuccess: " + loginResult);
                FacebookPluginBase.instance().UnitySendMessage("sessionOpened", loginResult.getAccessToken().getToken());
            }
        });
        Uri data = FacebookPluginBase.getActivity().getIntent().getData();
        if (data != null) {
            Log.i("Prime31", "incoming deep link from Facebook: " + data);
            _appLaunchUrl = data.toString();
        }
        Uri uriB = a.b(FacebookPluginBase.getActivity(), FacebookPluginBase.getActivity().getIntent());
        if (uriB != null) {
            Log.i("Prime31", "AppLinks found this launch URL: " + uriB.toString());
        }
    }

    public static void onResume() {
        try {
            if (FacebookPluginBase.getActivity() != null) {
                AppEventsLogger.activateApp(FacebookPluginBase.getActivity().getApplication());
                Log.i("Prime31", "AppEventsLogger activated");
            }
        } catch (Exception e10) {
            Log.e("Prime31", "AppEventsLogger failed: " + e10);
        }
    }

    private void printKeyHash() {
        try {
            for (Signature signature : FacebookPluginBase.getActivity().getPackageManager().getPackageInfo(FacebookPluginBase.getActivity().getApplicationContext().getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                Log.d("Prime31", "your keyhash for this specific apk is: " + Base64.encodeToString(messageDigest.digest(), 0));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | Exception unused) {
        }
    }

    public String getAccessToken() {
        return AccessToken.getCurrentAccessToken() != null ? AccessToken.getCurrentAccessToken().getToken() : "";
    }

    public String getAppLaunchUrl() {
        return _appLaunchUrl;
    }

    public String getSessionPermissions() {
        if (AccessToken.getCurrentAccessToken() == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = AccessToken.getCurrentAccessToken().getPermissions().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray.toString();
        } catch (Exception e10) {
            Log.i("Prime31", "error creating JSON from permissions: " + e10.getMessage());
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    public void graphRequest(final String str, final String str2, String str3) {
        final Bundle bundleBundleFromJSON = bundleFromJSON(str3);
        runSafelyOnUiThread(new Runnable() { // from class: com.prime31.FacebookPlugin.7
            @Override // java.lang.Runnable
            public void run() {
                GraphRequest graphRequest = new GraphRequest(AccessToken.getCurrentAccessToken(), str, bundleBundleFromJSON, HttpMethod.valueOf(str2.toUpperCase()));
                graphRequest.setCallback(new GraphRequest.Callback() { // from class: com.prime31.FacebookPlugin.7.1
                    @Override // com.facebook.GraphRequest.Callback
                    public void onCompleted(GraphResponse graphResponse) {
                        if (graphResponse.getError() != null) {
                            FacebookPlugin.this.UnitySendMessage(XDucgbzInpQa.bPdmXYycikBBqo, graphResponse.getError().getErrorMessage());
                        } else if (graphResponse.getJSONObject() != null) {
                            FacebookPlugin.this.UnitySendMessage("graphRequestCompleted", graphResponse.getJSONObject().toString());
                        } else if (graphResponse.getJSONArray() != null) {
                            FacebookPlugin.this.UnitySendMessage("graphRequestCompleted", graphResponse.getJSONArray().toString());
                        }
                    }
                });
                graphRequest.executeAsync();
            }
        });
    }

    public void init(boolean z10) {
        if (z10) {
            printKeyHash();
        }
    }

    public boolean isSessionValid() {
        return AccessToken.getCurrentAccessToken() != null;
    }

    public void logEvent(String str) {
        AppEventsLogger appEventsLogger = this._logger;
        if (appEventsLogger == null) {
            Log.w("Prime31", "null logger. Most likely this means a session is not currently active.");
        } else {
            appEventsLogger.logEvent(str);
        }
    }

    public void logEventAndValueToSumWithParameters(String str, double d10, String str2) {
        AppEventsLogger appEventsLogger = this._logger;
        if (appEventsLogger == null) {
            Log.w("Prime31", "null logger. Most likely this means a session is not currently active.");
        } else {
            appEventsLogger.logEvent(str, d10, bundleFromJSON(str2));
        }
    }

    public void logEventWithParameters(String str, String str2) {
        AppEventsLogger appEventsLogger = this._logger;
        if (appEventsLogger == null) {
            Log.w("Prime31", "null logger. Most likely this means a session is not currently active.");
        } else {
            appEventsLogger.logEvent(str, bundleFromJSON(str2));
        }
    }

    public void logPurchaseEvent(double d10, String str) {
        AppEventsLogger appEventsLogger = this._logger;
        if (appEventsLogger == null) {
            Log.w("Prime31", "null logger. Most likely this means a session is not currently active.");
        } else {
            appEventsLogger.logPurchase(BigDecimal.valueOf(d10), Currency.getInstance(str));
        }
    }

    public void loginWithPublishPermissions(final String[] strArr) {
        runSafelyOnUiThread(new Runnable() { // from class: com.prime31.FacebookPlugin.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(strArr.length);
                int i10 = 0;
                while (true) {
                    String[] strArr2 = strArr;
                    if (i10 >= strArr2.length) {
                        Log.i("Prime31", "logging in with Activity: " + FacebookPluginBase.getActivity());
                        Log.i("Prime31", "LifecycleRegistry.class: " + k.class);
                        LoginManager.getInstance().logInWithPublishPermissions(FacebookPluginBase.getActivity(), arrayList);
                        return;
                    }
                    arrayList.add(strArr2[i10].toString());
                    i10++;
                }
            }
        });
    }

    public void loginWithReadPermissions(final String[] strArr) {
        runSafelyOnUiThread(new Runnable() { // from class: com.prime31.FacebookPlugin.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(strArr.length);
                int i10 = 0;
                while (true) {
                    String[] strArr2 = strArr;
                    if (i10 >= strArr2.length) {
                        LoginManager.getInstance().logInWithReadPermissions(FacebookPluginBase.getActivity(), arrayList);
                        return;
                    } else {
                        arrayList.add(strArr2[i10].toString());
                        i10++;
                    }
                }
            }
        });
    }

    public void logout() {
        if (AccessToken.getCurrentAccessToken() != null) {
            Log.i("Prime31", "logging out user: " + AccessToken.getCurrentAccessToken().getUserId());
            LoginManager.getInstance().logOut();
        }
    }

    public void restRequest(String str, String str2, String str3) {
        Log.e("Prime31", "Facebook REST requests are no longer supported by Facebook since the Graph API 2.1 was released");
    }

    public void setAppVersion(String str) {
        Log.w("Prime31", "setting the app version is no longer in the Facebook SDK. The data in your AndroidManifest.xml will be used by the SDK.");
    }

    public void setSessionLoginBehavior(String str) {
        if (str.equals("SSO_ONLY")) {
            this._loginBehavior = LoginBehavior.NATIVE_ONLY;
        } else if (str.equals("SSO_WITH_FALLBACK")) {
            this._loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        } else if (str.equals("SUPPRESS_SSO")) {
            this._loginBehavior = LoginBehavior.WEB_ONLY;
        }
        LoginManager.getInstance().setLoginBehavior(this._loginBehavior);
    }

    public void showAppInviteDialog(final String str, final String str2) {
        runSafelyOnUiThread(new Runnable() { // from class: com.prime31.FacebookPlugin.5
            @Override // java.lang.Runnable
            public void run() {
                if (str == null) {
                    Log.e("Prime31", "aborting sending the AppInviteDialog. The appLinkUrl parameter is missing and it is required.");
                    return;
                }
                AppInviteContent appInviteContentBuild = new AppInviteContent.Builder().setApplinkUrl(str).setPreviewImageUrl(str2).build();
                AppInviteDialog appInviteDialog = new AppInviteDialog(FacebookPluginBase.getActivity());
                appInviteDialog.registerCallback(FacebookPlugin.this._callbackManager, new FacebookCallback<AppInviteDialog.Result>() { // from class: com.prime31.FacebookPlugin.5.1
                    @Override // com.facebook.FacebookCallback
                    public void onCancel() {
                        FacebookPlugin.this.UnitySendMessage("shareDialogFailed", "canceled");
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onError(FacebookException facebookException) {
                        Log.i("Prime31", "app invite dialog: onError: " + facebookException);
                        FacebookPlugin.this.UnitySendMessage("shareDialogFailed", facebookException.getMessage());
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onSuccess(AppInviteDialog.Result result) {
                        Log.i("Prime31", "app invite dialog: onSuccess: " + result);
                        FacebookPlugin facebookPlugin = FacebookPlugin.this;
                        facebookPlugin.UnitySendMessage("shareDialogSucceeded", facebookPlugin.bundleToJSON(result.getData()));
                    }
                });
                if (appInviteDialog.canShow(appInviteContentBuild)) {
                    appInviteDialog.show(appInviteContentBuild);
                } else {
                    Log.e("Prime31", "cannot show AppInviteDialog. Facebook's canShow method returned false");
                }
            }
        });
    }

    public void showFacebookShareDialog(final String str) {
        runSafelyOnUiThread(new Runnable() { // from class: com.prime31.FacebookPlugin.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                String string;
                String string2;
                String string3;
                String string4 = null;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    string3 = jSONObject.has("contentURL") ? jSONObject.getString("contentURL") : null;
                    try {
                        string2 = jSONObject.has("title") ? jSONObject.getString("title") : null;
                        try {
                            string = jSONObject.has("description") ? jSONObject.getString("description") : null;
                            try {
                                if (jSONObject.has("imageURL")) {
                                    string4 = jSONObject.getString("imageURL");
                                }
                            } catch (Exception e10) {
                                e = e10;
                                Log.i("Prime31", "error parsing out dialog parameters: " + e);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            string = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        string = null;
                        string2 = null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    string = null;
                    string2 = null;
                    string3 = null;
                }
                ShareDialog shareDialog = new ShareDialog(FacebookPluginBase.getActivity());
                shareDialog.registerCallback(FacebookPlugin.this._callbackManager, new FacebookCallback<Sharer.Result>() { // from class: com.prime31.FacebookPlugin.4.1
                    @Override // com.facebook.FacebookCallback
                    public void onCancel() {
                        FacebookPlugin.this.UnitySendMessage("shareDialogFailed", "canceled");
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onError(FacebookException facebookException) {
                        Log.i("Prime31", "share dialog: onError: " + facebookException);
                        FacebookPlugin.this.UnitySendMessage("shareDialogFailed", facebookException.getMessage());
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onSuccess(Sharer.Result result) {
                        Bundle bundle = new Bundle();
                        bundle.putString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID, result.getPostId());
                        FacebookPlugin facebookPlugin = FacebookPlugin.this;
                        facebookPlugin.UnitySendMessage("shareDialogSucceeded", facebookPlugin.bundleToJSON(bundle));
                        Log.i("Prime31", "shareDialog onSuccess. postId: " + result.getPostId());
                        Log.i("Prime31", "---------------------- bundle: " + FacebookPlugin.this.bundleToJSON(bundle));
                    }
                });
                if (!ShareDialog.canShow((Class<? extends ShareContent<?, ?>>) ShareLinkContent.class)) {
                    Log.i("Prime31", "Cannot present native share dialog. aborting.");
                    return;
                }
                ShareLinkContent.Builder builder = new ShareLinkContent.Builder();
                if (string2 != null) {
                    builder.setContentTitle(string2);
                }
                if (string != null) {
                    builder.setContentDescription(string);
                }
                if (string4 != null) {
                    builder.setImageUrl(Uri.parse(string4));
                }
                if (string3 != null) {
                    builder.setContentUrl(Uri.parse(string3));
                }
                shareDialog.show(builder.build());
            }
        });
    }

    public void showGameRequestDialog(final String str) {
        runSafelyOnUiThread(new Runnable() { // from class: com.prime31.FacebookPlugin.6
            /* JADX WARN: Code duplicated, block: B:105:0x019b  */
            /* JADX WARN: Code duplicated, block: B:106:0x019f  */
            /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:86:0x0139  */
            /* JADX WARN: Instruction removed from duplicated block: B:86:0x0139, please report this as an issue */
            @Override // java.lang.Runnable
            public void run() {
                String string;
                String string2;
                String str2;
                String str3;
                String string3;
                String str4;
                GameRequestContent.Builder title;
                GameRequestContent gameRequestContentBuild;
                GameRequestDialog gameRequestDialog;
                byte b10;
                GameRequestContent.ActionType actionType = GameRequestContent.ActionType.SEND;
                Boolean bool = Boolean.FALSE;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    string3 = jSONObject.has("title") ? jSONObject.getString("title") : null;
                    try {
                        string2 = jSONObject.has("message") ? jSONObject.getString("message") : null;
                        try {
                            string = jSONObject.has("objectId") ? jSONObject.getString("objectId") : null;
                            try {
                                String string4 = jSONObject.has("data") ? jSONObject.getString("data") : null;
                                try {
                                    try {
                                        if (!jSONObject.has(SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE) || jSONObject.getString(SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE).length() <= 0) {
                                            str3 = string4;
                                        } else {
                                            String string5 = jSONObject.getString(SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE);
                                            int iHashCode = string5.hashCode();
                                            str3 = string4;
                                            if (iHashCode != 2573224) {
                                                if (iHashCode != 2618525) {
                                                    if (iHashCode == 1970358192 && string5.equals("AskFor")) {
                                                        b10 = 1;
                                                    } else {
                                                        b10 = -1;
                                                    }
                                                } else if (string5.equals("Turn")) {
                                                    b10 = 2;
                                                } else {
                                                    b10 = -1;
                                                }
                                            } else if (string5.equals("Send")) {
                                                b10 = 0;
                                            } else {
                                                b10 = -1;
                                            }
                                            if (b10 == 0) {
                                                bool = Boolean.TRUE;
                                            } else if (b10 == 1) {
                                                bool = Boolean.TRUE;
                                                actionType = GameRequestContent.ActionType.ASKFOR;
                                            } else if (b10 == 2) {
                                                bool = Boolean.TRUE;
                                                actionType = GameRequestContent.ActionType.TURN;
                                            }
                                        }
                                        if (jSONObject.has("recipients")) {
                                            JSONArray jSONArray = jSONObject.getJSONArray("recipients");
                                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                                arrayList.add(jSONArray.getString(i10));
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        if (jSONObject.has("recipientSuggestions")) {
                                            JSONArray jSONArray2 = jSONObject.getJSONArray("recipientSuggestions");
                                            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                                arrayList2.add(jSONArray2.getString(i11));
                                            }
                                        } else {
                                            arrayList2 = null;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        str2 = string3;
                                        Log.i("Prime31", "error parsing out dialog parameters: " + e);
                                        string3 = str2;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    str3 = string4;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str2 = string3;
                                str3 = null;
                                Log.i("Prime31", "error parsing out dialog parameters: " + e);
                                string3 = str2;
                                str4 = str3;
                                title = new GameRequestContent.Builder().setMessage(string2).setTitle(string3);
                                if (bool.booleanValue()) {
                                    Log.i("Prime31", "Setting actionType on GameRequestContent: " + actionType);
                                    title.setActionType(actionType);
                                }
                                if (str4 != null) {
                                    title.setData(str4);
                                }
                                if (string != null) {
                                    title.setObjectId(string);
                                }
                                if (arrayList2 != null) {
                                    title.setSuggestions(arrayList2);
                                }
                                if (arrayList != null) {
                                    title.setRecipients(arrayList);
                                }
                                gameRequestContentBuild = title.build();
                                gameRequestDialog = new GameRequestDialog(FacebookPluginBase.getActivity());
                                gameRequestDialog.registerCallback(FacebookPlugin.this._callbackManager, new FacebookCallback<GameRequestDialog.Result>() { // from class: com.prime31.FacebookPlugin.6.1
                                    @Override // com.facebook.FacebookCallback
                                    public void onCancel() {
                                        FacebookPlugin.this.UnitySendMessage("gameDialogFailed", "canceled");
                                    }

                                    @Override // com.facebook.FacebookCallback
                                    public void onError(FacebookException facebookException) {
                                        Log.i("Prime31", "game request dialog: onError: " + facebookException);
                                        FacebookPlugin.this.UnitySendMessage("gameDialogFailed", facebookException.getMessage());
                                    }

                                    @Override // com.facebook.FacebookCallback
                                    public void onSuccess(GameRequestDialog.Result result) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("request", result.getRequestId());
                                        bundle.putStringArray("to", (String[]) result.getRequestRecipients().toArray());
                                        Log.i("Prime31", "game request dialog: onSuccess: " + result);
                                        FacebookPlugin facebookPlugin = FacebookPlugin.this;
                                        facebookPlugin.UnitySendMessage("gameDialogSucceeded", facebookPlugin.bundleToJSON(bundle));
                                    }
                                });
                                if (gameRequestDialog.canShow(gameRequestContentBuild)) {
                                    gameRequestDialog.show(gameRequestContentBuild);
                                } else {
                                    Log.e("Prime31", "cannot show GameRequestDialog. Facebook's canShow method returned false");
                                }
                            }
                        } catch (Exception e13) {
                            e = e13;
                            str2 = string3;
                            string = null;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        str2 = string3;
                        string = null;
                        string2 = null;
                    }
                } catch (Exception e15) {
                    e = e15;
                    string = null;
                    string2 = null;
                    str2 = null;
                }
                str4 = str3;
                title = new GameRequestContent.Builder().setMessage(string2).setTitle(string3);
                if (bool.booleanValue()) {
                    Log.i("Prime31", "Setting actionType on GameRequestContent: " + actionType);
                    title.setActionType(actionType);
                }
                if (str4 != null && str4.length() > 0) {
                    title.setData(str4);
                }
                if (string != null && string.length() > 0) {
                    title.setObjectId(string);
                }
                if (arrayList2 != null && arrayList2.size() > 0) {
                    title.setSuggestions(arrayList2);
                }
                if (arrayList != null && arrayList.size() > 0) {
                    title.setRecipients(arrayList);
                }
                gameRequestContentBuild = title.build();
                gameRequestDialog = new GameRequestDialog(FacebookPluginBase.getActivity());
                gameRequestDialog.registerCallback(FacebookPlugin.this._callbackManager, new FacebookCallback<GameRequestDialog.Result>() { // from class: com.prime31.FacebookPlugin.6.1
                    @Override // com.facebook.FacebookCallback
                    public void onCancel() {
                        FacebookPlugin.this.UnitySendMessage("gameDialogFailed", "canceled");
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onError(FacebookException facebookException) {
                        Log.i("Prime31", "game request dialog: onError: " + facebookException);
                        FacebookPlugin.this.UnitySendMessage("gameDialogFailed", facebookException.getMessage());
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onSuccess(GameRequestDialog.Result result) {
                        Bundle bundle = new Bundle();
                        bundle.putString("request", result.getRequestId());
                        bundle.putStringArray("to", (String[]) result.getRequestRecipients().toArray());
                        Log.i("Prime31", "game request dialog: onSuccess: " + result);
                        FacebookPlugin facebookPlugin = FacebookPlugin.this;
                        facebookPlugin.UnitySendMessage("gameDialogSucceeded", facebookPlugin.bundleToJSON(bundle));
                    }
                });
                if (gameRequestDialog.canShow(gameRequestContentBuild)) {
                    gameRequestDialog.show(gameRequestContentBuild);
                } else {
                    Log.e("Prime31", "cannot show GameRequestDialog. Facebook's canShow method returned false");
                }
            }
        });
    }

    public static void onActivityResult(int i10, int i11, Intent intent) {
        Log.i("Prime31", "onActivityResult called. Data incoming...");
        Log.i("Prime31", "-- responseCode: " + i11);
        Log.i("Prime31", "-- requestCode: " + i11);
        if (intent.getExtras() != null) {
            Log.i("Prime31", "-- bundle: " + FacebookPluginBase.instance().bundleToJSON(intent.getExtras()));
        } else {
            Log.i("Prime31", zKUlck.irNZJYVKOQQseXy);
        }
        FacebookPluginBase.instance()._callbackManager.onActivityResult(i10, i11, intent);
    }

    public void logEventAndValueToSum(String str, double d10) {
        AppEventsLogger appEventsLogger = this._logger;
        if (appEventsLogger == null) {
            Log.w("Prime31", yhXxbqGRMeI.OsaTijGtcmz);
        } else {
            appEventsLogger.logEvent(str, d10);
        }
    }

    public void setDefaultAudience(String str) {
        DefaultAudience defaultAudience = DefaultAudience.NONE;
        if (!str.equals("None")) {
            if (str.equals(GEmOVMyH.jlPBjtbqfmynGAk)) {
                defaultAudience = DefaultAudience.ONLY_ME;
            } else if (str.equals("Friends")) {
                defaultAudience = DefaultAudience.FRIENDS;
            } else if (str.equals("Everyone")) {
                defaultAudience = DefaultAudience.EVERYONE;
            }
        }
        LoginManager.getInstance().setDefaultAudience(defaultAudience);
    }

    public static void onNewIntent(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            Log.i("Prime31", WKirgUEJJ.MZDBzHGHXdPPU + data);
            _appLaunchUrl = data.toString();
        }
    }
}
