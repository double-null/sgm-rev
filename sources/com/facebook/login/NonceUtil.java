package com.facebook.login;

import rd.f0;

/* JADX INFO: compiled from: NonceUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NonceUtil {
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    public static final boolean isValidNonce(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(f0.h0(str, ' ', 0, false, 6, null) >= 0);
    }
}
