package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseDedupeConfig;
import com.facebook.appevents.iap.InAppPurchaseEventManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wc.q;

/* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AutomaticAnalyticsLogger {
    private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final AutomaticAnalyticsLogger INSTANCE = new AutomaticAnalyticsLogger();
    private static final String TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());

    /* JADX INFO: compiled from: AutomaticAnalyticsLogger.kt */
    public static final class PurchaseLoggingParameters {
        private Currency currency;
        private OperationalData operationalData;
        private Bundle param;
        private BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(BigDecimal purchaseAmount, Currency currency, Bundle param, OperationalData operationalData) {
            t.f(purchaseAmount, "purchaseAmount");
            t.f(currency, "currency");
            t.f(param, "param");
            t.f(operationalData, "operationalData");
            this.purchaseAmount = purchaseAmount;
            this.currency = currency;
            this.param = param;
            this.operationalData = operationalData;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final OperationalData getOperationalData() {
            return this.operationalData;
        }

        public final Bundle getParam() {
            return this.param;
        }

        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setCurrency(Currency currency) {
            t.f(currency, "<set-?>");
            this.currency = currency;
        }

        public final void setOperationalData(OperationalData operationalData) {
            t.f(operationalData, "<set-?>");
            this.operationalData = operationalData;
        }

        public final void setParam(Bundle bundle) {
            t.f(bundle, "<set-?>");
            this.param = bundle;
        }

        public final void setPurchaseAmount(BigDecimal bigDecimal) {
            t.f(bigDecimal, "<set-?>");
            this.purchaseAmount = bigDecimal;
        }
    }

    private AutomaticAnalyticsLogger() {
    }

    public static final synchronized Bundle getPurchaseDedupeParameters(List<PurchaseLoggingParameters> purchaseLoggingParametersList) {
        PurchaseLoggingParameters purchaseLoggingParameters;
        t.f(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        purchaseLoggingParameters = purchaseLoggingParametersList.get(0);
        return InAppPurchaseManager.performDedupe(s.e(new InAppPurchase(AppEventsConstants.EVENT_NAME_PURCHASED, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency())), System.currentTimeMillis(), true, s.e(new q(purchaseLoggingParameters.getParam(), purchaseLoggingParameters.getOperationalData())));
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String str, String str2, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        return getPurchaseLoggingParameters(str, str2, new HashMap(), billingClientVersion);
    }

    private final PurchaseLoggingParameters getPurchaseParametersGPBLV2V4(String str, Bundle bundle, OperationalData operationalData, JSONObject jSONObject, JSONObject jSONObject2) {
        if (t.a(str, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean(Constants.GP_IAP_AUTORENEWING, false));
            t.e(string, "toString(\n              …      )\n                )");
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, string, bundle, operationalData);
            String strOptString = jSONObject2.optString(Constants.GP_IAP_SUBSCRIPTION_PERIOD);
            t.e(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_PERIOD, strOptString, bundle, operationalData);
            String strOptString2 = jSONObject2.optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
            t.e(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            companion.addParameter(operationalDataEnum, Constants.IAP_FREE_TRIAL_PERIOD, strOptString2, bundle, operationalData);
            String introductoryPriceCycles = jSONObject2.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_CYCLES);
            t.e(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PRICE_CYCLES, introductoryPriceCycles, bundle, operationalData);
            }
            String introductoryPricePeriod = jSONObject2.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_PERIOD);
            t.e(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PERIOD, introductoryPricePeriod, bundle, operationalData);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_AMOUNT_MICROS);
            t.e(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, introductoryPriceAmountMicros, bundle, operationalData);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4) / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4));
        t.e(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new PurchaseLoggingParameters(bigDecimal, currency, bundle, operationalData);
    }

    private final List<PurchaseLoggingParameters> getPurchaseParametersGPBLV5V7(String str, Bundle bundle, OperationalData operationalData, JSONObject jSONObject) throws JSONException {
        if (!t.a(str, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS);
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7) / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
            t.e(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return kotlin.collections.t.p(new PurchaseLoggingParameters(bigDecimal, currency, bundle, operationalData));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS);
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS).getJSONObject(i10);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            OperationalData operationalDataCopy = operationalData.copy();
            String basePlanId = jSONObject3.getString(Constants.GP_IAP_BASE_PLAN_ID);
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            t.e(basePlanId, "basePlanId");
            companion.addParameter(operationalDataEnum, Constants.IAP_BASE_PLAN, basePlanId, bundle2, operationalDataCopy);
            JSONArray jSONArray2 = jSONObject3.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES);
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString(Constants.GP_IAP_BILLING_PERIOD);
            t.e(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_PERIOD, strOptString, bundle2, operationalDataCopy);
            if (!jSONObject4.has(Constants.GP_IAP_RECURRENCE_MODE) || jSONObject4.getInt(Constants.GP_IAP_RECURRENCE_MODE) == 3) {
                companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, "false", bundle2, operationalDataCopy);
            } else {
                companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, bundle2, operationalDataCopy);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7) / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
            t.e(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new PurchaseLoggingParameters(bigDecimal2, currency2, bundle2, operationalDataCopy));
        }
        return arrayList;
    }

    public static final synchronized Bundle getSubscriptionDedupeParameters(List<PurchaseLoggingParameters> purchaseLoggingParametersList, String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        t.f(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        t.f(eventName, "eventName");
        arrayList = new ArrayList();
        for (PurchaseLoggingParameters purchaseLoggingParameters : purchaseLoggingParametersList) {
            arrayList.add(new InAppPurchase(eventName, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency()));
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        arrayList2 = new ArrayList(u.u(purchaseLoggingParametersList, 10));
        for (PurchaseLoggingParameters purchaseLoggingParameters2 : purchaseLoggingParametersList) {
            arrayList2.add(new q(purchaseLoggingParameters2.getParam(), purchaseLoggingParameters2.getOperationalData()));
        }
        return InAppPurchaseManager.performDedupe(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    public static final boolean isImplicitPurchaseLoggingEnabled() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery != null && FacebookSdk.getAutoLogAppEventsEnabled() && appSettingsWithoutQuery.getIAPAutomaticLoggingEnabled();
    }

    public static final void logActivateAppEvent() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            if (applicationContext instanceof Application) {
                AppEventsLogger.Companion.activateApp((Application) applicationContext, applicationId);
            } else {
                Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void logActivityTimeSpentEvent(String str, long j10) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        if (fetchedAppSettingsQueryAppSettings == null || !fetchedAppSettingsQueryAppSettings.getAutomaticLoggingEnabled() || j10 <= 0) {
            return;
        }
        InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence(Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, str);
        internalAppEventsLogger2.logEvent(Constants.AA_TIME_SPENT_EVENT_NAME, j10, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    public static final void logPurchase(String purchase, String skuDetails, boolean z10, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z11) {
        List<PurchaseLoggingParameters> purchaseLoggingParameters;
        String str;
        String str2;
        Bundle purchaseDedupeParameters;
        t.f(purchase, "purchase");
        t.f(skuDetails, "skuDetails");
        if (!isImplicitPurchaseLoggingEnabled() || (purchaseLoggingParameters = INSTANCE.getPurchaseLoggingParameters(purchase, skuDetails, billingClientVersion)) == null || purchaseLoggingParameters.isEmpty()) {
            return;
        }
        if (!(z10 && FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_IF_AUTO_LOG_SUBS, FacebookSdk.getApplicationId(), false))) {
            if (z11) {
                str2 = Constants.EVENT_NAME_PURCHASE_RESTORED;
            } else {
                str = AppEventsConstants.EVENT_NAME_PURCHASED;
            }
            if (!z10 && FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitSubsDedupe)) {
                purchaseDedupeParameters = getSubscriptionDedupeParameters(purchaseLoggingParameters, str);
            } else if (z10 && FeatureManager.isEnabled(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe)) {
                purchaseDedupeParameters = getPurchaseDedupeParameters(purchaseLoggingParameters);
            } else {
                purchaseDedupeParameters = null;
            }
            InAppPurchaseDedupeConfig.INSTANCE.addDedupeParameters(purchaseDedupeParameters, purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
            if (t.a(str, AppEventsConstants.EVENT_NAME_PURCHASED)) {
                internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
            } else {
                internalAppEventsLogger.logEventImplicitly(str, purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
            }
        }
        if (z11) {
            str2 = Constants.EVENT_NAME_SUBSCRIPTION_RESTORED;
        } else {
            str2 = InAppPurchaseEventManager.INSTANCE.hasFreeTrialPeirod(skuDetails) ? AppEventsConstants.EVENT_NAME_START_TRIAL : AppEventsConstants.EVENT_NAME_SUBSCRIBE;
        }
        str = str2;
        if (!z10) {
            if (z10) {
                purchaseDedupeParameters = null;
            } else {
                purchaseDedupeParameters = null;
            }
        } else if (z10) {
            purchaseDedupeParameters = null;
        } else {
            purchaseDedupeParameters = null;
        }
        InAppPurchaseDedupeConfig.INSTANCE.addDedupeParameters(purchaseDedupeParameters, purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        if (t.a(str, AppEventsConstants.EVENT_NAME_PURCHASED)) {
            internalAppEventsLogger.logEventImplicitly(str, purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        } else {
            internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        }
    }

    public static /* synthetic */ void logPurchase$default(String str, String str2, boolean z10, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        logPurchase(str, str2, z10, billingClientVersion, z11);
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String str, String str2, Map<String, String> map, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        List<PurchaseLoggingParameters> listP = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            OperationalData operationalData = new OperationalData();
            if (billingClientVersion != null) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_AUTOLOG_IMPLEMENTATION, billingClientVersion.getType(), bundle, operationalData);
            }
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = jSONObject.getString("productId");
            t.e(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_ID, string, bundle, operationalData);
            String string2 = jSONObject.getString("productId");
            t.e(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            companion.addParameter(operationalDataEnum, AppEventsConstants.EVENT_PARAM_CONTENT_ID, string2, bundle, operationalData);
            companion.addParameter(operationalDataEnum, Constants.ANDROID_DYNAMIC_ADS_CONTENT_ID, "client_implicit", bundle, operationalData);
            String string3 = jSONObject.getString(Constants.GP_IAP_PURCHASE_TIME);
            t.e(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PURCHASE_TIME, string3, bundle, operationalData);
            String string4 = jSONObject.getString("purchaseToken");
            t.e(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PURCHASE_TOKEN, string4, bundle, operationalData);
            String strOptString = jSONObject.optString("packageName");
            t.e(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PACKAGE_NAME, strOptString, bundle, operationalData);
            String strOptString2 = jSONObject2.optString("title");
            t.e(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_TITLE, strOptString2, bundle, operationalData);
            String strOptString3 = jSONObject2.optString("description");
            t.e(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_DESCRIPTION, strOptString3, bundle, operationalData);
            String type = jSONObject2.optString("type");
            t.e(type, "type");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_TYPE, type, bundle, operationalData);
            String specificBillingLibraryVersion = InAppPurchaseManager.getSpecificBillingLibraryVersion();
            if (specificBillingLibraryVersion != null) {
                companion.addParameter(operationalDataEnum, Constants.IAP_BILLING_LIBRARY_VERSION, specificBillingLibraryVersion, bundle, operationalData);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, entry.getKey(), entry.getValue(), bundle, operationalData);
            }
            if (jSONObject2.has(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4)) {
                listP = kotlin.collections.t.p(getPurchaseParametersGPBLV2V4(type, bundle, operationalData, jSONObject, jSONObject2));
            } else if (jSONObject2.has(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS) || jSONObject2.has(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS)) {
                try {
                    return getPurchaseParametersGPBLV5V7(type, bundle, operationalData, jSONObject2);
                } catch (JSONException e10) {
                    e = e10;
                    Log.e(TAG, "Error parsing in-app purchase/subscription data.", e);
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    Log.e(TAG, "Failed to get purchase logging parameters,", e);
                    return null;
                }
            }
            return listP;
        } catch (JSONException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }
}
