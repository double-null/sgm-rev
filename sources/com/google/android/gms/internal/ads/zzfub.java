package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.gp.VRfCTjjLv;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfub {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzflu zzd;
    protected AtomicReference zze;
    protected final zzfsn zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzce zzh;
    protected final ScheduledExecutorService zzi;
    private com.google.android.gms.ads.internal.client.zzcb zzj;
    private final Queue zzk;
    private final zzfsw zzl;
    private final String zzm;
    private AtomicBoolean zzn;
    private final zzfoo zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzftd zzr;
    private final Clock zzs;
    private final zzftk zzt;

    public zzfub(ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock) {
        this("none", clientApi, context, i10, zzfluVar, zzfpVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, null);
        this.zzj = zzcbVar;
    }

    private final boolean zzR() {
        boolean zIsEmpty;
        Queue queue = this.zzk;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return zIsEmpty;
    }

    private final void zzS(boolean z10) {
        zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar != null) {
            if (z10) {
                this.zzl.zzc();
            }
            zzfsnVar.zza(this);
        } else {
            zzfsw zzfswVar = this.zzl;
            if (zzfswVar.zze()) {
                return;
            }
            if (z10) {
                zzfswVar.zzc();
            }
            this.zzi.schedule(new zzftp(this), zzfswVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzF() {
        int i10;
        int i11;
        Queue queue = this.zzk;
        synchronized (queue) {
            Iterator it = queue.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((zzftm) it.next()).zzb()) {
                    it.remove();
                    i10++;
                }
            }
            i11 = (i10 <= 0 || !queue.isEmpty()) ? i10 : i10 - 1;
        }
        zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar == null || i10 <= 0) {
            return;
        }
        zzfsnVar.zzd(this, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzV(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof zzdck) {
            return ((zzdck) zzdxVar).zzk();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    protected final void zzA(final int i10) {
        int size;
        zzfsn zzfsnVar;
        boolean z10 = true;
        int size2 = 0;
        Preconditions.checkArgument(i10 > 0);
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) this.zze.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.zzftw
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return ((com.google.android.gms.ads.internal.client.zzfp) obj).zza(i10);
            }
        });
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        int i11 = zzfpVar.zzd;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
            if (queue.size() <= i10) {
                z10 = false;
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzx)).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                while (size2 < i10) {
                    zzftm zzftmVar = (zzftm) queue.poll();
                    if (zzftmVar != null) {
                        arrayList.add(zzftmVar);
                    }
                    size2++;
                }
                queue.clear();
                queue.addAll(arrayList);
                size2 = arrayList.size();
            } else {
                z10 = false;
            }
        }
        if (z10 && size > size2 && (zzfsnVar = this.zzf) != null) {
            int i12 = size - size2;
            if (size2 == 0) {
                i12--;
            }
            zzfsnVar.zzd(this, i12);
        }
        zzftd zzftdVar = this.zzr;
        if (zzftdVar == null || adFormat == null) {
            return;
        }
        zzftdVar.zzc(i11, i10, this.zzs.currentTimeMillis(), new zzftk(new zzftj(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, adFormat), null));
    }

    protected final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzt());
            bundle.putInt("plbs", zzs());
            bundle.putString("plid", this.zzm);
        }
    }

    final long zzC() {
        long jZzb = zzb();
        if (jZzb >= 0) {
            return jZzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzP)).longValue();
    }

    final /* synthetic */ void zzD(int i10, zzftm zzftmVar, zzftm zzftmVar2, long j10, int i11, int i12) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzK)).booleanValue() || i10 == 1) {
                this.zzl.zza();
            }
        }
        if (zzftmVar != null && zzftmVar2 != null) {
            AdFormat adFormat = AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
            String strZzV = zzV(zzc(zzftmVar.zza()));
            if (adFormat != null && strZzV != null && zzftmVar2.zzd() < zzftmVar.zzd()) {
                this.zzr.zzg(j10, i11, i12, strZzV, this.zzt, zzM());
            }
        }
        zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar != null) {
            zzfsnVar.zzb(this);
            return;
        }
        long jZzC = zzC();
        if (jZzC > 0) {
            this.zzi.schedule(new zzftp(this), jZzC, TimeUnit.MILLISECONDS);
        } else {
            zzy();
        }
    }

    final /* synthetic */ void zzG(Object obj) {
        if (obj != null) {
            this.zzl.zza();
            this.zzq.set(true);
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc = zzc(obj);
            double dZzl = !(zzdxVarZzc instanceof zzdck) ? 0.0d : ((zzdck) zzdxVarZzc).zzl();
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc2 = zzc(obj);
            zzftm zzftmVar = new zzftm(obj, this.zzs, dZzl, zzdxVarZzc2 instanceof zzdck ? ((zzdck) zzdxVarZzc2).zzm() : 2);
            Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzftmVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc3 = zzc(obj);
            long jCurrentTimeMillis = this.zzs.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzftq(this, zzdxVarZzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new zzftr(this, jCurrentTimeMillis, zzdxVarZzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzE)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzF();
                        }
                    }, zzftmVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfty
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzE();
                        }
                    }, zzftmVar.zzc(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzE)).booleanValue()) {
                    this.zzo.zzb(new zzftp(this), zzftmVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new zzftp(this), zzftmVar.zzc(), TimeUnit.MILLISECONDS);
                }
            }
        }
        this.zzn.set(false);
        if (obj == null || this.zzf == null) {
            zzS(obj == null);
        }
    }

    final /* synthetic */ void zzH(Throwable th) {
        this.zzn.set(false);
        if ((th instanceof zzfso) && ((zzfso) th).zza() == 0) {
            throw null;
        }
        zzS(true);
    }

    final /* synthetic */ void zzI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfts(this, zzeVar));
        }
        this.zzn.set(false);
        int i10 = zzeVar.zza;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            zzS(true);
            return;
        }
        int i11 = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb;
        String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 26 + String.valueOf(str).length() + 61);
        sb2.append("Preloading ");
        sb2.append(i11);
        sb2.append(", for adUnitId:");
        sb2.append(str);
        sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        this.zzg.set(false);
        zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar != null) {
            zzfsnVar.zza(this);
        }
        zzftj zzftjVar = new zzftj(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzq());
        zzftjVar.zza(this.zzm);
        this.zzr.zzk(this.zzs.currentTimeMillis(), new zzftk(zzftjVar, null), zzeVar, zzs(), zzt(), zzM());
    }

    final /* synthetic */ void zzJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzg(this.zzm, zzeVar);
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    final /* synthetic */ void zzK(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zze((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zzm, zzdxVar);
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    final /* synthetic */ void zzL() {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zzf((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zzm);
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    final /* synthetic */ zzftd zzN() {
        return this.zzr;
    }

    final /* synthetic */ Clock zzO() {
        return this.zzs;
    }

    final /* synthetic */ zzftk zzP() {
        return this.zzt;
    }

    protected abstract ListenableFuture zza(Context context);

    protected long zzb() {
        throw null;
    }

    protected abstract com.google.android.gms.ads.internal.client.zzdx zzc(Object obj);

    public final zzfub zzd() {
        this.zzi.submit(new zzftp(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfua
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzJ)).booleanValue()) {
            this.zzl.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzD)).booleanValue() && this.zzf == null) {
            zzy();
        } else {
            zzF();
        }
        return !zzR();
    }

    public final Object zzg() {
        final zzftm zzftmVar;
        zzftm zzftmVar2;
        Queue queue = this.zzk;
        final int iZzt = zzt();
        synchronized (queue) {
            zzftm zzftmVar3 = (zzftm) queue.poll();
            this.zzq.set(zzftmVar3 != null);
            if (zzftmVar3 == null) {
                zzftmVar = null;
                zzftmVar2 = null;
            } else if (queue.isEmpty()) {
                zzftmVar2 = zzftmVar3;
                zzftmVar = null;
            } else {
                zzftmVar2 = zzftmVar3;
                zzftmVar = (zzftm) queue.peek();
            }
        }
        final long jCurrentTimeMillis = this.zzs.currentTimeMillis();
        final int iZzs = zzs();
        final int iZzt2 = zzt();
        final zzftm zzftmVar4 = zzftmVar2;
        this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzD(iZzt, zzftmVar4, zzftmVar, jCurrentTimeMillis, iZzs, iZzt2);
            }
        });
        if (zzftmVar2 == null) {
            return null;
        }
        return zzftmVar2.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzi.submit(new zzftp(this));
        }
    }

    public final boolean zzk(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).equals(zzfpVar);
    }

    public final String zzl() {
        zzftm zzftmVar;
        Queue queue = this.zzk;
        synchronized (queue) {
            zzftmVar = (zzftm) queue.peek();
        }
        Object objZza = zzftmVar == null ? null : zzftmVar.zza();
        return zzV(objZza != null ? zzc(objZza) : null);
    }

    public final void zzm(zzftd zzftdVar) {
        this.zzr = zzftdVar;
    }

    public final void zzn(int i10) {
        Preconditions.checkArgument(i10 >= 5);
        this.zzl.zzf(i10);
    }

    protected final com.google.android.gms.ads.internal.client.zzfp zzo() {
        return (com.google.android.gms.ads.internal.client.zzfp) this.zze.get();
    }

    protected final String zzp() {
        return this.zzm;
    }

    protected final AdFormat zzq() {
        return AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
    }

    protected final String zzr() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
    }

    protected final int zzs() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd;
    }

    protected final int zzt() {
        int size;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    protected final boolean zzu() {
        if (!this.zzg.get() || this.zzn.get() || zzt() >= zzs()) {
            return false;
        }
        zzfsw zzfswVar = this.zzl;
        return (zzfswVar.zzd() || zzfswVar.zze()) ? false : true;
    }

    protected final void zzv() {
        Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    protected final boolean zzw() {
        return this.zzn.get();
    }

    protected final int zzx() {
        int iZzt = zzt() - 1;
        if (this.zzn.get()) {
            iZzt++;
        }
        return Math.max(iZzt, 0);
    }

    protected final void zzy() {
        zzF();
        if (zzR() && this.zzq.compareAndSet(true, false)) {
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzftt(this));
            }
            this.zzi.execute(new zzftu(this));
        }
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                zzz();
            }
        }
    }

    protected final void zzz() {
        ListenableFuture listenableFutureZza;
        Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (activityZzd == null) {
            String strValueOf = String.valueOf(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
            listenableFutureZza = zza(this.zzb);
        } else {
            listenableFutureZza = zza(activityZzd);
        }
        zzhbw.zzr(listenableFutureZza, new zzftn(this), this.zzi);
    }

    public zzfub(String str, ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock, zzfsn zzfsnVar) {
        this(str, clientApi, context, i10, zzfluVar, zzfpVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, zzfsnVar);
        this.zzh = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final String zzM() {
        return true != VRfCTjjLv.vmpfEwDun.equals(this.zzm) ? "2" : AppEventsConstants.EVENT_PARAM_VALUE_YES;
    }

    private zzfub(String str, ClientApi clientApi, Context context, int i10, zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfoo zzfooVar, zzfsw zzfswVar, Clock clock, zzfsn zzfsnVar) {
        Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzfluVar;
        this.zze = new AtomicReference(zzfpVar);
        int iMax = Math.max(1, zzfpVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzab)).booleanValue()) {
            priorityQueue = new zzfue();
        } else {
            priorityQueue = new PriorityQueue(iMax, zzftx.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzn = new AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfooVar;
        this.zzl = zzfswVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = clock;
        zzftj zzftjVar = new zzftj(zzfpVar.zza, AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb));
        zzftjVar.zza(str);
        this.zzt = new zzftk(zzftjVar, null);
        this.zzf = zzfsnVar;
    }
}
