package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzqg {
    public static final zzqg zza;
    public final int zzb;
    public final int zzc;
    private final zzgww zzd;

    static {
        zzqg zzqgVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgwv zzgwvVar = new zzgwv();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzgwvVar.zzf(Integer.valueOf(zzfl.zzE(i10)));
            }
            zzqgVar = new zzqg(2, zzgwvVar.zzh());
        } else {
            zzqgVar = new zzqg(2, 10);
        }
        zza = zzqgVar;
    }

    public zzqg(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqg)) {
            return false;
        }
        zzqg zzqgVar = (zzqg) obj;
        return this.zzb == zzqgVar.zzb && this.zzc == zzqgVar.zzc && Objects.equals(this.zzd, zzqgVar.zzd);
    }

    public final int hashCode() {
        zzgww zzgwwVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgwwVar == null ? 0 : zzgwwVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i11).length() + 15 + strValueOf.length() + 1);
        sb2.append("AudioProfile[format=");
        sb2.append(i10);
        sb2.append(", maxChannelCount=");
        sb2.append(i11);
        sb2.append(", channelMasks=");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean zza(int i10) {
        zzgww zzgwwVar = this.zzd;
        if (zzgwwVar == null) {
            return i10 <= this.zzc;
        }
        int iZzE = zzfl.zzE(i10);
        if (iZzE == 0) {
            return false;
        }
        return zzgwwVar.contains(Integer.valueOf(iZzE));
    }

    public final int zzb(int i10, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzqh.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i11 = this.zzb;
        for (int i12 = 10; i12 > 0; i12--) {
            int iZzE = zzfl.zzE(i12);
            if (iZzE != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(iZzE).build(), zzdVar.zza())) {
                return i12;
            }
        }
        return 0;
    }

    public zzqg(int i10, Set set) {
        this.zzb = i10;
        zzgww zzgwwVarZzp = zzgww.zzp(set);
        this.zzd = zzgwwVarZzp;
        zzgza it = zzgwwVarZzp.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
