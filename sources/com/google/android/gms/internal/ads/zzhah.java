package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhah extends zzhai {
    public static int zza(long j10) {
        int i10 = (int) j10;
        zzgtj.zze(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int zzb(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int zzc(int i10, int i11, int i12) {
        zzgtj.zzg(true, "min (%s) must be less than or equal to max (%s)", i11, 1073741823);
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzgtj.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int[] zzf(Collection collection) {
        if (collection instanceof zzhag) {
            zzhag zzhagVar = (zzhag) collection;
            return Arrays.copyOfRange(zzhagVar.zza, zzhagVar.zzb, zzhagVar.zzc);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new zzhag(iArr, 0, length);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer zzh(String str, int i10) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i11 = cCharAt == '-' ? 1 : 0;
            if (i11 != str.length()) {
                int i12 = i11 + 1;
                int iZza = zzhaj.zza(str.charAt(i11));
                if (iZza >= 0 && iZza < 10) {
                    long j10 = -iZza;
                    while (true) {
                        if (i12 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j10 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j10);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j10);
                            break;
                        }
                        int i13 = i12 + 1;
                        int iZza2 = zzhaj.zza(str.charAt(i12));
                        if (iZza2 >= 0 && iZza2 < 10 && j10 >= Buffer.OVERFLOW_ZONE) {
                            long j11 = j10 * 10;
                            long j12 = iZza2;
                            if (j11 >= Long.MIN_VALUE + j12) {
                                j10 = j11 - j12;
                                i12 = i13;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    static /* synthetic */ int zzi(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}
