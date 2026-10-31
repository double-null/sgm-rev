package com.android.billingclient.api;

import android.content.Context;
import b2.c;
import b2.g;
import b2.h;
import com.google.android.gms.internal.play_billing.zzkr;
import d2.u;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdo {
    private boolean zza;
    private h zzb;

    zzdo(Context context) {
        try {
            u.f(context);
            this.zzb = u.c().g(com.google.android.datatransport.cct.a.f11198g).a("PLAY_BILLING_LIBRARY", zzkr.class, b2.b.b("proto"), new g() { // from class: com.android.billingclient.api.zzdn
                @Override // b2.g
                public final Object apply(Object obj) {
                    return ((zzkr) obj).zzQ();
                }
            });
        } catch (Throwable unused) {
            this.zza = true;
        }
    }

    public final void zza(zzkr zzkrVar) {
        if (this.zza) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.zzb.b(c.f(zzkrVar));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "logging failed.");
        }
    }
}
