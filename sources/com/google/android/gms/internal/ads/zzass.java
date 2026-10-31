package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzass {
    private int zza = 2500;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final void zzc(zzatn zzatnVar) throws zzatn {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        int i11 = this.zza;
        this.zza = i11 + i11;
        if (i10 > 1) {
            throw zzatnVar;
        }
    }
}
