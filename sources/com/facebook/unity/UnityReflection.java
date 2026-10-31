package com.facebook.unity;

import android.app.Activity;
import android.util.Log;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class UnityReflection {
    private static Class<?> unityPlayer;

    public static Activity GetUnityActivity() {
        try {
            if (unityPlayer == null) {
                Activity activity = UnityPlayer.currentActivity;
                unityPlayer = UnityPlayer.class;
            }
            Activity activity2 = (Activity) unityPlayer.getField("currentActivity").get(null);
            if (activity2 == null) {
                Log.d(FB.TAG, "Current unity activity is null");
            }
            return activity2;
        } catch (Exception e10) {
            Log.d(FB.TAG, e10.toString());
            return null;
        }
    }

    public static void SendMessage(String str, String str2, String str3) {
        try {
            if (unityPlayer == null) {
                Activity activity = UnityPlayer.currentActivity;
                unityPlayer = UnityPlayer.class;
            }
            unityPlayer.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(unityPlayer, str, str2, str3);
        } catch (Exception e10) {
            Log.d("TODO", e10.toString());
        }
    }
}
