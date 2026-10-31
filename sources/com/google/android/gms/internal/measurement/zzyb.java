package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyb extends zzyc {
    private int zzf = 0;
    private final String zzb = "com/google/android/libraries/phenotype/client/Phlogger";
    private final String zzc = "logInternal";
    private final int zzd = 44;
    private final String zze = "Phlogger.java";

    /* synthetic */ zzyb(String str, String str2, int i10, String str3, byte[] bArr) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzyb) {
            zzyb zzybVar = (zzyb) obj;
            if (this.zzc.equals(zzybVar.zzc)) {
                String str = this.zzb;
                String str2 = zzybVar.zzb;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (int i10 = 0; i10 < str.length(); i10++) {
                            char cCharAt = str.charAt(i10);
                            char cCharAt2 = str2.charAt(i10);
                            if (cCharAt == cCharAt2 || ((cCharAt & (-2)) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.zzc.hashCode() + 4867) * 31) + 44;
        this.zzf = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zza() {
        return this.zzb.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final int zzc() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zzd() {
        String str = this.zze;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zze() {
        return this.zze;
    }
}
