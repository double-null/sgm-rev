package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i10, int i11, zzrq zzrqVar, boolean z10, int[] iArr2, int i12, int i13, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z11 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z11 = true;
        }
        this.zzf = z11;
        this.zzg = iArr2;
        this.zzh = i12;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i10, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i10 & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i10, int i11) {
        return zzsw.zzc(obj, (long) (zzm(i11) & 1048575)) == i10;
    }

    private static boolean zzD(Object obj, long j10) {
        return ((Boolean) zzsw.zzf(obj, j10)).booleanValue();
    }

    private static final void zzE(int i10, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i10, (String) obj);
        } else {
            zztbVar.zzd(i10, (zzpm) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:129:0x027f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0282  */
    /* JADX WARN: Code duplicated, block: B:184:0x0398  */
    static zzrt zzi(Class cls, zzrn zzrnVar, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldZzs;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldZzs2;
        int i35;
        Object obj2;
        Field fieldZzs3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar = (zzrz) zzrnVar;
        String strZzd = zzrzVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strZzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i42 = iCharAt3 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strZzd.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt3 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt3 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i14 = 0;
            i12 = 0;
            iArr = zza;
            i15 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt4 = strZzd.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    cCharAt8 = strZzd.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                iCharAt4 = i45 | (cCharAt8 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int iCharAt5 = strZzd.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt7 = strZzd.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt5 = i48 | (cCharAt7 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt6 = strZzd.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt6 = strZzd.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt6 = i51 | (cCharAt6 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int iCharAt7 = strZzd.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt5 = strZzd.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt7 = i54 | (cCharAt5 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            iCharAt = strZzd.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            iCharAt2 = strZzd.charAt(i56);
            if (iCharAt2 >= 55296) {
                int i60 = iCharAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt2 = i60 | (cCharAt3 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strZzd.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt2 = strZzd.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strZzd.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    cCharAt = strZzd.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i16;
            }
            int i68 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i11 = iCharAt6;
            i12 = iCharAt9;
            i13 = i68;
            iArr = iArr2;
            i14 = iCharAt7;
            i15 = iCharAt4;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzrzVar.zze();
        Class<?> cls2 = zzrzVar.zza().getClass();
        int i69 = i12 + iCharAt2;
        int i70 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = i12;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int iCharAt10 = strZzd.charAt(i41);
            if (iCharAt10 >= c10) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    cCharAt12 = strZzd.charAt(i77);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i24 = i38;
            } else {
                i24 = i75;
            }
            int i79 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c10) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    cCharAt11 = strZzd.charAt(i81);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i25 = i37;
            } else {
                i25 = i79;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int i83 = iCharAt11 & 255;
            int i84 = length;
            int i85 = iCharAt11 & 2048;
            int i86 = i14;
            if (i83 >= 51) {
                int i87 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i36 = i89 + 1;
                        cCharAt10 = strZzd.charAt(i89);
                        i26 = i11;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i89 = i36;
                        i11 = i26;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i90);
                    i32 = i36;
                } else {
                    i26 = i11;
                    i32 = i87;
                }
                int i91 = i83 - 51;
                int i92 = i32;
                if (i91 == 9 || i91 == 17) {
                    i33 = i13 + 1;
                    int i93 = i74 / 3;
                    objArr[i93 + i93 + 1] = objArrZze[i13];
                } else {
                    if (i91 == 12) {
                        if (zzrzVar.zzc() == 1 || i85 != 0) {
                            i33 = i13 + 1;
                            int i94 = i74 / 3;
                            objArr[i94 + i94 + 1] = objArrZze[i13];
                        } else {
                            i85 = 0;
                        }
                    }
                    i34 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i34];
                    if (obj instanceof Field) {
                        fieldZzs2 = (Field) obj;
                    } else {
                        fieldZzs2 = zzs(cls2, (String) obj);
                        objArrZze[i34] = fieldZzs2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzs2);
                    i35 = i34 + 1;
                    obj2 = objArrZze[i35];
                    int i95 = i85;
                    if (obj2 instanceof Field) {
                        fieldZzs3 = (Field) obj2;
                    } else {
                        fieldZzs3 = zzs(cls2, (String) obj2);
                        objArrZze[i35] = fieldZzs3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzs3);
                    strZzd = strZzd;
                    i27 = i13;
                    i28 = i92;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i29 = 0;
                    zzrzVar = zzrzVar;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i30 = i95;
                }
                i13 = i33;
                i34 = iCharAt12 + iCharAt12;
                obj = objArrZze[i34];
                if (obj instanceof Field) {
                    fieldZzs2 = (Field) obj;
                } else {
                    fieldZzs2 = zzs(cls2, (String) obj);
                    objArrZze[i34] = fieldZzs2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzs2);
                i35 = i34 + 1;
                obj2 = objArrZze[i35];
                int i96 = i85;
                if (obj2 instanceof Field) {
                    fieldZzs3 = (Field) obj2;
                } else {
                    fieldZzs3 = zzs(cls2, (String) obj2);
                    objArrZze[i35] = fieldZzs3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzs3);
                strZzd = strZzd;
                i27 = i13;
                i28 = i92;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i29 = 0;
                zzrzVar = zzrzVar;
                iObjectFieldOffset = iObjectFieldOffset5;
                i30 = i96;
            } else {
                i26 = i11;
                i27 = i13 + 1;
                Field fieldZzs4 = zzs(cls2, (String) objArrZze[i13]);
                if (i83 == 9 || i83 == 17) {
                    zzrzVar = zzrzVar;
                    int i97 = i74 / 3;
                    objArr[i97 + i97 + 1] = fieldZzs4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i31 = i27 + 1;
                        int i98 = i74 / 3;
                        objArr[i98 + i98 + 1] = objArrZze[i27];
                        i27 = i31;
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        zzrzVar = zzrzVar;
                        if (zzrzVar.zzc() == 1 || i85 != 0) {
                            i31 = i27 + 1;
                            int i99 = i74 / 3;
                            objArr[i99 + i99 + 1] = objArrZze[i27];
                            i27 = i31;
                        } else {
                            i85 = 0;
                        }
                    } else if (i83 == 50) {
                        int i100 = i27 + 1;
                        int i101 = i71 + 1;
                        iArr[i71] = i74;
                        int i102 = i74 / 3;
                        int i103 = i102 + i102;
                        objArr[i103] = objArrZze[i27];
                        if (i85 != 0) {
                            i27 = i100 + 1;
                            objArr[i103 + 1] = objArrZze[i100];
                            i71 = i101;
                            zzrzVar = zzrzVar;
                        } else {
                            i27 = i100;
                            i71 = i101;
                            i85 = 0;
                            zzrzVar = zzrzVar;
                        }
                    } else {
                        zzrzVar = zzrzVar;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                        i28 = i25;
                        i29 = 0;
                    } else {
                        int i104 = i25 + 1;
                        int iCharAt13 = strZzd.charAt(i25);
                        if (iCharAt13 >= 55296) {
                            int i105 = iCharAt13 & 8191;
                            int i106 = 13;
                            while (true) {
                                i28 = i104 + 1;
                                cCharAt9 = strZzd.charAt(i104);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i105 |= (cCharAt9 & 8191) << i106;
                                i106 += 13;
                                i104 = i28;
                            }
                            iCharAt13 = i105 | (cCharAt9 << i106);
                        } else {
                            i28 = i104;
                        }
                        int i107 = i15 + i15 + (iCharAt13 / 32);
                        Object obj3 = objArrZze[i107];
                        if (obj3 instanceof Field) {
                            fieldZzs = (Field) obj3;
                        } else {
                            fieldZzs = zzs(cls2, (String) obj3);
                            objArrZze[i107] = fieldZzs;
                        }
                        i29 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzs);
                    }
                    if (i83 >= 18 && i83 <= 49) {
                        iArr[i72] = iObjectFieldOffset;
                        i72++;
                    }
                    i30 = i85;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i28 = i25;
                    i29 = 0;
                } else {
                    i28 = i25;
                    i29 = 0;
                }
                if (i83 >= 18) {
                    iArr[i72] = iObjectFieldOffset;
                    i72++;
                }
                i30 = i85;
            }
            int i108 = i74 + 1;
            iArr3[i74] = iCharAt10;
            int i109 = i108 + 1;
            iArr3[i108] = iObjectFieldOffset | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i30 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20);
            iArr3[i109] = (i29 << 20) | iObjectFieldOffset2;
            i74 = i109 + 1;
            i13 = i27;
            strZzd = strZzd;
            length = i84;
            i14 = i86;
            zzrzVar = zzrzVar;
            i41 = i28;
            i11 = i26;
            c10 = 55296;
        }
        return new zzrt(iArr3, objArr, i11, i14, zzrzVar.zza(), false, iArr, i12, i69, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(Object obj, long j10) {
        return ((Double) zzsw.zzf(obj, j10)).doubleValue();
    }

    private static float zzk(Object obj, long j10) {
        return ((Float) zzsw.zzf(obj, j10)).floatValue();
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzsw.zzf(obj, j10)).intValue();
    }

    private final int zzm(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzsw.zzf(obj, j10)).longValue();
    }

    private final zzsa zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzsa zzsaVar = (zzsa) objArr[i12];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzsaVarZzb = zzrx.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzsaVarZzb;
        return zzsaVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzs(Class cls, String str) {
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

    private final void zzt(Object obj, Object obj2, int i10) {
        if (zzy(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i10);
            if (!zzy(obj, i10)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzv(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzC(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i10);
            if (!zzC(obj, i11, i10)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzw(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i10) {
        int iZzm = zzm(i10);
        long j10 = 1048575 & iZzm;
        if (j10 == 1048575) {
            return;
        }
        zzsw.zzq(obj, j10, (1 << (iZzm >>> 20)) | zzsw.zzc(obj, j10));
    }

    private final void zzw(Object obj, int i10, int i11) {
        zzsw.zzq(obj, zzm(i11) & 1048575, i10);
    }

    private final boolean zzx(Object obj, Object obj2, int i10) {
        return zzy(obj, i10) == zzy(obj2, i10);
    }

    private final boolean zzy(Object obj, int i10) {
        int iZzm = zzm(i10);
        long j10 = iZzm & 1048575;
        if (j10 != 1048575) {
            return (zzsw.zzc(obj, j10) & (1 << (iZzm >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j11)) != 0;
            case 2:
                return zzsw.zzd(obj, j11) != 0;
            case 3:
                return zzsw.zzd(obj, j11) != 0;
            case 4:
                return zzsw.zzc(obj, j11) != 0;
            case 5:
                return zzsw.zzd(obj, j11) != 0;
            case 6:
                return zzsw.zzc(obj, j11) != 0;
            case 7:
                return zzsw.zzw(obj, j11);
            case 8:
                Object objZzf = zzsw.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzpm) {
                    return !zzpm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j11) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j11));
            case 11:
                return zzsw.zzc(obj, j11) != 0;
            case 12:
                return zzsw.zzc(obj, j11) != 0;
            case 13:
                return zzsw.zzc(obj, j11) != 0;
            case 14:
                return zzsw.zzd(obj, j11) != 0;
            case 15:
                return zzsw.zzc(obj, j11) != 0;
            case 16:
                return zzsw.zzd(obj, j11) != 0;
            case 17:
                return zzsw.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzy(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0392  */
    /* JADX WARN: Code duplicated, block: B:207:0x0556  */
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
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
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
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(Object obj) {
        int i10;
        ?? r16;
        ?? r10;
        int iZzC;
        int iZzC2;
        int iZzC3;
        int iZzD;
        int iZzC4;
        int iZzC5;
        int iZzd;
        int iZzC6;
        ?? Zzh;
        int size;
        int iZzC7;
        int iZzB;
        int iZzB2;
        ?? r11;
        int iZzj;
        int iZzC8;
        ?? ZzC;
        ?? Zzi;
        int iZzf;
        int iZzC9;
        int iZzC10;
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
                int iZza = i13 + ((zzqm) obj).zzc.zza();
                if (!this.zzf) {
                    return iZza;
                }
                zzsi zzsiVar = ((zzqk) obj).zzb.zza;
                int iZzc = zzsiVar.zzc();
                int iZzc2 = 0;
                for (int i15 = 0; i15 < iZzc; i15++) {
                    Map.Entry entryZzg = zzsiVar.zzg(i15);
                    iZzc2 += zzqf.zzc((zzqe) ((zzse) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzsiVar.zzd()) {
                    iZzc2 += zzqf.zzc((zzqe) entry.getKey(), entry.getValue());
                }
                return iZza + iZzc2;
            }
            int iZzo = zzo(i12);
            int iZzn = zzn(iZzo);
            int i16 = iArr[i12];
            int i17 = iArr[i12 + 2];
            int i18 = i17 & i11;
            if (iZzn <= 17) {
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
            int i19 = iZzo & i11;
            if (iZzn >= zzqg.zzJ.zza()) {
                zzqg.zzW.zza();
            }
            long j10 = i19;
            switch (iZzn) {
                case 0:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC = zzpv.zzC(i16 << 3);
                        Zzi = iZzC + 8;
                        i13 += Zzi;
                    }
                    break;
                case 1:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC2 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC2 + 4;
                        i13 += Zzi;
                    }
                    break;
                case 2:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(j11);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 3:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(j12);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 4:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(j13);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 5:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC = zzpv.zzC(i16 << 3);
                        Zzi = iZzC + 8;
                        i13 += Zzi;
                    }
                    break;
                case 6:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC2 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC2 + 4;
                        i13 += Zzi;
                    }
                    break;
                case 7:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC4 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC4 + 1;
                        i13 += Zzi;
                    }
                    break;
                case 8:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzpm) {
                            iZzC5 = zzpv.zzC(i20);
                            iZzd = ((zzpm) object).zzd();
                            iZzC6 = zzpv.zzC(iZzd);
                            Zzi = iZzC5 + iZzC6 + iZzd;
                            i13 += Zzi;
                        } else {
                            iZzC3 = zzpv.zzC(i20);
                            iZzD = zzpv.zzB((String) object);
                            Zzi = iZzC3 + iZzD;
                            i13 += Zzi;
                        }
                    }
                    break;
                case 9:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        Zzi = zzsc.zzi(i16, unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzi;
                    }
                    break;
                case 10:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(obj, j10);
                        iZzC5 = zzpv.zzC(i16 << 3);
                        iZzd = zzpmVar.zzd();
                        iZzC6 = zzpv.zzC(iZzd);
                        Zzi = iZzC5 + iZzC6 + iZzd;
                        i13 += Zzi;
                    }
                    break;
                case 11:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzC(i21);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 12:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(j14);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 13:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC2 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC2 + 4;
                        i13 += Zzi;
                    }
                    break;
                case 14:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        iZzC = zzpv.zzC(i16 << 3);
                        Zzi = iZzC + 8;
                        i13 += Zzi;
                    }
                    break;
                case 15:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzC((i22 >> 31) ^ (i22 + i22));
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 16:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD((j15 >> 63) ^ (j15 + j15));
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 17:
                    if (zzz(obj, i12, i10, r16 == true ? 1 : 0, r10)) {
                        Zzi = zzsc.zza(i16, (zzrq) unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzi;
                    }
                    break;
                case 18:
                    Zzi = zzsc.zze(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzi;
                    break;
                case 19:
                    Zzi = zzsc.zzc(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzi;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i23 = zzsc.zza;
                    if (list.size() == 0) {
                        Zzh = z10;
                    } else {
                        Zzh = zzsc.zzh(list) + (list.size() * zzpv.zzC(i16 << 3));
                    }
                    i13 += Zzh;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzsc.zza;
                    size = list2.size();
                    if (size == 0) {
                        Zzi = z10;
                    } else {
                        iZzC3 = zzsc.zzm(list2);
                        iZzC7 = zzpv.zzC(i16 << 3);
                        iZzD = size * iZzC7;
                        Zzi = iZzC3 + iZzD;
                    }
                    i13 += Zzi;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzsc.zza;
                    size = list3.size();
                    if (size == 0) {
                        Zzi = z10;
                    } else {
                        iZzC3 = zzsc.zzg(list3);
                        iZzC7 = zzpv.zzC(i16 << 3);
                        iZzD = size * iZzC7;
                        Zzi = iZzC3 + iZzD;
                    }
                    i13 += Zzi;
                    break;
                case 23:
                    Zzi = zzsc.zze(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzi;
                    break;
                case 24:
                    Zzi = zzsc.zzc(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzi;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzsc.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        Zzi = z10;
                    } else {
                        Zzi = size2 * (zzpv.zzC(i16 << 3) + 1);
                    }
                    i13 += Zzi;
                    break;
                case 26:
                    ?? r17 = (List) unsafe.getObject(obj, j10);
                    int i27 = zzsc.zza;
                    int size3 = r17.size();
                    if (size3 == 0) {
                        Zzh = z10;
                    } else {
                        int iZzC11 = zzpv.zzC(i16 << 3) * size3;
                        if (r17 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) r17;
                            for (?? r18 = z10; r18 < size3; r18++) {
                                Object objZza = zzrbVar.zza();
                                if (objZza instanceof zzpm) {
                                    Zzh = iZzC11;
                                    int iZzd2 = ((zzpm) objZza).zzd();
                                    iZzB2 = Zzh + zzpv.zzC(iZzd2) + iZzd2;
                                } else {
                                    Zzh = iZzC11;
                                    iZzB2 = Zzh + zzpv.zzB((String) objZza);
                                }
                                Zzh = iZzB2;
                            }
                            Zzh = iZzC11;
                        } else {
                            for (?? r19 = z10; r19 < size3; r19++) {
                                Object obj2 = r17.get(r19);
                                if (obj2 instanceof zzpm) {
                                    Zzh = iZzC11;
                                    int iZzd3 = ((zzpm) obj2).zzd();
                                    iZzB = Zzh + zzpv.zzC(iZzd3) + iZzd3;
                                } else {
                                    Zzh = iZzC11;
                                    iZzB = Zzh + zzpv.zzB((String) obj2);
                                }
                                Zzh = iZzB;
                            }
                            Zzh = iZzC11;
                        }
                    }
                    i13 += Zzh;
                    break;
                case 27:
                    ?? r20 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq = zzq(i12);
                    int i28 = zzsc.zza;
                    int size4 = r20.size();
                    if (size4 == 0) {
                        r11 = z10;
                    } else {
                        int iZzC12 = zzpv.zzC(i16 << 3) * size4;
                        for (?? r21 = z10; r21 < size4; r21++) {
                            Object obj3 = r20.get(r21);
                            if (obj3 instanceof zzra) {
                                r11 = iZzC12;
                                iZzj = ((zzra) obj3).zza();
                                iZzC8 = zzpv.zzC(iZzj);
                            } else {
                                r11 = iZzC12;
                                iZzj = ((zzpa) obj3).zzj(zzsaVarZzq);
                                iZzC8 = zzpv.zzC(iZzj);
                            }
                            r11 = (r11 == true ? 1 : 0) + iZzC8 + iZzj;
                        }
                        r11 = iZzC12;
                    }
                    i13 += r11;
                    break;
                case 28:
                    ?? r22 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzsc.zza;
                    int size5 = r22.size();
                    if (size5 == 0) {
                        ZzC = z10;
                    } else {
                        ZzC = size5 * zzpv.zzC(i16 << 3);
                        for (?? r23 = z10; r23 < r22.size(); r23++) {
                            int iZzd4 = ((zzpm) r22.get(r23)).zzd();
                            ZzC += zzpv.zzC(iZzd4) + iZzd4;
                        }
                    }
                    i13 += ZzC;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i30 = zzsc.zza;
                    size = list5.size();
                    if (size == 0) {
                        Zzi = z10;
                    } else {
                        iZzC3 = zzsc.zzl(list5);
                        iZzC7 = zzpv.zzC(i16 << 3);
                        iZzD = size * iZzC7;
                        Zzi = iZzC3 + iZzD;
                    }
                    i13 += Zzi;
                    break;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzsc.zza;
                    size = list6.size();
                    if (size == 0) {
                        Zzi = z10;
                    } else {
                        iZzC3 = zzsc.zzb(list6);
                        iZzC7 = zzpv.zzC(i16 << 3);
                        iZzD = size * iZzC7;
                        Zzi = iZzC3 + iZzD;
                    }
                    i13 += Zzi;
                    break;
                case 31:
                    Zzi = zzsc.zzc(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzi;
                    break;
                case 32:
                    Zzi = zzsc.zze(i16, (List) unsafe.getObject(obj, j10), z10);
                    i13 += Zzi;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i32 = zzsc.zza;
                    size = list7.size();
                    if (size == 0) {
                        Zzi = z10;
                    } else {
                        iZzC3 = zzsc.zzj(list7);
                        iZzC7 = zzpv.zzC(i16 << 3);
                        iZzD = size * iZzC7;
                        Zzi = iZzC3 + iZzD;
                    }
                    i13 += Zzi;
                    break;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzsc.zza;
                    size = list8.size();
                    if (size == 0) {
                        Zzi = z10;
                    } else {
                        iZzC3 = zzsc.zzk(list8);
                        iZzC7 = zzpv.zzC(i16 << 3);
                        iZzD = size * iZzC7;
                        Zzi = iZzC3 + iZzD;
                    }
                    i13 += Zzi;
                    break;
                case 35:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 36:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 37:
                    iZzf = zzsc.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 38:
                    iZzf = zzsc.zzm((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 39:
                    iZzf = zzsc.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 40:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 41:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzsc.zza;
                    iZzf = list9.size();
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 43:
                    iZzf = zzsc.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 44:
                    iZzf = zzsc.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 45:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 46:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 47:
                    iZzf = zzsc.zzj((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 48:
                    iZzf = zzsc.zzk((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC9 = zzpv.zzC(i16 << 3);
                        iZzC10 = zzpv.zzC(iZzf);
                        ZzC = iZzC9 + iZzC10 + iZzf;
                        i13 += ZzC;
                    }
                    break;
                case 49:
                    ?? r24 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq2 = zzq(i12);
                    int i35 = zzsc.zza;
                    int size6 = r24.size();
                    if (size6 == 0) {
                        r12 = z10;
                    } else {
                        boolean z11 = z10;
                        r12 = z11;
                        while (r13 < size6) {
                            r13 = z11;
                            int iZza2 = zzsc.zza(i16, (zzrq) r24.get(r13), zzsaVarZzq2);
                            r13++;
                            r12 = (r12 == true ? 1 : 0) + iZza2;
                        }
                        r13 = z11;
                    }
                    i13 += r12;
                    break;
                case 50:
                    zzrk zzrkVar = (zzrk) unsafe.getObject(obj, j10);
                    zzrj zzrjVar = (zzrj) zzr(i12);
                    if (zzrkVar.isEmpty()) {
                        Zzh = z10;
                    } else {
                        Zzh = z10;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            Zzh += zzrjVar.zza(i16, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i13 += Zzh;
                    break;
                case 51:
                    if (zzC(obj, i16, i12)) {
                        iZzC = zzpv.zzC(i16 << 3);
                        Zzi = iZzC + 8;
                        i13 += Zzi;
                    }
                    break;
                case 52:
                    if (zzC(obj, i16, i12)) {
                        iZzC2 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC2 + 4;
                        i13 += Zzi;
                    }
                    break;
                case 53:
                    if (zzC(obj, i16, i12)) {
                        long jZzp = zzp(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(jZzp);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 54:
                    if (zzC(obj, i16, i12)) {
                        long jZzp2 = zzp(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(jZzp2);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 55:
                    if (zzC(obj, i16, i12)) {
                        long jZzl = zzl(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(jZzl);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 56:
                    if (zzC(obj, i16, i12)) {
                        iZzC = zzpv.zzC(i16 << 3);
                        Zzi = iZzC + 8;
                        i13 += Zzi;
                    }
                    break;
                case 57:
                    if (zzC(obj, i16, i12)) {
                        iZzC2 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC2 + 4;
                        i13 += Zzi;
                    }
                    break;
                case 58:
                    if (zzC(obj, i16, i12)) {
                        iZzC4 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC4 + 1;
                        i13 += Zzi;
                    }
                    break;
                case 59:
                    if (zzC(obj, i16, i12)) {
                        int i36 = i16 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzpm) {
                            iZzC5 = zzpv.zzC(i36);
                            iZzd = ((zzpm) object2).zzd();
                            iZzC6 = zzpv.zzC(iZzd);
                            Zzi = iZzC5 + iZzC6 + iZzd;
                            i13 += Zzi;
                        } else {
                            iZzC3 = zzpv.zzC(i36);
                            iZzD = zzpv.zzB((String) object2);
                            Zzi = iZzC3 + iZzD;
                            i13 += Zzi;
                        }
                    }
                    break;
                case 60:
                    if (zzC(obj, i16, i12)) {
                        Zzi = zzsc.zzi(i16, unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzi;
                    }
                    break;
                case 61:
                    if (zzC(obj, i16, i12)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(obj, j10);
                        iZzC5 = zzpv.zzC(i16 << 3);
                        iZzd = zzpmVar2.zzd();
                        iZzC6 = zzpv.zzC(iZzd);
                        Zzi = iZzC5 + iZzC6 + iZzd;
                        i13 += Zzi;
                    }
                    break;
                case 62:
                    if (zzC(obj, i16, i12)) {
                        int iZzl = zzl(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzC(iZzl);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 63:
                    if (zzC(obj, i16, i12)) {
                        long jZzl2 = zzl(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD(jZzl2);
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 64:
                    if (zzC(obj, i16, i12)) {
                        iZzC2 = zzpv.zzC(i16 << 3);
                        Zzi = iZzC2 + 4;
                        i13 += Zzi;
                    }
                    break;
                case 65:
                    if (zzC(obj, i16, i12)) {
                        iZzC = zzpv.zzC(i16 << 3);
                        Zzi = iZzC + 8;
                        i13 += Zzi;
                    }
                    break;
                case 66:
                    if (zzC(obj, i16, i12)) {
                        int iZzl2 = zzl(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzC((iZzl2 >> 31) ^ (iZzl2 + iZzl2));
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 67:
                    if (zzC(obj, i16, i12)) {
                        long jZzp3 = zzp(obj, j10);
                        iZzC3 = zzpv.zzC(i16 << 3);
                        iZzD = zzpv.zzD((jZzp3 >> 63) ^ (jZzp3 + jZzp3));
                        Zzi = iZzC3 + iZzD;
                        i13 += Zzi;
                    }
                    break;
                case 68:
                    if (zzC(obj, i16, i12)) {
                        Zzi = zzsc.zza(i16, (zzrq) unsafe.getObject(obj, j10), zzq(i12));
                        i13 += Zzi;
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

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (iHashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzo = zzo(i12);
            int i14 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzn) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j10));
                    byte[] bArr = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr2 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr3 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr4 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzqs.zza(zzsw.zzw(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzsw.zzf(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzf = zzsw.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr5 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr6 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzf2 = zzsw.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzj(obj, j10));
                        byte[] bArr7 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzk(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzqs.zza(zzD(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzsw.zzf(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zzqm) {
                zzqm zzqmVar = (zzqm) obj;
                zzqmVar.zzA(Integer.MAX_VALUE);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzo = zzo(i10);
                int i11 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j10 = i11;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzy(obj, i10)) {
                                    zzq(i10).zzd(zzb.getObject(obj, j10));
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
                                ((zzqr) zzsw.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzrk) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzC(obj, iArr[i10], i10)) {
                        zzq(i10).zzd(zzb.getObject(obj, j10));
                    }
                } else if (zzy(obj, i10)) {
                    zzq(i10).zzd(zzb.getObject(obj, j10));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int iZzo = zzo(i10);
            int i11 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzn) {
                case 0:
                    if (zzy(obj2, i10)) {
                        zzsw.zzo(obj, j10, zzsw.zza(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 1:
                    if (zzy(obj2, i10)) {
                        zzsw.zzp(obj, j10, zzsw.zzb(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 2:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 3:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 4:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 5:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 6:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 7:
                    if (zzy(obj2, i10)) {
                        zzsw.zzm(obj, j10, zzsw.zzw(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 8:
                    if (zzy(obj2, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 9:
                    zzt(obj, obj2, i10);
                    break;
                case 10:
                    if (zzy(obj2, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 11:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 12:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 13:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 14:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 15:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 16:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 17:
                    zzt(obj, obj2, i10);
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
                    zzqr zzqrVarZzd = (zzqr) zzsw.zzf(obj, j10);
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj2, j10);
                    int size = zzqrVarZzd.size();
                    int size2 = zzqrVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVarZzd.zzc()) {
                            zzqrVarZzd = zzqrVarZzd.zzd(size2 + size);
                        }
                        zzqrVarZzd.addAll(zzqrVar);
                    }
                    if (size > 0) {
                        zzqrVar = zzqrVarZzd;
                    }
                    zzsw.zzs(obj, j10, zzqrVar);
                    break;
                case 50:
                    int i13 = zzsc.zza;
                    zzrk zzrkVarZzb = (zzrk) zzsw.zzf(obj, j10);
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj2, j10);
                    if (!zzrkVar.isEmpty()) {
                        if (!zzrkVarZzb.zze()) {
                            zzrkVarZzb = zzrkVarZzb.zzb();
                        }
                        zzrkVarZzb.zzd(zzrkVar);
                    }
                    zzsw.zzs(obj, j10, zzrkVarZzb);
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
                    if (zzC(obj2, i12, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzw(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzu(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzC(obj2, i12, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzw(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzu(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzf(Object obj, zztb zztbVar) throws IOException {
        Map.Entry entry;
        int i10;
        int i11;
        int i12;
        Map.Entry entry2;
        if (this.zzf) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (zzqfVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzqfVar.zzf().next();
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
            int iZzo = zzo(i16);
            int iZzn = zzn(iZzo);
            int i17 = iArr[i16];
            if (iZzn <= 17) {
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
            long j10 = iZzo & i13;
            switch (iZzn) {
                case 0:
                    entry2 = entry;
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzf(i17, zzsw.zza(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzn(i17, zzsw.zzb(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzs(i17, unsafe.getLong(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzJ(i17, unsafe.getLong(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzq(i17, unsafe.getInt(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzl(i17, unsafe.getLong(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzj(i17, unsafe.getInt(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzb(i17, zzsw.zzw(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zzE(i17, unsafe.getObject(obj, j10), zztbVar);
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzv(i17, unsafe.getObject(obj, j10), zzq(i16));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzd(i17, (zzpm) unsafe.getObject(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzH(i17, unsafe.getInt(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzh(i17, unsafe.getInt(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzx(i17, unsafe.getInt(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzz(i17, unsafe.getLong(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzB(i17, unsafe.getInt(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzD(i17, unsafe.getLong(obj, j10));
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
                    if (zzz(obj, i16, i10, i11, i12)) {
                        zztbVar.zzp(i17, unsafe.getObject(obj, j10), zzq(i16));
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
                    zzsc.zzr(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 19:
                    zzsc.zzv(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 20:
                    zzsc.zzx(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 21:
                    zzsc.zzD(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 22:
                    zzsc.zzw(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 23:
                    zzsc.zzu(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 24:
                    zzsc.zzt(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 25:
                    zzsc.zzq(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 26:
                    int i20 = iArr[i16];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i21 = zzsc.zza;
                    if (list != null && !list.isEmpty()) {
                        zztbVar.zzG(i20, list);
                    }
                    break;
                case 27:
                    int i22 = iArr[i16];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq = zzq(i16);
                    int i23 = zzsc.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((zzpw) zztbVar).zzv(i22, list2.get(i24), zzsaVarZzq);
                        }
                    }
                    break;
                case 28:
                    int i25 = iArr[i16];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzsc.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zztbVar.zze(i25, list3);
                    }
                    break;
                case 29:
                    zzsc.zzC(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 30:
                    zzsc.zzs(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 31:
                    zzsc.zzy(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 32:
                    zzsc.zzz(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 33:
                    zzsc.zzA(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 34:
                    zzsc.zzB(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    break;
                case 35:
                    zzsc.zzr(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 36:
                    zzsc.zzv(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 37:
                    zzsc.zzx(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 38:
                    zzsc.zzD(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 39:
                    zzsc.zzw(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 40:
                    zzsc.zzu(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 41:
                    zzsc.zzt(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 42:
                    zzsc.zzq(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 43:
                    zzsc.zzC(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 44:
                    zzsc.zzs(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 45:
                    zzsc.zzy(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 46:
                    zzsc.zzz(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 47:
                    zzsc.zzA(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 48:
                    zzsc.zzB(iArr[i16], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 49:
                    int i27 = iArr[i16];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq2 = zzq(i16);
                    int i28 = zzsc.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            ((zzpw) zztbVar).zzp(i27, list4.get(i29), zzsaVarZzq2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zztbVar.zzu(i17, ((zzrj) zzr(i16)).zzc(), (zzrk) object);
                    }
                    break;
                case 51:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzf(i17, zzj(obj, j10));
                    }
                    break;
                case 52:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzn(i17, zzk(obj, j10));
                    }
                    break;
                case 53:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzs(i17, zzp(obj, j10));
                    }
                    break;
                case 54:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzJ(i17, zzp(obj, j10));
                    }
                    break;
                case 55:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzq(i17, zzl(obj, j10));
                    }
                    break;
                case 56:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzl(i17, zzp(obj, j10));
                    }
                    break;
                case 57:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzj(i17, zzl(obj, j10));
                    }
                    break;
                case 58:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzb(i17, zzD(obj, j10));
                    }
                    break;
                case 59:
                    if (zzC(obj, i17, i16)) {
                        zzE(i17, unsafe.getObject(obj, j10), zztbVar);
                    }
                    break;
                case 60:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzv(i17, unsafe.getObject(obj, j10), zzq(i16));
                    }
                    break;
                case 61:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzd(i17, (zzpm) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzH(i17, zzl(obj, j10));
                    }
                    break;
                case 63:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzh(i17, zzl(obj, j10));
                    }
                    break;
                case 64:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzx(i17, zzl(obj, j10));
                    }
                    break;
                case 65:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzz(i17, zzp(obj, j10));
                    }
                    break;
                case 66:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzB(i17, zzl(obj, j10));
                    }
                    break;
                case 67:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzD(i17, zzp(obj, j10));
                    }
                    break;
                case 68:
                    if (zzC(obj, i17, i16)) {
                        zztbVar.zzp(i17, unsafe.getObject(obj, j10), zzq(i16));
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
        zzsq zzsqVar = ((zzqm) obj).zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzx(obj, obj2, i10) || Double.doubleToLongBits(zzsw.zza(obj, j10)) != Double.doubleToLongBits(zzsw.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzx(obj, obj2, i10) || Float.floatToIntBits(zzsw.zzb(obj, j10)) != Float.floatToIntBits(zzsw.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzx(obj, obj2, i10) || zzsw.zzw(obj, j10) != zzsw.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10));
                    break;
                case 50:
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10));
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
                    long jZzm = zzm(i10) & 1048575;
                    if (zzsw.zzc(obj, jZzm) != zzsw.zzc(obj2, jZzm) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1 A[LOOP:2: B:53:0x00e0->B:58:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x010e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(Object obj) {
        int i10;
        int i11;
        List list;
        zzsa zzsaVarZzq;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iZzo = zzo(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i13;
            }
            if ((268435456 & iZzo) != 0 && !zzz(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzz(obj, i16, i10, i11, i20) && !zzA(obj, iZzo, zzq(i16))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzsw.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzsaVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzsaVarZzq.zzh(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzC(obj, i17, i16) && !zzA(obj, iZzo, zzq(i16))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzsw.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzsaVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zzsaVarZzq.zzh(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn != 50) {
                continue;
            } else {
                zzrk zzrkVar = (zzrk) zzsw.zzf(obj, iZzo & 1048575);
                if (!zzrkVar.isEmpty() && ((zzrj) zzr(i16)).zzc().zzb.zzb() == zzta.MESSAGE) {
                    zzsa zzsaVarZzb = null;
                    for (Object obj2 : zzrkVar.values()) {
                        if (zzsaVarZzb == null) {
                            zzsaVarZzb = zzrx.zza().zzb(obj2.getClass());
                        }
                        if (!zzsaVarZzb.zzh(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzf || ((zzqk) obj).zzb.zzj();
    }
}
