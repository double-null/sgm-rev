package com.google.android.gms.internal.play_billing;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhp<T> implements zzhw<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzis.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzil zzl;
    private final zzfu zzm;

    private zzhp(int[] iArr, Object[] objArr, int i10, int i11, zzhm zzhmVar, boolean z10, int[] iArr2, int i12, int i13, zzhr zzhrVar, zzgv zzgvVar, zzil zzilVar, zzfu zzfuVar, zzhh zzhhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzfuVar != null && (zzhmVar instanceof zzgd)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = zzilVar;
        this.zzm = zzfuVar;
        this.zzg = zzhmVar;
    }

    private final void zzA(Object obj, Object obj2, int i10) {
        if (zzH(obj2, i10)) {
            int iZzq = zzq(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzq;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzhw zzhwVarZzt = zzt(i10);
            if (!zzH(obj, i10)) {
                if (zzK(object)) {
                    Object objZze = zzhwVarZzt.zze();
                    zzhwVarZzt.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzC(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzK(object2)) {
                Object objZze2 = zzhwVarZzt.zze();
                zzhwVarZzt.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzhwVarZzt.zzg(object2, object);
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzq = zzq(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzq;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzhw zzhwVarZzt = zzt(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzK(object)) {
                    Object objZze = zzhwVarZzt.zze();
                    zzhwVarZzt.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzD(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzK(object2)) {
                Object objZze2 = zzhwVarZzt.zze();
                zzhwVarZzt.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzhwVarZzt.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, int i10) {
        int iZzn = zzn(i10);
        long j10 = 1048575 & iZzn;
        if (j10 == 1048575) {
            return;
        }
        zzis.zzq(obj, j10, (1 << (iZzn >>> 20)) | zzis.zzc(obj, j10));
    }

    private final void zzD(Object obj, int i10, int i11) {
        zzis.zzq(obj, zzn(i11) & 1048575, i10);
    }

    private final void zzE(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzq(i10) & 1048575, obj2);
        zzC(obj, i10);
    }

    private final void zzF(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzq(i11) & 1048575, obj2);
        zzD(obj, i10, i11);
    }

    private final boolean zzG(Object obj, Object obj2, int i10) {
        return zzH(obj, i10) == zzH(obj2, i10);
    }

    private final boolean zzH(Object obj, int i10) {
        int iZzn = zzn(i10);
        long j10 = iZzn & 1048575;
        if (j10 != 1048575) {
            return (zzis.zzc(obj, j10) & (1 << (iZzn >>> 20))) != 0;
        }
        int iZzq = zzq(i10);
        long j11 = iZzq & 1048575;
        switch (zzp(iZzq)) {
            case 0:
                return Double.doubleToRawLongBits(zzis.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzis.zzb(obj, j11)) != 0;
            case 2:
                return zzis.zzd(obj, j11) != 0;
            case 3:
                return zzis.zzd(obj, j11) != 0;
            case 4:
                return zzis.zzc(obj, j11) != 0;
            case 5:
                return zzis.zzd(obj, j11) != 0;
            case 6:
                return zzis.zzc(obj, j11) != 0;
            case 7:
                return zzis.zzw(obj, j11);
            case 8:
                Object objZzf = zzis.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzfg) {
                    return !zzfg.zza.equals(objZzf);
                }
                return zzN();
            case 9:
                return zzis.zzf(obj, j11) != null;
            case 10:
                return !zzfg.zza.equals(zzis.zzf(obj, j11));
            case 11:
                return zzis.zzc(obj, j11) != 0;
            case 12:
                return zzis.zzc(obj, j11) != 0;
            case 13:
                return zzis.zzc(obj, j11) != 0;
            case 14:
                return zzis.zzd(obj, j11) != 0;
            case 15:
                return zzis.zzc(obj, j11) != 0;
            case 16:
                return zzis.zzd(obj, j11) != 0;
            case 17:
                return zzis.zzf(obj, j11) != null;
            default:
                return zzN();
        }
    }

    private final boolean zzI(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzH(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzJ(Object obj, int i10, zzhw zzhwVar) {
        return zzhwVar.zzk(zzis.zzf(obj, i10 & 1048575));
    }

    private static boolean zzK(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgg) {
            return ((zzgg) obj).zzF();
        }
        return true;
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        long jZzn = zzn(i10) & 1048575;
        return zzis.zzc(obj, jZzn) == zzis.zzc(obj2, jZzn);
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzis.zzc(obj, (long) (zzn(i11) & 1048575)) == i10;
    }

    private boolean zzN() {
        throw new IllegalArgumentException();
    }

    private static final int zzO(byte[] bArr, int i10, int i11, zzjb zzjbVar, Class cls, zzeu zzeuVar) throws IOException {
        int i12;
        zzjb zzjbVar2 = zzjb.zza;
        switch (zzjbVar.ordinal()) {
            case 0:
                i12 = i10 + 8;
                zzeuVar.zzc = Double.valueOf(Double.longBitsToDouble(zzev.zzp(bArr, i10)));
                break;
            case 1:
                i12 = i10 + 4;
                zzeuVar.zzc = Float.valueOf(Float.intBitsToFloat(zzev.zzb(bArr, i10)));
                break;
            case 2:
            case 3:
                int iZzl = zzev.zzl(bArr, i10, zzeuVar);
                zzeuVar.zzc = Long.valueOf(zzeuVar.zzb);
                return iZzl;
            case 4:
            case 12:
            case 13:
                int iZzi = zzev.zzi(bArr, i10, zzeuVar);
                zzeuVar.zzc = Integer.valueOf(zzeuVar.zza);
                return iZzi;
            case 5:
            case 15:
                i12 = i10 + 8;
                zzeuVar.zzc = Long.valueOf(zzev.zzp(bArr, i10));
                break;
            case 6:
            case 14:
                i12 = i10 + 4;
                zzeuVar.zzc = Integer.valueOf(zzev.zzb(bArr, i10));
                break;
            case 7:
                int iZzl2 = zzev.zzl(bArr, i10, zzeuVar);
                zzeuVar.zzc = Boolean.valueOf(zzeuVar.zzb != 0);
                return iZzl2;
            case 8:
                return zzev.zzg(bArr, i10, zzeuVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzev.zzd(zzht.zza().zzb(cls), bArr, i10, i11, zzeuVar);
            case 11:
                return zzev.zza(bArr, i10, zzeuVar);
            case 16:
                int iZzi2 = zzev.zzi(bArr, i10, zzeuVar);
                zzeuVar.zzc = Integer.valueOf(zzfk.zzb(zzeuVar.zza));
                return iZzi2;
            case 17:
                int iZzl3 = zzev.zzl(bArr, i10, zzeuVar);
                zzeuVar.zzc = Long.valueOf(zzfk.zzc(zzeuVar.zzb));
                return iZzl3;
        }
        return i12;
    }

    private static final void zzP(int i10, Object obj, zzjd zzjdVar) throws IOException {
        if (obj instanceof String) {
            zzjdVar.zzH(i10, (String) obj);
        } else {
            zzjdVar.zzd(i10, (zzfg) obj);
        }
    }

    static zzim zzd(Object obj) {
        zzgg zzggVar = (zzgg) obj;
        zzim zzimVar = zzggVar.zzc;
        if (zzimVar != zzim.zzc()) {
            return zzimVar;
        }
        zzim zzimVarZzf = zzim.zzf();
        zzggVar.zzc = zzimVarZzf;
        return zzimVarZzf;
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
    static zzhp zzl(Class cls, zzhj zzhjVar, zzhr zzhrVar, zzgv zzgvVar, zzil zzilVar, zzfu zzfuVar, zzhh zzhhVar) {
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
        Field fieldZzy;
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
        Field fieldZzy2;
        int i38;
        Object obj2;
        Field fieldZzy3;
        int i39;
        char cCharAt9;
        int i40;
        char cCharAt10;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        if (!(zzhjVar instanceof zzhv)) {
            throw null;
        }
        zzhv zzhvVar = (zzhv) zzhjVar;
        String strZzd = zzhvVar.zzd();
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
        Object[] objArrZze = zzhvVar.zze();
        Class<?> cls2 = zzhvVar.zza().getClass();
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
                        if (zzhvVar.zzc() == 1 || i86 != 0) {
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
                        fieldZzy2 = (Field) obj;
                    } else {
                        fieldZzy2 = zzy(cls2, (String) obj);
                        objArrZze[i37] = fieldZzy2;
                        iArr[i73] = i75;
                        i73++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzy2);
                    i38 = i37 + 1;
                    obj2 = objArrZze[i38];
                    int i96 = i86;
                    if (obj2 instanceof Field) {
                        fieldZzy3 = (Field) obj2;
                    } else {
                        fieldZzy3 = zzy(cls2, (String) obj2);
                        objArrZze[i38] = fieldZzy3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzy3);
                    strZzd = strZzd;
                    i28 = iObjectFieldOffset3;
                    i27 = i15;
                    i86 = i96;
                    i29 = 0;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i25 = i93;
                    zzhvVar = zzhvVar;
                }
                i15 = i36;
                i37 = iCharAt11 + iCharAt11;
                obj = objArrZze[i37];
                if (obj instanceof Field) {
                    fieldZzy2 = (Field) obj;
                } else {
                    fieldZzy2 = zzy(cls2, (String) obj);
                    objArrZze[i37] = fieldZzy2;
                    iArr[i73] = i75;
                    i73++;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzy2);
                i38 = i37 + 1;
                obj2 = objArrZze[i38];
                int i97 = i86;
                if (obj2 instanceof Field) {
                    fieldZzy3 = (Field) obj2;
                } else {
                    fieldZzy3 = zzy(cls2, (String) obj2);
                    objArrZze[i38] = fieldZzy3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzy3);
                strZzd = strZzd;
                i28 = iObjectFieldOffset5;
                i27 = i15;
                i86 = i97;
                i29 = 0;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i25 = i93;
                zzhvVar = zzhvVar;
            } else {
                i26 = i14;
                i27 = i15 + 1;
                Field fieldZzy4 = zzy(cls2, (String) objArrZze[i15]);
                if (i84 == 9 || i84 == 17) {
                    zzhvVar = zzhvVar;
                    int i98 = i75 / 3;
                    objArr[i98 + i98 + 1] = fieldZzy4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        i31 = i27 + 1;
                        int i99 = i75 / 3;
                        objArr[i99 + i99 + 1] = objArrZze[i27];
                        i27 = i31;
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        zzhvVar = zzhvVar;
                        if (zzhvVar.zzc() == 1 || i86 != 0) {
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
                            zzhvVar = zzhvVar;
                        } else {
                            i27 = i101;
                            i72 = i102;
                            i86 = 0;
                            zzhvVar = zzhvVar;
                        }
                    } else {
                        zzhvVar = zzhvVar;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzy4);
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
                            fieldZzy = (Field) obj3;
                        } else {
                            fieldZzy = zzy(cls2, (String) obj3);
                            objArrZze[i108] = fieldZzy;
                        }
                        int i109 = i105;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzy);
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
                    zzhvVar = zzhvVar;
                    i14 = i26;
                    c10 = 55296;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzy4);
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
                zzhvVar = zzhvVar;
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
            zzhvVar = zzhvVar;
            i14 = i26;
            c10 = 55296;
        }
        return new zzhp(iArr3, objArr, i14, i12, zzhvVar.zza(), false, iArr, i11, i70, zzhrVar, zzgvVar, zzilVar, zzfuVar, zzhhVar);
    }

    private static int zzm(Object obj, long j10) {
        return ((Integer) zzis.zzf(obj, j10)).intValue();
    }

    private final int zzn(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzo(int i10, int i11) {
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

    private static int zzp(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzq(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzr(Object obj, long j10) {
        return ((Long) zzis.zzf(obj, j10)).longValue();
    }

    private final zzgj zzs(int i10) {
        int i11 = i10 / 3;
        return (zzgj) this.zzd[i11 + i11 + 1];
    }

    private final zzhw zzt(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzhw zzhwVar = (zzhw) objArr[i12];
        if (zzhwVar != null) {
            return zzhwVar;
        }
        zzhw zzhwVarZzb = zzht.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzhwVarZzb;
        return zzhwVarZzb;
    }

    private final Object zzu(Object obj, int i10, Object obj2, zzil zzilVar, Object obj3) {
        zzgj zzgjVarZzs;
        int i11 = this.zzc[i10];
        Object objZzf = zzis.zzf(obj, zzq(i10) & 1048575);
        if (objZzf == null || (zzgjVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzhe zzheVarZzc = ((zzhf) zzv(i10)).zzc();
        Iterator it = ((zzhg) objZzf).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzgjVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzilVar.zza(obj3);
                }
                int iZzb = zzhf.zzb(zzheVarZzc, entry.getKey(), entry.getValue());
                zzfg zzfgVar = zzfg.zza;
                byte[] bArr = new byte[iZzb];
                int i12 = zzfo.zzb;
                zzfl zzflVar = new zzfl(bArr, 0, iZzb);
                try {
                    zzhf.zze(zzflVar, zzheVarZzc, entry.getKey(), entry.getValue());
                    ((zzim) obj2).zzj((i11 << 3) | 2, zzfc.zza(zzflVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private final Object zzv(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzw(Object obj, int i10) {
        zzhw zzhwVarZzt = zzt(i10);
        int iZzq = zzq(i10) & 1048575;
        if (!zzH(obj, i10)) {
            return zzhwVarZzt.zze();
        }
        Object object = zzb.getObject(obj, iZzq);
        if (zzK(object)) {
            return object;
        }
        Object objZze = zzhwVarZzt.zze();
        if (object != null) {
            zzhwVarZzt.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzx(Object obj, int i10, int i11) {
        zzhw zzhwVarZzt = zzt(i11);
        if (!zzM(obj, i10, i11)) {
            return zzhwVarZzt.zze();
        }
        Object object = zzb.getObject(obj, zzq(i11) & 1048575);
        if (zzK(object)) {
            return object;
        }
        Object objZze = zzhwVarZzt.zze();
        if (object != null) {
            zzhwVarZzt.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzy(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e10);
        }
    }

    private static void zzz(Object obj) {
        if (!zzK(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:203:0x0565  */
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
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v166 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v46, types: [int] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
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
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final int zza(Object obj) {
        int i10;
        ?? r16;
        ?? r10;
        int iZzy;
        int iZzy2;
        int iZzy3;
        int iZzz;
        int iZzy4;
        int iZzy5;
        int iZzb;
        int iZzy6;
        ?? Zzh;
        int size;
        int iZzy7;
        int iZzb2;
        int iZzy8;
        int iZzb3;
        int iZzy9;
        ?? Zzy;
        ?? Zzy2;
        ?? Zza;
        int iZzf;
        int iZzy10;
        int iZzy11;
        ?? r11;
        ?? r12;
        ?? r13;
        Unsafe unsafe = zzb;
        boolean z10 = false;
        int i11 = 1048575;
        ?? r14 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iZza = i13 + ((zzgg) obj).zzc.zza();
                if (!this.zzh) {
                    return iZza;
                }
                zzid zzidVar = ((zzgd) obj).zzb.zza;
                int iZzc = zzidVar.zzc();
                int iZzc2 = 0;
                for (int i15 = 0; i15 < iZzc; i15++) {
                    Map.Entry entryZzg = zzidVar.zzg(i15);
                    iZzc2 += zzfy.zzc((zzfx) ((zzhz) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzidVar.zzd()) {
                    iZzc2 += zzfy.zzc((zzfx) entry.getKey(), entry.getValue());
                }
                return iZza + iZzc2;
            }
            int iZzq = zzq(i12);
            int iZzp = zzp(iZzq);
            int i16 = iArr[i12];
            int i17 = iArr[i12 + 2];
            int i18 = i17 & i11;
            if (iZzp <= 17) {
                if (i18 != i14) {
                    r13 = i18 == i11 ? z10 : unsafe.getInt(obj, i18);
                    i14 = i18;
                }
                i10 = i14;
                r16 = r13;
                r10 = 1 << (i17 >>> 20);
            } else {
                r13 = r14;
                i10 = i14;
                r16 = r14 == true ? 1 : 0;
                r10 = z10;
            }
            int i19 = iZzq & i11;
            if (iZzp >= zzfz.zzJ.zza()) {
                zzfz.zzW.zza();
            }
            long j10 = i19;
            switch (iZzp) {
                case 0:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy = zzfo.zzy(i16 << 3);
                        Zza = iZzy + 8;
                        i13 += Zza;
                    }
                    break;
                case 1:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy2 = zzfo.zzy(i16 << 3);
                        Zza = iZzy2 + 4;
                        i13 += Zza;
                    }
                    break;
                case 2:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(j11);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 3:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(j12);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 4:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(j13);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 5:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy = zzfo.zzy(i16 << 3);
                        Zza = iZzy + 8;
                        i13 += Zza;
                    }
                    break;
                case 6:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy2 = zzfo.zzy(i16 << 3);
                        Zza = iZzy2 + 4;
                        i13 += Zza;
                    }
                    break;
                case 7:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy4 = zzfo.zzy(i16 << 3);
                        Zza = iZzy4 + 1;
                        i13 += Zza;
                    }
                    break;
                case 8:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzfg) {
                            iZzy5 = zzfo.zzy(i20);
                            iZzb = ((zzfg) object).zzd();
                            iZzy6 = zzfo.zzy(iZzb);
                        } else {
                            iZzy5 = zzfo.zzy(i20);
                            int i21 = zzix.zza;
                            iZzb = zziu.zzb((String) object);
                            iZzy6 = zzfo.zzy(iZzb);
                        }
                        Zza = iZzy5 + iZzy6 + iZzb;
                        i13 += Zza;
                    }
                    break;
                case 9:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        zzhw zzhwVarZzt = zzt(i12);
                        int i22 = zzhx.zza;
                        iZzy5 = zzfo.zzy(i16 << 3);
                        iZzb = ((zzer) object2).zzi(zzhwVarZzt);
                        iZzy6 = zzfo.zzy(iZzb);
                        Zza = iZzy5 + iZzy6 + iZzb;
                        i13 += Zza;
                    }
                    break;
                case 10:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        zzfg zzfgVar = (zzfg) unsafe.getObject(obj, j10);
                        iZzy5 = zzfo.zzy(i16 << 3);
                        iZzb = zzfgVar.zzd();
                        iZzy6 = zzfo.zzy(iZzb);
                        Zza = iZzy5 + iZzy6 + iZzb;
                        i13 += Zza;
                    }
                    break;
                case 11:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i23 = unsafe.getInt(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzy(i23);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 12:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(j14);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 13:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy2 = zzfo.zzy(i16 << 3);
                        Zza = iZzy2 + 4;
                        i13 += Zza;
                    }
                    break;
                case 14:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzy = zzfo.zzy(i16 << 3);
                        Zza = iZzy + 8;
                        i13 += Zza;
                    }
                    break;
                case 15:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i24 = unsafe.getInt(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzy((i24 >> 31) ^ (i24 + i24));
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 16:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz((j15 >> 63) ^ (j15 + j15));
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 17:
                    if (zzI(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        Zza = zzhx.zza(i16, (zzhm) unsafe.getObject(obj, j10), zzt(i12));
                        i13 += Zza;
                    }
                    break;
                case 18:
                    Zza = zzhx.zze(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zza;
                    break;
                case 19:
                    Zza = zzhx.zzc(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zza;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i25 = zzhx.zza;
                    if (list.size() == 0) {
                        Zzh = z10;
                    } else {
                        Zzh = zzhx.zzh(list) + (list.size() * zzfo.zzy(i16 << 3));
                    }
                    i13 += Zzh;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzhx.zza;
                    size = list2.size();
                    if (size == 0) {
                        Zza = z10;
                    } else {
                        iZzy3 = zzhx.zzl(list2);
                        iZzy7 = zzfo.zzy(i16 << 3);
                        iZzz = size * iZzy7;
                        Zza = iZzy3 + iZzz;
                    }
                    i13 += Zza;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i27 = zzhx.zza;
                    size = list3.size();
                    if (size == 0) {
                        Zza = z10;
                    } else {
                        iZzy3 = zzhx.zzg(list3);
                        iZzy7 = zzfo.zzy(i16 << 3);
                        iZzz = size * iZzy7;
                        Zza = iZzy3 + iZzz;
                    }
                    i13 += Zza;
                    break;
                case 23:
                    Zza = zzhx.zze(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zza;
                    break;
                case 24:
                    Zza = zzhx.zzc(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zza;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i28 = zzhx.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        Zza = z10;
                    } else {
                        Zza = size2 * (zzfo.zzy(i16 << 3) + 1);
                    }
                    i13 += Zza;
                    break;
                case 26:
                    ?? r15 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzhx.zza;
                    int size3 = r15.size();
                    if (size3 == 0) {
                        Zzh = z10;
                    } else {
                        int iZzy12 = zzfo.zzy(i16 << 3) * size3;
                        if (r15 instanceof zzgu) {
                            zzgu zzguVar = (zzgu) r15;
                            for (?? r17 = z10; r17 < size3; r17++) {
                                Object objZza = zzguVar.zza();
                                if (objZza instanceof zzfg) {
                                    Zzh = iZzy12;
                                    iZzb3 = ((zzfg) objZza).zzd();
                                    iZzy9 = zzfo.zzy(iZzb3);
                                } else {
                                    Zzh = iZzy12;
                                    int i30 = zzix.zza;
                                    iZzb3 = zziu.zzb((String) objZza);
                                    iZzy9 = zzfo.zzy(iZzb3);
                                }
                                Zzh += iZzy9 + iZzb3;
                            }
                            Zzh = iZzy12;
                        } else {
                            for (?? r18 = z10; r18 < size3; r18++) {
                                Object obj2 = r15.get(r18);
                                if (obj2 instanceof zzfg) {
                                    Zzh = iZzy12;
                                    iZzb2 = ((zzfg) obj2).zzd();
                                    iZzy8 = zzfo.zzy(iZzb2);
                                } else {
                                    Zzh = iZzy12;
                                    int i31 = zzix.zza;
                                    iZzb2 = zziu.zzb((String) obj2);
                                    iZzy8 = zzfo.zzy(iZzb2);
                                }
                                Zzh += iZzy8 + iZzb2;
                            }
                            Zzh = iZzy12;
                        }
                    }
                    i13 += Zzh;
                    break;
                case 27:
                    ?? r19 = (List) unsafe.getObject(obj, j10);
                    zzhw zzhwVarZzt2 = zzt(i12);
                    int i32 = zzhx.zza;
                    int size4 = r19.size();
                    if (size4 == 0) {
                        Zzy = z10;
                    } else {
                        int iZzy13 = zzfo.zzy(i16 << 3) * size4;
                        for (?? r20 = z10; r20 < size4; r20++) {
                            Zzy = iZzy13;
                            int iZzi = ((zzer) r19.get(r20)).zzi(zzhwVarZzt2);
                            Zzy = (Zzy == true ? 1 : 0) + zzfo.zzy(iZzi) + iZzi;
                        }
                        Zzy = iZzy13;
                    }
                    i13 += Zzy;
                    break;
                case 28:
                    ?? r21 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzhx.zza;
                    int size5 = r21.size();
                    if (size5 == 0) {
                        Zzy2 = z10;
                    } else {
                        Zzy2 = size5 * zzfo.zzy(i16 << 3);
                        for (?? r22 = z10; r22 < r21.size(); r22++) {
                            int iZzd = ((zzfg) r21.get(r22)).zzd();
                            Zzy2 += zzfo.zzy(iZzd) + iZzd;
                        }
                    }
                    i13 += Zzy2;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzhx.zza;
                    size = list5.size();
                    if (size == 0) {
                        Zza = z10;
                    } else {
                        iZzy3 = zzhx.zzk(list5);
                        iZzy7 = zzfo.zzy(i16 << 3);
                        iZzz = size * iZzy7;
                        Zza = iZzy3 + iZzz;
                    }
                    i13 += Zza;
                    break;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i35 = zzhx.zza;
                    size = list6.size();
                    if (size == 0) {
                        Zza = z10;
                    } else {
                        iZzy3 = zzhx.zzb(list6);
                        iZzy7 = zzfo.zzy(i16 << 3);
                        iZzz = size * iZzy7;
                        Zza = iZzy3 + iZzz;
                    }
                    i13 += Zza;
                    break;
                case 31:
                    Zza = zzhx.zzc(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zza;
                    break;
                case 32:
                    Zza = zzhx.zze(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zza;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i36 = zzhx.zza;
                    size = list7.size();
                    if (size == 0) {
                        Zza = z10;
                    } else {
                        iZzy3 = zzhx.zzi(list7);
                        iZzy7 = zzfo.zzy(i16 << 3);
                        iZzz = size * iZzy7;
                        Zza = iZzy3 + iZzz;
                    }
                    i13 += Zza;
                    break;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzhx.zza;
                    size = list8.size();
                    if (size == 0) {
                        Zza = z10;
                    } else {
                        iZzy3 = zzhx.zzj(list8);
                        iZzy7 = zzfo.zzy(i16 << 3);
                        iZzz = size * iZzy7;
                        Zza = iZzy3 + iZzz;
                    }
                    i13 += Zza;
                    break;
                case 35:
                    iZzf = zzhx.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 36:
                    iZzf = zzhx.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 37:
                    iZzf = zzhx.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 38:
                    iZzf = zzhx.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 39:
                    iZzf = zzhx.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 40:
                    iZzf = zzhx.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 41:
                    iZzf = zzhx.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i38 = zzhx.zza;
                    iZzf = list9.size();
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 43:
                    iZzf = zzhx.zzk((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 44:
                    iZzf = zzhx.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 45:
                    iZzf = zzhx.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 46:
                    iZzf = zzhx.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 47:
                    iZzf = zzhx.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 48:
                    iZzf = zzhx.zzj((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy10 = zzfo.zzy(i16 << 3);
                        iZzy11 = zzfo.zzy(iZzf);
                        Zzy2 = iZzy10 + iZzy11 + iZzf;
                        i13 += Zzy2;
                    }
                    break;
                case 49:
                    ?? r23 = (List) unsafe.getObject(obj, j10);
                    zzhw zzhwVarZzt3 = zzt(i12);
                    int i39 = zzhx.zza;
                    int size6 = r23.size();
                    if (size6 == 0) {
                        r11 = z10;
                    } else {
                        boolean z11 = z10;
                        r11 = z11;
                        while (r12 < size6) {
                            r12 = z11;
                            int iZza2 = zzhx.zza(i16, (zzhm) r23.get(r12), zzhwVarZzt3);
                            r12++;
                            r11 = (r11 == true ? 1 : 0) + iZza2;
                        }
                        r12 = z11;
                    }
                    i13 += r11;
                    break;
                case 50:
                    zzhg zzhgVar = (zzhg) unsafe.getObject(obj, j10);
                    zzhf zzhfVar = (zzhf) zzv(i12);
                    if (zzhgVar.isEmpty()) {
                        Zzh = z10;
                    } else {
                        Zzh = z10;
                        for (Map.Entry entry2 : zzhgVar.entrySet()) {
                            Zzh += zzhfVar.zza(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i13 += Zzh;
                    break;
                case 51:
                    if (zzM(obj, i16, i12)) {
                        iZzy = zzfo.zzy(i16 << 3);
                        Zza = iZzy + 8;
                        i13 += Zza;
                    }
                    break;
                case 52:
                    if (zzM(obj, i16, i12)) {
                        iZzy2 = zzfo.zzy(i16 << 3);
                        Zza = iZzy2 + 4;
                        i13 += Zza;
                    }
                    break;
                case 53:
                    if (zzM(obj, i16, i12)) {
                        long jZzr = zzr(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(jZzr);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 54:
                    if (zzM(obj, i16, i12)) {
                        long jZzr2 = zzr(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(jZzr2);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 55:
                    if (zzM(obj, i16, i12)) {
                        long jZzm = zzm(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(jZzm);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 56:
                    if (zzM(obj, i16, i12)) {
                        iZzy = zzfo.zzy(i16 << 3);
                        Zza = iZzy + 8;
                        i13 += Zza;
                    }
                    break;
                case 57:
                    if (zzM(obj, i16, i12)) {
                        iZzy2 = zzfo.zzy(i16 << 3);
                        Zza = iZzy2 + 4;
                        i13 += Zza;
                    }
                    break;
                case 58:
                    if (zzM(obj, i16, i12)) {
                        iZzy4 = zzfo.zzy(i16 << 3);
                        Zza = iZzy4 + 1;
                        i13 += Zza;
                    }
                    break;
                case 59:
                    if (zzM(obj, i16, i12)) {
                        int i40 = i16 << 3;
                        Object object3 = unsafe.getObject(obj, j10);
                        if (object3 instanceof zzfg) {
                            iZzy5 = zzfo.zzy(i40);
                            iZzb = ((zzfg) object3).zzd();
                            iZzy6 = zzfo.zzy(iZzb);
                        } else {
                            iZzy5 = zzfo.zzy(i40);
                            int i41 = zzix.zza;
                            iZzb = zziu.zzb((String) object3);
                            iZzy6 = zzfo.zzy(iZzb);
                        }
                        Zza = iZzy5 + iZzy6 + iZzb;
                        i13 += Zza;
                    }
                    break;
                case 60:
                    if (zzM(obj, i16, i12)) {
                        Object object4 = unsafe.getObject(obj, j10);
                        zzhw zzhwVarZzt4 = zzt(i12);
                        int i42 = zzhx.zza;
                        iZzy5 = zzfo.zzy(i16 << 3);
                        iZzb = ((zzer) object4).zzi(zzhwVarZzt4);
                        iZzy6 = zzfo.zzy(iZzb);
                        Zza = iZzy5 + iZzy6 + iZzb;
                        i13 += Zza;
                    }
                    break;
                case 61:
                    if (zzM(obj, i16, i12)) {
                        zzfg zzfgVar2 = (zzfg) unsafe.getObject(obj, j10);
                        iZzy5 = zzfo.zzy(i16 << 3);
                        iZzb = zzfgVar2.zzd();
                        iZzy6 = zzfo.zzy(iZzb);
                        Zza = iZzy5 + iZzy6 + iZzb;
                        i13 += Zza;
                    }
                    break;
                case 62:
                    if (zzM(obj, i16, i12)) {
                        int iZzm = zzm(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzy(iZzm);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 63:
                    if (zzM(obj, i16, i12)) {
                        long jZzm2 = zzm(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz(jZzm2);
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 64:
                    if (zzM(obj, i16, i12)) {
                        iZzy2 = zzfo.zzy(i16 << 3);
                        Zza = iZzy2 + 4;
                        i13 += Zza;
                    }
                    break;
                case 65:
                    if (zzM(obj, i16, i12)) {
                        iZzy = zzfo.zzy(i16 << 3);
                        Zza = iZzy + 8;
                        i13 += Zza;
                    }
                    break;
                case 66:
                    if (zzM(obj, i16, i12)) {
                        int iZzm2 = zzm(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzy((iZzm2 >> 31) ^ (iZzm2 + iZzm2));
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 67:
                    if (zzM(obj, i16, i12)) {
                        long jZzr3 = zzr(obj, j10);
                        iZzy3 = zzfo.zzy(i16 << 3);
                        iZzz = zzfo.zzz((jZzr3 >> 63) ^ (jZzr3 + jZzr3));
                        Zza = iZzy3 + iZzz;
                        i13 += Zza;
                    }
                    break;
                case 68:
                    if (zzM(obj, i16, i12)) {
                        Zza = zzhx.zza(i16, (zzhm) unsafe.getObject(obj, j10), zzt(i12));
                        i13 += Zza;
                    }
                    break;
            }
            i12 += 3;
            i14 = i10;
            r14 = r16;
            z10 = false;
            i11 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzq = zzq(i12);
            int iZzp = zzp(iZzq);
            if (iZzp <= 50 || iZzp >= 69) {
                long j10 = iZzq & 1048575;
                int iHashCode2 = 37;
                switch (iZzp) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzis.zza(obj, j10));
                        byte[] bArr = zzgm.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzis.zzb(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzis.zzd(obj, j10);
                        byte[] bArr2 = zzgm.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzis.zzd(obj, j10);
                        byte[] bArr3 = zzgm.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzis.zzd(obj, j10);
                        byte[] bArr4 = zzgm.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzgm.zza(zzis.zzw(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzis.zzf(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzf = zzis.zzf(obj, j10);
                        if (objZzf != null) {
                            iHashCode2 = objZzf.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzf(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzis.zzd(obj, j10);
                        byte[] bArr5 = zzgm.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzis.zzd(obj, j10);
                        byte[] bArr6 = zzgm.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzf2 = zzis.zzf(obj, j10);
                        if (objZzf2 != null) {
                            iHashCode2 = objZzf2.hashCode();
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
                        iFloatToIntBits = zzis.zzf(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzis.zzf(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzk;
        while (true) {
            int[] iArr = this.zzi;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zzgg) obj).zzc.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zzgd) obj).zzb.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + zzis.zzf(obj, zzq(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:603:0x0ebc A[PHI: r4 r5 r7 r8 r11 r12 r18 r20
      0x0ebc: PHI (r4v119 int) = 
      (r4v94 int)
      (r4v95 int)
      (r4v96 int)
      (r4v97 int)
      (r4v98 int)
      (r4v99 int)
      (r4v100 int)
      (r4v101 int)
      (r4v112 int)
      (r4v120 int)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r5v110 com.google.android.gms.internal.play_billing.zzeu) = 
      (r5v96 com.google.android.gms.internal.play_billing.zzeu)
      (r5v97 com.google.android.gms.internal.play_billing.zzeu)
      (r5v98 com.google.android.gms.internal.play_billing.zzeu)
      (r5v99 com.google.android.gms.internal.play_billing.zzeu)
      (r5v100 com.google.android.gms.internal.play_billing.zzeu)
      (r5v101 com.google.android.gms.internal.play_billing.zzeu)
      (r5v102 com.google.android.gms.internal.play_billing.zzeu)
      (r5v103 com.google.android.gms.internal.play_billing.zzeu)
      (r5v106 com.google.android.gms.internal.play_billing.zzeu)
      (r5v111 com.google.android.gms.internal.play_billing.zzeu)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r7v72 java.lang.Object) = 
      (r7v51 java.lang.Object)
      (r7v52 java.lang.Object)
      (r7v53 java.lang.Object)
      (r7v54 java.lang.Object)
      (r7v55 java.lang.Object)
      (r7v56 java.lang.Object)
      (r7v57 java.lang.Object)
      (r7v58 java.lang.Object)
      (r7v67 java.lang.Object)
      (r7v73 java.lang.Object)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r8v124 sun.misc.Unsafe) = 
      (r8v100 sun.misc.Unsafe)
      (r8v101 sun.misc.Unsafe)
      (r8v102 sun.misc.Unsafe)
      (r8v103 sun.misc.Unsafe)
      (r8v104 sun.misc.Unsafe)
      (r8v105 sun.misc.Unsafe)
      (r8v106 sun.misc.Unsafe)
      (r8v107 sun.misc.Unsafe)
      (r5v95 sun.misc.Unsafe)
      (r8v125 sun.misc.Unsafe)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r11v34 int) = 
      (r11v16 int)
      (r11v16 int)
      (r11v16 int)
      (r11v16 int)
      (r11v16 int)
      (r11v16 int)
      (r11v16 int)
      (r11v16 int)
      (r11v30 int)
      (r11v16 int)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r12v78 int) = 
      (r12v47 int)
      (r12v48 int)
      (r12v49 int)
      (r12v50 int)
      (r12v51 int)
      (r12v52 int)
      (r12v53 int)
      (r12v54 int)
      (r12v71 int)
      (r12v79 int)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r18v39 int) = 
      (r18v27 int)
      (r18v27 int)
      (r18v27 int)
      (r18v27 int)
      (r18v27 int)
      (r18v27 int)
      (r18v27 int)
      (r18v27 int)
      (r18v36 int)
      (r18v27 int)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]
      0x0ebc: PHI (r20v52 java.lang.String) = 
      (r20v31 java.lang.String)
      (r20v32 java.lang.String)
      (r20v33 java.lang.String)
      (r20v34 java.lang.String)
      (r20v35 java.lang.String)
      (r20v36 java.lang.String)
      (r20v37 java.lang.String)
      (r20v38 java.lang.String)
      (r20v47 java.lang.String)
      (r20v53 java.lang.String)
     binds: [B:601:0x0ea5, B:598:0x0e83, B:595:0x0e65, B:592:0x0e47, B:589:0x0e29, B:586:0x0e0a, B:579:0x0de2, B:565:0x0da6, B:563:0x0d98, B:529:0x0c3b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:619:0x0f17  */
    /* JADX WARN: Code duplicated, block: B:694:0x0ab2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0ebf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0ac6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x0ed1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v9 */
    final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzeu zzeuVar) throws IOException {
        zzhp<T> zzhpVar;
        String str;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzj;
        int i18;
        int iZzo;
        int i19;
        zzeu zzeuVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        ?? r10;
        int i27;
        int iZzl;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        zzeu zzeuVar3;
        Unsafe unsafe2;
        int i36;
        int i37;
        int i38;
        int i39;
        String str2;
        int i40;
        zzeu zzeuVar4;
        int i41;
        String str3;
        ?? r11;
        zzeu zzeuVar5;
        int i42;
        Unsafe unsafe3;
        int i43;
        int iZzk;
        int i44;
        int i45;
        int iZzi;
        zzeu zzeuVar6;
        Unsafe unsafe4;
        String str4;
        int i46;
        int i47;
        Object obj2;
        zzeu zzeuVar7;
        String str5;
        int i48;
        int i49;
        int iZza;
        int i50;
        this = this;
        Object obj3 = obj;
        i11 = i11;
        i12 = i12;
        zzeu zzeuVar8 = zzeuVar;
        zzz(obj);
        Unsafe unsafe5 = zzb;
        int iZzh = i10;
        int i51 = -1;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 1048575;
        while (true) {
            if (iZzh < i11) {
                int i56 = iZzh + 1;
                int i57 = bArr[iZzh];
                if (i57 < 0) {
                    iZzj = zzev.zzj(i57, bArr, i56, zzeuVar8);
                    i17 = zzeuVar8.zza;
                } else {
                    i17 = i57;
                    iZzj = i56;
                }
                int i58 = i17 >>> 3;
                if (i58 > i51) {
                    iZzo = (i58 < this.zze || i58 > this.zzf) ? -1 : this.zzo(i58, i52 / 3);
                    i18 = 0;
                } else if (i58 < this.zze || i58 > this.zzf) {
                    i18 = 0;
                    iZzo = -1;
                } else {
                    i18 = 0;
                    iZzo = this.zzo(i58, 0);
                }
                if (iZzo != -1) {
                    int i59 = i17 & 7;
                    int[] iArr = this.zzc;
                    int i60 = i17;
                    int i61 = iArr[iZzo + 1];
                    str = "Failed to parse the message.";
                    int iZzp = zzp(i61);
                    long j10 = i61 & 1048575;
                    int i62 = i58;
                    if (iZzp <= 17) {
                        int i63 = iArr[iZzo + 2];
                        int i64 = 1 << (i63 >>> 20);
                        int i65 = i63 & 1048575;
                        if (i65 != i55) {
                            if (i55 != 1048575) {
                                unsafe5.putInt(obj3, i55, i54);
                            }
                            i54 = i65 == 1048575 ? 0 : unsafe5.getInt(obj3, i65);
                            i55 = i65;
                        } else {
                            i55 = i55;
                        }
                        switch (iZzp) {
                            case 0:
                                i25 = iZzj;
                                i26 = iZzo;
                                r10 = 65535;
                                if (i59 == 1) {
                                    iZzh = i25 + 8;
                                    i54 |= i64;
                                    zzis.zzo(obj3, j10, Double.longBitsToDouble(zzev.zzp(bArr, i25)));
                                    i52 = i26;
                                    i53 = i60;
                                    i51 = i62;
                                } else {
                                    zzeuVar8 = zzeuVar8;
                                    i28 = i60 == true ? 1 : 0;
                                    i62 = i62;
                                    i54 = i54;
                                    i29 = i26;
                                    i30 = i25;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 1:
                                i25 = iZzj;
                                i26 = iZzo;
                                r10 = 65535;
                                if (i59 == 5) {
                                    iZzh = i25 + 4;
                                    i54 |= i64;
                                    zzis.zzp(obj3, j10, Float.intBitsToFloat(zzev.zzb(bArr, i25)));
                                    i52 = i26;
                                    i53 = i60;
                                    i51 = i62;
                                } else {
                                    zzeuVar8 = zzeuVar8;
                                    i28 = i60 == true ? 1 : 0;
                                    i62 = i62;
                                    i54 = i54;
                                    i29 = i26;
                                    i30 = i25;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 2:
                            case 3:
                                i25 = iZzj;
                                i26 = iZzo;
                                r10 = 65535;
                                if (i59 == 0) {
                                    i27 = i64 | i54;
                                    iZzl = zzev.zzl(bArr, i25, zzeuVar8);
                                    unsafe5.putLong(obj, j10, zzeuVar8.zzb);
                                    i52 = i26;
                                    i54 = i27;
                                    iZzh = iZzl;
                                    i53 = i60;
                                    i51 = i62;
                                } else {
                                    zzeuVar8 = zzeuVar8;
                                    i28 = i60 == true ? 1 : 0;
                                    i62 = i62;
                                    i54 = i54;
                                    i29 = i26;
                                    i30 = i25;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 4:
                            case 11:
                                i25 = iZzj;
                                i26 = iZzo;
                                r10 = 65535;
                                if (i59 == 0) {
                                    i54 |= i64;
                                    iZzh = zzev.zzi(bArr, i25, zzeuVar8);
                                    unsafe5.putInt(obj3, j10, zzeuVar8.zza);
                                    i52 = i26;
                                    i53 = i60;
                                    i51 = i62;
                                } else {
                                    zzeuVar8 = zzeuVar8;
                                    i28 = i60 == true ? 1 : 0;
                                    i62 = i62;
                                    i54 = i54;
                                    i29 = i26;
                                    i30 = i25;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 5:
                            case 14:
                                int i66 = iZzj;
                                if (i59 == 1) {
                                    iZzl = i66 + 8;
                                    i27 = i64 | i54;
                                    long jZzp = zzev.zzp(bArr, i66);
                                    i60 = i60 == true ? 1 : 0;
                                    i26 = iZzo;
                                    unsafe5.putLong(obj, j10, jZzp);
                                    i52 = i26;
                                    i54 = i27;
                                    iZzh = iZzl;
                                    i53 = i60;
                                    i51 = i62;
                                } else {
                                    i30 = i66;
                                    i28 = i60 == true ? 1 : 0;
                                    i29 = iZzo;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 6:
                            case 13:
                                i31 = iZzj;
                                i32 = i60 == true ? 1 : 0;
                                if (i59 == 5) {
                                    iZzh = i31 + 4;
                                    i54 |= i64;
                                    unsafe5.putInt(obj3, j10, zzev.zzb(bArr, i31));
                                    i11 = i11;
                                    i12 = i12;
                                    i52 = iZzo;
                                    i53 = i32;
                                    i55 = i55;
                                    i51 = i62;
                                } else {
                                    i28 = i32;
                                    i30 = i31;
                                    i29 = iZzo;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 7:
                                i31 = iZzj;
                                i32 = i60 == true ? 1 : 0;
                                if (i59 == 0) {
                                    i54 |= i64;
                                    iZzh = zzev.zzl(bArr, i31, zzeuVar8);
                                    zzis.zzm(obj3, j10, zzeuVar8.zzb != 0);
                                    i11 = i11;
                                    i12 = i12;
                                    i52 = iZzo;
                                    i53 = i32;
                                    i55 = i55;
                                    i51 = i62;
                                } else {
                                    i28 = i32;
                                    i30 = i31;
                                    i29 = iZzo;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 8:
                                i31 = iZzj;
                                i32 = i60 == true ? 1 : 0;
                                if (i59 == 2) {
                                    if ((i61 & 536870912) != 0) {
                                        i54 |= i64;
                                        iZzh = zzev.zzg(bArr, i31, zzeuVar8);
                                    } else {
                                        iZzh = zzev.zzi(bArr, i31, zzeuVar8);
                                        int i67 = zzeuVar8.zza;
                                        if (i67 < 0) {
                                            throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i68 = i54 | i64;
                                        if (i67 == 0) {
                                            zzeuVar8.zzc = "";
                                        } else {
                                            zzeuVar8.zzc = new String(bArr, iZzh, i67, StandardCharsets.UTF_8);
                                            iZzh += i67;
                                        }
                                        i54 = i68;
                                    }
                                    unsafe5.putObject(obj3, j10, zzeuVar8.zzc);
                                    i11 = i11;
                                    i12 = i12;
                                    i52 = iZzo;
                                    i53 = i32;
                                    i55 = i55;
                                    i51 = i62;
                                } else {
                                    i28 = i32;
                                    i30 = i31;
                                    i29 = iZzo;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 9:
                                i33 = iZzo;
                                i34 = i60 == true ? 1 : 0;
                                this = this;
                                if (i59 == 2) {
                                    Object objZzw = this.zzw(obj3, i33);
                                    iZzh = zzev.zzn(objZzw, this.zzt(i33), bArr, iZzj, i11, zzeuVar);
                                    this.zzE(obj3, i33, objZzw);
                                    i11 = i11;
                                    i53 = i34 == true ? 1 : 0;
                                    i54 = i64 | i54;
                                    i52 = i33;
                                    i55 = i55;
                                    i51 = i62;
                                    i12 = i12;
                                } else {
                                    i28 = i34;
                                    i62 = i62;
                                    i30 = iZzj;
                                    i54 = i54;
                                    zzeuVar8 = zzeuVar8;
                                    i29 = i33;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 10:
                                i33 = iZzo;
                                i34 = i60 == true ? 1 : 0;
                                this = this;
                                if (i59 == 2) {
                                    i54 |= i64;
                                    iZzh = zzev.zza(bArr, iZzj, zzeuVar8);
                                    unsafe5.putObject(obj3, j10, zzeuVar8.zzc);
                                    i11 = i11;
                                    i12 = i12;
                                    i53 = i34;
                                    i55 = i55;
                                    i52 = i33;
                                    i51 = i62;
                                } else {
                                    i28 = i34;
                                    i62 = i62;
                                    i30 = iZzj;
                                    i54 = i54;
                                    zzeuVar8 = zzeuVar8;
                                    i29 = i33;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 12:
                                int i69 = iZzo;
                                i34 = i60 == true ? 1 : 0;
                                if (i59 == 0) {
                                    iZzh = zzev.zzi(bArr, iZzj, zzeuVar8);
                                    int i70 = zzeuVar8.zza;
                                    this = this;
                                    zzgj zzgjVarZzs = this.zzs(i69);
                                    if ((i61 & Integer.MIN_VALUE) == 0 || zzgjVarZzs == null || zzgjVarZzs.zza(i70)) {
                                        i33 = i69;
                                        i54 |= i64;
                                        unsafe5.putInt(obj3, j10, i70);
                                    } else {
                                        i33 = i69;
                                        zzd(obj).zzj(i34 == true ? 1 : 0, Long.valueOf(i70));
                                    }
                                    i11 = i11;
                                    i12 = i12;
                                    i53 = i34;
                                    i55 = i55;
                                    i52 = i33;
                                    i51 = i62;
                                } else {
                                    i28 = i34 == true ? 1 : 0;
                                    i62 = i62;
                                    i30 = iZzj;
                                    i54 = i54;
                                    zzeuVar8 = zzeuVar8;
                                    i29 = i69;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 15:
                                i35 = iZzo;
                                if (i59 == 0) {
                                    i54 |= i64;
                                    iZzh = zzev.zzi(bArr, iZzj, zzeuVar8);
                                    unsafe5.putInt(obj3, j10, zzfk.zzb(zzeuVar8.zza));
                                    i53 = i60 == true ? 1 : 0;
                                    i52 = i35;
                                    i55 = i55;
                                    i51 = i62;
                                    i11 = i11;
                                } else {
                                    i54 = i54;
                                    i28 = i60 == true ? 1 : 0;
                                    i29 = i35;
                                    i62 = i62;
                                    i30 = iZzj;
                                    zzeuVar8 = zzeuVar8;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            case 16:
                                if (i59 == 0) {
                                    int iZzl2 = zzev.zzl(bArr, iZzj, zzeuVar8);
                                    i35 = iZzo;
                                    unsafe5.putLong(obj, j10, zzfk.zzc(zzeuVar8.zzb));
                                    i54 |= i64;
                                    iZzh = iZzl2;
                                    i53 = i60 == true ? 1 : 0;
                                    i52 = i35;
                                    i55 = i55;
                                    i51 = i62;
                                    i11 = i11;
                                } else {
                                    i30 = iZzj;
                                    i28 = i60 == true ? 1 : 0;
                                    i29 = iZzo;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                            default:
                                i25 = iZzj;
                                i26 = iZzo;
                                r10 = 65535;
                                this = this;
                                if (i59 == 3) {
                                    Object objZzw2 = this.zzw(obj3, i26);
                                    int iZzm = zzev.zzm(objZzw2, this.zzt(i26), bArr, i25, i11, (i62 << 3) | 4, zzeuVar);
                                    this.zzE(obj3, i26, objZzw2);
                                    i12 = i12;
                                    zzeuVar8 = zzeuVar;
                                    unsafe5 = unsafe5;
                                    i51 = i62;
                                    i52 = i26;
                                    i11 = i11;
                                    iZzh = iZzm;
                                    i55 = i55;
                                    i53 = i60 == true ? 1 : 0;
                                    i54 |= i64;
                                } else {
                                    zzeuVar8 = zzeuVar8;
                                    i28 = i60 == true ? 1 : 0;
                                    i62 = i62;
                                    i54 = i54;
                                    i29 = i26;
                                    i30 = i25;
                                    i13 = i12;
                                    zzeuVar2 = zzeuVar8;
                                    i23 = i62;
                                    i21 = i29;
                                    i19 = i54;
                                    i20 = i30;
                                    i22 = i28;
                                    unsafe = unsafe5;
                                }
                                break;
                        }
                    } else {
                        int i71 = iZzj;
                        i55 = i55;
                        zzeu zzeuVar9 = zzeuVar8;
                        int i72 = i60 == true ? 1 : 0;
                        int i73 = i11;
                        Unsafe unsafe6 = unsafe5;
                        i19 = i54;
                        int i74 = iZzo;
                        if (iZzp != 27) {
                            i37 = i71;
                            int i75 = i62;
                            i21 = i74;
                            if (iZzp <= 49) {
                                long j11 = i61;
                                zzgl zzglVarZzd = (zzgl) unsafe6.getObject(obj3, j10);
                                if (!zzglVarZzd.zzc()) {
                                    int size = zzglVarZzd.size();
                                    zzglVarZzd = zzglVarZzd.zzd(size + size);
                                    unsafe6.putObject(obj3, j10, zzglVarZzd);
                                }
                                zzgl zzglVar = zzglVarZzd;
                                switch (iZzp) {
                                    case 18:
                                    case 35:
                                        zzeuVar9 = zzeuVar9;
                                        i75 = i75;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str2 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 != 2) {
                                            if (i59 == 1) {
                                                iZzh = i37 + 8;
                                                int i76 = zzev.zza;
                                                zzfq zzfqVar = (zzfq) zzglVar;
                                                zzfqVar.zzf(Double.longBitsToDouble(zzev.zzp(bArr, i37)));
                                                while (iZzh < i73) {
                                                    int iZzi2 = zzev.zzi(bArr, iZzh, zzeuVar9);
                                                    if (i39 == zzeuVar9.zza) {
                                                        zzfqVar.zzf(Double.longBitsToDouble(zzev.zzp(bArr, iZzi2)));
                                                        iZzh = iZzi2 + 8;
                                                    }
                                                }
                                            }
                                            str = str2;
                                            i21 = i40;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar10 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar10;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i77 = zzev.zza;
                                            zzfq zzfqVar2 = (zzfq) zzglVar;
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar9);
                                            int i78 = zzeuVar9.zza;
                                            if (i78 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i78 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i79 = iZzh + i78;
                                            zzfqVar2.zzg(zzfqVar2.size() + (i78 >> 3));
                                            while (iZzh < i79) {
                                                zzfqVar2.zzf(Double.longBitsToDouble(zzev.zzp(bArr, iZzh)));
                                                iZzh += 8;
                                            }
                                            if (iZzh != i79) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str2;
                                        i21 = i40;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar11 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar11;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        zzeuVar9 = zzeuVar9;
                                        i75 = i75;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str2 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 != 2) {
                                            if (i59 == 5) {
                                                iZzh = i37 + 4;
                                                int i80 = zzev.zza;
                                                zzga zzgaVar = (zzga) zzglVar;
                                                zzgaVar.zzf(Float.intBitsToFloat(zzev.zzb(bArr, i37)));
                                                while (iZzh < i73) {
                                                    int iZzi3 = zzev.zzi(bArr, iZzh, zzeuVar9);
                                                    if (i39 == zzeuVar9.zza) {
                                                        zzgaVar.zzf(Float.intBitsToFloat(zzev.zzb(bArr, iZzi3)));
                                                        iZzh = iZzi3 + 4;
                                                    }
                                                }
                                            }
                                            str = str2;
                                            i21 = i40;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar12 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar12;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i81 = zzev.zza;
                                            zzga zzgaVar2 = (zzga) zzglVar;
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar9);
                                            int i82 = zzeuVar9.zza;
                                            if (i82 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i82 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i83 = iZzh + i82;
                                            zzgaVar2.zzg(zzgaVar2.size() + (i82 >> 2));
                                            while (iZzh < i83) {
                                                zzgaVar2.zzf(Float.intBitsToFloat(zzev.zzb(bArr, iZzh)));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i83) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str2;
                                        i21 = i40;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar13 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar13;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        zzeuVar9 = zzeuVar9;
                                        i75 = i75;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str2 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 != 2) {
                                            if (i59 == 0) {
                                                int i84 = zzev.zza;
                                                zzha zzhaVar = (zzha) zzglVar;
                                                iZzh = zzev.zzl(bArr, i37, zzeuVar9);
                                                zzhaVar.zzf(zzeuVar9.zzb);
                                                while (iZzh < i73) {
                                                    int iZzi4 = zzev.zzi(bArr, iZzh, zzeuVar9);
                                                    if (i39 == zzeuVar9.zza) {
                                                        iZzh = zzev.zzl(bArr, iZzi4, zzeuVar9);
                                                        zzhaVar.zzf(zzeuVar9.zzb);
                                                    }
                                                }
                                            }
                                            str = str2;
                                            i21 = i40;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar14 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar14;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i85 = zzev.zza;
                                            zzha zzhaVar2 = (zzha) zzglVar;
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar9);
                                            int i86 = zzeuVar9.zza;
                                            if (i86 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i86 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i87 = i86 + iZzh;
                                            while (iZzh < i87) {
                                                iZzh = zzev.zzl(bArr, iZzh, zzeuVar9);
                                                zzhaVar2.zzf(zzeuVar9.zzb);
                                            }
                                            if (iZzh != i87) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str2;
                                        i21 = i40;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar15 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar15;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        zzeuVar4 = zzeuVar9;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        i73 = i73;
                                        i40 = i21;
                                        i41 = i75;
                                        if (i59 == 2) {
                                            iZzh = zzev.zzf(bArr, i37, zzglVar, zzeuVar4);
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            i75 = i41;
                                        } else if (i59 == 0) {
                                            i75 = i41;
                                            zzeuVar9 = zzeuVar4;
                                            iZzh = zzev.zzk(i39 == true ? 1 : 0, bArr, i37, i11, zzglVar, zzeuVar);
                                            i21 = i40;
                                        } else {
                                            zzeuVar9 = zzeuVar4;
                                            i75 = i41;
                                            i21 = i40;
                                            iZzh = i37;
                                        }
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar16 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar16;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        zzeuVar4 = zzeuVar9;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        String str6 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        i41 = i75;
                                        if (i59 != 2) {
                                            str = str6;
                                            if (i59 == 1) {
                                                iZzh = i37 + 8;
                                                int i88 = zzev.zza;
                                                zzha zzhaVar3 = (zzha) zzglVar;
                                                zzhaVar3.zzf(zzev.zzp(bArr, i37));
                                                while (iZzh < i73) {
                                                    int iZzi5 = zzev.zzi(bArr, iZzh, zzeuVar4);
                                                    if (i39 == zzeuVar4.zza) {
                                                        zzhaVar3.zzf(zzev.zzp(bArr, iZzi5));
                                                        iZzh = iZzi5 + 8;
                                                    }
                                                }
                                            }
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            i75 = i41;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar17 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar17;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i89 = zzev.zza;
                                            zzha zzhaVar4 = (zzha) zzglVar;
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar4);
                                            int i90 = zzeuVar4.zza;
                                            if (i90 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i90 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i91 = iZzh + i90;
                                            zzhaVar4.zzg(zzhaVar4.size() + (i90 >> 3));
                                            while (iZzh < i91) {
                                                zzhaVar4.zzf(zzev.zzp(bArr, iZzh));
                                                iZzh += 8;
                                                str6 = str6;
                                            }
                                            str = str6;
                                            if (iZzh != i91) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzeuVar9 = zzeuVar4;
                                        i21 = i40;
                                        i75 = i41;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar18 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar18;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        zzeuVar4 = zzeuVar9;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str3 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        i41 = i75;
                                        if (i59 != 2) {
                                            if (i59 == 5) {
                                                iZzh = i37 + 4;
                                                int i92 = zzev.zza;
                                                zzgh zzghVar = (zzgh) zzglVar;
                                                zzghVar.zzh(zzev.zzb(bArr, i37));
                                                while (iZzh < i73) {
                                                    int iZzi6 = zzev.zzi(bArr, iZzh, zzeuVar4);
                                                    if (i39 == zzeuVar4.zza) {
                                                        zzghVar.zzh(zzev.zzb(bArr, iZzi6));
                                                        iZzh = iZzi6 + 4;
                                                    }
                                                }
                                            }
                                            str = str3;
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            i75 = i41;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar19 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar19;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i93 = zzev.zza;
                                            zzgh zzghVar2 = (zzgh) zzglVar;
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar4);
                                            int i94 = zzeuVar4.zza;
                                            if (i94 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i94 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i95 = iZzh + i94;
                                            zzghVar2.zzi(zzghVar2.size() + (i94 >> 2));
                                            while (iZzh < i95) {
                                                zzghVar2.zzh(zzev.zzb(bArr, iZzh));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i95) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        zzeuVar9 = zzeuVar4;
                                        i21 = i40;
                                        i75 = i41;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar110 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar110;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        zzeuVar4 = zzeuVar9;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str3 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        i41 = i75;
                                        if (i59 != 2) {
                                            if (i59 == 0) {
                                                int i96 = zzev.zza;
                                                zzew zzewVar = (zzew) zzglVar;
                                                iZzh = zzev.zzl(bArr, i37, zzeuVar4);
                                                zzewVar.zze(zzeuVar4.zzb != 0);
                                                while (iZzh < i73) {
                                                    int iZzi7 = zzev.zzi(bArr, iZzh, zzeuVar4);
                                                    if (i39 == zzeuVar4.zza) {
                                                        iZzh = zzev.zzl(bArr, iZzi7, zzeuVar4);
                                                        zzewVar.zze(zzeuVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            str = str3;
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            i75 = i41;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar111 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar111;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i97 = zzev.zza;
                                            zzew zzewVar2 = (zzew) zzglVar;
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar4);
                                            int i98 = zzeuVar4.zza;
                                            if (i98 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i98 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i99 = i98 + iZzh;
                                            while (iZzh < i99) {
                                                int iZzl3 = zzev.zzl(bArr, iZzh, zzeuVar4);
                                                zzewVar2.zze(zzeuVar4.zzb != 0);
                                                iZzh = iZzl3;
                                            }
                                            if (iZzh != i99) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        str = str3;
                                        zzeuVar9 = zzeuVar4;
                                        i21 = i40;
                                        i75 = i41;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar112 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar112;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 26:
                                        zzeuVar4 = zzeuVar9;
                                        i41 = i75;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str3 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 != 2) {
                                            i75 = i41;
                                            str = str3;
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar113 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar113;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else if ((j11 & 536870912) != 0) {
                                            int iZzi8 = zzev.zzi(bArr, i37, zzeuVar4);
                                            int i100 = zzeuVar4.zza;
                                            if (i100 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i100 == 0) {
                                                zzglVar.add("");
                                            } else {
                                                int i101 = iZzi8 + i100;
                                                if (!zzix.zzb(bArr, iZzi8, i101)) {
                                                    throw new zzgs("Protocol message had invalid UTF-8.");
                                                }
                                                zzglVar.add(new String(bArr, iZzi8, i100, StandardCharsets.UTF_8));
                                                iZzi8 = i101;
                                            }
                                            while (iZzi8 < i73) {
                                                int iZzi9 = zzev.zzi(bArr, iZzi8, zzeuVar4);
                                                if (i39 != zzeuVar4.zza) {
                                                    iZzh = iZzi8;
                                                    str = str3;
                                                    zzeuVar9 = zzeuVar4;
                                                    i21 = i40;
                                                    i75 = i41;
                                                    if (iZzh != i37) {
                                                        i73 = i73;
                                                        i12 = i12;
                                                        i53 = i39;
                                                        i51 = i75;
                                                        i52 = i21;
                                                        i55 = i55;
                                                        i54 = i19;
                                                        unsafe5 = unsafe6;
                                                        obj3 = obj;
                                                        zzeu zzeuVar114 = zzeuVar9;
                                                        i11 = i73;
                                                        zzeuVar8 = zzeuVar114;
                                                    } else {
                                                        i73 = i73;
                                                        i13 = i12;
                                                        i20 = iZzh;
                                                        i22 = i39;
                                                        i23 = i75;
                                                        zzeuVar2 = zzeuVar9;
                                                        unsafe = unsafe6;
                                                        obj3 = obj;
                                                    }
                                                    break;
                                                } else {
                                                    iZzi8 = zzev.zzi(bArr, iZzi9, zzeuVar4);
                                                    int i102 = zzeuVar4.zza;
                                                    if (i102 < 0) {
                                                        throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i102 == 0) {
                                                        zzglVar.add("");
                                                    } else {
                                                        int i103 = iZzi8 + i102;
                                                        if (!zzix.zzb(bArr, iZzi8, i103)) {
                                                            throw new zzgs("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzglVar.add(new String(bArr, iZzi8, i102, StandardCharsets.UTF_8));
                                                        iZzi8 = i103;
                                                    }
                                                }
                                            }
                                            iZzh = iZzi8;
                                            str = str3;
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            i75 = i41;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar115 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar115;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int iZzi10 = zzev.zzi(bArr, i37, zzeuVar4);
                                            int i104 = zzeuVar4.zza;
                                            if (i104 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i104 == 0) {
                                                r11 = "";
                                                zzglVar.add(r11);
                                            } else {
                                                r11 = "";
                                                zzglVar.add(new String(bArr, iZzi10, i104, StandardCharsets.UTF_8));
                                                iZzi10 += i104;
                                            }
                                            while (iZzi10 < i73) {
                                                int iZzi11 = zzev.zzi(bArr, iZzi10, zzeuVar4);
                                                if (i39 != zzeuVar4.zza) {
                                                    i75 = i41;
                                                    iZzh = iZzi10;
                                                    str = str3;
                                                    zzeuVar9 = zzeuVar4;
                                                    i21 = i40;
                                                    if (iZzh != i37) {
                                                        i73 = i73;
                                                        i12 = i12;
                                                        i53 = i39;
                                                        i51 = i75;
                                                        i52 = i21;
                                                        i55 = i55;
                                                        i54 = i19;
                                                        unsafe5 = unsafe6;
                                                        obj3 = obj;
                                                        zzeu zzeuVar116 = zzeuVar9;
                                                        i11 = i73;
                                                        zzeuVar8 = zzeuVar116;
                                                    } else {
                                                        i73 = i73;
                                                        i13 = i12;
                                                        i20 = iZzh;
                                                        i22 = i39;
                                                        i23 = i75;
                                                        zzeuVar2 = zzeuVar9;
                                                        unsafe = unsafe6;
                                                        obj3 = obj;
                                                    }
                                                    break;
                                                } else {
                                                    iZzi10 = zzev.zzi(bArr, iZzi11, zzeuVar4);
                                                    int i105 = zzeuVar4.zza;
                                                    if (i105 < 0) {
                                                        throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i105 == 0) {
                                                        zzglVar.add(r11);
                                                    } else {
                                                        zzglVar.add(new String(bArr, iZzi10, i105, StandardCharsets.UTF_8));
                                                        iZzi10 += i105;
                                                    }
                                                }
                                            }
                                            i75 = i41;
                                            iZzh = iZzi10;
                                            str = str3;
                                            zzeuVar9 = zzeuVar4;
                                            i21 = i40;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar117 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar117;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        }
                                        break;
                                    case 27:
                                        zzeuVar5 = zzeuVar9;
                                        i42 = i72 == true ? 1 : 0;
                                        unsafe3 = unsafe6;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 == 2) {
                                            zzhw zzhwVarZzt = this.zzt(i40);
                                            unsafe6 = unsafe3;
                                            i39 = i42 == true ? 1 : 0;
                                            int iZze = zzev.zze(zzhwVarZzt, i42 == true ? 1 : 0, bArr, i37, i11, zzglVar, zzeuVar);
                                            zzeuVar9 = zzeuVar5;
                                            i21 = i40;
                                            i75 = i75;
                                            iZzh = iZze;
                                        } else {
                                            i39 = i42;
                                            unsafe6 = unsafe3;
                                            zzeuVar9 = zzeuVar5;
                                            i75 = i75;
                                            i21 = i40;
                                            iZzh = i37;
                                        }
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar118 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar118;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 28:
                                        zzeuVar5 = zzeuVar9;
                                        i42 = i72 == true ? 1 : 0;
                                        unsafe3 = unsafe6;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 == 2) {
                                            iZzh = zzev.zzi(bArr, i37, zzeuVar5);
                                            int i106 = zzeuVar5.zza;
                                            if (i106 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i106 > bArr.length - iZzh) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i106 == 0) {
                                                zzglVar.add(zzfg.zza);
                                            } else {
                                                zzglVar.add(zzfg.zzk(bArr, iZzh, i106));
                                                iZzh += i106;
                                            }
                                            while (iZzh < i73) {
                                                int iZzi12 = zzev.zzi(bArr, iZzh, zzeuVar5);
                                                if (i42 != zzeuVar5.zza) {
                                                    i39 = i42 == true ? 1 : 0;
                                                    unsafe6 = unsafe3;
                                                    zzeuVar9 = zzeuVar5;
                                                    i75 = i75;
                                                    i21 = i40;
                                                    if (iZzh != i37) {
                                                        i73 = i73;
                                                        i12 = i12;
                                                        i53 = i39;
                                                        i51 = i75;
                                                        i52 = i21;
                                                        i55 = i55;
                                                        i54 = i19;
                                                        unsafe5 = unsafe6;
                                                        obj3 = obj;
                                                        zzeu zzeuVar119 = zzeuVar9;
                                                        i11 = i73;
                                                        zzeuVar8 = zzeuVar119;
                                                    } else {
                                                        i73 = i73;
                                                        i13 = i12;
                                                        i20 = iZzh;
                                                        i22 = i39;
                                                        i23 = i75;
                                                        zzeuVar2 = zzeuVar9;
                                                        unsafe = unsafe6;
                                                        obj3 = obj;
                                                    }
                                                    break;
                                                } else {
                                                    iZzh = zzev.zzi(bArr, iZzi12, zzeuVar5);
                                                    int i107 = zzeuVar5.zza;
                                                    if (i107 < 0) {
                                                        throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i107 > bArr.length - iZzh) {
                                                        throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i107 == 0) {
                                                        zzglVar.add(zzfg.zza);
                                                    } else {
                                                        zzglVar.add(zzfg.zzk(bArr, iZzh, i107));
                                                        iZzh += i107;
                                                    }
                                                }
                                            }
                                            i39 = i42 == true ? 1 : 0;
                                            unsafe6 = unsafe3;
                                            zzeuVar9 = zzeuVar5;
                                            i75 = i75;
                                            i21 = i40;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar1110 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar1110;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        }
                                        i39 = i42;
                                        unsafe6 = unsafe3;
                                        zzeuVar9 = zzeuVar5;
                                        i75 = i75;
                                        i21 = i40;
                                        iZzh = i37;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar1111 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar1111;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i43 = i72 == true ? 1 : 0;
                                        if (i59 != 2) {
                                            if (i59 == 0) {
                                                iZzk = zzev.zzk(i43 == true ? 1 : 0, bArr, i37, i11, zzglVar, zzeuVar);
                                            }
                                            i39 = i43;
                                            i73 = i73;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar1112 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar1112;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            iZzk = zzev.zzf(bArr, i37, zzglVar, zzeuVar9);
                                        }
                                        zzgj zzgjVarZzs2 = this.zzs(i21);
                                        zzil zzilVar = this.zzl;
                                        int i108 = zzhx.zza;
                                        if (zzgjVarZzs2 == null) {
                                            i44 = iZzk;
                                            i45 = i21;
                                        } else if (zzglVar instanceof RandomAccess) {
                                            int size2 = zzglVar.size();
                                            i44 = iZzk;
                                            Object objZzn = null;
                                            int i109 = 0;
                                            int i110 = 0;
                                            while (i109 < size2) {
                                                int i111 = i21;
                                                int iIntValue = ((Integer) zzglVar.get(i109)).intValue();
                                                if (zzgjVarZzs2.zza(iIntValue)) {
                                                    if (i109 != i110) {
                                                        zzglVar.set(i110, Integer.valueOf(iIntValue));
                                                    }
                                                    i110++;
                                                } else {
                                                    objZzn = zzhx.zzn(obj3, i75, iIntValue, objZzn, zzilVar);
                                                }
                                                i109++;
                                                i21 = i111;
                                            }
                                            i45 = i21;
                                            if (i110 != size2) {
                                                zzglVar.subList(i110, size2).clear();
                                            }
                                        } else {
                                            i44 = iZzk;
                                            i45 = i21;
                                            Iterator it = zzglVar.iterator();
                                            Object objZzn2 = null;
                                            while (it.hasNext()) {
                                                int iIntValue2 = ((Integer) it.next()).intValue();
                                                if (!zzgjVarZzs2.zza(iIntValue2)) {
                                                    objZzn2 = zzhx.zzn(obj3, i75, iIntValue2, objZzn2, zzilVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        iZzh = i44;
                                        i39 = i43 == true ? 1 : 0;
                                        unsafe6 = unsafe6;
                                        zzeuVar9 = zzeuVar9;
                                        i75 = i75;
                                        i21 = i45;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar1113 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar1113;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i43 = i72 == true ? 1 : 0;
                                        if (i59 != 2) {
                                            if (i59 == 0) {
                                                int i112 = zzev.zza;
                                                zzgh zzghVar3 = (zzgh) zzglVar;
                                                iZzi = zzev.zzi(bArr, i37, zzeuVar9);
                                                zzghVar3.zzh(zzfk.zzb(zzeuVar9.zza));
                                                while (iZzi < i73) {
                                                    int iZzi13 = zzev.zzi(bArr, iZzi, zzeuVar9);
                                                    if (i43 == zzeuVar9.zza) {
                                                        iZzi = zzev.zzi(bArr, iZzi13, zzeuVar9);
                                                        zzghVar3.zzh(zzfk.zzb(zzeuVar9.zza));
                                                    } else {
                                                        i39 = i43;
                                                        iZzh = iZzi;
                                                    }
                                                }
                                                i39 = i43;
                                                iZzh = iZzi;
                                            }
                                            i39 = i43;
                                            i73 = i73;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar1114 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar1114;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i113 = zzev.zza;
                                            zzgh zzghVar4 = (zzgh) zzglVar;
                                            int iZzi14 = zzev.zzi(bArr, i37, zzeuVar9);
                                            int i114 = zzeuVar9.zza;
                                            if (i114 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i114 > bArr.length - iZzi14) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i115 = i114 + iZzi14;
                                            while (iZzi14 < i115) {
                                                iZzi14 = zzev.zzi(bArr, iZzi14, zzeuVar9);
                                                zzghVar4.zzh(zzfk.zzb(zzeuVar9.zza));
                                            }
                                            if (iZzi14 != i115) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i39 = i43 == true ? 1 : 0;
                                            iZzh = iZzi14;
                                        }
                                        i73 = i73;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar1115 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar1115;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i59 == 2) {
                                            int i116 = zzev.zza;
                                            zzha zzhaVar5 = (zzha) zzglVar;
                                            int iZzi15 = zzev.zzi(bArr, i37, zzeuVar9);
                                            int i117 = zzeuVar9.zza;
                                            if (i117 < 0) {
                                                throw new zzgs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i117 > bArr.length - iZzi15) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i118 = i117 + iZzi15;
                                            while (iZzi15 < i118) {
                                                int iZzl4 = zzev.zzl(bArr, iZzi15, zzeuVar9);
                                                zzhaVar5.zzf(zzfk.zzc(zzeuVar9.zzb));
                                                iZzi15 = iZzl4;
                                            }
                                            if (iZzi15 != i118) {
                                                throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzh = iZzi15;
                                            i39 = i72 == true ? 1 : 0;
                                        } else if (i59 != 0) {
                                            i39 = i72 == true ? 1 : 0;
                                            i73 = i73;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                i73 = i73;
                                                i12 = i12;
                                                i53 = i39;
                                                i51 = i75;
                                                i52 = i21;
                                                i55 = i55;
                                                i54 = i19;
                                                unsafe5 = unsafe6;
                                                obj3 = obj;
                                                zzeu zzeuVar1116 = zzeuVar9;
                                                i11 = i73;
                                                zzeuVar8 = zzeuVar1116;
                                            } else {
                                                i73 = i73;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i22 = i39;
                                                i23 = i75;
                                                zzeuVar2 = zzeuVar9;
                                                unsafe = unsafe6;
                                                obj3 = obj;
                                            }
                                        } else {
                                            int i119 = zzev.zza;
                                            zzha zzhaVar6 = (zzha) zzglVar;
                                            iZzi = zzev.zzl(bArr, i37, zzeuVar9);
                                            zzhaVar6.zzf(zzfk.zzc(zzeuVar9.zzb));
                                            while (true) {
                                                if (iZzi < i73) {
                                                    int iZzi16 = zzev.zzi(bArr, iZzi, zzeuVar9);
                                                    i43 = i72;
                                                    if (i43 == zzeuVar9.zza) {
                                                        iZzi = zzev.zzl(bArr, iZzi16, zzeuVar9);
                                                        zzhaVar6.zzf(zzfk.zzc(zzeuVar9.zzb));
                                                        i72 = i43 == true ? 1 : 0;
                                                    }
                                                } else {
                                                    i43 = i72;
                                                }
                                            }
                                            i39 = i43;
                                            iZzh = iZzi;
                                        }
                                        i73 = i73;
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar1117 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar1117;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                    default:
                                        zzeuVar9 = zzeuVar9;
                                        i75 = i75;
                                        unsafe6 = unsafe6;
                                        i39 = i72 == true ? 1 : 0;
                                        str2 = str;
                                        i73 = i73;
                                        i40 = i21;
                                        if (i59 == 3) {
                                            int i120 = ((i39 == true ? 1 : 0) & (-8)) | 4;
                                            zzhw zzhwVarZzt2 = this.zzt(i40);
                                            str = str2;
                                            i21 = i40;
                                            iZzh = zzev.zzc(zzhwVarZzt2, bArr, i37, i11, i120, zzeuVar);
                                            zzglVar.add(zzeuVar9.zzc);
                                            while (iZzh < i73) {
                                                int iZzi17 = zzev.zzi(bArr, iZzh, zzeuVar9);
                                                if (i39 == zzeuVar9.zza) {
                                                    iZzh = zzev.zzc(zzhwVarZzt2, bArr, iZzi17, i11, i120, zzeuVar);
                                                    zzglVar.add(zzeuVar9.zzc);
                                                }
                                            }
                                        } else {
                                            str = str2;
                                            i21 = i40;
                                            iZzh = i37;
                                        }
                                        if (iZzh != i37) {
                                            i73 = i73;
                                            i12 = i12;
                                            i53 = i39;
                                            i51 = i75;
                                            i52 = i21;
                                            i55 = i55;
                                            i54 = i19;
                                            unsafe5 = unsafe6;
                                            obj3 = obj;
                                            zzeu zzeuVar1118 = zzeuVar9;
                                            i11 = i73;
                                            zzeuVar8 = zzeuVar1118;
                                        } else {
                                            i73 = i73;
                                            i13 = i12;
                                            i20 = iZzh;
                                            i22 = i39;
                                            i23 = i75;
                                            zzeuVar2 = zzeuVar9;
                                            unsafe = unsafe6;
                                            obj3 = obj;
                                        }
                                        break;
                                }
                            } else {
                                unsafe2 = unsafe6;
                                zzeu zzeuVar20 = zzeuVar9;
                                int i121 = i75;
                                i21 = i21;
                                if (iZzp != 50) {
                                    unsafe = unsafe2;
                                    int i122 = i21;
                                    long j12 = iArr[i21 + 2] & 1048575;
                                    switch (iZzp) {
                                        case 51:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 1) {
                                                iZzh = i37 + 8;
                                                unsafe.putObject(obj3, j10, Double.valueOf(Double.longBitsToDouble(zzev.zzp(bArr, i37))));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 52:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 5) {
                                                iZzh = i37 + 4;
                                                unsafe.putObject(obj3, j10, Float.valueOf(Float.intBitsToFloat(zzev.zzb(bArr, i37))));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 0) {
                                                iZzh = zzev.zzl(bArr, i37, zzeuVar2);
                                                unsafe.putObject(obj3, j10, Long.valueOf(zzeuVar2.zzb));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 0) {
                                                iZzh = zzev.zzi(bArr, i37, zzeuVar2);
                                                unsafe.putObject(obj3, j10, Integer.valueOf(zzeuVar2.zza));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 1) {
                                                iZzh = i37 + 8;
                                                unsafe.putObject(obj3, j10, Long.valueOf(zzev.zzp(bArr, i37)));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 5) {
                                                iZzh = i37 + 4;
                                                unsafe.putObject(obj3, j10, Integer.valueOf(zzev.zzb(bArr, i37)));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 58:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 0) {
                                                iZzh = zzev.zzl(bArr, i37, zzeuVar2);
                                                unsafe.putObject(obj3, j10, Boolean.valueOf(zzeuVar2.zzb != 0));
                                                unsafe.putInt(obj3, j12, i23);
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 59:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 2) {
                                                int iZzi18 = zzev.zzi(bArr, i37, zzeuVar2);
                                                int i123 = zzeuVar2.zza;
                                                if (i123 == 0) {
                                                    unsafe.putObject(obj3, j10, "");
                                                } else {
                                                    int i124 = i61 & 536870912;
                                                    int i125 = iZzi18 + i123;
                                                    if (i124 != 0 && !zzix.zzb(bArr, iZzi18, i125)) {
                                                        throw new zzgs("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe.putObject(obj3, j10, new String(bArr, iZzi18, i123, StandardCharsets.UTF_8));
                                                    iZzi18 = i125;
                                                }
                                                unsafe.putInt(obj3, j12, i23);
                                                iZzh = iZzi18;
                                            } else {
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 60:
                                            zzeuVar7 = zzeuVar20;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 2) {
                                                Object objZzx = zzx(obj3, i121, i122);
                                                unsafe = unsafe;
                                                iZzh = zzev.zzn(objZzx, zzt(i122), bArr, i37, i11, zzeuVar);
                                                zzF(obj3, i121, i122, objZzx);
                                                zzeuVar2 = zzeuVar7;
                                                i50 = i22 == true ? 1 : 0;
                                                i23 = i121;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i23 = i121;
                                                zzeuVar2 = zzeuVar7;
                                                iZzh = i37;
                                            }
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 61:
                                            str5 = str;
                                            zzeuVar7 = zzeuVar20;
                                            i48 = i122;
                                            i49 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 2) {
                                                iZza = zzev.zza(bArr, i37, zzeuVar7);
                                                unsafe.putObject(obj3, j10, zzeuVar7.zzc);
                                                unsafe.putInt(obj3, j12, i49);
                                                i122 = i48;
                                                i23 = i49;
                                                iZzh = iZza;
                                                str = str5;
                                                unsafe = unsafe;
                                                zzeuVar2 = zzeuVar7;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            }
                                            i122 = i48;
                                            i23 = i49;
                                            str = str5;
                                            zzeuVar2 = zzeuVar7;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 63:
                                            str5 = str;
                                            zzeuVar7 = zzeuVar20;
                                            i48 = i122;
                                            i49 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 0) {
                                                int iZzi19 = zzev.zzi(bArr, i37, zzeuVar7);
                                                int i126 = zzeuVar7.zza;
                                                zzgj zzgjVarZzs3 = zzs(i48);
                                                if (zzgjVarZzs3 == null || zzgjVarZzs3.zza(i126)) {
                                                    unsafe.putObject(obj3, j10, Integer.valueOf(i126));
                                                    unsafe.putInt(obj3, j12, i49);
                                                } else {
                                                    zzd(obj).zzj(i22 == true ? 1 : 0, Long.valueOf(i126));
                                                }
                                                i122 = i48;
                                                i23 = i49;
                                                str = str5;
                                                iZzh = iZzi19;
                                                unsafe = unsafe;
                                                zzeuVar2 = zzeuVar7;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            }
                                            i122 = i48;
                                            i23 = i49;
                                            str = str5;
                                            zzeuVar2 = zzeuVar7;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                        case 66:
                                            str5 = str;
                                            zzeuVar7 = zzeuVar20;
                                            i48 = i122;
                                            i49 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 0) {
                                                i37 = i37;
                                                iZza = zzev.zzi(bArr, i37, zzeuVar7);
                                                unsafe.putObject(obj3, j10, Integer.valueOf(zzfk.zzb(zzeuVar7.zza)));
                                                unsafe.putInt(obj3, j12, i49);
                                                i122 = i48;
                                                i23 = i49;
                                                iZzh = iZza;
                                                str = str5;
                                                unsafe = unsafe;
                                                zzeuVar2 = zzeuVar7;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            } else {
                                                i37 = i37;
                                                i122 = i48;
                                                i23 = i49;
                                                str = str5;
                                                zzeuVar2 = zzeuVar7;
                                                iZzh = i37;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            }
                                            break;
                                        case 67:
                                            zzeuVar7 = zzeuVar20;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            if (i59 == 0) {
                                                int iZzl5 = zzev.zzl(bArr, i37, zzeuVar7);
                                                unsafe.putObject(obj3, j10, Long.valueOf(zzfk.zzc(zzeuVar7.zzb)));
                                                unsafe.putInt(obj3, j12, i121);
                                                i122 = i122;
                                                i23 = i121;
                                                iZzh = iZzl5;
                                                str = str;
                                                i37 = i37;
                                                unsafe = unsafe;
                                                zzeuVar2 = zzeuVar7;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            } else {
                                                i122 = i122;
                                                i23 = i121;
                                                str = str;
                                                i37 = i37;
                                                zzeuVar2 = zzeuVar7;
                                                iZzh = i37;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i59 == 3) {
                                                i22 = i72 == true ? 1 : 0;
                                                int i127 = ((i22 == true ? 1 : 0) & (-8)) | 4;
                                                zzeuVar7 = zzeuVar20;
                                                obj3 = obj;
                                                Object objZzx2 = zzx(obj3, i121, i122);
                                                str = str;
                                                int iZzm2 = zzev.zzm(objZzx2, zzt(i122), bArr, i37, i11, i127, zzeuVar);
                                                zzF(obj3, i121, i122, objZzx2);
                                                i23 = i121;
                                                iZzh = iZzm2;
                                                unsafe = unsafe;
                                                zzeuVar2 = zzeuVar7;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            } else {
                                                str = str;
                                                zzeuVar7 = zzeuVar20;
                                                obj3 = obj;
                                                i23 = i121;
                                                i22 = i72 == true ? 1 : 0;
                                                zzeuVar2 = zzeuVar7;
                                                iZzh = i37;
                                                if (iZzh != i37) {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    this = this;
                                                    i11 = i11;
                                                    i12 = i12;
                                                    i53 = i22 == true ? 1 : 0;
                                                    unsafe5 = unsafe;
                                                    i51 = i23;
                                                    i52 = i122;
                                                    i54 = i19;
                                                    zzeuVar8 = zzeuVar2;
                                                    i55 = i55;
                                                } else {
                                                    str = str;
                                                    i122 = i122;
                                                    i22 = i50;
                                                    i13 = i12;
                                                    i20 = iZzh;
                                                    i21 = i122;
                                                }
                                            }
                                            break;
                                        default:
                                            unsafe = unsafe;
                                            str = str;
                                            zzeuVar2 = zzeuVar20;
                                            i23 = i121;
                                            i22 = i72 == true ? 1 : 0;
                                            obj3 = obj;
                                            iZzh = i37;
                                            if (iZzh != i37) {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                this = this;
                                                i11 = i11;
                                                i12 = i12;
                                                i53 = i22 == true ? 1 : 0;
                                                unsafe5 = unsafe;
                                                i51 = i23;
                                                i52 = i122;
                                                i54 = i19;
                                                zzeuVar8 = zzeuVar2;
                                                i55 = i55;
                                            } else {
                                                str = str;
                                                i122 = i122;
                                                i22 = i50;
                                                i13 = i12;
                                                i20 = iZzh;
                                                i21 = i122;
                                            }
                                            break;
                                    }
                                } else if (i59 == 2) {
                                    Object objZzv = this.zzv(i21);
                                    int i128 = i72 == true ? 1 : 0;
                                    Unsafe unsafe7 = unsafe2;
                                    Object object = unsafe7.getObject(obj, j10);
                                    if (!((zzhg) object).zze()) {
                                        zzhg zzhgVarZzb = zzhg.zza().zzb();
                                        zzhh.zza(zzhgVarZzb, object);
                                        unsafe7.putObject(obj, j10, zzhgVarZzb);
                                        object = zzhgVarZzb;
                                    }
                                    zzhe zzheVarZzc = ((zzhf) objZzv).zzc();
                                    zzhg zzhgVar = (zzhg) object;
                                    int iZzi20 = zzev.zzi(bArr, i37, zzeuVar20);
                                    int i129 = zzeuVar20.zza;
                                    if (i129 < 0 || i129 > i73 - iZzi20) {
                                        throw new zzgs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                    }
                                    int i130 = iZzi20 + i129;
                                    Object obj4 = zzheVarZzc.zzb;
                                    Object obj5 = zzheVarZzc.zzd;
                                    Object obj6 = obj4;
                                    Object obj7 = obj5;
                                    while (iZzi20 < i130) {
                                        Object obj8 = obj7;
                                        int iZzj2 = iZzi20 + 1;
                                        int i131 = bArr[iZzi20];
                                        if (i131 < 0) {
                                            iZzj2 = zzev.zzj(i131, bArr, iZzj2, zzeuVar20);
                                            i131 = zzeuVar20.zza;
                                        }
                                        Object obj9 = obj6;
                                        int i132 = i131 >>> 3;
                                        int i133 = i128;
                                        int i134 = i131 & 7;
                                        if (i132 != 1) {
                                            if (i132 == 2) {
                                                zzjb zzjbVar = zzheVarZzc.zzc;
                                                if (i134 == zzjbVar.zza()) {
                                                    Class<?> cls = obj5.getClass();
                                                    i46 = i133 == true ? 1 : 0;
                                                    iZzi20 = zzO(bArr, iZzj2, i11, zzjbVar, cls, zzeuVar);
                                                    obj7 = zzeuVar.zzc;
                                                    str = str;
                                                    zzeuVar20 = zzeuVar;
                                                    obj6 = obj9;
                                                    obj5 = obj5;
                                                    unsafe7 = unsafe7;
                                                }
                                                i128 = i46;
                                            }
                                            zzeuVar6 = zzeuVar;
                                            unsafe4 = unsafe7;
                                            str4 = str;
                                            i46 = i133 == true ? 1 : 0;
                                            i47 = i121;
                                            obj2 = obj5;
                                        } else {
                                            zzeuVar6 = zzeuVar;
                                            unsafe4 = unsafe7;
                                            str4 = str;
                                            i46 = i133 == true ? 1 : 0;
                                            i47 = i121;
                                            obj2 = obj5;
                                            zzjb zzjbVar2 = zzheVarZzc.zza;
                                            if (i134 == zzjbVar2.zza()) {
                                                iZzi20 = zzO(bArr, iZzj2, i11, zzjbVar2, null, zzeuVar);
                                                obj6 = zzeuVar6.zzc;
                                                str = str4;
                                                zzeuVar20 = zzeuVar6;
                                                obj7 = obj8;
                                            }
                                            obj5 = obj2;
                                            unsafe7 = unsafe4;
                                            i121 = i47;
                                            i128 = i46;
                                        }
                                        iZzi20 = zzev.zzo(i131, bArr, iZzj2, i73, zzeuVar6);
                                        obj7 = obj8;
                                        str = str4;
                                        zzeuVar20 = zzeuVar6;
                                        obj6 = obj9;
                                        obj5 = obj2;
                                        unsafe7 = unsafe4;
                                        i121 = i47;
                                        i128 = i46;
                                    }
                                    Object obj10 = obj7;
                                    i36 = i128;
                                    zzeu zzeuVar21 = zzeuVar20;
                                    unsafe2 = unsafe7;
                                    String str7 = str;
                                    i38 = i121;
                                    Object obj11 = obj6;
                                    if (iZzi20 != i130) {
                                        throw new zzgs(str7);
                                    }
                                    zzhgVar.put(obj11, obj10);
                                    if (i130 != i37) {
                                        this = this;
                                        i12 = i12;
                                        iZzh = i130;
                                        i52 = i21;
                                        i11 = i73;
                                        i55 = i55;
                                        i54 = i19;
                                        unsafe5 = unsafe2;
                                        i51 = i38;
                                        i53 = i36 == true ? 1 : 0;
                                        zzeuVar8 = zzeuVar21;
                                        obj3 = obj;
                                    } else {
                                        str = str7;
                                        zzeuVar2 = zzeuVar21;
                                        i20 = i130;
                                        unsafe = unsafe2;
                                        i23 = i38;
                                        i22 = i36;
                                        obj3 = obj;
                                        i13 = i12;
                                    }
                                } else {
                                    i36 = i72 == true ? 1 : 0;
                                    i38 = i121;
                                    zzeuVar3 = zzeuVar20;
                                    str = str;
                                    zzeuVar2 = zzeuVar3;
                                    i20 = i37;
                                    unsafe = unsafe2;
                                    i23 = i38;
                                    i22 = i36;
                                    obj3 = obj;
                                    i13 = i12;
                                }
                            }
                        } else if (i59 == 2) {
                            zzgl zzglVarZzd2 = (zzgl) unsafe6.getObject(obj3, j10);
                            if (!zzglVarZzd2.zzc()) {
                                int size3 = zzglVarZzd2.size();
                                zzglVarZzd2 = zzglVarZzd2.zzd(size3 == 0 ? 10 : size3 + size3);
                                unsafe6.putObject(obj3, j10, zzglVarZzd2);
                            }
                            zzgl zzglVar2 = zzglVarZzd2;
                            i51 = i62;
                            int iZze2 = zzev.zze(this.zzt(i74), i72 == true ? 1 : 0, bArr, i71, i11, zzglVar2, zzeuVar);
                            i12 = i12;
                            zzeuVar8 = zzeuVar9;
                            unsafe5 = unsafe6;
                            iZzh = iZze2;
                            i52 = i74;
                            i11 = i73;
                            i55 = i55;
                            i53 = i72 == true ? 1 : 0;
                            i54 = i19;
                        } else {
                            zzeuVar3 = zzeuVar9;
                            i21 = i74;
                            unsafe2 = unsafe6;
                            i36 = i72 == true ? 1 : 0;
                            i37 = i71;
                            i38 = i62;
                            str = str;
                            zzeuVar2 = zzeuVar3;
                            i20 = i37;
                            unsafe = unsafe2;
                            i23 = i38;
                            i22 = i36;
                            obj3 = obj;
                            i13 = i12;
                        }
                    }
                } else {
                    int i135 = i18;
                    i19 = i54;
                    i55 = i55;
                    str = "Failed to parse the message.";
                    unsafe = unsafe5;
                    zzeuVar2 = zzeuVar8;
                    i13 = i12;
                    i20 = iZzj;
                    i21 = i135;
                    i22 = i17;
                    i23 = i58;
                }
                if (i22 != i13 || i13 == 0) {
                    if (this.zzh) {
                        zzft zzftVar = zzeuVar2.zzd;
                        int i136 = zzft.zzb;
                        int i137 = zzet.zza;
                        if (zzftVar != zzft.zza) {
                            zzhm zzhmVar = this.zzg;
                            int i138 = zzev.zza;
                            if (zzftVar.zza(zzhmVar, i23) != null) {
                                throw null;
                            }
                            i24 = i22;
                            iZzh = zzev.zzh(i22 == true ? 1 : 0, bArr, i20, i11, zzd(obj), zzeuVar);
                        } else {
                            i24 = i22;
                            iZzh = zzev.zzh(i24 == true ? 1 : 0, bArr, i20, i11, zzd(obj), zzeuVar);
                        }
                    } else {
                        i24 = i22;
                        iZzh = zzev.zzh(i24 == true ? 1 : 0, bArr, i20, i11, zzd(obj), zzeuVar);
                    }
                    i11 = i11;
                    unsafe5 = unsafe;
                    i52 = i21;
                    i51 = i23;
                    i53 = i24;
                    i55 = i55;
                    i54 = i19;
                    zzeuVar8 = zzeuVar;
                    i12 = i13;
                    this = this;
                } else {
                    i16 = 1048575;
                    zzhpVar = this;
                    i14 = i20;
                    i15 = i22;
                    i55 = i55;
                    i54 = i19;
                }
            } else {
                zzhpVar = this;
                str = "Failed to parse the message.";
                unsafe = unsafe5;
                i13 = i12;
                i14 = iZzh;
                i15 = i53;
                i16 = 1048575;
            }
        }
        if (i55 != i16) {
            unsafe.putInt(obj3, i55, i54);
        }
        zzim zzimVar = null;
        for (int i139 = zzhpVar.zzj; i139 < zzhpVar.zzk; i139++) {
            zzimVar = (zzim) zzu(obj, zzhpVar.zzi[i139], zzimVar, zzhpVar.zzl, obj);
        }
        if (zzimVar != null) {
            ((zzgg) obj3).zzc = zzimVar;
        }
        if (i13 != 0) {
            String str8 = str;
            if (i14 > i11 || i15 != i13) {
                throw new zzgs(str8);
            }
        } else if (i14 != i11) {
            throw new zzgs(str);
        }
        return i14;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final Object zze() {
        return ((zzgg) this.zzg).zzs();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzf(Object obj) {
        if (zzK(obj)) {
            if (obj instanceof zzgg) {
                zzgg zzggVar = (zzgg) obj;
                zzggVar.zzC(Integer.MAX_VALUE);
                zzggVar.zza = 0;
                zzggVar.zzA();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzq = zzq(i10);
                int i11 = 1048575 & iZzq;
                int iZzp = zzp(iZzq);
                long j10 = i11;
                if (iZzp != 9) {
                    if (iZzp != 60 && iZzp != 68) {
                        switch (iZzp) {
                            case 17:
                                if (zzH(obj, i10)) {
                                    zzt(i10).zzf(zzb.getObject(obj, j10));
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
                                ((zzgl) zzis.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzhg) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i10], i10)) {
                        zzt(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzH(obj, i10)) {
                    zzt(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzg(Object obj, Object obj2) {
        zzz(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzhx.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzhx.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzq = zzq(i10);
            int i11 = 1048575 & iZzq;
            int iZzp = zzp(iZzq);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzp) {
                case 0:
                    if (zzH(obj2, i10)) {
                        zzis.zzo(obj, j10, zzis.zza(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 1:
                    if (zzH(obj2, i10)) {
                        zzis.zzp(obj, j10, zzis.zzb(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 2:
                    if (zzH(obj2, i10)) {
                        zzis.zzr(obj, j10, zzis.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 3:
                    if (zzH(obj2, i10)) {
                        zzis.zzr(obj, j10, zzis.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 4:
                    if (zzH(obj2, i10)) {
                        zzis.zzq(obj, j10, zzis.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 5:
                    if (zzH(obj2, i10)) {
                        zzis.zzr(obj, j10, zzis.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 6:
                    if (zzH(obj2, i10)) {
                        zzis.zzq(obj, j10, zzis.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 7:
                    if (zzH(obj2, i10)) {
                        zzis.zzm(obj, j10, zzis.zzw(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 8:
                    if (zzH(obj2, i10)) {
                        zzis.zzs(obj, j10, zzis.zzf(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 9:
                    zzA(obj, obj2, i10);
                    break;
                case 10:
                    if (zzH(obj2, i10)) {
                        zzis.zzs(obj, j10, zzis.zzf(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 11:
                    if (zzH(obj2, i10)) {
                        zzis.zzq(obj, j10, zzis.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 12:
                    if (zzH(obj2, i10)) {
                        zzis.zzq(obj, j10, zzis.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 13:
                    if (zzH(obj2, i10)) {
                        zzis.zzq(obj, j10, zzis.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 14:
                    if (zzH(obj2, i10)) {
                        zzis.zzr(obj, j10, zzis.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 15:
                    if (zzH(obj2, i10)) {
                        zzis.zzq(obj, j10, zzis.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 16:
                    if (zzH(obj2, i10)) {
                        zzis.zzr(obj, j10, zzis.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 17:
                    zzA(obj, obj2, i10);
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
                    zzgl zzglVarZzd = (zzgl) zzis.zzf(obj, j10);
                    zzgl zzglVar = (zzgl) zzis.zzf(obj2, j10);
                    int size = zzglVarZzd.size();
                    int size2 = zzglVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzglVarZzd.zzc()) {
                            zzglVarZzd = zzglVarZzd.zzd(size2 + size);
                        }
                        zzglVarZzd.addAll(zzglVar);
                    }
                    if (size > 0) {
                        zzglVar = zzglVarZzd;
                    }
                    zzis.zzs(obj, j10, zzglVar);
                    break;
                case 50:
                    int i13 = zzhx.zza;
                    zzis.zzs(obj, j10, zzhh.zza(zzis.zzf(obj, j10), zzis.zzf(obj2, j10)));
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
                        zzis.zzs(obj, j10, zzis.zzf(obj2, j10));
                        zzD(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzB(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i12, i10)) {
                        zzis.zzs(obj, j10, zzis.zzf(obj2, j10));
                        zzD(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzB(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzeu zzeuVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzeuVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final void zzi(Object obj, zzjd zzjdVar) throws IOException {
        Map.Entry entry;
        int i10;
        int i11;
        int i12;
        Map.Entry entry2;
        if (this.zzh) {
            zzfy zzfyVar = ((zzgd) obj).zzb;
            if (zzfyVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzfyVar.zzf().next();
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
            int iZzq = zzq(i16);
            int iZzp = zzp(iZzq);
            int i17 = iArr[i16];
            if (iZzp <= 17) {
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
            long j10 = iZzq & i13;
            switch (iZzp) {
                case 0:
                    entry2 = entry;
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzf(i17, zzis.zza(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzo(i17, zzis.zzb(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzt(i17, unsafe.getLong(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzL(i17, unsafe.getLong(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzr(i17, unsafe.getInt(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzm(i17, unsafe.getLong(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzk(i17, unsafe.getInt(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzb(i17, zzis.zzw(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzP(i17, unsafe.getObject(obj, j10), zzjdVar);
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzw(i17, unsafe.getObject(obj, j10), zzt(i16));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzd(i17, (zzfg) unsafe.getObject(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzJ(i17, unsafe.getInt(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzi(i17, unsafe.getInt(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzy(i17, unsafe.getInt(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzA(i17, unsafe.getLong(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzC(i17, unsafe.getInt(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzE(i17, unsafe.getLong(obj, j10));
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
                    if (zzI(obj, i16, i10, i11, i12)) {
                        zzjdVar.zzq(i17, unsafe.getObject(obj, j10), zzt(i16));
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
                    zzhx.zzr(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 19:
                    zzhx.zzv(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 20:
                    zzhx.zzx(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 21:
                    zzhx.zzD(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 22:
                    zzhx.zzw(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 23:
                    zzhx.zzu(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 24:
                    zzhx.zzt(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 25:
                    zzhx.zzq(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 26:
                    int i20 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i21 = zzhx.zza;
                    if (list != null && !list.isEmpty()) {
                        zzjdVar.zzI(i20, list);
                    }
                    break;
                case 27:
                    int i22 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzhw zzhwVarZzt = zzt(i16);
                    int i23 = zzhx.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((zzfp) zzjdVar).zzw(i22, list2.get(i24), zzhwVarZzt);
                        }
                    }
                    break;
                case 28:
                    int i25 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzhx.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzjdVar.zze(i25, list3);
                    }
                    break;
                case 29:
                    zzhx.zzC(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 30:
                    zzhx.zzs(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 31:
                    zzhx.zzy(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 32:
                    zzhx.zzz(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 33:
                    zzhx.zzA(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 34:
                    zzhx.zzB(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, false);
                    break;
                case 35:
                    zzhx.zzr(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 36:
                    zzhx.zzv(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 37:
                    zzhx.zzx(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 38:
                    zzhx.zzD(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 39:
                    zzhx.zzw(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 40:
                    zzhx.zzu(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 41:
                    zzhx.zzt(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 42:
                    zzhx.zzq(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 43:
                    zzhx.zzC(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 44:
                    zzhx.zzs(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 45:
                    zzhx.zzy(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 46:
                    zzhx.zzz(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 47:
                    zzhx.zzA(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 48:
                    zzhx.zzB(iArr[i16], (List) unsafe.getObject(obj, j10), zzjdVar, true);
                    break;
                case 49:
                    int i27 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzhw zzhwVarZzt2 = zzt(i16);
                    int i28 = zzhx.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            ((zzfp) zzjdVar).zzq(i27, list4.get(i29), zzhwVarZzt2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzjdVar.zzv(i17, ((zzhf) zzv(i16)).zzc(), (zzhg) object);
                    }
                    break;
                case 51:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzf(i17, ((Double) zzis.zzf(obj, j10)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzo(i17, ((Float) zzis.zzf(obj, j10)).floatValue());
                    }
                    break;
                case 53:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzt(i17, zzr(obj, j10));
                    }
                    break;
                case 54:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzL(i17, zzr(obj, j10));
                    }
                    break;
                case 55:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzr(i17, zzm(obj, j10));
                    }
                    break;
                case 56:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzm(i17, zzr(obj, j10));
                    }
                    break;
                case 57:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzk(i17, zzm(obj, j10));
                    }
                    break;
                case 58:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzb(i17, ((Boolean) zzis.zzf(obj, j10)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzM(obj, i17, i16)) {
                        zzP(i17, unsafe.getObject(obj, j10), zzjdVar);
                    }
                    break;
                case 60:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzw(i17, unsafe.getObject(obj, j10), zzt(i16));
                    }
                    break;
                case 61:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzd(i17, (zzfg) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzJ(i17, zzm(obj, j10));
                    }
                    break;
                case 63:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzi(i17, zzm(obj, j10));
                    }
                    break;
                case 64:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzy(i17, zzm(obj, j10));
                    }
                    break;
                case 65:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzA(i17, zzr(obj, j10));
                    }
                    break;
                case 66:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzC(i17, zzm(obj, j10));
                    }
                    break;
                case 67:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzE(i17, zzr(obj, j10));
                    }
                    break;
                case 68:
                    if (zzM(obj, i17, i16)) {
                        zzjdVar.zzq(i17, unsafe.getObject(obj, j10), zzt(i16));
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
        ((zzgg) obj).zzc.zzl(zzjdVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzq = zzq(i10);
            int iZzp = zzp(iZzq);
            if (iZzp <= 50 || iZzp >= 69) {
                long j10 = iZzq & 1048575;
                switch (iZzp) {
                    case 0:
                        if (!zzG(obj, obj2, i10) || Double.doubleToLongBits(zzis.zza(obj, j10)) != Double.doubleToLongBits(zzis.zza(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzG(obj, obj2, i10) || Float.floatToIntBits(zzis.zzb(obj, j10)) != Float.floatToIntBits(zzis.zzb(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzG(obj, obj2, i10) || zzis.zzd(obj, j10) != zzis.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzG(obj, obj2, i10) || zzis.zzd(obj, j10) != zzis.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzG(obj, obj2, i10) || zzis.zzc(obj, j10) != zzis.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzG(obj, obj2, i10) || zzis.zzd(obj, j10) != zzis.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzG(obj, obj2, i10) || zzis.zzc(obj, j10) != zzis.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzG(obj, obj2, i10) || zzis.zzw(obj, j10) != zzis.zzw(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzG(obj, obj2, i10) || !zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzG(obj, obj2, i10) || !zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzG(obj, obj2, i10) || !zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzG(obj, obj2, i10) || zzis.zzc(obj, j10) != zzis.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzG(obj, obj2, i10) || zzis.zzc(obj, j10) != zzis.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzG(obj, obj2, i10) || zzis.zzc(obj, j10) != zzis.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzG(obj, obj2, i10) || zzis.zzd(obj, j10) != zzis.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzG(obj, obj2, i10) || zzis.zzc(obj, j10) != zzis.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzG(obj, obj2, i10) || zzis.zzd(obj, j10) != zzis.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzG(obj, obj2, i10) || !zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10))) {
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
                        zZzE = zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10));
                        break;
                    case 50:
                        zZzE = zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10));
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
                        if (!zzL(obj, obj2, i10) || !zzhx.zzE(zzis.zzf(obj, j10), zzis.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzE) {
                    return false;
                }
            }
        }
        int i11 = this.zzk;
        while (true) {
            int[] iArr = this.zzi;
            if (i11 >= iArr.length) {
                if (!((zzgg) obj).zzc.equals(((zzgg) obj2).zzc)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzgd) obj).zzb.equals(((zzgd) obj2).zzb);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!zzL(obj, obj2, i12)) {
                return false;
            }
            if (!zzM(obj, 0, i12)) {
                long jZzq = zzq(i12) & 1048575;
                if (!zzhx.zzE(zzis.zzf(obj, jZzq), zzis.zzf(obj2, jZzq))) {
                    return false;
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[LOOP:2: B:52:0x00df->B:57:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x010d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzhw
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzhw zzhwVarZzt;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzj) {
            int i16 = this.zzi[i14];
            int iZzq = zzq(i16);
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
            if ((268435456 & iZzq) != 0 && !zzI(obj, i16, i10, i11, i19)) {
                return false;
            }
            int iZzp = zzp(iZzq);
            if (iZzp == 9 || iZzp == 17) {
                if (zzI(obj, i16, i10, i11, i19) && !zzJ(obj, iZzq, zzt(i16))) {
                    return false;
                }
            } else if (iZzp == 27) {
                list = (List) zzis.zzf(obj, iZzq & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhwVarZzt = zzt(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzhwVarZzt.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzp == 60 || iZzp == 68) {
                if (zzM(obj, iArr[i16], i16) && !zzJ(obj, iZzq, zzt(i16))) {
                    return false;
                }
            } else if (iZzp == 49) {
                list = (List) zzis.zzf(obj, iZzq & 1048575);
                if (list.isEmpty()) {
                    zzhwVarZzt = zzt(i16);
                    while (i12 < list.size()) {
                        if (!zzhwVarZzt.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzp != 50) {
                continue;
            } else {
                zzhg zzhgVar = (zzhg) zzis.zzf(obj, iZzq & 1048575);
                if (!zzhgVar.isEmpty() && ((zzhf) zzv(i16)).zzc().zzc.zzb() == zzjc.MESSAGE) {
                    zzhw zzhwVarZzb = null;
                    for (Object obj2 : zzhgVar.values()) {
                        if (zzhwVarZzb == null) {
                            zzhwVarZzb = zzht.zza().zzb(obj2.getClass());
                        }
                        if (!zzhwVarZzb.zzk(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzgd) obj).zzb.zzj();
    }
}
