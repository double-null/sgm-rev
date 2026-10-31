package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.base.g;
import com.google.common.base.p;
import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.collect.u;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.f0;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.r;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrf {
    private static final Object zza = new Object();
    private static final Object zzb = new Object();
    private final Context zzc;
    private final w zzd;
    private final w zze;
    private final w zzf;
    private final w zzg;
    private final w zzh;
    private final Uri zzi;
    private volatile zzni zzj;
    private final Uri zzk;
    private volatile zznk zzl;

    public zzrf(Context context, final w wVar, w wVar2, w wVar3) {
        this.zzc = context;
        this.zze = wVar;
        this.zzd = wVar3;
        this.zzf = wVar2;
        zzrz zzrzVarZza = zzsa.zza(context);
        zzrzVarZza.zzb("phenotype_storage_info");
        zzrzVarZza.zzc("storage-info.pb");
        this.zzi = zzrzVarZza.zzd();
        zzrz zzrzVarZza2 = zzsa.zza(context);
        zzrzVarZza2.zzb("phenotype_storage_info");
        zzrzVarZza2.zzc("device-encrypted-storage-info.pb");
        if (zzky.zza()) {
            zzrzVarZza2.zza();
        }
        this.zzk = zzrzVarZza2.zzd();
        this.zzg = x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzre
            @Override // com.google.common.base.w
            public final /* synthetic */ Object get() {
                return this.zza.zzd();
            }
        });
        this.zzh = x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzqy
            @Override // com.google.common.base.w
            public final /* synthetic */ Object get() {
                return ((f0) p.l((f0) wVar.get())).schedule((Callable) zzrd.zza, 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private final zzni zzg() {
        zzni zzniVarZzp = this.zzj;
        if (zzniVarZzp == null) {
            synchronized (zza) {
                zzniVarZzp = this.zzj;
                if (zzniVarZzp == null) {
                    zzniVarZzp = zzni.zzp();
                    if (zzky.zzc(this.zzc)) {
                        zzss zzssVarZzb = zzss.zzb(zzniVarZzp);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            zzni zzniVar = (zzni) ((zzru) this.zzf.get()).zza(this.zzi, zzssVarZzb);
                            StrictMode.setThreadPolicy(threadPolicy);
                            zzniVarZzp = zzniVar;
                        } catch (IOException unused) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                        this.zzj = zzniVarZzp;
                    }
                }
            }
        }
        return zzniVarZzp;
    }

    public final ListenableFuture zza() {
        if (zzky.zzb(this.zzc) || zzg().zze() + TimeUnit.HOURS.toMillis(24L) >= System.currentTimeMillis()) {
            return com.google.common.util.concurrent.x.h();
        }
        return r.c(com.google.common.util.concurrent.x.i((ListenableFuture) this.zzh.get())).e(new j() { // from class: com.google.android.gms.internal.measurement.zzrc
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzf((Void) obj);
            }
        }, (f0) p.l((f0) this.zze.get()));
    }

    public final boolean zzb(boolean z10, zzabz zzabzVar) {
        zzni zzniVarZzg = zzg();
        return zzniVarZzg.zzc() && zzniVarZzg.zzi().contains(zzabzVar);
    }

    public final zzqn zzc(boolean z10) {
        zzni zzniVarZzg = zzg();
        return new zzqn(zzniVarZzg.zzc(), u.B(zzniVarZzg.zzi()), zzniVarZzg.zzb(), zzniVarZzg.zzd(), (zzniVarZzg.zzj() && zzniVarZzg.zzk().zzb() == ((long) Build.VERSION.SDK_INT)) ? zzniVarZzg.zzk().zza() : "", u.B(zzniVarZzg.zzf()), u.B(zzniVarZzg.zzh()), zzniVarZzg.zza(), zzniVarZzg.zzm(), zzniVarZzg.zzl(), zzniVarZzg.zzn());
    }

    final /* synthetic */ ListenableFuture zzd() {
        f0 f0Var = (f0) p.l((f0) this.zze.get());
        final r rVarD = r.c(((zzmj) p.l((zzmj) this.zzd.get())).zzd()).a(zzmk.class, zzqz.zza, f0Var).d(new g() { // from class: com.google.android.gms.internal.measurement.zzra
            @Override // com.google.common.base.g
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zze((zzno) obj);
                return null;
            }
        }, f0Var);
        rVarD.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzrb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    com.google.common.util.concurrent.x.d(rVarD);
                } catch (Exception e10) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e10);
                    }
                }
            }
        }, f0Var);
        return rVarD;
    }

    final /* synthetic */ Void zze(zzno zznoVar) {
        zzse zzseVar = new zzse();
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
        try {
            try {
                synchronized (zza) {
                    zzru zzruVar = (zzru) this.zzf.get();
                    Uri uri = this.zzi;
                    zzsv zzsvVarZzb = zzsv.zzb(zznoVar.zza());
                    zzsvVarZzb.zzc(zzseVar);
                    zzruVar.zza(uri, zzsvVarZzb);
                    this.zzj = zznoVar.zza();
                }
                synchronized (zzb) {
                    zzru zzruVar2 = (zzru) this.zzf.get();
                    Uri uri2 = this.zzk;
                    zzsv zzsvVarZzb2 = zzsv.zzb(zznoVar.zzb());
                    zzsvVarZzb2.zzc(zzseVar);
                    zzruVar2.zza(uri2, zzsvVarZzb2);
                    this.zzl = zznoVar.zzb();
                }
                StrictMode.setThreadPolicy(threadPolicy);
                return null;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    final /* synthetic */ ListenableFuture zzf(Void r10) {
        return com.google.common.util.concurrent.x.i((ListenableFuture) this.zzg.get());
    }
}
