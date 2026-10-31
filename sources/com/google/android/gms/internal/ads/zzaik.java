package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaik extends zzaim {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaik() {
        super(new zzafv());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzet zzetVar) {
        return Double.valueOf(Double.longBitsToDouble(zzetVar.zzD()));
    }

    private static String zzh(zzet zzetVar) {
        int iZzt = zzetVar.zzt();
        int iZzg = zzetVar.zzg();
        zzetVar.zzk(iZzt);
        return new String(zzetVar.zzi(), iZzg, iZzt);
    }

    private static HashMap zzi(zzet zzetVar) {
        int iZzH = zzetVar.zzH();
        HashMap map = new HashMap(iZzH);
        for (int i10 = 0; i10 < iZzH; i10++) {
            String strZzh = zzh(zzetVar);
            Object objZzj = zzj(zzetVar, zzetVar.zzs());
            if (objZzj != null) {
                map.put(strZzh, objZzj);
            }
        }
        return map;
    }

    private static Object zzj(zzet zzetVar, int i10) {
        if (i10 == 0) {
            return zzg(zzetVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(zzetVar.zzs() == 1);
        }
        if (i10 == 2) {
            return zzh(zzetVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return zzi(zzetVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzetVar).doubleValue());
                zzetVar.zzk(2);
                return date;
            }
            int iZzH = zzetVar.zzH();
            ArrayList arrayList = new ArrayList(iZzH);
            for (int i11 = 0; i11 < iZzH; i11++) {
                Object objZzj = zzj(zzetVar, zzetVar.zzs());
                if (objZzj != null) {
                    arrayList.add(objZzj);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzh = zzh(zzetVar);
            int iZzs = zzetVar.zzs();
            if (iZzs == 9) {
                return map;
            }
            Object objZzj2 = zzj(zzetVar, iZzs);
            if (objZzj2 != null) {
                map.put(strZzh, objZzj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zza(zzet zzetVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zzb(zzet zzetVar, long j10) {
        if (zzetVar.zzs() == 2 && "onMetaData".equals(zzh(zzetVar)) && zzetVar.zzd() != 0 && zzetVar.zzs() == 8) {
            HashMap mapZzi = zzi(zzetVar);
            Object obj = mapZzi.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }
}
