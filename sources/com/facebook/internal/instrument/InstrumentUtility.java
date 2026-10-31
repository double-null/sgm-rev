package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import k9.dW.xjwcmjDeOXR;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;
import rd.d;
import rd.o;

/* JADX INFO: compiled from: InstrumentUtility.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InstrumentUtility {
    public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";
    public static final String ANR_REPORT_PREFIX = "anr_log_";
    private static final String CODELESS_PREFIX = "com.facebook.appevents.codeless";
    public static final String CRASH_REPORT_PREFIX = "crash_log_";
    public static final String CRASH_SHIELD_PREFIX = "shield_log_";
    public static final String ERROR_REPORT_PREFIX = "error_log_";
    private static final String FBSDK_PREFIX = "com.facebook";
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();
    private static final String INSTRUMENT_DIR = "instrument";
    private static final String METASDK_PREFIX = "com.meta";
    private static final String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";
    public static final String THREAD_CHECK_PREFIX = "thread_check_log_";

    private InstrumentUtility() {
    }

    public static final boolean deleteFile(String str) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null) {
            return false;
        }
        return new File(instrumentReportDir, str).delete();
    }

    public static final String getCause(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File getInstrumentReportDir() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), INSTRUMENT_DIR);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String getStackTrace(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            t.e(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean isFromFbOrMeta(StackTraceElement element) {
        t.f(element, "element");
        String className = element.getClassName();
        t.e(className, "element.className");
        if (!c0.O(className, FBSDK_PREFIX, false, 2, null)) {
            String className2 = element.getClassName();
            t.e(className2, "element.className");
            if (!c0.O(className2, METASDK_PREFIX, false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isSDKRelatedException(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            t.e(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                t.e(element, "element");
                if (isFromFbOrMeta(element)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean isSDKRelatedThread(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                t.e(element, "element");
                if (isFromFbOrMeta(element)) {
                    String className = element.getClassName();
                    t.e(className, "element.className");
                    if (!c0.O(className, CODELESS_PREFIX, false, 2, null)) {
                        String className2 = element.getClassName();
                        t.e(className2, "element.className");
                        if (!c0.O(className2, SUGGESTED_EVENTS_PREFIX, false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    t.e(methodName, "element.methodName");
                    if (c0.O(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        t.e(methodName2, "element.methodName");
                        if (c0.O(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            t.e(methodName3, "element.methodName");
                            if (!c0.O(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: v1.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return InstrumentUtility.listAnrReportFiles$lambda$1(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAnrReportFiles$lambda$1(File file, String name) {
        t.e(name, "name");
        l0 l0Var = l0.f21527a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANR_REPORT_PREFIX}, 1));
        t.e(str, "format(format, *args)");
        return new o(str).e(name);
    }

    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: v1.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return InstrumentUtility.listExceptionAnalysisReportFiles$lambda$2(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(new FilenameFilter() { // from class: v1.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return InstrumentUtility.listExceptionReportFiles$lambda$3(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listExceptionReportFiles$lambda$3(File file, String name) {
        t.e(name, "name");
        l0 l0Var = l0.f21527a;
        String str = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{CRASH_REPORT_PREFIX, CRASH_SHIELD_PREFIX, THREAD_CHECK_PREFIX}, 3));
        t.e(str, "format(format, *args)");
        return new o(str).e(name);
    }

    public static final JSONObject readFile(String str, boolean z10) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null) {
            try {
                return new JSONObject(Utility.readStreamToString(new FileInputStream(new File(instrumentReportDir, str))));
            } catch (Exception unused) {
                if (z10) {
                    deleteFile(str);
                }
            }
        }
        return null;
    }

    public static final void sendReports(String str, JSONArray reports, GraphRequest.Callback callback) {
        t.f(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                Iterator<String> itKeys = dataProcessingOptions.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.Companion;
            l0 l0Var = l0.f21527a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            t.e(str2, "format(format, *args)");
            companion.newPostRequest(null, str2, jSONObject, callback).executeAsync();
        } catch (JSONException unused) {
        }
    }

    public static final void writeFile(String str, String str2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, str));
            byte[] bytes = str2.getBytes(d.f24999b);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listExceptionAnalysisReportFiles$lambda$2(File file, String name) {
        t.e(name, "name");
        l0 l0Var = l0.f21527a;
        String str = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{xjwcmjDeOXR.QXbm}, 1));
        t.e(str, "format(format, *args)");
        return new o(str).e(name);
    }

    public static final String getStackTrace(Thread thread) {
        t.f(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        t.e(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
