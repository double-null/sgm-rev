package com.explorestack.protobuf;

/* JADX INFO: compiled from: AnyProto.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Descriptors.Descriptor f10384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final j0.f f10385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Descriptors.FileDescriptor f10386c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019google/protobuf/any.proto\u0012\u000fgoogle.protobuf\"&\n\u0003Any\u0012\u0010\n\btype_url\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\fBv\n\u0013com.google.protobufB\bAnyProtoP\u0001Z,google.golang.org/protobuf/types/known/anypb¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        f10384a = descriptor;
        f10385b = new j0.f(descriptor, new String[]{"TypeUrl", "Value"});
    }

    public static Descriptors.FileDescriptor a() {
        return f10386c;
    }
}
