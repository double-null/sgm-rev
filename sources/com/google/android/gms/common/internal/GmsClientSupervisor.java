package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.UserHandle;
import be.LNO.fzLzfW;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;
    private static zzt zzd;
    private static Executor zze;
    private static boolean zzf;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static GmsClientSupervisor getInstance(Context context) {
        synchronized (zzb) {
            if (zzd == null) {
                if (!zzf) {
                    zzf = GmsClientFlags.isBindServiceOptimizationEnabled(context.getPackageName());
                }
                zzd = new zzt(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
            }
        }
        return zzd;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null && handlerThread.isAlive()) {
                return zza;
            }
            HandlerThread handlerThread2 = new HandlerThread(fzLzfW.EqsRaSnwkYkGOFt, zzc);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (zzb) {
            zzt zztVar = zzd;
            if (zztVar != null) {
                zztVar.zzf(executor);
            }
            zze = executor;
        }
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i10) {
        synchronized (zzb) {
            if (zza != null) {
                return false;
            }
            zzc = i10;
            return true;
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            zzt zztVar = zzd;
            if (zztVar != null && !zzf) {
                zztVar.zze(getOrStartHandlerThread().getLooper());
            }
            zzf = true;
        }
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zzb(new zzo(componentName, 4225, null), serviceConnection, str, null).isSuccess();
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzd(new zzo(componentName, 4225, null), serviceConnection, str);
    }

    public boolean zza() {
        return false;
    }

    protected abstract ConnectionResult zzb(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);

    public final void zzc(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10, UserHandle userHandle) {
        zzd(new zzo(str, str2, 4225, z10, userHandle), serviceConnection, str3);
    }

    protected abstract void zzd(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zzd(new zzo(str, "com.google.android.gms", 4225, false, null), serviceConnection, str2);
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return zzb(new zzo(componentName, 4225, null), serviceConnection, str, executor).isSuccess();
    }

    public static HandlerThread getOrStartHandlerThread(int i10) {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null && handlerThread.isAlive()) {
                return zza;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i10);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zzb(new zzo(str, "com.google.android.gms", 4225, false, null), serviceConnection, str2, null).isSuccess();
    }
}
