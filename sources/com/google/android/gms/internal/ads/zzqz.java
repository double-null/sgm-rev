package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqz {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqz zza(boolean z10) {
        this.zza = z10;
        return this;
    }

    public final zzqz zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzqz zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzqz zzd(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzra zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzra(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
