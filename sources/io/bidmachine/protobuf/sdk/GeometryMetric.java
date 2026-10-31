package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class GeometryMetric extends j0 implements GeometryMetricOrBuilder {
    public static final int MIN_ALPHA_FIELD_NUMBER = 6;
    public static final int MIN_HEIGHT_FIELD_NUMBER = 2;
    public static final int MIN_WIDTH_FIELD_NUMBER = 1;
    public static final int VISIBLE_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private double minAlpha_;
    private int minHeight_;
    private int minWidth_;
    private boolean visible_;
    private static final GeometryMetric DEFAULT_INSTANCE = new GeometryMetric();
    private static final s1<GeometryMetric> PARSER = new b<GeometryMetric>() { // from class: io.bidmachine.protobuf.sdk.GeometryMetric.1
        @Override // com.explorestack.protobuf.s1
        public GeometryMetric parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new GeometryMetric(nVar, yVar);
        }
    };

    public static GeometryMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GeometryMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GeometryMetric) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GeometryMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<GeometryMetric> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeometryMetric)) {
            return super.equals(obj);
        }
        GeometryMetric geometryMetric = (GeometryMetric) obj;
        if (hasMinWidth() != geometryMetric.hasMinWidth()) {
            return false;
        }
        if ((hasMinWidth() && getMinWidth() != geometryMetric.getMinWidth()) || hasMinHeight() != geometryMetric.hasMinHeight()) {
            return false;
        }
        if ((!hasMinHeight() || getMinHeight() == geometryMetric.getMinHeight()) && getVisible() == geometryMetric.getVisible() && hasMinAlpha() == geometryMetric.hasMinAlpha()) {
            return (!hasMinAlpha() || Double.doubleToLongBits(getMinAlpha()) == Double.doubleToLongBits(geometryMetric.getMinAlpha())) && this.unknownFields.equals(geometryMetric.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public double getMinAlpha() {
        return this.minAlpha_;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public int getMinHeight() {
        return this.minHeight_;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public int getMinWidth() {
        return this.minWidth_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<GeometryMetric> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iY = (this.bitField0_ & 1) != 0 ? 0 + CodedOutputStream.Y(1, this.minWidth_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iY += CodedOutputStream.Y(2, this.minHeight_);
        }
        boolean z10 = this.visible_;
        if (z10) {
            iY += CodedOutputStream.e(3, z10);
        }
        if ((this.bitField0_ & 4) != 0) {
            iY += CodedOutputStream.j(6, this.minAlpha_);
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public boolean getVisible() {
        return this.visible_;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public boolean hasMinAlpha() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public boolean hasMinHeight() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
    public boolean hasMinWidth() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasMinWidth()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getMinWidth();
        }
        if (hasMinHeight()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getMinHeight();
        }
        int iD = (((iHashCode * 37) + 3) * 53) + l0.d(getVisible());
        if (hasMinAlpha()) {
            iD = (((iD * 37) + 6) * 53) + l0.i(Double.doubleToLongBits(getMinAlpha()));
        }
        int iHashCode2 = (iD * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_fieldAccessorTable.d(GeometryMetric.class, Builder.class);
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
        return new GeometryMetric();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.c1(1, this.minWidth_);
        }
        if ((this.bitField0_ & 2) != 0) {
            codedOutputStream.c1(2, this.minHeight_);
        }
        boolean z10 = this.visible_;
        if (z10) {
            codedOutputStream.n0(3, z10);
        }
        if ((this.bitField0_ & 4) != 0) {
            codedOutputStream.t0(6, this.minAlpha_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements GeometryMetricOrBuilder {
        private int bitField0_;
        private double minAlpha_;
        private int minHeight_;
        private int minWidth_;
        private boolean visible_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearMinAlpha() {
            this.bitField0_ &= -5;
            this.minAlpha_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearMinHeight() {
            this.bitField0_ &= -3;
            this.minHeight_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMinWidth() {
            this.bitField0_ &= -2;
            this.minWidth_ = 0;
            onChanged();
            return this;
        }

        public Builder clearVisible() {
            this.visible_ = false;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public double getMinAlpha() {
            return this.minAlpha_;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public int getMinHeight() {
            return this.minHeight_;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public int getMinWidth() {
            return this.minWidth_;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public boolean hasMinAlpha() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public boolean hasMinHeight() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // io.bidmachine.protobuf.sdk.GeometryMetricOrBuilder
        public boolean hasMinWidth() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_GeometryMetric_fieldAccessorTable.d(GeometryMetric.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setMinAlpha(double d10) {
            this.bitField0_ |= 4;
            this.minAlpha_ = d10;
            onChanged();
            return this;
        }

        public Builder setMinHeight(int i10) {
            this.bitField0_ |= 2;
            this.minHeight_ = i10;
            onChanged();
            return this;
        }

        public Builder setMinWidth(int i10) {
            this.bitField0_ |= 1;
            this.minWidth_ = i10;
            onChanged();
            return this;
        }

        public Builder setVisible(boolean z10) {
            this.visible_ = z10;
            onChanged();
            return this;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public GeometryMetric build() {
            GeometryMetric geometryMetricBuildPartial = buildPartial();
            if (geometryMetricBuildPartial.isInitialized()) {
                return geometryMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometryMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public GeometryMetric buildPartial() {
            int i10;
            GeometryMetric geometryMetric = new GeometryMetric(this);
            int i11 = this.bitField0_;
            if ((i11 & 1) != 0) {
                geometryMetric.minWidth_ = this.minWidth_;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                geometryMetric.minHeight_ = this.minHeight_;
                i10 |= 2;
            }
            geometryMetric.visible_ = this.visible_;
            if ((i11 & 4) != 0) {
                geometryMetric.minAlpha_ = this.minAlpha_;
                i10 |= 4;
            }
            geometryMetric.bitField0_ = i10;
            onBuilt();
            return geometryMetric;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public GeometryMetric mo164getDefaultInstanceForType() {
            return GeometryMetric.getDefaultInstance();
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

        private Builder(j0.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.minWidth_ = 0;
            int i10 = this.bitField0_ & (-2);
            this.minHeight_ = 0;
            this.visible_ = false;
            this.minAlpha_ = 0.0d;
            this.bitField0_ = i10 & (-3) & (-5);
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GeometryMetric) {
                return mergeFrom((GeometryMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GeometryMetric geometryMetric) {
            if (geometryMetric == GeometryMetric.getDefaultInstance()) {
                return this;
            }
            if (geometryMetric.hasMinWidth()) {
                setMinWidth(geometryMetric.getMinWidth());
            }
            if (geometryMetric.hasMinHeight()) {
                setMinHeight(geometryMetric.getMinHeight());
            }
            if (geometryMetric.getVisible()) {
                setVisible(geometryMetric.getVisible());
            }
            if (geometryMetric.hasMinAlpha()) {
                setMinAlpha(geometryMetric.getMinAlpha());
            }
            mergeUnknownFields(((j0) geometryMetric).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            GeometryMetric geometryMetric = null;
            try {
                try {
                    GeometryMetric geometryMetric2 = (GeometryMetric) GeometryMetric.PARSER.parsePartialFrom(nVar, yVar);
                    if (geometryMetric2 != null) {
                        mergeFrom(geometryMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    GeometryMetric geometryMetric3 = (GeometryMetric) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        geometryMetric = geometryMetric3;
                        if (geometryMetric != null) {
                            mergeFrom(geometryMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (geometryMetric != null) {
                    mergeFrom(geometryMetric);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(GeometryMetric geometryMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(geometryMetric);
    }

    public static GeometryMetric parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private GeometryMetric(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GeometryMetric parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (GeometryMetric) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static GeometryMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public GeometryMetric mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static GeometryMetric parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private GeometryMetric() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static GeometryMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static GeometryMetric parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    private GeometryMetric(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            this.bitField0_ |= 1;
                            this.minWidth_ = nVar.L();
                        } else if (iK == 16) {
                            this.bitField0_ |= 2;
                            this.minHeight_ = nVar.L();
                        } else if (iK == 24) {
                            this.visible_ = nVar.q();
                        } else if (iK != 49) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            this.bitField0_ |= 4;
                            this.minAlpha_ = nVar.s();
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

    public static GeometryMetric parseFrom(InputStream inputStream) throws IOException {
        return (GeometryMetric) j0.parseWithIOException(PARSER, inputStream);
    }

    public static GeometryMetric parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (GeometryMetric) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static GeometryMetric parseFrom(n nVar) throws IOException {
        return (GeometryMetric) j0.parseWithIOException(PARSER, nVar);
    }

    public static GeometryMetric parseFrom(n nVar, y yVar) throws IOException {
        return (GeometryMetric) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
