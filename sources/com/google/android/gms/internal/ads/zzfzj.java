package com.google.android.gms.internal.ads;

import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfzj extends zzfzp {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfzj(String str, boolean z10, int i10, zzfzh zzfzhVar, int i11, byte[] bArr) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzp) {
            zzfzp zzfzpVar = (zzfzp) obj;
            if (this.zzb.equals(zzfzpVar.zza())) {
                zzfzpVar.zzb();
                int i10 = this.zzc;
                int iZzd = zzfzpVar.zzd();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZzd) {
                    zzfzpVar.zzc();
                    int i11 = this.zzd;
                    int iZze = zzfzpVar.zze();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zzd != 0) {
            return (i11 * (-721379959)) ^ 1;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final int zze() {
        return this.zzd;
    }

    public final String toString() {
        String str;
        int i10 = this.zzc;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 52 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(XDucgbzInpQa.belYOgKdQglHtzi);
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
