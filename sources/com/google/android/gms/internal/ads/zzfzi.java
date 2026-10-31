package com.google.android.gms.internal.ads;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfzi extends zzfzo {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfzi() {
    }

    public final zzfzo zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final zzfzo zzb(boolean z10) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final zzfzo zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final zzfzo zze(int i10) {
        this.zzd = 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final zzfzp zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfzj(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb2.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException(UyXgnuLGEkgnZE.GViWJyXd.concat(sb2.toString()));
    }
}
