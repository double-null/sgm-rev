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
public final class VisibilityMetric extends j0 implements VisibilityMetricOrBuilder {
    public static final int MIN_VISIBLE_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private double minVisiblePercentage_;
    private int scope_;
    private static final VisibilityMetric DEFAULT_INSTANCE = new VisibilityMetric();
    private static final s1<VisibilityMetric> PARSER = new b<VisibilityMetric>() { // from class: io.bidmachine.protobuf.sdk.VisibilityMetric.1
        @Override // com.explorestack.protobuf.s1
        public VisibilityMetric parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new VisibilityMetric(nVar, yVar);
        }
    };

    public enum VisibilityScope implements l0.c {
        PARENT_VIEW(0),
        SCREEN(1),
        SAFE_AREA(2),
        UNRECOGNIZED(-1);

        public static final int PARENT_VIEW_VALUE = 0;
        public static final int SAFE_AREA_VALUE = 2;
        public static final int SCREEN_VALUE = 1;
        private final int value;
        private static final l0.d<VisibilityScope> internalValueMap = new l0.d<VisibilityScope>() { // from class: io.bidmachine.protobuf.sdk.VisibilityMetric.VisibilityScope.1
            @Override // com.explorestack.protobuf.l0.d
            public VisibilityScope findValueByNumber(int i10) {
                return VisibilityScope.forNumber(i10);
            }
        };
        private static final VisibilityScope[] VALUES = values();

        VisibilityScope(int i10) {
            this.value = i10;
        }

        public static VisibilityScope forNumber(int i10) {
            if (i10 == 0) {
                return PARENT_VIEW;
            }
            if (i10 == 1) {
                return SCREEN;
            }
            if (i10 != 2) {
                return null;
            }
            return SAFE_AREA;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return VisibilityMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static l0.d<VisibilityScope> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static VisibilityScope valueOf(int i10) {
            return forNumber(i10);
        }

        public static VisibilityScope valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static VisibilityMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static VisibilityMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VisibilityMetric) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static VisibilityMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<VisibilityMetric> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisibilityMetric)) {
            return super.equals(obj);
        }
        VisibilityMetric visibilityMetric = (VisibilityMetric) obj;
        return this.scope_ == visibilityMetric.scope_ && Double.doubleToLongBits(getMinVisiblePercentage()) == Double.doubleToLongBits(visibilityMetric.getMinVisiblePercentage()) && this.unknownFields.equals(visibilityMetric.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public double getMinVisiblePercentage() {
        return this.minVisiblePercentage_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<VisibilityMetric> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public VisibilityScope getScope() {
        VisibilityScope visibilityScopeValueOf = VisibilityScope.valueOf(this.scope_);
        return visibilityScopeValueOf == null ? VisibilityScope.UNRECOGNIZED : visibilityScopeValueOf;
    }

    @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
    public int getScopeValue() {
        return this.scope_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.scope_ != VisibilityScope.PARENT_VIEW.getNumber() ? 0 + CodedOutputStream.l(1, this.scope_) : 0;
        double d10 = this.minVisiblePercentage_;
        if (d10 != 0.0d) {
            iL += CodedOutputStream.j(2, d10);
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
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.scope_) * 37) + 2) * 53) + l0.i(Double.doubleToLongBits(getMinVisiblePercentage()))) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable.d(VisibilityMetric.class, Builder.class);
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
        return new VisibilityMetric();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.scope_ != VisibilityScope.PARENT_VIEW.getNumber()) {
            codedOutputStream.v0(1, this.scope_);
        }
        double d10 = this.minVisiblePercentage_;
        if (d10 != 0.0d) {
            codedOutputStream.t0(2, d10);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements VisibilityMetricOrBuilder {
        private double minVisiblePercentage_;
        private int scope_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearMinVisiblePercentage() {
            this.minVisiblePercentage_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearScope() {
            this.scope_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public double getMinVisiblePercentage() {
            return this.minVisiblePercentage_;
        }

        @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public VisibilityScope getScope() {
            VisibilityScope visibilityScopeValueOf = VisibilityScope.valueOf(this.scope_);
            return visibilityScopeValueOf == null ? VisibilityScope.UNRECOGNIZED : visibilityScopeValueOf;
        }

        @Override // io.bidmachine.protobuf.sdk.VisibilityMetricOrBuilder
        public int getScopeValue() {
            return this.scope_;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_VisibilityMetric_fieldAccessorTable.d(VisibilityMetric.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setMinVisiblePercentage(double d10) {
            this.minVisiblePercentage_ = d10;
            onChanged();
            return this;
        }

        public Builder setScope(VisibilityScope visibilityScope) {
            visibilityScope.getClass();
            this.scope_ = visibilityScope.getNumber();
            onChanged();
            return this;
        }

        public Builder setScopeValue(int i10) {
            this.scope_ = i10;
            onChanged();
            return this;
        }

        private Builder() {
            this.scope_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public VisibilityMetric build() {
            VisibilityMetric visibilityMetricBuildPartial = buildPartial();
            if (visibilityMetricBuildPartial.isInitialized()) {
                return visibilityMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) visibilityMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public VisibilityMetric buildPartial() {
            VisibilityMetric visibilityMetric = new VisibilityMetric(this);
            visibilityMetric.scope_ = this.scope_;
            visibilityMetric.minVisiblePercentage_ = this.minVisiblePercentage_;
            onBuilt();
            return visibilityMetric;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public VisibilityMetric mo164getDefaultInstanceForType() {
            return VisibilityMetric.getDefaultInstance();
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
            this.scope_ = 0;
            this.minVisiblePercentage_ = 0.0d;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.scope_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof VisibilityMetric) {
                return mergeFrom((VisibilityMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(VisibilityMetric visibilityMetric) {
            if (visibilityMetric == VisibilityMetric.getDefaultInstance()) {
                return this;
            }
            if (visibilityMetric.scope_ != 0) {
                setScopeValue(visibilityMetric.getScopeValue());
            }
            if (visibilityMetric.getMinVisiblePercentage() != 0.0d) {
                setMinVisiblePercentage(visibilityMetric.getMinVisiblePercentage());
            }
            mergeUnknownFields(((j0) visibilityMetric).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            VisibilityMetric visibilityMetric = null;
            try {
                try {
                    VisibilityMetric visibilityMetric2 = (VisibilityMetric) VisibilityMetric.PARSER.parsePartialFrom(nVar, yVar);
                    if (visibilityMetric2 != null) {
                        mergeFrom(visibilityMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    VisibilityMetric visibilityMetric3 = (VisibilityMetric) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        visibilityMetric = visibilityMetric3;
                        if (visibilityMetric != null) {
                            mergeFrom(visibilityMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (visibilityMetric != null) {
                    mergeFrom(visibilityMetric);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(VisibilityMetric visibilityMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(visibilityMetric);
    }

    public static VisibilityMetric parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private VisibilityMetric(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static VisibilityMetric parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (VisibilityMetric) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static VisibilityMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public VisibilityMetric mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static VisibilityMetric parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private VisibilityMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.scope_ = 0;
    }

    public static VisibilityMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static VisibilityMetric parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static VisibilityMetric parseFrom(InputStream inputStream) throws IOException {
        return (VisibilityMetric) j0.parseWithIOException(PARSER, inputStream);
    }

    private VisibilityMetric(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.scope_ = nVar.t();
                            } else if (iK != 17) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                this.minVisiblePercentage_ = nVar.s();
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

    public static VisibilityMetric parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (VisibilityMetric) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static VisibilityMetric parseFrom(n nVar) throws IOException {
        return (VisibilityMetric) j0.parseWithIOException(PARSER, nVar);
    }

    public static VisibilityMetric parseFrom(n nVar, y yVar) throws IOException {
        return (VisibilityMetric) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
