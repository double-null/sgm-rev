package com.unity3d.player;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public class OrientationLockListener implements InterfaceC2366d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2370f0 f12771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12772b;

    OrientationLockListener(Context context) {
        this.f12772b = context;
        this.f12771a = new C2370f0(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        this.f12771a.a(this);
    }

    public final void a() {
        this.f12771a.a();
        this.f12771a = null;
    }

    public final void b() {
        nativeUpdateOrientationLockState(Settings.System.getInt(this.f12772b.getContentResolver(), "accelerometer_rotation", 0));
    }

    public final native void nativeUpdateOrientationLockState(int i10);
}
