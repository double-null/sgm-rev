package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Placement extends j0 implements PlacementOrBuilder {
    public static final int AD_FORMAT_FIELD_NUMBER = 5;
    public static final int AD_TYPE_FIELD_NUMBER = 1;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 3;
    public static final int HB_PLACEMENT_FIELD_NUMBER = 4;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private AdFormat adFormat_;
    private volatile Object adType_;
    private Struct customData_;
    private HeaderBiddingPlacement hbPlacement_;
    private byte memoizedIsInitialized;
    private StringValue placementId_;
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final s1<Placement> PARSER = new b<Placement>() { // from class: io.bidmachine.protobuf.sdk.Placement.1
        @Override // com.explorestack.protobuf.s1
        public Placement parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Placement(nVar, yVar);
        }
    };

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Placement> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getAdType().equals(placement.getAdType()) || hasPlacementId() != placement.hasPlacementId()) {
            return false;
        }
        if ((hasPlacementId() && !getPlacementId().equals(placement.getPlacementId())) || hasCustomData() != placement.hasCustomData()) {
            return false;
        }
        if ((hasCustomData() && !getCustomData().equals(placement.getCustomData())) || hasHbPlacement() != placement.hasHbPlacement()) {
            return false;
        }
        if ((!hasHbPlacement() || getHbPlacement().equals(placement.getHbPlacement())) && hasAdFormat() == placement.hasAdFormat()) {
            return (!hasAdFormat() || getAdFormat().equals(placement.getAdFormat())) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.adFormat_;
        return adFormat == null ? AdFormat.getDefaultInstance() : adFormat;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public AdFormatOrBuilder getAdFormatOrBuilder() {
        return getAdFormat();
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    @Deprecated
    public String getAdType() {
        Object obj = this.adType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    @Deprecated
    public ByteString getAdTypeBytes() {
        Object obj = this.adType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public Struct getCustomData() {
        Struct struct = this.customData_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public i2 getCustomDataOrBuilder() {
        return getCustomData();
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public HeaderBiddingPlacement getHbPlacement() {
        HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
        return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
        return getHbPlacement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Placement> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public StringValue getPlacementId() {
        StringValue stringValue = this.placementId_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public h2 getPlacementIdOrBuilder() {
        return getPlacementId();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getAdTypeBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.adType_);
        if (this.placementId_ != null) {
            iComputeStringSize += CodedOutputStream.G(2, getPlacementId());
        }
        if (this.customData_ != null) {
            iComputeStringSize += CodedOutputStream.G(3, getCustomData());
        }
        if (this.hbPlacement_ != null) {
            iComputeStringSize += CodedOutputStream.G(4, getHbPlacement());
        }
        if (this.adFormat_ != null) {
            iComputeStringSize += CodedOutputStream.G(5, getAdFormat());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasAdFormat() {
        return this.adFormat_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasCustomData() {
        return this.customData_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasHbPlacement() {
        return this.hbPlacement_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
    public boolean hasPlacementId() {
        return this.placementId_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdType().hashCode();
        if (hasPlacementId()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getPlacementId().hashCode();
        }
        if (hasCustomData()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getCustomData().hashCode();
        }
        if (hasHbPlacement()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getHbPlacement().hashCode();
        }
        if (hasAdFormat()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getAdFormat().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_fieldAccessorTable.d(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getAdTypeBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.adType_);
        }
        if (this.placementId_ != null) {
            codedOutputStream.L0(2, getPlacementId());
        }
        if (this.customData_ != null) {
            codedOutputStream.L0(3, getCustomData());
        }
        if (this.hbPlacement_ != null) {
            codedOutputStream.L0(4, getHbPlacement());
        }
        if (this.adFormat_ != null) {
            codedOutputStream.L0(5, getAdFormat());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements PlacementOrBuilder {
        private e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> adFormatBuilder_;
        private AdFormat adFormat_;
        private Object adType_;
        private e2<Struct, Struct.Builder, i2> customDataBuilder_;
        private Struct customData_;
        private e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> hbPlacementBuilder_;
        private HeaderBiddingPlacement hbPlacement_;
        private e2<StringValue, StringValue.Builder, h2> placementIdBuilder_;
        private StringValue placementId_;

        private e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> getAdFormatFieldBuilder() {
            if (this.adFormatBuilder_ == null) {
                this.adFormatBuilder_ = new e2<>(getAdFormat(), getParentForChildren(), isClean());
                this.adFormat_ = null;
            }
            return this.adFormatBuilder_;
        }

        private e2<Struct, Struct.Builder, i2> getCustomDataFieldBuilder() {
            if (this.customDataBuilder_ == null) {
                this.customDataBuilder_ = new e2<>(getCustomData(), getParentForChildren(), isClean());
                this.customData_ = null;
            }
            return this.customDataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
        }

        private e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> getHbPlacementFieldBuilder() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacementBuilder_ = new e2<>(getHbPlacement(), getParentForChildren(), isClean());
                this.hbPlacement_ = null;
            }
            return this.hbPlacementBuilder_;
        }

        private e2<StringValue, StringValue.Builder, h2> getPlacementIdFieldBuilder() {
            if (this.placementIdBuilder_ == null) {
                this.placementIdBuilder_ = new e2<>(getPlacementId(), getParentForChildren(), isClean());
                this.placementId_ = null;
            }
            return this.placementIdBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearAdFormat() {
            if (this.adFormatBuilder_ == null) {
                this.adFormat_ = null;
                onChanged();
            } else {
                this.adFormat_ = null;
                this.adFormatBuilder_ = null;
            }
            return this;
        }

        @Deprecated
        public Builder clearAdType() {
            this.adType_ = Placement.getDefaultInstance().getAdType();
            onChanged();
            return this;
        }

        public Builder clearCustomData() {
            if (this.customDataBuilder_ == null) {
                this.customData_ = null;
                onChanged();
            } else {
                this.customData_ = null;
                this.customDataBuilder_ = null;
            }
            return this;
        }

        public Builder clearHbPlacement() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                onChanged();
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            return this;
        }

        public Builder clearPlacementId() {
            if (this.placementIdBuilder_ == null) {
                this.placementId_ = null;
                onChanged();
            } else {
                this.placementId_ = null;
                this.placementIdBuilder_ = null;
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public AdFormat getAdFormat() {
            e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> e2Var = this.adFormatBuilder_;
            if (e2Var != null) {
                return (AdFormat) e2Var.e();
            }
            AdFormat adFormat = this.adFormat_;
            return adFormat == null ? AdFormat.getDefaultInstance() : adFormat;
        }

        public AdFormat.Builder getAdFormatBuilder() {
            onChanged();
            return (AdFormat.Builder) getAdFormatFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public AdFormatOrBuilder getAdFormatOrBuilder() {
            e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> e2Var = this.adFormatBuilder_;
            if (e2Var != null) {
                return (AdFormatOrBuilder) e2Var.f();
            }
            AdFormat adFormat = this.adFormat_;
            return adFormat == null ? AdFormat.getDefaultInstance() : adFormat;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        @Deprecated
        public String getAdType() {
            Object obj = this.adType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        @Deprecated
        public ByteString getAdTypeBytes() {
            Object obj = this.adType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public Struct getCustomData() {
            e2<Struct, Struct.Builder, i2> e2Var = this.customDataBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.customData_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getCustomDataBuilder() {
            onChanged();
            return (Struct.Builder) getCustomDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public i2 getCustomDataOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.customDataBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.customData_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public HeaderBiddingPlacement getHbPlacement() {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var != null) {
                return (HeaderBiddingPlacement) e2Var.e();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        public HeaderBiddingPlacement.Builder getHbPlacementBuilder() {
            onChanged();
            return (HeaderBiddingPlacement.Builder) getHbPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var != null) {
                return (HeaderBiddingPlacementOrBuilder) e2Var.f();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public StringValue getPlacementId() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.placementIdBuilder_;
            if (e2Var != null) {
                return (StringValue) e2Var.e();
            }
            StringValue stringValue = this.placementId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getPlacementIdBuilder() {
            onChanged();
            return (StringValue.Builder) getPlacementIdFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public h2 getPlacementIdOrBuilder() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.placementIdBuilder_;
            if (e2Var != null) {
                return (h2) e2Var.f();
            }
            StringValue stringValue = this.placementId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasAdFormat() {
            return (this.adFormatBuilder_ == null && this.adFormat_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasCustomData() {
            return (this.customDataBuilder_ == null && this.customData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasHbPlacement() {
            return (this.hbPlacementBuilder_ == null && this.hbPlacement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.PlacementOrBuilder
        public boolean hasPlacementId() {
            return (this.placementIdBuilder_ == null && this.placementId_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKProto.internal_static_bidmachine_protobuf_sdk_Placement_fieldAccessorTable.d(Placement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAdFormat(AdFormat adFormat) {
            e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> e2Var = this.adFormatBuilder_;
            if (e2Var == null) {
                AdFormat adFormat2 = this.adFormat_;
                if (adFormat2 != null) {
                    this.adFormat_ = AdFormat.newBuilder(adFormat2).mergeFrom(adFormat).buildPartial();
                } else {
                    this.adFormat_ = adFormat;
                }
                onChanged();
            } else {
                e2Var.g(adFormat);
            }
            return this;
        }

        public Builder mergeCustomData(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.customDataBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.customData_;
                if (struct2 != null) {
                    this.customData_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.customData_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        public Builder mergeHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var == null) {
                HeaderBiddingPlacement headerBiddingPlacement2 = this.hbPlacement_;
                if (headerBiddingPlacement2 != null) {
                    this.hbPlacement_ = HeaderBiddingPlacement.newBuilder(headerBiddingPlacement2).mergeFrom(headerBiddingPlacement).buildPartial();
                } else {
                    this.hbPlacement_ = headerBiddingPlacement;
                }
                onChanged();
            } else {
                e2Var.g(headerBiddingPlacement);
            }
            return this;
        }

        public Builder mergePlacementId(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.placementIdBuilder_;
            if (e2Var == null) {
                StringValue stringValue2 = this.placementId_;
                if (stringValue2 != null) {
                    this.placementId_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.placementId_ = stringValue;
                }
                onChanged();
            } else {
                e2Var.g(stringValue);
            }
            return this;
        }

        public Builder setAdFormat(AdFormat adFormat) {
            e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> e2Var = this.adFormatBuilder_;
            if (e2Var == null) {
                adFormat.getClass();
                this.adFormat_ = adFormat;
                onChanged();
            } else {
                e2Var.i(adFormat);
            }
            return this;
        }

        @Deprecated
        public Builder setAdType(String str) {
            str.getClass();
            this.adType_ = str;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setAdTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.adType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCustomData(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.customDataBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.customData_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
            return this;
        }

        public Builder setHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var == null) {
                headerBiddingPlacement.getClass();
                this.hbPlacement_ = headerBiddingPlacement;
                onChanged();
            } else {
                e2Var.i(headerBiddingPlacement);
            }
            return this;
        }

        public Builder setPlacementId(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.placementIdBuilder_;
            if (e2Var == null) {
                stringValue.getClass();
                this.placementId_ = stringValue;
                onChanged();
            } else {
                e2Var.i(stringValue);
            }
            return this;
        }

        private Builder() {
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.adType_ = this.adType_;
            e2<StringValue, StringValue.Builder, h2> e2Var = this.placementIdBuilder_;
            if (e2Var == null) {
                placement.placementId_ = this.placementId_;
            } else {
                placement.placementId_ = (StringValue) e2Var.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var2 = this.customDataBuilder_;
            if (e2Var2 == null) {
                placement.customData_ = this.customData_;
            } else {
                placement.customData_ = (Struct) e2Var2.a();
            }
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var3 = this.hbPlacementBuilder_;
            if (e2Var3 == null) {
                placement.hbPlacement_ = this.hbPlacement_;
            } else {
                placement.hbPlacement_ = (HeaderBiddingPlacement) e2Var3.a();
            }
            e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> e2Var4 = this.adFormatBuilder_;
            if (e2Var4 == null) {
                placement.adFormat_ = this.adFormat_;
            } else {
                placement.adFormat_ = (AdFormat) e2Var4.a();
            }
            onBuilt();
            return placement;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Placement mo164getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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
            this.adType_ = "";
            if (this.placementIdBuilder_ == null) {
                this.placementId_ = null;
            } else {
                this.placementId_ = null;
                this.placementIdBuilder_ = null;
            }
            if (this.customDataBuilder_ == null) {
                this.customData_ = null;
            } else {
                this.customData_ = null;
                this.customDataBuilder_ = null;
            }
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            if (this.adFormatBuilder_ == null) {
                this.adFormat_ = null;
            } else {
                this.adFormat_ = null;
                this.adFormatBuilder_ = null;
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setAdFormat(AdFormat.Builder builder) {
            e2<AdFormat, AdFormat.Builder, AdFormatOrBuilder> e2Var = this.adFormatBuilder_;
            if (e2Var == null) {
                this.adFormat_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setCustomData(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.customDataBuilder_;
            if (e2Var == null) {
                this.customData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setHbPlacement(HeaderBiddingPlacement.Builder builder) {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var == null) {
                this.hbPlacement_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setPlacementId(StringValue.Builder builder) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.placementIdBuilder_;
            if (e2Var == null) {
                this.placementId_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
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
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getAdType().isEmpty()) {
                this.adType_ = placement.adType_;
                onChanged();
            }
            if (placement.hasPlacementId()) {
                mergePlacementId(placement.getPlacementId());
            }
            if (placement.hasCustomData()) {
                mergeCustomData(placement.getCustomData());
            }
            if (placement.hasHbPlacement()) {
                mergeHbPlacement(placement.getHbPlacement());
            }
            if (placement.hasAdFormat()) {
                mergeAdFormat(placement.getAdFormat());
            }
            mergeUnknownFields(((j0) placement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Placement placement = null;
            try {
                try {
                    Placement placement2 = (Placement) Placement.PARSER.parsePartialFrom(nVar, yVar);
                    if (placement2 != null) {
                        mergeFrom(placement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Placement placement3 = (Placement) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        placement = placement3;
                        if (placement != null) {
                            mergeFrom(placement);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (placement != null) {
                    mergeFrom(placement);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Placement(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Placement) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Placement mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Placement parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.adType_ = "";
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Placement parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, inputStream);
    }

    private Placement(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK != 10) {
                            if (iK == 18) {
                                StringValue stringValue = this.placementId_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                this.placementId_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.placementId_ = builder.buildPartial();
                                }
                            } else if (iK == 26) {
                                Struct struct = this.customData_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.customData_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.customData_ = builder2.buildPartial();
                                }
                            } else if (iK == 34) {
                                HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
                                HeaderBiddingPlacement.Builder builder3 = headerBiddingPlacement != null ? headerBiddingPlacement.toBuilder() : null;
                                HeaderBiddingPlacement headerBiddingPlacement2 = (HeaderBiddingPlacement) nVar.A(HeaderBiddingPlacement.parser(), yVar);
                                this.hbPlacement_ = headerBiddingPlacement2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(headerBiddingPlacement2);
                                    this.hbPlacement_ = builder3.buildPartial();
                                }
                            } else if (iK != 42) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                AdFormat adFormat = this.adFormat_;
                                AdFormat.Builder builder4 = adFormat != null ? adFormat.toBuilder() : null;
                                AdFormat adFormat2 = (AdFormat) nVar.A(AdFormat.parser(), yVar);
                                this.adFormat_ = adFormat2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(adFormat2);
                                    this.adFormat_ = builder4.buildPartial();
                                }
                            }
                        } else {
                            this.adType_ = nVar.J();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Placement parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Placement parseFrom(n nVar) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, nVar);
    }

    public static Placement parseFrom(n nVar, y yVar) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
