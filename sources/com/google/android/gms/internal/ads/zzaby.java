package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Objects;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaby extends Handler implements Runnable {
    final /* synthetic */ zzacd zza;
    private final zzabz zzb;
    private final long zzc;
    private zzabv zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaby(zzacd zzacdVar, Looper looper, zzabz zzabzVar, zzabv zzabvVar, int i10, long j10) {
        super(looper);
        Objects.requireNonNull(zzacdVar);
        this.zza = zzacdVar;
        this.zzb = zzabzVar;
        this.zzd = zzabvVar;
        this.zzc = j10;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.zzc;
        zzabv zzabvVar = this.zzd;
        zzabvVar.getClass();
        zzabvVar.zzC(this.zzb, jElapsedRealtime, j10, this.zzf);
        this.zze = null;
        zzacd zzacdVar = this.zza;
        zzaby zzabyVarZzj = zzacdVar.zzj();
        zzabyVarZzj.getClass();
        zzacdVar.zzi().execute(zzabyVarZzj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                zzabz zzabzVar = this.zzb;
                String simpleName = zzabzVar.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    zzabzVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzeg.zzf("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new zzacc(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzeg.zzf("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new zzacc(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzeg.zzf("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzb(long j10) {
        zzacd zzacdVar = this.zza;
        zzgtj.zzi(zzacdVar.zzj() == null);
        zzacdVar.zzk(this);
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzb();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzabv zzabvVar = this.zzd;
            zzabvVar.getClass();
            zzabvVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            zzd();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        zzacd zzacdVar = this.zza;
        zzacdVar.zzk(null);
        long j10 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        zzabv zzabvVar = this.zzd;
        zzabvVar.getClass();
        if (this.zzh) {
            zzabvVar.zzA(this.zzb, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                zzabvVar.zzB(this.zzb, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                zzeg.zzf(TwDPD.yPvXgtElWLhW, "Unexpected exception handling load completed", e10);
                this.zza.zzl(new zzacc(e10));
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i12 = this.zzf + 1;
        this.zzf = i12;
        zzabx zzabxVarZzz = zzabvVar.zzz(this.zzb, jElapsedRealtime, j11, iOException, i12);
        if (zzabxVarZzz.zzb() == 3) {
            zzacdVar.zzl(this.zze);
        } else if (zzabxVarZzz.zzb() != 2) {
            if (zzabxVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzabxVarZzz.zzc() != -9223372036854775807L ? zzabxVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE));
        }
    }
}
