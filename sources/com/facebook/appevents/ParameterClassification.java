package com.facebook.appevents;

import io.bidmachine.analytics.internal.s.bOI.CwEo;

/* JADX INFO: compiled from: OperationalData.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum ParameterClassification {
    CustomData("custom_data"),
    OperationalData(CwEo.FYyQ),
    CustomAndOperationalData("custom_and_operational_data");

    private final String value;

    ParameterClassification(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
