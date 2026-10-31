package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;

/* JADX INFO: renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2364c0 extends S {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    U f12878h;

    public C2364c0(Context context, UnityPlayer unityPlayer) {
        super(context, unityPlayer);
    }

    @Override // com.unity3d.player.S
    public final void a(String str, int i10, boolean z10, boolean z11, boolean z12, boolean z13, String str2, int i11, boolean z14, boolean z15) {
        U u10 = new U(this.f12795a, this.f12796b);
        this.f12878h = u10;
        u10.a(this, z14, z15);
        this.f12878h.setOnDismissListener(new Y(this));
        super.a(str, i10, z10, z11, z12, z13, str2, i11, z14, z15);
        this.f12796b.getViewTreeObserver().addOnGlobalLayoutListener(new Z(this));
        this.f12797c.requestFocus();
        this.f12878h.setOnCancelListener(new DialogInterfaceOnCancelListenerC2360a0(this));
    }

    @Override // com.unity3d.player.S
    public final void c() {
        this.f12878h.dismiss();
    }

    @Override // com.unity3d.player.S
    protected EditText createEditText(S s10) {
        return new C2362b0(this, this.f12795a, s10);
    }

    @Override // com.unity3d.player.S
    public final void e() {
        this.f12878h.show();
    }

    protected void reportSoftInputArea() {
        if (this.f12878h.isShowing()) {
            this.f12796b.reportSoftInputArea(this.f12878h.a());
        }
    }

    @Override // com.unity3d.player.S
    public final void a(boolean z10) {
        this.f12798d = z10;
        this.f12878h.a(z10);
    }
}
