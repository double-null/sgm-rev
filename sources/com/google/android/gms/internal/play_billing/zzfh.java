package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzfh extends zzfk {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfh(byte[] bArr, int i10, int i11, boolean z10, zzfj zzfjVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i10) throws zzgs {
        int i11 = this.zzd;
        this.zzd = 0;
        int i12 = this.zzb + this.zzc;
        this.zzb = i12;
        if (i12 > 0) {
            this.zzc = i12;
            this.zzb = i12 - i12;
        } else {
            this.zzc = 0;
        }
        return i11;
    }
}
