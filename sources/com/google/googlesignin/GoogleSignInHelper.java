package com.google.googlesignin;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleSignInHelper {
    private static final String TAG = "SignInFragment";
    public static boolean loggingEnabled = false;

    public static void configure(Activity activity, boolean z10, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str2, String[] strArr, long j10) {
        logDebug("TokenFragment.configure called");
        TokenRequest tokenRequest = new TokenRequest(z10, str, z11, z12, z13, z14, z15, str2, strArr, j10);
        GoogleSignInFragment googleSignInFragment = GoogleSignInFragment.getInstance(activity);
        if (!tokenRequest.isValid()) {
            nativeOnResult(j10, 10, null);
        } else {
            if (googleSignInFragment.submitRequest(tokenRequest)) {
                return;
            }
            logError("There is already a pending authentication token request!");
        }
    }

    public static void disconnect(Activity activity) {
        GoogleSignInFragment.getInstance(activity).disconnect();
    }

    public static void enableDebugLogging(boolean z10) {
        loggingEnabled = z10;
    }

    public static void logDebug(String str) {
        if (loggingEnabled) {
            Log.d(TAG, str);
        }
    }

    public static void logError(String str) {
        Log.e(TAG, str);
    }

    public static void logInfo(String str) {
        if (loggingEnabled) {
            Log.i(TAG, str);
        }
    }

    public static native void nativeOnResult(long j10, int i10, GoogleSignInAccount googleSignInAccount);

    public static void signIn(Activity activity, long j10) {
        logDebug("AuthHelperFragment.authenticate called!");
        if (GoogleSignInFragment.getInstance(activity).startSignIn()) {
            return;
        }
        nativeOnResult(j10, 10, null);
    }

    public static void signInSilently(Activity activity, long j10) {
        logDebug("AuthHelperFragment.signinSilently called!");
        if (GoogleSignInFragment.getInstance(activity).startSignInSilently()) {
            return;
        }
        nativeOnResult(j10, 10, null);
    }

    public static void signOut(Activity activity) {
        GoogleSignInFragment.getInstance(activity).signOut();
    }
}
