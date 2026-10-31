package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzth {
    private final Context zza;
    private Boolean zzb;

    public zzth() {
        this(null);
    }

    public final zzqs zza(zzv zzvVar, zzd zzdVar) {
        int i10;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || (i10 = zzvVar.zzI) == -1) {
            return zzqs.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z10 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzp;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || i11 < zzfl.zzF(iZzg)) {
            return zzqs.zza;
        }
        int iZzE = zzfl.zzE(zzvVar.zzH);
        if (iZzE == 0) {
            return zzqs.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(iZzE).setEncoding(iZzg).build();
            if (i11 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return zzqs.zza;
                }
                z10 = (directPlaybackSupport & 3) == 3;
                zzqr zzqrVar = new zzqr();
                zzqrVar.zza(true);
                zzqrVar.zzb(z10);
                zzqrVar.zzc(zBooleanValue);
                return zzqrVar.zzd();
            }
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                    return zzqs.zza;
                }
                zzqr zzqrVar2 = new zzqr();
                zzqrVar2.zza(true);
                zzqrVar2.zzc(zBooleanValue);
                return zzqrVar2.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzqs.zza;
            }
            zzqr zzqrVar3 = new zzqr();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                z10 = true;
            }
            zzqrVar3.zza(true);
            zzqrVar3.zzb(z10);
            zzqrVar3.zzc(zBooleanValue);
            return zzqrVar3.zzd();
        } catch (IllegalArgumentException unused) {
            return zzqs.zza;
        }
    }

    public zzth(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
