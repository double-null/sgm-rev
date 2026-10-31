package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzepb implements zzhbt {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfki zzb;
    final /* synthetic */ zzfkf zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfry zze;
    final /* synthetic */ zzfkq zzf;
    final /* synthetic */ zzepd zzg;

    zzepb(zzepd zzepdVar, long j10, zzfki zzfkiVar, zzfkf zzfkfVar, String str, zzfry zzfryVar, zzfkq zzfkqVar) {
        this.zza = j10;
        this.zzb = zzfkiVar;
        this.zzc = zzfkfVar;
        this.zzd = str;
        this.zze = zzfryVar;
        this.zzf = zzfkqVar;
        Objects.requireNonNull(zzepdVar);
        this.zzg = zzepdVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[PHI: r8
      0x0061: PHI (r8v1 int) = (r8v0 int), (r8v3 int), (r8v3 int), (r8v3 int) binds: [B:16:0x002f, B:21:0x004a, B:23:0x004e, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a A[Catch: all -> 0x00f8, TryCatch #0 {, blocks: (B:30:0x0064, B:32:0x006a, B:34:0x0076, B:35:0x0079, B:36:0x0082, B:38:0x0094, B:39:0x00a9, B:41:0x00af, B:43:0x00b1, B:51:0x00ef, B:52:0x00f6, B:46:0x00d4, B:48:0x00d8, B:50:0x00e2), top: B:57:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[Catch: all -> 0x00f8, TryCatch #0 {, blocks: (B:30:0x0064, B:32:0x006a, B:34:0x0076, B:35:0x0079, B:36:0x0082, B:38:0x0094, B:39:0x00a9, B:41:0x00af, B:43:0x00b1, B:51:0x00ef, B:52:0x00f6, B:46:0x00d4, B:48:0x00d8, B:50:0x00e2), top: B:57:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x00f8, TryCatch #0 {, blocks: (B:30:0x0064, B:32:0x006a, B:34:0x0076, B:35:0x0079, B:36:0x0082, B:38:0x0094, B:39:0x00a9, B:41:0x00af, B:43:0x00b1, B:51:0x00ef, B:52:0x00f6, B:46:0x00d4, B:48:0x00d8, B:50:0x00e2), top: B:57:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x00f8, DONT_GENERATE, TryCatch #0 {, blocks: (B:30:0x0064, B:32:0x006a, B:34:0x0076, B:35:0x0079, B:36:0x0082, B:38:0x0094, B:39:0x00a9, B:41:0x00af, B:43:0x00b1, B:51:0x00ef, B:52:0x00f6, B:46:0x00d4, B:48:0x00d8, B:50:0x00e2), top: B:57:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1 A[Catch: all -> 0x00f8, TryCatch #0 {, blocks: (B:30:0x0064, B:32:0x006a, B:34:0x0076, B:35:0x0079, B:36:0x0082, B:38:0x0094, B:39:0x00a9, B:41:0x00af, B:43:0x00b1, B:51:0x00ef, B:52:0x00f6, B:46:0x00d4, B:48:0x00d8, B:50:0x00e2), top: B:57:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th) {
        Integer numValueOf;
        int i10;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i11;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzepd zzepdVar = this.zzg;
        long jElapsedRealtime = zzepdVar.zzj().elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i10 = 2;
        } else if (th instanceof zzeol) {
            i10 = 3;
        } else {
            if (!(th instanceof CancellationException)) {
                if (th instanceof zzflf) {
                    i10 = 5;
                } else {
                    int i12 = 6;
                    if (th instanceof zzeed) {
                        i12 = zzfma.zza(th).zza == 3 ? 1 : 6;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcn)).booleanValue() && (th instanceof zzelw) && (zzeVarZzb = ((zzelw) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    i10 = i12;
                }
                synchronized (zzepdVar) {
                    if (zzepdVar.zzn()) {
                        zzepdVar.zzk().zza(this.zzb, this.zzc, i10, th instanceof zzelw ? (zzelw) th : null, jElapsedRealtime);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjE)).booleanValue()) {
                        zzfsc zzfscVarZzl = zzepdVar.zzl();
                        zzfry zzfryVar = this.zze;
                        zzfkq zzfkqVar = this.zzf;
                        zzfkf zzfkfVar = this.zzc;
                        zzfscVarZzl.zza(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzn), zzfkfVar.zzax);
                    }
                    if (zzepdVar.zzp()) {
                        return;
                    }
                    LinkedHashMap linkedHashMapZzm = zzepdVar.zzm();
                    zzfkf zzfkfVar2 = this.zzc;
                    linkedHashMapZzm.put(zzfkfVar2, new zzepc(this.zzd, zzfkfVar2.zzaf, i10, jElapsedRealtime, numValueOf));
                    zzeVarZza = zzfma.zza(th);
                    i11 = zzeVarZza.zza;
                    if ((i11 != 3 || i11 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                    }
                    zzepdVar.zzo().zze(zzfkfVar2, jElapsedRealtime, zzeVarZza);
                }
            }
            i10 = 4;
        }
        numValueOf = null;
        synchronized (zzepdVar) {
            if (zzepdVar.zzn()) {
                zzepdVar.zzk().zza(this.zzb, this.zzc, i10, th instanceof zzelw ? (zzelw) th : null, jElapsedRealtime);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjE)).booleanValue()) {
                zzfsc zzfscVarZzl2 = zzepdVar.zzl();
                zzfry zzfryVar2 = this.zze;
                zzfkq zzfkqVar2 = this.zzf;
                zzfkf zzfkfVar3 = this.zzc;
                zzfscVarZzl2.zza(zzfryVar2.zza(zzfkqVar2, zzfkfVar3, zzfkfVar3.zzn), zzfkfVar3.zzax);
            }
            if (zzepdVar.zzp()) {
                return;
            }
            LinkedHashMap linkedHashMapZzm2 = zzepdVar.zzm();
            zzfkf zzfkfVar4 = this.zzc;
            linkedHashMapZzm2.put(zzfkfVar4, new zzepc(this.zzd, zzfkfVar4.zzaf, i10, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfma.zza(th);
            i11 = zzeVarZza.zza;
            zzeVarZza = i11 != 3 ? zzfma.zza(new zzelw(13, zzeVarZza.zzd)) : zzfma.zza(new zzelw(13, zzeVarZza.zzd));
            zzepdVar.zzo().zze(zzfkfVar4, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(Object obj) {
        zzepd zzepdVar = this.zzg;
        long jElapsedRealtime = zzepdVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzepdVar) {
            if (zzepdVar.zzn()) {
                zzepdVar.zzk().zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
            }
            if (zzepdVar.zzp()) {
                return;
            }
            zzfkf zzfkfVar = this.zzc;
            if (zzepdVar.zzi(zzfkfVar)) {
                ((zzepc) zzepdVar.zzm().get(zzfkfVar)).zzd = jElapsedRealtime;
            } else {
                zzepdVar.zzm().put(zzfkfVar, new zzepc(this.zzd, zzfkfVar.zzaf, 0, jElapsedRealtime, null));
            }
            zzepdVar.zzo().zzd(zzfkfVar, jElapsedRealtime, null);
        }
    }
}
