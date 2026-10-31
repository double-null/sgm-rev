package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import rd.b0;
import rd.f0;
import wc.q;

/* JADX INFO: compiled from: InAppPurchaseManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseManager {
    private static final String GOOGLE_BILLINGCLIENT_VERSION = "com.google.android.play.billingclient.version";
    private static String specificBillingLibraryVersion;
    public static final InAppPurchaseManager INSTANCE = new InAppPurchaseManager();
    private static final ConcurrentHashMap<InAppPurchase, List<q<Long, q<Bundle, OperationalData>>>> timesOfManualPurchases = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<InAppPurchase, List<q<Long, q<Bundle, OperationalData>>>> timesOfImplicitPurchases = new ConcurrentHashMap<>();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: compiled from: InAppPurchaseManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InAppPurchaseManager() {
    }

    public static final void enableAutoLogging() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (!AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
                InAppPurchaseLoggerManager.updateLatestPossiblePurchaseTime();
            } else {
                enabled.set(true);
                startTracking();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    private final InAppPurchaseUtils.BillingClientVersion getBillingClientVersion() {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                t.e(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString(GOOGLE_BILLINGCLIENT_VERSION);
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List listK0 = f0.K0(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                setSpecificBillingLibraryVersion("GPBL." + string);
                Integer numP = b0.p((String) listK0.get(0));
                if (numP == null) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                int iIntValue = numP.intValue();
                if (iIntValue == 1) {
                    return InAppPurchaseUtils.BillingClientVersion.V1;
                }
                return iIntValue < 5 ? InAppPurchaseUtils.BillingClientVersion.V2_V4 : InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static /* synthetic */ String getDedupeParameter$default(InAppPurchaseManager inAppPurchaseManager, Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z10, boolean z11, int i10, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return inAppPurchaseManager.getDedupeParameter(bundle, operationalData, bundle2, operationalData2, z10, (i10 & 32) != 0 ? false : z11);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
    }

    public static final String getSpecificBillingLibraryVersion() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            return specificBillingLibraryVersion;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final synchronized Bundle performDedupe(List<InAppPurchase> purchases, long j10, boolean z10, List<q<Bundle, OperationalData>> purchaseParameters) {
        InAppPurchase inAppPurchase;
        String str;
        ?? r10;
        ?? r13;
        boolean z11;
        String str2 = null;
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return null;
        }
        try {
            t.f(purchases, "purchases");
            t.f(purchaseParameters, "purchaseParameters");
            if (purchaseParameters.isEmpty()) {
                return null;
            }
            if (!(purchases.size() == purchaseParameters.size())) {
                return null;
            }
            ArrayList<q> arrayList = new ArrayList();
            int size = purchases.size();
            ?? bundle = 0;
            int i10 = 0;
            while (i10 < size) {
                InAppPurchase inAppPurchase2 = purchases.get(i10);
                q<Bundle, OperationalData> qVar = purchaseParameters.get(i10);
                Bundle bundleB = qVar.b();
                OperationalData operationalDataC = qVar.c();
                InAppPurchase inAppPurchase3 = new InAppPurchase(inAppPurchase2.getEventName(), new BigDecimal(String.valueOf(inAppPurchase2.getAmount())).setScale(2, RoundingMode.HALF_UP).doubleValue(), inAppPurchase2.getCurrency());
                List<q<Long, q<Bundle, OperationalData>>> list = z10 ? timesOfManualPurchases.get(inAppPurchase3) : timesOfImplicitPurchases.get(inAppPurchase3);
                if (list == null || list.isEmpty()) {
                    inAppPurchase = inAppPurchase3;
                    str = null;
                    r10 = 0;
                    r13 = 0;
                    z11 = false;
                } else {
                    str = str2;
                    ?? ValueOf = str;
                    ?? r14 = ValueOf;
                    z11 = false;
                    for (q<Long, q<Bundle, OperationalData>> qVar2 : list) {
                        long jLongValue = qVar2.e().longValue();
                        q<Bundle, OperationalData> qVarF = qVar2.f();
                        Bundle bundleB2 = qVarF.b();
                        OperationalData operationalDataC2 = qVarF.c();
                        if (Math.abs(j10 - jLongValue) <= InAppPurchaseDedupeConfig.INSTANCE.getDedupeWindow() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                            InAppPurchaseManager inAppPurchaseManager = INSTANCE;
                            InAppPurchase inAppPurchase4 = inAppPurchase3;
                            String dedupeParameter$default = getDedupeParameter$default(inAppPurchaseManager, bundleB, operationalDataC, bundleB2, operationalDataC2, !z10, false, 32, null);
                            String dedupeParameter = inAppPurchaseManager.getDedupeParameter(bundleB, operationalDataC, bundleB2, operationalDataC2, !z10, true);
                            if (dedupeParameter != null) {
                                str = dedupeParameter;
                            }
                            if (dedupeParameter$default != null) {
                                ValueOf = Long.valueOf(jLongValue);
                                arrayList.add(new q(inAppPurchase4, Long.valueOf(jLongValue)));
                                inAppPurchase3 = inAppPurchase4;
                                r14 = dedupeParameter$default;
                                z11 = true;
                            } else {
                                inAppPurchase3 = inAppPurchase4;
                                r14 = dedupeParameter$default;
                            }
                        }
                    }
                    inAppPurchase = inAppPurchase3;
                    r10 = ValueOf;
                    r13 = r14;
                }
                if (str != null) {
                    if (bundle == 0) {
                        bundle = new Bundle();
                    }
                    bundle.putString(Constants.IAP_TEST_DEDUP_RESULT, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    bundle.putString(Constants.IAP_TEST_DEDUP_KEY_USED, str);
                }
                if (z11) {
                    if (bundle == 0) {
                        bundle = new Bundle();
                    }
                    bundle.putString(Constants.IAP_NON_DEDUPED_EVENT_TIME, String.valueOf(r10 != 0 ? r10.longValue() / ((long) 1000) : 0L));
                    bundle.putString(Constants.IAP_ACTUAL_DEDUP_RESULT, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    bundle.putString(Constants.IAP_ACTUAL_DEDUP_KEY_USED, r13);
                }
                if (z10 && !z11) {
                    ConcurrentHashMap<InAppPurchase, List<q<Long, q<Bundle, OperationalData>>>> concurrentHashMap = timesOfImplicitPurchases;
                    if (concurrentHashMap.get(inAppPurchase) == null) {
                        concurrentHashMap.put(inAppPurchase, new ArrayList());
                    }
                    List<q<Long, q<Bundle, OperationalData>>> list2 = concurrentHashMap.get(inAppPurchase);
                    if (list2 != null) {
                        list2.add(new q<>(Long.valueOf(j10), new q(bundleB, operationalDataC)));
                    }
                } else if (!z10 && !z11) {
                    ConcurrentHashMap<InAppPurchase, List<q<Long, q<Bundle, OperationalData>>>> concurrentHashMap2 = timesOfManualPurchases;
                    if (concurrentHashMap2.get(inAppPurchase) == null) {
                        concurrentHashMap2.put(inAppPurchase, new ArrayList());
                    }
                    List<q<Long, q<Bundle, OperationalData>>> list3 = concurrentHashMap2.get(inAppPurchase);
                    if (list3 != null) {
                        list3.add(new q<>(Long.valueOf(j10), new q(bundleB, operationalDataC)));
                    }
                }
                i10++;
                str2 = null;
                bundle = bundle;
            }
            for (q qVar3 : arrayList) {
                List<q<Long, q<Bundle, OperationalData>>> list4 = z10 ? timesOfManualPurchases.get(qVar3.e()) : timesOfImplicitPurchases.get(qVar3.e());
                if (list4 != null) {
                    Iterator<q<Long, q<Bundle, OperationalData>>> it = list4.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        int i12 = i11 + 1;
                        if (it.next().e().longValue() == ((Number) qVar3.f()).longValue()) {
                            list4.remove(i11);
                            break;
                        }
                        i11 = i12;
                    }
                    if (z10) {
                        if (list4.isEmpty()) {
                            timesOfManualPurchases.remove(qVar3.e());
                        } else {
                            timesOfManualPurchases.put((InAppPurchase) qVar3.e(), list4);
                        }
                    } else if (list4.isEmpty()) {
                        timesOfImplicitPurchases.remove(qVar3.e());
                    } else {
                        timesOfImplicitPurchases.put((InAppPurchase) qVar3.e(), list4);
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
            return null;
        }
        throw th;
    }

    private static final void setSpecificBillingLibraryVersion(String str) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            specificBillingLibraryVersion = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    public static final void startTracking() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseManager.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = INSTANCE.getBillingClientVersion();
                int i10 = WhenMappings.$EnumSwitchMapping$0[billingClientVersion.ordinal()];
                if (i10 == 2) {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V1);
                    return;
                }
                if (i10 != 3) {
                    if (i10 == 4 && FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib5To7)) {
                        InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                        return;
                    }
                    return;
                }
                if (FeatureManager.isEnabled(FeatureManager.Feature.IapLoggingLib2)) {
                    InAppPurchaseAutoLogger.startIapLogging(FacebookSdk.getApplicationContext(), billingClientVersion);
                } else {
                    InAppPurchaseActivityLifecycleTracker.startIapLogging(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseManager.class);
        }
    }

    public final String getDedupeParameter(Bundle bundle, OperationalData operationalData, Bundle bundle2, OperationalData operationalData2, boolean z10, boolean z11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<q<String, List<String>>> testDedupeParameters = z11 ? InAppPurchaseDedupeConfig.INSTANCE.getTestDedupeParameters(z10) : InAppPurchaseDedupeConfig.INSTANCE.getDedupeParameters(z10);
            if (testDedupeParameters == null) {
                return null;
            }
            for (q<String, List<String>> qVar : testDedupeParameters) {
                Object parameter = OperationalData.Companion.getParameter(OperationalDataEnum.IAPParameters, qVar.e(), bundle, operationalData);
                String str = parameter instanceof String ? (String) parameter : null;
                if (!(str == null || str.length() == 0)) {
                    for (String str2 : qVar.f()) {
                        Object parameter2 = OperationalData.Companion.getParameter(OperationalDataEnum.IAPParameters, str2, bundle2, operationalData2);
                        String str3 = parameter2 instanceof String ? (String) parameter2 : null;
                        if (!(str3 == null || str3.length() == 0) && t.a(str3, str)) {
                            return z10 ? qVar.e() : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
