package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class WatermarkConfiguration extends j0 implements WatermarkConfigurationOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 1;
    public static final int BASE_COLOR_RGB_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int PAYLOAD_TYPE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int algorithm_;
    private volatile Object baseColorRgb_;
    private int location_;
    private byte memoizedIsInitialized;
    private int payloadType_;
    private static final WatermarkConfiguration DEFAULT_INSTANCE = new WatermarkConfiguration();
    private static final s1<WatermarkConfiguration> PARSER = new b<WatermarkConfiguration>() { // from class: io.bidmachine.protobuf.rendering.WatermarkConfiguration.1
        @Override // com.explorestack.protobuf.s1
        public WatermarkConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new WatermarkConfiguration(nVar, yVar);
        }
    };

    public static WatermarkConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static WatermarkConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatermarkConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static WatermarkConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<WatermarkConfiguration> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WatermarkConfiguration)) {
            return super.equals(obj);
        }
        WatermarkConfiguration watermarkConfiguration = (WatermarkConfiguration) obj;
        return this.algorithm_ == watermarkConfiguration.algorithm_ && this.payloadType_ == watermarkConfiguration.payloadType_ && getBaseColorRgb().equals(watermarkConfiguration.getBaseColorRgb()) && this.location_ == watermarkConfiguration.location_ && this.unknownFields.equals(watermarkConfiguration.unknownFields);
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public WatermarkAlgorithm getAlgorithm() {
        WatermarkAlgorithm watermarkAlgorithmValueOf = WatermarkAlgorithm.valueOf(this.algorithm_);
        return watermarkAlgorithmValueOf == null ? WatermarkAlgorithm.UNRECOGNIZED : watermarkAlgorithmValueOf;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public String getBaseColorRgb() {
        Object obj = this.baseColorRgb_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.baseColorRgb_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public ByteString getBaseColorRgbBytes() {
        Object obj = this.baseColorRgb_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.baseColorRgb_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public WatermarkLocation getLocation() {
        WatermarkLocation watermarkLocationValueOf = WatermarkLocation.valueOf(this.location_);
        return watermarkLocationValueOf == null ? WatermarkLocation.UNRECOGNIZED : watermarkLocationValueOf;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public int getLocationValue() {
        return this.location_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<WatermarkConfiguration> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public WatermarkPayloadType getPayloadType() {
        WatermarkPayloadType watermarkPayloadTypeValueOf = WatermarkPayloadType.valueOf(this.payloadType_);
        return watermarkPayloadTypeValueOf == null ? WatermarkPayloadType.UNRECOGNIZED : watermarkPayloadTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
    public int getPayloadTypeValue() {
        return this.payloadType_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.algorithm_ != WatermarkAlgorithm.WM_ALGO_UNSPECIFIED.getNumber() ? 0 + CodedOutputStream.l(1, this.algorithm_) : 0;
        if (this.payloadType_ != WatermarkPayloadType.WM_PAYLOAD_UNSPECIFIED.getNumber()) {
            iL += CodedOutputStream.l(2, this.payloadType_);
        }
        if (!getBaseColorRgbBytes().isEmpty()) {
            iL += j0.computeStringSize(3, this.baseColorRgb_);
        }
        if (this.location_ != WatermarkLocation.WM_LOCATION_UNSPECIFIED.getNumber()) {
            iL += CodedOutputStream.l(4, this.location_);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.algorithm_) * 37) + 2) * 53) + this.payloadType_) * 37) + 3) * 53) + getBaseColorRgb().hashCode()) * 37) + 4) * 53) + this.location_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_fieldAccessorTable.d(WatermarkConfiguration.class, Builder.class);
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
        return new WatermarkConfiguration();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.algorithm_ != WatermarkAlgorithm.WM_ALGO_UNSPECIFIED.getNumber()) {
            codedOutputStream.v0(1, this.algorithm_);
        }
        if (this.payloadType_ != WatermarkPayloadType.WM_PAYLOAD_UNSPECIFIED.getNumber()) {
            codedOutputStream.v0(2, this.payloadType_);
        }
        if (!getBaseColorRgbBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 3, this.baseColorRgb_);
        }
        if (this.location_ != WatermarkLocation.WM_LOCATION_UNSPECIFIED.getNumber()) {
            codedOutputStream.v0(4, this.location_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements WatermarkConfigurationOrBuilder {
        private int algorithm_;
        private Object baseColorRgb_;
        private int location_;
        private int payloadType_;

        public static final Descriptors.Descriptor getDescriptor() {
            return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearAlgorithm() {
            this.algorithm_ = 0;
            onChanged();
            return this;
        }

        public Builder clearBaseColorRgb() {
            this.baseColorRgb_ = WatermarkConfiguration.getDefaultInstance().getBaseColorRgb();
            onChanged();
            return this;
        }

        public Builder clearLocation() {
            this.location_ = 0;
            onChanged();
            return this;
        }

        public Builder clearPayloadType() {
            this.payloadType_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public WatermarkAlgorithm getAlgorithm() {
            WatermarkAlgorithm watermarkAlgorithmValueOf = WatermarkAlgorithm.valueOf(this.algorithm_);
            return watermarkAlgorithmValueOf == null ? WatermarkAlgorithm.UNRECOGNIZED : watermarkAlgorithmValueOf;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public int getAlgorithmValue() {
            return this.algorithm_;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public String getBaseColorRgb() {
            Object obj = this.baseColorRgb_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.baseColorRgb_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public ByteString getBaseColorRgbBytes() {
            Object obj = this.baseColorRgb_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.baseColorRgb_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_descriptor;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public WatermarkLocation getLocation() {
            WatermarkLocation watermarkLocationValueOf = WatermarkLocation.valueOf(this.location_);
            return watermarkLocationValueOf == null ? WatermarkLocation.UNRECOGNIZED : watermarkLocationValueOf;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public int getLocationValue() {
            return this.location_;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public WatermarkPayloadType getPayloadType() {
            WatermarkPayloadType watermarkPayloadTypeValueOf = WatermarkPayloadType.valueOf(this.payloadType_);
            return watermarkPayloadTypeValueOf == null ? WatermarkPayloadType.UNRECOGNIZED : watermarkPayloadTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.rendering.WatermarkConfigurationOrBuilder
        public int getPayloadTypeValue() {
            return this.payloadType_;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return RenderingProto.internal_static_bidmachine_protobuf_WatermarkConfiguration_fieldAccessorTable.d(WatermarkConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAlgorithm(WatermarkAlgorithm watermarkAlgorithm) {
            watermarkAlgorithm.getClass();
            this.algorithm_ = watermarkAlgorithm.getNumber();
            onChanged();
            return this;
        }

        public Builder setAlgorithmValue(int i10) {
            this.algorithm_ = i10;
            onChanged();
            return this;
        }

        public Builder setBaseColorRgb(String str) {
            str.getClass();
            this.baseColorRgb_ = str;
            onChanged();
            return this;
        }

        public Builder setBaseColorRgbBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.baseColorRgb_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLocation(WatermarkLocation watermarkLocation) {
            watermarkLocation.getClass();
            this.location_ = watermarkLocation.getNumber();
            onChanged();
            return this;
        }

        public Builder setLocationValue(int i10) {
            this.location_ = i10;
            onChanged();
            return this;
        }

        public Builder setPayloadType(WatermarkPayloadType watermarkPayloadType) {
            watermarkPayloadType.getClass();
            this.payloadType_ = watermarkPayloadType.getNumber();
            onChanged();
            return this;
        }

        public Builder setPayloadTypeValue(int i10) {
            this.payloadType_ = i10;
            onChanged();
            return this;
        }

        private Builder() {
            this.algorithm_ = 0;
            this.payloadType_ = 0;
            this.baseColorRgb_ = "";
            this.location_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public WatermarkConfiguration build() {
            WatermarkConfiguration watermarkConfigurationBuildPartial = buildPartial();
            if (watermarkConfigurationBuildPartial.isInitialized()) {
                return watermarkConfigurationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) watermarkConfigurationBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public WatermarkConfiguration buildPartial() {
            WatermarkConfiguration watermarkConfiguration = new WatermarkConfiguration(this);
            watermarkConfiguration.algorithm_ = this.algorithm_;
            watermarkConfiguration.payloadType_ = this.payloadType_;
            watermarkConfiguration.baseColorRgb_ = this.baseColorRgb_;
            watermarkConfiguration.location_ = this.location_;
            onBuilt();
            return watermarkConfiguration;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public WatermarkConfiguration mo164getDefaultInstanceForType() {
            return WatermarkConfiguration.getDefaultInstance();
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
            this.algorithm_ = 0;
            this.payloadType_ = 0;
            this.baseColorRgb_ = "";
            this.location_ = 0;
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof WatermarkConfiguration) {
                return mergeFrom((WatermarkConfiguration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.algorithm_ = 0;
            this.payloadType_ = 0;
            this.baseColorRgb_ = "";
            this.location_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(WatermarkConfiguration watermarkConfiguration) {
            if (watermarkConfiguration == WatermarkConfiguration.getDefaultInstance()) {
                return this;
            }
            if (watermarkConfiguration.algorithm_ != 0) {
                setAlgorithmValue(watermarkConfiguration.getAlgorithmValue());
            }
            if (watermarkConfiguration.payloadType_ != 0) {
                setPayloadTypeValue(watermarkConfiguration.getPayloadTypeValue());
            }
            if (!watermarkConfiguration.getBaseColorRgb().isEmpty()) {
                this.baseColorRgb_ = watermarkConfiguration.baseColorRgb_;
                onChanged();
            }
            if (watermarkConfiguration.location_ != 0) {
                setLocationValue(watermarkConfiguration.getLocationValue());
            }
            mergeUnknownFields(((j0) watermarkConfiguration).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            WatermarkConfiguration watermarkConfiguration = null;
            try {
                try {
                    WatermarkConfiguration watermarkConfiguration2 = (WatermarkConfiguration) WatermarkConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                    if (watermarkConfiguration2 != null) {
                        mergeFrom(watermarkConfiguration2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    WatermarkConfiguration watermarkConfiguration3 = (WatermarkConfiguration) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        watermarkConfiguration = watermarkConfiguration3;
                        if (watermarkConfiguration != null) {
                            mergeFrom(watermarkConfiguration);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (watermarkConfiguration != null) {
                    mergeFrom(watermarkConfiguration);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(WatermarkConfiguration watermarkConfiguration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(watermarkConfiguration);
    }

    public static WatermarkConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private WatermarkConfiguration(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static WatermarkConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (WatermarkConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static WatermarkConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public WatermarkConfiguration mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static WatermarkConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private WatermarkConfiguration() {
        this.memoizedIsInitialized = (byte) -1;
        this.algorithm_ = 0;
        this.payloadType_ = 0;
        this.baseColorRgb_ = "";
        this.location_ = 0;
    }

    public static WatermarkConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static WatermarkConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static WatermarkConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (WatermarkConfiguration) j0.parseWithIOException(PARSER, inputStream);
    }

    public static WatermarkConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (WatermarkConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    private WatermarkConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.algorithm_ = nVar.t();
                        } else if (iK == 16) {
                            this.payloadType_ = nVar.t();
                        } else if (iK == 26) {
                            this.baseColorRgb_ = nVar.J();
                        } else if (iK != 32) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            this.location_ = nVar.t();
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

    public static WatermarkConfiguration parseFrom(n nVar) throws IOException {
        return (WatermarkConfiguration) j0.parseWithIOException(PARSER, nVar);
    }

    public static WatermarkConfiguration parseFrom(n nVar, y yVar) throws IOException {
        return (WatermarkConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
