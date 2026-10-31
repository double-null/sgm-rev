package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzifs<T> implements zzigh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziha.zzr();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzifp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzigt zzm;
    private final zzidp zzn;

    private zzifs(int[] iArr, Object[] objArr, int i10, int i11, zzifp zzifpVar, boolean z10, int[] iArr2, int i12, int i13, zzifv zzifvVar, zzifb zzifbVar, zzigt zzigtVar, zzidp zzidpVar, zzifk zzifkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzifpVar instanceof zziee;
        boolean z11 = false;
        if (zzidpVar != null && (zzifpVar instanceof zziea)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzigtVar;
        this.zzn = zzidpVar;
        this.zzg = zzifpVar;
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
        if (obj instanceof zziee) {
            return ((zziee) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j10) {
        return ((Integer) zziha.zzm(obj, j10)).intValue();
    }

    private static long zzH(Object obj, long j10) {
        return ((Long) zziha.zzm(obj, j10)).longValue();
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
            return (zziha.zzc(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziha.zzk(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziha.zzi(obj, j11)) != 0;
            case 2:
                return zziha.zze(obj, j11) != 0;
            case 3:
                return zziha.zze(obj, j11) != 0;
            case 4:
                return zziha.zzc(obj, j11) != 0;
            case 5:
                return zziha.zze(obj, j11) != 0;
            case 6:
                return zziha.zzc(obj, j11) != 0;
            case 7:
                return zziha.zzg(obj, j11);
            case 8:
                Object objZzm = zziha.zzm(obj, j11);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzida) {
                    return !zzida.zza.equals(objZzm);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziha.zzm(obj, j11) != null;
            case 10:
                return !zzida.zza.equals(zziha.zzm(obj, j11));
            case 11:
                return zziha.zzc(obj, j11) != 0;
            case 12:
                return zziha.zzc(obj, j11) != 0;
            case 13:
                return zziha.zzc(obj, j11) != 0;
            case 14:
                return zziha.zze(obj, j11) != 0;
            case 15:
                return zziha.zzc(obj, j11) != 0;
            case 16:
                return zziha.zze(obj, j11) != 0;
            case 17:
                return zziha.zzm(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzL(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zziha.zzd(obj, j10, (1 << (iZzB >>> 20)) | zziha.zzc(obj, j10));
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zziha.zzc(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        return zziha.zzc(obj, jZzB) == zziha.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i10, int i11) {
        zziha.zzd(obj, zzB(i11) & 1048575, i10);
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

    private static final int zzR(byte[] bArr, int i10, int i11, zzihg zzihgVar, Class cls, zzico zzicoVar) throws IOException {
        int i12;
        zzihg zzihgVar2 = zzihg.zza;
        switch (zzihgVar.ordinal()) {
            case 0:
                i12 = i10 + 8;
                zzicoVar.zzc = Double.valueOf(Double.longBitsToDouble(zzicp.zze(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                zzicoVar.zzc = Float.valueOf(Float.intBitsToFloat(zzicp.zzd(bArr, i10)));
                break;
            case 2:
            case 3:
                int iZzc = zzicp.zzc(bArr, i10, zzicoVar);
                zzicoVar.zzc = Long.valueOf(zzicoVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzicp.zza(bArr, i10, zzicoVar);
                zzicoVar.zzc = Integer.valueOf(zzicoVar.zza);
                return iZza;
            case 5:
            case 15:
                i12 = i10 + 8;
                zzicoVar.zzc = Long.valueOf(zzicp.zze(bArr, i10));
                break;
            case 6:
            case 14:
                i12 = i10 + 4;
                zzicoVar.zzc = Integer.valueOf(zzicp.zzd(bArr, i10));
                break;
            case 7:
                int iZzc2 = zzicp.zzc(bArr, i10, zzicoVar);
                zzicoVar.zzc = Boolean.valueOf(zzicoVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzicp.zzf(bArr, i10, zzicoVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzicp.zzh(zzifz.zza().zzb(cls), bArr, i10, i11, zzicoVar);
            case 11:
                return zzicp.zzg(bArr, i10, zzicoVar);
            case 16:
                int iZza2 = zzicp.zza(bArr, i10, zzicoVar);
                zzicoVar.zzc = Integer.valueOf(zzide.zzM(zzicoVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzicp.zzc(bArr, i10, zzicoVar);
                zzicoVar.zzc = Long.valueOf(zzide.zzN(zzicoVar.zzb));
                return iZzc3;
        }
        return i12;
    }

    private static final void zzS(int i10, Object obj, zzihi zzihiVar) throws IOException {
        if (obj instanceof String) {
            zzihiVar.zzm(i10, (String) obj);
        } else {
            zzihiVar.zzn(i10, (zzida) obj);
        }
    }

    static zzigu zzh(Object obj) {
        zziee zzieeVar = (zziee) obj;
        zzigu zziguVar = zzieeVar.zzt;
        if (zziguVar != zzigu.zza()) {
            return zziguVar;
        }
        zzigu zziguVarZzb = zzigu.zzb();
        zzieeVar.zzt = zziguVarZzb;
        return zziguVarZzb;
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
    static zzifs zzm(Class cls, zzifm zzifmVar, zzifv zzifvVar, zzifb zzifbVar, zzigt zzigtVar, zzidp zzidpVar, zzifk zzifkVar) {
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
        if (!(zzifmVar instanceof zzigb)) {
            throw null;
        }
        zzigb zzigbVar = (zzigb) zzifmVar;
        String strZzd = zzigbVar.zzd();
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
        Object[] objArrZze = zzigbVar.zze();
        Class<?> cls2 = zzigbVar.zzb().getClass();
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
                        if (zzigbVar.zzc() == 1 || i86 != 0) {
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
                    zzigbVar = zzigbVar;
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
                zzigbVar = zzigbVar;
            } else {
                i26 = i14;
                i27 = i15 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i15]);
                if (i84 == 9 || i84 == 17) {
                    zzigbVar = zzigbVar;
                    int i98 = i75 / 3;
                    objArr[i98 + i98 + 1] = fieldZzn4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        i31 = i27 + 1;
                        int i99 = i75 / 3;
                        objArr[i99 + i99 + 1] = objArrZze[i27];
                        i27 = i31;
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        zzigbVar = zzigbVar;
                        if (zzigbVar.zzc() == 1 || i86 != 0) {
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
                            zzigbVar = zzigbVar;
                        } else {
                            i27 = i101;
                            i72 = i102;
                            i86 = 0;
                            zzigbVar = zzigbVar;
                        }
                    } else {
                        zzigbVar = zzigbVar;
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
                    zzigbVar = zzigbVar;
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
                zzigbVar = zzigbVar;
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
            zzigbVar = zzigbVar;
            i14 = i26;
            c10 = 55296;
        }
        return new zzifs(iArr3, objArr, i14, i12, zzigbVar.zzb(), false, iArr, i11, i70, zzifvVar, zzifbVar, zzigtVar, zzidpVar, zzifkVar);
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
            zzigh zzighVarZzq = zzq(i10);
            if (!zzK(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zzighVarZzq.zza();
                    zzighVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzL(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzighVarZzq.zza();
                zzighVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzighVarZzq.zzd(object2, object);
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
            zzigh zzighVarZzq = zzq(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zzighVarZzq.zza();
                    zzighVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzighVarZzq.zza();
                zzighVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzighVarZzq.zzd(object2, object);
        }
    }

    private final zzigh zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzigh zzighVar = (zzigh) objArr[i12];
        if (zzighVar != null) {
            return zzighVar;
        }
        zzigh zzighVarZzb = zzifz.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzighVarZzb;
        return zzighVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zziek zzs(int i10) {
        int i11 = i10 / 3;
        return (zziek) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzigh zzighVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzK(obj, i10)) {
            return zzighVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzighVarZzq.zza();
        if (object != null) {
            zzighVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzL(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzigh zzighVarZzq = zzq(i11);
        if (!zzM(obj, i10, i11)) {
            return zzighVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzighVarZzq.zza();
        if (object != null) {
            zzighVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzO(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzigt zzigtVar, Object obj3) {
        zziek zziekVarZzs;
        int i11 = this.zzc[i10];
        Object objZzm = zziha.zzm(obj, zzA(i10) & 1048575);
        if (objZzm == null || (zziekVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzifh zzifhVarZze = ((zzifi) zzr(i10)).zze();
        Iterator it = ((zzifj) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zziekVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzigtVar.zzh(obj3);
                }
                int iZzc = zzifi.zzc(zzifhVarZze, entry.getKey(), entry.getValue());
                zzida zzidaVar = zzida.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zzidj.zzb;
                zzidg zzidgVar = new zzidg(bArr, 0, iZzc);
                try {
                    zzifi.zzb(zzidgVar, zzifhVarZze, entry.getKey(), entry.getValue());
                    zzigtVar.zzd(obj2, i11, zzicw.zza(zzidgVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzigh zzighVar) {
        return zzighVar.zzl(zziha.zzm(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzigc zzigcVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zziha.zzn(obj, j10, zzigcVar.zzn());
        } else if (this.zzi) {
            zziha.zzn(obj, j10, zzigcVar.zzm());
        } else {
            zziha.zzn(obj, j10, zzigcVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final Object zza() {
        return ((zziee) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j10 = iZzA & 1048575;
                switch (iZzC) {
                    case 0:
                        if (!zzI(obj, obj2, i10) || Double.doubleToLongBits(zziha.zzk(obj, j10)) != Double.doubleToLongBits(zziha.zzk(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzI(obj, obj2, i10) || Float.floatToIntBits(zziha.zzi(obj, j10)) != Float.floatToIntBits(zziha.zzi(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzI(obj, obj2, i10) || zziha.zzg(obj, j10) != zziha.zzg(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
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
                        zZzG = zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10));
                        break;
                    case 50:
                        zZzG = zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10));
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
                        if (!zzN(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzG) {
                    return false;
                }
            }
        }
        int i11 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i11 >= iArr.length) {
                if (!((zziee) obj).zzt.equals(((zziee) obj2).zzt)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zziea) obj).zza.equals(((zziea) obj2).zza);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!zzN(obj, obj2, i12)) {
                return false;
            }
            if (!zzM(obj, 0, i12)) {
                long jZzA = zzA(i12) & 1048575;
                if (!zzigi.zzG(zziha.zzm(obj, jZzA), zziha.zzm(obj2, jZzA))) {
                    return false;
                }
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
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
                        jDoubleToLongBits = Double.doubleToLongBits(zziha.zzk(obj, j10));
                        byte[] bArr = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zziha.zzi(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr2 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr3 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr4 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzier.zza(zziha.zzg(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zziha.zzm(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzm = zziha.zzm(obj, j10);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr5 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr6 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzm2 = zziha.zzm(obj, j10);
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
                        iFloatToIntBits = zziha.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zziee) obj).zzt.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zziea) obj).zza.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + zziha.zzm(obj, zzA(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzigi.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzigi.zzH(this.zzn, obj, obj2);
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
                        zziha.zzl(obj, j10, zziha.zzk(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 1:
                    if (zzK(obj2, i10)) {
                        zziha.zzj(obj, j10, zziha.zzi(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 2:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 3:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 4:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 5:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 6:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 7:
                    if (zzK(obj2, i10)) {
                        zziha.zzh(obj, j10, zziha.zzg(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 8:
                    if (zzK(obj2, i10)) {
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (zzK(obj2, i10)) {
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 11:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 12:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 13:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 14:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 15:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 16:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
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
                    zzieq zzieqVarZzh = (zzieq) zziha.zzm(obj, j10);
                    zzieq zzieqVar = (zzieq) zziha.zzm(obj2, j10);
                    int size = zzieqVarZzh.size();
                    int size2 = zzieqVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzieqVarZzh.zza()) {
                            zzieqVarZzh = zzieqVarZzh.zzh(size2 + size);
                        }
                        zzieqVarZzh.addAll(zzieqVar);
                    }
                    if (size > 0) {
                        zzieqVar = zzieqVarZzh;
                    }
                    zziha.zzn(obj, j10, zzieqVar);
                    break;
                case 50:
                    int i13 = zzigi.zza;
                    zziha.zzn(obj, j10, zzifk.zzb(zziha.zzm(obj, j10), zziha.zzm(obj2, j10)));
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
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
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
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
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
    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zze(Object obj) {
        int i10;
        ?? r16;
        ?? r10;
        int iZzF;
        int iZzF2;
        int iZzF3;
        int iZzG;
        int iZzF4;
        int iZzF5;
        int iZzc;
        int iZzF6;
        ?? Zzs;
        int size;
        int iZzF7;
        int iZzc2;
        int iZzF8;
        int iZzc3;
        int iZzF9;
        ?? r11;
        int iZzaT;
        int iZzF10;
        ?? ZzF;
        ?? ZzD;
        int iZzB;
        int iZzF11;
        int iZzF12;
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
                int iZzi = i13 + ((zziee) obj).zzt.zzi();
                if (!this.zzh) {
                    return iZzi;
                }
                zzign zzignVar = ((zziea) obj).zza.zza;
                int iZzc4 = zzignVar.zzc();
                int iZzj = 0;
                for (int i15 = 0; i15 < iZzc4; i15++) {
                    Map.Entry entryZzd = zzignVar.zzd(i15);
                    iZzj += zzidt.zzj((zzids) ((zzigk) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzignVar.zze()) {
                    iZzj += zzidt.zzj((zzids) entry.getKey(), entry.getValue());
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
            if (iZzC >= zzidu.zzJ.zza()) {
                zzidu.zzW.zza();
            }
            long j10 = i19;
            switch (iZzC) {
                case 0:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF = zzidj.zzF(i16 << 3);
                        ZzD = iZzF + 8;
                        i13 += ZzD;
                    }
                    break;
                case 1:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF2 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF2 + 4;
                        i13 += ZzD;
                    }
                    break;
                case 2:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(j11);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 3:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(j12);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 4:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(j13);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 5:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF = zzidj.zzF(i16 << 3);
                        ZzD = iZzF + 8;
                        i13 += ZzD;
                    }
                    break;
                case 6:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF2 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF2 + 4;
                        i13 += ZzD;
                    }
                    break;
                case 7:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF4 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF4 + 1;
                        i13 += ZzD;
                    }
                    break;
                case 8:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzida) {
                            iZzF5 = zzidj.zzF(i20);
                            iZzc = ((zzida) object).zzb();
                            iZzF6 = zzidj.zzF(iZzc);
                        } else {
                            iZzF5 = zzidj.zzF(i20);
                            iZzc = zzihf.zzc((String) object);
                            iZzF6 = zzidj.zzF(iZzc);
                        }
                        ZzD = iZzF5 + iZzF6 + iZzc;
                        i13 += ZzD;
                    }
                    break;
                case 9:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        ZzD = zzigi.zzD(i16, unsafe.getObject(obj, j10), zzq(i12));
                        i13 += ZzD;
                    }
                    break;
                case 10:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        zzida zzidaVar = (zzida) unsafe.getObject(obj, j10);
                        iZzF5 = zzidj.zzF(i16 << 3);
                        iZzc = zzidaVar.zzb();
                        iZzF6 = zzidj.zzF(iZzc);
                        ZzD = iZzF5 + iZzF6 + iZzc;
                        i13 += ZzD;
                    }
                    break;
                case 11:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzF(i21);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 12:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(j14);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 13:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF2 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF2 + 4;
                        i13 += ZzD;
                    }
                    break;
                case 14:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzF = zzidj.zzF(i16 << 3);
                        ZzD = iZzF + 8;
                        i13 += ZzD;
                    }
                    break;
                case 15:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzF((i22 >> 31) ^ (i22 + i22));
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 16:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG((j15 >> 63) ^ (j15 + j15));
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 17:
                    if (zzJ(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        ZzD = zzigi.zzE(i16, (zzifp) unsafe.getObject(obj, j10), zzq(i12));
                        i13 += ZzD;
                    }
                    break;
                case 18:
                    ZzD = zzigi.zzC(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += ZzD;
                    break;
                case 19:
                    ZzD = zzigi.zzA(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += ZzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i23 = zzigi.zza;
                    if (list.size() == 0) {
                        Zzs = z10;
                    } else {
                        Zzs = zzigi.zzs(list) + (list.size() * zzidj.zzF(i16 << 3));
                    }
                    i13 += Zzs;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzigi.zza;
                    size = list2.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzF3 = zzigi.zzt(list2);
                        iZzF7 = zzidj.zzF(i16 << 3);
                        iZzG = size * iZzF7;
                        ZzD = iZzF3 + iZzG;
                    }
                    i13 += ZzD;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzigi.zza;
                    size = list3.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzF3 = zzigi.zzw(list3);
                        iZzF7 = zzidj.zzF(i16 << 3);
                        iZzG = size * iZzF7;
                        ZzD = iZzF3 + iZzG;
                    }
                    i13 += ZzD;
                    break;
                case 23:
                    ZzD = zzigi.zzC(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += ZzD;
                    break;
                case 24:
                    ZzD = zzigi.zzA(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += ZzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzigi.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        ZzD = z10;
                    } else {
                        ZzD = size2 * (zzidj.zzF(i16 << 3) + 1);
                    }
                    i13 += ZzD;
                    break;
                case 26:
                    ?? r17 = (List) unsafe.getObject(obj, j10);
                    int i27 = zzigi.zza;
                    int size3 = r17.size();
                    if (size3 == 0) {
                        Zzs = z10;
                    } else {
                        int iZzF13 = zzidj.zzF(i16 << 3) * size3;
                        if (r17 instanceof zzifa) {
                            zzifa zzifaVar = (zzifa) r17;
                            for (?? r18 = z10; r18 < size3; r18++) {
                                Object objZzc = zzifaVar.zzc();
                                if (objZzc instanceof zzida) {
                                    Zzs = iZzF13;
                                    iZzc3 = ((zzida) objZzc).zzb();
                                    iZzF9 = zzidj.zzF(iZzc3);
                                } else {
                                    Zzs = iZzF13;
                                    iZzc3 = zzihf.zzc((String) objZzc);
                                    iZzF9 = zzidj.zzF(iZzc3);
                                }
                                Zzs += iZzF9 + iZzc3;
                            }
                            Zzs = iZzF13;
                        } else {
                            for (?? r19 = z10; r19 < size3; r19++) {
                                Object obj2 = r17.get(r19);
                                if (obj2 instanceof zzida) {
                                    Zzs = iZzF13;
                                    iZzc2 = ((zzida) obj2).zzb();
                                    iZzF8 = zzidj.zzF(iZzc2);
                                } else {
                                    Zzs = iZzF13;
                                    iZzc2 = zzihf.zzc((String) obj2);
                                    iZzF8 = zzidj.zzF(iZzc2);
                                }
                                Zzs += iZzF8 + iZzc2;
                            }
                            Zzs = iZzF13;
                        }
                    }
                    i13 += Zzs;
                    break;
                case 27:
                    ?? r20 = (List) unsafe.getObject(obj, j10);
                    zzigh zzighVarZzq = zzq(i12);
                    int i28 = zzigi.zza;
                    int size4 = r20.size();
                    if (size4 == 0) {
                        r11 = z10;
                    } else {
                        int iZzF14 = zzidj.zzF(i16 << 3) * size4;
                        for (?? r21 = z10; r21 < size4; r21++) {
                            Object obj3 = r20.get(r21);
                            if (obj3 instanceof zziez) {
                                r11 = iZzF14;
                                iZzaT = ((zziez) obj3).zzb();
                                iZzF10 = zzidj.zzF(iZzaT);
                            } else {
                                r11 = iZzF14;
                                iZzaT = ((zzicj) obj3).zzaT(zzighVarZzq);
                                iZzF10 = zzidj.zzF(iZzaT);
                            }
                            r11 = (r11 == true ? 1 : 0) + iZzF10 + iZzaT;
                        }
                        r11 = iZzF14;
                    }
                    i13 += r11;
                    break;
                case 28:
                    ?? r22 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzigi.zza;
                    int size5 = r22.size();
                    if (size5 == 0) {
                        ZzF = z10;
                    } else {
                        ZzF = size5 * zzidj.zzF(i16 << 3);
                        for (?? r23 = z10; r23 < r22.size(); r23++) {
                            int iZzb = ((zzida) r22.get(r23)).zzb();
                            ZzF += zzidj.zzF(iZzb) + iZzb;
                        }
                    }
                    i13 += ZzF;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i30 = zzigi.zza;
                    size = list5.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzF3 = zzigi.zzx(list5);
                        iZzF7 = zzidj.zzF(i16 << 3);
                        iZzG = size * iZzF7;
                        ZzD = iZzF3 + iZzG;
                    }
                    i13 += ZzD;
                    break;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzigi.zza;
                    size = list6.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzF3 = zzigi.zzv(list6);
                        iZzF7 = zzidj.zzF(i16 << 3);
                        iZzG = size * iZzF7;
                        ZzD = iZzF3 + iZzG;
                    }
                    i13 += ZzD;
                    break;
                case 31:
                    ZzD = zzigi.zzA(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += ZzD;
                    break;
                case 32:
                    ZzD = zzigi.zzC(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += ZzD;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i32 = zzigi.zza;
                    size = list7.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzF3 = zzigi.zzy(list7);
                        iZzF7 = zzidj.zzF(i16 << 3);
                        iZzG = size * iZzF7;
                        ZzD = iZzF3 + iZzG;
                    }
                    i13 += ZzD;
                    break;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzigi.zza;
                    size = list8.size();
                    if (size == 0) {
                        ZzD = z10;
                    } else {
                        iZzF3 = zzigi.zzu(list8);
                        iZzF7 = zzidj.zzF(i16 << 3);
                        iZzG = size * iZzF7;
                        ZzD = iZzF3 + iZzG;
                    }
                    i13 += ZzD;
                    break;
                case 35:
                    iZzB = zzigi.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 36:
                    iZzB = zzigi.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 37:
                    iZzB = zzigi.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 38:
                    iZzB = zzigi.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 39:
                    iZzB = zzigi.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 40:
                    iZzB = zzigi.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 41:
                    iZzB = zzigi.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzigi.zza;
                    iZzB = list9.size();
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 43:
                    iZzB = zzigi.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 44:
                    iZzB = zzigi.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 45:
                    iZzB = zzigi.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 46:
                    iZzB = zzigi.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 47:
                    iZzB = zzigi.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 48:
                    iZzB = zzigi.zzu((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF11 = zzidj.zzF(i16 << 3);
                        iZzF12 = zzidj.zzF(iZzB);
                        ZzF = iZzF11 + iZzF12 + iZzB;
                        i13 += ZzF;
                    }
                    break;
                case 49:
                    ?? r24 = (List) unsafe.getObject(obj, j10);
                    zzigh zzighVarZzq2 = zzq(i12);
                    int i35 = zzigi.zza;
                    int size6 = r24.size();
                    if (size6 == 0) {
                        r12 = z10;
                    } else {
                        boolean z11 = z10;
                        r12 = z11;
                        while (r13 < size6) {
                            r13 = z11;
                            int iZzE = zzigi.zzE(i16, (zzifp) r24.get(r13), zzighVarZzq2);
                            r13++;
                            r12 = (r12 == true ? 1 : 0) + iZzE;
                        }
                        r13 = z11;
                    }
                    i13 += r12;
                    break;
                case 50:
                    zzifj zzifjVar = (zzifj) unsafe.getObject(obj, j10);
                    zzifi zzifiVar = (zzifi) zzr(i12);
                    if (zzifjVar.isEmpty()) {
                        Zzs = z10;
                    } else {
                        Zzs = z10;
                        for (Map.Entry entry2 : zzifjVar.entrySet()) {
                            Zzs += zzifiVar.zzd(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i13 += Zzs;
                    break;
                case 51:
                    if (zzM(obj, i16, i12)) {
                        iZzF = zzidj.zzF(i16 << 3);
                        ZzD = iZzF + 8;
                        i13 += ZzD;
                    }
                    break;
                case 52:
                    if (zzM(obj, i16, i12)) {
                        iZzF2 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF2 + 4;
                        i13 += ZzD;
                    }
                    break;
                case 53:
                    if (zzM(obj, i16, i12)) {
                        long jZzH = zzH(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(jZzH);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 54:
                    if (zzM(obj, i16, i12)) {
                        long jZzH2 = zzH(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(jZzH2);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 55:
                    if (zzM(obj, i16, i12)) {
                        long jZzG = zzG(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(jZzG);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 56:
                    if (zzM(obj, i16, i12)) {
                        iZzF = zzidj.zzF(i16 << 3);
                        ZzD = iZzF + 8;
                        i13 += ZzD;
                    }
                    break;
                case 57:
                    if (zzM(obj, i16, i12)) {
                        iZzF2 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF2 + 4;
                        i13 += ZzD;
                    }
                    break;
                case 58:
                    if (zzM(obj, i16, i12)) {
                        iZzF4 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF4 + 1;
                        i13 += ZzD;
                    }
                    break;
                case 59:
                    if (zzM(obj, i16, i12)) {
                        int i36 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzida) {
                            iZzF5 = zzidj.zzF(i36);
                            iZzc = ((zzida) object2).zzb();
                            iZzF6 = zzidj.zzF(iZzc);
                        } else {
                            iZzF5 = zzidj.zzF(i36);
                            iZzc = zzihf.zzc((String) object2);
                            iZzF6 = zzidj.zzF(iZzc);
                        }
                        ZzD = iZzF5 + iZzF6 + iZzc;
                        i13 += ZzD;
                    }
                    break;
                case 60:
                    if (zzM(obj, i16, i12)) {
                        ZzD = zzigi.zzD(i16, unsafe.getObject(obj, j10), zzq(i12));
                        i13 += ZzD;
                    }
                    break;
                case 61:
                    if (zzM(obj, i16, i12)) {
                        zzida zzidaVar2 = (zzida) unsafe.getObject(obj, j10);
                        iZzF5 = zzidj.zzF(i16 << 3);
                        iZzc = zzidaVar2.zzb();
                        iZzF6 = zzidj.zzF(iZzc);
                        ZzD = iZzF5 + iZzF6 + iZzc;
                        i13 += ZzD;
                    }
                    break;
                case 62:
                    if (zzM(obj, i16, i12)) {
                        int iZzG2 = zzG(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzF(iZzG2);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 63:
                    if (zzM(obj, i16, i12)) {
                        long jZzG2 = zzG(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG(jZzG2);
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 64:
                    if (zzM(obj, i16, i12)) {
                        iZzF2 = zzidj.zzF(i16 << 3);
                        ZzD = iZzF2 + 4;
                        i13 += ZzD;
                    }
                    break;
                case 65:
                    if (zzM(obj, i16, i12)) {
                        iZzF = zzidj.zzF(i16 << 3);
                        ZzD = iZzF + 8;
                        i13 += ZzD;
                    }
                    break;
                case 66:
                    if (zzM(obj, i16, i12)) {
                        int iZzG3 = zzG(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzF((iZzG3 >> 31) ^ (iZzG3 + iZzG3));
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 67:
                    if (zzM(obj, i16, i12)) {
                        long jZzH3 = zzH(obj, j10);
                        iZzF3 = zzidj.zzF(i16 << 3);
                        iZzG = zzidj.zzG((jZzH3 >> 63) ^ (jZzH3 + jZzH3));
                        ZzD = iZzF3 + iZzG;
                        i13 += ZzD;
                    }
                    break;
                case 68:
                    if (zzM(obj, i16, i12)) {
                        ZzD = zzigi.zzE(i16, (zzifp) unsafe.getObject(obj, j10), zzq(i12));
                        i13 += ZzD;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0265  */
    /* JADX WARN: Code duplicated, block: B:101:0x0273  */
    /* JADX WARN: Code duplicated, block: B:102:0x0281  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f  */
    /* JADX WARN: Code duplicated, block: B:104:0x029d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:112:0x030c  */
    /* JADX WARN: Code duplicated, block: B:113:0x031d  */
    /* JADX WARN: Code duplicated, block: B:114:0x032a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0337  */
    /* JADX WARN: Code duplicated, block: B:116:0x0344  */
    /* JADX WARN: Code duplicated, block: B:117:0x0351  */
    /* JADX WARN: Code duplicated, block: B:118:0x035e  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0378  */
    /* JADX WARN: Code duplicated, block: B:121:0x0385  */
    /* JADX WARN: Code duplicated, block: B:123:0x0399  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:132:0x0401  */
    /* JADX WARN: Code duplicated, block: B:134:0x0419  */
    /* JADX WARN: Code duplicated, block: B:135:0x0422  */
    /* JADX WARN: Code duplicated, block: B:137:0x043a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0443  */
    /* JADX WARN: Code duplicated, block: B:140:0x045b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0464  */
    /* JADX WARN: Code duplicated, block: B:143:0x047c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0485  */
    /* JADX WARN: Code duplicated, block: B:146:0x049d  */
    /* JADX WARN: Code duplicated, block: B:147:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:149:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:152:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x0506  */
    /* JADX WARN: Code duplicated, block: B:156:0x050f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0527  */
    /* JADX WARN: Code duplicated, block: B:159:0x0530  */
    /* JADX WARN: Code duplicated, block: B:161:0x0548  */
    /* JADX WARN: Code duplicated, block: B:162:0x0551  */
    /* JADX WARN: Code duplicated, block: B:164:0x0569  */
    /* JADX WARN: Code duplicated, block: B:165:0x0572  */
    /* JADX WARN: Code duplicated, block: B:167:0x058a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0593  */
    /* JADX WARN: Code duplicated, block: B:170:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:171:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:173:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:174:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:176:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:190:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203  */
    /* JADX WARN: Code duplicated, block: B:94:0x0211  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:97:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Code duplicated, block: B:99:0x0257  */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzf(Object obj, zzihi zzihiVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i10;
        Map.Entry entry2;
        int i11;
        long j10;
        int[] iArr;
        Map.Entry entry3;
        boolean z10;
        Object object;
        if (this.zzh) {
            zzidt zzidtVar = ((zziea) obj).zza;
            if (zzidtVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zzidtVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < iArr2.length) {
            int iZzA = zzA(i15);
            int iZzC = zzC(iZzA);
            int i16 = iArr2[i15];
            if (iZzC <= 17) {
                int i17 = iArr2[i15 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                } else {
                    entry = entry;
                }
                int i19 = 1 << (i17 >>> 20);
                i10 = i13;
                i11 = i19;
                entry2 = entry;
            } else {
                i10 = i13;
                entry2 = entry;
                i11 = 0;
            }
            int i20 = i14;
            while (entry2 != null) {
                zzidp zzidpVar = this.zzn;
                if (((zzieb) entry2.getKey()).zza <= i16) {
                    zzidpVar.zzb(zzihiVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    j10 = iZzA & i12;
                    switch (iZzC) {
                        case 0:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzf(i16, zziha.zzk(obj, j10));
                            }
                            break;
                        case 1:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zze(i16, zziha.zzi(obj, j10));
                            }
                            break;
                        case 2:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzc(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 3:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzh(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 4:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzi(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 5:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzj(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 6:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzk(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 7:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzl(i16, zziha.zzg(obj, j10));
                            }
                            break;
                        case 8:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzS(i16, unsafe.getObject(obj, j10), zzihiVar);
                            }
                            break;
                        case 9:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            break;
                        case 10:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzn(i16, (zzida) unsafe.getObject(obj, j10));
                            }
                            break;
                        case 11:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzo(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 12:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzg(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 13:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzb(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 14:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzd(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 15:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzp(i16, unsafe.getInt(obj, j10));
                            }
                            break;
                        case 16:
                            iArr = iArr2;
                            entry3 = entry2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzq(i16, unsafe.getLong(obj, j10));
                            }
                            break;
                        case 17:
                            entry3 = entry2;
                            iArr = iArr2;
                            if (zzJ(obj, i15, i10, i20, i11)) {
                                zzihiVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            break;
                        case 18:
                            z10 = false;
                            zzigi.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 19:
                            z10 = false;
                            zzigi.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 20:
                            z10 = false;
                            zzigi.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 21:
                            z10 = false;
                            zzigi.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 22:
                            z10 = false;
                            zzigi.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 23:
                            z10 = false;
                            zzigi.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 24:
                            z10 = false;
                            zzigi.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 25:
                            z10 = false;
                            zzigi.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 26:
                            zzigi.zzo(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 27:
                            zzigi.zzq(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, zzq(i15));
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 28:
                            zzigi.zzp(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 29:
                            z10 = false;
                            zzigi.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 30:
                            z10 = false;
                            zzigi.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 31:
                            z10 = false;
                            zzigi.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 32:
                            z10 = false;
                            zzigi.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 33:
                            z10 = false;
                            zzigi.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 34:
                            z10 = false;
                            zzigi.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 35:
                            zzigi.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 36:
                            zzigi.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 37:
                            zzigi.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 38:
                            zzigi.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 39:
                            zzigi.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 40:
                            zzigi.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 41:
                            zzigi.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 42:
                            zzigi.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 43:
                            zzigi.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 44:
                            zzigi.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 45:
                            zzigi.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 46:
                            zzigi.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 47:
                            zzigi.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 48:
                            zzigi.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 49:
                            zzigi.zzr(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, zzq(i15));
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 50:
                            object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                zzihiVar.zzM(i16, ((zzifi) zzr(i15)).zze(), (zzifj) object);
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 51:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzf(i16, ((Double) zziha.zzm(obj, j10)).doubleValue());
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 52:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zze(i16, ((Float) zziha.zzm(obj, j10)).floatValue());
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 53:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzc(i16, zzH(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 54:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzh(i16, zzH(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 55:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzi(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 56:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzj(i16, zzH(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 57:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzk(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 58:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzl(i16, ((Boolean) zziha.zzm(obj, j10)).booleanValue());
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 59:
                            if (zzM(obj, i16, i15)) {
                                zzS(i16, unsafe.getObject(obj, j10), zzihiVar);
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 60:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 61:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzn(i16, (zzida) unsafe.getObject(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 62:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzo(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 63:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzg(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 64:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzb(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 65:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzd(i16, zzH(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 66:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzp(i16, zzG(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 67:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzq(i16, zzH(obj, j10));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        case 68:
                            if (zzM(obj, i16, i15)) {
                                zzihiVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                            }
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                        default:
                            iArr = iArr2;
                            entry3 = entry2;
                            break;
                    }
                    i15 += 3;
                    i13 = i10;
                    entry = entry3;
                    i14 = i20;
                    iArr2 = iArr;
                    i12 = 1048575;
                }
            }
            j10 = iZzA & i12;
            switch (iZzC) {
                case 0:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzf(i16, zziha.zzk(obj, j10));
                    }
                    break;
                case 1:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zze(i16, zziha.zzi(obj, j10));
                    }
                    break;
                case 2:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzc(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzh(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzi(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzj(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzk(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzl(i16, zziha.zzg(obj, j10));
                    }
                    break;
                case 8:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzS(i16, unsafe.getObject(obj, j10), zzihiVar);
                    }
                    break;
                case 9:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    break;
                case 10:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzn(i16, (zzida) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzo(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzg(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzb(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzd(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzp(i16, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    iArr = iArr2;
                    entry3 = entry2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzq(i16, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    entry3 = entry2;
                    iArr = iArr2;
                    if (zzJ(obj, i15, i10, i20, i11)) {
                        zzihiVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    break;
                case 18:
                    z10 = false;
                    zzigi.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 19:
                    z10 = false;
                    zzigi.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 20:
                    z10 = false;
                    zzigi.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 21:
                    z10 = false;
                    zzigi.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 22:
                    z10 = false;
                    zzigi.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 23:
                    z10 = false;
                    zzigi.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 24:
                    z10 = false;
                    zzigi.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 25:
                    z10 = false;
                    zzigi.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 26:
                    zzigi.zzo(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 27:
                    zzigi.zzq(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, zzq(i15));
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 28:
                    zzigi.zzp(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 29:
                    z10 = false;
                    zzigi.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 30:
                    z10 = false;
                    zzigi.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 31:
                    z10 = false;
                    zzigi.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 32:
                    z10 = false;
                    zzigi.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 33:
                    z10 = false;
                    zzigi.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 34:
                    z10 = false;
                    zzigi.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 35:
                    zzigi.zza(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 36:
                    zzigi.zzb(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 37:
                    zzigi.zzc(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 38:
                    zzigi.zzd(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 39:
                    zzigi.zzh(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 40:
                    zzigi.zzf(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 41:
                    zzigi.zzk(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 42:
                    zzigi.zzn(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 43:
                    zzigi.zzi(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 44:
                    zzigi.zzm(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 45:
                    zzigi.zzl(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 46:
                    zzigi.zzg(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 47:
                    zzigi.zzj(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 48:
                    zzigi.zze(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, true);
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 49:
                    zzigi.zzr(iArr2[i15], (List) unsafe.getObject(obj, j10), zzihiVar, zzq(i15));
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 50:
                    object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzihiVar.zzM(i16, ((zzifi) zzr(i15)).zze(), (zzifj) object);
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 51:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzf(i16, ((Double) zziha.zzm(obj, j10)).doubleValue());
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 52:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zze(i16, ((Float) zziha.zzm(obj, j10)).floatValue());
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 53:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzc(i16, zzH(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 54:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzh(i16, zzH(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 55:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzi(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 56:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzj(i16, zzH(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 57:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzk(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 58:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzl(i16, ((Boolean) zziha.zzm(obj, j10)).booleanValue());
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 59:
                    if (zzM(obj, i16, i15)) {
                        zzS(i16, unsafe.getObject(obj, j10), zzihiVar);
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 60:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzr(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 61:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzn(i16, (zzida) unsafe.getObject(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 62:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzo(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 63:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzg(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 64:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzb(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 65:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzd(i16, zzH(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 66:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzp(i16, zzG(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 67:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzq(i16, zzH(obj, j10));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                case 68:
                    if (zzM(obj, i16, i15)) {
                        zzihiVar.zzs(i16, unsafe.getObject(obj, j10), zzq(i15));
                    }
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
                default:
                    iArr = iArr2;
                    entry3 = entry2;
                    break;
            }
            i15 += 3;
            i13 = i10;
            entry = entry3;
            i14 = i20;
            iArr2 = iArr;
            i12 = 1048575;
        }
        while (entry != null) {
            this.zzn.zzb(zzihiVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zziee) obj).zzt.zzg(zzihiVar);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x051c  */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzg(Object obj, zzigc zzigcVar, zzido zzidoVar) throws IOException {
        Object objZzx;
        zzidoVar.getClass();
        zzF(obj);
        zzigt zzigtVar = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzigcVar.zzb();
                int iZzP = zzP(iZzb);
                if (iZzP >= 0) {
                    int iZzA = zzA(iZzP);
                    try {
                        switch (zzC(iZzA)) {
                            case 0:
                                zziha.zzl(obj, iZzA & 1048575, zzigcVar.zze());
                                zzL(obj, iZzP);
                                continue;
                            case 1:
                                zziha.zzj(obj, iZzA & 1048575, zzigcVar.zzf());
                                zzL(obj, iZzP);
                                continue;
                            case 2:
                                zziha.zzf(obj, iZzA & 1048575, zzigcVar.zzh());
                                zzL(obj, iZzP);
                                continue;
                            case 3:
                                zziha.zzf(obj, iZzA & 1048575, zzigcVar.zzg());
                                zzL(obj, iZzP);
                                continue;
                            case 4:
                                zziha.zzd(obj, iZzA & 1048575, zzigcVar.zzi());
                                zzL(obj, iZzP);
                                continue;
                            case 5:
                                zziha.zzf(obj, iZzA & 1048575, zzigcVar.zzj());
                                zzL(obj, iZzP);
                                continue;
                            case 6:
                                zziha.zzd(obj, iZzA & 1048575, zzigcVar.zzk());
                                zzL(obj, iZzP);
                                continue;
                            case 7:
                                zziha.zzh(obj, iZzA & 1048575, zzigcVar.zzl());
                                zzL(obj, iZzP);
                                continue;
                            case 8:
                                zzz(obj, iZzA, zzigcVar);
                                zzL(obj, iZzP);
                                continue;
                            case 9:
                                zzifp zzifpVar = (zzifp) zzt(obj, iZzP);
                                zzigcVar.zzo(zzifpVar, zzq(iZzP), zzidoVar);
                                zzu(obj, iZzP, zzifpVar);
                                continue;
                            case 10:
                                zziha.zzn(obj, iZzA & 1048575, zzigcVar.zzq());
                                zzL(obj, iZzP);
                                continue;
                            case 11:
                                zziha.zzd(obj, iZzA & 1048575, zzigcVar.zzr());
                                zzL(obj, iZzP);
                                continue;
                            case 12:
                                int iZzs = zzigcVar.zzs();
                                zziek zziekVarZzs = zzs(iZzP);
                                if (zziekVarZzs == null || zziekVarZzs.zza(iZzs)) {
                                    zziha.zzd(obj, iZzA & 1048575, iZzs);
                                    zzL(obj, iZzP);
                                    continue;
                                } else {
                                    objZzh = zzigi.zzK(obj, iZzb, iZzs, objZzh, zzigtVar);
                                }
                                break;
                            case 13:
                                zziha.zzd(obj, iZzA & 1048575, zzigcVar.zzt());
                                zzL(obj, iZzP);
                                continue;
                            case 14:
                                zziha.zzf(obj, iZzA & 1048575, zzigcVar.zzu());
                                zzL(obj, iZzP);
                                continue;
                            case 15:
                                zziha.zzd(obj, iZzA & 1048575, zzigcVar.zzv());
                                zzL(obj, iZzP);
                                continue;
                            case 16:
                                zziha.zzf(obj, iZzA & 1048575, zzigcVar.zzw());
                                zzL(obj, iZzP);
                                continue;
                            case 17:
                                zzifp zzifpVar2 = (zzifp) zzt(obj, iZzP);
                                zzigcVar.zzp(zzifpVar2, zzq(iZzP), zzidoVar);
                                zzu(obj, iZzP, zzifpVar2);
                                continue;
                            case 18:
                                zzigcVar.zzx(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 19:
                                zzigcVar.zzy(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 20:
                                zzigcVar.zzA(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 21:
                                zzigcVar.zzz(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 22:
                                zzigcVar.zzB(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 23:
                                zzigcVar.zzC(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 24:
                                zzigcVar.zzD(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 25:
                                zzigcVar.zzE(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 26:
                                if (zzD(iZzA)) {
                                    ((zzidf) zzigcVar).zzF(zzifb.zza(obj, iZzA & 1048575), true);
                                } else {
                                    ((zzidf) zzigcVar).zzF(zzifb.zza(obj, iZzA & 1048575), false);
                                    continue;
                                }
                                break;
                            case 27:
                                zzigcVar.zzG(zzifb.zza(obj, iZzA & 1048575), zzq(iZzP), zzidoVar);
                                continue;
                            case 28:
                                zzigcVar.zzI(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 29:
                                zzigcVar.zzJ(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 30:
                                List listZza = zzifb.zza(obj, iZzA & 1048575);
                                zzigcVar.zzK(listZza);
                                objZzh = zzigi.zzJ(obj, iZzb, listZza, zzs(iZzP), objZzh, zzigtVar);
                                continue;
                            case 31:
                                zzigcVar.zzL(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 32:
                                zzigcVar.zzM(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 33:
                                zzigcVar.zzN(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 34:
                                zzigcVar.zzO(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 35:
                                zzigcVar.zzx(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 36:
                                zzigcVar.zzy(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 37:
                                zzigcVar.zzA(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 38:
                                zzigcVar.zzz(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 39:
                                zzigcVar.zzB(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 40:
                                zzigcVar.zzC(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 41:
                                zzigcVar.zzD(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 42:
                                zzigcVar.zzE(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 43:
                                zzigcVar.zzJ(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 44:
                                List listZza2 = zzifb.zza(obj, iZzA & 1048575);
                                zzigcVar.zzK(listZza2);
                                objZzh = zzigi.zzJ(obj, iZzb, listZza2, zzs(iZzP), objZzh, zzigtVar);
                                continue;
                            case 45:
                                zzigcVar.zzL(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 46:
                                zzigcVar.zzM(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 47:
                                zzigcVar.zzN(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 48:
                                zzigcVar.zzO(zzifb.zza(obj, iZzA & 1048575));
                                continue;
                            case 49:
                                zzigcVar.zzH(zzifb.zza(obj, iZzA & 1048575), zzq(iZzP), zzidoVar);
                                continue;
                            case 50:
                                Object objZzr = zzr(iZzP);
                                long jZzA = zzA(iZzP) & 1048575;
                                Object objZzm = zziha.zzm(obj, jZzA);
                                if (objZzm == null) {
                                    objZzm = zzifj.zza().zzc();
                                    zziha.zzn(obj, jZzA, objZzm);
                                } else if (zzifk.zza(objZzm)) {
                                    Object objZzc = zzifj.zza().zzc();
                                    zzifk.zzb(objZzc, objZzm);
                                    zziha.zzn(obj, jZzA, objZzc);
                                    objZzm = objZzc;
                                }
                                zzigcVar.zzP((zzifj) objZzm, ((zzifi) objZzr).zze(), zzidoVar);
                                continue;
                            case 51:
                                zziha.zzn(obj, iZzA & 1048575, Double.valueOf(zzigcVar.zze()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 52:
                                zziha.zzn(obj, iZzA & 1048575, Float.valueOf(zzigcVar.zzf()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 53:
                                zziha.zzn(obj, iZzA & 1048575, Long.valueOf(zzigcVar.zzh()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 54:
                                zziha.zzn(obj, iZzA & 1048575, Long.valueOf(zzigcVar.zzg()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 55:
                                zziha.zzn(obj, iZzA & 1048575, Integer.valueOf(zzigcVar.zzi()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 56:
                                zziha.zzn(obj, iZzA & 1048575, Long.valueOf(zzigcVar.zzj()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 57:
                                zziha.zzn(obj, iZzA & 1048575, Integer.valueOf(zzigcVar.zzk()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 58:
                                zziha.zzn(obj, iZzA & 1048575, Boolean.valueOf(zzigcVar.zzl()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 59:
                                zzz(obj, iZzA, zzigcVar);
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 60:
                                zzifp zzifpVar3 = (zzifp) zzv(obj, iZzb, iZzP);
                                zzigcVar.zzo(zzifpVar3, zzq(iZzP), zzidoVar);
                                zzw(obj, iZzb, iZzP, zzifpVar3);
                                continue;
                            case 61:
                                zziha.zzn(obj, iZzA & 1048575, zzigcVar.zzq());
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 62:
                                zziha.zzn(obj, iZzA & 1048575, Integer.valueOf(zzigcVar.zzr()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 63:
                                int iZzs2 = zzigcVar.zzs();
                                zziek zziekVarZzs2 = zzs(iZzP);
                                if (zziekVarZzs2 == null || zziekVarZzs2.zza(iZzs2)) {
                                    zziha.zzn(obj, iZzA & 1048575, Integer.valueOf(iZzs2));
                                    zzO(obj, iZzb, iZzP);
                                    continue;
                                } else {
                                    objZzh = zzigi.zzK(obj, iZzb, iZzs2, objZzh, zzigtVar);
                                }
                                break;
                            case 64:
                                zziha.zzn(obj, iZzA & 1048575, Integer.valueOf(zzigcVar.zzt()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 65:
                                zziha.zzn(obj, iZzA & 1048575, Long.valueOf(zzigcVar.zzu()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 66:
                                zziha.zzn(obj, iZzA & 1048575, Integer.valueOf(zzigcVar.zzv()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 67:
                                zziha.zzn(obj, iZzA & 1048575, Long.valueOf(zzigcVar.zzw()));
                                zzO(obj, iZzb, iZzP);
                                continue;
                            case 68:
                                zzifp zzifpVar4 = (zzifp) zzv(obj, iZzb, iZzP);
                                zzigcVar.zzp(zzifpVar4, zzq(iZzP), zzidoVar);
                                zzw(obj, iZzb, iZzP, zzifpVar4);
                                continue;
                            default:
                                if (objZzh == null) {
                                    objZzh = zzigtVar.zzh(obj);
                                }
                                if (!zzigtVar.zzk(objZzh, zzigcVar, 0)) {
                                    objZzx = objZzh;
                                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                        objZzx = zzx(obj, this.zzj[i10], objZzx, zzigtVar, obj);
                                    }
                                }
                                break;
                        }
                    } catch (zzies unused) {
                        if (objZzh == null) {
                            objZzh = zzigtVar.zzh(obj);
                        }
                        if (!zzigtVar.zzk(objZzh, zzigcVar, 0)) {
                            objZzx = objZzh;
                            for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                                objZzx = zzx(obj, this.zzj[i11], objZzx, zzigtVar, obj);
                            }
                            if (objZzx != null) {
                                zzigtVar.zzi(obj, objZzx);
                            }
                        }
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx = objZzh;
                    for (int i12 = this.zzk; i12 < this.zzl; i12++) {
                        objZzx = zzx(obj, this.zzj[i12], objZzx, zzigtVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzidoVar.zzc(this.zzg, iZzb)) != null) {
                        throw null;
                    }
                    if (objZzh == null) {
                        objZzh = zzigtVar.zzh(obj);
                    }
                    if (!zzigtVar.zzk(objZzh, zzigcVar, 0)) {
                        objZzx = objZzh;
                        for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                            objZzx = zzx(obj, this.zzj[i13], objZzx, zzigtVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Object objZzx2 = objZzh;
                for (int i14 = this.zzk; i14 < this.zzl; i14++) {
                    objZzx2 = zzx(obj, this.zzj[i14], objZzx2, zzigtVar, obj);
                }
                if (objZzx2 != null) {
                    zzigtVar.zzi(obj, objZzx2);
                }
                throw th;
            }
        }
        if (objZzx != null) {
            zzigtVar.zzi(obj, objZzx);
        }
    }

    /* JADX WARN: Code duplicated, block: B:526:0x0db3 A[PHI: r0 r8 r10 r11 r14 r20 r21 r31
      0x0db3: PHI (r0v211 int) = 
      (r0v178 int)
      (r0v179 int)
      (r0v180 int)
      (r0v181 int)
      (r0v182 int)
      (r0v183 int)
      (r0v184 int)
      (r0v185 int)
      (r0v188 int)
      (r0v198 int)
      (r0v212 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r8v112 int) = 
      (r8v90 int)
      (r8v91 int)
      (r8v92 int)
      (r8v93 int)
      (r8v94 int)
      (r8v95 int)
      (r8v96 int)
      (r8v97 int)
      (r8v98 int)
      (r8v103 int)
      (r8v113 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r10v60 sun.misc.Unsafe) = 
      (r10v37 sun.misc.Unsafe)
      (r10v38 sun.misc.Unsafe)
      (r10v39 sun.misc.Unsafe)
      (r10v40 sun.misc.Unsafe)
      (r10v41 sun.misc.Unsafe)
      (r10v42 sun.misc.Unsafe)
      (r10v43 sun.misc.Unsafe)
      (r10v44 sun.misc.Unsafe)
      (r10v45 sun.misc.Unsafe)
      (r10v50 sun.misc.Unsafe)
      (r10v61 sun.misc.Unsafe)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r11v84 java.lang.Object) = 
      (r11v61 java.lang.Object)
      (r11v62 java.lang.Object)
      (r11v63 java.lang.Object)
      (r11v64 java.lang.Object)
      (r11v65 java.lang.Object)
      (r11v66 java.lang.Object)
      (r11v67 java.lang.Object)
      (r11v68 java.lang.Object)
      (r11v70 java.lang.Object)
      (r11v79 java.lang.Object)
      (r11v85 java.lang.Object)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r14v90 'this' com.google.android.gms.internal.ads.zzifs<T>) = 
      (r14v70 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v71 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v72 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v73 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v74 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v75 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v76 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v77 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v78 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v82 'this' com.google.android.gms.internal.ads.zzifs<T>)
      (r14v91 'this' com.google.android.gms.internal.ads.zzifs<T>)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r20v38 java.lang.String) = 
      (r20v16 java.lang.String)
      (r20v17 java.lang.String)
      (r20v18 java.lang.String)
      (r20v19 java.lang.String)
      (r20v20 java.lang.String)
      (r20v21 java.lang.String)
      (r20v22 java.lang.String)
      (r20v23 java.lang.String)
      (r20v24 java.lang.String)
      (r20v29 java.lang.String)
      (r20v39 java.lang.String)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r21v38 int) = 
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v30 int)
      (r21v31 int)
      (r21v35 int)
      (r21v30 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]
      0x0db3: PHI (r31v44 int) = 
      (r31v26 int)
      (r31v27 int)
      (r31v28 int)
      (r31v29 int)
      (r31v30 int)
      (r31v31 int)
      (r31v32 int)
      (r31v33 int)
      (r31v34 int)
      (r31v38 int)
      (r31v45 int)
     binds: [B:524:0x0d9c, B:521:0x0d77, B:518:0x0d56, B:515:0x0d35, B:512:0x0d14, B:509:0x0cf2, B:502:0x0cc8, B:488:0x0c88, B:486:0x0c6f, B:482:0x0c35, B:453:0x0b2b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:528:0x0db6  */
    /* JADX WARN: Code duplicated, block: B:529:0x0dc9  */
    /* JADX WARN: Code duplicated, block: B:542:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:606:0x09a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    final int zzi(Object obj, byte[] bArr, int i10, int i11, int i12, zzico zzicoVar) throws IOException {
        String str;
        Unsafe unsafe;
        int i13;
        Object obj2;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzb;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzico zzicoVar2;
        byte b10;
        zzifs<T> zzifsVar;
        int i23;
        int i24;
        int i25;
        int iZzc;
        int i26;
        byte b11;
        zzico zzicoVar3;
        int i27;
        int i28;
        Unsafe unsafe2;
        String str2;
        int i29;
        zzifs<T> zzifsVar2;
        int i30;
        int i31;
        String str3;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int iZzl;
        int iZza;
        int i40;
        int iZzc2;
        zzifs<T> zzifsVar3;
        Object obj3;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        Unsafe unsafe3;
        Object obj4;
        int i46;
        int i47;
        zzifs<T> zzifsVar4 = this;
        Object obj5 = obj;
        i11 = i11;
        i12 = i12;
        zzico zzicoVar4 = zzicoVar;
        zzF(obj);
        Unsafe unsafe4 = zzb;
        int iZzo = i10;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = -1;
        int i52 = 1048575;
        while (true) {
            if (iZzo < i11) {
                int i53 = iZzo + 1;
                int i54 = bArr[iZzo];
                if (i54 < 0) {
                    iZzb = zzicp.zzb(i54, bArr, i53, zzicoVar4);
                    i17 = zzicoVar4.zza;
                } else {
                    i17 = i54;
                    iZzb = i53;
                }
                int i55 = i17 >>> 3;
                int iZzQ = i55 > i51 ? (i55 < zzifsVar4.zze || i55 > zzifsVar4.zzf) ? -1 : zzifsVar4.zzQ(i55, i48 / 3) : zzifsVar4.zzP(i55);
                if (iZzQ != -1) {
                    int i56 = i17 & 7;
                    int[] iArr = zzifsVar4.zzc;
                    int i57 = i17;
                    int i58 = iArr[iZzQ + 1];
                    str = "Failed to parse the message.";
                    int iZzC = zzC(i58);
                    long j10 = i58 & 1048575;
                    if (iZzC <= 17) {
                        int i59 = iArr[iZzQ + 2];
                        int i60 = 1 << (i59 >>> 20);
                        char c10 = 65535;
                        int i61 = i59 & 1048575;
                        if (i61 != i52) {
                            if (i52 != 1048575) {
                                unsafe4.putInt(obj5, i52, i50);
                            }
                            i50 = i61 == 1048575 ? 0 : unsafe4.getInt(obj5, i61);
                            i20 = i61;
                        } else {
                            i20 = i52;
                        }
                        switch (iZzC) {
                            case 0:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 1) {
                                    iZzo = iZzb + 8;
                                    i50 |= i60;
                                    zziha.zzl(obj5, j10, Double.longBitsToDouble(zzicp.zze(bArr, iZzb)));
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 1:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 5) {
                                    iZzo = iZzb + 4;
                                    i50 |= i60;
                                    zziha.zzj(obj5, j10, Float.intBitsToFloat(zzicp.zzd(bArr, iZzb)));
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 2:
                            case 3:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 0) {
                                    i25 = i60 | i50;
                                    iZzc = zzicp.zzc(bArr, iZzb, zzicoVar4);
                                    unsafe4.putLong(obj, j10, zzicoVar4.zzb);
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i50 = i25;
                                    iZzo = iZzc;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 4:
                            case 11:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 0) {
                                    i50 |= i60;
                                    iZzo = zzicp.zza(bArr, iZzb, zzicoVar4);
                                    unsafe4.putInt(obj5, j10, zzicoVar4.zza);
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 5:
                            case 14:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 1) {
                                    iZzc = iZzb + 8;
                                    i25 = i60 | i50;
                                    unsafe4.putLong(obj, j10, zzicp.zze(bArr, iZzb));
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i50 = i25;
                                    iZzo = iZzc;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 6:
                            case 13:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 5) {
                                    iZzo = iZzb + 4;
                                    i50 |= i60;
                                    unsafe4.putInt(obj5, j10, zzicp.zzd(bArr, iZzb));
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 7:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 0) {
                                    i50 |= i60;
                                    iZzo = zzicp.zzc(bArr, iZzb, zzicoVar4);
                                    zziha.zzh(obj5, j10, zzicoVar4.zzb != 0);
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 8:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 2) {
                                    i50 |= i60;
                                    if (zzD(i58)) {
                                        iZzo = zzicp.zzf(bArr, iZzb, zzicoVar4);
                                    } else {
                                        iZzo = zzicp.zza(bArr, iZzb, zzicoVar4);
                                        int i62 = zzicoVar4.zza;
                                        if (i62 < 0) {
                                            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i62 == 0) {
                                            zzicoVar4.zzc = "";
                                        } else {
                                            zzicoVar4.zzc = new String(bArr, iZzo, i62, StandardCharsets.UTF_8);
                                            iZzo += i62;
                                        }
                                    }
                                    unsafe4.putObject(obj5, j10, zzicoVar4.zzc);
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 9:
                                b10 = -1;
                                zzifsVar = this;
                                i23 = iZzQ;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 2) {
                                    Object objZzt = zzifsVar.zzt(obj5, i23);
                                    iZzo = zzicp.zzj(objZzt, zzifsVar.zzq(i23), bArr, iZzb, i11, zzicoVar);
                                    zzifsVar.zzu(obj5, i23, objZzt);
                                    i49 = i24 == true ? 1 : 0;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i50 = i60 | i50;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    iZzb = iZzb;
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 10:
                                b10 = -1;
                                zzifsVar = this;
                                i23 = iZzQ;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 2) {
                                    i50 |= i60;
                                    iZzo = zzicp.zzg(bArr, iZzb, zzicoVar4);
                                    unsafe4.putObject(obj5, j10, zzicoVar4.zzc);
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    iZzb = iZzb;
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 12:
                                i23 = iZzQ;
                                i24 = i57 == true ? 1 : 0;
                                b11 = -1;
                                if (i56 == 0) {
                                    iZzo = zzicp.zza(bArr, iZzb, zzicoVar4);
                                    int i63 = zzicoVar4.zza;
                                    zzifsVar = this;
                                    zziek zziekVarZzs = zzifsVar.zzs(i23);
                                    if ((i58 & Integer.MIN_VALUE) == 0 || zziekVarZzs == null || zziekVarZzs.zza(i63)) {
                                        i50 |= i60;
                                        unsafe4.putInt(obj5, j10, i63);
                                    } else {
                                        zzh(obj).zzk(i24 == true ? 1 : 0, Long.valueOf(i63));
                                    }
                                    i49 = i24;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i51 = i55;
                                    i52 = i20;
                                } else {
                                    this = this;
                                    iZzb = iZzb;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 15:
                                i24 = i57 == true ? 1 : 0;
                                b11 = -1;
                                if (i56 == 0) {
                                    i50 |= i60;
                                    iZzo = zzicp.zza(bArr, iZzb, zzicoVar4);
                                    unsafe4.putInt(obj5, j10, zzide.zzM(zzicoVar4.zza));
                                    i49 = i24 == true ? 1 : 0;
                                    i48 = iZzQ;
                                    i51 = i55;
                                    i52 = i20;
                                    zzifsVar4 = this;
                                } else {
                                    i26 = iZzQ;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            case 16:
                                if (i56 == 0) {
                                    int iZzc3 = zzicp.zzc(bArr, iZzb, zzicoVar4);
                                    unsafe4.putLong(obj, j10, zzide.zzN(zzicoVar4.zzb));
                                    i49 = i57 == true ? 1 : 0;
                                    i50 |= i60;
                                    iZzo = iZzc3;
                                    i48 = iZzQ;
                                    i51 = i55;
                                    i52 = i20;
                                    zzifsVar4 = this;
                                } else {
                                    i24 = i57 == true ? 1 : 0;
                                    b11 = -1;
                                    i26 = iZzQ;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                            default:
                                b10 = -1;
                                zzifsVar = this;
                                iZzb = iZzb;
                                i23 = iZzQ;
                                c10 = 65535;
                                i24 = i57 == true ? 1 : 0;
                                if (i56 == 3) {
                                    Object objZzt2 = zzifsVar.zzt(obj5, i23);
                                    int iZzk = zzicp.zzk(objZzt2, zzifsVar.zzq(i23), bArr, iZzb, i11, (i55 << 3) | 4, zzicoVar);
                                    zzifsVar.zzu(obj5, i23, objZzt2);
                                    i11 = i11;
                                    i12 = i12;
                                    zzicoVar4 = zzicoVar4;
                                    unsafe4 = unsafe4;
                                    i49 = i24 == true ? 1 : 0;
                                    iZzo = iZzk;
                                    i51 = i55;
                                    i52 = i20;
                                    zzifsVar4 = zzifsVar;
                                    i48 = i23;
                                    i50 |= i60;
                                } else {
                                    this = zzifsVar;
                                    unsafe4 = unsafe4;
                                    zzicoVar4 = zzicoVar4;
                                    i50 = i50;
                                    i26 = i23;
                                    this = this;
                                    i18 = iZzb;
                                    i22 = i26;
                                    unsafe = unsafe4;
                                    i16 = i24;
                                    obj2 = obj5;
                                    i19 = i50;
                                    i21 = i55;
                                    i14 = i12;
                                    zzicoVar2 = zzicoVar4;
                                }
                                break;
                        }
                    } else {
                        i19 = i50;
                        i20 = i52;
                        Unsafe unsafe5 = unsafe4;
                        int i64 = iZzb;
                        zzico zzicoVar5 = zzicoVar4;
                        zzifs<T> zzifsVar5 = zzifsVar4;
                        i16 = i57 == true ? 1 : 0;
                        if (iZzC != 27) {
                            if (iZzC <= 49) {
                                int i65 = i55;
                                long j11 = i58;
                                zzieq zzieqVarZzh = (zzieq) unsafe5.getObject(obj5, j10);
                                if (!zzieqVarZzh.zza()) {
                                    int size = zzieqVarZzh.size();
                                    zzieqVarZzh = zzieqVarZzh.zzh(size + size);
                                    unsafe5.putObject(obj5, j10, zzieqVarZzh);
                                }
                                zzieq zzieqVar = zzieqVarZzh;
                                switch (iZzC) {
                                    case 18:
                                    case 35:
                                        zzifsVar2 = this;
                                        i30 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzQ;
                                        if (i56 != 2) {
                                            if (i56 == 1) {
                                                iZzo = i31 + 8;
                                                int i66 = zzicp.zza;
                                                zzidl zzidlVar = (zzidl) zzieqVar;
                                                zzidlVar.zzg(Double.longBitsToDouble(zzicp.zze(bArr, i31)));
                                                while (iZzo < i30) {
                                                    int iZza2 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                    if (i16 == zzicoVar2.zza) {
                                                        zzidlVar.zzg(Double.longBitsToDouble(zzicp.zze(bArr, iZza2)));
                                                        iZzo = iZza2 + 8;
                                                    }
                                                }
                                            }
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i67 = zzicp.zza;
                                            zzidl zzidlVar2 = (zzidl) zzieqVar;
                                            iZzo = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i68 = zzicoVar2.zza;
                                            int i69 = iZzo + i68;
                                            if (i69 > bArr.length) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzidlVar2.zzi(zzidlVar2.size() + (i68 / 8));
                                            while (iZzo < i69) {
                                                zzidlVar2.zzg(Double.longBitsToDouble(zzicp.zze(bArr, iZzo)));
                                                iZzo += 8;
                                            }
                                            if (iZzo != i69) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        zzifsVar2 = this;
                                        i30 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzQ;
                                        if (i56 != 2) {
                                            if (i56 == 5) {
                                                iZzo = i31 + 4;
                                                int i70 = zzicp.zza;
                                                zzidv zzidvVar = (zzidv) zzieqVar;
                                                zzidvVar.zzg(Float.intBitsToFloat(zzicp.zzd(bArr, i31)));
                                                while (iZzo < i30) {
                                                    int iZza3 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                    if (i16 == zzicoVar2.zza) {
                                                        zzidvVar.zzg(Float.intBitsToFloat(zzicp.zzd(bArr, iZza3)));
                                                        iZzo = iZza3 + 4;
                                                    }
                                                }
                                            }
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i71 = zzicp.zza;
                                            zzidv zzidvVar2 = (zzidv) zzieqVar;
                                            iZzo = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i72 = zzicoVar2.zza;
                                            int i73 = iZzo + i72;
                                            if (i73 > bArr.length) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzidvVar2.zzi(zzidvVar2.size() + (i72 / 4));
                                            while (iZzo < i73) {
                                                zzidvVar2.zzg(Float.intBitsToFloat(zzicp.zzd(bArr, iZzo)));
                                                iZzo += 4;
                                            }
                                            if (iZzo != i73) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzifsVar2 = this;
                                        i30 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzQ;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                int i74 = zzicp.zza;
                                                zzifd zzifdVar = (zzifd) zzieqVar;
                                                iZzo = zzicp.zzc(bArr, i31, zzicoVar2);
                                                zzifdVar.zzd(zzicoVar2.zzb);
                                                while (iZzo < i30) {
                                                    int iZza4 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                    if (i16 == zzicoVar2.zza) {
                                                        iZzo = zzicp.zzc(bArr, iZza4, zzicoVar2);
                                                        zzifdVar.zzd(zzicoVar2.zzb);
                                                    }
                                                }
                                            }
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i75 = zzicp.zza;
                                            zzifd zzifdVar2 = (zzifd) zzieqVar;
                                            iZzo = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i76 = zzicoVar2.zza + iZzo;
                                            while (iZzo < i76) {
                                                iZzo = zzicp.zzc(bArr, iZzo, zzicoVar2);
                                                zzifdVar2.zzd(zzicoVar2.zzb);
                                            }
                                            if (iZzo != i76) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i33 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        i32 = iZzQ;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                zzifsVar2 = this;
                                                str3 = str;
                                                i30 = i33;
                                                unsafe5 = unsafe5;
                                                iZzo = zzicp.zzl(i16 == true ? 1 : 0, bArr, i31, i11, zzieqVar, zzicoVar);
                                                str = str3;
                                                i34 = i32;
                                                if (iZzo != i31) {
                                                    i12 = i12;
                                                    i49 = i16 == true ? 1 : 0;
                                                    i48 = i34;
                                                    zzifsVar4 = zzifsVar2;
                                                    unsafe4 = unsafe5;
                                                    i50 = i19;
                                                    i51 = i65;
                                                    i52 = i20;
                                                    zzicoVar4 = zzicoVar2;
                                                    i11 = i30;
                                                    obj5 = obj;
                                                } else {
                                                    i18 = iZzo;
                                                    i16 = i16 == true ? 1 : 0;
                                                    i22 = i34;
                                                    unsafe = unsafe5;
                                                    str = str;
                                                    i21 = i65;
                                                    obj2 = obj;
                                                    i14 = i12;
                                                    this = zzifsVar2;
                                                }
                                            }
                                            zzifsVar2 = this;
                                            i30 = i33;
                                            unsafe5 = unsafe5;
                                            str = str;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                            break;
                                        } else {
                                            iZzo = zzicp.zzm(bArr, i31, zzieqVar, zzicoVar2);
                                            zzifsVar2 = this;
                                            i30 = i33;
                                            unsafe5 = unsafe5;
                                            str = str;
                                            i34 = i32;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i33 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        i32 = iZzQ;
                                        int i77 = i65;
                                        if (i56 != 2) {
                                            i65 = i77;
                                            if (i56 == 1) {
                                                iZzo = i31 + 8;
                                                int i78 = zzicp.zza;
                                                zzifd zzifdVar3 = (zzifd) zzieqVar;
                                                zzifdVar3.zzd(zzicp.zze(bArr, i31));
                                                while (iZzo < i33) {
                                                    int iZza5 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                    if (i16 == zzicoVar2.zza) {
                                                        zzifdVar3.zzd(zzicp.zze(bArr, iZza5));
                                                        iZzo = iZza5 + 8;
                                                    }
                                                }
                                            }
                                            zzifsVar2 = this;
                                            i30 = i33;
                                            unsafe5 = unsafe5;
                                            str = str;
                                            i34 = i32;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i79 = zzicp.zza;
                                            zzifd zzifdVar4 = (zzifd) zzieqVar;
                                            iZzo = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i80 = zzicoVar2.zza;
                                            int i81 = iZzo + i80;
                                            if (i81 > bArr.length) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzifdVar4.zzi(zzifdVar4.size() + (i80 / 8));
                                            while (iZzo < i81) {
                                                zzifdVar4.zzd(zzicp.zze(bArr, iZzo));
                                                iZzo += 8;
                                                i77 = i77;
                                            }
                                            i65 = i77;
                                            if (iZzo != i81) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzifsVar2 = this;
                                        i30 = i33;
                                        unsafe5 = unsafe5;
                                        str = str;
                                        i34 = i32;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i35 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        i36 = iZzQ;
                                        i37 = i65;
                                        if (i56 != 2) {
                                            if (i56 == 5) {
                                                iZzo = i31 + 4;
                                                int i82 = zzicp.zza;
                                                zzief zziefVar = (zzief) zzieqVar;
                                                zziefVar.zzi(zzicp.zzd(bArr, i31));
                                                while (iZzo < i35) {
                                                    int iZza6 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                    if (i16 == zzicoVar2.zza) {
                                                        zziefVar.zzi(zzicp.zzd(bArr, iZza6));
                                                        iZzo = iZza6 + 4;
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i65 = i37;
                                            str = str;
                                            i34 = i36;
                                            zzifsVar2 = this;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i83 = zzicp.zza;
                                            zzief zziefVar2 = (zzief) zzieqVar;
                                            iZzo = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i84 = zzicoVar2.zza;
                                            int i85 = iZzo + i84;
                                            if (i85 > bArr.length) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zziefVar2.zzj(zziefVar2.size() + (i84 / 4));
                                            while (iZzo < i85) {
                                                zziefVar2.zzi(zzicp.zzd(bArr, iZzo));
                                                iZzo += 4;
                                            }
                                            if (iZzo != i85) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i30 = i35;
                                        i65 = i37;
                                        str = str;
                                        i34 = i36;
                                        zzifsVar2 = this;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i35 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        String str4 = str;
                                        i36 = iZzQ;
                                        i37 = i65;
                                        if (i56 != 2) {
                                            str = str4;
                                            if (i56 == 0) {
                                                int i86 = zzicp.zza;
                                                zzicq zzicqVar = (zzicq) zzieqVar;
                                                iZzo = zzicp.zzc(bArr, i31, zzicoVar2);
                                                zzicqVar.zzg(zzicoVar2.zzb != 0);
                                                while (iZzo < i35) {
                                                    int iZza7 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                    if (i16 == zzicoVar2.zza) {
                                                        iZzo = zzicp.zzc(bArr, iZza7, zzicoVar2);
                                                        zzicqVar.zzg(zzicoVar2.zzb != 0);
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i65 = i37;
                                            str = str;
                                            i34 = i36;
                                            zzifsVar2 = this;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i87 = zzicp.zza;
                                            zzicq zzicqVar2 = (zzicq) zzieqVar;
                                            iZzo = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i88 = zzicoVar2.zza + iZzo;
                                            while (iZzo < i88) {
                                                iZzo = zzicp.zzc(bArr, iZzo, zzicoVar2);
                                                String str5 = str4;
                                                zzicqVar2.zzg(zzicoVar2.zzb != 0);
                                                str4 = str5;
                                            }
                                            str = str4;
                                            if (iZzo != i88) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i30 = i35;
                                        i65 = i37;
                                        str = str;
                                        i34 = i36;
                                        zzifsVar2 = this;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 26:
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        i36 = iZzQ;
                                        if (i56 != 2) {
                                            str = str;
                                            i30 = i11;
                                            i65 = i65;
                                            i34 = i36;
                                            zzifsVar2 = this;
                                            iZzo = i31;
                                        } else if ((j11 & 536870912) == 0) {
                                            int iZza8 = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i89 = zzicoVar2.zza;
                                            if (i89 < 0) {
                                                throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i89 == 0) {
                                                zzieqVar.add("");
                                            } else {
                                                zzieqVar.add(new String(bArr, iZza8, i89, StandardCharsets.UTF_8));
                                                iZza8 += i89;
                                            }
                                            while (iZza8 < i11) {
                                                int iZza9 = zzicp.zza(bArr, iZza8, zzicoVar2);
                                                if (i16 == zzicoVar2.zza) {
                                                    iZza8 = zzicp.zza(bArr, iZza9, zzicoVar2);
                                                    int i90 = zzicoVar2.zza;
                                                    if (i90 < 0) {
                                                        throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i90 == 0) {
                                                        zzieqVar.add("");
                                                    } else {
                                                        zzieqVar.add(new String(bArr, iZza8, i90, StandardCharsets.UTF_8));
                                                        iZza8 += i90;
                                                    }
                                                } else {
                                                    str = str;
                                                    i30 = i11;
                                                    unsafe5 = unsafe5;
                                                    i65 = i65;
                                                    i34 = i36;
                                                    zzifsVar2 = this;
                                                    iZzo = iZza8;
                                                }
                                            }
                                            str = str;
                                            i30 = i11;
                                            unsafe5 = unsafe5;
                                            i65 = i65;
                                            i34 = i36;
                                            zzifsVar2 = this;
                                            iZzo = iZza8;
                                        } else {
                                            int iZza10 = zzicp.zza(bArr, i31, zzicoVar2);
                                            int i91 = zzicoVar2.zza;
                                            if (i91 < 0) {
                                                throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i91 == 0) {
                                                zzieqVar.add("");
                                            } else {
                                                int i92 = iZza10 + i91;
                                                if (!zzihf.zzb(bArr, iZza10, i92)) {
                                                    throw new zziet("Protocol message had invalid UTF-8.");
                                                }
                                                zzieqVar.add(new String(bArr, iZza10, i91, StandardCharsets.UTF_8));
                                                iZza10 = i92;
                                            }
                                            while (iZza10 < i11) {
                                                int iZza11 = zzicp.zza(bArr, iZza10, zzicoVar2);
                                                if (i16 == zzicoVar2.zza) {
                                                    iZza10 = zzicp.zza(bArr, iZza11, zzicoVar2);
                                                    int i93 = zzicoVar2.zza;
                                                    if (i93 < 0) {
                                                        throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i93 == 0) {
                                                        zzieqVar.add("");
                                                    } else {
                                                        int i94 = iZza10 + i93;
                                                        if (!zzihf.zzb(bArr, iZza10, i94)) {
                                                            throw new zziet("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzieqVar.add(new String(bArr, iZza10, i93, StandardCharsets.UTF_8));
                                                        iZza10 = i94;
                                                    }
                                                } else {
                                                    iZzo = iZza10;
                                                    str = str;
                                                    i30 = i11;
                                                    i65 = i65;
                                                    i34 = i36;
                                                    zzifsVar2 = this;
                                                }
                                            }
                                            iZzo = iZza10;
                                            str = str;
                                            i30 = i11;
                                            i65 = i65;
                                            i34 = i36;
                                            zzifsVar2 = this;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 27:
                                        i38 = iZzQ;
                                        if (i56 == 2) {
                                            zzicoVar2 = zzicoVar5;
                                            int iZzn = zzicp.zzn(zzq(i38), i16 == true ? 1 : 0, bArr, i64, i11, zzieqVar, zzicoVar);
                                            zzifsVar2 = this;
                                            str = str;
                                            i30 = i11;
                                            unsafe5 = unsafe5;
                                            iZzo = iZzn;
                                            i34 = i38;
                                            i31 = i64;
                                        } else {
                                            zzicoVar2 = zzicoVar5;
                                            zzifsVar2 = this;
                                            i30 = i11;
                                            i31 = i64;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 28:
                                        if (i56 == 2) {
                                            int iZza12 = zzicp.zza(bArr, i64, zzicoVar5);
                                            int i95 = zzicoVar5.zza;
                                            if (i95 < 0) {
                                                throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i95 > bArr.length - iZza12) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i95 == 0) {
                                                zzieqVar.add(zzida.zza);
                                            } else {
                                                zzieqVar.add(zzida.zzt(bArr, iZza12, i95));
                                                iZza12 += i95;
                                            }
                                            while (iZza12 < i11) {
                                                int iZza13 = zzicp.zza(bArr, iZza12, zzicoVar5);
                                                if (i16 != zzicoVar5.zza) {
                                                    i30 = i11;
                                                    i31 = i64;
                                                    zzicoVar2 = zzicoVar5;
                                                    i34 = iZzQ;
                                                    zzifsVar2 = this;
                                                    iZzo = iZza12;
                                                    unsafe5 = unsafe5;
                                                    if (iZzo != i31) {
                                                        i12 = i12;
                                                        i49 = i16 == true ? 1 : 0;
                                                        i48 = i34;
                                                        zzifsVar4 = zzifsVar2;
                                                        unsafe4 = unsafe5;
                                                        i50 = i19;
                                                        i51 = i65;
                                                        i52 = i20;
                                                        zzicoVar4 = zzicoVar2;
                                                        i11 = i30;
                                                        obj5 = obj;
                                                    } else {
                                                        i18 = iZzo;
                                                        i16 = i16 == true ? 1 : 0;
                                                        i22 = i34;
                                                        unsafe = unsafe5;
                                                        str = str;
                                                        i21 = i65;
                                                        obj2 = obj;
                                                        i14 = i12;
                                                        this = zzifsVar2;
                                                    }
                                                    break;
                                                } else {
                                                    iZza12 = zzicp.zza(bArr, iZza13, zzicoVar5);
                                                    int i96 = zzicoVar5.zza;
                                                    if (i96 < 0) {
                                                        throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i96 > bArr.length - iZza12) {
                                                        throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i96 == 0) {
                                                        zzieqVar.add(zzida.zza);
                                                    } else {
                                                        zzieqVar.add(zzida.zzt(bArr, iZza12, i96));
                                                        iZza12 += i96;
                                                    }
                                                }
                                            }
                                            i30 = i11;
                                            i31 = i64;
                                            zzicoVar2 = zzicoVar5;
                                            i34 = iZzQ;
                                            zzifsVar2 = this;
                                            iZzo = iZza12;
                                            unsafe5 = unsafe5;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            i30 = i11;
                                            i31 = i64;
                                            zzicoVar2 = zzicoVar5;
                                            i34 = iZzQ;
                                            zzifsVar2 = this;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i39 = i11;
                                        i38 = iZzQ;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                iZzl = zzicp.zzl(i16 == true ? 1 : 0, bArr, i64, i11, zzieqVar, zzicoVar);
                                            }
                                            zzifsVar2 = this;
                                            zzicoVar2 = zzicoVar5;
                                            i31 = i64;
                                            i30 = i39;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            iZzl = zzicp.zzm(bArr, i64, zzieqVar, zzicoVar5);
                                        }
                                        zzigi.zzJ(obj, i65, zzieqVar, zzs(i38), null, this.zzm);
                                        iZzo = iZzl;
                                        zzicoVar2 = zzicoVar5;
                                        zzifsVar2 = this;
                                        str = str;
                                        i30 = i39;
                                        i31 = i64;
                                        i34 = i38;
                                        unsafe5 = unsafe5;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i39 = i11;
                                        i38 = iZzQ;
                                        if (i56 != 2) {
                                            if (i56 == 0) {
                                                int i97 = zzicp.zza;
                                                zzief zziefVar3 = (zzief) zzieqVar;
                                                iZza = zzicp.zza(bArr, i64, zzicoVar5);
                                                zziefVar3.zzi(zzide.zzM(zzicoVar5.zza));
                                                while (iZza < i39) {
                                                    int iZza14 = zzicp.zza(bArr, iZza, zzicoVar5);
                                                    if (i16 == zzicoVar5.zza) {
                                                        iZza = zzicp.zza(bArr, iZza14, zzicoVar5);
                                                        zziefVar3.zzi(zzide.zzM(zzicoVar5.zza));
                                                    }
                                                }
                                            }
                                            zzifsVar2 = this;
                                            zzicoVar2 = zzicoVar5;
                                            i31 = i64;
                                            i30 = i39;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                            iZzo = i31;
                                            if (iZzo != i31) {
                                                i12 = i12;
                                                i49 = i16 == true ? 1 : 0;
                                                i48 = i34;
                                                zzifsVar4 = zzifsVar2;
                                                unsafe4 = unsafe5;
                                                i50 = i19;
                                                i51 = i65;
                                                i52 = i20;
                                                zzicoVar4 = zzicoVar2;
                                                i11 = i30;
                                                obj5 = obj;
                                            } else {
                                                i18 = iZzo;
                                                i16 = i16 == true ? 1 : 0;
                                                i22 = i34;
                                                unsafe = unsafe5;
                                                str = str;
                                                i21 = i65;
                                                obj2 = obj;
                                                i14 = i12;
                                                this = zzifsVar2;
                                            }
                                        } else {
                                            int i98 = zzicp.zza;
                                            zzief zziefVar4 = (zzief) zzieqVar;
                                            iZza = zzicp.zza(bArr, i64, zzicoVar5);
                                            int i99 = zzicoVar5.zza + iZza;
                                            while (iZza < i99) {
                                                iZza = zzicp.zza(bArr, iZza, zzicoVar5);
                                                zziefVar4.zzi(zzide.zzM(zzicoVar5.zza));
                                            }
                                            if (iZza != i99) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzifsVar2 = this;
                                        zzicoVar2 = zzicoVar5;
                                        iZzo = iZza;
                                        i31 = i64;
                                        i30 = i39;
                                        i34 = i38;
                                        unsafe5 = unsafe5;
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i56 == 2) {
                                            int i100 = zzicp.zza;
                                            zzifd zzifdVar5 = (zzifd) zzieqVar;
                                            int iZza15 = zzicp.zza(bArr, i64, zzicoVar5);
                                            int i101 = zzicoVar5.zza + iZza15;
                                            while (iZza15 < i101) {
                                                iZza15 = zzicp.zzc(bArr, iZza15, zzicoVar5);
                                                zzifdVar5.zzd(zzide.zzN(zzicoVar5.zzb));
                                            }
                                            if (iZza15 != i101) {
                                                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzifsVar2 = this;
                                            i30 = i11;
                                            zzicoVar2 = zzicoVar5;
                                            iZzo = iZza15;
                                            i31 = i64;
                                            unsafe5 = unsafe5;
                                            i34 = iZzQ;
                                            str = str;
                                        } else if (i56 == 0) {
                                            int i102 = zzicp.zza;
                                            zzifd zzifdVar6 = (zzifd) zzieqVar;
                                            iZza = zzicp.zzc(bArr, i64, zzicoVar5);
                                            zzifdVar6.zzd(zzide.zzN(zzicoVar5.zzb));
                                            i39 = i11;
                                            i38 = iZzQ;
                                            while (iZza < i39) {
                                                int iZza16 = zzicp.zza(bArr, iZza, zzicoVar5);
                                                if (i16 == zzicoVar5.zza) {
                                                    iZza = zzicp.zzc(bArr, iZza16, zzicoVar5);
                                                    zzifdVar6.zzd(zzide.zzN(zzicoVar5.zzb));
                                                } else {
                                                    zzifsVar2 = this;
                                                    zzicoVar2 = zzicoVar5;
                                                    iZzo = iZza;
                                                    i31 = i64;
                                                    i30 = i39;
                                                    i34 = i38;
                                                    unsafe5 = unsafe5;
                                                }
                                            }
                                            zzifsVar2 = this;
                                            zzicoVar2 = zzicoVar5;
                                            iZzo = iZza;
                                            i31 = i64;
                                            i30 = i39;
                                            i34 = i38;
                                            unsafe5 = unsafe5;
                                        } else {
                                            zzifsVar2 = this;
                                            i30 = i11;
                                            zzicoVar2 = zzicoVar5;
                                            i31 = i64;
                                            unsafe5 = unsafe5;
                                            i34 = iZzQ;
                                            str = str;
                                            iZzo = i31;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                    default:
                                        zzifsVar2 = this;
                                        i30 = i11;
                                        zzicoVar2 = zzicoVar5;
                                        i31 = i64;
                                        unsafe5 = unsafe5;
                                        str3 = str;
                                        i32 = iZzQ;
                                        if (i56 == 3) {
                                            int i103 = ((i16 == true ? 1 : 0) & (-8)) | 4;
                                            zzigh zzighVarZzq = zzifsVar2.zzq(i32);
                                            str = str3;
                                            i34 = i32;
                                            iZzo = zzicp.zzi(zzighVarZzq, bArr, i31, i11, i103, zzicoVar);
                                            zzieqVar.add(zzicoVar2.zzc);
                                            while (iZzo < i30) {
                                                int iZza17 = zzicp.zza(bArr, iZzo, zzicoVar2);
                                                if (i16 == zzicoVar2.zza) {
                                                    iZzo = zzicp.zzi(zzighVarZzq, bArr, iZza17, i11, i103, zzicoVar);
                                                    zzieqVar.add(zzicoVar2.zzc);
                                                }
                                            }
                                        } else {
                                            str = str3;
                                            i34 = i32;
                                            iZzo = i31;
                                        }
                                        if (iZzo != i31) {
                                            i12 = i12;
                                            i49 = i16 == true ? 1 : 0;
                                            i48 = i34;
                                            zzifsVar4 = zzifsVar2;
                                            unsafe4 = unsafe5;
                                            i50 = i19;
                                            i51 = i65;
                                            i52 = i20;
                                            zzicoVar4 = zzicoVar2;
                                            i11 = i30;
                                            obj5 = obj;
                                        } else {
                                            i18 = iZzo;
                                            i16 = i16 == true ? 1 : 0;
                                            i22 = i34;
                                            unsafe = unsafe5;
                                            str = str;
                                            i21 = i65;
                                            obj2 = obj;
                                            i14 = i12;
                                            this = zzifsVar2;
                                        }
                                        break;
                                }
                            } else {
                                int i104 = i64;
                                Unsafe unsafe6 = unsafe5;
                                int i105 = i11;
                                i29 = i55;
                                i28 = iZzQ;
                                if (iZzC != 50) {
                                    zzicoVar2 = zzicoVar;
                                    int i106 = iArr[i28 + 2] & 1048575;
                                    int i107 = i16 == true ? 1 : 0;
                                    long j12 = i106;
                                    switch (iZzC) {
                                        case 51:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 1) {
                                                iZzc2 = i40 + 8;
                                                unsafe.putObject(obj2, j10, Double.valueOf(Double.longBitsToDouble(zzicp.zze(bArr, i40))));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 52:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 5) {
                                                iZzc2 = i40 + 4;
                                                unsafe.putObject(obj2, j10, Float.valueOf(Float.intBitsToFloat(zzicp.zzd(bArr, i40))));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 53:
                                        case 54:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                iZzc2 = zzicp.zzc(bArr, i40, zzicoVar2);
                                                unsafe.putObject(obj2, j10, Long.valueOf(zzicoVar2.zzb));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 55:
                                        case 62:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                iZzc2 = zzicp.zza(bArr, i40, zzicoVar2);
                                                unsafe.putObject(obj2, j10, Integer.valueOf(zzicoVar2.zza));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 56:
                                        case 65:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 1) {
                                                iZzc2 = i40 + 8;
                                                unsafe.putObject(obj2, j10, Long.valueOf(zzicp.zze(bArr, i40)));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 57:
                                        case 64:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 5) {
                                                iZzc2 = i40 + 4;
                                                unsafe.putObject(obj2, j10, Integer.valueOf(zzicp.zzd(bArr, i40)));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 58:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 0) {
                                                iZzc2 = zzicp.zzc(bArr, i40, zzicoVar2);
                                                unsafe.putObject(obj2, j10, Boolean.valueOf(zzicoVar2.zzb != 0));
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 59:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            if (i56 == 2) {
                                                iZzc2 = zzicp.zza(bArr, i40, zzicoVar2);
                                                int i108 = zzicoVar2.zza;
                                                if (i108 == 0) {
                                                    unsafe.putObject(obj2, j10, "");
                                                } else {
                                                    int i109 = iZzc2 + i108;
                                                    if ((i58 & 536870912) != 0 && !zzihf.zzb(bArr, iZzc2, i109)) {
                                                        throw new zziet("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj2, j10, new String(bArr, iZzc2, i108, StandardCharsets.UTF_8));
                                                    iZzc2 = i109;
                                                }
                                                unsafe.putInt(obj2, j12, i21);
                                            } else {
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 60:
                                            str = str;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 2) {
                                                Object objZzv = zzv(obj, i21, i28);
                                                zzigh zzighVarZzq2 = zzq(i28);
                                                this = this;
                                                i47 = i107 == true ? 1 : 0;
                                                obj2 = obj;
                                                int iZzj = zzicp.zzj(objZzv, zzighVarZzq2, bArr, i104, i11, zzicoVar);
                                                this.zzw(obj2, i21, i28, objZzv);
                                                iZzc2 = iZzj;
                                                i22 = i28;
                                            } else {
                                                this = this;
                                                i107 = i107 == true ? 1 : 0;
                                                obj2 = obj;
                                                i40 = i104;
                                                i22 = i28;
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 61:
                                            zzifsVar3 = this;
                                            obj3 = obj;
                                            str = str;
                                            i41 = i28;
                                            i42 = i104;
                                            i43 = i107 == true ? 1 : 0;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 2) {
                                                iZzc2 = zzicp.zzg(bArr, i42, zzicoVar2);
                                                unsafe.putObject(obj3, j10, zzicoVar2.zzc);
                                                unsafe.putInt(obj3, j12, i21);
                                                this = zzifsVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                i107 = i43;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zzicoVar4 = zzicoVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzifsVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            } else {
                                                this = zzifsVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                i107 = i43 == true ? 1 : 0;
                                                obj2 = obj3;
                                                iZzc2 = i40;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zzicoVar4 = zzicoVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzifsVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            break;
                                        case 63:
                                            zzifsVar3 = this;
                                            obj3 = obj;
                                            str = str;
                                            i41 = i28;
                                            i42 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 0) {
                                                iZzc2 = zzicp.zza(bArr, i42, zzicoVar2);
                                                int i110 = zzicoVar2.zza;
                                                zziek zziekVarZzs2 = zzifsVar3.zzs(i41);
                                                if (zziekVarZzs2 == null || zziekVarZzs2.zza(i110)) {
                                                    i43 = i107 == true ? 1 : 0;
                                                    unsafe.putObject(obj3, j10, Integer.valueOf(i110));
                                                    unsafe.putInt(obj3, j12, i21);
                                                } else {
                                                    zzigu zziguVarZzh = zzh(obj);
                                                    Long lValueOf = Long.valueOf(i110);
                                                    i43 = i107 == true ? 1 : 0;
                                                    zziguVarZzh.zzk(i43 == true ? 1 : 0, lValueOf);
                                                }
                                                this = zzifsVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                i107 = i43;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zzicoVar4 = zzicoVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzifsVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            this = zzifsVar3;
                                            i40 = i42;
                                            i22 = i41;
                                            obj2 = obj3;
                                            iZzc2 = i40;
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 66:
                                            zzifsVar3 = this;
                                            obj3 = obj;
                                            str = str;
                                            i41 = i28;
                                            i42 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            if (i56 == 0) {
                                                iZzc2 = zzicp.zza(bArr, i42, zzicoVar2);
                                                unsafe.putObject(obj3, j10, Integer.valueOf(zzide.zzM(zzicoVar2.zza)));
                                                unsafe.putInt(obj3, j12, i21);
                                                this = zzifsVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zzicoVar4 = zzicoVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzifsVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            this = zzifsVar3;
                                            i40 = i42;
                                            i22 = i41;
                                            obj2 = obj3;
                                            iZzc2 = i40;
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        case 67:
                                            zzifsVar3 = this;
                                            obj3 = obj;
                                            i41 = i28;
                                            i42 = i104;
                                            i21 = i29;
                                            if (i56 == 0) {
                                                iZzc2 = zzicp.zzc(bArr, i42, zzicoVar2);
                                                str = str;
                                                unsafe = unsafe6;
                                                unsafe.putObject(obj3, j10, Long.valueOf(zzide.zzN(zzicoVar2.zzb)));
                                                unsafe.putInt(obj3, j12, i21);
                                                this = zzifsVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                obj2 = obj3;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zzicoVar4 = zzicoVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzifsVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            } else {
                                                str = str;
                                                unsafe = unsafe6;
                                                this = zzifsVar3;
                                                i40 = i42;
                                                i22 = i41;
                                                obj2 = obj3;
                                                iZzc2 = i40;
                                                if (iZzc2 == i40) {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i14 = i12;
                                                    i18 = iZzc2;
                                                    i16 = i107;
                                                } else {
                                                    i107 = i47;
                                                    i40 = i104;
                                                    i40 = i104;
                                                    str = str;
                                                    i12 = i12;
                                                    iZzo = iZzc2;
                                                    zzicoVar4 = zzicoVar2;
                                                    i51 = i21;
                                                    obj5 = obj2;
                                                    zzifsVar4 = this;
                                                    i50 = i19;
                                                    i49 = i107;
                                                    i52 = i20;
                                                    i48 = i22;
                                                }
                                                unsafe4 = unsafe;
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                int i111 = ((i107 == true ? 1 : 0) & (-8)) | 4;
                                                Object objZzv2 = zzv(obj, i29, i28);
                                                int iZzk2 = zzicp.zzk(objZzv2, zzq(i28), bArr, i104, i11, i111, zzicoVar);
                                                zzw(obj, i29, i28, objZzv2);
                                                this = this;
                                                i22 = i28;
                                                obj2 = obj;
                                                unsafe = unsafe6;
                                                i21 = i29;
                                                iZzc2 = iZzk2;
                                            } else {
                                                str = str;
                                                i22 = i28;
                                                i40 = i104;
                                                i21 = i29;
                                                unsafe = unsafe6;
                                                this = this;
                                                obj2 = obj;
                                                iZzc2 = i40;
                                            }
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                        default:
                                            str = str;
                                            i22 = i28;
                                            i40 = i104;
                                            i21 = i29;
                                            unsafe = unsafe6;
                                            this = this;
                                            obj2 = obj;
                                            iZzc2 = i40;
                                            if (iZzc2 == i40) {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i14 = i12;
                                                i18 = iZzc2;
                                                i16 = i107;
                                            } else {
                                                i107 = i47;
                                                i40 = i104;
                                                i40 = i104;
                                                str = str;
                                                i12 = i12;
                                                iZzo = iZzc2;
                                                zzicoVar4 = zzicoVar2;
                                                i51 = i21;
                                                obj5 = obj2;
                                                zzifsVar4 = this;
                                                i50 = i19;
                                                i49 = i107;
                                                i52 = i20;
                                                i48 = i22;
                                            }
                                            unsafe4 = unsafe;
                                            break;
                                    }
                                } else if (i56 == 2) {
                                    Object objZzr = zzifsVar5.zzr(i28);
                                    Object object = unsafe6.getObject(obj, j10);
                                    if (zzifk.zza(object)) {
                                        zzifj zzifjVarZzc = zzifj.zza().zzc();
                                        zzifk.zzb(zzifjVarZzc, object);
                                        unsafe6.putObject(obj, j10, zzifjVarZzc);
                                        object = zzifjVarZzc;
                                    }
                                    zzifh zzifhVarZze = ((zzifi) objZzr).zze();
                                    zzifj zzifjVar = (zzifj) object;
                                    int iZza18 = zzicp.zza(bArr, i104, zzicoVar);
                                    int i112 = zzicoVar.zza;
                                    if (i112 < 0 || i112 > i105 - iZza18) {
                                        throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    }
                                    int i113 = iZza18 + i112;
                                    Object obj6 = zzifhVarZze.zzb;
                                    Object obj7 = zzifhVarZze.zzd;
                                    Object obj8 = obj6;
                                    Object obj9 = obj7;
                                    while (iZza18 < i113) {
                                        int i114 = i104;
                                        int iZzb2 = iZza18 + 1;
                                        int i115 = bArr[iZza18];
                                        if (i115 < 0) {
                                            iZzb2 = zzicp.zzb(i115, bArr, iZzb2, zzicoVar);
                                            i115 = zzicoVar.zza;
                                        }
                                        int i116 = iZzb2;
                                        int i117 = i115 >>> 3;
                                        obj9 = obj9;
                                        int i118 = i115 & 7;
                                        Unsafe unsafe7 = unsafe6;
                                        if (i117 != 1) {
                                            if (i117 != 2) {
                                                i44 = i116;
                                                obj8 = obj8;
                                                i45 = i105;
                                                unsafe3 = unsafe7;
                                                obj4 = obj7;
                                                i46 = i114;
                                                iZza18 = zzicp.zzp(i115, bArr, i44, i45, zzicoVar);
                                            } else {
                                                zzihg zzihgVar = zzifhVarZze.zzc;
                                                if (i118 == zzihgVar.zzb()) {
                                                    Class<?> cls = obj7.getClass();
                                                    obj4 = obj7;
                                                    i46 = i114;
                                                    unsafe3 = unsafe7;
                                                    obj8 = obj8;
                                                    i45 = i105;
                                                    iZza18 = zzR(bArr, i116, i11, zzihgVar, cls, zzicoVar);
                                                    obj9 = zzicoVar.zzc;
                                                } else {
                                                    i44 = i116;
                                                    i45 = i105;
                                                    unsafe3 = unsafe7;
                                                    obj4 = obj7;
                                                    i46 = i114;
                                                }
                                            }
                                            obj8 = obj8;
                                            i105 = i45;
                                            i104 = i46;
                                            obj7 = obj4;
                                            unsafe6 = unsafe3;
                                        } else {
                                            i44 = i116;
                                            i45 = i105;
                                            unsafe3 = unsafe7;
                                            obj4 = obj7;
                                            i46 = i114;
                                            zzihg zzihgVar2 = zzifhVarZze.zza;
                                            if (i118 == zzihgVar2.zzb()) {
                                                iZza18 = zzR(bArr, i44, i11, zzihgVar2, null, zzicoVar);
                                                obj8 = zzicoVar.zzc;
                                                obj9 = obj9;
                                            }
                                            i105 = i45;
                                            i104 = i46;
                                            obj7 = obj4;
                                            unsafe6 = unsafe3;
                                        }
                                        iZza18 = zzicp.zzp(i115, bArr, i44, i45, zzicoVar);
                                        obj8 = obj8;
                                        i105 = i45;
                                        i104 = i46;
                                        obj7 = obj4;
                                        unsafe6 = unsafe3;
                                    }
                                    int i119 = i104;
                                    Unsafe unsafe8 = unsafe6;
                                    Object obj10 = obj8;
                                    int i120 = i105;
                                    if (iZza18 != i113) {
                                        throw new zziet(str);
                                    }
                                    zzifjVar.put(obj10, obj9);
                                    if (i113 != i119) {
                                        obj5 = obj;
                                        i12 = i12;
                                        i49 = i16 == true ? 1 : 0;
                                        iZzo = i113;
                                        i48 = i28;
                                        i11 = i120;
                                        i50 = i19;
                                        i51 = i29;
                                        i52 = i20;
                                        unsafe4 = unsafe8;
                                        zzifsVar4 = this;
                                        zzicoVar4 = zzicoVar;
                                    } else {
                                        zzicoVar2 = zzicoVar;
                                        i18 = i113;
                                        i22 = i28;
                                        str = str;
                                        i21 = i29;
                                        unsafe = unsafe8;
                                        obj2 = obj;
                                        i14 = i12;
                                    }
                                } else {
                                    zzicoVar3 = zzicoVar;
                                    i27 = i104;
                                    unsafe2 = unsafe6;
                                    str2 = str;
                                    str = str2;
                                    zzicoVar2 = zzicoVar3;
                                    i22 = i28;
                                    i18 = i27;
                                    i21 = i29;
                                    unsafe = unsafe2;
                                    obj2 = obj;
                                    i14 = i12;
                                }
                            }
                        } else if (i56 == 2) {
                            zzieq zzieqVarZzh2 = (zzieq) unsafe5.getObject(obj5, j10);
                            if (!zzieqVarZzh2.zza()) {
                                int size2 = zzieqVarZzh2.size();
                                zzieqVarZzh2 = zzieqVarZzh2.zzh(size2 == 0 ? 10 : size2 + size2);
                                unsafe5.putObject(obj5, j10, zzieqVarZzh2);
                            }
                            zzieq zzieqVar2 = zzieqVarZzh2;
                            i51 = i55;
                            int iZzn2 = zzicp.zzn(zzifsVar5.zzq(iZzQ), i16 == true ? 1 : 0, bArr, i64, i11, zzieqVar2, zzicoVar);
                            i11 = i11;
                            i12 = i12;
                            zzicoVar4 = zzicoVar5;
                            iZzo = iZzn2;
                            unsafe4 = unsafe5;
                            i49 = i16 == true ? 1 : 0;
                            i52 = i20;
                            zzifsVar4 = zzifsVar5;
                            i48 = iZzQ;
                            i50 = i19;
                        } else {
                            zzicoVar3 = zzicoVar5;
                            i27 = i64;
                            i28 = iZzQ;
                            unsafe2 = unsafe5;
                            str2 = str;
                            i29 = i55;
                            str = str2;
                            zzicoVar2 = zzicoVar3;
                            i22 = i28;
                            i18 = i27;
                            i21 = i29;
                            unsafe = unsafe2;
                            obj2 = obj;
                            i14 = i12;
                        }
                    }
                } else {
                    i18 = iZzb;
                    i19 = i50;
                    i20 = i52;
                    this = zzifsVar4;
                    str = "Failed to parse the message.";
                    i21 = i55;
                    unsafe = unsafe4;
                    i14 = i12;
                    i22 = 0;
                    i16 = i17;
                    obj2 = obj5;
                    zzicoVar2 = zzicoVar4;
                }
                if (i16 != i14 || i14 == 0) {
                    if (this.zzh) {
                        zzido zzidoVar = zzicoVar2.zzd;
                        int i121 = zzido.zzb;
                        int i122 = zzicn.zza;
                        if (zzidoVar != zzido.zza) {
                            zzifp zzifpVar = this.zzg;
                            int i123 = zzicp.zza;
                            if (zzidoVar.zzc(zzifpVar, i21) != null) {
                                throw null;
                            }
                            iZzo = zzicp.zzo((i16 == true ? 1 : 0) == true ? 1 : 0, bArr, i18, i11, zzh(obj), zzicoVar);
                        } else {
                            iZzo = zzicp.zzo((i16 == true ? 1 : 0) == true ? 1 : 0, bArr, i18, i11, zzh(obj), zzicoVar);
                        }
                    } else {
                        iZzo = zzicp.zzo((i16 == true ? 1 : 0) == true ? 1 : 0, bArr, i18, i11, zzh(obj), zzicoVar);
                    }
                    i12 = i14;
                    i51 = i21;
                    i49 = i16 == true ? 1 : 0;
                    zzifsVar4 = this;
                    i50 = i19;
                    i52 = i20;
                    i48 = i22;
                    zzicoVar4 = zzicoVar2;
                    obj5 = obj2;
                    unsafe4 = unsafe;
                } else {
                    i13 = i11;
                    i15 = i18;
                    i50 = i19;
                    i52 = i20;
                }
            } else {
                str = "Failed to parse the message.";
                unsafe = unsafe4;
                i13 = i11;
                this = zzifsVar4;
                obj2 = obj5;
                i14 = i12;
                i15 = iZzo;
                i16 = i49;
            }
        }
        if (i52 != 1048575) {
            unsafe.putInt(obj2, i52, i50);
        }
        zzigu zziguVar = null;
        for (int i124 = this.zzk; i124 < this.zzl; i124++) {
            zziguVar = (zzigu) zzx(obj, this.zzj[i124], zziguVar, this.zzm, obj);
        }
        if (zziguVar != null) {
            this.zzm.zzi(obj2, zziguVar);
        }
        if (i14 != 0) {
            String str6 = str;
            if (i15 > i13 || i16 != i14) {
                throw new zziet(str6);
            }
        } else if (i15 != i13) {
            throw new zziet(str);
        }
        return i15;
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zzico zzicoVar) throws IOException {
        zzi(obj, bArr, i10, i11, 0, zzicoVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zziee) {
                zziee zzieeVar = (zziee) obj;
                zzieeVar.zzbq();
                zzieeVar.zzbb();
                zzieeVar.zzaY();
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
                                ((zzieq) zziha.zzm(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzifj) object).zzd();
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
    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        List list;
        zzigh zzighVarZzq;
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
                list = (List) zziha.zzm(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzighVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzighVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(obj, iArr[i16], i16) && !zzy(obj, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zziha.zzm(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzighVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zzighVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzifj zzifjVar = (zzifj) zziha.zzm(obj, iZzA & 1048575);
                if (!zzifjVar.isEmpty() && ((zzifi) zzr(i16)).zze().zzc.zza() == zzihh.MESSAGE) {
                    zzigh zzighVarZzb = null;
                    for (Object obj2 : zzifjVar.values()) {
                        if (zzighVarZzb == null) {
                            zzighVarZzb = zzifz.zza().zzb(obj2.getClass());
                        }
                        if (!zzighVarZzb.zzl(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zziea) obj).zza.zze();
    }
}
