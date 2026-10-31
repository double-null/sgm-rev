package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfmo implements zzfmn {
    private final ConcurrentHashMap zza;
    private final zzfmu zzb;
    private final zzfmq zzc = new zzfmq();

    public zzfmo(zzfmu zzfmuVar) {
        this.zza = new ConcurrentHashMap(zzfmuVar.zzd);
        this.zzb = zzfmuVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfmu> creator = zzfmu.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhn)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zzfmu zzfmuVar = this.zzb;
            sb2.append(zzfmuVar.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzg());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfmx) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfmm) entry.getValue()).zzc(); i11++) {
                    sb2.append("[O]");
                }
                for (int iZzc = ((zzfmm) entry.getValue()).zzc(); iZzc < zzfmuVar.zzd; iZzc++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfmm) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < zzfmuVar.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final synchronized zzfmw zza(zzfmx zzfmxVar) {
        zzfmw zzfmwVarZzb;
        zzfmm zzfmmVar = (zzfmm) this.zza.get(zzfmxVar);
        if (zzfmmVar != null) {
            zzfmwVarZzb = zzfmmVar.zzb();
            if (zzfmwVarZzb == null) {
                this.zzc.zzb();
            }
            zzfnk zzfnkVarZzh = zzfmmVar.zzh();
            if (zzfmwVarZzb != null) {
                zzbhv.zzb.zzc zzcVarZzs = zzbhv.zzb.zzs();
                zzbhv.zzb.zza.C0136zza c0136zzaZzs = zzbhv.zzb.zza.zzs();
                c0136zzaZzs.zzc(zzbhv.zzb.zzd.IN_MEMORY);
                zzbhv.zzb.zze.zza zzaVarZzq = zzbhv.zzb.zze.zzq();
                zzaVarZzq.zzc(zzfnkVarZzh.zza);
                zzaVarZzq.zzg(zzfnkVarZzh.zzb);
                c0136zzaZzs.zzh(zzaVarZzq);
                zzcVarZzs.zzh(c0136zzaZzs);
                zzfmwVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfmwVarZzb = null;
        }
        return zzfmwVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final synchronized boolean zzb(zzfmx zzfmxVar, zzfmw zzfmwVar) {
        boolean zZza;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfmm zzfmmVar = (zzfmm) concurrentHashMap.get(zzfmxVar);
        zzfmwVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfmmVar == null) {
            zzfmu zzfmuVar = this.zzb;
            zzfmm zzfmmVar2 = new zzfmm(zzfmuVar.zzd, zzfmuVar.zze * 1000);
            if (concurrentHashMap.size() == zzfmuVar.zzc) {
                int i10 = zzfmuVar.zzg;
                int i11 = i10 - 1;
                zzfmx zzfmxVar2 = null;
                if (i10 == 0) {
                    throw null;
                }
                long jZzd = Long.MAX_VALUE;
                if (i11 == 0) {
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((zzfmm) entry.getValue()).zzd() < jZzd) {
                            jZzd = ((zzfmm) entry.getValue()).zzd();
                            zzfmxVar2 = (zzfmx) entry.getKey();
                        }
                    }
                    if (zzfmxVar2 != null) {
                        concurrentHashMap.remove(zzfmxVar2);
                    }
                } else if (i11 == 1) {
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((zzfmm) entry2.getValue()).zze() < jZzd) {
                            jZzd = ((zzfmm) entry2.getValue()).zze();
                            zzfmxVar2 = (zzfmx) entry2.getKey();
                        }
                    }
                    if (zzfmxVar2 != null) {
                        concurrentHashMap.remove(zzfmxVar2);
                    }
                } else if (i11 == 2) {
                    int iZzf = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((zzfmm) entry3.getValue()).zzf() < iZzf) {
                            iZzf = ((zzfmm) entry3.getValue()).zzf();
                            zzfmxVar2 = (zzfmx) entry3.getKey();
                        }
                    }
                    if (zzfmxVar2 != null) {
                        concurrentHashMap.remove(zzfmxVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzfmxVar, zzfmmVar2);
            this.zzc.zzc();
            zzfmmVar = zzfmmVar2;
        }
        zZza = zzfmmVar.zza(zzfmwVar);
        zzfmq zzfmqVar = this.zzc;
        zzfmqVar.zze();
        zzfmp zzfmpVarZzf = zzfmqVar.zzf();
        zzfnk zzfnkVarZzh = zzfmmVar.zzh();
        zzbhv.zzb.zzc zzcVarZzs = zzbhv.zzb.zzs();
        zzbhv.zzb.zza.C0136zza c0136zzaZzs = zzbhv.zzb.zza.zzs();
        c0136zzaZzs.zzc(zzbhv.zzb.zzd.IN_MEMORY);
        zzbhv.zzb.zzg.zza zzaVarZzs = zzbhv.zzb.zzg.zzs();
        zzaVarZzs.zzc(zzfmpVarZzf.zza);
        zzaVarZzs.zzg(zzfmpVarZzf.zzb);
        zzaVarZzs.zzk(zzfnkVarZzh.zzb);
        c0136zzaZzs.zzn(zzaVarZzs);
        zzcVarZzs.zzh(c0136zzaZzs);
        zzfmwVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
        zzf();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final synchronized boolean zzc(zzfmx zzfmxVar) {
        zzfmm zzfmmVar = (zzfmm) this.zza.get(zzfmxVar);
        if (zzfmmVar == null) {
            return true;
        }
        return zzfmmVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    @Deprecated
    public final zzfmx zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfmu zzfmuVar = this.zzb;
        return new zzfmy(zzmVar, str, new zzcbg(zzfmuVar.zza).zza().zzj, zzfmuVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final zzfmu zze() {
        return this.zzb;
    }
}
