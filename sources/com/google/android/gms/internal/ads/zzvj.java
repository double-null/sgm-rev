package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzvj {
    void zza(int i10, int i11, int i12, long j10, int i13);

    void zzb(int i10, int i11, zzis zzisVar, long j10, int i12);

    void zzc(int i10, boolean z10);

    void zzd(int i10, long j10);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i10);

    default void zzi(Runnable runnable) {
        runnable.run();
    }

    ByteBuffer zzj(int i10);

    void zzk();

    void zzl();

    default boolean zzm(zzvi zzviVar) {
        return false;
    }

    void zzn(Surface surface);

    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i10);

    void zzr(List list);
}
