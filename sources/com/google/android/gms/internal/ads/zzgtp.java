package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgtp extends zzgtw {
    final /* synthetic */ zzgsx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtp(zzgty zzgtyVar, CharSequence charSequence, zzgsx zzgsxVar) {
        super(zzgtyVar, charSequence);
        this.zza = zzgsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    final int zzc(int i10) {
        CharSequence charSequence = ((zzgtw) this).zzb;
        int length = charSequence.length();
        zzgtj.zzn(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    final int zzd(int i10) {
        return i10 + 1;
    }
}
