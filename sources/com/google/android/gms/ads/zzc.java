package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc {
    public static AdSize zza(int i10, int i11, String str) {
        return new AdSize(i10, i11, str);
    }

    public static AdSize zzb(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.zzd(true);
        adSize.zze(i11);
        return adSize;
    }

    public static AdSize zzc(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.zzh(true);
        adSize.zzj(i11);
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.zzg();
    }

    public static int zze(AdSize adSize) {
        return adSize.zzi();
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zza();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzc();
    }

    public static int zzh(AdSize adSize) {
        return adSize.zzf();
    }

    public static boolean zzi(AdSize adSize) {
        return adSize.zzb();
    }
}
