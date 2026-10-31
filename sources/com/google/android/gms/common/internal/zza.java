package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zza extends zzc {
    public final int zza;
    public final Bundle zzb;
    final int zzc;
    final /* synthetic */ BaseGmsClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(BaseGmsClient baseGmsClient, int i10, Bundle bundle, int i11) {
        super(baseGmsClient, Boolean.TRUE);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzd = baseGmsClient;
        this.zza = i10;
        this.zzb = bundle;
        this.zzc = i11;
    }

    protected abstract boolean zza();

    protected abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zzc(Object obj) {
        BaseGmsClient baseGmsClient = this.zzd;
        int i10 = this.zza;
        boolean zZzk = baseGmsClient.zzk();
        if (i10 != 0) {
            if (zZzk) {
                baseGmsClient.zze(1, null, this.zzc);
            } else {
                baseGmsClient.zzd(1, null);
            }
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
            return;
        }
        if (zza()) {
            return;
        }
        if (zZzk) {
            baseGmsClient.zze(1, null, this.zzc);
        } else {
            baseGmsClient.zzd(1, null);
        }
        zzb(new ConnectionResult(8, null));
    }
}
