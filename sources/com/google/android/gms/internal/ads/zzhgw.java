package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhgw extends zzheu {
    private final String zza;
    private final zzhgv zzb;

    private zzhgw(String str, zzhgv zzhgvVar) {
        this.zza = str;
        this.zzb = zzhgvVar;
    }

    public static zzhgw zzb(String str, zzhgv zzhgvVar) {
        return new zzhgw(str, zzhgvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgw)) {
            return false;
        }
        zzhgw zzhgwVar = (zzhgw) obj;
        return zzhgwVar.zza.equals(this.zza) && zzhgwVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhgw.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        sb2.append("LegacyKmsAead Parameters (keyUri: ");
        sb2.append(str);
        sb2.append(", variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != zzhgv.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhgv zzd() {
        return this.zzb;
    }
}
