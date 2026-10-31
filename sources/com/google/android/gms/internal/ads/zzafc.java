package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafc {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzafc(List list, int i10, int i11, int i12, int i13) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac A[Catch: ArrayIndexOutOfBoundsException -> 0x01ef, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01ef, blocks: (B:3:0x0004, B:15:0x0040, B:17:0x004b, B:19:0x005c, B:22:0x0068, B:24:0x0095, B:26:0x009b, B:28:0x00b1, B:30:0x00ba, B:32:0x00c2, B:34:0x00d8, B:36:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x0117, B:44:0x011d, B:46:0x0133, B:49:0x013c, B:51:0x0145, B:52:0x0148, B:53:0x014d, B:55:0x0163, B:56:0x0166, B:58:0x016f, B:59:0x0172, B:64:0x017f, B:66:0x0185, B:68:0x018a, B:69:0x018d, B:72:0x0198, B:75:0x019f, B:78:0x01a6, B:80:0x01ac, B:90:0x01cb, B:94:0x01d3, B:96:0x01e4, B:89:0x01c7, B:62:0x0179), top: B:101:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6 A[PHI: r1
      0x01c6: PHI (r1v8 int) = (r1v7 int), (r1v7 int), (r1v12 int) binds: [B:81:0x01b8, B:82:0x01ba, B:87:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    public static zzafc zza(byte[] bArr) throws zzat {
        int i10;
        int i11;
        int i12;
        int iZzc;
        int iZzj;
        int iZzj2;
        try {
            zzes zzesVar = new zzes(bArr, bArr.length);
            int i13 = 1;
            zzesVar.zzo(1);
            int iZzj3 = zzesVar.zzj(3);
            zzesVar.zzh(6);
            boolean zZzi = zzesVar.zzi();
            boolean zZzi2 = zzesVar.zzi();
            int i14 = 12;
            boolean z10 = false;
            if (iZzj3 != 2) {
                if (iZzj3 <= 2) {
                    i10 = -1;
                } else if (true != zZzi) {
                    i10 = 8;
                } else {
                    i10 = 10;
                }
            } else if (!zZzi) {
                zZzi = false;
                iZzj3 = 2;
                if (iZzj3 <= 2) {
                    i10 = -1;
                } else if (true != zZzi) {
                    i10 = 8;
                } else {
                    i10 = 10;
                }
            } else if (true != zZzi2) {
                i10 = 10;
            } else {
                i10 = 12;
            }
            int i15 = 13;
            zzesVar.zzh(13);
            if (zzesVar.zzc() <= 0) {
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            zzesVar.zzg();
            int iZzj4 = zzesVar.zzj(4);
            if (iZzj4 != 1) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 22);
                sb2.append("Unsupported obu_type: ");
                sb2.append(iZzj4);
                zzeg.zzb("Av1Config", sb2.toString());
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported obu_extension_flag");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            boolean zZzi3 = zzesVar.zzi();
            zzesVar.zzg();
            if (zZzi3 && zzesVar.zzj(8) > 127) {
                zzeg.zzb("Av1Config", "Excessive obu_size");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            int iZzj5 = zzesVar.zzj(3);
            zzesVar.zzg();
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported reduced_still_picture_header");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported timing_info_present_flag");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            if (zzesVar.zzi()) {
                zzeg.zzb("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new zzafc(zzgwm.zzj(bArr), i10, -1, -1, -1);
            }
            int iZzj6 = zzesVar.zzj(5);
            int i16 = 0;
            while (i16 <= iZzj6) {
                zzesVar.zzh(i14);
                if (zzesVar.zzj(5) > 7) {
                    zzesVar.zzg();
                }
                i16++;
                i14 = 12;
            }
            int iZzj7 = zzesVar.zzj(4);
            int iZzj8 = zzesVar.zzj(4);
            zzesVar.zzh(iZzj7 + 1);
            zzesVar.zzh(iZzj8 + 1);
            if (zzesVar.zzi()) {
                zzesVar.zzh(7);
            }
            zzesVar.zzh(7);
            boolean zZzi4 = zzesVar.zzi();
            if (zZzi4) {
                zzesVar.zzh(2);
            }
            if (zzesVar.zzi() || zzesVar.zzj(1) > 0) {
                if (!zzesVar.zzi()) {
                    zzesVar.zzh(1);
                }
            }
            if (zZzi4) {
                zzesVar.zzh(3);
            }
            zzesVar.zzh(3);
            boolean zZzi5 = zzesVar.zzi();
            if (iZzj5 != 2) {
                if (iZzj5 == 1) {
                }
                if (zzesVar.zzi()) {
                    int iZzj9 = zzesVar.zzj(8);
                    iZzj = zzesVar.zzj(8);
                    int iZzj10 = zzesVar.zzj(8);
                    if (!z10 || iZzj9 != 1) {
                        i15 = iZzj;
                        iZzj2 = zzesVar.zzj(1);
                    } else if (iZzj != 13) {
                        iZzj9 = 1;
                        i15 = iZzj;
                        iZzj2 = zzesVar.zzj(1);
                    } else if (iZzj10 == 0) {
                        iZzj9 = 1;
                        iZzj2 = 1;
                    } else {
                        iZzj9 = 1;
                        iZzj2 = zzesVar.zzj(1);
                    }
                    int iZzb = zzi.zzb(iZzj9);
                    if (iZzj2 == 1) {
                        i13 = 2;
                    }
                    iZzc = zzi.zzc(i15);
                    i12 = i13;
                    i11 = iZzb;
                } else {
                    i11 = -1;
                    i12 = -1;
                    iZzc = -1;
                }
                return new zzafc(zzgwm.zzj(bArr), i10, i11, i12, iZzc);
            }
            if (zZzi5) {
                zzesVar.zzg();
            }
            if (zzesVar.zzi()) {
                z10 = true;
            }
            if (zzesVar.zzi()) {
                int iZzj11 = zzesVar.zzj(8);
                iZzj = zzesVar.zzj(8);
                int iZzj12 = zzesVar.zzj(8);
                if (!z10) {
                    i15 = iZzj;
                    iZzj2 = zzesVar.zzj(1);
                } else {
                    i15 = iZzj;
                    iZzj2 = zzesVar.zzj(1);
                }
                int iZzb2 = zzi.zzb(iZzj11);
                if (iZzj2 == 1) {
                    i13 = 2;
                }
                iZzc = zzi.zzc(i15);
                i12 = i13;
                i11 = iZzb2;
            } else {
                i11 = -1;
                i12 = -1;
                iZzc = -1;
            }
            return new zzafc(zzgwm.zzj(bArr), i10, i11, i12, iZzc);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing AV1 config", e10);
        }
    }
}
