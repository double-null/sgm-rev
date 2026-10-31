package com.google.android.gms.internal.measurement;

import com.google.common.collect.u;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvp extends zzww {
    private final u zza;
    private final u zzb;
    private final UUID zzc;
    private final long zzd;

    /* synthetic */ zzvp(u uVar, u uVar2, UUID uuid, long j10, byte[] bArr) {
        this.zza = uVar;
        this.zzb = uVar2;
        this.zzc = uuid;
        this.zzd = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzww) {
            zzww zzwwVar = (zzww) obj;
            if (this.zza.equals(zzwwVar.zza()) && this.zzb.equals(zzwwVar.zzb()) && this.zzc.equals(zzwwVar.zzc()) && this.zzd == zzwwVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        long j10 = this.zzd;
        return (iHashCode * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final u zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final u zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final UUID zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzww
    public final long zzd() {
        return this.zzd;
    }
}
