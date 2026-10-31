package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzut implements zzvh {
    private final zzgub zza;
    private final zzgub zzb;
    private boolean zzc;

    public zzut(final int i10) {
        zzgub zzgubVar = new zzgub() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzuu.zzw(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgub zzgubVar2 = new zzgub() { // from class: com.google.android.gms.internal.ads.zzur
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzuu.zzw(i10, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgubVar;
        this.zzb = zzgubVar2;
        this.zzc = true;
    }

    public final void zza(boolean z10) {
        this.zzc = true;
    }

    public final zzuu zzb(zzvg zzvgVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zzvk zzwhVar;
        int i10;
        zzvm zzvmVar = zzvgVar.zza;
        String str = zzvmVar.zza;
        zzuu zzuuVar = null;
        try {
            StringBuilder sb2 = new StringBuilder(str.length() + 12);
            sb2.append("createCodec:");
            sb2.append(str);
            Trace.beginSection(sb2.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzc && Build.VERSION.SDK_INT >= 36) {
                    zzwhVar = new zzwh(mediaCodecCreateByCodecName);
                    i10 = 4;
                } else {
                    zzwhVar = new zzux(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza());
                    i10 = 0;
                }
                zzvk zzvkVar = zzwhVar;
                int i11 = i10;
                zzuu zzuuVar2 = new zzuu(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), zzvkVar, zzvgVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzvgVar.zzd;
                    if (surface == null && zzvmVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i11 |= 8;
                    }
                    zzuuVar2.zzt(zzvgVar.zzb, surface, null, i11);
                    return zzuuVar2;
                } catch (Exception e10) {
                    e = e10;
                    zzuuVar = zzuuVar2;
                    if (zzuuVar != null) {
                        zzuuVar.zzl();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvh
    public final /* bridge */ /* synthetic */ zzvj zzc(zzvg zzvgVar) throws IOException {
        throw null;
    }
}
