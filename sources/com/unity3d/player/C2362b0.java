package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2362b0 extends EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ S f12871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2364c0 f12872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2362b0(C2364c0 c2364c0, Context context, S s10) {
        super(context);
        this.f12872b = c2364c0;
        this.f12871a = s10;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (keyEvent.getAction() == 1) {
                this.f12872b.f12878h.onBackPressed();
            }
            return true;
        }
        if (i10 == 84) {
            return true;
        }
        if (i10 == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            S s10 = this.f12871a;
            s10.a(s10.b(), false);
            return true;
        }
        if (i10 != 111 || keyEvent.getAction() != 0) {
            return super.onKeyPreIme(i10, keyEvent);
        }
        S s11 = this.f12871a;
        s11.a(s11.b(), true);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            requestFocus();
            this.f12871a.f();
        }
    }
}
