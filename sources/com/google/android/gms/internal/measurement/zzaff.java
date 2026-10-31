package com.google.android.gms.internal.measurement;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaff<T> implements zzafp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzagg.zzp();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzafz zzm;
    private final zzadg zzn;

    private zzaff(int[] iArr, Object[] objArr, int i10, int i11, zzafc zzafcVar, boolean z10, int[] iArr2, int i12, int i13, zzafh zzafhVar, zzaeo zzaeoVar, zzafz zzafzVar, zzadg zzadgVar, zzaex zzaexVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzafcVar instanceof zzadu;
        boolean z11 = false;
        if (zzadgVar != null && (zzafcVar instanceof zzadr)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzafzVar;
        this.zzn = zzadgVar;
        this.zzg = zzafcVar;
    }

    private final int zzA(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzC(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean zzD(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadu) {
            return ((zzadu) obj).zzch();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j10) {
        return ((Integer) zzagg.zzm(obj, j10)).intValue();
    }

    private static long zzH(Object obj, long j10) {
        return ((Long) zzagg.zzm(obj, j10)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i10) {
        return zzK(obj, i10) == zzK(obj2, i10);
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzK(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private final boolean zzK(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = iZzB & 1048575;
        if (j10 != 1048575) {
            return (zzagg.zzc(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzagg.zzk(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzagg.zzi(obj, j11)) != 0;
            case 2:
                return zzagg.zze(obj, j11) != 0;
            case 3:
                return zzagg.zze(obj, j11) != 0;
            case 4:
                return zzagg.zzc(obj, j11) != 0;
            case 5:
                return zzagg.zze(obj, j11) != 0;
            case 6:
                return zzagg.zzc(obj, j11) != 0;
            case 7:
                return zzagg.zzg(obj, j11);
            case 8:
                Object objZzm = zzagg.zzm(obj, j11);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzacr) {
                    return !zzacr.zza.equals(objZzm);
                }
                return zzR();
            case 9:
                return zzagg.zzm(obj, j11) != null;
            case 10:
                return !zzacr.zza.equals(zzagg.zzm(obj, j11));
            case 11:
                return zzagg.zzc(obj, j11) != 0;
            case 12:
                return zzagg.zzc(obj, j11) != 0;
            case 13:
                return zzagg.zzc(obj, j11) != 0;
            case 14:
                return zzagg.zze(obj, j11) != 0;
            case 15:
                return zzagg.zzc(obj, j11) != 0;
            case 16:
                return zzagg.zze(obj, j11) != 0;
            case 17:
                return zzagg.zzm(obj, j11) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zzagg.zzd(obj, j10, (1 << (iZzB >>> 20)) | zzagg.zzc(obj, j10));
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzagg.zzc(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        return zzagg.zzc(obj, jZzB) == zzagg.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i10, int i11) {
        zzagg.zzd(obj, zzB(i11) & 1048575, i10);
    }

    private final int zzP(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzQ(i10, 0);
    }

    private final int zzQ(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i10, int i11, zzagm zzagmVar, Class cls, zzacg zzacgVar) throws IOException {
        int i12;
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                i12 = i10 + 8;
                zzacgVar.zzc = Double.valueOf(Double.longBitsToDouble(zzach.zze(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                zzacgVar.zzc = Float.valueOf(Float.intBitsToFloat(zzach.zzd(bArr, i10)));
                break;
            case 2:
            case 3:
                int iZzc = zzach.zzc(bArr, i10, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacgVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzach.zza(bArr, i10, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacgVar.zza);
                return iZza;
            case 5:
            case 15:
                i12 = i10 + 8;
                zzacgVar.zzc = Long.valueOf(zzach.zze(bArr, i10));
                break;
            case 6:
            case 14:
                i12 = i10 + 4;
                zzacgVar.zzc = Integer.valueOf(zzach.zzd(bArr, i10));
                break;
            case 7:
                int iZzc2 = zzach.zzc(bArr, i10, zzacgVar);
                zzacgVar.zzc = Boolean.valueOf(zzacgVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzach.zzf(bArr, i10, zzacgVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzach.zzh(zzafl.zza().zzb(cls), bArr, i10, i11, zzacgVar);
            case 11:
                return zzach.zzg(bArr, i10, zzacgVar);
            case 16:
                int iZza2 = zzach.zza(bArr, i10, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacv.zzR(zzacgVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzach.zzc(bArr, i10, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacv.zzS(zzacgVar.zzb));
                return iZzc3;
        }
        return i12;
    }

    private static final void zzT(int i10, Object obj, zzago zzagoVar) throws IOException {
        if (obj instanceof String) {
            zzagoVar.zzm(i10, (String) obj);
        } else {
            zzagoVar.zzn(i10, (zzacr) obj);
        }
    }

    static zzaga zzh(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.zza()) {
            return zzagaVar;
        }
        zzaga zzagaVarZzb = zzaga.zzb();
        zzaduVar.zzc = zzagaVarZzb;
        return zzagaVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0256  */
    /* JADX WARN: Code duplicated, block: B:125:0x0259  */
    /* JADX WARN: Code duplicated, block: B:128:0x0276  */
    /* JADX WARN: Code duplicated, block: B:129:0x0279  */
    /* JADX WARN: Code duplicated, block: B:186:0x039f  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b0  */
    static zzaff zzm(Class cls, zzaez zzaezVar, zzafh zzafhVar, zzaeo zzaeoVar, zzafz zzafzVar, zzadg zzadgVar, zzaex zzaexVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        char cCharAt;
        int i17;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        Field fieldZzn;
        int i30;
        char cCharAt8;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field fieldZzn2;
        int i38;
        Object obj2;
        Field fieldZzn3;
        int i39;
        char cCharAt9;
        int i40;
        char cCharAt10;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        if (!(zzaezVar instanceof zzafn)) {
            throw null;
        }
        zzafn zzafnVar = (zzafn) zzaezVar;
        String strZzd = zzafnVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i10 = i43 + 1;
                if (strZzd.charAt(i43) < 55296) {
                    break;
                }
                i43 = i10;
            }
        } else {
            i10 = 1;
        }
        int i44 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i45 = iCharAt3 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                cCharAt12 = strZzd.charAt(i44);
                if (cCharAt12 < 55296) {
                    break;
                }
                i45 |= (cCharAt12 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            iCharAt3 = i45 | (cCharAt12 << i46);
            i44 = i42;
        }
        if (iCharAt3 == 0) {
            i15 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            i12 = 0;
            i11 = 0;
            iArr = zza;
            i13 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt4 = strZzd.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strZzd.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strZzd.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strZzd.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strZzd.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strZzd.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            int iCharAt7 = strZzd.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt7 = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            iCharAt = strZzd.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            iCharAt2 = strZzd.charAt(i59);
            if (iCharAt2 >= 55296) {
                int i63 = iCharAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strZzd.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt2 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            if (strZzd.charAt(i62) >= 55296) {
                while (true) {
                    i17 = i65 + 1;
                    if (strZzd.charAt(i65) < 55296) {
                        break;
                    }
                    i65 = i17;
                }
                i65 = i17;
            }
            int i66 = i65 + 1;
            int iCharAt8 = strZzd.charAt(i65);
            if (iCharAt8 >= 55296) {
                int i67 = iCharAt8 & 8191;
                int i68 = 13;
                while (true) {
                    i16 = i66 + 1;
                    cCharAt = strZzd.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i16;
                }
                iCharAt8 = i67 | (cCharAt << i68);
                i66 = i16;
            }
            int i69 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt8 + iCharAt2 + iCharAt4];
            i11 = iCharAt8;
            i12 = iCharAt7;
            i13 = iCharAt4;
            i44 = i66;
            i14 = iCharAt6;
            i15 = i69;
            iArr = iArr2;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzafnVar.zze();
        Class<?> cls2 = zzafnVar.zzb().getClass();
        int i70 = i11 + iCharAt2;
        int i71 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i71];
        int i72 = i11;
        int i73 = i70;
        int i74 = 0;
        int i75 = 0;
        while (i44 < length) {
            int i76 = i44 + 1;
            int iCharAt9 = strZzd.charAt(i44);
            if (iCharAt9 >= c10) {
                int i77 = iCharAt9 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i41 = i78 + 1;
                    cCharAt11 = strZzd.charAt(i78);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i41;
                }
                iCharAt9 = i77 | (cCharAt11 << i79);
                i24 = i41;
            } else {
                i24 = i76;
            }
            int i80 = i24 + 1;
            int iCharAt10 = strZzd.charAt(i24);
            if (iCharAt10 >= c10) {
                int i81 = iCharAt10 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i40 = i82 + 1;
                    cCharAt10 = strZzd.charAt(i82);
                    if (cCharAt10 < c10) {
                        break;
                    }
                    i81 |= (cCharAt10 & 8191) << i83;
                    i83 += 13;
                    i82 = i40;
                }
                iCharAt10 = i81 | (cCharAt10 << i83);
                i25 = i40;
            } else {
                i25 = i80;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int i84 = iCharAt10 & 255;
            int i85 = length;
            int i86 = iCharAt10 & 2048;
            int i87 = i12;
            if (i84 >= 51) {
                int i88 = i25 + 1;
                int iCharAt11 = strZzd.charAt(i25);
                if (iCharAt11 >= 55296) {
                    int i89 = iCharAt11 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i39 = i90 + 1;
                        cCharAt9 = strZzd.charAt(i90);
                        i26 = i14;
                        if (cCharAt9 < 55296) {
                            break;
                        }
                        i89 |= (cCharAt9 & 8191) << i91;
                        i91 += 13;
                        i90 = i39;
                        i14 = i26;
                    }
                    iCharAt11 = i89 | (cCharAt9 << i91);
                    i35 = i39;
                } else {
                    i26 = i14;
                    i35 = i88;
                }
                int i92 = i84 - 51;
                int i93 = i35;
                if (i92 == 9 || i92 == 17) {
                    i36 = i15 + 1;
                    int i94 = i75 / 3;
                    objArr[i94 + i94 + 1] = objArrZze[i15];
                } else {
                    if (i92 == 12) {
                        if (zzafnVar.zzc() == 1 || i86 != 0) {
                            i36 = i15 + 1;
                            int i95 = i75 / 3;
                            objArr[i95 + i95 + 1] = objArrZze[i15];
                        } else {
                            i86 = 0;
                        }
                    }
                    i37 = iCharAt11 + iCharAt11;
                    obj = objArrZze[i37];
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i37] = fieldZzn2;
                        iArr[i73] = i75;
                        i73++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i38 = i37 + 1;
                    obj2 = objArrZze[i38];
                    int i96 = i86;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i38] = fieldZzn3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i28 = iObjectFieldOffset3;
                    i27 = i15;
                    i86 = i96;
                    i29 = 0;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i25 = i93;
                    zzafnVar = zzafnVar;
                }
                i15 = i36;
                i37 = iCharAt11 + iCharAt11;
                obj = objArrZze[i37];
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i37] = fieldZzn2;
                    iArr[i73] = i75;
                    i73++;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzn2);
                i38 = i37 + 1;
                obj2 = objArrZze[i38];
                int i97 = i86;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i38] = fieldZzn3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i28 = iObjectFieldOffset5;
                i27 = i15;
                i86 = i97;
                i29 = 0;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i25 = i93;
                zzafnVar = zzafnVar;
            } else {
                i26 = i14;
                i27 = i15 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i15]);
                if (i84 == 9 || i84 == 17) {
                    zzafnVar = zzafnVar;
                    int i98 = i75 / 3;
                    objArr[i98 + i98 + 1] = fieldZzn4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        i31 = i27 + 1;
                        int i99 = i75 / 3;
                        objArr[i99 + i99 + 1] = objArrZze[i27];
                        i27 = i31;
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        zzafnVar = zzafnVar;
                        if (zzafnVar.zzc() == 1 || i86 != 0) {
                            i31 = i27 + 1;
                            int i100 = i75 / 3;
                            objArr[i100 + i100 + 1] = objArrZze[i27];
                            i27 = i31;
                        } else {
                            i86 = 0;
                        }
                    } else if (i84 == 50) {
                        int i101 = i27 + 1;
                        int i102 = i72 + 1;
                        iArr[i72] = i75;
                        int i103 = i75 / 3;
                        int i104 = i103 + i103;
                        objArr[i104] = objArrZze[i27];
                        if (i86 != 0) {
                            i27 = i101 + 1;
                            objArr[i104 + 1] = objArrZze[i101];
                            i72 = i102;
                            zzafnVar = zzafnVar;
                        } else {
                            i27 = i101;
                            i72 = i102;
                            i86 = 0;
                            zzafnVar = zzafnVar;
                        }
                    } else {
                        zzafnVar = zzafnVar;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0 || i84 > 17) {
                        i28 = iObjectFieldOffset;
                        i29 = 0;
                    } else {
                        int i105 = i25 + 1;
                        int iCharAt12 = strZzd.charAt(i25);
                        if (iCharAt12 >= 55296) {
                            int i106 = iCharAt12 & 8191;
                            int i107 = 13;
                            while (true) {
                                i30 = i105 + 1;
                                cCharAt8 = strZzd.charAt(i105);
                                if (cCharAt8 < 55296) {
                                    break;
                                }
                                i106 |= (cCharAt8 & 8191) << i107;
                                i107 += 13;
                                i105 = i30;
                            }
                            iCharAt12 = i106 | (cCharAt8 << i107);
                            i105 = i30;
                        }
                        int i108 = i13 + i13 + (iCharAt12 / 32);
                        Object obj3 = objArrZze[i108];
                        i28 = iObjectFieldOffset;
                        if (obj3 instanceof Field) {
                            fieldZzn = (Field) obj3;
                        } else {
                            fieldZzn = zzn(cls2, (String) obj3);
                            objArrZze[i108] = fieldZzn;
                        }
                        int i109 = i105;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
                        i29 = iCharAt12 % 32;
                        i25 = i109;
                    }
                    int i110 = i75 + 1;
                    iArr3[i75] = iCharAt9;
                    int i111 = i110 + 1;
                    if ((iCharAt10 & 512) != 0) {
                        i32 = 536870912;
                    } else {
                        i32 = 0;
                    }
                    if ((iCharAt10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                        i33 = 268435456;
                    } else {
                        i33 = 0;
                    }
                    if (i86 != 0) {
                        i34 = Integer.MIN_VALUE;
                    } else {
                        i34 = 0;
                    }
                    iArr3[i110] = i32 | i33 | i34 | (i84 << 20) | i28;
                    i75 = i111 + 1;
                    iArr3[i111] = (i29 << 20) | iObjectFieldOffset2;
                    i44 = i25;
                    i15 = i27;
                    strZzd = strZzd;
                    length = i85;
                    i12 = i87;
                    zzafnVar = zzafnVar;
                    i14 = i26;
                    c10 = 55296;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                }
                i28 = iObjectFieldOffset;
                i29 = 0;
                int i112 = i75 + 1;
                iArr3[i75] = iCharAt9;
                int i113 = i112 + 1;
                if ((iCharAt10 & 512) != 0) {
                    i32 = 536870912;
                } else {
                    i32 = 0;
                }
                if ((iCharAt10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    i33 = 268435456;
                } else {
                    i33 = 0;
                }
                if (i86 != 0) {
                    i34 = Integer.MIN_VALUE;
                } else {
                    i34 = 0;
                }
                iArr3[i112] = i32 | i33 | i34 | (i84 << 20) | i28;
                i75 = i113 + 1;
                iArr3[i113] = (i29 << 20) | iObjectFieldOffset2;
                i44 = i25;
                i15 = i27;
                strZzd = strZzd;
                length = i85;
                i12 = i87;
                zzafnVar = zzafnVar;
                i14 = i26;
                c10 = 55296;
            }
            int i114 = i75 + 1;
            iArr3[i75] = iCharAt9;
            int i115 = i114 + 1;
            if ((iCharAt10 & 512) != 0) {
                i32 = 536870912;
            } else {
                i32 = 0;
            }
            if ((iCharAt10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                i33 = 268435456;
            } else {
                i33 = 0;
            }
            if (i86 != 0) {
                i34 = Integer.MIN_VALUE;
            } else {
                i34 = 0;
            }
            iArr3[i114] = i32 | i33 | i34 | (i84 << 20) | i28;
            i75 = i115 + 1;
            iArr3[i115] = (i29 << 20) | iObjectFieldOffset2;
            i44 = i25;
            i15 = i27;
            strZzd = strZzd;
            length = i85;
            i12 = i87;
            zzafnVar = zzafnVar;
            i14 = i26;
            c10 = 55296;
        }
        return new zzaff(iArr3, objArr, i14, i12, zzafnVar.zzb(), false, iArr, i11, i70, zzafhVar, zzaeoVar, zzafzVar, zzadgVar, zzaexVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        if (zzK(obj2, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.zzc[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzafp zzafpVarZzq = zzq(i10);
            if (!zzK(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zzafpVarZzq.zza();
                    zzafpVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzL(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzafpVarZzq.zza();
                zzafpVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzafpVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzafp zzafpVarZzq = zzq(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zzafpVarZzq.zza();
                    zzafpVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzafpVarZzq.zza();
                zzafpVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzafpVarZzq.zzd(object2, object);
        }
    }

    private final zzafp zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzafp zzafpVar = (zzafp) objArr[i12];
        if (zzafpVar != null) {
            return zzafpVar;
        }
        zzafp zzafpVarZzb = zzafl.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzafpVarZzb;
        return zzafpVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzadz zzs(int i10) {
        int i11 = i10 / 3;
        return (zzadz) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzafp zzafpVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzK(obj, i10)) {
            return zzafpVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzafpVarZzq.zza();
        if (object != null) {
            zzafpVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzL(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzafp zzafpVarZzq = zzq(i11);
        if (!zzM(obj, i10, i11)) {
            return zzafpVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzafpVarZzq.zza();
        if (object != null) {
            zzafpVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzO(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzafz zzafzVar, Object obj3) {
        zzadz zzadzVarZzs;
        int i11 = this.zzc[i10];
        Object objZzm = zzagg.zzm(obj, zzA(i10) & 1048575);
        if (objZzm == null || (zzadzVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzaeu zzaeuVarZze = ((zzaev) zzr(i10)).zze();
        Iterator it = ((zzaew) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzadzVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzafzVar.zzh(obj3);
                }
                int iZzc = zzaev.zzc(zzaeuVarZze, entry.getKey(), entry.getValue());
                zzacr zzacrVar = zzacr.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zzada.zzb;
                zzacx zzacxVar = new zzacx(bArr, 0, iZzc);
                try {
                    zzaev.zzb(zzacxVar, zzaeuVarZze, entry.getKey(), entry.getValue());
                    zzafzVar.zzd(obj2, i11, zzaco.zza(zzacxVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzafp zzafpVar) {
        return zzafpVar.zzl(zzagg.zzm(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzafo zzafoVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zzagg.zzn(obj, j10, zzafoVar.zzn());
        } else if (this.zzi) {
            zzagg.zzn(obj, j10, zzafoVar.zzm());
        } else {
            zzagg.zzn(obj, j10, zzafoVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        return ((zzadu) this.zzg).zzck();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzC;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j10 = iZzA & 1048575;
                switch (iZzC) {
                    case 0:
                        if (!zzI(obj, obj2, i10) || Double.doubleToLongBits(zzagg.zzk(obj, j10)) != Double.doubleToLongBits(zzagg.zzk(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzI(obj, obj2, i10) || Float.floatToIntBits(zzagg.zzi(obj, j10)) != Float.floatToIntBits(zzagg.zzi(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzI(obj, obj2, i10) || zzagg.zzg(obj, j10) != zzagg.zzg(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zZzC = zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10));
                        break;
                    case 50:
                        zZzC = zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        if (!zzN(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzC) {
                    return false;
                }
            }
        }
        int i11 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i11 >= iArr.length) {
                if (!((zzadu) obj).zzc.equals(((zzadu) obj2).zzc)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzadr) obj).zzb.equals(((zzadr) obj2).zzb);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!zzN(obj, obj2, i12)) {
                return false;
            }
            if (!zzM(obj, 0, i12)) {
                long jZzA = zzA(i12) & 1048575;
                if (!zzafq.zzC(zzagg.zzm(obj, jZzA), zzagg.zzm(obj2, jZzA))) {
                    return false;
                }
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzA = zzA(i12);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j10 = iZzA & 1048575;
                int iHashCode2 = 37;
                switch (iZzC) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzagg.zzk(obj, j10));
                        byte[] bArr = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzagg.zzi(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr2 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr3 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr4 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzaed.zza(zzagg.zzg(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzagg.zzm(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzm = zzagg.zzm(obj, j10);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr5 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr6 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzm2 = zzagg.zzm(obj, j10);
                        if (objZzm2 != null) {
                            iHashCode2 = objZzm2.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zzadu) obj).zzc.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zzadr) obj).zzb.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + zzagg.zzm(obj, zzA(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzafq.zzE(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzafq.zzD(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i10);
            int i11 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzC) {
                case 0:
                    if (zzK(obj2, i10)) {
                        zzagg.zzl(obj, j10, zzagg.zzk(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 1:
                    if (zzK(obj2, i10)) {
                        zzagg.zzj(obj, j10, zzagg.zzi(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 2:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 3:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 4:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 5:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 6:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 7:
                    if (zzK(obj2, i10)) {
                        zzagg.zzh(obj, j10, zzagg.zzg(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 8:
                    if (zzK(obj2, i10)) {
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (zzK(obj2, i10)) {
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 11:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 12:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 13:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 14:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 15:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 16:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzaef zzaefVarZzg = (zzaef) zzagg.zzm(obj, j10);
                    zzaef zzaefVar = (zzaef) zzagg.zzm(obj2, j10);
                    int size = zzaefVarZzg.size();
                    int size2 = zzaefVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaefVarZzg.zza()) {
                            zzaefVarZzg = zzaefVarZzg.zzg(size2 + size);
                        }
                        zzaefVarZzg.addAll(zzaefVar);
                    }
                    if (size > 0) {
                        zzaefVar = zzaefVarZzg;
                    }
                    zzagg.zzn(obj, j10, zzaefVar);
                    break;
                case 50:
                    int i13 = zzafq.zza;
                    zzagg.zzn(obj, j10, zzaex.zzb(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i12, i10)) {
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
                        zzO(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzp(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i12, i10)) {
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
                        zzO(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0396  */
    /* JADX WARN: Code duplicated, block: B:207:0x0560  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v261 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v116, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r1v159 */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zze(Object obj) {
        int i10;
        ?? r16;
        ?? r10;
        int iZzE;
        int iZzE2;
        int iZzE3;
        int iZzF;
        int iZzE4;
        int iZzE5;
        int iZzb;
        int iZzE6;
        ?? Zzo;
        int size;
        int iZzE7;
        int iZzb2;
        int iZzE8;
        int iZzb3;
        int iZzE9;
        ?? r11;
        int iZzcf;
        int iZzE10;
        ?? ZzE;
        ?? Zzz;
        int iZzx;
        int iZzE11;
        int iZzE12;
        ?? r12;
        ?? r13;
        ?? r14;
        Unsafe unsafe = zzb;
        boolean z10 = false;
        int i11 = 1048575;
        ?? r15 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iZzi = i13 + ((zzadu) obj).zzc.zzi();
                if (!this.zzh) {
                    return iZzi;
                }
                zzafv zzafvVar = ((zzadr) obj).zzb.zza;
                int iZzc = zzafvVar.zzc();
                int iZzj = 0;
                for (int i15 = 0; i15 < iZzc; i15++) {
                    Map.Entry entryZzd = zzafvVar.zzd(i15);
                    iZzj += zzadk.zzj((zzadj) ((zzafs) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzafvVar.zze()) {
                    iZzj += zzadk.zzj((zzadj) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA = zzA(i12);
            int iZzC = zzC(iZzA);
            int i16 = iArr[i12];
            int i17 = iArr[i12 + 2];
            int i18 = i17 & i11;
            if (iZzC <= 17) {
                if (i18 != i14) {
                    r14 = i18 == i11 ? z10 : unsafe.getInt(obj, i18);
                    i14 = i18;
                }
                i10 = i14;
                r16 = r14;
                r10 = 1 << (i17 >>> 20);
            } else {
                r14 = r15;
                i10 = i14;
                r16 = r15 == true ? 1 : 0;
                r10 = z10;
            }
            int i19 = iZzA & i11;
            if (iZzC >= zzadl.zzJ.zza()) {
                zzadl.zzW.zza();
            }
            long j10 = i19;
            switch (iZzC) {
                case 0:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE = zzada.zzE(i16 << 3);
                        Zzz = iZzE + 8;
                        i13 += Zzz;
                    }
                    break;
                case 1:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE2 = zzada.zzE(i16 << 3);
                        Zzz = iZzE2 + 4;
                        i13 += Zzz;
                    }
                    break;
                case 2:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(j11);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 3:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(j12);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 4:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(j13);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 5:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE = zzada.zzE(i16 << 3);
                        Zzz = iZzE + 8;
                        i13 += Zzz;
                    }
                    break;
                case 6:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE2 = zzada.zzE(i16 << 3);
                        Zzz = iZzE2 + 4;
                        i13 += Zzz;
                    }
                    break;
                case 7:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE4 = zzada.zzE(i16 << 3);
                        Zzz = iZzE4 + 1;
                        i13 += Zzz;
                    }
                    break;
                case 8:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzacr) {
                            iZzE5 = zzada.zzE(i20);
                            iZzb = ((zzacr) object).zzb();
                            iZzE6 = zzada.zzE(iZzb);
                        } else {
                            iZzE5 = zzada.zzE(i20);
                            iZzb = zzagl.zzb((String) object);
                            iZzE6 = zzada.zzE(iZzb);
                        }
                        Zzz = iZzE5 + iZzE6 + iZzb;
                        i13 += Zzz;
                    }
                    break;
                case 9:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        Zzz = zzafq.zzz(i16, unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzz;
                    }
                    break;
                case 10:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(obj, j10);
                        iZzE5 = zzada.zzE(i16 << 3);
                        iZzb = zzacrVar.zzb();
                        iZzE6 = zzada.zzE(iZzb);
                        Zzz = iZzE5 + iZzE6 + iZzb;
                        i13 += Zzz;
                    }
                    break;
                case 11:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzE(i21);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 12:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(j14);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 13:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE2 = zzada.zzE(i16 << 3);
                        Zzz = iZzE2 + 4;
                        i13 += Zzz;
                    }
                    break;
                case 14:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzE = zzada.zzE(i16 << 3);
                        Zzz = iZzE + 8;
                        i13 += Zzz;
                    }
                    break;
                case 15:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzE((i22 >> 31) ^ (i22 + i22));
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 16:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF((j15 >> 63) ^ (j15 + j15));
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 17:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        Zzz = zzafq.zzA(i16, (zzafc) unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzz;
                    }
                    break;
                case 18:
                    Zzz = zzafq.zzy(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzz;
                    break;
                case 19:
                    Zzz = zzafq.zzw(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzz;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i23 = zzafq.zza;
                    if (list.size() == 0) {
                        Zzo = z10;
                    } else {
                        Zzo = zzafq.zzo(list) + (list.size() * zzada.zzE(i16 << 3));
                    }
                    i13 += Zzo;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzafq.zza;
                    size = list2.size();
                    if (size == 0) {
                        Zzz = z10;
                    } else {
                        iZzE3 = zzafq.zzp(list2);
                        iZzE7 = zzada.zzE(i16 << 3);
                        iZzF = size * iZzE7;
                        Zzz = iZzE3 + iZzF;
                    }
                    i13 += Zzz;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzafq.zza;
                    size = list3.size();
                    if (size == 0) {
                        Zzz = z10;
                    } else {
                        iZzE3 = zzafq.zzs(list3);
                        iZzE7 = zzada.zzE(i16 << 3);
                        iZzF = size * iZzE7;
                        Zzz = iZzE3 + iZzF;
                    }
                    i13 += Zzz;
                    break;
                case 23:
                    Zzz = zzafq.zzy(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzz;
                    break;
                case 24:
                    Zzz = zzafq.zzw(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzz;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzafq.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        Zzz = z10;
                    } else {
                        Zzz = size2 * (zzada.zzE(i16 << 3) + 1);
                    }
                    i13 += Zzz;
                    break;
                case 26:
                    ?? r17 = (List) unsafe.getObject(obj, j10);
                    int i27 = zzafq.zza;
                    int size3 = r17.size();
                    if (size3 == 0) {
                        Zzo = z10;
                    } else {
                        int iZzE13 = zzada.zzE(i16 << 3) * size3;
                        if (r17 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) r17;
                            for (?? r18 = z10; r18 < size3; r18++) {
                                Object objZzc = zzaenVar.zzc();
                                if (objZzc instanceof zzacr) {
                                    Zzo = iZzE13;
                                    iZzb3 = ((zzacr) objZzc).zzb();
                                    iZzE9 = zzada.zzE(iZzb3);
                                } else {
                                    Zzo = iZzE13;
                                    iZzb3 = zzagl.zzb((String) objZzc);
                                    iZzE9 = zzada.zzE(iZzb3);
                                }
                                Zzo += iZzE9 + iZzb3;
                            }
                            Zzo = iZzE13;
                        } else {
                            for (?? r19 = z10; r19 < size3; r19++) {
                                Object obj2 = r17.get(r19);
                                if (obj2 instanceof zzacr) {
                                    Zzo = iZzE13;
                                    iZzb2 = ((zzacr) obj2).zzb();
                                    iZzE8 = zzada.zzE(iZzb2);
                                } else {
                                    Zzo = iZzE13;
                                    iZzb2 = zzagl.zzb((String) obj2);
                                    iZzE8 = zzada.zzE(iZzb2);
                                }
                                Zzo += iZzE8 + iZzb2;
                            }
                            Zzo = iZzE13;
                        }
                    }
                    i13 += Zzo;
                    break;
                case 27:
                    ?? r20 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq = zzq(i12);
                    int i28 = zzafq.zza;
                    int size4 = r20.size();
                    if (size4 == 0) {
                        r11 = z10;
                    } else {
                        int iZzE14 = zzada.zzE(i16 << 3) * size4;
                        for (?? r21 = z10; r21 < size4; r21++) {
                            Object obj3 = r20.get(r21);
                            if (obj3 instanceof zzaem) {
                                r11 = iZzE14;
                                iZzcf = ((zzaem) obj3).zzb();
                                iZzE10 = zzada.zzE(iZzcf);
                            } else {
                                r11 = iZzE14;
                                iZzcf = ((zzacb) obj3).zzcf(zzafpVarZzq);
                                iZzE10 = zzada.zzE(iZzcf);
                            }
                            r11 = (r11 == true ? 1 : 0) + iZzE10 + iZzcf;
                        }
                        r11 = iZzE14;
                    }
                    i13 += r11;
                    break;
                case 28:
                    ?? r22 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzafq.zza;
                    int size5 = r22.size();
                    if (size5 == 0) {
                        ZzE = z10;
                    } else {
                        ZzE = size5 * zzada.zzE(i16 << 3);
                        for (?? r23 = z10; r23 < r22.size(); r23++) {
                            int iZzb4 = ((zzacr) r22.get(r23)).zzb();
                            ZzE += zzada.zzE(iZzb4) + iZzb4;
                        }
                    }
                    i13 += ZzE;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i30 = zzafq.zza;
                    size = list5.size();
                    if (size == 0) {
                        Zzz = z10;
                    } else {
                        iZzE3 = zzafq.zzt(list5);
                        iZzE7 = zzada.zzE(i16 << 3);
                        iZzF = size * iZzE7;
                        Zzz = iZzE3 + iZzF;
                    }
                    i13 += Zzz;
                    break;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzafq.zza;
                    size = list6.size();
                    if (size == 0) {
                        Zzz = z10;
                    } else {
                        iZzE3 = zzafq.zzr(list6);
                        iZzE7 = zzada.zzE(i16 << 3);
                        iZzF = size * iZzE7;
                        Zzz = iZzE3 + iZzF;
                    }
                    i13 += Zzz;
                    break;
                case 31:
                    Zzz = zzafq.zzw(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzz;
                    break;
                case 32:
                    Zzz = zzafq.zzy(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzz;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i32 = zzafq.zza;
                    size = list7.size();
                    if (size == 0) {
                        Zzz = z10;
                    } else {
                        iZzE3 = zzafq.zzu(list7);
                        iZzE7 = zzada.zzE(i16 << 3);
                        iZzF = size * iZzE7;
                        Zzz = iZzE3 + iZzF;
                    }
                    i13 += Zzz;
                    break;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzafq.zza;
                    size = list8.size();
                    if (size == 0) {
                        Zzz = z10;
                    } else {
                        iZzE3 = zzafq.zzq(list8);
                        iZzE7 = zzada.zzE(i16 << 3);
                        iZzF = size * iZzE7;
                        Zzz = iZzE3 + iZzF;
                    }
                    i13 += Zzz;
                    break;
                case 35:
                    iZzx = zzafq.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 36:
                    iZzx = zzafq.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 37:
                    iZzx = zzafq.zzo((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 38:
                    iZzx = zzafq.zzp((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 39:
                    iZzx = zzafq.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 40:
                    iZzx = zzafq.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 41:
                    iZzx = zzafq.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzafq.zza;
                    iZzx = list9.size();
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 43:
                    iZzx = zzafq.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 44:
                    iZzx = zzafq.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 45:
                    iZzx = zzafq.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 46:
                    iZzx = zzafq.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 47:
                    iZzx = zzafq.zzu((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 48:
                    iZzx = zzafq.zzq((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE11 = zzada.zzE(i16 << 3);
                        iZzE12 = zzada.zzE(iZzx);
                        ZzE = iZzE11 + iZzE12 + iZzx;
                        i13 += ZzE;
                    }
                    break;
                case 49:
                    ?? r24 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq2 = zzq(i12);
                    int i35 = zzafq.zza;
                    int size6 = r24.size();
                    if (size6 == 0) {
                        r12 = z10;
                    } else {
                        boolean z11 = z10;
                        r12 = z11;
                        while (r13 < size6) {
                            r13 = z11;
                            int iZzA2 = zzafq.zzA(i16, (zzafc) r24.get(r13), zzafpVarZzq2);
                            r13++;
                            r12 = (r12 == true ? 1 : 0) + iZzA2;
                        }
                        r13 = z11;
                    }
                    i13 += r12;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(obj, j10);
                    zzaev zzaevVar = (zzaev) zzr(i12);
                    if (zzaewVar.isEmpty()) {
                        Zzo = z10;
                    } else {
                        Zzo = z10;
                        for (Map.Entry entry2 : zzaewVar.entrySet()) {
                            Zzo += zzaevVar.zzd(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i13 += Zzo;
                    break;
                case 51:
                    if (zzM(obj, i16, i12)) {
                        iZzE = zzada.zzE(i16 << 3);
                        Zzz = iZzE + 8;
                        i13 += Zzz;
                    }
                    break;
                case 52:
                    if (zzM(obj, i16, i12)) {
                        iZzE2 = zzada.zzE(i16 << 3);
                        Zzz = iZzE2 + 4;
                        i13 += Zzz;
                    }
                    break;
                case 53:
                    if (zzM(obj, i16, i12)) {
                        long jZzH = zzH(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(jZzH);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 54:
                    if (zzM(obj, i16, i12)) {
                        long jZzH2 = zzH(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(jZzH2);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 55:
                    if (zzM(obj, i16, i12)) {
                        long jZzG = zzG(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(jZzG);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 56:
                    if (zzM(obj, i16, i12)) {
                        iZzE = zzada.zzE(i16 << 3);
                        Zzz = iZzE + 8;
                        i13 += Zzz;
                    }
                    break;
                case 57:
                    if (zzM(obj, i16, i12)) {
                        iZzE2 = zzada.zzE(i16 << 3);
                        Zzz = iZzE2 + 4;
                        i13 += Zzz;
                    }
                    break;
                case 58:
                    if (zzM(obj, i16, i12)) {
                        iZzE4 = zzada.zzE(i16 << 3);
                        Zzz = iZzE4 + 1;
                        i13 += Zzz;
                    }
                    break;
                case 59:
                    if (zzM(obj, i16, i12)) {
                        int i36 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzacr) {
                            iZzE5 = zzada.zzE(i36);
                            iZzb = ((zzacr) object2).zzb();
                            iZzE6 = zzada.zzE(iZzb);
                        } else {
                            iZzE5 = zzada.zzE(i36);
                            iZzb = zzagl.zzb((String) object2);
                            iZzE6 = zzada.zzE(iZzb);
                        }
                        Zzz = iZzE5 + iZzE6 + iZzb;
                        i13 += Zzz;
                    }
                    break;
                case 60:
                    if (zzM(obj, i16, i12)) {
                        Zzz = zzafq.zzz(i16, unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzz;
                    }
                    break;
                case 61:
                    if (zzM(obj, i16, i12)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(obj, j10);
                        iZzE5 = zzada.zzE(i16 << 3);
                        iZzb = zzacrVar2.zzb();
                        iZzE6 = zzada.zzE(iZzb);
                        Zzz = iZzE5 + iZzE6 + iZzb;
                        i13 += Zzz;
                    }
                    break;
                case 62:
                    if (zzM(obj, i16, i12)) {
                        int iZzG = zzG(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzE(iZzG);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 63:
                    if (zzM(obj, i16, i12)) {
                        long jZzG2 = zzG(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF(jZzG2);
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 64:
                    if (zzM(obj, i16, i12)) {
                        iZzE2 = zzada.zzE(i16 << 3);
                        Zzz = iZzE2 + 4;
                        i13 += Zzz;
                    }
                    break;
                case 65:
                    if (zzM(obj, i16, i12)) {
                        iZzE = zzada.zzE(i16 << 3);
                        Zzz = iZzE + 8;
                        i13 += Zzz;
                    }
                    break;
                case 66:
                    if (zzM(obj, i16, i12)) {
                        int iZzG2 = zzG(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzE((iZzG2 >> 31) ^ (iZzG2 + iZzG2));
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 67:
                    if (zzM(obj, i16, i12)) {
                        long jZzH3 = zzH(obj, j10);
                        iZzE3 = zzada.zzE(i16 << 3);
                        iZzF = zzada.zzF((jZzH3 >> 63) ^ (jZzH3 + jZzH3));
                        Zzz = iZzE3 + iZzF;
                        i13 += Zzz;
                    }
                    break;
                case 68:
                    if (zzM(obj, i16, i12)) {
                        Zzz = zzafq.zzA(i16, (zzafc) unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzz;
                    }
                    break;
            }
            i12 += 3;
            i14 = i10;
            r15 = r16;
            z10 = false;
            i11 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzf(Object obj, zzago zzagoVar) throws IOException {
        Map.Entry entry;
        int i10;
        int i11;
        int i12;
        Map.Entry entry2;
        if (this.zzh) {
            zzadk zzadkVar = ((zzadr) obj).zzb;
            if (zzadkVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzadkVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < iArr.length) {
            int iZzA = zzA(i16);
            int iZzC = zzC(iZzA);
            int i17 = iArr[i16];
            if (iZzC <= 17) {
                int i18 = iArr[i16 + 2];
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i10 = i14;
                i11 = i15;
                i12 = 1 << (i18 >>> 20);
            } else {
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j10 = iZzA & i13;
            switch (iZzC) {
                case 0:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzf(i17, zzagg.zzk(obj, j10));
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 1:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zze(i17, zzagg.zzi(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 2:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzc(i17, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 3:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzh(i17, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 4:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzi(i17, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 5:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzj(i17, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 6:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzk(i17, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 7:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzl(i17, zzagg.zzg(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 8:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzT(i17, unsafe.getObject(obj, j10), zzagoVar);
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 9:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzr(i17, unsafe.getObject(obj, j10), zzq(i16));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 10:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzn(i17, (zzacr) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 11:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzo(i17, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 12:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzg(i17, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 13:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzb(i17, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 14:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzd(i17, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 15:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzp(i17, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 16:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzq(i17, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 17:
                    entry2 = entry;
                    if (zzJ(obj, i16, i10, i11, i12)) {
                        zzagoVar.zzs(i17, unsafe.getObject(obj, j10), zzq(i16));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i14 = i10;
                    entry = entry2;
                    i15 = i11;
                    i13 = 1048575;
                    break;
                case 18:
                    zzafq.zza(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 19:
                    zzafq.zzb(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 20:
                    zzafq.zzc(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 21:
                    zzafq.zzd(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 22:
                    zzafq.zzh(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 23:
                    zzafq.zzf(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 24:
                    zzafq.zzk(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 25:
                    zzafq.zzn(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 26:
                    int i20 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i21 = zzafq.zza;
                    if (list != null && !list.isEmpty()) {
                        zzagoVar.zzF(i20, list);
                    }
                    break;
                case 27:
                    int i22 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq = zzq(i16);
                    int i23 = zzafq.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((zzadb) zzagoVar).zzr(i22, list2.get(i24), zzafpVarZzq);
                        }
                    }
                    break;
                case 28:
                    int i25 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzafq.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzagoVar.zzG(i25, list3);
                    }
                    break;
                case 29:
                    zzafq.zzi(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 30:
                    zzafq.zzm(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 31:
                    zzafq.zzl(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 32:
                    zzafq.zzg(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 33:
                    zzafq.zzj(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 34:
                    zzafq.zze(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    break;
                case 35:
                    zzafq.zza(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 36:
                    zzafq.zzb(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 37:
                    zzafq.zzc(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 38:
                    zzafq.zzd(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 39:
                    zzafq.zzh(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 40:
                    zzafq.zzf(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 41:
                    zzafq.zzk(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 42:
                    zzafq.zzn(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 43:
                    zzafq.zzi(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 44:
                    zzafq.zzm(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 45:
                    zzafq.zzl(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 46:
                    zzafq.zzg(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 47:
                    zzafq.zzj(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 48:
                    zzafq.zze(iArr[i16], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 49:
                    int i27 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq2 = zzq(i16);
                    int i28 = zzafq.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            ((zzadb) zzagoVar).zzs(i27, list4.get(i29), zzafpVarZzq2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzagoVar.zzM(i17, ((zzaev) zzr(i16)).zze(), (zzaew) object);
                    }
                    break;
                case 51:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzf(i17, ((Double) zzagg.zzm(obj, j10)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zze(i17, ((Float) zzagg.zzm(obj, j10)).floatValue());
                    }
                    break;
                case 53:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzc(i17, zzH(obj, j10));
                    }
                    break;
                case 54:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzh(i17, zzH(obj, j10));
                    }
                    break;
                case 55:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzi(i17, zzG(obj, j10));
                    }
                    break;
                case 56:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzj(i17, zzH(obj, j10));
                    }
                    break;
                case 57:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzk(i17, zzG(obj, j10));
                    }
                    break;
                case 58:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzl(i17, ((Boolean) zzagg.zzm(obj, j10)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzM(obj, i17, i16)) {
                        zzT(i17, unsafe.getObject(obj, j10), zzagoVar);
                    }
                    break;
                case 60:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzr(i17, unsafe.getObject(obj, j10), zzq(i16));
                    }
                    break;
                case 61:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzn(i17, (zzacr) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzo(i17, zzG(obj, j10));
                    }
                    break;
                case 63:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzg(i17, zzG(obj, j10));
                    }
                    break;
                case 64:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzb(i17, zzG(obj, j10));
                    }
                    break;
                case 65:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzd(i17, zzH(obj, j10));
                    }
                    break;
                case 66:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzp(i17, zzG(obj, j10));
                    }
                    break;
                case 67:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzq(i17, zzH(obj, j10));
                    }
                    break;
                case 68:
                    if (zzM(obj, i17, i16)) {
                        zzagoVar.zzs(i17, unsafe.getObject(obj, j10), zzq(i16));
                    }
                    break;
            }
            entry2 = entry;
            i16 += 3;
            i14 = i10;
            entry = entry2;
            i15 = i11;
            i13 = 1048575;
        }
        Map.Entry entry3 = entry;
        if (entry3 != null) {
            throw null;
        }
        ((zzadu) obj).zzc.zzg(zzagoVar);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x051c  */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzg(Object obj, zzafo zzafoVar, zzadf zzadfVar) throws IOException {
        Object objZzx;
        zzadfVar.getClass();
        zzF(obj);
        zzafz zzafzVar = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzafoVar.zzb();
                int iZzP = zzP(iZzb);
                if (iZzP >= 0) {
                    int iZzA = zzA(iZzP);
                    try {
                        switch (zzC(iZzA)) {
                            case 0:
                                zzagg.zzl(obj, iZzA & 1048575, zzafoVar.zze());
                                zzL(obj, iZzP);
                                continue;
                            case 1:
                                zzagg.zzj(obj, iZzA & 1048575, zzafoVar.zzf());
                                zzL(obj, iZzP);
                                continue;
                            case 2:
                                zzagg.zzf(obj, iZzA & 1048575, zzafoVar.zzh());
                                zzL(obj, iZzP);
                                continue;
                            case 3:
                                zzagg.zzf(obj, iZzA & 1048575, zzafoVar.zzg());
                                zzL(obj, iZzP);
                                continue;
                            case 4:
                                zzagg.zzd(obj, iZzA & 1048575, zzafoVar.zzi());
                                zzL(obj, iZzP);
                                continue;
                            case 5:
                                zzagg.zzf(obj, iZzA & 1048575, zzafoVar.zzj());
                                zzL(obj, iZzP);
                                continue;
                            case 6:
                                zzagg.zzd(obj, iZzA & 1048575, zzafoVar.zzk());
                                zzL(obj, iZzP);
                                continue;
                            case 7:
                                zzagg.zzh(obj, iZzA & 1048575, zzafoVar.zzl());
                                zzL(obj, iZzP);
                                continue;
                            case 8:
                                zzz(obj, iZzA, zzafoVar);
                                zzL(obj, iZzP);
                                continue;
                            case 9:
                                zzafc zzafcVar = (zzafc) zzt(obj, iZzP);
                                zzafoVar.zzo(zzafcVar, zzq(iZzP), zzadfVar);
                                zzu(obj, iZzP, zzafcVar);
                                continue;
                            case 10:
                                zzagg.zzn(obj, iZzA & 1048575, zzafoVar.zzq());
                                zzL(obj, iZzP);
                                continue;
                            case 11:
                                zzagg.zzd(obj, iZzA & 1048575, zzafoVar.zzr());
                                zzL(obj, iZzP);
                                continue;
                            case 12:
                                int iZzs = zzafoVar.zzs();
                                zzadz zzadzVarZzs = zzs(iZzP);
                                if (zzadzVarZzs == null || zzadzVarZzs.zza(iZzs)) {
                                    zzagg.zzd(obj, iZzA & 1048575, iZzs);
                                    zzL(obj, iZzP);
                                    continue;
                                } else {
                                    objZzh = zzafq.zzG(obj, iZzb, iZzs, objZzh, zzafzVar);
                                }
                                break;
                            case 13:
                                zzagg.zzd(obj, iZzA & 1048575, zzafoVar.zzt());
                                zzL(obj, iZzP);
                                continue;
                            case 14:
                                zzagg.zzf(obj, iZzA & 1048575, zzafoVar.zzu());
                                zzL(obj, iZzP);
                                continue;
                            case 15:
                                zzagg.zzd(obj, iZzA & 1048575, zzafoVar.zzv());
                                zzL(obj, iZzP);
                                continue;
                            case 16:
                                zzagg.zzf(obj, iZzA & 1048575, zzafoVar.zzw());
                                zzL(obj, iZzP);
                                continue;
                            case 17:
                                zzafc zzafcVar2 = (zzafc) zzt(obj, iZzP);
                                zzafoVar.zzp(zzafcVar2, zzq(iZzP), zzadfVar);
                                zzu(obj, iZzP, zzafcVar2);
                                continue;
                            case 18:
                                zzafoVar.zzx(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 19:
                                zzafoVar.zzy(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 20:
                                zzafoVar.zzA(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 21:
                                zzafoVar.zzz(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 22:
                                zzafoVar.zzB(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 23:
                                zzafoVar.zzC(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 24:
                                zzafoVar.zzD(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 25:
                                zzafoVar.zzE(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 26:
                                if (zzD(iZzA)) {
                                    ((zzacw) zzafoVar).zzF(zzaeo.zza(obj, iZzA & 1048575), true);
                                } else {
                                    ((zzacw) zzafoVar).zzF(zzaeo.zza(obj, iZzA & 1048575), false);
                                    continue;
                                }
                                break;
                            case 27:
                                zzafoVar.zzG(zzaeo.zza(obj, iZzA & 1048575), zzq(iZzP), zzadfVar);
                                continue;
                            case 28:
                                zzafoVar.zzI(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 29:
                                zzafoVar.zzJ(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 30:
                                List listZza = zzaeo.zza(obj, iZzA & 1048575);
                                zzafoVar.zzK(listZza);
                                objZzh = zzafq.zzF(obj, iZzb, listZza, zzs(iZzP), objZzh, zzafzVar);
                                continue;
                            case 31:
                                zzafoVar.zzL(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 32:
                                zzafoVar.zzM(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 33:
                                zzafoVar.zzN(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 34:
                                zzafoVar.zzO(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 35:
                                zzafoVar.zzx(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 36:
                                zzafoVar.zzy(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 37:
                                zzafoVar.zzA(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 38:
                                zzafoVar.zzz(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 39:
                                zzafoVar.zzB(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 40:
                                zzafoVar.zzC(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 41:
                                zzafoVar.zzD(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 42:
                                zzafoVar.zzE(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 43:
                                zzafoVar.zzJ(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 44:
                                List listZza2 = zzaeo.zza(obj, iZzA & 1048575);
                                zzafoVar.zzK(listZza2);
                                objZzh = zzafq.zzF(obj, iZzb, listZza2, zzs(iZzP), objZzh, zzafzVar);
                                continue;
                            case 45:
                                zzafoVar.zzL(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 46:
                                zzafoVar.zzM(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 47:
                                zzafoVar.zzN(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 48:
                                zzafoVar.zzO(zzaeo.zza(obj, iZzA & 1048575));
                                continue;
                            case 49:
                                zzafoVar.zzH(zzaeo.zza(obj, iZzA & 1048575), zzq(iZzP), zzadfVar);
                                continue;
                            case 50:
                                Object objZzr = zzr(iZzP);
                                long jZzA = zzA(iZzP) & 1048575;
                                Object objZzm = zzagg.zzm(obj, jZzA);
                                if (objZzm == null) {
                                    objZzm = zzaew.zza().zzc();
                                    zzagg.zzn(obj, jZzA, objZzm);
                                } else if (zzaex.zza(objZzm)) {
                                    Object objZzc = zzaew.zza().zzc();
                                    zzaex.zzb(objZzc, objZzm);
                                    zzagg.zzn(obj, jZzA, objZzc);
                                    objZzm = objZzc;
                                }
                                zzafoVar.zzP((zzaew) objZzm, ((zzaev) objZzr).zze(), zzadfVar);
                                continue;
                            case 51:
                                zzagg.zzn(obj, iZzA & 1048575, Double.valueOf(zzafoVar.zze()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 52:
                                zzagg.zzn(obj, iZzA & 1048575, Float.valueOf(zzafoVar.zzf()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 53:
                                zzagg.zzn(obj, iZzA & 1048575, Long.valueOf(zzafoVar.zzh()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 54:
                                zzagg.zzn(obj, iZzA & 1048575, Long.valueOf(zzafoVar.zzg()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 55:
                                zzagg.zzn(obj, iZzA & 1048575, Integer.valueOf(zzafoVar.zzi()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 56:
                                zzagg.zzn(obj, iZzA & 1048575, Long.valueOf(zzafoVar.zzj()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 57:
                                zzagg.zzn(obj, iZzA & 1048575, Integer.valueOf(zzafoVar.zzk()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 58:
                                zzagg.zzn(obj, iZzA & 1048575, Boolean.valueOf(zzafoVar.zzl()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 59:
                                zzz(obj, iZzA, zzafoVar);
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 60:
                                zzafc zzafcVar3 = (zzafc) zzv(obj, iZzb, iZzP);
                                zzafoVar.zzo(zzafcVar3, zzq(iZzP), zzadfVar);
                                zzw(obj, iZzb, iZzP, zzafcVar3);
                                continue;
                            case 61:
                                zzagg.zzn(obj, iZzA & 1048575, zzafoVar.zzq());
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 62:
                                zzagg.zzn(obj, iZzA & 1048575, Integer.valueOf(zzafoVar.zzr()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 63:
                                int iZzs2 = zzafoVar.zzs();
                                zzadz zzadzVarZzs2 = zzs(iZzP);
                                if (zzadzVarZzs2 == null || zzadzVarZzs2.zza(iZzs2)) {
                                    zzagg.zzn(obj, iZzA & 1048575, Integer.valueOf(iZzs2));
                                    zzO(obj, iZzb, iZzP);
                                    continue;
                                } else {
                                    objZzh = zzafq.zzG(obj, iZzb, iZzs2, objZzh, zzafzVar);
                                }
                                break;
                            case 64:
                                zzagg.zzn(obj, iZzA & 1048575, Integer.valueOf(zzafoVar.zzt()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 65:
                                zzagg.zzn(obj, iZzA & 1048575, Long.valueOf(zzafoVar.zzu()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 66:
                                zzagg.zzn(obj, iZzA & 1048575, Integer.valueOf(zzafoVar.zzv()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 67:
                                zzagg.zzn(obj, iZzA & 1048575, Long.valueOf(zzafoVar.zzw()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 68:
                                zzafc zzafcVar4 = (zzafc) zzv(obj, iZzb, iZzP);
                                zzafoVar.zzp(zzafcVar4, zzq(iZzP), zzadfVar);
                                zzw(obj, iZzb, iZzP, zzafcVar4);
                                continue;
                            default:
                                if (objZzh == null) {
                                    objZzh = zzafzVar.zzh(obj);
                                }
                                if (!zzafzVar.zzk(objZzh, zzafoVar, 0)) {
                                    objZzx = objZzh;
                                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                        objZzx = zzx(obj, this.zzj[i10], objZzx, zzafzVar, obj);
                                    }
                                }
                                break;
                        }
                    } catch (zzaeg unused) {
                        if (objZzh == null) {
                            objZzh = zzafzVar.zzh(obj);
                        }
                        if (!zzafzVar.zzk(objZzh, zzafoVar, 0)) {
                            objZzx = objZzh;
                            for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                                objZzx = zzx(obj, this.zzj[i11], objZzx, zzafzVar, obj);
                            }
                            if (objZzx != null) {
                                zzafzVar.zzi(obj, objZzx);
                            }
                        }
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx = objZzh;
                    for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                        objZzx = zzx(obj, this.zzj[i12], objZzx, zzafzVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzadfVar.zzc(this.zzg, iZzb)) != null) {
                        throw null;
                    }
                    if (objZzh == null) {
                        objZzh = zzafzVar.zzh(obj);
                    }
                    if (!zzafzVar.zzk(objZzh, zzafoVar, 0)) {
                        objZzx = objZzh;
                        for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                            objZzx = zzx(obj, this.zzj[i13], objZzx, zzafzVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Object objZzx2 = objZzh;
                for (int i14 = this.zzk; i14 < this.zzl; i14++) {
                    objZzx2 = zzx(obj, this.zzj[i14], objZzx2, zzafzVar, obj);
                }
                if (objZzx2 != null) {
                    zzafzVar.zzi(obj, objZzx2);
                }
                throw th;
            }
        }
        if (objZzx != null) {
            zzafzVar.zzi(obj, objZzx);
        }
    }

    /* JADX WARN: Code duplicated, block: B:526:0x0db1 A[PHI: r0 r5 r7 r8 r12 r21 r31
      0x0db1: PHI (r0v232 int) = 
      (r0v199 int)
      (r0v200 int)
      (r0v201 int)
      (r0v202 int)
      (r0v203 int)
      (r0v204 int)
      (r0v206 int)
      (r0v207 int)
      (r0v210 int)
      (r0v219 int)
      (r0v233 int)
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0db1: PHI (r5v71 'this' com.google.android.gms.internal.measurement.zzaff<T>) = 
      (r5v54 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v55 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v56 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v57 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v58 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v59 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v61 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v62 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v63 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v66 'this' com.google.android.gms.internal.measurement.zzaff<T>)
      (r5v72 'this' com.google.android.gms.internal.measurement.zzaff<T>)
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0db1: PHI (r7v78 java.lang.Object) = 
      (r7v56 java.lang.Object)
      (r7v57 java.lang.Object)
      (r7v58 java.lang.Object)
      (r7v59 java.lang.Object)
      (r7v60 java.lang.Object)
      (r7v61 java.lang.Object)
      (r7v63 java.lang.Object)
      (r7v64 java.lang.Object)
      (r7v65 java.lang.Object)
      (r7v70 java.lang.Object)
      (r35v0 java.lang.Object A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0db1: PHI (r8v113 int) = 
      (r8v89 int)
      (r8v90 int)
      (r8v91 int)
      (r8v92 int)
      (r8v93 int)
      (r8v94 int)
      (r8v96 int)
      (r8v97 int)
      (r8v98 int)
      (r8v103 int)
      (r23v16 int)
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0db1: PHI (r12v75 com.google.android.gms.internal.measurement.zzacg) = 
      (r12v50 com.google.android.gms.internal.measurement.zzacg)
      (r12v51 com.google.android.gms.internal.measurement.zzacg)
      (r12v52 com.google.android.gms.internal.measurement.zzacg)
      (r12v53 com.google.android.gms.internal.measurement.zzacg)
      (r12v54 com.google.android.gms.internal.measurement.zzacg)
      (r12v55 com.google.android.gms.internal.measurement.zzacg)
      (r12v57 com.google.android.gms.internal.measurement.zzacg)
      (r12v58 com.google.android.gms.internal.measurement.zzacg)
      (r12v60 com.google.android.gms.internal.measurement.zzacg)
      (r5v53 com.google.android.gms.internal.measurement.zzacg)
      (r12v76 com.google.android.gms.internal.measurement.zzacg)
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0db1: PHI (r21v24 int) = 
      (r21v16 int)
      (r21v16 int)
      (r21v16 int)
      (r21v16 int)
      (r21v16 int)
      (r21v16 int)
      (r21v16 int)
      (r21v16 int)
      (r21v17 int)
      (r21v21 int)
      (r21v16 int)
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0db1: PHI (r31v45 int) = 
      (r31v25 int)
      (r31v26 int)
      (r31v27 int)
      (r31v28 int)
      (r31v29 int)
      (r31v30 int)
      (r31v32 int)
      (r31v33 int)
      (r31v34 int)
      (r31v38 int)
      (r12v48 int)
     binds: [B:524:0x0d9a, B:521:0x0d78, B:517:0x0d56, B:514:0x0d38, B:511:0x0d1a, B:508:0x0cfb, B:501:0x0cd2, B:487:0x0c95, B:485:0x0c81, B:481:0x0c49, B:453:0x0b58] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:542:0x0e07  */
    /* JADX WARN: Code duplicated, block: B:606:0x09b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0db4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x09c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0dc6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    final int zzi(Object obj, byte[] bArr, int i10, int i11, int i12, zzacg zzacgVar) throws IOException {
        String str;
        Unsafe unsafe;
        zzaff<T> zzaffVar;
        int i13;
        int i14;
        int i15;
        int iZzb;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        byte b10;
        zzaff<T> zzaffVar2;
        int i21;
        int i22;
        int i23;
        int iZzc;
        int i24;
        byte b11;
        zzacg zzacgVar2;
        Unsafe unsafe3;
        zzaff<T> zzaffVar3;
        int i25;
        String str2;
        int i26;
        int i27;
        Unsafe unsafe4;
        int i28;
        int i29;
        int iZza;
        int i30;
        zzaff<T> zzaffVar4;
        int i31;
        int iZzl;
        int iZza2;
        Unsafe unsafe5;
        String str3;
        int i32;
        Object obj2;
        int i33;
        int i34;
        int i35;
        int iZza3;
        int iZzc2;
        zzaff<T> zzaffVar5;
        int i36;
        int i37;
        int i38;
        int i39;
        zzaff<T> zzaffVar6 = this;
        obj = obj;
        i11 = i11;
        i12 = i12;
        zzacg zzacgVar3 = zzacgVar;
        zzF(obj);
        Unsafe unsafe6 = zzb;
        int iZzo = i10;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = -1;
        int i44 = 1048575;
        while (true) {
            if (iZzo < i11) {
                int i45 = iZzo + 1;
                int i46 = bArr[iZzo];
                if (i46 < 0) {
                    iZzb = zzach.zzb(i46, bArr, i45, zzacgVar3);
                    i15 = zzacgVar3.zza;
                } else {
                    i15 = i46;
                    iZzb = i45;
                }
                int i47 = i15 >>> 3;
                int iZzQ = i47 > i43 ? (i47 < zzaffVar6.zze || i47 > zzaffVar6.zzf) ? -1 : zzaffVar6.zzQ(i47, i40 / 3) : zzaffVar6.zzP(i47);
                if (iZzQ != -1) {
                    int i48 = i15 & 7;
                    int[] iArr = zzaffVar6.zzc;
                    int i49 = i15;
                    int i50 = iArr[iZzQ + 1];
                    str = "Failed to parse the message.";
                    int iZzC = zzC(i50);
                    long j10 = i50 & 1048575;
                    if (iZzC <= 17) {
                        int i51 = iArr[iZzQ + 2];
                        int i52 = 1 << (i51 >>> 20);
                        char c10 = 65535;
                        int i53 = i51 & 1048575;
                        if (i53 != i44) {
                            if (i44 != 1048575) {
                                unsafe6.putInt(obj, i44, i42);
                            }
                            i42 = i53 == 1048575 ? 0 : unsafe6.getInt(obj, i53);
                            i18 = i53;
                        } else {
                            i18 = i44;
                        }
                        switch (iZzC) {
                            case 0:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 1) {
                                    iZzo = iZzb + 8;
                                    i42 |= i52;
                                    zzagg.zzl(obj, j10, Double.longBitsToDouble(zzach.zze(bArr, iZzb)));
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe7 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe7;
                                }
                                break;
                            case 1:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 5) {
                                    iZzo = iZzb + 4;
                                    i42 |= i52;
                                    zzagg.zzj(obj, j10, Float.intBitsToFloat(zzach.zzd(bArr, iZzb)));
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe8 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe8;
                                }
                                break;
                            case 2:
                            case 3:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 0) {
                                    i23 = i52 | i42;
                                    iZzc = zzach.zzc(bArr, iZzb, zzacgVar3);
                                    unsafe6.putLong(obj, j10, zzacgVar3.zzb);
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i42 = i23;
                                    iZzo = iZzc;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe9 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe9;
                                }
                                break;
                            case 4:
                            case 11:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 0) {
                                    i42 |= i52;
                                    iZzo = zzach.zza(bArr, iZzb, zzacgVar3);
                                    unsafe6.putInt(obj, j10, zzacgVar3.zza);
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe10 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe10;
                                }
                                break;
                            case 5:
                            case 14:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 1) {
                                    iZzc = iZzb + 8;
                                    i23 = i52 | i42;
                                    unsafe6.putLong(obj, j10, zzach.zze(bArr, iZzb));
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i42 = i23;
                                    iZzo = iZzc;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe11 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe11;
                                }
                                break;
                            case 6:
                            case 13:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 5) {
                                    iZzo = iZzb + 4;
                                    i42 |= i52;
                                    unsafe6.putInt(obj, j10, zzach.zzd(bArr, iZzb));
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe12 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe12;
                                }
                                break;
                            case 7:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 0) {
                                    i42 |= i52;
                                    iZzo = zzach.zzc(bArr, iZzb, zzacgVar3);
                                    zzagg.zzh(obj, j10, zzacgVar3.zzb != 0);
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe13 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe13;
                                }
                                break;
                            case 8:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 2) {
                                    if (zzD(i50)) {
                                        i42 |= i52;
                                        iZzo = zzach.zzf(bArr, iZzb, zzacgVar3);
                                    } else {
                                        iZzo = zzach.zza(bArr, iZzb, zzacgVar3);
                                        int i54 = zzacgVar3.zza;
                                        if (i54 < 0) {
                                            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i55 = i42 | i52;
                                        if (i54 == 0) {
                                            zzacgVar3.zzc = "";
                                        } else {
                                            zzacgVar3.zzc = new String(bArr, iZzo, i54, StandardCharsets.UTF_8);
                                            iZzo += i54;
                                        }
                                        i42 = i55;
                                    }
                                    unsafe6.putObject(obj, j10, zzacgVar3.zzc);
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe14 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe14;
                                }
                                break;
                            case 9:
                                b10 = -1;
                                zzaffVar2 = this;
                                i21 = iZzQ;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 2) {
                                    Object objZzt = zzaffVar2.zzt(obj, i21);
                                    iZzo = zzach.zzj(objZzt, zzaffVar2.zzq(i21), bArr, iZzb, i11, zzacgVar);
                                    zzaffVar2.zzu(obj, i21, objZzt);
                                    i41 = i22 == true ? 1 : 0;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i42 = i52 | i42;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    iZzb = iZzb;
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe15 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe15;
                                }
                                break;
                            case 10:
                                b10 = -1;
                                zzaffVar2 = this;
                                i21 = iZzQ;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 2) {
                                    i42 |= i52;
                                    iZzo = zzach.zzg(bArr, iZzb, zzacgVar3);
                                    unsafe6.putObject(obj, j10, zzacgVar3.zzc);
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    iZzb = iZzb;
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe16 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe16;
                                }
                                break;
                            case 12:
                                i21 = iZzQ;
                                i22 = i49 == true ? 1 : 0;
                                b11 = -1;
                                if (i48 == 0) {
                                    iZzo = zzach.zza(bArr, iZzb, zzacgVar3);
                                    int i56 = zzacgVar3.zza;
                                    zzaffVar2 = this;
                                    zzadz zzadzVarZzs = zzaffVar2.zzs(i21);
                                    if ((i50 & Integer.MIN_VALUE) == 0 || zzadzVarZzs == null || zzadzVarZzs.zza(i56)) {
                                        i42 |= i52;
                                        unsafe6.putInt(obj, j10, i56);
                                    } else {
                                        zzh(obj).zzk(i22 == true ? 1 : 0, Long.valueOf(i56));
                                    }
                                    i41 = i22;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i43 = i47;
                                    i44 = i18;
                                } else {
                                    this = this;
                                    iZzb = iZzb;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe17 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe17;
                                }
                                break;
                            case 15:
                                i22 = i49 == true ? 1 : 0;
                                b11 = -1;
                                if (i48 == 0) {
                                    i42 |= i52;
                                    iZzo = zzach.zza(bArr, iZzb, zzacgVar3);
                                    unsafe6.putInt(obj, j10, zzacv.zzR(zzacgVar3.zza));
                                    i41 = i22 == true ? 1 : 0;
                                    i40 = iZzQ;
                                    i43 = i47;
                                    i44 = i18;
                                    zzaffVar6 = this;
                                } else {
                                    i24 = iZzQ;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe18 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe18;
                                }
                                break;
                            case 16:
                                if (i48 == 0) {
                                    int iZzc3 = zzach.zzc(bArr, iZzb, zzacgVar3);
                                    unsafe6.putLong(obj, j10, zzacv.zzS(zzacgVar3.zzb));
                                    i41 = i49 == true ? 1 : 0;
                                    i42 |= i52;
                                    iZzo = iZzc3;
                                    i40 = iZzQ;
                                    i43 = i47;
                                    i44 = i18;
                                    zzaffVar6 = this;
                                } else {
                                    i22 = i49 == true ? 1 : 0;
                                    b11 = -1;
                                    i24 = iZzQ;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe19 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe19;
                                }
                                break;
                            default:
                                b10 = -1;
                                zzaffVar2 = this;
                                iZzb = iZzb;
                                i21 = iZzQ;
                                c10 = 65535;
                                i22 = i49 == true ? 1 : 0;
                                if (i48 == 3) {
                                    Object objZzt2 = zzaffVar2.zzt(obj, i21);
                                    int iZzk = zzach.zzk(objZzt2, zzaffVar2.zzq(i21), bArr, iZzb, i11, (i47 << 3) | 4, zzacgVar);
                                    zzaffVar2.zzu(obj, i21, objZzt2);
                                    i11 = i11;
                                    i12 = i12;
                                    zzacgVar3 = zzacgVar3;
                                    unsafe6 = unsafe6;
                                    i41 = i22 == true ? 1 : 0;
                                    iZzo = iZzk;
                                    i43 = i47;
                                    i44 = i18;
                                    zzaffVar6 = zzaffVar2;
                                    i40 = i21;
                                    i42 |= i52;
                                } else {
                                    this = zzaffVar2;
                                    unsafe6 = unsafe6;
                                    zzacgVar3 = zzacgVar3;
                                    i42 = i42;
                                    i24 = i21;
                                    zzacgVar3 = zzacgVar3;
                                    i20 = i24;
                                    i14 = i22;
                                    i17 = i42;
                                    i19 = i47;
                                    i12 = i12;
                                    Unsafe unsafe110 = unsafe6;
                                    this = this;
                                    i16 = iZzb;
                                    unsafe2 = unsafe110;
                                }
                                break;
                        }
                    } else {
                        i17 = i42;
                        i18 = i44;
                        Unsafe unsafe20 = unsafe6;
                        int i57 = iZzb;
                        zzacg zzacgVar4 = zzacgVar3;
                        zzaff<T> zzaffVar7 = zzaffVar6;
                        int i58 = i49 == true ? 1 : 0;
                        if (iZzC != 27) {
                            if (iZzC <= 49) {
                                int i59 = i47;
                                long j11 = i50;
                                zzaef zzaefVarZzg = (zzaef) unsafe20.getObject(obj, j10);
                                if (!zzaefVarZzg.zza()) {
                                    int size = zzaefVarZzg.size();
                                    zzaefVarZzg = zzaefVarZzg.zzg(size + size);
                                    unsafe20.putObject(obj, j10, zzaefVarZzg);
                                }
                                zzaef zzaefVar = zzaefVarZzg;
                                switch (iZzC) {
                                    case 18:
                                    case 35:
                                        zzaffVar3 = this;
                                        i25 = i11;
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        str2 = str;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        if (i48 != 2) {
                                            if (i48 == 1) {
                                                iZzo = i57 + 8;
                                                int i60 = zzach.zza;
                                                zzadc zzadcVar = (zzadc) zzaefVar;
                                                zzadcVar.zzf(Double.longBitsToDouble(zzach.zze(bArr, i57)));
                                                while (iZzo < i25) {
                                                    int iZza4 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        zzadcVar.zzf(Double.longBitsToDouble(zzach.zze(bArr, iZza4)));
                                                        iZzo = iZza4 + 8;
                                                    }
                                                }
                                            }
                                            unsafe20 = unsafe20;
                                            i59 = i27;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i61 = zzach.zza;
                                            zzadc zzadcVar2 = (zzadc) zzaefVar;
                                            iZzo = zzach.zza(bArr, i57, zzacgVar4);
                                            int i62 = zzacgVar4.zza;
                                            int i63 = iZzo + i62;
                                            if (i63 > bArr.length) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzadcVar2.zzh(zzadcVar2.size() + (i62 / 8));
                                            while (iZzo < i63) {
                                                zzadcVar2.zzf(Double.longBitsToDouble(zzach.zze(bArr, iZzo)));
                                                iZzo += 8;
                                            }
                                            if (iZzo != i63) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        unsafe20 = unsafe20;
                                        i59 = i27;
                                        i29 = i26;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        zzaffVar3 = this;
                                        i25 = i11;
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        str2 = str;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        if (i48 != 2) {
                                            if (i48 == 5) {
                                                iZzo = i57 + 4;
                                                int i64 = zzach.zza;
                                                zzadm zzadmVar = (zzadm) zzaefVar;
                                                zzadmVar.zzf(Float.intBitsToFloat(zzach.zzd(bArr, i57)));
                                                while (iZzo < i25) {
                                                    int iZza5 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        zzadmVar.zzf(Float.intBitsToFloat(zzach.zzd(bArr, iZza5)));
                                                        iZzo = iZza5 + 4;
                                                    }
                                                }
                                            }
                                            unsafe20 = unsafe20;
                                            i59 = i27;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i65 = zzach.zza;
                                            zzadm zzadmVar2 = (zzadm) zzaefVar;
                                            iZzo = zzach.zza(bArr, i57, zzacgVar4);
                                            int i66 = zzacgVar4.zza;
                                            int i67 = iZzo + i66;
                                            if (i67 > bArr.length) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzadmVar2.zzh(zzadmVar2.size() + (i66 / 4));
                                            while (iZzo < i67) {
                                                zzadmVar2.zzf(Float.intBitsToFloat(zzach.zzd(bArr, iZzo)));
                                                iZzo += 4;
                                            }
                                            if (iZzo != i67) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        unsafe20 = unsafe20;
                                        i59 = i27;
                                        i29 = i26;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzaffVar3 = this;
                                        i25 = i11;
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        str2 = str;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                int i68 = zzach.zza;
                                                zzaeq zzaeqVar = (zzaeq) zzaefVar;
                                                iZzo = zzach.zzc(bArr, i57, zzacgVar4);
                                                zzaeqVar.zzf(zzacgVar4.zzb);
                                                while (iZzo < i25) {
                                                    int iZza6 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        iZzo = zzach.zzc(bArr, iZza6, zzacgVar4);
                                                        zzaeqVar.zzf(zzacgVar4.zzb);
                                                    }
                                                }
                                            }
                                            unsafe20 = unsafe20;
                                            i59 = i27;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i69 = zzach.zza;
                                            zzaeq zzaeqVar2 = (zzaeq) zzaefVar;
                                            iZzo = zzach.zza(bArr, i57, zzacgVar4);
                                            int i70 = zzacgVar4.zza + iZzo;
                                            while (iZzo < i70) {
                                                iZzo = zzach.zzc(bArr, iZzo, zzacgVar4);
                                                zzaeqVar2.zzf(zzacgVar4.zzb);
                                            }
                                            if (iZzo != i70) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        unsafe20 = unsafe20;
                                        i59 = i27;
                                        i29 = i26;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        unsafe4 = unsafe20;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        i28 = i11;
                                        if (i48 == 2) {
                                            iZzo = zzach.zzm(bArr, i57, zzaefVar, zzacgVar4);
                                            zzaffVar3 = this;
                                            unsafe20 = unsafe4;
                                            i25 = i28;
                                            i59 = i27;
                                            str2 = str;
                                            i29 = i26;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else if (i48 == 0) {
                                            zzaffVar3 = this;
                                            i25 = i28;
                                            str2 = str;
                                            iZzo = zzach.zzl(i58 == true ? 1 : 0, bArr, i57, i11, zzaefVar, zzacgVar);
                                            unsafe20 = unsafe4;
                                            i59 = i27;
                                            i29 = i26;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            zzaffVar3 = this;
                                            i25 = i28;
                                            str2 = str;
                                            unsafe20 = unsafe4;
                                            i59 = i27;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        unsafe4 = unsafe20;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        i28 = i11;
                                        if (i48 != 2) {
                                            if (i48 == 1) {
                                                iZzo = i57 + 8;
                                                int i71 = zzach.zza;
                                                zzaeq zzaeqVar3 = (zzaeq) zzaefVar;
                                                zzaeqVar3.zzf(zzach.zze(bArr, i57));
                                                while (iZzo < i28) {
                                                    int iZza7 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        zzaeqVar3.zzf(zzach.zze(bArr, iZza7));
                                                        iZzo = iZza7 + 8;
                                                    }
                                                }
                                            }
                                            zzaffVar3 = this;
                                            unsafe20 = unsafe4;
                                            i25 = i28;
                                            i59 = i27;
                                            str2 = str;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i72 = zzach.zza;
                                            zzaeq zzaeqVar4 = (zzaeq) zzaefVar;
                                            iZzo = zzach.zza(bArr, i57, zzacgVar4);
                                            int i73 = zzacgVar4.zza;
                                            int i74 = iZzo + i73;
                                            if (i74 > bArr.length) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzaeqVar4.zzh(zzaeqVar4.size() + (i73 / 8));
                                            while (iZzo < i74) {
                                                zzaeqVar4.zzf(zzach.zze(bArr, iZzo));
                                                iZzo += 8;
                                            }
                                            if (iZzo != i74) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzaffVar3 = this;
                                        unsafe20 = unsafe4;
                                        i25 = i28;
                                        i59 = i27;
                                        str2 = str;
                                        i29 = i26;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        unsafe4 = unsafe20;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        i28 = i11;
                                        if (i48 != 2) {
                                            if (i48 == 5) {
                                                iZzo = i57 + 4;
                                                int i75 = zzach.zza;
                                                zzadv zzadvVar = (zzadv) zzaefVar;
                                                zzadvVar.zzh(zzach.zzd(bArr, i57));
                                                while (iZzo < i28) {
                                                    int iZza8 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        zzadvVar.zzh(zzach.zzd(bArr, iZza8));
                                                        iZzo = iZza8 + 4;
                                                    }
                                                }
                                            }
                                            zzaffVar3 = this;
                                            unsafe20 = unsafe4;
                                            i25 = i28;
                                            i59 = i27;
                                            str2 = str;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i76 = zzach.zza;
                                            zzadv zzadvVar2 = (zzadv) zzaefVar;
                                            iZzo = zzach.zza(bArr, i57, zzacgVar4);
                                            int i77 = zzacgVar4.zza;
                                            int i78 = iZzo + i77;
                                            if (i78 > bArr.length) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzadvVar2.zzi(zzadvVar2.size() + (i77 / 4));
                                            while (iZzo < i78) {
                                                zzadvVar2.zzh(zzach.zzd(bArr, iZzo));
                                                iZzo += 4;
                                            }
                                            if (iZzo != i78) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzaffVar3 = this;
                                        unsafe20 = unsafe4;
                                        i25 = i28;
                                        i59 = i27;
                                        str2 = str;
                                        i29 = i26;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        String str4 = str;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        i28 = i11;
                                        if (i48 != 2) {
                                            str = str4;
                                            unsafe4 = unsafe20;
                                            if (i48 == 0) {
                                                int i79 = zzach.zza;
                                                zzaci zzaciVar = (zzaci) zzaefVar;
                                                iZzo = zzach.zzc(bArr, i57, zzacgVar4);
                                                zzaciVar.zzf(zzacgVar4.zzb != 0);
                                                while (iZzo < i28) {
                                                    int iZza9 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        iZzo = zzach.zzc(bArr, iZza9, zzacgVar4);
                                                        zzaciVar.zzf(zzacgVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            zzaffVar3 = this;
                                            unsafe20 = unsafe4;
                                            i25 = i28;
                                            i59 = i27;
                                            str2 = str;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i80 = zzach.zza;
                                            zzaci zzaciVar2 = (zzaci) zzaefVar;
                                            iZzo = zzach.zza(bArr, i57, zzacgVar4);
                                            int i81 = zzacgVar4.zza + iZzo;
                                            while (iZzo < i81) {
                                                iZzo = zzach.zzc(bArr, iZzo, zzacgVar4);
                                                String str5 = str4;
                                                Unsafe unsafe21 = unsafe20;
                                                zzaciVar2.zzf(zzacgVar4.zzb != 0);
                                                unsafe20 = unsafe21;
                                                str4 = str5;
                                            }
                                            str = str4;
                                            unsafe4 = unsafe20;
                                            if (iZzo != i81) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzaffVar3 = this;
                                        unsafe20 = unsafe4;
                                        i25 = i28;
                                        i59 = i27;
                                        str2 = str;
                                        i29 = i26;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 26:
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        if (i48 == 2) {
                                            if ((j11 & 536870912) == 0) {
                                                iZza = zzach.zza(bArr, i57, zzacgVar4);
                                                int i82 = zzacgVar4.zza;
                                                if (i82 < 0) {
                                                    throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i82 == 0) {
                                                    zzaefVar.add("");
                                                } else {
                                                    zzaefVar.add(new String(bArr, iZza, i82, StandardCharsets.UTF_8));
                                                    iZza += i82;
                                                }
                                                while (iZza < i11) {
                                                    int iZza10 = zzach.zza(bArr, iZza, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        iZza = zzach.zza(bArr, iZza10, zzacgVar4);
                                                        int i83 = zzacgVar4.zza;
                                                        if (i83 < 0) {
                                                            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i83 == 0) {
                                                            zzaefVar.add("");
                                                        } else {
                                                            zzaefVar.add(new String(bArr, iZza, i83, StandardCharsets.UTF_8));
                                                            iZza += i83;
                                                        }
                                                    } else {
                                                        zzaffVar3 = this;
                                                    }
                                                }
                                                zzaffVar3 = this;
                                            } else {
                                                iZza = zzach.zza(bArr, i57, zzacgVar4);
                                                int i84 = zzacgVar4.zza;
                                                if (i84 < 0) {
                                                    throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i84 == 0) {
                                                    zzaefVar.add("");
                                                } else {
                                                    int i85 = iZza + i84;
                                                    if (!zzagl.zza(bArr, iZza, i85)) {
                                                        throw new zzaeh("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzaefVar.add(new String(bArr, iZza, i84, StandardCharsets.UTF_8));
                                                    iZza = i85;
                                                }
                                                while (iZza < i11) {
                                                    int iZza11 = zzach.zza(bArr, iZza, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        iZza = zzach.zza(bArr, iZza11, zzacgVar4);
                                                        int i86 = zzacgVar4.zza;
                                                        if (i86 < 0) {
                                                            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i86 == 0) {
                                                            zzaefVar.add("");
                                                        } else {
                                                            int i87 = iZza + i86;
                                                            if (!zzagl.zza(bArr, iZza, i87)) {
                                                                throw new zzaeh("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzaefVar.add(new String(bArr, iZza, i86, StandardCharsets.UTF_8));
                                                            iZza = i87;
                                                        }
                                                    } else {
                                                        zzaffVar3 = this;
                                                    }
                                                }
                                                zzaffVar3 = this;
                                            }
                                            iZzo = iZza;
                                            i25 = i11;
                                            str2 = str;
                                            unsafe20 = unsafe20;
                                            i59 = i27;
                                            i29 = i26;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            zzaffVar3 = this;
                                            i25 = i11;
                                            str2 = str;
                                            unsafe20 = unsafe20;
                                            i59 = i27;
                                            i29 = i26;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        }
                                        break;
                                    case 27:
                                        i25 = i11;
                                        i30 = iZzQ;
                                        zzaffVar4 = this;
                                        if (i48 == 2) {
                                            zzacgVar4 = zzacgVar4;
                                            int iZzn = zzach.zzn(zzaffVar4.zzq(i30), i58 == true ? 1 : 0, bArr, i57, i11, zzaefVar, zzacgVar);
                                            zzaffVar3 = zzaffVar4;
                                            str2 = str;
                                            unsafe20 = unsafe20;
                                            iZzo = iZzn;
                                            i29 = i30;
                                            i57 = i57;
                                        } else {
                                            zzacgVar4 = zzacgVar4;
                                            unsafe20 = unsafe20;
                                            i57 = i57;
                                            i29 = i30;
                                            str2 = str;
                                            zzaffVar3 = zzaffVar4;
                                            iZzo = i57;
                                        }
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 28:
                                        i25 = i11;
                                        i30 = iZzQ;
                                        zzaffVar4 = this;
                                        if (i48 == 2) {
                                            int iZza12 = zzach.zza(bArr, i57, zzacgVar4);
                                            int i88 = zzacgVar4.zza;
                                            if (i88 < 0) {
                                                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i88 > bArr.length - iZza12) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i88 == 0) {
                                                zzaefVar.add(zzacr.zza);
                                            } else {
                                                zzaefVar.add(zzacr.zzj(bArr, iZza12, i88));
                                                iZza12 += i88;
                                            }
                                            while (iZza12 < i25) {
                                                int iZza13 = zzach.zza(bArr, iZza12, zzacgVar4);
                                                if (i58 == zzacgVar4.zza) {
                                                    iZza12 = zzach.zza(bArr, iZza13, zzacgVar4);
                                                    int i89 = zzacgVar4.zza;
                                                    if (i89 < 0) {
                                                        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i89 > bArr.length - iZza12) {
                                                        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i89 == 0) {
                                                        zzaefVar.add(zzacr.zza);
                                                    } else {
                                                        zzaefVar.add(zzacr.zzj(bArr, iZza12, i89));
                                                        iZza12 += i89;
                                                    }
                                                } else {
                                                    unsafe20 = unsafe20;
                                                    i57 = i57;
                                                    zzacgVar4 = zzacgVar4;
                                                    i29 = i30;
                                                    str2 = str;
                                                    zzaffVar3 = zzaffVar4;
                                                    iZzo = iZza12;
                                                }
                                            }
                                            unsafe20 = unsafe20;
                                            i57 = i57;
                                            zzacgVar4 = zzacgVar4;
                                            i29 = i30;
                                            str2 = str;
                                            zzaffVar3 = zzaffVar4;
                                            iZzo = iZza12;
                                        } else {
                                            unsafe20 = unsafe20;
                                            i57 = i57;
                                            zzacgVar4 = zzacgVar4;
                                            i29 = i30;
                                            str2 = str;
                                            zzaffVar3 = zzaffVar4;
                                            iZzo = i57;
                                        }
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i25 = i11;
                                        i31 = iZzQ;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                iZzl = zzach.zzl(i58 == true ? 1 : 0, bArr, i57, i11, zzaefVar, zzacgVar);
                                            }
                                            zzaffVar3 = this;
                                            zzacgVar4 = zzacgVar4;
                                            i57 = i57;
                                            i25 = i25;
                                            unsafe20 = unsafe20;
                                            i29 = i31;
                                            str2 = str;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            iZzl = zzach.zzm(bArr, i57, zzaefVar, zzacgVar4);
                                        }
                                        zzafq.zzF(obj, i59, zzaefVar, zzs(i31), null, this.zzm);
                                        iZzo = iZzl;
                                        zzaffVar3 = this;
                                        i29 = i31;
                                        str2 = str;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i25 = i11;
                                        i31 = iZzQ;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                int i90 = zzach.zza;
                                                zzadv zzadvVar3 = (zzadv) zzaefVar;
                                                iZza2 = zzach.zza(bArr, i57, zzacgVar4);
                                                zzadvVar3.zzh(zzacv.zzR(zzacgVar4.zza));
                                                while (iZza2 < i25) {
                                                    int iZza14 = zzach.zza(bArr, iZza2, zzacgVar4);
                                                    if (i58 == zzacgVar4.zza) {
                                                        iZza2 = zzach.zza(bArr, iZza14, zzacgVar4);
                                                        zzadvVar3.zzh(zzacv.zzR(zzacgVar4.zza));
                                                    }
                                                }
                                            }
                                            zzaffVar3 = this;
                                            zzacgVar4 = zzacgVar4;
                                            i57 = i57;
                                            i25 = i25;
                                            unsafe20 = unsafe20;
                                            i29 = i31;
                                            str2 = str;
                                            iZzo = i57;
                                            if (iZzo != i57) {
                                                i25 = i25;
                                                i12 = i12;
                                                i41 = i58 == true ? 1 : 0;
                                                i11 = i25;
                                                zzaffVar6 = zzaffVar3;
                                                i40 = i29;
                                                i42 = i17;
                                                i43 = i59;
                                                i44 = i18;
                                                unsafe6 = unsafe20;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            } else {
                                                i25 = i25;
                                                i16 = iZzo;
                                                i14 = i58 == true ? 1 : 0;
                                                this = zzaffVar3;
                                                i20 = i29;
                                                str = str2;
                                                i19 = i59;
                                                unsafe2 = unsafe20;
                                                i12 = i12;
                                                zzacgVar3 = zzacgVar4;
                                                obj = obj;
                                            }
                                        } else {
                                            int i91 = zzach.zza;
                                            zzadv zzadvVar4 = (zzadv) zzaefVar;
                                            iZza2 = zzach.zza(bArr, i57, zzacgVar4);
                                            int i92 = zzacgVar4.zza + iZza2;
                                            while (iZza2 < i92) {
                                                iZza2 = zzach.zza(bArr, iZza2, zzacgVar4);
                                                zzadvVar4.zzh(zzacv.zzR(zzacgVar4.zza));
                                            }
                                            if (iZza2 != i92) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzaffVar3 = this;
                                        iZzo = iZza2;
                                        i25 = i25;
                                        i29 = i31;
                                        str2 = str;
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i48 == 2) {
                                            int i93 = zzach.zza;
                                            zzaeq zzaeqVar5 = (zzaeq) zzaefVar;
                                            int iZza15 = zzach.zza(bArr, i57, zzacgVar4);
                                            int i94 = zzacgVar4.zza + iZza15;
                                            while (iZza15 < i94) {
                                                iZza15 = zzach.zzc(bArr, iZza15, zzacgVar4);
                                                zzaeqVar5.zzf(zzacv.zzS(zzacgVar4.zzb));
                                            }
                                            if (iZza15 != i94) {
                                                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzaffVar3 = this;
                                            i25 = i11;
                                            zzacgVar4 = zzacgVar4;
                                            iZzo = iZza15;
                                            i57 = i57;
                                            unsafe20 = unsafe20;
                                            str2 = str;
                                            i29 = iZzQ;
                                        } else if (i48 == 0) {
                                            int i95 = zzach.zza;
                                            zzaeq zzaeqVar6 = (zzaeq) zzaefVar;
                                            iZza2 = zzach.zzc(bArr, i57, zzacgVar4);
                                            zzaeqVar6.zzf(zzacv.zzS(zzacgVar4.zzb));
                                            i25 = i11;
                                            i31 = iZzQ;
                                            while (iZza2 < i25) {
                                                int iZza16 = zzach.zza(bArr, iZza2, zzacgVar4);
                                                if (i58 == zzacgVar4.zza) {
                                                    iZza2 = zzach.zzc(bArr, iZza16, zzacgVar4);
                                                    zzaeqVar6.zzf(zzacv.zzS(zzacgVar4.zzb));
                                                } else {
                                                    zzaffVar3 = this;
                                                    iZzo = iZza2;
                                                    i25 = i25;
                                                    i29 = i31;
                                                    str2 = str;
                                                }
                                            }
                                            zzaffVar3 = this;
                                            iZzo = iZza2;
                                            i25 = i25;
                                            i29 = i31;
                                            str2 = str;
                                        } else {
                                            zzaffVar3 = this;
                                            i25 = i11;
                                            zzacgVar4 = zzacgVar4;
                                            i57 = i57;
                                            unsafe20 = unsafe20;
                                            str2 = str;
                                            i29 = iZzQ;
                                            iZzo = i57;
                                        }
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                    default:
                                        zzaffVar3 = this;
                                        i25 = i11;
                                        zzacgVar4 = zzacgVar4;
                                        i57 = i57;
                                        str2 = str;
                                        i26 = iZzQ;
                                        i27 = i59;
                                        if (i48 == 3) {
                                            int i96 = ((i58 == true ? 1 : 0) & (-8)) | 4;
                                            zzafp zzafpVarZzq = zzaffVar3.zzq(i26);
                                            i59 = i27;
                                            i29 = i26;
                                            unsafe20 = unsafe20;
                                            iZzo = zzach.zzi(zzafpVarZzq, bArr, i57, i11, i96, zzacgVar);
                                            zzaefVar.add(zzacgVar4.zzc);
                                            while (iZzo < i25) {
                                                int iZza17 = zzach.zza(bArr, iZzo, zzacgVar4);
                                                if (i58 == zzacgVar4.zza) {
                                                    iZzo = zzach.zzi(zzafpVarZzq, bArr, iZza17, i11, i96, zzacgVar);
                                                    zzaefVar.add(zzacgVar4.zzc);
                                                }
                                            }
                                        } else {
                                            unsafe20 = unsafe20;
                                            i59 = i27;
                                            i29 = i26;
                                            iZzo = i57;
                                        }
                                        if (iZzo != i57) {
                                            i25 = i25;
                                            i12 = i12;
                                            i41 = i58 == true ? 1 : 0;
                                            i11 = i25;
                                            zzaffVar6 = zzaffVar3;
                                            i40 = i29;
                                            i42 = i17;
                                            i43 = i59;
                                            i44 = i18;
                                            unsafe6 = unsafe20;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        } else {
                                            i25 = i25;
                                            i16 = iZzo;
                                            i14 = i58 == true ? 1 : 0;
                                            this = zzaffVar3;
                                            i20 = i29;
                                            str = str2;
                                            i19 = i59;
                                            unsafe2 = unsafe20;
                                            i12 = i12;
                                            zzacgVar3 = zzacgVar4;
                                            obj = obj;
                                        }
                                        break;
                                }
                            } else {
                                unsafe3 = unsafe20;
                                int i97 = i11;
                                i19 = i47;
                                i20 = iZzQ;
                                if (iZzC != 50) {
                                    int i98 = i58 == true ? 1 : 0;
                                    zzacgVar3 = zzacgVar4;
                                    unsafe2 = unsafe3;
                                    long j12 = iArr[i20 + 2] & 1048575;
                                    switch (iZzC) {
                                        case 51:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 1) {
                                                iZza3 = i35 + 8;
                                                unsafe2.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzach.zze(bArr, i35))));
                                                unsafe2.putInt(obj, j12, i19);
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 52:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 5) {
                                                iZza3 = i35 + 4;
                                                unsafe2.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzach.zzd(bArr, i35))));
                                                unsafe2.putInt(obj, j12, i19);
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 0) {
                                                iZzc2 = zzach.zzc(bArr, i35, zzacgVar3);
                                                unsafe2.putObject(obj, j10, Long.valueOf(zzacgVar3.zzb));
                                                unsafe2.putInt(obj, j12, i19);
                                                iZza3 = iZzc2;
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 0) {
                                                iZza3 = zzach.zza(bArr, i35, zzacgVar3);
                                                unsafe2.putObject(obj, j10, Integer.valueOf(zzacgVar3.zza));
                                                unsafe2.putInt(obj, j12, i19);
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 1) {
                                                iZza3 = i35 + 8;
                                                unsafe2.putObject(obj, j10, Long.valueOf(zzach.zze(bArr, i35)));
                                                unsafe2.putInt(obj, j12, i19);
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 5) {
                                                iZza3 = i35 + 4;
                                                unsafe2.putObject(obj, j10, Integer.valueOf(zzach.zzd(bArr, i35)));
                                                unsafe2.putInt(obj, j12, i19);
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 58:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 0) {
                                                iZzc2 = zzach.zzc(bArr, i35, zzacgVar3);
                                                unsafe2.putObject(obj, j10, Boolean.valueOf(zzacgVar3.zzb != 0));
                                                unsafe2.putInt(obj, j12, i19);
                                                iZza3 = iZzc2;
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 59:
                                            i35 = i57;
                                            i20 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            if (i48 == 2) {
                                                iZza3 = zzach.zza(bArr, i35, zzacgVar3);
                                                int i99 = zzacgVar3.zza;
                                                if (i99 == 0) {
                                                    unsafe2.putObject(obj, j10, "");
                                                } else {
                                                    int i100 = iZza3 + i99;
                                                    if ((i50 & 536870912) != 0 && !zzagl.zza(bArr, iZza3, i100)) {
                                                        throw new zzaeh("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe2.putObject(obj, j10, new String(bArr, iZza3, i99, StandardCharsets.UTF_8));
                                                    iZza3 = i100;
                                                }
                                                unsafe2.putInt(obj, j12, i19);
                                            } else {
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 60:
                                            i19 = i19;
                                            obj = obj;
                                            if (i48 == 2) {
                                                Object objZzv = zzv(obj, i19, i20);
                                                zzafp zzafpVarZzq2 = zzq(i20);
                                                i39 = i98 == true ? 1 : 0;
                                                zzacgVar3 = zzacgVar3;
                                                int iZzj = zzach.zzj(objZzv, zzafpVarZzq2, bArr, i57, i11, zzacgVar);
                                                zzw(obj, i19, i20, objZzv);
                                                iZza3 = iZzj;
                                                i20 = i20;
                                                this = this;
                                                i35 = i57;
                                            } else {
                                                i98 = i98 == true ? 1 : 0;
                                                zzacgVar3 = zzacgVar3;
                                                this = this;
                                                i35 = i57;
                                                i20 = i20;
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 61:
                                            zzaffVar5 = this;
                                            i36 = i57;
                                            i37 = i20;
                                            i38 = i98 == true ? 1 : 0;
                                            i19 = i19;
                                            obj = obj;
                                            if (i48 == 2) {
                                                iZza3 = zzach.zzg(bArr, i36, zzacgVar3);
                                                unsafe2.putObject(obj, j10, zzacgVar3.zzc);
                                                unsafe2.putInt(obj, j12, i19);
                                                i20 = i37;
                                                i98 = i38;
                                                this = zzaffVar5;
                                                i35 = i36;
                                                if (iZza3 != i35) {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    iZzo = iZza3;
                                                    unsafe6 = unsafe2;
                                                    zzaffVar6 = this;
                                                    i43 = i19;
                                                    i42 = i17;
                                                    i41 = i98;
                                                    i44 = i18;
                                                    i40 = i20;
                                                } else {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i12 = i12;
                                                    i16 = iZza3;
                                                    i14 = i98;
                                                }
                                            } else {
                                                i20 = i37;
                                                i98 = i38 == true ? 1 : 0;
                                                this = zzaffVar5;
                                                i35 = i36;
                                                iZza3 = i35;
                                                if (iZza3 != i35) {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    iZzo = iZza3;
                                                    unsafe6 = unsafe2;
                                                    zzaffVar6 = this;
                                                    i43 = i19;
                                                    i42 = i17;
                                                    i41 = i98;
                                                    i44 = i18;
                                                    i40 = i20;
                                                } else {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i12 = i12;
                                                    i16 = iZza3;
                                                    i14 = i98;
                                                }
                                            }
                                            break;
                                        case 63:
                                            zzaffVar5 = this;
                                            i36 = i57;
                                            i37 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            if (i48 == 0) {
                                                iZza3 = zzach.zza(bArr, i36, zzacgVar3);
                                                int i101 = zzacgVar3.zza;
                                                zzadz zzadzVarZzs2 = zzaffVar5.zzs(i37);
                                                if (zzadzVarZzs2 == null || zzadzVarZzs2.zza(i101)) {
                                                    i38 = i98 == true ? 1 : 0;
                                                    unsafe2.putObject(obj, j10, Integer.valueOf(i101));
                                                    unsafe2.putInt(obj, j12, i19);
                                                } else {
                                                    zzaga zzagaVarZzh = zzh(obj);
                                                    Long lValueOf = Long.valueOf(i101);
                                                    i38 = i98 == true ? 1 : 0;
                                                    zzagaVarZzh.zzk(i38 == true ? 1 : 0, lValueOf);
                                                }
                                                i20 = i37;
                                                i98 = i38;
                                                this = zzaffVar5;
                                                i35 = i36;
                                                if (iZza3 != i35) {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    iZzo = iZza3;
                                                    unsafe6 = unsafe2;
                                                    zzaffVar6 = this;
                                                    i43 = i19;
                                                    i42 = i17;
                                                    i41 = i98;
                                                    i44 = i18;
                                                    i40 = i20;
                                                } else {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i12 = i12;
                                                    i16 = iZza3;
                                                    i14 = i98;
                                                }
                                            }
                                            i20 = i37;
                                            this = zzaffVar5;
                                            i35 = i36;
                                            iZza3 = i35;
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 66:
                                            zzaffVar5 = this;
                                            i36 = i57;
                                            i37 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            if (i48 == 0) {
                                                iZza3 = zzach.zza(bArr, i36, zzacgVar3);
                                                unsafe2.putObject(obj, j10, Integer.valueOf(zzacv.zzR(zzacgVar3.zza)));
                                                unsafe2.putInt(obj, j12, i19);
                                                i20 = i37;
                                                this = zzaffVar5;
                                                i35 = i36;
                                                if (iZza3 != i35) {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    iZzo = iZza3;
                                                    unsafe6 = unsafe2;
                                                    zzaffVar6 = this;
                                                    i43 = i19;
                                                    i42 = i17;
                                                    i41 = i98;
                                                    i44 = i18;
                                                    i40 = i20;
                                                } else {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i12 = i12;
                                                    i16 = iZza3;
                                                    i14 = i98;
                                                }
                                            }
                                            i20 = i37;
                                            this = zzaffVar5;
                                            i35 = i36;
                                            iZza3 = i35;
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 67:
                                            zzaffVar5 = this;
                                            i36 = i57;
                                            i37 = i20;
                                            i19 = i19;
                                            obj = obj;
                                            if (i48 == 0) {
                                                int iZzc4 = zzach.zzc(bArr, i36, zzacgVar3);
                                                unsafe2.putObject(obj, j10, Long.valueOf(zzacv.zzS(zzacgVar3.zzb)));
                                                unsafe2.putInt(obj, j12, i19);
                                                iZza3 = iZzc4;
                                                i20 = i37;
                                                this = zzaffVar5;
                                                i35 = i36;
                                                if (iZza3 != i35) {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    iZzo = iZza3;
                                                    unsafe6 = unsafe2;
                                                    zzaffVar6 = this;
                                                    i43 = i19;
                                                    i42 = i17;
                                                    i41 = i98;
                                                    i44 = i18;
                                                    i40 = i20;
                                                } else {
                                                    i98 = i39;
                                                    unsafe2 = unsafe2;
                                                    i12 = i12;
                                                    i16 = iZza3;
                                                    i14 = i98;
                                                }
                                            }
                                            i20 = i37;
                                            this = zzaffVar5;
                                            i35 = i36;
                                            iZza3 = i35;
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        case 68:
                                            if (i48 == 3) {
                                                int i102 = ((i98 == true ? 1 : 0) & (-8)) | 4;
                                                obj = obj;
                                                Object objZzv2 = zzv(obj, i19, i20);
                                                int iZzk2 = zzach.zzk(objZzv2, zzq(i20), bArr, i57, i11, i102, zzacgVar);
                                                zzw(obj, i19, i20, objZzv2);
                                                zzacgVar3 = zzacgVar3;
                                                i20 = i20;
                                                this = this;
                                                i35 = i57;
                                                i19 = i19;
                                                iZza3 = iZzk2;
                                            } else {
                                                i35 = i57;
                                                zzacgVar3 = zzacgVar3;
                                                this = this;
                                                iZza3 = i35;
                                            }
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                        default:
                                            i35 = i57;
                                            zzacgVar3 = zzacgVar3;
                                            this = this;
                                            iZza3 = i35;
                                            if (iZza3 != i35) {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i11 = i11;
                                                i12 = i12;
                                                iZzo = iZza3;
                                                unsafe6 = unsafe2;
                                                zzaffVar6 = this;
                                                i43 = i19;
                                                i42 = i17;
                                                i41 = i98;
                                                i44 = i18;
                                                i40 = i20;
                                            } else {
                                                i98 = i39;
                                                unsafe2 = unsafe2;
                                                i12 = i12;
                                                i16 = iZza3;
                                                i14 = i98;
                                            }
                                            break;
                                    }
                                } else if (i48 == 2) {
                                    Object objZzr = zzaffVar7.zzr(i20);
                                    zzacgVar2 = zzacgVar4;
                                    Unsafe unsafe22 = unsafe3;
                                    Object object = unsafe22.getObject(obj, j10);
                                    if (zzaex.zza(object)) {
                                        zzaew zzaewVarZzc = zzaew.zza().zzc();
                                        zzaex.zzb(zzaewVarZzc, object);
                                        unsafe22.putObject(obj, j10, zzaewVarZzc);
                                        object = zzaewVarZzc;
                                    }
                                    zzaeu zzaeuVarZze = ((zzaev) objZzr).zze();
                                    zzaew zzaewVar = (zzaew) object;
                                    int iZza18 = zzach.zza(bArr, i57, zzacgVar2);
                                    int i103 = zzacgVar2.zza;
                                    if (i103 < 0 || i103 > i97 - iZza18) {
                                        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    }
                                    int i104 = iZza18 + i103;
                                    Object obj3 = zzaeuVarZze.zzb;
                                    Object obj4 = zzaeuVarZze.zzd;
                                    Object obj5 = obj3;
                                    Object obj6 = obj4;
                                    while (iZza18 < i104) {
                                        Object obj7 = obj6;
                                        int iZzb2 = iZza18 + 1;
                                        int i105 = bArr[iZza18];
                                        if (i105 < 0) {
                                            iZzb2 = zzach.zzb(i105, bArr, iZzb2, zzacgVar2);
                                            i105 = zzacgVar2.zza;
                                        }
                                        Object obj8 = obj5;
                                        int i106 = i105 >>> 3;
                                        int i107 = i57;
                                        int i108 = i105 & 7;
                                        if (i106 != 1) {
                                            if (i106 != 2) {
                                                unsafe5 = unsafe22;
                                                str3 = str;
                                                obj8 = obj8;
                                                i32 = i107;
                                                obj2 = obj4;
                                                i33 = i58;
                                                i34 = i11;
                                                iZza18 = zzach.zzp(i105, bArr, iZzb2, i34, zzacgVar2);
                                                obj6 = obj7;
                                            } else {
                                                zzagm zzagmVar = zzaeuVarZze.zzc;
                                                if (i108 == zzagmVar.zzb()) {
                                                    unsafe5 = unsafe22;
                                                    obj8 = obj8;
                                                    str3 = str;
                                                    i32 = i107;
                                                    obj2 = obj4;
                                                    i33 = i58;
                                                    i34 = i11;
                                                    iZza18 = zzS(bArr, iZzb2, i11, zzagmVar, obj4.getClass(), zzacgVar);
                                                    obj6 = zzacgVar2.zzc;
                                                } else {
                                                    unsafe5 = unsafe22;
                                                    str3 = str;
                                                    i32 = i107;
                                                    obj2 = obj4;
                                                    i33 = i58;
                                                    i34 = i11;
                                                }
                                            }
                                            i97 = i34;
                                            i57 = i32;
                                            obj5 = obj8;
                                            obj4 = obj2;
                                            i58 = i33;
                                            unsafe22 = unsafe5;
                                            str = str3;
                                        } else {
                                            unsafe5 = unsafe22;
                                            str3 = str;
                                            i32 = i107;
                                            obj2 = obj4;
                                            i33 = i58;
                                            i34 = i11;
                                            zzagm zzagmVar2 = zzaeuVarZze.zza;
                                            if (i108 == zzagmVar2.zzb()) {
                                                iZza18 = zzS(bArr, iZzb2, i11, zzagmVar2, null, zzacgVar);
                                                obj5 = zzacgVar2.zzc;
                                                i97 = i34;
                                                i57 = i32;
                                                obj6 = obj7;
                                            }
                                            obj4 = obj2;
                                            i58 = i33;
                                            unsafe22 = unsafe5;
                                            str = str3;
                                        }
                                        iZza18 = zzach.zzp(i105, bArr, iZzb2, i34, zzacgVar2);
                                        obj6 = obj7;
                                        i97 = i34;
                                        i57 = i32;
                                        obj5 = obj8;
                                        obj4 = obj2;
                                        i58 = i33;
                                        unsafe22 = unsafe5;
                                        str = str3;
                                    }
                                    Object obj9 = obj6;
                                    int i109 = i57;
                                    int i110 = i58;
                                    Unsafe unsafe23 = unsafe22;
                                    String str6 = str;
                                    Object obj10 = obj5;
                                    int i111 = i97;
                                    if (iZza18 != i104) {
                                        throw new zzaeh(str6);
                                    }
                                    zzaewVar.put(obj10, obj9);
                                    if (i104 != i109) {
                                        obj = obj;
                                        i12 = i12;
                                        i11 = i111;
                                        iZzo = i104;
                                        i40 = i20;
                                        i42 = i17;
                                        i41 = i110 == true ? 1 : 0;
                                        i43 = i19;
                                        i44 = i18;
                                        unsafe6 = unsafe23;
                                        zzaffVar6 = this;
                                        zzacgVar3 = zzacgVar2;
                                    } else {
                                        i16 = i104;
                                        str = str6;
                                        i20 = i20;
                                        i14 = i110 == true ? 1 : 0;
                                        unsafe2 = unsafe23;
                                        zzacgVar3 = zzacgVar2;
                                        i19 = i19;
                                    }
                                } else {
                                    zzacgVar2 = zzacgVar4;
                                    i16 = i57;
                                    str = str;
                                    i20 = i20;
                                    i14 = i58 == true ? 1 : 0;
                                    unsafe2 = unsafe3;
                                    zzacgVar3 = zzacgVar2;
                                    i19 = i19;
                                }
                            }
                        } else if (i48 == 2) {
                            zzaef zzaefVarZzg2 = (zzaef) unsafe20.getObject(obj, j10);
                            if (!zzaefVarZzg2.zza()) {
                                int size2 = zzaefVarZzg2.size();
                                zzaefVarZzg2 = zzaefVarZzg2.zzg(size2 == 0 ? 10 : size2 + size2);
                                unsafe20.putObject(obj, j10, zzaefVarZzg2);
                            }
                            zzaef zzaefVar2 = zzaefVarZzg2;
                            i43 = i47;
                            int iZzn2 = zzach.zzn(zzaffVar7.zzq(iZzQ), i58 == true ? 1 : 0, bArr, i57, i11, zzaefVar2, zzacgVar);
                            i11 = i11;
                            i12 = i12;
                            zzacgVar3 = zzacgVar4;
                            iZzo = iZzn2;
                            unsafe6 = unsafe20;
                            i41 = i58 == true ? 1 : 0;
                            i44 = i18;
                            zzaffVar6 = zzaffVar7;
                            i40 = iZzQ;
                            i42 = i17;
                        } else {
                            zzacgVar2 = zzacgVar4;
                            i20 = iZzQ;
                            unsafe3 = unsafe20;
                            i19 = i47;
                            i16 = i57;
                            str = str;
                            i20 = i20;
                            i14 = i58 == true ? 1 : 0;
                            unsafe2 = unsafe3;
                            zzacgVar3 = zzacgVar2;
                            i19 = i19;
                        }
                    }
                } else {
                    i16 = iZzb;
                    i17 = i42;
                    i18 = i44;
                    this = zzaffVar6;
                    str = "Failed to parse the message.";
                    i19 = i47;
                    i12 = i12;
                    i20 = 0;
                    i14 = i15;
                    unsafe2 = unsafe6;
                }
                if (i14 != i12 || i12 == 0) {
                    if (this.zzh) {
                        zzadf zzadfVar = zzacgVar3.zzd;
                        int i112 = zzadf.zzb;
                        int i113 = zzacf.zza;
                        if (zzadfVar != zzadf.zza) {
                            zzafc zzafcVar = this.zzg;
                            int i114 = zzach.zza;
                            if (zzadfVar.zzc(zzafcVar, i19) != null) {
                                throw null;
                            }
                            iZzo = zzach.zzo((i14 == true ? 1 : 0) == true ? 1 : 0, bArr, i16, i11, zzh(obj), zzacgVar);
                        } else {
                            iZzo = zzach.zzo((i14 == true ? 1 : 0) == true ? 1 : 0, bArr, i16, i11, zzh(obj), zzacgVar);
                        }
                    } else {
                        iZzo = zzach.zzo((i14 == true ? 1 : 0) == true ? 1 : 0, bArr, i16, i11, zzh(obj), zzacgVar);
                    }
                    i11 = i11;
                    i12 = i12;
                    i43 = i19;
                    i41 = i14 == true ? 1 : 0;
                    zzaffVar6 = this;
                    i42 = i17;
                    i44 = i18;
                    i40 = i20;
                    unsafe6 = unsafe2;
                } else {
                    i13 = i16;
                    unsafe = unsafe2;
                    zzaffVar = this;
                    i42 = i17;
                    i44 = i18;
                }
            } else {
                str = "Failed to parse the message.";
                unsafe = unsafe6;
                zzaffVar = zzaffVar6;
                i12 = i12;
                i13 = iZzo;
                i14 = i41;
            }
        }
        if (i44 != 1048575) {
            unsafe.putInt(obj, i44, i42);
        }
        zzaga zzagaVar = null;
        for (int i115 = zzaffVar.zzk; i115 < zzaffVar.zzl; i115++) {
            zzagaVar = (zzaga) zzx(obj, zzaffVar.zzj[i115], zzagaVar, zzaffVar.zzm, obj);
        }
        if (zzagaVar != null) {
            zzaffVar.zzm.zzi(obj, zzagaVar);
        }
        if (i12 != 0) {
            String str7 = str;
            if (i13 > i11 || i14 != i12) {
                throw new zzaeh(str7);
            }
        } else if (i13 != i11) {
            throw new zzaeh(str);
        }
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zzacg zzacgVar) throws IOException {
        zzi(obj, bArr, i10, i11, 0, zzacgVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzadu) {
                zzadu zzaduVar = (zzadu) obj;
                zzaduVar.zzcp(Integer.MAX_VALUE);
                zzaduVar.zza = 0;
                zzaduVar.zzci();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzA = zzA(i10);
                int i11 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j10 = i11;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzK(obj, i10)) {
                                    zzq(i10).zzk(zzb.getObject(obj, j10));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzaef) zzagg.zzm(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzaew) object).zzd();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i10], i10)) {
                        zzq(i10).zzk(zzb.getObject(obj, j10));
                    }
                } else if (zzK(obj, i10)) {
                    zzq(i10).zzk(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[LOOP:2: B:52:0x00df->B:57:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x010d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        List list;
        zzafp zzafpVarZzq;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzk) {
            int i16 = this.zzj[i14];
            int iZzA = zzA(i16);
            int[] iArr = this.zzc;
            int i17 = iArr[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i15) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i15;
                i11 = i13;
            }
            if ((268435456 & iZzA) != 0 && !zzJ(obj, i16, i10, i11, i19)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzJ(obj, i16, i10, i11, i19) && !zzy(obj, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzagg.zzm(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzafpVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzafpVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(obj, iArr[i16], i16) && !zzy(obj, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzagg.zzm(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzafpVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zzafpVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzaew zzaewVar = (zzaew) zzagg.zzm(obj, iZzA & 1048575);
                if (!zzaewVar.isEmpty() && ((zzaev) zzr(i16)).zze().zzc.zza() == zzagn.MESSAGE) {
                    zzafp zzafpVarZzb = null;
                    for (Object obj2 : zzaewVar.values()) {
                        if (zzafpVarZzb == null) {
                            zzafpVarZzb = zzafl.zza().zzb(obj2.getClass());
                        }
                        if (!zzafpVarZzb.zzl(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzadr) obj).zzb.zze();
    }
}
