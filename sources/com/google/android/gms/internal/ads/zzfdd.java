package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzfdd implements zzhbe {
    static final /* synthetic */ zzfdd zza = new zzfdd();

    private /* synthetic */ zzfdd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.d dVar = (androidx.privacysandbox.ads.adservices.topics.d) obj;
        if (dVar == null) {
            return zzhbw.zza(new zzfdf("", 1, null));
        }
        zzihy zzihyVarZzc = zzihz.zzc();
        for (androidx.privacysandbox.ads.adservices.topics.f fVar : dVar.a()) {
            zzihw zzihwVarZzc = zzihx.zzc();
            zzihwVarZzc.zza(fVar.c());
            zzihwVarZzc.zzb(fVar.a());
            zzihwVarZzc.zzc(fVar.b());
            zzihyVarZzc.zza((zzihx) zzihwVarZzc.zzbu());
        }
        return zzhbw.zza(new zzfdf(Base64.encodeToString(((zzihz) zzihyVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
