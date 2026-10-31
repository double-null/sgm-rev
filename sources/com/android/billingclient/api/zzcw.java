package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcw extends BillingClientImpl {
    private final Context zza;
    private volatile int zzb;
    private volatile com.google.android.gms.internal.play_billing.zzba zzc;
    private volatile zzcu zzd;
    private volatile ScheduledExecutorService zze;

    zzcw(String str, Context context, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, context, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    public static /* synthetic */ Object zzaH(zzcw zzcwVar, int i10, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        String str;
        try {
            zzcwVar.zzc.getClass();
            com.google.android.gms.internal.play_billing.zzba zzbaVar = zzcwVar.zzc;
            String packageName = zzcwVar.zza.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            zzbaVar.zza(packageName, str, new zzct(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            zzcwVar.zzaR(zzjn.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzaK(com.google.android.gms.internal.play_billing.zzdk zzdkVar) {
        try {
            return ((Integer) zzdkVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            zzaR(zzjn.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, zzdc.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzaR(zzjn.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, zzdc.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService zzaL() {
        if (this.zze == null) {
            this.zze = Executors.newSingleThreadScheduledExecutor();
        }
        return this.zze;
    }

    private final synchronized void zzaM() {
        zzaS(27);
        try {
            try {
                zzcv zzcvVar = null;
                if (this.zzd != null && this.zzc != null) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.zza.unbindService(this.zzd);
                    this.zzd = new zzcu(this, zzcvVar);
                }
                this.zzc = null;
                if (this.zze != null) {
                    this.zze.shutdownNow();
                    this.zze = null;
                }
            } catch (RuntimeException e10) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.zzb = 3;
        } catch (Throwable th) {
            this.zzb = 3;
            throw th;
        }
    }

    private final synchronized void zzaN() {
        if (zzaF()) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            zzaS(26);
            return;
        }
        if (this.zzb == 1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.zzb == 3) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            zzaR(zzjn.BILLING_CLIENT_CLOSED, 26, zzdc.zza(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.zzb = 1;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Starting Billing Override Service setup.");
        this.zzd = new zzcu(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.zza;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzjn zzjnVar = zzjn.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzjnVar = zzjn.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzjnVar = zzjn.BILLING_SERVICE_BLOCKED;
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.zzd, 1)) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzjnVar = zzjn.BILLING_SERVICE_BLOCKED;
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.zzb = 0;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service unavailable on device.");
        zzaR(zzjnVar, 26, zzdc.zza(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzaO(int i10) {
        return i10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzaP(int i10, int i11) {
        BillingResult billingResultZza = zzdc.zza(i11, "Billing override value was set by a license tester.");
        zzaR(zzjn.LICENSE_TESTER_BILLING_OVERRIDE, i10, billingResultZza);
        return billingResultZza;
    }

    private final com.google.android.gms.internal.play_billing.zzdk zzaQ(final int i10) {
        if (zzaF()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzcn
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return zzcw.zzaH(this.zza, i10, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Billing Override Service is not ready.");
        zzaR(zzjn.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, zzdc.zza(-1, "Billing Override Service connection is disconnected."));
        return com.google.android.gms.internal.play_billing.zzdf.zza(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaR(zzjn zzjnVar, int i10, BillingResult billingResult) {
        int i11 = zzcy.zza;
        zzjg zzjgVarZzb = zzcy.zzb(zzjnVar, i10, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjgVarZzb, "ApiFailure should not be null");
        zzl().zza(zzjgVarZzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaS(int i10) {
        int i11 = zzcy.zza;
        zzjk zzjkVarZzc = zzcy.zzc(i10, zzju.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjkVarZzc, "ApiSuccess should not be null");
        zzl().zzf(zzjkVarZzc);
    }

    private final void zzaT(int i10, w.b bVar, Runnable runnable) {
        com.google.android.gms.internal.play_billing.zzdf.zzc(com.google.android.gms.internal.play_billing.zzdf.zzb(zzaQ(i10), 28500L, TimeUnit.MILLISECONDS, zzaL()), new zzcs(this, i10, bVar, runnable), zzM());
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        zzaT(3, new w.b() { // from class: com.android.billingclient.api.zzco
            @Override // w.b
            public final void accept(Object obj) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzcp
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        zzaT(4, new w.b() { // from class: com.android.billingclient.api.zzcl
            @Override // w.b
            public final void accept(Object obj) {
                consumeResponseListener.onConsumeResponse((BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzcm
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.consumeAsync(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        zzaM();
        super.endConnection();
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(final Activity activity, final BillingFlowParams billingFlowParams) {
        w.b bVar = new w.b() { // from class: com.android.billingclient.api.zzcq
            @Override // w.b
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.BillingClientImpl*/.zzo((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzcr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.BillingClientImpl*/.launchBillingFlow(activity, billingFlowParams);
            }
        };
        int iZzaK = zzaK(zzaQ(2));
        if (zzaO(iZzaK)) {
            BillingResult billingResultZzaP = zzaP(2, iZzaK);
            bVar.accept(billingResultZzaP);
            return billingResultZzaP;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception e10) {
            zzjn zzjnVar = zzjn.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            BillingResult billingResult = zzdc.zzh;
            zzaR(zzjnVar, 2, billingResult);
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClientTesting", "An internal error occurred.", e10);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        zzaT(7, new w.b() { // from class: com.android.billingclient.api.zzcj
            @Override // w.b
            public final void accept(Object obj) {
                QueryProductDetailsResult queryProductDetailsResult = new QueryProductDetailsResult(new ArrayList(), new ArrayList());
                productDetailsResponseListener.onProductDetailsResponse((BillingResult) obj, queryProductDetailsResult);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzck
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.BillingClientImpl*/.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClientImpl, com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        zzaN();
        super.startConnection(billingClientStateListener);
    }

    public final synchronized boolean zzaF() {
        return (this.zzb != 2 || this.zzc == null || this.zzd == null) ? false : true;
    }

    zzcw(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzdp zzdpVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, null, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    zzcw(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, purchasesUpdatedListener, null, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }

    zzcw(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener, developerProvidedBillingListener, null, null, builder);
        this.zzb = 0;
        this.zza = context;
    }
}
