package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdvs implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzdvs(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzdvs zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzdvs(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        int i10 = ((zzdci) this.zzc).zza().zzp.zza;
        if (i10 != 0) {
            return i10 + (-1) != 0 ? ((zzeqv) this.zzb).zzb() : ((zzeqv) this.zza).zzb();
        }
        throw null;
    }
}
