package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfv implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzfv(String str, byte[] bArr, int i10, int i11) {
        byte b10;
        byte b11;
        boolean z10 = true;
        switch (str) {
            case "com.android.capture.fps":
                b10 = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b10 = 4;
                break;
            case "auxiliary.tracks.length":
                b10 = 2;
                break;
            case "auxiliary.tracks.offset":
                b10 = 1;
                break;
            case "auxiliary.tracks.map":
                b10 = 3;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            if (i11 != 23) {
                z10 = false;
            } else if (bArr.length == 4) {
                i11 = 23;
            } else {
                i11 = 23;
                z10 = false;
            }
            zzgtj.zza(z10);
        } else if (b10 == 1 || b10 == 2) {
            if (i11 != 78) {
                z10 = false;
            } else if (bArr.length == 8) {
                i11 = 78;
            } else {
                i11 = 78;
                z10 = false;
            }
            zzgtj.zza(z10);
        } else if (b10 == 3) {
            zzgtj.zza(i11 == 0);
        } else if (b10 == 4) {
            if (i11 != 75) {
                z10 = false;
            } else if (bArr.length == 1 && ((b11 = bArr[0]) == 0 || b11 == 1)) {
                i11 = 75;
            } else {
                i11 = 75;
                z10 = false;
            }
            zzgtj.zza(z10);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfv.class == obj.getClass()) {
            zzfv zzfvVar = (zzfv) obj;
            if (this.zza.equals(zzfvVar.zza) && Arrays.equals(this.zzb, zzfvVar.zzb) && this.zzc == zzfvVar.zzc && this.zzd == zzfvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    public final String toString() {
        String string;
        int i10 = this.zzd;
        if (i10 != 0) {
            if (i10 == 1) {
                string = zzfl.zzj(this.zzb);
            } else if (i10 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzhah.zzd(this.zzb)));
            } else if (i10 == 67) {
                string = String.valueOf(zzhah.zzd(this.zzb));
            } else if (i10 == 75) {
                string = String.valueOf(w.a(this.zzb[0]));
            } else if (i10 != 78) {
                byte[] bArr = this.zzb;
                String str = zzfl.zza;
                string = zzgzh.zzn().zzi().zzj(bArr, 0, bArr.length);
            } else {
                string = String.valueOf(new zzet(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            zzgtd.zzb(sb2, listZzb, ",");
            string = sb2.toString();
        } else {
            byte[] bArr2 = this.zzb;
            String str2 = zzfl.zza;
            string = zzgzh.zzn().zzi().zzj(bArr2, 0, bArr2.length);
        }
        String str3 = this.zza;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb3.append("mdta: key=");
        sb3.append(str3);
        sb3.append(", value=");
        sb3.append(string);
        return sb3.toString();
    }

    public final List zzb() {
        zzgtj.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2] & 255));
        }
        return arrayList;
    }
}
