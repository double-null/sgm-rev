package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.y0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HeaderBiddingAd extends j0 implements HeaderBiddingAdOrBuilder {
    public static final int BIDDER_FIELD_NUMBER = 1;
    public static final int CLIENT_PARAMS_FIELD_NUMBER = 2;
    private static final HeaderBiddingAd DEFAULT_INSTANCE = new HeaderBiddingAd();
    private static final s1<HeaderBiddingAd> PARSER = new b<HeaderBiddingAd>() { // from class: io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.1
        @Override // com.explorestack.protobuf.s1
        public HeaderBiddingAd parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new HeaderBiddingAd(nVar, yVar);
        }
    };
    public static final int SERVER_PARAMS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private volatile Object bidder_;
    private y0<String, String> clientParams_;
    private byte memoizedIsInitialized;
    private y0<String, String> serverParams_;

    private static final class ClientParamsDefaultEntryHolder {
        static final w0<String, String> defaultEntry;

        static {
            Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor;
            c3.b bVar = c3.b.f10262k;
            defaultEntry = w0.s(descriptor, bVar, "", bVar, "");
        }

        private ClientParamsDefaultEntryHolder() {
        }
    }

    private static final class ServerParamsDefaultEntryHolder {
        static final w0<String, String> defaultEntry;

        static {
            Descriptors.Descriptor descriptor = HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor;
            c3.b bVar = c3.b.f10262k;
            defaultEntry = w0.s(descriptor, bVar, "", bVar, "");
        }

        private ServerParamsDefaultEntryHolder() {
        }
    }

    public static HeaderBiddingAd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0<String, String> internalGetClientParams() {
        y0<String, String> y0Var = this.clientParams_;
        return y0Var == null ? y0.h(ClientParamsDefaultEntryHolder.defaultEntry) : y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0<String, String> internalGetServerParams() {
        y0<String, String> y0Var = this.serverParams_;
        return y0Var == null ? y0.h(ServerParamsDefaultEntryHolder.defaultEntry) : y0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<HeaderBiddingAd> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public boolean containsClientParams(String str) {
        str.getClass();
        return internalGetClientParams().j().containsKey(str);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public boolean containsServerParams(String str) {
        str.getClass();
        return internalGetServerParams().j().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingAd)) {
            return super.equals(obj);
        }
        HeaderBiddingAd headerBiddingAd = (HeaderBiddingAd) obj;
        return getBidder().equals(headerBiddingAd.getBidder()) && internalGetClientParams().equals(headerBiddingAd.internalGetClientParams()) && internalGetServerParams().equals(headerBiddingAd.internalGetServerParams()) && this.unknownFields.equals(headerBiddingAd.unknownFields);
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getBidder() {
        Object obj = this.bidder_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidder_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public ByteString getBidderBytes() {
        Object obj = this.bidder_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidder_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    @Deprecated
    public Map<String, String> getClientParams() {
        return getClientParamsMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public int getClientParamsCount() {
        return internalGetClientParams().j().size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public Map<String, String> getClientParamsMap() {
        return internalGetClientParams().j();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getClientParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> mapJ = internalGetClientParams().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getClientParamsOrThrow(String str) {
        str.getClass();
        Map<String, String> mapJ = internalGetClientParams().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<HeaderBiddingAd> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getBidderBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.bidder_);
        for (Map.Entry<String, String> entry : internalGetClientParams().j().entrySet()) {
            iComputeStringSize += CodedOutputStream.G(2, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
        }
        for (Map.Entry<String, String> entry2 : internalGetServerParams().j().entrySet()) {
            iComputeStringSize += CodedOutputStream.G(3, ServerParamsDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry2.getKey()).s(entry2.getValue()).build());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    @Deprecated
    public Map<String, String> getServerParams() {
        return getServerParamsMap();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public int getServerParamsCount() {
        return internalGetServerParams().j().size();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public Map<String, String> getServerParamsMap() {
        return internalGetServerParams().j();
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getServerParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> mapJ = internalGetServerParams().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
    public String getServerParamsOrThrow(String str) {
        str.getClass();
        Map<String, String> mapJ = internalGetServerParams().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
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
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBidder().hashCode();
        if (!internalGetClientParams().j().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetClientParams().hashCode();
        }
        if (!internalGetServerParams().j().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetServerParams().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.d(HeaderBiddingAd.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.j0
    protected y0 internalGetMapField(int i10) {
        if (i10 == 2) {
            return internalGetClientParams();
        }
        if (i10 == 3) {
            return internalGetServerParams();
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
        return new HeaderBiddingAd();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getBidderBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.bidder_);
        }
        j0.serializeStringMapTo(codedOutputStream, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 2);
        j0.serializeStringMapTo(codedOutputStream, internalGetServerParams(), ServerParamsDefaultEntryHolder.defaultEntry, 3);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements HeaderBiddingAdOrBuilder {
        private Object bidder_;
        private int bitField0_;
        private y0<String, String> clientParams_;
        private y0<String, String> serverParams_;

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        private y0<String, String> internalGetClientParams() {
            y0<String, String> y0Var = this.clientParams_;
            return y0Var == null ? y0.h(ClientParamsDefaultEntryHolder.defaultEntry) : y0Var;
        }

        private y0<String, String> internalGetMutableClientParams() {
            onChanged();
            if (this.clientParams_ == null) {
                this.clientParams_ = y0.q(ClientParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.clientParams_.n()) {
                this.clientParams_ = this.clientParams_.g();
            }
            return this.clientParams_;
        }

        private y0<String, String> internalGetMutableServerParams() {
            onChanged();
            if (this.serverParams_ == null) {
                this.serverParams_ = y0.q(ServerParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.serverParams_.n()) {
                this.serverParams_ = this.serverParams_.g();
            }
            return this.serverParams_;
        }

        private y0<String, String> internalGetServerParams() {
            y0<String, String> y0Var = this.serverParams_;
            return y0Var == null ? y0.h(ServerParamsDefaultEntryHolder.defaultEntry) : y0Var;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearBidder() {
            this.bidder_ = HeaderBiddingAd.getDefaultInstance().getBidder();
            onChanged();
            return this;
        }

        public Builder clearClientParams() {
            internalGetMutableClientParams().m().clear();
            return this;
        }

        public Builder clearServerParams() {
            internalGetMutableServerParams().m().clear();
            return this;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public boolean containsClientParams(String str) {
            str.getClass();
            return internalGetClientParams().j().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public boolean containsServerParams(String str) {
            str.getClass();
            return internalGetServerParams().j().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidder_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public int getClientParamsCount() {
            return internalGetClientParams().j().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().j();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getClientParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> mapJ = internalGetClientParams().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getClientParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> mapJ = internalGetClientParams().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        @Deprecated
        public Map<String, String> getMutableClientParams() {
            return internalGetMutableClientParams().m();
        }

        @Deprecated
        public Map<String, String> getMutableServerParams() {
            return internalGetMutableServerParams().m();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        @Deprecated
        public Map<String, String> getServerParams() {
            return getServerParamsMap();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public int getServerParamsCount() {
            return internalGetServerParams().j().size();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public Map<String, String> getServerParamsMap() {
            return internalGetServerParams().j();
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getServerParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> mapJ = internalGetServerParams().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.headerbidding.HeaderBiddingAdOrBuilder
        public String getServerParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> mapJ = internalGetServerParams().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.d(HeaderBiddingAd.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetClientParams();
            }
            if (i10 == 3) {
                return internalGetServerParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMutableMapField(int i10) {
            if (i10 == 2) {
                return internalGetMutableClientParams();
            }
            if (i10 == 3) {
                return internalGetMutableServerParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllClientParams(Map<String, String> map) {
            internalGetMutableClientParams().m().putAll(map);
            return this;
        }

        public Builder putAllServerParams(Map<String, String> map) {
            internalGetMutableServerParams().m().putAll(map);
            return this;
        }

        public Builder putClientParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableClientParams().m().put(str, str2);
            return this;
        }

        public Builder putServerParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableServerParams().m().put(str, str2);
            return this;
        }

        public Builder removeClientParams(String str) {
            str.getClass();
            internalGetMutableClientParams().m().remove(str);
            return this;
        }

        public Builder removeServerParams(String str) {
            str.getClass();
            internalGetMutableServerParams().m().remove(str);
            return this;
        }

        public Builder setBidder(String str) {
            str.getClass();
            this.bidder_ = str;
            onChanged();
            return this;
        }

        public Builder setBidderBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bidder_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingAd build() {
            HeaderBiddingAd headerBiddingAdBuildPartial = buildPartial();
            if (headerBiddingAdBuildPartial.isInitialized()) {
                return headerBiddingAdBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBiddingAdBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public HeaderBiddingAd buildPartial() {
            HeaderBiddingAd headerBiddingAd = new HeaderBiddingAd(this);
            headerBiddingAd.bidder_ = this.bidder_;
            headerBiddingAd.clientParams_ = internalGetClientParams();
            headerBiddingAd.clientParams_.o();
            headerBiddingAd.serverParams_ = internalGetServerParams();
            headerBiddingAd.serverParams_.o();
            onBuilt();
            return headerBiddingAd;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public HeaderBiddingAd mo164getDefaultInstanceForType() {
            return HeaderBiddingAd.getDefaultInstance();
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
            this.bidder_ = "";
            internalGetMutableClientParams().b();
            internalGetMutableServerParams().b();
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof HeaderBiddingAd) {
                return mergeFrom((HeaderBiddingAd) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(HeaderBiddingAd headerBiddingAd) {
            if (headerBiddingAd == HeaderBiddingAd.getDefaultInstance()) {
                return this;
            }
            if (!headerBiddingAd.getBidder().isEmpty()) {
                this.bidder_ = headerBiddingAd.bidder_;
                onChanged();
            }
            internalGetMutableClientParams().p(headerBiddingAd.internalGetClientParams());
            internalGetMutableServerParams().p(headerBiddingAd.internalGetServerParams());
            mergeUnknownFields(((j0) headerBiddingAd).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            HeaderBiddingAd headerBiddingAd = null;
            try {
                try {
                    HeaderBiddingAd headerBiddingAd2 = (HeaderBiddingAd) HeaderBiddingAd.PARSER.parsePartialFrom(nVar, yVar);
                    if (headerBiddingAd2 != null) {
                        mergeFrom(headerBiddingAd2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    HeaderBiddingAd headerBiddingAd3 = (HeaderBiddingAd) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        headerBiddingAd = headerBiddingAd3;
                        if (headerBiddingAd != null) {
                            mergeFrom(headerBiddingAd);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (headerBiddingAd != null) {
                    mergeFrom(headerBiddingAd);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(HeaderBiddingAd headerBiddingAd) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingAd);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private HeaderBiddingAd(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (HeaderBiddingAd) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public HeaderBiddingAd mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private HeaderBiddingAd() {
        this.memoizedIsInitialized = (byte) -1;
        this.bidder_ = "";
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static HeaderBiddingAd parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) j0.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HeaderBiddingAd(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.bidder_ = nVar.J();
                        } else if (iK == 18) {
                            if ((i10 & 1) == 0) {
                                this.clientParams_ = y0.q(ClientParamsDefaultEntryHolder.defaultEntry);
                                i10 |= 1;
                            }
                            w0 w0Var = (w0) nVar.A(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                            this.clientParams_.m().put(w0Var.h(), w0Var.n());
                        } else if (iK != 26) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            if ((i10 & 2) == 0) {
                                this.serverParams_ = y0.q(ServerParamsDefaultEntryHolder.defaultEntry);
                                i10 |= 2;
                            }
                            w0 w0Var2 = (w0) nVar.A(ServerParamsDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                            this.serverParams_.m().put(w0Var2.h(), w0Var2.n());
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

    public static HeaderBiddingAd parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (HeaderBiddingAd) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static HeaderBiddingAd parseFrom(n nVar) throws IOException {
        return (HeaderBiddingAd) j0.parseWithIOException(PARSER, nVar);
    }

    public static HeaderBiddingAd parseFrom(n nVar, y yVar) throws IOException {
        return (HeaderBiddingAd) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
