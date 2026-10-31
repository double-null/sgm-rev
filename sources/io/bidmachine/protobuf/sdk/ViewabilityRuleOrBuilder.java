package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface ViewabilityRuleOrBuilder extends MessageOrBuilder {
    boolean getBillable();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    int getEvent();

    Measurement getMeasurement();

    MeasurementOrBuilder getMeasurementOrBuilder();

    MetricRequirement getRequiredMetrics(int i10);

    int getRequiredMetricsCount();

    List<MetricRequirement> getRequiredMetricsList();

    MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i10);

    List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList();

    boolean hasMeasurement();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
