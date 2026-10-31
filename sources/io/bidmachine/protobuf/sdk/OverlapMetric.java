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
public final class OverlapMetric extends j0 implements OverlapMetricOrBuilder {
    public static final int MAX_OVERLAP_PERCENTAGE_FIELD_NUMBER = 2;
    public static final int SCOPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private double maxOverlapPercentage_;
    private byte memoizedIsInitialized;
    private int scope_;
    private static final OverlapMetric DEFAULT_INSTANCE = new OverlapMetric();
    private static final s1<OverlapMetric> PARSER = new b<OverlapMetric>() { // from class: io.bidmachine.protobuf.sdk.OverlapMetric.1
        @Override // com.explorestack.protobuf.s1
        public OverlapMetric parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new OverlapMetric(nVar, yVar);
        }
    };

    public enum OverlapScope implements l0.c {
        VIEW_SIBLINGS(0),
        ALL_VIEWS(1),
        WINDOWS(2),
        UNRECOGNIZED(-1);

        public static final int ALL_VIEWS_VALUE = 1;
        public static final int VIEW_SIBLINGS_VALUE = 0;
        public static final int WINDOWS_VALUE = 2;
        private final int value;
        private static final l0.d<OverlapScope> internalValueMap = new l0.d<OverlapScope>() { // from class: io.bidmachine.protobuf.sdk.OverlapMetric.OverlapScope.1
            @Override // com.explorestack.protobuf.l0.d
            public OverlapScope findValueByNumber(int i10) {
                return OverlapScope.forNumber(i10);
            }
        };
        private static final OverlapScope[] VALUES = values();

        OverlapScope(int i10) {
            this.value = i10;
        }

        public static OverlapScope forNumber(int i10) {
            if (i10 == 0) {
                return VIEW_SIBLINGS;
            }
            if (i10 == 1) {
                return ALL_VIEWS;
            }
            if (i10 != 2) {
                return null;
            }
            return WINDOWS;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return OverlapMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static l0.d<OverlapScope> internalGetValueMap() {
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
        public static OverlapScope valueOf(int i10) {
            return forNumber(i10);
        }

        public static OverlapScope valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static OverlapMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static OverlapMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OverlapMetric) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OverlapMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<OverlapMetric> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverlapMetric)) {
            return super.equals(obj);
        }
        OverlapMetric overlapMetric = (OverlapMetric) obj;
        return this.scope_ == overlapMetric.scope_ && Double.doubleToLongBits(getMaxOverlapPercentage()) == Double.doubleToLongBits(overlapMetric.getMaxOverlapPercentage()) && this.unknownFields.equals(overlapMetric.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.OverlapMetricOrBuilder
    public double getMaxOverlapPercentage() {
        return this.maxOverlapPercentage_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<OverlapMetric> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.OverlapMetricOrBuilder
    public OverlapScope getScope() {
        OverlapScope overlapScopeValueOf = OverlapScope.valueOf(this.scope_);
        return overlapScopeValueOf == null ? OverlapScope.UNRECOGNIZED : overlapScopeValueOf;
    }

    @Override // io.bidmachine.protobuf.sdk.OverlapMetricOrBuilder
    public int getScopeValue() {
        return this.scope_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iL = this.scope_ != OverlapScope.VIEW_SIBLINGS.getNumber() ? 0 + CodedOutputStream.l(1, this.scope_) : 0;
        double d10 = this.maxOverlapPercentage_;
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
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.scope_) * 37) + 2) * 53) + l0.i(Double.doubleToLongBits(getMaxOverlapPercentage()))) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_fieldAccessorTable.d(OverlapMetric.class, Builder.class);
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
        return new OverlapMetric();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.scope_ != OverlapScope.VIEW_SIBLINGS.getNumber()) {
            codedOutputStream.v0(1, this.scope_);
        }
        double d10 = this.maxOverlapPercentage_;
        if (d10 != 0.0d) {
            codedOutputStream.t0(2, d10);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements OverlapMetricOrBuilder {
        private double maxOverlapPercentage_;
        private int scope_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearMaxOverlapPercentage() {
            this.maxOverlapPercentage_ = 0.0d;
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
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.OverlapMetricOrBuilder
        public double getMaxOverlapPercentage() {
            return this.maxOverlapPercentage_;
        }

        @Override // io.bidmachine.protobuf.sdk.OverlapMetricOrBuilder
        public OverlapScope getScope() {
            OverlapScope overlapScopeValueOf = OverlapScope.valueOf(this.scope_);
            return overlapScopeValueOf == null ? OverlapScope.UNRECOGNIZED : overlapScopeValueOf;
        }

        @Override // io.bidmachine.protobuf.sdk.OverlapMetricOrBuilder
        public int getScopeValue() {
            return this.scope_;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_OverlapMetric_fieldAccessorTable.d(OverlapMetric.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setMaxOverlapPercentage(double d10) {
            this.maxOverlapPercentage_ = d10;
            onChanged();
            return this;
        }

        public Builder setScope(OverlapScope overlapScope) {
            overlapScope.getClass();
            this.scope_ = overlapScope.getNumber();
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
        public OverlapMetric build() {
            OverlapMetric overlapMetricBuildPartial = buildPartial();
            if (overlapMetricBuildPartial.isInitialized()) {
                return overlapMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) overlapMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OverlapMetric buildPartial() {
            OverlapMetric overlapMetric = new OverlapMetric(this);
            overlapMetric.scope_ = this.scope_;
            overlapMetric.maxOverlapPercentage_ = this.maxOverlapPercentage_;
            onBuilt();
            return overlapMetric;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public OverlapMetric mo164getDefaultInstanceForType() {
            return OverlapMetric.getDefaultInstance();
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
            this.maxOverlapPercentage_ = 0.0d;
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
            if (message instanceof OverlapMetric) {
                return mergeFrom((OverlapMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(OverlapMetric overlapMetric) {
            if (overlapMetric == OverlapMetric.getDefaultInstance()) {
                return this;
            }
            if (overlapMetric.scope_ != 0) {
                setScopeValue(overlapMetric.getScopeValue());
            }
            if (overlapMetric.getMaxOverlapPercentage() != 0.0d) {
                setMaxOverlapPercentage(overlapMetric.getMaxOverlapPercentage());
            }
            mergeUnknownFields(((j0) overlapMetric).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            OverlapMetric overlapMetric = null;
            try {
                try {
                    OverlapMetric overlapMetric2 = (OverlapMetric) OverlapMetric.PARSER.parsePartialFrom(nVar, yVar);
                    if (overlapMetric2 != null) {
                        mergeFrom(overlapMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    OverlapMetric overlapMetric3 = (OverlapMetric) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        overlapMetric = overlapMetric3;
                        if (overlapMetric != null) {
                            mergeFrom(overlapMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (overlapMetric != null) {
                    mergeFrom(overlapMetric);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(OverlapMetric overlapMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(overlapMetric);
    }

    public static OverlapMetric parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private OverlapMetric(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static OverlapMetric parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (OverlapMetric) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static OverlapMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public OverlapMetric mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static OverlapMetric parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private OverlapMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.scope_ = 0;
    }

    public static OverlapMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static OverlapMetric parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static OverlapMetric parseFrom(InputStream inputStream) throws IOException {
        return (OverlapMetric) j0.parseWithIOException(PARSER, inputStream);
    }

    private OverlapMetric(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.maxOverlapPercentage_ = nVar.s();
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

    public static OverlapMetric parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (OverlapMetric) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static OverlapMetric parseFrom(n nVar) throws IOException {
        return (OverlapMetric) j0.parseWithIOException(PARSER, nVar);
    }

    public static OverlapMetric parseFrom(n nVar, y yVar) throws IOException {
        return (OverlapMetric) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
