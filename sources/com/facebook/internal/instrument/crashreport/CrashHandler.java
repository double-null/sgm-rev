package com.facebook.internal.instrument.crashreport;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CrashHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final int MAX_CRASH_REPORT_NUM = 5;
    private static CrashHandler instance;
    private final Thread.UncaughtExceptionHandler previousHandler;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = CrashHandler.class.getCanonicalName();

    /* JADX INFO: compiled from: CrashHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final void sendExceptionReports() {
            if (Utility.isDataProcessingRestricted()) {
                return;
            }
            File[] fileArrListExceptionReportFiles = InstrumentUtility.listExceptionReportFiles();
            ArrayList arrayList = new ArrayList(fileArrListExceptionReportFiles.length);
            for (File file : fileArrListExceptionReportFiles) {
                arrayList.add(InstrumentData.Builder.load(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final List listI0 = b0.i0(arrayList2, new Comparator() { // from class: x1.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return CrashHandler.Companion.sendExceptionReports$lambda$2((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = od.k.n(0, Math.min(listI0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listI0.get(((j0) it).nextInt()));
            }
            InstrumentUtility.sendReports("crash_reports", jSONArray, new GraphRequest.Callback() { // from class: x1.b
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    CrashHandler.Companion.sendExceptionReports$lambda$5(listI0, graphResponse);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int sendExceptionReports$lambda$2(InstrumentData instrumentData, InstrumentData o10) {
            t.e(o10, "o2");
            return instrumentData.compareTo(o10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void sendExceptionReports$lambda$5(List validReports, GraphResponse response) {
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
        }

        public final synchronized void enable() {
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                sendExceptionReports();
            }
            if (CrashHandler.instance != null) {
                Log.w(CrashHandler.TAG, "Already enabled!");
            } else {
                CrashHandler.instance = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(CrashHandler.instance);
            }
        }
    }

    public /* synthetic */ CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, k kVar) {
        this(uncaughtExceptionHandler);
    }

    public static final synchronized void enable() {
        Companion.enable();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        t.f(t10, "t");
        t.f(e10, "e");
        if (InstrumentUtility.isSDKRelatedException(e10)) {
            ExceptionAnalyzer.execute(e10);
            InstrumentData.Builder.build(e10, InstrumentData.Type.CrashReport).save();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }

    private CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }
}
