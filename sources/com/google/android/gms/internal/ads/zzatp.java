package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzatp {
    public static final boolean zza = zzatq.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzatp() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzatq.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzato(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzato> list = this.zzb;
        long j10 = list.size() == 0 ? 0L : ((zzato) list.get(list.size() - 1)).zzc - ((zzato) list.get(0)).zzc;
        if (j10 > 0) {
            long j11 = ((zzato) list.get(0)).zzc;
            zzatq.zzb("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzato zzatoVar : list) {
                long j12 = zzatoVar.zzc;
                zzatq.zzb("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzatoVar.zzb), zzatoVar.zza);
                j11 = j12;
            }
        }
    }
}
