package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdp {
    public static final zzdp zza = new zzdp(0, 0, false);
    private final int zzb;
    private final int zzc;
    private final boolean zzd;

    private zzdp(int i10, int i11, boolean z10) {
        this.zzd = z10;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final int zza() {
        zzgtj.zzi(this.zzd);
        return this.zzb;
    }

    public final int zzb() {
        zzgtj.zzi(this.zzd);
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public zzdp(int i10, int i11) {
        this(i10, i11, true);
    }
}
