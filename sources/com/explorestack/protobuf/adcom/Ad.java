package com.explorestack.protobuf.adcom;

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
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.e;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.q0;
import com.explorestack.protobuf.r0;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.w1;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.y0;
import com.explorestack.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Ad extends j0 implements a {
    public static final int ADOMAIN_FIELD_NUMBER = 2;
    public static final int AUDIT_FIELD_NUMBER = 16;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    public static final int CATTAX_FIELD_NUMBER = 6;
    public static final int CAT_FIELD_NUMBER = 5;
    public static final int DISPLAY_FIELD_NUMBER = 13;
    public static final int EXT_FIELD_NUMBER = 18;
    public static final int EXT_PROTO_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INIT_FIELD_NUMBER = 11;
    public static final int IURL_FIELD_NUMBER = 4;
    public static final int LANG_FIELD_NUMBER = 7;
    public static final int LASTMOD_FIELD_NUMBER = 12;
    public static final int MRATING_FIELD_NUMBER = 10;
    public static final int SECURE_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private r0 adomain_;
    private Audit audit_;
    private r0 bundle_;
    private r0 cat_;
    private int cattax_;
    private Display display_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private volatile Object init_;
    private volatile Object iurl_;
    private volatile Object lang_;
    private volatile Object lastmod_;
    private byte memoizedIsInitialized;
    private int mrating_;
    private boolean secure_;
    private Video video_;
    private static final Ad DEFAULT_INSTANCE = new Ad();
    private static final s1<Ad> PARSER = new com.explorestack.protobuf.b<Ad>() { // from class: com.explorestack.protobuf.adcom.Ad.1
        @Override // com.explorestack.protobuf.s1
        public Ad parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Ad(nVar, yVar);
        }
    };

    public static final class Audit extends j0 implements AuditOrBuilder {
        public static final int CORR_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int FEEDBACK_FIELD_NUMBER = 2;
        public static final int INIT_FIELD_NUMBER = 3;
        public static final int LASTMOD_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Ad corr_;
        private List<Any> extProto_;
        private Struct ext_;
        private r0 feedback_;
        private volatile Object init_;
        private volatile Object lastmod_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final Audit DEFAULT_INSTANCE = new Audit();
        private static final s1<Audit> PARSER = new com.explorestack.protobuf.b<Audit>() { // from class: com.explorestack.protobuf.adcom.Ad.Audit.1
            @Override // com.explorestack.protobuf.s1
            public Audit parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Audit(nVar, yVar);
            }
        };

        public static final class Builder extends j0.b<Builder> implements AuditOrBuilder {
            private int bitField0_;
            private e2<Ad, Builder, a> corrBuilder_;
            private Ad corr_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private r0 feedback_;
            private Object init_;
            private Object lastmod_;
            private int status_;

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureFeedbackIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.feedback_ = new q0(this.feedback_);
                    this.bitField0_ |= 1;
                }
            }

            private e2<Ad, Builder, a> getCorrFieldBuilder() {
                if (this.corrBuilder_ == null) {
                    this.corrBuilder_ = new e2<>(getCorr(), getParentForChildren(), isClean());
                    this.corr_ = null;
                }
                return this.corrBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.E0;
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

            public Builder addAllFeedback(Iterable<String> iterable) {
                ensureFeedbackIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.feedback_);
                onChanged();
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

            public Builder addFeedback(String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.add(str);
                onChanged();
                return this;
            }

            public Builder addFeedbackBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureFeedbackIsMutable();
                this.feedback_.b(byteString);
                onChanged();
                return this;
            }

            public Builder clearCorr() {
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                    onChanged();
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
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

            public Builder clearFeedback() {
                this.feedback_ = q0.f10776d;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInit() {
                this.init_ = Audit.getDefaultInstance().getInit();
                onChanged();
                return this;
            }

            public Builder clearLastmod() {
                this.lastmod_ = Audit.getDefaultInstance().getLastmod();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public Ad getCorr() {
                e2<Ad, Builder, a> e2Var = this.corrBuilder_;
                if (e2Var != null) {
                    return (Ad) e2Var.e();
                }
                Ad ad2 = this.corr_;
                return ad2 == null ? Ad.getDefaultInstance() : ad2;
            }

            public Builder getCorrBuilder() {
                onChanged();
                return (Builder) getCorrFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public a getCorrOrBuilder() {
                e2<Ad, Builder, a> e2Var = this.corrBuilder_;
                if (e2Var != null) {
                    return (a) e2Var.f();
                }
                Ad ad2 = this.corr_;
                return ad2 == null ? Ad.getDefaultInstance() : ad2;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.E0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getFeedback(int i10) {
                return this.feedback_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getFeedbackBytes(int i10) {
                return this.feedback_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getFeedbackCount() {
                return this.feedback_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getInit() {
                Object obj = this.init_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.init_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getInitBytes() {
                Object obj = this.init_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.init_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getLastmod() {
                Object obj = this.lastmod_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastmod_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getLastmodBytes() {
                Object obj = this.lastmod_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastmod_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public AuditStatusCode getStatus() {
                AuditStatusCode auditStatusCodeValueOf = AuditStatusCode.valueOf(this.status_);
                return auditStatusCodeValueOf == null ? AuditStatusCode.UNRECOGNIZED : auditStatusCodeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public boolean hasCorr() {
                return (this.corrBuilder_ == null && this.corr_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.F0.d(Audit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCorr(Ad ad2) {
                e2<Ad, Builder, a> e2Var = this.corrBuilder_;
                if (e2Var == null) {
                    Ad ad3 = this.corr_;
                    if (ad3 != null) {
                        this.corr_ = Ad.newBuilder(ad3).mergeFrom(ad2).buildPartial();
                    } else {
                        this.corr_ = ad2;
                    }
                    onChanged();
                } else {
                    e2Var.g(ad2);
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

            public Builder setCorr(Ad ad2) {
                e2<Ad, Builder, a> e2Var = this.corrBuilder_;
                if (e2Var == null) {
                    ad2.getClass();
                    this.corr_ = ad2;
                    onChanged();
                } else {
                    e2Var.i(ad2);
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

            public Builder setFeedback(int i10, String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setInit(String str) {
                str.getClass();
                this.init_ = str;
                onChanged();
                return this;
            }

            public Builder setInitBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.init_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLastmod(String str) {
                str.getClass();
                this.lastmod_ = str;
                onChanged();
                return this;
            }

            public Builder setLastmodBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.lastmod_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStatus(AuditStatusCode auditStatusCode) {
                auditStatusCode.getClass();
                this.status_ = auditStatusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatusValue(int i10) {
                this.status_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public w1 getFeedbackList() {
                return this.feedback_.getUnmodifiableView();
            }

            private Builder() {
                this.status_ = 0;
                this.feedback_ = q0.f10776d;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit build() {
                Audit auditBuildPartial = buildPartial();
                if (auditBuildPartial.isInitialized()) {
                    return auditBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) auditBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit buildPartial() {
                Audit audit = new Audit(this);
                audit.status_ = this.status_;
                if ((this.bitField0_ & 1) != 0) {
                    this.feedback_ = this.feedback_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                audit.feedback_ = this.feedback_;
                audit.init_ = this.init_;
                audit.lastmod_ = this.lastmod_;
                e2<Ad, Builder, a> e2Var = this.corrBuilder_;
                if (e2Var == null) {
                    audit.corr_ = this.corr_;
                } else {
                    audit.corr_ = (Ad) e2Var.a();
                }
                e2<Struct, Struct.Builder, i2> e2Var2 = this.extBuilder_;
                if (e2Var2 == null) {
                    audit.ext_ = this.ext_;
                } else {
                    audit.ext_ = (Struct) e2Var2.a();
                }
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var != null) {
                    audit.extProto_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    audit.extProto_ = this.extProto_;
                }
                onBuilt();
                return audit;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Audit mo164getDefaultInstanceForType() {
                return Audit.getDefaultInstance();
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
                this.status_ = 0;
                this.feedback_ = q0.f10776d;
                this.bitField0_ &= -2;
                this.init_ = "";
                this.lastmod_ = "";
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder setCorr(Builder builder) {
                e2<Ad, Builder, a> e2Var = this.corrBuilder_;
                if (e2Var == null) {
                    this.corr_ = builder.build();
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
                if (message instanceof Audit) {
                    return mergeFrom((Audit) message);
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
                this.status_ = 0;
                this.feedback_ = q0.f10776d;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Audit audit) {
                if (audit == Audit.getDefaultInstance()) {
                    return this;
                }
                if (audit.status_ != 0) {
                    setStatusValue(audit.getStatusValue());
                }
                if (!audit.feedback_.isEmpty()) {
                    if (this.feedback_.isEmpty()) {
                        this.feedback_ = audit.feedback_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeedbackIsMutable();
                        this.feedback_.addAll(audit.feedback_);
                    }
                    onChanged();
                }
                if (!audit.getInit().isEmpty()) {
                    this.init_ = audit.init_;
                    onChanged();
                }
                if (!audit.getLastmod().isEmpty()) {
                    this.lastmod_ = audit.lastmod_;
                    onChanged();
                }
                if (audit.hasCorr()) {
                    mergeCorr(audit.getCorr());
                }
                if (audit.hasExt()) {
                    mergeExt(audit.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!audit.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = audit.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(audit.extProto_);
                        }
                        onChanged();
                    }
                } else if (!audit.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(audit.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = audit.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) audit).unknownFields);
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
                Audit audit = null;
                try {
                    try {
                        Audit audit2 = (Audit) Audit.PARSER.parsePartialFrom(nVar, yVar);
                        if (audit2 != null) {
                            mergeFrom(audit2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Audit audit3 = (Audit) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            audit = audit3;
                            if (audit != null) {
                                mergeFrom(audit);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (audit != null) {
                        mergeFrom(audit);
                    }
                    throw th;
                }
            }
        }

        public static Audit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.E0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Audit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Audit) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Audit> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Audit)) {
                return super.equals(obj);
            }
            Audit audit = (Audit) obj;
            if (this.status_ != audit.status_ || !getFeedbackList().equals(audit.getFeedbackList()) || !getInit().equals(audit.getInit()) || !getLastmod().equals(audit.getLastmod()) || hasCorr() != audit.hasCorr()) {
                return false;
            }
            if ((!hasCorr() || getCorr().equals(audit.getCorr())) && hasExt() == audit.hasExt()) {
                return (!hasExt() || getExt().equals(audit.getExt())) && getExtProtoList().equals(audit.getExtProtoList()) && this.unknownFields.equals(audit.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Ad getCorr() {
            Ad ad2 = this.corr_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public a getCorrOrBuilder() {
            return getCorr();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getFeedback(int i10) {
            return this.feedback_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getFeedbackBytes(int i10) {
            return this.feedback_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getFeedbackCount() {
            return this.feedback_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Audit> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber() ? CodedOutputStream.l(1, this.status_) + 0 : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.feedback_.size(); i11++) {
                iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.feedback_.getRaw(i11));
            }
            int size = iL + iComputeStringSizeNoTag + (getFeedbackList().size() * 1);
            if (!getInitBytes().isEmpty()) {
                size += j0.computeStringSize(3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                size += j0.computeStringSize(4, this.lastmod_);
            }
            if (this.corr_ != null) {
                size += CodedOutputStream.G(5, getCorr());
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                size += CodedOutputStream.G(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                size += CodedOutputStream.G(7, getExt());
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public AuditStatusCode getStatus() {
            AuditStatusCode auditStatusCodeValueOf = AuditStatusCode.valueOf(this.status_);
            return auditStatusCodeValueOf == null ? AuditStatusCode.UNRECOGNIZED : auditStatusCodeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public boolean hasCorr() {
            return this.corr_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.status_;
            if (getFeedbackCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFeedbackList().hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 3) * 53) + getInit().hashCode()) * 37) + 4) * 53) + getLastmod().hashCode();
            if (hasCorr()) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getCorr().hashCode();
            }
            if (hasExt()) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.F0.d(Audit.class, Builder.class);
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
            return new Audit();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber()) {
                codedOutputStream.v0(1, this.status_);
            }
            for (int i10 = 0; i10 < this.feedback_.size(); i10++) {
                j0.writeString(codedOutputStream, 2, this.feedback_.getRaw(i10));
            }
            if (!getInitBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 4, this.lastmod_);
            }
            if (this.corr_ != null) {
                codedOutputStream.L0(5, getCorr());
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                codedOutputStream.L0(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Audit audit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audit);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public w1 getFeedbackList() {
            return this.feedback_;
        }

        private Audit(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Audit parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Audit) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Audit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Audit mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Audit parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Audit() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.feedback_ = q0.f10776d;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
        }

        public static Audit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Audit parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Audit parseFrom(InputStream inputStream) throws IOException {
            return (Audit) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Audit) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Audit parseFrom(n nVar) throws IOException {
            return (Audit) j0.parseWithIOException(PARSER, nVar);
        }

        private Audit(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            if (iK == 8) {
                                this.status_ = nVar.t();
                            } else if (iK == 18) {
                                String strJ = nVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.feedback_ = new q0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.feedback_.add(strJ);
                            } else if (iK == 26) {
                                this.init_ = nVar.J();
                            } else if (iK != 34) {
                                if (iK == 42) {
                                    Ad ad2 = this.corr_;
                                    Builder builder = ad2 != null ? ad2.toBuilder() : null;
                                    Ad ad3 = (Ad) nVar.A(Ad.parser(), yVar);
                                    this.corr_ = ad3;
                                    if (builder != null) {
                                        builder.mergeFrom(ad3);
                                        this.corr_ = builder.buildPartial();
                                    }
                                } else if (iK == 50) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                } else if (iK != 58) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
                                    }
                                }
                            } else {
                                this.lastmod_ = nVar.J();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 1) != 0) {
                        this.feedback_ = this.feedback_.getUnmodifiableView();
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
                this.feedback_ = this.feedback_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Audit parseFrom(n nVar, y yVar) throws IOException {
            return (Audit) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface AuditOrBuilder extends MessageOrBuilder {
        Ad getCorr();

        a getCorrOrBuilder();

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

        String getFeedback(int i10);

        ByteString getFeedbackBytes(int i10);

        int getFeedbackCount();

        List<String> getFeedbackList();

        String getInit();

        ByteString getInitBytes();

        String getLastmod();

        ByteString getLastmodBytes();

        AuditStatusCode getStatus();

        int getStatusValue();

        boolean hasCorr();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends j0.b<Builder> implements a {
        private r0 adomain_;
        private e2<Audit, Audit.Builder, AuditOrBuilder> auditBuilder_;
        private Audit audit_;
        private int bitField0_;
        private r0 bundle_;
        private r0 cat_;
        private int cattax_;
        private e2<Display, Display.Builder, DisplayOrBuilder> displayBuilder_;
        private Display display_;
        private e2<Struct, Struct.Builder, i2> extBuilder_;
        private z1<Any, Any.Builder, e> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private Object init_;
        private Object iurl_;
        private Object lang_;
        private Object lastmod_;
        private int mrating_;
        private boolean secure_;
        private e2<Video, Video.Builder, VideoOrBuilder> videoBuilder_;
        private Video video_;

        private void ensureAdomainIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adomain_ = new q0(this.adomain_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureBundleIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.bundle_ = new q0(this.bundle_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureCatIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.cat_ = new q0(this.cat_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        private e2<Audit, Audit.Builder, AuditOrBuilder> getAuditFieldBuilder() {
            if (this.auditBuilder_ == null) {
                this.auditBuilder_ = new e2<>(getAudit(), getParentForChildren(), isClean());
                this.audit_ = null;
            }
            return this.auditBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f10194a0;
        }

        private e2<Display, Display.Builder, DisplayOrBuilder> getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new e2<>(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
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
                this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private e2<Video, Video.Builder, VideoOrBuilder> getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new e2<>(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAdomain(String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.add(str);
            onChanged();
            return this;
        }

        public Builder addAdomainBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureAdomainIsMutable();
            this.adomain_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addAllAdomain(Iterable<String> iterable) {
            ensureAdomainIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.adomain_);
            onChanged();
            return this;
        }

        public Builder addAllBundle(Iterable<String> iterable) {
            ensureBundleIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.bundle_);
            onChanged();
            return this;
        }

        public Builder addAllCat(Iterable<String> iterable) {
            ensureCatIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.cat_);
            onChanged();
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

        public Builder addBundle(String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.add(str);
            onChanged();
            return this;
        }

        public Builder addBundleBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureBundleIsMutable();
            this.bundle_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addCat(String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.add(str);
            onChanged();
            return this;
        }

        public Builder addCatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureCatIsMutable();
            this.cat_.b(byteString);
            onChanged();
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

        public Builder clearAdomain() {
            this.adomain_ = q0.f10776d;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearAudit() {
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
                onChanged();
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = q0.f10776d;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearCat() {
            this.cat_ = q0.f10776d;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
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
                this.bitField0_ &= -9;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearId() {
            this.id_ = Ad.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearInit() {
            this.init_ = Ad.getDefaultInstance().getInit();
            onChanged();
            return this;
        }

        public Builder clearIurl() {
            this.iurl_ = Ad.getDefaultInstance().getIurl();
            onChanged();
            return this;
        }

        public Builder clearLang() {
            this.lang_ = Ad.getDefaultInstance().getLang();
            onChanged();
            return this;
        }

        public Builder clearLastmod() {
            this.lastmod_ = Ad.getDefaultInstance().getLastmod();
            onChanged();
            return this;
        }

        public Builder clearMrating() {
            this.mrating_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            return this;
        }

        public String getAdomain(int i10) {
            return this.adomain_.get(i10);
        }

        public ByteString getAdomainBytes(int i10) {
            return this.adomain_.getByteString(i10);
        }

        public int getAdomainCount() {
            return this.adomain_.size();
        }

        public Audit getAudit() {
            e2<Audit, Audit.Builder, AuditOrBuilder> e2Var = this.auditBuilder_;
            if (e2Var != null) {
                return (Audit) e2Var.e();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        public Audit.Builder getAuditBuilder() {
            onChanged();
            return (Audit.Builder) getAuditFieldBuilder().d();
        }

        public AuditOrBuilder getAuditOrBuilder() {
            e2<Audit, Audit.Builder, AuditOrBuilder> e2Var = this.auditBuilder_;
            if (e2Var != null) {
                return (AuditOrBuilder) e2Var.f();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        public String getBundle(int i10) {
            return this.bundle_.get(i10);
        }

        public ByteString getBundleBytes(int i10) {
            return this.bundle_.getByteString(i10);
        }

        public int getBundleCount() {
            return this.bundle_.size();
        }

        public String getCat(int i10) {
            return this.cat_.get(i10);
        }

        public ByteString getCatBytes(int i10) {
            return this.cat_.getByteString(i10);
        }

        public int getCatCount() {
            return this.cat_.size();
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f10194a0;
        }

        public Display getDisplay() {
            e2<Display, Display.Builder, DisplayOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var != null) {
                return (Display) e2Var.e();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
        }

        public Display.Builder getDisplayBuilder() {
            onChanged();
            return (Display.Builder) getDisplayFieldBuilder().d();
        }

        public DisplayOrBuilder getDisplayOrBuilder() {
            e2<Display, Display.Builder, DisplayOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var != null) {
                return (DisplayOrBuilder) e2Var.f();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
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

        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getIurl() {
            Object obj = this.iurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.iurl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIurlBytes() {
            Object obj = this.iurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public MediaRating getMrating() {
            MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
            return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
        }

        public int getMratingValue() {
            return this.mrating_;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public Video getVideo() {
            e2<Video, Video.Builder, VideoOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var != null) {
                return (Video) e2Var.e();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public Video.Builder getVideoBuilder() {
            onChanged();
            return (Video.Builder) getVideoFieldBuilder().d();
        }

        public VideoOrBuilder getVideoOrBuilder() {
            e2<Video, Video.Builder, VideoOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var != null) {
                return (VideoOrBuilder) e2Var.f();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public boolean hasAudit() {
            return (this.auditBuilder_ == null && this.audit_ == null) ? false : true;
        }

        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return b.f10196b0.d(Ad.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudit(Audit audit) {
            e2<Audit, Audit.Builder, AuditOrBuilder> e2Var = this.auditBuilder_;
            if (e2Var == null) {
                Audit audit2 = this.audit_;
                if (audit2 != null) {
                    this.audit_ = Audit.newBuilder(audit2).mergeFrom(audit).buildPartial();
                } else {
                    this.audit_ = audit;
                }
                onChanged();
            } else {
                e2Var.g(audit);
            }
            return this;
        }

        public Builder mergeDisplay(Display display) {
            e2<Display, Display.Builder, DisplayOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                Display display2 = this.display_;
                if (display2 != null) {
                    this.display_ = Display.newBuilder(display2).mergeFrom(display).buildPartial();
                } else {
                    this.display_ = display;
                }
                onChanged();
            } else {
                e2Var.g(display);
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

        public Builder mergeVideo(Video video) {
            e2<Video, Video.Builder, VideoOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var == null) {
                Video video2 = this.video_;
                if (video2 != null) {
                    this.video_ = Video.newBuilder(video2).mergeFrom(video).buildPartial();
                } else {
                    this.video_ = video;
                }
                onChanged();
            } else {
                e2Var.g(video);
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

        public Builder setAdomain(int i10, String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setAudit(Audit audit) {
            e2<Audit, Audit.Builder, AuditOrBuilder> e2Var = this.auditBuilder_;
            if (e2Var == null) {
                audit.getClass();
                this.audit_ = audit;
                onChanged();
            } else {
                e2Var.i(audit);
            }
            return this;
        }

        public Builder setBundle(int i10, String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setCat(int i10, String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            categoryTaxonomy.getClass();
            this.cattax_ = categoryTaxonomy.getNumber();
            onChanged();
            return this;
        }

        public Builder setCattaxValue(int i10) {
            this.cattax_ = i10;
            onChanged();
            return this;
        }

        public Builder setDisplay(Display display) {
            e2<Display, Display.Builder, DisplayOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                display.getClass();
                this.display_ = display;
                onChanged();
            } else {
                e2Var.i(display);
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

        public Builder setInit(String str) {
            str.getClass();
            this.init_ = str;
            onChanged();
            return this;
        }

        public Builder setInitBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.init_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIurl(String str) {
            str.getClass();
            this.iurl_ = str;
            onChanged();
            return this;
        }

        public Builder setIurlBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.iurl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLang(String str) {
            str.getClass();
            this.lang_ = str;
            onChanged();
            return this;
        }

        public Builder setLangBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.lang_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLastmod(String str) {
            str.getClass();
            this.lastmod_ = str;
            onChanged();
            return this;
        }

        public Builder setLastmodBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.lastmod_ = byteString;
            onChanged();
            return this;
        }

        public Builder setMrating(MediaRating mediaRating) {
            mediaRating.getClass();
            this.mrating_ = mediaRating.getNumber();
            onChanged();
            return this;
        }

        public Builder setMratingValue(int i10) {
            this.mrating_ = i10;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z10) {
            this.secure_ = z10;
            onChanged();
            return this;
        }

        public Builder setVideo(Video video) {
            e2<Video, Video.Builder, VideoOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var == null) {
                video.getClass();
                this.video_ = video;
                onChanged();
            } else {
                e2Var.i(video);
            }
            return this;
        }

        /* JADX INFO: renamed from: getAdomainList, reason: merged with bridge method [inline-methods] */
        public w1 m168getAdomainList() {
            return this.adomain_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getBundleList, reason: merged with bridge method [inline-methods] */
        public w1 m169getBundleList() {
            return this.bundle_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getCatList, reason: merged with bridge method [inline-methods] */
        public w1 m170getCatList() {
            return this.cat_.getUnmodifiableView();
        }

        private Builder() {
            this.id_ = "";
            r0 r0Var = q0.f10776d;
            this.adomain_ = r0Var;
            this.bundle_ = r0Var;
            this.iurl_ = "";
            this.cat_ = r0Var;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Ad build() {
            Ad adBuildPartial = buildPartial();
            if (adBuildPartial.isInitialized()) {
                return adBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Ad buildPartial() {
            Ad ad2 = new Ad(this);
            ad2.id_ = this.id_;
            if ((this.bitField0_ & 1) != 0) {
                this.adomain_ = this.adomain_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            ad2.adomain_ = this.adomain_;
            if ((this.bitField0_ & 2) != 0) {
                this.bundle_ = this.bundle_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            ad2.bundle_ = this.bundle_;
            ad2.iurl_ = this.iurl_;
            if ((this.bitField0_ & 4) != 0) {
                this.cat_ = this.cat_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            ad2.cat_ = this.cat_;
            ad2.cattax_ = this.cattax_;
            ad2.lang_ = this.lang_;
            ad2.secure_ = this.secure_;
            ad2.mrating_ = this.mrating_;
            ad2.init_ = this.init_;
            ad2.lastmod_ = this.lastmod_;
            e2<Display, Display.Builder, DisplayOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                ad2.display_ = this.display_;
            } else {
                ad2.display_ = (Display) e2Var.a();
            }
            e2<Video, Video.Builder, VideoOrBuilder> e2Var2 = this.videoBuilder_;
            if (e2Var2 == null) {
                ad2.video_ = this.video_;
            } else {
                ad2.video_ = (Video) e2Var2.a();
            }
            e2<Audit, Audit.Builder, AuditOrBuilder> e2Var3 = this.auditBuilder_;
            if (e2Var3 == null) {
                ad2.audit_ = this.audit_;
            } else {
                ad2.audit_ = (Audit) e2Var3.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var4 = this.extBuilder_;
            if (e2Var4 == null) {
                ad2.ext_ = this.ext_;
            } else {
                ad2.ext_ = (Struct) e2Var4.a();
            }
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var != null) {
                ad2.extProto_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                ad2.extProto_ = this.extProto_;
            }
            onBuilt();
            return ad2;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Ad mo164getDefaultInstanceForType() {
            return Ad.getDefaultInstance();
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
            this.id_ = "";
            r0 r0Var = q0.f10776d;
            this.adomain_ = r0Var;
            int i10 = this.bitField0_ & (-2);
            this.bundle_ = r0Var;
            this.iurl_ = "";
            this.cat_ = r0Var;
            this.bitField0_ = i10 & (-3) & (-5);
            this.cattax_ = 0;
            this.lang_ = "";
            this.secure_ = false;
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -9;
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder setAudit(Audit.Builder builder) {
            e2<Audit, Audit.Builder, AuditOrBuilder> e2Var = this.auditBuilder_;
            if (e2Var == null) {
                this.audit_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setDisplay(Display.Builder builder) {
            e2<Display, Display.Builder, DisplayOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                this.display_ = builder.build();
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

        public Builder setVideo(Video.Builder builder) {
            e2<Video, Video.Builder, VideoOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var == null) {
                this.video_ = builder.build();
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
            if (message instanceof Ad) {
                return mergeFrom((Ad) message);
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

        public Builder mergeFrom(Ad ad2) {
            if (ad2 == Ad.getDefaultInstance()) {
                return this;
            }
            if (!ad2.getId().isEmpty()) {
                this.id_ = ad2.id_;
                onChanged();
            }
            if (!ad2.adomain_.isEmpty()) {
                if (this.adomain_.isEmpty()) {
                    this.adomain_ = ad2.adomain_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdomainIsMutable();
                    this.adomain_.addAll(ad2.adomain_);
                }
                onChanged();
            }
            if (!ad2.bundle_.isEmpty()) {
                if (this.bundle_.isEmpty()) {
                    this.bundle_ = ad2.bundle_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBundleIsMutable();
                    this.bundle_.addAll(ad2.bundle_);
                }
                onChanged();
            }
            if (!ad2.getIurl().isEmpty()) {
                this.iurl_ = ad2.iurl_;
                onChanged();
            }
            if (!ad2.cat_.isEmpty()) {
                if (this.cat_.isEmpty()) {
                    this.cat_ = ad2.cat_;
                    this.bitField0_ &= -5;
                } else {
                    ensureCatIsMutable();
                    this.cat_.addAll(ad2.cat_);
                }
                onChanged();
            }
            if (ad2.cattax_ != 0) {
                setCattaxValue(ad2.getCattaxValue());
            }
            if (!ad2.getLang().isEmpty()) {
                this.lang_ = ad2.lang_;
                onChanged();
            }
            if (ad2.getSecure()) {
                setSecure(ad2.getSecure());
            }
            if (ad2.mrating_ != 0) {
                setMratingValue(ad2.getMratingValue());
            }
            if (!ad2.getInit().isEmpty()) {
                this.init_ = ad2.init_;
                onChanged();
            }
            if (!ad2.getLastmod().isEmpty()) {
                this.lastmod_ = ad2.lastmod_;
                onChanged();
            }
            if (ad2.hasDisplay()) {
                mergeDisplay(ad2.getDisplay());
            }
            if (ad2.hasVideo()) {
                mergeVideo(ad2.getVideo());
            }
            if (ad2.hasAudit()) {
                mergeAudit(ad2.getAudit());
            }
            if (ad2.hasExt()) {
                mergeExt(ad2.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!ad2.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = ad2.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(ad2.extProto_);
                    }
                    onChanged();
                }
            } else if (!ad2.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(ad2.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = ad2.extProto_;
                    this.bitField0_ &= -9;
                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) ad2).unknownFields);
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

        private Builder(j0.c cVar) {
            super(cVar);
            this.id_ = "";
            r0 r0Var = q0.f10776d;
            this.adomain_ = r0Var;
            this.bundle_ = r0Var;
            this.iurl_ = "";
            this.cat_ = r0Var;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
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

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Ad ad2 = null;
            try {
                try {
                    Ad ad3 = (Ad) Ad.PARSER.parsePartialFrom(nVar, yVar);
                    if (ad3 != null) {
                        mergeFrom(ad3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Ad ad4 = (Ad) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        ad2 = ad4;
                        if (ad2 != null) {
                            mergeFrom(ad2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (ad2 != null) {
                    mergeFrom(ad2);
                }
                throw th;
            }
        }
    }

    public static final class Display extends j0 implements DisplayOrBuilder {
        public static final int ADM_FIELD_NUMBER = 8;
        public static final int API_FIELD_NUMBER = 2;
        public static final int BANNER_FIELD_NUMBER = 10;
        public static final int CURL_FIELD_NUMBER = 9;
        public static final int EVENT_FIELD_NUMBER = 12;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int HRATIO_FIELD_NUMBER = 7;
        public static final int H_FIELD_NUMBER = 5;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int NATIVE_FIELD_NUMBER = 11;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int WRATIO_FIELD_NUMBER = 6;
        public static final int W_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private Banner banner_;
        private volatile Object curl_;
        private List<Event> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int hratio_;
        private byte memoizedIsInitialized;
        private r0 mime_;
        private Native native_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private int w_;
        private int wratio_;
        private static final l0.h.a<Integer, ApiFramework> api_converter_ = new l0.h.a<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.1
            @Override // com.explorestack.protobuf.l0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final l0.h.a<Integer, DisplayCreativeType> type_converter_ = new l0.h.a<Integer, DisplayCreativeType>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.2
            @Override // com.explorestack.protobuf.l0.h.a
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                return displayCreativeTypeValueOf == null ? DisplayCreativeType.UNRECOGNIZED : displayCreativeTypeValueOf;
            }
        };
        private static final Display DEFAULT_INSTANCE = new Display();
        private static final s1<Display> PARSER = new com.explorestack.protobuf.b<Display>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.3
            @Override // com.explorestack.protobuf.s1
            public Display parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Display(nVar, yVar);
            }
        };

        public static final class Banner extends j0 implements BannerOrBuilder {
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int IMG_FIELD_NUMBER = 1;
            public static final int LINK_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object img_;
            private volatile Object link_;
            private byte memoizedIsInitialized;
            private static final Banner DEFAULT_INSTANCE = new Banner();
            private static final s1<Banner> PARSER = new com.explorestack.protobuf.b<Banner>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Banner.1
                @Override // com.explorestack.protobuf.s1
                public Banner parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new Banner(nVar, yVar);
                }
            };

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f10210i0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<Banner> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    return super.equals(obj);
                }
                Banner banner = (Banner) obj;
                if (getImg().equals(banner.getImg()) && getLink().equals(banner.getLink()) && hasExt() == banner.hasExt()) {
                    return (!hasExt() || getExt().equals(banner.getExt())) && getExtProtoList().equals(banner.getExtProtoList()) && this.unknownFields.equals(banner.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public String getImg() {
                Object obj = this.img_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.img_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public ByteString getImgBytes() {
                Object obj = this.img_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.img_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public String getLink() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.link_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public ByteString getLinkBytes() {
                Object obj = this.link_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.link_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<Banner> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getImgBytes().isEmpty() ? j0.computeStringSize(1, this.img_) + 0 : 0;
                if (!getLinkBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(2, this.link_);
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

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImg().hashCode()) * 37) + 2) * 53) + getLink().hashCode();
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
                return b.f10212j0.d(Banner.class, Builder.class);
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
                return new Banner();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getImgBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 1, this.img_);
                }
                if (!getLinkBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 2, this.link_);
                }
                for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                    codedOutputStream.L0(3, this.extProto_.get(i10));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(4, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements BannerOrBuilder {
                private int bitField0_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object img_;
                private Object link_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f10210i0;
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

                public Builder clearImg() {
                    this.img_ = Banner.getDefaultInstance().getImg();
                    onChanged();
                    return this;
                }

                public Builder clearLink() {
                    this.link_ = Banner.getDefaultInstance().getLink();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f10210i0;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public String getImg() {
                    Object obj = this.img_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.img_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public ByteString getImgBytes() {
                    Object obj = this.img_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.img_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public String getLink() {
                    Object obj = this.link_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.link_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public ByteString getLinkBytes() {
                    Object obj = this.link_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.link_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.f10212j0.d(Banner.class, Builder.class);
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

                public Builder setImg(String str) {
                    str.getClass();
                    this.img_ = str;
                    onChanged();
                    return this;
                }

                public Builder setImgBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.img_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLink(String str) {
                    str.getClass();
                    this.link_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLinkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.link_ = byteString;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner build() {
                    Banner bannerBuildPartial = buildPartial();
                    if (bannerBuildPartial.isInitialized()) {
                        return bannerBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bannerBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner buildPartial() {
                    Banner banner = new Banner(this);
                    banner.img_ = this.img_;
                    banner.link_ = this.link_;
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        banner.ext_ = this.ext_;
                    } else {
                        banner.ext_ = (Struct) e2Var.a();
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var != null) {
                        banner.extProto_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        banner.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return banner;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Banner mo164getDefaultInstanceForType() {
                    return Banner.getDefaultInstance();
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
                    this.img_ = "";
                    this.link_ = "";
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
                    if (message instanceof Banner) {
                        return mergeFrom((Banner) message);
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
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Banner banner) {
                    if (banner == Banner.getDefaultInstance()) {
                        return this;
                    }
                    if (!banner.getImg().isEmpty()) {
                        this.img_ = banner.img_;
                        onChanged();
                    }
                    if (!banner.getLink().isEmpty()) {
                        this.link_ = banner.link_;
                        onChanged();
                    }
                    if (banner.hasExt()) {
                        mergeExt(banner.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!banner.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = banner.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(banner.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!banner.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(banner.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = banner.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) banner).unknownFields);
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
                    Banner banner = null;
                    try {
                        try {
                            Banner banner2 = (Banner) Banner.PARSER.parsePartialFrom(nVar, yVar);
                            if (banner2 != null) {
                                mergeFrom(banner2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Banner banner3 = (Banner) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                banner = banner3;
                                if (banner != null) {
                                    mergeFrom(banner);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (banner != null) {
                            mergeFrom(banner);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(Banner banner) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private Banner(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (Banner) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Banner mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Banner parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Banner() {
                this.memoizedIsInitialized = (byte) -1;
                this.img_ = "";
                this.link_ = "";
                this.extProto_ = Collections.emptyList();
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static Banner parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) j0.parseWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (Banner) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            private Banner(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    this.img_ = nVar.J();
                                } else if (iK == 18) {
                                    this.link_ = nVar.J();
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

            public static Banner parseFrom(n nVar) throws IOException {
                return (Banner) j0.parseWithIOException(PARSER, nVar);
            }

            public static Banner parseFrom(n nVar, y yVar) throws IOException {
                return (Banner) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface BannerOrBuilder extends MessageOrBuilder {
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

            String getImg();

            ByteString getImgBytes();

            String getLink();

            ByteString getLinkBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends j0.b<Builder> implements DisplayOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private e2<Banner, Banner.Builder, BannerOrBuilder> bannerBuilder_;
            private Banner banner_;
            private int bitField0_;
            private Object curl_;
            private z1<Event, Event.Builder, EventOrBuilder> eventBuilder_;
            private List<Event> event_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private r0 mime_;
            private e2<Native, Native.Builder, NativeOrBuilder> nativeBuilder_;
            private Native native_;
            private List<Integer> type_;
            private int w_;
            private int wratio_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new q0(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            private e2<Banner, Banner.Builder, BannerOrBuilder> getBannerFieldBuilder() {
                if (this.bannerBuilder_ == null) {
                    this.bannerBuilder_ = new e2<>(getBanner(), getParentForChildren(), isClean());
                    this.banner_ = null;
                }
                return this.bannerBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f10206g0;
            }

            private z1<Event, Event.Builder, EventOrBuilder> getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new z1<>(this.event_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
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
                    this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private e2<Native, Native.Builder, NativeOrBuilder> getNativeFieldBuilder() {
                if (this.nativeBuilder_ == null) {
                    this.nativeBuilder_ = new e2<>(getNative(), getParentForChildren(), isClean());
                    this.native_ = null;
                }
                return this.nativeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllEvent(Iterable<? extends Event> iterable) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.event_);
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends DisplayCreativeType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addEvent(Event event) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.add(event);
                    onChanged();
                } else {
                    z1Var.e(event);
                }
                return this;
            }

            public Event.Builder addEventBuilder() {
                return (Event.Builder) getEventFieldBuilder().c(Event.getDefaultInstance());
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

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.b(byteString);
                onChanged();
                return this;
            }

            public Builder addType(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i10) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Display.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBanner() {
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                    onChanged();
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Display.getDefaultInstance().getCurl();
                onChanged();
                return this;
            }

            public Builder clearEvent() {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -9;
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
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHratio() {
                this.hratio_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearNative() {
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                    onChanged();
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWratio() {
                this.wratio_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Display.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<ApiFramework> getApiList() {
                return new l0.h(this.api_, Display.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Banner getBanner() {
                e2<Banner, Banner.Builder, BannerOrBuilder> e2Var = this.bannerBuilder_;
                if (e2Var != null) {
                    return (Banner) e2Var.e();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            public Banner.Builder getBannerBuilder() {
                onChanged();
                return (Banner.Builder) getBannerFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public BannerOrBuilder getBannerOrBuilder() {
                e2<Banner, Banner.Builder, BannerOrBuilder> e2Var = this.bannerBuilder_;
                if (e2Var != null) {
                    return (BannerOrBuilder) e2Var.f();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f10206g0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Event getEvent(int i10) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? this.event_.get(i10) : (Event) z1Var.n(i10);
            }

            public Event.Builder getEventBuilder(int i10) {
                return (Event.Builder) getEventFieldBuilder().k(i10);
            }

            public List<Event.Builder> getEventBuilderList() {
                return getEventFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getEventCount() {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? this.event_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Event> getEventList() {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.event_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public EventOrBuilder getEventOrBuilder(int i10) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? this.event_.get(i10) : (EventOrBuilder) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<? extends EventOrBuilder> getEventOrBuilderList() {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getHratio() {
                return this.hratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getMime(int i10) {
                return this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Native getNative() {
                e2<Native, Native.Builder, NativeOrBuilder> e2Var = this.nativeBuilder_;
                if (e2Var != null) {
                    return (Native) e2Var.e();
                }
                Native r10 = this.native_;
                return r10 == null ? Native.getDefaultInstance() : r10;
            }

            public Native.Builder getNativeBuilder() {
                onChanged();
                return (Native.Builder) getNativeFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public NativeOrBuilder getNativeOrBuilder() {
                e2<Native, Native.Builder, NativeOrBuilder> e2Var = this.nativeBuilder_;
                if (e2Var != null) {
                    return (NativeOrBuilder) e2Var.f();
                }
                Native r10 = this.native_;
                return r10 == null ? Native.getDefaultInstance() : r10;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public DisplayCreativeType getType(int i10) {
                return (DisplayCreativeType) Display.type_converter_.convert(this.type_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<DisplayCreativeType> getTypeList() {
                return new l0.h(this.type_, Display.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getTypeValue(int i10) {
                return this.type_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasBanner() {
                return (this.bannerBuilder_ == null && this.banner_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasNative() {
                return (this.nativeBuilder_ == null && this.native_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.f10208h0.d(Display.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBanner(Banner banner) {
                e2<Banner, Banner.Builder, BannerOrBuilder> e2Var = this.bannerBuilder_;
                if (e2Var == null) {
                    Banner banner2 = this.banner_;
                    if (banner2 != null) {
                        this.banner_ = Banner.newBuilder(banner2).mergeFrom(banner).buildPartial();
                    } else {
                        this.banner_ = banner;
                    }
                    onChanged();
                } else {
                    e2Var.g(banner);
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

            public Builder mergeNative(Native r10) {
                e2<Native, Native.Builder, NativeOrBuilder> e2Var = this.nativeBuilder_;
                if (e2Var == null) {
                    Native r11 = this.native_;
                    if (r11 != null) {
                        this.native_ = Native.newBuilder(r11).mergeFrom(r10).buildPartial();
                    } else {
                        this.native_ = r10;
                    }
                    onChanged();
                } else {
                    e2Var.g(r10);
                }
                return this;
            }

            public Builder removeEvent(int i10) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.remove(i10);
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

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setBanner(Banner banner) {
                e2<Banner, Banner.Builder, BannerOrBuilder> e2Var = this.bannerBuilder_;
                if (e2Var == null) {
                    banner.getClass();
                    this.banner_ = banner;
                    onChanged();
                } else {
                    e2Var.i(banner);
                }
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEvent(int i10, Event event) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.set(i10, event);
                    onChanged();
                } else {
                    z1Var.w(i10, event);
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

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setHratio(int i10) {
                this.hratio_ = i10;
                onChanged();
                return this;
            }

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setNative(Native r10) {
                e2<Native, Native.Builder, NativeOrBuilder> e2Var = this.nativeBuilder_;
                if (e2Var == null) {
                    r10.getClass();
                    this.native_ = r10;
                    onChanged();
                } else {
                    e2Var.i(r10);
                }
                return this;
            }

            public Builder setType(int i10, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10, int i11) {
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            public Builder setWratio(int i10) {
                this.wratio_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public w1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.mime_ = q0.f10776d;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display build() {
                Display displayBuildPartial = buildPartial();
                if (displayBuildPartial.isInitialized()) {
                    return displayBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display buildPartial() {
                Display display = new Display(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                display.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                display.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                display.type_ = this.type_;
                display.w_ = this.w_;
                display.h_ = this.h_;
                display.wratio_ = this.wratio_;
                display.hratio_ = this.hratio_;
                display.adm_ = this.adm_;
                display.curl_ = this.curl_;
                e2<Banner, Banner.Builder, BannerOrBuilder> e2Var = this.bannerBuilder_;
                if (e2Var == null) {
                    display.banner_ = this.banner_;
                } else {
                    display.banner_ = (Banner) e2Var.a();
                }
                e2<Native, Native.Builder, NativeOrBuilder> e2Var2 = this.nativeBuilder_;
                if (e2Var2 == null) {
                    display.native_ = this.native_;
                } else {
                    display.native_ = (Native) e2Var2.a();
                }
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var != null) {
                    display.event_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -9;
                    }
                    display.event_ = this.event_;
                }
                e2<Struct, Struct.Builder, i2> e2Var3 = this.extBuilder_;
                if (e2Var3 == null) {
                    display.ext_ = this.ext_;
                } else {
                    display.ext_ = (Struct) e2Var3.a();
                }
                z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                if (z1Var2 != null) {
                    display.extProto_ = z1Var2.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    display.extProto_ = this.extProto_;
                }
                onBuilt();
                return display;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Display mo164getDefaultInstanceForType() {
                return Display.getDefaultInstance();
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

            public Event.Builder addEventBuilder(int i10) {
                return (Event.Builder) getEventFieldBuilder().b(i10, Event.getDefaultInstance());
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
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.w_ = 0;
                this.h_ = 0;
                this.wratio_ = 0;
                this.hratio_ = 0;
                this.adm_ = "";
                this.curl_ = "";
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -9;
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
                    this.bitField0_ &= -17;
                } else {
                    z1Var2.g();
                }
                return this;
            }

            public Builder setBanner(Banner.Builder builder) {
                e2<Banner, Banner.Builder, BannerOrBuilder> e2Var = this.bannerBuilder_;
                if (e2Var == null) {
                    this.banner_ = builder.build();
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

            public Builder setNative(Native.Builder builder) {
                e2<Native, Native.Builder, NativeOrBuilder> e2Var = this.nativeBuilder_;
                if (e2Var == null) {
                    this.native_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder addEvent(int i10, Event event) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i10, event);
                    onChanged();
                } else {
                    z1Var.d(i10, event);
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
                if (message instanceof Display) {
                    return mergeFrom((Display) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEvent(int i10, Event.Builder builder) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.set(i10, builder.build());
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

            public Builder mergeFrom(Display display) {
                if (display == Display.getDefaultInstance()) {
                    return this;
                }
                if (!display.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = display.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(display.mime_);
                    }
                    onChanged();
                }
                if (!display.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = display.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(display.api_);
                    }
                    onChanged();
                }
                if (!display.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = display.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(display.type_);
                    }
                    onChanged();
                }
                if (display.getW() != 0) {
                    setW(display.getW());
                }
                if (display.getH() != 0) {
                    setH(display.getH());
                }
                if (display.getWratio() != 0) {
                    setWratio(display.getWratio());
                }
                if (display.getHratio() != 0) {
                    setHratio(display.getHratio());
                }
                if (!display.getAdm().isEmpty()) {
                    this.adm_ = display.adm_;
                    onChanged();
                }
                if (!display.getCurl().isEmpty()) {
                    this.curl_ = display.curl_;
                    onChanged();
                }
                if (display.hasBanner()) {
                    mergeBanner(display.getBanner());
                }
                if (display.hasNative()) {
                    mergeNative(display.getNative());
                }
                if (this.eventBuilder_ == null) {
                    if (!display.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = display.event_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(display.event_);
                        }
                        onChanged();
                    }
                } else if (!display.event_.isEmpty()) {
                    if (!this.eventBuilder_.t()) {
                        this.eventBuilder_.a(display.event_);
                    } else {
                        this.eventBuilder_.h();
                        this.eventBuilder_ = null;
                        this.event_ = display.event_;
                        this.bitField0_ &= -9;
                        this.eventBuilder_ = j0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (display.hasExt()) {
                    mergeExt(display.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!display.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = display.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(display.extProto_);
                        }
                        onChanged();
                    }
                } else if (!display.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(display.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = display.extProto_;
                        this.bitField0_ &= -17;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) display).unknownFields);
                onChanged();
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.mime_ = q0.f10776d;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addEvent(Event.Builder builder) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
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

            public Builder addEvent(int i10, Event.Builder builder) {
                z1<Event, Event.Builder, EventOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(i10, builder.build());
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
                Display display = null;
                try {
                    try {
                        Display display2 = (Display) Display.PARSER.parsePartialFrom(nVar, yVar);
                        if (display2 != null) {
                            mergeFrom(display2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Display display3 = (Display) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            display = display3;
                            if (display != null) {
                                mergeFrom(display);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (display != null) {
                        mergeFrom(display);
                    }
                    throw th;
                }
            }
        }

        public static final class Native extends j0 implements NativeOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int LINK_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<Asset> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private LinkAsset link_;
            private byte memoizedIsInitialized;
            private static final Native DEFAULT_INSTANCE = new Native();
            private static final s1<Native> PARSER = new com.explorestack.protobuf.b<Native>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.1
                @Override // com.explorestack.protobuf.s1
                public Native parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new Native(nVar, yVar);
                }
            };

            public static final class Asset extends j0 implements AssetOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int DISCLAIMER_FIELD_NUMBER = 11;
                public static final int EXT_FIELD_NUMBER = 9;
                public static final int EXT_PROTO_FIELD_NUMBER = 8;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMAGE_FIELD_NUMBER = 4;
                public static final int LABEL_FIELD_NUMBER = 10;
                public static final int LINK_FIELD_NUMBER = 7;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAsset data_;
                private DisclaimerAsset disclaimer_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAsset image_;
                private LabelAsset label_;
                private LinkAsset link_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAsset title_;
                private VideoAsset video_;
                private static final Asset DEFAULT_INSTANCE = new Asset();
                private static final s1<Asset> PARSER = new com.explorestack.protobuf.b<Asset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.1
                    @Override // com.explorestack.protobuf.s1
                    public Asset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new Asset(nVar, yVar);
                    }
                };

                public static final class DataAsset extends j0 implements DataAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 5;
                    public static final int EXT_PROTO_FIELD_NUMBER = 4;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 3;
                    public static final int VALUE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object value_;
                    private static final DataAsset DEFAULT_INSTANCE = new DataAsset();
                    private static final s1<DataAsset> PARSER = new com.explorestack.protobuf.b<DataAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.1
                        @Override // com.explorestack.protobuf.s1
                        public DataAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new DataAsset(nVar, yVar);
                        }
                    };

                    public static DataAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10238w0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<DataAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAsset)) {
                            return super.equals(obj);
                        }
                        DataAsset dataAsset = (DataAsset) obj;
                        if (getValue().equals(dataAsset.getValue()) && getLen() == dataAsset.getLen() && this.type_ == dataAsset.type_ && hasExt() == dataAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAsset.getExt())) && getExtProtoList().equals(dataAsset.getExtProtoList()) && this.unknownFields.equals(dataAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getLen() {
                        return this.len_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<DataAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = !getValueBytes().isEmpty() ? j0.computeStringSize(1, this.value_) + 0 : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(2, i11);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += CodedOutputStream.l(3, this.type_);
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 37) + 2) * 53) + getLen()) * 37) + 3) * 53) + this.type_;
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
                        return b.f10240x0.d(DataAsset.class, Builder.class);
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
                        return new DataAsset();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getValueBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 1, this.value_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            codedOutputStream.c1(2, i10);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.v0(3, this.type_);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            codedOutputStream.L0(4, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(5, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements DataAssetOrBuilder {
                        private int bitField0_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;
                        private Object value_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f10238w0;
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

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearValue() {
                            this.value_ = DataAsset.getDefaultInstance().getValue();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f10238w0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public String getValue() {
                            Object obj = this.value_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.value_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public ByteString getValueBytes() {
                            Object obj = this.value_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.value_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.f10240x0.d(DataAsset.class, Builder.class);
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

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
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
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset build() {
                            DataAsset dataAssetBuildPartial = buildPartial();
                            if (dataAssetBuildPartial.isInitialized()) {
                                return dataAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset buildPartial() {
                            DataAsset dataAsset = new DataAsset(this);
                            dataAsset.value_ = this.value_;
                            dataAsset.len_ = this.len_;
                            dataAsset.type_ = this.type_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                dataAsset.ext_ = this.ext_;
                            } else {
                                dataAsset.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                dataAsset.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAsset;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public DataAsset mo164getDefaultInstanceForType() {
                            return DataAsset.getDefaultInstance();
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
                            this.value_ = "";
                            this.len_ = 0;
                            this.type_ = 0;
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
                            if (message instanceof DataAsset) {
                                return mergeFrom((DataAsset) message);
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
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(DataAsset dataAsset) {
                            if (dataAsset == DataAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!dataAsset.getValue().isEmpty()) {
                                this.value_ = dataAsset.value_;
                                onChanged();
                            }
                            if (dataAsset.getLen() != 0) {
                                setLen(dataAsset.getLen());
                            }
                            if (dataAsset.type_ != 0) {
                                setTypeValue(dataAsset.getTypeValue());
                            }
                            if (dataAsset.hasExt()) {
                                mergeExt(dataAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(dataAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) dataAsset).unknownFields);
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
                            DataAsset dataAsset = null;
                            try {
                                try {
                                    DataAsset dataAsset2 = (DataAsset) DataAsset.PARSER.parsePartialFrom(nVar, yVar);
                                    if (dataAsset2 != null) {
                                        mergeFrom(dataAsset2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    DataAsset dataAsset3 = (DataAsset) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        dataAsset = dataAsset3;
                                        if (dataAsset != null) {
                                            mergeFrom(dataAsset);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (dataAsset != null) {
                                    mergeFrom(dataAsset);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(DataAsset dataAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAsset);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private DataAsset(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (DataAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static DataAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public DataAsset mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.value_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static DataAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static DataAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static DataAsset parseFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) j0.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (DataAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    private DataAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                                this.value_ = nVar.J();
                                            } else if (iK == 16) {
                                                this.len_ = nVar.L();
                                            } else if (iK == 24) {
                                                this.type_ = nVar.t();
                                            } else if (iK == 34) {
                                                if (!(z11 & true)) {
                                                    this.extProto_ = new ArrayList();
                                                    z11 |= true;
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
                                    } catch (IOException e10) {
                                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                                    }
                                } catch (InvalidProtocolBufferException e11) {
                                    throw e11.setUnfinishedMessage(this);
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

                    public static DataAsset parseFrom(n nVar) throws IOException {
                        return (DataAsset) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static DataAsset parseFrom(n nVar, y yVar) throws IOException {
                        return (DataAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface DataAssetOrBuilder extends MessageOrBuilder {
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

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    String getValue();

                    ByteString getValueBytes();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class DisclaimerAsset extends j0 implements DisclaimerAssetOrBuilder {
                    private static final DisclaimerAsset DEFAULT_INSTANCE = new DisclaimerAsset();
                    private static final s1<DisclaimerAsset> PARSER = new com.explorestack.protobuf.b<DisclaimerAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAsset.1
                        @Override // com.explorestack.protobuf.s1
                        public DisclaimerAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new DisclaimerAsset(nVar, yVar);
                        }
                    };
                    public static final int PERCENT_FIELD_NUMBER = 2;
                    public static final int TEXT_FIELD_NUMBER = 1;
                    public static final int TYPE_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private byte memoizedIsInitialized;
                    private int percent_;
                    private volatile Object text_;
                    private int type_;

                    public static DisclaimerAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.A0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DisclaimerAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DisclaimerAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DisclaimerAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<DisclaimerAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DisclaimerAsset)) {
                            return super.equals(obj);
                        }
                        DisclaimerAsset disclaimerAsset = (DisclaimerAsset) obj;
                        return getText().equals(disclaimerAsset.getText()) && getPercent() == disclaimerAsset.getPercent() && this.type_ == disclaimerAsset.type_ && this.unknownFields.equals(disclaimerAsset.unknownFields);
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<DisclaimerAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                    public int getPercent() {
                        return this.percent_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = getTextBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.text_);
                        int i11 = this.percent_;
                        if (i11 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(2, i11);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += CodedOutputStream.l(3, this.type_);
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                    public String getText() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.text_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                    public ByteString getTextBytes() {
                        Object obj = this.text_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.text_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
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
                        int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 37) + 2) * 53) + getPercent()) * 37) + 3) * 53) + this.type_) * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.j0
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.B0.d(DisclaimerAsset.class, Builder.class);
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
                        return new DisclaimerAsset();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getTextBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 1, this.text_);
                        }
                        int i10 = this.percent_;
                        if (i10 != 0) {
                            codedOutputStream.c1(2, i10);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.v0(3, this.type_);
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements DisclaimerAssetOrBuilder {
                        private int percent_;
                        private Object text_;
                        private int type_;

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.A0;
                        }

                        private void maybeForceBuilderInitialization() {
                            boolean unused = j0.alwaysUseFieldBuilders;
                        }

                        public Builder clearPercent() {
                            this.percent_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearText() {
                            this.text_ = DisclaimerAsset.getDefaultInstance().getText();
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.A0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                        public int getPercent() {
                            return this.percent_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                        public String getText() {
                            Object obj = this.text_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.text_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                        public ByteString getTextBytes() {
                            Object obj = this.text_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.text_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DisclaimerAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.B0.d(DisclaimerAsset.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder setPercent(int i10) {
                            this.percent_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setText(String str) {
                            str.getClass();
                            this.text_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setTextBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.text_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.text_ = "";
                            this.type_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DisclaimerAsset build() {
                            DisclaimerAsset disclaimerAssetBuildPartial = buildPartial();
                            if (disclaimerAssetBuildPartial.isInitialized()) {
                                return disclaimerAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) disclaimerAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DisclaimerAsset buildPartial() {
                            DisclaimerAsset disclaimerAsset = new DisclaimerAsset(this);
                            disclaimerAsset.text_ = this.text_;
                            disclaimerAsset.percent_ = this.percent_;
                            disclaimerAsset.type_ = this.type_;
                            onBuilt();
                            return disclaimerAsset;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public DisclaimerAsset mo164getDefaultInstanceForType() {
                            return DisclaimerAsset.getDefaultInstance();
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
                            this.text_ = "";
                            this.percent_ = 0;
                            this.type_ = 0;
                            return this;
                        }

                        private Builder(j0.c cVar) {
                            super(cVar);
                            this.text_ = "";
                            this.type_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                        /* JADX INFO: renamed from: clone */
                        public Builder mo162clone() {
                            return (Builder) super.mo162clone();
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof DisclaimerAsset) {
                                return mergeFrom((DisclaimerAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(DisclaimerAsset disclaimerAsset) {
                            if (disclaimerAsset == DisclaimerAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!disclaimerAsset.getText().isEmpty()) {
                                this.text_ = disclaimerAsset.text_;
                                onChanged();
                            }
                            if (disclaimerAsset.getPercent() != 0) {
                                setPercent(disclaimerAsset.getPercent());
                            }
                            if (disclaimerAsset.type_ != 0) {
                                setTypeValue(disclaimerAsset.getTypeValue());
                            }
                            mergeUnknownFields(((j0) disclaimerAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                            DisclaimerAsset disclaimerAsset = null;
                            try {
                                try {
                                    DisclaimerAsset disclaimerAsset2 = (DisclaimerAsset) DisclaimerAsset.PARSER.parsePartialFrom(nVar, yVar);
                                    if (disclaimerAsset2 != null) {
                                        mergeFrom(disclaimerAsset2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    DisclaimerAsset disclaimerAsset3 = (DisclaimerAsset) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        disclaimerAsset = disclaimerAsset3;
                                        if (disclaimerAsset != null) {
                                            mergeFrom(disclaimerAsset);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (disclaimerAsset != null) {
                                    mergeFrom(disclaimerAsset);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(DisclaimerAsset disclaimerAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(disclaimerAsset);
                    }

                    public static DisclaimerAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private DisclaimerAsset(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DisclaimerAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (DisclaimerAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static DisclaimerAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public DisclaimerAsset mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DisclaimerAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DisclaimerAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.text_ = "";
                        this.type_ = 0;
                    }

                    public static DisclaimerAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static DisclaimerAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static DisclaimerAsset parseFrom(InputStream inputStream) throws IOException {
                        return (DisclaimerAsset) j0.parseWithIOException(PARSER, inputStream);
                    }

                    private DisclaimerAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.text_ = nVar.J();
                                        } else if (iK == 16) {
                                            this.percent_ = nVar.L();
                                        } else if (iK != 24) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            this.type_ = nVar.t();
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

                    public static DisclaimerAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (DisclaimerAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    public static DisclaimerAsset parseFrom(n nVar) throws IOException {
                        return (DisclaimerAsset) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static DisclaimerAsset parseFrom(n nVar, y yVar) throws IOException {
                        return (DisclaimerAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface DisclaimerAssetOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                    int getPercent();

                    String getText();

                    ByteString getTextBytes();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class ImageAsset extends j0 implements ImageAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 6;
                    public static final int EXT_PROTO_FIELD_NUMBER = 5;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int TYPE_FIELD_NUMBER = 4;
                    public static final int URL_FIELD_NUMBER = 1;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object url_;
                    private int w_;
                    private static final ImageAsset DEFAULT_INSTANCE = new ImageAsset();
                    private static final s1<ImageAsset> PARSER = new com.explorestack.protobuf.b<ImageAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.1
                        @Override // com.explorestack.protobuf.s1
                        public ImageAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new ImageAsset(nVar, yVar);
                        }
                    };

                    public static ImageAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10230s0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<ImageAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAsset)) {
                            return super.equals(obj);
                        }
                        ImageAsset imageAsset = (ImageAsset) obj;
                        if (getUrl().equals(imageAsset.getUrl()) && getW() == imageAsset.getW() && getH() == imageAsset.getH() && this.type_ == imageAsset.type_ && hasExt() == imageAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAsset.getExt())) && getExtProtoList().equals(imageAsset.getExtProtoList()) && this.unknownFields.equals(imageAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<ImageAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = !getUrlBytes().isEmpty() ? j0.computeStringSize(1, this.url_) + 0 : 0;
                        int i11 = this.w_;
                        if (i11 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(2, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(3, i12);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += CodedOutputStream.l(4, this.type_);
                        }
                        for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                            iComputeStringSize += CodedOutputStream.G(5, this.extProto_.get(i13));
                        }
                        if (this.ext_ != null) {
                            iComputeStringSize += CodedOutputStream.G(6, getExt());
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getW()) * 37) + 3) * 53) + getH()) * 37) + 4) * 53) + this.type_;
                        if (hasExt()) {
                            iHashCode = (((iHashCode * 37) + 6) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 5) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.j0
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.f10232t0.d(ImageAsset.class, Builder.class);
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
                        return new ImageAsset();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getUrlBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 1, this.url_);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            codedOutputStream.c1(2, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            codedOutputStream.c1(3, i11);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.v0(4, this.type_);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            codedOutputStream.L0(5, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(6, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements ImageAssetOrBuilder {
                        private int bitField0_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int type_;
                        private Object url_;
                        private int w_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f10230s0;
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

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearUrl() {
                            this.url_ = ImageAsset.getDefaultInstance().getUrl();
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f10230s0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public String getUrl() {
                            Object obj = this.url_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.url_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public ByteString getUrlBytes() {
                            Object obj = this.url_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.url_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.f10232t0.d(ImageAsset.class, Builder.class);
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

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            nativeImageAssetType.getClass();
                            this.type_ = nativeImageAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setUrl(String str) {
                            str.getClass();
                            this.url_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setUrlBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.url_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset build() {
                            ImageAsset imageAssetBuildPartial = buildPartial();
                            if (imageAssetBuildPartial.isInitialized()) {
                                return imageAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset buildPartial() {
                            ImageAsset imageAsset = new ImageAsset(this);
                            imageAsset.url_ = this.url_;
                            imageAsset.w_ = this.w_;
                            imageAsset.h_ = this.h_;
                            imageAsset.type_ = this.type_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                imageAsset.ext_ = this.ext_;
                            } else {
                                imageAsset.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                imageAsset.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                imageAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAsset;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public ImageAsset mo164getDefaultInstanceForType() {
                            return ImageAsset.getDefaultInstance();
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
                            this.url_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.type_ = 0;
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
                            if (message instanceof ImageAsset) {
                                return mergeFrom((ImageAsset) message);
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
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAsset imageAsset) {
                            if (imageAsset == ImageAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!imageAsset.getUrl().isEmpty()) {
                                this.url_ = imageAsset.url_;
                                onChanged();
                            }
                            if (imageAsset.getW() != 0) {
                                setW(imageAsset.getW());
                            }
                            if (imageAsset.getH() != 0) {
                                setH(imageAsset.getH());
                            }
                            if (imageAsset.type_ != 0) {
                                setTypeValue(imageAsset.getTypeValue());
                            }
                            if (imageAsset.hasExt()) {
                                mergeExt(imageAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(imageAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) imageAsset).unknownFields);
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
                            ImageAsset imageAsset = null;
                            try {
                                try {
                                    ImageAsset imageAsset2 = (ImageAsset) ImageAsset.PARSER.parsePartialFrom(nVar, yVar);
                                    if (imageAsset2 != null) {
                                        mergeFrom(imageAsset2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    ImageAsset imageAsset3 = (ImageAsset) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        imageAsset = imageAsset3;
                                        if (imageAsset != null) {
                                            mergeFrom(imageAsset);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (imageAsset != null) {
                                    mergeFrom(imageAsset);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(ImageAsset imageAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAsset);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private ImageAsset(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (ImageAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static ImageAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public ImageAsset mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.url_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static ImageAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static ImageAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) j0.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (ImageAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    private ImageAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                                this.url_ = nVar.J();
                                            } else if (iK == 16) {
                                                this.w_ = nVar.L();
                                            } else if (iK == 24) {
                                                this.h_ = nVar.L();
                                            } else if (iK == 32) {
                                                this.type_ = nVar.t();
                                            } else if (iK == 42) {
                                                if (!(z11 & true)) {
                                                    this.extProto_ = new ArrayList();
                                                    z11 |= true;
                                                }
                                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                            } else if (iK != 50) {
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

                    public static ImageAsset parseFrom(n nVar) throws IOException {
                        return (ImageAsset) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static ImageAsset parseFrom(n nVar, y yVar) throws IOException {
                        return (ImageAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface ImageAssetOrBuilder extends MessageOrBuilder {
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

                    int getH();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    String getUrl();

                    ByteString getUrlBytes();

                    int getW();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class LabelAsset extends j0 implements LabelAssetOrBuilder {
                    public static final int CONTENT_FIELD_NUMBER = 1;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int POS_FIELD_NUMBER = 4;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private volatile Object content_;
                    private int h_;
                    private byte memoizedIsInitialized;
                    private int pos_;
                    private int w_;
                    private static final LabelAsset DEFAULT_INSTANCE = new LabelAsset();
                    private static final s1<LabelAsset> PARSER = new com.explorestack.protobuf.b<LabelAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.1
                        @Override // com.explorestack.protobuf.s1
                        public LabelAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new LabelAsset(nVar, yVar);
                        }
                    };

                    public static LabelAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10242y0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static LabelAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (LabelAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static LabelAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<LabelAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof LabelAsset)) {
                            return super.equals(obj);
                        }
                        LabelAsset labelAsset = (LabelAsset) obj;
                        return getContent().equals(labelAsset.getContent()) && getW() == labelAsset.getW() && getH() == labelAsset.getH() && this.pos_ == labelAsset.pos_ && this.unknownFields.equals(labelAsset.unknownFields);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public String getContent() {
                        Object obj = this.content_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.content_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public ByteString getContentBytes() {
                        Object obj = this.content_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.content_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<LabelAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public NativeAssetPosition getPos() {
                        NativeAssetPosition nativeAssetPositionValueOf = NativeAssetPosition.valueOf(this.pos_);
                        return nativeAssetPositionValueOf == null ? NativeAssetPosition.UNRECOGNIZED : nativeAssetPositionValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getPosValue() {
                        return this.pos_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = getContentBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.content_);
                        int i11 = this.w_;
                        if (i11 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(2, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(3, i12);
                        }
                        if (this.pos_ != NativeAssetPosition.ASSET_POSITION_TOP_LEFT.getNumber()) {
                            iComputeStringSize += CodedOutputStream.l(4, this.pos_);
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getW()) * 37) + 3) * 53) + getH()) * 37) + 4) * 53) + this.pos_) * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.j0
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.f10244z0.d(LabelAsset.class, Builder.class);
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
                        return new LabelAsset();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getContentBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 1, this.content_);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            codedOutputStream.c1(2, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            codedOutputStream.c1(3, i11);
                        }
                        if (this.pos_ != NativeAssetPosition.ASSET_POSITION_TOP_LEFT.getNumber()) {
                            codedOutputStream.v0(4, this.pos_);
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements LabelAssetOrBuilder {
                        private Object content_;
                        private int h_;
                        private int pos_;
                        private int w_;

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f10242y0;
                        }

                        private void maybeForceBuilderInitialization() {
                            boolean unused = j0.alwaysUseFieldBuilders;
                        }

                        public Builder clearContent() {
                            this.content_ = LabelAsset.getDefaultInstance().getContent();
                            onChanged();
                            return this;
                        }

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearPos() {
                            this.pos_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public String getContent() {
                            Object obj = this.content_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.content_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public ByteString getContentBytes() {
                            Object obj = this.content_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.content_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f10242y0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public NativeAssetPosition getPos() {
                            NativeAssetPosition nativeAssetPositionValueOf = NativeAssetPosition.valueOf(this.pos_);
                            return nativeAssetPositionValueOf == null ? NativeAssetPosition.UNRECOGNIZED : nativeAssetPositionValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getPosValue() {
                            return this.pos_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.f10244z0.d(LabelAsset.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder setContent(String str) {
                            str.getClass();
                            this.content_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setContentBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.content_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setPos(NativeAssetPosition nativeAssetPosition) {
                            nativeAssetPosition.getClass();
                            this.pos_ = nativeAssetPosition.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setPosValue(int i10) {
                            this.pos_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.content_ = "";
                            this.pos_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public LabelAsset build() {
                            LabelAsset labelAssetBuildPartial = buildPartial();
                            if (labelAssetBuildPartial.isInitialized()) {
                                return labelAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) labelAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public LabelAsset buildPartial() {
                            LabelAsset labelAsset = new LabelAsset(this);
                            labelAsset.content_ = this.content_;
                            labelAsset.w_ = this.w_;
                            labelAsset.h_ = this.h_;
                            labelAsset.pos_ = this.pos_;
                            onBuilt();
                            return labelAsset;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public LabelAsset mo164getDefaultInstanceForType() {
                            return LabelAsset.getDefaultInstance();
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
                            this.content_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.pos_ = 0;
                            return this;
                        }

                        private Builder(j0.c cVar) {
                            super(cVar);
                            this.content_ = "";
                            this.pos_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                        /* JADX INFO: renamed from: clone */
                        public Builder mo162clone() {
                            return (Builder) super.mo162clone();
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof LabelAsset) {
                                return mergeFrom((LabelAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(LabelAsset labelAsset) {
                            if (labelAsset == LabelAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!labelAsset.getContent().isEmpty()) {
                                this.content_ = labelAsset.content_;
                                onChanged();
                            }
                            if (labelAsset.getW() != 0) {
                                setW(labelAsset.getW());
                            }
                            if (labelAsset.getH() != 0) {
                                setH(labelAsset.getH());
                            }
                            if (labelAsset.pos_ != 0) {
                                setPosValue(labelAsset.getPosValue());
                            }
                            mergeUnknownFields(((j0) labelAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                            LabelAsset labelAsset = null;
                            try {
                                try {
                                    LabelAsset labelAsset2 = (LabelAsset) LabelAsset.PARSER.parsePartialFrom(nVar, yVar);
                                    if (labelAsset2 != null) {
                                        mergeFrom(labelAsset2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    LabelAsset labelAsset3 = (LabelAsset) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        labelAsset = labelAsset3;
                                        if (labelAsset != null) {
                                            mergeFrom(labelAsset);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (labelAsset != null) {
                                    mergeFrom(labelAsset);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(LabelAsset labelAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(labelAsset);
                    }

                    public static LabelAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private LabelAsset(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static LabelAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (LabelAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static LabelAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public LabelAsset mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static LabelAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private LabelAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.content_ = "";
                        this.pos_ = 0;
                    }

                    public static LabelAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static LabelAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static LabelAsset parseFrom(InputStream inputStream) throws IOException {
                        return (LabelAsset) j0.parseWithIOException(PARSER, inputStream);
                    }

                    private LabelAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.content_ = nVar.J();
                                        } else if (iK == 16) {
                                            this.w_ = nVar.L();
                                        } else if (iK == 24) {
                                            this.h_ = nVar.L();
                                        } else if (iK != 32) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            this.pos_ = nVar.t();
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

                    public static LabelAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (LabelAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    public static LabelAsset parseFrom(n nVar) throws IOException {
                        return (LabelAsset) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static LabelAsset parseFrom(n nVar, y yVar) throws IOException {
                        return (LabelAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface LabelAssetOrBuilder extends MessageOrBuilder {
                    String getContent();

                    ByteString getContentBytes();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                    int getH();

                    NativeAssetPosition getPos();

                    int getPosValue();

                    int getW();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class TitleAsset extends j0 implements TitleAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TEXT_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private volatile Object text_;
                    private static final TitleAsset DEFAULT_INSTANCE = new TitleAsset();
                    private static final s1<TitleAsset> PARSER = new com.explorestack.protobuf.b<TitleAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.1
                        @Override // com.explorestack.protobuf.s1
                        public TitleAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new TitleAsset(nVar, yVar);
                        }
                    };

                    public static TitleAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10226q0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<TitleAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAsset)) {
                            return super.equals(obj);
                        }
                        TitleAsset titleAsset = (TitleAsset) obj;
                        if (getText().equals(titleAsset.getText()) && getLen() == titleAsset.getLen() && hasExt() == titleAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAsset.getExt())) && getExtProtoList().equals(titleAsset.getExtProtoList()) && this.unknownFields.equals(titleAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getLen() {
                        return this.len_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<TitleAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = !getTextBytes().isEmpty() ? j0.computeStringSize(1, this.text_) + 0 : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeStringSize += CodedOutputStream.Y(2, i11);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iComputeStringSize += CodedOutputStream.G(3, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iComputeStringSize += CodedOutputStream.G(4, getExt());
                        }
                        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public String getText() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.text_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public ByteString getTextBytes() {
                        Object obj = this.text_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.text_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 37) + 2) * 53) + getLen();
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
                        return b.f10228r0.d(TitleAsset.class, Builder.class);
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
                        return new TitleAsset();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getTextBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 1, this.text_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            codedOutputStream.c1(2, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            codedOutputStream.L0(3, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements TitleAssetOrBuilder {
                        private int bitField0_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private Object text_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f10226q0;
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

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearText() {
                            this.text_ = TitleAsset.getDefaultInstance().getText();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f10226q0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public String getText() {
                            Object obj = this.text_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.text_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public ByteString getTextBytes() {
                            Object obj = this.text_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.text_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.f10228r0.d(TitleAsset.class, Builder.class);
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

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setText(String str) {
                            str.getClass();
                            this.text_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setTextBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.text_ = byteString;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.text_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset build() {
                            TitleAsset titleAssetBuildPartial = buildPartial();
                            if (titleAssetBuildPartial.isInitialized()) {
                                return titleAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset buildPartial() {
                            TitleAsset titleAsset = new TitleAsset(this);
                            titleAsset.text_ = this.text_;
                            titleAsset.len_ = this.len_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                titleAsset.ext_ = this.ext_;
                            } else {
                                titleAsset.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                titleAsset.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAsset;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public TitleAsset mo164getDefaultInstanceForType() {
                            return TitleAsset.getDefaultInstance();
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
                            this.text_ = "";
                            this.len_ = 0;
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

                        private Builder(j0.c cVar) {
                            super(cVar);
                            this.text_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
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
                            if (message instanceof TitleAsset) {
                                return mergeFrom((TitleAsset) message);
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

                        public Builder mergeFrom(TitleAsset titleAsset) {
                            if (titleAsset == TitleAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!titleAsset.getText().isEmpty()) {
                                this.text_ = titleAsset.text_;
                                onChanged();
                            }
                            if (titleAsset.getLen() != 0) {
                                setLen(titleAsset.getLen());
                            }
                            if (titleAsset.hasExt()) {
                                mergeExt(titleAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(titleAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) titleAsset).unknownFields);
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
                            TitleAsset titleAsset = null;
                            try {
                                try {
                                    TitleAsset titleAsset2 = (TitleAsset) TitleAsset.PARSER.parsePartialFrom(nVar, yVar);
                                    if (titleAsset2 != null) {
                                        mergeFrom(titleAsset2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    TitleAsset titleAsset3 = (TitleAsset) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        titleAsset = titleAsset3;
                                        if (titleAsset != null) {
                                            mergeFrom(titleAsset);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (titleAsset != null) {
                                    mergeFrom(titleAsset);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(TitleAsset titleAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAsset);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private TitleAsset(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (TitleAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static TitleAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public TitleAsset mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.text_ = "";
                        this.extProto_ = Collections.emptyList();
                    }

                    public static TitleAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static TitleAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static TitleAsset parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) j0.parseWithIOException(PARSER, inputStream);
                    }

                    private TitleAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.text_ = nVar.J();
                                        } else if (iK == 16) {
                                            this.len_ = nVar.L();
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

                    public static TitleAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (TitleAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    public static TitleAsset parseFrom(n nVar) throws IOException {
                        return (TitleAsset) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static TitleAsset parseFrom(n nVar, y yVar) throws IOException {
                        return (TitleAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface TitleAssetOrBuilder extends MessageOrBuilder {
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

                    int getLen();

                    String getText();

                    ByteString getTextBytes();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class VideoAsset extends j0 implements VideoAssetOrBuilder {
                    public static final int ADM_FIELD_NUMBER = 1;
                    public static final int CURL_FIELD_NUMBER = 2;
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private volatile Object adm_;
                    private volatile Object curl_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private byte memoizedIsInitialized;
                    private static final VideoAsset DEFAULT_INSTANCE = new VideoAsset();
                    private static final s1<VideoAsset> PARSER = new com.explorestack.protobuf.b<VideoAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.1
                        @Override // com.explorestack.protobuf.s1
                        public VideoAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new VideoAsset(nVar, yVar);
                        }
                    };

                    public static VideoAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10234u0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<VideoAsset> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof VideoAsset)) {
                            return super.equals(obj);
                        }
                        VideoAsset videoAsset = (VideoAsset) obj;
                        if (getAdm().equals(videoAsset.getAdm()) && getCurl().equals(videoAsset.getCurl()) && hasExt() == videoAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(videoAsset.getExt())) && getExtProtoList().equals(videoAsset.getExtProtoList()) && this.unknownFields.equals(videoAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getAdm() {
                        Object obj = this.adm_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adm_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getAdmBytes() {
                        Object obj = this.adm_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adm_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getCurl() {
                        Object obj = this.curl_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.curl_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getCurlBytes() {
                        Object obj = this.curl_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.curl_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<VideoAsset> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = !getAdmBytes().isEmpty() ? j0.computeStringSize(1, this.adm_) + 0 : 0;
                        if (!getCurlBytes().isEmpty()) {
                            iComputeStringSize += j0.computeStringSize(2, this.curl_);
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdm().hashCode()) * 37) + 2) * 53) + getCurl().hashCode();
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
                        return b.f10236v0.d(VideoAsset.class, Builder.class);
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
                        return new VideoAsset();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (!getAdmBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 1, this.adm_);
                        }
                        if (!getCurlBytes().isEmpty()) {
                            j0.writeString(codedOutputStream, 2, this.curl_);
                        }
                        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                            codedOutputStream.L0(3, this.extProto_.get(i10));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements VideoAssetOrBuilder {
                        private Object adm_;
                        private int bitField0_;
                        private Object curl_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f10234u0;
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

                        public Builder clearAdm() {
                            this.adm_ = VideoAsset.getDefaultInstance().getAdm();
                            onChanged();
                            return this;
                        }

                        public Builder clearCurl() {
                            this.curl_ = VideoAsset.getDefaultInstance().getCurl();
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
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getAdm() {
                            Object obj = this.adm_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.adm_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getAdmBytes() {
                            Object obj = this.adm_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.adm_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getCurl() {
                            Object obj = this.curl_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.curl_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getCurlBytes() {
                            Object obj = this.curl_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.curl_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f10234u0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.f10236v0.d(VideoAsset.class, Builder.class);
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

                        public Builder setAdm(String str) {
                            str.getClass();
                            this.adm_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setAdmBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.adm_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setCurl(String str) {
                            str.getClass();
                            this.curl_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setCurlBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            this.curl_ = byteString;
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

                        private Builder() {
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset build() {
                            VideoAsset videoAssetBuildPartial = buildPartial();
                            if (videoAssetBuildPartial.isInitialized()) {
                                return videoAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset buildPartial() {
                            VideoAsset videoAsset = new VideoAsset(this);
                            videoAsset.adm_ = this.adm_;
                            videoAsset.curl_ = this.curl_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                videoAsset.ext_ = this.ext_;
                            } else {
                                videoAsset.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                videoAsset.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                videoAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return videoAsset;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public VideoAsset mo164getDefaultInstanceForType() {
                            return VideoAsset.getDefaultInstance();
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
                            this.adm_ = "";
                            this.curl_ = "";
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
                            if (message instanceof VideoAsset) {
                                return mergeFrom((VideoAsset) message);
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
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(VideoAsset videoAsset) {
                            if (videoAsset == VideoAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!videoAsset.getAdm().isEmpty()) {
                                this.adm_ = videoAsset.adm_;
                                onChanged();
                            }
                            if (!videoAsset.getCurl().isEmpty()) {
                                this.curl_ = videoAsset.curl_;
                                onChanged();
                            }
                            if (videoAsset.hasExt()) {
                                mergeExt(videoAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!videoAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = videoAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(videoAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!videoAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(videoAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = videoAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) videoAsset).unknownFields);
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
                            VideoAsset videoAsset = null;
                            try {
                                try {
                                    VideoAsset videoAsset2 = (VideoAsset) VideoAsset.PARSER.parsePartialFrom(nVar, yVar);
                                    if (videoAsset2 != null) {
                                        mergeFrom(videoAsset2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    VideoAsset videoAsset3 = (VideoAsset) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        videoAsset = videoAsset3;
                                        if (videoAsset != null) {
                                            mergeFrom(videoAsset);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (videoAsset != null) {
                                    mergeFrom(videoAsset);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(VideoAsset videoAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoAsset);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private VideoAsset(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (VideoAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static VideoAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public VideoAsset mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static VideoAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private VideoAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.adm_ = "";
                        this.curl_ = "";
                        this.extProto_ = Collections.emptyList();
                    }

                    public static VideoAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static VideoAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) j0.parseWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (VideoAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    private VideoAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.adm_ = nVar.J();
                                        } else if (iK == 18) {
                                            this.curl_ = nVar.J();
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

                    public static VideoAsset parseFrom(n nVar) throws IOException {
                        return (VideoAsset) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static VideoAsset parseFrom(n nVar, y yVar) throws IOException {
                        return (VideoAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface VideoAssetOrBuilder extends MessageOrBuilder {
                    String getAdm();

                    ByteString getAdmBytes();

                    String getCurl();

                    ByteString getCurlBytes();

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

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static Asset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f10222o0;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Asset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<Asset> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Asset)) {
                        return super.equals(obj);
                    }
                    Asset asset = (Asset) obj;
                    if (getId() != asset.getId() || getReq() != asset.getReq() || hasTitle() != asset.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(asset.getTitle())) || hasImage() != asset.hasImage()) {
                        return false;
                    }
                    if ((hasImage() && !getImage().equals(asset.getImage())) || hasVideo() != asset.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(asset.getVideo())) || hasData() != asset.hasData()) {
                        return false;
                    }
                    if ((hasData() && !getData().equals(asset.getData())) || hasLink() != asset.hasLink()) {
                        return false;
                    }
                    if ((hasLink() && !getLink().equals(asset.getLink())) || hasLabel() != asset.hasLabel()) {
                        return false;
                    }
                    if ((hasLabel() && !getLabel().equals(asset.getLabel())) || hasDisclaimer() != asset.hasDisclaimer()) {
                        return false;
                    }
                    if ((!hasDisclaimer() || getDisclaimer().equals(asset.getDisclaimer())) && hasExt() == asset.hasExt()) {
                        return (!hasExt() || getExt().equals(asset.getExt())) && getExtProtoList().equals(asset.getExtProtoList()) && this.unknownFields.equals(asset.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DataAsset getData() {
                    DataAsset dataAsset = this.data_;
                    return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DataAssetOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DisclaimerAsset getDisclaimer() {
                    DisclaimerAsset disclaimerAsset = this.disclaimer_;
                    return disclaimerAsset == null ? DisclaimerAsset.getDefaultInstance() : disclaimerAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DisclaimerAssetOrBuilder getDisclaimerOrBuilder() {
                    return getDisclaimer();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public i2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public ImageAsset getImage() {
                    ImageAsset imageAsset = this.image_;
                    return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public ImageAssetOrBuilder getImageOrBuilder() {
                    return getImage();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LabelAsset getLabel() {
                    LabelAsset labelAsset = this.label_;
                    return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LabelAssetOrBuilder getLabelOrBuilder() {
                    return getLabel();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LinkAsset getLink() {
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    return getLink();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public s1<Asset> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean getReq() {
                    return this.req_;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.id_;
                    int iY = i11 != 0 ? CodedOutputStream.Y(1, i11) + 0 : 0;
                    boolean z10 = this.req_;
                    if (z10) {
                        iY += CodedOutputStream.e(2, z10);
                    }
                    if (this.title_ != null) {
                        iY += CodedOutputStream.G(3, getTitle());
                    }
                    if (this.image_ != null) {
                        iY += CodedOutputStream.G(4, getImage());
                    }
                    if (this.video_ != null) {
                        iY += CodedOutputStream.G(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iY += CodedOutputStream.G(6, getData());
                    }
                    if (this.link_ != null) {
                        iY += CodedOutputStream.G(7, getLink());
                    }
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        iY += CodedOutputStream.G(8, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        iY += CodedOutputStream.G(9, getExt());
                    }
                    if (this.label_ != null) {
                        iY += CodedOutputStream.G(10, getLabel());
                    }
                    if (this.disclaimer_ != null) {
                        iY += CodedOutputStream.G(11, getDisclaimer());
                    }
                    int serializedSize = iY + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public TitleAsset getTitle() {
                    TitleAsset titleAsset = this.title_;
                    return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public TitleAssetOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                public final u2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public VideoAsset getVideo() {
                    VideoAsset videoAsset = this.video_;
                    return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public VideoAssetOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasDisclaimer() {
                    return this.disclaimer_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasImage() {
                    return this.image_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasLabel() {
                    return this.label_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasLink() {
                    return this.link_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasVideo() {
                    return this.video_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + l0.d(getReq());
                    if (hasTitle()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getTitle().hashCode();
                    }
                    if (hasImage()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getImage().hashCode();
                    }
                    if (hasVideo()) {
                        iHashCode = (((iHashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iHashCode = (((iHashCode * 37) + 6) * 53) + getData().hashCode();
                    }
                    if (hasLink()) {
                        iHashCode = (((iHashCode * 37) + 7) * 53) + getLink().hashCode();
                    }
                    if (hasLabel()) {
                        iHashCode = (((iHashCode * 37) + 10) * 53) + getLabel().hashCode();
                    }
                    if (hasDisclaimer()) {
                        iHashCode = (((iHashCode * 37) + 11) * 53) + getDisclaimer().hashCode();
                    }
                    if (hasExt()) {
                        iHashCode = (((iHashCode * 37) + 9) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 8) * 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.j0
                protected j0.f internalGetFieldAccessorTable() {
                    return b.f10224p0.d(Asset.class, Builder.class);
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
                    return new Asset();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i10 = this.id_;
                    if (i10 != 0) {
                        codedOutputStream.c1(1, i10);
                    }
                    boolean z10 = this.req_;
                    if (z10) {
                        codedOutputStream.n0(2, z10);
                    }
                    if (this.title_ != null) {
                        codedOutputStream.L0(3, getTitle());
                    }
                    if (this.image_ != null) {
                        codedOutputStream.L0(4, getImage());
                    }
                    if (this.video_ != null) {
                        codedOutputStream.L0(5, getVideo());
                    }
                    if (this.data_ != null) {
                        codedOutputStream.L0(6, getData());
                    }
                    if (this.link_ != null) {
                        codedOutputStream.L0(7, getLink());
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        codedOutputStream.L0(8, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.L0(9, getExt());
                    }
                    if (this.label_ != null) {
                        codedOutputStream.L0(10, getLabel());
                    }
                    if (this.disclaimer_ != null) {
                        codedOutputStream.L0(11, getDisclaimer());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static final class Builder extends j0.b<Builder> implements AssetOrBuilder {
                    private int bitField0_;
                    private e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> dataBuilder_;
                    private DataAsset data_;
                    private e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> disclaimerBuilder_;
                    private DisclaimerAsset disclaimer_;
                    private e2<Struct, Struct.Builder, i2> extBuilder_;
                    private z1<Any, Any.Builder, e> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> imageBuilder_;
                    private ImageAsset image_;
                    private e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> labelBuilder_;
                    private LabelAsset label_;
                    private e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> linkBuilder_;
                    private LinkAsset link_;
                    private boolean req_;
                    private e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> titleBuilder_;
                    private TitleAsset title_;
                    private e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> videoBuilder_;
                    private VideoAsset video_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new e2<>(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10222o0;
                    }

                    private e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> getDisclaimerFieldBuilder() {
                        if (this.disclaimerBuilder_ == null) {
                            this.disclaimerBuilder_ = new e2<>(getDisclaimer(), getParentForChildren(), isClean());
                            this.disclaimer_ = null;
                        }
                        return this.disclaimerBuilder_;
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

                    private e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> getImageFieldBuilder() {
                        if (this.imageBuilder_ == null) {
                            this.imageBuilder_ = new e2<>(getImage(), getParentForChildren(), isClean());
                            this.image_ = null;
                        }
                        return this.imageBuilder_;
                    }

                    private e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> getLabelFieldBuilder() {
                        if (this.labelBuilder_ == null) {
                            this.labelBuilder_ = new e2<>(getLabel(), getParentForChildren(), isClean());
                            this.label_ = null;
                        }
                        return this.labelBuilder_;
                    }

                    private e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> getLinkFieldBuilder() {
                        if (this.linkBuilder_ == null) {
                            this.linkBuilder_ = new e2<>(getLink(), getParentForChildren(), isClean());
                            this.link_ = null;
                        }
                        return this.linkBuilder_;
                    }

                    private e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new e2<>(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    private e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new e2<>(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
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

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearDisclaimer() {
                        if (this.disclaimerBuilder_ == null) {
                            this.disclaimer_ = null;
                            onChanged();
                        } else {
                            this.disclaimer_ = null;
                            this.disclaimerBuilder_ = null;
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
                            this.bitField0_ &= -2;
                            onChanged();
                        } else {
                            z1Var.g();
                        }
                        return this;
                    }

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearImage() {
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                            onChanged();
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearLabel() {
                        if (this.labelBuilder_ == null) {
                            this.label_ = null;
                            onChanged();
                        } else {
                            this.label_ = null;
                            this.labelBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearLink() {
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                            onChanged();
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DataAsset getData() {
                        e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var != null) {
                            return (DataAsset) e2Var.e();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    public DataAsset.Builder getDataBuilder() {
                        onChanged();
                        return (DataAsset.Builder) getDataFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DataAssetOrBuilder getDataOrBuilder() {
                        e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var != null) {
                            return (DataAssetOrBuilder) e2Var.f();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f10222o0;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DisclaimerAsset getDisclaimer() {
                        e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> e2Var = this.disclaimerBuilder_;
                        if (e2Var != null) {
                            return (DisclaimerAsset) e2Var.e();
                        }
                        DisclaimerAsset disclaimerAsset = this.disclaimer_;
                        return disclaimerAsset == null ? DisclaimerAsset.getDefaultInstance() : disclaimerAsset;
                    }

                    public DisclaimerAsset.Builder getDisclaimerBuilder() {
                        onChanged();
                        return (DisclaimerAsset.Builder) getDisclaimerFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DisclaimerAssetOrBuilder getDisclaimerOrBuilder() {
                        e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> e2Var = this.disclaimerBuilder_;
                        if (e2Var != null) {
                            return (DisclaimerAssetOrBuilder) e2Var.f();
                        }
                        DisclaimerAsset disclaimerAsset = this.disclaimer_;
                        return disclaimerAsset == null ? DisclaimerAsset.getDefaultInstance() : disclaimerAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public i2 getExtOrBuilder() {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var != null) {
                            return (i2) e2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public int getExtProtoCount() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.size() : z1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public List<Any> getExtProtoList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public ImageAsset getImage() {
                        e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> e2Var = this.imageBuilder_;
                        if (e2Var != null) {
                            return (ImageAsset) e2Var.e();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    public ImageAsset.Builder getImageBuilder() {
                        onChanged();
                        return (ImageAsset.Builder) getImageFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public ImageAssetOrBuilder getImageOrBuilder() {
                        e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> e2Var = this.imageBuilder_;
                        if (e2Var != null) {
                            return (ImageAssetOrBuilder) e2Var.f();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LabelAsset getLabel() {
                        e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> e2Var = this.labelBuilder_;
                        if (e2Var != null) {
                            return (LabelAsset) e2Var.e();
                        }
                        LabelAsset labelAsset = this.label_;
                        return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                    }

                    public LabelAsset.Builder getLabelBuilder() {
                        onChanged();
                        return (LabelAsset.Builder) getLabelFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LabelAssetOrBuilder getLabelOrBuilder() {
                        e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> e2Var = this.labelBuilder_;
                        if (e2Var != null) {
                            return (LabelAssetOrBuilder) e2Var.f();
                        }
                        LabelAsset labelAsset = this.label_;
                        return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LinkAsset getLink() {
                        e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                        if (e2Var != null) {
                            return (LinkAsset) e2Var.e();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    public LinkAsset.Builder getLinkBuilder() {
                        onChanged();
                        return (LinkAsset.Builder) getLinkFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LinkAssetOrBuilder getLinkOrBuilder() {
                        e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                        if (e2Var != null) {
                            return (LinkAssetOrBuilder) e2Var.f();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public TitleAsset getTitle() {
                        e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var != null) {
                            return (TitleAsset) e2Var.e();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    public TitleAsset.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAsset.Builder) getTitleFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public TitleAssetOrBuilder getTitleOrBuilder() {
                        e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var != null) {
                            return (TitleAssetOrBuilder) e2Var.f();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public VideoAsset getVideo() {
                        e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var != null) {
                            return (VideoAsset) e2Var.e();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    public VideoAsset.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoAsset.Builder) getVideoFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public VideoAssetOrBuilder getVideoOrBuilder() {
                        e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var != null) {
                            return (VideoAssetOrBuilder) e2Var.f();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasDisclaimer() {
                        return (this.disclaimerBuilder_ == null && this.disclaimer_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasImage() {
                        return (this.imageBuilder_ == null && this.image_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasLabel() {
                        return (this.labelBuilder_ == null && this.label_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasLink() {
                        return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.f10224p0.d(Asset.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAsset dataAsset) {
                        e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var == null) {
                            DataAsset dataAsset2 = this.data_;
                            if (dataAsset2 != null) {
                                this.data_ = DataAsset.newBuilder(dataAsset2).mergeFrom(dataAsset).buildPartial();
                            } else {
                                this.data_ = dataAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(dataAsset);
                        }
                        return this;
                    }

                    public Builder mergeDisclaimer(DisclaimerAsset disclaimerAsset) {
                        e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> e2Var = this.disclaimerBuilder_;
                        if (e2Var == null) {
                            DisclaimerAsset disclaimerAsset2 = this.disclaimer_;
                            if (disclaimerAsset2 != null) {
                                this.disclaimer_ = DisclaimerAsset.newBuilder(disclaimerAsset2).mergeFrom(disclaimerAsset).buildPartial();
                            } else {
                                this.disclaimer_ = disclaimerAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(disclaimerAsset);
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

                    public Builder mergeImage(ImageAsset imageAsset) {
                        e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> e2Var = this.imageBuilder_;
                        if (e2Var == null) {
                            ImageAsset imageAsset2 = this.image_;
                            if (imageAsset2 != null) {
                                this.image_ = ImageAsset.newBuilder(imageAsset2).mergeFrom(imageAsset).buildPartial();
                            } else {
                                this.image_ = imageAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(imageAsset);
                        }
                        return this;
                    }

                    public Builder mergeLabel(LabelAsset labelAsset) {
                        e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> e2Var = this.labelBuilder_;
                        if (e2Var == null) {
                            LabelAsset labelAsset2 = this.label_;
                            if (labelAsset2 != null) {
                                this.label_ = LabelAsset.newBuilder(labelAsset2).mergeFrom(labelAsset).buildPartial();
                            } else {
                                this.label_ = labelAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(labelAsset);
                        }
                        return this;
                    }

                    public Builder mergeLink(LinkAsset linkAsset) {
                        e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                        if (e2Var == null) {
                            LinkAsset linkAsset2 = this.link_;
                            if (linkAsset2 != null) {
                                this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                            } else {
                                this.link_ = linkAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(linkAsset);
                        }
                        return this;
                    }

                    public Builder mergeTitle(TitleAsset titleAsset) {
                        e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            TitleAsset titleAsset2 = this.title_;
                            if (titleAsset2 != null) {
                                this.title_ = TitleAsset.newBuilder(titleAsset2).mergeFrom(titleAsset).buildPartial();
                            } else {
                                this.title_ = titleAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(titleAsset);
                        }
                        return this;
                    }

                    public Builder mergeVideo(VideoAsset videoAsset) {
                        e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var == null) {
                            VideoAsset videoAsset2 = this.video_;
                            if (videoAsset2 != null) {
                                this.video_ = VideoAsset.newBuilder(videoAsset2).mergeFrom(videoAsset).buildPartial();
                            } else {
                                this.video_ = videoAsset;
                            }
                            onChanged();
                        } else {
                            e2Var.g(videoAsset);
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

                    public Builder setData(DataAsset dataAsset) {
                        e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var == null) {
                            dataAsset.getClass();
                            this.data_ = dataAsset;
                            onChanged();
                        } else {
                            e2Var.i(dataAsset);
                        }
                        return this;
                    }

                    public Builder setDisclaimer(DisclaimerAsset disclaimerAsset) {
                        e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> e2Var = this.disclaimerBuilder_;
                        if (e2Var == null) {
                            disclaimerAsset.getClass();
                            this.disclaimer_ = disclaimerAsset;
                            onChanged();
                        } else {
                            e2Var.i(disclaimerAsset);
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

                    public Builder setId(int i10) {
                        this.id_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setImage(ImageAsset imageAsset) {
                        e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> e2Var = this.imageBuilder_;
                        if (e2Var == null) {
                            imageAsset.getClass();
                            this.image_ = imageAsset;
                            onChanged();
                        } else {
                            e2Var.i(imageAsset);
                        }
                        return this;
                    }

                    public Builder setLabel(LabelAsset labelAsset) {
                        e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> e2Var = this.labelBuilder_;
                        if (e2Var == null) {
                            labelAsset.getClass();
                            this.label_ = labelAsset;
                            onChanged();
                        } else {
                            e2Var.i(labelAsset);
                        }
                        return this;
                    }

                    public Builder setLink(LinkAsset linkAsset) {
                        e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                        if (e2Var == null) {
                            linkAsset.getClass();
                            this.link_ = linkAsset;
                            onChanged();
                        } else {
                            e2Var.i(linkAsset);
                        }
                        return this;
                    }

                    public Builder setReq(boolean z10) {
                        this.req_ = z10;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAsset titleAsset) {
                        e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            titleAsset.getClass();
                            this.title_ = titleAsset;
                            onChanged();
                        } else {
                            e2Var.i(titleAsset);
                        }
                        return this;
                    }

                    public Builder setVideo(VideoAsset videoAsset) {
                        e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var == null) {
                            videoAsset.getClass();
                            this.video_ = videoAsset;
                            onChanged();
                        } else {
                            e2Var.i(videoAsset);
                        }
                        return this;
                    }

                    private Builder() {
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset build() {
                        Asset assetBuildPartial = buildPartial();
                        if (assetBuildPartial.isInitialized()) {
                            return assetBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset buildPartial() {
                        Asset asset = new Asset(this);
                        asset.id_ = this.id_;
                        asset.req_ = this.req_;
                        e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            asset.title_ = this.title_;
                        } else {
                            asset.title_ = (TitleAsset) e2Var.a();
                        }
                        e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> e2Var2 = this.imageBuilder_;
                        if (e2Var2 == null) {
                            asset.image_ = this.image_;
                        } else {
                            asset.image_ = (ImageAsset) e2Var2.a();
                        }
                        e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> e2Var3 = this.videoBuilder_;
                        if (e2Var3 == null) {
                            asset.video_ = this.video_;
                        } else {
                            asset.video_ = (VideoAsset) e2Var3.a();
                        }
                        e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> e2Var4 = this.dataBuilder_;
                        if (e2Var4 == null) {
                            asset.data_ = this.data_;
                        } else {
                            asset.data_ = (DataAsset) e2Var4.a();
                        }
                        e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var5 = this.linkBuilder_;
                        if (e2Var5 == null) {
                            asset.link_ = this.link_;
                        } else {
                            asset.link_ = (LinkAsset) e2Var5.a();
                        }
                        e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> e2Var6 = this.labelBuilder_;
                        if (e2Var6 == null) {
                            asset.label_ = this.label_;
                        } else {
                            asset.label_ = (LabelAsset) e2Var6.a();
                        }
                        e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> e2Var7 = this.disclaimerBuilder_;
                        if (e2Var7 == null) {
                            asset.disclaimer_ = this.disclaimer_;
                        } else {
                            asset.disclaimer_ = (DisclaimerAsset) e2Var7.a();
                        }
                        e2<Struct, Struct.Builder, i2> e2Var8 = this.extBuilder_;
                        if (e2Var8 == null) {
                            asset.ext_ = this.ext_;
                        } else {
                            asset.ext_ = (Struct) e2Var8.a();
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var != null) {
                            asset.extProto_ = z1Var.f();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            asset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return asset;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public Asset mo164getDefaultInstanceForType() {
                        return Asset.getDefaultInstance();
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
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        if (this.labelBuilder_ == null) {
                            this.label_ = null;
                        } else {
                            this.label_ = null;
                            this.labelBuilder_ = null;
                        }
                        if (this.disclaimerBuilder_ == null) {
                            this.disclaimer_ = null;
                        } else {
                            this.disclaimer_ = null;
                            this.disclaimerBuilder_ = null;
                        }
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

                    private Builder(j0.c cVar) {
                        super(cVar);
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    public Builder setData(DataAsset.Builder builder) {
                        e2<DataAsset, DataAsset.Builder, DataAssetOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var == null) {
                            this.data_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setDisclaimer(DisclaimerAsset.Builder builder) {
                        e2<DisclaimerAsset, DisclaimerAsset.Builder, DisclaimerAssetOrBuilder> e2Var = this.disclaimerBuilder_;
                        if (e2Var == null) {
                            this.disclaimer_ = builder.build();
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

                    public Builder setImage(ImageAsset.Builder builder) {
                        e2<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> e2Var = this.imageBuilder_;
                        if (e2Var == null) {
                            this.image_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setLabel(LabelAsset.Builder builder) {
                        e2<LabelAsset, LabelAsset.Builder, LabelAssetOrBuilder> e2Var = this.labelBuilder_;
                        if (e2Var == null) {
                            this.label_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setLink(LinkAsset.Builder builder) {
                        e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                        if (e2Var == null) {
                            this.link_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setTitle(TitleAsset.Builder builder) {
                        e2<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            this.title_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setVideo(VideoAsset.Builder builder) {
                        e2<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var == null) {
                            this.video_ = builder.build();
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
                        if (message instanceof Asset) {
                            return mergeFrom((Asset) message);
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

                    public Builder mergeFrom(Asset asset) {
                        if (asset == Asset.getDefaultInstance()) {
                            return this;
                        }
                        if (asset.getId() != 0) {
                            setId(asset.getId());
                        }
                        if (asset.getReq()) {
                            setReq(asset.getReq());
                        }
                        if (asset.hasTitle()) {
                            mergeTitle(asset.getTitle());
                        }
                        if (asset.hasImage()) {
                            mergeImage(asset.getImage());
                        }
                        if (asset.hasVideo()) {
                            mergeVideo(asset.getVideo());
                        }
                        if (asset.hasData()) {
                            mergeData(asset.getData());
                        }
                        if (asset.hasLink()) {
                            mergeLink(asset.getLink());
                        }
                        if (asset.hasLabel()) {
                            mergeLabel(asset.getLabel());
                        }
                        if (asset.hasDisclaimer()) {
                            mergeDisclaimer(asset.getDisclaimer());
                        }
                        if (asset.hasExt()) {
                            mergeExt(asset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!asset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = asset.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(asset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!asset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(asset.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = asset.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((j0) asset).unknownFields);
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
                        Asset asset = null;
                        try {
                            try {
                                Asset asset2 = (Asset) Asset.PARSER.parsePartialFrom(nVar, yVar);
                                if (asset2 != null) {
                                    mergeFrom(asset2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Asset asset3 = (Asset) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    asset = asset3;
                                    if (asset != null) {
                                        mergeFrom(asset);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (asset != null) {
                                mergeFrom(asset);
                            }
                            throw th;
                        }
                    }
                }

                public static Builder newBuilder(Asset asset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(asset);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                private Asset(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Asset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Asset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Asset mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Asset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Asset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.emptyList();
                }

                public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static Asset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static Asset parseFrom(InputStream inputStream) throws IOException {
                    return (Asset) j0.parseWithIOException(PARSER, inputStream);
                }

                private Asset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        case 8:
                                            this.id_ = nVar.L();
                                            continue;
                                        case 16:
                                            this.req_ = nVar.q();
                                            continue;
                                        case 26:
                                            TitleAsset titleAsset = this.title_;
                                            TitleAsset.Builder builder = titleAsset != null ? titleAsset.toBuilder() : null;
                                            TitleAsset titleAsset2 = (TitleAsset) nVar.A(TitleAsset.parser(), yVar);
                                            this.title_ = titleAsset2;
                                            if (builder != null) {
                                                builder.mergeFrom(titleAsset2);
                                                this.title_ = builder.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        case 34:
                                            ImageAsset imageAsset = this.image_;
                                            ImageAsset.Builder builder2 = imageAsset != null ? imageAsset.toBuilder() : null;
                                            ImageAsset imageAsset2 = (ImageAsset) nVar.A(ImageAsset.parser(), yVar);
                                            this.image_ = imageAsset2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(imageAsset2);
                                                this.image_ = builder2.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        case 42:
                                            VideoAsset videoAsset = this.video_;
                                            VideoAsset.Builder builder3 = videoAsset != null ? videoAsset.toBuilder() : null;
                                            VideoAsset videoAsset2 = (VideoAsset) nVar.A(VideoAsset.parser(), yVar);
                                            this.video_ = videoAsset2;
                                            if (builder3 != null) {
                                                builder3.mergeFrom(videoAsset2);
                                                this.video_ = builder3.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        case 50:
                                            DataAsset dataAsset = this.data_;
                                            DataAsset.Builder builder4 = dataAsset != null ? dataAsset.toBuilder() : null;
                                            DataAsset dataAsset2 = (DataAsset) nVar.A(DataAsset.parser(), yVar);
                                            this.data_ = dataAsset2;
                                            if (builder4 != null) {
                                                builder4.mergeFrom(dataAsset2);
                                                this.data_ = builder4.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        case 58:
                                            LinkAsset linkAsset = this.link_;
                                            LinkAsset.Builder builder5 = linkAsset != null ? linkAsset.toBuilder() : null;
                                            LinkAsset linkAsset2 = (LinkAsset) nVar.A(LinkAsset.parser(), yVar);
                                            this.link_ = linkAsset2;
                                            if (builder5 != null) {
                                                builder5.mergeFrom(linkAsset2);
                                                this.link_ = builder5.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        case 66:
                                            boolean z12 = (z11 ? 1 : 0) & true;
                                            z11 = z11;
                                            if (!z12) {
                                                this.extProto_ = new ArrayList();
                                                z11 = (z11 ? 1 : 0) | true;
                                            }
                                            this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                            continue;
                                        case 74:
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
                                        case 82:
                                            LabelAsset labelAsset = this.label_;
                                            LabelAsset.Builder builder7 = labelAsset != null ? labelAsset.toBuilder() : null;
                                            LabelAsset labelAsset2 = (LabelAsset) nVar.A(LabelAsset.parser(), yVar);
                                            this.label_ = labelAsset2;
                                            if (builder7 != null) {
                                                builder7.mergeFrom(labelAsset2);
                                                this.label_ = builder7.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
                                        case 90:
                                            DisclaimerAsset disclaimerAsset = this.disclaimer_;
                                            DisclaimerAsset.Builder builder8 = disclaimerAsset != null ? disclaimerAsset.toBuilder() : null;
                                            DisclaimerAsset disclaimerAsset2 = (DisclaimerAsset) nVar.A(DisclaimerAsset.parser(), yVar);
                                            this.disclaimer_ = disclaimerAsset2;
                                            if (builder8 != null) {
                                                builder8.mergeFrom(disclaimerAsset2);
                                                this.disclaimer_ = builder8.buildPartial();
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
                            if ((z11 ? 1 : 0) & true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = bVarG.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if ((z11 ? 1 : 0) & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static Asset parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Asset) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                public static Asset parseFrom(n nVar) throws IOException {
                    return (Asset) j0.parseWithIOException(PARSER, nVar);
                }

                public static Asset parseFrom(n nVar, y yVar) throws IOException {
                    return (Asset) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface AssetOrBuilder extends MessageOrBuilder {
                Asset.DataAsset getData();

                Asset.DataAssetOrBuilder getDataOrBuilder();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                Asset.DisclaimerAsset getDisclaimer();

                Asset.DisclaimerAssetOrBuilder getDisclaimerOrBuilder();

                Struct getExt();

                i2 getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                e getExtProtoOrBuilder(int i10);

                List<? extends e> getExtProtoOrBuilderList();

                int getId();

                Asset.ImageAsset getImage();

                Asset.ImageAssetOrBuilder getImageOrBuilder();

                Asset.LabelAsset getLabel();

                Asset.LabelAssetOrBuilder getLabelOrBuilder();

                LinkAsset getLink();

                LinkAssetOrBuilder getLinkOrBuilder();

                boolean getReq();

                Asset.TitleAsset getTitle();

                Asset.TitleAssetOrBuilder getTitleOrBuilder();

                Asset.VideoAsset getVideo();

                Asset.VideoAssetOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasDisclaimer();

                boolean hasExt();

                boolean hasImage();

                boolean hasLabel();

                boolean hasLink();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static final class LinkAsset extends j0 implements LinkAssetOrBuilder {
                public static final int EXT_FIELD_NUMBER = 5;
                public static final int EXT_PROTO_FIELD_NUMBER = 4;
                public static final int TRKR_FIELD_NUMBER = 3;
                public static final int URLFB_FIELD_NUMBER = 2;
                public static final int URL_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private byte memoizedIsInitialized;
                private r0 trkr_;
                private volatile Object url_;
                private volatile Object urlfb_;
                private static final LinkAsset DEFAULT_INSTANCE = new LinkAsset();
                private static final s1<LinkAsset> PARSER = new com.explorestack.protobuf.b<LinkAsset>() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.1
                    @Override // com.explorestack.protobuf.s1
                    public LinkAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new LinkAsset(nVar, yVar);
                    }
                };

                public static final class Builder extends j0.b<Builder> implements LinkAssetOrBuilder {
                    private int bitField0_;
                    private e2<Struct, Struct.Builder, i2> extBuilder_;
                    private z1<Any, Any.Builder, e> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private r0 trkr_;
                    private Object url_;
                    private Object urlfb_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
                        }
                    }

                    private void ensureTrkrIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.trkr_ = new q0(this.trkr_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f10218m0;
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

                    public Builder addAllTrkr(Iterable<String> iterable) {
                        ensureTrkrIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.trkr_);
                        onChanged();
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

                    public Builder addTrkr(String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.add(str);
                        onChanged();
                        return this;
                    }

                    public Builder addTrkrBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        ensureTrkrIsMutable();
                        this.trkr_.b(byteString);
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

                    public Builder clearTrkr() {
                        this.trkr_ = q0.f10776d;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearUrl() {
                        this.url_ = LinkAsset.getDefaultInstance().getUrl();
                        onChanged();
                        return this;
                    }

                    public Builder clearUrlfb() {
                        this.urlfb_ = LinkAsset.getDefaultInstance().getUrlfb();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f10218m0;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public i2 getExtOrBuilder() {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var != null) {
                            return (i2) e2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public int getExtProtoCount() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.size() : z1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getTrkr(int i10) {
                        return this.trkr_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getTrkrBytes(int i10) {
                        return this.trkr_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public int getTrkrCount() {
                        return this.trkr_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrlfb() {
                        Object obj = this.urlfb_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.urlfb_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlfbBytes() {
                        Object obj = this.urlfb_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.urlfb_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.f10220n0.d(LinkAsset.class, Builder.class);
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

                    public Builder setTrkr(int i10, String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.set(i10, str);
                        onChanged();
                        return this;
                    }

                    public Builder setUrl(String str) {
                        str.getClass();
                        this.url_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.url_ = byteString;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfb(String str) {
                        str.getClass();
                        this.urlfb_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfbBytes(ByteString byteString) {
                        byteString.getClass();
                        com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                        this.urlfb_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public w1 getTrkrList() {
                        return this.trkr_.getUnmodifiableView();
                    }

                    private Builder() {
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = q0.f10776d;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset build() {
                        LinkAsset linkAssetBuildPartial = buildPartial();
                        if (linkAssetBuildPartial.isInitialized()) {
                            return linkAssetBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) linkAssetBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset buildPartial() {
                        LinkAsset linkAsset = new LinkAsset(this);
                        linkAsset.url_ = this.url_;
                        linkAsset.urlfb_ = this.urlfb_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.trkr_ = this.trkr_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        linkAsset.trkr_ = this.trkr_;
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var == null) {
                            linkAsset.ext_ = this.ext_;
                        } else {
                            linkAsset.ext_ = (Struct) e2Var.a();
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var != null) {
                            linkAsset.extProto_ = z1Var.f();
                        } else {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            linkAsset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return linkAsset;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public LinkAsset mo164getDefaultInstanceForType() {
                        return LinkAsset.getDefaultInstance();
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
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = q0.f10776d;
                        this.bitField0_ &= -2;
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -3;
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
                        if (message instanceof LinkAsset) {
                            return mergeFrom((LinkAsset) message);
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
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = q0.f10776d;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(LinkAsset linkAsset) {
                        if (linkAsset == LinkAsset.getDefaultInstance()) {
                            return this;
                        }
                        if (!linkAsset.getUrl().isEmpty()) {
                            this.url_ = linkAsset.url_;
                            onChanged();
                        }
                        if (!linkAsset.getUrlfb().isEmpty()) {
                            this.urlfb_ = linkAsset.urlfb_;
                            onChanged();
                        }
                        if (!linkAsset.trkr_.isEmpty()) {
                            if (this.trkr_.isEmpty()) {
                                this.trkr_ = linkAsset.trkr_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureTrkrIsMutable();
                                this.trkr_.addAll(linkAsset.trkr_);
                            }
                            onChanged();
                        }
                        if (linkAsset.hasExt()) {
                            mergeExt(linkAsset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!linkAsset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = linkAsset.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(linkAsset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!linkAsset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(linkAsset.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = linkAsset.extProto_;
                                this.bitField0_ &= -3;
                                this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((j0) linkAsset).unknownFields);
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
                        LinkAsset linkAsset = null;
                        try {
                            try {
                                LinkAsset linkAsset2 = (LinkAsset) LinkAsset.PARSER.parsePartialFrom(nVar, yVar);
                                if (linkAsset2 != null) {
                                    mergeFrom(linkAsset2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                LinkAsset linkAsset3 = (LinkAsset) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    linkAsset = linkAsset3;
                                    if (linkAsset != null) {
                                        mergeFrom(linkAsset);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (linkAsset != null) {
                                mergeFrom(linkAsset);
                            }
                            throw th;
                        }
                    }
                }

                public static LinkAsset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f10218m0;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<LinkAsset> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LinkAsset)) {
                        return super.equals(obj);
                    }
                    LinkAsset linkAsset = (LinkAsset) obj;
                    if (getUrl().equals(linkAsset.getUrl()) && getUrlfb().equals(linkAsset.getUrlfb()) && getTrkrList().equals(linkAsset.getTrkrList()) && hasExt() == linkAsset.hasExt()) {
                        return (!hasExt() || getExt().equals(linkAsset.getExt())) && getExtProtoList().equals(linkAsset.getExtProtoList()) && this.unknownFields.equals(linkAsset.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public i2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public s1<LinkAsset> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !getUrlBytes().isEmpty() ? j0.computeStringSize(1, this.url_) + 0 : 0;
                    if (!getUrlfbBytes().isEmpty()) {
                        iComputeStringSize += j0.computeStringSize(2, this.urlfb_);
                    }
                    int iComputeStringSizeNoTag = 0;
                    for (int i11 = 0; i11 < this.trkr_.size(); i11++) {
                        iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.trkr_.getRaw(i11));
                    }
                    int size = iComputeStringSize + iComputeStringSizeNoTag + (getTrkrList().size() * 1);
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        size += CodedOutputStream.G(4, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        size += CodedOutputStream.G(5, getExt());
                    }
                    int serializedSize = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getTrkr(int i10) {
                    return this.trkr_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getTrkrBytes(int i10) {
                    return this.trkr_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public int getTrkrCount() {
                    return this.trkr_.size();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                public final u2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getUrlfb() {
                    Object obj = this.urlfb_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urlfb_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlfbBytes() {
                    Object obj = this.urlfb_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urlfb_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getUrlfb().hashCode();
                    if (getTrkrCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getTrkrList().hashCode();
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
                    return b.f10220n0.d(LinkAsset.class, Builder.class);
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
                    return new LinkAsset();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getUrlBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 1, this.url_);
                    }
                    if (!getUrlfbBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 2, this.urlfb_);
                    }
                    for (int i10 = 0; i10 < this.trkr_.size(); i10++) {
                        j0.writeString(codedOutputStream, 3, this.trkr_.getRaw(i10));
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        codedOutputStream.L0(4, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.L0(5, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static Builder newBuilder(LinkAsset linkAsset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(linkAsset);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public w1 getTrkrList() {
                    return this.trkr_;
                }

                private LinkAsset(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (LinkAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static LinkAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public LinkAsset mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static LinkAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private LinkAsset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.url_ = "";
                    this.urlfb_ = "";
                    this.trkr_ = q0.f10776d;
                    this.extProto_ = Collections.emptyList();
                }

                public static LinkAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static LinkAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static LinkAsset parseFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) j0.parseWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (LinkAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                private LinkAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        this.url_ = nVar.J();
                                    } else if (iK == 18) {
                                        this.urlfb_ = nVar.J();
                                    } else if (iK == 26) {
                                        String strJ = nVar.J();
                                        if ((i10 & 1) == 0) {
                                            this.trkr_ = new q0();
                                            i10 |= 1;
                                        }
                                        this.trkr_.add(strJ);
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
                                this.trkr_ = this.trkr_.getUnmodifiableView();
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
                        this.trkr_ = this.trkr_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static LinkAsset parseFrom(n nVar) throws IOException {
                    return (LinkAsset) j0.parseWithIOException(PARSER, nVar);
                }

                public static LinkAsset parseFrom(n nVar, y yVar) throws IOException {
                    return (LinkAsset) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface LinkAssetOrBuilder extends MessageOrBuilder {
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

                String getTrkr(int i10);

                ByteString getTrkrBytes(int i10);

                int getTrkrCount();

                List<String> getTrkrList();

                String getUrl();

                ByteString getUrlBytes();

                String getUrlfb();

                ByteString getUrlfbBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f10214k0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<Native> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Native)) {
                    return super.equals(obj);
                }
                Native r10 = (Native) obj;
                if (hasLink() != r10.hasLink()) {
                    return false;
                }
                if ((!hasLink() || getLink().equals(r10.getLink())) && getAssetList().equals(r10.getAssetList()) && hasExt() == r10.hasExt()) {
                    return (!hasExt() || getExt().equals(r10.getExt())) && getExtProtoList().equals(r10.getExtProtoList()) && this.unknownFields.equals(r10.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Asset getAsset(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<Asset> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public AssetOrBuilder getAssetOrBuilder(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public LinkAsset getLink() {
                LinkAsset linkAsset = this.link_;
                return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public LinkAssetOrBuilder getLinkOrBuilder() {
                return getLink();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<Native> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.link_ != null ? CodedOutputStream.G(1, getLink()) + 0 : 0;
                for (int i11 = 0; i11 < this.asset_.size(); i11++) {
                    iG += CodedOutputStream.G(2, this.asset_.get(i11));
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iG += CodedOutputStream.G(3, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iG += CodedOutputStream.G(4, getExt());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public boolean hasLink() {
                return this.link_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasLink()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getLink().hashCode();
                }
                if (getAssetCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getAssetList().hashCode();
                }
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
                return b.f10216l0.d(Native.class, Builder.class);
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
                return new Native();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.link_ != null) {
                    codedOutputStream.L0(1, getLink());
                }
                for (int i10 = 0; i10 < this.asset_.size(); i10++) {
                    codedOutputStream.L0(2, this.asset_.get(i10));
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    codedOutputStream.L0(3, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(4, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements NativeOrBuilder {
                private z1<Asset, Asset.Builder, AssetOrBuilder> assetBuilder_;
                private List<Asset> asset_;
                private int bitField0_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> linkBuilder_;
                private LinkAsset link_;

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private z1<Asset, Asset.Builder, AssetOrBuilder> getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        this.assetBuilder_ = new z1<>(this.asset_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f10214k0;
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

                private e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> getLinkFieldBuilder() {
                    if (this.linkBuilder_ == null) {
                        this.linkBuilder_ = new e2<>(getLink(), getParentForChildren(), isClean());
                        this.link_ = null;
                    }
                    return this.linkBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends Asset> iterable) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.asset_);
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

                public Builder addAsset(Asset asset) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(asset);
                        onChanged();
                    } else {
                        z1Var.e(asset);
                    }
                    return this;
                }

                public Asset.Builder addAssetBuilder() {
                    return (Asset.Builder) getAssetFieldBuilder().c(Asset.getDefaultInstance());
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

                public Builder clearAsset() {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        this.asset_ = Collections.emptyList();
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

                public Builder clearLink() {
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                        onChanged();
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public Asset getAsset(int i10) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? this.asset_.get(i10) : (Asset) z1Var.n(i10);
                }

                public Asset.Builder getAssetBuilder(int i10) {
                    return (Asset.Builder) getAssetFieldBuilder().k(i10);
                }

                public List<Asset.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public int getAssetCount() {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? this.asset_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<Asset> getAssetList() {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.asset_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public AssetOrBuilder getAssetOrBuilder(int i10) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? this.asset_.get(i10) : (AssetOrBuilder) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f10214k0;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public LinkAsset getLink() {
                    e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                    if (e2Var != null) {
                        return (LinkAsset) e2Var.e();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                public LinkAsset.Builder getLinkBuilder() {
                    onChanged();
                    return (LinkAsset.Builder) getLinkFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                    if (e2Var != null) {
                        return (LinkAssetOrBuilder) e2Var.f();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public boolean hasLink() {
                    return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.f10216l0.d(Native.class, Builder.class);
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

                public Builder mergeLink(LinkAsset linkAsset) {
                    e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                    if (e2Var == null) {
                        LinkAsset linkAsset2 = this.link_;
                        if (linkAsset2 != null) {
                            this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                        } else {
                            this.link_ = linkAsset;
                        }
                        onChanged();
                    } else {
                        e2Var.g(linkAsset);
                    }
                    return this;
                }

                public Builder removeAsset(int i10) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.remove(i10);
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

                public Builder setAsset(int i10, Asset asset) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.set(i10, asset);
                        onChanged();
                    } else {
                        z1Var.w(i10, asset);
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

                public Builder setLink(LinkAsset linkAsset) {
                    e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                    if (e2Var == null) {
                        linkAsset.getClass();
                        this.link_ = linkAsset;
                        onChanged();
                    } else {
                        e2Var.i(linkAsset);
                    }
                    return this;
                }

                private Builder() {
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native build() {
                    Native nativeBuildPartial = buildPartial();
                    if (nativeBuildPartial.isInitialized()) {
                        return nativeBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native buildPartial() {
                    Native r10 = new Native(this);
                    e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                    if (e2Var == null) {
                        r10.link_ = this.link_;
                    } else {
                        r10.link_ = (LinkAsset) e2Var.a();
                    }
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var != null) {
                        r10.asset_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        r10.asset_ = this.asset_;
                    }
                    e2<Struct, Struct.Builder, i2> e2Var2 = this.extBuilder_;
                    if (e2Var2 == null) {
                        r10.ext_ = this.ext_;
                    } else {
                        r10.ext_ = (Struct) e2Var2.a();
                    }
                    z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                    if (z1Var2 != null) {
                        r10.extProto_ = z1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        r10.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return r10;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Native mo164getDefaultInstanceForType() {
                    return Native.getDefaultInstance();
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

                public Asset.Builder addAssetBuilder(int i10) {
                    return (Asset.Builder) getAssetFieldBuilder().b(i10, Asset.getDefaultInstance());
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
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        this.asset_ = Collections.emptyList();
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

                public Builder setLink(LinkAsset.Builder builder) {
                    e2<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> e2Var = this.linkBuilder_;
                    if (e2Var == null) {
                        this.link_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addAsset(int i10, Asset asset) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i10, asset);
                        onChanged();
                    } else {
                        z1Var.d(i10, asset);
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
                    if (message instanceof Native) {
                        return mergeFrom((Native) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i10, Asset.Builder builder) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i10, builder.build());
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

                public Builder mergeFrom(Native r10) {
                    if (r10 == Native.getDefaultInstance()) {
                        return this;
                    }
                    if (r10.hasLink()) {
                        mergeLink(r10.getLink());
                    }
                    if (this.assetBuilder_ == null) {
                        if (!r10.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = r10.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(r10.asset_);
                            }
                            onChanged();
                        }
                    } else if (!r10.asset_.isEmpty()) {
                        if (!this.assetBuilder_.t()) {
                            this.assetBuilder_.a(r10.asset_);
                        } else {
                            this.assetBuilder_.h();
                            this.assetBuilder_ = null;
                            this.asset_ = r10.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = j0.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (r10.hasExt()) {
                        mergeExt(r10.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!r10.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = r10.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(r10.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!r10.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(r10.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = r10.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) r10).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(Asset.Builder builder) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
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

                public Builder addAsset(int i10, Asset.Builder builder) {
                    z1<Asset, Asset.Builder, AssetOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i10, builder.build());
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
                    Native r10 = null;
                    try {
                        try {
                            Native r11 = (Native) Native.PARSER.parsePartialFrom(nVar, yVar);
                            if (r11 != null) {
                                mergeFrom(r11);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Native r12 = (Native) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                r10 = r12;
                                if (r10 != null) {
                                    mergeFrom(r10);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (r10 != null) {
                            mergeFrom(r10);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(Native r10) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(r10);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private Native(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Native parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (Native) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Native mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Native parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Native() {
                this.memoizedIsInitialized = (byte) -1;
                this.asset_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static Native parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) j0.parseWithIOException(PARSER, inputStream);
            }

            private Native(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    LinkAsset linkAsset = this.link_;
                                    LinkAsset.Builder builder = linkAsset != null ? linkAsset.toBuilder() : null;
                                    LinkAsset linkAsset2 = (LinkAsset) nVar.A(LinkAsset.parser(), yVar);
                                    this.link_ = linkAsset2;
                                    if (builder != null) {
                                        builder.mergeFrom(linkAsset2);
                                        this.link_ = builder.buildPartial();
                                    }
                                } else if (iK == 18) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.asset_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.asset_.add((Asset) nVar.A(Asset.parser(), yVar));
                                } else if (iK == 26) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                } else if (iK != 34) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
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
                        if (((i10 == true ? 1 : 0) & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
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
                    this.asset_ = Collections.unmodifiableList(this.asset_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Native parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (Native) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static Native parseFrom(n nVar) throws IOException {
                return (Native) j0.parseWithIOException(PARSER, nVar);
            }

            public static Native parseFrom(n nVar, y yVar) throws IOException {
                return (Native) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface NativeOrBuilder extends MessageOrBuilder {
            Native.Asset getAsset(int i10);

            int getAssetCount();

            List<Native.Asset> getAssetList();

            Native.AssetOrBuilder getAssetOrBuilder(int i10);

            List<? extends Native.AssetOrBuilder> getAssetOrBuilderList();

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

            Native.LinkAsset getLink();

            Native.LinkAssetOrBuilder getLinkOrBuilder();

            boolean hasExt();

            boolean hasLink();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Display getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f10206g0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Display parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Display) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Display> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return super.equals(obj);
            }
            Display display = (Display) obj;
            if (!getMimeList().equals(display.getMimeList()) || !this.api_.equals(display.api_) || !this.type_.equals(display.type_) || getW() != display.getW() || getH() != display.getH() || getWratio() != display.getWratio() || getHratio() != display.getHratio() || !getAdm().equals(display.getAdm()) || !getCurl().equals(display.getCurl()) || hasBanner() != display.hasBanner()) {
                return false;
            }
            if ((hasBanner() && !getBanner().equals(display.getBanner())) || hasNative() != display.hasNative()) {
                return false;
            }
            if ((!hasNative() || getNative().equals(display.getNative())) && getEventList().equals(display.getEventList()) && hasExt() == display.hasExt()) {
                return (!hasExt() || getExt().equals(display.getExt())) && getExtProtoList().equals(display.getExtProtoList()) && this.unknownFields.equals(display.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ApiFramework getApi(int i10) {
            return api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<ApiFramework> getApiList() {
            return new l0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Banner getBanner() {
            Banner banner = this.banner_;
            return banner == null ? Banner.getDefaultInstance() : banner;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            return getBanner();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Event getEvent(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Event> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public EventOrBuilder getEventOrBuilder(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<? extends EventOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getHratio() {
            return this.hratio_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getMime(int i10) {
            return this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Native getNative() {
            Native r10 = this.native_;
            return r10 == null ? Native.getDefaultInstance() : r10;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            return getNative();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Display> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.mime_.getRaw(i11));
            }
            int size = iComputeStringSizeNoTag + 0 + (getMimeList().size() * 1);
            int iM = 0;
            for (int i12 = 0; i12 < this.api_.size(); i12++) {
                iM += CodedOutputStream.m(this.api_.get(i12).intValue());
            }
            int iZ = size + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + CodedOutputStream.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                iM2 += CodedOutputStream.m(this.type_.get(i13).intValue());
            }
            int iG = iZ + iM2;
            if (!getTypeList().isEmpty()) {
                iG = iG + 1 + CodedOutputStream.Z(iM2);
            }
            this.typeMemoizedSerializedSize = iM2;
            int i14 = this.w_;
            if (i14 != 0) {
                iG += CodedOutputStream.Y(4, i14);
            }
            int i15 = this.h_;
            if (i15 != 0) {
                iG += CodedOutputStream.Y(5, i15);
            }
            int i16 = this.wratio_;
            if (i16 != 0) {
                iG += CodedOutputStream.Y(6, i16);
            }
            int i17 = this.hratio_;
            if (i17 != 0) {
                iG += CodedOutputStream.Y(7, i17);
            }
            if (!getAdmBytes().isEmpty()) {
                iG += j0.computeStringSize(8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                iG += j0.computeStringSize(9, this.curl_);
            }
            if (this.banner_ != null) {
                iG += CodedOutputStream.G(10, getBanner());
            }
            if (this.native_ != null) {
                iG += CodedOutputStream.G(11, getNative());
            }
            for (int i18 = 0; i18 < this.event_.size(); i18++) {
                iG += CodedOutputStream.G(12, this.event_.get(i18));
            }
            for (int i19 = 0; i19 < this.extProto_.size(); i19++) {
                iG += CodedOutputStream.G(13, this.extProto_.get(i19));
            }
            if (this.ext_ != null) {
                iG += CodedOutputStream.G(14, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public DisplayCreativeType getType(int i10) {
            return type_converter_.convert(this.type_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<DisplayCreativeType> getTypeList() {
            return new l0.h(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getTypeValue(int i10) {
            return this.type_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getWratio() {
            return this.wratio_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasBanner() {
            return this.banner_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasNative() {
            return this.native_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getMimeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int w10 = (((((((((((((((((((((((iHashCode * 37) + 4) * 53) + getW()) * 37) + 5) * 53) + getH()) * 37) + 6) * 53) + getWratio()) * 37) + 7) * 53) + getHratio()) * 37) + 8) * 53) + getAdm().hashCode()) * 37) + 9) * 53) + getCurl().hashCode();
            if (hasBanner()) {
                w10 = (((w10 * 37) + 10) * 53) + getBanner().hashCode();
            }
            if (hasNative()) {
                w10 = (((w10 * 37) + 11) * 53) + getNative().hashCode();
            }
            if (getEventCount() > 0) {
                w10 = (((w10 * 37) + 12) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w10 = (((w10 * 37) + 14) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w10 = (((w10 * 37) + 13) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (w10 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.f10208h0.d(Display.class, Builder.class);
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
            return new Display();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.mime_.size(); i10++) {
                j0.writeString(codedOutputStream, 1, this.mime_.getRaw(i10));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.d1(18);
                codedOutputStream.d1(this.apiMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                codedOutputStream.w0(this.api_.get(i11).intValue());
            }
            if (getTypeList().size() > 0) {
                codedOutputStream.d1(26);
                codedOutputStream.d1(this.typeMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.type_.size(); i12++) {
                codedOutputStream.w0(this.type_.get(i12).intValue());
            }
            int i13 = this.w_;
            if (i13 != 0) {
                codedOutputStream.c1(4, i13);
            }
            int i14 = this.h_;
            if (i14 != 0) {
                codedOutputStream.c1(5, i14);
            }
            int i15 = this.wratio_;
            if (i15 != 0) {
                codedOutputStream.c1(6, i15);
            }
            int i16 = this.hratio_;
            if (i16 != 0) {
                codedOutputStream.c1(7, i16);
            }
            if (!getAdmBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 9, this.curl_);
            }
            if (this.banner_ != null) {
                codedOutputStream.L0(10, getBanner());
            }
            if (this.native_ != null) {
                codedOutputStream.L0(11, getNative());
            }
            for (int i17 = 0; i17 < this.event_.size(); i17++) {
                codedOutputStream.L0(12, this.event_.get(i17));
            }
            for (int i18 = 0; i18 < this.extProto_.size(); i18++) {
                codedOutputStream.L0(13, this.extProto_.get(i18));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(14, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Display display) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(display);
        }

        public static Display parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public w1 getMimeList() {
            return this.mime_;
        }

        private Display(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Display parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Display) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Display parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Display mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Display parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Display() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = q0.f10776d;
            this.api_ = Collections.emptyList();
            this.type_ = Collections.emptyList();
            this.adm_ = "";
            this.curl_ = "";
            this.event_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        public static Display parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Display parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Display parseFrom(InputStream inputStream) throws IOException {
            return (Display) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Display) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Display parseFrom(n nVar) throws IOException {
            return (Display) j0.parseWithIOException(PARSER, nVar);
        }

        public static Display parseFrom(n nVar, y yVar) throws IOException {
            return (Display) j0.parseWithIOException(PARSER, nVar, yVar);
        }

        private Display(n nVar, y yVar) throws InvalidProtocolBufferException {
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = nVar.K();
                        switch (iK) {
                            case 0:
                                break;
                            case 10:
                                String strJ = nVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.mime_ = new q0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.mime_.add(strJ);
                                continue;
                            case 16:
                                int iT = nVar.t();
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.api_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.api_.add(Integer.valueOf(iT));
                                continue;
                            case 18:
                                int iP = nVar.p(nVar.C());
                                i10 = i10;
                                while (nVar.d() > 0) {
                                    int iT2 = nVar.t();
                                    if (((i10 == true ? 1 : 0) & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                    i10 = i10;
                                }
                                nVar.o(iP);
                                continue;
                            case 24:
                                int iT3 = nVar.t();
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.type_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.type_.add(Integer.valueOf(iT3));
                                continue;
                            case 26:
                                int iP2 = nVar.p(nVar.C());
                                i10 = i10;
                                while (nVar.d() > 0) {
                                    int iT4 = nVar.t();
                                    if (((i10 == true ? 1 : 0) & 4) == 0) {
                                        this.type_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.type_.add(Integer.valueOf(iT4));
                                    i10 = i10;
                                }
                                nVar.o(iP2);
                                continue;
                            case 32:
                                this.w_ = nVar.L();
                                continue;
                            case 40:
                                this.h_ = nVar.L();
                                continue;
                            case 48:
                                this.wratio_ = nVar.L();
                                continue;
                            case 56:
                                this.hratio_ = nVar.L();
                                continue;
                            case 66:
                                this.adm_ = nVar.J();
                                continue;
                            case 74:
                                this.curl_ = nVar.J();
                                continue;
                            case 82:
                                Banner banner = this.banner_;
                                Banner.Builder builder = banner != null ? banner.toBuilder() : null;
                                Banner banner2 = (Banner) nVar.A(Banner.parser(), yVar);
                                this.banner_ = banner2;
                                if (builder != null) {
                                    builder.mergeFrom(banner2);
                                    this.banner_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 90:
                                Native r10 = this.native_;
                                Native.Builder builder2 = r10 != null ? r10.toBuilder() : null;
                                Native r11 = (Native) nVar.A(Native.parser(), yVar);
                                this.native_ = r11;
                                if (builder2 != null) {
                                    builder2.mergeFrom(r11);
                                    this.native_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 98:
                                int i14 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i14 == 0) {
                                    this.event_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.event_.add((Event) nVar.A(Event.parser(), yVar));
                                continue;
                            case 106:
                                int i15 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i15 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 16;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                continue;
                            case 114:
                                Struct struct = this.ext_;
                                Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.ext_ = struct2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(struct2);
                                    this.ext_ = builder3.buildPartial();
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
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 1) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface DisplayOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        Display.Banner getBanner();

        Display.BannerOrBuilder getBannerOrBuilder();

        String getCurl();

        ByteString getCurlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        Event getEvent(int i10);

        int getEventCount();

        List<Event> getEventList();

        EventOrBuilder getEventOrBuilder(int i10);

        List<? extends EventOrBuilder> getEventOrBuilderList();

        Struct getExt();

        i2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        int getH();

        int getHratio();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        Display.Native getNative();

        Display.NativeOrBuilder getNativeOrBuilder();

        DisplayCreativeType getType(int i10);

        int getTypeCount();

        List<DisplayCreativeType> getTypeList();

        int getTypeValue(int i10);

        List<Integer> getTypeValueList();

        int getW();

        int getWratio();

        boolean hasBanner();

        boolean hasExt();

        boolean hasNative();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Event extends j0 implements EventOrBuilder {
        public static final int API_FIELD_NUMBER = 3;
        public static final int CDATA_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private y0<String, String> cdata_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private int method_;
        private int type_;
        private volatile Object url_;
        private static final l0.h.a<Integer, ApiFramework> api_converter_ = new l0.h.a<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Ad.Event.1
            @Override // com.explorestack.protobuf.l0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final Event DEFAULT_INSTANCE = new Event();
        private static final s1<Event> PARSER = new com.explorestack.protobuf.b<Event>() { // from class: com.explorestack.protobuf.adcom.Ad.Event.2
            @Override // com.explorestack.protobuf.s1
            public Event parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Event(nVar, yVar);
            }
        };

        private static final class CdataDefaultEntryHolder {
            static final w0<String, String> defaultEntry;

            static {
                Descriptors.Descriptor descriptor = b.f10202e0;
                c3.b bVar = c3.b.f10262k;
                defaultEntry = w0.s(descriptor, bVar, "", bVar, "");
            }

            private CdataDefaultEntryHolder() {
            }
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f10198c0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public y0<String, String> internalGetCdata() {
            y0<String, String> y0Var = this.cdata_;
            return y0Var == null ? y0.h(CdataDefaultEntryHolder.defaultEntry) : y0Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Event> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public boolean containsCdata(String str) {
            str.getClass();
            return internalGetCdata().j().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (this.type_ == event.type_ && this.method_ == event.method_ && this.api_.equals(event.api_) && getUrl().equals(event.getUrl()) && internalGetCdata().equals(event.internalGetCdata()) && hasExt() == event.hasExt()) {
                return (!hasExt() || getExt().equals(event.getExt())) && getExtProtoList().equals(event.getExtProtoList()) && this.unknownFields.equals(event.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public ApiFramework getApi(int i10) {
            return api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<ApiFramework> getApiList() {
            return new l0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        @Deprecated
        public Map<String, String> getCdata() {
            return getCdataMap();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getCdataCount() {
            return internalGetCdata().j().size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Map<String, String> getCdataMap() {
            return internalGetCdata().j();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getCdataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> mapJ = internalGetCdata().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : str2;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getCdataOrThrow(String str) {
            str.getClass();
            Map<String, String> mapJ = internalGetCdata().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public EventTrackingMethod getMethod() {
            EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(this.method_);
            return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getMethodValue() {
            return this.method_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Event> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? CodedOutputStream.l(1, this.type_) + 0 : 0;
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                iL += CodedOutputStream.l(2, this.method_);
            }
            int iM = 0;
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                iM += CodedOutputStream.m(this.api_.get(i11).intValue());
            }
            int iG = iL + iM;
            if (!getApiList().isEmpty()) {
                iG = iG + 1 + CodedOutputStream.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            if (!getUrlBytes().isEmpty()) {
                iG += j0.computeStringSize(4, this.url_);
            }
            for (Map.Entry<String, String> entry : internalGetCdata().j().entrySet()) {
                iG += CodedOutputStream.G(5, CdataDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                iG += CodedOutputStream.G(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                iG += CodedOutputStream.G(7, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public EventType getType() {
            EventType eventTypeValueOf = EventType.valueOf(this.type_);
            return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + this.method_;
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.api_.hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getUrl().hashCode();
            if (!internalGetCdata().j().isEmpty()) {
                iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + internalGetCdata().hashCode();
            }
            if (hasExt()) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.f10200d0.d(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0
        protected y0 internalGetMapField(int i10) {
            if (i10 == 5) {
                return internalGetCdata();
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
            return new Event();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.v0(1, this.type_);
            }
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                codedOutputStream.v0(2, this.method_);
            }
            if (getApiList().size() > 0) {
                codedOutputStream.d1(26);
                codedOutputStream.d1(this.apiMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.api_.size(); i10++) {
                codedOutputStream.w0(this.api_.get(i10).intValue());
            }
            if (!getUrlBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 4, this.url_);
            }
            j0.serializeStringMapTo(codedOutputStream, internalGetCdata(), CdataDefaultEntryHolder.defaultEntry, 5);
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                codedOutputStream.L0(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements EventOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private y0<String, String> cdata_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int method_;
            private int type_;
            private Object url_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f10198c0;
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
                    this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private y0<String, String> internalGetCdata() {
                y0<String, String> y0Var = this.cdata_;
                return y0Var == null ? y0.h(CdataDefaultEntryHolder.defaultEntry) : y0Var;
            }

            private y0<String, String> internalGetMutableCdata() {
                onChanged();
                if (this.cdata_ == null) {
                    this.cdata_ = y0.q(CdataDefaultEntryHolder.defaultEntry);
                }
                if (!this.cdata_.n()) {
                    this.cdata_ = this.cdata_.g();
                }
                return this.cdata_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
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

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
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

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCdata() {
                internalGetMutableCdata().m().clear();
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
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearMethod() {
                this.method_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = Event.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public boolean containsCdata(String str) {
                str.getClass();
                return internalGetCdata().j().containsKey(str);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Event.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<ApiFramework> getApiList() {
                return new l0.h(this.api_, Event.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            @Deprecated
            public Map<String, String> getCdata() {
                return getCdataMap();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getCdataCount() {
                return internalGetCdata().j().size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public Map<String, String> getCdataMap() {
                return internalGetCdata().j();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getCdataOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> mapJ = internalGetCdata().j();
                return mapJ.containsKey(str) ? mapJ.get(str) : str2;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getCdataOrThrow(String str) {
                str.getClass();
                Map<String, String> mapJ = internalGetCdata().j();
                if (mapJ.containsKey(str)) {
                    return mapJ.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f10198c0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public EventTrackingMethod getMethod() {
                EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(this.method_);
                return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getMethodValue() {
                return this.method_;
            }

            @Deprecated
            public Map<String, String> getMutableCdata() {
                return internalGetMutableCdata().m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.f10200d0.d(Event.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected y0 internalGetMapField(int i10) {
                if (i10 == 5) {
                    return internalGetCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected y0 internalGetMutableMapField(int i10) {
                if (i10 == 5) {
                    return internalGetMutableCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
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

            public Builder putAllCdata(Map<String, String> map) {
                internalGetMutableCdata().m().putAll(map);
                return this;
            }

            public Builder putCdata(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCdata().m().put(str, str2);
                return this;
            }

            public Builder removeCdata(String str) {
                str.getClass();
                internalGetMutableCdata().m().remove(str);
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

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
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

            public Builder setMethod(EventTrackingMethod eventTrackingMethod) {
                eventTrackingMethod.getClass();
                this.method_ = eventTrackingMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setMethodValue(int i10) {
                this.method_ = i10;
                onChanged();
                return this;
            }

            public Builder setType(EventType eventType) {
                eventType.getClass();
                this.type_ = eventType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.url_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event build() {
                Event eventBuildPartial = buildPartial();
                if (eventBuildPartial.isInitialized()) {
                    return eventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event buildPartial() {
                Event event = new Event(this);
                event.type_ = this.type_;
                event.method_ = this.method_;
                if ((this.bitField0_ & 1) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -2;
                }
                event.api_ = this.api_;
                event.url_ = this.url_;
                event.cdata_ = internalGetCdata();
                event.cdata_.o();
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    event.ext_ = this.ext_;
                } else {
                    event.ext_ = (Struct) e2Var.a();
                }
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var != null) {
                    event.extProto_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    event.extProto_ = this.extProto_;
                }
                onBuilt();
                return event;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Event mo164getDefaultInstanceForType() {
                return Event.getDefaultInstance();
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
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.url_ = "";
                internalGetMutableCdata().b();
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -5;
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
                if (message instanceof Event) {
                    return mergeFrom((Event) message);
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
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.url_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (event.type_ != 0) {
                    setTypeValue(event.getTypeValue());
                }
                if (event.method_ != 0) {
                    setMethodValue(event.getMethodValue());
                }
                if (!event.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = event.api_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(event.api_);
                    }
                    onChanged();
                }
                if (!event.getUrl().isEmpty()) {
                    this.url_ = event.url_;
                    onChanged();
                }
                internalGetMutableCdata().p(event.internalGetCdata());
                if (event.hasExt()) {
                    mergeExt(event.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!event.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = event.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(event.extProto_);
                        }
                        onChanged();
                    }
                } else if (!event.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(event.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = event.extProto_;
                        this.bitField0_ &= -5;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) event).unknownFields);
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
                Event event = null;
                try {
                    try {
                        Event event2 = (Event) Event.PARSER.parsePartialFrom(nVar, yVar);
                        if (event2 != null) {
                            mergeFrom(event2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Event event3 = (Event) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            event = event3;
                            if (event != null) {
                                mergeFrom(event);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (event != null) {
                        mergeFrom(event);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Event(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Event parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Event) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Event mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Event parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Event() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.method_ = 0;
            this.api_ = Collections.emptyList();
            this.url_ = "";
            this.extProto_ = Collections.emptyList();
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Event parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Event) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Event parseFrom(n nVar) throws IOException {
            return (Event) j0.parseWithIOException(PARSER, nVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Event(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            if (iK == 8) {
                                this.type_ = nVar.t();
                            } else if (iK == 16) {
                                this.method_ = nVar.t();
                            } else if (iK == 24) {
                                int iT = nVar.t();
                                if ((i10 & 1) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.api_.add(Integer.valueOf(iT));
                            } else if (iK == 26) {
                                int iP = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT2 = nVar.t();
                                    if ((i10 & 1) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                }
                                nVar.o(iP);
                            } else if (iK == 34) {
                                this.url_ = nVar.J();
                            } else if (iK == 42) {
                                if ((i10 & 2) == 0) {
                                    this.cdata_ = y0.q(CdataDefaultEntryHolder.defaultEntry);
                                    i10 |= 2;
                                }
                                w0 w0Var = (w0) nVar.A(CdataDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                                this.cdata_.m().put(w0Var.h(), w0Var.n());
                            } else if (iK == 50) {
                                if ((i10 & 4) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                            } else if (iK != 58) {
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
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i10 & 1) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Event parseFrom(n nVar, y yVar) throws IOException {
            return (Event) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface EventOrBuilder extends MessageOrBuilder {
        boolean containsCdata(String str);

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        @Deprecated
        Map<String, String> getCdata();

        int getCdataCount();

        Map<String, String> getCdataMap();

        String getCdataOrDefault(String str, String str2);

        String getCdataOrThrow(String str);

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

        EventTrackingMethod getMethod();

        int getMethodValue();

        EventType getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Video extends j0 implements VideoOrBuilder {
        public static final int ADM_FIELD_NUMBER = 4;
        public static final int API_FIELD_NUMBER = 2;
        public static final int CURL_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private volatile Object curl_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private r0 mime_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private static final l0.h.a<Integer, ApiFramework> api_converter_ = new l0.h.a<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Ad.Video.1
            @Override // com.explorestack.protobuf.l0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final l0.h.a<Integer, VideoCreativeType> type_converter_ = new l0.h.a<Integer, VideoCreativeType>() { // from class: com.explorestack.protobuf.adcom.Ad.Video.2
            @Override // com.explorestack.protobuf.l0.h.a
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                return videoCreativeTypeValueOf == null ? VideoCreativeType.UNRECOGNIZED : videoCreativeTypeValueOf;
            }
        };
        private static final Video DEFAULT_INSTANCE = new Video();
        private static final s1<Video> PARSER = new com.explorestack.protobuf.b<Video>() { // from class: com.explorestack.protobuf.adcom.Ad.Video.3
            @Override // com.explorestack.protobuf.s1
            public Video parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Video(nVar, yVar);
            }
        };

        public static final class Builder extends j0.b<Builder> implements VideoOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private int bitField0_;
            private Object curl_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private r0 mime_;
            private List<Integer> type_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new q0(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.C0;
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
                    this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends VideoCreativeType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
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

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.b(byteString);
                onChanged();
                return this;
            }

            public Builder addType(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i10) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Video.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Video.getDefaultInstance().getCurl();
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
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearMime() {
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Video.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<ApiFramework> getApiList() {
                return new l0.h(this.api_, Video.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.C0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getMime(int i10) {
                return this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public VideoCreativeType getType(int i10) {
                return (VideoCreativeType) Video.type_converter_.convert(this.type_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<VideoCreativeType> getTypeList() {
                return new l0.h(this.type_, Video.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getTypeValue(int i10) {
                return this.type_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.D0.d(Video.class, Builder.class);
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

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
                onChanged();
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
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

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setType(int i10, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10, int i11) {
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public w1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.mime_ = q0.f10776d;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video build() {
                Video videoBuildPartial = buildPartial();
                if (videoBuildPartial.isInitialized()) {
                    return videoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video buildPartial() {
                Video video = new Video(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                video.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                video.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                video.type_ = this.type_;
                video.adm_ = this.adm_;
                video.curl_ = this.curl_;
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    video.ext_ = this.ext_;
                } else {
                    video.ext_ = (Struct) e2Var.a();
                }
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var != null) {
                    video.extProto_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    video.extProto_ = this.extProto_;
                }
                onBuilt();
                return video;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Video mo164getDefaultInstanceForType() {
                return Video.getDefaultInstance();
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
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.adm_ = "";
                this.curl_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -9;
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
                if (message instanceof Video) {
                    return mergeFrom((Video) message);
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

            public Builder mergeFrom(Video video) {
                if (video == Video.getDefaultInstance()) {
                    return this;
                }
                if (!video.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = video.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(video.mime_);
                    }
                    onChanged();
                }
                if (!video.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = video.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(video.api_);
                    }
                    onChanged();
                }
                if (!video.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = video.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(video.type_);
                    }
                    onChanged();
                }
                if (!video.getAdm().isEmpty()) {
                    this.adm_ = video.adm_;
                    onChanged();
                }
                if (!video.getCurl().isEmpty()) {
                    this.curl_ = video.curl_;
                    onChanged();
                }
                if (video.hasExt()) {
                    mergeExt(video.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!video.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = video.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(video.extProto_);
                        }
                        onChanged();
                    }
                } else if (!video.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(video.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = video.extProto_;
                        this.bitField0_ &= -9;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) video).unknownFields);
                onChanged();
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.mime_ = q0.f10776d;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
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
                Video video = null;
                try {
                    try {
                        Video video2 = (Video) Video.PARSER.parsePartialFrom(nVar, yVar);
                        if (video2 != null) {
                            mergeFrom(video2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Video video3 = (Video) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            video = video3;
                            if (video != null) {
                                mergeFrom(video);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (video != null) {
                        mergeFrom(video);
                    }
                    throw th;
                }
            }
        }

        public static Video getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.C0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Video) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Video> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return super.equals(obj);
            }
            Video video = (Video) obj;
            if (getMimeList().equals(video.getMimeList()) && this.api_.equals(video.api_) && this.type_.equals(video.type_) && getAdm().equals(video.getAdm()) && getCurl().equals(video.getCurl()) && hasExt() == video.hasExt()) {
                return (!hasExt() || getExt().equals(video.getExt())) && getExtProtoList().equals(video.getExtProtoList()) && this.unknownFields.equals(video.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ApiFramework getApi(int i10) {
            return api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<ApiFramework> getApiList() {
            return new l0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getMime(int i10) {
            return this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Video> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.mime_.getRaw(i11));
            }
            int size = iComputeStringSizeNoTag + 0 + (getMimeList().size() * 1);
            int iM = 0;
            for (int i12 = 0; i12 < this.api_.size(); i12++) {
                iM += CodedOutputStream.m(this.api_.get(i12).intValue());
            }
            int iZ = size + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + CodedOutputStream.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                iM2 += CodedOutputStream.m(this.type_.get(i13).intValue());
            }
            int iG = iZ + iM2;
            if (!getTypeList().isEmpty()) {
                iG = iG + 1 + CodedOutputStream.Z(iM2);
            }
            this.typeMemoizedSerializedSize = iM2;
            if (!getAdmBytes().isEmpty()) {
                iG += j0.computeStringSize(4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                iG += j0.computeStringSize(5, this.curl_);
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                iG += CodedOutputStream.G(6, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                iG += CodedOutputStream.G(7, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public VideoCreativeType getType(int i10) {
            return type_converter_.convert(this.type_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<VideoCreativeType> getTypeList() {
            return new l0.h(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getTypeValue(int i10) {
            return this.type_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getMimeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int iHashCode2 = (((((((iHashCode * 37) + 4) * 53) + getAdm().hashCode()) * 37) + 5) * 53) + getCurl().hashCode();
            if (hasExt()) {
                iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.D0.d(Video.class, Builder.class);
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
            return new Video();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.mime_.size(); i10++) {
                j0.writeString(codedOutputStream, 1, this.mime_.getRaw(i10));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.d1(18);
                codedOutputStream.d1(this.apiMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                codedOutputStream.w0(this.api_.get(i11).intValue());
            }
            if (getTypeList().size() > 0) {
                codedOutputStream.d1(26);
                codedOutputStream.d1(this.typeMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.type_.size(); i12++) {
                codedOutputStream.w0(this.type_.get(i12).intValue());
            }
            if (!getAdmBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 5, this.curl_);
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                codedOutputStream.L0(6, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Video video) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(video);
        }

        public static Video parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public w1 getMimeList() {
            return this.mime_;
        }

        private Video(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Video parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Video) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Video mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Video parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Video() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = q0.f10776d;
            this.api_ = Collections.emptyList();
            this.type_ = Collections.emptyList();
            this.adm_ = "";
            this.curl_ = "";
            this.extProto_ = Collections.emptyList();
        }

        public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Video parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Video parseFrom(InputStream inputStream) throws IOException {
            return (Video) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Video) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Video parseFrom(n nVar) throws IOException {
            return (Video) j0.parseWithIOException(PARSER, nVar);
        }

        private Video(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                String strJ = nVar.J();
                                if ((i10 & 1) == 0) {
                                    this.mime_ = new q0();
                                    i10 |= 1;
                                }
                                this.mime_.add(strJ);
                            } else if (iK == 16) {
                                int iT = nVar.t();
                                if ((i10 & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.api_.add(Integer.valueOf(iT));
                            } else if (iK == 18) {
                                int iP = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT2 = nVar.t();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                }
                                nVar.o(iP);
                            } else if (iK == 24) {
                                int iT3 = nVar.t();
                                if ((i10 & 4) == 0) {
                                    this.type_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.type_.add(Integer.valueOf(iT3));
                            } else if (iK == 26) {
                                int iP2 = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT4 = nVar.t();
                                    if ((i10 & 4) == 0) {
                                        this.type_ = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.type_.add(Integer.valueOf(iT4));
                                }
                                nVar.o(iP2);
                            } else if (iK == 34) {
                                this.adm_ = nVar.J();
                            } else if (iK == 42) {
                                this.curl_ = nVar.J();
                            } else if (iK == 50) {
                                if ((i10 & 8) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                            } else if (iK != 58) {
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
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    if ((i10 & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i10 & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            if ((i10 & 8) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Video parseFrom(n nVar, y yVar) throws IOException {
            return (Video) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface VideoOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        String getCurl();

        ByteString getCurlBytes();

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

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        VideoCreativeType getType(int i10);

        int getTypeCount();

        List<VideoCreativeType> getTypeList();

        int getTypeValue(int i10);

        List<Integer> getTypeValueList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f10194a0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Ad parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ad) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Ad> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return super.equals(obj);
        }
        Ad ad2 = (Ad) obj;
        if (!getId().equals(ad2.getId()) || !m165getAdomainList().equals(ad2.m165getAdomainList()) || !m166getBundleList().equals(ad2.m166getBundleList()) || !getIurl().equals(ad2.getIurl()) || !m167getCatList().equals(ad2.m167getCatList()) || this.cattax_ != ad2.cattax_ || !getLang().equals(ad2.getLang()) || getSecure() != ad2.getSecure() || this.mrating_ != ad2.mrating_ || !getInit().equals(ad2.getInit()) || !getLastmod().equals(ad2.getLastmod()) || hasDisplay() != ad2.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(ad2.getDisplay())) || hasVideo() != ad2.hasVideo()) {
            return false;
        }
        if ((hasVideo() && !getVideo().equals(ad2.getVideo())) || hasAudit() != ad2.hasAudit()) {
            return false;
        }
        if ((!hasAudit() || getAudit().equals(ad2.getAudit())) && hasExt() == ad2.hasExt()) {
            return (!hasExt() || getExt().equals(ad2.getExt())) && getExtProtoList().equals(ad2.getExtProtoList()) && this.unknownFields.equals(ad2.unknownFields);
        }
        return false;
    }

    public String getAdomain(int i10) {
        return this.adomain_.get(i10);
    }

    public ByteString getAdomainBytes(int i10) {
        return this.adomain_.getByteString(i10);
    }

    public int getAdomainCount() {
        return this.adomain_.size();
    }

    public Audit getAudit() {
        Audit audit = this.audit_;
        return audit == null ? Audit.getDefaultInstance() : audit;
    }

    public AuditOrBuilder getAuditOrBuilder() {
        return getAudit();
    }

    public String getBundle(int i10) {
        return this.bundle_.get(i10);
    }

    public ByteString getBundleBytes(int i10) {
        return this.bundle_.getByteString(i10);
    }

    public int getBundleCount() {
        return this.bundle_.size();
    }

    public String getCat(int i10) {
        return this.cat_.get(i10);
    }

    public ByteString getCatBytes(int i10) {
        return this.cat_.getByteString(i10);
    }

    public int getCatCount() {
        return this.cat_.size();
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public Display getDisplay() {
        Display display = this.display_;
        return display == null ? Display.getDefaultInstance() : display;
    }

    public DisplayOrBuilder getDisplayOrBuilder() {
        return getDisplay();
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

    public String getInit() {
        Object obj = this.init_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.init_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInitBytes() {
        Object obj = this.init_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.init_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getIurl() {
        Object obj = this.iurl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.iurl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIurlBytes() {
        Object obj = this.iurl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.iurl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getLang() {
        Object obj = this.lang_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lang_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLangBytes() {
        Object obj = this.lang_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lang_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getLastmod() {
        Object obj = this.lastmod_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lastmod_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLastmodBytes() {
        Object obj = this.lastmod_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lastmod_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public MediaRating getMrating() {
        MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
        return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
    }

    public int getMratingValue() {
        return this.mrating_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Ad> getParserForType() {
        return PARSER;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? j0.computeStringSize(1, this.id_) + 0 : 0;
        int iComputeStringSizeNoTag = 0;
        for (int i11 = 0; i11 < this.adomain_.size(); i11++) {
            iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.adomain_.getRaw(i11));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (m165getAdomainList().size() * 1);
        int iComputeStringSizeNoTag2 = 0;
        for (int i12 = 0; i12 < this.bundle_.size(); i12++) {
            iComputeStringSizeNoTag2 += j0.computeStringSizeNoTag(this.bundle_.getRaw(i12));
        }
        int size2 = size + iComputeStringSizeNoTag2 + (m166getBundleList().size() * 1);
        if (!getIurlBytes().isEmpty()) {
            size2 += j0.computeStringSize(4, this.iurl_);
        }
        int iComputeStringSizeNoTag3 = 0;
        for (int i13 = 0; i13 < this.cat_.size(); i13++) {
            iComputeStringSizeNoTag3 += j0.computeStringSizeNoTag(this.cat_.getRaw(i13));
        }
        int size3 = size2 + iComputeStringSizeNoTag3 + (m167getCatList().size() * 1);
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size3 += CodedOutputStream.l(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            size3 += j0.computeStringSize(7, this.lang_);
        }
        boolean z10 = this.secure_;
        if (z10) {
            size3 += CodedOutputStream.e(9, z10);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            size3 += CodedOutputStream.l(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            size3 += j0.computeStringSize(11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            size3 += j0.computeStringSize(12, this.lastmod_);
        }
        if (this.display_ != null) {
            size3 += CodedOutputStream.G(13, getDisplay());
        }
        if (this.video_ != null) {
            size3 += CodedOutputStream.G(14, getVideo());
        }
        if (this.audit_ != null) {
            size3 += CodedOutputStream.G(16, getAudit());
        }
        for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
            size3 += CodedOutputStream.G(17, this.extProto_.get(i14));
        }
        if (this.ext_ != null) {
            size3 += CodedOutputStream.G(18, getExt());
        }
        int serializedSize = size3 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public Video getVideo() {
        Video video = this.video_;
        return video == null ? Video.getDefaultInstance() : video;
    }

    public VideoOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    public boolean hasAudit() {
        return this.audit_ != null;
    }

    public boolean hasDisplay() {
        return this.display_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode();
        if (getAdomainCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + m165getAdomainList().hashCode();
        }
        if (getBundleCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m166getBundleList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getIurl().hashCode();
        if (getCatCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + m167getCatList().hashCode();
        }
        int iHashCode3 = (((((((((((((((((((((((iHashCode2 * 37) + 6) * 53) + this.cattax_) * 37) + 7) * 53) + getLang().hashCode()) * 37) + 9) * 53) + l0.d(getSecure())) * 37) + 10) * 53) + this.mrating_) * 37) + 11) * 53) + getInit().hashCode()) * 37) + 12) * 53) + getLastmod().hashCode();
        if (hasDisplay()) {
            iHashCode3 = (((iHashCode3 * 37) + 13) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            iHashCode3 = (((iHashCode3 * 37) + 14) * 53) + getVideo().hashCode();
        }
        if (hasAudit()) {
            iHashCode3 = (((iHashCode3 * 37) + 16) * 53) + getAudit().hashCode();
        }
        if (hasExt()) {
            iHashCode3 = (((iHashCode3 * 37) + 18) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode3 = (((iHashCode3 * 37) + 17) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode4 = (iHashCode3 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return b.f10196b0.d(Ad.class, Builder.class);
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
        return new Ad();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getIdBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.id_);
        }
        for (int i10 = 0; i10 < this.adomain_.size(); i10++) {
            j0.writeString(codedOutputStream, 2, this.adomain_.getRaw(i10));
        }
        for (int i11 = 0; i11 < this.bundle_.size(); i11++) {
            j0.writeString(codedOutputStream, 3, this.bundle_.getRaw(i11));
        }
        if (!getIurlBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 4, this.iurl_);
        }
        for (int i12 = 0; i12 < this.cat_.size(); i12++) {
            j0.writeString(codedOutputStream, 5, this.cat_.getRaw(i12));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            codedOutputStream.v0(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 7, this.lang_);
        }
        boolean z10 = this.secure_;
        if (z10) {
            codedOutputStream.n0(9, z10);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            codedOutputStream.v0(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 12, this.lastmod_);
        }
        if (this.display_ != null) {
            codedOutputStream.L0(13, getDisplay());
        }
        if (this.video_ != null) {
            codedOutputStream.L0(14, getVideo());
        }
        if (this.audit_ != null) {
            codedOutputStream.L0(16, getAudit());
        }
        for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
            codedOutputStream.L0(17, this.extProto_.get(i13));
        }
        if (this.ext_ != null) {
            codedOutputStream.L0(18, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(Ad ad2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(ad2);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    /* JADX INFO: renamed from: getAdomainList, reason: merged with bridge method [inline-methods] */
    public w1 m165getAdomainList() {
        return this.adomain_;
    }

    /* JADX INFO: renamed from: getBundleList, reason: merged with bridge method [inline-methods] */
    public w1 m166getBundleList() {
        return this.bundle_;
    }

    /* JADX INFO: renamed from: getCatList, reason: merged with bridge method [inline-methods] */
    public w1 m167getCatList() {
        return this.cat_;
    }

    private Ad(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Ad parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Ad) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Ad parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Ad mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Ad parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Ad() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        r0 r0Var = q0.f10776d;
        this.adomain_ = r0Var;
        this.bundle_ = r0Var;
        this.iurl_ = "";
        this.cat_ = r0Var;
        this.cattax_ = 0;
        this.lang_ = "";
        this.mrating_ = 0;
        this.init_ = "";
        this.lastmod_ = "";
        this.extProto_ = Collections.emptyList();
    }

    public static Ad parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Ad parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Ad parseFrom(InputStream inputStream) throws IOException {
        return (Ad) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Ad) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Ad parseFrom(n nVar) throws IOException {
        return (Ad) j0.parseWithIOException(PARSER, nVar);
    }

    public static Ad parseFrom(n nVar, y yVar) throws IOException {
        return (Ad) j0.parseWithIOException(PARSER, nVar, yVar);
    }

    private Ad(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
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
                            String strJ = nVar.J();
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.adomain_ = new q0();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.adomain_.add(strJ);
                            continue;
                        case 26:
                            String strJ2 = nVar.J();
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.bundle_ = new q0();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.bundle_.add(strJ2);
                            continue;
                        case 34:
                            this.iurl_ = nVar.J();
                            continue;
                        case 42:
                            String strJ3 = nVar.J();
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.cat_ = new q0();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.cat_.add(strJ3);
                            continue;
                        case 48:
                            this.cattax_ = nVar.t();
                            continue;
                        case 58:
                            this.lang_ = nVar.J();
                            continue;
                        case 72:
                            this.secure_ = nVar.q();
                            continue;
                        case 80:
                            this.mrating_ = nVar.t();
                            continue;
                        case 90:
                            this.init_ = nVar.J();
                            continue;
                        case 98:
                            this.lastmod_ = nVar.J();
                            continue;
                        case 106:
                            Display display = this.display_;
                            Display.Builder builder = display != null ? display.toBuilder() : null;
                            Display display2 = (Display) nVar.A(Display.parser(), yVar);
                            this.display_ = display2;
                            if (builder != null) {
                                builder.mergeFrom(display2);
                                this.display_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 114:
                            Video video = this.video_;
                            Video.Builder builder2 = video != null ? video.toBuilder() : null;
                            Video video2 = (Video) nVar.A(Video.parser(), yVar);
                            this.video_ = video2;
                            if (builder2 != null) {
                                builder2.mergeFrom(video2);
                                this.video_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                            Audit audit = this.audit_;
                            Audit.Builder builder3 = audit != null ? audit.toBuilder() : null;
                            Audit audit2 = (Audit) nVar.A(Audit.parser(), yVar);
                            this.audit_ = audit2;
                            if (builder3 != null) {
                                builder3.mergeFrom(audit2);
                                this.audit_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case CONFIG_REFRESH_FAILED_VALUE:
                            int i14 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i14 == 0) {
                                this.extProto_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                            continue;
                        case 146:
                            Struct struct = this.ext_;
                            Struct.Builder builder4 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                            this.ext_ = struct2;
                            if (builder4 != null) {
                                builder4.mergeFrom(struct2);
                                this.ext_ = builder4.buildPartial();
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
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.adomain_ = this.adomain_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.bundle_ = this.bundle_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.adomain_ = this.adomain_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.bundle_ = this.bundle_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 4) != 0) {
            this.cat_ = this.cat_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
