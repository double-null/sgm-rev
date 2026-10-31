package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzkz;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlf;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzli;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbw implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;
    private final com.google.android.gms.internal.play_billing.zzbn zzc;
    private final com.google.android.gms.internal.play_billing.zzbn zzd;
    private final int zze;

    /* synthetic */ zzbw(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, int i10, zzci zzciVar) {
        Objects.requireNonNull(billingClientImpl);
        this.zza = billingClientImpl;
        this.zzc = com.google.android.gms.internal.play_billing.zzbn.zzc(billingClientImpl.zzM);
        this.zzd = com.google.android.gms.internal.play_billing.zzbn.zzc(billingClientImpl.zzM);
        this.zzb = billingClientStateListener;
        this.zze = i10;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    public static /* synthetic */ Object zza(zzbw zzbwVar) {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzjn zzjnVar;
        int i10;
        long j10;
        char c10;
        long j11;
        BillingClientImpl billingClientImpl = zzbwVar.zza;
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb != 3) {
                boolean z10 = billingClientImpl.zzb == 1;
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, billingClientImpl.zzc, billingClientImpl.zzd, billingClientImpl.zzL.longValue());
                }
                zzjn zzjnVar2 = zzjn.REASON_UNSPECIFIED;
                synchronized (billingClientImpl.zza) {
                    zzarVar = billingClientImpl.zzi;
                }
                if (zzarVar != null) {
                    String packageName = zzbwVar.zza.zzg.getPackageName();
                    try {
                        char c11 = 25;
                        if (zzarVar.zzb(25, packageName, BillingClient.ProductType.INAPP) == 0) {
                            BillingClientImpl billingClientImpl2 = zzbwVar.zza;
                            long jZzb = zzem.zzb(billingClientImpl2.zzg);
                            long jZzc = zzem.zzc(billingClientImpl2.zzg);
                            double dZza = zzem.zza(billingClientImpl2.zzg);
                            long jZzd = zzem.zzd(billingClientImpl2.zzg);
                            int i11 = 0;
                            long jMin = jZzc;
                            Exception e10 = null;
                            while (true) {
                                long j12 = i11;
                                if (j12 > jZzb) {
                                    break;
                                }
                                try {
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(z10);
                                        Bundle bundle2 = new Bundle();
                                        try {
                                            bundle2.putString("callingPackage", billingClientImpl2.zzg.getPackageName());
                                            long j13 = jMin;
                                            int i12 = i11;
                                            try {
                                                com.google.android.gms.internal.play_billing.zzc.zzc(bundle2, billingClientImpl2.zzc, billingClientImpl2.zzd, billingClientImpl2.zzL.longValue());
                                                if (billingClientImpl2.zzF != null && billingClientImpl2.zzF.isEnabledForOneTimeProducts()) {
                                                    bundle2.putBoolean(InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, true);
                                                }
                                                if (billingClientImpl2.zzF != null && billingClientImpl2.zzF.isEnabledForPrepaidPlans()) {
                                                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                                }
                                                String packageName2 = billingClientImpl2.zzg.getPackageName();
                                                BillingClientImpl billingClientImpl3 = billingClientImpl2;
                                                j10 = j13;
                                                i10 = i12;
                                                billingClientImpl2 = billingClientImpl2;
                                                jZzb = jZzb;
                                                j11 = jZzd;
                                                try {
                                                    try {
                                                        c10 = 25;
                                                        try {
                                                            zzarVar.zzq(25, packageName2, bundle2, new zzcd(billingClientImpl3, zzbwVar, boolValueOf, i10, null));
                                                        } catch (Exception e11) {
                                                            e10 = e11;
                                                            if (j12 != jZzb) {
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append("Transient error during initialize(), retrying in ");
                                                                long j14 = j10;
                                                                sb2.append(j14);
                                                                sb2.append("ms");
                                                                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", sb2.toString(), e10);
                                                                try {
                                                                    Thread.sleep(j14);
                                                                    jMin = (long) Math.min(j14 * dZza, j11);
                                                                    i11 = i10 + 1;
                                                                    c11 = c10;
                                                                    jZzd = j11;
                                                                    billingClientImpl2 = billingClientImpl2;
                                                                    jZzb = jZzb;
                                                                } catch (InterruptedException e12) {
                                                                    Thread.currentThread().interrupt();
                                                                    zzbwVar.zzl(e12, z10, i10);
                                                                }
                                                            } else {
                                                                i11 = i10;
                                                                zzbwVar.zzl(e10, z10, i11);
                                                            }
                                                        }
                                                    } catch (Exception e13) {
                                                        e10 = e13;
                                                        c10 = 25;
                                                    }
                                                } catch (SecurityException e14) {
                                                    e = e14;
                                                    i11 = i10;
                                                    zzbwVar.zzl(e, z10, i11);
                                                }
                                            } catch (SecurityException e15) {
                                                e = e15;
                                                i11 = i12;
                                            } catch (Exception e16) {
                                                e10 = e16;
                                                j10 = j13;
                                                c10 = 25;
                                                i10 = i12;
                                                j11 = jZzd;
                                                if (j12 != jZzb) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append("Transient error during initialize(), retrying in ");
                                                    long j15 = j10;
                                                    sb3.append(j15);
                                                    sb3.append("ms");
                                                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", sb3.toString(), e10);
                                                    Thread.sleep(j15);
                                                    jMin = (long) Math.min(j15 * dZza, j11);
                                                    i11 = i10 + 1;
                                                    c11 = c10;
                                                    jZzd = j11;
                                                    billingClientImpl2 = billingClientImpl2;
                                                    jZzb = jZzb;
                                                } else {
                                                    i11 = i10;
                                                    zzbwVar.zzl(e10, z10, i11);
                                                }
                                                return null;
                                            }
                                        } catch (Exception e17) {
                                            e10 = e17;
                                            i10 = i11;
                                            j10 = jMin;
                                            c10 = 25;
                                        }
                                    } catch (SecurityException e18) {
                                        e = e18;
                                    }
                                } catch (Exception e19) {
                                    e10 = e19;
                                    i10 = i11;
                                    j10 = jMin;
                                    c10 = c11;
                                }
                                jMin = (long) Math.min(j15 * dZza, j11);
                                i11 = i10 + 1;
                                c11 = c10;
                                jZzd = j11;
                                billingClientImpl2 = billingClientImpl2;
                                jZzb = jZzb;
                            }
                            zzbwVar.zzl(e10, z10, i11);
                        } else {
                            int iZzb = 3;
                            int i13 = 28;
                            while (true) {
                                if (i13 < 3) {
                                    i13 = 0;
                                    break;
                                }
                                try {
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "trying subs apiVersion: " + i13);
                                    iZzb = bundle == null ? zzarVar.zzb(i13, packageName, BillingClient.ProductType.SUBS) : zzarVar.zzc(i13, packageName, BillingClient.ProductType.SUBS, bundle);
                                    if (iZzb == 0) {
                                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "highestLevelSupportedForSubs: " + i13);
                                        break;
                                    }
                                    i13--;
                                } catch (Exception e20) {
                                    zzbwVar.zzm(e20, z10);
                                }
                            }
                            BillingClientImpl billingClientImpl4 = zzbwVar.zza;
                            billingClientImpl4.zzl = i13 >= 5;
                            billingClientImpl4.zzk = i13 >= 3;
                            if (i13 < 3) {
                                zzjnVar2 = zzjn.SUBSCRIPTIONS_NOT_SUPPORTED;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                            }
                            for (int i14 = 28; i14 >= 3; i14--) {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "trying inapp apiVersion: " + i14);
                                iZzb = bundle == null ? zzarVar.zzb(i14, packageName, BillingClient.ProductType.INAPP) : zzarVar.zzc(i14, packageName, BillingClient.ProductType.INAPP, bundle);
                                if (iZzb == 0) {
                                    billingClientImpl4.zzm = i14;
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "mHighestLevelSupportedForInApp: " + billingClientImpl4.zzm);
                                    break;
                                }
                            }
                            BillingClientImpl.zzao(billingClientImpl4, billingClientImpl4.zzm);
                            if (billingClientImpl4.zzm < 3) {
                                zzjn zzjnVar3 = zzjn.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                zzjnVar = zzjnVar3;
                            } else {
                                zzjnVar = zzjnVar2;
                            }
                            BillingClientImpl.zzaq(billingClientImpl4, iZzb);
                            if (iZzb == 0) {
                                zzbwVar.zzj(z10, 0);
                                zzbwVar.zzk(zzdc.zzi);
                            } else {
                                BillingResult billingResult = zzdc.zzb;
                                zzbwVar.zzi(billingResult, zzjnVar, null, z10, 0);
                                zzbwVar.zzk(billingResult);
                            }
                        }
                    } catch (Exception e21) {
                        zzbwVar.zzm(e21, z10);
                    }
                    return null;
                }
                BillingClientImpl billingClientImpl5 = zzbwVar.zza;
                billingClientImpl5.zzbj(0);
                int i15 = zzbwVar.zze;
                zzjn zzjnVar4 = zzjn.SERVICE_RESET_TO_NULL;
                BillingResult billingResult2 = zzdc.zzj;
                billingClientImpl5.zzbi(zzjnVar4, billingResult2, i15);
                zzbwVar.zzk(billingResult2);
            }
        }
        return null;
    }

    public static /* synthetic */ void zzb(zzbw zzbwVar) {
        BillingClientImpl billingClientImpl = zzbwVar.zza;
        billingClientImpl.zzbj(0);
        zzjn zzjnVar = zzjn.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbi(zzjnVar, billingResult, zzbwVar.zze);
        zzbwVar.zzk(billingResult);
    }

    private final Long zzh(boolean z10) {
        try {
            if (z10) {
                synchronized (this.zza.zza) {
                    com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.zzc;
                    if (!zzbnVar.zzg()) {
                        return null;
                    }
                    zzbnVar.zzf();
                    return Long.valueOf(zzbnVar.zza(TimeUnit.MILLISECONDS));
                }
            }
            synchronized (this.zza.zza) {
                com.google.android.gms.internal.play_billing.zzbn zzbnVar2 = this.zzd;
                if (!zzbnVar2.zzg()) {
                    return null;
                }
                zzbnVar2.zzf();
                return Long.valueOf(zzbnVar2.zza(TimeUnit.MILLISECONDS));
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th);
        }
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(BillingResult billingResult, zzjn zzjnVar, String str, boolean z10, int i10) {
        try {
            zzjl zzjlVarZza = zzjp.zza();
            zzjlVarZza.zzp(billingResult.getResponseCode());
            zzjlVarZza.zzb(billingResult.getDebugMessage());
            zzjlVarZza.zze(zzjnVar);
            zzjlVarZza.zzc(i10);
            if (str != null) {
                zzjlVarZza.zza(str);
            }
            Long lZzh = zzh(z10);
            if (!z10) {
                zzkz zzkzVarZza = zzlb.zza();
                zzkzVarZza.zza(zzjlVarZza);
                if (lZzh != null) {
                    zzkzVarZza.zzb(lZzh.longValue());
                }
                this.zza.zzh.zzm((zzlb) zzkzVarZza.zzi());
                return;
            }
            zzlg zzlgVarZza = zzli.zza();
            int i11 = this.zze;
            zzlgVarZza.zza(i11 > 0);
            zzlgVarZza.zzb(i11);
            zzlgVarZza.zzd(i10);
            if (lZzh != null) {
                zzlgVarZza.zzc(lZzh.longValue());
            }
            BillingClientImpl billingClientImpl = this.zza;
            zzje zzjeVarZza = zzjg.zza();
            zzjeVarZza.zzb(zzjlVarZza);
            zzjeVarZza.zzp(6);
            zzjeVarZza.zze(zzlgVarZza);
            billingClientImpl.zzbf((zzjg) zzjeVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(boolean z10, int i10) {
        try {
            Long lZzh = zzh(z10);
            if (!z10) {
                zzkz zzkzVarZza = zzlb.zza();
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zzp(0);
                zzjlVarZza.zzc(i10);
                zzkzVarZza.zza(zzjlVarZza);
                if (lZzh != null) {
                    zzkzVarZza.zzb(lZzh.longValue());
                }
                this.zza.zzh.zzm((zzlb) zzkzVarZza.zzi());
                return;
            }
            zzji zzjiVarZza = zzjk.zza();
            zzjiVarZza.zze(6);
            zzlg zzlgVarZza = zzli.zza();
            int i11 = this.zze;
            zzlgVarZza.zza(i11 > 0);
            zzlgVarZza.zzb(i11);
            zzlgVarZza.zzd(i10);
            if (lZzh != null) {
                zzlgVarZza.zzc(lZzh.longValue());
            }
            BillingClientImpl billingClientImpl = this.zza;
            zzjiVarZza.zzd(zzlgVarZza);
            billingClientImpl.zzbh((zzjk) zzjiVarZza.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(BillingResult billingResult) {
        BillingClientImpl billingClientImpl = this.zza;
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            try {
                this.zzb.onBillingSetupFinished(billingResult);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingSetupFinished.", th);
            }
        }
    }

    private final void zzl(Exception exc, boolean z10, int i10) {
        zzjn zzjnVar;
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while invoking initialize AIDL method", exc);
        if (exc instanceof DeadObjectException) {
            zzjnVar = zzjn.INITIALIZE_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            zzjnVar = zzjn.INITIALIZE_REMOTE_EXCEPTION;
        } else {
            zzjnVar = exc instanceof SecurityException ? zzjn.INITIALIZE_SECURITY_EXCEPTION : zzjn.INITIALIZE_SERVICE_CALL_EXCEPTION;
        }
        zzjn zzjnVar2 = zzjnVar;
        String strZza = zzcy.zza(exc);
        this.zza.zzbj(0);
        zzi(BillingClientImpl.zzn(exc), zzjnVar2, strZza, z10, i10);
        zzk(BillingClientImpl.zzn(exc));
    }

    private final void zzm(Exception exc, boolean z10) {
        zzjn zzjnVar;
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        if (exc instanceof DeadObjectException) {
            zzjnVar = zzjn.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            zzjnVar = zzjn.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
        } else {
            zzjnVar = exc instanceof SecurityException ? zzjn.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzjn.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        }
        zzjn zzjnVar2 = zzjnVar;
        String strZza = zzjnVar2.equals(zzjn.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? zzcy.zza(exc) : null;
        this.zza.zzbj(0);
        zzi(BillingClientImpl.zzn(exc), zzjnVar2, strZza, z10, 0);
        zzk(BillingClientImpl.zzn(exc));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing service died.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzau(billingClientImpl)) {
                zzcz zzczVar = billingClientImpl.zzh;
                zzje zzjeVarZza = zzjg.zza();
                zzjeVarZza.zzp(6);
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zze(zzjn.BINDING_DIED);
                zzjeVarZza.zzb(zzjlVarZza);
                zzlg zzlgVarZza = zzli.zza();
                int i10 = this.zze;
                zzlgVarZza.zza(i10 > 0);
                zzlgVarZza.zzb(i10);
                zzjeVarZza.zze(zzlgVarZza);
                zzczVar.zza((zzjg) zzjeVarZza.zzi());
            } else {
                billingClientImpl.zzh.zzi(zzjs.zzb());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        synchronized (billingClientImpl2.zza) {
            if (billingClientImpl2.zzb != 3 && billingClientImpl2.zzb != 0) {
                billingClientImpl2.zzbj(0);
                billingClientImpl2.zzbm();
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service connected.");
        BillingClientImpl billingClientImpl = this.zza;
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            billingClientImpl.zzi = com.google.android.gms.internal.play_billing.zzaq.zzu(iBinder);
            if (BillingClientImpl.zzN(new Callable() { // from class: com.android.billingclient.api.zzbu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbw.zza(this.zza);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbv
                @Override // java.lang.Runnable
                public final void run() {
                    zzbw.zzb(this.zza);
                }
            }, billingClientImpl.zzaz(), billingClientImpl.zzM()) == null) {
                int i10 = this.zze;
                BillingResult billingResultZzaC = billingClientImpl.zzaC();
                billingClientImpl.zzbi(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, billingResultZzaC, i10);
                zzk(billingResultZzaC);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing service disconnected.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzau(billingClientImpl)) {
                zzcz zzczVar = billingClientImpl.zzh;
                zzje zzjeVarZza = zzjg.zza();
                zzjeVarZza.zzp(6);
                zzjl zzjlVarZza = zzjp.zza();
                zzjlVarZza.zze(zzjn.SERVICE_DISCONNECTED);
                zzjeVarZza.zzb(zzjlVarZza);
                zzlg zzlgVarZza = zzli.zza();
                int i10 = this.zze;
                zzlgVarZza.zza(i10 > 0);
                zzlgVarZza.zzb(i10);
                zzjeVarZza.zze(zzlgVarZza);
                zzczVar.zza((zzjg) zzjeVarZza.zzi());
            } else {
                billingClientImpl.zzh.zzn(zzlf.zzb());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        synchronized (billingClientImpl2.zza) {
            com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.zzd;
            zzbnVar.zzd();
            zzbnVar.zze();
            if (billingClientImpl2.zzb == 3) {
                return;
            }
            billingClientImpl2.zzbj(0);
            try {
                this.zzb.onBillingServiceDisconnected();
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
            }
        }
    }

    public final void zzf() {
        synchronized (this.zza.zza) {
            com.google.android.gms.internal.play_billing.zzbn zzbnVar = this.zzc;
            zzbnVar.zzd();
            zzbnVar.zze();
        }
    }

    final boolean zzg() {
        return this.zze > 0;
    }
}
