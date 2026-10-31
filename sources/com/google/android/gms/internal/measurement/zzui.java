package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.m;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzui implements zzuv {
    private final String zza;
    private final ListenableFuture zzb;
    private final zztv zzc;
    private final Executor zzd;
    private final zzru zze;
    private final m zzf;
    private final zzwb zzg;
    private final Object zzh = new Object();
    private final q zzi = q.d();
    private ListenableFuture zzj = null;

    zzui(String str, ListenableFuture listenableFuture, zztv zztvVar, Executor executor, zzru zzruVar, m mVar, zzwb zzwbVar) {
        this.zza = str;
        this.zzb = x.i(listenableFuture);
        this.zzc = zztvVar;
        this.zzd = g0.c(executor);
        this.zze = zzruVar;
        this.zzf = mVar;
        this.zzg = zzwbVar;
    }

    public static zzuw zza() {
        return zztx.zza;
    }

    private final Object zzm(Uri uri) throws IOException {
        try {
            try {
                zzwb zzwbVar = this.zzg;
                String str = this.zza;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5);
                sb2.append("Read ");
                sb2.append(str);
                zzwi zzwiVarZza = zzwbVar.zza(sb2.toString(), zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                try {
                    InputStream inputStream = (InputStream) this.zze.zza(uri, zzst.zzb());
                    try {
                        zztv zztvVar = this.zzc;
                        zzafc zzafcVar = (zzafc) ((zzve) zztvVar).zzb().zzcj().zza(inputStream, ((zzve) zztvVar).zzc());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        zzwiVarZza.close();
                        return zzafcVar;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        zzwiVarZza.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e10) {
                throw zzux.zza(this.zze, uri, e10, this.zza);
            }
        } catch (FileNotFoundException e11) {
            if (this.zze.zzc(uri)) {
                throw e11;
            }
            return this.zzc.zza();
        }
    }

    private final void zzn(Uri uri, Object obj) throws IOException {
        Uri uriZza = zzuz.zza(uri, ".tmp");
        try {
            zzwb zzwbVar = this.zzg;
            String str = this.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
            sb2.append("Write ");
            sb2.append(str);
            zzwi zzwiVarZza = zzwbVar.zza(sb2.toString(), zzxd.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                zzse zzseVar = new zzse();
                try {
                    zzru zzruVar = this.zze;
                    zzsw zzswVarZzb = zzsw.zzb();
                    zzswVarZzb.zzc(zzseVar);
                    OutputStream outputStream = (OutputStream) zzruVar.zza(uriZza, zzswVarZzb);
                    try {
                        ((zzafc) obj).zzce(outputStream);
                        zzseVar.zzc();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        zzwiVarZza.close();
                        this.zze.zzd(uriZza, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    throw zzux.zza(this.zze, uri, e10, this.zza);
                }
            } catch (Throwable th3) {
                try {
                    zzwiVarZza.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e11) {
            zzru zzruVar2 = this.zze;
            if (zzruVar2.zzc(uriZza)) {
                try {
                    zzruVar2.zzb(uriZza);
                } catch (IOException e12) {
                    e11.addSuppressed(e12);
                }
            }
            throw e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0031, B:16:0x0033), top: B:22:0x0003, inners: #1 }] */
    @Override // com.google.android.gms.internal.measurement.zzuv
    public final ListenableFuture zzb(final j jVar, final Executor executor, zzuu zzuuVar) {
        final ListenableFuture listenableFuture;
        synchronized (this.zzh) {
            ListenableFuture listenableFuture2 = this.zzj;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.zzj == null) {
                    this.zzj = x.i(this.zzi.f(zzxa.zzb(new i() { // from class: com.google.android.gms.internal.measurement.zzub
                        @Override // com.google.common.util.concurrent.i
                        public final /* synthetic */ ListenableFuture call() {
                            return this.zza.zzf();
                        }
                    }), this.zzd));
                }
                listenableFuture = this.zzj;
            } else {
                try {
                    x.d(this.zzj);
                } catch (ExecutionException unused) {
                    this.zzj = null;
                }
                if (this.zzj == null) {
                    this.zzj = x.i(this.zzi.f(zzxa.zzb(new i() { // from class: com.google.android.gms.internal.measurement.zzub
                        @Override // com.google.common.util.concurrent.i
                        public final /* synthetic */ ListenableFuture call() {
                            return this.zza.zzf();
                        }
                    }), this.zzd));
                }
                listenableFuture = this.zzj;
            }
            throw th;
        }
        return this.zzi.f(zzxa.zzb(new i() { // from class: com.google.android.gms.internal.measurement.zztz
            @Override // com.google.common.util.concurrent.i
            public final /* synthetic */ ListenableFuture call() {
                final zzui zzuiVar = this.zza;
                final ListenableFuture listenableFutureM = x.m(listenableFuture, new j() { // from class: com.google.android.gms.internal.measurement.zzua
                    @Override // com.google.common.util.concurrent.j
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return zzuiVar.zze(obj);
                    }
                }, g0.a());
                final ListenableFuture listenableFutureM2 = x.m(listenableFutureM, jVar, executor);
                return x.m(listenableFutureM2, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzuc
                    @Override // com.google.common.util.concurrent.j
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return zzuiVar.zzg(listenableFutureM, listenableFutureM2, obj);
                    }
                }), g0.a());
            }
        }), g0.a());
    }

    @Override // com.google.android.gms.internal.measurement.zzuv
    public final String zzc() {
        return this.zza;
    }

    final /* synthetic */ ListenableFuture zzd() {
        return x.i(x.m(this.zzb, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzug
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzk((Uri) obj);
            }
        }), this.zzd));
    }

    final /* synthetic */ ListenableFuture zze(Object obj) {
        ListenableFuture listenableFuture;
        synchronized (this.zzh) {
            listenableFuture = this.zzj;
        }
        return listenableFuture;
    }

    final /* synthetic */ ListenableFuture zzf() {
        try {
            return x.g(zzm((Uri) x.d(this.zzb)));
        } catch (IOException e10) {
            zzty zztyVar = new zzty(this, null);
            m mVar = this.zzf;
            if (mVar.e()) {
                return ((e10 instanceof zzsg) || (e10.getCause() instanceof zzsg)) ? x.f(e10) : x.m(((zztf) mVar.c()).zza(e10, zztyVar), zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzue
                    @Override // com.google.common.util.concurrent.j
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        return this.zza.zzi((Void) obj);
                    }
                }), this.zzd);
            }
            return x.f(e10);
        }
    }

    final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, final ListenableFuture listenableFuture2, Object obj) {
        if (x.d(listenableFuture).equals(x.d(listenableFuture2))) {
            return x.g(obj);
        }
        ListenableFuture listenableFutureM = x.m(listenableFuture2, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzud
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return this.zza.zzh(listenableFuture2, obj2);
            }
        }), this.zzd);
        synchronized (this.zzh) {
        }
        return listenableFutureM;
    }

    final /* synthetic */ ListenableFuture zzh(ListenableFuture listenableFuture, Object obj) throws IOException {
        zzn((Uri) x.d(this.zzb), obj);
        synchronized (this.zzh) {
            this.zzj = listenableFuture;
        }
        return x.g(obj);
    }

    final /* synthetic */ ListenableFuture zzi(Void r10) {
        return x.g(zzm((Uri) x.d(this.zzb)));
    }

    final /* synthetic */ ListenableFuture zzj(Object obj) throws IOException {
        zzn((Uri) x.d(this.zzb), obj);
        return x.h();
    }

    final /* synthetic */ ListenableFuture zzk(Uri uri) {
        Uri uriZza = zzuz.zza(uri, ".bak");
        try {
            zzru zzruVar = this.zze;
            if (zzruVar.zzc(uriZza)) {
                zzruVar.zzd(uriZza, uri);
            }
            return x.h();
        } catch (IOException e10) {
            return x.f(e10);
        }
    }

    final /* synthetic */ ListenableFuture zzl(ListenableFuture listenableFuture) {
        return x.m(listenableFuture, zzxa.zzc(new j() { // from class: com.google.android.gms.internal.measurement.zzuf
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzj(obj);
            }
        }), this.zzd);
    }
}
