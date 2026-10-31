package yb;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: FloatTypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends a<Float> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float c(Object value) {
        t.f(value, "value");
        if (value instanceof Integer) {
            return Float.valueOf(((Number) value).intValue());
        }
        if (value instanceof Long) {
            return Float.valueOf(((Number) value).longValue());
        }
        return value instanceof String ? (Float) h.b(this, (String) value, null, 2, null) : d(value.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float d(String value) {
        t.f(value, "value");
        try {
            return Float.valueOf(Float.parseFloat(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
