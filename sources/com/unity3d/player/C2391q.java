package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2391q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f12965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2387o f12966c;

    public C2391q(Context context) {
        this.f12964a = context;
        this.f12965b = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.f12966c != null) {
            this.f12964a.getContentResolver().unregisterContentObserver(this.f12966c);
            this.f12966c = null;
        }
    }

    public final void a(InterfaceC2389p interfaceC2389p) {
        this.f12966c = new C2387o(new Handler(Looper.getMainLooper()), this.f12965b, interfaceC2389p);
        this.f12964a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f12966c);
    }
}
