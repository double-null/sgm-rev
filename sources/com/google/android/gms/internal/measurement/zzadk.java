package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadk {
    private static final zzadk zzd = new zzadk(true);
    final zzafv zza = new zzafr();
    boolean zzb;
    boolean zzc;

    private zzadk() {
    }

    public static zzadk zza() {
        return zzd;
    }

    static void zzf(zzada zzadaVar, zzagm zzagmVar, int i10, Object obj) throws IOException {
        if (zzagmVar == zzagm.zzj) {
            zzadaVar.zzb(i10, 3);
            ((zzafc) obj).zzcH(zzadaVar);
            zzadaVar.zzb(i10, 4);
            return;
        }
        zzadaVar.zzb(i10, zzagmVar.zzb());
        zzagn zzagnVar = zzagn.INT;
        switch (zzagmVar.ordinal()) {
            case 0:
                zzadaVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzadaVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzadaVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzadaVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzadaVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzadaVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzadaVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzadaVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    zzadaVar.zzw((String) obj);
                } else {
                    zzadaVar.zzk((zzacr) obj);
                }
                break;
            case 9:
                ((zzafc) obj).zzcH(zzadaVar);
                break;
            case 10:
                zzadaVar.zzo((zzafc) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    zzadaVar.zzl(bArr, 0, bArr.length);
                } else {
                    zzadaVar.zzk((zzacr) obj);
                }
                break;
            case 12:
                zzadaVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzady)) {
                    zzadaVar.zzq(((Integer) obj).intValue());
                } else {
                    zzadaVar.zzq(((zzady) obj).zza());
                }
                break;
            case 14:
                zzadaVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzadaVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzadaVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzadaVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzagm zzagmVar, int i10, Object obj) {
        int iZzE = zzada.zzE(i10 << 3);
        if (zzagmVar == zzagm.zzj) {
            iZzE += iZzE;
        }
        return iZzE + zzi(zzagmVar, obj);
    }

    static int zzi(zzagm zzagmVar, Object obj) {
        int iZzb;
        int iZzE;
        zzagm zzagmVar2 = zzagm.zza;
        zzagn zzagnVar = zzagn.INT;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = zzada.zzb;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = zzada.zzb;
                return 4;
            case 2:
                return zzada.zzF(((Long) obj).longValue());
            case 3:
                return zzada.zzF(((Long) obj).longValue());
            case 4:
                return zzada.zzF(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = zzada.zzb;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = zzada.zzb;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = zzada.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzacr)) {
                    int i15 = zzada.zzb;
                    iZzb = zzagl.zzb((String) obj);
                    iZzE = zzada.zzE(iZzb);
                } else {
                    int i16 = zzada.zzb;
                    iZzb = ((zzacr) obj).zzb();
                    iZzE = zzada.zzE(iZzb);
                }
                break;
            case 9:
                return ((zzafc) obj).zzcq();
            case 10:
                if (!(obj instanceof zzael)) {
                    return zzada.zzG((zzafc) obj);
                }
                iZzb = ((zzael) obj).zzb();
                iZzE = zzada.zzE(iZzb);
                break;
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    int i17 = zzada.zzb;
                    iZzb = ((byte[]) obj).length;
                    iZzE = zzada.zzE(iZzb);
                } else {
                    int i18 = zzada.zzb;
                    iZzb = ((zzacr) obj).zzb();
                    iZzE = zzada.zzE(iZzb);
                }
                break;
            case 12:
                return zzada.zzE(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzady ? zzada.zzF(((zzady) obj).zza()) : zzada.zzF(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i19 = zzada.zzb;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i20 = zzada.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzada.zzE((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzada.zzF((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzE + iZzb;
    }

    public static int zzj(zzadj zzadjVar, Object obj) {
        zzagm zzagmVarZzb = zzadjVar.zzb();
        int iZza = zzadjVar.zza();
        if (!zzadjVar.zzd()) {
            return zzh(zzagmVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzadjVar.zze()) {
            int iZzh = 0;
            while (i10 < size) {
                iZzh += zzh(zzagmVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i10 < size) {
            iZzi += zzi(zzagmVarZzb, list.get(i10));
            i10++;
        }
        return zzada.zzE(iZza << 3) + iZzi + zzada.zzE(iZzi);
    }

    private static boolean zzk(Map.Entry entry) {
        zzadj zzadjVar = (zzadj) entry.getKey();
        if (zzadjVar.zzc() != zzagn.MESSAGE) {
            return true;
        }
        if (!zzadjVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzl(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzafd) {
            return ((zzafd) obj).zzcJ();
        }
        if (obj instanceof zzael) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzE;
        int iZzE2;
        zzadj zzadjVar = (zzadj) entry.getKey();
        Object value = entry.getValue();
        if (zzadjVar.zzc() != zzagn.MESSAGE || zzadjVar.zzd() || zzadjVar.zze()) {
            return zzj(zzadjVar, value);
        }
        if (value instanceof zzael) {
            int iZza = ((zzadj) entry.getKey()).zza();
            int iZzE3 = zzada.zzE(8);
            i10 = iZzE3 + iZzE3;
            iZzE = zzada.zzE(16) + zzada.zzE(iZza);
            int iZzE4 = zzada.zzE(24);
            int iZzb = ((zzael) value).zzb();
            iZzE2 = iZzE4 + zzada.zzE(iZzb) + iZzb;
        } else {
            int iZza2 = ((zzadj) entry.getKey()).zza();
            int iZzE5 = zzada.zzE(8);
            i10 = iZzE5 + iZzE5;
            iZzE = zzada.zzE(16) + zzada.zzE(iZza2);
            iZzE2 = zzada.zzE(24) + zzada.zzG((zzafc) value);
        }
        return i10 + iZzE + iZzE2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzn(zzadj zzadjVar, Object obj) {
        boolean z10;
        zzadjVar.zzb();
        obj.getClass();
        zzagm zzagmVar = zzagm.zza;
        zzagn zzagnVar = zzagn.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case zzc:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzacr) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzady)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzafc) || (obj instanceof zzael)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzadjVar.zza()), zzadjVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzadk zzadkVar = new zzadk();
        zzafv zzafvVar = this.zza;
        int iZzc = zzafvVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzd = zzafvVar.zzd(i10);
            zzadkVar.zzd((zzadj) ((zzafs) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzafvVar.zze()) {
            zzadkVar.zzd((zzadj) entry.getKey(), entry.getValue());
        }
        zzadkVar.zzc = this.zzc;
        return zzadkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzadk) {
            return this.zza.equals(((zzadk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzafv zzafvVar = this.zza;
        int iZzc = zzafvVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzafvVar.zzd(i10).getValue();
            if (value instanceof zzadu) {
                ((zzadu) value).zzcm();
            }
        }
        Iterator it = zzafvVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzadu) {
                ((zzadu) value2).zzcm();
            }
        }
        zzafvVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzafv zzafvVar = this.zza;
        if (zzafvVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzaek(zzafvVar.entrySet().iterator()) : zzafvVar.entrySet().iterator();
    }

    public final void zzd(zzadj zzadjVar, Object obj) {
        if (!zzadjVar.zzd()) {
            zzn(zzadjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzadjVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzael) {
            this.zzc = true;
        }
        this.zza.put(zzadjVar, obj);
    }

    public final boolean zze() {
        zzafv zzafvVar = this.zza;
        int iZzc = zzafvVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzafvVar.zzd(i10))) {
                return false;
            }
        }
        Iterator it = zzafvVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzafv zzafvVar = this.zza;
        int iZzc = zzafvVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzafvVar.zzd(i10));
        }
        Iterator it = zzafvVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzadk(boolean z10) {
        zzb();
        zzb();
    }
}
