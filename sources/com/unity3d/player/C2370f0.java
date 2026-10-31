package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2370f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2368e0 f12894b;

    public C2370f0(Context context) {
        this.f12893a = context;
    }

    public final void a() {
        if (this.f12894b != null) {
            this.f12893a.getContentResolver().unregisterContentObserver(this.f12894b);
            this.f12894b = null;
        }
    }

    public final void a(InterfaceC2366d0 interfaceC2366d0) {
        this.f12894b = new C2368e0(new Handler(Looper.getMainLooper()), interfaceC2366d0);
        this.f12893a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, this.f12894b);
    }
}
