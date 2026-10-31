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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class LifecycleMetric extends j0 implements LifecycleMetricOrBuilder {
    public static final int REQUIRED_STATES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int requiredStatesMemoizedSerializedSize;
    private List<Integer> requiredStates_;
    private static final l0.h.a<Integer, LifecycleState> requiredStates_converter_ = new l0.h.a<Integer, LifecycleState>() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.1
        @Override // com.explorestack.protobuf.l0.h.a
        public LifecycleState convert(Integer num) {
            LifecycleState lifecycleStateValueOf = LifecycleState.valueOf(num.intValue());
            return lifecycleStateValueOf == null ? LifecycleState.UNRECOGNIZED : lifecycleStateValueOf;
        }
    };
    private static final LifecycleMetric DEFAULT_INSTANCE = new LifecycleMetric();
    private static final s1<LifecycleMetric> PARSER = new b<LifecycleMetric>() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.2
        @Override // com.explorestack.protobuf.s1
        public LifecycleMetric parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new LifecycleMetric(nVar, yVar);
        }
    };

    public enum LifecycleState implements l0.c {
        FOREGROUND(0),
        HAS_WINDOW_FOCUS(1),
        VIEW_APPEARED(2),
        UNRECOGNIZED(-1);

        public static final int FOREGROUND_VALUE = 0;
        public static final int HAS_WINDOW_FOCUS_VALUE = 1;
        public static final int VIEW_APPEARED_VALUE = 2;
        private final int value;
        private static final l0.d<LifecycleState> internalValueMap = new l0.d<LifecycleState>() { // from class: io.bidmachine.protobuf.sdk.LifecycleMetric.LifecycleState.1
            @Override // com.explorestack.protobuf.l0.d
            public LifecycleState findValueByNumber(int i10) {
                return LifecycleState.forNumber(i10);
            }
        };
        private static final LifecycleState[] VALUES = values();

        LifecycleState(int i10) {
            this.value = i10;
        }

        public static LifecycleState forNumber(int i10) {
            if (i10 == 0) {
                return FOREGROUND;
            }
            if (i10 == 1) {
                return HAS_WINDOW_FOCUS;
            }
            if (i10 != 2) {
                return null;
            }
            return VIEW_APPEARED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return LifecycleMetric.getDescriptor().getEnumTypes().get(0);
        }

        public static l0.d<LifecycleState> internalGetValueMap() {
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
        public static LifecycleState valueOf(int i10) {
            return forNumber(i10);
        }

        public static LifecycleState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static LifecycleMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static LifecycleMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LifecycleMetric) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LifecycleMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<LifecycleMetric> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleMetric)) {
            return super.equals(obj);
        }
        LifecycleMetric lifecycleMetric = (LifecycleMetric) obj;
        return this.requiredStates_.equals(lifecycleMetric.requiredStates_) && this.unknownFields.equals(lifecycleMetric.unknownFields);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<LifecycleMetric> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public LifecycleState getRequiredStates(int i10) {
        return requiredStates_converter_.convert(this.requiredStates_.get(i10));
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public int getRequiredStatesCount() {
        return this.requiredStates_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public List<LifecycleState> getRequiredStatesList() {
        return new l0.h(this.requiredStates_, requiredStates_converter_);
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public int getRequiredStatesValue(int i10) {
        return this.requiredStates_.get(i10).intValue();
    }

    @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
    public List<Integer> getRequiredStatesValueList() {
        return this.requiredStates_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iM = 0;
        for (int i11 = 0; i11 < this.requiredStates_.size(); i11++) {
            iM += CodedOutputStream.m(this.requiredStates_.get(i11).intValue());
        }
        int iZ = 0 + iM;
        if (!getRequiredStatesList().isEmpty()) {
            iZ = iZ + 1 + CodedOutputStream.Z(iM);
        }
        this.requiredStatesMemoizedSerializedSize = iM;
        int serializedSize = iZ + this.unknownFields.getSerializedSize();
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
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getRequiredStatesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + this.requiredStates_.hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable.d(LifecycleMetric.class, Builder.class);
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
        return new LifecycleMetric();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (getRequiredStatesList().size() > 0) {
            codedOutputStream.d1(10);
            codedOutputStream.d1(this.requiredStatesMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.requiredStates_.size(); i10++) {
            codedOutputStream.w0(this.requiredStates_.get(i10).intValue());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements LifecycleMetricOrBuilder {
        private int bitField0_;
        private List<Integer> requiredStates_;

        private void ensureRequiredStatesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requiredStates_ = new ArrayList(this.requiredStates_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder addAllRequiredStates(Iterable<? extends LifecycleState> iterable) {
            ensureRequiredStatesIsMutable();
            Iterator<? extends LifecycleState> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredStates_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder addAllRequiredStatesValue(Iterable<Integer> iterable) {
            ensureRequiredStatesIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredStates_.add(Integer.valueOf(it.next().intValue()));
            }
            onChanged();
            return this;
        }

        public Builder addRequiredStates(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            ensureRequiredStatesIsMutable();
            this.requiredStates_.add(Integer.valueOf(lifecycleState.getNumber()));
            onChanged();
            return this;
        }

        public Builder addRequiredStatesValue(int i10) {
            ensureRequiredStatesIsMutable();
            this.requiredStates_.add(Integer.valueOf(i10));
            onChanged();
            return this;
        }

        public Builder clearRequiredStates() {
            this.requiredStates_ = Collections.emptyList();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public LifecycleState getRequiredStates(int i10) {
            return (LifecycleState) LifecycleMetric.requiredStates_converter_.convert(this.requiredStates_.get(i10));
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public int getRequiredStatesCount() {
            return this.requiredStates_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public List<LifecycleState> getRequiredStatesList() {
            return new l0.h(this.requiredStates_, LifecycleMetric.requiredStates_converter_);
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public int getRequiredStatesValue(int i10) {
            return this.requiredStates_.get(i10).intValue();
        }

        @Override // io.bidmachine.protobuf.sdk.LifecycleMetricOrBuilder
        public List<Integer> getRequiredStatesValueList() {
            return Collections.unmodifiableList(this.requiredStates_);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_LifecycleMetric_fieldAccessorTable.d(LifecycleMetric.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setRequiredStates(int i10, LifecycleState lifecycleState) {
            lifecycleState.getClass();
            ensureRequiredStatesIsMutable();
            this.requiredStates_.set(i10, Integer.valueOf(lifecycleState.getNumber()));
            onChanged();
            return this;
        }

        public Builder setRequiredStatesValue(int i10, int i11) {
            ensureRequiredStatesIsMutable();
            this.requiredStates_.set(i10, Integer.valueOf(i11));
            onChanged();
            return this;
        }

        private Builder() {
            this.requiredStates_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public LifecycleMetric build() {
            LifecycleMetric lifecycleMetricBuildPartial = buildPartial();
            if (lifecycleMetricBuildPartial.isInitialized()) {
                return lifecycleMetricBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) lifecycleMetricBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public LifecycleMetric buildPartial() {
            LifecycleMetric lifecycleMetric = new LifecycleMetric(this);
            if ((this.bitField0_ & 1) != 0) {
                this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
                this.bitField0_ &= -2;
            }
            lifecycleMetric.requiredStates_ = this.requiredStates_;
            onBuilt();
            return lifecycleMetric;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public LifecycleMetric mo164getDefaultInstanceForType() {
            return LifecycleMetric.getDefaultInstance();
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
            this.requiredStates_ = Collections.emptyList();
            this.bitField0_ &= -2;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.requiredStates_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof LifecycleMetric) {
                return mergeFrom((LifecycleMetric) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LifecycleMetric lifecycleMetric) {
            if (lifecycleMetric == LifecycleMetric.getDefaultInstance()) {
                return this;
            }
            if (!lifecycleMetric.requiredStates_.isEmpty()) {
                if (this.requiredStates_.isEmpty()) {
                    this.requiredStates_ = lifecycleMetric.requiredStates_;
                    this.bitField0_ &= -2;
                } else {
                    ensureRequiredStatesIsMutable();
                    this.requiredStates_.addAll(lifecycleMetric.requiredStates_);
                }
                onChanged();
            }
            mergeUnknownFields(((j0) lifecycleMetric).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            LifecycleMetric lifecycleMetric = null;
            try {
                try {
                    LifecycleMetric lifecycleMetric2 = (LifecycleMetric) LifecycleMetric.PARSER.parsePartialFrom(nVar, yVar);
                    if (lifecycleMetric2 != null) {
                        mergeFrom(lifecycleMetric2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    LifecycleMetric lifecycleMetric3 = (LifecycleMetric) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        lifecycleMetric = lifecycleMetric3;
                        if (lifecycleMetric != null) {
                            mergeFrom(lifecycleMetric);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (lifecycleMetric != null) {
                    mergeFrom(lifecycleMetric);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(LifecycleMetric lifecycleMetric) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(lifecycleMetric);
    }

    public static LifecycleMetric parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private LifecycleMetric(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static LifecycleMetric parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (LifecycleMetric) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static LifecycleMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public LifecycleMetric mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static LifecycleMetric parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private LifecycleMetric() {
        this.memoizedIsInitialized = (byte) -1;
        this.requiredStates_ = Collections.emptyList();
    }

    public static LifecycleMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static LifecycleMetric parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static LifecycleMetric parseFrom(InputStream inputStream) throws IOException {
        return (LifecycleMetric) j0.parseWithIOException(PARSER, inputStream);
    }

    private LifecycleMetric(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            int iT = nVar.t();
                            if (!(z11 & true)) {
                                this.requiredStates_ = new ArrayList();
                                z11 |= true;
                            }
                            this.requiredStates_.add(Integer.valueOf(iT));
                        } else if (iK != 10) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            int iP = nVar.p(nVar.C());
                            while (nVar.d() > 0) {
                                int iT2 = nVar.t();
                                if (!(z11 & true)) {
                                    this.requiredStates_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.requiredStates_.add(Integer.valueOf(iT2));
                            }
                            nVar.o(iP);
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.requiredStates_ = Collections.unmodifiableList(this.requiredStates_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static LifecycleMetric parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (LifecycleMetric) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static LifecycleMetric parseFrom(n nVar) throws IOException {
        return (LifecycleMetric) j0.parseWithIOException(PARSER, nVar);
    }

    public static LifecycleMetric parseFrom(n nVar, y yVar) throws IOException {
        return (LifecycleMetric) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
