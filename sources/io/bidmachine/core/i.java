package io.bidmachine.core;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public static final Boolean a(Integer num) {
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final Integer c(Boolean bool) {
        if (bool != null) {
            return Integer.valueOf(b(bool.booleanValue()));
        }
        return null;
    }

    public static final int b(boolean z10) {
        return z10 ? 1 : 0;
    }
}
