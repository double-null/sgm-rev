package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfy {
    private static final zzfy zzd = new zzfy(true);
    final zzid zza = new zzhy();
    boolean zzb;
    boolean zzc;

    private zzfy() {
    }

    static int zza(zzjb zzjbVar, int i10, Object obj) {
        int iZzy = zzfo.zzy(i10 << 3);
        if (zzjbVar == zzjb.zzj) {
            iZzy += iZzy;
        }
        return iZzy + zzb(zzjbVar, obj);
    }

    static int zzb(zzjb zzjbVar, Object obj) {
        int iZzb;
        int iZzy;
        zzjb zzjbVar2 = zzjb.zza;
        zzjc zzjcVar = zzjc.INT;
        switch (zzjbVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i10 = zzfo.zzb;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i11 = zzfo.zzb;
                return 4;
            case 2:
                return zzfo.zzz(((Long) obj).longValue());
            case 3:
                return zzfo.zzz(((Long) obj).longValue());
            case 4:
                return zzfo.zzz(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i12 = zzfo.zzb;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i13 = zzfo.zzb;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i14 = zzfo.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzfg)) {
                    int i15 = zzfo.zzb;
                    int i16 = zzix.zza;
                    iZzb = zziu.zzb((String) obj);
                    iZzy = zzfo.zzy(iZzb);
                } else {
                    int i17 = zzfo.zzb;
                    iZzb = ((zzfg) obj).zzd();
                    iZzy = zzfo.zzy(iZzb);
                }
                break;
            case 9:
                return ((zzhm) obj).zzn();
            case 10:
                return obj instanceof zzgq ? ((zzgq) obj).zzc() : zzfo.zzx((zzhm) obj);
            case 11:
                if (!(obj instanceof zzfg)) {
                    int i18 = zzfo.zzb;
                    iZzb = ((byte[]) obj).length;
                    iZzy = zzfo.zzy(iZzb);
                } else {
                    int i19 = zzfo.zzb;
                    iZzb = ((zzfg) obj).zzd();
                    iZzy = zzfo.zzy(iZzb);
                }
                break;
            case 12:
                return zzfo.zzy(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgi ? zzfo.zzz(((zzgi) obj).zza()) : zzfo.zzz(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i20 = zzfo.zzb;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i21 = zzfo.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzfo.zzy((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzfo.zzz((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzy + iZzb;
    }

    public static int zzc(zzfx zzfxVar, Object obj) {
        zzjb zzjbVarZzb = zzfxVar.zzb();
        int iZza = zzfxVar.zza();
        if (!zzfxVar.zze()) {
            return zza(zzjbVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzfxVar.zzd()) {
            int iZza2 = 0;
            while (i10 < size) {
                iZza2 += zza(zzjbVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i10 < size) {
            iZzb += zzb(zzjbVarZzb, list.get(i10));
            i10++;
        }
        return zzfo.zzy(iZza << 3) + iZzb + zzfo.zzy(iZzb);
    }

    public static zzfy zze() {
        return zzd;
    }

    static void zzi(zzfo zzfoVar, zzjb zzjbVar, int i10, Object obj) throws IOException {
        if (zzjbVar == zzjb.zzj) {
            zzfoVar.zzs(i10, 3);
            ((zzhm) obj).zzD(zzfoVar);
            zzfoVar.zzs(i10, 4);
            return;
        }
        zzfoVar.zzs(i10, zzjbVar.zza());
        zzjc zzjcVar = zzjc.INT;
        switch (zzjbVar.ordinal()) {
            case 0:
                zzfoVar.zzk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzfoVar.zzi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzfoVar.zzw(((Long) obj).longValue());
                break;
            case 3:
                zzfoVar.zzw(((Long) obj).longValue());
                break;
            case 4:
                zzfoVar.zzm(((Integer) obj).intValue());
                break;
            case 5:
                zzfoVar.zzk(((Long) obj).longValue());
                break;
            case 6:
                zzfoVar.zzi(((Integer) obj).intValue());
                break;
            case 7:
                zzfoVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzfg)) {
                    zzfoVar.zzr((String) obj);
                } else {
                    zzfoVar.zzg((zzfg) obj);
                }
                break;
            case 9:
                ((zzhm) obj).zzD(zzfoVar);
                break;
            case 10:
                zzfoVar.zzn((zzhm) obj);
                break;
            case 11:
                if (!(obj instanceof zzfg)) {
                    byte[] bArr = (byte[]) obj;
                    zzfoVar.zze(bArr, 0, bArr.length);
                } else {
                    zzfoVar.zzg((zzfg) obj);
                }
                break;
            case 12:
                zzfoVar.zzu(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzgi)) {
                    zzfoVar.zzm(((Integer) obj).intValue());
                } else {
                    zzfoVar.zzm(((zzgi) obj).zza());
                }
                break;
            case 14:
                zzfoVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzfoVar.zzk(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzfoVar.zzu((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzfoVar.zzw((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzfx zzfxVar = (zzfx) entry.getKey();
        if (zzfxVar.zzc() != zzjc.MESSAGE) {
            return true;
        }
        if (!zzfxVar.zze()) {
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
        if (obj instanceof zzhn) {
            return ((zzhn) obj).zzo();
        }
        if (obj instanceof zzgq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        zzfx zzfxVar = (zzfx) entry.getKey();
        Object value = entry.getValue();
        if (zzfxVar.zzc() != zzjc.MESSAGE || zzfxVar.zze() || zzfxVar.zzd()) {
            return zzc(zzfxVar, value);
        }
        if (value instanceof zzgq) {
            return ((zzgq) value).zza(((zzfx) entry.getKey()).zza());
        }
        int iZza = ((zzfx) entry.getKey()).zza();
        int iZzy = zzfo.zzy(8);
        return iZzy + iZzy + zzfo.zzy(16) + zzfo.zzy(iZza) + zzfo.zzy(24) + zzfo.zzx((zzhm) value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzn(zzfx zzfxVar, Object obj) {
        boolean z10;
        zzfxVar.zzb();
        obj.getClass();
        zzjb zzjbVar = zzjb.zza;
        zzjc zzjcVar = zzjc.INT;
        switch (r0.zzb()) {
            case INT:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case LONG:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case FLOAT:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case DOUBLE:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case STRING:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzfg) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzgi)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhm) || (obj instanceof zzgq)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzfxVar.zza()), zzfxVar.zzb().zzb(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfy zzfyVar = new zzfy();
        zzid zzidVar = this.zza;
        int iZzc = zzidVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzg = zzidVar.zzg(i10);
            zzfyVar.zzh((zzfx) ((zzhz) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzidVar.zzd()) {
            zzfyVar.zzh((zzfx) entry.getKey(), entry.getValue());
        }
        zzfyVar.zzc = this.zzc;
        return zzfyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfy) {
            return this.zza.equals(((zzfy) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzid zzidVar = this.zza;
        int iZzc = zzidVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzidVar.zzg(i10));
        }
        Iterator it = zzidVar.zzd().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    public final Iterator zzf() {
        zzid zzidVar = this.zza;
        if (zzidVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzc ? new zzgo(zzidVar.entrySet().iterator()) : zzidVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzid zzidVar = this.zza;
        int iZzc = zzidVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzidVar.zzg(i10).getValue();
            if (value instanceof zzgg) {
                ((zzgg) value).zzz();
            }
        }
        Iterator it = zzidVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgg) {
                ((zzgg) value2).zzz();
            }
        }
        zzidVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzfx zzfxVar, Object obj) {
        if (!zzfxVar.zze()) {
            zzn(zzfxVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzfxVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgq) {
            this.zzc = true;
        }
        this.zza.put(zzfxVar, obj);
    }

    public final boolean zzj() {
        zzid zzidVar = this.zza;
        int iZzc = zzidVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzidVar.zzg(i10))) {
                return false;
            }
        }
        Iterator it = zzidVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzfy(boolean z10) {
        zzg();
        zzg();
    }
}
