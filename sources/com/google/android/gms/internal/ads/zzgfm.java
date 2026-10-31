package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgfm implements zzgfh, zzgfd, zzgfs {
    private static final zzihr zza;
    private final Context zzb;
    private final zzgel zzc;
    private final ExecutorService zzd;
    private final zzgee zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzawp zzq = zzawq.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();
    private final int zzu;

    static {
        zzihq zzihqVarZzc = zzihr.zzc();
        zzihqVarZzc.zza(17);
        zza = (zzihr) zzihqVarZzc.zzbu();
    }

    public zzgfm(Context context, zzgel zzgelVar, ExecutorService executorService, zzgee zzgeeVar, Random random, String str, long j10, long j11, double d10, String str2, int i10, long j12) {
        this.zzb = context;
        this.zzc = zzgelVar;
        this.zzd = executorService;
        this.zze = zzgeeVar;
        this.zzg = str;
        this.zzh = j10;
        this.zzi = j11;
        this.zzj = d10;
        this.zzk = str2;
        this.zzu = i10;
        this.zzl = j12;
        this.zzf = random.nextDouble() < d10;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final ListenableFuture zza() {
        return zzhbw.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzb(int i10, long j10, Throwable th, String str) {
        Long lValueOf;
        if (this.zzf) {
            synchronized (this.zzo) {
                List list = this.zzr;
                synchronized (this.zzp) {
                    HashMap map = this.zzt;
                    Integer numValueOf = Integer.valueOf(i10);
                    Long l10 = (Long) map.get(numValueOf);
                    if (l10 == null) {
                        l10 = 0L;
                    }
                    lValueOf = Long.valueOf(l10.longValue() + 1);
                    map.put(numValueOf, lValueOf);
                }
                list.add(new zzgfj(i10, j10, th, str, lValueOf.longValue()));
                if (!this.zzs) {
                    this.zzs = true;
                    this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfl
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    }, this.zzi);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    public final void zzc(zzgfr zzgfrVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgfrVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfs
    public final void zzd(List list) {
        synchronized (this.zzn) {
            this.zzq.zzm(list);
        }
    }

    final void zze() {
        zzawp zzawpVar;
        zzgwm zzgwmVarZzq;
        String string;
        synchronized (this.zzn) {
            zzawpVar = (zzawp) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgwmVarZzq = zzgwm.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgwmVarZzq.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            zzgfj zzgfjVar = (zzgfj) zzgwmVarZzq.get(i10);
            if (i11 >= this.zzh) {
                zzf((zzawq) zzawpVar.zzbu());
                zzawpVar.zzb();
                i11 = 0;
            }
            zzaxh zzaxhVarZza = zzaxi.zza();
            zzaxhVarZza.zza(zzgfjVar.zza);
            zzaxhVarZza.zzb(zzgfjVar.zzb);
            zzaxhVarZza.zze(zzgfjVar.zze);
            String str = zzgfjVar.zzd;
            if (str != null) {
                zzaxhVarZza.zzf(str);
            }
            Throwable th = zzgfjVar.zzc;
            zzaxhVarZza.zzg(th == null ? 2 : 3);
            if (th != null) {
                zzaxhVarZza.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    string = "";
                }
                zzaxhVarZza.zzd(string);
            }
            zzawpVar.zza((zzaxi) zzaxhVarZza.zzbu());
            i10++;
            i11++;
        }
        if (i11 > 0) {
            zzf((zzawq) zzawpVar.zzbu());
            zzawpVar.zzb();
        }
    }

    protected final void zzf(zzawq zzawqVar) {
        try {
            zzbdp zzbdpVarZza = zzbdq.zza();
            zzbdpVarZza.zzb(zza);
            zzbdn zzbdnVarZza = zzbdo.zza();
            zzbdnVarZza.zza(zzawqVar);
            zzbdpVarZza.zza((zzbdo) zzbdnVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzbdq) zzbdpVarZza.zzbu()).zzaN(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzg() {
        int i10;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        int i11 = this.zzu;
        double d10 = this.zzj;
        long j10 = this.zzl;
        Locale locale = Locale.getDefault();
        int iZzb = zzbdv.zzb(zzgde.zza(i11));
        zzawp zzawpVarZza = zzawq.zza();
        zzawpVarZza.zzc(Build.VERSION.SDK_INT);
        zzawpVarZza.zzd(Build.MODEL);
        zzawpVarZza.zze(locale.getLanguage());
        zzawpVarZza.zzf(locale.getCountry());
        zzawpVarZza.zzi(str);
        zzawpVarZza.zzo(iZzb);
        zzawpVarZza.zzp(3);
        zzawpVarZza.zzg(context.getPackageName());
        zzawpVarZza.zzl(j10);
        if (d10 > 0.0d) {
            zzawpVarZza.zzk((int) (1.0d / d10));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzawpVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i10 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i10 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i10 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i10 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzawpVarZza.zzn(i10);
        } catch (RuntimeException unused2) {
        }
        zzawq zzawqVar = (zzawq) zzawpVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzawqVar);
        }
    }
}
