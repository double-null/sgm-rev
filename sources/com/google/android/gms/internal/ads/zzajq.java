package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajq extends zzajo {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzajq(String str, String str2, String str3) {
        super("----");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajq.class == obj.getClass()) {
            zzajq zzajqVar = (zzajq) obj;
            if (Objects.equals(this.zzb, zzajqVar.zzb) && Objects.equals(this.zza, zzajqVar.zza) && Objects.equals(this.zzc, zzajqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = length + 9 + str2.length();
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length2 + 14 + str3.length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
