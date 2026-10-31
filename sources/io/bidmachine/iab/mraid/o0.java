package io.bidmachine.iab.mraid;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum o0 {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String c() {
        return toString().toLowerCase(Locale.US);
    }
}
