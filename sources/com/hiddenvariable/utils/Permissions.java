package com.hiddenvariable.utils;

import android.util.Log;
import androidx.core.app.b;
import androidx.core.content.a;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class Permissions {
    public boolean hasPermission(String str) {
        return a.a(UnityPlayer.currentActivity, str) == 0;
    }

    public void requestPermission(String str, int i10) {
        Log.d("HVS", "Requesting Permission: " + str);
        b.r(UnityPlayer.currentActivity, new String[]{str}, i10);
    }
}
