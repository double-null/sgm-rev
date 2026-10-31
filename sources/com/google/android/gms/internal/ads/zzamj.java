package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzamj {
    public final boolean zza;
    public final String zzb;
    public final zzahj zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzamj(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        byte b10 = 0;
        int i13 = 1;
        zzgtj.zza((i10 == 0) ^ (bArr2 == null));
        this.zza = z10;
        this.zzb = str;
        this.zzd = i10;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b10 = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0 && b10 != 1) {
                if (b10 == 2 || b10 == 3) {
                    i13 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(str.length() + 68);
                    sb2.append("Unsupported protection scheme type '");
                    sb2.append(str);
                    sb2.append("'. Assuming AES-CTR crypto mode.");
                    zzeg.zzc("TrackEncryptionBox", sb2.toString());
                }
            }
        }
        this.zzc = new zzahj(i13, bArr, i11, i12);
    }
}
