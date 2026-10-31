package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.i2;

/* JADX INFO: loaded from: classes4.dex */
public interface ExtrasOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    Struct getInternal();

    i2 getInternalOrBuilder();

    Struct getPrivate();

    i2 getPrivateOrBuilder();

    Struct getPublic();

    i2 getPublicOrBuilder();

    boolean hasInternal();

    boolean hasPrivate();

    boolean hasPublic();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
