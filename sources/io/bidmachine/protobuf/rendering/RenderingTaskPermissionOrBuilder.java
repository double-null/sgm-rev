package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes4.dex */
public interface RenderingTaskPermissionOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    RenderingTaskPermission.PayloadOneofCase getPayloadOneofCase();

    RenderingTaskPermission.Request getRequest();

    RenderingTaskPermission.RequestOrBuilder getRequestOrBuilder();

    RenderingTaskPermission.Response getResponse();

    RenderingTaskPermission.ResponseOrBuilder getResponseOrBuilder();

    boolean hasRequest();

    boolean hasResponse();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
