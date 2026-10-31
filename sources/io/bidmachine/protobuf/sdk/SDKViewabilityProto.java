package io.bidmachine.protobuf.sdk;

import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.y;

/* JADX INFO: loaded from: classes5.dex */
public final class SDKViewabilityProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n)bidmachine/protobuf/sdk/viewability.proto\u0012#bidmachine.protobuf.sdk.viewability\"_\n\u0018ViewabilityConfiguration\u0012C\n\u0005rules\u0018\u0001 \u0003(\u000b24.bidmachine.protobuf.sdk.viewability.ViewabilityRule\"Ë\u0001\n\u000fViewabilityRule\u0012\r\n\u0005event\u0018\u0001 \u0001(\r\u0012\u0010\n\bbillable\u0018\u0002 \u0001(\b\u0012E\n\u000bmeasurement\u0018\u0003 \u0001(\u000b20.bidmachine.protobuf.sdk.viewability.Measurement\u0012P\n\u0010required_metrics\u0018\u0005 \u0003(\u000b26.bidmachine.protobuf.sdk.viewability.MetricRequirement\"i\n\u000bMeasurement\u0012\r\n\u0005count\u0018\u0001 \u0001(\r\u0012\u0013\n\u000binterval_ms\u0018\u0002 \u0001(\r\u0012\u001f\n\u0012failure_timeout_ms\u0018\u0004 \u0001(\rH\u0000\u0088\u0001\u0001B\u0015\n\u0013_failure_timeout_ms\"à\u0002\n\u0011MetricRequirement\u0012\u0019\n\u0011measurement_index\u0018\u0001 \u0001(\r\u0012G\n\bgeometry\u0018\u0005 \u0001(\u000b23.bidmachine.protobuf.sdk.viewability.GeometryMetricH\u0000\u0012K\n\nvisibility\u0018\u0006 \u0001(\u000b25.bidmachine.protobuf.sdk.viewability.VisibilityMetricH\u0000\u0012I\n\tlifecycle\u0018\u0007 \u0001(\u000b24.bidmachine.protobuf.sdk.viewability.LifecycleMetricH\u0000\u0012E\n\u0007overlap\u0018\b \u0001(\u000b22.bidmachine.protobuf.sdk.viewability.OverlapMetricH\u0000B\b\n\u0006metric\"\u0095\u0001\n\u000eGeometryMetric\u0012\u0016\n\tmin_width\u0018\u0001 \u0001(\rH\u0000\u0088\u0001\u0001\u0012\u0017\n\nmin_height\u0018\u0002 \u0001(\rH\u0001\u0088\u0001\u0001\u0012\u000f\n\u0007visible\u0018\u0003 \u0001(\b\u0012\u0016\n\tmin_alpha\u0018\u0006 \u0001(\u0001H\u0002\u0088\u0001\u0001B\f\n\n_min_widthB\r\n\u000b_min_heightB\f\n\n_min_alpha\"Ç\u0001\n\u0010VisibilityMetric\u0012T\n\u0005scope\u0018\u0001 \u0001(\u000e2E.bidmachine.protobuf.sdk.viewability.VisibilityMetric.VisibilityScope\u0012\u001e\n\u0016min_visible_percentage\u0018\u0002 \u0001(\u0001\"=\n\u000fVisibilityScope\u0012\u000f\n\u000bPARENT_VIEW\u0010\u0000\u0012\n\n\u0006SCREEN\u0010\u0001\u0012\r\n\tSAFE_AREA\u0010\u0002\"º\u0001\n\u000fLifecycleMetric\u0012\\\n\u000frequired_states\u0018\u0001 \u0003(\u000e2C.bidmachine.protobuf.sdk.viewability.LifecycleMetric.LifecycleState\"I\n\u000eLifecycleState\u0012\u000e\n\nFOREGROUND\u0010\u0000\u0012\u0014\n\u0010HAS_WINDOW_FOCUS\u0010\u0001\u0012\u0011\n\rVIEW_APPEARED\u0010\u0002\"¾\u0001\n\rOverlapMetric\u0012N\n\u0005scope\u0018\u0001 \u0001(\u000e2?.bidmachine.protobuf.sdk.viewability.OverlapMetric.OverlapScope\u0012\u001e\n\u0016max_overlap_percentage\u0018\u0002 \u0001(\u0001\"=\n\fOverlapScope\u0012\u0011\n\rVIEW_SIBLINGS\u0010\u0000\u0012\r\n\tALL_VIEWS\u0010\u0001\u0012\u000b\n\u0007WINDOWS\u0010\u0002B3\n\u001aio.bidmachine.protobuf.sdkB\u0013SDKViewabilityProtoP\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_Measurement_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable;

    private SDKViewabilityProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(y yVar) {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_fieldAccessorTable = new j0.f(descriptor2, new String[]{"Rules"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable = new j0.f(descriptor3, new String[]{"Event", "Billable", "Measurement", "RequiredMetrics"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_sdk_viewability_Measurement_fieldAccessorTable = new j0.f(descriptor4, new String[]{"Count", "IntervalMs", "FailureTimeoutMs", "FailureTimeoutMs"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_fieldAccessorTable = new j0.f(descriptor5, new String[]{"MeasurementIndex", "Geometry", "Visibility", "Lifecycle", "Overlap", "Metric"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_fieldAccessorTable = new j0.f(descriptor6, new String[]{ykDFMuXDQMaR.aAiVJxklWYgMue, "MinHeight", "Visible", "MinAlpha", ykDFMuXDQMaR.aAiVJxklWYgMue, "MinHeight", "MinAlpha"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable = new j0.f(descriptor7, new String[]{"Scope", "MinVisiblePercentage"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable = new j0.f(descriptor8, new String[]{"RequiredStates"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_fieldAccessorTable = new j0.f(descriptor9, new String[]{"Scope", "MaxOverlapPercentage"});
    }

    public static void registerAllExtensions(w wVar) {
        registerAllExtensions((y) wVar);
    }
}
