package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbjp extends androidx.browser.customtabs.e {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdzl zzd;
    private androidx.browser.customtabs.f zze;
    private androidx.browser.customtabs.c zzf;

    private final void zzf(Context context) {
        String strD;
        if (this.zzf != null || context == null || (strD = androidx.browser.customtabs.c.d(context, null)) == null || strD.equals(context.getPackageName())) {
            return;
        }
        androidx.browser.customtabs.c.a(context, strD, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        this.zzf = cVar;
        cVar.h(0L);
        this.zze = cVar.f(new zzbjm(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdzl zzdzlVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdzlVar;
        zzf(context);
    }

    public final androidx.browser.customtabs.f zzb() {
        if (this.zze == null) {
            zzcfr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfz)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcfr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i10);
            }
        });
    }

    final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    final /* synthetic */ void zze(int i10) {
        zzdzl zzdzlVar = this.zzd;
        if (zzdzlVar != null) {
            zzdzk zzdzkVarZza = zzdzlVar.zza();
            zzdzkVarZza.zzc("action", "cct_nav");
            zzdzkVarZza.zzc("cct_navs", String.valueOf(i10));
            zzdzkVarZza.zzd();
        }
    }
}
