package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgtr extends zzgtw {
    zzgtr(zzgty zzgtyVar, CharSequence charSequence, int i10) {
        super(zzgtyVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzc(int i10) {
        CharSequence charSequence = ((zzgtw) this).zzb;
        int i11 = i10 + Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        if (i11 < charSequence.length()) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzd(int i10) {
        return i10;
    }
}
