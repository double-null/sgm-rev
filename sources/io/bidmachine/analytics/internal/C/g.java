package io.bidmachine.analytics.internal.C;

import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.protobuf.sdk.ErrorReasonAnalytics;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.a.values().length];
            try {
                iArr[h.a.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.a.MONITOR_INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.a.MONITOR_NO_CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.a.MONITOR_BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.a.READER_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.a.READER_NO_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.a.READER_BAD_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.a.READER_NO_ACCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final JSONObject a(h hVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", hVar.a());
        jSONObject.put("type", a(hVar.c()));
        jSONObject.put("reason", hVar.b());
        return jSONObject;
    }

    public static final h a(JSONObject jSONObject) {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            objC = r.c(new h(jSONObject.getString("name"), a(jSONObject.getInt("type")), jSONObject.optString("reason")));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.k(objC)) {
            objC = null;
        }
        return (h) objC;
    }

    private static final int a(h.a aVar) {
        switch (a.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                return 2000;
            case 2:
                return 2100;
            case 3:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE;
            case 4:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE;
            case 5:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_UNDEFINED_VALUE;
            case 6:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_CONTENT_VALUE;
            case 7:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE;
            case 8:
                return ErrorReasonAnalytics.ERROR_REASON_ANALYTICS_READER_NO_ACCESS_VALUE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final h.a a(int i10) {
        switch (i10) {
            case 2100:
                return h.a.MONITOR_INVALID;
            case ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE:
                return h.a.MONITOR_NO_CONTENT;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                return h.a.MONITOR_BAD_CONTENT;
            default:
                switch (i10) {
                    case ERROR_REASON_ANALYTICS_READER_UNDEFINED_VALUE:
                        return h.a.READER_INVALID;
                    case ERROR_REASON_ANALYTICS_READER_NO_CONTENT_VALUE:
                        return h.a.READER_NO_CONTENT;
                    case ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE:
                        return h.a.READER_BAD_CONTENT;
                    case ERROR_REASON_ANALYTICS_READER_NO_ACCESS_VALUE:
                        return h.a.READER_NO_ACCESS;
                    default:
                        return h.a.UNKNOWN;
                }
        }
    }
}
