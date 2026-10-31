package com.google.android.gms.internal.measurement;

import com.google.common.collect.u;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvo extends zzwv {
    private u zza;
    private u zzb;
    private UUID zzc;
    private long zzd;
    private byte zze;

    zzvo() {
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zza(u uVar) {
        if (uVar == null) {
            throw new NullPointerException("Null spansNames");
        }
        this.zza = uVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zzb(u uVar) {
        if (uVar == null) {
            throw new NullPointerException("Null extras");
        }
        this.zzb = uVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zzc(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        this.zzc = uuid;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzwv zzd(long j10) {
        this.zzd = -1L;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzwv
    public final zzww zze() {
        u uVar;
        u uVar2;
        UUID uuid;
        if (this.zze == 1 && (uVar = this.zza) != null && (uVar2 = this.zzb) != null && (uuid = this.zzc) != null) {
            return new zzvp(uVar, uVar2, uuid, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" spansNames");
        }
        if (this.zzb == null) {
            sb2.append(" extras");
        }
        if (this.zzc == null) {
            sb2.append(" rootTraceId");
        }
        if (this.zze == 0) {
            sb2.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
