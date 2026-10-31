package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.y;

/* JADX INFO: loaded from: classes4.dex */
public final class TaskPermissionProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n1bidmachine/protobuf/rendering/rendering_dto.proto\u0012\u0013bidmachine.protobuf\u001a-bidmachine/protobuf/rendering/rendering.proto\"×\u0003\n\u0017RenderingTaskPermission\u0012G\n\u0007request\u0018\u0001 \u0001(\u000b24.bidmachine.protobuf.RenderingTaskPermission.RequestH\u0000\u0012I\n\bresponse\u0018\u0002 \u0001(\u000b25.bidmachine.protobuf.RenderingTaskPermission.ResponseH\u0000\u001aÄ\u0001\n\u0007Request\u0012H\n\nevent_name\u0018\u0001 \u0001(\u000e24.bidmachine.protobuf.Rendering.Phase.Event.EventName\u0012\u0014\n\fevent_source\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bevent_value\u0018\u0003 \u0001(\t\u0012D\n\u000bevent_tasks\u0018\u0004 \u0003(\u000b2/.bidmachine.protobuf.Rendering.Phase.Event.Task\u001aP\n\bResponse\u0012D\n\u000bevent_tasks\u0018\u0001 \u0003(\u000b2/.bidmachine.protobuf.Rendering.Phase.Event.TaskB\u000f\n\rpayload_oneofB?\n io.bidmachine.protobuf.renderingB\u0013TaskPermissionProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{RenderingProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
    static final j0.f internal_static_bidmachine_protobuf_RenderingTaskPermission_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_RenderingTaskPermission_fieldAccessorTable = new j0.f(descriptor2, new String[]{"Request", "Response", "PayloadOneof"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_fieldAccessorTable = new j0.f(descriptor3, new String[]{"EventName", "EventSource", "EventValue", "EventTasks"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_fieldAccessorTable = new j0.f(descriptor4, new String[]{"EventTasks"});
        RenderingProto.getDescriptor();
    }

    private TaskPermissionProto() {
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
