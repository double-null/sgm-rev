package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.g;
import b2.Bo.yeILL;
import com.android.billingclient.BuildConfig;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzih;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzje;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkf;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzli;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes2.dex */
class BillingClientImpl extends BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private PendingPurchasesParams zzF;
    private boolean zzG;
    private boolean zzH;
    private com.google.android.gms.internal.play_billing.zzcf zzI;
    private volatile BillingClientStateListener zzJ;
    private ExecutorService zzK;
    private final Long zzL;
    private final com.google.android.gms.internal.play_billing.zzbq zzM;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final String zzd;
    private final Handler zze;
    private volatile zzab zzf;
    private Context zzg;
    private zzcz zzh;
    private volatile com.google.android.gms.internal.play_billing.zzar zzi;
    private volatile zzbw zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    BillingClientImpl(String str, Context context, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = com.google.android.gms.internal.play_billing.zzcf.zzk();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.zzL = lValueOf;
        this.zzM = com.google.android.gms.internal.play_billing.zzbf.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String strZzaI = zzaI();
        this.zzd = strZzaI;
        this.zzg = context.getApplicationContext();
        zzjz zzjzVarZza = zzkb.zza();
        zzjzVarZza.zzx(BuildConfig.VERSION_NAME);
        if (strZzaI != null) {
            zzjzVarZza.zzy(strZzaI);
        }
        zzjzVarZza.zzq(this.zzg.getPackageName());
        zzjzVarZza.zzd(lValueOf.longValue());
        zzjzVarZza.zzw(builder.zza);
        zzjzVarZza.zza(Build.VERSION.SDK_INT);
        zzjzVarZza.zzp(912213584L);
        zzbr(zzjzVarZza, context);
        try {
            zzjzVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzdm(this.zzg, (zzkb) zzjzVarZza.zzi());
        this.zzg.getPackageName();
        this.zzG = builder.zza;
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, zzb zzbVar, String str, zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjz zzjzVarZza = zzkb.zza();
        zzjzVarZza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zzjzVarZza.zzy(str2);
        }
        zzjzVarZza.zzq(this.zzg.getPackageName());
        zzjzVarZza.zzd(this.zzL.longValue());
        zzjzVarZza.zzw(builder.zza);
        zzjzVarZza.zza(Build.VERSION.SDK_INT);
        zzjzVarZza.zzp(912213584L);
        zzbr(zzjzVarZza, context);
        try {
            zzjzVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdm(this.zzg, (zzkb) zzjzVarZza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, zzbVar, null, null, this.zzh);
        this.zzF = pendingPurchasesParams;
        this.zzH = zzbVar != null;
        this.zzg.getPackageName();
        this.zzG = builder.zza;
    }

    public static /* synthetic */ Void zzD(BillingClientImpl billingClientImpl, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        billingClientImpl.zzaO(alternativeBillingOnlyInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzE(BillingClientImpl billingClientImpl, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        billingClientImpl.zzaN(externalOfferAvailabilityListener);
        return null;
    }

    public static /* synthetic */ Void zzF(BillingClientImpl billingClientImpl, BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i10) throws Exception {
        billingClientImpl.zzaM(billingProgramAvailabilityListener, i10);
        return null;
    }

    public static /* synthetic */ Void zzG(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener, LaunchExternalLinkParams launchExternalLinkParams, Activity activity) throws RemoteException {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzci zzciVar = null;
        try {
            if (!billingClientImpl.zzbo(zzdl.zzb())) {
                billingClientImpl.zzbc(launchExternalLinkResponseListener, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
            } else if (billingClientImpl.zzD) {
                synchronized (billingClientImpl.zza) {
                    zzarVar = billingClientImpl.zzi;
                }
                if (zzarVar == null) {
                    billingClientImpl.zzbc(launchExternalLinkResponseListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = billingClientImpl.zzg.getPackageName();
                    String str = billingClientImpl.zzd;
                    long jLongValue = billingClientImpl.zzL.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, BuildConfig.VERSION_NAME, str, jLongValue);
                    zzie zzieVarZza = zzih.zza();
                    zziy zziyVarZza = zzja.zza();
                    zziyVarZza.zza(launchExternalLinkParams.getLinkUri().toString());
                    zzieVarZza.zza("externalOfferUri", (zzja) zziyVarZza.zzi());
                    zziy zziyVarZza2 = zzja.zza();
                    zziyVarZza2.zza(String.valueOf(launchExternalLinkParams.getLaunchMode()));
                    zzieVarZza.zza("externalOfferLaunchMode", (zzja) zziyVarZza2.zzi());
                    zziy zziyVarZza3 = zzja.zza();
                    zziyVarZza3.zza(String.valueOf(launchExternalLinkParams.getLinkType()));
                    zzieVarZza.zza("externalOfferLinkType", (zzja) zziyVarZza3.zzi());
                    zziy zziyVarZza4 = zzja.zza();
                    zziyVarZza4.zza(String.valueOf(launchExternalLinkParams.getBillingProgram()));
                    zzieVarZza.zza("externalOfferBillingProgram", (zzja) zziyVarZza4.zzi());
                    if (!TextUtils.isEmpty(null)) {
                        zziy zziyVarZza5 = zzja.zza();
                        zziyVarZza5.zza(null);
                        zzieVarZza.zza("externalTransactionToken", (zzja) zziyVarZza5.zzi());
                    }
                    bundle.putByteArray("REQUEST_PARAMS", ((zzih) zzieVarZza.zzi()).zzQ());
                    zzarVar.zzp(27, packageName, bundle, new zzcc(billingClientImpl, new WeakReference(activity), launchExternalLinkResponseListener, zzciVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support launch external link.");
                billingClientImpl.zzbc(launchExternalLinkResponseListener, zzdc.zzH, zzjn.LAUNCH_EXTERNAL_LINK_NOT_SUPPORTED, null);
            }
        } catch (RuntimeException e10) {
            billingClientImpl.zzbc(launchExternalLinkResponseListener, zzdc.zzh, zzjn.SERVICE_CALL_EXCEPTION, e10);
        }
        return null;
    }

    public static /* synthetic */ Void zzH(BillingClientImpl billingClientImpl, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        billingClientImpl.zzaL(externalOfferReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzI(BillingClientImpl billingClientImpl, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        billingClientImpl.zzaP(externalOfferInformationDialogListener, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Void zzJ(BillingClientImpl billingClientImpl, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        billingClientImpl.zzaJ(alternativeBillingOnlyReportingDetailsListener);
        return null;
    }

    public static /* synthetic */ Void zzK(BillingClientImpl billingClientImpl, BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) throws Exception {
        billingClientImpl.zzaK(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
        return null;
    }

    public static /* synthetic */ Void zzL(BillingClientImpl billingClientImpl, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzci zzciVar = null;
        try {
            if (!billingClientImpl.zzbo(zzdl.zzb())) {
                billingClientImpl.zzaT(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
            } else if (billingClientImpl.zzy) {
                synchronized (billingClientImpl.zza) {
                    zzarVar = billingClientImpl.zzi;
                }
                if (zzarVar == null) {
                    billingClientImpl.zzaT(alternativeBillingOnlyAvailabilityListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzarVar.zzr(21, billingClientImpl.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(billingClientImpl.zzc, billingClientImpl.zzd, billingClientImpl.zzL.longValue()), new zzce(alternativeBillingOnlyAvailabilityListener, billingClientImpl.zzh, billingClientImpl.zzm, zzciVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                billingClientImpl.zzaT(alternativeBillingOnlyAvailabilityListener, zzdc.zzD, zzjn.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (Exception e10) {
            billingClientImpl.zzaT(alternativeBillingOnlyAvailabilityListener, e10 instanceof DeadObjectException ? zzdc.zzj : zzdc.zzh, zzjn.IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_SERVICE_CALL_EXCEPTION, e10);
        }
        return null;
    }

    static Future zzN(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbb
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* synthetic */ void zzO(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        zzjn zzjnVar = zzjn.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbv(zzjnVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
    }

    public static /* synthetic */ void zzP(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener) {
        zzjn zzjnVar = zzjn.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbv(zzjnVar, 9, billingResult);
        purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzca.zzk());
    }

    public static /* synthetic */ void zzQ(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) {
        zzjn zzjnVar = zzjn.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbv(zzjnVar, 13, billingResult);
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    public static /* synthetic */ void zzU(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzjn zzjnVar = zzjn.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbv(zzjnVar, 3, billingResult);
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    public static /* synthetic */ void zzW(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener) {
        zzjn zzjnVar = zzjn.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbv(zzjnVar, 7, billingResult);
        productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzca.zzk(), com.google.android.gms.internal.play_billing.zzca.zzk()));
    }

    public static /* synthetic */ void zzY(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        if (billingClientImpl.zzf.zzf() != null) {
            billingClientImpl.zzf.zzf().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    private final zzch zzaA(BillingResult billingResult, zzjn zzjnVar, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        zzbx(zzjnVar, 7, billingResult, zzcy.zza(exc));
        return new zzch(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList(), new ArrayList());
    }

    private final BillingResult zzaB(int i10) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzji zzjiVarZza = zzjk.zza();
        zzjiVarZza.zze(6);
        zzlg zzlgVarZza = zzli.zza();
        zzlgVarZza.zze(true);
        zzlgVarZza.zza(i10 > 0);
        zzlgVarZza.zzb(i10);
        zzjiVarZza.zzd(zzlgVarZza);
        zzbh((zzjk) zzjiVarZza.zzi());
        return zzdc.zzi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzaC() {
        BillingResult billingResult;
        int[] iArr = {0, 3};
        synchronized (this.zza) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.zzb == iArr[i10]) {
                    billingResult = zzdc.zzj;
                }
            }
            billingResult = zzdc.zzh;
        }
        return billingResult;
    }

    private final com.google.android.gms.internal.play_billing.zzdk zzaD(final int i10) {
        if (this.zzG && !zzbp()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.google.android.gms.internal.play_billing.zzr() { // from class: com.android.billingclient.api.zzad
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(com.google.android.gms.internal.play_billing.zzp zzpVar) {
                    return BillingClientImpl.zzu(this.zza, i10, zzpVar);
                }
            });
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Already connected or not opted into auto reconnection.");
        return com.google.android.gms.internal.play_billing.zzdf.zza(zzdc.zzi);
    }

    private final /* synthetic */ Object zzaE(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            if (!zzbo(zzdl.zzb())) {
                zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbv(zzjnVar, 3, billingResult);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Please provide a valid purchase token.");
                zzjn zzjnVar2 = zzjn.EMPTY_PURCHASE_TOKEN;
                BillingResult billingResult2 = zzdc.zzg;
                zzbv(zzjnVar2, 3, billingResult2);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            } else if (this.zzp) {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar != null) {
                    String packageName = this.zzg.getPackageName();
                    String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
                    String str = this.zzd;
                    long jLongValue = this.zzL.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, BuildConfig.VERSION_NAME, str, jLongValue);
                    Bundle bundleZzd = zzarVar.zzd(9, packageName, purchaseToken, bundle);
                    acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzdc.zza(com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzk(bundleZzd, "BillingClient")));
                    return null;
                }
                zzaS(acknowledgePurchaseResponseListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
            } else {
                zzjn zzjnVar3 = zzjn.API_VERSION_NOT_V9;
                BillingResult billingResult3 = zzdc.zza;
                zzbv(zzjnVar3, 3, billingResult3);
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
            }
            return null;
        } catch (DeadObjectException e10) {
            zzaS(acknowledgePurchaseResponseListener, zzdc.zzj, zzjn.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            zzaS(acknowledgePurchaseResponseListener, zzdc.zzh, zzjn.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    private final /* synthetic */ Object zzaF(BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzci zzciVar = null;
        try {
            if (!zzbo(zzdl.zzb())) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
                zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
                BillingResult billingResult = zzdc.zzj;
                zzbv(zzjnVar, 13, billingResult);
                billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            } else if (this.zzv) {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    zzbb(billingConfigResponseListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else if (zzdl.zzh() && this.zzB) {
                    String str = this.zzc;
                    com.google.android.gms.internal.play_billing.zzej zzejVarZzb = zzdg.zzb(str, 24, this.zzg, zzdf.GET_BILLING_CONFIG.zza());
                    zzie zzieVarZza = zzih.zza();
                    zziy zziyVarZza = zzja.zza();
                    zziyVarZza.zza(str);
                    zzieVarZza.zza("PLAY_BILLING_LIBRARY_VERSION", (zzja) zziyVarZza.zzi());
                    zziy zziyVarZza2 = zzja.zza();
                    zziyVarZza2.zza(this.zzg.getPackageName());
                    zzieVarZza.zza("CALLING_PACKAGE", (zzja) zziyVarZza2.zzi());
                    Bundle bundleZza = zzdg.zza(zzejVarZzb, (zzih) zzieVarZza.zzi());
                    if (!TextUtils.isEmpty(null)) {
                        bundleZza.putString("accountName", null);
                    }
                    zzarVar.zzm(bundleZza, new zzdq(billingConfigResponseListener, this.zzh, this.zzm));
                } else {
                    String packageName = this.zzg.getPackageName();
                    String str2 = this.zzd;
                    long jLongValue = this.zzL.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, BuildConfig.VERSION_NAME, str2, jLongValue);
                    if (!TextUtils.isEmpty(null)) {
                        bundle.putString("accountName", null);
                    }
                    zzarVar.zzo(18, packageName, bundle, new zzca(billingConfigResponseListener, this.zzh, this.zzm, zzciVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", yeILL.KpSaTpJw);
                zzjn zzjnVar2 = zzjn.GET_BILLING_CONFIG_NOT_SUPPORTED;
                BillingResult billingResult2 = zzdc.zzz;
                zzbv(zzjnVar2, 13, billingResult2);
                billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            }
        } catch (DeadObjectException e10) {
            zzbb(billingConfigResponseListener, zzdc.zzj, zzjn.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzbb(billingConfigResponseListener, zzdc.zzh, zzjn.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Object zzaG(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            if (zzarVar == null) {
                zzbe(-1, zzjn.SERVICE_RESET_TO_NULL, null);
            } else {
                zzarVar.zzt(12, this.zzg.getPackageName(), bundle, new zzcg(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzbe(-1, zzjn.SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzbe(6, zzjn.SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final String zzaH(QueryProductDetailsParams queryProductDetailsParams) {
        if (TextUtils.isEmpty(null)) {
            return this.zzg.getPackageName();
        }
        return null;
    }

    private static String zzaI() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final /* synthetic */ Void zzaJ(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzci zzciVar = null;
        try {
            if (!zzbo(zzdl.zzb())) {
                zzaW(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzy) {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    zzaW(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzarVar.zzk(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzL.longValue()), new zzbx(alternativeBillingOnlyReportingDetailsListener, this.zzh, this.zzm, zzciVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support alternative billing only.");
                zzaW(alternativeBillingOnlyReportingDetailsListener, zzdc.zzD, zzjn.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaW(alternativeBillingOnlyReportingDetailsListener, zzdc.zzj, zzjn.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaW(alternativeBillingOnlyReportingDetailsListener, zzdc.zzh, zzjn.CREATE_ALTERNATIVE_BILLING_ONLY_TOKEN_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaK(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingProgramReportingDetailsParams billingProgramReportingDetailsParams) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            if (!zzbo(zzdl.zzb())) {
                zzaX(billingProgramReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzD) {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    zzaX(billingProgramReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else {
                    String str = this.zzc;
                    com.google.android.gms.internal.play_billing.zzej zzejVarZzb = zzdg.zzb(str, 24, this.zzg, zzdf.CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC.zza());
                    zzie zzieVarZza = zzih.zza();
                    zziy zziyVarZza = zzja.zza();
                    zziyVarZza.zza(str);
                    zzieVarZza.zza("PLAY_BILLING_LIBRARY_VERSION", (zzja) zziyVarZza.zzi());
                    zziy zziyVarZza2 = zzja.zza();
                    zziyVarZza2.zza(this.zzg.getPackageName());
                    zzieVarZza.zza("CALLING_PACKAGE", (zzja) zziyVarZza2.zzi());
                    zziy zziyVarZza3 = zzja.zza();
                    zziyVarZza3.zza(String.valueOf(billingProgramReportingDetailsParams.getBillingProgram()));
                    zzieVarZza.zza("BILLING_PROGRAM", (zzja) zziyVarZza3.zzi());
                    zziy zziyVarZza4 = zzja.zza();
                    zziyVarZza4.zza("RESPONSE_FORMAT_PROTO");
                    zzieVarZza.zza("RESPONSE_FORMAT", (zzja) zziyVarZza4.zzi());
                    if (billingProgramReportingDetailsParams.getBillingProgram() == 3) {
                        zziy zziyVarZza5 = zzja.zza();
                        zziyVarZza5.zza(String.valueOf(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime));
                        zzieVarZza.zza("APP_INSTALL_TIME_MILLIS", (zzja) zziyVarZza5.zzi());
                    } else if (billingProgramReportingDetailsParams.getBillingProgram() == 5) {
                        zziy zziyVarZza6 = zzja.zza();
                        zziyVarZza6.zza(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        zzieVarZza.zza("DEVELOPER_BILLING_TYPE", (zzja) zziyVarZza6.zzi());
                    }
                    zzarVar.zzm(zzdg.zza(zzejVarZzb, (zzih) zzieVarZza.zzi()), new CreateBillingProgramReportingDetailsDelegateToBackendCallback(billingProgramReportingDetailsListener, billingProgramReportingDetailsParams.getBillingProgram(), this.zzh, this.zzm, zzaz(), zzM()));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                zzaX(billingProgramReportingDetailsListener, zzdc.zzG, zzjn.BILLING_PROGRAM_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaX(billingProgramReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_CALL_EXCEPTION, e10);
        } catch (RuntimeException e11) {
            zzaX(billingProgramReportingDetailsListener, zzdc.zzh, zzjn.SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaL(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzci zzciVar = null;
        try {
            if (!zzbo(zzdl.zzb())) {
                zzaY(externalOfferReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzz) {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    zzaY(externalOfferReportingDetailsListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.zzg.getPackageName();
                    long j10 = this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime;
                    String str = this.zzd;
                    long jLongValue = this.zzL.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.zzc.zza;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, BuildConfig.VERSION_NAME, str, jLongValue);
                    bundle.putLong("appInstallTimeMillis", j10);
                    zzarVar.zzl(22, packageName, bundle, new zzby(externalOfferReportingDetailsListener, this.zzh, this.zzm, zzciVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaY(externalOfferReportingDetailsListener, zzdc.zzu, zzjn.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaY(externalOfferReportingDetailsListener, zzdc.zzj, zzjn.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaY(externalOfferReportingDetailsListener, zzdc.zzh, zzjn.CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaM(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i10) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            if (!zzbo(zzdl.zzb())) {
                zzaU(billingProgramAvailabilityListener, i10, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
                return null;
            }
            if (!this.zzD) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support the provided billing program.");
                zzaU(billingProgramAvailabilityListener, i10, zzdc.zzG, zzjn.BILLING_PROGRAM_NOT_SUPPORTED, null);
                return null;
            }
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            if (zzarVar == null) {
                zzaU(billingProgramAvailabilityListener, i10, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                return null;
            }
            String str = this.zzc;
            com.google.android.gms.internal.play_billing.zzej zzejVarZzb = zzdg.zzb(str, 24, this.zzg, zzdf.IS_BILLING_PROGRAM_AVAILABLE_ASYNC.zza());
            zzie zzieVarZza = zzih.zza();
            zziy zziyVarZza = zzja.zza();
            zziyVarZza.zza(str);
            zzieVarZza.zza("PLAY_BILLING_LIBRARY_VERSION", (zzja) zziyVarZza.zzi());
            zziy zziyVarZza2 = zzja.zza();
            zziyVarZza2.zza(this.zzg.getPackageName());
            zzieVarZza.zza("CALLING_PACKAGE", (zzja) zziyVarZza2.zzi());
            zziy zziyVarZza3 = zzja.zza();
            zziyVarZza3.zza(String.valueOf(i10));
            zzieVarZza.zza("BILLING_PROGRAM", (zzja) zziyVarZza3.zzi());
            zzarVar.zzm(zzdg.zza(zzejVarZzb, (zzih) zzieVarZza.zzi()), new IsBillingProgramAvailableDelegateToBackendCallback(billingProgramAvailabilityListener, i10, this.zzh, this.zzm, zzaz(), zzM()));
            return null;
        } catch (DeadObjectException e10) {
            zzaU(billingProgramAvailabilityListener, i10, zzdc.zzj, zzjn.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            zzaU(billingProgramAvailabilityListener, i10, zzdc.zzh, zzjn.SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    private final /* synthetic */ Void zzaN(ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        zzci zzciVar = null;
        try {
            if (!zzbo(zzdl.zzb())) {
                zzaZ(externalOfferAvailabilityListener, zzdc.zzj, zzjn.SERVICE_CONNECTION_NOT_READY, null);
            } else if (this.zzB) {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    zzaZ(externalOfferAvailabilityListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
                } else {
                    zzarVar.zzs(24, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzL.longValue()), new zzcf(externalOfferAvailabilityListener, this.zzh, this.zzm, zzciVar));
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support external offer.");
                zzaZ(externalOfferAvailabilityListener, zzdc.zzu, zzjn.EXTERNAL_OFFER_NOT_SUPPORTED, null);
            }
        } catch (DeadObjectException e10) {
            zzaZ(externalOfferAvailabilityListener, zzdc.zzj, zzjn.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzaZ(externalOfferAvailabilityListener, zzdc.zzh, zzjn.IS_EXTERNAL_PAYMENT_AVAILABLE_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaO(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            if (zzarVar == null) {
                zzbd(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
            } else {
                zzarVar.zzn(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzL.longValue()), new zzbz(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzbd(alternativeBillingOnlyInformationDialogListener, zzdc.zzj, zzjn.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzbd(alternativeBillingOnlyInformationDialogListener, zzdc.zzh, zzjn.SHOW_ALTERNATIVE_BILLING_ONLY_DIALOG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final /* synthetic */ Void zzaP(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            if (zzarVar == null) {
                zzba(externalOfferInformationDialogListener, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, null);
            } else {
                zzarVar.zzp(22, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzh(this.zzc, this.zzd, this.zzL.longValue()), new zzcb(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            zzba(externalOfferInformationDialogListener, zzdc.zzj, zzjn.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            zzba(externalOfferInformationDialogListener, zzdc.zzh, zzjn.SHOW_EXTERNAL_PAYMENT_DIALOG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final Future zzaQ(Callable callable, long j10, final Runnable runnable, Handler handler) throws Exception {
        try {
            final Future futureSubmit = zzM().submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task is taking too long, cancel it!");
                    runnable2.run();
                }
            }, 28500L);
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Async task throws exception!", e10);
            throw e10;
        }
    }

    private final void zzaR(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        int iZza;
        String strZzk;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Consuming purchase with token: " + purchaseToken);
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            if (zzarVar == null) {
                zzaV(consumeResponseListener, purchaseToken, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                return;
            }
            if (this.zzp) {
                String packageName = this.zzg.getPackageName();
                boolean z10 = this.zzp;
                String str = this.zzd;
                long jLongValue = this.zzL.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    com.google.android.gms.internal.play_billing.zzc.zzc(bundle, BuildConfig.VERSION_NAME, str, jLongValue);
                }
                Bundle bundleZze = zzarVar.zze(9, packageName, purchaseToken, bundle);
                iZza = bundleZze.getInt("RESPONSE_CODE");
                strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundleZze, "BillingClient");
            } else {
                iZza = zzarVar.zza(3, this.zzg.getPackageName(), purchaseToken);
                strZzk = "";
            }
            BillingResult billingResultZza = zzdc.zza(iZza, strZzk);
            if (iZza == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(billingResultZza, purchaseToken);
                return;
            }
            zzaV(consumeResponseListener, purchaseToken, billingResultZza, zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + iZza, null);
        } catch (DeadObjectException e10) {
            zzaV(consumeResponseListener, purchaseToken, zzdc.zzj, zzjn.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e10);
        } catch (Exception e11) {
            zzaV(consumeResponseListener, purchaseToken, zzdc.zzh, zzjn.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e11);
        }
    }

    private final void zzaS(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error in acknowledge purchase!", exc);
        zzbx(zzjnVar, 3, billingResult, zzcy.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaT(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 14, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaU(BillingProgramAvailabilityListener billingProgramAvailabilityListener, int i10, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 33, billingResult, zzcy.zza(exc));
        billingProgramAvailabilityListener.onBillingProgramAvailabilityResponse(billingResult, new BillingProgramAvailabilityDetails(i10));
    }

    private final void zzaV(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, zzjn zzjnVar, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str2, exc);
        zzbx(zzjnVar, 4, billingResult, zzcy.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaW(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 15, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaX(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 35, billingResult, zzcy.zza(exc));
        billingProgramReportingDetailsListener.onCreateBillingProgramReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaY(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 24, billingResult, zzcy.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaZ(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 23, billingResult, zzcy.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    static /* bridge */ /* synthetic */ void zzao(BillingClientImpl billingClientImpl, int i10) {
        billingClientImpl.zzm = i10;
        billingClientImpl.zzE = i10 >= 28;
        billingClientImpl.zzD = i10 >= 27;
        billingClientImpl.zzC = i10 >= 26;
        billingClientImpl.zzB = i10 >= 24;
        billingClientImpl.zzA = i10 >= 23;
        billingClientImpl.zzz = i10 >= 22;
        billingClientImpl.zzy = i10 >= 21;
        billingClientImpl.zzx = i10 >= 20;
        billingClientImpl.zzw = i10 >= 19;
        billingClientImpl.zzv = i10 >= 18;
        billingClientImpl.zzu = i10 >= 17;
        billingClientImpl.zzt = i10 >= 16;
        billingClientImpl.zzs = i10 >= 15;
        billingClientImpl.zzr = i10 >= 14;
        billingClientImpl.zzq = i10 >= 12;
        billingClientImpl.zzp = i10 >= 9;
        billingClientImpl.zzo = i10 >= 8;
        billingClientImpl.zzn = i10 >= 6;
    }

    static /* bridge */ /* synthetic */ void zzaq(BillingClientImpl billingClientImpl, int i10) {
        if (i10 != 0) {
            billingClientImpl.zzbj(0);
            return;
        }
        synchronized (billingClientImpl.zza) {
            if (billingClientImpl.zzb == 3) {
                return;
            }
            billingClientImpl.zzbj(2);
            zzab zzabVar = billingClientImpl.zzf != null ? billingClientImpl.zzf : null;
            if (zzabVar != null) {
                zzabVar.zzj(billingClientImpl.zzy);
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzau(BillingClientImpl billingClientImpl) {
        boolean z10;
        synchronized (billingClientImpl.zza) {
            z10 = true;
            if (billingClientImpl.zzb != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzax(int i10, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            return zzarVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL) : zzarVar.zzg(i10, this.zzg.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjn.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjn.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle zzay(String str, String str2) throws Exception {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        try {
            synchronized (this.zza) {
                zzarVar = this.zzi;
            }
            return zzarVar == null ? com.google.android.gms.internal.play_billing.zzc.zzd(zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL) : zzarVar.zzf(3, this.zzg.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzj, zzjn.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.zzc.zze(zzdc.zzh, zzjn.LAUNCH_BILLING_FLOW_EXCEPTION, zzcy.zza(e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzaz() {
        return Looper.myLooper() == null ? this.zze : new Handler(Looper.myLooper());
    }

    private void zzbA(int i10) {
        try {
            int i11 = zzcy.zza;
            zzbh(zzcy.zzc(i10, zzju.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzba(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 25, billingResult, zzcy.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    private final void zzbb(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "getBillingConfig got an exception.", exc);
        zzbx(zzjnVar, 13, billingResult, zzcy.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbc(LaunchExternalLinkResponseListener launchExternalLinkResponseListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 37, billingResult, zzcy.zza(exc));
        launchExternalLinkResponseListener.onLaunchExternalLinkResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbd(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, zzjn zzjnVar, Exception exc) {
        zzbx(zzjnVar, 16, billingResult, zzcy.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    private final void zzbe(int i10, zzjn zzjnVar, Exception exc) {
        zzjg zzjgVar;
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "showInAppMessages error.", exc);
        zzcz zzczVar = this.zzh;
        String strZza = zzcy.zza(exc);
        try {
            zzjl zzjlVarZza = zzjp.zza();
            zzjlVarZza.zzp(i10);
            if (zzjnVar != null) {
                zzjlVarZza.zze(zzjnVar);
            }
            if (strZza != null) {
                zzjlVarZza.zza(strZza);
            }
            zzje zzjeVarZza = zzjg.zza();
            zzjeVarZza.zzb(zzjlVarZza);
            zzjeVarZza.zzp(30);
            zzjgVar = (zzjg) zzjeVarZza.zzi();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", th);
            zzjgVar = null;
        }
        zzczVar.zza(zzjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbf(zzjg zzjgVar) {
        try {
            this.zzh.zzb(zzjgVar, this.zzm);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbg(zzjg zzjgVar, long j10, boolean z10) {
        try {
            this.zzh.zze(zzjgVar, this.zzm, j10, z10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbh(zzjk zzjkVar) {
        try {
            this.zzh.zzg(zzjkVar, this.zzm);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbi(zzjn zzjnVar, BillingResult billingResult, int i10) {
        try {
            int i11 = zzcy.zza;
            zzje zzjeVar = (zzje) zzcy.zzb(zzjnVar, 6, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED).zzq();
            zzlg zzlgVarZza = zzli.zza();
            zzlgVarZza.zza(i10 > 0);
            zzlgVarZza.zzb(i10);
            zzjeVar.zze(zzlgVarZza);
            zzbf((zzjg) zzjeVar.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbj(int i10) {
        synchronized (this.zza) {
            if (this.zzb == 3) {
                return;
            }
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Setting clientState from " + zzbq(this.zzb) + " to " + zzbq(i10));
            this.zzb = i10;
        }
    }

    private final synchronized void zzbk() {
        ExecutorService executorService = this.zzK;
        if (executorService != null) {
            executorService.shutdownNow();
            this.zzK = null;
        }
    }

    private final void zzbl(BillingClientStateListener billingClientStateListener, int i10) {
        zzjn zzjnVar;
        BillingResult billingResultZzaB;
        BillingResult billingResult;
        synchronized (this.zza) {
            if (zzbp()) {
                billingResultZzaB = zzaB(i10);
            } else {
                if (this.zzb == 1) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client is already in the process of connecting to billing service.");
                    zzjn zzjnVar2 = zzjn.BILLING_CLIENT_CONNECTING;
                    billingResult = zzdc.zzd;
                    zzbi(zzjnVar2, billingResult, i10);
                } else if (this.zzb == 3) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    zzjn zzjnVar3 = zzjn.BILLING_CLIENT_CLOSED;
                    billingResult = zzdc.zzj;
                    zzbi(zzjnVar3, billingResult, i10);
                } else {
                    zzbj(1);
                    if (i10 == 0) {
                        this.zzJ = billingClientStateListener;
                        i10 = 0;
                    }
                    zzbm();
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Starting in-app billing setup.");
                    this.zzj = new zzbw(this, billingClientStateListener, i10, null);
                    this.zzj.zzf();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.zzg.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        zzjnVar = zzjn.INTENT_SERVICE_NOT_FOUND;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zzjnVar = zzjn.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.zzc);
                                synchronized (this.zza) {
                                    if (this.zzb == 2) {
                                        billingResultZzaB = zzaB(i10);
                                    } else if (this.zzb != 1) {
                                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        zzjn zzjnVar4 = zzjn.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                        billingResult = zzdc.zzj;
                                        zzbi(zzjnVar4, billingResult, i10);
                                    } else {
                                        zzbw zzbwVar = this.zzj;
                                        if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.zzg.bindService(intent2, zzbwVar, 1) : this.zzg.bindService(intent2, 1, zzM(), zzbwVar)) {
                                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service was bonded successfully.");
                                            billingResultZzaB = null;
                                        } else {
                                            zzjnVar = zzjn.BILLING_SERVICE_BLOCKED;
                                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Connection to Billing service is blocked.");
                                        }
                                    }
                                }
                            }
                        } else {
                            zzjnVar = zzjn.INVALID_PHONESKY_PACKAGE;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    zzbj(0);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service unavailable on device.");
                    BillingResult billingResult2 = zzdc.zzb;
                    zzbi(zzjnVar, billingResult2, i10);
                    billingResultZzaB = billingResult2;
                }
                billingResultZzaB = billingResult;
            }
        }
        if (billingResultZzaB != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultZzaB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbm() {
        synchronized (this.zza) {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                    this.zzi = null;
                    this.zzj = null;
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding service!", th);
                        this.zzi = null;
                        this.zzj = null;
                    } catch (Throwable th2) {
                        this.zzi = null;
                        this.zzj = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzbn(long j10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j10 = 0;
            }
            BillingResult billingResult = (BillingResult) zzaD(1).get(j10, TimeUnit.MILLISECONDS);
            if (billingResult.getResponseCode() == 0) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return zzbp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzbo(long j10) {
        com.google.android.gms.internal.play_billing.zzbn zzbnVarZzb = com.google.android.gms.internal.play_billing.zzbn.zzb(this.zzM);
        int iZza = zzdl.zza();
        long jZza = j10;
        for (int i10 = 1; i10 <= iZza; i10++) {
            try {
                long jMax = Math.max(0L, jZza);
                if (jMax <= 0) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "No time remaining for reconnection attempt.");
                    return zzbp();
                }
                BillingResult billingResult = (BillingResult) zzaD(i10).get(jMax, TimeUnit.MILLISECONDS);
                if (billingResult.getResponseCode() == 0) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection succeeded with result: " + billingResult.getResponseCode());
                    return zzbp();
                }
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed with result: " + billingResult.getResponseCode());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jZza = j10 - zzbnVarZzb.zza(timeUnit);
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jZza < jPow) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return zzbp();
                }
                if (i10 < iZza && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jZza = j10 - zzbnVarZzb.zza(timeUnit);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
            } catch (Exception e11) {
                if (e11 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error during reconnection attempt: ", e11);
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Max retries reached.");
        return zzbp();
    }

    private final boolean zzbp() {
        boolean z10;
        synchronized (this.zza) {
            z10 = false;
            if (this.zzb == 2 && this.zzi != null && this.zzj != null) {
                z10 = true;
            }
        }
        return z10;
    }

    private static final String zzbq(int i10) {
        if (i10 == 0) {
            return "DISCONNECTED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    private static final void zzbr(zzjz zzjzVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzjzVar.zzv((int) (memoryInfo.totalMem / 1048576));
                zzjzVar.zzr(Build.BRAND);
                zzjzVar.zzu(Build.MODEL);
                zzjzVar.zzt(Build.MANUFACTURER);
                zzjzVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    private final zzed zzbs(int i10, BillingResult billingResult, zzjn zzjnVar, String str, Exception exc) {
        zzbx(zzjnVar, 9, billingResult, zzcy.zza(exc));
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", str, exc);
        return new zzed(billingResult, null);
    }

    private final void zzbu(BillingResult billingResult, zzjn zzjnVar, int i10) {
        zzjk zzjkVar = null;
        zzjg zzjgVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i11 = zzcy.zza;
            try {
                zzji zzjiVarZza = zzjk.zza();
                zzjiVarZza.zze(5);
                zzkf zzkfVarZza = zzki.zza();
                zzkfVarZza.zza(i10);
                zzjiVarZza.zzb((zzki) zzkfVarZza.zzi());
                zzjkVar = (zzjk) zzjiVarZza.zzi();
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e10);
            }
            zzbh(zzjkVar);
            return;
        }
        int i12 = zzcy.zza;
        try {
            zzje zzjeVarZza = zzjg.zza();
            zzjl zzjlVarZza = zzjp.zza();
            zzjlVarZza.zzp(billingResult.getResponseCode());
            zzjlVarZza.zzb(billingResult.getDebugMessage());
            zzjlVarZza.zze(zzjnVar);
            zzjeVarZza.zzb(zzjlVarZza);
            zzjeVarZza.zzp(5);
            zzkf zzkfVarZza2 = zzki.zza();
            zzkfVarZza2.zza(i10);
            zzjeVarZza.zzc((zzki) zzkfVarZza2.zzi());
            zzjgVar = (zzjg) zzjeVarZza.zzi();
        } catch (Exception e11) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to create logging payload", e11);
        }
        zzbf(zzjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzbv(zzjn zzjnVar, int i10, BillingResult billingResult) {
        try {
            int i11 = zzcy.zza;
            zzbf(zzcy.zzb(zzjnVar, i10, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbw(zzjn zzjnVar, int i10, BillingResult billingResult, long j10) {
        try {
            int i11 = zzcy.zza;
            try {
                this.zzh.zzc(zzcy.zzb(zzjnVar, 2, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED), this.zzm, j10);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzbx(zzjn zzjnVar, int i10, BillingResult billingResult, String str) {
        try {
            int i11 = zzcy.zza;
            zzbf(zzcy.zzb(zzjnVar, i10, billingResult, str, zzju.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzby(zzjn zzjnVar, int i10, BillingResult billingResult, long j10, boolean z10) {
        try {
            int i11 = zzcy.zza;
            zzbg(zzcy.zzb(zzjnVar, 2, billingResult, null, zzju.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzbz(zzjn zzjnVar, int i10, BillingResult billingResult, String str, long j10, boolean z10) {
        try {
            int i11 = zzcy.zza;
            zzbg(zzcy.zzb(zzjnVar, 2, billingResult, str, zzju.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    static /* bridge */ /* synthetic */ ResultReceiver zzg(BillingClientImpl billingClientImpl, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        return new zzbt(billingClientImpl, billingClientImpl.zze, launchExternalLinkResponseListener);
    }

    static /* bridge */ /* synthetic */ BillingResult zzn(Exception exc) {
        return exc instanceof DeadObjectException ? zzdc.zzj : zzdc.zzh;
    }

    public static /* synthetic */ Object zzu(BillingClientImpl billingClientImpl, int i10, com.google.android.gms.internal.play_billing.zzp zzpVar) {
        billingClientImpl.zzbl(new zzbs(billingClientImpl, zzpVar), i10);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Object zzv(BillingClientImpl billingClientImpl, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        if (billingClientImpl.zzbo(zzdl.zzb())) {
            billingClientImpl.zzaR(consumeParams, consumeResponseListener);
            return null;
        }
        zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
        BillingResult billingResult = zzdc.zzj;
        billingClientImpl.zzbv(zzjnVar, 4, billingResult);
        consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        return null;
    }

    public static /* synthetic */ Object zzw(BillingClientImpl billingClientImpl, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) throws JSONException {
        if (!billingClientImpl.zzbo(zzdl.zzb())) {
            zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            billingClientImpl.zzbv(zzjnVar, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzca.zzk(), com.google.android.gms.internal.play_billing.zzca.zzk()));
            return null;
        }
        if (billingClientImpl.zzu) {
            zzch zzchVarZzi = billingClientImpl.zzi(queryProductDetailsParams);
            productDetailsResponseListener.onProductDetailsResponse(zzdc.zza(zzchVarZzi.zza(), zzchVarZzi.zzb()), new QueryProductDetailsResult(zzchVarZzi.zzc(), zzchVarZzi.zzd()));
            return null;
        }
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Querying product details is not supported.");
        zzjn zzjnVar2 = zzjn.PRODUCT_DETAILS_NOT_SUPPORTED;
        BillingResult billingResult2 = zzdc.zzs;
        billingClientImpl.zzbv(zzjnVar2, 7, billingResult2);
        productDetailsResponseListener.onProductDetailsResponse(billingResult2, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzca.zzk(), com.google.android.gms.internal.play_billing.zzca.zzk()));
        return null;
    }

    public static /* synthetic */ Object zzx(BillingClientImpl billingClientImpl, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, AcknowledgePurchaseParams acknowledgePurchaseParams) throws Exception {
        billingClientImpl.zzaE(acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
        return null;
    }

    public static /* synthetic */ Object zzy(BillingClientImpl billingClientImpl, Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        billingClientImpl.zzaG(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Object zzz(BillingClientImpl billingClientImpl, BillingConfigResponseListener billingConfigResponseListener) throws Exception {
        billingClientImpl.zzaF(billingConfigResponseListener);
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzal
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzx(this.zza, acknowledgePurchaseResponseListener, acknowledgePurchaseParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzU(this.zza, acknowledgePurchaseResponseListener);
            }
        }, zzaz(), zzM()) == null) {
            BillingResult billingResultZzaC = zzaC();
            zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, billingResultZzaC);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultZzaC);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzv(this.zza, consumeResponseListener, consumeParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzO(this.zza, consumeResponseListener, consumeParams);
            }
        }, zzaz(), zzM()) == null) {
            BillingResult billingResultZzaC = zzaC();
            zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, billingResultZzaC);
            consumeResponseListener.onConsumeResponse(billingResultZzaC, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzax
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzJ(this.zza, alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzay
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaW(alternativeBillingOnlyReportingDetailsListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzaz(), zzM()) == null) {
            zzaW(alternativeBillingOnlyReportingDetailsListener, zzaC(), zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createBillingProgramReportingDetailsAsync(final BillingProgramReportingDetailsParams billingProgramReportingDetailsParams, final BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        try {
            zzaQ(new Callable() { // from class: com.android.billingclient.api.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    BillingClientImpl.zzK(this.zza, billingProgramReportingDetailsListener, billingProgramReportingDetailsParams);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzar
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaX(billingProgramReportingDetailsListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, zzaz());
        } catch (Exception e10) {
            zzaX(billingProgramReportingDetailsListener, zzaC(), zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, e10);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzav
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzH(this.zza, externalOfferReportingDetailsListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaY(externalOfferReportingDetailsListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzaz(), zzM()) == null) {
            zzaY(externalOfferReportingDetailsListener, zzaC(), zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void endConnection() {
        zzbA(12);
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    this.zzf.zzi();
                    try {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                        zzbm();
                    } catch (Throwable th) {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
                    }
                    try {
                        zzbk();
                        zzbj(3);
                    } catch (Throwable th2) {
                        try {
                            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th2);
                            zzbj(3);
                        } catch (Throwable th3) {
                            zzbj(3);
                            this.zzJ = null;
                            throw th3;
                        }
                    }
                    this.zzJ = null;
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unbinding from service.");
                    zzbm();
                    zzbk();
                    zzbj(3);
                    this.zzJ = null;
                }
            } catch (Throwable th4) {
                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th4);
            }
            throw th;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzas
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzz(this.zza, billingConfigResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzat
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzQ(this.zza, billingConfigResponseListener);
            }
        }, zzaz(), zzM()) == null) {
            BillingResult billingResultZzaC = zzaC();
            zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 13, billingResultZzaC);
            billingConfigResponseListener.onBillingConfigResponse(billingResultZzaC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i10;
        synchronized (this.zza) {
            i10 = this.zzb;
        }
        return i10;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.zzL(this.zza, alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaT(alternativeBillingOnlyAvailabilityListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzaz(), zzM()) == null) {
            zzaT(alternativeBillingOnlyAvailabilityListener, zzaC(), zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isBillingProgramAvailableAsync(final int i10, final BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzF(this.zza, billingProgramAvailabilityListener, i10);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzap
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaU(billingProgramAvailabilityListener, i10, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzaz(), zzM()) == null) {
            zzaU(billingProgramAvailabilityListener, i10, zzaC(), zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzaf
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzE(this.zza, externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzaZ(externalOfferAvailabilityListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, zzaz(), zzM()) == null) {
            zzaZ(externalOfferAvailabilityListener, zzaC(), zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!zzbn(zzdl.zzc())) {
            BillingResult billingResult = zzdc.zzj;
            zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
            if (billingResult.getResponseCode() != 0) {
                zzbv(zzjnVar, 5, billingResult);
            } else {
                zzbA(5);
            }
            return billingResult;
        }
        int i10 = zzdc.zzJ;
        switch (str) {
            case "subscriptions":
                BillingResult billingResult2 = this.zzk ? zzdc.zzi : zzdc.zzl;
                zzbu(billingResult2, zzjn.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                return billingResult2;
            case "subscriptionsUpdate":
                BillingResult billingResult3 = this.zzl ? zzdc.zzi : zzdc.zzm;
                zzbu(billingResult3, zzjn.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                return billingResult3;
            case "priceChangeConfirmation":
                BillingResult billingResult4 = this.zzo ? zzdc.zzi : zzdc.zzn;
                zzbu(billingResult4, zzjn.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                return billingResult4;
            case "bbb":
                BillingResult billingResult5 = this.zzq ? zzdc.zzi : zzdc.zzt;
                zzbu(billingResult5, zzjn.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                return billingResult5;
            case "aaa":
                BillingResult billingResult6 = this.zzs ? zzdc.zzi : zzdc.zzo;
                zzbu(billingResult6, zzjn.CROSS_APP_NOT_SUPPORTED, 6);
                return billingResult6;
            case "ddd":
                BillingResult billingResult7 = this.zzr ? zzdc.zzi : zzdc.zzq;
                zzbu(billingResult7, zzjn.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                return billingResult7;
            case "ccc":
                BillingResult billingResult8 = this.zzt ? zzdc.zzi : zzdc.zzp;
                zzbu(billingResult8, zzjn.MULTI_ITEM_NOT_SUPPORTED, 8);
                return billingResult8;
            case "eee":
                BillingResult billingResult9 = this.zzt ? zzdc.zzi : zzdc.zzp;
                zzbu(billingResult9, zzjn.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                return billingResult9;
            case "fff":
                BillingResult billingResult10 = this.zzu ? zzdc.zzi : zzdc.zzs;
                zzbu(billingResult10, zzjn.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                return billingResult10;
            case "ggg":
                BillingResult billingResult11 = this.zzv ? zzdc.zzi : zzdc.zzz;
                zzbu(billingResult11, zzjn.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                return billingResult11;
            case "hhh":
                BillingResult billingResult12 = this.zzv ? zzdc.zzi : zzdc.zzA;
                zzbu(billingResult12, zzjn.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                return billingResult12;
            case "iii":
                BillingResult billingResult13 = this.zzx ? zzdc.zzi : zzdc.zzC;
                zzbu(billingResult13, zzjn.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                return billingResult13;
            case "jjj":
                BillingResult billingResult14 = this.zzy ? zzdc.zzi : zzdc.zzD;
                zzbu(billingResult14, zzjn.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                return billingResult14;
            case "kkk":
                BillingResult billingResult15 = this.zzB ? zzdc.zzi : zzdc.zzu;
                zzbu(billingResult15, zzjn.EXTERNAL_OFFER_NOT_SUPPORTED, 18);
                return billingResult15;
            case "lll":
                BillingResult billingResult16 = this.zzA ? zzdc.zzi : zzdc.zzv;
                zzbu(billingResult16, zzjn.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                return billingResult16;
            case "mmm":
                BillingResult billingResult17 = this.zzB ? zzdc.zzi : zzdc.zzw;
                zzbu(billingResult17, zzjn.AUTO_PAY_NOT_SUPPORTED, 20);
                return billingResult17;
            case "nnn":
                BillingResult billingResult18 = this.zzC ? zzdc.zzi : zzdc.zzx;
                zzbu(billingResult18, zzjn.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                return billingResult18;
            case "ooo":
                BillingResult billingResult19 = this.zzE ? zzdc.zzi : zzdc.zzr;
                zzbu(billingResult19, zzjn.GIFT_CODE_PURCHASE_NOT_SUPPORTED, 22);
                return billingResult19;
            default:
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unsupported feature: ".concat(str));
                BillingResult billingResult20 = zzdc.zzy;
                zzbu(billingResult20, zzjn.UNKNOWN_FEATURE, 1);
                return billingResult20;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        if (this.zzG) {
            return true;
        }
        return zzbp();
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        boolean zZzg;
        String str;
        boolean z10;
        Future futureZzN;
        boolean z11;
        zzjn zzjnVarZzb;
        String string;
        Object obj;
        String str2;
        String str3;
        boolean z12;
        int i10;
        long jNextLong = new Random().nextLong();
        if (this.zzf == null || this.zzf.zzf() == null) {
            zzjn zzjnVar = zzjn.MISSING_LISTENER;
            BillingResult billingResult = zzdc.zzE;
            zzbw(zzjnVar, 2, billingResult, jNextLong);
            return billingResult;
        }
        if (billingFlowParams.getDeveloperBillingOptionParams() != null && this.zzf.zzd() == null) {
            zzjn zzjnVar2 = zzjn.MISSING_DEVELOPER_PROVIDED_BILLING_LISTENER;
            BillingResult billingResult2 = zzdc.zzI;
            zzbw(zzjnVar2, 2, billingResult2, jNextLong);
            return billingResult2;
        }
        if (!zzbn(zzdl.zzc())) {
            zzjn zzjnVar3 = zzjn.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult3 = zzdc.zzj;
            zzbw(zzjnVar3, 2, billingResult3, jNextLong);
            zzo(billingResult3);
            return billingResult3;
        }
        synchronized (this.zza) {
            zZzg = this.zzj != null ? this.zzj.zzg() : false;
        }
        ArrayList arrayListZzj = billingFlowParams.zzj();
        List listZzk = billingFlowParams.zzk();
        zzen zzenVar = (zzen) com.google.android.gms.internal.play_billing.zzcg.zza(arrayListZzj, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzcg.zza(listZzk, null);
        if (zzenVar != null) {
            throw null;
        }
        final String productId = productDetailsParams.zza().getProductId();
        final String productType = productDetailsParams.zza().getProductType();
        if (productType.equals(BillingClient.ProductType.SUBS) && !this.zzk) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support subscriptions.");
            zzjn zzjnVar4 = zzjn.SUBSCRIPTIONS_NOT_SUPPORTED;
            BillingResult billingResult4 = zzdc.zzl;
            zzby(zzjnVar4, 2, billingResult4, jNextLong, zZzg);
            zzo(billingResult4);
            return billingResult4;
        }
        if (billingFlowParams.zzu() && !this.zzn) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzjn zzjnVar5 = zzjn.EXTRA_PARAMS_NOT_SUPPORTED;
            BillingResult billingResult5 = zzdc.zzf;
            zzby(zzjnVar5, 2, billingResult5, jNextLong, zZzg);
            zzo(billingResult5);
            return billingResult5;
        }
        if (arrayListZzj.size() > 1 && !this.zzt) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support multi-item purchases.");
            zzjn zzjnVar6 = zzjn.MULTI_ITEM_NOT_SUPPORTED;
            BillingResult billingResult6 = zzdc.zzp;
            zzby(zzjnVar6, 2, billingResult6, jNextLong, zZzg);
            zzo(billingResult6);
            return billingResult6;
        }
        if (!listZzk.isEmpty() && !this.zzu) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzjn zzjnVar7 = zzjn.PRODUCT_DETAILS_NOT_SUPPORTED;
            BillingResult billingResult7 = zzdc.zzs;
            zzby(zzjnVar7, 2, billingResult7, jNextLong, zZzg);
            zzo(billingResult7);
            return billingResult7;
        }
        Iterator it = listZzk.iterator();
        while (it.hasNext()) {
            String strZzb = ((BillingFlowParams.ProductDetailsParams) it.next()).zzb();
            if (strZzb != null && strZzb.contains(":") && !this.zzE) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                zzjn zzjnVar8 = zzjn.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                BillingResult billingResult8 = zzdc.zzr;
                zzby(zzjnVar8, 2, billingResult8, jNextLong, zZzg);
                zzo(billingResult8);
                return billingResult8;
            }
        }
        BillingResult billingResultZzd = billingFlowParams.zzd();
        if (billingResultZzd != zzdc.zzi) {
            zzby(zzjn.INVALID_BILLING_FLOW_PARAMS, 2, billingResultZzd, jNextLong, zZzg);
            zzo(billingResultZzd);
            return billingResultZzd;
        }
        if (this.zzn) {
            z10 = zZzg;
            final Bundle bundleZzf = com.google.android.gms.internal.play_billing.zzc.zzf(billingFlowParams, this.zzp, this.zzw, this.zzF.isEnabledForOneTimeProducts(), this.zzF.isEnabledForPrepaidPlans(), this.zzH, this.zzc, this.zzd, this.zzL.longValue(), this.zzg.getPackageName(), jNextLong);
            if (arrayListZzj.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listZzk.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listZzk.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                int i11 = 0;
                while (i11 < listZzk.size()) {
                    BillingFlowParams.ProductDetailsParams productDetailsParams2 = (BillingFlowParams.ProductDetailsParams) listZzk.get(i11);
                    ProductDetails productDetailsZza = productDetailsParams2.zza();
                    if (!productDetailsZza.zzb().isEmpty()) {
                        arrayList3.add(productDetailsZza.zzb());
                    }
                    String strZzb2 = productDetailsParams2.zzb();
                    arrayList4.add(strZzb2);
                    String strZzc = productDetailsZza.zzc(strZzb2);
                    if (!TextUtils.isEmpty(strZzc)) {
                        arrayList5.add(strZzc);
                    }
                    if (i11 > 0) {
                        arrayList.add(((BillingFlowParams.ProductDetailsParams) listZzk.get(i11)).zza().getProductId());
                        arrayList2.add(((BillingFlowParams.ProductDetailsParams) listZzk.get(i11)).zza().getProductType());
                    }
                    i11++;
                    productId = productId;
                }
                str2 = productId;
                bundleZzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    bundleZzf.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    bundleZzf.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundleZzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundleZzf.putStringArrayList("additionalSkus", arrayList);
                    bundleZzf.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListZzj.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundleZzf.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (arrayListZzj.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListZzj.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListZzj.size() - 1);
                    if (arrayListZzj.size() > 1) {
                        throw null;
                    }
                    bundleZzf.putStringArrayList("additionalSkus", arrayList8);
                    bundleZzf.putStringArrayList("additionalSkuTypes", arrayList9);
                }
                str2 = productId;
            }
            if (bundleZzf.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.zzr) {
                zzjn zzjnVar9 = zzjn.OFFER_ID_TOKEN_NOT_SUPPORTED;
                BillingResult billingResult9 = zzdc.zzq;
                zzby(zzjnVar9, 2, billingResult9, jNextLong, z10);
                zzo(billingResult9);
                return billingResult9;
            }
            if (TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                str3 = null;
                z12 = false;
            } else {
                bundleZzf.putString("skuPackageName", productDetailsParams.zza().zza());
                str3 = null;
                z12 = true;
            }
            if (!TextUtils.isEmpty(str3)) {
                bundleZzf.putString("accountName", str3);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundleZzf.putString("proxyPackage", stringExtra);
                try {
                    bundleZzf.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundleZzf.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.zzE) {
                i10 = 28;
            } else if (this.zzu && !listZzk.isEmpty()) {
                i10 = 17;
            } else if (this.zzs && z12) {
                i10 = 15;
            } else {
                i10 = this.zzp ? 9 : 6;
            }
            final int i12 = i10;
            final String str4 = str2;
            str = str3;
            futureZzN = zzN(new Callable() { // from class: com.android.billingclient.api.zzah
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzax(i12, str4, productType, billingFlowParams, bundleZzf);
                }
            }, 5000L, null, this.zze, zzM());
        } else {
            str = null;
            z10 = zZzg;
            futureZzN = zzN(new Callable() { // from class: com.android.billingclient.api.zzai
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzay(productId, productType);
                }
            }, 5000L, null, this.zze, zzM());
        }
        try {
            if (futureZzN == null) {
                zzjn zzjnVar10 = zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                BillingResult billingResult10 = zzdc.zzc;
                zzby(zzjnVar10, 2, billingResult10, jNextLong, z10);
                zzo(billingResult10);
                return billingResult10;
            }
            Bundle bundle = (Bundle) futureZzN.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundle, "BillingClient");
            String strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient");
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", jNextLong);
                z11 = z10;
                try {
                    intent2.putExtra("wasServiceAutoReconnected", z11);
                    activity.startActivity(intent2);
                    return zzdc.zzi;
                } catch (CancellationException e10) {
                    e = e10;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjn zzjnVar11 = zzjn.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult11 = zzdc.zzk;
                    zzbz(zzjnVar11, 2, billingResult11, zzcy.zza(e), jNextLong, z11);
                    zzo(billingResult11);
                    return billingResult11;
                } catch (TimeoutException e11) {
                    e = e11;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjn zzjnVar12 = zzjn.LAUNCH_BILLING_FLOW_TIMEOUT;
                    BillingResult billingResult12 = zzdc.zzk;
                    zzbz(zzjnVar12, 2, billingResult12, zzcy.zza(e), jNextLong, z11);
                    zzo(billingResult12);
                    return billingResult12;
                } catch (Exception e12) {
                    e = e12;
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzjn zzjnVar13 = zzjn.LAUNCH_BILLING_FLOW_EXCEPTION;
                    BillingResult billingResult13 = zzdc.zzj;
                    zzbz(zzjnVar13, 2, billingResult13, zzcy.zza(e), jNextLong, z11);
                    zzo(billingResult13);
                    return billingResult13;
                }
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to buy item, Error response code: " + iZzb);
            BillingResult billingResultZza = zzdc.zza(iZzb, strZzk);
            try {
                if (bundle == null || (obj = bundle.get("LOG_REASON")) == null) {
                    zzjnVarZzb = zzjn.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    zzjnVarZzb = zzjn.zzb(((Integer) obj).intValue());
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    zzjnVarZzb = zzjn.REASON_UNSPECIFIED;
                }
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                zzjnVarZzb = zzjn.REASON_UNSPECIFIED;
            }
            if (zzjnVarZzb == zzjn.REASON_UNSPECIFIED) {
                zzjnVarZzb = zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzjn zzjnVar14 = zzjnVarZzb;
            if (bundle == null) {
                string = str;
            } else {
                try {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                    string = str;
                }
            }
            zzbz(zzjnVar14, 2, billingResultZza, string, jNextLong, z10);
            zzo(billingResultZza);
            return billingResultZza;
        } catch (CancellationException e13) {
            e = e13;
            z11 = z10;
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            zzjn zzjnVar15 = zzjn.LAUNCH_BILLING_FLOW_TIMEOUT;
            BillingResult billingResult14 = zzdc.zzk;
            zzbz(zzjnVar15, 2, billingResult14, zzcy.zza(e), jNextLong, z11);
            zzo(billingResult14);
            return billingResult14;
        } catch (TimeoutException e14) {
            e = e14;
            z11 = z10;
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
            zzjn zzjnVar16 = zzjn.LAUNCH_BILLING_FLOW_TIMEOUT;
            BillingResult billingResult15 = zzdc.zzk;
            zzbz(zzjnVar16, 2, billingResult15, zzcy.zza(e), jNextLong, z11);
            zzo(billingResult15);
            return billingResult15;
        } catch (Exception e15) {
            e = e15;
            z11 = z10;
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
            zzjn zzjnVar17 = zzjn.LAUNCH_BILLING_FLOW_EXCEPTION;
            BillingResult billingResult16 = zzdc.zzj;
            zzbz(zzjnVar17, 2, billingResult16, zzcy.zza(e), jNextLong, z11);
            zzo(billingResult16);
            return billingResult16;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void launchExternalLink(final Activity activity, final LaunchExternalLinkParams launchExternalLinkParams, final LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        try {
            zzaQ(new Callable() { // from class: com.android.billingclient.api.zzau
                @Override // java.util.concurrent.Callable
                public final Object call() throws RemoteException {
                    BillingClientImpl.zzG(this.zza, launchExternalLinkResponseListener, launchExternalLinkParams, activity);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzaw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzbc(launchExternalLinkResponseListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
                }
            }, zzaz());
        } catch (Exception e10) {
            zzbc(launchExternalLinkResponseListener, zzaC(), zzjn.SERVICE_CALL_EXCEPTION, e10);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzbh
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                BillingClientImpl.zzw(this.zza, productDetailsResponseListener, queryProductDetailsParams);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbi
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzW(this.zza, productDetailsResponseListener);
            }
        }, zzaz(), zzM()) == null) {
            BillingResult billingResultZzaC = zzaC();
            zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, billingResultZzaC);
            productDetailsResponseListener.onProductDetailsResponse(billingResultZzaC, new QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzca.zzk(), com.google.android.gms.internal.play_billing.zzca.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, final PurchasesResponseListener purchasesResponseListener) {
        if (zzN(new zzbm(this, purchasesResponseListener, queryPurchasesParams.zza(), queryPurchasesParams.getIncludeSuspendedSubscriptions()), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzP(this.zza, purchasesResponseListener);
            }
        }, zzaz(), zzM()) == null) {
            BillingResult billingResultZzaC = zzaC();
            zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, billingResultZzaC);
            purchasesResponseListener.onQueryPurchasesResponse(billingResultZzaC, com.google.android.gms.internal.play_billing.zzca.zzk());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbn(zzdl.zzc())) {
            zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbv(zzjnVar, 16, billingResult);
            return billingResult;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzjn zzjnVar2 = zzjn.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzD;
            zzbv(zzjnVar2, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbo zzboVar = new zzbo(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzD(this.zza, alternativeBillingOnlyInformationDialogListener, activity, zzboVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzbd(alternativeBillingOnlyInformationDialogListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzM()) != null) {
            return zzdc.zzi;
        }
        BillingResult billingResultZzaC = zzaC();
        zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 16, billingResultZzaC);
        return billingResultZzaC;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!zzbn(zzdl.zzc())) {
            zzjn zzjnVar = zzjn.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = zzdc.zzj;
            zzbv(zzjnVar, 25, billingResult);
            return billingResult;
        }
        if (!this.zzz) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current Play Store version doesn't support external offer.");
            zzjn zzjnVar2 = zzjn.EXTERNAL_OFFER_NOT_SUPPORTED;
            BillingResult billingResult2 = zzdc.zzu;
            zzbv(zzjnVar2, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.zze;
        final zzbp zzbpVar = new zzbp(this, handler, externalOfferInformationDialogListener);
        if (zzN(new Callable() { // from class: com.android.billingclient.api.zzbf
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzI(this.zza, externalOfferInformationDialogListener, activity, zzbpVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzba(externalOfferInformationDialogListener, zzdc.zzk, zzjn.EXECUTE_ASYNC_TIMEOUT, null);
            }
        }, handler, zzM()) != null) {
            return zzdc.zzi;
        }
        BillingResult billingResultZzaC = zzaC();
        zzbv(zzjn.MISSING_RESULT_FROM_EXECUTE_ASYNC, 25, billingResultZzaC);
        return billingResultZzaC;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!zzbn(zzdl.zzc())) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Service disconnected.");
            return zzdc.zzj;
        }
        if (!this.zzq) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzdc.zzt;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        if (windowToken == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Could not retrieve the window token from the activity instance.");
        }
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        g.b(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzc);
        String str = this.zzd;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        Handler handler = this.zze;
        final zzbn zzbnVar = new zzbn(this, handler, inAppMessageResponseListener);
        zzN(new Callable() { // from class: com.android.billingclient.api.zzbj
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                BillingClientImpl.zzy(this.zza, bundle, activity, zzbnVar);
                return null;
            }
        }, 5000L, null, handler, zzM());
        return zzdc.zzi;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        zzbl(billingClientStateListener, 0);
    }

    final synchronized ExecutorService zzM() {
        if (this.zzK == null) {
            this.zzK = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new zzbl(this));
        }
        return this.zzK;
    }

    public final void zzas(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.zze.post(runnable);
        }
    }

    final zzcz zzl() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BillingResult zzo(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zze.post(new Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.zzY(this.zza, billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX WARN: Code duplicated, block: B:70:0x01af  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0206  */
    /* JADX WARN: Code duplicated, block: B:85:0x0230 A[LOOP:0: B:99:0x0054->B:85:0x0230, LOOP_END] */
    public final zzed zzbt(String str, boolean z10, int i10) {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        int i11;
        int i12;
        Bundle bundleZzi;
        zzjn zzjnVar;
        BillingResult billingResult;
        zzjn zzjnVar2;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        boolean z11;
        Purchase purchase;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z12 = this.zzp;
        boolean z13 = this.zzw;
        boolean zIsEnabledForOneTimeProducts = this.zzF.isEnabledForOneTimeProducts();
        boolean zIsEnabledForPrepaidPlans = this.zzF.isEnabledForPrepaidPlans();
        long jLongValue = this.zzL.longValue();
        Bundle bundle = new Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, BuildConfig.VERSION_NAME, this.zzd, jLongValue);
        int i13 = 1;
        if (z12 && zIsEnabledForOneTimeProducts) {
            bundle.putBoolean(InAppPurchaseConstants.METHOD_ENABLE_PENDING_PURCHASES, true);
        }
        if (z13 && zIsEnabledForPrepaidPlans) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z10) {
            bundle.putBoolean("includeSuspendedSubscriptions", true);
        }
        String string = null;
        while (true) {
            try {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    return zzbs(9, zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (z10 && !this.zzC) {
                    return zzbs(9, zzdc.zzx, zzjn.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, "Include suspended subscriptions is not supported", null);
                }
                if (this.zzp) {
                    if (this.zzC) {
                        i12 = 26;
                    } else if (this.zzB) {
                        i12 = 24;
                    } else {
                        if (this.zzw) {
                            i12 = 19;
                        } else {
                            i11 = 9;
                        }
                        bundleZzi = zzarVar.zzi(i11, this.zzg.getPackageName(), str, string, bundle);
                    }
                    i11 = i12;
                    bundleZzi = zzarVar.zzi(i11, this.zzg.getPackageName(), str, string, bundle);
                } else {
                    bundleZzi = zzarVar.zzh(3, this.zzg.getPackageName(), str, string);
                }
                BillingResult billingResult2 = zzdc.zzh;
                String str2 = wHzciBnJlYkdX.YOdmyKLo;
                if (bundleZzi == null) {
                    Object[] objArr = new Object[i13];
                    objArr[0] = str2;
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("%s got null owned items list", objArr));
                    zzjnVar = zzjn.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzi, "BillingClient");
                    String strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundleZzi, "BillingClient");
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(iZzb);
                    builderNewBuilder.setDebugMessage(strZzk);
                    BillingResult billingResultBuild = builderNewBuilder.build();
                    if (iZzb != 0) {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = str2;
                        objArr2[i13] = Integer.valueOf(iZzb);
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("%s failed. Response code: %s", objArr2));
                        zzjnVar2 = zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                        billingResult = billingResultBuild;
                    } else if (bundleZzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzi.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList4 = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList4 == null) {
                            Object[] objArr3 = new Object[i13];
                            objArr3[0] = str2;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", objArr3));
                            zzjnVar = zzjn.NULL_SKUS_LIST;
                        } else if (stringArrayList5 == null) {
                            Object[] objArr4 = new Object[i13];
                            objArr4[0] = str2;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null purchases list.", objArr4));
                            zzjnVar = zzjn.NULL_PURCHASES_LIST;
                        } else if (stringArrayList6 == null) {
                            Object[] objArr5 = new Object[i13];
                            objArr5[0] = str2;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s contains null signatures list.", objArr5));
                            zzjnVar = zzjn.NULL_SIGNATURES_LIST;
                        } else {
                            billingResult = zzdc.zzi;
                            zzjnVar2 = zzjn.REASON_UNSPECIFIED;
                        }
                    } else {
                        Object[] objArr6 = new Object[i13];
                        objArr6[0] = str2;
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", objArr6));
                        zzjnVar = zzjn.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (billingResult != zzdc.zzi) {
                        return zzbs(9, billingResult, zzjnVar2, "Purchase bundle invalid", null);
                    }
                    stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    z11 = false;
                    for (int i14 = 0; i14 < stringArrayList2.size(); i14++) {
                        String str3 = stringArrayList2.get(i14);
                        String str4 = stringArrayList3.get(i14);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i14))));
                        try {
                            purchase = new Purchase(str3, str4);
                            this.zzI.isEmpty();
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e10) {
                            return zzbs(9, zzdc.zzh, zzjn.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        zzbv(zzjn.EMPTY_PURCHASE_TOKEN, 9, billingResult2);
                    }
                    string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                    if (TextUtils.isEmpty(string)) {
                        return new zzed(zzdc.zzi, arrayList);
                    }
                    i13 = 1;
                }
                zzjnVar2 = zzjnVar;
                billingResult = billingResult2;
                if (billingResult != zzdc.zzi) {
                    return zzbs(9, billingResult, zzjnVar2, "Purchase bundle invalid", null);
                }
                stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                z11 = false;
                while (i14 < stringArrayList2.size()) {
                    String str5 = stringArrayList2.get(i14);
                    String str6 = stringArrayList3.get(i14);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i14))));
                    purchase = new Purchase(str5, str6);
                    this.zzI.isEmpty();
                    if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "BUG: empty/null token!");
                        z11 = true;
                    }
                    arrayList.add(purchase);
                }
                if (z11) {
                    zzbv(zzjn.EMPTY_PURCHASE_TOKEN, 9, billingResult2);
                }
                string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new zzed(zzdc.zzi, arrayList);
                }
                i13 = 1;
            } catch (DeadObjectException e11) {
                return zzbs(9, zzdc.zzj, zzjn.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return zzbs(9, zzdc.zzh, zzjn.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e12);
            }
        }
    }

    final zzch zzi(QueryProductDetailsParams queryProductDetailsParams) throws JSONException {
        com.google.android.gms.internal.play_billing.zzar zzarVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strZzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzca zzcaVarZza = queryProductDetailsParams.zza();
        int size = zzcaVarZza.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList<QueryProductDetailsParams.Product> arrayList3 = new ArrayList(zzcaVarZza.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList4.add(((QueryProductDetailsParams.Product) arrayList3.get(i12)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.zzc;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.zza) {
                    zzarVar = this.zzi;
                }
                if (zzarVar == null) {
                    return zzaA(zzdc.zzj, zzjn.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.zzw && this.zzF.isEnabledForPrepaidPlans();
                zzaH(queryProductDetailsParams);
                zzaH(queryProductDetailsParams);
                zzaH(queryProductDetailsParams);
                zzaH(queryProductDetailsParams);
                Bundle bundleZzj = zzarVar.zzj(true != this.zzx ? 17 : 20, this.zzg.getPackageName(), strZzb, bundle, com.google.android.gms.internal.play_billing.zzc.zzg(str, this.zzd, arrayList3, null, null, com.google.android.gms.internal.play_billing.zza.zza(z10, true, true, true, false, true), this.zzL.longValue()));
                if (bundleZzj == null) {
                    return zzaA(zzdc.zzB, zzjn.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzj.containsKey("DETAILS_LIST")) {
                    int iZzb = com.google.android.gms.internal.play_billing.zzc.zzb(bundleZzj, "BillingClient");
                    String strZzk = com.google.android.gms.internal.play_billing.zzc.zzk(bundleZzj, "BillingClient");
                    if (iZzb == 0) {
                        return zzaA(zzdc.zza(6, strZzk), zzjn.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return zzaA(zzdc.zza(iZzb, strZzk), zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb, null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return zzaA(zzdc.zzB, zzjn.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    try {
                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i13));
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                        arrayList5.add(productDetails);
                    } catch (JSONException e10) {
                        return zzaA(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjn.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        for (QueryProductDetailsParams.Product product : arrayList3) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new UnfetchedProduct(new JSONObject().put("productId", product.zza()).put("type", product.zzb()).put(zKUlck.rsjoR, 0).toString()));
                                    break;
                                }
                                ProductDetails productDetails2 = (ProductDetails) it.next();
                                if (product.zza().equals(productDetails2.getProductId()) && product.zzb().equals(productDetails2.getProductType())) {
                                    break;
                                }
                            }
                        }
                    } else {
                        Iterator<String> it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            UnfetchedProduct unfetchedProduct = new UnfetchedProduct(it2.next());
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Got unfetchedProduct: ".concat(unfetchedProduct.toString()));
                            arrayList6.add(unfetchedProduct);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i10 = i11;
                } catch (JSONException e11) {
                    return zzaA(zzdc.zza(6, "Error trying to decode SkuDetails."), zzjn.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return zzaA(zzdc.zzj, zzjn.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return zzaA(zzdc.zzh, zzjn.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new zzch(0, "", arrayList, arrayList2);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, PendingPurchasesParams pendingPurchasesParams, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, String str, zzcz zzczVar, BillingClient.Builder builder) {
        this.zzg = context.getApplicationContext();
        zzjz zzjzVarZza = zzkb.zza();
        zzjzVarZza.zzx(str);
        String str2 = this.zzd;
        if (str2 != null) {
            zzjzVarZza.zzy(str2);
        }
        zzjzVarZza.zzq(this.zzg.getPackageName());
        zzjzVarZza.zzd(this.zzL.longValue());
        zzjzVarZza.zzw(builder.zza);
        zzjzVarZza.zza(Build.VERSION.SDK_INT);
        zzjzVarZza.zzp(912213584L);
        zzbr(zzjzVarZza, context);
        try {
            zzjzVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        if (zzczVar != null) {
            this.zzh = zzczVar;
        } else {
            this.zzh = new zzdm(this.zzg, (zzkb) zzjzVarZza.zzi());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new zzab(this.zzg, purchasesUpdatedListener, null, null, userChoiceBillingListener, developerProvidedBillingListener, this.zzh);
        this.zzF = pendingPurchasesParams;
        this.zzH = userChoiceBillingListener != null;
        this.zzG = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, zzdp zzdpVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = com.google.android.gms.internal.play_billing.zzcf.zzk();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.zzL = lValueOf;
        this.zzM = com.google.android.gms.internal.play_billing.zzbf.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        String strZzaI = zzaI();
        this.zzd = strZzaI;
        this.zzg = context.getApplicationContext();
        zzjz zzjzVarZza = zzkb.zza();
        zzjzVarZza.zzx(BuildConfig.VERSION_NAME);
        if (strZzaI != null) {
            zzjzVarZza.zzy(strZzaI);
        }
        zzjzVarZza.zzq(this.zzg.getPackageName());
        zzjzVarZza.zzd(lValueOf.longValue());
        zzjzVarZza.zzw(builder.zza);
        zzjzVarZza.zza(Build.VERSION.SDK_INT);
        zzjzVarZza.zzp(912213584L);
        zzbr(zzjzVarZza, context);
        try {
            zzjzVarZza.zzb(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Error getting app version code.", th);
        }
        this.zzh = new zzdm(this.zzg, (zzkb) zzjzVarZza.zzi());
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new zzab(this.zzg, null, null, null, null, null, this.zzh);
        this.zzF = pendingPurchasesParams;
        this.zzg.getPackageName();
        this.zzG = builder.zza;
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzb zzbVar, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = com.google.android.gms.internal.play_billing.zzcf.zzk();
        this.zzL = Long.valueOf(new Random().nextLong());
        this.zzM = com.google.android.gms.internal.play_billing.zzbf.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        this.zzd = zzaI();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, null, BuildConfig.VERSION_NAME, null, builder);
    }

    BillingClientImpl(String str, PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, DeveloperProvidedBillingListener developerProvidedBillingListener, zzcz zzczVar, ExecutorService executorService, BillingClient.Builder builder) {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new Handler(Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = com.google.android.gms.internal.play_billing.zzcf.zzk();
        this.zzL = Long.valueOf(new Random().nextLong());
        this.zzM = com.google.android.gms.internal.play_billing.zzbf.zza();
        this.zzc = BuildConfig.VERSION_NAME;
        this.zzd = zzaI();
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, developerProvidedBillingListener, BuildConfig.VERSION_NAME, null, builder);
    }
}
