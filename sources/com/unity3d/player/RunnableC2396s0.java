package com.unity3d.player;

import android.text.InputFilter;
import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class RunnableC2396s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f12976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ UnityPlayer f12977b;

    RunnableC2396s0(UnityPlayer unityPlayer, int i10) {
        this.f12977b = unityPlayer;
        this.f12976a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S s10 = this.f12977b.mSoftInput;
        if (s10 != null) {
            int i10 = this.f12976a;
            EditText editText = s10.f12797c;
            if (editText != null) {
                if (i10 > 0) {
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
                } else {
                    editText.setFilters(new InputFilter[0]);
                }
            }
        }
    }
}
