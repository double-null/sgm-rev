package com.facebook.appevents.iap;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.internal.Constants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.s;
import kotlin.collections.t;
import wc.q;
import wc.w;

/* JADX INFO: compiled from: InAppPurchaseDedupeConfig.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InAppPurchaseDedupeConfig {
    public static final InAppPurchaseDedupeConfig INSTANCE = new InAppPurchaseDedupeConfig();
    private static final List<String> defaultCurrencyParameterEquivalents = s.e(AppEventsConstants.EVENT_PARAM_CURRENCY);
    private static final List<String> defaultValueParameterEquivalents = s.e(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
    private static final long defaultDedupeWindow = TimeUnit.MINUTES.toMillis(1);
    private static final List<q<String, List<String>>> defaultDedupeParameters = t.n(w.a(Constants.IAP_PRODUCT_ID, s.e(Constants.IAP_PRODUCT_ID)), w.a(Constants.IAP_PRODUCT_DESCRIPTION, s.e(Constants.IAP_PRODUCT_DESCRIPTION)), w.a(Constants.IAP_PRODUCT_TITLE, s.e(Constants.IAP_PRODUCT_TITLE)), w.a(Constants.IAP_PURCHASE_TOKEN, s.e(Constants.IAP_PURCHASE_TOKEN)));

    private InAppPurchaseDedupeConfig() {
    }

    public final q<Bundle, OperationalData> addDedupeParameters(Bundle bundle, Bundle bundle2, OperationalData operationalData) {
        if (bundle == null) {
            return new q<>(bundle2, operationalData);
        }
        try {
            for (String key : bundle.keySet()) {
                String string = bundle.getString(key);
                if (string != null) {
                    OperationalData.Companion companion = OperationalData.Companion;
                    OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                    kotlin.jvm.internal.t.e(key, "key");
                    q<Bundle, OperationalData> qVarAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, key, string, bundle2, operationalData);
                    Bundle bundleB = qVarAddParameterAndReturn.b();
                    operationalData = qVarAddParameterAndReturn.c();
                    bundle2 = bundleB;
                }
            }
        } catch (Exception unused) {
        }
        return new q<>(bundle2, operationalData);
    }

    public final Currency getCurrencyOfManualEvent(Bundle bundle) {
        Iterator<String> it = getCurrencyParameterEquivalents().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String next = it.next();
            if (bundle != null) {
                try {
                    string = bundle.getString(next);
                } catch (Exception unused) {
                    continue;
                }
            }
            if (!(string == null || string.length() == 0)) {
                return Currency.getInstance(string);
            }
        }
    }

    public final List<String> getCurrencyParameterEquivalents() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getCurrencyDedupeParameters() : null) == null || appSettingsWithoutQuery.getCurrencyDedupeParameters().isEmpty()) ? defaultCurrencyParameterEquivalents : appSettingsWithoutQuery.getCurrencyDedupeParameters();
    }

    public final List<q<String, List<String>>> getDedupeParameters(boolean z10) {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getProdDedupeParameters() : null) == null || appSettingsWithoutQuery.getProdDedupeParameters().isEmpty()) {
            return defaultDedupeParameters;
        }
        if (!z10) {
            return appSettingsWithoutQuery.getProdDedupeParameters();
        }
        ArrayList arrayList = new ArrayList();
        for (q<String, List<String>> qVar : appSettingsWithoutQuery.getProdDedupeParameters()) {
            Iterator<String> it = qVar.f().iterator();
            while (it.hasNext()) {
                arrayList.add(new q(it.next(), s.e(qVar.e())));
            }
        }
        return arrayList;
    }

    public final long getDedupeWindow() {
        Long dedupeWindow;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getDedupeWindow() : null) == null || ((dedupeWindow = appSettingsWithoutQuery.getDedupeWindow()) != null && dedupeWindow.longValue() == 0)) ? defaultDedupeWindow : appSettingsWithoutQuery.getDedupeWindow().longValue();
    }

    public final List<q<String, List<String>>> getTestDedupeParameters(boolean z10) {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery == null) {
            return null;
        }
        List<q<String, List<String>>> testDedupeParameters = appSettingsWithoutQuery.getTestDedupeParameters();
        if (testDedupeParameters == null || testDedupeParameters.isEmpty()) {
            return null;
        }
        if (!z10) {
            return appSettingsWithoutQuery.getTestDedupeParameters();
        }
        ArrayList arrayList = new ArrayList();
        for (q<String, List<String>> qVar : appSettingsWithoutQuery.getTestDedupeParameters()) {
            Iterator<String> it = qVar.f().iterator();
            while (it.hasNext()) {
                arrayList.add(new q(it.next(), s.e(qVar.e())));
            }
        }
        return arrayList;
    }

    public final Double getValueOfManualEvent(Double d10, Bundle bundle) {
        if (d10 != null) {
            return d10;
        }
        Iterator<String> it = getValueParameterEquivalents().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(next));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public final List<String> getValueParameterEquivalents() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getPurchaseValueDedupeParameters() : null) == null || appSettingsWithoutQuery.getPurchaseValueDedupeParameters().isEmpty()) ? defaultValueParameterEquivalents : appSettingsWithoutQuery.getPurchaseValueDedupeParameters();
    }
}
