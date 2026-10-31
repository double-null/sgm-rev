package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzxk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzxk(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxk)) {
            return false;
        }
        zzxk zzxkVar = (zzxk) obj;
        return this.zza.equals(zzxkVar.zza) && this.zzb == zzxkVar.zzb && this.zzc == zzxkVar.zzc && this.zzd == zzxkVar.zzd && this.zze == zzxkVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzxk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzxk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzxk(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public zzxk(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzxk(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
