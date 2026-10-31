package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgqt extends zzgru {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    zzgqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgru zza(int i10) {
        this.zza = i10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgru zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgru zzc(int i10) {
        this.zzc = i10;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final zzgrv zzd() {
        if (this.zzd == 3) {
            return new zzgqu(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
