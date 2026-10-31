package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.d;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.a;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes4.dex */
public final class ResponsePayload extends j0 implements ResponsePayloadOrBuilder {
    public static final int CACHE_TIME_FIELD_NUMBER = 1;
    private static final ResponsePayload DEFAULT_INSTANCE = new ResponsePayload();
    private static final s1<ResponsePayload> PARSER = new b<ResponsePayload>() { // from class: io.bidmachine.protobuf.ResponsePayload.1
        @Override // com.explorestack.protobuf.s1
        public ResponsePayload parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new ResponsePayload(nVar, yVar);
        }
    };
    public static final int REQUEST_ITEM_SPEC_FIELD_NUMBER = 4;
    public static final int RESPONSE_CACHE_FIELD_NUMBER = 3;
    public static final int RESPONSE_CACHE_URL_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Timestamp cacheTime_;
    private byte memoizedIsInitialized;
    private int payloadOneofCase_;
    private Object payloadOneof_;
    private Placement requestItemSpec_;

    /* JADX INFO: renamed from: io.bidmachine.protobuf.ResponsePayload$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase;

        static {
            int[] iArr = new int[PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase = iArr;
            try {
                iArr[PayloadOneofCase.RESPONSE_CACHE_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[PayloadOneofCase.RESPONSE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class Builder extends j0.b<Builder> implements ResponsePayloadOrBuilder {
        private e2<Timestamp, Timestamp.Builder, n2> cacheTimeBuilder_;
        private Timestamp cacheTime_;
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private e2<Placement, Placement.Builder, d> requestItemSpecBuilder_;
        private Placement requestItemSpec_;
        private e2<Openrtb, Openrtb.Builder, a> responseCacheBuilder_;

        private e2<Timestamp, Timestamp.Builder, n2> getCacheTimeFieldBuilder() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTimeBuilder_ = new e2<>(getCacheTime(), getParentForChildren(), isClean());
                this.cacheTime_ = null;
            }
            return this.cacheTimeBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        private e2<Placement, Placement.Builder, d> getRequestItemSpecFieldBuilder() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpecBuilder_ = new e2<>(getRequestItemSpec(), getParentForChildren(), isClean());
                this.requestItemSpec_ = null;
            }
            return this.requestItemSpecBuilder_;
        }

        private e2<Openrtb, Openrtb.Builder, a> getResponseCacheFieldBuilder() {
            if (this.responseCacheBuilder_ == null) {
                if (this.payloadOneofCase_ != 3) {
                    this.payloadOneof_ = Openrtb.getDefaultInstance();
                }
                this.responseCacheBuilder_ = new e2<>((Openrtb) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 3;
            onChanged();
            return this.responseCacheBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearCacheTime() {
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
                onChanged();
            } else {
                this.cacheTime_ = null;
                this.cacheTimeBuilder_ = null;
            }
            return this;
        }

        public Builder clearPayloadOneof() {
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequestItemSpec() {
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
                onChanged();
            } else {
                this.requestItemSpec_ = null;
                this.requestItemSpecBuilder_ = null;
            }
            return this;
        }

        public Builder clearResponseCache() {
            e2<Openrtb, Openrtb.Builder, a> e2Var = this.responseCacheBuilder_;
            if (e2Var != null) {
                if (this.payloadOneofCase_ == 3) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                e2Var.b();
            } else if (this.payloadOneofCase_ == 3) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearResponseCacheUrl() {
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Timestamp getCacheTime() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.cacheTimeBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getCacheTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getCacheTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public n2 getCacheTimeOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.cacheTimeBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.cacheTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Placement getRequestItemSpec() {
            e2<Placement, Placement.Builder, d> e2Var = this.requestItemSpecBuilder_;
            if (e2Var != null) {
                return (Placement) e2Var.e();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getRequestItemSpecBuilder() {
            onChanged();
            return (Placement.Builder) getRequestItemSpecFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public d getRequestItemSpecOrBuilder() {
            e2<Placement, Placement.Builder, d> e2Var = this.requestItemSpecBuilder_;
            if (e2Var != null) {
                return (d) e2Var.f();
            }
            Placement placement = this.requestItemSpec_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public Openrtb getResponseCache() {
            e2<Openrtb, Openrtb.Builder, a> e2Var = this.responseCacheBuilder_;
            if (e2Var == null) {
                return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
            }
            return this.payloadOneofCase_ == 3 ? (Openrtb) e2Var.e() : Openrtb.getDefaultInstance();
        }

        public Openrtb.Builder getResponseCacheBuilder() {
            return (Openrtb.Builder) getResponseCacheFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public a getResponseCacheOrBuilder() {
            e2<Openrtb, Openrtb.Builder, a> e2Var;
            int i10 = this.payloadOneofCase_;
            if (i10 != 3 || (e2Var = this.responseCacheBuilder_) == null) {
                return i10 == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
            }
            return (a) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public String getResponseCacheUrl() {
            Object obj = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasCacheTime() {
            return (this.cacheTimeBuilder_ == null && this.cacheTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasRequestItemSpec() {
            return (this.requestItemSpecBuilder_ == null && this.requestItemSpec_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasResponseCache() {
            return this.payloadOneofCase_ == 3;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public boolean hasResponseCacheUrl() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.d(ResponsePayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCacheTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.cacheTimeBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.cacheTime_;
                if (timestamp2 != null) {
                    this.cacheTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.cacheTime_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeRequestItemSpec(Placement placement) {
            e2<Placement, Placement.Builder, d> e2Var = this.requestItemSpecBuilder_;
            if (e2Var == null) {
                Placement placement2 = this.requestItemSpec_;
                if (placement2 != null) {
                    this.requestItemSpec_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
                } else {
                    this.requestItemSpec_ = placement;
                }
                onChanged();
            } else {
                e2Var.g(placement);
            }
            return this;
        }

        public Builder mergeResponseCache(Openrtb openrtb) {
            e2<Openrtb, Openrtb.Builder, a> e2Var = this.responseCacheBuilder_;
            if (e2Var == null) {
                if (this.payloadOneofCase_ != 3 || this.payloadOneof_ == Openrtb.getDefaultInstance()) {
                    this.payloadOneof_ = openrtb;
                } else {
                    this.payloadOneof_ = Openrtb.newBuilder((Openrtb) this.payloadOneof_).mergeFrom(openrtb).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 3) {
                    e2Var.g(openrtb);
                }
                this.responseCacheBuilder_.i(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setCacheTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.cacheTimeBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.cacheTime_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setRequestItemSpec(Placement placement) {
            e2<Placement, Placement.Builder, d> e2Var = this.requestItemSpecBuilder_;
            if (e2Var == null) {
                placement.getClass();
                this.requestItemSpec_ = placement;
                onChanged();
            } else {
                e2Var.i(placement);
            }
            return this;
        }

        public Builder setResponseCache(Openrtb openrtb) {
            e2<Openrtb, Openrtb.Builder, a> e2Var = this.responseCacheBuilder_;
            if (e2Var == null) {
                openrtb.getClass();
                this.payloadOneof_ = openrtb;
                onChanged();
            } else {
                e2Var.i(openrtb);
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder setResponseCacheUrl(String str) {
            str.getClass();
            this.payloadOneofCase_ = 2;
            this.payloadOneof_ = str;
            onChanged();
            return this;
        }

        public Builder setResponseCacheUrlBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.payloadOneofCase_ = 2;
            this.payloadOneof_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
        public ByteString getResponseCacheUrlBytes() {
            Object obj = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : GEmOVMyH.JHmbpiLEPH;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.payloadOneofCase_ == 2) {
                this.payloadOneof_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        private Builder() {
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ResponsePayload build() {
            ResponsePayload responsePayloadBuildPartial = buildPartial();
            if (responsePayloadBuildPartial.isInitialized()) {
                return responsePayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) responsePayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ResponsePayload buildPartial() {
            ResponsePayload responsePayload = new ResponsePayload(this);
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.cacheTimeBuilder_;
            if (e2Var == null) {
                responsePayload.cacheTime_ = this.cacheTime_;
            } else {
                responsePayload.cacheTime_ = (Timestamp) e2Var.a();
            }
            e2<Placement, Placement.Builder, d> e2Var2 = this.requestItemSpecBuilder_;
            if (e2Var2 == null) {
                responsePayload.requestItemSpec_ = this.requestItemSpec_;
            } else {
                responsePayload.requestItemSpec_ = (Placement) e2Var2.a();
            }
            if (this.payloadOneofCase_ == 2) {
                responsePayload.payloadOneof_ = this.payloadOneof_;
            }
            if (this.payloadOneofCase_ == 3) {
                e2<Openrtb, Openrtb.Builder, a> e2Var3 = this.responseCacheBuilder_;
                if (e2Var3 == null) {
                    responsePayload.payloadOneof_ = this.payloadOneof_;
                } else {
                    responsePayload.payloadOneof_ = e2Var3.a();
                }
            }
            responsePayload.payloadOneofCase_ = this.payloadOneofCase_;
            onBuilt();
            return responsePayload;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public ResponsePayload mo164getDefaultInstanceForType() {
            return ResponsePayload.getDefaultInstance();
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
            if (this.cacheTimeBuilder_ == null) {
                this.cacheTime_ = null;
            } else {
                this.cacheTime_ = null;
                this.cacheTimeBuilder_ = null;
            }
            if (this.requestItemSpecBuilder_ == null) {
                this.requestItemSpec_ = null;
            } else {
                this.requestItemSpec_ = null;
                this.requestItemSpecBuilder_ = null;
            }
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setCacheTime(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.cacheTimeBuilder_;
            if (e2Var == null) {
                this.cacheTime_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setRequestItemSpec(Placement.Builder builder) {
            e2<Placement, Placement.Builder, d> e2Var = this.requestItemSpecBuilder_;
            if (e2Var == null) {
                this.requestItemSpec_ = builder.build();
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
            if (message instanceof ResponsePayload) {
                return mergeFrom((ResponsePayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setResponseCache(Openrtb.Builder builder) {
            e2<Openrtb, Openrtb.Builder, a> e2Var = this.responseCacheBuilder_;
            if (e2Var == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadOneofCase_ = 3;
            return this;
        }

        public Builder mergeFrom(ResponsePayload responsePayload) {
            if (responsePayload == ResponsePayload.getDefaultInstance()) {
                return this;
            }
            if (responsePayload.hasCacheTime()) {
                mergeCacheTime(responsePayload.getCacheTime());
            }
            if (responsePayload.hasRequestItemSpec()) {
                mergeRequestItemSpec(responsePayload.getRequestItemSpec());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$ResponsePayload$PayloadOneofCase[responsePayload.getPayloadOneofCase().ordinal()];
            if (i10 == 1) {
                this.payloadOneofCase_ = 2;
                this.payloadOneof_ = responsePayload.payloadOneof_;
                onChanged();
            } else if (i10 == 2) {
                mergeResponseCache(responsePayload.getResponseCache());
            }
            mergeUnknownFields(((j0) responsePayload).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            ResponsePayload responsePayload = null;
            try {
                try {
                    ResponsePayload responsePayload2 = (ResponsePayload) ResponsePayload.PARSER.parsePartialFrom(nVar, yVar);
                    if (responsePayload2 != null) {
                        mergeFrom(responsePayload2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    ResponsePayload responsePayload3 = (ResponsePayload) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        responsePayload = responsePayload3;
                        if (responsePayload != null) {
                            mergeFrom(responsePayload);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (responsePayload != null) {
                    mergeFrom(responsePayload);
                }
                throw th;
            }
        }
    }

    public enum PayloadOneofCase implements l0.c {
        RESPONSE_CACHE_URL(2),
        RESPONSE_CACHE(3),
        PAYLOADONEOF_NOT_SET(0);

        private final int value;

        PayloadOneofCase(int i10) {
            this.value = i10;
        }

        public static PayloadOneofCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOADONEOF_NOT_SET;
            }
            if (i10 == 2) {
                return RESPONSE_CACHE_URL;
            }
            if (i10 != 3) {
                return null;
            }
            return RESPONSE_CACHE;
        }

        @Override // com.explorestack.protobuf.l0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadOneofCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static ResponsePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<ResponsePayload> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponsePayload)) {
            return super.equals(obj);
        }
        ResponsePayload responsePayload = (ResponsePayload) obj;
        if (hasCacheTime() != responsePayload.hasCacheTime()) {
            return false;
        }
        if ((hasCacheTime() && !getCacheTime().equals(responsePayload.getCacheTime())) || hasRequestItemSpec() != responsePayload.hasRequestItemSpec()) {
            return false;
        }
        if ((hasRequestItemSpec() && !getRequestItemSpec().equals(responsePayload.getRequestItemSpec())) || !getPayloadOneofCase().equals(responsePayload.getPayloadOneofCase())) {
            return false;
        }
        int i10 = this.payloadOneofCase_;
        if (i10 != 2) {
            if (i10 == 3 && !getResponseCache().equals(responsePayload.getResponseCache())) {
                return false;
            }
        } else if (!getResponseCacheUrl().equals(responsePayload.getResponseCacheUrl())) {
            return false;
        }
        return this.unknownFields.equals(responsePayload.unknownFields);
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Timestamp getCacheTime() {
        Timestamp timestamp = this.cacheTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public n2 getCacheTimeOrBuilder() {
        return getCacheTime();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<ResponsePayload> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public PayloadOneofCase getPayloadOneofCase() {
        return PayloadOneofCase.forNumber(this.payloadOneofCase_);
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Placement getRequestItemSpec() {
        Placement placement = this.requestItemSpec_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public d getRequestItemSpecOrBuilder() {
        return getRequestItemSpec();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public Openrtb getResponseCache() {
        return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public a getResponseCacheOrBuilder() {
        return this.payloadOneofCase_ == 3 ? (Openrtb) this.payloadOneof_ : Openrtb.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public String getResponseCacheUrl() {
        Object obj = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public ByteString getResponseCacheUrlBytes() {
        Object obj = this.payloadOneofCase_ == 2 ? this.payloadOneof_ : "";
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        if (this.payloadOneofCase_ == 2) {
            this.payloadOneof_ = byteStringCopyFromUtf8;
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.cacheTime_ != null ? 0 + CodedOutputStream.G(1, getCacheTime()) : 0;
        if (this.payloadOneofCase_ == 2) {
            iG += j0.computeStringSize(2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            iG += CodedOutputStream.G(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            iG += CodedOutputStream.G(4, getRequestItemSpec());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasCacheTime() {
        return this.cacheTime_ != null;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasRequestItemSpec() {
        return this.requestItemSpec_ != null;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasResponseCache() {
        return this.payloadOneofCase_ == 3;
    }

    @Override // io.bidmachine.protobuf.ResponsePayloadOrBuilder
    public boolean hasResponseCacheUrl() {
        return this.payloadOneofCase_ == 2;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = 779 + getDescriptor().hashCode();
        if (hasCacheTime()) {
            iHashCode2 = (((iHashCode2 * 37) + 1) * 53) + getCacheTime().hashCode();
        }
        if (hasRequestItemSpec()) {
            iHashCode2 = (((iHashCode2 * 37) + 4) * 53) + getRequestItemSpec().hashCode();
        }
        int i12 = this.payloadOneofCase_;
        if (i12 != 2) {
            if (i12 == 3) {
                i10 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = getResponseCache().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 2) * 53;
        iHashCode = getResponseCacheUrl().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable.d(ResponsePayload.class, Builder.class);
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
        return new ResponsePayload();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.cacheTime_ != null) {
            codedOutputStream.L0(1, getCacheTime());
        }
        if (this.payloadOneofCase_ == 2) {
            j0.writeString(codedOutputStream, 2, this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 3) {
            codedOutputStream.L0(3, (Openrtb) this.payloadOneof_);
        }
        if (this.requestItemSpec_ != null) {
            codedOutputStream.L0(4, getRequestItemSpec());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(ResponsePayload responsePayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(responsePayload);
    }

    public static ResponsePayload parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private ResponsePayload(j0.b<?> bVar) {
        super(bVar);
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ResponsePayload parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (ResponsePayload) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static ResponsePayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public ResponsePayload mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ResponsePayload parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ResponsePayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    private ResponsePayload() {
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ResponsePayload parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static ResponsePayload parseFrom(InputStream inputStream) throws IOException {
        return (ResponsePayload) j0.parseWithIOException(PARSER, inputStream);
    }

    private ResponsePayload(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            if (iK == 10) {
                                Timestamp timestamp = this.cacheTime_;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                                this.cacheTime_ = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.cacheTime_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                String strJ = nVar.J();
                                this.payloadOneofCase_ = 2;
                                this.payloadOneof_ = strJ;
                            } else if (iK == 26) {
                                Openrtb.Builder builder2 = this.payloadOneofCase_ == 3 ? ((Openrtb) this.payloadOneof_).toBuilder() : null;
                                MessageLite messageLiteA = nVar.A(Openrtb.parser(), yVar);
                                this.payloadOneof_ = messageLiteA;
                                if (builder2 != null) {
                                    builder2.mergeFrom((Openrtb) messageLiteA);
                                    this.payloadOneof_ = builder2.buildPartial();
                                }
                                this.payloadOneofCase_ = 3;
                            } else if (iK != 34) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Placement placement = this.requestItemSpec_;
                                Placement.Builder builder3 = placement != null ? placement.toBuilder() : null;
                                Placement placement2 = (Placement) nVar.A(Placement.parser(), yVar);
                                this.requestItemSpec_ = placement2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(placement2);
                                    this.requestItemSpec_ = builder3.buildPartial();
                                }
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

    public static ResponsePayload parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (ResponsePayload) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static ResponsePayload parseFrom(n nVar) throws IOException {
        return (ResponsePayload) j0.parseWithIOException(PARSER, nVar);
    }

    public static ResponsePayload parseFrom(n nVar, y yVar) throws IOException {
        return (ResponsePayload) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
