package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzady extends zzadx implements Choreographer.FrameCallback {
    /* synthetic */ zzady(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
    }

    private static long zzc(DisplayManager displayManager) {
        Display display = displayManager.getDisplay(0);
        if (display != null) {
            return (long) (1.0E9d / ((double) display.getRefreshRate()));
        }
        zzeg.zzc("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.zzc = j10;
        this.zza.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.zza.postFrameCallback(this);
            this.zzd = zzc(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    final void zza() {
        super.zza();
        this.zza.postFrameCallback(this);
        this.zzd = zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zza.removeFrameCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
