package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ExceptionAnalyzer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExceptionAnalyzer {
    public static final ExceptionAnalyzer INSTANCE = new ExceptionAnalyzer();
    private static boolean enabled;

    private ExceptionAnalyzer() {
    }

    public static final void enable() {
        enabled = true;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            INSTANCE.sendExceptionAnalysisReports$facebook_core_release();
        }
    }

    public static final void execute(Throwable th) {
        if (!enabled || isDebug$facebook_core_release() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        t.e(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            t.e(className, "it.className");
            FeatureManager.Feature feature = FeatureManager.getFeature(className);
            if (feature != FeatureManager.Feature.Unknown) {
                FeatureManager.disableFeature(feature);
                hashSet.add(feature.toString());
            }
        }
        if (FacebookSdk.getAutoLogAppEventsEnabled() && (!hashSet.isEmpty())) {
            InstrumentData.Builder.build(new JSONArray((Collection) hashSet)).save();
        }
    }

    public static final boolean isDebug$facebook_core_release() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendExceptionAnalysisReports$lambda$1(InstrumentData instrumentData, GraphResponse response) {
        t.f(instrumentData, "$instrumentData");
        t.f(response, "response");
        try {
            if (response.getError() == null) {
                JSONObject jsonObject = response.getJsonObject();
                boolean z10 = false;
                if (jsonObject != null && jsonObject.getBoolean(GraphResponse.SUCCESS_KEY)) {
                    z10 = true;
                }
                if (z10) {
                    instrumentData.clear();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void sendExceptionAnalysisReports$facebook_core_release() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] fileArrListExceptionAnalysisReportFiles = InstrumentUtility.listExceptionAnalysisReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListExceptionAnalysisReportFiles) {
            final InstrumentData instrumentDataLoad = InstrumentData.Builder.load(file);
            if (instrumentDataLoad.isValid()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", instrumentDataLoad.toString());
                    GraphRequest.Companion companion = GraphRequest.Companion;
                    l0 l0Var = l0.f21527a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                    t.e(str, "format(format, *args)");
                    arrayList.add(companion.newPostRequest(null, str, jSONObject, new GraphRequest.Callback() { // from class: v1.a
                        @Override // com.facebook.GraphRequest.Callback
                        public final void onCompleted(GraphResponse graphResponse) {
                            ExceptionAnalyzer.sendExceptionAnalysisReports$lambda$1(instrumentDataLoad, graphResponse);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new GraphRequestBatch(arrayList).executeAsync();
    }
}
