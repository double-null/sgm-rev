package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznl extends zzg {
    private final zznf zza;
    private zzgb zzb;
    private volatile Boolean zzc;
    private final zzaz zzd;
    private ScheduledExecutorService zze;
    private final zzog zzf;
    private final List zzg;
    private final zzaz zzh;

    protected zznl(zzic zzicVar) {
        super(zzicVar);
        this.zzg = new ArrayList();
        this.zzf = new zzog(zzicVar.zzba());
        this.zza = new zznf(this);
        this.zzd = new zzmm(this, zzicVar);
        this.zzh = new zzmq(this, zzicVar);
    }

    private final boolean zzad() {
        this.zzu.zzaV();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzV() {
        zzg();
        this.zzf.zza();
        this.zzu.zzc();
        this.zzd.zzb(((Long) zzfy.zzY.zzb(null)).longValue());
    }

    private final void zzaf(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzh()) {
            runnable.run();
            return;
        }
        List list = this.zzg;
        long size = list.size();
        zzic zzicVar = this.zzu;
        zzicVar.zzc();
        if (size >= 1000) {
            zzicVar.zzaW().zzb().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.zzh.zzb(60000L);
        zzI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzX() {
        zzg();
        zzgs zzgsVarZzk = this.zzu.zzaW().zzk();
        List list = this.zzg;
        zzgsVarZzk.zzb("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.zzu.zzaW().zzb().zzb("Task exception while flushing queue", e10);
            }
        }
        this.zzg.clear();
        this.zzh.zzd();
    }

    private final zzr zzah(boolean z10) {
        Pair pairZzb;
        zzic zzicVar = this.zzu;
        zzicVar.zzaV();
        zzgi zzgiVarZzv = this.zzu.zzv();
        String string = null;
        if (z10) {
            zzic zzicVar2 = zzicVar.zzaW().zzu;
            if (zzicVar2.zzd().zzb != null && (pairZzb = zzicVar2.zzd().zzb.zzb()) != null && pairZzb != zzhh.zza) {
                String strValueOf = String.valueOf(pairZzb.second);
                String str = (String) pairZzb.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return zzgiVarZzv.zzh(string);
    }

    protected final void zzA(zzpl zzplVar) {
        zzg();
        zzb();
        zzad();
        zzaf(new zzmg(this, zzah(true), this.zzu.zzm().zzj(zzplVar), zzplVar));
    }

    protected final void zzB() {
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(false);
        zzad();
        this.zzu.zzm().zzh();
        zzaf(new zzmh(this, zzrVarZzah));
    }

    public final void zzC(AtomicReference atomicReference) {
        zzg();
        zzb();
        zzaf(new zzmi(this, atomicReference, zzah(false)));
    }

    public final void zzD(com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        zzg();
        zzb();
        zzaf(new zzmj(this, zzah(false), zzcsVar));
    }

    protected final void zzE() {
        zzg();
        zzb();
        zzr zzrVarZzah = zzah(true);
        zzad();
        this.zzu.zzc().zzp(null, zzfy.zzaW);
        this.zzu.zzm().zzn();
        zzaf(new zzmk(this, zzrVarZzah, true));
    }

    protected final void zzF() {
        zzg();
        zzb();
        zzaf(new zzml(this, zzah(true)));
    }

    protected final void zzG(zzlu zzluVar) {
        zzg();
        zzb();
        zzaf(new zzmn(this, zzluVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zzb();
        zzbf zzbfVar = new zzbf(bundle);
        zzad();
        zzaf(new zzmo(this, true, zzah(false), this.zzu.zzc().zzp(null, zzfy.zzaW) && this.zzu.zzm().zzl(zzbfVar), zzbfVar, bundle));
    }

    final void zzI() {
        zzg();
        zzb();
        if (zzh()) {
            return;
        }
        if (zzK()) {
            this.zza.zzc();
            return;
        }
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzE()) {
            return;
        }
        zzicVar.zzaV();
        List<ResolveInfo> listQueryIntentServices = zzicVar.zzaZ().getPackageManager().queryIntentServices(new Intent().setClassName(zzicVar.zzaZ(), "com.google.android.gms.measurement.AppMeasurementService"), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzicVar.zzaW().zzb().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzaZ = zzicVar.zzaZ();
        zzicVar.zzaV();
        intent.setComponent(new ComponentName(contextZzaZ, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zza(intent);
    }

    final Boolean zzJ() {
        return this.zzc;
    }

    final boolean zzK() {
        zzg();
        zzb();
        if (this.zzc == null) {
            zzg();
            zzb();
            zzic zzicVar = this.zzu;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            boolean z10 = false;
            Boolean boolValueOf = !zzhhVarZzd.zzd().contains("use_service") ? null : Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                zzicVar.zzaV();
                if (this.zzu.zzv().zzo() == 1) {
                    z10 = true;
                } else {
                    zzicVar.zzaW().zzk().zza("Checking service availability");
                    int iZzal = zzicVar.zzk().zzal(12451000);
                    if (iZzal == 0) {
                        zzicVar.zzaW().zzk().zza("Service available");
                    } else if (iZzal == 1) {
                        zzicVar.zzaW().zzk().zza("Service missing");
                    } else if (iZzal != 2) {
                        if (iZzal == 3) {
                            zzicVar.zzaW().zze().zza("Service disabled");
                        } else if (iZzal == 9) {
                            zzicVar.zzaW().zze().zza("Service invalid");
                        } else if (iZzal != 18) {
                            zzicVar.zzaW().zze().zzb("Unexpected service status", Integer.valueOf(iZzal));
                        } else {
                            zzicVar.zzaW().zze().zza("Service updating");
                        }
                        z11 = false;
                    } else {
                        zzicVar.zzaW().zzj().zza("Service container out of date");
                        if (zzicVar.zzk().zzak() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && zzicVar.zzc().zzE()) {
                    zzicVar.zzaW().zzb().zza("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    zzhh zzhhVarZzd2 = zzicVar.zzd();
                    zzhhVarZzd2.zzg();
                    SharedPreferences.Editor editorEdit = zzhhVarZzd2.zzd().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.zzc = Boolean.valueOf(z11);
        }
        return this.zzc.booleanValue();
    }

    protected final void zzL(zzgb zzgbVar) {
        zzg();
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = zzgbVar;
        zzV();
        zzX();
    }

    public final void zzM() {
        zzg();
        zzb();
        zznf zznfVar = this.zza;
        zznfVar.zzb();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzu.zzaZ(), zznfVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzN(com.google.android.gms.internal.measurement.zzcs zzcsVar, zzbh zzbhVar, String str) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzal(12451000) == 0) {
            zzaf(new zzmp(this, zzbhVar, str, zzcsVar));
        } else {
            zzicVar.zzaW().zze().zza("Not bundling data. Service unavailable or out of date");
            zzicVar.zzk().zzar(zzcsVar, new byte[0]);
        }
    }

    final boolean zzO() {
        zzg();
        zzb();
        return !zzK() || this.zzu.zzk().zzak() >= ((Integer) zzfy.zzaJ.zzb(null)).intValue();
    }

    final boolean zzP() {
        zzg();
        zzb();
        return !zzK() || this.zzu.zzk().zzak() >= 241200;
    }

    final /* synthetic */ void zzQ() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            this.zzu.zzaW().zzb().zza("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgbVar.zzy(zzrVarZzah);
            zzV();
        } catch (RemoteException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to send storage consent settings to the service", e10);
        }
    }

    final /* synthetic */ void zzR() {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            this.zzu.zzaW().zzb().zza("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr zzrVarZzah = zzah(false);
            Preconditions.checkNotNull(zzrVarZzah);
            zzgbVar.zzz(zzrVarZzah);
            zzV();
        } catch (RemoteException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to send Dma consent settings to the service", e10);
        }
    }

    final /* synthetic */ void zzS(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                zzgb zzgbVar = this.zzb;
                if (zzgbVar == null) {
                    this.zzu.zzaW().zzb().zza("Failed to request trigger URIs; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(zzrVar);
                zzgbVar.zzD(zzrVar, bundle, new zzme(this, atomicReference));
                zzV();
            } catch (RemoteException e10) {
                this.zzu.zzaW().zzb().zzb("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    final /* synthetic */ void zzT(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        synchronized (atomicReference) {
            try {
                zzgb zzgbVar = this.zzb;
                if (zzgbVar == null) {
                    this.zzu.zzaW().zzb().zza("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(zzrVar);
                zzgbVar.zzB(zzrVar, zzooVar, new zzmf(this, atomicReference));
                zzV();
            } catch (RemoteException e10) {
                this.zzu.zzaW().zzb().zzb("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    final /* synthetic */ void zzU(zzr zzrVar, zzaf zzafVar) {
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            this.zzu.zzaW().zzb().zza("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            zzgbVar.zzC(zzrVar, zzafVar);
            zzV();
        } catch (RemoteException e10) {
            this.zzu.zzaW().zzb().zzc("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.zza), e10);
        }
    }

    final /* synthetic */ void zzW(ComponentName componentName) {
        zzg();
        if (this.zzb != null) {
            this.zzb = null;
            this.zzu.zzaW().zzk().zzb("Disconnected from device MeasurementService", componentName);
            zzg();
            zzI();
        }
    }

    final /* synthetic */ zznf zzY() {
        return this.zza;
    }

    final /* synthetic */ zzgb zzZ() {
        return this.zzb;
    }

    final /* synthetic */ void zzaa(zzgb zzgbVar) {
        this.zzb = null;
    }

    final /* synthetic */ ScheduledExecutorService zzab() {
        return this.zze;
    }

    final /* synthetic */ void zzac(ScheduledExecutorService scheduledExecutorService) {
        this.zze = scheduledExecutorService;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final boolean zzh() {
        zzg();
        zzb();
        return this.zzb != null;
    }

    protected final void zzi() {
        zzg();
        zzb();
        zzaf(new zzmr(this, zzah(true)));
    }

    protected final void zzj(boolean z10) {
        zzg();
        zzb();
        if (zzO()) {
            zzaf(new zzms(this, zzah(false)));
        }
    }

    protected final void zzk(boolean z10) {
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzQ();
            }
        });
    }

    protected final void zzl() {
        zzg();
        zzb();
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzng
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00f6  */
    final void zzm(zzgb zzgbVar, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        long j10;
        long jElapsedRealtime;
        zzg();
        zzb();
        zzad();
        zzic zzicVar = this.zzu;
        zzicVar.zzc();
        zzr zzrVar2 = zzrVar;
        int size = 100;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && size == i11; i11 = 100) {
            zzic zzicVar2 = this.zzu;
            ArrayList arrayList = new ArrayList();
            List listZzm = zzicVar2.zzm().zzm(i11);
            if (listZzm != null) {
                arrayList.addAll(listZzm);
                size = listZzm.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < i11) {
                arrayList.add(new zzgk(abstractSafeParcelable, zzrVar2.zzc, zzrVar2.zzj));
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                zzgk zzgkVar = (zzgk) arrayList.get(i12);
                AbstractSafeParcelable abstractSafeParcelable2 = zzgkVar.zza;
                zzal zzalVarZzc = zzicVar.zzc();
                zzfx zzfxVar = zzfy.zzaW;
                if (zzalVarZzc.zzp(null, zzfxVar)) {
                    String str = zzgkVar.zzb;
                    if (!TextUtils.isEmpty(str)) {
                        zzrVar2 = new zzr(zzrVar2.zza, zzrVar2.zzb, str, zzgkVar.zzc, zzrVar2.zzd, zzrVar2.zze, zzrVar2.zzf, zzrVar2.zzg, zzrVar2.zzh, zzrVar2.zzi, zzrVar2.zzk, zzrVar2.zzl, zzrVar2.zzm, zzrVar2.zzn, zzrVar2.zzo, zzrVar2.zzp, zzrVar2.zzq, zzrVar2.zzr, zzrVar2.zzs, zzrVar2.zzt, zzrVar2.zzu, zzrVar2.zzv, zzrVar2.zzw, zzrVar2.zzx, zzrVar2.zzy, zzrVar2.zzz, zzrVar2.zzA, zzrVar2.zzB, zzrVar2.zzC, zzrVar2.zzD, zzrVar2.zzE, zzrVar2.zzF);
                    }
                }
                zzr zzrVar3 = zzrVar2;
                if (abstractSafeParcelable2 instanceof zzbh) {
                    try {
                        zzic zzicVar3 = this.zzu;
                        long jCurrentTimeMillis = zzicVar3.zzba().currentTimeMillis();
                        try {
                            jElapsedRealtime = zzicVar3.zzba().elapsedRealtime();
                            try {
                                zzgbVar.zze((zzbh) abstractSafeParcelable2, zzrVar3);
                                zzicVar.zzaW().zzk().zza("Logging telemetry for logEvent from database");
                                zzgq.zza(zzicVar3).zzb(36301, 0, jCurrentTimeMillis, zzicVar3.zzba().currentTimeMillis(), (int) (zzicVar3.zzba().elapsedRealtime() - jElapsedRealtime));
                            } catch (RemoteException e10) {
                                e = e10;
                                j10 = jCurrentTimeMillis;
                                this.zzu.zzaW().zzb().zzb("Failed to send event to the service", e);
                                if (j10 != 0) {
                                    zzic zzicVar4 = this.zzu;
                                    zzgq.zza(zzicVar4).zzb(36301, 13, j10, zzicVar4.zzba().currentTimeMillis(), (int) (zzicVar4.zzba().elapsedRealtime() - jElapsedRealtime));
                                }
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            jElapsedRealtime = 0;
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        j10 = 0;
                        jElapsedRealtime = 0;
                    }
                } else if (abstractSafeParcelable2 instanceof zzpl) {
                    try {
                        zzgbVar.zzf((zzpl) abstractSafeParcelable2, zzrVar3);
                    } catch (RemoteException e13) {
                        this.zzu.zzaW().zzb().zzb("Failed to send user property to the service", e13);
                    }
                } else if (abstractSafeParcelable2 instanceof zzah) {
                    try {
                        zzgbVar.zzn((zzah) abstractSafeParcelable2, zzrVar3);
                    } catch (RemoteException e14) {
                        this.zzu.zzaW().zzb().zzb("Failed to send conditional user property to the service", e14);
                    }
                } else {
                    zzic zzicVar5 = this.zzu;
                    if (zzicVar5.zzc().zzp(null, zzfxVar) && (abstractSafeParcelable2 instanceof zzbf)) {
                        try {
                            zzgbVar.zzu(((zzbf) abstractSafeParcelable2).zzf(), zzrVar3);
                        } catch (RemoteException e15) {
                            this.zzu.zzaW().zzb().zzb("Failed to send default event parameters to the service", e15);
                        }
                    } else {
                        zzicVar5.zzaW().zzb().zza("Discarding data. Unrecognized parcel type.");
                    }
                }
                i12++;
                i10 = i10;
                zzrVar2 = zzrVar3;
            }
            i10++;
        }
    }

    protected final void zzn(zzbh zzbhVar, String str) {
        Preconditions.checkNotNull(zzbhVar);
        zzg();
        zzb();
        zzad();
        zzaf(new zzmt(this, true, zzah(true), this.zzu.zzm().zzi(zzbhVar), zzbhVar, str));
    }

    protected final void zzp(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzb();
        this.zzu.zzaV();
        zzaf(new zzmu(this, true, zzah(true), this.zzu.zzm().zzk(zzahVar), new zzah(zzahVar), zzahVar));
    }

    protected final void zzq(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zzb();
        zzaf(new zzmv(this, atomicReference, null, str2, str3, zzah(false)));
    }

    protected final void zzs(com.google.android.gms.internal.measurement.zzcs zzcsVar, String str, String str2) {
        zzg();
        zzb();
        zzaf(new zzmw(this, str, str2, zzah(false), zzcsVar));
    }

    protected final void zzt(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        zzg();
        zzb();
        zzaf(new zzmx(this, atomicReference, null, str2, str3, zzah(false), z10));
    }

    protected final void zzu(com.google.android.gms.internal.measurement.zzcs zzcsVar, String str, String str2, boolean z10) {
        zzg();
        zzb();
        zzaf(new zzmc(this, str, str2, zzah(false), z10, zzcsVar));
    }

    protected final void zzv(AtomicReference atomicReference, boolean z10) {
        zzg();
        zzb();
        zzaf(new zzmd(this, atomicReference, zzah(false), z10));
    }

    protected final void zzw(final AtomicReference atomicReference, final Bundle bundle) {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS(atomicReference, zzrVarZzah, bundle);
            }
        });
    }

    protected final void zzx(final AtomicReference atomicReference, final zzoo zzooVar) {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(false);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT(atomicReference, zzrVarZzah, zzooVar);
            }
        });
    }

    protected final void zzy(final zzaf zzafVar) {
        zzg();
        zzb();
        final zzr zzrVarZzah = zzah(true);
        Preconditions.checkNotNull(zzrVarZzah);
        zzaf(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzU(zzrVarZzah, zzafVar);
            }
        });
    }

    protected final zzao zzz() {
        zzg();
        zzb();
        zzgb zzgbVar = this.zzb;
        if (zzgbVar == null) {
            zzI();
            this.zzu.zzaW().zzj().zza("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr zzrVarZzah = zzah(false);
        Preconditions.checkNotNull(zzrVarZzah);
        try {
            zzao zzaoVarZzw = zzgbVar.zzw(zzrVarZzah);
            zzV();
            return zzaoVarZzw;
        } catch (RemoteException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to get consents; remote exception", e10);
            return null;
        }
    }
}
