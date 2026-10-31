package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Struct extends j0 implements i2 {
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private y0<String, Value> fields_;
    private byte memoizedIsInitialized;
    private static final Struct DEFAULT_INSTANCE = new Struct();
    private static final s1<Struct> PARSER = new b<Struct>() { // from class: com.explorestack.protobuf.Struct.1
        @Override // com.explorestack.protobuf.s1
        public Struct parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Struct(nVar, yVar);
        }
    };

    private static final class FieldsDefaultEntryHolder {
        static final w0<String, Value> defaultEntry = w0.s(j2.f10597c, c3.b.f10262k, "", c3.b.f10264m, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return j2.f10595a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0<String, Value> internalGetFields() {
        y0<String, Value> y0Var = this.fields_;
        return y0Var == null ? y0.h(FieldsDefaultEntryHolder.defaultEntry) : y0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Struct> parser() {
        return PARSER;
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().j().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        return internalGetFields().equals(struct.internalGetFields()) && this.unknownFields.equals(struct.unknownFields);
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().j().size();
    }

    public Map<String, Value> getFieldsMap() {
        return internalGetFields().j();
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map<String, Value> mapJ = internalGetFields().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map<String, Value> mapJ = internalGetFields().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Struct> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (Map.Entry<String, Value> entry : internalGetFields().j().entrySet()) {
            iG += CodedOutputStream.G(1, FieldsDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
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
        if (!internalGetFields().j().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return j2.f10596b.d(Struct.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.j0
    protected y0 internalGetMapField(int i10) {
        if (i10 == 1) {
            return internalGetFields();
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
        return new Struct();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        j0.serializeStringMapTo(codedOutputStream, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements i2 {
        private int bitField0_;
        private y0<String, Value> fields_;

        public static final Descriptors.Descriptor getDescriptor() {
            return j2.f10595a;
        }

        private y0<String, Value> internalGetFields() {
            y0<String, Value> y0Var = this.fields_;
            return y0Var == null ? y0.h(FieldsDefaultEntryHolder.defaultEntry) : y0Var;
        }

        private y0<String, Value> internalGetMutableFields() {
            onChanged();
            if (this.fields_ == null) {
                this.fields_ = y0.q(FieldsDefaultEntryHolder.defaultEntry);
            }
            if (!this.fields_.n()) {
                this.fields_ = this.fields_.g();
            }
            return this.fields_;
        }

        private void maybeForceBuilderInitialization() {
            boolean z10 = j0.alwaysUseFieldBuilders;
        }

        public Builder clearFields() {
            internalGetMutableFields().m().clear();
            return this;
        }

        public boolean containsFields(String str) {
            str.getClass();
            return internalGetFields().j().containsKey(str);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return j2.f10595a;
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        public int getFieldsCount() {
            return internalGetFields().j().size();
        }

        public Map<String, Value> getFieldsMap() {
            return internalGetFields().j();
        }

        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map<String, Value> mapJ = internalGetFields().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : value;
        }

        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, Value> mapJ = internalGetFields().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            return internalGetMutableFields().m();
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return j2.f10596b.d(Struct.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMapField(int i10) {
            if (i10 == 1) {
                return internalGetFields();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMutableMapField(int i10) {
            if (i10 == 1) {
                return internalGetMutableFields();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllFields(Map<String, Value> map) {
            internalGetMutableFields().m().putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            internalGetMutableFields().m().put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            internalGetMutableFields().m().remove(str);
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
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) structBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Struct buildPartial() {
            Struct struct = new Struct(this);
            struct.fields_ = internalGetFields();
            struct.fields_.o();
            onBuilt();
            return struct;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Struct mo164getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
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
            internalGetMutableFields().b();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Struct) {
                return mergeFrom((Struct) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().p(struct.internalGetFields());
            mergeUnknownFields(struct.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Struct struct = null;
            try {
                try {
                    Struct struct2 = (Struct) Struct.PARSER.parsePartialFrom(nVar, yVar);
                    if (struct2 != null) {
                        mergeFrom(struct2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Struct struct3 = (Struct) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        struct = struct3;
                        if (struct != null) {
                            mergeFrom(struct);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (struct != null) {
                    mergeFrom(struct);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Struct(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Struct) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Struct mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Struct parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Struct parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Struct(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.fields_ = y0.q(FieldsDefaultEntryHolder.defaultEntry);
                                z11 |= true;
                            }
                            w0 w0Var = (w0) nVar.A(FieldsDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                            this.fields_.m().put(w0Var.h(), w0Var.n());
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

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Struct) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Struct parseFrom(n nVar) throws IOException {
        return (Struct) j0.parseWithIOException(PARSER, nVar);
    }

    public static Struct parseFrom(n nVar, y yVar) throws IOException {
        return (Struct) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
