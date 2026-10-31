package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzt extends GmsClientSupervisor {
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzs zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile Executor zzi;
    private final boolean zzj;

    zzt(Context context, Looper looper, Executor executor) {
        zzs zzsVar = new zzs(this, null);
        this.zze = zzsVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzh(looper, zzsVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
        this.zzj = InternalClientFlagRegistry.getClientFlags().zza();
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final ConnectionResult zzb(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultZzb;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.zzb;
        synchronized (map) {
            zzr zzrVar = (zzr) map.get(zzoVar);
            if (executor == null) {
                executor = this.zzi;
            }
            if (zzrVar == null) {
                zzrVar = new zzr(this, zzoVar);
                zzrVar.zze(serviceConnection, serviceConnection, str);
                UserHandle userHandleZze = zzoVar.zze();
                connectionResultZzb = (userHandleZze == null || Build.VERSION.SDK_INT < 33) ? zzrVar.zzb(str, executor) : zzrVar.zzc(str, userHandleZze);
                map.put(zzoVar, zzrVar);
            } else {
                this.zzd.removeMessages(0, zzoVar);
                if (zzrVar.zzi(serviceConnection)) {
                    String string = zzoVar.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 81);
                    sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                zzrVar.zze(serviceConnection, serviceConnection, str);
                int iZzh = zzrVar.zzh();
                if (iZzh == 1) {
                    serviceConnection.onServiceConnected(zzrVar.zzl(), zzrVar.zzk());
                } else if (iZzh == 2) {
                    UserHandle userHandleZze2 = zzoVar.zze();
                    connectionResultZzb = (userHandleZze2 == null || Build.VERSION.SDK_INT < 33) ? zzrVar.zzb(str, executor) : zzrVar.zzc(str, userHandleZze2);
                }
                connectionResultZzb = null;
            }
            if (zzrVar.zzg()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            if (connectionResultZzb == null) {
                connectionResultZzb = new ConnectionResult(-1);
            }
            return connectionResultZzb;
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzd(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.zzb;
        synchronized (map) {
            zzr zzrVar = (zzr) map.get(zzoVar);
            if (zzrVar == null) {
                String string = zzoVar.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            if (!zzrVar.zzi(serviceConnection)) {
                String string2 = zzoVar.toString();
                StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb3.append(string2);
                throw new IllegalStateException(sb3.toString());
            }
            zzrVar.zzf(serviceConnection, str);
            if (zzrVar.zzj()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzoVar), this.zzg);
            }
        }
    }

    final void zze(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzh(looper, this.zze);
        }
    }

    final void zzf(Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    final /* synthetic */ void zzg(zzr zzrVar) {
        if (zzrVar.zzs() != null) {
            this.zzd.removeMessages(1, zzrVar.zzs());
            zzrVar.zzt(null);
        }
    }

    final /* synthetic */ HashMap zzh() {
        return this.zzb;
    }

    final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ Handler zzj() {
        return this.zzd;
    }

    final /* synthetic */ ConnectionTracker zzk() {
        return this.zzf;
    }

    final /* synthetic */ long zzl() {
        return this.zzh;
    }

    final /* synthetic */ boolean zzm() {
        return this.zzj;
    }
}
