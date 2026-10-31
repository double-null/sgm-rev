package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzalr implements zzafy {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzalq zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzagb zzI;
    private zzahk[] zzJ;
    private zzahk[] zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private long zzO;
    private final zzanj zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzet zzg;
    private final zzet zzh;
    private final zzet zzi;
    private final byte[] zzj;
    private final zzet zzk;
    private final zzajb zzl;
    private final zzet zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgz zzp;
    private final zzafn zzq;
    private zzgwm zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzet zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i10 = zzalm.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzo("application/x-emsg");
        zzb = zztVar.zzO();
    }

    @Deprecated
    public zzalr() {
        this(zzanj.zza, 32, null, null, zzgwm.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:146:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x040f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0418  */
    /* JADX WARN: Code duplicated, block: B:151:0x0421  */
    /* JADX WARN: Code duplicated, block: B:152:0x042a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0433  */
    /* JADX WARN: Code duplicated, block: B:156:0x043a  */
    /* JADX WARN: Code duplicated, block: B:157:0x043c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x043e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0442  */
    /* JADX WARN: Code duplicated, block: B:160:0x0443 A[PHI: r2
      0x0443: PHI (r2v43 int) = (r2v42 int), (r2v44 int) binds: [B:156:0x043a, B:159:0x0442] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0447  */
    /* JADX WARN: Code duplicated, block: B:163:0x0454  */
    /* JADX WARN: Code duplicated, block: B:166:0x0472  */
    /* JADX WARN: Code duplicated, block: B:167:0x0480  */
    /* JADX WARN: Code duplicated, block: B:170:0x0492 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0494 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0496  */
    /* JADX WARN: Code duplicated, block: B:173:0x049a  */
    /* JADX WARN: Code duplicated, block: B:174:0x049e  */
    private final void zzj(long j10) throws zzat {
        zzap zzapVar;
        SparseArray sparseArray;
        int i10;
        zzfx zzfxVar;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        byte[] bArr3;
        int i15;
        boolean z10;
        int i16;
        List list;
        zzalq zzalqVar;
        zzalq zzalqVar2;
        zzet zzetVar;
        int i17;
        long j11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z11;
        int i18;
        long j12;
        boolean z12;
        long j13;
        int i19;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzv;
        zzalq zzalqVar3;
        int i20;
        boolean z13;
        long[] jArr2;
        final zzalr zzalrVar = this;
        while (true) {
            ArrayDeque arrayDeque = zzalrVar.zzn;
            if (arrayDeque.isEmpty() || ((zzfx) arrayDeque.peek()).zza != j10) {
                break;
            }
            zzfx zzfxVar2 = (zzfx) arrayDeque.pop();
            int i21 = zzfxVar2.zzd;
            int i22 = 12;
            int i23 = 8;
            if (i21 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfxVar2.zzb);
                zzfx zzfxVarZzd = zzfxVar2.zzd(1836475768);
                zzfxVarZzd.getClass();
                SparseArray sparseArray2 = new SparseArray();
                List list2 = zzfxVarZzd.zzb;
                int size = list2.size();
                int i24 = 0;
                long jZzz = -9223372036854775807L;
                while (i24 < size) {
                    zzfy zzfyVar = (zzfy) list2.get(i24);
                    int i25 = zzfyVar.zzd;
                    if (i25 == 1953654136) {
                        zzet zzetVar2 = zzfyVar.zza;
                        zzetVar2.zzh(i22);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzetVar2.zzB()), new zzalk(zzetVar2.zzB() - 1, zzetVar2.zzB(), zzetVar2.zzB(), zzetVar2.zzB()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzalk) pairCreate.second);
                    } else if (i25 == 1835362404) {
                        zzet zzetVar3 = zzfyVar.zza;
                        zzetVar3.zzh(8);
                        jZzz = zzalj.zza(zzetVar3.zzB()) == 0 ? zzetVar3.zzz() : zzetVar3.zzJ();
                    }
                    i24++;
                    i22 = 12;
                }
                zzfx zzfxVarZzd2 = zzfxVar2.zzd(1835365473);
                zzap zzapVarZze = zzfxVarZzd2 != null ? zzalj.zze(zzfxVarZzd2) : null;
                zzagr zzagrVar = new zzagr();
                zzfy zzfyVarZzc = zzfxVar2.zzc(1969517665);
                if (zzfyVarZzc != null) {
                    zzap zzapVarZzc = zzalj.zzc(zzfyVarZzc);
                    zzagrVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfy zzfyVarZzc2 = zzfxVar2.zzc(1836476516);
                zzfyVarZzc2.getClass();
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzalj.zzd(zzfyVarZzc2.zza));
                List listZzb = zzalj.zzb(zzfxVar2, zzagrVar, jZzz, zzqVarZzn, (zzalrVar.zzd & 16) != 0, false, new zzgta(zzalrVar) { // from class: com.google.android.gms.internal.ads.zzall
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzami) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray3 = zzalrVar.zzf;
                if (sparseArray3.size() == 0) {
                    String strZza = zzalu.zza(listZzb);
                    int i26 = 0;
                    while (i26 < size2) {
                        zzaml zzamlVar = (zzaml) listZzb.get(i26);
                        zzami zzamiVar = zzamlVar.zza;
                        zzagb zzagbVar = zzalrVar.zzI;
                        int i27 = zzamiVar.zzb;
                        zzahk zzahkVarZzu = zzagbVar.zzu(i26, i27);
                        long j14 = zzamiVar.zze;
                        zzahkVarZzu.zzO(j14);
                        List list3 = listZzb;
                        zzv zzvVar = zzamiVar.zzg;
                        int i28 = size2;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(strZza);
                        zzalt.zzb(i27, zzagrVar, zztVarZza);
                        zzalt.zza(i27, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVar, zzapVar2);
                        int i29 = zzamiVar.zza;
                        sparseArray3.put(i29, new zzalq(zzahkVarZzu, zzamlVar, zzp(sparseArray2, i29), zztVarZza.zzO()));
                        zzalrVar.zzA = Math.max(zzalrVar.zzA, j14);
                        i26++;
                        listZzb = list3;
                        size2 = i28;
                        strZza = strZza;
                        zzagrVar = zzagrVar;
                    }
                    zzalrVar.zzI.zzv();
                } else {
                    zzgtj.zzi(sparseArray3.size() == size2);
                    for (int i30 = 0; i30 < size2; i30++) {
                        zzaml zzamlVar2 = (zzaml) listZzb.get(i30);
                        int i31 = zzamlVar2.zza.zza;
                        ((zzalq) sparseArray3.get(i31)).zza(zzamlVar2, zzp(sparseArray2, i31));
                    }
                }
            } else if (i21 == 1836019558) {
                SparseArray sparseArray4 = zzalrVar.zzf;
                int i32 = zzalrVar.zzd;
                byte[] bArr4 = zzalrVar.zzj;
                List list4 = zzfxVar2.zzc;
                int size3 = list4.size();
                int i33 = 0;
                while (i33 < size3) {
                    zzfx zzfxVar3 = (zzfx) list4.get(i33);
                    if (zzfxVar3.zzd == 1953653094) {
                        zzfy zzfyVarZzc3 = zzfxVar3.zzc(1952868452);
                        zzfyVarZzc3.getClass();
                        zzet zzetVar4 = zzfyVarZzc3.zza;
                        zzetVar4.zzh(i23);
                        int iZzB5 = zzetVar4.zzB() & 16777215;
                        int i34 = zzalj.zza;
                        zzalq zzalqVar4 = (zzalq) sparseArray4.get(zzetVar4.zzB());
                        if (zzalqVar4 == null) {
                            zzalqVar4 = null;
                        } else {
                            if ((iZzB5 & 1) != 0) {
                                long jZzJ = zzetVar4.zzJ();
                                zzamk zzamkVar = zzalqVar4.zzb;
                                zzamkVar.zzb = jZzJ;
                                zzamkVar.zzc = jZzJ;
                            }
                            zzalk zzalkVar = zzalqVar4.zze;
                            zzalqVar4.zzb.zza = new zzalk((iZzB5 & 2) != 0 ? zzetVar4.zzB() - 1 : zzalkVar.zza, (iZzB5 & 8) != 0 ? zzetVar4.zzB() : zzalkVar.zzb, (iZzB5 & 16) != 0 ? zzetVar4.zzB() : zzalkVar.zzc, (iZzB5 & 32) != 0 ? zzetVar4.zzB() : zzalkVar.zzd);
                        }
                        if (zzalqVar4 == null) {
                            sparseArray = sparseArray4;
                            i10 = i32;
                            zzfxVar = zzfxVar2;
                            bArr = bArr4;
                            i11 = size3;
                            i12 = i33;
                        } else {
                            zzamk zzamkVar2 = zzalqVar4.zzb;
                            long j15 = zzamkVar2.zzp;
                            boolean z14 = zzamkVar2.zzq;
                            zzalqVar4.zzc();
                            zzalqVar4.zzl(true);
                            zzfy zzfyVarZzc4 = zzfxVar3.zzc(1952867444);
                            if (zzfyVarZzc4 == null || (i32 & 2) != 0) {
                                zzamkVar2.zzp = j15;
                                zzamkVar2.zzq = z14;
                            } else {
                                zzet zzetVar5 = zzfyVarZzc4.zza;
                                zzetVar5.zzh(8);
                                zzamkVar2.zzp = zzalj.zza(zzetVar5.zzB()) == 1 ? zzetVar5.zzJ() : zzetVar5.zzz();
                                zzamkVar2.zzq = true;
                            }
                            List list5 = zzfxVar3.zzb;
                            int size4 = list5.size();
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            while (true) {
                                i14 = 1953658222;
                                if (i35 >= size4) {
                                    break;
                                }
                                int i38 = size3;
                                zzfy zzfyVar2 = (zzfy) list5.get(i35);
                                if (zzfyVar2.zzd == 1953658222) {
                                    zzet zzetVar6 = zzfyVar2.zza;
                                    zzetVar6.zzh(12);
                                    int iZzH = zzetVar6.zzH();
                                    if (iZzH > 0) {
                                        i37 += iZzH;
                                        i36++;
                                    }
                                }
                                i35++;
                                size3 = i38;
                            }
                            i11 = size3;
                            zzalqVar4.zzh = 0;
                            zzalqVar4.zzg = 0;
                            zzalqVar4.zzf = 0;
                            zzamkVar2.zzd = i36;
                            zzamkVar2.zze = i37;
                            if (zzamkVar2.zzg.length < i36) {
                                zzamkVar2.zzf = new long[i36];
                                zzamkVar2.zzg = new int[i36];
                            }
                            if (zzamkVar2.zzh.length < i37) {
                                int i39 = (i37 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                zzamkVar2.zzh = new int[i39];
                                zzamkVar2.zzi = new long[i39];
                                zzamkVar2.zzj = new boolean[i39];
                                zzamkVar2.zzl = new boolean[i39];
                            }
                            int i40 = 0;
                            int i41 = 0;
                            int i42 = 0;
                            while (i40 < size4) {
                                zzfy zzfyVar3 = (zzfy) list5.get(i40);
                                if (zzfyVar3.zzd == i14) {
                                    int i43 = i41 + 1;
                                    zzet zzetVar7 = zzfyVar3.zza;
                                    zzetVar7.zzh(8);
                                    int iZzB6 = zzetVar7.zzB() & 16777215;
                                    zzami zzamiVar2 = zzalqVar4.zzd.zza;
                                    zzalk zzalkVar2 = zzamkVar2.zza;
                                    String str = zzfl.zza;
                                    zzamkVar2.zzg[i41] = zzetVar7.zzH();
                                    long[] jArr3 = zzamkVar2.zzf;
                                    long j16 = zzamkVar2.zzb;
                                    jArr3[i41] = j16;
                                    if ((iZzB6 & 1) != 0) {
                                        jArr3[i41] = j16 + ((long) zzetVar7.zzB());
                                    }
                                    boolean z15 = (iZzB6 & 4) != 0;
                                    int i44 = zzalkVar2.zzd;
                                    int iZzB7 = z15 ? zzetVar7.zzB() : i44;
                                    int i45 = iZzB6 & UserVerificationMethods.USER_VERIFY_HANDPRINT;
                                    int i46 = iZzB6 & 512;
                                    int i47 = iZzB6 & 1024;
                                    int i48 = iZzB6 & 2048;
                                    int i49 = iZzB7;
                                    long[] jArr4 = zzamiVar2.zzi;
                                    if (jArr4 != null) {
                                        list = list5;
                                        i16 = i40;
                                        if (jArr4.length != 1 || (jArr2 = zzamiVar2.zzj) == null) {
                                            i17 = i48;
                                            zzalqVar2 = zzalqVar4;
                                            zzetVar = zzetVar7;
                                        } else {
                                            long j17 = jArr4[0];
                                            if (j17 == 0) {
                                                i17 = i48;
                                                zzalqVar2 = zzalqVar4;
                                                zzetVar = zzetVar7;
                                            } else {
                                                i17 = i48;
                                                zzalqVar2 = zzalqVar4;
                                                zzetVar = zzetVar7;
                                                if (zzfl.zzv(j17, 1000000L, zzamiVar2.zzd, RoundingMode.DOWN) + zzfl.zzv(jArr2[0], 1000000L, zzamiVar2.zzc, RoundingMode.DOWN) < zzamiVar2.zze) {
                                                }
                                                iArr = zzamkVar2.zzh;
                                                jArr = zzamkVar2.zzi;
                                                zArr = zzamkVar2.zzj;
                                                if (zzamiVar2.zzb == 2 || (i32 & 1) == 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                i18 = zzamkVar2.zzg[i41] + i42;
                                                j12 = zzamiVar2.zzc;
                                                z12 = z11;
                                                j13 = zzamkVar2.zzp;
                                                i19 = i42;
                                                while (i19 < i18) {
                                                    if (i45 != 0) {
                                                        iZzB = zzetVar.zzB();
                                                    } else {
                                                        iZzB = zzalkVar2.zzb;
                                                    }
                                                    zzk(iZzB);
                                                    if (i46 != 0) {
                                                        iZzB2 = zzetVar.zzB();
                                                    } else {
                                                        iZzB2 = zzalkVar2.zzc;
                                                    }
                                                    zzk(iZzB2);
                                                    if (i47 != 0) {
                                                        iZzB3 = zzetVar.zzB();
                                                    } else if (i19 != 0) {
                                                        iZzB3 = i44;
                                                    } else if (z15) {
                                                        iZzB3 = i49;
                                                        i19 = 0;
                                                    } else {
                                                        i19 = 0;
                                                        iZzB3 = i44;
                                                    }
                                                    if (i17 != 0) {
                                                        iZzB4 = zzetVar.zzB();
                                                    } else {
                                                        iZzB4 = 0;
                                                    }
                                                    jZzv = zzfl.zzv((((long) iZzB4) + j13) - j11, 1000000L, j12, RoundingMode.DOWN);
                                                    jArr[i19] = jZzv;
                                                    int i50 = i47;
                                                    if (zzamkVar2.zzq) {
                                                        zzalqVar3 = zzalqVar2;
                                                    } else {
                                                        zzalqVar3 = zzalqVar2;
                                                        jArr[i19] = jZzv + zzalqVar3.zzd.zzi;
                                                    }
                                                    iArr[i19] = iZzB2;
                                                    if (((iZzB3 >> 16) & 1) != 0) {
                                                        i20 = i19;
                                                        z13 = false;
                                                    } else if (!z12) {
                                                        i20 = i19;
                                                        z13 = true;
                                                    } else if (i19 == 0) {
                                                        z13 = true;
                                                        i20 = 0;
                                                    } else {
                                                        i20 = i19;
                                                        z13 = false;
                                                    }
                                                    zArr[i20] = z13;
                                                    j13 += (long) iZzB;
                                                    i19 = i20 + 1;
                                                    zzalqVar2 = zzalqVar3;
                                                    i47 = i50;
                                                    i17 = i17;
                                                    j12 = j12;
                                                    i18 = i18;
                                                    i45 = i45;
                                                    z15 = z15;
                                                    zArr = zArr;
                                                }
                                                int i51 = i18;
                                                zzalqVar = zzalqVar2;
                                                zzamkVar2.zzp = j13;
                                                i41 = i43;
                                                i42 = i51;
                                            }
                                            j11 = jArr2[0];
                                            iArr = zzamkVar2.zzh;
                                            jArr = zzamkVar2.zzi;
                                            zArr = zzamkVar2.zzj;
                                            if (zzamiVar2.zzb == 2) {
                                                z11 = false;
                                            } else {
                                                z11 = false;
                                            }
                                            i18 = zzamkVar2.zzg[i41] + i42;
                                            j12 = zzamiVar2.zzc;
                                            z12 = z11;
                                            j13 = zzamkVar2.zzp;
                                            i19 = i42;
                                            while (i19 < i18) {
                                                if (i45 != 0) {
                                                    iZzB = zzetVar.zzB();
                                                } else {
                                                    iZzB = zzalkVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i46 != 0) {
                                                    iZzB2 = zzetVar.zzB();
                                                } else {
                                                    iZzB2 = zzalkVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i47 != 0) {
                                                    iZzB3 = zzetVar.zzB();
                                                } else if (i19 != 0) {
                                                    iZzB3 = i44;
                                                } else if (z15) {
                                                    iZzB3 = i49;
                                                    i19 = 0;
                                                } else {
                                                    i19 = 0;
                                                    iZzB3 = i44;
                                                }
                                                if (i17 != 0) {
                                                    iZzB4 = zzetVar.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                jZzv = zzfl.zzv((((long) iZzB4) + j13) - j11, 1000000L, j12, RoundingMode.DOWN);
                                                jArr[i19] = jZzv;
                                                int i52 = i47;
                                                if (zzamkVar2.zzq) {
                                                    zzalqVar3 = zzalqVar2;
                                                    jArr[i19] = jZzv + zzalqVar3.zzd.zzi;
                                                } else {
                                                    zzalqVar3 = zzalqVar2;
                                                }
                                                iArr[i19] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    i20 = i19;
                                                    z13 = false;
                                                } else if (!z12) {
                                                    i20 = i19;
                                                    z13 = true;
                                                } else if (i19 == 0) {
                                                    z13 = true;
                                                    i20 = 0;
                                                } else {
                                                    i20 = i19;
                                                    z13 = false;
                                                }
                                                zArr[i20] = z13;
                                                j13 += (long) iZzB;
                                                i19 = i20 + 1;
                                                zzalqVar2 = zzalqVar3;
                                                i47 = i52;
                                                i17 = i17;
                                                j12 = j12;
                                                i18 = i18;
                                                i45 = i45;
                                                z15 = z15;
                                                zArr = zArr;
                                            }
                                            int i53 = i18;
                                            zzalqVar = zzalqVar2;
                                            zzamkVar2.zzp = j13;
                                            i41 = i43;
                                            i42 = i53;
                                        }
                                    } else {
                                        i16 = i40;
                                        list = list5;
                                        zzalqVar2 = zzalqVar4;
                                        zzetVar = zzetVar7;
                                        i17 = i48;
                                    }
                                    j11 = 0;
                                    iArr = zzamkVar2.zzh;
                                    jArr = zzamkVar2.zzi;
                                    zArr = zzamkVar2.zzj;
                                    if (zzamiVar2.zzb == 2) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    i18 = zzamkVar2.zzg[i41] + i42;
                                    j12 = zzamiVar2.zzc;
                                    z12 = z11;
                                    j13 = zzamkVar2.zzp;
                                    i19 = i42;
                                    while (i19 < i18) {
                                        if (i45 != 0) {
                                            iZzB = zzetVar.zzB();
                                        } else {
                                            iZzB = zzalkVar2.zzb;
                                        }
                                        zzk(iZzB);
                                        if (i46 != 0) {
                                            iZzB2 = zzetVar.zzB();
                                        } else {
                                            iZzB2 = zzalkVar2.zzc;
                                        }
                                        zzk(iZzB2);
                                        if (i47 != 0) {
                                            iZzB3 = zzetVar.zzB();
                                        } else if (i19 != 0) {
                                            iZzB3 = i44;
                                        } else if (z15) {
                                            iZzB3 = i49;
                                            i19 = 0;
                                        } else {
                                            i19 = 0;
                                            iZzB3 = i44;
                                        }
                                        if (i17 != 0) {
                                            iZzB4 = zzetVar.zzB();
                                        } else {
                                            iZzB4 = 0;
                                        }
                                        jZzv = zzfl.zzv((((long) iZzB4) + j13) - j11, 1000000L, j12, RoundingMode.DOWN);
                                        jArr[i19] = jZzv;
                                        int i54 = i47;
                                        if (zzamkVar2.zzq) {
                                            zzalqVar3 = zzalqVar2;
                                            jArr[i19] = jZzv + zzalqVar3.zzd.zzi;
                                        } else {
                                            zzalqVar3 = zzalqVar2;
                                        }
                                        iArr[i19] = iZzB2;
                                        if (((iZzB3 >> 16) & 1) != 0) {
                                            i20 = i19;
                                            z13 = false;
                                        } else if (!z12) {
                                            i20 = i19;
                                            z13 = true;
                                        } else if (i19 == 0) {
                                            z13 = true;
                                            i20 = 0;
                                        } else {
                                            i20 = i19;
                                            z13 = false;
                                        }
                                        zArr[i20] = z13;
                                        j13 += (long) iZzB;
                                        i19 = i20 + 1;
                                        zzalqVar2 = zzalqVar3;
                                        i47 = i54;
                                        i17 = i17;
                                        j12 = j12;
                                        i18 = i18;
                                        i45 = i45;
                                        z15 = z15;
                                        zArr = zArr;
                                    }
                                    int i55 = i18;
                                    zzalqVar = zzalqVar2;
                                    zzamkVar2.zzp = j13;
                                    i41 = i43;
                                    i42 = i55;
                                } else {
                                    i16 = i40;
                                    i33 = i33;
                                    zzfxVar3 = zzfxVar3;
                                    list = list5;
                                    zzalqVar = zzalqVar4;
                                }
                                i40 = i16 + 1;
                                zzalqVar4 = zzalqVar;
                                size4 = size4;
                                sparseArray4 = sparseArray4;
                                zzfxVar2 = zzfxVar2;
                                bArr4 = bArr4;
                                i33 = i33;
                                zzfxVar3 = zzfxVar3;
                                list5 = list;
                                i32 = i32;
                                i14 = 1953658222;
                            }
                            sparseArray = sparseArray4;
                            i10 = i32;
                            zzfxVar = zzfxVar2;
                            byte[] bArr5 = bArr4;
                            i12 = i33;
                            zzfx zzfxVar4 = zzfxVar3;
                            List list6 = list5;
                            zzami zzamiVar3 = zzalqVar4.zzd.zza;
                            zzalk zzalkVar3 = zzamkVar2.zza;
                            zzalkVar3.getClass();
                            zzamj zzamjVarZza = zzamiVar3.zza(zzalkVar3.zza);
                            zzfy zzfyVarZzc5 = zzfxVar4.zzc(1935763834);
                            if (zzfyVarZzc5 != null) {
                                zzamjVarZza.getClass();
                                int i56 = zzamjVarZza.zzd;
                                zzet zzetVar8 = zzfyVarZzc5.zza;
                                zzetVar8.zzh(8);
                                if ((zzetVar8.zzB() & 1) == 1) {
                                    zzetVar8.zzk(8);
                                }
                                int iZzs = zzetVar8.zzs();
                                int iZzH2 = zzetVar8.zzH();
                                int i57 = zzamkVar2.zze;
                                if (iZzH2 > i57) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i57).length());
                                    sb2.append("Saiz sample count ");
                                    sb2.append(iZzH2);
                                    sb2.append(" is greater than fragment sample count");
                                    sb2.append(i57);
                                    throw zzat.zzb(sb2.toString(), null);
                                }
                                if (iZzs == 0) {
                                    boolean[] zArr2 = zzamkVar2.zzl;
                                    i15 = 0;
                                    for (int i58 = 0; i58 < iZzH2; i58++) {
                                        int iZzs2 = zzetVar8.zzs();
                                        i15 += iZzs2;
                                        zArr2[i58] = iZzs2 > i56;
                                    }
                                    z10 = false;
                                } else {
                                    boolean z16 = iZzs > i56;
                                    i15 = iZzs * iZzH2;
                                    z10 = false;
                                    Arrays.fill(zzamkVar2.zzl, 0, iZzH2, z16);
                                }
                                Arrays.fill(zzamkVar2.zzl, iZzH2, zzamkVar2.zze, z10);
                                if (i15 > 0) {
                                    zzamkVar2.zza(i15);
                                }
                            }
                            zzfy zzfyVarZzc6 = zzfxVar4.zzc(1935763823);
                            if (zzfyVarZzc6 != null) {
                                zzet zzetVar9 = zzfyVarZzc6.zza;
                                zzetVar9.zzh(8);
                                int iZzB8 = zzetVar9.zzB();
                                if ((iZzB8 & 1) == 1) {
                                    zzetVar9.zzk(8);
                                }
                                int iZzH3 = zzetVar9.zzH();
                                if (iZzH3 != 1) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                    sb3.append("Unexpected saio entry count: ");
                                    sb3.append(iZzH3);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                zzamkVar2.zzc += zzalj.zza(iZzB8) == 0 ? zzetVar9.zzz() : zzetVar9.zzJ();
                            }
                            zzfy zzfyVarZzc7 = zzfxVar4.zzc(1936027235);
                            if (zzfyVarZzc7 != null) {
                                zzl(zzfyVarZzc7.zza, 0, zzamkVar2);
                            }
                            String str2 = zzamjVarZza != null ? zzamjVarZza.zzb : null;
                            zzet zzetVar10 = null;
                            zzet zzetVar11 = null;
                            int i59 = 0;
                            while (i59 < list6.size()) {
                                List list7 = list6;
                                zzfy zzfyVar4 = (zzfy) list7.get(i59);
                                zzet zzetVar12 = zzfyVar4.zza;
                                int i60 = zzfyVar4.zzd;
                                if (i60 == 1935828848) {
                                    zzetVar12.zzh(12);
                                    if (zzetVar12.zzB() == 1936025959) {
                                        zzetVar10 = zzetVar12;
                                    }
                                } else if (i60 == 1936158820) {
                                    zzetVar12.zzh(12);
                                    if (zzetVar12.zzB() == 1936025959) {
                                        zzetVar11 = zzetVar12;
                                    }
                                }
                                i59++;
                                list6 = list7;
                            }
                            List list8 = list6;
                            if (zzetVar10 != null && zzetVar11 != null) {
                                zzetVar10.zzh(8);
                                int iZza = zzalj.zza(zzetVar10.zzB());
                                zzetVar10.zzk(4);
                                if (iZza == 1) {
                                    zzetVar10.zzk(4);
                                }
                                if (zzetVar10.zzB() != 1) {
                                    throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                }
                                zzetVar11.zzh(8);
                                int iZza2 = zzalj.zza(zzetVar11.zzB());
                                zzetVar11.zzk(4);
                                if (iZza2 == 1) {
                                    if (zzetVar11.zzz() == 0) {
                                        throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iZza2 >= 2) {
                                    zzetVar11.zzk(4);
                                }
                                if (zzetVar11.zzz() != 1) {
                                    throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                }
                                zzetVar11.zzk(1);
                                int iZzs3 = zzetVar11.zzs();
                                int i61 = (iZzs3 & 240) >> 4;
                                int i62 = iZzs3 & 15;
                                if (zzetVar11.zzs() == 1) {
                                    int iZzs4 = zzetVar11.zzs();
                                    byte[] bArr6 = new byte[16];
                                    zzetVar11.zzm(bArr6, 0, 16);
                                    if (iZzs4 == 0) {
                                        int iZzs5 = zzetVar11.zzs();
                                        byte[] bArr7 = new byte[iZzs5];
                                        zzetVar11.zzm(bArr7, 0, iZzs5);
                                        bArr3 = bArr7;
                                    } else {
                                        bArr3 = null;
                                    }
                                    zzamkVar2.zzk = true;
                                    zzamkVar2.zzm = new zzamj(true, str2, iZzs4, bArr6, i61, i62, bArr3);
                                }
                            }
                            int size5 = list8.size();
                            int i63 = 0;
                            while (i63 < size5) {
                                zzfy zzfyVar5 = (zzfy) list8.get(i63);
                                if (zzfyVar5.zzd == 1970628964) {
                                    zzet zzetVar13 = zzfyVar5.zza;
                                    zzetVar13.zzh(8);
                                    bArr2 = bArr5;
                                    zzetVar13.zzm(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, zza)) {
                                        zzl(zzetVar13, 16, zzamkVar2);
                                    }
                                } else {
                                    bArr2 = bArr5;
                                }
                                i63++;
                                bArr5 = bArr2;
                            }
                            bArr = bArr5;
                        }
                        i13 = 8;
                    } else {
                        sparseArray = sparseArray4;
                        i10 = i32;
                        zzfxVar = zzfxVar2;
                        bArr = bArr4;
                        list4 = list4;
                        i11 = size3;
                        i12 = i33;
                        i13 = i23;
                    }
                    i33 = i12 + 1;
                    i23 = i13;
                    bArr4 = bArr;
                    list4 = list4;
                    size3 = i11;
                    sparseArray4 = sparseArray;
                    zzfxVar2 = zzfxVar;
                    i32 = i10;
                }
                SparseArray sparseArray5 = sparseArray4;
                zzq zzqVarZzn2 = zzn(zzfxVar2.zzb);
                if (zzqVarZzn2 != null) {
                    int size6 = sparseArray5.size();
                    for (int i64 = 0; i64 < size6; i64++) {
                        ((zzalq) sparseArray5.valueAt(i64)).zzb(zzqVarZzn2);
                    }
                }
                zzalrVar = this;
                if (zzalrVar.zzz != -9223372036854775807L) {
                    int size7 = sparseArray5.size();
                    for (int i65 = 0; i65 < size7; i65++) {
                        zzalq zzalqVar5 = (zzalq) sparseArray5.valueAt(i65);
                        long j18 = zzalrVar.zzz;
                        int i66 = zzalqVar5.zzf;
                        while (true) {
                            zzamk zzamkVar3 = zzalqVar5.zzb;
                            if (i66 >= zzamkVar3.zze || zzamkVar3.zzi[i66] > j18) {
                                break;
                            }
                            if (zzamkVar3.zzj[i66]) {
                                zzalqVar5.zzi = i66;
                            }
                            i66++;
                        }
                    }
                    zzalrVar.zzz = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfx) arrayDeque.peek()).zzb(zzfxVar2);
            }
        }
        zzi();
    }

    private static int zzk(int i10) throws zzat {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzl(zzet zzetVar, int i10, zzamk zzamkVar) throws zzat {
        zzetVar.zzh(i10 + 8);
        int iZzB = zzetVar.zzB();
        int i11 = zzalj.zza;
        int i12 = iZzB & 16777215;
        if ((i12 & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (i12 & 2) != 0;
        int iZzH = zzetVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzamkVar.zzl, 0, zzamkVar.zze, false);
            return;
        }
        int i13 = zzamkVar.zze;
        if (iZzH != i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i13).length());
            sb2.append("Senc sample count ");
            sb2.append(iZzH);
            sb2.append(" is different from fragment sample count");
            sb2.append(i13);
            throw zzat.zzb(sb2.toString(), null);
        }
        Arrays.fill(zzamkVar.zzl, 0, iZzH, z10);
        zzamkVar.zza(zzetVar.zzd());
        zzet zzetVar2 = zzamkVar.zzn;
        zzetVar.zzm(zzetVar2.zzi(), 0, zzetVar2.zze());
        zzetVar2.zzh(0);
        zzamkVar.zzo = false;
    }

    private static Pair zzm(zzet zzetVar, long j10) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzetVar.zzh(8);
        int iZza = zzalj.zza(zzetVar.zzB());
        zzetVar.zzk(4);
        long jZzz = zzetVar.zzz();
        if (iZza == 0) {
            jZzJ = zzetVar.zzz();
            jZzJ2 = zzetVar.zzz();
        } else {
            jZzJ = zzetVar.zzJ();
            jZzJ2 = zzetVar.zzJ();
        }
        long j11 = jZzJ;
        long j12 = j10 + jZzJ2;
        long jZzv = zzfl.zzv(j11, 1000000L, jZzz, RoundingMode.DOWN);
        zzetVar.zzk(2);
        int iZzt = zzetVar.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j13 = jZzv;
        int i10 = 0;
        long j14 = j11;
        while (i10 < iZzt) {
            int iZzB = zzetVar.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzetVar.zzz();
            iArr[i10] = iZzB & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + jZzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i11 = iZzt;
            int[] iArr2 = iArr;
            long jZzv2 = zzfl.zzv(j15, 1000000L, jZzz, RoundingMode.DOWN);
            jArr5[i10] = jZzv2 - jArr4[i10];
            zzetVar.zzk(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr2 = jArr5;
            jArr = jArr;
            iZzt = i11;
            jArr3 = jArr4;
            j14 = j15;
            j13 = jZzv2;
        }
        return Pair.create(Long.valueOf(jZzv), new zzafm(iArr, jArr, jArr2, jArr3));
    }

    private final void zzo(zzahb zzahbVar, zzagy zzagyVar) {
        this.zzI.zzw(zzahbVar);
        this.zzL = true;
        zzagyVar.zza = this.zzO;
        zzi();
    }

    private static final zzalk zzp(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzalk) sparseArray.valueAt(0);
        }
        zzalk zzalkVar = (zzalk) sparseArray.get(i10);
        zzalkVar.getClass();
        return zzalkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        zzahf zzahfVarZza = zzamh.zza(zzafzVar);
        this.zzr = zzahfVarZza != null ? zzgwm.zzj(zzahfVarZza) : zzgwm.zzi();
        return zzahfVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzagbVar = new zzanm(zzagbVar, this.zzc);
        }
        this.zzI = zzagbVar;
        zzi();
        zzahk[] zzahkVarArr = new zzahk[2];
        this.zzJ = zzahkVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzahkVarArr[0] = this.zzI.zzu(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        zzahk[] zzahkVarArr2 = (zzahk[]) zzfl.zzb(this.zzJ, i10);
        this.zzJ = zzahkVarArr2;
        for (zzahk zzahkVar : zzahkVarArr2) {
            zzahkVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzahk[list.size()];
        while (i13 < this.zzK.length) {
            zzahk zzahkVarZzu = this.zzI.zzu(i12, 3);
            zzahkVarZzu.zzA((zzv) list.get(i13));
            this.zzK[i13] = zzahkVarZzu;
            i13++;
            i12++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01de  */
    /* JADX WARN: Code duplicated, block: B:103:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:110:0x0205  */
    /* JADX WARN: Code duplicated, block: B:112:0x0209  */
    /* JADX WARN: Code duplicated, block: B:114:0x023a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0246  */
    /* JADX WARN: Code duplicated, block: B:119:0x024e  */
    /* JADX WARN: Code duplicated, block: B:122:0x025e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0262  */
    /* JADX WARN: Code duplicated, block: B:129:0x0282  */
    /* JADX WARN: Code duplicated, block: B:132:0x028d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0292  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:382:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:384:0x08ea A[LOOP:12: B:383:0x08e8->B:384:0x08ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:387:0x0900  */
    /* JADX WARN: Code duplicated, block: B:388:0x090d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:504:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x027a A[EDGE_INSN: B:547:0x027a->B:127:0x027a BREAK  A[LOOP:5: B:77:0x0163->B:79:0x0169], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x02e3 A[EDGE_INSN: B:548:0x02e3->B:143:0x02e3 BREAK  A[LOOP:6: B:135:0x02a1->B:551:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163 A[LOOP:5: B:77:0x0163->B:79:0x0169, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:79:0x0169 A[LOOP:5: B:77:0x0163->B:79:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:89:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d2 A[ADDED_TO_REGION] */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        zzafz zzafzVar2;
        zzagy zzagyVar2;
        zzalr zzalrVar;
        int i10;
        long j10;
        long j11;
        SparseArray sparseArray;
        int size;
        int i11;
        long jZzv;
        long jZzv2;
        String str;
        String str2;
        long jZzz;
        long j12;
        zzami zzamiVar;
        zzahk zzahkVar;
        long jZzd;
        int i12;
        zzet zzetVar;
        byte[] bArrZzi;
        int i13;
        int i14;
        int i15;
        int iZza;
        int i16;
        zzgz zzgzVar;
        zzgz zzgzVar2;
        zzgz zzgzVar3;
        int iZzc;
        int iZzB;
        boolean z10;
        int iZzg;
        zzamj zzamjVarZzj;
        zzahj zzahjVar;
        ArrayDeque arrayDeque;
        zzalo zzaloVar;
        int i17;
        long j13;
        long j14;
        zzahk[] zzahkVarArr;
        int length;
        int i18;
        int i19;
        int i20;
        int i21;
        int iZzi;
        zzamj zzamjVarZzj2;
        zzamk zzamkVar;
        zzet zzetVar2;
        int i22;
        zzalr zzalrVar2;
        zzagy zzagyVar3;
        int i23;
        int i24;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        long jZzz2;
        int i25;
        zzalr zzalrVar3 = this;
        zzafz zzafzVar3 = zzafzVar;
        zzagy zzagyVar4 = zzagyVar;
        while (true) {
            int i26 = zzalrVar3.zzs;
            int i27 = 8;
            boolean z11 = true;
            if (i26 == 0) {
                zzafzVar2 = zzafzVar3;
                zzagyVar2 = zzagyVar4;
                zzalrVar = zzalrVar3;
                if (zzalrVar.zzv == 0) {
                    zzet zzetVar3 = zzalrVar.zzm;
                    if (!zzafzVar2.zzb(zzetVar3.zzi(), 0, 8, true)) {
                        long j15 = zzalrVar.zzN;
                        if (j15 == -1) {
                            zzalrVar.zzp.zze();
                            return -1;
                        }
                        zzagyVar2.zza = j15;
                        zzalrVar.zzN = -1L;
                        zzalrVar.zzI.zzw(zzalrVar.zzq.zzb());
                        zzalrVar.zzM = true;
                        return 1;
                    }
                    zzalrVar.zzv = 8;
                    zzetVar3.zzh(0);
                    zzalrVar.zzu = zzetVar3.zzz();
                    zzalrVar.zzt = zzetVar3.zzB();
                }
                long j16 = zzalrVar.zzu;
                if (j16 == 1) {
                    zzet zzetVar4 = zzalrVar.zzm;
                    zzafzVar2.zzc(zzetVar4.zzi(), 8, 8);
                    zzalrVar.zzv += 8;
                    zzalrVar.zzu = zzetVar4.zzJ();
                } else if (j16 == 0) {
                    long jZzo = zzafzVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque2 = zzalrVar.zzn;
                        jZzo = !arrayDeque2.isEmpty() ? ((zzfx) arrayDeque2.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        zzalrVar.zzu = (jZzo - zzafzVar.zzn()) + ((long) zzalrVar.zzv);
                    }
                }
                long j17 = zzalrVar.zzu;
                int i28 = zzalrVar.zzv;
                long j18 = i28;
                if (j17 < j18) {
                    if (zzalrVar.zzt != 1718773093 || i28 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    zzalrVar.zzu = j18;
                    j17 = j18;
                }
                if (zzalrVar.zzN != -1) {
                    if (zzalrVar.zzt == 1936286840) {
                        zzet zzetVar5 = zzalrVar.zzk;
                        zzetVar5.zza((int) j17);
                        System.arraycopy(zzalrVar.zzm.zzi(), 0, zzetVar5.zzi(), 0, 8);
                        zzafzVar2.zzc(zzetVar5.zzi(), 8, (int) (zzalrVar.zzu - ((long) zzalrVar.zzv)));
                        zzalrVar.zzq.zza((zzafm) zzm(new zzfy(1936286840, zzetVar5).zza, zzafzVar.zzm()).second);
                    } else {
                        zzafzVar2.zze((int) (j17 - j18), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzafzVar.zzn() - j18;
                    int i29 = zzalrVar.zzt;
                    if (!(i29 == 1836019558 || i29 == 1835295092) || zzalrVar.zzL) {
                        if (zzalrVar.zzt == 1836019558) {
                            sparseArray = zzalrVar.zzf;
                            size = sparseArray.size();
                            for (i11 = 0; i11 < size; i11++) {
                                zzamk zzamkVar2 = ((zzalq) sparseArray.valueAt(i11)).zzb;
                                zzamkVar2.zzc = jZzn;
                                zzamkVar2.zzb = jZzn;
                            }
                        }
                        i10 = zzalrVar.zzt;
                        if (i10 == 1835295092) {
                            zzalrVar.zzC = null;
                            zzalrVar.zzx = jZzn + zzalrVar.zzu;
                            zzalrVar.zzs = 2;
                        } else if (i10 != 1836019574) {
                            long jZzn2 = zzafzVar.zzn();
                            j10 = zzalrVar.zzu;
                            long j19 = jZzn2 + j10;
                            if (j10 != zzalrVar.zzv) {
                                zzet zzetVar6 = zzalrVar.zzk;
                                zzetVar6.zza(8);
                                zzafzVar2.zzi(zzetVar6.zzi(), 0, 8);
                                zzalj.zzf(zzetVar6);
                                zzafzVar2.zzf(zzetVar6.zzg());
                                zzafzVar.zzl();
                            }
                            j11 = j19 - 8;
                            zzalrVar.zzn.push(new zzfx(zzalrVar.zzt, j11));
                            if (zzalrVar.zzu == zzalrVar.zzv) {
                                zzalrVar.zzj(j11);
                            } else {
                                zzi();
                            }
                        } else {
                            long jZzn3 = zzafzVar.zzn();
                            j10 = zzalrVar.zzu;
                            long j110 = jZzn3 + j10;
                            if (j10 != zzalrVar.zzv) {
                                zzet zzetVar7 = zzalrVar.zzk;
                                zzetVar7.zza(8);
                                zzafzVar2.zzi(zzetVar7.zzi(), 0, 8);
                                zzalj.zzf(zzetVar7);
                                zzafzVar2.zzf(zzetVar7.zzg());
                                zzafzVar.zzl();
                            }
                            j11 = j110 - 8;
                            zzalrVar.zzn.push(new zzfx(zzalrVar.zzt, j11));
                            if (zzalrVar.zzu == zzalrVar.zzv) {
                                zzalrVar.zzj(j11);
                            } else {
                                zzi();
                            }
                        }
                    } else if (zzafzVar.zzo() == -1 || zzalrVar.zzO != -1 || (zzalrVar.zzd & 512) == 0) {
                        zzalrVar.zzI.zzw(new zzaha(zzalrVar.zzA, jZzn));
                        zzalrVar.zzL = true;
                        if (zzalrVar.zzt == 1836019558) {
                            sparseArray = zzalrVar.zzf;
                            size = sparseArray.size();
                            while (i11 < size) {
                                zzamk zzamkVar3 = ((zzalq) sparseArray.valueAt(i11)).zzb;
                                zzamkVar3.zzc = jZzn;
                                zzamkVar3.zzb = jZzn;
                            }
                        }
                        i10 = zzalrVar.zzt;
                        if (i10 == 1835295092) {
                            zzalrVar.zzC = null;
                            zzalrVar.zzx = jZzn + zzalrVar.zzu;
                            zzalrVar.zzs = 2;
                        } else if (i10 != 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473) {
                            long jZzn4 = zzafzVar.zzn();
                            j10 = zzalrVar.zzu;
                            long j111 = jZzn4 + j10;
                            if (j10 != zzalrVar.zzv && i10 == 1835365473) {
                                zzet zzetVar8 = zzalrVar.zzk;
                                zzetVar8.zza(8);
                                zzafzVar2.zzi(zzetVar8.zzi(), 0, 8);
                                zzalj.zzf(zzetVar8);
                                zzafzVar2.zzf(zzetVar8.zzg());
                                zzafzVar.zzl();
                            }
                            j11 = j111 - 8;
                            zzalrVar.zzn.push(new zzfx(zzalrVar.zzt, j11));
                            if (zzalrVar.zzu == zzalrVar.zzv) {
                                zzalrVar.zzj(j11);
                            } else {
                                zzi();
                            }
                        } else if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                            if (zzalrVar.zzv != 8) {
                                throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (zzalrVar.zzu > 2147483647L) {
                                throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            zzet zzetVar9 = new zzet((int) zzalrVar.zzu);
                            System.arraycopy(zzalrVar.zzm.zzi(), 0, zzetVar9.zzi(), 0, 8);
                            zzalrVar.zzw = zzetVar9;
                            zzalrVar.zzs = 1;
                        } else {
                            if (zzalrVar.zzu > 2147483647L) {
                                throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            zzalrVar.zzw = null;
                            zzalrVar.zzs = 1;
                        }
                    } else {
                        zzalrVar.zzO = jZzn;
                        zzagyVar2.zza = zzafzVar.zzo() - 16;
                        zzalrVar.zzs = 5;
                    }
                }
                if (zzalrVar.zzs == 5) {
                    return 1;
                }
            } else if (i26 != 1) {
                long j20 = Long.MAX_VALUE;
                if (i26 == 2) {
                    zzafzVar2 = zzafzVar3;
                    zzagyVar2 = zzagyVar4;
                    zzalrVar = zzalrVar3;
                    SparseArray sparseArray4 = zzalrVar.zzf;
                    int size2 = sparseArray4.size();
                    zzalq zzalqVar = null;
                    for (int i30 = 0; i30 < size2; i30++) {
                        zzamk zzamkVar4 = ((zzalq) sparseArray4.valueAt(i30)).zzb;
                        if (zzamkVar4.zzo) {
                            long j21 = zzamkVar4.zzc;
                            if (j21 < j20) {
                                zzalqVar = (zzalq) sparseArray4.valueAt(i30);
                                j20 = j21;
                            }
                        }
                    }
                    if (zzalqVar == null) {
                        zzalrVar.zzs = 3;
                    } else {
                        int iZzn = (int) (j20 - zzafzVar.zzn());
                        if (iZzn < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzafzVar2.zzf(iZzn);
                        zzamk zzamkVar5 = zzalqVar.zzb;
                        zzet zzetVar10 = zzamkVar5.zzn;
                        zzafzVar2.zzc(zzetVar10.zzi(), 0, zzetVar10.zze());
                        zzetVar10.zzh(0);
                        zzamkVar5.zzo = false;
                    }
                } else if (i26 == 5) {
                    zzagyVar2 = zzagyVar4;
                    zzalrVar = zzalrVar3;
                    zzet zzetVar11 = zzalrVar.zzk;
                    zzetVar11.zza(16);
                    zzafzVar2 = zzafzVar;
                    if (zzafzVar2.zzb(zzetVar11.zzi(), 0, 16, true)) {
                        zzetVar11.zzh(0);
                        int iZzB2 = zzetVar11.zzB();
                        int iZzB3 = zzetVar11.zzB();
                        if (iZzB2 == 16 && iZzB3 == 1835430511) {
                            zzetVar11.zzk(4);
                            long jZzz3 = zzetVar11.zzz();
                            long jZzo2 = zzafzVar.zzo() - jZzz3;
                            if (jZzz3 <= 0 || jZzz3 > 2147483647L || jZzo2 < 0 || jZzo2 < zzalrVar.zzO) {
                                zzalrVar.zzo(new zzaha(zzalrVar.zzA, zzalrVar.zzO), zzagyVar2);
                            } else {
                                zzagyVar2.zza = jZzo2;
                                zzalrVar.zzs = 6;
                            }
                        } else {
                            zzalrVar.zzo(new zzaha(zzalrVar.zzA, zzalrVar.zzO), zzagyVar2);
                        }
                    } else {
                        zzalrVar.zzo(new zzaha(zzalrVar.zzA, zzalrVar.zzO), zzagyVar2);
                    }
                    int i31 = zzalrVar.zzs;
                    if (i31 == 6 || i31 == 0) {
                        return 1;
                    }
                } else if (i26 != 6) {
                    zzalq zzalqVar2 = zzalrVar3.zzC;
                    if (zzalqVar2 == null) {
                        SparseArray sparseArray5 = zzalrVar3.zzf;
                        int size3 = sparseArray5.size();
                        zzalq zzalqVar3 = null;
                        for (int i32 = 0; i32 < size3; i32++) {
                            zzalq zzalqVar4 = (zzalq) sparseArray5.valueAt(i32);
                            if ((zzalqVar4.zzk() || zzalqVar4.zzf != zzalqVar4.zzd.zzb) && (!zzalqVar4.zzk() || zzalqVar4.zzh != zzalqVar4.zzb.zzd)) {
                                long jZze = zzalqVar4.zze();
                                if (jZze < j20) {
                                    j20 = jZze;
                                    zzalqVar3 = zzalqVar4;
                                }
                            }
                        }
                        if (zzalqVar3 == null) {
                            int iZzn2 = (int) (zzalrVar3.zzx - zzafzVar.zzn());
                            if (iZzn2 < 0) {
                                throw zzat.zzb("Offset to end of mdat was negative.", null);
                            }
                            zzafzVar3.zzf(iZzn2);
                            zzi();
                            z11 = false;
                        } else {
                            int iZze = (int) (zzalqVar3.zze() - zzafzVar.zzn());
                            if (iZze < 0) {
                                zzeg.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iZze = 0;
                            }
                            zzafzVar3.zzf(iZze);
                            zzalrVar3.zzC = zzalqVar3;
                            zzalqVar2 = zzalqVar3;
                            if (zzalrVar3.zzs == 3) {
                                zzalrVar3.zzD = zzalqVar2.zzf();
                                String str3 = zzalqVar2.zzd.zza.zzg.zzp;
                                zzalrVar3.zzG = !(Objects.equals(str3, "video/avc") ? !(!Objects.equals(str3, "video/hevc") || (zzalrVar3.zzd & 128) == 0) : (zzalrVar3.zzd & 64) != 0);
                                if (zzalqVar2.zzf < zzalqVar2.zzi) {
                                    zzafzVar3.zzf(zzalrVar3.zzD);
                                    zzamjVarZzj2 = zzalqVar2.zzj();
                                    if (zzamjVarZzj2 != null) {
                                        zzamkVar = zzalqVar2.zzb;
                                        zzetVar2 = zzamkVar.zzn;
                                        i22 = zzamjVarZzj2.zzd;
                                        if (i22 != 0) {
                                            zzetVar2.zzk(i22);
                                        }
                                        if (zzamkVar.zzb(zzalqVar2.zzf)) {
                                            zzetVar2.zzk(zzetVar2.zzt() * 6);
                                        }
                                    }
                                    if (!zzalqVar2.zzh()) {
                                        zzalrVar3.zzC = null;
                                    }
                                    zzalrVar3.zzs = 3;
                                } else {
                                    if (zzalqVar2.zzd.zza.zzh == 1) {
                                        zzalrVar3.zzD -= 8;
                                        zzafzVar3.zzf(8);
                                    }
                                    if ("audio/ac4".equals(zzalqVar2.zzd.zza.zzg.zzp)) {
                                        zzalrVar3.zzE = zzalqVar2.zzi(zzalrVar3.zzD, 7);
                                        int i33 = zzalrVar3.zzD;
                                        zzet zzetVar12 = zzalrVar3.zzk;
                                        zzafb.zzc(i33, zzetVar12);
                                        zzalqVar2.zza.zzc(zzetVar12, 7);
                                        iZzi = zzalrVar3.zzE + 7;
                                        zzalrVar3.zzE = iZzi;
                                        i21 = 0;
                                    } else {
                                        i21 = 0;
                                        iZzi = zzalqVar2.zzi(zzalrVar3.zzD, 0);
                                        zzalrVar3.zzE = iZzi;
                                    }
                                    zzalrVar3.zzD += iZzi;
                                    zzalrVar3.zzs = 4;
                                    zzalrVar3.zzF = i21;
                                    zzamiVar = zzalqVar2.zzd.zza;
                                    zzahkVar = zzalqVar2.zza;
                                    jZzd = zzalqVar2.zzd();
                                    i12 = zzamiVar.zzk;
                                    if (i12 == 0) {
                                        while (true) {
                                            i19 = zzalrVar3.zzE;
                                            i20 = zzalrVar3.zzD;
                                            if (i19 < i20) {
                                                break;
                                            }
                                            zzalrVar3.zzE += zzahkVar.zza(zzafzVar3, i20 - i19, false);
                                        }
                                    } else {
                                        zzetVar = zzalrVar3.zzh;
                                        bArrZzi = zzetVar.zzi();
                                        bArrZzi[0] = 0;
                                        bArrZzi[1] = 0;
                                        bArrZzi[2] = 0;
                                        i13 = 4 - i12;
                                        while (zzalrVar3.zzE < zzalrVar3.zzD) {
                                            i14 = zzalrVar3.zzF;
                                            if (i14 == 0) {
                                                if (zzalrVar3.zzK.length <= 0 || !zzalrVar3.zzG) {
                                                    iZzc = zzgp.zzc(zzamiVar.zzg);
                                                    if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                                        iZzc = 0;
                                                    }
                                                } else {
                                                    iZzc = 0;
                                                }
                                                zzafzVar3.zzc(bArrZzi, i13, i12 + iZzc);
                                                zzetVar.zzh(0);
                                                iZzB = zzetVar.zzB();
                                                if (iZzB >= 0) {
                                                    throw zzat.zzb("Invalid NAL length", null);
                                                }
                                                zzalrVar3.zzF = iZzB - iZzc;
                                                zzet zzetVar13 = zzalrVar3.zzg;
                                                zzetVar13.zzh(0);
                                                zzahkVar.zzc(zzetVar13, 4);
                                                zzalrVar3.zzE += 4;
                                                zzalrVar3.zzD += i13;
                                                if (zzalrVar3.zzK.length > 0 || iZzc <= 0 || !zzgp.zzb(zzamiVar.zzg, bArrZzi, 4)) {
                                                    z10 = false;
                                                } else {
                                                    z10 = true;
                                                }
                                                zzalrVar3.zzH = z10;
                                                zzahkVar.zzc(zzetVar, iZzc);
                                                zzalrVar3.zzE += iZzc;
                                                if (iZzc <= 0 && !zzalrVar3.zzG && zzgp.zzd(bArrZzi, 4, iZzc, zzamiVar.zzg)) {
                                                    zzalrVar3.zzG = true;
                                                }
                                            } else {
                                                if (zzalrVar3.zzH) {
                                                    zzet zzetVar14 = zzalrVar3.zzi;
                                                    zzetVar14.zza(i14);
                                                    zzafzVar3.zzc(zzetVar14.zzi(), 0, zzalrVar3.zzF);
                                                    zzahkVar.zzc(zzetVar14, zzalrVar3.zzF);
                                                    iZza = zzalrVar3.zzF;
                                                    i15 = i12;
                                                    int iZza2 = zzgp.zza(zzetVar14.zzi(), zzetVar14.zze());
                                                    zzetVar14.zzh(0);
                                                    zzetVar14.zzf(iZza2);
                                                    i16 = zzamiVar.zzg.zzr;
                                                    if (i16 == -1) {
                                                        zzgzVar3 = zzalrVar3.zzp;
                                                        if (zzgzVar3.zzb() != 0) {
                                                            zzgzVar3.zza(0);
                                                        }
                                                    } else {
                                                        zzgzVar = zzalrVar3.zzp;
                                                        if (zzgzVar.zzb() != i16) {
                                                            zzgzVar.zza(i16);
                                                        }
                                                    }
                                                    zzgzVar2 = zzalrVar3.zzp;
                                                    zzgzVar2.zzc(jZzd, zzetVar14);
                                                    if ((zzalqVar2.zzg() & 4) != 0) {
                                                        zzgzVar2.zze();
                                                    }
                                                } else {
                                                    i15 = i12;
                                                    iZza = zzahkVar.zza(zzafzVar3, i14, false);
                                                }
                                                zzalrVar3.zzE += iZza;
                                                zzalrVar3.zzF -= iZza;
                                                i12 = i15;
                                            }
                                        }
                                    }
                                    iZzg = zzalqVar2.zzg();
                                    if (!zzalrVar3.zzG) {
                                        iZzg |= 67108864;
                                    }
                                    int i34 = iZzg;
                                    zzamjVarZzj = zzalqVar2.zzj();
                                    if (zzamjVarZzj != null) {
                                        zzahjVar = zzamjVarZzj.zzc;
                                    } else {
                                        zzahjVar = null;
                                    }
                                    zzahkVar.zze(jZzd, i34, zzalrVar3.zzD, 0, zzahjVar);
                                    while (true) {
                                        arrayDeque = zzalrVar3.zzo;
                                        if (!arrayDeque.isEmpty()) {
                                            break;
                                        }
                                        zzaloVar = (zzalo) arrayDeque.removeFirst();
                                        int i35 = zzalrVar3.zzy;
                                        i17 = zzaloVar.zzc;
                                        zzalrVar3.zzy = i35 - i17;
                                        j13 = zzaloVar.zza;
                                        if (zzaloVar.zzb) {
                                            j13 += jZzd;
                                        }
                                        j14 = j13;
                                        zzahkVarArr = zzalrVar3.zzJ;
                                        i18 = 0;
                                        for (length = zzahkVarArr.length; i18 < length; length = length) {
                                            zzahkVarArr[i18].zze(j14, 1, i17, zzalrVar3.zzy, null);
                                            i18++;
                                            zzahkVarArr = zzahkVarArr;
                                        }
                                    }
                                    if (!zzalqVar2.zzh()) {
                                        zzalrVar3.zzC = null;
                                    }
                                    zzalrVar3.zzs = 3;
                                    z11 = true;
                                }
                            } else {
                                zzamiVar = zzalqVar2.zzd.zza;
                                zzahkVar = zzalqVar2.zza;
                                jZzd = zzalqVar2.zzd();
                                i12 = zzamiVar.zzk;
                                if (i12 == 0) {
                                    while (true) {
                                        i19 = zzalrVar3.zzE;
                                        i20 = zzalrVar3.zzD;
                                        if (i19 < i20) {
                                            break;
                                            break;
                                        }
                                        zzalrVar3.zzE += zzahkVar.zza(zzafzVar3, i20 - i19, false);
                                    }
                                } else {
                                    zzetVar = zzalrVar3.zzh;
                                    bArrZzi = zzetVar.zzi();
                                    bArrZzi[0] = 0;
                                    bArrZzi[1] = 0;
                                    bArrZzi[2] = 0;
                                    i13 = 4 - i12;
                                    while (zzalrVar3.zzE < zzalrVar3.zzD) {
                                        i14 = zzalrVar3.zzF;
                                        if (i14 == 0) {
                                            if (zzalrVar3.zzK.length <= 0) {
                                                iZzc = zzgp.zzc(zzamiVar.zzg);
                                                if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                                    iZzc = 0;
                                                }
                                            } else {
                                                iZzc = zzgp.zzc(zzamiVar.zzg);
                                                if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                                    iZzc = 0;
                                                }
                                            }
                                            zzafzVar3.zzc(bArrZzi, i13, i12 + iZzc);
                                            zzetVar.zzh(0);
                                            iZzB = zzetVar.zzB();
                                            if (iZzB >= 0) {
                                                throw zzat.zzb("Invalid NAL length", null);
                                            }
                                            zzalrVar3.zzF = iZzB - iZzc;
                                            zzet zzetVar15 = zzalrVar3.zzg;
                                            zzetVar15.zzh(0);
                                            zzahkVar.zzc(zzetVar15, 4);
                                            zzalrVar3.zzE += 4;
                                            zzalrVar3.zzD += i13;
                                            if (zzalrVar3.zzK.length > 0) {
                                                z10 = false;
                                            } else {
                                                z10 = false;
                                            }
                                            zzalrVar3.zzH = z10;
                                            zzahkVar.zzc(zzetVar, iZzc);
                                            zzalrVar3.zzE += iZzc;
                                            if (iZzc <= 0) {
                                            }
                                        } else {
                                            if (zzalrVar3.zzH) {
                                                zzet zzetVar16 = zzalrVar3.zzi;
                                                zzetVar16.zza(i14);
                                                zzafzVar3.zzc(zzetVar16.zzi(), 0, zzalrVar3.zzF);
                                                zzahkVar.zzc(zzetVar16, zzalrVar3.zzF);
                                                iZza = zzalrVar3.zzF;
                                                i15 = i12;
                                                int iZza3 = zzgp.zza(zzetVar16.zzi(), zzetVar16.zze());
                                                zzetVar16.zzh(0);
                                                zzetVar16.zzf(iZza3);
                                                i16 = zzamiVar.zzg.zzr;
                                                if (i16 == -1) {
                                                    zzgzVar3 = zzalrVar3.zzp;
                                                    if (zzgzVar3.zzb() != 0) {
                                                        zzgzVar3.zza(0);
                                                    }
                                                } else {
                                                    zzgzVar = zzalrVar3.zzp;
                                                    if (zzgzVar.zzb() != i16) {
                                                        zzgzVar.zza(i16);
                                                    }
                                                }
                                                zzgzVar2 = zzalrVar3.zzp;
                                                zzgzVar2.zzc(jZzd, zzetVar16);
                                                if ((zzalqVar2.zzg() & 4) != 0) {
                                                    zzgzVar2.zze();
                                                }
                                            } else {
                                                i15 = i12;
                                                iZza = zzahkVar.zza(zzafzVar3, i14, false);
                                            }
                                            zzalrVar3.zzE += iZza;
                                            zzalrVar3.zzF -= iZza;
                                            i12 = i15;
                                        }
                                    }
                                }
                                iZzg = zzalqVar2.zzg();
                                if (!zzalrVar3.zzG) {
                                    iZzg |= 67108864;
                                }
                                int i36 = iZzg;
                                zzamjVarZzj = zzalqVar2.zzj();
                                if (zzamjVarZzj != null) {
                                    zzahjVar = zzamjVarZzj.zzc;
                                } else {
                                    zzahjVar = null;
                                }
                                zzahkVar.zze(jZzd, i36, zzalrVar3.zzD, 0, zzahjVar);
                                while (true) {
                                    arrayDeque = zzalrVar3.zzo;
                                    if (!arrayDeque.isEmpty()) {
                                        break;
                                        break;
                                    }
                                    zzaloVar = (zzalo) arrayDeque.removeFirst();
                                    int i37 = zzalrVar3.zzy;
                                    i17 = zzaloVar.zzc;
                                    zzalrVar3.zzy = i37 - i17;
                                    j13 = zzaloVar.zza;
                                    if (zzaloVar.zzb) {
                                        j13 += jZzd;
                                    }
                                    j14 = j13;
                                    zzahkVarArr = zzalrVar3.zzJ;
                                    i18 = 0;
                                    while (i18 < length) {
                                        zzahkVarArr[i18].zze(j14, 1, i17, zzalrVar3.zzy, null);
                                        i18++;
                                        zzahkVarArr = zzahkVarArr;
                                    }
                                }
                                if (!zzalqVar2.zzh()) {
                                    zzalrVar3.zzC = null;
                                }
                                zzalrVar3.zzs = 3;
                                z11 = true;
                            }
                        }
                    } else if (zzalrVar3.zzs == 3) {
                        zzalrVar3.zzD = zzalqVar2.zzf();
                        String str4 = zzalqVar2.zzd.zza.zzg.zzp;
                        zzalrVar3.zzG = !(Objects.equals(str4, "video/avc") ? !(!Objects.equals(str4, "video/hevc") || (zzalrVar3.zzd & 128) == 0) : (zzalrVar3.zzd & 64) != 0);
                        if (zzalqVar2.zzf < zzalqVar2.zzi) {
                            zzafzVar3.zzf(zzalrVar3.zzD);
                            zzamjVarZzj2 = zzalqVar2.zzj();
                            if (zzamjVarZzj2 != null) {
                                zzamkVar = zzalqVar2.zzb;
                                zzetVar2 = zzamkVar.zzn;
                                i22 = zzamjVarZzj2.zzd;
                                if (i22 != 0) {
                                    zzetVar2.zzk(i22);
                                }
                                if (zzamkVar.zzb(zzalqVar2.zzf)) {
                                    zzetVar2.zzk(zzetVar2.zzt() * 6);
                                }
                            }
                            if (!zzalqVar2.zzh()) {
                                zzalrVar3.zzC = null;
                            }
                            zzalrVar3.zzs = 3;
                        } else {
                            if (zzalqVar2.zzd.zza.zzh == 1) {
                                zzalrVar3.zzD -= 8;
                                zzafzVar3.zzf(8);
                            }
                            if ("audio/ac4".equals(zzalqVar2.zzd.zza.zzg.zzp)) {
                                zzalrVar3.zzE = zzalqVar2.zzi(zzalrVar3.zzD, 7);
                                int i38 = zzalrVar3.zzD;
                                zzet zzetVar17 = zzalrVar3.zzk;
                                zzafb.zzc(i38, zzetVar17);
                                zzalqVar2.zza.zzc(zzetVar17, 7);
                                iZzi = zzalrVar3.zzE + 7;
                                zzalrVar3.zzE = iZzi;
                                i21 = 0;
                            } else {
                                i21 = 0;
                                iZzi = zzalqVar2.zzi(zzalrVar3.zzD, 0);
                                zzalrVar3.zzE = iZzi;
                            }
                            zzalrVar3.zzD += iZzi;
                            zzalrVar3.zzs = 4;
                            zzalrVar3.zzF = i21;
                            zzamiVar = zzalqVar2.zzd.zza;
                            zzahkVar = zzalqVar2.zza;
                            jZzd = zzalqVar2.zzd();
                            i12 = zzamiVar.zzk;
                            if (i12 == 0) {
                                while (true) {
                                    i19 = zzalrVar3.zzE;
                                    i20 = zzalrVar3.zzD;
                                    if (i19 < i20) {
                                        break;
                                        break;
                                    }
                                    zzalrVar3.zzE += zzahkVar.zza(zzafzVar3, i20 - i19, false);
                                }
                            } else {
                                zzetVar = zzalrVar3.zzh;
                                bArrZzi = zzetVar.zzi();
                                bArrZzi[0] = 0;
                                bArrZzi[1] = 0;
                                bArrZzi[2] = 0;
                                i13 = 4 - i12;
                                while (zzalrVar3.zzE < zzalrVar3.zzD) {
                                    i14 = zzalrVar3.zzF;
                                    if (i14 == 0) {
                                        if (zzalrVar3.zzK.length <= 0) {
                                            iZzc = zzgp.zzc(zzamiVar.zzg);
                                            if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                                iZzc = 0;
                                            }
                                        } else {
                                            iZzc = zzgp.zzc(zzamiVar.zzg);
                                            if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                                iZzc = 0;
                                            }
                                        }
                                        zzafzVar3.zzc(bArrZzi, i13, i12 + iZzc);
                                        zzetVar.zzh(0);
                                        iZzB = zzetVar.zzB();
                                        if (iZzB >= 0) {
                                            throw zzat.zzb("Invalid NAL length", null);
                                        }
                                        zzalrVar3.zzF = iZzB - iZzc;
                                        zzet zzetVar18 = zzalrVar3.zzg;
                                        zzetVar18.zzh(0);
                                        zzahkVar.zzc(zzetVar18, 4);
                                        zzalrVar3.zzE += 4;
                                        zzalrVar3.zzD += i13;
                                        if (zzalrVar3.zzK.length > 0) {
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                        }
                                        zzalrVar3.zzH = z10;
                                        zzahkVar.zzc(zzetVar, iZzc);
                                        zzalrVar3.zzE += iZzc;
                                        if (iZzc <= 0) {
                                        }
                                    } else {
                                        if (zzalrVar3.zzH) {
                                            zzet zzetVar19 = zzalrVar3.zzi;
                                            zzetVar19.zza(i14);
                                            zzafzVar3.zzc(zzetVar19.zzi(), 0, zzalrVar3.zzF);
                                            zzahkVar.zzc(zzetVar19, zzalrVar3.zzF);
                                            iZza = zzalrVar3.zzF;
                                            i15 = i12;
                                            int iZza4 = zzgp.zza(zzetVar19.zzi(), zzetVar19.zze());
                                            zzetVar19.zzh(0);
                                            zzetVar19.zzf(iZza4);
                                            i16 = zzamiVar.zzg.zzr;
                                            if (i16 == -1) {
                                                zzgzVar3 = zzalrVar3.zzp;
                                                if (zzgzVar3.zzb() != 0) {
                                                    zzgzVar3.zza(0);
                                                }
                                            } else {
                                                zzgzVar = zzalrVar3.zzp;
                                                if (zzgzVar.zzb() != i16) {
                                                    zzgzVar.zza(i16);
                                                }
                                            }
                                            zzgzVar2 = zzalrVar3.zzp;
                                            zzgzVar2.zzc(jZzd, zzetVar19);
                                            if ((zzalqVar2.zzg() & 4) != 0) {
                                                zzgzVar2.zze();
                                            }
                                        } else {
                                            i15 = i12;
                                            iZza = zzahkVar.zza(zzafzVar3, i14, false);
                                        }
                                        zzalrVar3.zzE += iZza;
                                        zzalrVar3.zzF -= iZza;
                                        i12 = i15;
                                    }
                                }
                            }
                            iZzg = zzalqVar2.zzg();
                            if (!zzalrVar3.zzG) {
                                iZzg |= 67108864;
                            }
                            int i39 = iZzg;
                            zzamjVarZzj = zzalqVar2.zzj();
                            if (zzamjVarZzj != null) {
                                zzahjVar = zzamjVarZzj.zzc;
                            } else {
                                zzahjVar = null;
                            }
                            zzahkVar.zze(jZzd, i39, zzalrVar3.zzD, 0, zzahjVar);
                            while (true) {
                                arrayDeque = zzalrVar3.zzo;
                                if (!arrayDeque.isEmpty()) {
                                    break;
                                    break;
                                }
                                zzaloVar = (zzalo) arrayDeque.removeFirst();
                                int i310 = zzalrVar3.zzy;
                                i17 = zzaloVar.zzc;
                                zzalrVar3.zzy = i310 - i17;
                                j13 = zzaloVar.zza;
                                if (zzaloVar.zzb) {
                                    j13 += jZzd;
                                }
                                j14 = j13;
                                zzahkVarArr = zzalrVar3.zzJ;
                                i18 = 0;
                                while (i18 < length) {
                                    zzahkVarArr[i18].zze(j14, 1, i17, zzalrVar3.zzy, null);
                                    i18++;
                                    zzahkVarArr = zzahkVarArr;
                                }
                            }
                            if (!zzalqVar2.zzh()) {
                                zzalrVar3.zzC = null;
                            }
                            zzalrVar3.zzs = 3;
                            z11 = true;
                        }
                    } else {
                        zzamiVar = zzalqVar2.zzd.zza;
                        zzahkVar = zzalqVar2.zza;
                        jZzd = zzalqVar2.zzd();
                        i12 = zzamiVar.zzk;
                        if (i12 == 0) {
                            while (true) {
                                i19 = zzalrVar3.zzE;
                                i20 = zzalrVar3.zzD;
                                if (i19 < i20) {
                                    break;
                                    break;
                                }
                                zzalrVar3.zzE += zzahkVar.zza(zzafzVar3, i20 - i19, false);
                            }
                        } else {
                            zzetVar = zzalrVar3.zzh;
                            bArrZzi = zzetVar.zzi();
                            bArrZzi[0] = 0;
                            bArrZzi[1] = 0;
                            bArrZzi[2] = 0;
                            i13 = 4 - i12;
                            while (zzalrVar3.zzE < zzalrVar3.zzD) {
                                i14 = zzalrVar3.zzF;
                                if (i14 == 0) {
                                    if (zzalrVar3.zzK.length <= 0) {
                                        iZzc = zzgp.zzc(zzamiVar.zzg);
                                        if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                            iZzc = 0;
                                        }
                                    } else {
                                        iZzc = zzgp.zzc(zzamiVar.zzg);
                                        if (i12 + iZzc > zzalrVar3.zzD - zzalrVar3.zzE) {
                                            iZzc = 0;
                                        }
                                    }
                                    zzafzVar3.zzc(bArrZzi, i13, i12 + iZzc);
                                    zzetVar.zzh(0);
                                    iZzB = zzetVar.zzB();
                                    if (iZzB >= 0) {
                                        throw zzat.zzb("Invalid NAL length", null);
                                    }
                                    zzalrVar3.zzF = iZzB - iZzc;
                                    zzet zzetVar110 = zzalrVar3.zzg;
                                    zzetVar110.zzh(0);
                                    zzahkVar.zzc(zzetVar110, 4);
                                    zzalrVar3.zzE += 4;
                                    zzalrVar3.zzD += i13;
                                    if (zzalrVar3.zzK.length > 0) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    zzalrVar3.zzH = z10;
                                    zzahkVar.zzc(zzetVar, iZzc);
                                    zzalrVar3.zzE += iZzc;
                                    if (iZzc <= 0) {
                                    }
                                } else {
                                    if (zzalrVar3.zzH) {
                                        zzet zzetVar111 = zzalrVar3.zzi;
                                        zzetVar111.zza(i14);
                                        zzafzVar3.zzc(zzetVar111.zzi(), 0, zzalrVar3.zzF);
                                        zzahkVar.zzc(zzetVar111, zzalrVar3.zzF);
                                        iZza = zzalrVar3.zzF;
                                        i15 = i12;
                                        int iZza5 = zzgp.zza(zzetVar111.zzi(), zzetVar111.zze());
                                        zzetVar111.zzh(0);
                                        zzetVar111.zzf(iZza5);
                                        i16 = zzamiVar.zzg.zzr;
                                        if (i16 == -1) {
                                            zzgzVar3 = zzalrVar3.zzp;
                                            if (zzgzVar3.zzb() != 0) {
                                                zzgzVar3.zza(0);
                                            }
                                        } else {
                                            zzgzVar = zzalrVar3.zzp;
                                            if (zzgzVar.zzb() != i16) {
                                                zzgzVar.zza(i16);
                                            }
                                        }
                                        zzgzVar2 = zzalrVar3.zzp;
                                        zzgzVar2.zzc(jZzd, zzetVar111);
                                        if ((zzalqVar2.zzg() & 4) != 0) {
                                            zzgzVar2.zze();
                                        }
                                    } else {
                                        i15 = i12;
                                        iZza = zzahkVar.zza(zzafzVar3, i14, false);
                                    }
                                    zzalrVar3.zzE += iZza;
                                    zzalrVar3.zzF -= iZza;
                                    i12 = i15;
                                }
                            }
                        }
                        iZzg = zzalqVar2.zzg();
                        if (!zzalrVar3.zzG) {
                            iZzg |= 67108864;
                        }
                        int i311 = iZzg;
                        zzamjVarZzj = zzalqVar2.zzj();
                        if (zzamjVarZzj != null) {
                            zzahjVar = zzamjVarZzj.zzc;
                        } else {
                            zzahjVar = null;
                        }
                        zzahkVar.zze(jZzd, i311, zzalrVar3.zzD, 0, zzahjVar);
                        while (true) {
                            arrayDeque = zzalrVar3.zzo;
                            if (!arrayDeque.isEmpty()) {
                                break;
                                break;
                            }
                            zzaloVar = (zzalo) arrayDeque.removeFirst();
                            int i312 = zzalrVar3.zzy;
                            i17 = zzaloVar.zzc;
                            zzalrVar3.zzy = i312 - i17;
                            j13 = zzaloVar.zza;
                            if (zzaloVar.zzb) {
                                j13 += jZzd;
                            }
                            j14 = j13;
                            zzahkVarArr = zzalrVar3.zzJ;
                            i18 = 0;
                            while (i18 < length) {
                                zzahkVarArr[i18].zze(j14, 1, i17, zzalrVar3.zzy, null);
                                i18++;
                                zzahkVarArr = zzahkVarArr;
                            }
                        }
                        if (!zzalqVar2.zzh()) {
                            zzalrVar3.zzC = null;
                        }
                        zzalrVar3.zzs = 3;
                        z11 = true;
                    }
                    if (z11) {
                        return 0;
                    }
                } else {
                    int iZzo = (int) (zzafzVar.zzo() - zzafzVar.zzn());
                    zzet zzetVar20 = new zzet(iZzo);
                    zzafzVar3.zzc(zzetVar20.zzi(), 0, iZzo);
                    zzetVar20.zzh(0);
                    zzetVar20.zzh(zzetVar20.zzB() == 1 ? 16 : 8);
                    SparseArray sparseArray6 = new SparseArray();
                    SparseArray sparseArray7 = new SparseArray();
                    while (zzetVar20.zzd() >= i27) {
                        int iZzg2 = zzetVar20.zzg();
                        long jZzz4 = zzetVar20.zzz();
                        int iZzB4 = zzetVar20.zzB();
                        if (jZzz4 == 1) {
                            if (zzetVar20.zzd() < i27) {
                                break;
                            }
                            jZzz4 = zzetVar20.zzD();
                        } else if (jZzz4 == 0) {
                            jZzz4 = ((long) zzetVar20.zze()) - ((long) iZzg2);
                        }
                        int i40 = jZzz4 == 1 ? 16 : i27;
                        if (jZzz4 < i40) {
                            break;
                        }
                        long j22 = iZzg2;
                        if (jZzz4 > ((long) zzetVar20.zze()) - j22) {
                            break;
                        }
                        if (iZzB4 == 1952871009) {
                            if (jZzz4 < i40 + 16) {
                                zzetVar20.zzh((int) (j22 + jZzz4));
                            } else {
                                int iZza6 = zzalj.zza(zzetVar20.zzB());
                                int iZzB5 = zzetVar20.zzB();
                                zzalq zzalqVar5 = (zzalq) zzalrVar3.zzf.get(iZzB5);
                                if (zzalqVar5 == null) {
                                    zzetVar20.zzh((int) (j22 + jZzz4));
                                } else {
                                    long j23 = zzalqVar5.zzd.zza.zzc;
                                    int iZzB6 = zzetVar20.zzB();
                                    int i41 = iZzB6 >> 4;
                                    int i42 = iZzB6 >> 2;
                                    int i43 = iZzB6 & 3;
                                    SparseArray sparseArray8 = sparseArray6;
                                    SparseArray sparseArray9 = sparseArray7;
                                    long jZzz5 = zzetVar20.zzz();
                                    int i44 = (i41 & 3) + 1;
                                    int i45 = (i42 & 3) + 1;
                                    int i46 = i43 + 1;
                                    if (((iZza6 == 1 ? 16L : 8L) + ((long) i44) + ((long) i45) + ((long) i46)) * jZzz5 > zzetVar20.zzd()) {
                                        zzetVar20.zzh((int) (j22 + jZzz4));
                                        zzalrVar3 = this;
                                        sparseArray6 = sparseArray8;
                                        sparseArray7 = sparseArray9;
                                    } else {
                                        int i47 = (int) jZzz5;
                                        long[] jArr = new long[i47];
                                        long[] jArr2 = new long[i47];
                                        int i48 = 0;
                                        while (i48 < i47) {
                                            if (iZza6 == 1) {
                                                jZzz2 = zzetVar20.zzJ();
                                                i25 = 1;
                                            } else {
                                                jZzz2 = zzetVar20.zzz();
                                                i25 = iZza6;
                                            }
                                            long j24 = jZzz2;
                                            long jZzJ = i25 == 1 ? zzetVar20.zzJ() : zzetVar20.zzz();
                                            zzetVar20.zzk(i44 + i45 + i46);
                                            jArr[i48] = zzfl.zzv(j24, 1000000L, j23, RoundingMode.DOWN);
                                            jArr2[i48] = jZzJ;
                                            i48++;
                                            i47 = i47;
                                        }
                                        sparseArray2 = sparseArray8;
                                        sparseArray2.put(iZzB5, jArr);
                                        sparseArray3 = sparseArray9;
                                        sparseArray3.put(iZzB5, jArr2);
                                    }
                                }
                            }
                            i27 = 8;
                        } else {
                            sparseArray2 = sparseArray6;
                            sparseArray3 = sparseArray7;
                        }
                        zzetVar20.zzh((int) (j22 + jZzz4));
                        sparseArray6 = sparseArray2;
                        sparseArray7 = sparseArray3;
                        i27 = 8;
                        zzalrVar3 = this;
                    }
                    SparseArray sparseArray10 = sparseArray6;
                    SparseArray sparseArray11 = sparseArray7;
                    if (sparseArray10.size() == 0) {
                        zzalrVar2 = this;
                        zzagyVar3 = zzagyVar;
                        zzalrVar2.zzo(new zzaha(zzalrVar2.zzA, zzalrVar2.zzO), zzagyVar3);
                    } else {
                        zzalrVar2 = this;
                        zzagyVar3 = zzagyVar;
                        int iKeyAt = -1;
                        int i49 = -1;
                        for (int i50 = 0; i50 < sparseArray10.size(); i50++) {
                            int iKeyAt2 = sparseArray10.keyAt(i50);
                            zzalq zzalqVar6 = (zzalq) zzalrVar2.zzf.get(iKeyAt2);
                            if (zzalqVar6 != null) {
                                int i51 = zzalqVar6.zzd.zza.zzb;
                                if (iKeyAt != -1) {
                                    i24 = iKeyAt;
                                } else if (i51 == 2) {
                                    iKeyAt = iKeyAt2;
                                } else {
                                    i24 = -1;
                                }
                                if (i49 == -1) {
                                    i49 = i51 == 1 ? iKeyAt2 : -1;
                                }
                                iKeyAt = i24;
                            }
                        }
                        if (iKeyAt != -1) {
                            i23 = iKeyAt;
                        } else if (i49 != -1) {
                            i23 = i49;
                        } else {
                            iKeyAt = sparseArray10.keyAt(0);
                            i23 = iKeyAt;
                        }
                        zzalrVar2.zzo(new zzalp(sparseArray10, sparseArray11, zzalrVar2.zzA, zzalrVar2.zzO, i23, null), zzagyVar3);
                    }
                    if (zzalrVar2.zzs == 0) {
                        return 1;
                    }
                    zzafzVar3 = zzafzVar;
                    zzalrVar3 = zzalrVar2;
                    zzagyVar4 = zzagyVar3;
                }
            } else {
                zzafzVar2 = zzafzVar3;
                zzagyVar2 = zzagyVar4;
                zzalrVar = zzalrVar3;
                long j25 = zzalrVar.zzu - ((long) zzalrVar.zzv);
                zzet zzetVar21 = zzalrVar.zzw;
                int i52 = (int) j25;
                if (zzetVar21 != null) {
                    zzafzVar2.zzc(zzetVar21.zzi(), 8, i52);
                    zzfy zzfyVar = new zzfy(zzalrVar.zzt, zzetVar21);
                    ArrayDeque arrayDeque3 = zzalrVar.zzn;
                    if (arrayDeque3.isEmpty()) {
                        int i53 = zzfyVar.zzd;
                        if (i53 == 1936286840) {
                            Pair pairZzm = zzm(zzfyVar.zza, zzafzVar.zzn());
                            zzafn zzafnVar = zzalrVar.zzq;
                            zzafnVar.zza((zzafm) pairZzm.second);
                            zzalrVar.zzB = ((Long) pairZzm.first).longValue();
                            if (!zzalrVar.zzL) {
                                zzalrVar.zzI.zzw((zzahb) pairZzm.second);
                                zzalrVar.zzL = true;
                            } else if ((zzalrVar.zzd & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 && !zzalrVar.zzM && zzafnVar.zzc() > 1) {
                                zzalrVar.zzN = zzafzVar.zzn();
                            }
                        } else if (i53 == 1701671783) {
                            zzet zzetVar22 = zzfyVar.zza;
                            if (zzalrVar.zzJ.length != 0) {
                                zzetVar22.zzh(8);
                                int iZza7 = zzalj.zza(zzetVar22.zzB());
                                if (iZza7 == 0) {
                                    String strZzM = zzetVar22.zzM((char) 0);
                                    strZzM.getClass();
                                    String strZzM2 = zzetVar22.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz6 = zzetVar22.zzz();
                                    jZzv = zzfl.zzv(zzetVar22.zzz(), 1000000L, jZzz6, RoundingMode.DOWN);
                                    long j26 = zzalrVar.zzB;
                                    long j27 = j26 != -9223372036854775807L ? j26 + jZzv : -9223372036854775807L;
                                    jZzv2 = zzfl.zzv(zzetVar22.zzz(), 1000L, jZzz6, RoundingMode.DOWN);
                                    str = strZzM;
                                    str2 = strZzM2;
                                    jZzz = zzetVar22.zzz();
                                    j12 = j27;
                                } else if (iZza7 != 1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZza7).length() + 35);
                                    sb2.append("Skipping unsupported emsg version: ");
                                    sb2.append(iZza7);
                                    zzeg.zzc("FragmentedMp4Extractor", sb2.toString());
                                } else {
                                    long jZzz7 = zzetVar22.zzz();
                                    long jZzv3 = zzfl.zzv(zzetVar22.zzJ(), 1000000L, jZzz7, RoundingMode.DOWN);
                                    long jZzv4 = zzfl.zzv(zzetVar22.zzz(), 1000L, jZzz7, RoundingMode.DOWN);
                                    long jZzz8 = zzetVar22.zzz();
                                    String strZzM3 = zzetVar22.zzM((char) 0);
                                    strZzM3.getClass();
                                    String strZzM4 = zzetVar22.zzM((char) 0);
                                    strZzM4.getClass();
                                    jZzv2 = jZzv4;
                                    jZzz = jZzz8;
                                    str = strZzM3;
                                    str2 = strZzM4;
                                    j12 = jZzv3;
                                    jZzv = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzetVar22.zzd()];
                                zzetVar22.zzm(bArr, 0, zzetVar22.zzd());
                                zzet zzetVar23 = new zzet(zzalrVar.zzl.zza(new zzaja(str, str2, jZzv2, jZzz, bArr)));
                                int iZzd = zzetVar23.zzd();
                                for (zzahk zzahkVar2 : zzalrVar.zzJ) {
                                    zzetVar23.zzh(0);
                                    zzahkVar2.zzc(zzetVar23, iZzd);
                                }
                                if (j12 == -9223372036854775807L) {
                                    zzalrVar.zzo.addLast(new zzalo(jZzv, true, iZzd));
                                    zzalrVar.zzy += iZzd;
                                } else {
                                    ArrayDeque arrayDeque4 = zzalrVar.zzo;
                                    if (arrayDeque4.isEmpty()) {
                                        for (zzahk zzahkVar3 : zzalrVar.zzJ) {
                                            zzahkVar3.zze(j12, 1, iZzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque4.addLast(new zzalo(j12, false, iZzd));
                                        zzalrVar.zzy += iZzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfx) arrayDeque3.peek()).zza(zzfyVar);
                    }
                } else {
                    zzafzVar2.zzf(i52);
                }
                zzalrVar.zzj(zzafzVar.zzn());
            }
            zzalrVar3 = zzalrVar;
            zzagyVar4 = zzagyVar2;
            zzafzVar3 = zzafzVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzalq) sparseArray.valueAt(i10)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j11;
        this.zzn.clear();
        this.zzO = -1L;
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    final /* synthetic */ void zzh(long j10, zzet zzetVar) {
        zzafl.zza(j10, zzetVar, this.zzK);
    }

    public zzalr(zzanj zzanjVar, int i10, zzfi zzfiVar, zzami zzamiVar, List list, zzahk zzahkVar) {
        this.zzc = zzanjVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzajb();
        this.zzm = new zzet(16);
        this.zzg = new zzet(zzgp.zza);
        this.zzh = new zzet(6);
        this.zzi = new zzet();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzet(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgwm.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzagb.zza;
        this.zzJ = new zzahk[0];
        this.zzK = new zzahk[0];
        this.zzp = new zzgz(new zzgy() { // from class: com.google.android.gms.internal.ads.zzaln
            @Override // com.google.android.gms.internal.ads.zzgy
            public final /* synthetic */ void zza(long j10, zzet zzetVar) {
                this.zza.zzh(j10, zzetVar);
            }
        });
        this.zzq = new zzafn();
        this.zzN = -1L;
        this.zzO = -1L;
    }

    private static zzq zzn(List list) {
        int i10;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzame zzameVar;
        UUID uuid;
        int size = list.size();
        int i11 = 0;
        ArrayList arrayList2 = null;
        while (i11 < size) {
            zzfy zzfyVar = (zzfy) list.get(i11);
            if (zzfyVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrZzi = zzfyVar.zza.zzi();
                zzet zzetVar = new zzet(bArrZzi);
                if (zzetVar.zze() < 32) {
                    i10 = i11;
                    arrayList = arrayList2;
                    zzameVar = null;
                } else {
                    zzetVar.zzh(0);
                    int iZzd = zzetVar.zzd();
                    int iZzB = zzetVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb2.append(TwDPD.lYKbfrlKviloj);
                        sb2.append(iZzB);
                        sb2.append(") does not match buffer size: ");
                        sb2.append(iZzd);
                        zzeg.zzc("PsshAtomUtil", sb2.toString());
                    } else {
                        int iZzB2 = zzetVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb3.append("Atom type is not pssh: ");
                            sb3.append(iZzB2);
                            zzeg.zzc("PsshAtomUtil", sb3.toString());
                        } else {
                            int iZza = zzalj.zza(zzetVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb4.append("Unsupported pssh version: ");
                                sb4.append(iZza);
                                zzeg.zzc("PsshAtomUtil", sb4.toString());
                            } else {
                                UUID uuid2 = new UUID(zzetVar.zzD(), zzetVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzetVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i12 = 0;
                                    while (i12 < iZzH) {
                                        uuidArr[i12] = new UUID(zzetVar.zzD(), zzetVar.zzD());
                                        i12++;
                                        i11 = i11;
                                        arrayList2 = arrayList2;
                                    }
                                    i10 = i11;
                                    arrayList = arrayList2;
                                } else {
                                    i10 = i11;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iZzH2 = zzetVar.zzH();
                                int iZzd2 = zzetVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb5.append("Atom data size (");
                                    sb5.append(iZzH2);
                                    sb5.append(") does not match the bytes left: ");
                                    sb5.append(iZzd2);
                                    zzeg.zzc("PsshAtomUtil", sb5.toString());
                                    zzameVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzetVar.zzm(bArr, 0, iZzH2);
                                    zzameVar = new zzame(uuid2, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i10 = i11;
                    arrayList = arrayList2;
                    zzameVar = null;
                }
                if (zzameVar == null) {
                    uuid = null;
                } else {
                    uuid = zzameVar.zza;
                }
                if (uuid == null) {
                    zzeg.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.add(new zzp(uuid, null, "video/mp4", bArrZzi));
                }
                i11 = i10 + 1;
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzq(arrayList2);
    }
}
