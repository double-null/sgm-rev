package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.y0;
import com.explorestack.protobuf.z1;
import io.bidmachine.protobuf.sdk.AssetCache;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.ConfigurationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class InitResponse extends j0 implements InitResponseOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 5;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 6;
    public static final int AD_CACHE_PLACEMENT_CONTROL_FIELD_NUMBER = 8;
    public static final int AD_NETWORKS_FIELD_NUMBER = 4;
    public static final int AD_NETWORKS_LOADING_TIMEOUT_FIELD_NUMBER = 9;
    public static final int AD_REQUEST_TMAX_FIELD_NUMBER = 7;
    public static final int ASSET_CACHE_CONFIGURATION_FIELD_NUMBER = 16;
    public static final int ENDPOINT_FIELD_NUMBER = 1;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int EXTRAS_FIELD_NUMBER = 14;
    public static final int SDK_ANALYTIC_CONFIG_FIELD_NUMBER = 10;
    public static final int SDK_ANALYTIC_CONFIG_V2_FIELD_NUMBER = 15;
    public static final int SESSION_RESET_AFTER_FIELD_NUMBER = 3;
    public static final int SHOW_WITHOUT_INTERNET_FIELD_NUMBER = 13;
    public static final int TOKEN_CONFIGURATIONS_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private y0<String, AdCachePlacementControl> adCachePlacementControl_;
    private int adNetworksLoadingTimeout_;
    private List<AdNetwork> adNetworks_;
    private int adRequestTmax_;
    private AssetCache.Configuration assetCacheConfiguration_;
    private volatile Object endpoint_;
    private AdExtension.EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private Extras extras_;
    private byte memoizedIsInitialized;
    private Configuration sdkAnalyticConfigV2_;
    private SdkAnalyticConfig sdkAnalyticConfig_;
    private int sessionResetAfter_;
    private boolean showWithoutInternet_;
    private List<TokenConfiguration> tokenConfigurations_;
    private static final InitResponse DEFAULT_INSTANCE = new InitResponse();
    private static final s1<InitResponse> PARSER = new b<InitResponse>() { // from class: io.bidmachine.protobuf.InitResponse.1
        @Override // com.explorestack.protobuf.s1
        public InitResponse parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new InitResponse(nVar, yVar);
        }
    };

    private static final class AdCachePlacementControlDefaultEntryHolder {
        static final w0<String, AdCachePlacementControl> defaultEntry = w0.s(InitProto.internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor, c3.b.f10262k, "", c3.b.f10264m, AdCachePlacementControl.getDefaultInstance());

        private AdCachePlacementControlDefaultEntryHolder() {
        }
    }

    public static InitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0<String, AdCachePlacementControl> internalGetAdCachePlacementControl() {
        y0<String, AdCachePlacementControl> y0Var = this.adCachePlacementControl_;
        return y0Var == null ? y0.h(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : y0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitResponse) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<InitResponse> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean containsAdCachePlacementControl(String str) {
        str.getClass();
        return internalGetAdCachePlacementControl().j().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitResponse)) {
            return super.equals(obj);
        }
        InitResponse initResponse = (InitResponse) obj;
        if (!getEndpoint().equals(initResponse.getEndpoint()) || !getEventList().equals(initResponse.getEventList()) || getSessionResetAfter() != initResponse.getSessionResetAfter() || !getAdNetworksList().equals(initResponse.getAdNetworksList()) || this.adCacheControl_ != initResponse.adCacheControl_ || getAdCacheMaxAge() != initResponse.getAdCacheMaxAge() || getAdRequestTmax() != initResponse.getAdRequestTmax() || !internalGetAdCachePlacementControl().equals(initResponse.internalGetAdCachePlacementControl()) || getAdNetworksLoadingTimeout() != initResponse.getAdNetworksLoadingTimeout() || hasSdkAnalyticConfig() != initResponse.hasSdkAnalyticConfig()) {
            return false;
        }
        if ((hasSdkAnalyticConfig() && !getSdkAnalyticConfig().equals(initResponse.getSdkAnalyticConfig())) || hasEventConfiguration() != initResponse.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(initResponse.getEventConfiguration())) || !getTokenConfigurationsList().equals(initResponse.getTokenConfigurationsList()) || getShowWithoutInternet() != initResponse.getShowWithoutInternet() || hasExtras() != initResponse.hasExtras()) {
            return false;
        }
        if ((hasExtras() && !getExtras().equals(initResponse.getExtras())) || hasSdkAnalyticConfigV2() != initResponse.hasSdkAnalyticConfigV2()) {
            return false;
        }
        if ((!hasSdkAnalyticConfigV2() || getSdkAnalyticConfigV2().equals(initResponse.getSdkAnalyticConfigV2())) && hasAssetCacheConfiguration() == initResponse.hasAssetCacheConfiguration()) {
            return (!hasAssetCacheConfiguration() || getAssetCacheConfiguration().equals(initResponse.getAssetCacheConfiguration())) && this.unknownFields.equals(initResponse.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    @Deprecated
    public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
        return getAdCachePlacementControlMap();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCachePlacementControlCount() {
        return internalGetAdCachePlacementControl().j().size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
        return internalGetAdCachePlacementControl().j();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
        str.getClass();
        Map<String, AdCachePlacementControl> mapJ = internalGetAdCachePlacementControl().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : adCachePlacementControl;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
        str.getClass();
        Map<String, AdCachePlacementControl> mapJ = internalGetAdCachePlacementControl().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdNetwork getAdNetworks(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<AdNetwork> getAdNetworksList() {
        return this.adNetworks_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksLoadingTimeout() {
        return this.adNetworksLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdNetworkOrBuilder getAdNetworksOrBuilder(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
        return this.adNetworks_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdRequestTmax() {
        return this.adRequestTmax_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AssetCache.Configuration getAssetCacheConfiguration() {
        AssetCache.Configuration configuration = this.assetCacheConfiguration_;
        return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AssetCache.ConfigurationOrBuilder getAssetCacheConfigurationOrBuilder() {
        return getAssetCacheConfiguration();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public String getEndpoint() {
        Object obj = this.endpoint_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.endpoint_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ByteString getEndpointBytes() {
        Object obj = this.endpoint_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.endpoint_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Ad.Event getEvent(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfiguration getEventConfiguration() {
        AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Extras getExtras() {
        Extras extras = this.extras_;
        return extras == null ? Extras.getDefaultInstance() : extras;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ExtrasOrBuilder getExtrasOrBuilder() {
        return getExtras();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<InitResponse> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfig getSdkAnalyticConfig() {
        SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
        return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
        return getSdkAnalyticConfig();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Configuration getSdkAnalyticConfigV2() {
        Configuration configuration = this.sdkAnalyticConfigV2_;
        return configuration == null ? Configuration.getDefaultInstance() : configuration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
        return getSdkAnalyticConfigV2();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getEndpointBytes().isEmpty() ? j0.computeStringSize(1, this.endpoint_) + 0 : 0;
        for (int i11 = 0; i11 < this.event_.size(); i11++) {
            iComputeStringSize += CodedOutputStream.G(2, this.event_.get(i11));
        }
        int i12 = this.sessionResetAfter_;
        if (i12 != 0) {
            iComputeStringSize += CodedOutputStream.Y(3, i12);
        }
        for (int i13 = 0; i13 < this.adNetworks_.size(); i13++) {
            iComputeStringSize += CodedOutputStream.G(4, this.adNetworks_.get(i13));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(5, this.adCacheControl_);
        }
        int i14 = this.adCacheMaxAge_;
        if (i14 != 0) {
            iComputeStringSize += CodedOutputStream.Y(6, i14);
        }
        int i15 = this.adRequestTmax_;
        if (i15 != 0) {
            iComputeStringSize += CodedOutputStream.Y(7, i15);
        }
        for (Map.Entry<String, AdCachePlacementControl> entry : internalGetAdCachePlacementControl().j().entrySet()) {
            iComputeStringSize += CodedOutputStream.G(8, AdCachePlacementControlDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
        }
        int i16 = this.adNetworksLoadingTimeout_;
        if (i16 != 0) {
            iComputeStringSize += CodedOutputStream.Y(9, i16);
        }
        if (this.sdkAnalyticConfig_ != null) {
            iComputeStringSize += CodedOutputStream.G(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            iComputeStringSize += CodedOutputStream.G(11, getEventConfiguration());
        }
        for (int i17 = 0; i17 < this.tokenConfigurations_.size(); i17++) {
            iComputeStringSize += CodedOutputStream.G(12, this.tokenConfigurations_.get(i17));
        }
        boolean z10 = this.showWithoutInternet_;
        if (z10) {
            iComputeStringSize += CodedOutputStream.e(13, z10);
        }
        if (this.extras_ != null) {
            iComputeStringSize += CodedOutputStream.G(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            iComputeStringSize += CodedOutputStream.G(15, getSdkAnalyticConfigV2());
        }
        if (this.assetCacheConfiguration_ != null) {
            iComputeStringSize += CodedOutputStream.G(16, getAssetCacheConfiguration());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getSessionResetAfter() {
        return this.sessionResetAfter_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean getShowWithoutInternet() {
        return this.showWithoutInternet_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfiguration getTokenConfigurations(int i10) {
        return this.tokenConfigurations_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getTokenConfigurationsCount() {
        return this.tokenConfigurations_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<TokenConfiguration> getTokenConfigurationsList() {
        return this.tokenConfigurations_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10) {
        return this.tokenConfigurations_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
        return this.tokenConfigurations_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasAssetCacheConfiguration() {
        return this.assetCacheConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasExtras() {
        return this.extras_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfig() {
        return this.sdkAnalyticConfig_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfigV2() {
        return this.sdkAnalyticConfigV2_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEndpoint().hashCode();
        if (getEventCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getEventList().hashCode();
        }
        int sessionResetAfter = (((iHashCode * 37) + 3) * 53) + getSessionResetAfter();
        if (getAdNetworksCount() > 0) {
            sessionResetAfter = (((sessionResetAfter * 37) + 4) * 53) + getAdNetworksList().hashCode();
        }
        int adCacheMaxAge = (((((((((((sessionResetAfter * 37) + 5) * 53) + this.adCacheControl_) * 37) + 6) * 53) + getAdCacheMaxAge()) * 37) + 7) * 53) + getAdRequestTmax();
        if (!internalGetAdCachePlacementControl().j().isEmpty()) {
            adCacheMaxAge = (((adCacheMaxAge * 37) + 8) * 53) + internalGetAdCachePlacementControl().hashCode();
        }
        int adNetworksLoadingTimeout = (((adCacheMaxAge * 37) + 9) * 53) + getAdNetworksLoadingTimeout();
        if (hasSdkAnalyticConfig()) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 10) * 53) + getSdkAnalyticConfig().hashCode();
        }
        if (hasEventConfiguration()) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 11) * 53) + getEventConfiguration().hashCode();
        }
        if (getTokenConfigurationsCount() > 0) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 12) * 53) + getTokenConfigurationsList().hashCode();
        }
        int iD = (((adNetworksLoadingTimeout * 37) + 13) * 53) + l0.d(getShowWithoutInternet());
        if (hasExtras()) {
            iD = (((iD * 37) + 14) * 53) + getExtras().hashCode();
        }
        if (hasSdkAnalyticConfigV2()) {
            iD = (((iD * 37) + 15) * 53) + getSdkAnalyticConfigV2().hashCode();
        }
        if (hasAssetCacheConfiguration()) {
            iD = (((iD * 37) + 16) * 53) + getAssetCacheConfiguration().hashCode();
        }
        int iHashCode2 = (iD * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.d(InitResponse.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.j0
    protected y0 internalGetMapField(int i10) {
        if (i10 == 8) {
            return internalGetAdCachePlacementControl();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.j0
    protected Object newInstance(j0.g gVar) {
        return new InitResponse();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getEndpointBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.endpoint_);
        }
        for (int i10 = 0; i10 < this.event_.size(); i10++) {
            codedOutputStream.L0(2, this.event_.get(i10));
        }
        int i11 = this.sessionResetAfter_;
        if (i11 != 0) {
            codedOutputStream.c1(3, i11);
        }
        for (int i12 = 0; i12 < this.adNetworks_.size(); i12++) {
            codedOutputStream.L0(4, this.adNetworks_.get(i12));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            codedOutputStream.v0(5, this.adCacheControl_);
        }
        int i13 = this.adCacheMaxAge_;
        if (i13 != 0) {
            codedOutputStream.c1(6, i13);
        }
        int i14 = this.adRequestTmax_;
        if (i14 != 0) {
            codedOutputStream.c1(7, i14);
        }
        j0.serializeStringMapTo(codedOutputStream, internalGetAdCachePlacementControl(), AdCachePlacementControlDefaultEntryHolder.defaultEntry, 8);
        int i15 = this.adNetworksLoadingTimeout_;
        if (i15 != 0) {
            codedOutputStream.c1(9, i15);
        }
        if (this.sdkAnalyticConfig_ != null) {
            codedOutputStream.L0(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            codedOutputStream.L0(11, getEventConfiguration());
        }
        for (int i16 = 0; i16 < this.tokenConfigurations_.size(); i16++) {
            codedOutputStream.L0(12, this.tokenConfigurations_.get(i16));
        }
        boolean z10 = this.showWithoutInternet_;
        if (z10) {
            codedOutputStream.n0(13, z10);
        }
        if (this.extras_ != null) {
            codedOutputStream.L0(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            codedOutputStream.L0(15, getSdkAnalyticConfigV2());
        }
        if (this.assetCacheConfiguration_ != null) {
            codedOutputStream.L0(16, getAssetCacheConfiguration());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements InitResponseOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private y0<String, AdCachePlacementControl> adCachePlacementControl_;
        private z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> adNetworksBuilder_;
        private int adNetworksLoadingTimeout_;
        private List<AdNetwork> adNetworks_;
        private int adRequestTmax_;
        private e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> assetCacheConfigurationBuilder_;
        private AssetCache.Configuration assetCacheConfiguration_;
        private int bitField0_;
        private Object endpoint_;
        private z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> eventBuilder_;
        private e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> eventConfigurationBuilder_;
        private AdExtension.EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private e2<Extras, Extras.Builder, ExtrasOrBuilder> extrasBuilder_;
        private Extras extras_;
        private e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> sdkAnalyticConfigBuilder_;
        private e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> sdkAnalyticConfigV2Builder_;
        private Configuration sdkAnalyticConfigV2_;
        private SdkAnalyticConfig sdkAnalyticConfig_;
        private int sessionResetAfter_;
        private boolean showWithoutInternet_;
        private z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> tokenConfigurationsBuilder_;
        private List<TokenConfiguration> tokenConfigurations_;

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adNetworks_ = new ArrayList(this.adNetworks_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureTokenConfigurationsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.tokenConfigurations_ = new ArrayList(this.tokenConfigurations_);
                this.bitField0_ |= 8;
            }
        }

        private z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> getAdNetworksFieldBuilder() {
            if (this.adNetworksBuilder_ == null) {
                this.adNetworksBuilder_ = new z1<>(this.adNetworks_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adNetworks_ = null;
            }
            return this.adNetworksBuilder_;
        }

        private e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> getAssetCacheConfigurationFieldBuilder() {
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfigurationBuilder_ = new e2<>(getAssetCacheConfiguration(), getParentForChildren(), isClean());
                this.assetCacheConfiguration_ = null;
            }
            return this.assetCacheConfigurationBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        private e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new e2<>(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new z1<>(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private e2<Extras, Extras.Builder, ExtrasOrBuilder> getExtrasFieldBuilder() {
            if (this.extrasBuilder_ == null) {
                this.extrasBuilder_ = new e2<>(getExtras(), getParentForChildren(), isClean());
                this.extras_ = null;
            }
            return this.extrasBuilder_;
        }

        private e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> getSdkAnalyticConfigFieldBuilder() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfigBuilder_ = new e2<>(getSdkAnalyticConfig(), getParentForChildren(), isClean());
                this.sdkAnalyticConfig_ = null;
            }
            return this.sdkAnalyticConfigBuilder_;
        }

        private e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> getSdkAnalyticConfigV2FieldBuilder() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2Builder_ = new e2<>(getSdkAnalyticConfigV2(), getParentForChildren(), isClean());
                this.sdkAnalyticConfigV2_ = null;
            }
            return this.sdkAnalyticConfigV2Builder_;
        }

        private z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> getTokenConfigurationsFieldBuilder() {
            if (this.tokenConfigurationsBuilder_ == null) {
                this.tokenConfigurationsBuilder_ = new z1<>(this.tokenConfigurations_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.tokenConfigurations_ = null;
            }
            return this.tokenConfigurationsBuilder_;
        }

        private y0<String, AdCachePlacementControl> internalGetAdCachePlacementControl() {
            y0<String, AdCachePlacementControl> y0Var = this.adCachePlacementControl_;
            return y0Var == null ? y0.h(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : y0Var;
        }

        private y0<String, AdCachePlacementControl> internalGetMutableAdCachePlacementControl() {
            onChanged();
            if (this.adCachePlacementControl_ == null) {
                this.adCachePlacementControl_ = y0.q(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
            }
            if (!this.adCachePlacementControl_.n()) {
                this.adCachePlacementControl_ = this.adCachePlacementControl_.g();
            }
            return this.adCachePlacementControl_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
                getAdNetworksFieldBuilder();
                getTokenConfigurationsFieldBuilder();
            }
        }

        public Builder addAdNetworks(AdNetwork adNetwork) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(adNetwork);
                onChanged();
            } else {
                z1Var.e(adNetwork);
            }
            return this;
        }

        public AdNetwork.Builder addAdNetworksBuilder() {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().c(AdNetwork.getDefaultInstance());
        }

        public Builder addAllAdNetworks(Iterable<? extends AdNetwork> iterable) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                ensureAdNetworksIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.adNetworks_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.event_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addAllTokenConfigurations(Iterable<? extends TokenConfiguration> iterable) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                ensureTokenConfigurationsIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.tokenConfigurations_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
            } else {
                z1Var.e(event);
            }
            return this;
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().c(Ad.Event.getDefaultInstance());
        }

        public Builder addTokenConfigurations(TokenConfiguration tokenConfiguration) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(tokenConfiguration);
                onChanged();
            } else {
                z1Var.e(tokenConfiguration);
            }
            return this;
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder() {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().c(TokenConfiguration.getDefaultInstance());
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCachePlacementControl() {
            internalGetMutableAdCachePlacementControl().m().clear();
            return this;
        }

        public Builder clearAdNetworks() {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                this.adNetworks_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearAdNetworksLoadingTimeout() {
            this.adNetworksLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdRequestTmax() {
            this.adRequestTmax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAssetCacheConfiguration() {
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfiguration_ = null;
                onChanged();
            } else {
                this.assetCacheConfiguration_ = null;
                this.assetCacheConfigurationBuilder_ = null;
            }
            return this;
        }

        public Builder clearEndpoint() {
            this.endpoint_ = InitResponse.getDefaultInstance().getEndpoint();
            onChanged();
            return this;
        }

        public Builder clearEvent() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            return this;
        }

        public Builder clearExtras() {
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
                onChanged();
            } else {
                this.extras_ = null;
                this.extrasBuilder_ = null;
            }
            return this;
        }

        public Builder clearSdkAnalyticConfig() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
                onChanged();
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            return this;
        }

        public Builder clearSdkAnalyticConfigV2() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
                onChanged();
            } else {
                this.sdkAnalyticConfigV2_ = null;
                this.sdkAnalyticConfigV2Builder_ = null;
            }
            return this;
        }

        public Builder clearSessionResetAfter() {
            this.sessionResetAfter_ = 0;
            onChanged();
            return this;
        }

        public Builder clearShowWithoutInternet() {
            this.showWithoutInternet_ = false;
            onChanged();
            return this;
        }

        public Builder clearTokenConfigurations() {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                this.tokenConfigurations_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean containsAdCachePlacementControl(String str) {
            str.getClass();
            return internalGetAdCachePlacementControl().j().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        @Deprecated
        public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
            return getAdCachePlacementControlMap();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCachePlacementControlCount() {
            return internalGetAdCachePlacementControl().j().size();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
            return internalGetAdCachePlacementControl().j();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            Map<String, AdCachePlacementControl> mapJ = internalGetAdCachePlacementControl().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : adCachePlacementControl;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
            str.getClass();
            Map<String, AdCachePlacementControl> mapJ = internalGetAdCachePlacementControl().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdNetwork getAdNetworks(int i10) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            return z1Var == null ? this.adNetworks_.get(i10) : (AdNetwork) z1Var.n(i10);
        }

        public AdNetwork.Builder getAdNetworksBuilder(int i10) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().k(i10);
        }

        public List<AdNetwork.Builder> getAdNetworksBuilderList() {
            return getAdNetworksFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksCount() {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            return z1Var == null ? this.adNetworks_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<AdNetwork> getAdNetworksList() {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.adNetworks_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksLoadingTimeout() {
            return this.adNetworksLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdNetworkOrBuilder getAdNetworksOrBuilder(int i10) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            return z1Var == null ? this.adNetworks_.get(i10) : (AdNetworkOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.adNetworks_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdRequestTmax() {
            return this.adRequestTmax_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AssetCache.Configuration getAssetCacheConfiguration() {
            e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> e2Var = this.assetCacheConfigurationBuilder_;
            if (e2Var != null) {
                return (AssetCache.Configuration) e2Var.e();
            }
            AssetCache.Configuration configuration = this.assetCacheConfiguration_;
            return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
        }

        public AssetCache.Configuration.Builder getAssetCacheConfigurationBuilder() {
            onChanged();
            return (AssetCache.Configuration.Builder) getAssetCacheConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AssetCache.ConfigurationOrBuilder getAssetCacheConfigurationOrBuilder() {
            e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> e2Var = this.assetCacheConfigurationBuilder_;
            if (e2Var != null) {
                return (AssetCache.ConfigurationOrBuilder) e2Var.f();
            }
            AssetCache.Configuration configuration = this.assetCacheConfiguration_;
            return configuration == null ? AssetCache.Configuration.getDefaultInstance() : configuration;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public String getEndpoint() {
            Object obj = this.endpoint_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.endpoint_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ByteString getEndpointBytes() {
            Object obj = this.endpoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.endpoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Ad.Event getEvent(int i10) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? this.event_.get(i10) : (Ad.Event) z1Var.n(i10);
        }

        public Ad.Event.Builder getEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().k(i10);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfiguration getEventConfiguration() {
            e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var != null) {
                return (AdExtension.EventConfiguration) e2Var.e();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        public AdExtension.EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (AdExtension.EventConfiguration.Builder) getEventConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var != null) {
                return (AdExtension.EventConfigurationOrBuilder) e2Var.f();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getEventCount() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? this.event_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<Ad.Event> getEventList() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.event_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i10) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? this.event_.get(i10) : (Ad.EventOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.event_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Extras getExtras() {
            e2<Extras, Extras.Builder, ExtrasOrBuilder> e2Var = this.extrasBuilder_;
            if (e2Var != null) {
                return (Extras) e2Var.e();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        public Extras.Builder getExtrasBuilder() {
            onChanged();
            return (Extras.Builder) getExtrasFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ExtrasOrBuilder getExtrasOrBuilder() {
            e2<Extras, Extras.Builder, ExtrasOrBuilder> e2Var = this.extrasBuilder_;
            if (e2Var != null) {
                return (ExtrasOrBuilder) e2Var.f();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        @Deprecated
        public Map<String, AdCachePlacementControl> getMutableAdCachePlacementControl() {
            return internalGetMutableAdCachePlacementControl().m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfig getSdkAnalyticConfig() {
            e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> e2Var = this.sdkAnalyticConfigBuilder_;
            if (e2Var != null) {
                return (SdkAnalyticConfig) e2Var.e();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        public SdkAnalyticConfig.Builder getSdkAnalyticConfigBuilder() {
            onChanged();
            return (SdkAnalyticConfig.Builder) getSdkAnalyticConfigFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
            e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> e2Var = this.sdkAnalyticConfigBuilder_;
            if (e2Var != null) {
                return (SdkAnalyticConfigOrBuilder) e2Var.f();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Configuration getSdkAnalyticConfigV2() {
            e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> e2Var = this.sdkAnalyticConfigV2Builder_;
            if (e2Var != null) {
                return (Configuration) e2Var.e();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        public Configuration.Builder getSdkAnalyticConfigV2Builder() {
            onChanged();
            return (Configuration.Builder) getSdkAnalyticConfigV2FieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
            e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> e2Var = this.sdkAnalyticConfigV2Builder_;
            if (e2Var != null) {
                return (ConfigurationOrBuilder) e2Var.f();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getSessionResetAfter() {
            return this.sessionResetAfter_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean getShowWithoutInternet() {
            return this.showWithoutInternet_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfiguration getTokenConfigurations(int i10) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            return z1Var == null ? this.tokenConfigurations_.get(i10) : (TokenConfiguration) z1Var.n(i10);
        }

        public TokenConfiguration.Builder getTokenConfigurationsBuilder(int i10) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().k(i10);
        }

        public List<TokenConfiguration.Builder> getTokenConfigurationsBuilderList() {
            return getTokenConfigurationsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getTokenConfigurationsCount() {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            return z1Var == null ? this.tokenConfigurations_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<TokenConfiguration> getTokenConfigurationsList() {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.tokenConfigurations_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            return z1Var == null ? this.tokenConfigurations_.get(i10) : (TokenConfigurationOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.tokenConfigurations_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasAssetCacheConfiguration() {
            return (this.assetCacheConfigurationBuilder_ == null && this.assetCacheConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasExtras() {
            return (this.extrasBuilder_ == null && this.extras_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfig() {
            return (this.sdkAnalyticConfigBuilder_ == null && this.sdkAnalyticConfig_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfigV2() {
            return (this.sdkAnalyticConfigV2Builder_ == null && this.sdkAnalyticConfigV2_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.d(InitResponse.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMapField(int i10) {
            if (i10 == 8) {
                return internalGetAdCachePlacementControl();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMutableMapField(int i10) {
            if (i10 == 8) {
                return internalGetMutableAdCachePlacementControl();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAssetCacheConfiguration(AssetCache.Configuration configuration) {
            e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> e2Var = this.assetCacheConfigurationBuilder_;
            if (e2Var == null) {
                AssetCache.Configuration configuration2 = this.assetCacheConfiguration_;
                if (configuration2 != null) {
                    this.assetCacheConfiguration_ = AssetCache.Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
                } else {
                    this.assetCacheConfiguration_ = configuration;
                }
                onChanged();
            } else {
                e2Var.g(configuration);
            }
            return this;
        }

        public Builder mergeEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var == null) {
                AdExtension.EventConfiguration eventConfiguration2 = this.eventConfiguration_;
                if (eventConfiguration2 != null) {
                    this.eventConfiguration_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
                } else {
                    this.eventConfiguration_ = eventConfiguration;
                }
                onChanged();
            } else {
                e2Var.g(eventConfiguration);
            }
            return this;
        }

        public Builder mergeExtras(Extras extras) {
            e2<Extras, Extras.Builder, ExtrasOrBuilder> e2Var = this.extrasBuilder_;
            if (e2Var == null) {
                Extras extras2 = this.extras_;
                if (extras2 != null) {
                    this.extras_ = Extras.newBuilder(extras2).mergeFrom(extras).buildPartial();
                } else {
                    this.extras_ = extras;
                }
                onChanged();
            } else {
                e2Var.g(extras);
            }
            return this;
        }

        public Builder mergeSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> e2Var = this.sdkAnalyticConfigBuilder_;
            if (e2Var == null) {
                SdkAnalyticConfig sdkAnalyticConfig2 = this.sdkAnalyticConfig_;
                if (sdkAnalyticConfig2 != null) {
                    this.sdkAnalyticConfig_ = SdkAnalyticConfig.newBuilder(sdkAnalyticConfig2).mergeFrom(sdkAnalyticConfig).buildPartial();
                } else {
                    this.sdkAnalyticConfig_ = sdkAnalyticConfig;
                }
                onChanged();
            } else {
                e2Var.g(sdkAnalyticConfig);
            }
            return this;
        }

        public Builder mergeSdkAnalyticConfigV2(Configuration configuration) {
            e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> e2Var = this.sdkAnalyticConfigV2Builder_;
            if (e2Var == null) {
                Configuration configuration2 = this.sdkAnalyticConfigV2_;
                if (configuration2 != null) {
                    this.sdkAnalyticConfigV2_ = Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
                } else {
                    this.sdkAnalyticConfigV2_ = configuration;
                }
                onChanged();
            } else {
                e2Var.g(configuration);
            }
            return this;
        }

        public Builder putAdCachePlacementControl(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            adCachePlacementControl.getClass();
            internalGetMutableAdCachePlacementControl().m().put(str, adCachePlacementControl);
            return this;
        }

        public Builder putAllAdCachePlacementControl(Map<String, AdCachePlacementControl> map) {
            internalGetMutableAdCachePlacementControl().m().putAll(map);
            return this;
        }

        public Builder removeAdCachePlacementControl(String str) {
            str.getClass();
            internalGetMutableAdCachePlacementControl().m().remove(str);
            return this;
        }

        public Builder removeAdNetworks(int i10) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder removeEvent(int i10) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder removeTokenConfigurations(int i10) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setAdCacheControlValue(int i10) {
            this.adCacheControl_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i10) {
            this.adCacheMaxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdNetworks(int i10, AdNetwork adNetwork) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i10, adNetwork);
                onChanged();
            } else {
                z1Var.w(i10, adNetwork);
            }
            return this;
        }

        public Builder setAdNetworksLoadingTimeout(int i10) {
            this.adNetworksLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdRequestTmax(int i10) {
            this.adRequestTmax_ = i10;
            onChanged();
            return this;
        }

        public Builder setAssetCacheConfiguration(AssetCache.Configuration configuration) {
            e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> e2Var = this.assetCacheConfigurationBuilder_;
            if (e2Var == null) {
                configuration.getClass();
                this.assetCacheConfiguration_ = configuration;
                onChanged();
            } else {
                e2Var.i(configuration);
            }
            return this;
        }

        public Builder setEndpoint(String str) {
            str.getClass();
            this.endpoint_ = str;
            onChanged();
            return this;
        }

        public Builder setEndpointBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.endpoint_ = byteString;
            onChanged();
            return this;
        }

        public Builder setEvent(int i10, Ad.Event event) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, event);
                onChanged();
            } else {
                z1Var.w(i10, event);
            }
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var == null) {
                eventConfiguration.getClass();
                this.eventConfiguration_ = eventConfiguration;
                onChanged();
            } else {
                e2Var.i(eventConfiguration);
            }
            return this;
        }

        public Builder setExtras(Extras extras) {
            e2<Extras, Extras.Builder, ExtrasOrBuilder> e2Var = this.extrasBuilder_;
            if (e2Var == null) {
                extras.getClass();
                this.extras_ = extras;
                onChanged();
            } else {
                e2Var.i(extras);
            }
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> e2Var = this.sdkAnalyticConfigBuilder_;
            if (e2Var == null) {
                sdkAnalyticConfig.getClass();
                this.sdkAnalyticConfig_ = sdkAnalyticConfig;
                onChanged();
            } else {
                e2Var.i(sdkAnalyticConfig);
            }
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration configuration) {
            e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> e2Var = this.sdkAnalyticConfigV2Builder_;
            if (e2Var == null) {
                configuration.getClass();
                this.sdkAnalyticConfigV2_ = configuration;
                onChanged();
            } else {
                e2Var.i(configuration);
            }
            return this;
        }

        public Builder setSessionResetAfter(int i10) {
            this.sessionResetAfter_ = i10;
            onChanged();
            return this;
        }

        public Builder setShowWithoutInternet(boolean z10) {
            this.showWithoutInternet_ = z10;
            onChanged();
            return this;
        }

        public Builder setTokenConfigurations(int i10, TokenConfiguration tokenConfiguration) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.set(i10, tokenConfiguration);
                onChanged();
            } else {
                z1Var.w(i10, tokenConfiguration);
            }
            return this;
        }

        private Builder() {
            this.endpoint_ = "";
            this.event_ = Collections.emptyList();
            this.adNetworks_ = Collections.emptyList();
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse build() {
            InitResponse initResponseBuildPartial = buildPartial();
            if (initResponseBuildPartial.isInitialized()) {
                return initResponseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initResponseBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse buildPartial() {
            InitResponse initResponse = new InitResponse(this);
            initResponse.endpoint_ = this.endpoint_;
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var != null) {
                initResponse.event_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                initResponse.event_ = this.event_;
            }
            initResponse.sessionResetAfter_ = this.sessionResetAfter_;
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var2 = this.adNetworksBuilder_;
            if (z1Var2 != null) {
                initResponse.adNetworks_ = z1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                    this.bitField0_ &= -3;
                }
                initResponse.adNetworks_ = this.adNetworks_;
            }
            initResponse.adCacheControl_ = this.adCacheControl_;
            initResponse.adCacheMaxAge_ = this.adCacheMaxAge_;
            initResponse.adRequestTmax_ = this.adRequestTmax_;
            initResponse.adCachePlacementControl_ = internalGetAdCachePlacementControl();
            initResponse.adCachePlacementControl_.o();
            initResponse.adNetworksLoadingTimeout_ = this.adNetworksLoadingTimeout_;
            e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> e2Var = this.sdkAnalyticConfigBuilder_;
            if (e2Var == null) {
                initResponse.sdkAnalyticConfig_ = this.sdkAnalyticConfig_;
            } else {
                initResponse.sdkAnalyticConfig_ = (SdkAnalyticConfig) e2Var.a();
            }
            e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> e2Var2 = this.eventConfigurationBuilder_;
            if (e2Var2 == null) {
                initResponse.eventConfiguration_ = this.eventConfiguration_;
            } else {
                initResponse.eventConfiguration_ = (AdExtension.EventConfiguration) e2Var2.a();
            }
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var3 = this.tokenConfigurationsBuilder_;
            if (z1Var3 != null) {
                initResponse.tokenConfigurations_ = z1Var3.f();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
                    this.bitField0_ &= -9;
                }
                initResponse.tokenConfigurations_ = this.tokenConfigurations_;
            }
            initResponse.showWithoutInternet_ = this.showWithoutInternet_;
            e2<Extras, Extras.Builder, ExtrasOrBuilder> e2Var3 = this.extrasBuilder_;
            if (e2Var3 == null) {
                initResponse.extras_ = this.extras_;
            } else {
                initResponse.extras_ = (Extras) e2Var3.a();
            }
            e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> e2Var4 = this.sdkAnalyticConfigV2Builder_;
            if (e2Var4 == null) {
                initResponse.sdkAnalyticConfigV2_ = this.sdkAnalyticConfigV2_;
            } else {
                initResponse.sdkAnalyticConfigV2_ = (Configuration) e2Var4.a();
            }
            e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> e2Var5 = this.assetCacheConfigurationBuilder_;
            if (e2Var5 == null) {
                initResponse.assetCacheConfiguration_ = this.assetCacheConfiguration_;
            } else {
                initResponse.assetCacheConfiguration_ = (AssetCache.Configuration) e2Var5.a();
            }
            onBuilt();
            return initResponse;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public InitResponse mo164getDefaultInstanceForType() {
            return InitResponse.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(u2 u2Var) {
            return (Builder) super.setUnknownFields(u2Var);
        }

        public AdNetwork.Builder addAdNetworksBuilder(int i10) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().b(i10, AdNetwork.getDefaultInstance());
        }

        public Ad.Event.Builder addEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().b(i10, Ad.Event.getDefaultInstance());
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder(int i10) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().b(i10, TokenConfiguration.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(u2 u2Var) {
            return (Builder) super.mergeUnknownFields(u2Var);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.endpoint_ = "";
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            this.sessionResetAfter_ = 0;
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var2 = this.adNetworksBuilder_;
            if (z1Var2 == null) {
                this.adNetworks_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                z1Var2.g();
            }
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.adRequestTmax_ = 0;
            internalGetMutableAdCachePlacementControl().b();
            this.adNetworksLoadingTimeout_ = 0;
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var3 = this.tokenConfigurationsBuilder_;
            if (z1Var3 == null) {
                this.tokenConfigurations_ = Collections.emptyList();
                this.bitField0_ &= -9;
            } else {
                z1Var3.g();
            }
            this.showWithoutInternet_ = false;
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
            } else {
                this.extras_ = null;
                this.extrasBuilder_ = null;
            }
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
            } else {
                this.sdkAnalyticConfigV2_ = null;
                this.sdkAnalyticConfigV2Builder_ = null;
            }
            if (this.assetCacheConfigurationBuilder_ == null) {
                this.assetCacheConfiguration_ = null;
            } else {
                this.assetCacheConfiguration_ = null;
                this.assetCacheConfigurationBuilder_ = null;
            }
            return this;
        }

        public Builder setAssetCacheConfiguration(AssetCache.Configuration.Builder builder) {
            e2<AssetCache.Configuration, AssetCache.Configuration.Builder, AssetCache.ConfigurationOrBuilder> e2Var = this.assetCacheConfigurationBuilder_;
            if (e2Var == null) {
                this.assetCacheConfiguration_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration.Builder builder) {
            e2<AdExtension.EventConfiguration, AdExtension.EventConfiguration.Builder, AdExtension.EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var == null) {
                this.eventConfiguration_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setExtras(Extras.Builder builder) {
            e2<Extras, Extras.Builder, ExtrasOrBuilder> e2Var = this.extrasBuilder_;
            if (e2Var == null) {
                this.extras_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig.Builder builder) {
            e2<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> e2Var = this.sdkAnalyticConfigBuilder_;
            if (e2Var == null) {
                this.sdkAnalyticConfig_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration.Builder builder) {
            e2<Configuration, Configuration.Builder, ConfigurationOrBuilder> e2Var = this.sdkAnalyticConfigV2Builder_;
            if (e2Var == null) {
                this.sdkAnalyticConfigV2_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder addAdNetworks(int i10, AdNetwork adNetwork) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i10, adNetwork);
                onChanged();
            } else {
                z1Var.d(i10, adNetwork);
            }
            return this;
        }

        public Builder addEvent(int i10, Ad.Event event) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i10, event);
                onChanged();
            } else {
                z1Var.d(i10, event);
            }
            return this;
        }

        public Builder addTokenConfigurations(int i10, TokenConfiguration tokenConfiguration) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i10, tokenConfiguration);
                onChanged();
            } else {
                z1Var.d(i10, tokenConfiguration);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InitResponse) {
                return mergeFrom((InitResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdNetworks(int i10, AdNetwork.Builder builder) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder setEvent(int i10, Ad.Event.Builder builder) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder setTokenConfigurations(int i10, TokenConfiguration.Builder builder) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.endpoint_ = "";
            this.event_ = Collections.emptyList();
            this.adNetworks_ = Collections.emptyList();
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(InitResponse initResponse) {
            if (initResponse == InitResponse.getDefaultInstance()) {
                return this;
            }
            if (!initResponse.getEndpoint().isEmpty()) {
                this.endpoint_ = initResponse.endpoint_;
                onChanged();
            }
            if (this.eventBuilder_ == null) {
                if (!initResponse.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = initResponse.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(initResponse.event_);
                    }
                    onChanged();
                }
            } else if (!initResponse.event_.isEmpty()) {
                if (!this.eventBuilder_.t()) {
                    this.eventBuilder_.a(initResponse.event_);
                } else {
                    this.eventBuilder_.h();
                    this.eventBuilder_ = null;
                    this.event_ = initResponse.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = j0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                }
            }
            if (initResponse.getSessionResetAfter() != 0) {
                setSessionResetAfter(initResponse.getSessionResetAfter());
            }
            if (this.adNetworksBuilder_ == null) {
                if (!initResponse.adNetworks_.isEmpty()) {
                    if (this.adNetworks_.isEmpty()) {
                        this.adNetworks_ = initResponse.adNetworks_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdNetworksIsMutable();
                        this.adNetworks_.addAll(initResponse.adNetworks_);
                    }
                    onChanged();
                }
            } else if (!initResponse.adNetworks_.isEmpty()) {
                if (!this.adNetworksBuilder_.t()) {
                    this.adNetworksBuilder_.a(initResponse.adNetworks_);
                } else {
                    this.adNetworksBuilder_.h();
                    this.adNetworksBuilder_ = null;
                    this.adNetworks_ = initResponse.adNetworks_;
                    this.bitField0_ &= -3;
                    this.adNetworksBuilder_ = j0.alwaysUseFieldBuilders ? getAdNetworksFieldBuilder() : null;
                }
            }
            if (initResponse.adCacheControl_ != 0) {
                setAdCacheControlValue(initResponse.getAdCacheControlValue());
            }
            if (initResponse.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(initResponse.getAdCacheMaxAge());
            }
            if (initResponse.getAdRequestTmax() != 0) {
                setAdRequestTmax(initResponse.getAdRequestTmax());
            }
            internalGetMutableAdCachePlacementControl().p(initResponse.internalGetAdCachePlacementControl());
            if (initResponse.getAdNetworksLoadingTimeout() != 0) {
                setAdNetworksLoadingTimeout(initResponse.getAdNetworksLoadingTimeout());
            }
            if (initResponse.hasSdkAnalyticConfig()) {
                mergeSdkAnalyticConfig(initResponse.getSdkAnalyticConfig());
            }
            if (initResponse.hasEventConfiguration()) {
                mergeEventConfiguration(initResponse.getEventConfiguration());
            }
            if (this.tokenConfigurationsBuilder_ == null) {
                if (!initResponse.tokenConfigurations_.isEmpty()) {
                    if (this.tokenConfigurations_.isEmpty()) {
                        this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTokenConfigurationsIsMutable();
                        this.tokenConfigurations_.addAll(initResponse.tokenConfigurations_);
                    }
                    onChanged();
                }
            } else if (!initResponse.tokenConfigurations_.isEmpty()) {
                if (!this.tokenConfigurationsBuilder_.t()) {
                    this.tokenConfigurationsBuilder_.a(initResponse.tokenConfigurations_);
                } else {
                    this.tokenConfigurationsBuilder_.h();
                    this.tokenConfigurationsBuilder_ = null;
                    this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                    this.bitField0_ &= -9;
                    this.tokenConfigurationsBuilder_ = j0.alwaysUseFieldBuilders ? getTokenConfigurationsFieldBuilder() : null;
                }
            }
            if (initResponse.getShowWithoutInternet()) {
                setShowWithoutInternet(initResponse.getShowWithoutInternet());
            }
            if (initResponse.hasExtras()) {
                mergeExtras(initResponse.getExtras());
            }
            if (initResponse.hasSdkAnalyticConfigV2()) {
                mergeSdkAnalyticConfigV2(initResponse.getSdkAnalyticConfigV2());
            }
            if (initResponse.hasAssetCacheConfiguration()) {
                mergeAssetCacheConfiguration(initResponse.getAssetCacheConfiguration());
            }
            mergeUnknownFields(((j0) initResponse).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdNetworks(AdNetwork.Builder builder) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addTokenConfigurations(TokenConfiguration.Builder builder) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addAdNetworks(int i10, AdNetwork.Builder builder) {
            z1<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> z1Var = this.adNetworksBuilder_;
            if (z1Var == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        public Builder addEvent(int i10, Ad.Event.Builder builder) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        public Builder addTokenConfigurations(int i10, TokenConfiguration.Builder builder) {
            z1<TokenConfiguration, TokenConfiguration.Builder, TokenConfigurationOrBuilder> z1Var = this.tokenConfigurationsBuilder_;
            if (z1Var == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            InitResponse initResponse = null;
            try {
                try {
                    InitResponse initResponse2 = (InitResponse) InitResponse.PARSER.parsePartialFrom(nVar, yVar);
                    if (initResponse2 != null) {
                        mergeFrom(initResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    InitResponse initResponse3 = (InitResponse) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        initResponse = initResponse3;
                        if (initResponse != null) {
                            mergeFrom(initResponse);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (initResponse != null) {
                    mergeFrom(initResponse);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(InitResponse initResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initResponse);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private InitResponse(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (InitResponse) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static InitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public InitResponse mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InitResponse parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private InitResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.endpoint_ = "";
        this.event_ = Collections.emptyList();
        this.adNetworks_ = Collections.emptyList();
        this.adCacheControl_ = 0;
        this.tokenConfigurations_ = Collections.emptyList();
    }

    public static InitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static InitResponse parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static InitResponse parseFrom(InputStream inputStream) throws IOException {
        return (InitResponse) j0.parseWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (InitResponse) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static InitResponse parseFrom(n nVar) throws IOException {
        return (InitResponse) j0.parseWithIOException(PARSER, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitResponse(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    switch (iK) {
                        case 0:
                            break;
                        case 10:
                            this.endpoint_ = nVar.J();
                            continue;
                        case 18:
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.event_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.event_.add((Ad.Event) nVar.A(Ad.Event.parser(), yVar));
                            continue;
                        case 24:
                            this.sessionResetAfter_ = nVar.L();
                            continue;
                        case 34:
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.adNetworks_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.adNetworks_.add((AdNetwork) nVar.A(AdNetwork.parser(), yVar));
                            continue;
                        case 40:
                            this.adCacheControl_ = nVar.t();
                            continue;
                        case 48:
                            this.adCacheMaxAge_ = nVar.L();
                            continue;
                        case 56:
                            this.adRequestTmax_ = nVar.L();
                            continue;
                        case 66:
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.adCachePlacementControl_ = y0.q(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            w0 w0Var = (w0) nVar.A(AdCachePlacementControlDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                            this.adCachePlacementControl_.m().put(w0Var.h(), w0Var.n());
                            continue;
                        case 72:
                            this.adNetworksLoadingTimeout_ = nVar.L();
                            continue;
                        case 82:
                            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
                            SdkAnalyticConfig.Builder builder = sdkAnalyticConfig != null ? sdkAnalyticConfig.toBuilder() : null;
                            SdkAnalyticConfig sdkAnalyticConfig2 = (SdkAnalyticConfig) nVar.A(SdkAnalyticConfig.parser(), yVar);
                            this.sdkAnalyticConfig_ = sdkAnalyticConfig2;
                            if (builder != null) {
                                builder.mergeFrom(sdkAnalyticConfig2);
                                this.sdkAnalyticConfig_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 90:
                            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
                            AdExtension.EventConfiguration.Builder builder2 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                            AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) nVar.A(AdExtension.EventConfiguration.parser(), yVar);
                            this.eventConfiguration_ = eventConfiguration2;
                            if (builder2 != null) {
                                builder2.mergeFrom(eventConfiguration2);
                                this.eventConfiguration_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 98:
                            int i14 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i14 == 0) {
                                this.tokenConfigurations_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.tokenConfigurations_.add((TokenConfiguration) nVar.A(TokenConfiguration.parser(), yVar));
                            continue;
                        case 104:
                            this.showWithoutInternet_ = nVar.q();
                            continue;
                        case 114:
                            Extras extras = this.extras_;
                            Extras.Builder builder3 = extras != null ? extras.toBuilder() : null;
                            Extras extras2 = (Extras) nVar.A(Extras.parser(), yVar);
                            this.extras_ = extras2;
                            if (builder3 != null) {
                                builder3.mergeFrom(extras2);
                                this.extras_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 122:
                            Configuration configuration = this.sdkAnalyticConfigV2_;
                            Configuration.Builder builder4 = configuration != null ? configuration.toBuilder() : null;
                            Configuration configuration2 = (Configuration) nVar.A(Configuration.parser(), yVar);
                            this.sdkAnalyticConfigV2_ = configuration2;
                            if (builder4 != null) {
                                builder4.mergeFrom(configuration2);
                                this.sdkAnalyticConfigV2_ = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                            AssetCache.Configuration configuration3 = this.assetCacheConfiguration_;
                            AssetCache.Configuration.Builder builder5 = configuration3 != null ? configuration3.toBuilder() : null;
                            AssetCache.Configuration configuration4 = (AssetCache.Configuration) nVar.A(AssetCache.Configuration.parser(), yVar);
                            this.assetCacheConfiguration_ = configuration4;
                            if (builder5 != null) {
                                builder5.mergeFrom(configuration4);
                                this.assetCacheConfiguration_ = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        default:
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.event_ = Collections.unmodifiableList(this.event_);
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static InitResponse parseFrom(n nVar, y yVar) throws IOException {
        return (InitResponse) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
