package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzidt {
    private static final zzidt zzd = new zzidt(true);
    final zzign zza = new zzigj();
    boolean zzb;
    boolean zzc;

    private zzidt() {
    }

    public static zzidt zza() {
        return zzd;
    }

    static void zzf(zzidj zzidjVar, zzihg zzihgVar, int i10, Object obj) throws IOException {
        if (zzihgVar == zzihg.zzj) {
            zzidjVar.zzb(i10, 3);
            ((zzifp) obj).zzcX(zzidjVar);
            zzidjVar.zzb(i10, 4);
            return;
        }
        zzidjVar.zzb(i10, zzihgVar.zzb());
        zzihh zzihhVar = zzihh.INT;
        switch (zzihgVar.ordinal()) {
            case 0:
                zzidjVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzidjVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzidjVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzidjVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzidjVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzidjVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzidjVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzidjVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzida)) {
                    zzidjVar.zzw((String) obj);
                } else {
                    zzidjVar.zzk((zzida) obj);
                }
                break;
            case 9:
                ((zzifp) obj).zzcX(zzidjVar);
                break;
            case 10:
                zzidjVar.zzo((zzifp) obj);
                break;
            case 11:
                if (!(obj instanceof zzida)) {
                    byte[] bArr = (byte[]) obj;
                    zzidjVar.zzl(bArr, 0, bArr.length);
                } else {
                    zzidjVar.zzk((zzida) obj);
                }
                break;
            case 12:
                zzidjVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zziei)) {
                    zzidjVar.zzq(((Integer) obj).intValue());
                } else {
                    zzidjVar.zzq(((zziei) obj).zza());
                }
                break;
            case 14:
                zzidjVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzidjVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzidjVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzidjVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int zzh(zzihg zzihgVar, int i10, Object obj) {
        int iZzF = zzidj.zzF(i10 << 3);
        if (zzihgVar == zzihg.zzj) {
            iZzF += iZzF;
        }
        return iZzF + zzi(zzihgVar, obj);
    }

    static int zzi(zzihg zzihgVar, Object obj) {
        int iZzc;
        int iZzF;
        zzihg zzihgVar2 = zzihg.zza;
        zzihh zzihhVar = zzihh.INT;
        switch (zzihgVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = zzidj.zzb;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = zzidj.zzb;
                return 4;
            case 2:
                return zzidj.zzG(((Long) obj).longValue());
            case 3:
                return zzidj.zzG(((Long) obj).longValue());
            case 4:
                return zzidj.zzG(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = zzidj.zzb;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = zzidj.zzb;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = zzidj.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzida)) {
                    int i15 = zzidj.zzb;
                    iZzc = zzihf.zzc((String) obj);
                    iZzF = zzidj.zzF(iZzc);
                } else {
                    int i16 = zzidj.zzb;
                    iZzc = ((zzida) obj).zzb();
                    iZzF = zzidj.zzF(iZzc);
                }
                break;
            case 9:
                return ((zzifp) obj).zzbr();
            case 10:
                if (!(obj instanceof zziey)) {
                    return zzidj.zzH((zzifp) obj);
                }
                iZzc = ((zziey) obj).zzb();
                iZzF = zzidj.zzF(iZzc);
                break;
                break;
            case 11:
                if (!(obj instanceof zzida)) {
                    int i17 = zzidj.zzb;
                    iZzc = ((byte[]) obj).length;
                    iZzF = zzidj.zzF(iZzc);
                } else {
                    int i18 = zzidj.zzb;
                    iZzc = ((zzida) obj).zzb();
                    iZzF = zzidj.zzF(iZzc);
                }
                break;
            case 12:
                return zzidj.zzF(((Integer) obj).intValue());
            case 13:
                return obj instanceof zziei ? zzidj.zzG(((zziei) obj).zza()) : zzidj.zzG(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i19 = zzidj.zzb;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i20 = zzidj.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzidj.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzidj.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzF + iZzc;
    }

    public static int zzj(zzids zzidsVar, Object obj) {
        zzihg zzihgVarZzb = zzidsVar.zzb();
        int iZza = zzidsVar.zza();
        if (!zzidsVar.zzd()) {
            return zzh(zzihgVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzidsVar.zze()) {
            int iZzh = 0;
            while (i10 < size) {
                iZzh += zzh(zzihgVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i10 < size) {
            iZzi += zzi(zzihgVarZzb, list.get(i10));
            i10++;
        }
        return zzidj.zzF(iZza << 3) + iZzi + zzidj.zzF(iZzi);
    }

    private static boolean zzk(Map.Entry entry) {
        zzids zzidsVar = (zzids) entry.getKey();
        if (zzidsVar.zzc() != zzihh.MESSAGE) {
            return true;
        }
        if (!zzidsVar.zzd()) {
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
        if (obj instanceof zzifq) {
            return ((zzifq) obj).zzbi();
        }
        if (obj instanceof zziey) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzF;
        int iZzF2;
        zzids zzidsVar = (zzids) entry.getKey();
        Object value = entry.getValue();
        if (zzidsVar.zzc() != zzihh.MESSAGE || zzidsVar.zzd() || zzidsVar.zze()) {
            return zzj(zzidsVar, value);
        }
        if (value instanceof zziey) {
            int iZza = ((zzids) entry.getKey()).zza();
            int iZzF3 = zzidj.zzF(8);
            i10 = iZzF3 + iZzF3;
            iZzF = zzidj.zzF(16) + zzidj.zzF(iZza);
            int iZzF4 = zzidj.zzF(24);
            int iZzb = ((zziey) value).zzb();
            iZzF2 = iZzF4 + zzidj.zzF(iZzb) + iZzb;
        } else {
            int iZza2 = ((zzids) entry.getKey()).zza();
            int iZzF5 = zzidj.zzF(8);
            i10 = iZzF5 + iZzF5;
            iZzF = zzidj.zzF(16) + zzidj.zzF(iZza2);
            iZzF2 = zzidj.zzF(24) + zzidj.zzH((zzifp) value);
        }
        return i10 + iZzF + iZzF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzn(zzids zzidsVar, Object obj) {
        boolean z10;
        zzidsVar.zzb();
        obj.getClass();
        zzihg zzihgVar = zzihg.zza;
        zzihh zzihhVar = zzihh.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzida) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zziei)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzifp) || (obj instanceof zziey)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzidt zzidtVar = new zzidt();
        zzign zzignVar = this.zza;
        int iZzc = zzignVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzd = zzignVar.zzd(i10);
            zzidtVar.zzd((zzids) ((zzigk) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzignVar.zze()) {
            zzidtVar.zzd((zzids) entry.getKey(), entry.getValue());
        }
        zzidtVar.zzc = this.zzc;
        return zzidtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzidt) {
            return this.zza.equals(((zzidt) obj).zza);
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
        zzign zzignVar = this.zza;
        int iZzc = zzignVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzignVar.zzd(i10).getValue();
            if (value instanceof zziee) {
                ((zziee) value).zzbm();
            }
        }
        Iterator it = zzignVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zziee) {
                ((zziee) value2).zzbm();
            }
        }
        zzignVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzign zzignVar = this.zza;
        if (zzignVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zziex(zzignVar.entrySet().iterator()) : zzignVar.entrySet().iterator();
    }

    public final void zzd(zzids zzidsVar, Object obj) {
        if (!zzidsVar.zzd()) {
            zzn(zzidsVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzidsVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zziey) {
            this.zzc = true;
        }
        this.zza.put(zzidsVar, obj);
    }

    public final boolean zze() {
        zzign zzignVar = this.zza;
        int iZzc = zzignVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzignVar.zzd(i10))) {
                return false;
            }
        }
        Iterator it = zzignVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzign zzignVar = this.zza;
        int iZzc = zzignVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzignVar.zzd(i10));
        }
        Iterator it = zzignVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzidt(boolean z10) {
        zzb();
        zzb();
    }
}
