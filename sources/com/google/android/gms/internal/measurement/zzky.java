package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.i;
import com.google.common.util.concurrent.l0;
import com.google.common.util.concurrent.x;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzky {
    public static final /* synthetic */ int zza = 0;
    private static UserManager zzb;
    private static volatile boolean zzc = !zza();

    private zzky() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzi(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzi(context);
    }

    public static ListenableFuture zzd(Context context, final Callable callable, Executor executor) {
        return zze(context, new i() { // from class: com.google.android.gms.internal.measurement.zzkx
            @Override // com.google.common.util.concurrent.i
            public final /* synthetic */ ListenableFuture call() {
                int i10 = zzky.zza;
                return x.j(callable, g0.a());
            }
        }, executor);
    }

    public static ListenableFuture zze(final Context context, i iVar, Executor executor) {
        if (zzc(context)) {
            return x.k(iVar, executor);
        }
        final l0 l0VarA = l0.a();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final zzkv zzkvVar = new zzkv(atomicBoolean, context, l0VarA, iVar, executor);
        context.registerReceiver(zzkvVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (zzc(context) && atomicBoolean.compareAndSet(false, true)) {
            zzh(context, zzkvVar);
            l0VarA.setFuture(x.k(iVar, executor));
        } else {
            l0VarA.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzky.zzj(l0VarA, atomicBoolean, context, zzkvVar);
                }
            }, g0.a());
        }
        return l0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e10) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004e A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:14:0x0015, B:16:0x0019, B:17:0x0023, B:30:0x004e, B:31:0x0050, B:20:0x0029, B:22:0x002f, B:26:0x003c, B:28:0x004a), top: B:36:0x0009, inners: #1 }] */
    private static boolean zzi(Context context) {
        if (zzc) {
            return true;
        }
        synchronized (zzky.class) {
            if (zzc) {
                return true;
            }
            int i10 = 1;
            while (true) {
                boolean z10 = false;
                if (i10 <= 2) {
                    if (zzb == null) {
                        zzb = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zzb;
                    if (userManager == null) {
                        z10 = true;
                    } else {
                        try {
                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                z10 = true;
                            }
                        } catch (NullPointerException e10) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                            zzb = null;
                            i10++;
                        }
                    }
                    if (z10) {
                        zzc = true;
                    }
                    return z10;
                }
                if (z10) {
                    zzb = null;
                }
                if (z10) {
                    zzc = true;
                }
                return z10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzj(l0 l0Var, AtomicBoolean atomicBoolean, Context context, BroadcastReceiver broadcastReceiver) {
        if (l0Var.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
            zzh(context, broadcastReceiver);
        }
    }
}
