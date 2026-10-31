package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzf extends zza {
    public final IBinder zzf;
    final /* synthetic */ BaseGmsClient zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i10, IBinder iBinder, Bundle bundle, int i11) {
        super(baseGmsClient, i10, bundle, i11);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzg = baseGmsClient;
        this.zzf = iBinder;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zza() {
        boolean z10;
        try {
            IBinder iBinder = this.zzf;
            Preconditions.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.zzg;
            if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = baseGmsClient.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = baseGmsClient.createServiceInterface(this.zzf);
            if (iInterfaceCreateServiceInterface != null) {
                if (baseGmsClient.zzk()) {
                    int i10 = this.zzc;
                    if (baseGmsClient.zzg(2, 4, iInterfaceCreateServiceInterface, i10) || baseGmsClient.zzg(3, 4, iInterfaceCreateServiceInterface, i10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (baseGmsClient.zzf(2, 4, iInterfaceCreateServiceInterface) || baseGmsClient.zzf(3, 4, iInterfaceCreateServiceInterface)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    baseGmsClient.zzr(null);
                    Bundle connectionHint = baseGmsClient.getConnectionHint();
                    ConnectionThrottlingConfig connectionThrottlingConfig = baseGmsClient.usesClientThrottling() ? baseGmsClient.getConnectionThrottlingConfig() : null;
                    if (connectionThrottlingConfig != null) {
                        if (connectionHint == null) {
                            connectionHint = new Bundle();
                        }
                        connectionHint.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", SafeParcelableSerializer.serializeToBytes(connectionThrottlingConfig));
                    } else if (connectionHint != null) {
                        connectionHint.remove("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
                    }
                    if (baseGmsClient.zzo() != null) {
                        baseGmsClient.zzo().onConnected(connectionHint);
                    }
                    return true;
                }
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zzg;
        if (baseGmsClient.zzp() != null) {
            baseGmsClient.zzp().onConnectionFailed(connectionResult);
        }
        baseGmsClient.onConnectionFailed(connectionResult);
    }
}
