package com.unity3d.player;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2387o extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2389p f12958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f12959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12961d;

    public C2387o(Handler handler, AudioManager audioManager, InterfaceC2389p interfaceC2389p) {
        super(handler);
        this.f12959b = audioManager;
        this.f12960c = 3;
        this.f12958a = interfaceC2389p;
        this.f12961d = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        int streamVolume;
        AudioManager audioManager = this.f12959b;
        if (audioManager == null || this.f12958a == null || (streamVolume = audioManager.getStreamVolume(this.f12960c)) == this.f12961d) {
            return;
        }
        this.f12961d = streamVolume;
        this.f12958a.onAudioVolumeChanged(streamVolume);
    }
}
