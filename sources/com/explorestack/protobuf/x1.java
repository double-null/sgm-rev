package com.explorestack.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes.dex */
final class x1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MessageLite f10868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f10870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10871d;

    Object[] a() {
        return this.f10870c;
    }

    String b() {
        return this.f10869b;
    }

    @Override // com.explorestack.protobuf.e1
    public MessageLite getDefaultInstance() {
        return this.f10868a;
    }

    @Override // com.explorestack.protobuf.e1
    public u1 getSyntax() {
        return (this.f10871d & 1) == 1 ? u1.PROTO2 : u1.PROTO3;
    }

    @Override // com.explorestack.protobuf.e1
    public boolean isMessageSetWireFormat() {
        return (this.f10871d & 2) == 2;
    }
}
