package com.android.billingclient.api;

import android.content.Context;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzem {
    static synchronized double zza(final Context context) {
        return ((Double) zze(new zzel(context) { // from class: com.android.billingclient.api.zzek
            @Override // com.android.billingclient.api.zzel
            public final Object zza() {
                return Double.valueOf(2.0d);
            }
        }, Double.valueOf(2.0d))).doubleValue();
    }

    static synchronized long zzb(final Context context) {
        return ((Long) zze(new zzel(context) { // from class: com.android.billingclient.api.zzej
            @Override // com.android.billingclient.api.zzel
            public final Object zza() {
                return 3L;
            }
        }, 3L)).longValue();
    }

    static synchronized long zzc(final Context context) {
        return ((Long) zze(new zzel(context) { // from class: com.android.billingclient.api.zzeh
            @Override // com.android.billingclient.api.zzel
            public final Object zza() {
                return 100L;
            }
        }, 100L)).longValue();
    }

    static synchronized long zzd(final Context context) {
        return ((Long) zze(new zzel(context) { // from class: com.android.billingclient.api.zzei
            @Override // com.android.billingclient.api.zzel
            public final Object zza() {
                return 60000L;
            }
        }, 60000L)).longValue();
    }

    private static Object zze(zzel zzelVar, Object obj) {
        try {
            return zzelVar.zza();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzo("RuntimeFlags", "Fail to get the runtime flags: ".concat(e10.toString()));
            return obj;
        }
    }
}
