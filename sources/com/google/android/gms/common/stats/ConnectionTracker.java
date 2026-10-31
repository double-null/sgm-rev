package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionTracker {
    private static final Object zzb = new Object();
    private static volatile ConnectionTracker zzc;
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        if (zzg(context, intent)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (!zzd(serviceConnection)) {
            return zzf(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zZzf = zzf(context, intent, serviceConnection, i10, executor);
            if (zZzf) {
                return zZzf;
            }
            this.zza.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.zza.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    private static boolean zzd(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzu);
    }

    private static void zze(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean zzf(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    private static final boolean zzg(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        try {
            return (Wrappers.packageManager(context).getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        if (!zzd(serviceConnection)) {
            zze(context, serviceConnection);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (!concurrentHashMap.containsKey(serviceConnection)) {
            zze(context, serviceConnection);
            return;
        }
        try {
            zze(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean zzb(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, UserHandle userHandle) {
        if (zzg(context, intent)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (!zzd(serviceConnection)) {
            return context.bindServiceAsUser(intent, serviceConnection, 4225, userHandle);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindServiceAsUser = context.bindServiceAsUser(intent, serviceConnection, 4225, userHandle);
            if (zBindServiceAsUser) {
                return zBindServiceAsUser;
            }
            this.zza.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.zza.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
