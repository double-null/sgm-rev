package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class Extras extends j0 implements ExtrasOrBuilder {
    public static final int INTERNAL_FIELD_NUMBER = 2;
    public static final int PRIVATE_FIELD_NUMBER = 1;
    public static final int PUBLIC_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Struct internal_;
    private byte memoizedIsInitialized;
    private Struct private_;
    private Struct public_;
    private static final Extras DEFAULT_INSTANCE = new Extras();
    private static final s1<Extras> PARSER = new b<Extras>() { // from class: io.bidmachine.protobuf.Extras.1
        @Override // com.explorestack.protobuf.s1
        public Extras parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Extras(nVar, yVar);
        }
    };

    public static Extras getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Extras parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Extras) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Extras parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Extras> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extras)) {
            return super.equals(obj);
        }
        Extras extras = (Extras) obj;
        if (hasPrivate() != extras.hasPrivate()) {
            return false;
        }
        if ((hasPrivate() && !getPrivate().equals(extras.getPrivate())) || hasInternal() != extras.hasInternal()) {
            return false;
        }
        if ((!hasInternal() || getInternal().equals(extras.getInternal())) && hasPublic() == extras.hasPublic()) {
            return (!hasPublic() || getPublic().equals(extras.getPublic())) && this.unknownFields.equals(extras.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getInternal() {
        Struct struct = this.internal_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public i2 getInternalOrBuilder() {
        return getInternal();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Extras> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getPrivate() {
        Struct struct = this.private_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public i2 getPrivateOrBuilder() {
        return getPrivate();
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public Struct getPublic() {
        Struct struct = this.public_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public i2 getPublicOrBuilder() {
        return getPublic();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.private_ != null ? 0 + CodedOutputStream.G(1, getPrivate()) : 0;
        if (this.internal_ != null) {
            iG += CodedOutputStream.G(2, getInternal());
        }
        if (this.public_ != null) {
            iG += CodedOutputStream.G(3, getPublic());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasInternal() {
        return this.internal_ != null;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasPrivate() {
        return this.private_ != null;
    }

    @Override // io.bidmachine.protobuf.ExtrasOrBuilder
    public boolean hasPublic() {
        return this.public_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasPrivate()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPrivate().hashCode();
        }
        if (hasInternal()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getInternal().hashCode();
        }
        if (hasPublic()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getPublic().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_fieldAccessorTable.d(Extras.class, Builder.class);
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
        return new Extras();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.private_ != null) {
            codedOutputStream.L0(1, getPrivate());
        }
        if (this.internal_ != null) {
            codedOutputStream.L0(2, getInternal());
        }
        if (this.public_ != null) {
            codedOutputStream.L0(3, getPublic());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements ExtrasOrBuilder {
        private e2<Struct, Struct.Builder, i2> internalBuilder_;
        private Struct internal_;
        private e2<Struct, Struct.Builder, i2> privateBuilder_;
        private Struct private_;
        private e2<Struct, Struct.Builder, i2> publicBuilder_;
        private Struct public_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
        }

        private e2<Struct, Struct.Builder, i2> getInternalFieldBuilder() {
            if (this.internalBuilder_ == null) {
                this.internalBuilder_ = new e2<>(getInternal(), getParentForChildren(), isClean());
                this.internal_ = null;
            }
            return this.internalBuilder_;
        }

        private e2<Struct, Struct.Builder, i2> getPrivateFieldBuilder() {
            if (this.privateBuilder_ == null) {
                this.privateBuilder_ = new e2<>(getPrivate(), getParentForChildren(), isClean());
                this.private_ = null;
            }
            return this.privateBuilder_;
        }

        private e2<Struct, Struct.Builder, i2> getPublicFieldBuilder() {
            if (this.publicBuilder_ == null) {
                this.publicBuilder_ = new e2<>(getPublic(), getParentForChildren(), isClean());
                this.public_ = null;
            }
            return this.publicBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearInternal() {
            if (this.internalBuilder_ == null) {
                this.internal_ = null;
                onChanged();
            } else {
                this.internal_ = null;
                this.internalBuilder_ = null;
            }
            return this;
        }

        public Builder clearPrivate() {
            if (this.privateBuilder_ == null) {
                this.private_ = null;
                onChanged();
            } else {
                this.private_ = null;
                this.privateBuilder_ = null;
            }
            return this;
        }

        public Builder clearPublic() {
            if (this.publicBuilder_ == null) {
                this.public_ = null;
                onChanged();
            } else {
                this.public_ = null;
                this.publicBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_descriptor;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getInternal() {
            e2<Struct, Struct.Builder, i2> e2Var = this.internalBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.internal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getInternalBuilder() {
            onChanged();
            return (Struct.Builder) getInternalFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public i2 getInternalOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.internalBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.internal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getPrivate() {
            e2<Struct, Struct.Builder, i2> e2Var = this.privateBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.private_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getPrivateBuilder() {
            onChanged();
            return (Struct.Builder) getPrivateFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public i2 getPrivateOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.privateBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.private_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public Struct getPublic() {
            e2<Struct, Struct.Builder, i2> e2Var = this.publicBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.public_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getPublicBuilder() {
            onChanged();
            return (Struct.Builder) getPublicFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public i2 getPublicOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.publicBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.public_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasInternal() {
            return (this.internalBuilder_ == null && this.internal_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasPrivate() {
            return (this.privateBuilder_ == null && this.private_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ExtrasOrBuilder
        public boolean hasPublic() {
            return (this.publicBuilder_ == null && this.public_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_Extras_fieldAccessorTable.d(Extras.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeInternal(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.internalBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.internal_;
                if (struct2 != null) {
                    this.internal_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.internal_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        public Builder mergePrivate(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.privateBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.private_;
                if (struct2 != null) {
                    this.private_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.private_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        public Builder mergePublic(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.publicBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.public_;
                if (struct2 != null) {
                    this.public_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.public_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        public Builder setInternal(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.internalBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.internal_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
            return this;
        }

        public Builder setPrivate(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.privateBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.private_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
            return this;
        }

        public Builder setPublic(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.publicBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.public_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
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
        public Extras build() {
            Extras extrasBuildPartial = buildPartial();
            if (extrasBuildPartial.isInitialized()) {
                return extrasBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) extrasBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Extras buildPartial() {
            Extras extras = new Extras(this);
            e2<Struct, Struct.Builder, i2> e2Var = this.privateBuilder_;
            if (e2Var == null) {
                extras.private_ = this.private_;
            } else {
                extras.private_ = (Struct) e2Var.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var2 = this.internalBuilder_;
            if (e2Var2 == null) {
                extras.internal_ = this.internal_;
            } else {
                extras.internal_ = (Struct) e2Var2.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var3 = this.publicBuilder_;
            if (e2Var3 == null) {
                extras.public_ = this.public_;
            } else {
                extras.public_ = (Struct) e2Var3.a();
            }
            onBuilt();
            return extras;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Extras mo164getDefaultInstanceForType() {
            return Extras.getDefaultInstance();
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
            if (this.privateBuilder_ == null) {
                this.private_ = null;
            } else {
                this.private_ = null;
                this.privateBuilder_ = null;
            }
            if (this.internalBuilder_ == null) {
                this.internal_ = null;
            } else {
                this.internal_ = null;
                this.internalBuilder_ = null;
            }
            if (this.publicBuilder_ == null) {
                this.public_ = null;
            } else {
                this.public_ = null;
                this.publicBuilder_ = null;
            }
            return this;
        }

        public Builder setInternal(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.internalBuilder_;
            if (e2Var == null) {
                this.internal_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setPrivate(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.privateBuilder_;
            if (e2Var == null) {
                this.private_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setPublic(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.publicBuilder_;
            if (e2Var == null) {
                this.public_ = builder.build();
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
            if (message instanceof Extras) {
                return mergeFrom((Extras) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Extras extras) {
            if (extras == Extras.getDefaultInstance()) {
                return this;
            }
            if (extras.hasPrivate()) {
                mergePrivate(extras.getPrivate());
            }
            if (extras.hasInternal()) {
                mergeInternal(extras.getInternal());
            }
            if (extras.hasPublic()) {
                mergePublic(extras.getPublic());
            }
            mergeUnknownFields(((j0) extras).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Extras extras = null;
            try {
                try {
                    Extras extras2 = (Extras) Extras.PARSER.parsePartialFrom(nVar, yVar);
                    if (extras2 != null) {
                        mergeFrom(extras2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Extras extras3 = (Extras) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        extras = extras3;
                        if (extras != null) {
                            mergeFrom(extras);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (extras != null) {
                    mergeFrom(extras);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Extras extras) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(extras);
    }

    public static Extras parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Extras(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Extras parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Extras) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Extras parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Extras mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Extras parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Extras() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Extras parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Extras parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    private Extras(n nVar, y yVar) throws InvalidProtocolBufferException {
        Struct.Builder builder;
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            Struct struct = this.private_;
                            builder = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                            this.private_ = struct2;
                            if (builder != null) {
                                builder.mergeFrom(struct2);
                                this.private_ = builder.buildPartial();
                            }
                        } else if (iK == 18) {
                            Struct struct3 = this.internal_;
                            builder = struct3 != null ? struct3.toBuilder() : null;
                            Struct struct4 = (Struct) nVar.A(Struct.parser(), yVar);
                            this.internal_ = struct4;
                            if (builder != null) {
                                builder.mergeFrom(struct4);
                                this.internal_ = builder.buildPartial();
                            }
                        } else if (iK != 26) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            Struct struct5 = this.public_;
                            builder = struct5 != null ? struct5.toBuilder() : null;
                            Struct struct6 = (Struct) nVar.A(Struct.parser(), yVar);
                            this.public_ = struct6;
                            if (builder != null) {
                                builder.mergeFrom(struct6);
                                this.public_ = builder.buildPartial();
                            }
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

    public static Extras parseFrom(InputStream inputStream) throws IOException {
        return (Extras) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Extras parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Extras) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Extras parseFrom(n nVar) throws IOException {
        return (Extras) j0.parseWithIOException(PARSER, nVar);
    }

    public static Extras parseFrom(n nVar, y yVar) throws IOException {
        return (Extras) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
