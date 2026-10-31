package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzinl extends androidx.browser.customtabs.e {
    private final WeakReference zza;

    public zzinl(zzbjr zzbjrVar) {
        this.zza = new WeakReference(zzbjrVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        zzbjr zzbjrVar = (zzbjr) this.zza.get();
        if (zzbjrVar != null) {
            zzbjrVar.zzf(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjr zzbjrVar = (zzbjr) this.zza.get();
        if (zzbjrVar != null) {
            zzbjrVar.zzg();
        }
    }
}
