package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: InAppPurchaseAutoLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseAutoLogger {
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();
    private static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    private InAppPurchaseAutoLogger() {
    }

    private final void logPurchase(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            boolean isFirstAppLaunchWithNewIAP = InAppPurchaseLoggerManager.getIsFirstAppLaunchWithNewIAP();
            if (isFirstAppLaunchWithNewIAP) {
                InAppPurchaseLoggerManager.migrateOldCacheHistory();
            }
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                InAppPurchaseBillingClientWrapperV2V4.Companion companion = InAppPurchaseBillingClientWrapperV2V4.Companion;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getIapPurchaseDetailsMap(), companion.getSkuDetailsMap(), false, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getSubsPurchaseDetailsMap(), companion.getSkuDetailsMap(), true, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                companion.getIapPurchaseDetailsMap().clear();
                companion.getSubsPurchaseDetailsMap().clear();
            } else {
                InAppPurchaseBillingClientWrapperV5V7.Companion companion2 = InAppPurchaseBillingClientWrapperV5V7.Companion;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion2.getIapPurchaseDetailsMap(), companion2.getProductDetailsMap(), false, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion2.getSubsPurchaseDetailsMap(), companion2.getProductDetailsMap(), true, str, billingClientVersion, isFirstAppLaunchWithNewIAP);
                companion2.getIapPurchaseDetailsMap().clear();
                companion2.getSubsPurchaseDetailsMap().clear();
            }
            if (isFirstAppLaunchWithNewIAP) {
                InAppPurchaseLoggerManager.setAppHasBeenLaunchedWithNewIAP();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV5V7] */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, com.facebook.appevents.iap.InAppPurchaseBillingClientWrapperV2V4] */
    public static final synchronized void startIapLogging(final Context context, final InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            t.f(context, "context");
            t.f(billingClientVersion, "billingClientVersion");
            AtomicBoolean atomicBoolean = failedToCreateWrapper;
            if (atomicBoolean.get()) {
                return;
            }
            final h0 h0Var = new h0();
            InAppPurchaseUtils.BillingClientVersion billingClientVersion2 = InAppPurchaseUtils.BillingClientVersion.V2_V4;
            if (billingClientVersion == billingClientVersion2) {
                h0Var.f21514a = InAppPurchaseBillingClientWrapperV2V4.Companion.getOrCreateInstance(context);
            } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                h0Var.f21514a = InAppPurchaseBillingClientWrapperV5V7.Companion.getOrCreateInstance(context);
            }
            if (h0Var.f21514a == 0) {
                atomicBoolean.set(true);
                return;
            }
            if (!FeatureManager.isEnabled(FeatureManager.Feature.AndroidIAPSubscriptionAutoLogging) || (ProtectedModeManager.isEnabled() && billingClientVersion != billingClientVersion2)) {
                ((InAppPurchaseBillingClientWrapper) h0Var.f21514a).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: com.facebook.appevents.iap.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        InAppPurchaseAutoLogger.startIapLogging$lambda$2(billingClientVersion, context);
                    }
                });
            } else {
                ((InAppPurchaseBillingClientWrapper) h0Var.f21514a).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.INAPP, new Runnable() { // from class: com.facebook.appevents.iap.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        InAppPurchaseAutoLogger.startIapLogging$lambda$1(h0Var, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1(h0 billingClientWrapper, final InAppPurchaseUtils.BillingClientVersion billingClientVersion, final Context context) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            t.f(billingClientWrapper, "$billingClientWrapper");
            t.f(billingClientVersion, "$billingClientVersion");
            t.f(context, "$context");
            ((InAppPurchaseBillingClientWrapper) billingClientWrapper.f21514a).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.SUBS, new Runnable() { // from class: com.facebook.appevents.iap.c
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseAutoLogger.startIapLogging$lambda$1$lambda$0(billingClientVersion, context);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1$lambda$0(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            t.f(billingClientVersion, "$billingClientVersion");
            t.f(context, "$context");
            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
            String packageName = context.getPackageName();
            t.e(packageName, "context.packageName");
            inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$2(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            t.f(billingClientVersion, "$billingClientVersion");
            t.f(context, "$context");
            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
            String packageName = context.getPackageName();
            t.e(packageName, "context.packageName");
            inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseAutoLogger.class);
        }
    }

    public final AtomicBoolean getFailedToCreateWrapper() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return failedToCreateWrapper;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
