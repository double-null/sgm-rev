package yb;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BooleanTypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends a<Boolean> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(Object value) {
        t.f(value, "value");
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (value instanceof String) {
            return d((String) value);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yb.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean d(String value) {
        t.f(value, "value");
        return Boolean.valueOf(Boolean.parseBoolean(value));
    }
}
