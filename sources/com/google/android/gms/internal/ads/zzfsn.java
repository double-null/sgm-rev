package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfsn {
    final AtomicBoolean zza = new AtomicBoolean(false);
    final Map zzb = new LinkedHashMap();
    final AtomicBoolean zzc = new AtomicBoolean(false);
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzftd zzg;
    private final Clock zzh;

    public zzfsn(com.google.android.gms.ads.internal.util.zzg zzgVar, ScheduledExecutorService scheduledExecutorService, zzftd zzftdVar, Clock clock) {
        this.zzd = zzgVar;
        this.zzf = scheduledExecutorService;
        this.zzg = zzftdVar;
        this.zzh = clock;
    }

    private final boolean zzA(zzfub zzfubVar) {
        if (this.zza.get() || zzfubVar.zzt() != 0 || !zzfubVar.zzu()) {
            return false;
        }
        zzfubVar.zze();
        return true;
    }

    private final int zzq() {
        int iZzR = this.zzd.zzR();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzN)).booleanValue() && iZzR > 0) {
            return iZzR;
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzX)).intValue();
    }

    private static String zzr(String str, AdFormat adFormat) {
        return String.format("%s:%s", str, adFormat);
    }

    private final void zzs(final zzfub zzfubVar) {
        if (zzfubVar.zzt() > 0 || zzfubVar.zzw()) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfse
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(zzfubVar);
                }
            });
        }
        this.zza.set(true);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
        }
        this.zzc.set(true);
    }

    private final boolean zzt(zzfub zzfubVar) {
        boolean z10;
        AdFormat adFormatZzq = zzfubVar.zzq();
        if (adFormatZzq == null) {
            return true;
        }
        Map map = this.zzb;
        synchronized (map) {
            z10 = !map.containsKey(zzr(zzfubVar.zzp(), adFormatZzq));
        }
        return z10;
    }

    private final boolean zzu() {
        zzgwm zzgwmVarZzq;
        Map map = this.zzb;
        synchronized (map) {
            zzgwmVarZzq = zzgwm.zzq(map.values());
        }
        int size = zzgwmVarZzq.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfub zzfubVar = (zzfub) zzgwmVarZzq.get(i10);
            if (zzfubVar.zzt() == 0 && zzfubVar.zzu()) {
                return true;
            }
        }
        return false;
    }

    private final void zzv(long j10) {
        if (this.zzc.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j10 > 0) {
                        this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsh
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzl();
                            }
                        }, j10, TimeUnit.MILLISECONDS);
                    } else {
                        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsg
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzk();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzn() {
        zzfub zzfubVar;
        zzgwm zzgwmVarZzq;
        if (this.zza.get()) {
            return;
        }
        synchronized (this) {
            zzfubVar = null;
            this.zze = null;
        }
        int iZzq = zzq();
        if (zzg() < iZzq || zzu()) {
            Map map = this.zzb;
            synchronized (map) {
                zzgwmVarZzq = zzgwm.zzq(map.values());
            }
            int size = zzgwmVarZzq.size();
            double d10 = Double.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                zzfub zzfubVar2 = (zzfub) zzgwmVarZzq.get(i10);
                if (zzfubVar2.zzu()) {
                    double dZzt = ((double) zzfubVar2.zzt()) / ((double) zzfubVar2.zzs());
                    if (dZzt < d10) {
                        d10 = dZzt;
                    }
                    if (dZzt < d10) {
                        zzfubVar = zzfubVar2;
                    }
                }
            }
            if (zzfubVar != null) {
                zzfubVar.zze();
                if (zzfubVar.zzt() > 0) {
                    this.zzg.zzq(this.zzh.currentTimeMillis(), zzfubVar.zzp(), zzfubVar.zzr(), zzfubVar.zzq(), zzfubVar.zzs(), zzfubVar.zzt(), zzg(), iZzq);
                }
            }
            if (zzg() >= iZzq) {
                zzy();
            }
            if (zzg() < iZzq || zzu()) {
                if (zzu()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzm();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzZ)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            zzy();
        }
        this.zzc.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        this.zza.set(false);
        zzn();
    }

    private final void zzy() {
        int size;
        Map map = this.zzb;
        synchronized (map) {
            size = map.size();
        }
        this.zzg.zzs(this.zzh.currentTimeMillis(), zzq(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzj(zzfub zzfubVar, int i10) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfubVar.zzp(), zzfubVar.zzr(), zzfubVar.zzq(), zzfubVar.zzs(), zzfubVar.zzt(), i10, zzg(), zzq());
    }

    public final void zza(zzfub zzfubVar) {
        int i10 = 1;
        if (zzfubVar.zzt() <= 0 && !zzfubVar.zzw()) {
            i10 = 0;
        }
        zzd(zzfubVar, i10);
    }

    public final void zzb(zzfub zzfubVar) {
        if (zzt(zzfubVar)) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzT)).booleanValue()) {
            zzs(zzfubVar);
            return;
        }
        long jZzC = zzfubVar.zzC();
        if (jZzC <= 0) {
            zza(zzfubVar);
            return;
        }
        zzs(zzfubVar);
        synchronized (this) {
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            }, jZzC, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzc(zzfub zzfubVar, boolean z10) {
        if (z10) {
            this.zzg.zzt(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzU)).longValue(), zzfubVar.zzq(), zzfubVar.zzp(), zzfubVar.zzr());
        } else {
            this.zzg.zzu(this.zzh.currentTimeMillis(), zzfubVar.zzq(), zzfubVar.zzp(), zzfubVar.zzr());
        }
        zzh();
    }

    public final void zzd(final zzfub zzfubVar, final int i10) {
        if (zzt(zzfubVar)) {
            return;
        }
        if (i10 > 0) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzj(zzfubVar, i10);
                }
            });
        }
        if (!zzA(zzfubVar)) {
            zzv(0L);
        } else {
            zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzY)).longValue());
        }
    }

    public final void zze(String str, AdFormat adFormat, final zzfub zzfubVar) {
        Map map = this.zzb;
        String strZzr = zzr(str, adFormat);
        synchronized (map) {
            if (map.containsKey(strZzr)) {
                return;
            }
            map.put(strZzr, zzfubVar);
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzfubVar);
                }
            });
        }
    }

    public final void zzf(final zzfub zzfubVar) {
        AdFormat adFormatZzq = zzfubVar.zzq();
        if (adFormatZzq == null) {
            return;
        }
        String strZzr = zzr(zzfubVar.zzp(), adFormatZzq);
        Map map = this.zzb;
        synchronized (map) {
            if (map.containsKey(strZzr)) {
                map.remove(strZzr);
                final int iZzx = zzfubVar.zzx();
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzp(iZzx, zzfubVar);
                    }
                });
            }
        }
    }

    final int zzg() {
        zzgwm zzgwmVarZzq;
        Map map = this.zzb;
        synchronized (map) {
            zzgwmVarZzq = zzgwm.zzq(map.values());
        }
        int size = zzgwmVarZzq.size();
        int iZzx = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzx += ((zzfub) zzgwmVarZzq.get(i10)).zzx();
        }
        return iZzx;
    }

    final /* synthetic */ void zzi(zzfub zzfubVar) {
        zzj(zzfubVar, 1);
    }

    final /* synthetic */ void zzo(zzfub zzfubVar) {
        zzA(zzfubVar);
        zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzY)).longValue());
    }

    final /* synthetic */ void zzp(int i10, zzfub zzfubVar) {
        if (i10 > 0) {
            zzj(zzfubVar, i10);
        }
        zzv(0L);
    }
}
