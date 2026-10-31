package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgv {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final Bundle zze;

    public zzgv(String str, String str2, Bundle bundle, long j10, long j11) {
        this.zza = str;
        this.zzb = str2;
        this.zze = bundle;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzgv zza(zzbh zzbhVar) {
        return new zzgv(zzbhVar.zza, zzbhVar.zzc, zzbhVar.zzb.zzf(), zzbhVar.zzd, zzbhVar.zze);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zze.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }

    public final zzbh zzb() {
        return new zzbh(this.zza, new zzbf(new Bundle(this.zze)), this.zzb, this.zzc, this.zzd);
    }
}
