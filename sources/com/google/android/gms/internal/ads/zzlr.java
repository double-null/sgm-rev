package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlr {
    public zzms zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlr(zzms zzmsVar) {
        this.zza = zzmsVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzms zzmsVar) {
        this.zze |= this.zza != zzmsVar;
        this.zza = zzmsVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzgtj.zza(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
