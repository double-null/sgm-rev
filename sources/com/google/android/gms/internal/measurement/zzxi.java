package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzxi<API extends zzyi<API>> {
    private final zzzf zza;

    protected zzxi(zzzf zzzfVar) {
        this.zza = zzzfVar;
    }

    private static void zzd(String str, zzzd zzzdVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(zzzdVar.zzf()))));
        sb2.append(": logging error [");
        zzze.zza(1, zzzdVar.zzg(), sb2);
        sb2.append("]: ");
        sb2.append(str);
        System.err.println(sb2);
        System.err.flush();
    }

    protected final String zza() {
        return this.zza.zza();
    }

    protected final boolean zzb(Level level) {
        return this.zza.zzb(level);
    }

    final void zzc(zzzd zzzdVar) {
        try {
            zzabt zzabtVarZzc = zzabt.zzc();
            try {
                if (zzabtVarZzc.zzb() <= 100) {
                    this.zza.zzc(zzzdVar);
                } else {
                    zzd("unbounded recursion in log statement", zzzdVar);
                }
                zzabtVarZzc.close();
            } catch (Throwable th) {
                if (zzabtVarZzc != null) {
                    try {
                        zzabtVarZzc.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e10) {
            try {
                this.zza.zzd(e10, zzzdVar);
            } catch (zzzg e11) {
                throw e11;
            } catch (RuntimeException e12) {
                String name = e12.getClass().getName();
                String message = e12.getMessage();
                StringBuilder sb2 = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                sb2.append(name);
                sb2.append(": ");
                sb2.append(message);
                zzd(sb2.toString(), zzzdVar);
                try {
                    e12.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
