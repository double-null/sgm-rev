package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.e;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Response extends j0 implements d {
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int CDATA_FIELD_NUMBER = 5;
    public static final int CUR_FIELD_NUMBER = 4;
    public static final int EXT_FIELD_NUMBER = 8;
    public static final int EXT_PROTO_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NBR_FIELD_NUMBER = 3;
    public static final int SEATBID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object bidid_;
    private volatile Object cdata_;
    private volatile Object cur_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private byte memoizedIsInitialized;
    private int nbr_;
    private List<Seatbid> seatbid_;
    private static final Response DEFAULT_INSTANCE = new Response();
    private static final s1<Response> PARSER = new com.explorestack.protobuf.b<Response>() { // from class: com.explorestack.protobuf.openrtb.Response.1
        @Override // com.explorestack.protobuf.s1
        public Response parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Response(nVar, yVar);
        }
    };

    public static final class Seatbid extends j0 implements SeatbidOrBuilder {
        public static final int BID_FIELD_NUMBER = 3;
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        public static final int SEAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Bid> bid_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private boolean package_;
        private volatile Object seat_;
        private static final Seatbid DEFAULT_INSTANCE = new Seatbid();
        private static final s1<Seatbid> PARSER = new com.explorestack.protobuf.b<Seatbid>() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.1
            @Override // com.explorestack.protobuf.s1
            public Seatbid parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Seatbid(nVar, yVar);
            }
        };

        public static final class Bid extends j0 implements BidOrBuilder {
            public static final int BURL_FIELD_NUMBER = 8;
            public static final int CID_FIELD_NUMBER = 5;
            public static final int DEAL_FIELD_NUMBER = 4;
            public static final int EXP_FIELD_NUMBER = 10;
            public static final int EXT_FIELD_NUMBER = 15;
            public static final int EXT_PROTO_FIELD_NUMBER = 14;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ITEM_FIELD_NUMBER = 2;
            public static final int LURL_FIELD_NUMBER = 9;
            public static final int MACRO_FIELD_NUMBER = 12;
            public static final int MEDIA_FIELD_NUMBER = 13;
            public static final int MID_FIELD_NUMBER = 11;
            public static final int PRICE_FIELD_NUMBER = 3;
            public static final int PURL_FIELD_NUMBER = 7;
            public static final int TACTIC_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private volatile Object burl_;
            private volatile Object cid_;
            private volatile Object deal_;
            private int exp_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private volatile Object item_;
            private volatile Object lurl_;
            private List<Macro> macro_;
            private Any media_;
            private byte memoizedIsInitialized;
            private volatile Object mid_;
            private double price_;
            private volatile Object purl_;
            private volatile Object tactic_;
            private static final Bid DEFAULT_INSTANCE = new Bid();
            private static final s1<Bid> PARSER = new com.explorestack.protobuf.b<Bid>() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.1
                @Override // com.explorestack.protobuf.s1
                public Bid parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new Bid(nVar, yVar);
                }
            };

            public static final class Macro extends j0 implements MacroOrBuilder {
                public static final int EXT_FIELD_NUMBER = 4;
                public static final int EXT_PROTO_FIELD_NUMBER = 3;
                public static final int KEY_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private volatile Object key_;
                private byte memoizedIsInitialized;
                private volatile Object value_;
                private static final Macro DEFAULT_INSTANCE = new Macro();
                private static final s1<Macro> PARSER = new com.explorestack.protobuf.b<Macro>() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.1
                    @Override // com.explorestack.protobuf.s1
                    public Macro parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new Macro(nVar, yVar);
                    }
                };

                public static Macro getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f10731s;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Macro parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Macro) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<Macro> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Macro)) {
                        return super.equals(obj);
                    }
                    Macro macro = (Macro) obj;
                    if (getKey().equals(macro.getKey()) && getValue().equals(macro.getValue()) && hasExt() == macro.hasExt()) {
                        return (!hasExt() || getExt().equals(macro.getExt())) && getExtProtoList().equals(macro.getExtProtoList()) && this.unknownFields.equals(macro.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public i2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.key_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public ByteString getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public s1<Macro> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !getKeyBytes().isEmpty() ? j0.computeStringSize(1, this.key_) + 0 : 0;
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += j0.computeStringSize(2, this.value_);
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        iComputeStringSize += CodedOutputStream.G(3, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        iComputeStringSize += CodedOutputStream.G(4, getExt());
                    }
                    int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                public final u2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getKey().hashCode()) * 37) + 2) * 53) + getValue().hashCode();
                    if (hasExt()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.j0
                protected j0.f internalGetFieldAccessorTable() {
                    return b.f10732t.d(Macro.class, Builder.class);
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
                    return new Macro();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getKeyBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 1, this.key_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 2, this.value_);
                    }
                    for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                        codedOutputStream.L0(3, this.extProto_.get(i10));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.L0(4, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static final class Builder extends j0.b<Builder> implements MacroOrBuilder {
                    private int bitField0_;
                    private e2<Struct, Struct.Builder, i2> extBuilder_;
                    private z1<Any, Any.Builder, e> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object key_;
                    private Object value_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10731s;
                    }

                    private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (j0.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                        } else {
                            z1Var.a(iterable);
                        }
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                        } else {
                            z1Var.e(any);
                        }
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
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

                    public Builder clearExtProto() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                            onChanged();
                        } else {
                            z1Var.g();
                        }
                        return this;
                    }

                    public Builder clearKey() {
                        this.key_ = Macro.getDefaultInstance().getKey();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Macro.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f10731s;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
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

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public i2 getExtOrBuilder() {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var != null) {
                            return (i2) e2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public Any getExtProto(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                    }

                    public Any.Builder getExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().l();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public int getExtProtoCount() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.size() : z1Var.m();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public List<Any> getExtProtoList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public String getKey() {
                        Object obj = this.key_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.key_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public ByteString getKeyBytes() {
                        Object obj = this.key_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.key_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.f10732t.d(Macro.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder removeExtProto(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i10);
                            onChanged();
                        } else {
                            z1Var.v(i10);
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

                    public Builder setExtProto(int i10, Any any) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i10, any);
                            onChanged();
                        } else {
                            z1Var.w(i10, any);
                        }
                        return this;
                    }

                    public Builder setKey(String str) {
                        str.getClass();
                        this.key_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setKeyBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.key_ = byteString;
                        onChanged();
                        return this;
                    }

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Macro build() {
                        Macro macroBuildPartial = buildPartial();
                        if (macroBuildPartial.isInitialized()) {
                            return macroBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) macroBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Macro buildPartial() {
                        Macro macro = new Macro(this);
                        macro.key_ = this.key_;
                        macro.value_ = this.value_;
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var == null) {
                            macro.ext_ = this.ext_;
                        } else {
                            macro.ext_ = (Struct) e2Var.a();
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var != null) {
                            macro.extProto_ = z1Var.f();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            macro.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return macro;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public Macro mo164getDefaultInstanceForType() {
                        return Macro.getDefaultInstance();
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

                    public Any.Builder addExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                        this.key_ = "";
                        this.value_ = "";
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                        } else {
                            z1Var.g();
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

                    public Builder addExtProto(int i10, Any any) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, any);
                            onChanged();
                        } else {
                            z1Var.d(i10, any);
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
                        if (message instanceof Macro) {
                            return mergeFrom((Macro) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder setExtProto(int i10, Any.Builder builder) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i10, builder.build());
                            onChanged();
                        } else {
                            z1Var.w(i10, builder.build());
                        }
                        return this;
                    }

                    private Builder(j0.c cVar) {
                        super(cVar);
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(Macro macro) {
                        if (macro == Macro.getDefaultInstance()) {
                            return this;
                        }
                        if (!macro.getKey().isEmpty()) {
                            this.key_ = macro.key_;
                            onChanged();
                        }
                        if (!macro.getValue().isEmpty()) {
                            this.value_ = macro.value_;
                            onChanged();
                        }
                        if (macro.hasExt()) {
                            mergeExt(macro.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!macro.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = macro.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(macro.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!macro.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(macro.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = macro.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((j0) macro).unknownFields);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                        } else {
                            z1Var.e(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i10, Any.Builder builder) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, builder.build());
                            onChanged();
                        } else {
                            z1Var.d(i10, builder.build());
                        }
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                        Macro macro = null;
                        try {
                            try {
                                Macro macro2 = (Macro) Macro.PARSER.parsePartialFrom(nVar, yVar);
                                if (macro2 != null) {
                                    mergeFrom(macro2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Macro macro3 = (Macro) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    macro = macro3;
                                    if (macro != null) {
                                        mergeFrom(macro);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (macro != null) {
                                mergeFrom(macro);
                            }
                            throw th;
                        }
                    }
                }

                public static Builder newBuilder(Macro macro) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(macro);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                private Macro(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Macro parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Macro) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static Macro parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Macro mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Macro parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Macro() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.key_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.emptyList();
                }

                public static Macro parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static Macro parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static Macro parseFrom(InputStream inputStream) throws IOException {
                    return (Macro) j0.parseWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Macro) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                private Macro(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        this.key_ = nVar.J();
                                    } else if (iK == 18) {
                                        this.value_ = nVar.J();
                                    } else if (iK == 26) {
                                        if (!(z11 & true)) {
                                            this.extProto_ = new ArrayList();
                                            z11 |= true;
                                        }
                                        this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                    } else if (iK != 34) {
                                        if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                        this.ext_ = struct2;
                                        if (builder != null) {
                                            builder.mergeFrom(struct2);
                                            this.ext_ = builder.buildPartial();
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
                            if (z11 & true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = bVarG.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z11 & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static Macro parseFrom(n nVar) throws IOException {
                    return (Macro) j0.parseWithIOException(PARSER, nVar);
                }

                public static Macro parseFrom(n nVar, y yVar) throws IOException {
                    return (Macro) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface MacroOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                Struct getExt();

                i2 getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                e getExtProtoOrBuilder(int i10);

                List<? extends e> getExtProtoOrBuilderList();

                String getKey();

                ByteString getKeyBytes();

                String getValue();

                ByteString getValueBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Bid getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f10729q;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Bid parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Bid) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<Bid> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bid)) {
                    return super.equals(obj);
                }
                Bid bid = (Bid) obj;
                if (!getId().equals(bid.getId()) || !getItem().equals(bid.getItem()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(bid.getPrice()) || !getDeal().equals(bid.getDeal()) || !getCid().equals(bid.getCid()) || !getTactic().equals(bid.getTactic()) || !getPurl().equals(bid.getPurl()) || !getBurl().equals(bid.getBurl()) || !getLurl().equals(bid.getLurl()) || getExp() != bid.getExp() || !getMid().equals(bid.getMid()) || !getMacroList().equals(bid.getMacroList()) || hasMedia() != bid.hasMedia()) {
                    return false;
                }
                if ((!hasMedia() || getMedia().equals(bid.getMedia())) && hasExt() == bid.hasExt()) {
                    return (!hasExt() || getExt().equals(bid.getExt())) && getExtProtoList().equals(bid.getExtProtoList()) && this.unknownFields.equals(bid.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getBurl() {
                Object obj = this.burl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.burl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getBurlBytes() {
                Object obj = this.burl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.burl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getCid() {
                Object obj = this.cid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getCidBytes() {
                Object obj = this.cid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getDeal() {
                Object obj = this.deal_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.deal_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getDealBytes() {
                Object obj = this.deal_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deal_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getExp() {
                return this.exp_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getItem() {
                Object obj = this.item_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.item_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getItemBytes() {
                Object obj = this.item_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.item_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getLurl() {
                Object obj = this.lurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getLurlBytes() {
                Object obj = this.lurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Macro getMacro(int i10) {
                return this.macro_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getMacroCount() {
                return this.macro_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<Macro> getMacroList() {
                return this.macro_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public MacroOrBuilder getMacroOrBuilder(int i10) {
                return this.macro_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                return this.macro_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Any getMedia() {
                Any any = this.media_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public e getMediaOrBuilder() {
                return getMedia();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getMid() {
                Object obj = this.mid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getMidBytes() {
                Object obj = this.mid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<Bid> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getPurl() {
                Object obj = this.purl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.purl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getPurlBytes() {
                Object obj = this.purl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.purl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? j0.computeStringSize(1, this.id_) + 0 : 0;
                if (!getItemBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(2, this.item_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += CodedOutputStream.j(3, d10);
                }
                if (!getDealBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(9, this.lurl_);
                }
                int i11 = this.exp_;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.Y(10, i11);
                }
                if (!getMidBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(11, this.mid_);
                }
                for (int i12 = 0; i12 < this.macro_.size(); i12++) {
                    iComputeStringSize += CodedOutputStream.G(12, this.macro_.get(i12));
                }
                if (this.media_ != null) {
                    iComputeStringSize += CodedOutputStream.G(13, getMedia());
                }
                for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                    iComputeStringSize += CodedOutputStream.G(14, this.extProto_.get(i13));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += CodedOutputStream.G(15, getExt());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getTactic() {
                Object obj = this.tactic_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tactic_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getTacticBytes() {
                Object obj = this.tactic_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tactic_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public boolean hasMedia() {
                return this.media_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getItem().hashCode()) * 37) + 3) * 53) + l0.i(Double.doubleToLongBits(getPrice()))) * 37) + 4) * 53) + getDeal().hashCode()) * 37) + 5) * 53) + getCid().hashCode()) * 37) + 6) * 53) + getTactic().hashCode()) * 37) + 7) * 53) + getPurl().hashCode()) * 37) + 8) * 53) + getBurl().hashCode()) * 37) + 9) * 53) + getLurl().hashCode()) * 37) + 10) * 53) + getExp()) * 37) + 11) * 53) + getMid().hashCode();
                if (getMacroCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getMacroList().hashCode();
                }
                if (hasMedia()) {
                    iHashCode = (((iHashCode * 37) + 13) * 53) + getMedia().hashCode();
                }
                if (hasExt()) {
                    iHashCode = (((iHashCode * 37) + 15) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 14) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return b.f10730r.d(Bid.class, Builder.class);
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
                return new Bid();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 1, this.id_);
                }
                if (!getItemBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 2, this.item_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    codedOutputStream.t0(3, d10);
                }
                if (!getDealBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 9, this.lurl_);
                }
                int i10 = this.exp_;
                if (i10 != 0) {
                    codedOutputStream.c1(10, i10);
                }
                if (!getMidBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 11, this.mid_);
                }
                for (int i11 = 0; i11 < this.macro_.size(); i11++) {
                    codedOutputStream.L0(12, this.macro_.get(i11));
                }
                if (this.media_ != null) {
                    codedOutputStream.L0(13, getMedia());
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    codedOutputStream.L0(14, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(15, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements BidOrBuilder {
                private int bitField0_;
                private Object burl_;
                private Object cid_;
                private Object deal_;
                private int exp_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object item_;
                private Object lurl_;
                private z1<Macro, Macro.Builder, MacroOrBuilder> macroBuilder_;
                private List<Macro> macro_;
                private e2<Any, Any.Builder, e> mediaBuilder_;
                private Any media_;
                private Object mid_;
                private double price_;
                private Object purl_;
                private Object tactic_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureMacroIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.macro_ = new ArrayList(this.macro_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f10729q;
                }

                private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private z1<Macro, Macro.Builder, MacroOrBuilder> getMacroFieldBuilder() {
                    if (this.macroBuilder_ == null) {
                        this.macroBuilder_ = new z1<>(this.macro_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.macro_ = null;
                    }
                    return this.macroBuilder_;
                }

                private e2<Any, Any.Builder, e> getMediaFieldBuilder() {
                    if (this.mediaBuilder_ == null) {
                        this.mediaBuilder_ = new e2<>(getMedia(), getParentForChildren(), isClean());
                        this.media_ = null;
                    }
                    return this.mediaBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getMacroFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addAllMacro(Iterable<? extends Macro> iterable) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        ensureMacroIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.macro_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        z1Var.e(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder addMacro(Macro macro) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        macro.getClass();
                        ensureMacroIsMutable();
                        this.macro_.add(macro);
                        onChanged();
                    } else {
                        z1Var.e(macro);
                    }
                    return this;
                }

                public Macro.Builder addMacroBuilder() {
                    return (Macro.Builder) getMacroFieldBuilder().c(Macro.getDefaultInstance());
                }

                public Builder clearBurl() {
                    this.burl_ = Bid.getDefaultInstance().getBurl();
                    onChanged();
                    return this;
                }

                public Builder clearCid() {
                    this.cid_ = Bid.getDefaultInstance().getCid();
                    onChanged();
                    return this;
                }

                public Builder clearDeal() {
                    this.deal_ = Bid.getDefaultInstance().getDeal();
                    onChanged();
                    return this;
                }

                public Builder clearExp() {
                    this.exp_ = 0;
                    onChanged();
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

                public Builder clearExtProto() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Bid.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearItem() {
                    this.item_ = Bid.getDefaultInstance().getItem();
                    onChanged();
                    return this;
                }

                public Builder clearLurl() {
                    this.lurl_ = Bid.getDefaultInstance().getLurl();
                    onChanged();
                    return this;
                }

                public Builder clearMacro() {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        this.macro_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearMedia() {
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                        onChanged();
                    } else {
                        this.media_ = null;
                        this.mediaBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearMid() {
                    this.mid_ = Bid.getDefaultInstance().getMid();
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearPurl() {
                    this.purl_ = Bid.getDefaultInstance().getPurl();
                    onChanged();
                    return this;
                }

                public Builder clearTactic() {
                    this.tactic_ = Bid.getDefaultInstance().getTactic();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getBurl() {
                    Object obj = this.burl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.burl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getBurlBytes() {
                    Object obj = this.burl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.burl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getCid() {
                    Object obj = this.cid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.cid_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getCidBytes() {
                    Object obj = this.cid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.cid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getDeal() {
                    Object obj = this.deal_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.deal_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getDealBytes() {
                    Object obj = this.deal_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.deal_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f10729q;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getExp() {
                    return this.exp_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Any getExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getItem() {
                    Object obj = this.item_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.item_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getItemBytes() {
                    Object obj = this.item_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.item_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getLurl() {
                    Object obj = this.lurl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lurl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getLurlBytes() {
                    Object obj = this.lurl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lurl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Macro getMacro(int i10) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    return z1Var == null ? this.macro_.get(i10) : (Macro) z1Var.n(i10);
                }

                public Macro.Builder getMacroBuilder(int i10) {
                    return (Macro.Builder) getMacroFieldBuilder().k(i10);
                }

                public List<Macro.Builder> getMacroBuilderList() {
                    return getMacroFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getMacroCount() {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    return z1Var == null ? this.macro_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<Macro> getMacroList() {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.macro_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public MacroOrBuilder getMacroOrBuilder(int i10) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    return z1Var == null ? this.macro_.get(i10) : (MacroOrBuilder) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.macro_);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Any getMedia() {
                    e2<Any, Any.Builder, e> e2Var = this.mediaBuilder_;
                    if (e2Var != null) {
                        return (Any) e2Var.e();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                public Any.Builder getMediaBuilder() {
                    onChanged();
                    return (Any.Builder) getMediaFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public e getMediaOrBuilder() {
                    e2<Any, Any.Builder, e> e2Var = this.mediaBuilder_;
                    if (e2Var != null) {
                        return (e) e2Var.f();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getMid() {
                    Object obj = this.mid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.mid_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getMidBytes() {
                    Object obj = this.mid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.mid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getPurl() {
                    Object obj = this.purl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.purl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getPurlBytes() {
                    Object obj = this.purl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.purl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getTactic() {
                    Object obj = this.tactic_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.tactic_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getTacticBytes() {
                    Object obj = this.tactic_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.tactic_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public boolean hasMedia() {
                    return (this.mediaBuilder_ == null && this.media_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.f10730r.d(Bid.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
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

                public Builder mergeMedia(Any any) {
                    e2<Any, Any.Builder, e> e2Var = this.mediaBuilder_;
                    if (e2Var == null) {
                        Any any2 = this.media_;
                        if (any2 != null) {
                            this.media_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                        } else {
                            this.media_ = any;
                        }
                        onChanged();
                    } else {
                        e2Var.g(any);
                    }
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder removeMacro(int i10) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setBurl(String str) {
                    str.getClass();
                    this.burl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setBurlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.burl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setCid(String str) {
                    str.getClass();
                    this.cid_ = str;
                    onChanged();
                    return this;
                }

                public Builder setCidBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.cid_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setDeal(String str) {
                    str.getClass();
                    this.deal_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDealBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.deal_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setExp(int i10) {
                    this.exp_ = i10;
                    onChanged();
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

                public Builder setExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                    } else {
                        z1Var.w(i10, any);
                    }
                    return this;
                }

                public Builder setId(String str) {
                    str.getClass();
                    this.id_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setItem(String str) {
                    str.getClass();
                    this.item_ = str;
                    onChanged();
                    return this;
                }

                public Builder setItemBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.item_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLurl(String str) {
                    str.getClass();
                    this.lurl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLurlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.lurl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setMacro(int i10, Macro macro) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        macro.getClass();
                        ensureMacroIsMutable();
                        this.macro_.set(i10, macro);
                        onChanged();
                    } else {
                        z1Var.w(i10, macro);
                    }
                    return this;
                }

                public Builder setMedia(Any any) {
                    e2<Any, Any.Builder, e> e2Var = this.mediaBuilder_;
                    if (e2Var == null) {
                        any.getClass();
                        this.media_ = any;
                        onChanged();
                    } else {
                        e2Var.i(any);
                    }
                    return this;
                }

                public Builder setMid(String str) {
                    str.getClass();
                    this.mid_ = str;
                    onChanged();
                    return this;
                }

                public Builder setMidBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.mid_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setPurl(String str) {
                    str.getClass();
                    this.purl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setPurlBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.purl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTactic(String str) {
                    str.getClass();
                    this.tactic_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTacticBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.tactic_ = byteString;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    this.macro_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Bid build() {
                    Bid bidBuildPartial = buildPartial();
                    if (bidBuildPartial.isInitialized()) {
                        return bidBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bidBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Bid buildPartial() {
                    Bid bid = new Bid(this);
                    bid.id_ = this.id_;
                    bid.item_ = this.item_;
                    bid.price_ = this.price_;
                    bid.deal_ = this.deal_;
                    bid.cid_ = this.cid_;
                    bid.tactic_ = this.tactic_;
                    bid.purl_ = this.purl_;
                    bid.burl_ = this.burl_;
                    bid.lurl_ = this.lurl_;
                    bid.exp_ = this.exp_;
                    bid.mid_ = this.mid_;
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var != null) {
                        bid.macro_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.macro_ = Collections.unmodifiableList(this.macro_);
                            this.bitField0_ &= -2;
                        }
                        bid.macro_ = this.macro_;
                    }
                    e2<Any, Any.Builder, e> e2Var = this.mediaBuilder_;
                    if (e2Var == null) {
                        bid.media_ = this.media_;
                    } else {
                        bid.media_ = (Any) e2Var.a();
                    }
                    e2<Struct, Struct.Builder, i2> e2Var2 = this.extBuilder_;
                    if (e2Var2 == null) {
                        bid.ext_ = this.ext_;
                    } else {
                        bid.ext_ = (Struct) e2Var2.a();
                    }
                    z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                    if (z1Var2 != null) {
                        bid.extProto_ = z1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        bid.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return bid;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Bid mo164getDefaultInstanceForType() {
                    return Bid.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
                }

                public Macro.Builder addMacroBuilder(int i10) {
                    return (Macro.Builder) getMacroFieldBuilder().b(i10, Macro.getDefaultInstance());
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
                    this.id_ = "";
                    this.item_ = "";
                    this.price_ = 0.0d;
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.exp_ = 0;
                    this.mid_ = "";
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        this.macro_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        z1Var.g();
                    }
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                    } else {
                        this.media_ = null;
                        this.mediaBuilder_ = null;
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                    if (z1Var2 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        z1Var2.g();
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

                public Builder setMedia(Any.Builder builder) {
                    e2<Any, Any.Builder, e> e2Var = this.mediaBuilder_;
                    if (e2Var == null) {
                        this.media_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                    } else {
                        z1Var.d(i10, any);
                    }
                    return this;
                }

                public Builder addMacro(int i10, Macro macro) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        macro.getClass();
                        ensureMacroIsMutable();
                        this.macro_.add(i10, macro);
                        onChanged();
                    } else {
                        z1Var.d(i10, macro);
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
                    if (message instanceof Bid) {
                        return mergeFrom((Bid) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder setMacro(int i10, Macro.Builder builder) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(Bid bid) {
                    if (bid == Bid.getDefaultInstance()) {
                        return this;
                    }
                    if (!bid.getId().isEmpty()) {
                        this.id_ = bid.id_;
                        onChanged();
                    }
                    if (!bid.getItem().isEmpty()) {
                        this.item_ = bid.item_;
                        onChanged();
                    }
                    if (bid.getPrice() != 0.0d) {
                        setPrice(bid.getPrice());
                    }
                    if (!bid.getDeal().isEmpty()) {
                        this.deal_ = bid.deal_;
                        onChanged();
                    }
                    if (!bid.getCid().isEmpty()) {
                        this.cid_ = bid.cid_;
                        onChanged();
                    }
                    if (!bid.getTactic().isEmpty()) {
                        this.tactic_ = bid.tactic_;
                        onChanged();
                    }
                    if (!bid.getPurl().isEmpty()) {
                        this.purl_ = bid.purl_;
                        onChanged();
                    }
                    if (!bid.getBurl().isEmpty()) {
                        this.burl_ = bid.burl_;
                        onChanged();
                    }
                    if (!bid.getLurl().isEmpty()) {
                        this.lurl_ = bid.lurl_;
                        onChanged();
                    }
                    if (bid.getExp() != 0) {
                        setExp(bid.getExp());
                    }
                    if (!bid.getMid().isEmpty()) {
                        this.mid_ = bid.mid_;
                        onChanged();
                    }
                    if (this.macroBuilder_ == null) {
                        if (!bid.macro_.isEmpty()) {
                            if (this.macro_.isEmpty()) {
                                this.macro_ = bid.macro_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureMacroIsMutable();
                                this.macro_.addAll(bid.macro_);
                            }
                            onChanged();
                        }
                    } else if (!bid.macro_.isEmpty()) {
                        if (!this.macroBuilder_.t()) {
                            this.macroBuilder_.a(bid.macro_);
                        } else {
                            this.macroBuilder_.h();
                            this.macroBuilder_ = null;
                            this.macro_ = bid.macro_;
                            this.bitField0_ &= -2;
                            this.macroBuilder_ = j0.alwaysUseFieldBuilders ? getMacroFieldBuilder() : null;
                        }
                    }
                    if (bid.hasMedia()) {
                        mergeMedia(bid.getMedia());
                    }
                    if (bid.hasExt()) {
                        mergeExt(bid.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!bid.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = bid.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(bid.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!bid.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(bid.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = bid.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) bid).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addMacro(Macro.Builder builder) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    this.macro_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                public Builder addMacro(int i10, Macro.Builder builder) {
                    z1<Macro, Macro.Builder, MacroOrBuilder> z1Var = this.macroBuilder_;
                    if (z1Var == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    Bid bid = null;
                    try {
                        try {
                            Bid bid2 = (Bid) Bid.PARSER.parsePartialFrom(nVar, yVar);
                            if (bid2 != null) {
                                mergeFrom(bid2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Bid bid3 = (Bid) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                bid = bid3;
                                if (bid != null) {
                                    mergeFrom(bid);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bid != null) {
                            mergeFrom(bid);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(Bid bid) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(bid);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private Bid(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Bid parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (Bid) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static Bid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Bid mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Bid parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Bid() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.item_ = "";
                this.deal_ = "";
                this.cid_ = "";
                this.tactic_ = "";
                this.purl_ = "";
                this.burl_ = "";
                this.lurl_ = "";
                this.mid_ = "";
                this.macro_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            public static Bid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static Bid parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static Bid parseFrom(InputStream inputStream) throws IOException {
                return (Bid) j0.parseWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (Bid) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static Bid parseFrom(n nVar) throws IOException {
                return (Bid) j0.parseWithIOException(PARSER, nVar);
            }

            public static Bid parseFrom(n nVar, y yVar) throws IOException {
                return (Bid) j0.parseWithIOException(PARSER, nVar, yVar);
            }

            private Bid(n nVar, y yVar) throws InvalidProtocolBufferException {
                this();
                yVar.getClass();
                u2.b bVarG = u2.g();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = nVar.K();
                                switch (iK) {
                                    case 0:
                                        break;
                                    case 10:
                                        this.id_ = nVar.J();
                                        continue;
                                    case 18:
                                        this.item_ = nVar.J();
                                        continue;
                                    case 25:
                                        this.price_ = nVar.s();
                                        continue;
                                    case 34:
                                        this.deal_ = nVar.J();
                                        continue;
                                    case 42:
                                        this.cid_ = nVar.J();
                                        continue;
                                    case 50:
                                        this.tactic_ = nVar.J();
                                        continue;
                                    case 58:
                                        this.purl_ = nVar.J();
                                        continue;
                                    case 66:
                                        this.burl_ = nVar.J();
                                        continue;
                                    case 74:
                                        this.lurl_ = nVar.J();
                                        continue;
                                    case 80:
                                        this.exp_ = nVar.L();
                                        continue;
                                    case 90:
                                        this.mid_ = nVar.J();
                                        continue;
                                    case 98:
                                        int i11 = (i10 == true ? 1 : 0) & 1;
                                        i10 = i10;
                                        if (i11 == 0) {
                                            this.macro_ = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 1;
                                        }
                                        this.macro_.add((Macro) nVar.A(Macro.parser(), yVar));
                                        continue;
                                    case 106:
                                        Any any = this.media_;
                                        Any.Builder builder = any != null ? any.toBuilder() : null;
                                        Any any2 = (Any) nVar.A(Any.parser(), yVar);
                                        this.media_ = any2;
                                        if (builder != null) {
                                            builder.mergeFrom(any2);
                                            this.media_ = builder.buildPartial();
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 114:
                                        int i12 = (i10 == true ? 1 : 0) & 2;
                                        i10 = i10;
                                        if (i12 == 0) {
                                            this.extProto_ = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 2;
                                        }
                                        this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                        continue;
                                    case 122:
                                        Struct struct = this.ext_;
                                        Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                        this.ext_ = struct2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(struct2);
                                            this.ext_ = builder2.buildPartial();
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
                        if (((i10 == true ? 1 : 0) & 1) != 0) {
                            this.macro_ = Collections.unmodifiableList(this.macro_);
                        }
                        if (((i10 == true ? 1 : 0) & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.macro_ = Collections.unmodifiableList(this.macro_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }
        }

        public interface BidOrBuilder extends MessageOrBuilder {
            String getBurl();

            ByteString getBurlBytes();

            String getCid();

            ByteString getCidBytes();

            String getDeal();

            ByteString getDealBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            int getExp();

            Struct getExt();

            i2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getItem();

            ByteString getItemBytes();

            String getLurl();

            ByteString getLurlBytes();

            Bid.Macro getMacro(int i10);

            int getMacroCount();

            List<Bid.Macro> getMacroList();

            Bid.MacroOrBuilder getMacroOrBuilder(int i10);

            List<? extends Bid.MacroOrBuilder> getMacroOrBuilderList();

            Any getMedia();

            e getMediaOrBuilder();

            String getMid();

            ByteString getMidBytes();

            double getPrice();

            String getPurl();

            ByteString getPurlBytes();

            String getTactic();

            ByteString getTacticBytes();

            boolean hasExt();

            boolean hasMedia();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Seatbid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f10727o;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Seatbid) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Seatbid> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Seatbid)) {
                return super.equals(obj);
            }
            Seatbid seatbid = (Seatbid) obj;
            if (getSeat().equals(seatbid.getSeat()) && getPackage() == seatbid.getPackage() && getBidList().equals(seatbid.getBidList()) && hasExt() == seatbid.hasExt()) {
                return (!hasExt() || getExt().equals(seatbid.getExt())) && getExtProtoList().equals(seatbid.getExtProtoList()) && this.unknownFields.equals(seatbid.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Bid getBid(int i10) {
            return this.bid_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public int getBidCount() {
            return this.bid_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<Bid> getBidList() {
            return this.bid_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public BidOrBuilder getBidOrBuilder(int i10) {
            return this.bid_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<? extends BidOrBuilder> getBidOrBuilderList() {
            return this.bid_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public boolean getPackage() {
            return this.package_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Seatbid> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getSeatBytes().isEmpty() ? j0.computeStringSize(1, this.seat_) + 0 : 0;
            boolean z10 = this.package_;
            if (z10) {
                iComputeStringSize += CodedOutputStream.e(2, z10);
            }
            for (int i11 = 0; i11 < this.bid_.size(); i11++) {
                iComputeStringSize += CodedOutputStream.G(3, this.bid_.get(i11));
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                iComputeStringSize += CodedOutputStream.G(4, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                iComputeStringSize += CodedOutputStream.G(5, getExt());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSeat().hashCode()) * 37) + 2) * 53) + l0.d(getPackage());
            if (getBidCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBidList().hashCode();
            }
            if (hasExt()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.f10728p.d(Seatbid.class, Builder.class);
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
            return new Seatbid();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getSeatBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 1, this.seat_);
            }
            boolean z10 = this.package_;
            if (z10) {
                codedOutputStream.n0(2, z10);
            }
            for (int i10 = 0; i10 < this.bid_.size(); i10++) {
                codedOutputStream.L0(3, this.bid_.get(i10));
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                codedOutputStream.L0(4, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(5, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements SeatbidOrBuilder {
            private z1<Bid, Bid.Builder, BidOrBuilder> bidBuilder_;
            private List<Bid> bid_;
            private int bitField0_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean package_;
            private Object seat_;

            private void ensureBidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.bid_ = new ArrayList(this.bid_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private z1<Bid, Bid.Builder, BidOrBuilder> getBidFieldBuilder() {
                if (this.bidBuilder_ == null) {
                    this.bidBuilder_ = new z1<>(this.bid_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.bid_ = null;
                }
                return this.bidBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f10727o;
            }

            private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getBidFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllBid(Iterable<? extends Bid> iterable) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    ensureBidIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.bid_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addBid(Bid bid) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    bid.getClass();
                    ensureBidIsMutable();
                    this.bid_.add(bid);
                    onChanged();
                } else {
                    z1Var.e(bid);
                }
                return this;
            }

            public Bid.Builder addBidBuilder() {
                return (Bid.Builder) getBidFieldBuilder().c(Bid.getDefaultInstance());
            }

            public Builder addExtProto(Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    z1Var.e(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder clearBid() {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    this.bid_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
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

            public Builder clearExtProto() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearPackage() {
                this.package_ = false;
                onChanged();
                return this;
            }

            public Builder clearSeat() {
                this.seat_ = Seatbid.getDefaultInstance().getSeat();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Bid getBid(int i10) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                return z1Var == null ? this.bid_.get(i10) : (Bid) z1Var.n(i10);
            }

            public Bid.Builder getBidBuilder(int i10) {
                return (Bid.Builder) getBidFieldBuilder().k(i10);
            }

            public List<Bid.Builder> getBidBuilderList() {
                return getBidFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public int getBidCount() {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                return z1Var == null ? this.bid_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<Bid> getBidList() {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.bid_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public BidOrBuilder getBidOrBuilder(int i10) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                return z1Var == null ? this.bid_.get(i10) : (BidOrBuilder) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<? extends BidOrBuilder> getBidOrBuilderList() {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.bid_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f10727o;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Any getExtProto(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
            }

            public Any.Builder getExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().k(i10);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public boolean getPackage() {
                return this.package_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public String getSeat() {
                Object obj = this.seat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.seat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public ByteString getSeatBytes() {
                Object obj = this.seat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.seat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.f10728p.d(Seatbid.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
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

            public Builder removeBid(int i10) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder removeExtProto(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setBid(int i10, Bid bid) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    bid.getClass();
                    ensureBidIsMutable();
                    this.bid_.set(i10, bid);
                    onChanged();
                } else {
                    z1Var.w(i10, bid);
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

            public Builder setExtProto(int i10, Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, any);
                    onChanged();
                } else {
                    z1Var.w(i10, any);
                }
                return this;
            }

            public Builder setPackage(boolean z10) {
                this.package_ = z10;
                onChanged();
                return this;
            }

            public Builder setSeat(String str) {
                str.getClass();
                this.seat_ = str;
                onChanged();
                return this;
            }

            public Builder setSeatBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.seat_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.seat_ = "";
                this.bid_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Seatbid build() {
                Seatbid seatbidBuildPartial = buildPartial();
                if (seatbidBuildPartial.isInitialized()) {
                    return seatbidBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) seatbidBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Seatbid buildPartial() {
                Seatbid seatbid = new Seatbid(this);
                seatbid.seat_ = this.seat_;
                seatbid.package_ = this.package_;
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var != null) {
                    seatbid.bid_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.bid_ = Collections.unmodifiableList(this.bid_);
                        this.bitField0_ &= -2;
                    }
                    seatbid.bid_ = this.bid_;
                }
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    seatbid.ext_ = this.ext_;
                } else {
                    seatbid.ext_ = (Struct) e2Var.a();
                }
                z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                if (z1Var2 != null) {
                    seatbid.extProto_ = z1Var2.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    seatbid.extProto_ = this.extProto_;
                }
                onBuilt();
                return seatbid;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Seatbid mo164getDefaultInstanceForType() {
                return Seatbid.getDefaultInstance();
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

            public Bid.Builder addBidBuilder(int i10) {
                return (Bid.Builder) getBidFieldBuilder().b(i10, Bid.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                this.seat_ = "";
                this.package_ = false;
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    this.bid_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                if (z1Var2 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    z1Var2.g();
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

            public Builder addBid(int i10, Bid bid) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    bid.getClass();
                    ensureBidIsMutable();
                    this.bid_.add(i10, bid);
                    onChanged();
                } else {
                    z1Var.d(i10, bid);
                }
                return this;
            }

            public Builder addExtProto(int i10, Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, any);
                    onChanged();
                } else {
                    z1Var.d(i10, any);
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
                if (message instanceof Seatbid) {
                    return mergeFrom((Seatbid) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBid(int i10, Bid.Builder builder) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder setExtProto(int i10, Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.seat_ = "";
                this.bid_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Seatbid seatbid) {
                if (seatbid == Seatbid.getDefaultInstance()) {
                    return this;
                }
                if (!seatbid.getSeat().isEmpty()) {
                    this.seat_ = seatbid.seat_;
                    onChanged();
                }
                if (seatbid.getPackage()) {
                    setPackage(seatbid.getPackage());
                }
                if (this.bidBuilder_ == null) {
                    if (!seatbid.bid_.isEmpty()) {
                        if (this.bid_.isEmpty()) {
                            this.bid_ = seatbid.bid_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureBidIsMutable();
                            this.bid_.addAll(seatbid.bid_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.bid_.isEmpty()) {
                    if (!this.bidBuilder_.t()) {
                        this.bidBuilder_.a(seatbid.bid_);
                    } else {
                        this.bidBuilder_.h();
                        this.bidBuilder_ = null;
                        this.bid_ = seatbid.bid_;
                        this.bitField0_ &= -2;
                        this.bidBuilder_ = j0.alwaysUseFieldBuilders ? getBidFieldBuilder() : null;
                    }
                }
                if (seatbid.hasExt()) {
                    mergeExt(seatbid.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!seatbid.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = seatbid.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(seatbid.extProto_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(seatbid.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = seatbid.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) seatbid).unknownFields);
                onChanged();
                return this;
            }

            public Builder addBid(Bid.Builder builder) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addBid(int i10, Bid.Builder builder) {
                z1<Bid, Bid.Builder, BidOrBuilder> z1Var = this.bidBuilder_;
                if (z1Var == null) {
                    ensureBidIsMutable();
                    this.bid_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i10, Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Seatbid seatbid = null;
                try {
                    try {
                        Seatbid seatbid2 = (Seatbid) Seatbid.PARSER.parsePartialFrom(nVar, yVar);
                        if (seatbid2 != null) {
                            mergeFrom(seatbid2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Seatbid seatbid3 = (Seatbid) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            seatbid = seatbid3;
                            if (seatbid != null) {
                                mergeFrom(seatbid);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (seatbid != null) {
                        mergeFrom(seatbid);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Seatbid seatbid) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(seatbid);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Seatbid(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Seatbid) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Seatbid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Seatbid mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Seatbid parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Seatbid() {
            this.memoizedIsInitialized = (byte) -1;
            this.seat_ = "";
            this.bid_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        public static Seatbid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Seatbid parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Seatbid parseFrom(InputStream inputStream) throws IOException {
            return (Seatbid) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Seatbid) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        private Seatbid(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.seat_ = nVar.J();
                            } else if (iK == 16) {
                                this.package_ = nVar.q();
                            } else if (iK == 26) {
                                if ((i10 & 1) == 0) {
                                    this.bid_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.bid_.add((Bid) nVar.A(Bid.parser(), yVar));
                            } else if (iK == 34) {
                                if ((i10 & 2) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                            } else if (iK != 42) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
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
                    if ((i10 & 1) != 0) {
                        this.bid_ = Collections.unmodifiableList(this.bid_);
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i10 & 1) != 0) {
                this.bid_ = Collections.unmodifiableList(this.bid_);
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Seatbid parseFrom(n nVar) throws IOException {
            return (Seatbid) j0.parseWithIOException(PARSER, nVar);
        }

        public static Seatbid parseFrom(n nVar, y yVar) throws IOException {
            return (Seatbid) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface SeatbidOrBuilder extends MessageOrBuilder {
        Seatbid.Bid getBid(int i10);

        int getBidCount();

        List<Seatbid.Bid> getBidList();

        Seatbid.BidOrBuilder getBidOrBuilder(int i10);

        List<? extends Seatbid.BidOrBuilder> getBidOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        Struct getExt();

        i2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        boolean getPackage();

        String getSeat();

        ByteString getSeatBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f10725m;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Response) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Response> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return super.equals(obj);
        }
        Response response = (Response) obj;
        if (getId().equals(response.getId()) && getBidid().equals(response.getBidid()) && this.nbr_ == response.nbr_ && getCur().equals(response.getCur()) && getCdata().equals(response.getCdata()) && getSeatbidList().equals(response.getSeatbidList()) && hasExt() == response.hasExt()) {
            return (!hasExt() || getExt().equals(response.getExt())) && getExtProtoList().equals(response.getExtProtoList()) && this.unknownFields.equals(response.unknownFields);
        }
        return false;
    }

    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getCdata() {
        Object obj = this.cdata_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cdata_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCdataBytes() {
        Object obj = this.cdata_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cdata_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getCur() {
        Object obj = this.cur_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cur_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCurBytes() {
        Object obj = this.cur_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cur_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public i2 getExtOrBuilder() {
        return getExt();
    }

    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public e getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    public List<? extends e> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public NoBidReason getNbr() {
        NoBidReason noBidReasonValueOf = NoBidReason.valueOf(this.nbr_);
        return noBidReasonValueOf == null ? NoBidReason.UNRECOGNIZED : noBidReasonValueOf;
    }

    public int getNbrValue() {
        return this.nbr_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Response> getParserForType() {
        return PARSER;
    }

    public Seatbid getSeatbid(int i10) {
        return this.seatbid_.get(i10);
    }

    public int getSeatbidCount() {
        return this.seatbid_.size();
    }

    public List<Seatbid> getSeatbidList() {
        return this.seatbid_;
    }

    public SeatbidOrBuilder getSeatbidOrBuilder(int i10) {
        return this.seatbid_.get(i10);
    }

    public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
        return this.seatbid_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? j0.computeStringSize(1, this.id_) + 0 : 0;
        if (!getBididBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(5, this.cdata_);
        }
        for (int i11 = 0; i11 < this.seatbid_.size(); i11++) {
            iComputeStringSize += CodedOutputStream.G(6, this.seatbid_.get(i11));
        }
        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
            iComputeStringSize += CodedOutputStream.G(7, this.extProto_.get(i12));
        }
        if (this.ext_ != null) {
            iComputeStringSize += CodedOutputStream.G(8, getExt());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getBidid().hashCode()) * 37) + 3) * 53) + this.nbr_) * 37) + 4) * 53) + getCur().hashCode()) * 37) + 5) * 53) + getCdata().hashCode();
        if (getSeatbidCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getSeatbidList().hashCode();
        }
        if (hasExt()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return b.f10726n.d(Response.class, Builder.class);
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
        return new Response();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getIdBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.id_);
        }
        if (!getBididBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            codedOutputStream.v0(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 5, this.cdata_);
        }
        for (int i10 = 0; i10 < this.seatbid_.size(); i10++) {
            codedOutputStream.L0(6, this.seatbid_.get(i10));
        }
        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
            codedOutputStream.L0(7, this.extProto_.get(i11));
        }
        if (this.ext_ != null) {
            codedOutputStream.L0(8, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements d {
        private Object bidid_;
        private int bitField0_;
        private Object cdata_;
        private Object cur_;
        private e2<Struct, Struct.Builder, i2> extBuilder_;
        private z1<Any, Any.Builder, e> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private int nbr_;
        private z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> seatbidBuilder_;
        private List<Seatbid> seatbid_;

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureSeatbidIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.seatbid_ = new ArrayList(this.seatbid_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f10725m;
        }

        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> getSeatbidFieldBuilder() {
            if (this.seatbidBuilder_ == null) {
                this.seatbidBuilder_ = new z1<>(this.seatbid_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.seatbid_ = null;
            }
            return this.seatbidBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getSeatbidFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addAllSeatbid(Iterable<? extends Seatbid> iterable) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                ensureSeatbidIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.seatbid_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addExtProto(Any any) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
            } else {
                z1Var.e(any);
            }
            return this;
        }

        public Any.Builder addExtProtoBuilder() {
            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
        }

        public Builder addSeatbid(Seatbid seatbid) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                seatbid.getClass();
                ensureSeatbidIsMutable();
                this.seatbid_.add(seatbid);
                onChanged();
            } else {
                z1Var.e(seatbid);
            }
            return this;
        }

        public Seatbid.Builder addSeatbidBuilder() {
            return (Seatbid.Builder) getSeatbidFieldBuilder().c(Seatbid.getDefaultInstance());
        }

        public Builder clearBidid() {
            this.bidid_ = Response.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder clearCdata() {
            this.cdata_ = Response.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder clearCur() {
            this.cur_ = Response.getDefaultInstance().getCur();
            onChanged();
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

        public Builder clearExtProto() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearId() {
            this.id_ = Response.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearNbr() {
            this.nbr_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeatbid() {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                this.seatbid_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getCdata() {
            Object obj = this.cdata_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cdata_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCdataBytes() {
            Object obj = this.cdata_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cdata_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getCur() {
            Object obj = this.cur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cur_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCurBytes() {
            Object obj = this.cur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cur_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f10725m;
        }

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

        public i2 getExtOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Any getExtProto(int i10) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
        }

        public Any.Builder getExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().k(i10);
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().l();
        }

        public int getExtProtoCount() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? this.extProto_.size() : z1Var.m();
        }

        public List<Any> getExtProtoList() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
        }

        public e getExtProtoOrBuilder(int i10) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
        }

        public List<? extends e> getExtProtoOrBuilderList() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public NoBidReason getNbr() {
            NoBidReason noBidReasonValueOf = NoBidReason.valueOf(this.nbr_);
            return noBidReasonValueOf == null ? NoBidReason.UNRECOGNIZED : noBidReasonValueOf;
        }

        public int getNbrValue() {
            return this.nbr_;
        }

        public Seatbid getSeatbid(int i10) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            return z1Var == null ? this.seatbid_.get(i10) : (Seatbid) z1Var.n(i10);
        }

        public Seatbid.Builder getSeatbidBuilder(int i10) {
            return (Seatbid.Builder) getSeatbidFieldBuilder().k(i10);
        }

        public List<Seatbid.Builder> getSeatbidBuilderList() {
            return getSeatbidFieldBuilder().l();
        }

        public int getSeatbidCount() {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            return z1Var == null ? this.seatbid_.size() : z1Var.m();
        }

        public List<Seatbid> getSeatbidList() {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.seatbid_) : z1Var.p();
        }

        public SeatbidOrBuilder getSeatbidOrBuilder(int i10) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            return z1Var == null ? this.seatbid_.get(i10) : (SeatbidOrBuilder) z1Var.q(i10);
        }

        public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.seatbid_);
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return b.f10726n.d(Response.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
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

        public Builder removeExtProto(int i10) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder removeSeatbid(int i10) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setBidid(String str) {
            str.getClass();
            this.bidid_ = str;
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.bidid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCdata(String str) {
            str.getClass();
            this.cdata_ = str;
            onChanged();
            return this;
        }

        public Builder setCdataBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.cdata_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCur(String str) {
            str.getClass();
            this.cur_ = str;
            onChanged();
            return this;
        }

        public Builder setCurBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.cur_ = byteString;
            onChanged();
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

        public Builder setExtProto(int i10, Any any) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, any);
                onChanged();
            } else {
                z1Var.w(i10, any);
            }
            return this;
        }

        public Builder setId(String str) {
            str.getClass();
            this.id_ = str;
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            onChanged();
            return this;
        }

        public Builder setNbr(NoBidReason noBidReason) {
            noBidReason.getClass();
            this.nbr_ = noBidReason.getNumber();
            onChanged();
            return this;
        }

        public Builder setNbrValue(int i10) {
            this.nbr_ = i10;
            onChanged();
            return this;
        }

        public Builder setSeatbid(int i10, Seatbid seatbid) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                seatbid.getClass();
                ensureSeatbidIsMutable();
                this.seatbid_.set(i10, seatbid);
                onChanged();
            } else {
                z1Var.w(i10, seatbid);
            }
            return this;
        }

        private Builder() {
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            this.seatbid_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Response build() {
            Response responseBuildPartial = buildPartial();
            if (responseBuildPartial.isInitialized()) {
                return responseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) responseBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Response buildPartial() {
            Response response = new Response(this);
            response.id_ = this.id_;
            response.bidid_ = this.bidid_;
            response.nbr_ = this.nbr_;
            response.cur_ = this.cur_;
            response.cdata_ = this.cdata_;
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var != null) {
                response.seatbid_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
                    this.bitField0_ &= -2;
                }
                response.seatbid_ = this.seatbid_;
            }
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                response.ext_ = this.ext_;
            } else {
                response.ext_ = (Struct) e2Var.a();
            }
            z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
            if (z1Var2 != null) {
                response.extProto_ = z1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -3;
                }
                response.extProto_ = this.extProto_;
            }
            onBuilt();
            return response;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Response mo164getDefaultInstanceForType() {
            return Response.getDefaultInstance();
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

        public Any.Builder addExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
        }

        public Seatbid.Builder addSeatbidBuilder(int i10) {
            return (Seatbid.Builder) getSeatbidFieldBuilder().b(i10, Seatbid.getDefaultInstance());
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
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                this.seatbid_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
            if (z1Var2 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                z1Var2.g();
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

        public Builder addExtProto(int i10, Any any) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, any);
                onChanged();
            } else {
                z1Var.d(i10, any);
            }
            return this;
        }

        public Builder addSeatbid(int i10, Seatbid seatbid) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                seatbid.getClass();
                ensureSeatbidIsMutable();
                this.seatbid_.add(i10, seatbid);
                onChanged();
            } else {
                z1Var.d(i10, seatbid);
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
            if (message instanceof Response) {
                return mergeFrom((Response) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setExtProto(int i10, Any.Builder builder) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder setSeatbid(int i10, Seatbid.Builder builder) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(Response response) {
            if (response == Response.getDefaultInstance()) {
                return this;
            }
            if (!response.getId().isEmpty()) {
                this.id_ = response.id_;
                onChanged();
            }
            if (!response.getBidid().isEmpty()) {
                this.bidid_ = response.bidid_;
                onChanged();
            }
            if (response.nbr_ != 0) {
                setNbrValue(response.getNbrValue());
            }
            if (!response.getCur().isEmpty()) {
                this.cur_ = response.cur_;
                onChanged();
            }
            if (!response.getCdata().isEmpty()) {
                this.cdata_ = response.cdata_;
                onChanged();
            }
            if (this.seatbidBuilder_ == null) {
                if (!response.seatbid_.isEmpty()) {
                    if (this.seatbid_.isEmpty()) {
                        this.seatbid_ = response.seatbid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSeatbidIsMutable();
                        this.seatbid_.addAll(response.seatbid_);
                    }
                    onChanged();
                }
            } else if (!response.seatbid_.isEmpty()) {
                if (!this.seatbidBuilder_.t()) {
                    this.seatbidBuilder_.a(response.seatbid_);
                } else {
                    this.seatbidBuilder_.h();
                    this.seatbidBuilder_ = null;
                    this.seatbid_ = response.seatbid_;
                    this.bitField0_ &= -2;
                    this.seatbidBuilder_ = j0.alwaysUseFieldBuilders ? getSeatbidFieldBuilder() : null;
                }
            }
            if (response.hasExt()) {
                mergeExt(response.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!response.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = response.extProto_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(response.extProto_);
                    }
                    onChanged();
                }
            } else if (!response.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(response.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = response.extProto_;
                    this.bitField0_ &= -3;
                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) response).unknownFields);
            onChanged();
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            this.seatbid_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addExtProto(Any.Builder builder) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addSeatbid(Seatbid.Builder builder) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addExtProto(int i10, Any.Builder builder) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        public Builder addSeatbid(int i10, Seatbid.Builder builder) {
            z1<Seatbid, Seatbid.Builder, SeatbidOrBuilder> z1Var = this.seatbidBuilder_;
            if (z1Var == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Response response = null;
            try {
                try {
                    Response response2 = (Response) Response.PARSER.parsePartialFrom(nVar, yVar);
                    if (response2 != null) {
                        mergeFrom(response2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Response response3 = (Response) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        response = response3;
                        if (response != null) {
                            mergeFrom(response);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (response != null) {
                    mergeFrom(response);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Response response) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
    }

    public static Response parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Response(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Response parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Response) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Response mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Response parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Response() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        this.bidid_ = "";
        this.nbr_ = 0;
        this.cur_ = "";
        this.cdata_ = "";
        this.seatbid_ = Collections.emptyList();
        this.extProto_ = Collections.emptyList();
    }

    public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Response parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Response parseFrom(InputStream inputStream) throws IOException {
        return (Response) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Response) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Response parseFrom(n nVar) throws IOException {
        return (Response) j0.parseWithIOException(PARSER, nVar);
    }

    public static Response parseFrom(n nVar, y yVar) throws IOException {
        return (Response) j0.parseWithIOException(PARSER, nVar, yVar);
    }

    private Response(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = nVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.id_ = nVar.J();
                            } else if (iK == 18) {
                                this.bidid_ = nVar.J();
                            } else if (iK == 24) {
                                this.nbr_ = nVar.t();
                            } else if (iK == 34) {
                                this.cur_ = nVar.J();
                            } else if (iK == 42) {
                                this.cdata_ = nVar.J();
                            } else if (iK == 50) {
                                if ((i10 & 1) == 0) {
                                    this.seatbid_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.seatbid_.add((Seatbid) nVar.A(Seatbid.parser(), yVar));
                            } else if (iK == 58) {
                                if ((i10 & 2) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                            } else if (iK != 66) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
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
                if ((i10 & 1) != 0) {
                    this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i10 & 1) != 0) {
            this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
        }
        if ((i10 & 2) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
