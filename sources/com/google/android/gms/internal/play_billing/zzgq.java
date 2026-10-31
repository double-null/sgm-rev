package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgq {
    protected volatile zzhm zza;
    private final zzhm zzb;
    private volatile zzfg zzc;
    private volatile boolean zzd;

    zzgq(zzhm zzhmVar) {
        if (zzhmVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.zza = zzhmVar;
        this.zzb = zzhmVar.zzl();
        int i10 = zzft.zzb;
        int i11 = zzet.zza;
        this.zzc = null;
        this.zzd = false;
    }

    public final boolean equals(Object obj) {
        return zzf().equals(obj);
    }

    public final int hashCode() {
        return zzf().hashCode();
    }

    public final String toString() {
        return zzf().toString();
    }

    final int zza(int i10) {
        int iZzy = zzfo.zzy(8);
        return iZzy + iZzy + zzfo.zzy(16) + zzfo.zzy(i10) + zzb(3);
    }

    final int zzb(int i10) {
        return zzfo.zzy(24) + zzc();
    }

    final int zzc() {
        int iZzd = zzd();
        return zzfo.zzy(iZzd) + iZzd;
    }

    final int zzd() {
        return this.zzc != null ? this.zzc.zzd() : this.zza.zzn();
    }

    final zzfg zze() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza.zzj();
            return this.zzc;
        }
    }

    final zzhm zzf() {
        try {
            return this.zza;
        } catch (zzgs unused) {
            zzft.zzb();
            return this.zzb;
        }
    }
}
