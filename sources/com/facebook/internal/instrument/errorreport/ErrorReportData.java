package com.facebook.internal.instrument.errorreport;

import com.facebook.internal.instrument.InstrumentUtility;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.io.File;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ErrorReportData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorReportData {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PRARAM_ERROR_MESSAGE = "error_message";
    private String errorMessage;
    private String filename;
    private Long timestamp;

    /* JADX INFO: compiled from: ErrorReportData.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public ErrorReportData(String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ERROR_REPORT_PREFIX);
        Long l10 = this.timestamp;
        t.d(l10, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        t.e(string, "StringBuffer()\n         …)\n            .toString()");
        this.filename = string;
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(ErrorReportData data) {
        t.f(data, "data");
        Long l10 = this.timestamp;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.timestamp;
        if (l11 != null) {
            return t.h(l11.longValue(), jLongValue);
        }
        return 1;
    }

    public final JSONObject getParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean isValid() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            return super.toString();
        }
        String string = parameters.toString();
        t.e(string, "params.toString()");
        return string;
    }

    public ErrorReportData(File file) {
        t.f(file, "file");
        String name = file.getName();
        t.e(name, "file.name");
        this.filename = name;
        JSONObject file2 = InstrumentUtility.readFile(name, true);
        if (file2 != null) {
            this.timestamp = Long.valueOf(file2.optLong("timestamp", 0L));
            this.errorMessage = file2.optString(WKirgUEJJ.GULagCPZeyt, null);
        }
    }
}
