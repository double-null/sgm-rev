package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.y0;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.AppOrBuilder;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.DeviceOrBuilder;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.PlacementOrBuilder;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.SDKOrBuilder;
import io.bidmachine.protobuf.sdk.User;
import io.bidmachine.protobuf.sdk.UserOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestTokenPayload extends j0 implements RequestTokenPayloadOrBuilder {
    public static final int AD_TYPE_FIELD_NUMBER = 10;
    public static final int APP_DATA_FIELD_NUMBER = 6;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 4;
    public static final int DEVICE_DATA_FIELD_NUMBER = 3;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int HB_PLACEMENT_FIELD_NUMBER = 9;
    public static final int PLACEMENT_DATA_FIELD_NUMBER = 1;
    public static final int PLACEMENT_FIELD_NUMBER = 12;
    public static final int SESSION_DATA_FIELD_NUMBER = 2;
    public static final int SESSION_FIELD_NUMBER = 11;
    public static final int TOKEN_HASH_VALUE_FIELD_NUMBER = 8;
    public static final int USER_DATA_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object adType_;
    private App appData_;
    private y0<String, String> customData_;
    private Device deviceData_;
    private Struct ext_;
    private HeaderBiddingPlacement hbPlacement_;
    private byte memoizedIsInitialized;
    private SDK placementData_;
    private Placement placement_;
    private SessionData sessionData_;
    private io.bidmachine.protobuf.sdk.Session session_;
    private volatile Object tokenHashValue_;
    private User userData_;
    private static final RequestTokenPayload DEFAULT_INSTANCE = new RequestTokenPayload();
    private static final s1<RequestTokenPayload> PARSER = new b<RequestTokenPayload>() { // from class: io.bidmachine.protobuf.RequestTokenPayload.1
        @Override // com.explorestack.protobuf.s1
        public RequestTokenPayload parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new RequestTokenPayload(nVar, yVar);
        }
    };

    private static final class CustomDataDefaultEntryHolder {
        static final w0<String, String> defaultEntry;

        static {
            Descriptors.Descriptor descriptor = CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor;
            c3.b bVar = c3.b.f10262k;
            defaultEntry = w0.s(descriptor, bVar, "", bVar, "");
        }

        private CustomDataDefaultEntryHolder() {
        }
    }

    public static final class SessionData extends j0 implements SessionDataOrBuilder {
        private static final SessionData DEFAULT_INSTANCE = new SessionData();
        private static final s1<SessionData> PARSER = new b<SessionData>() { // from class: io.bidmachine.protobuf.RequestTokenPayload.SessionData.1
            @Override // com.explorestack.protobuf.s1
            public SessionData parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new SessionData(nVar, yVar);
            }
        };
        public static final int SESSIONDURATION_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SESSION_PLACEMENT_DATA_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object sessionId_;
        private y0<String, SessionPlacementData> sessionPlacementData_;
        private long sessionduration_;

        public static final class SessionPlacementData extends j0 implements SessionPlacementDataOrBuilder {
            public static final int CLICKRATE_FIELD_NUMBER = 5;
            public static final int COMPLETIONRATE_FIELD_NUMBER = 7;
            public static final int IMPDEPTH_FIELD_NUMBER = 1;
            public static final int LASTADOMAIN_FIELD_NUMBER = 4;
            public static final int LASTBUNDLE_FIELD_NUMBER = 3;
            public static final int LASTCLICK_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private float clickrate_;
            private float completionrate_;
            private int impdepth_;
            private volatile Object lastadomain_;
            private volatile Object lastbundle_;
            private boolean lastclick_;
            private byte memoizedIsInitialized;
            private static final SessionPlacementData DEFAULT_INSTANCE = new SessionPlacementData();
            private static final s1<SessionPlacementData> PARSER = new b<SessionPlacementData>() { // from class: io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.1
                @Override // com.explorestack.protobuf.s1
                public SessionPlacementData parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new SessionPlacementData(nVar, yVar);
                }
            };

            public static SessionPlacementData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<SessionPlacementData> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SessionPlacementData)) {
                    return super.equals(obj);
                }
                SessionPlacementData sessionPlacementData = (SessionPlacementData) obj;
                return getImpdepth() == sessionPlacementData.getImpdepth() && getLastbundle().equals(sessionPlacementData.getLastbundle()) && getLastadomain().equals(sessionPlacementData.getLastadomain()) && Float.floatToIntBits(getClickrate()) == Float.floatToIntBits(sessionPlacementData.getClickrate()) && getLastclick() == sessionPlacementData.getLastclick() && Float.floatToIntBits(getCompletionrate()) == Float.floatToIntBits(sessionPlacementData.getCompletionrate()) && this.unknownFields.equals(sessionPlacementData.unknownFields);
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public float getClickrate() {
                return this.clickrate_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public float getCompletionrate() {
                return this.completionrate_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public int getImpdepth() {
                return this.impdepth_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public String getLastadomain() {
                Object obj = this.lastadomain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastadomain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public ByteString getLastadomainBytes() {
                Object obj = this.lastadomain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastadomain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public String getLastbundle() {
                Object obj = this.lastbundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastbundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public ByteString getLastbundleBytes() {
                Object obj = this.lastbundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastbundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public boolean getLastclick() {
                return this.lastclick_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<SessionPlacementData> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.impdepth_;
                int iY = i11 != 0 ? 0 + CodedOutputStream.Y(1, i11) : 0;
                if (!getLastbundleBytes().isEmpty()) {
                    iY += j0.computeStringSize(3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    iY += j0.computeStringSize(4, this.lastadomain_);
                }
                float f10 = this.clickrate_;
                if (f10 != 0.0f) {
                    iY += CodedOutputStream.r(5, f10);
                }
                boolean z10 = this.lastclick_;
                if (z10) {
                    iY += CodedOutputStream.e(6, z10);
                }
                float f11 = this.completionrate_;
                if (f11 != 0.0f) {
                    iY += CodedOutputStream.r(7, f11);
                }
                int serializedSize = iY + this.unknownFields.getSerializedSize();
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
                int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImpdepth()) * 37) + 3) * 53) + getLastbundle().hashCode()) * 37) + 4) * 53) + getLastadomain().hashCode()) * 37) + 5) * 53) + Float.floatToIntBits(getClickrate())) * 37) + 6) * 53) + l0.d(getLastclick())) * 37) + 7) * 53) + Float.floatToIntBits(getCompletionrate())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.d(SessionPlacementData.class, Builder.class);
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
                return new SessionPlacementData();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                int i10 = this.impdepth_;
                if (i10 != 0) {
                    codedOutputStream.c1(1, i10);
                }
                if (!getLastbundleBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 4, this.lastadomain_);
                }
                float f10 = this.clickrate_;
                if (f10 != 0.0f) {
                    codedOutputStream.B0(5, f10);
                }
                boolean z10 = this.lastclick_;
                if (z10) {
                    codedOutputStream.n0(6, z10);
                }
                float f11 = this.completionrate_;
                if (f11 != 0.0f) {
                    codedOutputStream.B0(7, f11);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements SessionPlacementDataOrBuilder {
                private float clickrate_;
                private float completionrate_;
                private int impdepth_;
                private Object lastadomain_;
                private Object lastbundle_;
                private boolean lastclick_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = j0.alwaysUseFieldBuilders;
                }

                public Builder clearClickrate() {
                    this.clickrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCompletionrate() {
                    this.completionrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearImpdepth() {
                    this.impdepth_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLastadomain() {
                    this.lastadomain_ = SessionPlacementData.getDefaultInstance().getLastadomain();
                    onChanged();
                    return this;
                }

                public Builder clearLastbundle() {
                    this.lastbundle_ = SessionPlacementData.getDefaultInstance().getLastbundle();
                    onChanged();
                    return this;
                }

                public Builder clearLastclick() {
                    this.lastclick_ = false;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public float getClickrate() {
                    return this.clickrate_;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public float getCompletionrate() {
                    return this.completionrate_;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public int getImpdepth() {
                    return this.impdepth_;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public String getLastadomain() {
                    Object obj = this.lastadomain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastadomain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public ByteString getLastadomainBytes() {
                    Object obj = this.lastadomain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastadomain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public String getLastbundle() {
                    Object obj = this.lastbundle_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastbundle_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public ByteString getLastbundleBytes() {
                    Object obj = this.lastbundle_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastbundle_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public boolean getLastclick() {
                    return this.lastclick_;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.d(SessionPlacementData.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setClickrate(float f10) {
                    this.clickrate_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCompletionrate(float f10) {
                    this.completionrate_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setImpdepth(int i10) {
                    this.impdepth_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLastadomain(String str) {
                    str.getClass();
                    this.lastadomain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLastadomainBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.lastadomain_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLastbundle(String str) {
                    str.getClass();
                    this.lastbundle_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLastbundleBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.lastbundle_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLastclick(boolean z10) {
                    this.lastclick_ = z10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public SessionPlacementData build() {
                    SessionPlacementData sessionPlacementDataBuildPartial = buildPartial();
                    if (sessionPlacementDataBuildPartial.isInitialized()) {
                        return sessionPlacementDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionPlacementDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public SessionPlacementData buildPartial() {
                    SessionPlacementData sessionPlacementData = new SessionPlacementData(this);
                    sessionPlacementData.impdepth_ = this.impdepth_;
                    sessionPlacementData.lastbundle_ = this.lastbundle_;
                    sessionPlacementData.lastadomain_ = this.lastadomain_;
                    sessionPlacementData.clickrate_ = this.clickrate_;
                    sessionPlacementData.lastclick_ = this.lastclick_;
                    sessionPlacementData.completionrate_ = this.completionrate_;
                    onBuilt();
                    return sessionPlacementData;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public SessionPlacementData mo164getDefaultInstanceForType() {
                    return SessionPlacementData.getDefaultInstance();
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
                    this.impdepth_ = 0;
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    this.clickrate_ = 0.0f;
                    this.lastclick_ = false;
                    this.completionrate_ = 0.0f;
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                /* JADX INFO: renamed from: clone */
                public Builder mo162clone() {
                    return (Builder) super.mo162clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SessionPlacementData) {
                        return mergeFrom((SessionPlacementData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SessionPlacementData sessionPlacementData) {
                    if (sessionPlacementData == SessionPlacementData.getDefaultInstance()) {
                        return this;
                    }
                    if (sessionPlacementData.getImpdepth() != 0) {
                        setImpdepth(sessionPlacementData.getImpdepth());
                    }
                    if (!sessionPlacementData.getLastbundle().isEmpty()) {
                        this.lastbundle_ = sessionPlacementData.lastbundle_;
                        onChanged();
                    }
                    if (!sessionPlacementData.getLastadomain().isEmpty()) {
                        this.lastadomain_ = sessionPlacementData.lastadomain_;
                        onChanged();
                    }
                    if (sessionPlacementData.getClickrate() != 0.0f) {
                        setClickrate(sessionPlacementData.getClickrate());
                    }
                    if (sessionPlacementData.getLastclick()) {
                        setLastclick(sessionPlacementData.getLastclick());
                    }
                    if (sessionPlacementData.getCompletionrate() != 0.0f) {
                        setCompletionrate(sessionPlacementData.getCompletionrate());
                    }
                    mergeUnknownFields(((j0) sessionPlacementData).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    SessionPlacementData sessionPlacementData = null;
                    try {
                        try {
                            SessionPlacementData sessionPlacementData2 = (SessionPlacementData) SessionPlacementData.PARSER.parsePartialFrom(nVar, yVar);
                            if (sessionPlacementData2 != null) {
                                mergeFrom(sessionPlacementData2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            SessionPlacementData sessionPlacementData3 = (SessionPlacementData) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                sessionPlacementData = sessionPlacementData3;
                                if (sessionPlacementData != null) {
                                    mergeFrom(sessionPlacementData);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sessionPlacementData != null) {
                            mergeFrom(sessionPlacementData);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(SessionPlacementData sessionPlacementData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionPlacementData);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private SessionPlacementData(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (SessionPlacementData) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static SessionPlacementData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public SessionPlacementData mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SessionPlacementData parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SessionPlacementData() {
                this.memoizedIsInitialized = (byte) -1;
                this.lastbundle_ = "";
                this.lastadomain_ = "";
            }

            public static SessionPlacementData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static SessionPlacementData parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static SessionPlacementData parseFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) j0.parseWithIOException(PARSER, inputStream);
            }

            private SessionPlacementData(n nVar, y yVar) throws InvalidProtocolBufferException {
                this();
                yVar.getClass();
                u2.b bVarG = u2.g();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = nVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.impdepth_ = nVar.L();
                                } else if (iK == 26) {
                                    this.lastbundle_ = nVar.J();
                                } else if (iK == 34) {
                                    this.lastadomain_ = nVar.J();
                                } else if (iK == 45) {
                                    this.clickrate_ = nVar.w();
                                } else if (iK == 48) {
                                    this.lastclick_ = nVar.q();
                                } else if (iK != 61) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    this.completionrate_ = nVar.w();
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

            public static SessionPlacementData parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (SessionPlacementData) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static SessionPlacementData parseFrom(n nVar) throws IOException {
                return (SessionPlacementData) j0.parseWithIOException(PARSER, nVar);
            }

            public static SessionPlacementData parseFrom(n nVar, y yVar) throws IOException {
                return (SessionPlacementData) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        private static final class SessionPlacementDataDefaultEntryHolder {
            static final w0<String, SessionPlacementData> defaultEntry = w0.s(CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor, c3.b.f10262k, "", c3.b.f10264m, SessionPlacementData.getDefaultInstance());

            private SessionPlacementDataDefaultEntryHolder() {
            }
        }

        public interface SessionPlacementDataOrBuilder extends MessageOrBuilder {
            float getClickrate();

            float getCompletionrate();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            int getImpdepth();

            String getLastadomain();

            ByteString getLastadomainBytes();

            String getLastbundle();

            ByteString getLastbundleBytes();

            boolean getLastclick();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public y0<String, SessionPlacementData> internalGetSessionPlacementData() {
            y0<String, SessionPlacementData> y0Var = this.sessionPlacementData_;
            return y0Var == null ? y0.h(SessionPlacementDataDefaultEntryHolder.defaultEntry) : y0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<SessionData> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public boolean containsSessionPlacementData(String str) {
            str.getClass();
            return internalGetSessionPlacementData().j().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionData)) {
                return super.equals(obj);
            }
            SessionData sessionData = (SessionData) obj;
            return getSessionId().equals(sessionData.getSessionId()) && getSessionduration() == sessionData.getSessionduration() && internalGetSessionPlacementData().equals(sessionData.internalGetSessionPlacementData()) && this.unknownFields.equals(sessionData.unknownFields);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<SessionData> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = getSessionIdBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.sessionId_);
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.a0(2, j10);
            }
            for (Map.Entry<String, SessionPlacementData> entry : internalGetSessionPlacementData().j().entrySet()) {
                iComputeStringSize += CodedOutputStream.G(3, SessionPlacementDataDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        @Deprecated
        public Map<String, SessionPlacementData> getSessionPlacementData() {
            return getSessionPlacementDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public int getSessionPlacementDataCount() {
            return internalGetSessionPlacementData().j().size();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
            return internalGetSessionPlacementData().j();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
            str.getClass();
            Map<String, SessionPlacementData> mapJ = internalGetSessionPlacementData().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : sessionPlacementData;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
            str.getClass();
            Map<String, SessionPlacementData> mapJ = internalGetSessionPlacementData().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
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
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode()) * 37) + 2) * 53) + l0.i(getSessionduration());
            if (!internalGetSessionPlacementData().j().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetSessionPlacementData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.d(SessionData.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0
        protected y0 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetSessionPlacementData();
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
            return new SessionData();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getSessionIdBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 1, this.sessionId_);
            }
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                codedOutputStream.e1(2, j10);
            }
            j0.serializeStringMapTo(codedOutputStream, internalGetSessionPlacementData(), SessionPlacementDataDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements SessionDataOrBuilder {
            private int bitField0_;
            private Object sessionId_;
            private y0<String, SessionPlacementData> sessionPlacementData_;
            private long sessionduration_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            private y0<String, SessionPlacementData> internalGetMutableSessionPlacementData() {
                onChanged();
                if (this.sessionPlacementData_ == null) {
                    this.sessionPlacementData_ = y0.q(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                }
                if (!this.sessionPlacementData_.n()) {
                    this.sessionPlacementData_ = this.sessionPlacementData_.g();
                }
                return this.sessionPlacementData_;
            }

            private y0<String, SessionPlacementData> internalGetSessionPlacementData() {
                y0<String, SessionPlacementData> y0Var = this.sessionPlacementData_;
                return y0Var == null ? y0.h(SessionPlacementDataDefaultEntryHolder.defaultEntry) : y0Var;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearSessionId() {
                this.sessionId_ = SessionData.getDefaultInstance().getSessionId();
                onChanged();
                return this;
            }

            public Builder clearSessionPlacementData() {
                internalGetMutableSessionPlacementData().m().clear();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public boolean containsSessionPlacementData(String str) {
                str.getClass();
                return internalGetSessionPlacementData().j().containsKey(str);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            @Deprecated
            public Map<String, SessionPlacementData> getMutableSessionPlacementData() {
                return internalGetMutableSessionPlacementData().m();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public String getSessionId() {
                Object obj = this.sessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public ByteString getSessionIdBytes() {
                Object obj = this.sessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            @Deprecated
            public Map<String, SessionPlacementData> getSessionPlacementData() {
                return getSessionPlacementDataMap();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public int getSessionPlacementDataCount() {
                return internalGetSessionPlacementData().j().size();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
                return internalGetSessionPlacementData().j();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
                str.getClass();
                Map<String, SessionPlacementData> mapJ = internalGetSessionPlacementData().j();
                return mapJ.containsKey(str) ? mapJ.get(str) : sessionPlacementData;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
                str.getClass();
                Map<String, SessionPlacementData> mapJ = internalGetSessionPlacementData().j();
                if (mapJ.containsKey(str)) {
                    return mapJ.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.d(SessionData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected y0 internalGetMapField(int i10) {
                if (i10 == 3) {
                    return internalGetSessionPlacementData();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected y0 internalGetMutableMapField(int i10) {
                if (i10 == 3) {
                    return internalGetMutableSessionPlacementData();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllSessionPlacementData(Map<String, SessionPlacementData> map) {
                internalGetMutableSessionPlacementData().m().putAll(map);
                return this;
            }

            public Builder putSessionPlacementData(String str, SessionPlacementData sessionPlacementData) {
                str.getClass();
                sessionPlacementData.getClass();
                internalGetMutableSessionPlacementData().m().put(str, sessionPlacementData);
                return this;
            }

            public Builder removeSessionPlacementData(String str) {
                str.getClass();
                internalGetMutableSessionPlacementData().m().remove(str);
                return this;
            }

            public Builder setSessionId(String str) {
                str.getClass();
                this.sessionId_ = str;
                onChanged();
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.sessionId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSessionduration(long j10) {
                this.sessionduration_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionData build() {
                SessionData sessionDataBuildPartial = buildPartial();
                if (sessionDataBuildPartial.isInitialized()) {
                    return sessionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionData buildPartial() {
                SessionData sessionData = new SessionData(this);
                sessionData.sessionId_ = this.sessionId_;
                sessionData.sessionduration_ = this.sessionduration_;
                sessionData.sessionPlacementData_ = internalGetSessionPlacementData();
                sessionData.sessionPlacementData_.o();
                onBuilt();
                return sessionData;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public SessionData mo164getDefaultInstanceForType() {
                return SessionData.getDefaultInstance();
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
                this.sessionId_ = "";
                this.sessionduration_ = 0L;
                internalGetMutableSessionPlacementData().b();
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionData) {
                    return mergeFrom((SessionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionData sessionData) {
                if (sessionData == SessionData.getDefaultInstance()) {
                    return this;
                }
                if (!sessionData.getSessionId().isEmpty()) {
                    this.sessionId_ = sessionData.sessionId_;
                    onChanged();
                }
                if (sessionData.getSessionduration() != 0) {
                    setSessionduration(sessionData.getSessionduration());
                }
                internalGetMutableSessionPlacementData().p(sessionData.internalGetSessionPlacementData());
                mergeUnknownFields(((j0) sessionData).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                SessionData sessionData = null;
                try {
                    try {
                        SessionData sessionData2 = (SessionData) SessionData.PARSER.parsePartialFrom(nVar, yVar);
                        if (sessionData2 != null) {
                            mergeFrom(sessionData2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        SessionData sessionData3 = (SessionData) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            sessionData = sessionData3;
                            if (sessionData != null) {
                                mergeFrom(sessionData);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sessionData != null) {
                        mergeFrom(sessionData);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(SessionData sessionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionData);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private SessionData(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (SessionData) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static SessionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public SessionData mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SessionData parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SessionData() {
            this.memoizedIsInitialized = (byte) -1;
            this.sessionId_ = "";
        }

        public static SessionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static SessionData parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) j0.parseWithIOException(PARSER, inputStream);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SessionData(n nVar, y yVar) throws InvalidProtocolBufferException {
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = nVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.sessionId_ = nVar.J();
                                } else if (iK == 16) {
                                    this.sessionduration_ = nVar.M();
                                } else if (iK != 26) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    if (!(z11 & true)) {
                                        this.sessionPlacementData_ = y0.q(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                                        z11 |= true;
                                    }
                                    w0 w0Var = (w0) nVar.A(SessionPlacementDataDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                                    this.sessionPlacementData_.m().put(w0Var.h(), w0Var.n());
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

        public static SessionData parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (SessionData) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static SessionData parseFrom(n nVar) throws IOException {
            return (SessionData) j0.parseWithIOException(PARSER, nVar);
        }

        public static SessionData parseFrom(n nVar, y yVar) throws IOException {
            return (SessionData) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface SessionDataOrBuilder extends MessageOrBuilder {
        boolean containsSessionPlacementData(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        String getSessionId();

        ByteString getSessionIdBytes();

        @Deprecated
        Map<String, SessionData.SessionPlacementData> getSessionPlacementData();

        int getSessionPlacementDataCount();

        Map<String, SessionData.SessionPlacementData> getSessionPlacementDataMap();

        SessionData.SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionData.SessionPlacementData sessionPlacementData);

        SessionData.SessionPlacementData getSessionPlacementDataOrThrow(String str);

        long getSessionduration();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static RequestTokenPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0<String, String> internalGetCustomData() {
        y0<String, String> y0Var = this.customData_;
        return y0Var == null ? y0.h(CustomDataDefaultEntryHolder.defaultEntry) : y0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<RequestTokenPayload> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean containsCustomData(String str) {
        str.getClass();
        return internalGetCustomData().j().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestTokenPayload)) {
            return super.equals(obj);
        }
        RequestTokenPayload requestTokenPayload = (RequestTokenPayload) obj;
        if (!getTokenHashValue().equals(requestTokenPayload.getTokenHashValue()) || !getAdType().equals(requestTokenPayload.getAdType()) || hasPlacementData() != requestTokenPayload.hasPlacementData()) {
            return false;
        }
        if ((hasPlacementData() && !getPlacementData().equals(requestTokenPayload.getPlacementData())) || hasSessionData() != requestTokenPayload.hasSessionData()) {
            return false;
        }
        if ((hasSessionData() && !getSessionData().equals(requestTokenPayload.getSessionData())) || hasSession() != requestTokenPayload.hasSession()) {
            return false;
        }
        if ((hasSession() && !getSession().equals(requestTokenPayload.getSession())) || hasDeviceData() != requestTokenPayload.hasDeviceData()) {
            return false;
        }
        if ((hasDeviceData() && !getDeviceData().equals(requestTokenPayload.getDeviceData())) || hasUserData() != requestTokenPayload.hasUserData()) {
            return false;
        }
        if ((hasUserData() && !getUserData().equals(requestTokenPayload.getUserData())) || hasAppData() != requestTokenPayload.hasAppData()) {
            return false;
        }
        if ((hasAppData() && !getAppData().equals(requestTokenPayload.getAppData())) || hasHbPlacement() != requestTokenPayload.hasHbPlacement()) {
            return false;
        }
        if ((hasHbPlacement() && !getHbPlacement().equals(requestTokenPayload.getHbPlacement())) || !internalGetCustomData().equals(requestTokenPayload.internalGetCustomData()) || hasPlacement() != requestTokenPayload.hasPlacement()) {
            return false;
        }
        if ((!hasPlacement() || getPlacement().equals(requestTokenPayload.getPlacement())) && hasExt() == requestTokenPayload.hasExt()) {
            return (!hasExt() || getExt().equals(requestTokenPayload.getExt())) && this.unknownFields.equals(requestTokenPayload.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getAdType() {
        Object obj = this.adType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public ByteString getAdTypeBytes() {
        Object obj = this.adType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public App getAppData() {
        App app = this.appData_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public AppOrBuilder getAppDataOrBuilder() {
        return getAppData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public Map<String, String> getCustomData() {
        return getCustomDataMap();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public int getCustomDataCount() {
        return internalGetCustomData().j().size();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public Map<String, String> getCustomDataMap() {
        return internalGetCustomData().j();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getCustomDataOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> mapJ = internalGetCustomData().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getCustomDataOrThrow(String str) {
        str.getClass();
        Map<String, String> mapJ = internalGetCustomData().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Device getDeviceData() {
        Device device = this.deviceData_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public DeviceOrBuilder getDeviceDataOrBuilder() {
        return getDeviceData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public i2 getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public HeaderBiddingPlacement getHbPlacement() {
        HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
        return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
        return getHbPlacement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<RequestTokenPayload> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Placement getPlacement() {
        Placement placement = this.placement_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public SDK getPlacementData() {
        SDK sdk = this.placementData_;
        return sdk == null ? SDK.getDefaultInstance() : sdk;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public SDKOrBuilder getPlacementDataOrBuilder() {
        return getPlacementData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public PlacementOrBuilder getPlacementOrBuilder() {
        return getPlacement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.placementData_ != null ? 0 + CodedOutputStream.G(1, getPlacementData()) : 0;
        if (this.sessionData_ != null) {
            iG += CodedOutputStream.G(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            iG += CodedOutputStream.G(3, getDeviceData());
        }
        for (Map.Entry<String, String> entry : internalGetCustomData().j().entrySet()) {
            iG += CodedOutputStream.G(4, CustomDataDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
        }
        if (this.userData_ != null) {
            iG += CodedOutputStream.G(5, getUserData());
        }
        if (this.appData_ != null) {
            iG += CodedOutputStream.G(6, getAppData());
        }
        if (this.ext_ != null) {
            iG += CodedOutputStream.G(7, getExt());
        }
        if (!getTokenHashValueBytes().isEmpty()) {
            iG += j0.computeStringSize(8, this.tokenHashValue_);
        }
        if (this.hbPlacement_ != null) {
            iG += CodedOutputStream.G(9, getHbPlacement());
        }
        if (!getAdTypeBytes().isEmpty()) {
            iG += j0.computeStringSize(10, this.adType_);
        }
        if (this.session_ != null) {
            iG += CodedOutputStream.G(11, getSession());
        }
        if (this.placement_ != null) {
            iG += CodedOutputStream.G(12, getPlacement());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public io.bidmachine.protobuf.sdk.Session getSession() {
        io.bidmachine.protobuf.sdk.Session session = this.session_;
        return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public SessionData getSessionData() {
        SessionData sessionData = this.sessionData_;
        return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public SessionDataOrBuilder getSessionDataOrBuilder() {
        return getSessionData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder() {
        return getSession();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public String getTokenHashValue() {
        Object obj = this.tokenHashValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tokenHashValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public ByteString getTokenHashValueBytes() {
        Object obj = this.tokenHashValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tokenHashValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public User getUserData() {
        User user = this.userData_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public UserOrBuilder getUserDataOrBuilder() {
        return getUserData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasAppData() {
        return this.appData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasDeviceData() {
        return this.deviceData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean hasHbPlacement() {
        return this.hbPlacement_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasPlacement() {
        return this.placement_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasPlacementData() {
        return this.placementData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasSession() {
        return this.session_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean hasSessionData() {
        return this.sessionData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasUserData() {
        return this.userData_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 8) * 53) + getTokenHashValue().hashCode()) * 37) + 10) * 53) + getAdType().hashCode();
        if (hasPlacementData()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getPlacementData().hashCode();
        }
        if (hasSessionData()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getSessionData().hashCode();
        }
        if (hasSession()) {
            iHashCode = (((iHashCode * 37) + 11) * 53) + getSession().hashCode();
        }
        if (hasDeviceData()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getDeviceData().hashCode();
        }
        if (hasUserData()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getUserData().hashCode();
        }
        if (hasAppData()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getAppData().hashCode();
        }
        if (hasHbPlacement()) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getHbPlacement().hashCode();
        }
        if (!internalGetCustomData().j().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + internalGetCustomData().hashCode();
        }
        if (hasPlacement()) {
            iHashCode = (((iHashCode * 37) + 12) * 53) + getPlacement().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getExt().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.d(RequestTokenPayload.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.j0
    protected y0 internalGetMapField(int i10) {
        if (i10 == 4) {
            return internalGetCustomData();
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
        return new RequestTokenPayload();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.placementData_ != null) {
            codedOutputStream.L0(1, getPlacementData());
        }
        if (this.sessionData_ != null) {
            codedOutputStream.L0(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            codedOutputStream.L0(3, getDeviceData());
        }
        j0.serializeStringMapTo(codedOutputStream, internalGetCustomData(), CustomDataDefaultEntryHolder.defaultEntry, 4);
        if (this.userData_ != null) {
            codedOutputStream.L0(5, getUserData());
        }
        if (this.appData_ != null) {
            codedOutputStream.L0(6, getAppData());
        }
        if (this.ext_ != null) {
            codedOutputStream.L0(7, getExt());
        }
        if (!getTokenHashValueBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 8, this.tokenHashValue_);
        }
        if (this.hbPlacement_ != null) {
            codedOutputStream.L0(9, getHbPlacement());
        }
        if (!getAdTypeBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 10, this.adType_);
        }
        if (this.session_ != null) {
            codedOutputStream.L0(11, getSession());
        }
        if (this.placement_ != null) {
            codedOutputStream.L0(12, getPlacement());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements RequestTokenPayloadOrBuilder {
        private Object adType_;
        private e2<App, App.Builder, AppOrBuilder> appDataBuilder_;
        private App appData_;
        private int bitField0_;
        private y0<String, String> customData_;
        private e2<Device, Device.Builder, DeviceOrBuilder> deviceDataBuilder_;
        private Device deviceData_;
        private e2<Struct, Struct.Builder, i2> extBuilder_;
        private Struct ext_;
        private e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> hbPlacementBuilder_;
        private HeaderBiddingPlacement hbPlacement_;
        private e2<Placement, Placement.Builder, PlacementOrBuilder> placementBuilder_;
        private e2<SDK, SDK.Builder, SDKOrBuilder> placementDataBuilder_;
        private SDK placementData_;
        private Placement placement_;
        private e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> sessionBuilder_;
        private e2<SessionData, SessionData.Builder, SessionDataOrBuilder> sessionDataBuilder_;
        private SessionData sessionData_;
        private io.bidmachine.protobuf.sdk.Session session_;
        private Object tokenHashValue_;
        private e2<User, User.Builder, UserOrBuilder> userDataBuilder_;
        private User userData_;

        private e2<App, App.Builder, AppOrBuilder> getAppDataFieldBuilder() {
            if (this.appDataBuilder_ == null) {
                this.appDataBuilder_ = new e2<>(getAppData(), getParentForChildren(), isClean());
                this.appData_ = null;
            }
            return this.appDataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        private e2<Device, Device.Builder, DeviceOrBuilder> getDeviceDataFieldBuilder() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceDataBuilder_ = new e2<>(getDeviceData(), getParentForChildren(), isClean());
                this.deviceData_ = null;
            }
            return this.deviceDataBuilder_;
        }

        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> getHbPlacementFieldBuilder() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacementBuilder_ = new e2<>(getHbPlacement(), getParentForChildren(), isClean());
                this.hbPlacement_ = null;
            }
            return this.hbPlacementBuilder_;
        }

        private e2<SDK, SDK.Builder, SDKOrBuilder> getPlacementDataFieldBuilder() {
            if (this.placementDataBuilder_ == null) {
                this.placementDataBuilder_ = new e2<>(getPlacementData(), getParentForChildren(), isClean());
                this.placementData_ = null;
            }
            return this.placementDataBuilder_;
        }

        private e2<Placement, Placement.Builder, PlacementOrBuilder> getPlacementFieldBuilder() {
            if (this.placementBuilder_ == null) {
                this.placementBuilder_ = new e2<>(getPlacement(), getParentForChildren(), isClean());
                this.placement_ = null;
            }
            return this.placementBuilder_;
        }

        private e2<SessionData, SessionData.Builder, SessionDataOrBuilder> getSessionDataFieldBuilder() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionDataBuilder_ = new e2<>(getSessionData(), getParentForChildren(), isClean());
                this.sessionData_ = null;
            }
            return this.sessionDataBuilder_;
        }

        private e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> getSessionFieldBuilder() {
            if (this.sessionBuilder_ == null) {
                this.sessionBuilder_ = new e2<>(getSession(), getParentForChildren(), isClean());
                this.session_ = null;
            }
            return this.sessionBuilder_;
        }

        private e2<User, User.Builder, UserOrBuilder> getUserDataFieldBuilder() {
            if (this.userDataBuilder_ == null) {
                this.userDataBuilder_ = new e2<>(getUserData(), getParentForChildren(), isClean());
                this.userData_ = null;
            }
            return this.userDataBuilder_;
        }

        private y0<String, String> internalGetCustomData() {
            y0<String, String> y0Var = this.customData_;
            return y0Var == null ? y0.h(CustomDataDefaultEntryHolder.defaultEntry) : y0Var;
        }

        private y0<String, String> internalGetMutableCustomData() {
            onChanged();
            if (this.customData_ == null) {
                this.customData_ = y0.q(CustomDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.customData_.n()) {
                this.customData_ = this.customData_.g();
            }
            return this.customData_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        @Deprecated
        public Builder clearAdType() {
            this.adType_ = RequestTokenPayload.getDefaultInstance().getAdType();
            onChanged();
            return this;
        }

        public Builder clearAppData() {
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
                onChanged();
            } else {
                this.appData_ = null;
                this.appDataBuilder_ = null;
            }
            return this;
        }

        @Deprecated
        public Builder clearCustomData() {
            internalGetMutableCustomData().m().clear();
            return this;
        }

        public Builder clearDeviceData() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
                onChanged();
            } else {
                this.deviceData_ = null;
                this.deviceDataBuilder_ = null;
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        @Deprecated
        public Builder clearHbPlacement() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                onChanged();
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            return this;
        }

        public Builder clearPlacement() {
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
                onChanged();
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            return this;
        }

        public Builder clearPlacementData() {
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
                onChanged();
            } else {
                this.placementData_ = null;
                this.placementDataBuilder_ = null;
            }
            return this;
        }

        public Builder clearSession() {
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                onChanged();
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            return this;
        }

        @Deprecated
        public Builder clearSessionData() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
                onChanged();
            } else {
                this.sessionData_ = null;
                this.sessionDataBuilder_ = null;
            }
            return this;
        }

        public Builder clearTokenHashValue() {
            this.tokenHashValue_ = RequestTokenPayload.getDefaultInstance().getTokenHashValue();
            onChanged();
            return this;
        }

        public Builder clearUserData() {
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
                onChanged();
            } else {
                this.userData_ = null;
                this.userDataBuilder_ = null;
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean containsCustomData(String str) {
            str.getClass();
            return internalGetCustomData().j().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getAdType() {
            Object obj = this.adType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public ByteString getAdTypeBytes() {
            Object obj = this.adType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public App getAppData() {
            e2<App, App.Builder, AppOrBuilder> e2Var = this.appDataBuilder_;
            if (e2Var != null) {
                return (App) e2Var.e();
            }
            App app = this.appData_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public App.Builder getAppDataBuilder() {
            onChanged();
            return (App.Builder) getAppDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public AppOrBuilder getAppDataOrBuilder() {
            e2<App, App.Builder, AppOrBuilder> e2Var = this.appDataBuilder_;
            if (e2Var != null) {
                return (AppOrBuilder) e2Var.f();
            }
            App app = this.appData_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public Map<String, String> getCustomData() {
            return getCustomDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public int getCustomDataCount() {
            return internalGetCustomData().j().size();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public Map<String, String> getCustomDataMap() {
            return internalGetCustomData().j();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getCustomDataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> mapJ = internalGetCustomData().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getCustomDataOrThrow(String str) {
            str.getClass();
            Map<String, String> mapJ = internalGetCustomData().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public Device getDeviceData() {
            e2<Device, Device.Builder, DeviceOrBuilder> e2Var = this.deviceDataBuilder_;
            if (e2Var != null) {
                return (Device) e2Var.e();
            }
            Device device = this.deviceData_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public Device.Builder getDeviceDataBuilder() {
            onChanged();
            return (Device.Builder) getDeviceDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public DeviceOrBuilder getDeviceDataOrBuilder() {
            e2<Device, Device.Builder, DeviceOrBuilder> e2Var = this.deviceDataBuilder_;
            if (e2Var != null) {
                return (DeviceOrBuilder) e2Var.f();
            }
            Device device = this.deviceData_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public Struct getExt() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public i2 getExtOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public HeaderBiddingPlacement getHbPlacement() {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var != null) {
                return (HeaderBiddingPlacement) e2Var.e();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Deprecated
        public HeaderBiddingPlacement.Builder getHbPlacementBuilder() {
            onChanged();
            return (HeaderBiddingPlacement.Builder) getHbPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var != null) {
                return (HeaderBiddingPlacementOrBuilder) e2Var.f();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Deprecated
        public Map<String, String> getMutableCustomData() {
            return internalGetMutableCustomData().m();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public Placement getPlacement() {
            e2<Placement, Placement.Builder, PlacementOrBuilder> e2Var = this.placementBuilder_;
            if (e2Var != null) {
                return (Placement) e2Var.e();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getPlacementBuilder() {
            onChanged();
            return (Placement.Builder) getPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public SDK getPlacementData() {
            e2<SDK, SDK.Builder, SDKOrBuilder> e2Var = this.placementDataBuilder_;
            if (e2Var != null) {
                return (SDK) e2Var.e();
            }
            SDK sdk = this.placementData_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        public SDK.Builder getPlacementDataBuilder() {
            onChanged();
            return (SDK.Builder) getPlacementDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public SDKOrBuilder getPlacementDataOrBuilder() {
            e2<SDK, SDK.Builder, SDKOrBuilder> e2Var = this.placementDataBuilder_;
            if (e2Var != null) {
                return (SDKOrBuilder) e2Var.f();
            }
            SDK sdk = this.placementData_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public PlacementOrBuilder getPlacementOrBuilder() {
            e2<Placement, Placement.Builder, PlacementOrBuilder> e2Var = this.placementBuilder_;
            if (e2Var != null) {
                return (PlacementOrBuilder) e2Var.f();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public io.bidmachine.protobuf.sdk.Session getSession() {
            e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> e2Var = this.sessionBuilder_;
            if (e2Var != null) {
                return (io.bidmachine.protobuf.sdk.Session) e2Var.e();
            }
            io.bidmachine.protobuf.sdk.Session session = this.session_;
            return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
        }

        public io.bidmachine.protobuf.sdk.Session.Builder getSessionBuilder() {
            onChanged();
            return (io.bidmachine.protobuf.sdk.Session.Builder) getSessionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public SessionData getSessionData() {
            e2<SessionData, SessionData.Builder, SessionDataOrBuilder> e2Var = this.sessionDataBuilder_;
            if (e2Var != null) {
                return (SessionData) e2Var.e();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        @Deprecated
        public SessionData.Builder getSessionDataBuilder() {
            onChanged();
            return (SessionData.Builder) getSessionDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public SessionDataOrBuilder getSessionDataOrBuilder() {
            e2<SessionData, SessionData.Builder, SessionDataOrBuilder> e2Var = this.sessionDataBuilder_;
            if (e2Var != null) {
                return (SessionDataOrBuilder) e2Var.f();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder() {
            e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> e2Var = this.sessionBuilder_;
            if (e2Var != null) {
                return (io.bidmachine.protobuf.sdk.SessionOrBuilder) e2Var.f();
            }
            io.bidmachine.protobuf.sdk.Session session = this.session_;
            return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public String getTokenHashValue() {
            Object obj = this.tokenHashValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tokenHashValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public ByteString getTokenHashValueBytes() {
            Object obj = this.tokenHashValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tokenHashValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public User getUserData() {
            e2<User, User.Builder, UserOrBuilder> e2Var = this.userDataBuilder_;
            if (e2Var != null) {
                return (User) e2Var.e();
            }
            User user = this.userData_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public User.Builder getUserDataBuilder() {
            onChanged();
            return (User.Builder) getUserDataFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public UserOrBuilder getUserDataOrBuilder() {
            e2<User, User.Builder, UserOrBuilder> e2Var = this.userDataBuilder_;
            if (e2Var != null) {
                return (UserOrBuilder) e2Var.f();
            }
            User user = this.userData_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasAppData() {
            return (this.appDataBuilder_ == null && this.appData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasDeviceData() {
            return (this.deviceDataBuilder_ == null && this.deviceData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean hasHbPlacement() {
            return (this.hbPlacementBuilder_ == null && this.hbPlacement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasPlacement() {
            return (this.placementBuilder_ == null && this.placement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasPlacementData() {
            return (this.placementDataBuilder_ == null && this.placementData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasSession() {
            return (this.sessionBuilder_ == null && this.session_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean hasSessionData() {
            return (this.sessionDataBuilder_ == null && this.sessionData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasUserData() {
            return (this.userDataBuilder_ == null && this.userData_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.d(RequestTokenPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMapField(int i10) {
            if (i10 == 4) {
                return internalGetCustomData();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMutableMapField(int i10) {
            if (i10 == 4) {
                return internalGetMutableCustomData();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAppData(App app) {
            e2<App, App.Builder, AppOrBuilder> e2Var = this.appDataBuilder_;
            if (e2Var == null) {
                App app2 = this.appData_;
                if (app2 != null) {
                    this.appData_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
                } else {
                    this.appData_ = app;
                }
                onChanged();
            } else {
                e2Var.g(app);
            }
            return this;
        }

        public Builder mergeDeviceData(Device device) {
            e2<Device, Device.Builder, DeviceOrBuilder> e2Var = this.deviceDataBuilder_;
            if (e2Var == null) {
                Device device2 = this.deviceData_;
                if (device2 != null) {
                    this.deviceData_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
                } else {
                    this.deviceData_ = device;
                }
                onChanged();
            } else {
                e2Var.g(device);
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        @Deprecated
        public Builder mergeHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var == null) {
                HeaderBiddingPlacement headerBiddingPlacement2 = this.hbPlacement_;
                if (headerBiddingPlacement2 != null) {
                    this.hbPlacement_ = HeaderBiddingPlacement.newBuilder(headerBiddingPlacement2).mergeFrom(headerBiddingPlacement).buildPartial();
                } else {
                    this.hbPlacement_ = headerBiddingPlacement;
                }
                onChanged();
            } else {
                e2Var.g(headerBiddingPlacement);
            }
            return this;
        }

        public Builder mergePlacement(Placement placement) {
            e2<Placement, Placement.Builder, PlacementOrBuilder> e2Var = this.placementBuilder_;
            if (e2Var == null) {
                Placement placement2 = this.placement_;
                if (placement2 != null) {
                    this.placement_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
                } else {
                    this.placement_ = placement;
                }
                onChanged();
            } else {
                e2Var.g(placement);
            }
            return this;
        }

        public Builder mergePlacementData(SDK sdk) {
            e2<SDK, SDK.Builder, SDKOrBuilder> e2Var = this.placementDataBuilder_;
            if (e2Var == null) {
                SDK sdk2 = this.placementData_;
                if (sdk2 != null) {
                    this.placementData_ = SDK.newBuilder(sdk2).mergeFrom(sdk).buildPartial();
                } else {
                    this.placementData_ = sdk;
                }
                onChanged();
            } else {
                e2Var.g(sdk);
            }
            return this;
        }

        public Builder mergeSession(io.bidmachine.protobuf.sdk.Session session) {
            e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> e2Var = this.sessionBuilder_;
            if (e2Var == null) {
                io.bidmachine.protobuf.sdk.Session session2 = this.session_;
                if (session2 != null) {
                    this.session_ = io.bidmachine.protobuf.sdk.Session.newBuilder(session2).mergeFrom(session).buildPartial();
                } else {
                    this.session_ = session;
                }
                onChanged();
            } else {
                e2Var.g(session);
            }
            return this;
        }

        @Deprecated
        public Builder mergeSessionData(SessionData sessionData) {
            e2<SessionData, SessionData.Builder, SessionDataOrBuilder> e2Var = this.sessionDataBuilder_;
            if (e2Var == null) {
                SessionData sessionData2 = this.sessionData_;
                if (sessionData2 != null) {
                    this.sessionData_ = SessionData.newBuilder(sessionData2).mergeFrom(sessionData).buildPartial();
                } else {
                    this.sessionData_ = sessionData;
                }
                onChanged();
            } else {
                e2Var.g(sessionData);
            }
            return this;
        }

        public Builder mergeUserData(User user) {
            e2<User, User.Builder, UserOrBuilder> e2Var = this.userDataBuilder_;
            if (e2Var == null) {
                User user2 = this.userData_;
                if (user2 != null) {
                    this.userData_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
                } else {
                    this.userData_ = user;
                }
                onChanged();
            } else {
                e2Var.g(user);
            }
            return this;
        }

        @Deprecated
        public Builder putAllCustomData(Map<String, String> map) {
            internalGetMutableCustomData().m().putAll(map);
            return this;
        }

        @Deprecated
        public Builder putCustomData(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomData().m().put(str, str2);
            return this;
        }

        @Deprecated
        public Builder removeCustomData(String str) {
            str.getClass();
            internalGetMutableCustomData().m().remove(str);
            return this;
        }

        @Deprecated
        public Builder setAdType(String str) {
            str.getClass();
            this.adType_ = str;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setAdTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.adType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAppData(App app) {
            e2<App, App.Builder, AppOrBuilder> e2Var = this.appDataBuilder_;
            if (e2Var == null) {
                app.getClass();
                this.appData_ = app;
                onChanged();
            } else {
                e2Var.i(app);
            }
            return this;
        }

        public Builder setDeviceData(Device device) {
            e2<Device, Device.Builder, DeviceOrBuilder> e2Var = this.deviceDataBuilder_;
            if (e2Var == null) {
                device.getClass();
                this.deviceData_ = device;
                onChanged();
            } else {
                e2Var.i(device);
            }
            return this;
        }

        public Builder setExt(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.ext_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
            return this;
        }

        @Deprecated
        public Builder setHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var == null) {
                headerBiddingPlacement.getClass();
                this.hbPlacement_ = headerBiddingPlacement;
                onChanged();
            } else {
                e2Var.i(headerBiddingPlacement);
            }
            return this;
        }

        public Builder setPlacement(Placement placement) {
            e2<Placement, Placement.Builder, PlacementOrBuilder> e2Var = this.placementBuilder_;
            if (e2Var == null) {
                placement.getClass();
                this.placement_ = placement;
                onChanged();
            } else {
                e2Var.i(placement);
            }
            return this;
        }

        public Builder setPlacementData(SDK sdk) {
            e2<SDK, SDK.Builder, SDKOrBuilder> e2Var = this.placementDataBuilder_;
            if (e2Var == null) {
                sdk.getClass();
                this.placementData_ = sdk;
                onChanged();
            } else {
                e2Var.i(sdk);
            }
            return this;
        }

        public Builder setSession(io.bidmachine.protobuf.sdk.Session session) {
            e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> e2Var = this.sessionBuilder_;
            if (e2Var == null) {
                session.getClass();
                this.session_ = session;
                onChanged();
            } else {
                e2Var.i(session);
            }
            return this;
        }

        @Deprecated
        public Builder setSessionData(SessionData sessionData) {
            e2<SessionData, SessionData.Builder, SessionDataOrBuilder> e2Var = this.sessionDataBuilder_;
            if (e2Var == null) {
                sessionData.getClass();
                this.sessionData_ = sessionData;
                onChanged();
            } else {
                e2Var.i(sessionData);
            }
            return this;
        }

        public Builder setTokenHashValue(String str) {
            str.getClass();
            this.tokenHashValue_ = str;
            onChanged();
            return this;
        }

        public Builder setTokenHashValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.tokenHashValue_ = byteString;
            onChanged();
            return this;
        }

        public Builder setUserData(User user) {
            e2<User, User.Builder, UserOrBuilder> e2Var = this.userDataBuilder_;
            if (e2Var == null) {
                user.getClass();
                this.userData_ = user;
                onChanged();
            } else {
                e2Var.i(user);
            }
            return this;
        }

        private Builder() {
            this.tokenHashValue_ = "";
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestTokenPayload build() {
            RequestTokenPayload requestTokenPayloadBuildPartial = buildPartial();
            if (requestTokenPayloadBuildPartial.isInitialized()) {
                return requestTokenPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestTokenPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestTokenPayload buildPartial() {
            RequestTokenPayload requestTokenPayload = new RequestTokenPayload(this);
            requestTokenPayload.tokenHashValue_ = this.tokenHashValue_;
            requestTokenPayload.adType_ = this.adType_;
            e2<SDK, SDK.Builder, SDKOrBuilder> e2Var = this.placementDataBuilder_;
            if (e2Var == null) {
                requestTokenPayload.placementData_ = this.placementData_;
            } else {
                requestTokenPayload.placementData_ = (SDK) e2Var.a();
            }
            e2<SessionData, SessionData.Builder, SessionDataOrBuilder> e2Var2 = this.sessionDataBuilder_;
            if (e2Var2 == null) {
                requestTokenPayload.sessionData_ = this.sessionData_;
            } else {
                requestTokenPayload.sessionData_ = (SessionData) e2Var2.a();
            }
            e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> e2Var3 = this.sessionBuilder_;
            if (e2Var3 == null) {
                requestTokenPayload.session_ = this.session_;
            } else {
                requestTokenPayload.session_ = (io.bidmachine.protobuf.sdk.Session) e2Var3.a();
            }
            e2<Device, Device.Builder, DeviceOrBuilder> e2Var4 = this.deviceDataBuilder_;
            if (e2Var4 == null) {
                requestTokenPayload.deviceData_ = this.deviceData_;
            } else {
                requestTokenPayload.deviceData_ = (Device) e2Var4.a();
            }
            e2<User, User.Builder, UserOrBuilder> e2Var5 = this.userDataBuilder_;
            if (e2Var5 == null) {
                requestTokenPayload.userData_ = this.userData_;
            } else {
                requestTokenPayload.userData_ = (User) e2Var5.a();
            }
            e2<App, App.Builder, AppOrBuilder> e2Var6 = this.appDataBuilder_;
            if (e2Var6 == null) {
                requestTokenPayload.appData_ = this.appData_;
            } else {
                requestTokenPayload.appData_ = (App) e2Var6.a();
            }
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var7 = this.hbPlacementBuilder_;
            if (e2Var7 == null) {
                requestTokenPayload.hbPlacement_ = this.hbPlacement_;
            } else {
                requestTokenPayload.hbPlacement_ = (HeaderBiddingPlacement) e2Var7.a();
            }
            requestTokenPayload.customData_ = internalGetCustomData();
            requestTokenPayload.customData_.o();
            e2<Placement, Placement.Builder, PlacementOrBuilder> e2Var8 = this.placementBuilder_;
            if (e2Var8 == null) {
                requestTokenPayload.placement_ = this.placement_;
            } else {
                requestTokenPayload.placement_ = (Placement) e2Var8.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var9 = this.extBuilder_;
            if (e2Var9 == null) {
                requestTokenPayload.ext_ = this.ext_;
            } else {
                requestTokenPayload.ext_ = (Struct) e2Var9.a();
            }
            onBuilt();
            return requestTokenPayload;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public RequestTokenPayload mo164getDefaultInstanceForType() {
            return RequestTokenPayload.getDefaultInstance();
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
            this.tokenHashValue_ = "";
            this.adType_ = "";
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
            } else {
                this.placementData_ = null;
                this.placementDataBuilder_ = null;
            }
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
            } else {
                this.sessionData_ = null;
                this.sessionDataBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
            } else {
                this.deviceData_ = null;
                this.deviceDataBuilder_ = null;
            }
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
            } else {
                this.userData_ = null;
                this.userDataBuilder_ = null;
            }
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
            } else {
                this.appData_ = null;
                this.appDataBuilder_ = null;
            }
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            internalGetMutableCustomData().b();
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Builder setAppData(App.Builder builder) {
            e2<App, App.Builder, AppOrBuilder> e2Var = this.appDataBuilder_;
            if (e2Var == null) {
                this.appData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setDeviceData(Device.Builder builder) {
            e2<Device, Device.Builder, DeviceOrBuilder> e2Var = this.deviceDataBuilder_;
            if (e2Var == null) {
                this.deviceData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        @Deprecated
        public Builder setHbPlacement(HeaderBiddingPlacement.Builder builder) {
            e2<HeaderBiddingPlacement, HeaderBiddingPlacement.Builder, HeaderBiddingPlacementOrBuilder> e2Var = this.hbPlacementBuilder_;
            if (e2Var == null) {
                this.hbPlacement_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setPlacement(Placement.Builder builder) {
            e2<Placement, Placement.Builder, PlacementOrBuilder> e2Var = this.placementBuilder_;
            if (e2Var == null) {
                this.placement_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setPlacementData(SDK.Builder builder) {
            e2<SDK, SDK.Builder, SDKOrBuilder> e2Var = this.placementDataBuilder_;
            if (e2Var == null) {
                this.placementData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setSession(io.bidmachine.protobuf.sdk.Session.Builder builder) {
            e2<io.bidmachine.protobuf.sdk.Session, io.bidmachine.protobuf.sdk.Session.Builder, io.bidmachine.protobuf.sdk.SessionOrBuilder> e2Var = this.sessionBuilder_;
            if (e2Var == null) {
                this.session_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        @Deprecated
        public Builder setSessionData(SessionData.Builder builder) {
            e2<SessionData, SessionData.Builder, SessionDataOrBuilder> e2Var = this.sessionDataBuilder_;
            if (e2Var == null) {
                this.sessionData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setUserData(User.Builder builder) {
            e2<User, User.Builder, UserOrBuilder> e2Var = this.userDataBuilder_;
            if (e2Var == null) {
                this.userData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.tokenHashValue_ = "";
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RequestTokenPayload) {
                return mergeFrom((RequestTokenPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestTokenPayload requestTokenPayload) {
            if (requestTokenPayload == RequestTokenPayload.getDefaultInstance()) {
                return this;
            }
            if (!requestTokenPayload.getTokenHashValue().isEmpty()) {
                this.tokenHashValue_ = requestTokenPayload.tokenHashValue_;
                onChanged();
            }
            if (!requestTokenPayload.getAdType().isEmpty()) {
                this.adType_ = requestTokenPayload.adType_;
                onChanged();
            }
            if (requestTokenPayload.hasPlacementData()) {
                mergePlacementData(requestTokenPayload.getPlacementData());
            }
            if (requestTokenPayload.hasSessionData()) {
                mergeSessionData(requestTokenPayload.getSessionData());
            }
            if (requestTokenPayload.hasSession()) {
                mergeSession(requestTokenPayload.getSession());
            }
            if (requestTokenPayload.hasDeviceData()) {
                mergeDeviceData(requestTokenPayload.getDeviceData());
            }
            if (requestTokenPayload.hasUserData()) {
                mergeUserData(requestTokenPayload.getUserData());
            }
            if (requestTokenPayload.hasAppData()) {
                mergeAppData(requestTokenPayload.getAppData());
            }
            if (requestTokenPayload.hasHbPlacement()) {
                mergeHbPlacement(requestTokenPayload.getHbPlacement());
            }
            internalGetMutableCustomData().p(requestTokenPayload.internalGetCustomData());
            if (requestTokenPayload.hasPlacement()) {
                mergePlacement(requestTokenPayload.getPlacement());
            }
            if (requestTokenPayload.hasExt()) {
                mergeExt(requestTokenPayload.getExt());
            }
            mergeUnknownFields(((j0) requestTokenPayload).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            RequestTokenPayload requestTokenPayload = null;
            try {
                try {
                    RequestTokenPayload requestTokenPayload2 = (RequestTokenPayload) RequestTokenPayload.PARSER.parsePartialFrom(nVar, yVar);
                    if (requestTokenPayload2 != null) {
                        mergeFrom(requestTokenPayload2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    RequestTokenPayload requestTokenPayload3 = (RequestTokenPayload) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        requestTokenPayload = requestTokenPayload3;
                        if (requestTokenPayload != null) {
                            mergeFrom(requestTokenPayload);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (requestTokenPayload != null) {
                    mergeFrom(requestTokenPayload);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(RequestTokenPayload requestTokenPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestTokenPayload);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private RequestTokenPayload(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (RequestTokenPayload) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public RequestTokenPayload mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private RequestTokenPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.tokenHashValue_ = "";
        this.adType_ = "";
    }

    public static RequestTokenPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static RequestTokenPayload parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static RequestTokenPayload parseFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) j0.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RequestTokenPayload(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = nVar.K();
                        switch (iK) {
                            case 0:
                                break;
                            case 10:
                                SDK sdk = this.placementData_;
                                SDK.Builder builder = sdk != null ? sdk.toBuilder() : null;
                                SDK sdk2 = (SDK) nVar.A(SDK.parser(), yVar);
                                this.placementData_ = sdk2;
                                if (builder != null) {
                                    builder.mergeFrom(sdk2);
                                    this.placementData_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 18:
                                SessionData sessionData = this.sessionData_;
                                SessionData.Builder builder2 = sessionData != null ? sessionData.toBuilder() : null;
                                SessionData sessionData2 = (SessionData) nVar.A(SessionData.parser(), yVar);
                                this.sessionData_ = sessionData2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(sessionData2);
                                    this.sessionData_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 26:
                                Device device = this.deviceData_;
                                Device.Builder builder3 = device != null ? device.toBuilder() : null;
                                Device device2 = (Device) nVar.A(Device.parser(), yVar);
                                this.deviceData_ = device2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(device2);
                                    this.deviceData_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 34:
                                boolean z12 = (z11 ? 1 : 0) & true;
                                z11 = z11;
                                if (!z12) {
                                    this.customData_ = y0.q(CustomDataDefaultEntryHolder.defaultEntry);
                                    z11 = (z11 ? 1 : 0) | true;
                                }
                                w0 w0Var = (w0) nVar.A(CustomDataDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                                this.customData_.m().put(w0Var.h(), w0Var.n());
                                continue;
                            case 42:
                                User user = this.userData_;
                                User.Builder builder4 = user != null ? user.toBuilder() : null;
                                User user2 = (User) nVar.A(User.parser(), yVar);
                                this.userData_ = user2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(user2);
                                    this.userData_ = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 50:
                                App app = this.appData_;
                                App.Builder builder5 = app != null ? app.toBuilder() : null;
                                App app2 = (App) nVar.A(App.parser(), yVar);
                                this.appData_ = app2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(app2);
                                    this.appData_ = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 58:
                                Struct struct = this.ext_;
                                Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.ext_ = struct2;
                                if (builder6 != null) {
                                    builder6.mergeFrom(struct2);
                                    this.ext_ = builder6.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 66:
                                this.tokenHashValue_ = nVar.J();
                                continue;
                            case 74:
                                HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
                                HeaderBiddingPlacement.Builder builder7 = headerBiddingPlacement != null ? headerBiddingPlacement.toBuilder() : null;
                                HeaderBiddingPlacement headerBiddingPlacement2 = (HeaderBiddingPlacement) nVar.A(HeaderBiddingPlacement.parser(), yVar);
                                this.hbPlacement_ = headerBiddingPlacement2;
                                if (builder7 != null) {
                                    builder7.mergeFrom(headerBiddingPlacement2);
                                    this.hbPlacement_ = builder7.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 82:
                                this.adType_ = nVar.J();
                                continue;
                            case 90:
                                io.bidmachine.protobuf.sdk.Session session = this.session_;
                                io.bidmachine.protobuf.sdk.Session.Builder builder8 = session != null ? session.toBuilder() : null;
                                io.bidmachine.protobuf.sdk.Session session2 = (io.bidmachine.protobuf.sdk.Session) nVar.A(io.bidmachine.protobuf.sdk.Session.parser(), yVar);
                                this.session_ = session2;
                                if (builder8 != null) {
                                    builder8.mergeFrom(session2);
                                    this.session_ = builder8.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 98:
                                Placement placement = this.placement_;
                                Placement.Builder builder9 = placement != null ? placement.toBuilder() : null;
                                Placement placement2 = (Placement) nVar.A(Placement.parser(), yVar);
                                this.placement_ = placement2;
                                if (builder9 != null) {
                                    builder9.mergeFrom(placement2);
                                    this.placement_ = builder9.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    break;
                                }
                                break;
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

    public static RequestTokenPayload parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (RequestTokenPayload) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static RequestTokenPayload parseFrom(n nVar) throws IOException {
        return (RequestTokenPayload) j0.parseWithIOException(PARSER, nVar);
    }

    public static RequestTokenPayload parseFrom(n nVar, y yVar) throws IOException {
        return (RequestTokenPayload) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
