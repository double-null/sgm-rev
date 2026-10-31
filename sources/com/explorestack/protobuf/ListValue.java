package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ListValue extends j0 implements t0 {
    private static final ListValue DEFAULT_INSTANCE = new ListValue();
    private static final s1<ListValue> PARSER = new b<ListValue>() { // from class: com.explorestack.protobuf.ListValue.1
        @Override // com.explorestack.protobuf.s1
        public ListValue parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new ListValue(nVar, yVar);
        }
    };
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return j2.f10601g;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<ListValue> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        return getValuesList().equals(listValue.getValuesList()) && this.unknownFields.equals(listValue.unknownFields);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<ListValue> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.values_.size(); i11++) {
            iG += CodedOutputStream.G(1, this.values_.get(i11));
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public Value getValues(int i10) {
        return this.values_.get(i10);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public b3 getValuesOrBuilder(int i10) {
        return this.values_.get(i10);
    }

    public List<? extends b3> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getValuesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getValuesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return j2.f10602h.d(ListValue.class, Builder.class);
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
        return new ListValue();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.values_.size(); i10++) {
            codedOutputStream.L0(1, this.values_.get(i10));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements t0 {
        private int bitField0_;
        private z1<Value, Value.Builder, b3> valuesBuilder_;
        private List<Value> values_;

        private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.values_ = new ArrayList(this.values_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return j2.f10601g;
        }

        private z1<Value, Value.Builder, b3> getValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new z1<>(this.values_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getValuesFieldBuilder();
            }
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                ensureValuesIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.values_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addValues(Value value) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(value);
                onChanged();
            } else {
                z1Var.e(value);
            }
            return this;
        }

        public Value.Builder addValuesBuilder() {
            return (Value.Builder) getValuesFieldBuilder().c(Value.getDefaultInstance());
        }

        public Builder clearValues() {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                this.values_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return j2.f10601g;
        }

        public Value getValues(int i10) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            return z1Var == null ? this.values_.get(i10) : (Value) z1Var.n(i10);
        }

        public Value.Builder getValuesBuilder(int i10) {
            return (Value.Builder) getValuesFieldBuilder().k(i10);
        }

        public List<Value.Builder> getValuesBuilderList() {
            return getValuesFieldBuilder().l();
        }

        public int getValuesCount() {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            return z1Var == null ? this.values_.size() : z1Var.m();
        }

        public List<Value> getValuesList() {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.values_) : z1Var.p();
        }

        public b3 getValuesOrBuilder(int i10) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            return z1Var == null ? this.values_.get(i10) : (b3) z1Var.q(i10);
        }

        public List<? extends b3> getValuesOrBuilderList() {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.values_);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return j2.f10602h.d(ListValue.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeValues(int i10) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                ensureValuesIsMutable();
                this.values_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setValues(int i10, Value value) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.set(i10, value);
                onChanged();
            } else {
                z1Var.w(i10, value);
            }
            return this;
        }

        private Builder() {
            this.values_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) listValueBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this);
            int i10 = this.bitField0_;
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                if ((i10 & 1) != 0) {
                    this.values_ = Collections.unmodifiableList(this.values_);
                    this.bitField0_ &= -2;
                }
                listValue.values_ = this.values_;
            } else {
                listValue.values_ = z1Var.f();
            }
            onBuilt();
            return listValue;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public ListValue mo164getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
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

        public Value.Builder addValuesBuilder(int i10) {
            return (Value.Builder) getValuesFieldBuilder().b(i10, Value.getDefaultInstance());
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
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                this.values_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.values_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addValues(int i10, Value value) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i10, value);
                onChanged();
            } else {
                z1Var.d(i10, value);
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
            if (message instanceof ListValue) {
                return mergeFrom((ListValue) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setValues(int i10, Value.Builder builder) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                ensureValuesIsMutable();
                this.values_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.valuesBuilder_ == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = listValue.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                if (!this.valuesBuilder_.t()) {
                    this.valuesBuilder_.a(listValue.values_);
                } else {
                    this.valuesBuilder_.h();
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = j0.alwaysUseFieldBuilders ? getValuesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(listValue.unknownFields);
            onChanged();
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                ensureValuesIsMutable();
                this.values_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addValues(int i10, Value.Builder builder) {
            z1<Value, Value.Builder, b3> z1Var = this.valuesBuilder_;
            if (z1Var == null) {
                ensureValuesIsMutable();
                this.values_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            ListValue listValue = null;
            try {
                try {
                    ListValue listValue2 = (ListValue) ListValue.PARSER.parsePartialFrom(nVar, yVar);
                    if (listValue2 != null) {
                        mergeFrom(listValue2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    ListValue listValue3 = (ListValue) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        listValue = listValue3;
                        if (listValue != null) {
                            mergeFrom(listValue);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (listValue != null) {
                    mergeFrom(listValue);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private ListValue(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (ListValue) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public ListValue mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ListValue parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.emptyList();
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static ListValue parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) j0.parseWithIOException(PARSER, inputStream);
    }

    private ListValue(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                        if (iK != 10) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            if (!(z11 & true)) {
                                this.values_ = new ArrayList();
                                z11 |= true;
                            }
                            this.values_.add((Value) nVar.A(Value.parser(), yVar));
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
                    this.values_ = Collections.unmodifiableList(this.values_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.values_ = Collections.unmodifiableList(this.values_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static ListValue parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (ListValue) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static ListValue parseFrom(n nVar) throws IOException {
        return (ListValue) j0.parseWithIOException(PARSER, nVar);
    }

    public static ListValue parseFrom(n nVar, y yVar) throws IOException {
        return (ListValue) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
