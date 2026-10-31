package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.util.PlatformVersion;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzql extends BroadcastReceiver {
    static volatile zzqj zza;
    private static volatile zzqk zzb;

    public static void zza(Context context, zzqk zzqkVar, zzqj zzqjVar) {
        if (zzb == null) {
            synchronized (zzql.class) {
                if (zzb == null) {
                    if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (PlatformVersion.isAtLeastT()) {
                            context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                    }
                    zzb = zzqkVar;
                    zza = zzqjVar;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("SrPLEf1cJZbrHV9N", new Object[]{this, context, intent});
    }
}
