package com.facebook.internal.instrument.anrreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.t;
import od.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ANRHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ANRHandler {
    private static final int MAX_ANR_REPORT_NUM = 5;
    public static final ANRHandler INSTANCE = new ANRHandler();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);

    private ANRHandler() {
    }

    public static final synchronized void enable() {
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return;
        }
        try {
            if (enabled.getAndSet(true)) {
                return;
            }
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                sendANRReports();
            }
            ANRDetector.start();
            return;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
            return;
        }
        throw th;
    }

    public static final void sendANRReports() {
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return;
        }
        try {
            if (Utility.isDataProcessingRestricted()) {
                return;
            }
            File[] fileArrListAnrReportFiles = InstrumentUtility.listAnrReportFiles();
            ArrayList arrayList = new ArrayList(fileArrListAnrReportFiles.length);
            for (File file : fileArrListAnrReportFiles) {
                arrayList.add(InstrumentData.Builder.load(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final List listI0 = b0.i0(arrayList2, new Comparator() { // from class: w1.b
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ANRHandler.sendANRReports$lambda$2((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = k.n(0, Math.min(listI0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listI0.get(((j0) it).nextInt()));
            }
            InstrumentUtility.sendReports("anr_reports", jSONArray, new GraphRequest.Callback() { // from class: w1.c
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    ANRHandler.sendANRReports$lambda$5(listI0, graphResponse);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sendANRReports$lambda$2(InstrumentData instrumentData, InstrumentData o10) {
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return 0;
        }
        try {
            t.e(o10, "o2");
            return instrumentData.compareTo(o10);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendANRReports$lambda$5(List validReports, GraphResponse response) {
        if (CrashShieldHandler.isObjectCrashing(ANRHandler.class)) {
            return;
        }
        try {
            t.f(validReports, "$validReports");
            t.f(response, "response");
            try {
                if (response.getError() == null) {
                    JSONObject jsonObject = response.getJsonObject();
                    boolean z10 = false;
                    if (jsonObject != null && jsonObject.getBoolean(GraphResponse.SUCCESS_KEY)) {
                        z10 = true;
                    }
                    if (z10) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((InstrumentData) it.next()).clear();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ANRHandler.class);
        }
    }
}
