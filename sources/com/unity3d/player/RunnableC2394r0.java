package com.unity3d.player;

import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2394r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12974b;

    RunnableC2394r0(UnityPlayer unityPlayer, String str) {
        this.f12974b = unityPlayer;
        this.f12973a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EditText editText;
        S s10 = this.f12974b.mSoftInput;
        if (s10 == null || (str = this.f12973a) == null || (editText = s10.f12797c) == null) {
            return;
        }
        editText.setText(str);
        s10.f12797c.setSelection(str.length());
    }
}
