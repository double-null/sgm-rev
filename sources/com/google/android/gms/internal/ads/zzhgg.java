package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhgg extends zzheu {
    private final int zza;
    private final zzhgf zzb;

    /* synthetic */ zzhgg(int i10, zzhgf zzhgfVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = zzhgfVar;
    }

    public static zzhge zzb() {
        return new zzhge(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgg)) {
            return false;
        }
        zzhgg zzhggVar = (zzhgg) obj;
        return zzhggVar.zza == this.zza && zzhggVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhgg.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzb != zzhgf.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhgf zzd() {
        return this.zzb;
    }
}
