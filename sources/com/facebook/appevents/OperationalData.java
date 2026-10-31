package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.appevents.internal.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.u0;
import kotlin.jvm.internal.l0;
import org.json.JSONObject;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: OperationalData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OperationalData {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> iapOperationalAndCustomParameters;
    private static final Set<String> iapOperationalParameters;
    private static final Map<OperationalDataEnum, wc.q<Set<String>, Set<String>>> parameterClassifications;
    private final Map<OperationalDataEnum, Map<String, Object>> operationalData = new LinkedHashMap();

    /* JADX INFO: compiled from: OperationalData.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {

        /* JADX INFO: compiled from: OperationalData.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ParameterClassification.values().length];
                try {
                    iArr[ParameterClassification.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParameterClassification.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void addParameter(OperationalDataEnum typeOfParameter, String key, String value, Bundle customEventsParams, OperationalData operationalData) {
            kotlin.jvm.internal.t.f(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(value, "value");
            kotlin.jvm.internal.t.f(customEventsParams, "customEventsParams");
            kotlin.jvm.internal.t.f(operationalData, "operationalData");
            int i10 = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (i10 == 2) {
                operationalData.addParameter(typeOfParameter, key, value);
            } else {
                if (i10 != 3) {
                    return;
                }
                operationalData.addParameter(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        public final wc.q<Bundle, OperationalData> addParameterAndReturn(OperationalDataEnum typeOfParameter, String key, String value, Bundle bundle, OperationalData operationalData) {
            kotlin.jvm.internal.t.f(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.t.f(key, "key");
            kotlin.jvm.internal.t.f(value, "value");
            int i10 = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(key, value);
            } else if (i10 == 2) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                operationalData.addParameter(typeOfParameter, key, value);
            } else if (i10 == 3) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                operationalData.addParameter(typeOfParameter, key, value);
                bundle.putCharSequence(key, value);
            }
            return new wc.q<>(bundle, operationalData);
        }

        public final Object getParameter(OperationalDataEnum typeOfParameter, String key, Bundle bundle, OperationalData operationalData) {
            kotlin.jvm.internal.t.f(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.t.f(key, "key");
            Object parameter = operationalData != null ? operationalData.getParameter(typeOfParameter, key) : null;
            return parameter == null ? bundle != null ? bundle.getCharSequence(key) : null : parameter;
        }

        public final ParameterClassification getParameterClassification(OperationalDataEnum typeOfParameter, String parameter) {
            kotlin.jvm.internal.t.f(typeOfParameter, "typeOfParameter");
            kotlin.jvm.internal.t.f(parameter, "parameter");
            wc.q qVar = (wc.q) OperationalData.parameterClassifications.get(typeOfParameter);
            Set set = qVar != null ? (Set) qVar.e() : null;
            wc.q qVar2 = (wc.q) OperationalData.parameterClassifications.get(typeOfParameter);
            Set set2 = qVar2 != null ? (Set) qVar2.f() : null;
            if (set == null || !set.contains(parameter)) {
                return (set2 == null || !set2.contains(parameter)) ? ParameterClassification.CustomData : ParameterClassification.CustomAndOperationalData;
            }
            return ParameterClassification.OperationalData;
        }
    }

    public final void addParameter(OperationalDataEnum type, String key, Object value) {
        kotlin.jvm.internal.t.f(type, "type");
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        try {
            AppEvent.Companion.validateIdentifier(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                l0 l0Var = l0.f21527a;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                kotlin.jvm.internal.t.e(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            if (!this.operationalData.containsKey(type)) {
                this.operationalData.put(type, new LinkedHashMap());
            }
            Map<String, Object> map = this.operationalData.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    public final OperationalData copy() {
        OperationalData operationalData = new OperationalData();
        for (OperationalDataEnum operationalDataEnum : this.operationalData.keySet()) {
            Map<String, Object> map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        operationalData.addParameter(operationalDataEnum, str, obj);
                    }
                }
            }
        }
        return operationalData;
    }

    public final Object getParameter(OperationalDataEnum type, String key) {
        Map<String, Object> map;
        kotlin.jvm.internal.t.f(type, "type");
        kotlin.jvm.internal.t.f(key, "key");
        if (this.operationalData.containsKey(type) && (map = this.operationalData.get(type)) != null) {
            return map.get(key);
        }
        return null;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject;
        try {
            Map<OperationalDataEnum, Map<String, Object>> map = this.operationalData;
            LinkedHashMap linkedHashMap = new LinkedHashMap(n0.e(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((OperationalDataEnum) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(o0.s(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    static {
        Set<String> setI = u0.i(Constants.IAP_PACKAGE_NAME, Constants.IAP_SUBSCRIPTION_AUTORENEWING, Constants.IAP_FREE_TRIAL_PERIOD, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, Constants.IAP_INTRO_PRICE_CYCLES, Constants.IAP_BASE_PLAN, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, Constants.IAP_AUTOLOG_IMPLEMENTATION, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, Constants.IAP_BILLING_LIBRARY_VERSION, Constants.IAP_SUBSCRIPTION_PERIOD, Constants.IAP_PURCHASE_TOKEN, Constants.IAP_NON_DEDUPED_EVENT_TIME, Constants.IAP_ACTUAL_DEDUP_RESULT, GEmOVMyH.vCojw, Constants.IAP_TEST_DEDUP_RESULT, Constants.IAP_TEST_DEDUP_KEY_USED);
        iapOperationalParameters = setI;
        Set<String> setI2 = u0.i(Constants.IAP_PRODUCT_ID, Constants.IAP_PRODUCT_TYPE, Constants.IAP_PURCHASE_TIME);
        iapOperationalAndCustomParameters = setI2;
        parameterClassifications = n0.f(wc.w.a(OperationalDataEnum.IAPParameters, new wc.q(setI, setI2)));
    }
}
