package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i2;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface PlacementOrBuilder extends MessageOrBuilder {
    AdFormat getAdFormat();

    AdFormatOrBuilder getAdFormatOrBuilder();

    @Deprecated
    String getAdType();

    @Deprecated
    ByteString getAdTypeBytes();

    Struct getCustomData();

    i2 getCustomDataOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    HeaderBiddingPlacement getHbPlacement();

    HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder();

    StringValue getPlacementId();

    h2 getPlacementIdOrBuilder();

    boolean hasAdFormat();

    boolean hasCustomData();

    boolean hasHbPlacement();

    boolean hasPlacementId();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
