package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzer {
    private static zzer zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;
    private int zze;
    private boolean zzf;

    private zzer(final Context context) {
        Executor executorZza = zzdh.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzeq(this.zza, null), intentFilter);
            }
        });
    }

    public static synchronized zzer zza(Context context) {
        if (zza == null) {
            zza = new zzer(context);
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList<zzen> copyOnWriteArrayList = this.zzc;
        for (zzen zzenVar : copyOnWriteArrayList) {
            if (zzenVar.zza()) {
                copyOnWriteArrayList.remove(zzenVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i10) {
        zzg();
        synchronized (this.zzd) {
            if (this.zzf && this.zze == i10) {
                return;
            }
            this.zzf = true;
            this.zze = i10;
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((zzen) it.next()).zzb();
            }
        }
    }

    public final void zzb(zzel zzelVar, Executor executor) {
        boolean z10;
        zzg();
        zzen zzenVar = new zzen(this, zzelVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzenVar);
            z10 = this.zzf;
        }
        if (z10) {
            zzenVar.zzb();
        }
    }

    public final int zzc() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    final /* synthetic */ void zzd(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i10 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type == 1) {
                        i10 = 2;
                    } else if (type == 4 || type == 5) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type != 6) {
                        i10 = type != 9 ? 8 : 7;
                    } else {
                        i10 = 5;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i10 != 5) {
            zze(i10);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            zzek zzekVar = new zzek(this);
            telephonyManager.registerTelephonyCallback(this.zzb, zzekVar);
            telephonyManager.unregisterTelephonyCallback(zzekVar);
        } catch (RuntimeException unused2) {
            zze(5);
        }
    }

    final /* synthetic */ Executor zzf() {
        return this.zzb;
    }
}
