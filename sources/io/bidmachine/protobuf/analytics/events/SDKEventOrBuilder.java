package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.n2;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;

/* JADX INFO: loaded from: classes4.dex */
public interface SDKEventOrBuilder extends MessageOrBuilder {
    int getAction();

    StringValue getAdType();

    h2 getAdTypeOrBuilder();

    boolean getBillable();

    String getContext();

    ByteString getContextBytes();

    Struct getCustomParams();

    i2 getCustomParamsOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    Error getError();

    ErrorOrBuilder getErrorOrBuilder();

    Timestamp getFinishTime();

    n2 getFinishTimeOrBuilder();

    StringValue getNetwork();

    h2 getNetworkOrBuilder();

    double getPrice();

    Timestamp getStartTime();

    n2 getStartTimeOrBuilder();

    boolean hasAdType();

    boolean hasBillable();

    boolean hasCustomParams();

    boolean hasError();

    boolean hasFinishTime();

    boolean hasNetwork();

    boolean hasStartTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
