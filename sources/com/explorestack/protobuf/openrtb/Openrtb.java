package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Openrtb extends j0 implements a {
    public static final int DOMAINSPEC_FIELD_NUMBER = 2;
    public static final int DOMAINVER_FIELD_NUMBER = 3;
    public static final int REQUEST_FIELD_NUMBER = 4;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    public static final int VER_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object domainspec_;
    private volatile Object domainver_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private volatile Object ver_;
    private static final Openrtb DEFAULT_INSTANCE = new Openrtb();
    private static final s1<Openrtb> PARSER = new com.explorestack.protobuf.b<Openrtb>() { // from class: com.explorestack.protobuf.openrtb.Openrtb.1
        @Override // com.explorestack.protobuf.s1
        public Openrtb parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Openrtb(nVar, yVar);
        }
    };

    /* JADX INFO: renamed from: com.explorestack.protobuf.openrtb.Openrtb$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase = iArr;
            try {
                iArr[PayloadCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum PayloadCase implements l0.c {
        REQUEST(4),
        RESPONSE(5),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 4) {
                return REQUEST;
            }
            if (i10 != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.l0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Openrtb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f10713a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Openrtb) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Openrtb> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Openrtb)) {
            return super.equals(obj);
        }
        Openrtb openrtb = (Openrtb) obj;
        if (!getVer().equals(openrtb.getVer()) || !getDomainspec().equals(openrtb.getDomainspec()) || !getDomainver().equals(openrtb.getDomainver()) || !getPayloadCase().equals(openrtb.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 4) {
            if (i10 == 5 && !getResponse().equals(openrtb.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(openrtb.getRequest())) {
            return false;
        }
        return this.unknownFields.equals(openrtb.unknownFields);
    }

    public String getDomainspec() {
        Object obj = this.domainspec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainspec_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainspecBytes() {
        Object obj = this.domainspec_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainspec_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getDomainver() {
        Object obj = this.domainver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.domainver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDomainverBytes() {
        Object obj = this.domainver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.domainver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Openrtb> getParserForType() {
        return PARSER;
    }

    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    public Request getRequest() {
        return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
    }

    public c getRequestOrBuilder() {
        return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
    }

    public Response getResponse() {
        return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
    }

    public d getResponseOrBuilder() {
        return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getVerBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.ver_);
        if (!getDomainspecBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            iComputeStringSize += CodedOutputStream.G(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            iComputeStringSize += CodedOutputStream.G(5, (Response) this.payload_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public String getVer() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVerBytes() {
        Object obj = this.ver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean hasRequest() {
        return this.payloadCase_ == 4;
    }

    public boolean hasResponse() {
        return this.payloadCase_ == 5;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVer().hashCode()) * 37) + 2) * 53) + getDomainspec().hashCode()) * 37) + 3) * 53) + getDomainver().hashCode();
        int i12 = this.payloadCase_;
        if (i12 != 4) {
            if (i12 == 5) {
                i10 = ((iHashCode2 * 37) + 5) * 53;
                iHashCode = getResponse().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 4) * 53;
        iHashCode = getRequest().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return b.f10714b.d(Openrtb.class, Builder.class);
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
        return new Openrtb();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getVerBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.ver_);
        }
        if (!getDomainspecBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.domainspec_);
        }
        if (!getDomainverBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 3, this.domainver_);
        }
        if (this.payloadCase_ == 4) {
            codedOutputStream.L0(4, (Request) this.payload_);
        }
        if (this.payloadCase_ == 5) {
            codedOutputStream.L0(5, (Response) this.payload_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements a {
        private Object domainspec_;
        private Object domainver_;
        private int payloadCase_;
        private Object payload_;
        private e2<Request, Request.Builder, c> requestBuilder_;
        private e2<Response, Response.Builder, d> responseBuilder_;
        private Object ver_;

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f10713a;
        }

        private e2<Request, Request.Builder, c> getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadCase_ != 4) {
                    this.payload_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new e2<>((Request) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 4;
            onChanged();
            return this.requestBuilder_;
        }

        private e2<Response, Response.Builder, d> getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadCase_ != 5) {
                    this.payload_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new e2<>((Response) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 5;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearDomainspec() {
            this.domainspec_ = Openrtb.getDefaultInstance().getDomainspec();
            onChanged();
            return this;
        }

        public Builder clearDomainver() {
            this.domainver_ = Openrtb.getDefaultInstance().getDomainver();
            onChanged();
            return this;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            e2<Request, Request.Builder, c> e2Var = this.requestBuilder_;
            if (e2Var != null) {
                if (this.payloadCase_ == 4) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                e2Var.b();
            } else if (this.payloadCase_ == 4) {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearResponse() {
            e2<Response, Response.Builder, d> e2Var = this.responseBuilder_;
            if (e2Var != null) {
                if (this.payloadCase_ == 5) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                e2Var.b();
            } else if (this.payloadCase_ == 5) {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearVer() {
            this.ver_ = Openrtb.getDefaultInstance().getVer();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f10713a;
        }

        public String getDomainspec() {
            Object obj = this.domainspec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainspec_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainspecBytes() {
            Object obj = this.domainspec_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainspec_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getDomainver() {
            Object obj = this.domainver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domainver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDomainverBytes() {
            Object obj = this.domainver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domainver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        public Request getRequest() {
            e2<Request, Request.Builder, c> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                return this.payloadCase_ == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
            }
            return this.payloadCase_ == 4 ? (Request) e2Var.e() : Request.getDefaultInstance();
        }

        public Request.Builder getRequestBuilder() {
            return (Request.Builder) getRequestFieldBuilder().d();
        }

        public c getRequestOrBuilder() {
            e2<Request, Request.Builder, c> e2Var;
            int i10 = this.payloadCase_;
            if (i10 != 4 || (e2Var = this.requestBuilder_) == null) {
                return i10 == 4 ? (Request) this.payload_ : Request.getDefaultInstance();
            }
            return (c) e2Var.f();
        }

        public Response getResponse() {
            e2<Response, Response.Builder, d> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                return this.payloadCase_ == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
            }
            return this.payloadCase_ == 5 ? (Response) e2Var.e() : Response.getDefaultInstance();
        }

        public Response.Builder getResponseBuilder() {
            return (Response.Builder) getResponseFieldBuilder().d();
        }

        public d getResponseOrBuilder() {
            e2<Response, Response.Builder, d> e2Var;
            int i10 = this.payloadCase_;
            if (i10 != 5 || (e2Var = this.responseBuilder_) == null) {
                return i10 == 5 ? (Response) this.payload_ : Response.getDefaultInstance();
            }
            return (d) e2Var.f();
        }

        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean hasRequest() {
            return this.payloadCase_ == 4;
        }

        public boolean hasResponse() {
            return this.payloadCase_ == 5;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return b.f10714b.d(Openrtb.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Request request) {
            e2<Request, Request.Builder, c> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                if (this.payloadCase_ != 4 || this.payload_ == Request.getDefaultInstance()) {
                    this.payload_ = request;
                } else {
                    this.payload_ = Request.newBuilder((Request) this.payload_).mergeFrom(request).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 4) {
                    e2Var.g(request);
                }
                this.requestBuilder_.i(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder mergeResponse(Response response) {
            e2<Response, Response.Builder, d> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                if (this.payloadCase_ != 5 || this.payload_ == Response.getDefaultInstance()) {
                    this.payload_ = response;
                } else {
                    this.payload_ = Response.newBuilder((Response) this.payload_).mergeFrom(response).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 5) {
                    e2Var.g(response);
                }
                this.responseBuilder_.i(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setDomainspec(String str) {
            str.getClass();
            this.domainspec_ = str;
            onChanged();
            return this;
        }

        public Builder setDomainspecBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.domainspec_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDomainver(String str) {
            str.getClass();
            this.domainver_ = str;
            onChanged();
            return this;
        }

        public Builder setDomainverBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.domainver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setRequest(Request request) {
            e2<Request, Request.Builder, c> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                request.getClass();
                this.payload_ = request;
                onChanged();
            } else {
                e2Var.i(request);
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setResponse(Response response) {
            e2<Response, Response.Builder, d> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                response.getClass();
                this.payload_ = response;
                onChanged();
            } else {
                e2Var.i(response);
            }
            this.payloadCase_ = 5;
            return this;
        }

        public Builder setVer(String str) {
            str.getClass();
            this.ver_ = str;
            onChanged();
            return this;
        }

        public Builder setVerBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.ver_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb build() {
            Openrtb openrtbBuildPartial = buildPartial();
            if (openrtbBuildPartial.isInitialized()) {
                return openrtbBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) openrtbBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Openrtb buildPartial() {
            Openrtb openrtb = new Openrtb(this);
            openrtb.ver_ = this.ver_;
            openrtb.domainspec_ = this.domainspec_;
            openrtb.domainver_ = this.domainver_;
            if (this.payloadCase_ == 4) {
                e2<Request, Request.Builder, c> e2Var = this.requestBuilder_;
                if (e2Var == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = e2Var.a();
                }
            }
            if (this.payloadCase_ == 5) {
                e2<Response, Response.Builder, d> e2Var2 = this.responseBuilder_;
                if (e2Var2 == null) {
                    openrtb.payload_ = this.payload_;
                } else {
                    openrtb.payload_ = e2Var2.a();
                }
            }
            openrtb.payloadCase_ = this.payloadCase_;
            onBuilt();
            return openrtb;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Openrtb mo164getDefaultInstanceForType() {
            return Openrtb.getDefaultInstance();
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
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Openrtb) {
                return mergeFrom((Openrtb) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            e2<Request, Request.Builder, c> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadCase_ = 4;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            e2<Response, Response.Builder, d> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadCase_ = 5;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.payloadCase_ = 0;
            this.ver_ = "";
            this.domainspec_ = "";
            this.domainver_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(Openrtb openrtb) {
            if (openrtb == Openrtb.getDefaultInstance()) {
                return this;
            }
            if (!openrtb.getVer().isEmpty()) {
                this.ver_ = openrtb.ver_;
                onChanged();
            }
            if (!openrtb.getDomainspec().isEmpty()) {
                this.domainspec_ = openrtb.domainspec_;
                onChanged();
            }
            if (!openrtb.getDomainver().isEmpty()) {
                this.domainver_ = openrtb.domainver_;
                onChanged();
            }
            int i10 = AnonymousClass2.$SwitchMap$com$explorestack$protobuf$openrtb$Openrtb$PayloadCase[openrtb.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeRequest(openrtb.getRequest());
            } else if (i10 == 2) {
                mergeResponse(openrtb.getResponse());
            }
            mergeUnknownFields(((j0) openrtb).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Openrtb openrtb = null;
            try {
                try {
                    Openrtb openrtb2 = (Openrtb) Openrtb.PARSER.parsePartialFrom(nVar, yVar);
                    if (openrtb2 != null) {
                        mergeFrom(openrtb2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Openrtb openrtb3 = (Openrtb) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        openrtb = openrtb3;
                        if (openrtb != null) {
                            mergeFrom(openrtb);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (openrtb != null) {
                    mergeFrom(openrtb);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Openrtb openrtb) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(openrtb);
    }

    public static Openrtb parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Openrtb(j0.b<?> bVar) {
        super(bVar);
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Openrtb parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Openrtb) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Openrtb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Openrtb mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Openrtb parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Openrtb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    private Openrtb() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.ver_ = "";
        this.domainspec_ = "";
        this.domainver_ = "";
    }

    public static Openrtb parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Openrtb parseFrom(InputStream inputStream) throws IOException {
        return (Openrtb) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Openrtb parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Openrtb) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Openrtb parseFrom(n nVar) throws IOException {
        return (Openrtb) j0.parseWithIOException(PARSER, nVar);
    }

    private Openrtb(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            this.ver_ = nVar.J();
                        } else if (iK == 18) {
                            this.domainspec_ = nVar.J();
                        } else if (iK != 26) {
                            if (iK == 34) {
                                Request.Builder builder = this.payloadCase_ == 4 ? ((Request) this.payload_).toBuilder() : null;
                                MessageLite messageLiteA = nVar.A(Request.parser(), yVar);
                                this.payload_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((Request) messageLiteA);
                                    this.payload_ = builder.buildPartial();
                                }
                                this.payloadCase_ = 4;
                            } else if (iK != 42) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Response.Builder builder2 = this.payloadCase_ == 5 ? ((Response) this.payload_).toBuilder() : null;
                                MessageLite messageLiteA2 = nVar.A(Response.parser(), yVar);
                                this.payload_ = messageLiteA2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((Response) messageLiteA2);
                                    this.payload_ = builder2.buildPartial();
                                }
                                this.payloadCase_ = 5;
                            }
                        } else {
                            this.domainver_ = nVar.J();
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

    public static Openrtb parseFrom(n nVar, y yVar) throws IOException {
        return (Openrtb) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
