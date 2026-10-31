package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.q0;
import com.explorestack.protobuf.r0;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w1;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TokenConfiguration extends j0 implements TokenConfigurationOrBuilder {
    public static final int AD_NETWORKS_FIELD_NUMBER = 3;
    public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private r0 adNetworks_;
    private int expirationTime_;
    private byte memoizedIsInitialized;
    private volatile Object type_;
    private static final TokenConfiguration DEFAULT_INSTANCE = new TokenConfiguration();
    private static final s1<TokenConfiguration> PARSER = new b<TokenConfiguration>() { // from class: io.bidmachine.protobuf.TokenConfiguration.1
        @Override // com.explorestack.protobuf.s1
        public TokenConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new TokenConfiguration(nVar, yVar);
        }
    };

    public static final class Builder extends j0.b<Builder> implements TokenConfigurationOrBuilder {
        private r0 adNetworks_;
        private int bitField0_;
        private int expirationTime_;
        private Object type_;

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adNetworks_ = new q0(this.adNetworks_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder addAdNetworks(String str) {
            str.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.add(str);
            onChanged();
            return this;
        }

        public Builder addAdNetworksBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureAdNetworksIsMutable();
            this.adNetworks_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addAllAdNetworks(Iterable<String> iterable) {
            ensureAdNetworksIsMutable();
            a.AbstractC0128a.addAll((Iterable) iterable, (List) this.adNetworks_);
            onChanged();
            return this;
        }

        public Builder clearAdNetworks() {
            this.adNetworks_ = q0.f10776d;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearExpirationTime() {
            this.expirationTime_ = 0;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = TokenConfiguration.getDefaultInstance().getType();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public String getAdNetworks(int i10) {
            return this.adNetworks_.get(i10);
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public ByteString getAdNetworksBytes(int i10) {
            return this.adNetworks_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public int getAdNetworksCount() {
            return this.adNetworks_.size();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public int getExpirationTime() {
            return this.expirationTime_;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_fieldAccessorTable.d(TokenConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAdNetworks(int i10, String str) {
            str.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setExpirationTime(int i10) {
            this.expirationTime_ = i10;
            onChanged();
            return this;
        }

        public Builder setType(String str) {
            str.getClass();
            this.type_ = str;
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public w1 getAdNetworksList() {
            return this.adNetworks_.getUnmodifiableView();
        }

        private Builder() {
            this.type_ = "";
            this.adNetworks_ = q0.f10776d;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public TokenConfiguration build() {
            TokenConfiguration tokenConfigurationBuildPartial = buildPartial();
            if (tokenConfigurationBuildPartial.isInitialized()) {
                return tokenConfigurationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) tokenConfigurationBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public TokenConfiguration buildPartial() {
            TokenConfiguration tokenConfiguration = new TokenConfiguration(this);
            tokenConfiguration.type_ = this.type_;
            tokenConfiguration.expirationTime_ = this.expirationTime_;
            if ((this.bitField0_ & 1) != 0) {
                this.adNetworks_ = this.adNetworks_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            tokenConfiguration.adNetworks_ = this.adNetworks_;
            onBuilt();
            return tokenConfiguration;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public TokenConfiguration mo164getDefaultInstanceForType() {
            return TokenConfiguration.getDefaultInstance();
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
            this.type_ = "";
            this.expirationTime_ = 0;
            this.adNetworks_ = q0.f10776d;
            this.bitField0_ &= -2;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.type_ = "";
            this.adNetworks_ = q0.f10776d;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof TokenConfiguration) {
                return mergeFrom((TokenConfiguration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(TokenConfiguration tokenConfiguration) {
            if (tokenConfiguration == TokenConfiguration.getDefaultInstance()) {
                return this;
            }
            if (!tokenConfiguration.getType().isEmpty()) {
                this.type_ = tokenConfiguration.type_;
                onChanged();
            }
            if (tokenConfiguration.getExpirationTime() != 0) {
                setExpirationTime(tokenConfiguration.getExpirationTime());
            }
            if (!tokenConfiguration.adNetworks_.isEmpty()) {
                if (this.adNetworks_.isEmpty()) {
                    this.adNetworks_ = tokenConfiguration.adNetworks_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdNetworksIsMutable();
                    this.adNetworks_.addAll(tokenConfiguration.adNetworks_);
                }
                onChanged();
            }
            mergeUnknownFields(((j0) tokenConfiguration).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            TokenConfiguration tokenConfiguration = null;
            try {
                try {
                    TokenConfiguration tokenConfiguration2 = (TokenConfiguration) TokenConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                    if (tokenConfiguration2 != null) {
                        mergeFrom(tokenConfiguration2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    TokenConfiguration tokenConfiguration3 = (TokenConfiguration) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        tokenConfiguration = tokenConfiguration3;
                        if (tokenConfiguration != null) {
                            mergeFrom(tokenConfiguration);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (tokenConfiguration != null) {
                    mergeFrom(tokenConfiguration);
                }
                throw th;
            }
        }
    }

    public static TokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static TokenConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TokenConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static TokenConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<TokenConfiguration> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenConfiguration)) {
            return super.equals(obj);
        }
        TokenConfiguration tokenConfiguration = (TokenConfiguration) obj;
        return getType().equals(tokenConfiguration.getType()) && getExpirationTime() == tokenConfiguration.getExpirationTime() && getAdNetworksList().equals(tokenConfiguration.getAdNetworksList()) && this.unknownFields.equals(tokenConfiguration.unknownFields);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public String getAdNetworks(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public ByteString getAdNetworksBytes(int i10) {
        return this.adNetworks_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public int getExpirationTime() {
        return this.expirationTime_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<TokenConfiguration> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getTypeBytes().isEmpty() ? j0.computeStringSize(1, this.type_) + 0 : 0;
        int i11 = this.expirationTime_;
        if (i11 != 0) {
            iComputeStringSize += CodedOutputStream.x(2, i11);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i12 = 0; i12 < this.adNetworks_.size(); i12++) {
            iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.adNetworks_.getRaw(i12));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (getAdNetworksList().size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.type_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + getExpirationTime();
        if (getAdNetworksCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getAdNetworksList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_fieldAccessorTable.d(TokenConfiguration.class, Builder.class);
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
        return new TokenConfiguration();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getTypeBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.type_);
        }
        int i10 = this.expirationTime_;
        if (i10 != 0) {
            codedOutputStream.H0(2, i10);
        }
        for (int i11 = 0; i11 < this.adNetworks_.size(); i11++) {
            j0.writeString(codedOutputStream, 3, this.adNetworks_.getRaw(i11));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(TokenConfiguration tokenConfiguration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(tokenConfiguration);
    }

    public static TokenConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public w1 getAdNetworksList() {
        return this.adNetworks_;
    }

    private TokenConfiguration(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static TokenConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (TokenConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static TokenConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public TokenConfiguration mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static TokenConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private TokenConfiguration() {
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = "";
        this.adNetworks_ = q0.f10776d;
    }

    public static TokenConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static TokenConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static TokenConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (TokenConfiguration) j0.parseWithIOException(PARSER, inputStream);
    }

    private TokenConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                        if (iK == 10) {
                            this.type_ = nVar.J();
                        } else if (iK == 16) {
                            this.expirationTime_ = nVar.y();
                        } else if (iK != 26) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            String strJ = nVar.J();
                            if (!(z11 & true)) {
                                this.adNetworks_ = new q0();
                                z11 |= true;
                            }
                            this.adNetworks_.add(strJ);
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
                    this.adNetworks_ = this.adNetworks_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.adNetworks_ = this.adNetworks_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static TokenConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (TokenConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static TokenConfiguration parseFrom(n nVar) throws IOException {
        return (TokenConfiguration) j0.parseWithIOException(PARSER, nVar);
    }

    public static TokenConfiguration parseFrom(n nVar, y yVar) throws IOException {
        return (TokenConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
