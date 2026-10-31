package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Metric {
    private String meta;
    private Sdk.SDKMetric.SDKMetricType metricType;

    public Metric(Sdk.SDKMetric.SDKMetricType metricType) {
        t.f(metricType, "metricType");
        this.metricType = metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final Sdk.SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }

    public final void setMetricType(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        t.f(sDKMetricType, "<set-?>");
        this.metricType = sDKMetricType;
    }
}
