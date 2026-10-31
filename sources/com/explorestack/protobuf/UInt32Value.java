package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class UInt32Value extends j0 implements r2 {
    private static final UInt32Value DEFAULT_INSTANCE = new UInt32Value();
    private static final s1<UInt32Value> PARSER = new b<UInt32Value>() { // from class: com.explorestack.protobuf.UInt32Value.1
        @Override // com.explorestack.protobuf.s1
        public UInt32Value parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new UInt32Value(nVar, yVar);
        }
    };
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return d3.f10358k;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static UInt32Value of(int i10) {
        return newBuilder().setValue(i10).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<UInt32Value> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UInt32Value)) {
            return super.equals(obj);
        }
        UInt32Value uInt32Value = (UInt32Value) obj;
        return getValue() == uInt32Value.getValue() && this.unknownFields.equals(uInt32Value.unknownFields);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<UInt32Value> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.value_;
        int iY = (i11 != 0 ? 0 + CodedOutputStream.Y(1, i11) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = iY;
        return iY;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public int getValue() {
        return this.value_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return d3.f10359l.d(UInt32Value.class, Builder.class);
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
        return new UInt32Value();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i10 = this.value_;
        if (i10 != 0) {
            codedOutputStream.c1(1, i10);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements r2 {
        private int value_;

        public static final Descriptors.Descriptor getDescriptor() {
            return d3.f10358k;
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = j0.alwaysUseFieldBuilders;
        }

        public Builder clearValue() {
            this.value_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return d3.f10358k;
        }

        public int getValue() {
            return this.value_;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return d3.f10359l.d(UInt32Value.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setValue(int i10) {
            this.value_ = i10;
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
        public UInt32Value build() {
            UInt32Value uInt32ValueBuildPartial = buildPartial();
            if (uInt32ValueBuildPartial.isInitialized()) {
                return uInt32ValueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) uInt32ValueBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public UInt32Value buildPartial() {
            UInt32Value uInt32Value = new UInt32Value(this);
            uInt32Value.value_ = this.value_;
            onBuilt();
            return uInt32Value;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public UInt32Value mo164getDefaultInstanceForType() {
            return UInt32Value.getDefaultInstance();
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
            this.value_ = 0;
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof UInt32Value) {
                return mergeFrom((UInt32Value) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(UInt32Value uInt32Value) {
            if (uInt32Value == UInt32Value.getDefaultInstance()) {
                return this;
            }
            if (uInt32Value.getValue() != 0) {
                setValue(uInt32Value.getValue());
            }
            mergeUnknownFields(uInt32Value.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            UInt32Value uInt32Value = null;
            try {
                try {
                    UInt32Value uInt32Value2 = (UInt32Value) UInt32Value.PARSER.parsePartialFrom(nVar, yVar);
                    if (uInt32Value2 != null) {
                        mergeFrom(uInt32Value2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    UInt32Value uInt32Value3 = (UInt32Value) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        uInt32Value = uInt32Value3;
                        if (uInt32Value != null) {
                            mergeFrom(uInt32Value);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (uInt32Value != null) {
                    mergeFrom(uInt32Value);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(uInt32Value);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private UInt32Value(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (UInt32Value) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static UInt32Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public UInt32Value mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static UInt32Value parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private UInt32Value() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static UInt32Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static UInt32Value parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    private UInt32Value(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK != 8) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            this.value_ = nVar.L();
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

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) j0.parseWithIOException(PARSER, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (UInt32Value) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static UInt32Value parseFrom(n nVar) throws IOException {
        return (UInt32Value) j0.parseWithIOException(PARSER, nVar);
    }

    public static UInt32Value parseFrom(n nVar, y yVar) throws IOException {
        return (UInt32Value) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
