package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x01f1 A[LOOP:1: B:140:0x01ef->B:141:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0236  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[PHI: r15
      0x00c8: PHI (r15v14 int) = (r15v6 int), (r15v2 int) binds: [B:137:0x01e6, B:42:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    public static zzv zza(zzet zzetVar, String str, String str2, zzq zzqVar) throws zzat {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zZzi;
        int iZzj;
        int iZzj2;
        int iZzc;
        int iZzj3;
        boolean z10;
        int i16;
        int i17;
        int iZzj4;
        int i18;
        zzes zzesVar = new zzes();
        zzesVar.zza(zzetVar);
        int iZzc2 = zzesVar.zzc();
        int iZzj5 = zzesVar.zzj(3);
        if (iZzj5 > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 30);
            sb2.append("Unsupported AC-4 DSI version: ");
            sb2.append(iZzj5);
            throw zzat.zzc(sb2.toString());
        }
        int iZzj6 = zzesVar.zzj(7);
        int i19 = true != zzesVar.zzi() ? 44100 : 48000;
        zzesVar.zzh(4);
        int iZzj7 = zzesVar.zzj(9);
        if (iZzj6 > 1) {
            if (iZzj5 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzesVar.zzi()) {
                zzesVar.zzh(16);
                if (zzesVar.zzi()) {
                    zzesVar.zzh(128);
                }
            }
        }
        if (iZzj5 == 1) {
            if (!zzg(zzesVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzesVar.zzm();
        }
        zzaez zzaezVar = new zzaez(null);
        int i20 = 0;
        while (true) {
            if (i20 < iZzj7) {
                if (iZzj5 == 0) {
                    zZzi = zzesVar.zzi();
                    iZzj = zzesVar.zzj(5);
                    iZzj2 = zzesVar.zzj(5);
                    iZzc = 0;
                    iZzj3 = 0;
                    z10 = false;
                } else {
                    int iZzj8 = zzesVar.zzj(8);
                    iZzj3 = zzesVar.zzj(8);
                    if (iZzj3 == 255) {
                        iZzj3 = zzesVar.zzj(16) + 255;
                    }
                    if (iZzj8 > 2) {
                        zzesVar.zzh(iZzj3 * 8);
                        i20++;
                    } else {
                        iZzc = (iZzc2 - zzesVar.zzc()) / 8;
                        int iZzj9 = zzesVar.zzj(5);
                        z10 = iZzj9 == 31;
                        iZzj2 = iZzj8;
                        iZzj = iZzj9;
                        zZzi = false;
                    }
                }
                zzaezVar.zzf = iZzj2;
                if (zZzi || z10 || iZzj != 6) {
                    zzaezVar.zzg = zzesVar.zzj(3);
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(5);
                    }
                    zzesVar.zzh(2);
                    if (iZzj5 == 1) {
                        if (iZzj2 == 1) {
                            zzesVar.zzh(2);
                        } else if (iZzj2 == 2) {
                            iZzj2 = 2;
                            zzesVar.zzh(2);
                        }
                    }
                    zzesVar.zzh(5);
                    zzesVar.zzh(10);
                    if (iZzj5 == 1) {
                        if (iZzj2 > 0) {
                            zzaezVar.zza = zzesVar.zzi();
                        }
                        if (zzaezVar.zza) {
                            if (iZzj2 != 1) {
                                if (iZzj2 == 2) {
                                    i17 = 2;
                                } else {
                                    i16 = 2;
                                    i17 = iZzj2;
                                }
                                zzesVar.zzh(24);
                            } else {
                                i17 = 1;
                            }
                            int iZzj10 = zzesVar.zzj(5);
                            if (iZzj10 >= 0 && iZzj10 <= 15) {
                                zzaezVar.zzb = iZzj10;
                            }
                            if (iZzj10 < 11 || iZzj10 > 14) {
                                i16 = 2;
                            } else {
                                zzaezVar.zzd = zzesVar.zzi();
                                i16 = 2;
                                zzaezVar.zze = zzesVar.zzj(2);
                            }
                            zzesVar.zzh(24);
                        } else {
                            i16 = 2;
                            i17 = iZzj2;
                        }
                        if (iZzj2 == 1 || iZzj2 == i16) {
                            if (zzesVar.zzi() && zzesVar.zzi()) {
                                zzesVar.zzh(i16);
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzg();
                                int i21 = 8;
                                int iZzj11 = zzesVar.zzj(8);
                                int i22 = 0;
                                while (i22 < iZzj11) {
                                    zzesVar.zzh(i21);
                                    i22++;
                                    i21 = 8;
                                }
                            }
                        }
                        iZzj2 = i17;
                    }
                    if (!zZzi && !z10) {
                        zzesVar.zzg();
                        if (iZzj == 0 || iZzj == 1 || iZzj == 2) {
                            if (iZzj2 == 0) {
                                for (int i23 = 0; i23 < 2; i23++) {
                                    zzd(zzesVar, zzaezVar);
                                }
                                iZzj2 = 0;
                            } else {
                                int i24 = 0;
                                for (int i25 = 2; i24 < i25; i25 = 2) {
                                    zze(zzesVar, zzaezVar);
                                    i24++;
                                }
                            }
                        } else if (iZzj == 3 || iZzj == 4) {
                            if (iZzj2 == 0) {
                                for (int i26 = 0; i26 < 3; i26++) {
                                    zzd(zzesVar, zzaezVar);
                                }
                                iZzj2 = 0;
                            } else {
                                int i27 = 0;
                                for (int i28 = 3; i27 < i28; i28 = 3) {
                                    zze(zzesVar, zzaezVar);
                                    i27++;
                                }
                            }
                        } else if (iZzj != 5) {
                            int iZzj12 = zzesVar.zzj(7);
                            for (int i29 = 0; i29 < iZzj12; i29++) {
                                zzesVar.zzh(8);
                            }
                        } else if (iZzj2 == 0) {
                            zzd(zzesVar, zzaezVar);
                            iZzj2 = 0;
                        } else {
                            int iZzj13 = zzesVar.zzj(3);
                            for (int i30 = 0; i30 < iZzj13 + 2; i30++) {
                                zze(zzesVar, zzaezVar);
                            }
                        }
                    } else if (iZzj2 == 0) {
                        zzd(zzesVar, zzaezVar);
                        iZzj2 = 0;
                    } else {
                        zze(zzesVar, zzaezVar);
                    }
                    zzesVar.zzg();
                    if (zzesVar.zzi()) {
                        i13 = 7;
                        iZzj4 = zzesVar.zzj(7);
                        for (i18 = 0; i18 < iZzj4; i18++) {
                            zzesVar.zzh(15);
                        }
                    } else {
                        i13 = 7;
                    }
                } else {
                    i13 = 7;
                    iZzj4 = zzesVar.zzj(7);
                    while (i18 < iZzj4) {
                        zzesVar.zzh(15);
                    }
                }
                if (iZzj2 <= 0) {
                    i10 = 5;
                } else {
                    if (zzesVar.zzi() && !zzg(zzesVar)) {
                        throw zzat.zzc("Can't parse bitrate DSI.");
                    }
                    if (zzesVar.zzi()) {
                        zzesVar.zzm();
                        zzesVar.zzo(zzesVar.zzj(16));
                        i10 = 5;
                        int iZzj14 = zzesVar.zzj(5);
                        for (int i31 = 0; i31 < iZzj14; i31++) {
                            zzesVar.zzh(3);
                            zzesVar.zzh(8);
                        }
                    } else {
                        i10 = 5;
                    }
                }
                i11 = 8;
                zzesVar.zzm();
                if (iZzj5 == 1) {
                    int iZzc3 = ((iZzc2 - zzesVar.zzc()) / 8) - iZzc;
                    if (iZzj3 < iZzc3) {
                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzesVar.zzo(iZzj3 - iZzc3);
                }
                if (zzaezVar.zza) {
                    i12 = -1;
                    if (zzaezVar.zzb == -1) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i20).length() + 45);
                        sb3.append("Can't determine channel mode of presentation ");
                        sb3.append(i20);
                        throw zzat.zzc(sb3.toString());
                    }
                } else {
                    i12 = -1;
                }
            } else {
                i10 = 5;
                i11 = 8;
                i12 = -1;
                i13 = 7;
            }
            if (zzaezVar.zza) {
                int i32 = zzaezVar.zzb;
                boolean z11 = zzaezVar.zzd;
                int i33 = zzaezVar.zze;
                switch (i32) {
                    case 0:
                        i15 = 11;
                        i13 = 1;
                        break;
                    case 1:
                        i15 = 11;
                        i13 = 2;
                        break;
                    case 2:
                        i15 = 11;
                        i13 = 3;
                        break;
                    case 3:
                        i13 = i10;
                        i15 = 11;
                        break;
                    case 4:
                        i15 = 11;
                        i13 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i15 = 11;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i13 = i11;
                        i15 = 11;
                        break;
                    case 11:
                        i15 = 11;
                        i13 = 11;
                        break;
                    case 12:
                        i13 = 12;
                        i15 = 11;
                        break;
                    case 13:
                        i13 = 13;
                        i15 = 11;
                        break;
                    case 14:
                        i15 = 11;
                        i13 = 14;
                        break;
                    case 15:
                        i15 = 11;
                        i13 = 24;
                        break;
                    default:
                        i13 = i12;
                        i15 = 11;
                        break;
                }
                if (i32 == i15 || i32 == 12 || i32 == 13 || i32 == 14) {
                    if (!z11) {
                        i13 -= 2;
                    }
                    i14 = i13;
                    if (i33 == 0) {
                        i14 -= 4;
                    } else if (i33 == 1) {
                        i14 -= 2;
                    }
                } else {
                    i14 = i13;
                }
            } else {
                int i34 = zzaezVar.zzc;
                if (i34 > 0) {
                    i14 = i34 + 1;
                    if (zzaezVar.zzg == 4 && i14 == 17) {
                        i14 = 21;
                    }
                } else {
                    int i35 = zzaezVar.zzg;
                    if (i35 == 0) {
                        i14 = 2;
                    } else if (i35 == 1) {
                        i14 = 6;
                    } else if (i35 == 2) {
                        i14 = i11;
                    } else if (i35 == 3) {
                        i14 = 10;
                    } else if (i35 != 4) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i35).length() + 33);
                        sb4.append("AC-4 level ");
                        sb4.append(i35);
                        sb4.append(" has not been defined.");
                        zzeg.zzc("Ac4Util", sb4.toString());
                        i14 = 2;
                    } else {
                        i14 = 12;
                    }
                }
            }
            if (i14 <= 0) {
                throw zzat.zzc("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iZzj6), Integer.valueOf(zzaezVar.zzf), Integer.valueOf(zzaezVar.zzg)};
            String str3 = zzfl.zza;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            zzt zztVar = new zzt();
            zztVar.zza(str);
            zztVar.zzo("audio/ac4");
            zztVar.zzG(i14);
            zztVar.zzH(i19);
            zztVar.zzs(zzqVar);
            zztVar.zze(str2);
            zztVar.zzk(str4);
            return zztVar.zzO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    public static zzafa zzb(zzes zzesVar) {
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = zzesVar.zzj(16);
        int iZzj3 = zzesVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzesVar.zzj(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iZzj3 + i10;
        if (iZzj2 == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iZzj4 = zzesVar.zzj(2);
        int i14 = 0;
        if (iZzj4 == 3) {
            int i15 = 0;
            while (true) {
                iZzj = i15 + zzesVar.zzj(2);
                if (!zzesVar.zzi()) {
                    break;
                }
                i15 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int i16 = iZzj4;
        int iZzj5 = zzesVar.zzj(10);
        if (zzesVar.zzi() && zzesVar.zzj(3) > 0) {
            zzesVar.zzh(2);
        }
        int i17 = true != zzesVar.zzi() ? 44100 : 48000;
        int iZzj6 = zzesVar.zzj(4);
        if (i17 == 44100 && iZzj6 == 13) {
            i11 = zzb[13];
        } else {
            if (i17 == 48000 && iZzj6 < 14) {
                i14 = zzb[iZzj6];
                int i18 = iZzj5 % 5;
                if (i18 == 1) {
                    if (iZzj6 != 3 || iZzj6 == 8) {
                        i14++;
                    }
                } else if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                            i14++;
                        }
                    } else if (iZzj6 != 3) {
                        i14++;
                    } else {
                        i14++;
                    }
                } else if (iZzj6 == 8 || iZzj6 == 11) {
                    i14++;
                }
            }
            i11 = i14;
        }
        return new zzafa(i16, 2, i17, i13, i11, null);
    }

    public static void zzc(int i10, zzet zzetVar) {
        zzetVar.zza(7);
        byte[] bArrZzi = zzetVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i10 >> 16) & 255);
        bArrZzi[5] = (byte) ((i10 >> 8) & 255);
        bArrZzi[6] = (byte) (i10 & 255);
    }

    private static void zzd(zzes zzesVar, zzaez zzaezVar) throws zzat {
        int iZzj = zzesVar.zzj(5);
        zzesVar.zzh(2);
        if (zzesVar.zzi()) {
            zzesVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzesVar.zzg();
        }
        if (zzesVar.zzi()) {
            int iZzj2 = zzesVar.zzj(3);
            if (zzaezVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzaezVar.zzb = iZzj;
            }
            if (zzesVar.zzi()) {
                zzf(zzesVar);
            }
        }
    }

    private static void zze(zzes zzesVar, zzaez zzaezVar) throws zzat {
        zzesVar.zzh(2);
        boolean zZzi = zzesVar.zzi();
        int iZzj = zzesVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzesVar.zzh(2);
            if (zzesVar.zzi()) {
                zzesVar.zzh(5);
            }
            if (zZzi) {
                zzesVar.zzh(24);
            } else {
                if (zzesVar.zzi()) {
                    if (!zzesVar.zzi()) {
                        zzesVar.zzh(4);
                    }
                    zzaezVar.zzc = zzesVar.zzj(6) + 1;
                }
                zzesVar.zzh(4);
            }
        }
        if (zzesVar.zzi()) {
            zzesVar.zzh(3);
            if (zzesVar.zzi()) {
                zzf(zzesVar);
            }
        }
    }

    private static void zzf(zzes zzesVar) throws zzat {
        int iZzj = zzesVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzesVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzes zzesVar) {
        if (zzesVar.zzc() < 66) {
            return false;
        }
        zzesVar.zzh(66);
        return true;
    }
}
