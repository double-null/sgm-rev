package yb;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DoubleTypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends a<Double> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double c(Object value) {
        t.f(value, "value");
        if (value instanceof Integer) {
            return Double.valueOf(((Number) value).intValue());
        }
        if (value instanceof Long) {
            return Double.valueOf(((Number) value).longValue());
        }
        return value instanceof String ? (Double) h.b(this, (String) value, null, 2, null) : d(value.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Double d(String value) {
        t.f(value, "value");
        try {
            return Double.valueOf(Double.parseDouble(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
