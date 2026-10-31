package com.facebook.internal.instrument;

import android.os.Build;
import com.facebook.internal.Utility;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.io.File;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;

/* JADX INFO: compiled from: InstrumentData.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InstrumentData {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_APP_VERSION = "app_version";
    private static final String PARAM_CALLSTACK = "callstack";
    private static final String PARAM_DEVICE_MODEL = "device_model";
    private static final String PARAM_DEVICE_OS = "device_os_version";
    private static final String PARAM_FEATURE_NAMES = "feature_names";
    private static final String PARAM_REASON = "reason";
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PARAM_TYPE = "type";
    private static final String UNKNOWN = "Unknown";
    private String appVersion;
    private String cause;
    private JSONArray featureNames;
    private String filename;
    private String stackTrace;
    private Long timestamp;
    private Type type;

    /* JADX INFO: compiled from: InstrumentData.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        public static final InstrumentData build(Throwable th, Type t10) {
            t.f(t10, "t");
            return new InstrumentData(th, t10, (k) null);
        }

        public static final InstrumentData load(File file) {
            t.f(file, "file");
            return new InstrumentData(file, (k) null);
        }

        public static final InstrumentData build(JSONArray features) {
            t.f(features, "features");
            return new InstrumentData(features, (k) null);
        }

        public static final InstrumentData build(String str, String str2) {
            return new InstrumentData(str, str2, (k) null);
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type getType(String str) {
            if (c0.O(str, InstrumentUtility.CRASH_REPORT_PREFIX, false, 2, null)) {
                return Type.CrashReport;
            }
            if (c0.O(str, InstrumentUtility.CRASH_SHIELD_PREFIX, false, 2, null)) {
                return Type.CrashShield;
            }
            if (c0.O(str, InstrumentUtility.THREAD_CHECK_PREFIX, false, 2, null)) {
                return Type.ThreadCheck;
            }
            if (c0.O(str, InstrumentUtility.ANALYSIS_REPORT_PREFIX, false, 2, null)) {
                return Type.Analysis;
            }
            return c0.O(str, InstrumentUtility.ANR_REPORT_PREFIX, false, 2, null) ? Type.AnrReport : Type.Unknown;
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: compiled from: InstrumentData.kt */
        /* JADX INFO: loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String getLogPrefix() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return InstrumentUtility.ANALYSIS_REPORT_PREFIX;
            }
            if (i10 == 2) {
                return InstrumentUtility.ANR_REPORT_PREFIX;
            }
            if (i10 == 3) {
                return InstrumentUtility.CRASH_REPORT_PREFIX;
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : InstrumentUtility.THREAD_CHECK_PREFIX;
            }
            return InstrumentUtility.CRASH_SHIELD_PREFIX;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "ThreadCheck";
            }
            return EFLCCdIRcb.APgaSF;
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    /* JADX INFO: loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentData(File file, k kVar) {
        this(file);
    }

    private final JSONObject getAnalysisReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(PARAM_FEATURE_NAMES, jSONArray);
            }
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getExceptionReportParameters() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_DEVICE_OS, Build.VERSION.RELEASE);
            jSONObject.put(PARAM_DEVICE_MODEL, Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put(PARAM_APP_VERSION, str);
            }
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put(PARAM_REASON, str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(PARAM_CALLSTACK, str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getParameters() {
        Type type = this.type;
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            return getAnalysisReportParameters();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return getExceptionReportParameters();
        }
        return null;
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(InstrumentData data) {
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

    public final boolean isValid() {
        Type type = this.type;
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.stackTrace == null || this.timestamp == null) {
                    return false;
                }
            } else if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject parameters = getParameters();
        if (parameters == null) {
            String string = new JSONObject().toString();
            t.e(string, "JSONObject().toString()");
            return string;
        }
        String string2 = parameters.toString();
        t.e(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ InstrumentData(String str, String str2, k kVar) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type, k kVar) {
        this(th, type);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, k kVar) {
        this(jSONArray);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANALYSIS_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(KBBdKxoAiHo.qGmrZpVb);
        String string = stringBuffer.toString();
        t.e(string, "StringBuffer()\n         …)\n            .toString()");
        this.filename = string;
    }

    private InstrumentData(Throwable th, Type type) {
        this.type = type;
        this.appVersion = Utility.getAppVersion();
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        t.e(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.filename = string;
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANR_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        t.e(string, "StringBuffer()\n         …)\n            .toString()");
        this.filename = string;
    }

    private InstrumentData(File file) {
        String name = file.getName();
        t.e(name, "file.name");
        this.filename = name;
        this.type = Companion.getType(name);
        JSONObject file2 = InstrumentUtility.readFile(this.filename, true);
        if (file2 != null) {
            this.timestamp = Long.valueOf(file2.optLong("timestamp", 0L));
            this.appVersion = file2.optString(PARAM_APP_VERSION, null);
            this.cause = file2.optString(PARAM_REASON, null);
            this.stackTrace = file2.optString(PARAM_CALLSTACK, null);
            this.featureNames = file2.optJSONArray(PARAM_FEATURE_NAMES);
        }
    }
}
