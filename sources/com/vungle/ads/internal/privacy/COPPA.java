package com.vungle.ads.internal.privacy;

/* JADX INFO: compiled from: COPPA.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum COPPA {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);

    private final Boolean value;

    COPPA(Boolean bool) {
        this.value = bool;
    }

    public final Boolean getValue() {
        return this.value;
    }
}
