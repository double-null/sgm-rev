package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Measurement extends j0 implements MeasurementOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 1;
    public static final int FAILURE_TIMEOUT_MS_FIELD_NUMBER = 4;
    public static final int INTERVAL_MS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private int count_;
    private int failureTimeoutMs_;
    private int intervalMs_;
    private byte memoizedIsInitialized;
    private static final Measurement DEFAULT_INSTANCE = new Measurement();
    private static final s1<Measurement> PARSER = new b<Measurement>() { // from class: io.bidmachine.protobuf.sdk.Measurement.1
        @Override // com.explorestack.protobuf.s1
        public Measurement parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Measurement(nVar, yVar);
        }
    };

    public static Measurement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Measurement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Measurement) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Measurement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Measurement> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Measurement)) {
            return super.equals(obj);
        }
        Measurement measurement = (Measurement) obj;
        if (getCount() == measurement.getCount() && getIntervalMs() == measurement.getIntervalMs() && hasFailureTimeoutMs() == measurement.hasFailureTimeoutMs()) {
            return (!hasFailureTimeoutMs() || getFailureTimeoutMs() == measurement.getFailureTimeoutMs()) && this.unknownFields.equals(measurement.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public int getCount() {
        return this.count_;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public int getFailureTimeoutMs() {
        return this.failureTimeoutMs_;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public int getIntervalMs() {
        return this.intervalMs_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Measurement> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.count_;
        int iY = i11 != 0 ? 0 + CodedOutputStream.Y(1, i11) : 0;
        int i12 = this.intervalMs_;
        if (i12 != 0) {
            iY += CodedOutputStream.Y(2, i12);
        }
        if ((this.bitField0_ & 1) != 0) {
            iY += CodedOutputStream.Y(4, this.failureTimeoutMs_);
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
    public boolean hasFailureTimeoutMs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCount()) * 37) + 2) * 53) + getIntervalMs();
        if (hasFailureTimeoutMs()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getFailureTimeoutMs();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_fieldAccessorTable.d(Measurement.class, Builder.class);
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
        return new Measurement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i10 = this.count_;
        if (i10 != 0) {
            codedOutputStream.c1(1, i10);
        }
        int i11 = this.intervalMs_;
        if (i11 != 0) {
            codedOutputStream.c1(2, i11);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.c1(4, this.failureTimeoutMs_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements MeasurementOrBuilder {
        private int bitField0_;
        private int count_;
        private int failureTimeoutMs_;
        private int intervalMs_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearCount() {
            this.count_ = 0;
            onChanged();
            return this;
        }

        public Builder clearFailureTimeoutMs() {
            this.bitField0_ &= -2;
            this.failureTimeoutMs_ = 0;
            onChanged();
            return this;
        }

        public Builder clearIntervalMs() {
            this.intervalMs_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public int getFailureTimeoutMs() {
            return this.failureTimeoutMs_;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public int getIntervalMs() {
            return this.intervalMs_;
        }

        @Override // io.bidmachine.protobuf.sdk.MeasurementOrBuilder
        public boolean hasFailureTimeoutMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_Measurement_fieldAccessorTable.d(Measurement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setCount(int i10) {
            this.count_ = i10;
            onChanged();
            return this;
        }

        public Builder setFailureTimeoutMs(int i10) {
            this.bitField0_ |= 1;
            this.failureTimeoutMs_ = i10;
            onChanged();
            return this;
        }

        public Builder setIntervalMs(int i10) {
            this.intervalMs_ = i10;
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
        public Measurement build() {
            Measurement measurementBuildPartial = buildPartial();
            if (measurementBuildPartial.isInitialized()) {
                return measurementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) measurementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Measurement buildPartial() {
            Measurement measurement = new Measurement(this);
            int i10 = this.bitField0_;
            measurement.count_ = this.count_;
            measurement.intervalMs_ = this.intervalMs_;
            int i11 = 1;
            if ((i10 & 1) != 0) {
                measurement.failureTimeoutMs_ = this.failureTimeoutMs_;
            } else {
                i11 = 0;
            }
            measurement.bitField0_ = i11;
            onBuilt();
            return measurement;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Measurement mo164getDefaultInstanceForType() {
            return Measurement.getDefaultInstance();
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
            this.count_ = 0;
            this.intervalMs_ = 0;
            this.failureTimeoutMs_ = 0;
            this.bitField0_ &= -2;
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Measurement) {
                return mergeFrom((Measurement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Measurement measurement) {
            if (measurement == Measurement.getDefaultInstance()) {
                return this;
            }
            if (measurement.getCount() != 0) {
                setCount(measurement.getCount());
            }
            if (measurement.getIntervalMs() != 0) {
                setIntervalMs(measurement.getIntervalMs());
            }
            if (measurement.hasFailureTimeoutMs()) {
                setFailureTimeoutMs(measurement.getFailureTimeoutMs());
            }
            mergeUnknownFields(((j0) measurement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Measurement measurement = null;
            try {
                try {
                    Measurement measurement2 = (Measurement) Measurement.PARSER.parsePartialFrom(nVar, yVar);
                    if (measurement2 != null) {
                        mergeFrom(measurement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Measurement measurement3 = (Measurement) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        measurement = measurement3;
                        if (measurement != null) {
                            mergeFrom(measurement);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (measurement != null) {
                    mergeFrom(measurement);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Measurement measurement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(measurement);
    }

    public static Measurement parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Measurement(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Measurement parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Measurement) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Measurement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Measurement mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Measurement parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Measurement() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Measurement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Measurement parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    private Measurement(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = nVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.count_ = nVar.L();
                            } else if (iK == 16) {
                                this.intervalMs_ = nVar.L();
                            } else if (iK != 32) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.failureTimeoutMs_ = nVar.L();
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
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

    public static Measurement parseFrom(InputStream inputStream) throws IOException {
        return (Measurement) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Measurement parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Measurement) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Measurement parseFrom(n nVar) throws IOException {
        return (Measurement) j0.parseWithIOException(PARSER, nVar);
    }

    public static Measurement parseFrom(n nVar, y yVar) throws IOException {
        return (Measurement) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
