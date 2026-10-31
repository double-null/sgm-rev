package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zze implements ServiceConnection {
    final /* synthetic */ BaseGmsClient zza;
    private final int zzb;
    private final boolean zzc;

    public zze(BaseGmsClient baseGmsClient, int i10, boolean z10) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
        this.zzb = i10;
        this.zzc = z10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            BaseGmsClient baseGmsClient = this.zza;
            if (baseGmsClient.zzk()) {
                baseGmsClient.zzi(16, this.zzb, this.zzc);
                return;
            } else {
                baseGmsClient.zzh(16);
                return;
            }
        }
        BaseGmsClient baseGmsClient2 = this.zza;
        synchronized (baseGmsClient2.zzl()) {
            if (!baseGmsClient2.zzk() || this.zzb == baseGmsClient2.zzd.get()) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient2.zzm((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzac(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface);
                baseGmsClient2.zzb(0, null, this.zzb);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.zza;
        synchronized (baseGmsClient.zzl()) {
            baseGmsClient.zzm(null);
        }
        BaseGmsClient baseGmsClient2 = this.zza;
        int i10 = this.zzb;
        Handler handler = baseGmsClient2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
