package yb;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: LongTypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends a<Long> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long c(Object value) {
        t.f(value, "value");
        if (value instanceof Number) {
            return Long.valueOf(((Number) value).longValue());
        }
        if (value instanceof String) {
            return (Long) h.b(this, (String) value, null, 2, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long d(String value) {
        t.f(value, "value");
        try {
            return Long.valueOf(Long.parseLong(value));
        } catch (Throwable unused) {
            return null;
        }
    }
}
