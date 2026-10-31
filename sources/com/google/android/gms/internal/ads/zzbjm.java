package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbjm extends androidx.browser.customtabs.b {
    final /* synthetic */ zzbjp zza;

    zzbjm(zzbjp zzbjpVar) {
        Objects.requireNonNull(zzbjpVar);
        this.zza = zzbjpVar;
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.zzc(i10);
    }
}
