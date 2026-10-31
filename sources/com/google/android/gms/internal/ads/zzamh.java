package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzamh {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzahf zza(zzafz zzafzVar) throws IOException {
        return zzc(zzafzVar, true);
    }

    public static zzahf zzb(zzafz zzafzVar) throws IOException {
        return zzc(zzafzVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    private static zzahf zzc(zzafz zzafzVar, boolean z10) throws IOException {
        long jZzD;
        int i10;
        zzet zzetVar;
        int i11;
        boolean z11;
        int[] iArr;
        long jZzo = zzafzVar.zzo();
        long j10 = -1;
        long j11 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j11 = jZzo;
        }
        zzet zzetVar2 = new zzet(64);
        int i12 = (int) j11;
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        while (i14 < i12) {
            zzetVar2.zza(8);
            if (!zzafzVar.zzh(zzetVar2.zzi(), i13, 8, true)) {
                break;
            }
            long jZzz = zzetVar2.zzz();
            int iZzB = zzetVar2.zzB();
            if (jZzz == 1) {
                zzafzVar.zzi(zzetVar2.zzi(), 8, 8);
                i10 = 16;
                zzetVar2.zzf(16);
                jZzD = zzetVar2.zzD();
            } else {
                if (jZzz == 0) {
                    long jZzo2 = zzafzVar.zzo();
                    if (jZzo2 != j10) {
                        jZzz = (jZzo2 - zzafzVar.zzm()) + 8;
                    }
                }
                jZzD = jZzz;
                i10 = 8;
            }
            long j12 = i10;
            if (jZzD < j12) {
                if (iZzB == 1718773093) {
                    if (i10 == 8) {
                        iZzB = 1718773093;
                        jZzD = 8;
                    } else {
                        iZzB = 1718773093;
                    }
                }
                return new zzakx(iZzB, jZzD, i10);
            }
            i14 += i10;
            if (iZzB == 1836019574) {
                i12 += (int) jZzD;
                if (jZzo != -1 && i12 > jZzo) {
                    i12 = (int) jZzo;
                }
                if (iZzB == 1836019574) {
                    zzetVar2 = zzetVar2;
                    j10 = -1;
                    i13 = 0;
                } else {
                    if (iZzB != 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                        zzetVar = zzetVar2;
                        i11 = 0;
                    } else {
                        if (iZzB == 1836019558 || iZzB == 1836475768) {
                            i13 = 1;
                            break;
                        }
                        z12 |= !(iZzB != 1835295092);
                        if (iZzB == 1937007212) {
                            if (jZzD <= 1000000) {
                                iZzB = 1937007212;
                            }
                            i13 = 0;
                            break;
                        }
                        if ((((long) i14) + jZzD) - j12 >= i12) {
                            i13 = 0;
                            break;
                        }
                        int i15 = (int) (jZzD - j12);
                        i14 += i15;
                        if (iZzB != 1718909296) {
                            zzetVar = zzetVar2;
                            i11 = 0;
                            if (i15 != 0) {
                                zzafzVar.zzk(i15);
                            }
                        } else {
                            if (i15 < 8) {
                                return new zzakx(1718909296, i15, 8);
                            }
                            zzetVar = zzetVar2;
                            zzetVar.zza(i15);
                            i11 = 0;
                            zzafzVar.zzi(zzetVar.zzi(), 0, i15);
                            int iZzB2 = zzetVar.zzB();
                            boolean zZzd = zzd(iZzB2) | z12;
                            zzetVar.zzk(4);
                            int iZzd = zzetVar.zzd() / 4;
                            if (!zZzd && iZzd > 0) {
                                int[] iArr2 = new int[iZzd];
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= iZzd) {
                                        z11 = zZzd;
                                        iArr = iArr2;
                                        break;
                                    }
                                    int iZzB3 = zzetVar.zzB();
                                    iArr2[i16] = iZzB3;
                                    if (zzd(iZzB3)) {
                                        iArr = iArr2;
                                        z11 = true;
                                        break;
                                    }
                                    i16++;
                                }
                            } else {
                                z11 = zZzd;
                                iArr = null;
                            }
                            if (!z11) {
                                return new zzamm(iZzB2, iArr);
                            }
                            z12 = z11;
                        }
                    }
                    i13 = i11;
                    zzetVar2 = zzetVar;
                    j10 = -1;
                }
            } else {
                if (iZzB == 1970628964) {
                    iZzB = 1970628964;
                    i12 += (int) jZzD;
                    if (jZzo != -1) {
                        i12 = (int) jZzo;
                    }
                    if (iZzB == 1836019574) {
                        zzetVar2 = zzetVar2;
                        j10 = -1;
                        i13 = 0;
                    }
                }
                if (iZzB != 1953653099) {
                    zzetVar = zzetVar2;
                    i11 = 0;
                } else {
                    zzetVar = zzetVar2;
                    i11 = 0;
                }
                i13 = i11;
                zzetVar2 = zzetVar;
                j10 = -1;
            }
        }
        if (!z12) {
            return zzamd.zza;
        }
        if (z10 != i13) {
            return i13 != 0 ? zzals.zza : zzals.zzb;
        }
        return null;
    }

    private static boolean zzd(int i10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        int[] iArr = zza;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
