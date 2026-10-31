package com.facebook.appevents;

/* JADX INFO: compiled from: OperationalData.kt */
/* JADX INFO: loaded from: classes.dex */
public enum OperationalDataEnum {
    IAPParameters("iap_parameters");

    private final String value;

    OperationalDataEnum(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
