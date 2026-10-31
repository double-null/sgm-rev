package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
final class X extends S {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f12837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f12838j;

    public X(Context context, UnityPlayer unityPlayer) {
        super(context, unityPlayer);
        this.f12836h = false;
    }

    @Override // com.unity3d.player.S
    public final void a(boolean z10) {
        EditText editText;
        int i10;
        this.f12798d = z10;
        if (z10) {
            editText = this.f12797c;
            i10 = 4;
        } else {
            editText = this.f12797c;
            i10 = 0;
        }
        editText.setVisibility(i10);
        this.f12797c.invalidate();
        this.f12797c.requestLayout();
    }

    @Override // com.unity3d.player.S
    public final void c() {
        Runnable runnable;
        Handler handler = this.f12837i;
        if (handler != null && (runnable = this.f12838j) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f12796b.removeView(this.f12797c);
        this.f12836h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.S
    protected EditText createEditText(S s10) {
        return new W(this.f12795a, s10);
    }

    @Override // com.unity3d.player.S
    public final boolean d() {
        return false;
    }

    @Override // com.unity3d.player.S
    public final void e() {
        if (this.f12836h) {
            return;
        }
        this.f12796b.addView(this.f12797c);
        this.f12796b.bringChildToFront(this.f12797c);
        this.f12797c.setVisibility(0);
        this.f12797c.requestFocus();
        this.f12838j = new V(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f12837i = handler;
        handler.postDelayed(this.f12838j, 400L);
        this.f12836h = true;
    }
}
