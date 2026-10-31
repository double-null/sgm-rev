package com.applovin.mediation.unity;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Looper;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    static Activity getCurrentActivity() {
        return UnityPlayer.currentActivity;
    }

    protected static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable unused) {
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runSafelyOnUiThread$0(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    static void runSafelyOnUiThread(Activity activity, final Runnable runnable) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.unity.m0
            @Override // java.lang.Runnable
            public final void run() {
                Utils.lambda$runSafelyOnUiThread$0(runnable);
            }
        });
    }
}
