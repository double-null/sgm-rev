package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafq {
    public static final /* synthetic */ int zza = 0;
    private static final zzafz zzb;

    static {
        int i10 = zzacf.zza;
        zzb = new zzagb();
    }

    @Deprecated
    static int zzA(int i10, zzafc zzafcVar, zzafp zzafpVar) {
        int iZzE = zzada.zzE(i10 << 3);
        return iZzE + iZzE + ((zzacb) zzafcVar).zzcf(zzafpVar);
    }

    public static zzafz zzB() {
        return zzb;
    }

    static boolean zzC(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzD(zzadg zzadgVar, Object obj, Object obj2) {
        if (((zzadr) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzE(zzafz zzafzVar, Object obj, Object obj2) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVarZzc = zzaduVar.zzc;
        zzaga zzagaVar = ((zzadu) obj2).zzc;
        if (!zzaga.zza().equals(zzagaVar)) {
            if (zzaga.zza().equals(zzagaVarZzc)) {
                zzagaVarZzc = zzaga.zzc(zzagaVarZzc, zzagaVar);
            } else {
                zzagaVarZzc.zzl(zzagaVar);
            }
        }
        zzaduVar.zzc = zzagaVarZzc;
    }

    static Object zzF(Object obj, int i10, List list, zzadz zzadzVar, Object obj2, zzafz zzafzVar) {
        if (zzadzVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzadzVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj2 = zzG(obj, i10, iIntValue, obj2, zzafzVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzadzVar.zza(iIntValue2)) {
                    obj2 = zzG(obj, i10, iIntValue2, obj2, zzafzVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzG(Object obj, int i10, int i11, Object obj2, zzafz zzafzVar) {
        if (obj2 == null) {
            obj2 = zzafzVar.zzh(obj);
        }
        zzafzVar.zza(obj2, i10, i11);
        return obj2;
    }

    public static void zza(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzago zzagoVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzE(i10, list, z10);
    }

    static int zzo(List list) {
        int iZzF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(zzaeqVar.zzc(i10));
                i10++;
            }
        } else {
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzF;
    }

    static int zzp(List list) {
        int iZzF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(zzaeqVar.zzc(i10));
                i10++;
            }
        } else {
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzF;
    }

    static int zzq(List list) {
        int iZzF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            iZzF = 0;
            while (i10 < size) {
                long jZzc = zzaeqVar.zzc(i10);
                iZzF += zzada.zzF((jZzc >> 63) ^ (jZzc + jZzc));
                i10++;
            }
        } else {
            iZzF = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzF += zzada.zzF((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzF;
    }

    static int zzr(List list) {
        int iZzF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadv) {
            zzadv zzadvVar = (zzadv) list;
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(zzadvVar.zzf(i10));
                i10++;
            }
        } else {
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzF;
    }

    static int zzs(List list) {
        int iZzF;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadv) {
            zzadv zzadvVar = (zzadv) list;
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(zzadvVar.zzf(i10));
                i10++;
            }
        } else {
            iZzF = 0;
            while (i10 < size) {
                iZzF += zzada.zzF(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzF;
    }

    static int zzt(List list) {
        int iZzE;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadv) {
            zzadv zzadvVar = (zzadv) list;
            iZzE = 0;
            while (i10 < size) {
                iZzE += zzada.zzE(zzadvVar.zzf(i10));
                i10++;
            }
        } else {
            iZzE = 0;
            while (i10 < size) {
                iZzE += zzada.zzE(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzE;
    }

    static int zzu(List list) {
        int iZzE;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadv) {
            zzadv zzadvVar = (zzadv) list;
            iZzE = 0;
            while (i10 < size) {
                int iZzf = zzadvVar.zzf(i10);
                iZzE += zzada.zzE((iZzf >> 31) ^ (iZzf + iZzf));
                i10++;
            }
        } else {
            iZzE = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzE += zzada.zzE((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzE;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzada.zzE(i10 << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzada.zzE(i10 << 3) + 8);
    }

    static int zzz(int i10, Object obj, zzafp zzafpVar) {
        int iZzE;
        int iZzcf;
        int iZzE2;
        int i11 = i10 << 3;
        if (obj instanceof zzaem) {
            iZzE = zzada.zzE(i11);
            iZzcf = ((zzaem) obj).zzb();
            iZzE2 = zzada.zzE(iZzcf);
        } else {
            iZzE = zzada.zzE(i11);
            iZzcf = ((zzacb) obj).zzcf(zzafpVar);
            iZzE2 = zzada.zzE(iZzcf);
        }
        return iZzE + iZzE2 + iZzcf;
    }
}
