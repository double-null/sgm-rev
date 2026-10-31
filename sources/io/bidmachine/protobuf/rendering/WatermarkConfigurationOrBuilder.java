package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes4.dex */
public interface WatermarkConfigurationOrBuilder extends MessageOrBuilder {
    WatermarkAlgorithm getAlgorithm();

    int getAlgorithmValue();

    String getBaseColorRgb();

    ByteString getBaseColorRgbBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    WatermarkLocation getLocation();

    int getLocationValue();

    WatermarkPayloadType getPayloadType();

    int getPayloadTypeValue();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
