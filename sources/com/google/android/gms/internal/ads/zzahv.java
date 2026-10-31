package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzahv implements zzahq {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzahv(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
    }

    public static zzahv zzb(zzet zzetVar) {
        int iZzC = zzetVar.zzC();
        zzetVar.zzk(12);
        int iZzC2 = zzetVar.zzC();
        int iZzC3 = zzetVar.zzC();
        int iZzC4 = zzetVar.zzC();
        zzetVar.zzk(4);
        int iZzC5 = zzetVar.zzC();
        int iZzC6 = zzetVar.zzC();
        zzetVar.zzk(4);
        return new zzahv(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzetVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i10 = this.zza;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        zzeg.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
        return -1;
    }

    public final long zzd() {
        return zzfl.zzv(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
