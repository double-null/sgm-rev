package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajd implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzajd(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzgtj.zza(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajd.class == obj.getClass()) {
            zzajd zzajdVar = (zzajd) obj;
            if (this.zza == zzajdVar.zza && Objects.equals(this.zzb, zzajdVar.zzb) && Objects.equals(this.zzc, zzajdVar.zzc) && Objects.equals(this.zzd, zzajdVar.zzd) && this.zze == zzajdVar.zze && this.zzf == zzajdVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i11 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        int i10 = this.zza;
        int length3 = String.valueOf(i10).length();
        int i11 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i11).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i10);
        sb2.append(", metadataInterval=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        String str = this.zzc;
        if (str != null) {
            zzamVar.zzu(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzamVar.zzt(str2);
        }
    }
}
