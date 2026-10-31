package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface MetricRequirementOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    GeometryMetric getGeometry();

    GeometryMetricOrBuilder getGeometryOrBuilder();

    LifecycleMetric getLifecycle();

    LifecycleMetricOrBuilder getLifecycleOrBuilder();

    int getMeasurementIndex();

    MetricRequirement.MetricCase getMetricCase();

    OverlapMetric getOverlap();

    OverlapMetricOrBuilder getOverlapOrBuilder();

    VisibilityMetric getVisibility();

    VisibilityMetricOrBuilder getVisibilityOrBuilder();

    boolean hasGeometry();

    boolean hasLifecycle();

    boolean hasOverlap();

    boolean hasVisibility();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
