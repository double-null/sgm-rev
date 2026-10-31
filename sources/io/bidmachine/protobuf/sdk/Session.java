package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
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
import com.explorestack.protobuf.i;
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

/* JADX INFO: loaded from: classes5.dex */
public final class Session extends j0 implements SessionOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final Session DEFAULT_INSTANCE = new Session();
    private static final s1<Session> PARSER = new b<Session>() { // from class: io.bidmachine.protobuf.sdk.Session.1
        @Override // com.explorestack.protobuf.s1
        public Session parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Session(nVar, yVar);
        }
    };
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Context context_;
    private byte memoizedIsInitialized;
    private volatile Object sessionId_;

    public static final class Context extends j0 implements ContextOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        public static final int IAA_FIELD_NUMBER = 7;
        public static final int IAP_FIELD_NUMBER = 6;
        public static final int LAST_SESSION_DURATION_FIELD_NUMBER = 5;
        public static final int RETENTION_FIELD_NUMBER = 3;
        public static final int SC_FIELD_NUMBER = 2;
        public static final int SESSIONDURATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContextualData> data_;
        private BoolValue iaa_;
        private BoolValue iap_;
        private long lastSessionDuration_;
        private byte memoizedIsInitialized;
        private int retention_;
        private int sc_;
        private long sessionduration_;
        private static final Context DEFAULT_INSTANCE = new Context();
        private static final s1<Context> PARSER = new b<Context>() { // from class: io.bidmachine.protobuf.sdk.Session.Context.1
            @Override // com.explorestack.protobuf.s1
            public Context parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Context(nVar, yVar);
            }
        };

        public static Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Context) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Context> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return super.equals(obj);
            }
            Context context = (Context) obj;
            if (getSessionduration() != context.getSessionduration() || getSc() != context.getSc() || getRetention() != context.getRetention() || !getDataList().equals(context.getDataList()) || getLastSessionDuration() != context.getLastSessionDuration() || hasIap() != context.hasIap()) {
                return false;
            }
            if ((!hasIap() || getIap().equals(context.getIap())) && hasIaa() == context.hasIaa()) {
                return (!hasIaa() || getIaa().equals(context.getIaa())) && this.unknownFields.equals(context.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualData getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<ContextualData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public ContextualDataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIaa() {
            BoolValue boolValue = this.iaa_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public i getIaaOrBuilder() {
            return getIaa();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public BoolValue getIap() {
            BoolValue boolValue = this.iap_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public i getIapOrBuilder() {
            return getIap();
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getLastSessionDuration() {
            return this.lastSessionDuration_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Context> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getRetention() {
            return this.retention_;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public int getSc() {
            return this.sc_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.sessionduration_;
            int iA0 = j10 != 0 ? CodedOutputStream.a0(1, j10) + 0 : 0;
            int i11 = this.sc_;
            if (i11 != 0) {
                iA0 += CodedOutputStream.Y(2, i11);
            }
            int i12 = this.retention_;
            if (i12 != 0) {
                iA0 += CodedOutputStream.Y(3, i12);
            }
            for (int i13 = 0; i13 < this.data_.size(); i13++) {
                iA0 += CodedOutputStream.G(4, this.data_.get(i13));
            }
            long j11 = this.lastSessionDuration_;
            if (j11 != 0) {
                iA0 += CodedOutputStream.a0(5, j11);
            }
            if (this.iap_ != null) {
                iA0 += CodedOutputStream.G(6, getIap());
            }
            if (this.iaa_ != null) {
                iA0 += CodedOutputStream.G(7, getIaa());
            }
            int serializedSize = iA0 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIaa() {
            return this.iaa_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
        public boolean hasIap() {
            return this.iap_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + l0.i(getSessionduration())) * 37) + 2) * 53) + getSc()) * 37) + 3) * 53) + getRetention();
            if (getDataCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDataList().hashCode();
            }
            int i11 = (((iHashCode * 37) + 5) * 53) + l0.i(getLastSessionDuration());
            if (hasIap()) {
                i11 = (((i11 * 37) + 6) * 53) + getIap().hashCode();
            }
            if (hasIaa()) {
                i11 = (((i11 * 37) + 7) * 53) + getIaa().hashCode();
            }
            int iHashCode2 = (i11 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable.d(Context.class, Builder.class);
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
            return new Context();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                codedOutputStream.e1(1, j10);
            }
            int i10 = this.sc_;
            if (i10 != 0) {
                codedOutputStream.c1(2, i10);
            }
            int i11 = this.retention_;
            if (i11 != 0) {
                codedOutputStream.c1(3, i11);
            }
            for (int i12 = 0; i12 < this.data_.size(); i12++) {
                codedOutputStream.L0(4, this.data_.get(i12));
            }
            long j11 = this.lastSessionDuration_;
            if (j11 != 0) {
                codedOutputStream.e1(5, j11);
            }
            if (this.iap_ != null) {
                codedOutputStream.L0(6, getIap());
            }
            if (this.iaa_ != null) {
                codedOutputStream.L0(7, getIaa());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ContextOrBuilder {
            private int bitField0_;
            private z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> dataBuilder_;
            private List<ContextualData> data_;
            private e2<BoolValue, BoolValue.Builder, i> iaaBuilder_;
            private BoolValue iaa_;
            private e2<BoolValue, BoolValue.Builder, i> iapBuilder_;
            private BoolValue iap_;
            private long lastSessionDuration_;
            private int retention_;
            private int sc_;
            private long sessionduration_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new z1<>(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            private e2<BoolValue, BoolValue.Builder, i> getIaaFieldBuilder() {
                if (this.iaaBuilder_ == null) {
                    this.iaaBuilder_ = new e2<>(getIaa(), getParentForChildren(), isClean());
                    this.iaa_ = null;
                }
                return this.iaaBuilder_;
            }

            private e2<BoolValue, BoolValue.Builder, i> getIapFieldBuilder() {
                if (this.iapBuilder_ == null) {
                    this.iapBuilder_ = new e2<>(getIap(), getParentForChildren(), isClean());
                    this.iap_ = null;
                }
                return this.iapBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends ContextualData> iterable) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.data_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addData(ContextualData contextualData) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(contextualData);
                    onChanged();
                } else {
                    z1Var.e(contextualData);
                }
                return this;
            }

            public ContextualData.Builder addDataBuilder() {
                return (ContextualData.Builder) getDataFieldBuilder().c(ContextualData.getDefaultInstance());
            }

            public Builder clearData() {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearIaa() {
                if (this.iaaBuilder_ == null) {
                    this.iaa_ = null;
                    onChanged();
                } else {
                    this.iaa_ = null;
                    this.iaaBuilder_ = null;
                }
                return this;
            }

            public Builder clearIap() {
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                    onChanged();
                } else {
                    this.iap_ = null;
                    this.iapBuilder_ = null;
                }
                return this;
            }

            public Builder clearLastSessionDuration() {
                this.lastSessionDuration_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRetention() {
                this.retention_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSc() {
                this.sc_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualData getData(int i10) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? this.data_.get(i10) : (ContextualData) z1Var.n(i10);
            }

            public ContextualData.Builder getDataBuilder(int i10) {
                return (ContextualData.Builder) getDataFieldBuilder().k(i10);
            }

            public List<ContextualData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getDataCount() {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? this.data_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<ContextualData> getDataList() {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.data_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public ContextualDataOrBuilder getDataOrBuilder(int i10) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? this.data_.get(i10) : (ContextualDataOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public List<? extends ContextualDataOrBuilder> getDataOrBuilderList() {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIaa() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iaaBuilder_;
                if (e2Var != null) {
                    return (BoolValue) e2Var.e();
                }
                BoolValue boolValue = this.iaa_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getIaaBuilder() {
                onChanged();
                return (BoolValue.Builder) getIaaFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public i getIaaOrBuilder() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iaaBuilder_;
                if (e2Var != null) {
                    return (i) e2Var.f();
                }
                BoolValue boolValue = this.iaa_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public BoolValue getIap() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iapBuilder_;
                if (e2Var != null) {
                    return (BoolValue) e2Var.e();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getIapBuilder() {
                onChanged();
                return (BoolValue.Builder) getIapFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public i getIapOrBuilder() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iapBuilder_;
                if (e2Var != null) {
                    return (i) e2Var.f();
                }
                BoolValue boolValue = this.iap_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getLastSessionDuration() {
                return this.lastSessionDuration_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getRetention() {
                return this.retention_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public int getSc() {
                return this.sc_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIaa() {
                return (this.iaaBuilder_ == null && this.iaa_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Session.ContextOrBuilder
            public boolean hasIap() {
                return (this.iapBuilder_ == null && this.iap_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable.d(Context.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeIaa(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iaaBuilder_;
                if (e2Var == null) {
                    BoolValue boolValue2 = this.iaa_;
                    if (boolValue2 != null) {
                        this.iaa_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.iaa_ = boolValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(boolValue);
                }
                return this;
            }

            public Builder mergeIap(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iapBuilder_;
                if (e2Var == null) {
                    BoolValue boolValue2 = this.iap_;
                    if (boolValue2 != null) {
                        this.iap_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.iap_ = boolValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(boolValue);
                }
                return this;
            }

            public Builder removeData(int i10) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setData(int i10, ContextualData contextualData) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i10, contextualData);
                    onChanged();
                } else {
                    z1Var.w(i10, contextualData);
                }
                return this;
            }

            public Builder setIaa(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iaaBuilder_;
                if (e2Var == null) {
                    boolValue.getClass();
                    this.iaa_ = boolValue;
                    onChanged();
                } else {
                    e2Var.i(boolValue);
                }
                return this;
            }

            public Builder setIap(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iapBuilder_;
                if (e2Var == null) {
                    boolValue.getClass();
                    this.iap_ = boolValue;
                    onChanged();
                } else {
                    e2Var.i(boolValue);
                }
                return this;
            }

            public Builder setLastSessionDuration(long j10) {
                this.lastSessionDuration_ = j10;
                onChanged();
                return this;
            }

            public Builder setRetention(int i10) {
                this.retention_ = i10;
                onChanged();
                return this;
            }

            public Builder setSc(int i10) {
                this.sc_ = i10;
                onChanged();
                return this;
            }

            public Builder setSessionduration(long j10) {
                this.sessionduration_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context build() {
                Context contextBuildPartial = buildPartial();
                if (contextBuildPartial.isInitialized()) {
                    return contextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Context buildPartial() {
                Context context = new Context(this);
                context.sessionduration_ = this.sessionduration_;
                context.sc_ = this.sc_;
                context.retention_ = this.retention_;
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var != null) {
                    context.data_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    context.data_ = this.data_;
                }
                context.lastSessionDuration_ = this.lastSessionDuration_;
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iapBuilder_;
                if (e2Var == null) {
                    context.iap_ = this.iap_;
                } else {
                    context.iap_ = (BoolValue) e2Var.a();
                }
                e2<BoolValue, BoolValue.Builder, i> e2Var2 = this.iaaBuilder_;
                if (e2Var2 == null) {
                    context.iaa_ = this.iaa_;
                } else {
                    context.iaa_ = (BoolValue) e2Var2.a();
                }
                onBuilt();
                return context;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Context mo164getDefaultInstanceForType() {
                return Context.getDefaultInstance();
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

            public ContextualData.Builder addDataBuilder(int i10) {
                return (ContextualData.Builder) getDataFieldBuilder().b(i10, ContextualData.getDefaultInstance());
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
                this.sessionduration_ = 0L;
                this.sc_ = 0;
                this.retention_ = 0;
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                this.lastSessionDuration_ = 0L;
                if (this.iapBuilder_ == null) {
                    this.iap_ = null;
                } else {
                    this.iap_ = null;
                    this.iapBuilder_ = null;
                }
                if (this.iaaBuilder_ == null) {
                    this.iaa_ = null;
                } else {
                    this.iaa_ = null;
                    this.iaaBuilder_ = null;
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder setIaa(BoolValue.Builder builder) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iaaBuilder_;
                if (e2Var == null) {
                    this.iaa_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setIap(BoolValue.Builder builder) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.iapBuilder_;
                if (e2Var == null) {
                    this.iap_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder addData(int i10, ContextualData contextualData) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    contextualData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, contextualData);
                    onChanged();
                } else {
                    z1Var.d(i10, contextualData);
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
                if (message instanceof Context) {
                    return mergeFrom((Context) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, ContextualData.Builder builder) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Context context) {
                if (context == Context.getDefaultInstance()) {
                    return this;
                }
                if (context.getSessionduration() != 0) {
                    setSessionduration(context.getSessionduration());
                }
                if (context.getSc() != 0) {
                    setSc(context.getSc());
                }
                if (context.getRetention() != 0) {
                    setRetention(context.getRetention());
                }
                if (this.dataBuilder_ == null) {
                    if (!context.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = context.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(context.data_);
                        }
                        onChanged();
                    }
                } else if (!context.data_.isEmpty()) {
                    if (!this.dataBuilder_.t()) {
                        this.dataBuilder_.a(context.data_);
                    } else {
                        this.dataBuilder_.h();
                        this.dataBuilder_ = null;
                        this.data_ = context.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = j0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                if (context.getLastSessionDuration() != 0) {
                    setLastSessionDuration(context.getLastSessionDuration());
                }
                if (context.hasIap()) {
                    mergeIap(context.getIap());
                }
                if (context.hasIaa()) {
                    mergeIaa(context.getIaa());
                }
                mergeUnknownFields(((j0) context).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(ContextualData.Builder builder) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addData(int i10, ContextualData.Builder builder) {
                z1<ContextualData, ContextualData.Builder, ContextualDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Context context = null;
                try {
                    try {
                        Context context2 = (Context) Context.PARSER.parsePartialFrom(nVar, yVar);
                        if (context2 != null) {
                            mergeFrom(context2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Context context3 = (Context) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            context = context3;
                            if (context != null) {
                                mergeFrom(context);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (context != null) {
                        mergeFrom(context);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Context context) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
        }

        public static Context parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Context(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Context parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Context) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Context mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Context parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Context() {
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = Collections.emptyList();
        }

        public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Context parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Context parseFrom(InputStream inputStream) throws IOException {
            return (Context) j0.parseWithIOException(PARSER, inputStream);
        }

        private Context(n nVar, y yVar) throws InvalidProtocolBufferException {
            BoolValue.Builder builder;
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
                            if (iK == 8) {
                                this.sessionduration_ = nVar.M();
                            } else if (iK == 16) {
                                this.sc_ = nVar.L();
                            } else if (iK == 24) {
                                this.retention_ = nVar.L();
                            } else if (iK == 34) {
                                if (!(z11 & true)) {
                                    this.data_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.data_.add((ContextualData) nVar.A(ContextualData.parser(), yVar));
                            } else if (iK != 40) {
                                if (iK == 50) {
                                    BoolValue boolValue = this.iap_;
                                    builder = boolValue != null ? boolValue.toBuilder() : null;
                                    BoolValue boolValue2 = (BoolValue) nVar.A(BoolValue.parser(), yVar);
                                    this.iap_ = boolValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(boolValue2);
                                        this.iap_ = builder.buildPartial();
                                    }
                                } else if (iK != 58) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    BoolValue boolValue3 = this.iaa_;
                                    builder = boolValue3 != null ? boolValue3.toBuilder() : null;
                                    BoolValue boolValue4 = (BoolValue) nVar.A(BoolValue.parser(), yVar);
                                    this.iaa_ = boolValue4;
                                    if (builder != null) {
                                        builder.mergeFrom(boolValue4);
                                        this.iaa_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.lastSessionDuration_ = nVar.M();
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
                        this.data_ = Collections.unmodifiableList(this.data_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Context parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Context) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Context parseFrom(n nVar) throws IOException {
            return (Context) j0.parseWithIOException(PARSER, nVar);
        }

        public static Context parseFrom(n nVar, y yVar) throws IOException {
            return (Context) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface ContextOrBuilder extends MessageOrBuilder {
        ContextualData getData(int i10);

        int getDataCount();

        List<ContextualData> getDataList();

        ContextualDataOrBuilder getDataOrBuilder(int i10);

        List<? extends ContextualDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        BoolValue getIaa();

        i getIaaOrBuilder();

        BoolValue getIap();

        i getIapOrBuilder();

        long getLastSessionDuration();

        int getRetention();

        int getSc();

        long getSessionduration();

        boolean hasIaa();

        boolean hasIap();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Session getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Session parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Session) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Session parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Session> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session session = (Session) obj;
        if (getSessionId().equals(session.getSessionId()) && hasContext() == session.hasContext()) {
            return (!hasContext() || getContext().equals(session.getContext())) && this.unknownFields.equals(session.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Session> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getSessionIdBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.sessionId_);
        if (this.context_ != null) {
            iComputeStringSize += CodedOutputStream.G(2, getContext());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode();
        if (hasContext()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getContext().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable.d(Session.class, Builder.class);
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
        return new Session();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getSessionIdBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.sessionId_);
        }
        if (this.context_ != null) {
            codedOutputStream.L0(2, getContext());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements SessionOrBuilder {
        private e2<Context, Context.Builder, ContextOrBuilder> contextBuilder_;
        private Context context_;
        private Object sessionId_;

        private e2<Context, Context.Builder, ContextOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new e2<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = Session.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public Context getContext() {
            e2<Context, Context.Builder, ContextOrBuilder> e2Var = this.contextBuilder_;
            if (e2Var != null) {
                return (Context) e2Var.e();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public ContextOrBuilder getContextOrBuilder() {
            e2<Context, Context.Builder, ContextOrBuilder> e2Var = this.contextBuilder_;
            if (e2Var != null) {
                return (ContextOrBuilder) e2Var.f();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SessionOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable.d(Session.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Context context) {
            e2<Context, Context.Builder, ContextOrBuilder> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                Context context2 = this.context_;
                if (context2 != null) {
                    this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
                } else {
                    this.context_ = context;
                }
                onChanged();
            } else {
                e2Var.g(context);
            }
            return this;
        }

        public Builder setContext(Context context) {
            e2<Context, Context.Builder, ContextOrBuilder> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                context.getClass();
                this.context_ = context;
                onChanged();
            } else {
                e2Var.i(context);
            }
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

        private Builder() {
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session build() {
            Session sessionBuildPartial = buildPartial();
            if (sessionBuildPartial.isInitialized()) {
                return sessionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Session buildPartial() {
            Session session = new Session(this);
            session.sessionId_ = this.sessionId_;
            e2<Context, Context.Builder, ContextOrBuilder> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                session.context_ = this.context_;
            } else {
                session.context_ = (Context) e2Var.a();
            }
            onBuilt();
            return session;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Session mo164getDefaultInstanceForType() {
            return Session.getDefaultInstance();
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
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.sessionId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setContext(Context.Builder builder) {
            e2<Context, Context.Builder, ContextOrBuilder> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                this.context_ = builder.build();
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
            if (message instanceof Session) {
                return mergeFrom((Session) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Session session) {
            if (session == Session.getDefaultInstance()) {
                return this;
            }
            if (!session.getSessionId().isEmpty()) {
                this.sessionId_ = session.sessionId_;
                onChanged();
            }
            if (session.hasContext()) {
                mergeContext(session.getContext());
            }
            mergeUnknownFields(((j0) session).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Session session = null;
            try {
                try {
                    Session session2 = (Session) Session.PARSER.parsePartialFrom(nVar, yVar);
                    if (session2 != null) {
                        mergeFrom(session2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Session session3 = (Session) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        session = session3;
                        if (session != null) {
                            mergeFrom(session);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (session != null) {
                    mergeFrom(session);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Session session) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
    }

    public static Session parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Session(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Session parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Session) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Session parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Session mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Session parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Session() {
        this.memoizedIsInitialized = (byte) -1;
        this.sessionId_ = "";
    }

    public static Session parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Session parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Session parseFrom(InputStream inputStream) throws IOException {
        return (Session) j0.parseWithIOException(PARSER, inputStream);
    }

    private Session(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            this.sessionId_ = nVar.J();
                        } else if (iK != 18) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            Context context = this.context_;
                            Context.Builder builder = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) nVar.A(Context.parser(), yVar);
                            this.context_ = context2;
                            if (builder != null) {
                                builder.mergeFrom(context2);
                                this.context_ = builder.buildPartial();
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

    public static Session parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Session) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Session parseFrom(n nVar) throws IOException {
        return (Session) j0.parseWithIOException(PARSER, nVar);
    }

    public static Session parseFrom(n nVar, y yVar) throws IOException {
        return (Session) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
