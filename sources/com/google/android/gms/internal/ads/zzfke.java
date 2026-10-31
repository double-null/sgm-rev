package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfke {
    private final Clock zza;
    private final zzdzl zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfke(Clock clock, zzdzl zzdzlVar) {
        this.zza = clock;
        this.zzb = zzdzlVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            if (this.zze == 3) {
                if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgU)).longValue() <= jCurrentTimeMillis) {
                    this.zze = 1;
                }
            }
        }
    }

    private final void zzf(int i10, int i11) {
        zze();
        Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            if (this.zze != i10) {
                return;
            }
            this.zze = i11;
            if (this.zze == 3) {
                this.zzd = jCurrentTimeMillis;
            }
        }
    }

    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoB)).booleanValue()) {
            zzdzk zzdzkVarZza = this.zzb.zza();
            zzdzkVarZza.zzc("action", "mbs_state");
            zzdzkVarZza.zzc("mbs_state", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            zzdzkVarZza.zzd();
        }
        if (z10) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z10;
        synchronized (this.zzc) {
            zze();
            z10 = this.zze == 2;
        }
        return z10;
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzc) {
            zze();
            z10 = this.zze == 3;
        }
        return z10;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
