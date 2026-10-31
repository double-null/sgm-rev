package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DualValueMetric extends Metric {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DualValueMetric(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        t.f(metricType, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l10) {
        this.valueFirst = l10;
    }

    public final void setValueSecond(Long l10) {
        this.valueSecond = l10;
    }
}
