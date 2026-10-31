package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhb extends BroadcastReceiver {
    private final zzpg zza;
    private boolean zzb;
    private boolean zzc;

    zzhb(zzpg zzpgVar) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("2ELjSgRQwU6jLvZN", new Object[]{this, context, intent});
    }

    public final void zza() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaX().zzg();
        if (this.zzb) {
            return;
        }
        zzpgVar.zzaZ().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpgVar.zzi().zzb();
        zzpgVar.zzaW().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    public final void zzb() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaX().zzg();
        zzpgVar.zzaX().zzg();
        if (this.zzb) {
            zzpgVar.zzaW().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpgVar.zzaZ().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zza.zzaW().zzb().zzb("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    final /* synthetic */ zzpg zzc() {
        return this.zza;
    }
}
