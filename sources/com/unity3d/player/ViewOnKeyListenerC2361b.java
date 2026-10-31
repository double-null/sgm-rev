package com.unity3d.player;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class ViewOnKeyListenerC2361b implements View.OnKeyListener {
    ViewOnKeyListenerC2361b() {
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return i10 == 4 && keyEvent.getAction() == 1;
    }
}
