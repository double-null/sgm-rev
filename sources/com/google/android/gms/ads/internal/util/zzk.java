package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbjq;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzink;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzk implements zzbjq {
    final /* synthetic */ zzbjr zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    zzk(zzs zzsVar, zzbjr zzbjrVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbjrVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zza() {
        zzbjr zzbjrVar = this.zza;
        androidx.browser.customtabs.d.C0023d c0023d = new androidx.browser.customtabs.d.C0023d(zzbjrVar.zzc());
        zzs.zzai(c0023d, this.zzb);
        androidx.browser.customtabs.d dVarA = c0023d.a();
        Intent intent = dVarA.f1558a;
        Context context = this.zzc;
        intent.setPackage(zzink.zza(context));
        dVarA.a(context, this.zzd);
        zzbjrVar.zzb((Activity) context);
    }
}
