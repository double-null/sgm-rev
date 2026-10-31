package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.d3;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.o2;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.y;
import io.bidmachine.protobuf.sdk.SDKErrorsProto;

/* JADX INFO: loaded from: classes4.dex */
public final class EventsProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n*bidmachine/protobuf/analytics/events.proto\u0012$bidmachine.protobuf.analytics.events\u001a\u001egoogle/protobuf/wrappers.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a$bidmachine/protobuf/sdk/errors.proto\"\u0083\u0003\n\bSDKEvent\u0012\u000e\n\u0006action\u0018\u0001 \u0001(\r\u0012\u000f\n\u0007context\u0018\u0002 \u0001(\t\u0012-\n\u0007network\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012.\n\nstart_time\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012/\n\u000bfinish_time\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012-\n\u0007ad_type\u0018\u0006 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012\r\n\u0005price\u0018\u0007 \u0001(\u0001\u00124\n\u0005error\u0018\b \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\u0012.\n\rcustom_params\u0018\t \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0015\n\bbillable\u0018\n \u0001(\bH\u0000\u0088\u0001\u0001B\u000b\n\t_billableB8\n'io.bidmachine.protobuf.analytics.eventsB\u000bEventsProtoP\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{d3.a(), o2.a(), j2.a(), SDKErrorsProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable = new j0.f(descriptor2, new String[]{"Action", "Context", "Network", "StartTime", "FinishTime", "AdType", "Price", "Error", "CustomParams", "Billable", "Billable"});
        d3.a();
        o2.a();
        j2.a();
        SDKErrorsProto.getDescriptor();
    }

    private EventsProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(y yVar) {
    }

    public static void registerAllExtensions(w wVar) {
        registerAllExtensions((y) wVar);
    }
}
