package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzb extends com.google.android.gms.internal.common.zzh {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        if (zzcVar != null) {
            zzcVar.zze();
        }
    }

    private static final boolean zzb(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient baseGmsClient = this.zza;
        if (baseGmsClient.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        boolean zZzs = true;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !baseGmsClient.enableLocalFallback()) || message.what == 5)) && !baseGmsClient.isConnecting()) {
            zza(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            baseGmsClient.zzr(new ConnectionResult(message.arg2));
            if (!baseGmsClient.zzk()) {
                zZzs = baseGmsClient.zzs();
            } else if (baseGmsClient.zzt() != baseGmsClient.zzd.get()) {
                zZzs = false;
            }
            if (!baseGmsClient.zzj() || zZzs) {
                ConnectionResult connectionResultZzq = baseGmsClient.zzq() != null ? baseGmsClient.zzq() : new ConnectionResult(8);
                baseGmsClient.zzc.onReportServiceBinding(connectionResultZzq);
                baseGmsClient.onConnectionFailed(connectionResultZzq);
                return;
            } else if (baseGmsClient.zzk()) {
                baseGmsClient.zze(3, null, message.arg1);
                return;
            } else {
                baseGmsClient.zzd(3, null);
                return;
            }
        }
        if (i11 == 5) {
            ConnectionResult connectionResultZzq2 = baseGmsClient.zzq() != null ? baseGmsClient.zzq() : new ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(connectionResultZzq2);
            baseGmsClient.onConnectionFailed(connectionResultZzq2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
            return;
        }
        if (i11 == 6) {
            if (baseGmsClient.zzk()) {
                baseGmsClient.zze(5, null, message.arg1);
            } else {
                baseGmsClient.zzd(5, null);
            }
            if (baseGmsClient.zzo() != null) {
                baseGmsClient.zzo().onConnectionSuspended(message.arg2);
            }
            baseGmsClient.onConnectionSuspended(message.arg2);
            if (baseGmsClient.zzk()) {
                baseGmsClient.zzg(5, 1, null, message.arg1);
                return;
            } else {
                baseGmsClient.zzf(5, 1, null);
                return;
            }
        }
        if (i11 == 2 && !baseGmsClient.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((zzc) message.obj).zzd();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
