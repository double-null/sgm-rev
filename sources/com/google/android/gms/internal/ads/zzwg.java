package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwg implements zzvj {
    private final MediaCodec zza;
    private final zzvf zzb;

    /* synthetic */ zzwg(MediaCodec mediaCodec, zzvf zzvfVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzvfVar;
        if (Build.VERSION.SDK_INT < 35 || zzvfVar == null) {
            return;
        }
        zzvfVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zza(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzb(int i10, int i11, zzis zzisVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzisVar.zzb(), j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzc(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final ByteBuffer zzh(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final ByteBuffer zzj(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzl() {
        zzvf zzvfVar;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && this.zzb != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (zzvfVar = this.zzb) != null) {
                zzvfVar.zzc(this.zza);
            }
            this.zza.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}
