package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Error extends j0 implements ErrorOrBuilder {
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Data error_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Data reason_;
    private static final Error DEFAULT_INSTANCE = new Error();
    private static final s1<Error> PARSER = new b<Error>() { // from class: io.bidmachine.protobuf.sdk.Error.1
        @Override // com.explorestack.protobuf.s1
        public Error parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Error(nVar, yVar);
        }
    };

    public static final class Data extends j0 implements DataOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int code_;
        private volatile Object description_;
        private byte memoizedIsInitialized;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final s1<Data> PARSER = new b<Data>() { // from class: io.bidmachine.protobuf.sdk.Error.Data.1
            @Override // com.explorestack.protobuf.s1
            public Data parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Data(nVar, yVar);
            }
        };

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Data> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            return getCode() == data.getCode() && getDescription().equals(data.getDescription()) && this.unknownFields.equals(data.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Data> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.code_;
            int iR = i11 != 0 ? 0 + CodedOutputStream.R(1, i11) : 0;
            if (!getDescriptionBytes().isEmpty()) {
                iR += j0.computeStringSize(2, this.description_);
            }
            int serializedSize = iR + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable.d(Data.class, Builder.class);
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
            return new Data();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i10 = this.code_;
            if (i10 != 0) {
                codedOutputStream.V0(1, i10);
            }
            if (!getDescriptionBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 2, this.description_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements DataOrBuilder {
            private int code_;
            private Object description_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = Data.getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable.d(Data.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(int i10) {
                this.code_ = i10;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.description_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.code_ = this.code_;
                data.description_ = this.description_;
                onBuilt();
                return data;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Data mo164getDefaultInstanceForType() {
                return Data.getDefaultInstance();
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
                this.code_ = 0;
                this.description_ = "";
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (data.getCode() != 0) {
                    setCode(data.getCode());
                }
                if (!data.getDescription().isEmpty()) {
                    this.description_ = data.description_;
                    onChanged();
                }
                mergeUnknownFields(((j0) data).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Data data = null;
                try {
                    try {
                        Data data2 = (Data) Data.PARSER.parsePartialFrom(nVar, yVar);
                        if (data2 != null) {
                            mergeFrom(data2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Data data3 = (Data) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            data = data3;
                            if (data != null) {
                                mergeFrom(data);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (data != null) {
                        mergeFrom(data);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Data(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Data parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Data) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Data mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Data parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.description_ = "";
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Data parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) j0.parseWithIOException(PARSER, inputStream);
        }

        private Data(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    this.code_ = nVar.G();
                                } else if (iK != 18) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    this.description_ = nVar.J();
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

        public static Data parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Data) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Data parseFrom(n nVar) throws IOException {
            return (Data) j0.parseWithIOException(PARSER, nVar);
        }

        public static Data parseFrom(n nVar, y yVar) throws IOException {
            return (Data) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface DataOrBuilder extends MessageOrBuilder {
        int getCode();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Error getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Error) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Error> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return super.equals(obj);
        }
        Error error = (Error) obj;
        if (!getName().equals(error.getName()) || hasError() != error.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(error.getError())) && hasReason() == error.hasReason()) {
            return (!hasReason() || getReason().equals(error.getReason())) && this.unknownFields.equals(error.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getError() {
        Data data = this.error_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Error> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getReason() {
        Data data = this.reason_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getReasonOrBuilder() {
        return getReason();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getNameBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.name_);
        if (this.error_ != null) {
            iComputeStringSize += CodedOutputStream.G(2, getError());
        }
        if (this.reason_ != null) {
            iComputeStringSize += CodedOutputStream.G(3, getReason());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasReason() {
        return this.reason_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (hasError()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getError().hashCode();
        }
        if (hasReason()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getReason().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable.d(Error.class, Builder.class);
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
        return new Error();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.name_);
        }
        if (this.error_ != null) {
            codedOutputStream.L0(2, getError());
        }
        if (this.reason_ != null) {
            codedOutputStream.L0(3, getReason());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements ErrorOrBuilder {
        private e2<Data, Data.Builder, DataOrBuilder> errorBuilder_;
        private Data error_;
        private Object name_;
        private e2<Data, Data.Builder, DataOrBuilder> reasonBuilder_;
        private Data reason_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        private e2<Data, Data.Builder, DataOrBuilder> getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new e2<>(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private e2<Data, Data.Builder, DataOrBuilder> getReasonFieldBuilder() {
            if (this.reasonBuilder_ == null) {
                this.reasonBuilder_ = new e2<>(getReason(), getParentForChildren(), isClean());
                this.reason_ = null;
            }
            return this.reasonBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            return this;
        }

        public Builder clearName() {
            this.name_ = Error.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearReason() {
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                onChanged();
            } else {
                this.reason_ = null;
                this.reasonBuilder_ = null;
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getError() {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var != null) {
                return (Data) e2Var.e();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        public Data.Builder getErrorBuilder() {
            onChanged();
            return (Data.Builder) getErrorFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getErrorOrBuilder() {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var != null) {
                return (DataOrBuilder) e2Var.f();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getReason() {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.reasonBuilder_;
            if (e2Var != null) {
                return (Data) e2Var.e();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        public Data.Builder getReasonBuilder() {
            onChanged();
            return (Data.Builder) getReasonFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getReasonOrBuilder() {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.reasonBuilder_;
            if (e2Var != null) {
                return (DataOrBuilder) e2Var.f();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasReason() {
            return (this.reasonBuilder_ == null && this.reason_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable.d(Error.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeError(Data data) {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var == null) {
                Data data2 = this.error_;
                if (data2 != null) {
                    this.error_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
                } else {
                    this.error_ = data;
                }
                onChanged();
            } else {
                e2Var.g(data);
            }
            return this;
        }

        public Builder mergeReason(Data data) {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.reasonBuilder_;
            if (e2Var == null) {
                Data data2 = this.reason_;
                if (data2 != null) {
                    this.reason_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
                } else {
                    this.reason_ = data;
                }
                onChanged();
            } else {
                e2Var.g(data);
            }
            return this;
        }

        public Builder setError(Data data) {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var == null) {
                data.getClass();
                this.error_ = data;
                onChanged();
            } else {
                e2Var.i(data);
            }
            return this;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        public Builder setReason(Data data) {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.reasonBuilder_;
            if (e2Var == null) {
                data.getClass();
                this.reason_ = data;
                onChanged();
            } else {
                e2Var.i(data);
            }
            return this;
        }

        private Builder() {
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error build() {
            Error errorBuildPartial = buildPartial();
            if (errorBuildPartial.isInitialized()) {
                return errorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error buildPartial() {
            Error error = new Error(this);
            error.name_ = this.name_;
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var == null) {
                error.error_ = this.error_;
            } else {
                error.error_ = (Data) e2Var.a();
            }
            e2<Data, Data.Builder, DataOrBuilder> e2Var2 = this.reasonBuilder_;
            if (e2Var2 == null) {
                error.reason_ = this.reason_;
            } else {
                error.reason_ = (Data) e2Var2.a();
            }
            onBuilt();
            return error;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Error mo164getDefaultInstanceForType() {
            return Error.getDefaultInstance();
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
            this.name_ = "";
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
            } else {
                this.reason_ = null;
                this.reasonBuilder_ = null;
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setError(Data.Builder builder) {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var == null) {
                this.error_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setReason(Data.Builder builder) {
            e2<Data, Data.Builder, DataOrBuilder> e2Var = this.reasonBuilder_;
            if (e2Var == null) {
                this.reason_ = builder.build();
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
            if (message instanceof Error) {
                return mergeFrom((Error) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Error error) {
            if (error == Error.getDefaultInstance()) {
                return this;
            }
            if (!error.getName().isEmpty()) {
                this.name_ = error.name_;
                onChanged();
            }
            if (error.hasError()) {
                mergeError(error.getError());
            }
            if (error.hasReason()) {
                mergeReason(error.getReason());
            }
            mergeUnknownFields(((j0) error).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Error error = null;
            try {
                try {
                    Error error2 = (Error) Error.PARSER.parsePartialFrom(nVar, yVar);
                    if (error2 != null) {
                        mergeFrom(error2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Error error3 = (Error) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        error = error3;
                        if (error != null) {
                            mergeFrom(error);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (error != null) {
                    mergeFrom(error);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Error error) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
    }

    public static Error parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Error(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Error parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Error) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Error mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Error parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Error() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Error parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Error parseFrom(InputStream inputStream) throws IOException {
        return (Error) j0.parseWithIOException(PARSER, inputStream);
    }

    private Error(n nVar, y yVar) throws InvalidProtocolBufferException {
        Data.Builder builder;
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
                            if (iK != 10) {
                                if (iK == 18) {
                                    Data data = this.error_;
                                    builder = data != null ? data.toBuilder() : null;
                                    Data data2 = (Data) nVar.A(Data.parser(), yVar);
                                    this.error_ = data2;
                                    if (builder != null) {
                                        builder.mergeFrom(data2);
                                        this.error_ = builder.buildPartial();
                                    }
                                } else if (iK != 26) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    Data data3 = this.reason_;
                                    builder = data3 != null ? data3.toBuilder() : null;
                                    Data data4 = (Data) nVar.A(Data.parser(), yVar);
                                    this.reason_ = data4;
                                    if (builder != null) {
                                        builder.mergeFrom(data4);
                                        this.reason_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.name_ = nVar.J();
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

    public static Error parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Error) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Error parseFrom(n nVar) throws IOException {
        return (Error) j0.parseWithIOException(PARSER, nVar);
    }

    public static Error parseFrom(n nVar, y yVar) throws IOException {
        return (Error) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
