package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhx {
    public static final /* synthetic */ int zza = 0;
    private static final zzil zzb;

    static {
        int i10 = zzet.zza;
        zzb = new zzin();
    }

    public static void zzA(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzD(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzF(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzK(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzM(i10, list, z10);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    static int zza(int i10, zzhm zzhmVar, zzhw zzhwVar) {
        int iZzy = zzfo.zzy(i10 << 3);
        return iZzy + iZzy + ((zzer) zzhmVar).zzi(zzhwVar);
    }

    static int zzb(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgh) {
            zzgh zzghVar = (zzgh) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(zzghVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzz;
    }

    static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfo.zzy(i10 << 3) + 4);
    }

    static int zzd(List list) {
        return list.size() * 4;
    }

    static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfo.zzy(i10 << 3) + 8);
    }

    static int zzf(List list) {
        return list.size() * 8;
    }

    static int zzg(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgh) {
            zzgh zzghVar = (zzgh) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(zzghVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzz;
    }

    static int zzh(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzha) {
            zzha zzhaVar = (zzha) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(zzhaVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzz;
    }

    static int zzi(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgh) {
            zzgh zzghVar = (zzgh) list;
            iZzy = 0;
            while (i10 < size) {
                int iZze = zzghVar.zze(i10);
                iZzy += zzfo.zzy((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzy += zzfo.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzy;
    }

    static int zzj(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzha) {
            zzha zzhaVar = (zzha) list;
            iZzz = 0;
            while (i10 < size) {
                long jZze = zzhaVar.zze(i10);
                iZzz += zzfo.zzz((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzz += zzfo.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzz;
    }

    static int zzk(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgh) {
            zzgh zzghVar = (zzgh) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzfo.zzy(zzghVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzfo.zzy(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzy;
    }

    static int zzl(List list) {
        int iZzz;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzha) {
            zzha zzhaVar = (zzha) list;
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(zzhaVar.zze(i10));
                i10++;
            }
        } else {
            iZzz = 0;
            while (i10 < size) {
                iZzz += zzfo.zzz(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzz;
    }

    public static zzil zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i10, int i11, Object obj2, zzil zzilVar) {
        if (obj2 == null) {
            obj2 = zzilVar.zza(obj);
        }
        ((zzim) obj2).zzj(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    static void zzo(zzfu zzfuVar, Object obj, Object obj2) {
        if (((zzgd) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zzil zzilVar, Object obj, Object obj2) {
        zzgg zzggVar = (zzgg) obj;
        zzim zzimVarZze = zzggVar.zzc;
        zzim zzimVar = ((zzgg) obj2).zzc;
        if (!zzim.zzc().equals(zzimVar)) {
            if (zzim.zzc().equals(zzimVarZze)) {
                zzimVarZze = zzim.zze(zzimVarZze, zzimVar);
            } else {
                zzimVarZze.zzd(zzimVar);
            }
        }
        zzggVar.zzc = zzimVarZze;
    }

    public static void zzq(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzc(i10, list, z10);
    }

    public static void zzr(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzg(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzj(i10, list, z10);
    }

    public static void zzt(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzl(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzn(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzp(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzs(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzu(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzz(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzjd zzjdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjdVar.zzB(i10, list, z10);
    }
}
