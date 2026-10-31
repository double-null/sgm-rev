package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import d5.LXP.wcAlQCOdREZdI;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgp {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i20 + 1;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    public static boolean zzb(zzv zzvVar, byte[] bArr, int i10) {
        byte b10;
        String strZzq = zzq(zzvVar);
        if (strZzq == null) {
            return false;
        }
        int iHashCode = strZzq.hashCode();
        if (iHashCode != -1662541442) {
            if (iHashCode != 1331836730) {
                if (iHashCode == 1331856911 && strZzq.equals("video/vvc")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (strZzq.equals("video/avc")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (strZzq.equals("video/hevc")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return (bArr[4] & 31) == 6;
        }
        if (b10 != 1) {
            return b10 == 2 && ((bArr[5] & 248) >> 3) == 23;
        }
        return ((bArr[4] & 126) >> 1) == 39;
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strZzq, "video/hevc") || Objects.equals(strZzq, "video/vvc")) ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i10, int i11, zzv zzvVar) {
        int i12;
        String str = zzvVar.zzp;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i12 = b10 & 31) == 1 || i12 == 9 || i12 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzgd zzgdVarZzl = zzl(new zzgw(bArr, 4, i11 + 4));
            int i13 = zzgdVarZzl.zza;
            if (i13 == 35) {
                return false;
            }
            if (i13 <= 14 && i13 % 2 == 0 && zzgdVarZzl.zzc == zzvVar.zzG - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:446:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgm zzf(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        zzgl zzglVar;
        boolean z10;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int iZzf4;
        int i14;
        int i15;
        boolean[][] zArr;
        int i16;
        int i17;
        zzgf zzgfVar;
        int[] iArr;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zZze;
        int i20;
        int i21;
        int i22;
        int iZzg;
        int i23;
        int i24;
        int i25;
        zzgw zzgwVar = new zzgw(bArr, i10, i11);
        zzgd zzgdVarZzl = zzl(zzgwVar);
        zzgwVar.zzb(4);
        boolean zZze2 = zzgwVar.zze();
        boolean zZze3 = zzgwVar.zze();
        int iZzf5 = zzgwVar.zzf(6) + 1;
        int iZzf6 = zzgwVar.zzf(3);
        zzgwVar.zzb(17);
        zzge zzgeVarZzm = zzm(zzgwVar, true, iZzf6, null);
        int i26 = 0;
        for (int i27 = true != zzgwVar.zze() ? iZzf6 : 0; i27 <= iZzf6; i27++) {
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zzg();
        }
        int iZzf7 = zzgwVar.zzf(6);
        int iZzg2 = zzgwVar.zzg() + 1;
        zzgf zzgfVar2 = new zzgf(zzgwm.zzj(zzgeVarZzm), new int[1]);
        boolean z14 = iZzf5 >= 2 && iZzg2 >= 2;
        boolean z15 = zZze2 && zZze3;
        int i28 = iZzf7 + 1;
        if (!z14 || !z15 || i28 < iZzf5) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iZzg2, i28);
        int[] iArr3 = new int[iZzg2];
        int[] iArr4 = new int[iZzg2];
        iArr2[0][0] = 0;
        iArr3[0] = 1;
        iArr4[0] = 0;
        for (int i29 = 1; i29 < iZzg2; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= iZzf7; i31++) {
                if (zzgwVar.zze()) {
                    iArr2[i29][i30] = i31;
                    iArr4[i29] = i31;
                    i30++;
                }
                iArr3[i29] = i30;
            }
        }
        int i32 = 8;
        if (zzgwVar.zze()) {
            zzgwVar.zzb(64);
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
            }
            int iZzg3 = zzgwVar.zzg();
            while (i26 < iZzg3) {
                zzgwVar.zzg();
                if (i26 == 0 || zzgwVar.zze()) {
                    boolean zZze4 = zzgwVar.zze();
                    boolean zZze5 = zzgwVar.zze();
                    if (zZze4 || zZze5) {
                        z12 = zZze4;
                        z13 = zZze5;
                        zZze = zzgwVar.zze();
                        if (zZze) {
                            zzgwVar.zzb(19);
                        }
                        zzgwVar.zzb(i32);
                        if (zZze) {
                            zzgwVar.zzb(4);
                        }
                        zzgwVar.zzb(15);
                        i21 = zZze4;
                        i20 = zZze5;
                    }
                    i22 = 0;
                    while (i22 <= iZzf6) {
                        if (!zzgwVar.zze() || zzgwVar.zze()) {
                            zzgwVar.zzg();
                        } else {
                            if (zzgwVar.zze()) {
                                iZzg = 0;
                            }
                            i23 = i21 + i20;
                            int[] iArr5 = iArr4;
                            i24 = 0;
                            while (i24 < i23) {
                                int i33 = i23;
                                for (i25 = 0; i25 <= iZzg; i25++) {
                                    zzgwVar.zzg();
                                    zzgwVar.zzg();
                                    if (zZze) {
                                        zzgwVar.zzg();
                                        zzgwVar.zzg();
                                    }
                                    zzgwVar.zza();
                                }
                                i24++;
                                i23 = i33;
                            }
                            i22++;
                            iZzg3 = iZzg3;
                            iArr4 = iArr5;
                        }
                        iZzg = zzgwVar.zzg();
                        i23 = i21 + i20;
                        int[] iArr6 = iArr4;
                        i24 = 0;
                        while (i24 < i23) {
                            int i34 = i23;
                            while (i25 <= iZzg) {
                                zzgwVar.zzg();
                                zzgwVar.zzg();
                                if (zZze) {
                                    zzgwVar.zzg();
                                    zzgwVar.zzg();
                                }
                                zzgwVar.zza();
                            }
                            i24++;
                            i23 = i34;
                        }
                        i22++;
                        iZzg3 = iZzg3;
                        iArr4 = iArr6;
                    }
                    i26++;
                    i32 = 8;
                } else {
                    z12 = false;
                    z13 = false;
                }
                zZze = false;
                i21 = z12;
                i20 = z13;
                i22 = 0;
                while (i22 <= iZzf6) {
                    if (zzgwVar.zze()) {
                        zzgwVar.zzg();
                        iZzg = zzgwVar.zzg();
                    } else {
                        zzgwVar.zzg();
                        iZzg = zzgwVar.zzg();
                    }
                    i23 = i21 + i20;
                    int[] iArr7 = iArr4;
                    i24 = 0;
                    while (i24 < i23) {
                        int i35 = i23;
                        while (i25 <= iZzg) {
                            zzgwVar.zzg();
                            zzgwVar.zzg();
                            if (zZze) {
                                zzgwVar.zzg();
                                zzgwVar.zzg();
                            }
                            zzgwVar.zza();
                        }
                        i24++;
                        i23 = i35;
                    }
                    i22++;
                    iZzg3 = iZzg3;
                    iArr4 = iArr7;
                }
                i26++;
                i32 = 8;
            }
        }
        int[] iArr8 = iArr4;
        if (!zzgwVar.zze()) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        zzgwVar.zzc();
        zzge zzgeVarZzm2 = zzm(zzgwVar, false, iZzf6, zzgeVarZzm);
        boolean zZze6 = zzgwVar.zze();
        boolean[] zArr2 = new boolean[16];
        int i36 = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            boolean zZze7 = zzgwVar.zze();
            zArr2[i37] = zZze7;
            if (zZze7) {
                i36++;
            }
        }
        if (i36 == 0 || !zArr2[1]) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        int i38 = i36 + 1;
        int[] iArr9 = new int[i36];
        for (int i39 = 0; i39 < i36 - (zZze6 ? 1 : 0); i39++) {
            iArr9[i39] = zzgwVar.zzf(3);
        }
        int[] iArr10 = new int[i38];
        if (zZze6) {
            for (int i40 = 1; i40 < i36; i40++) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr10[i40] = iArr10[i40] + iArr9[i41] + 1;
                }
            }
            iArr10[i36] = 6;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iZzf5, i36);
        int[] iArr12 = new int[iZzf5];
        iArr12[0] = 0;
        boolean zZze8 = zzgwVar.zze();
        int i42 = 1;
        while (i42 < iZzf5) {
            if (zZze8) {
                iArr12[i42] = zzgwVar.zzf(6);
            } else {
                iArr12[i42] = i42;
            }
            if (zZze6) {
                z11 = zZze6 ? 1 : 0;
                int i43 = 0;
                while (i43 < i36) {
                    int i44 = i43 + 1;
                    iArr11[i42][i43] = (iArr12[i42] & ((1 << iArr10[i44]) - 1)) >> iArr10[i43];
                    i43 = i44;
                }
            } else {
                int i45 = 0;
                while (i45 < i36) {
                    iArr11[i42][i45] = zzgwVar.zzf(iArr9[i45] + 1);
                    i45++;
                    zZze6 = zZze6 ? 1 : 0;
                }
                z11 = zZze6;
            }
            i42++;
            zZze6 = z11;
        }
        int[] iArr13 = new int[i28];
        int i46 = 1;
        for (int i47 = 0; i47 < iZzf5; i47++) {
            iArr13[iArr12[i47]] = -1;
            int i48 = 0;
            int i49 = 0;
            while (i48 < 16) {
                if (zArr2[i48]) {
                    i18 = 1;
                    if (i48 == 1) {
                        iArr13[iArr12[i47]] = iArr11[i47][i49];
                        i19 = 1;
                    } else {
                        i19 = i48;
                    }
                    i49++;
                    i48 = i19;
                } else {
                    i18 = 1;
                }
                i48 += i18;
            }
            if (i47 > 0) {
                int i50 = 0;
                while (true) {
                    if (i50 >= i47) {
                        i46++;
                        break;
                    }
                    if (iArr13[iArr12[i47]] == iArr13[iArr12[i50]]) {
                        break;
                    }
                    i50++;
                }
            }
        }
        int iZzf8 = zzgwVar.zzf(4);
        if (i46 < 2 || iZzf8 == 0) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        int[] iArr14 = new int[i46];
        for (int i51 = 0; i51 < i46; i51++) {
            iArr14[i51] = zzgwVar.zzf(iZzf8);
        }
        int[] iArr15 = new int[i28];
        for (int i52 = 0; i52 < iZzf5; i52++) {
            iArr15[Math.min(iArr12[i52], iZzf7)] = i52;
        }
        zzgwj zzgwjVar = new zzgwj();
        int i53 = 0;
        while (i53 <= iZzf7) {
            int[] iArr16 = iArr13;
            int iMin = Math.min(iArr13[i53], i46 - 1);
            zzgwjVar.zzf(new zzgc(iArr15[i53], iMin >= 0 ? iArr14[iMin] : -1));
            i53++;
            iArr13 = iArr16;
        }
        zzgwm zzgwmVarZzi = zzgwjVar.zzi();
        if (((zzgc) zzgwmVarZzi.get(0)).zzb == -1) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        int i54 = 1;
        while (true) {
            if (i54 > iZzf7) {
                i12 = -1;
                i54 = -1;
                break;
            }
            i12 = -1;
            if (((zzgc) zzgwmVarZzi.get(i54)).zzb != -1) {
                break;
            }
            i54++;
        }
        if (i54 == i12) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls, iZzf5, iZzf5);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, iZzf5, iZzf5);
        for (int i55 = 1; i55 < iZzf5; i55++) {
            for (int i56 = 0; i56 < i55; i56++) {
                boolean[] zArr5 = zArr3[i55];
                boolean[] zArr6 = zArr4[i55];
                boolean zZze9 = zzgwVar.zze();
                zArr6[i56] = zZze9;
                zArr5[i56] = zZze9;
            }
        }
        for (int i57 = 1; i57 < iZzf5; i57++) {
            for (int i58 = 0; i58 < iZzf5 - 1; i58++) {
                for (int i59 = 0; i59 < i57; i59++) {
                    boolean[] zArr7 = zArr4[i57];
                    if (zArr7[i59] && zArr4[i59][i58]) {
                        zArr7[i58] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr17 = new int[i28];
        for (int i60 = 0; i60 < iZzf5; i60++) {
            int i61 = 0;
            for (int i62 = 0; i62 < i60; i62++) {
                i61 += zArr3[i60][i62] ? 1 : 0;
            }
            iArr17[iArr12[i60]] = i61;
        }
        int i63 = 0;
        for (int i64 = 0; i64 < iZzf5; i64++) {
            if (iArr17[iArr12[i64]] == 0) {
                i63++;
            }
        }
        if (i63 > 1) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        int[] iArr18 = new int[iZzf5];
        int[] iArr19 = new int[iZzg2];
        if (zzgwVar.zze()) {
            for (int i65 = 0; i65 < iZzf5; i65++) {
                iArr18[i65] = zzgwVar.zzf(3);
            }
            i13 = iZzf6;
        } else {
            i13 = iZzf6;
            Arrays.fill(iArr18, 0, iZzf5, i13);
        }
        int i66 = 0;
        while (i66 < iZzg2) {
            boolean[][] zArr8 = zArr4;
            int[] iArr20 = iArr17;
            int[] iArr21 = iArr12;
            int iMax = 0;
            for (int i67 = 0; i67 < iArr3[i66]; i67++) {
                iMax = Math.max(iMax, iArr18[((zzgc) zzgwmVarZzi.get(iArr2[i66][i67])).zza]);
            }
            iArr19[i66] = iMax + 1;
            i66++;
            zArr4 = zArr8;
            iArr12 = iArr21;
            iArr17 = iArr20;
        }
        boolean[][] zArr9 = zArr4;
        int[] iArr22 = iArr17;
        int[] iArr23 = iArr12;
        if (zzgwVar.zze()) {
            int i68 = 0;
            while (i68 < iZzf5 - 1) {
                int i69 = i68 + 1;
                for (int i70 = i69; i70 < iZzf5; i70++) {
                    if (zArr3[i70][i68]) {
                        zzgwVar.zzb(3);
                    }
                }
                i68 = i69;
            }
        }
        zzgwVar.zza();
        int iZzg4 = zzgwVar.zzg() + 1;
        zzgwj zzgwjVar2 = new zzgwj();
        zzgwjVar2.zzf(zzgeVarZzm);
        if (iZzg4 > 1) {
            zzgwjVar2.zzf(zzgeVarZzm2);
            zzge zzgeVarZzm3 = zzgeVarZzm2;
            for (int i71 = 2; i71 < iZzg4; i71++) {
                zzgeVarZzm3 = zzm(zzgwVar, zzgwVar.zze(), i13, zzgeVarZzm3);
                zzgwjVar2.zzf(zzgeVarZzm3);
            }
        }
        zzgwm zzgwmVarZzi2 = zzgwjVar2.zzi();
        int iZzg5 = zzgwVar.zzg() + iZzg2;
        if (iZzg5 > iZzg2) {
            return new zzgm(zzgdVarZzl, null, zzgfVar2, null, null);
        }
        int iZzf9 = zzgwVar.zzf(2);
        boolean[][] zArr10 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzg5, i28);
        int[] iArr24 = new int[iZzg5];
        int[] iArr25 = new int[iZzg5];
        int i72 = 0;
        while (i72 < iZzg2) {
            int i73 = iZzg2;
            iArr24[i72] = 0;
            int i74 = iArr8[i72];
            iArr25[i72] = i74;
            if (iZzf9 == 0) {
                iArr = iArr19;
                i17 = iZzf5;
                zzgfVar = zzgfVar2;
                Arrays.fill(zArr10[i72], 0, iArr3[i72], true);
                iArr24[i72] = iArr3[i72];
            } else {
                i17 = iZzf5;
                zzgfVar = zzgfVar2;
                iArr = iArr19;
                if (iZzf9 == 1) {
                    for (int i75 = 0; i75 < iArr3[i72]; i75++) {
                        zArr10[i72][i75] = iArr2[i72][i75] == i74;
                    }
                    iArr24[i72] = 1;
                } else {
                    zArr10[0][0] = true;
                    iArr24[0] = 1;
                }
                i72++;
                iZzg2 = i73;
                iArr19 = iArr;
                iZzf5 = i17;
                zzgfVar2 = zzgfVar;
            }
            i72++;
            iZzg2 = i73;
            iArr19 = iArr;
            iZzf5 = i17;
            zzgfVar2 = zzgfVar;
        }
        int i76 = iZzf5;
        zzgf zzgfVar3 = zzgfVar2;
        int[] iArr26 = iArr19;
        int i77 = iZzg2;
        int[] iArr27 = new int[i28];
        int i78 = 2;
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzg5, i28);
        int i79 = 0;
        int i80 = 1;
        while (i80 < iZzg5) {
            if (iZzf9 == i78) {
                for (int i81 = 0; i81 < iArr3[i80]; i81++) {
                    zArr10[i80][i81] = zzgwVar.zze();
                    int i82 = iArr24[i80];
                    boolean z16 = zArr10[i80][i81];
                    iArr24[i80] = i82 + (z16 ? 1 : 0);
                    if (z16) {
                        iArr25[i80] = iArr2[i80][i81];
                    }
                }
            }
            if (i79 == 0) {
                if (iArr2[i80][0] == 0 && zArr10[i80][0]) {
                    i79 = 0;
                    for (int i83 = 1; i83 < iArr3[i80]; i83++) {
                        if (iArr2[i80][i83] == i54 && zArr10[i80][i54]) {
                            i79 = i80;
                        }
                    }
                } else {
                    i79 = 0;
                }
            }
            int i84 = 0;
            while (i84 < iArr3[i80]) {
                if (iZzg4 > 1) {
                    zArr11[i80][i84] = zArr10[i80][i84];
                    zArr = zArr10;
                    i16 = iZzf9;
                    i14 = i54;
                    int iZzc = zzgzw.zzc(iZzg4, RoundingMode.CEILING);
                    if (zArr11[i80][i84]) {
                        i15 = iZzg4;
                        break;
                    }
                    int i85 = ((zzgc) zzgwmVarZzi.get(iArr2[i80][i84])).zza;
                    int i86 = 0;
                    while (true) {
                        if (i86 >= i84) {
                            i15 = iZzg4;
                            break;
                        }
                        i15 = iZzg4;
                        if (zArr9[i85][((zzgc) zzgwmVarZzi.get(iArr2[i80][i86])).zza]) {
                            zArr11[i80][i84] = true;
                            break;
                        }
                        i86++;
                        iZzg4 = i15;
                    }
                    if (zArr11[i80][i84]) {
                        if (i79 <= 0 || i80 != i79) {
                            zzgwVar.zzb(iZzc);
                        } else {
                            iArr27[i84] = zzgwVar.zzf(iZzc);
                        }
                    }
                } else {
                    i14 = i54;
                    i15 = iZzg4;
                    zArr = zArr10;
                    i16 = iZzf9;
                }
                i84++;
                iZzf9 = i16;
                zArr10 = zArr;
                i54 = i14;
                iZzg4 = i15;
            }
            int i87 = i54;
            int i88 = iZzg4;
            boolean[][] zArr12 = zArr10;
            int i89 = iZzf9;
            if (iArr24[i80] == 1 && iArr22[iArr25[i80]] > 0) {
                zzgwVar.zza();
            }
            i80++;
            iZzf9 = i89;
            zArr10 = zArr12;
            i54 = i87;
            iZzg4 = i88;
            i78 = 2;
        }
        if (i79 == 0) {
            return new zzgm(zzgdVarZzl, null, zzgfVar3, null, null);
        }
        int iZzg6 = zzgwVar.zzg() + 1;
        zzgwj zzgwjVarZzv = zzgwm.zzv(iZzg6);
        int[] iArr28 = new int[i76];
        int i90 = 0;
        while (i90 < iZzg6) {
            int iZzf10 = zzgwVar.zzf(16);
            int iZzf11 = zzgwVar.zzf(16);
            if (zzgwVar.zze()) {
                iZzf2 = zzgwVar.zzf(2);
                if (iZzf2 == 3) {
                    zzgwVar.zza();
                }
                iZzf3 = zzgwVar.zzf(4);
                iZzf4 = zzgwVar.zzf(4);
            } else {
                iZzf2 = 0;
                iZzf3 = 0;
                iZzf4 = 0;
            }
            if (zzgwVar.zze()) {
                int iZzg7 = zzgwVar.zzg();
                int iZzg8 = zzgwVar.zzg();
                int iZzg9 = zzgwVar.zzg();
                int iZzg10 = zzgwVar.zzg();
                iZzf10 = zzn(iZzf10, iZzf2, iZzg7, iZzg8);
                iZzf11 = zzo(iZzf11, iZzf2, iZzg9, iZzg10);
            }
            zzgwjVarZzv.zzf(new zzgg(iZzf2, iZzf3, iZzf4, iZzf10, iZzf11));
            i90++;
            zzgwmVarZzi = zzgwmVarZzi;
            zzgdVarZzl = zzgdVarZzl;
        }
        zzgd zzgdVar = zzgdVarZzl;
        zzgwm zzgwmVar = zzgwmVarZzi;
        if (iZzg6 <= 1 || !zzgwVar.zze()) {
            for (int i91 = 1; i91 < i76; i91++) {
                iArr28[i91] = Math.min(i91, iZzg6 - 1);
            }
        } else {
            int iZzc2 = zzgzw.zzc(iZzg6, RoundingMode.CEILING);
            for (int i92 = 1; i92 < i76; i92++) {
                iArr28[i92] = zzgwVar.zzf(iZzc2);
            }
        }
        zzgh zzghVar = new zzgh(zzgwjVarZzv.zzi(), iArr28);
        zzgwVar.zzb(2);
        for (int i93 = 1; i93 < i76; i93++) {
            if (iArr22[iArr23[i93]] == 0) {
                zzgwVar.zza();
            }
        }
        for (int i94 = 1; i94 < iZzg5; i94++) {
            boolean zZze10 = zzgwVar.zze();
            int i95 = 0;
            while (i95 < iArr26[i94]) {
                if ((i95 <= 0 || !zZze10) ? i95 == 0 : zzgwVar.zze()) {
                    for (int i96 = 0; i96 < iArr3[i94]; i96++) {
                        if (zArr11[i94][i96]) {
                            zzgwVar.zzg();
                        }
                    }
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                }
                i95++;
            }
        }
        int iZzg11 = zzgwVar.zzg() + 2;
        if (zzgwVar.zze()) {
            zzgwVar.zzb(iZzg11);
        } else {
            for (int i97 = 1; i97 < i76; i97++) {
                for (int i98 = 0; i98 < i97; i98++) {
                    if (zArr3[i97][i98]) {
                        zzgwVar.zzb(iZzg11);
                    }
                }
            }
        }
        int iZzg12 = zzgwVar.zzg();
        for (int i99 = 1; i99 <= iZzg12; i99++) {
            zzgwVar.zzb(8);
        }
        if (zzgwVar.zze()) {
            zzgwVar.zzc();
            if (zzgwVar.zze() || zzgwVar.zze()) {
                zzgwVar.zza();
            }
            boolean zZze11 = zzgwVar.zze();
            boolean zZze12 = zzgwVar.zze();
            if (zZze11 || zZze12) {
                for (int i100 = 0; i100 < i77; i100++) {
                    for (int i101 = 0; i101 < iArr26[i100]; i101++) {
                        boolean zZze13 = zZze11 ? zzgwVar.zze() : false;
                        boolean zZze14 = zZze12 ? zzgwVar.zze() : false;
                        if (zZze13) {
                            zzgwVar.zzb(32);
                        }
                        if (zZze14) {
                            zzgwVar.zzb(18);
                        }
                    }
                }
            }
            boolean zZze15 = zzgwVar.zze();
            if (zZze15) {
                z10 = true;
                iZzf = zzgwVar.zzf(4) + 1;
            } else {
                z10 = true;
                iZzf = i76;
            }
            zzgwj zzgwjVarZzv2 = zzgwm.zzv(iZzf);
            int[] iArr29 = new int[i76];
            int i102 = 0;
            while (i102 < iZzf) {
                zzgwVar.zzb(3);
                int i103 = z10 != zzgwVar.zze() ? 2 : 1;
                int iZzb = zzi.zzb(zzgwVar.zzf(8));
                int iZzc3 = zzi.zzc(zzgwVar.zzf(8));
                zzgwVar.zzb(8);
                zzgwjVarZzv2.zzf(new zzgk(iZzb, i103, iZzc3));
                i102++;
                z10 = true;
            }
            if (zZze15 && iZzf > 1) {
                for (int i104 = 0; i104 < i76; i104++) {
                    iArr29[i104] = zzgwVar.zzf(4);
                }
            }
            zzglVar = new zzgl(zzgwjVarZzv2.zzi(), iArr29);
        } else {
            zzglVar = null;
        }
        return new zzgm(zzgdVar, zzgwmVar, new zzgf(zzgwmVarZzi2, iArr27), zzghVar, zzglVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    public static zzgj zzg(byte[] bArr, int i10, int i11, zzgm zzgmVar) {
        boolean z10;
        int i12;
        int i13;
        int iZzn;
        int iZzo;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzg;
        int iZzg2;
        int i18;
        int i19;
        int i20;
        float f10;
        int i21;
        int i22;
        int i23;
        int iZzc;
        int i24;
        zzgl zzglVar;
        int iZzb;
        int i25;
        int i26;
        zzgh zzghVar;
        zzgd zzgdVarZzl = zzl(new zzgw(bArr, i10, i11));
        zzgw zzgwVar = new zzgw(bArr, i10 + 2, i11);
        zzgwVar.zzb(4);
        int iZzf = zzgwVar.zzf(3);
        int i27 = zzgdVarZzl.zzb;
        if (i27 == 0 || iZzf != 7) {
            z10 = false;
        } else {
            iZzf = 7;
            z10 = true;
        }
        if (zzgmVar != null) {
            zzgwm zzgwmVar = zzgmVar.zza;
            if (zzgwmVar.isEmpty()) {
                i12 = 0;
            } else {
                i12 = ((zzgc) zzgwmVar.get(Math.min(i27, zzgwmVar.size() - 1))).zza;
            }
        } else {
            i12 = 0;
        }
        zzge zzgeVarZzm = null;
        if (!z10) {
            zzgwVar.zza();
            zzgeVarZzm = zzm(zzgwVar, true, iZzf, null);
        } else if (zzgmVar != null) {
            zzgf zzgfVar = zzgmVar.zzb;
            int i28 = zzgfVar.zzb[i12];
            zzgwm zzgwmVar2 = zzgfVar.zza;
            if (zzgwmVar2.size() > i28) {
                zzgeVarZzm = (zzge) zzgwmVar2.get(i28);
            }
        }
        int iZzg3 = zzgwVar.zzg();
        if (z10) {
            int iZzf2 = zzgwVar.zze() ? zzgwVar.zzf(8) : -1;
            if (zzgmVar == null || (zzghVar = zzgmVar.zzc) == null) {
                iZzg = 0;
                i15 = 0;
                i18 = 0;
                iZzg2 = 0;
                i17 = 0;
                i14 = 0;
                i16 = 0;
            } else {
                if (iZzf2 == -1) {
                    iZzf2 = zzghVar.zzb[i12];
                }
                if (iZzf2 != -1) {
                    zzgwm zzgwmVar3 = zzghVar.zza;
                    if (zzgwmVar3.size() > iZzf2) {
                        zzgg zzggVar = (zzgg) zzgwmVar3.get(iZzf2);
                        int i29 = zzggVar.zza;
                        i14 = zzggVar.zzd;
                        i17 = zzggVar.zze;
                        iZzg = zzggVar.zzb;
                        i16 = i17;
                        i15 = i14;
                        iZzg2 = zzggVar.zzc;
                        i18 = i29;
                    } else {
                        iZzg = 0;
                        i15 = 0;
                        i18 = 0;
                        iZzg2 = 0;
                        i17 = 0;
                        i14 = 0;
                        i16 = 0;
                    }
                } else {
                    iZzg = 0;
                    i15 = 0;
                    i18 = 0;
                    iZzg2 = 0;
                    i17 = 0;
                    i14 = 0;
                    i16 = 0;
                }
            }
        } else {
            int iZzg4 = zzgwVar.zzg();
            if (iZzg4 == 3) {
                zzgwVar.zza();
                i13 = 3;
            } else {
                i13 = iZzg4;
            }
            int iZzg5 = zzgwVar.zzg();
            int iZzg6 = zzgwVar.zzg();
            if (zzgwVar.zze()) {
                int iZzg7 = zzgwVar.zzg();
                int iZzg8 = zzgwVar.zzg();
                int iZzg9 = zzgwVar.zzg();
                int iZzg10 = zzgwVar.zzg();
                iZzn = zzn(iZzg5, i13, iZzg7, iZzg8);
                iZzo = zzo(iZzg6, i13, iZzg9, iZzg10);
            } else {
                iZzn = iZzg5;
                iZzo = iZzg6;
            }
            i14 = iZzn;
            i15 = iZzg5;
            i16 = iZzg6;
            i17 = iZzo;
            iZzg = zzgwVar.zzg();
            iZzg2 = zzgwVar.zzg();
            i18 = iZzg4;
        }
        int iZzg11 = zzgwVar.zzg();
        if (z10) {
            i19 = i14;
            i20 = -1;
        } else {
            int i30 = true != zzgwVar.zze() ? iZzf : 0;
            int iMax = -1;
            while (i30 <= iZzf) {
                zzgwVar.zzg();
                iMax = Math.max(zzgwVar.zzg(), iMax);
                zzgwVar.zzg();
                i30++;
                i14 = i14;
            }
            i19 = i14;
            i20 = iMax;
        }
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        if (zzgwVar.zze()) {
            int i31 = 6;
            if (z10 && zzgwVar.zze()) {
                zzgwVar.zzb(6);
            } else if (zzgwVar.zze()) {
                int i32 = 0;
                int i33 = 4;
                while (i32 < i33) {
                    int i34 = 0;
                    while (i34 < i31) {
                        if (zzgwVar.zze()) {
                            int iMin = Math.min(64, 1 << ((i32 + i32) + 4));
                            if (i32 > 1) {
                                zzgwVar.zzh();
                            }
                            for (int i35 = 0; i35 < iMin; i35++) {
                                zzgwVar.zzh();
                            }
                            i26 = 3;
                        } else {
                            zzgwVar.zzg();
                            i26 = 3;
                        }
                        i34 += i32 == i26 ? 3 : 1;
                        iZzg3 = iZzg3;
                        i20 = i20;
                        i31 = 6;
                    }
                    i32++;
                    i33 = 4;
                    i31 = 6;
                }
            }
        }
        int i36 = i20;
        int i37 = iZzg3;
        zzgwVar.zzb(2);
        if (zzgwVar.zze()) {
            zzgwVar.zzb(8);
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zza();
        }
        int iZzg12 = zzgwVar.zzg();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i38 = 0;
        int i39 = iZzg2;
        int i40 = -1;
        int i41 = -1;
        while (i38 < iZzg12) {
            if (i38 == 0 || !zzgwVar.zze()) {
                int iZzg13 = zzgwVar.zzg();
                int iZzg14 = zzgwVar.zzg();
                int[] iArr2 = new int[iZzg13];
                int i42 = 0;
                while (i42 < iZzg13) {
                    iArr2[i42] = (i42 > 0 ? iArr2[i42 - 1] : 0) - (zzgwVar.zzg() + 1);
                    zzgwVar.zza();
                    i42++;
                }
                int[] iArr3 = new int[iZzg14];
                int i43 = 0;
                while (i43 < iZzg14) {
                    iArr3[i43] = (i43 > 0 ? iArr3[i43 - 1] : 0) + zzgwVar.zzg() + 1;
                    zzgwVar.zza();
                    i43++;
                }
                i40 = iZzg13;
                i41 = iZzg14;
                iArr = iArr2;
                iArrCopyOf = iArr3;
            } else {
                int i44 = i40 + i41;
                boolean zZze = zzgwVar.zze();
                boolean z11 = true;
                int iZzg15 = zzgwVar.zzg() + 1;
                int i45 = 1 - ((zZze ? 1 : 0) + (zZze ? 1 : 0));
                int i46 = i44 + 1;
                boolean[] zArr = new boolean[i46];
                int i47 = 0;
                while (i47 <= i44) {
                    if (zzgwVar.zze()) {
                        zArr[i47] = z11;
                    } else {
                        zArr[i47] = zzgwVar.zze();
                    }
                    i47++;
                    z11 = true;
                }
                int i48 = i41 - 1;
                int[] iArr4 = new int[i46];
                int[] iArr5 = new int[i46];
                int i49 = 0;
                while (true) {
                    i25 = i45 * iZzg15;
                    if (i48 < 0) {
                        break;
                    }
                    int i50 = iArrCopyOf[i48] + i25;
                    if (i50 < 0 && zArr[i40 + i48]) {
                        iArr4[i49] = i50;
                        i49++;
                    }
                    i48--;
                }
                if (i25 < 0 && zArr[i44]) {
                    iArr4[i49] = i25;
                    i49++;
                }
                int i51 = i49;
                for (int i52 = 0; i52 < i40; i52++) {
                    int i53 = iArr[i52] + i25;
                    if (i53 < 0 && zArr[i52]) {
                        iArr4[i51] = i53;
                        i51++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i51);
                int i54 = 0;
                for (int i55 = i40 - 1; i55 >= 0; i55--) {
                    int i56 = iArr[i55] + i25;
                    if (i56 > 0 && zArr[i55]) {
                        iArr5[i54] = i56;
                        i54++;
                    }
                }
                if (i25 > 0 && zArr[i44]) {
                    iArr5[i54] = i25;
                    i54++;
                }
                int i57 = i54;
                for (int i58 = 0; i58 < i41; i58++) {
                    int i59 = iArrCopyOf[i58] + i25;
                    if (i59 > 0 && zArr[i40 + i58]) {
                        iArr5[i57] = i59;
                        i57++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i57);
                i41 = i57;
                i40 = i51;
                iArr = iArrCopyOf2;
            }
            i38++;
            iZzg12 = iZzg12;
            iZzf = iZzf;
            zzgdVarZzl = zzgdVarZzl;
            iZzg = iZzg;
            i18 = i18;
            zzgeVarZzm = zzgeVarZzm;
        }
        int i60 = iZzg;
        int i61 = iZzf;
        zzgd zzgdVar = zzgdVarZzl;
        int i62 = i18;
        zzge zzgeVar = zzgeVarZzm;
        if (zzgwVar.zze()) {
            int iZzg16 = zzgwVar.zzg();
            for (int i63 = 0; i63 < iZzg16; i63++) {
                zzgwVar.zzb(iZzg11 + 5);
            }
        }
        zzgwVar.zzb(2);
        float f11 = 1.0f;
        if (zzgwVar.zze()) {
            if (zzgwVar.zze()) {
                int iZzf3 = zzgwVar.zzf(8);
                if (iZzf3 == 255) {
                    int iZzf4 = zzgwVar.zzf(16);
                    int iZzf5 = zzgwVar.zzf(16);
                    if (iZzf4 != 0 && iZzf5 != 0) {
                        f11 = iZzf4 / iZzf5;
                    }
                } else if (iZzf3 < 17) {
                    f11 = zzb[iZzf3];
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf3).length() + 35);
                    sb2.append("Unexpected aspect_ratio_idc value: ");
                    sb2.append(iZzf3);
                    zzeg.zzc("NalUnitUtil", sb2.toString());
                }
            }
            if (zzgwVar.zze()) {
                zzgwVar.zza();
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzb(3);
                i24 = true != zzgwVar.zze() ? 2 : 1;
                if (zzgwVar.zze()) {
                    int iZzf6 = zzgwVar.zzf(8);
                    int iZzf7 = zzgwVar.zzf(8);
                    zzgwVar.zzb(8);
                    iZzb = zzi.zzb(iZzf6);
                    iZzc = zzi.zzc(iZzf7);
                } else {
                    iZzc = -1;
                    iZzb = -1;
                }
            } else {
                if (zzgmVar != null && (zzglVar = zzgmVar.zzd) != null) {
                    int i64 = zzglVar.zzb[i12];
                    zzgwm zzgwmVar4 = zzglVar.zza;
                    if (zzgwmVar4.size() > i64) {
                        zzgk zzgkVar = (zzgk) zzgwmVar4.get(i64);
                        iZzb = zzgkVar.zza;
                        int i65 = zzgkVar.zzb;
                        iZzc = zzgkVar.zzc;
                        i24 = i65;
                    }
                }
                iZzc = -1;
                i24 = -1;
                iZzb = -1;
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
                zzgwVar.zzg();
            }
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                i17 += i17;
            }
            i22 = iZzc;
            f10 = f11;
            i21 = i24;
            i23 = iZzb;
        } else {
            f10 = 1.0f;
            i21 = -1;
            i22 = -1;
            i23 = -1;
        }
        return new zzgj(zzgdVar, i61, zzgeVar, i62, i60, i39, i37, i19, i17, i15, i16, f10, i36, i23, i21, i22);
    }

    public static zzgn zzh(byte[] bArr, int i10, int i11) {
        zzgw zzgwVar = new zzgw(bArr, 4, i11);
        int iZzg = zzgwVar.zzg();
        int iZzg2 = zzgwVar.zzg();
        zzgwVar.zza();
        return new zzgn(iZzg, iZzg2, zzgwVar.zze());
    }

    public static int zzi(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzgtj.zzi(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzj(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzj(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzj(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzk(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = zzgwm.zzd;
                zzgwj zzgwjVar = new zzgwj();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i12, length2, zArr);
                    if (iZzi != length2) {
                        zzgwjVar.zzf(Integer.valueOf(iZzi));
                    }
                    i12 = iZzi + 3;
                }
                zzgwm zzgwmVarZzi = zzgwjVar.zzi();
                for (int i13 = 0; i13 < zzgwmVarZzi.size(); i13++) {
                    if (((Integer) zzgwmVarZzi.get(i13)).intValue() + 3 < length) {
                        zzgw zzgwVar = new zzgw(bArr, ((Integer) zzgwmVarZzi.get(i13)).intValue() + 3, length);
                        zzgd zzgdVarZzl = zzl(zzgwVar);
                        if (zzgdVarZzl.zza == 33 && zzgdVarZzl.zzb == 0) {
                            zzgwVar.zzb(4);
                            int iZzf = zzgwVar.zzf(3);
                            zzgwVar.zza();
                            zzge zzgeVarZzm = zzm(zzgwVar, true, iZzf, null);
                            return zzdq.zzc(zzgeVarZzm.zza, zzgeVarZzm.zzb, zzgeVarZzm.zzc, zzgeVarZzm.zzd, zzgeVarZzm.zze, zzgeVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzgd zzl(zzgw zzgwVar) {
        zzgwVar.zza();
        return new zzgd(zzgwVar.zzf(6), zzgwVar.zzf(6), zzgwVar.zzf(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzge zzm(zzgw zzgwVar, boolean z10, int i10, zzge zzgeVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zZze;
        int iZzf;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (zzgeVar != null) {
                int i16 = zzgeVar.zza;
                zZze = zzgeVar.zzb;
                iZzf = zzgeVar.zzc;
                i14 = zzgeVar.zzd;
                iArr2 = zzgeVar.zze;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int iZzf2 = zzgwVar.zzf(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (zzgwVar.zze()) {
                    i15 += 88;
                }
                if (zzgwVar.zze()) {
                    i15 += 8;
                }
            }
            zzgwVar.zzb(i15);
            if (i10 > 0) {
                int i18 = 8 - i10;
                zzgwVar.zzb(i18 + i18);
            }
            return new zzge(i11, z11, i12, i13, iArr, iZzf2);
        }
        int iZzf3 = zzgwVar.zzf(2);
        zZze = zzgwVar.zze();
        iZzf = zzgwVar.zzf(5);
        i14 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (zzgwVar.zze()) {
                i14 |= 1 << i19;
            }
        }
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = zzgwVar.zzf(8);
        }
        i11 = iZzf3;
        iArr = iArr2;
        z11 = zZze;
        i12 = iZzf;
        i13 = i14;
        int iZzf4 = zzgwVar.zzf(8);
        i15 = 0;
        while (i17 < i10) {
            if (zzgwVar.zze()) {
                i15 += 88;
            }
            if (zzgwVar.zze()) {
                i15 += 8;
            }
        }
        zzgwVar.zzb(i15);
        if (i10 > 0) {
            int i110 = 8 - i10;
            zzgwVar.zzb(i110 + i110);
        }
        return new zzge(i11, z11, i12, i13, iArr, iZzf4);
    }

    private static int zzn(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    private static int zzo(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static void zzp(zzgw zzgwVar) {
        int iZzg = zzgwVar.zzg() + 1;
        zzgwVar.zzb(8);
        for (int i10 = 0; i10 < iZzg; i10++) {
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zza();
        }
        zzgwVar.zzb(20);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:116:0x0203  */
    /* JADX WARN: Code duplicated, block: B:119:0x020c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x0223  */
    /* JADX WARN: Code duplicated, block: B:128:0x022c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0233  */
    /* JADX WARN: Code duplicated, block: B:134:0x023f  */
    /* JADX WARN: Code duplicated, block: B:135:0x025c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Code duplicated, block: B:142:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166 A[PHI: r2
      0x0166: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v31 int) binds: [B:72:0x014f, B:74:0x0153, B:76:0x0157, B:78:0x015b, B:80:0x015f, B:83:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX WARN: Code duplicated, block: B:87:0x016d A[PHI: r2
      0x016d: PHI (r2v30 int) = (r2v4 int), (r2v3 int) binds: [B:85:0x0168, B:82:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    public static zzgo zze(byte[] bArr, int i10, int i11) {
        int iZzg;
        int i12;
        boolean zZze;
        int iZzg2;
        int iZzg3;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzh;
        int i17;
        int iZzg4;
        boolean z10;
        boolean zZze2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int iZzc;
        float f10;
        float f11;
        boolean zZze3;
        boolean zZze4;
        int iZzf;
        int iZzf2;
        int i27;
        int i28;
        zzgw zzgwVar = new zzgw(bArr, i10, i11);
        int iZzf3 = zzgwVar.zzf(8);
        int iZzf4 = zzgwVar.zzf(8);
        int iZzf5 = zzgwVar.zzf(8);
        int iZzg5 = zzgwVar.zzg();
        if (iZzf3 == 100 || iZzf3 == 110 || iZzf3 == 122 || iZzf3 == 244 || iZzf3 == 44 || iZzf3 == 83 || iZzf3 == 86 || iZzf3 == 118 || iZzf3 == 128) {
            iZzg = zzgwVar.zzg();
            if (iZzg == 3) {
                zZze = zzgwVar.zze();
                i12 = 3;
            } else {
                i12 = iZzg;
                zZze = false;
            }
            iZzg2 = zzgwVar.zzg();
            iZzg3 = zzgwVar.zzg();
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                if (i12 != 3) {
                    i13 = 8;
                } else {
                    i13 = 12;
                }
                for (i14 = 0; i14 < i13; i14++) {
                    if (!zzgwVar.zze()) {
                        if (i14 < 6) {
                            i15 = 16;
                        } else {
                            i15 = 64;
                        }
                        iZzh = 8;
                        i17 = 8;
                        for (i16 = 0; i16 < i15; i16++) {
                            if (iZzh != 0) {
                                iZzh = ((i17 + zzgwVar.zzh()) + UserVerificationMethods.USER_VERIFY_HANDPRINT) % UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            if (iZzh != 0) {
                                i17 = iZzh;
                            }
                        }
                    }
                }
            }
        } else if (iZzf3 == 138) {
            iZzf3 = 138;
            iZzg = zzgwVar.zzg();
            if (iZzg == 3) {
                zZze = zzgwVar.zze();
                i12 = 3;
            } else {
                i12 = iZzg;
                zZze = false;
            }
            iZzg2 = zzgwVar.zzg();
            iZzg3 = zzgwVar.zzg();
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                if (i12 != 3) {
                    i13 = 8;
                } else {
                    i13 = 12;
                }
                while (i14 < i13) {
                    if (!zzgwVar.zze()) {
                        if (i14 < 6) {
                            i15 = 16;
                        } else {
                            i15 = 64;
                        }
                        iZzh = 8;
                        i17 = 8;
                        while (i16 < i15) {
                            if (iZzh != 0) {
                                iZzh = ((i17 + zzgwVar.zzh()) + UserVerificationMethods.USER_VERIFY_HANDPRINT) % UserVerificationMethods.USER_VERIFY_HANDPRINT;
                            }
                            if (iZzh != 0) {
                                i17 = iZzh;
                            }
                        }
                    }
                }
            }
        } else {
            iZzg = 1;
            zZze = false;
            iZzg2 = 0;
            iZzg3 = 0;
        }
        int iZzg6 = zzgwVar.zzg() + 4;
        int iZzg7 = zzgwVar.zzg();
        if (iZzg7 != 0) {
            if (iZzg7 == 1) {
                boolean zZze5 = zzgwVar.zze();
                zzgwVar.zzh();
                zzgwVar.zzh();
                long jZzg = zzgwVar.zzg();
                for (int i29 = 0; i29 < jZzg; i29++) {
                    zzgwVar.zzg();
                }
                z10 = zZze5;
                iZzg7 = 1;
                iZzg4 = 0;
            } else {
                iZzg4 = 0;
            }
            int iZzg8 = zzgwVar.zzg();
            zzgwVar.zza();
            int iZzg9 = zzgwVar.zzg() + 1;
            int iZzg10 = zzgwVar.zzg() + 1;
            zZze2 = zzgwVar.zze();
            i18 = 2 - (zZze2 ? 1 : 0);
            if (!zZze2) {
                zzgwVar.zza();
            }
            zzgwVar.zza();
            i19 = iZzg9 * 16;
            i20 = iZzg10 * i18 * 16;
            if (zzgwVar.zze()) {
                int iZzg11 = zzgwVar.zzg();
                int iZzg12 = zzgwVar.zzg();
                int iZzg13 = zzgwVar.zzg();
                int iZzg14 = zzgwVar.zzg();
                if (iZzg == 0) {
                    i27 = 1;
                } else {
                    if (iZzg == 3) {
                        i27 = 1;
                    } else {
                        i27 = 2;
                    }
                    if (iZzg == 1) {
                        i28 = 2;
                    } else {
                        i28 = 1;
                    }
                    i18 *= i28;
                }
                i19 -= (iZzg11 + iZzg12) * i27;
                i20 -= (iZzg13 + iZzg14) * i18;
            }
            int i30 = i19;
            int i31 = i20;
            if (iZzf3 != 44 || iZzf3 == 86 || iZzf3 == 100 || iZzf3 == 110 || iZzf3 == 122) {
                if ((iZzf4 & 16) != 0) {
                    i21 = iZzf3;
                    i22 = 0;
                } else {
                    i21 = iZzf3;
                    i22 = 16;
                }
            } else if (iZzf3 == 244) {
                iZzf3 = 244;
                if ((iZzf4 & 16) != 0) {
                    i21 = iZzf3;
                    i22 = 0;
                } else {
                    i21 = iZzf3;
                    i22 = 16;
                }
            } else {
                i21 = iZzf3;
                i22 = 16;
            }
            i23 = -1;
            if (zzgwVar.zze()) {
                if (zzgwVar.zze()) {
                    iZzf = zzgwVar.zzf(8);
                    if (iZzf == 255) {
                        iZzf2 = zzgwVar.zzf(16);
                        int iZzf6 = zzgwVar.zzf(16);
                        if (iZzf2 != 0 || iZzf6 == 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = iZzf2 / iZzf6;
                        }
                    } else if (iZzf < 17) {
                        f11 = zzb[iZzf];
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                        sb2.append(wcAlQCOdREZdI.FJR);
                        sb2.append(iZzf);
                        zzeg.zzc("NalUnitUtil", sb2.toString());
                        f11 = 1.0f;
                    }
                } else {
                    f11 = 1.0f;
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zza();
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zzb(3);
                    int i32 = true != zzgwVar.zze() ? 2 : 1;
                    if (zzgwVar.zze()) {
                        int iZzf7 = zzgwVar.zzf(8);
                        int iZzf8 = zzgwVar.zzf(8);
                        zzgwVar.zzb(8);
                        int iZzb = zzi.zzb(iZzf7);
                        iZzc = zzi.zzc(iZzf8);
                        i25 = iZzb;
                    } else {
                        i25 = -1;
                        iZzc = -1;
                    }
                    i23 = i32;
                } else {
                    i25 = -1;
                    iZzc = -1;
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zzb(65);
                }
                zZze3 = zzgwVar.zze();
                if (zZze3) {
                    zzp(zzgwVar);
                }
                zZze4 = zzgwVar.zze();
                if (zZze4) {
                    zzp(zzgwVar);
                }
                if (zZze3 || zZze4) {
                    zzgwVar.zza();
                }
                zzgwVar.zza();
                if (zzgwVar.zze()) {
                    zzgwVar.zza();
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    int iZzg15 = zzgwVar.zzg();
                    zzgwVar.zzg();
                    i24 = iZzg15;
                } else {
                    i24 = i22;
                }
                i26 = i23;
                f10 = f11;
            } else {
                i24 = i22;
                i25 = -1;
                i26 = -1;
                iZzc = -1;
                f10 = 1.0f;
            }
            return new zzgo(i21, iZzf4, iZzf5, iZzg5, iZzg8, i30, i31, f10, iZzg2, iZzg3, zZze, zZze2, iZzg6, iZzg7, iZzg4, z10, i25, i26, iZzc, i24);
        }
        iZzg4 = zzgwVar.zzg() + 4;
        z10 = false;
        int iZzg16 = zzgwVar.zzg();
        zzgwVar.zza();
        int iZzg17 = zzgwVar.zzg() + 1;
        int iZzg18 = zzgwVar.zzg() + 1;
        zZze2 = zzgwVar.zze();
        i18 = 2 - (zZze2 ? 1 : 0);
        if (!zZze2) {
            zzgwVar.zza();
        }
        zzgwVar.zza();
        i19 = iZzg17 * 16;
        i20 = iZzg18 * i18 * 16;
        if (zzgwVar.zze()) {
            int iZzg19 = zzgwVar.zzg();
            int iZzg110 = zzgwVar.zzg();
            int iZzg111 = zzgwVar.zzg();
            int iZzg112 = zzgwVar.zzg();
            if (iZzg == 0) {
                i27 = 1;
            } else {
                if (iZzg == 3) {
                    i27 = 1;
                } else {
                    i27 = 2;
                }
                if (iZzg == 1) {
                    i28 = 2;
                } else {
                    i28 = 1;
                }
                i18 *= i28;
            }
            i19 -= (iZzg19 + iZzg110) * i27;
            i20 -= (iZzg111 + iZzg112) * i18;
        }
        int i33 = i19;
        int i34 = i20;
        if (iZzf3 != 44) {
            if ((iZzf4 & 16) != 0) {
                i21 = iZzf3;
                i22 = 0;
            } else {
                i21 = iZzf3;
                i22 = 16;
            }
        } else if ((iZzf4 & 16) != 0) {
            i21 = iZzf3;
            i22 = 0;
        } else {
            i21 = iZzf3;
            i22 = 16;
        }
        i23 = -1;
        if (zzgwVar.zze()) {
            if (zzgwVar.zze()) {
                f11 = 1.0f;
            } else {
                iZzf = zzgwVar.zzf(8);
                if (iZzf == 255) {
                    iZzf2 = zzgwVar.zzf(16);
                    int iZzf9 = zzgwVar.zzf(16);
                    if (iZzf2 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 1.0f;
                    }
                } else if (iZzf < 17) {
                    f11 = zzb[iZzf];
                } else {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                    sb3.append(wcAlQCOdREZdI.FJR);
                    sb3.append(iZzf);
                    zzeg.zzc("NalUnitUtil", sb3.toString());
                    f11 = 1.0f;
                }
            }
            if (zzgwVar.zze()) {
                zzgwVar.zza();
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzb(3);
                if (true != zzgwVar.zze()) {
                }
                if (zzgwVar.zze()) {
                    int iZzf10 = zzgwVar.zzf(8);
                    int iZzf11 = zzgwVar.zzf(8);
                    zzgwVar.zzb(8);
                    int iZzb2 = zzi.zzb(iZzf10);
                    iZzc = zzi.zzc(iZzf11);
                    i25 = iZzb2;
                } else {
                    i25 = -1;
                    iZzc = -1;
                }
                i23 = i32;
            } else {
                i25 = -1;
                iZzc = -1;
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
                zzgwVar.zzg();
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzb(65);
            }
            zZze3 = zzgwVar.zze();
            if (zZze3) {
                zzp(zzgwVar);
            }
            zZze4 = zzgwVar.zze();
            if (zZze4) {
                zzp(zzgwVar);
            }
            if (zZze3) {
                zzgwVar.zza();
            } else {
                zzgwVar.zza();
            }
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                zzgwVar.zza();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                int iZzg113 = zzgwVar.zzg();
                zzgwVar.zzg();
                i24 = iZzg113;
            } else {
                i24 = i22;
            }
            i26 = i23;
            f10 = f11;
        } else {
            i24 = i22;
            i25 = -1;
            i26 = -1;
            iZzc = -1;
            f10 = 1.0f;
        }
        return new zzgo(i21, iZzf4, iZzf5, iZzg5, iZzg16, i33, i34, f10, iZzg2, iZzg3, zZze, zZze2, iZzg6, iZzg7, iZzg4, z10, i25, i26, iZzc, i24);
    }

    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzp;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith(RHIpdOnfgiYkEj.hSbYTtFDfh)) {
                return "video/hevc";
            }
        }
        return str2;
    }
}
