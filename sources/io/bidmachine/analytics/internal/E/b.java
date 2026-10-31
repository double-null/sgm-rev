package io.bidmachine.analytics.internal.E;

import rd.a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final Float a(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            return a0.n((String) obj);
        }
        return null;
    }
}
