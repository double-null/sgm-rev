package com.unity3d.player;

import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2400u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f12982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f12983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12984c;

    RunnableC2400u0(UnityPlayer unityPlayer, int i10, int i11) {
        this.f12984c = unityPlayer;
        this.f12982a = i10;
        this.f12983b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        S s10 = this.f12984c.mSoftInput;
        if (s10 != null) {
            int i11 = this.f12982a;
            int i12 = this.f12983b;
            EditText editText = s10.f12797c;
            if (editText == null || editText.getText().length() < (i10 = i12 + i11)) {
                return;
            }
            s10.f12797c.setSelection(i11, i10);
        }
    }
}
