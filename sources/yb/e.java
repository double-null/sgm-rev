package yb;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: IntTypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends a<Integer> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer c(Object value) {
        t.f(value, "value");
        if (value instanceof Number) {
            return Integer.valueOf(((Number) value).intValue());
        }
        if (value instanceof String) {
            return (Integer) h.b(this, (String) value, null, 2, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer d(String value) {
        t.f(value, "value");
        try {
            return Integer.valueOf(Integer.parseInt(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
