package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg extends zza {
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i10, Bundle bundle, int i11) {
        super(baseGmsClient, i10, bundle, i11);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzf = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zza() {
        this.zzf.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zzf;
        if (!baseGmsClient.enableLocalFallback() || !baseGmsClient.zzj()) {
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
        } else if (baseGmsClient.zzk()) {
            baseGmsClient.zzi(16, this.zzc, false);
        } else {
            baseGmsClient.zzh(16);
        }
    }
}
