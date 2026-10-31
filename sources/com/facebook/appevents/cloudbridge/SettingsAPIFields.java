package com.facebook.appevents.cloudbridge;

/* JADX INFO: compiled from: AppEventsCAPIManager.kt */
/* JADX INFO: loaded from: classes.dex */
public enum SettingsAPIFields {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");

    private final String rawValue;

    SettingsAPIFields(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
