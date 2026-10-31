package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhfx extends zzheu {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhfw zzd;

    /* synthetic */ zzhfx(int i10, int i11, int i12, zzhfw zzhfwVar, byte[] bArr) {
        this.zza = i10;
        this.zzd = zzhfwVar;
    }

    public static zzhfv zzb() {
        return new zzhfv(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfx)) {
            return false;
        }
        zzhfx zzhfxVar = (zzhfx) obj;
        return zzhfxVar.zza == this.zza && zzhfxVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhfx.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(12);
        sb2.append("-byte IV, ");
        sb2.append(16);
        sb2.append("-byte tag, and ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    public final boolean zza() {
        return this.zzd != zzhfw.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhfw zzd() {
        return this.zzd;
    }
}
