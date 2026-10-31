package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzt extends zzw {
    final /* synthetic */ zzq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzx zzxVar, CharSequence charSequence, zzq zzqVar) {
        super(zzxVar, charSequence);
        this.zza = zzqVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzc(int i10) {
        CharSequence charSequence = ((zzw) this).zzb;
        int length = charSequence.length();
        zzs.zzc(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzd(int i10) {
        return i10 + 1;
    }
}
