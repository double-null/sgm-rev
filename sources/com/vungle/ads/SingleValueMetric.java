package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes4.dex */
public class SingleValueMetric extends Metric {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleValueMetric(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        t.f(metricType, "metricType");
    }

    public final void addValue(long j10) {
        Long l10 = this.value;
        this.value = Long.valueOf((l10 != null ? l10.longValue() : 0L) + j10);
    }

    /* JADX INFO: renamed from: getValue, reason: collision with other method in class */
    public final Long m222getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l10) {
        this.value = l10;
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        Long l10 = this.value;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }
}
