package com.facebook.internal.instrument.errorreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.errorreport.ErrorReportData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.x;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.o;

/* JADX INFO: compiled from: ErrorReportHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorReportHandler {
    public static final ErrorReportHandler INSTANCE = new ErrorReportHandler();
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    private ErrorReportHandler() {
    }

    public static final void enable() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    public static final File[] listErrorReportFiles() {
        File instrumentReportDir = InstrumentUtility.getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: y1.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ErrorReportHandler.listErrorReportFiles$lambda$3(file, str);
            }
        });
        t.e(fileArrListFiles, "reportDir.listFiles { _,…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listErrorReportFiles$lambda$3(File file, String name) {
        t.e(name, "name");
        l0 l0Var = l0.f21527a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ERROR_REPORT_PREFIX}, 1));
        t.e(str, "format(format, *args)");
        return new o(str).e(name);
    }

    public static final void save(String str) {
        try {
            new ErrorReportData(str).save();
        } catch (Exception unused) {
        }
    }

    public static final void sendErrorReports() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] fileArrListErrorReportFiles = listErrorReportFiles();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrListErrorReportFiles) {
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.isValid()) {
                arrayList.add(errorReportData);
            }
        }
        x.y(arrayList, new Comparator() { // from class: y1.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ErrorReportHandler.sendErrorReports$lambda$0((ErrorReportData) obj, (ErrorReportData) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < arrayList.size() && i10 < 1000; i10++) {
            jSONArray.put(arrayList.get(i10));
        }
        InstrumentUtility.sendReports("error_reports", jSONArray, new GraphRequest.Callback() { // from class: y1.b
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(GraphResponse graphResponse) {
                ErrorReportHandler.sendErrorReports$lambda$2(arrayList, graphResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorReports$lambda$2(ArrayList validReports, GraphResponse response) {
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
                        ((ErrorReportData) it.next()).clear();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sendErrorReports$lambda$0(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
        t.e(errorReportData2, RHIpdOnfgiYkEj.znIrMcpx);
        return errorReportData.compareTo(errorReportData2);
    }
}
