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
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.q0;
import com.explorestack.protobuf.r0;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w1;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Monitor extends j0 implements MonitorOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private static final Monitor DEFAULT_INSTANCE = new Monitor();
    private static final s1<Monitor> PARSER = new b<Monitor>() { // from class: io.bidmachine.protobuf.sdk.Monitor.1
        @Override // com.explorestack.protobuf.s1
        public Monitor parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Monitor(nVar, yVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.Monitor$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase;
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase;
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase = iArr;
            try {
                iArr[Value.KindCase.STRING_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.INT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[Value.KindCase.KIND_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[FilterExpression.NodeCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase = iArr2;
            try {
                iArr2[FilterExpression.NodeCase.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[FilterExpression.NodeCase.ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[FilterExpression.NodeCase.RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[FilterExpression.NodeCase.NODE_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[Configuration.ConfigExtensionCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase = iArr3;
            try {
                iArr3[Configuration.ConfigExtensionCase.IMP_EXTENSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase[Configuration.ConfigExtensionCase.CONFIGEXTENSION_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final class All extends j0 implements AllOrBuilder {
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FilterExpression> items_;
        private byte memoizedIsInitialized;
        private static final All DEFAULT_INSTANCE = new All();
        private static final s1<All> PARSER = new b<All>() { // from class: io.bidmachine.protobuf.sdk.Monitor.All.1
            @Override // com.explorestack.protobuf.s1
            public All parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new All(nVar, yVar);
            }
        };

        public static All getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static All parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (All) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static All parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<All> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof All)) {
                return super.equals(obj);
            }
            All all = (All) obj;
            return getItemsList().equals(all.getItemsList()) && this.unknownFields.equals(all.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public FilterExpression getItems(int i10) {
            return this.items_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public List<FilterExpression> getItemsList() {
            return this.items_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public FilterExpressionOrBuilder getItemsOrBuilder(int i10) {
            return this.items_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
        public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<All> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.items_.size(); i11++) {
                iG += CodedOutputStream.G(1, this.items_.get(i11));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
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
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getItemsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getItemsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable.d(All.class, Builder.class);
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
            return new All();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.items_.size(); i10++) {
                codedOutputStream.L0(1, this.items_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements AllOrBuilder {
            private int bitField0_;
            private z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> itemsBuilder_;
            private List<FilterExpression> items_;

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
            }

            private z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new z1<>(this.items_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getItemsFieldBuilder();
                }
            }

            public Builder addAllItems(Iterable<? extends FilterExpression> iterable) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.items_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addItems(FilterExpression filterExpression) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(filterExpression);
                    onChanged();
                } else {
                    z1Var.e(filterExpression);
                }
                return this;
            }

            public FilterExpression.Builder addItemsBuilder() {
                return (FilterExpression.Builder) getItemsFieldBuilder().c(FilterExpression.getDefaultInstance());
            }

            public Builder clearItems() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public FilterExpression getItems(int i10) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? this.items_.get(i10) : (FilterExpression) z1Var.n(i10);
            }

            public FilterExpression.Builder getItemsBuilder(int i10) {
                return (FilterExpression.Builder) getItemsFieldBuilder().k(i10);
            }

            public List<FilterExpression.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public int getItemsCount() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? this.items_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public List<FilterExpression> getItemsList() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.items_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public FilterExpressionOrBuilder getItemsOrBuilder(int i10) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? this.items_.get(i10) : (FilterExpressionOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AllOrBuilder
            public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_All_fieldAccessorTable.d(All.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeItems(int i10) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setItems(int i10, FilterExpression filterExpression) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i10, filterExpression);
                    onChanged();
                } else {
                    z1Var.w(i10, filterExpression);
                }
                return this;
            }

            private Builder() {
                this.items_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public All build() {
                All allBuildPartial = buildPartial();
                if (allBuildPartial.isInitialized()) {
                    return allBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) allBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public All buildPartial() {
                All all = new All(this);
                int i10 = this.bitField0_;
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                        this.bitField0_ &= -2;
                    }
                    all.items_ = this.items_;
                } else {
                    all.items_ = z1Var.f();
                }
                onBuilt();
                return all;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public All mo164getDefaultInstanceForType() {
                return All.getDefaultInstance();
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

            public FilterExpression.Builder addItemsBuilder(int i10) {
                return (FilterExpression.Builder) getItemsFieldBuilder().b(i10, FilterExpression.getDefaultInstance());
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
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.items_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addItems(int i10, FilterExpression filterExpression) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i10, filterExpression);
                    onChanged();
                } else {
                    z1Var.d(i10, filterExpression);
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
                if (message instanceof All) {
                    return mergeFrom((All) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setItems(int i10, FilterExpression.Builder builder) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(All all) {
                if (all == All.getDefaultInstance()) {
                    return this;
                }
                if (this.itemsBuilder_ == null) {
                    if (!all.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = all.items_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(all.items_);
                        }
                        onChanged();
                    }
                } else if (!all.items_.isEmpty()) {
                    if (!this.itemsBuilder_.t()) {
                        this.itemsBuilder_.a(all.items_);
                    } else {
                        this.itemsBuilder_.h();
                        this.itemsBuilder_ = null;
                        this.items_ = all.items_;
                        this.bitField0_ &= -2;
                        this.itemsBuilder_ = j0.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) all).unknownFields);
                onChanged();
                return this;
            }

            public Builder addItems(FilterExpression.Builder builder) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addItems(int i10, FilterExpression.Builder builder) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                All all = null;
                try {
                    try {
                        All all2 = (All) All.PARSER.parsePartialFrom(nVar, yVar);
                        if (all2 != null) {
                            mergeFrom(all2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        All all3 = (All) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            all = all3;
                            if (all != null) {
                                mergeFrom(all);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (all != null) {
                        mergeFrom(all);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(All all) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(all);
        }

        public static All parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private All(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static All parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (All) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static All parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public All mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static All parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private All() {
            this.memoizedIsInitialized = (byte) -1;
            this.items_ = Collections.emptyList();
        }

        public static All parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static All parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static All parseFrom(InputStream inputStream) throws IOException {
            return (All) j0.parseWithIOException(PARSER, inputStream);
        }

        private All(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            if (iK != 10) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.items_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.items_.add((FilterExpression) nVar.A(FilterExpression.parser(), yVar));
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
                        this.items_ = Collections.unmodifiableList(this.items_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.items_ = Collections.unmodifiableList(this.items_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static All parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (All) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static All parseFrom(n nVar) throws IOException {
            return (All) j0.parseWithIOException(PARSER, nVar);
        }

        public static All parseFrom(n nVar, y yVar) throws IOException {
            return (All) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface AllOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        FilterExpression getItems(int i10);

        int getItemsCount();

        List<FilterExpression> getItemsList();

        FilterExpressionOrBuilder getItemsOrBuilder(int i10);

        List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Any extends j0 implements AnyOrBuilder {
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<FilterExpression> items_;
        private byte memoizedIsInitialized;
        private static final Any DEFAULT_INSTANCE = new Any();
        private static final s1<Any> PARSER = new b<Any>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Any.1
            @Override // com.explorestack.protobuf.s1
            public Any parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Any(nVar, yVar);
            }
        };

        public static Any getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Any) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Any> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Any)) {
                return super.equals(obj);
            }
            Any any = (Any) obj;
            return getItemsList().equals(any.getItemsList()) && this.unknownFields.equals(any.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public FilterExpression getItems(int i10) {
            return this.items_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public List<FilterExpression> getItemsList() {
            return this.items_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public FilterExpressionOrBuilder getItemsOrBuilder(int i10) {
            return this.items_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
        public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Any> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.items_.size(); i11++) {
                iG += CodedOutputStream.G(1, this.items_.get(i11));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
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
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getItemsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getItemsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable.d(Any.class, Builder.class);
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
            return new Any();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.items_.size(); i10++) {
                codedOutputStream.L0(1, this.items_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements AnyOrBuilder {
            private int bitField0_;
            private z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> itemsBuilder_;
            private List<FilterExpression> items_;

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
            }

            private z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new z1<>(this.items_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getItemsFieldBuilder();
                }
            }

            public Builder addAllItems(Iterable<? extends FilterExpression> iterable) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.items_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addItems(FilterExpression filterExpression) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(filterExpression);
                    onChanged();
                } else {
                    z1Var.e(filterExpression);
                }
                return this;
            }

            public FilterExpression.Builder addItemsBuilder() {
                return (FilterExpression.Builder) getItemsFieldBuilder().c(FilterExpression.getDefaultInstance());
            }

            public Builder clearItems() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public FilterExpression getItems(int i10) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? this.items_.get(i10) : (FilterExpression) z1Var.n(i10);
            }

            public FilterExpression.Builder getItemsBuilder(int i10) {
                return (FilterExpression.Builder) getItemsFieldBuilder().k(i10);
            }

            public List<FilterExpression.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public int getItemsCount() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? this.items_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public List<FilterExpression> getItemsList() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.items_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public FilterExpressionOrBuilder getItemsOrBuilder(int i10) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var == null ? this.items_.get(i10) : (FilterExpressionOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.AnyOrBuilder
            public List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList() {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Any_fieldAccessorTable.d(Any.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeItems(int i10) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setItems(int i10, FilterExpression filterExpression) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i10, filterExpression);
                    onChanged();
                } else {
                    z1Var.w(i10, filterExpression);
                }
                return this;
            }

            private Builder() {
                this.items_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Any build() {
                Any anyBuildPartial = buildPartial();
                if (anyBuildPartial.isInitialized()) {
                    return anyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) anyBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Any buildPartial() {
                Any any = new Any(this);
                int i10 = this.bitField0_;
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                        this.bitField0_ &= -2;
                    }
                    any.items_ = this.items_;
                } else {
                    any.items_ = z1Var.f();
                }
                onBuilt();
                return any;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Any mo164getDefaultInstanceForType() {
                return Any.getDefaultInstance();
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

            public FilterExpression.Builder addItemsBuilder(int i10) {
                return (FilterExpression.Builder) getItemsFieldBuilder().b(i10, FilterExpression.getDefaultInstance());
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
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    this.items_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.items_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addItems(int i10, FilterExpression filterExpression) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    filterExpression.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i10, filterExpression);
                    onChanged();
                } else {
                    z1Var.d(i10, filterExpression);
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
                if (message instanceof Any) {
                    return mergeFrom((Any) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setItems(int i10, FilterExpression.Builder builder) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Any any) {
                if (any == Any.getDefaultInstance()) {
                    return this;
                }
                if (this.itemsBuilder_ == null) {
                    if (!any.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = any.items_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(any.items_);
                        }
                        onChanged();
                    }
                } else if (!any.items_.isEmpty()) {
                    if (!this.itemsBuilder_.t()) {
                        this.itemsBuilder_.a(any.items_);
                    } else {
                        this.itemsBuilder_.h();
                        this.itemsBuilder_ = null;
                        this.items_ = any.items_;
                        this.bitField0_ &= -2;
                        this.itemsBuilder_ = j0.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) any).unknownFields);
                onChanged();
                return this;
            }

            public Builder addItems(FilterExpression.Builder builder) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addItems(int i10, FilterExpression.Builder builder) {
                z1<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> z1Var = this.itemsBuilder_;
                if (z1Var == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Any any = null;
                try {
                    try {
                        Any any2 = (Any) Any.PARSER.parsePartialFrom(nVar, yVar);
                        if (any2 != null) {
                            mergeFrom(any2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Any any3 = (Any) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            any = any3;
                            if (any != null) {
                                mergeFrom(any);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (any != null) {
                        mergeFrom(any);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Any any) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(any);
        }

        public static Any parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Any(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Any parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Any) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Any mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Any parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Any() {
            this.memoizedIsInitialized = (byte) -1;
            this.items_ = Collections.emptyList();
        }

        public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Any parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Any parseFrom(InputStream inputStream) throws IOException {
            return (Any) j0.parseWithIOException(PARSER, inputStream);
        }

        private Any(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            if (iK != 10) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.items_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.items_.add((FilterExpression) nVar.A(FilterExpression.parser(), yVar));
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
                        this.items_ = Collections.unmodifiableList(this.items_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.items_ = Collections.unmodifiableList(this.items_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Any parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Any) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Any parseFrom(n nVar) throws IOException {
            return (Any) j0.parseWithIOException(PARSER, nVar);
        }

        public static Any parseFrom(n nVar, y yVar) throws IOException {
            return (Any) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface AnyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        FilterExpression getItems(int i10);

        int getItemsCount();

        List<FilterExpression> getItemsList();

        FilterExpressionOrBuilder getItemsOrBuilder(int i10);

        List<? extends FilterExpressionOrBuilder> getItemsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Configuration extends j0 implements ConfigurationOrBuilder {
        public static final int BATCH_SIZE_FIELD_NUMBER = 3;
        public static final int FILTER_FIELD_NUMBER = 7;
        public static final int IMP_EXTENSION_FIELD_NUMBER = 6;
        public static final int INTERVAL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int SHOULD_REPORT_FIELD_NUMBER = 5;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private UInt32Value batchSize_;
        private int configExtensionCase_;
        private Object configExtension_;
        private EventFilter filter_;
        private UInt32Value interval_;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private BoolValue shouldReport_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final s1<Configuration> PARSER = new b<Configuration>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.1
            @Override // com.explorestack.protobuf.s1
            public Configuration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Configuration(nVar, yVar);
            }
        };

        public enum ConfigExtensionCase implements l0.c {
            IMP_EXTENSION(6),
            CONFIGEXTENSION_NOT_SET(0);

            private final int value;

            ConfigExtensionCase(int i10) {
                this.value = i10;
            }

            public static ConfigExtensionCase forNumber(int i10) {
                if (i10 == 0) {
                    return CONFIGEXTENSION_NOT_SET;
                }
                if (i10 != 6) {
                    return null;
                }
                return IMP_EXTENSION;
            }

            @Override // com.explorestack.protobuf.l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ConfigExtensionCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static final class ImpExtension extends j0 implements ImpExtensionOrBuilder {
            public static final int IAA_QUERY_FIELD_NUMBER = 1;
            public static final int TTL_SECONDS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private StringValue iaaQuery_;
            private byte memoizedIsInitialized;
            private UInt32Value ttlSeconds_;
            private static final ImpExtension DEFAULT_INSTANCE = new ImpExtension();
            private static final s1<ImpExtension> PARSER = new b<ImpExtension>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtension.1
                @Override // com.explorestack.protobuf.s1
                public ImpExtension parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new ImpExtension(nVar, yVar);
                }
            };

            public static ImpExtension getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ImpExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ImpExtension) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ImpExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<ImpExtension> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ImpExtension)) {
                    return super.equals(obj);
                }
                ImpExtension impExtension = (ImpExtension) obj;
                if (hasIaaQuery() != impExtension.hasIaaQuery()) {
                    return false;
                }
                if ((!hasIaaQuery() || getIaaQuery().equals(impExtension.getIaaQuery())) && hasTtlSeconds() == impExtension.hasTtlSeconds()) {
                    return (!hasTtlSeconds() || getTtlSeconds().equals(impExtension.getTtlSeconds())) && this.unknownFields.equals(impExtension.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public StringValue getIaaQuery() {
                StringValue stringValue = this.iaaQuery_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public h2 getIaaQueryOrBuilder() {
                return getIaaQuery();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<ImpExtension> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.iaaQuery_ != null ? 0 + CodedOutputStream.G(1, getIaaQuery()) : 0;
                if (this.ttlSeconds_ != null) {
                    iG += CodedOutputStream.G(2, getTtlSeconds());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public UInt32Value getTtlSeconds() {
                UInt32Value uInt32Value = this.ttlSeconds_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public r2 getTtlSecondsOrBuilder() {
                return getTtlSeconds();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public boolean hasIaaQuery() {
                return this.iaaQuery_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
            public boolean hasTtlSeconds() {
                return this.ttlSeconds_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasIaaQuery()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getIaaQuery().hashCode();
                }
                if (hasTtlSeconds()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getTtlSeconds().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable.d(ImpExtension.class, Builder.class);
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
                return new ImpExtension();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.iaaQuery_ != null) {
                    codedOutputStream.L0(1, getIaaQuery());
                }
                if (this.ttlSeconds_ != null) {
                    codedOutputStream.L0(2, getTtlSeconds());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements ImpExtensionOrBuilder {
                private e2<StringValue, StringValue.Builder, h2> iaaQueryBuilder_;
                private StringValue iaaQuery_;
                private e2<UInt32Value, UInt32Value.Builder, r2> ttlSecondsBuilder_;
                private UInt32Value ttlSeconds_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
                }

                private e2<StringValue, StringValue.Builder, h2> getIaaQueryFieldBuilder() {
                    if (this.iaaQueryBuilder_ == null) {
                        this.iaaQueryBuilder_ = new e2<>(getIaaQuery(), getParentForChildren(), isClean());
                        this.iaaQuery_ = null;
                    }
                    return this.iaaQueryBuilder_;
                }

                private e2<UInt32Value, UInt32Value.Builder, r2> getTtlSecondsFieldBuilder() {
                    if (this.ttlSecondsBuilder_ == null) {
                        this.ttlSecondsBuilder_ = new e2<>(getTtlSeconds(), getParentForChildren(), isClean());
                        this.ttlSeconds_ = null;
                    }
                    return this.ttlSecondsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = j0.alwaysUseFieldBuilders;
                }

                public Builder clearIaaQuery() {
                    if (this.iaaQueryBuilder_ == null) {
                        this.iaaQuery_ = null;
                        onChanged();
                    } else {
                        this.iaaQuery_ = null;
                        this.iaaQueryBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearTtlSeconds() {
                    if (this.ttlSecondsBuilder_ == null) {
                        this.ttlSeconds_ = null;
                        onChanged();
                    } else {
                        this.ttlSeconds_ = null;
                        this.ttlSecondsBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public StringValue getIaaQuery() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.iaaQueryBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.iaaQuery_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getIaaQueryBuilder() {
                    onChanged();
                    return (StringValue.Builder) getIaaQueryFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public h2 getIaaQueryOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.iaaQueryBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.iaaQuery_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public UInt32Value getTtlSeconds() {
                    e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.ttlSecondsBuilder_;
                    if (e2Var != null) {
                        return (UInt32Value) e2Var.e();
                    }
                    UInt32Value uInt32Value = this.ttlSeconds_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                public UInt32Value.Builder getTtlSecondsBuilder() {
                    onChanged();
                    return (UInt32Value.Builder) getTtlSecondsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public r2 getTtlSecondsOrBuilder() {
                    e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.ttlSecondsBuilder_;
                    if (e2Var != null) {
                        return (r2) e2Var.f();
                    }
                    UInt32Value uInt32Value = this.ttlSeconds_;
                    return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public boolean hasIaaQuery() {
                    return (this.iaaQueryBuilder_ == null && this.iaaQuery_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Monitor.Configuration.ImpExtensionOrBuilder
                public boolean hasTtlSeconds() {
                    return (this.ttlSecondsBuilder_ == null && this.ttlSeconds_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_ImpExtension_fieldAccessorTable.d(ImpExtension.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeIaaQuery(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.iaaQueryBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.iaaQuery_;
                        if (stringValue2 != null) {
                            this.iaaQuery_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.iaaQuery_ = stringValue;
                        }
                        onChanged();
                    } else {
                        e2Var.g(stringValue);
                    }
                    return this;
                }

                public Builder mergeTtlSeconds(UInt32Value uInt32Value) {
                    e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.ttlSecondsBuilder_;
                    if (e2Var == null) {
                        UInt32Value uInt32Value2 = this.ttlSeconds_;
                        if (uInt32Value2 != null) {
                            this.ttlSeconds_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                        } else {
                            this.ttlSeconds_ = uInt32Value;
                        }
                        onChanged();
                    } else {
                        e2Var.g(uInt32Value);
                    }
                    return this;
                }

                public Builder setIaaQuery(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.iaaQueryBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.iaaQuery_ = stringValue;
                        onChanged();
                    } else {
                        e2Var.i(stringValue);
                    }
                    return this;
                }

                public Builder setTtlSeconds(UInt32Value uInt32Value) {
                    e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.ttlSecondsBuilder_;
                    if (e2Var == null) {
                        uInt32Value.getClass();
                        this.ttlSeconds_ = uInt32Value;
                        onChanged();
                    } else {
                        e2Var.i(uInt32Value);
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
                public ImpExtension build() {
                    ImpExtension impExtensionBuildPartial = buildPartial();
                    if (impExtensionBuildPartial.isInitialized()) {
                        return impExtensionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) impExtensionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public ImpExtension buildPartial() {
                    ImpExtension impExtension = new ImpExtension(this);
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.iaaQueryBuilder_;
                    if (e2Var == null) {
                        impExtension.iaaQuery_ = this.iaaQuery_;
                    } else {
                        impExtension.iaaQuery_ = (StringValue) e2Var.a();
                    }
                    e2<UInt32Value, UInt32Value.Builder, r2> e2Var2 = this.ttlSecondsBuilder_;
                    if (e2Var2 == null) {
                        impExtension.ttlSeconds_ = this.ttlSeconds_;
                    } else {
                        impExtension.ttlSeconds_ = (UInt32Value) e2Var2.a();
                    }
                    onBuilt();
                    return impExtension;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public ImpExtension mo164getDefaultInstanceForType() {
                    return ImpExtension.getDefaultInstance();
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
                    if (this.iaaQueryBuilder_ == null) {
                        this.iaaQuery_ = null;
                    } else {
                        this.iaaQuery_ = null;
                        this.iaaQueryBuilder_ = null;
                    }
                    if (this.ttlSecondsBuilder_ == null) {
                        this.ttlSeconds_ = null;
                    } else {
                        this.ttlSeconds_ = null;
                        this.ttlSecondsBuilder_ = null;
                    }
                    return this;
                }

                public Builder setIaaQuery(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.iaaQueryBuilder_;
                    if (e2Var == null) {
                        this.iaaQuery_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder setTtlSeconds(UInt32Value.Builder builder) {
                    e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.ttlSecondsBuilder_;
                    if (e2Var == null) {
                        this.ttlSeconds_ = builder.build();
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
                    if (message instanceof ImpExtension) {
                        return mergeFrom((ImpExtension) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ImpExtension impExtension) {
                    if (impExtension == ImpExtension.getDefaultInstance()) {
                        return this;
                    }
                    if (impExtension.hasIaaQuery()) {
                        mergeIaaQuery(impExtension.getIaaQuery());
                    }
                    if (impExtension.hasTtlSeconds()) {
                        mergeTtlSeconds(impExtension.getTtlSeconds());
                    }
                    mergeUnknownFields(((j0) impExtension).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    ImpExtension impExtension = null;
                    try {
                        try {
                            ImpExtension impExtension2 = (ImpExtension) ImpExtension.PARSER.parsePartialFrom(nVar, yVar);
                            if (impExtension2 != null) {
                                mergeFrom(impExtension2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            ImpExtension impExtension3 = (ImpExtension) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                impExtension = impExtension3;
                                if (impExtension != null) {
                                    mergeFrom(impExtension);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (impExtension != null) {
                            mergeFrom(impExtension);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(ImpExtension impExtension) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(impExtension);
            }

            public static ImpExtension parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private ImpExtension(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ImpExtension parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (ImpExtension) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static ImpExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public ImpExtension mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static ImpExtension parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private ImpExtension() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ImpExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static ImpExtension parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            private ImpExtension(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    StringValue stringValue = this.iaaQuery_;
                                    StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                    this.iaaQuery_ = stringValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue2);
                                        this.iaaQuery_ = builder.buildPartial();
                                    }
                                } else if (iK != 18) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    UInt32Value uInt32Value = this.ttlSeconds_;
                                    UInt32Value.Builder builder2 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                    UInt32Value uInt32Value2 = (UInt32Value) nVar.A(UInt32Value.parser(), yVar);
                                    this.ttlSeconds_ = uInt32Value2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(uInt32Value2);
                                        this.ttlSeconds_ = builder2.buildPartial();
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

            public static ImpExtension parseFrom(InputStream inputStream) throws IOException {
                return (ImpExtension) j0.parseWithIOException(PARSER, inputStream);
            }

            public static ImpExtension parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (ImpExtension) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static ImpExtension parseFrom(n nVar) throws IOException {
                return (ImpExtension) j0.parseWithIOException(PARSER, nVar);
            }

            public static ImpExtension parseFrom(n nVar, y yVar) throws IOException {
                return (ImpExtension) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface ImpExtensionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            StringValue getIaaQuery();

            h2 getIaaQueryOrBuilder();

            UInt32Value getTtlSeconds();

            r2 getTtlSecondsOrBuilder();

            boolean hasIaaQuery();

            boolean hasTtlSeconds();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Configuration> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return super.equals(obj);
            }
            Configuration configuration = (Configuration) obj;
            if (hasName() != configuration.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(configuration.getName())) || hasUrl() != configuration.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasBatchSize() != configuration.hasBatchSize()) {
                return false;
            }
            if ((hasBatchSize() && !getBatchSize().equals(configuration.getBatchSize())) || hasInterval() != configuration.hasInterval()) {
                return false;
            }
            if ((hasInterval() && !getInterval().equals(configuration.getInterval())) || hasShouldReport() != configuration.hasShouldReport()) {
                return false;
            }
            if ((hasShouldReport() && !getShouldReport().equals(configuration.getShouldReport())) || hasFilter() != configuration.hasFilter()) {
                return false;
            }
            if ((!hasFilter() || getFilter().equals(configuration.getFilter())) && getConfigExtensionCase().equals(configuration.getConfigExtensionCase())) {
                return (this.configExtensionCase_ != 6 || getImpExtension().equals(configuration.getImpExtension())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getBatchSize() {
            UInt32Value uInt32Value = this.batchSize_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public r2 getBatchSizeOrBuilder() {
            return getBatchSize();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ConfigExtensionCase getConfigExtensionCase() {
            return ConfigExtensionCase.forNumber(this.configExtensionCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public EventFilter getFilter() {
            EventFilter eventFilter = this.filter_;
            return eventFilter == null ? EventFilter.getDefaultInstance() : eventFilter;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public EventFilterOrBuilder getFilterOrBuilder() {
            return getFilter();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ImpExtension getImpExtension() {
            return this.configExtensionCase_ == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public ImpExtensionOrBuilder getImpExtensionOrBuilder() {
            return this.configExtensionCase_ == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public UInt32Value getInterval() {
            UInt32Value uInt32Value = this.interval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public r2 getIntervalOrBuilder() {
            return getInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public h2 getNameOrBuilder() {
            return getName();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.name_ != null ? 0 + CodedOutputStream.G(1, getName()) : 0;
            if (this.url_ != null) {
                iG += CodedOutputStream.G(2, getUrl());
            }
            if (this.batchSize_ != null) {
                iG += CodedOutputStream.G(3, getBatchSize());
            }
            if (this.interval_ != null) {
                iG += CodedOutputStream.G(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                iG += CodedOutputStream.G(5, getShouldReport());
            }
            if (this.configExtensionCase_ == 6) {
                iG += CodedOutputStream.G(6, (ImpExtension) this.configExtension_);
            }
            if (this.filter_ != null) {
                iG += CodedOutputStream.G(7, getFilter());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public BoolValue getShouldReport() {
            BoolValue boolValue = this.shouldReport_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public i getShouldReportOrBuilder() {
            return getShouldReport();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public h2 getUrlOrBuilder() {
            return getUrl();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasBatchSize() {
            return this.batchSize_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasFilter() {
            return this.filter_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasImpExtension() {
            return this.configExtensionCase_ == 6;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasInterval() {
            return this.interval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasShouldReport() {
            return this.shouldReport_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
        public boolean hasUrl() {
            return this.url_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasUrl()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUrl().hashCode();
            }
            if (hasBatchSize()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getBatchSize().hashCode();
            }
            if (hasInterval()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getInterval().hashCode();
            }
            if (hasShouldReport()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getShouldReport().hashCode();
            }
            if (hasFilter()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getFilter().hashCode();
            }
            if (this.configExtensionCase_ == 6) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getImpExtension().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
            return new Configuration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.name_ != null) {
                codedOutputStream.L0(1, getName());
            }
            if (this.url_ != null) {
                codedOutputStream.L0(2, getUrl());
            }
            if (this.batchSize_ != null) {
                codedOutputStream.L0(3, getBatchSize());
            }
            if (this.interval_ != null) {
                codedOutputStream.L0(4, getInterval());
            }
            if (this.shouldReport_ != null) {
                codedOutputStream.L0(5, getShouldReport());
            }
            if (this.configExtensionCase_ == 6) {
                codedOutputStream.L0(6, (ImpExtension) this.configExtension_);
            }
            if (this.filter_ != null) {
                codedOutputStream.L0(7, getFilter());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ConfigurationOrBuilder {
            private e2<UInt32Value, UInt32Value.Builder, r2> batchSizeBuilder_;
            private UInt32Value batchSize_;
            private int configExtensionCase_;
            private Object configExtension_;
            private e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> filterBuilder_;
            private EventFilter filter_;
            private e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> impExtensionBuilder_;
            private e2<UInt32Value, UInt32Value.Builder, r2> intervalBuilder_;
            private UInt32Value interval_;
            private e2<StringValue, StringValue.Builder, h2> nameBuilder_;
            private StringValue name_;
            private e2<BoolValue, BoolValue.Builder, i> shouldReportBuilder_;
            private BoolValue shouldReport_;
            private e2<StringValue, StringValue.Builder, h2> urlBuilder_;
            private StringValue url_;

            private e2<UInt32Value, UInt32Value.Builder, r2> getBatchSizeFieldBuilder() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSizeBuilder_ = new e2<>(getBatchSize(), getParentForChildren(), isClean());
                    this.batchSize_ = null;
                }
                return this.batchSizeBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            private e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> getFilterFieldBuilder() {
                if (this.filterBuilder_ == null) {
                    this.filterBuilder_ = new e2<>(getFilter(), getParentForChildren(), isClean());
                    this.filter_ = null;
                }
                return this.filterBuilder_;
            }

            private e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> getImpExtensionFieldBuilder() {
                if (this.impExtensionBuilder_ == null) {
                    if (this.configExtensionCase_ != 6) {
                        this.configExtension_ = ImpExtension.getDefaultInstance();
                    }
                    this.impExtensionBuilder_ = new e2<>((ImpExtension) this.configExtension_, getParentForChildren(), isClean());
                    this.configExtension_ = null;
                }
                this.configExtensionCase_ = 6;
                onChanged();
                return this.impExtensionBuilder_;
            }

            private e2<UInt32Value, UInt32Value.Builder, r2> getIntervalFieldBuilder() {
                if (this.intervalBuilder_ == null) {
                    this.intervalBuilder_ = new e2<>(getInterval(), getParentForChildren(), isClean());
                    this.interval_ = null;
                }
                return this.intervalBuilder_;
            }

            private e2<StringValue, StringValue.Builder, h2> getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new e2<>(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private e2<BoolValue, BoolValue.Builder, i> getShouldReportFieldBuilder() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReportBuilder_ = new e2<>(getShouldReport(), getParentForChildren(), isClean());
                    this.shouldReport_ = null;
                }
                return this.shouldReportBuilder_;
            }

            private e2<StringValue, StringValue.Builder, h2> getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new e2<>(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearBatchSize() {
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                    onChanged();
                } else {
                    this.batchSize_ = null;
                    this.batchSizeBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfigExtension() {
                this.configExtensionCase_ = 0;
                this.configExtension_ = null;
                onChanged();
                return this;
            }

            public Builder clearFilter() {
                if (this.filterBuilder_ == null) {
                    this.filter_ = null;
                    onChanged();
                } else {
                    this.filter_ = null;
                    this.filterBuilder_ = null;
                }
                return this;
            }

            public Builder clearImpExtension() {
                e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var = this.impExtensionBuilder_;
                if (e2Var != null) {
                    if (this.configExtensionCase_ == 6) {
                        this.configExtensionCase_ = 0;
                        this.configExtension_ = null;
                    }
                    e2Var.b();
                } else if (this.configExtensionCase_ == 6) {
                    this.configExtensionCase_ = 0;
                    this.configExtension_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearInterval() {
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                    onChanged();
                } else {
                    this.interval_ = null;
                    this.intervalBuilder_ = null;
                }
                return this;
            }

            public Builder clearName() {
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                    onChanged();
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }
                return this;
            }

            public Builder clearShouldReport() {
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                    onChanged();
                } else {
                    this.shouldReport_ = null;
                    this.shouldReportBuilder_ = null;
                }
                return this;
            }

            public Builder clearUrl() {
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                    onChanged();
                } else {
                    this.url_ = null;
                    this.urlBuilder_ = null;
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getBatchSize() {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.batchSizeBuilder_;
                if (e2Var != null) {
                    return (UInt32Value) e2Var.e();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getBatchSizeBuilder() {
                onChanged();
                return (UInt32Value.Builder) getBatchSizeFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public r2 getBatchSizeOrBuilder() {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.batchSizeBuilder_;
                if (e2Var != null) {
                    return (r2) e2Var.f();
                }
                UInt32Value uInt32Value = this.batchSize_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ConfigExtensionCase getConfigExtensionCase() {
                return ConfigExtensionCase.forNumber(this.configExtensionCase_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public EventFilter getFilter() {
                e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> e2Var = this.filterBuilder_;
                if (e2Var != null) {
                    return (EventFilter) e2Var.e();
                }
                EventFilter eventFilter = this.filter_;
                return eventFilter == null ? EventFilter.getDefaultInstance() : eventFilter;
            }

            public EventFilter.Builder getFilterBuilder() {
                onChanged();
                return (EventFilter.Builder) getFilterFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public EventFilterOrBuilder getFilterOrBuilder() {
                e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> e2Var = this.filterBuilder_;
                if (e2Var != null) {
                    return (EventFilterOrBuilder) e2Var.f();
                }
                EventFilter eventFilter = this.filter_;
                return eventFilter == null ? EventFilter.getDefaultInstance() : eventFilter;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ImpExtension getImpExtension() {
                e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var = this.impExtensionBuilder_;
                if (e2Var == null) {
                    return this.configExtensionCase_ == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
                }
                return this.configExtensionCase_ == 6 ? (ImpExtension) e2Var.e() : ImpExtension.getDefaultInstance();
            }

            public ImpExtension.Builder getImpExtensionBuilder() {
                return (ImpExtension.Builder) getImpExtensionFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public ImpExtensionOrBuilder getImpExtensionOrBuilder() {
                e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var;
                int i10 = this.configExtensionCase_;
                if (i10 != 6 || (e2Var = this.impExtensionBuilder_) == null) {
                    return i10 == 6 ? (ImpExtension) this.configExtension_ : ImpExtension.getDefaultInstance();
                }
                return (ImpExtensionOrBuilder) e2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public UInt32Value getInterval() {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.intervalBuilder_;
                if (e2Var != null) {
                    return (UInt32Value) e2Var.e();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getIntervalFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public r2 getIntervalOrBuilder() {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.intervalBuilder_;
                if (e2Var != null) {
                    return (r2) e2Var.f();
                }
                UInt32Value uInt32Value = this.interval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getName() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var != null) {
                    return (StringValue) e2Var.e();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getNameBuilder() {
                onChanged();
                return (StringValue.Builder) getNameFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public h2 getNameOrBuilder() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var != null) {
                    return (h2) e2Var.f();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public BoolValue getShouldReport() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.shouldReportBuilder_;
                if (e2Var != null) {
                    return (BoolValue) e2Var.e();
                }
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getShouldReportBuilder() {
                onChanged();
                return (BoolValue.Builder) getShouldReportFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public i getShouldReportOrBuilder() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.shouldReportBuilder_;
                if (e2Var != null) {
                    return (i) e2Var.f();
                }
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public StringValue getUrl() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.urlBuilder_;
                if (e2Var != null) {
                    return (StringValue) e2Var.e();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getUrlBuilder() {
                onChanged();
                return (StringValue.Builder) getUrlFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public h2 getUrlOrBuilder() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.urlBuilder_;
                if (e2Var != null) {
                    return (h2) e2Var.f();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasBatchSize() {
                return (this.batchSizeBuilder_ == null && this.batchSize_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasFilter() {
                return (this.filterBuilder_ == null && this.filter_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasImpExtension() {
                return this.configExtensionCase_ == 6;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasInterval() {
                return (this.intervalBuilder_ == null && this.interval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasShouldReport() {
                return (this.shouldReportBuilder_ == null && this.shouldReport_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBatchSize(UInt32Value uInt32Value) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.batchSizeBuilder_;
                if (e2Var == null) {
                    UInt32Value uInt32Value2 = this.batchSize_;
                    if (uInt32Value2 != null) {
                        this.batchSize_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.batchSize_ = uInt32Value;
                    }
                    onChanged();
                } else {
                    e2Var.g(uInt32Value);
                }
                return this;
            }

            public Builder mergeFilter(EventFilter eventFilter) {
                e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> e2Var = this.filterBuilder_;
                if (e2Var == null) {
                    EventFilter eventFilter2 = this.filter_;
                    if (eventFilter2 != null) {
                        this.filter_ = EventFilter.newBuilder(eventFilter2).mergeFrom(eventFilter).buildPartial();
                    } else {
                        this.filter_ = eventFilter;
                    }
                    onChanged();
                } else {
                    e2Var.g(eventFilter);
                }
                return this;
            }

            public Builder mergeImpExtension(ImpExtension impExtension) {
                e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var = this.impExtensionBuilder_;
                if (e2Var == null) {
                    if (this.configExtensionCase_ != 6 || this.configExtension_ == ImpExtension.getDefaultInstance()) {
                        this.configExtension_ = impExtension;
                    } else {
                        this.configExtension_ = ImpExtension.newBuilder((ImpExtension) this.configExtension_).mergeFrom(impExtension).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.configExtensionCase_ == 6) {
                        e2Var.g(impExtension);
                    }
                    this.impExtensionBuilder_.i(impExtension);
                }
                this.configExtensionCase_ = 6;
                return this;
            }

            public Builder mergeInterval(UInt32Value uInt32Value) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.intervalBuilder_;
                if (e2Var == null) {
                    UInt32Value uInt32Value2 = this.interval_;
                    if (uInt32Value2 != null) {
                        this.interval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.interval_ = uInt32Value;
                    }
                    onChanged();
                } else {
                    e2Var.g(uInt32Value);
                }
                return this;
            }

            public Builder mergeName(StringValue stringValue) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var == null) {
                    StringValue stringValue2 = this.name_;
                    if (stringValue2 != null) {
                        this.name_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.name_ = stringValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(stringValue);
                }
                return this;
            }

            public Builder mergeShouldReport(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.shouldReportBuilder_;
                if (e2Var == null) {
                    BoolValue boolValue2 = this.shouldReport_;
                    if (boolValue2 != null) {
                        this.shouldReport_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.shouldReport_ = boolValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(boolValue);
                }
                return this;
            }

            public Builder mergeUrl(StringValue stringValue) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.urlBuilder_;
                if (e2Var == null) {
                    StringValue stringValue2 = this.url_;
                    if (stringValue2 != null) {
                        this.url_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.url_ = stringValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(stringValue);
                }
                return this;
            }

            public Builder setBatchSize(UInt32Value uInt32Value) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.batchSizeBuilder_;
                if (e2Var == null) {
                    uInt32Value.getClass();
                    this.batchSize_ = uInt32Value;
                    onChanged();
                } else {
                    e2Var.i(uInt32Value);
                }
                return this;
            }

            public Builder setFilter(EventFilter eventFilter) {
                e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> e2Var = this.filterBuilder_;
                if (e2Var == null) {
                    eventFilter.getClass();
                    this.filter_ = eventFilter;
                    onChanged();
                } else {
                    e2Var.i(eventFilter);
                }
                return this;
            }

            public Builder setImpExtension(ImpExtension impExtension) {
                e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var = this.impExtensionBuilder_;
                if (e2Var == null) {
                    impExtension.getClass();
                    this.configExtension_ = impExtension;
                    onChanged();
                } else {
                    e2Var.i(impExtension);
                }
                this.configExtensionCase_ = 6;
                return this;
            }

            public Builder setInterval(UInt32Value uInt32Value) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.intervalBuilder_;
                if (e2Var == null) {
                    uInt32Value.getClass();
                    this.interval_ = uInt32Value;
                    onChanged();
                } else {
                    e2Var.i(uInt32Value);
                }
                return this;
            }

            public Builder setName(StringValue stringValue) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var == null) {
                    stringValue.getClass();
                    this.name_ = stringValue;
                    onChanged();
                } else {
                    e2Var.i(stringValue);
                }
                return this;
            }

            public Builder setShouldReport(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.shouldReportBuilder_;
                if (e2Var == null) {
                    boolValue.getClass();
                    this.shouldReport_ = boolValue;
                    onChanged();
                } else {
                    e2Var.i(boolValue);
                }
                return this;
            }

            public Builder setUrl(StringValue stringValue) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.urlBuilder_;
                if (e2Var == null) {
                    stringValue.getClass();
                    this.url_ = stringValue;
                    onChanged();
                } else {
                    e2Var.i(stringValue);
                }
                return this;
            }

            private Builder() {
                this.configExtensionCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration build() {
                Configuration configurationBuildPartial = buildPartial();
                if (configurationBuildPartial.isInitialized()) {
                    return configurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Configuration buildPartial() {
                Configuration configuration = new Configuration(this);
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var == null) {
                    configuration.name_ = this.name_;
                } else {
                    configuration.name_ = (StringValue) e2Var.a();
                }
                e2<StringValue, StringValue.Builder, h2> e2Var2 = this.urlBuilder_;
                if (e2Var2 == null) {
                    configuration.url_ = this.url_;
                } else {
                    configuration.url_ = (StringValue) e2Var2.a();
                }
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var3 = this.batchSizeBuilder_;
                if (e2Var3 == null) {
                    configuration.batchSize_ = this.batchSize_;
                } else {
                    configuration.batchSize_ = (UInt32Value) e2Var3.a();
                }
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var4 = this.intervalBuilder_;
                if (e2Var4 == null) {
                    configuration.interval_ = this.interval_;
                } else {
                    configuration.interval_ = (UInt32Value) e2Var4.a();
                }
                e2<BoolValue, BoolValue.Builder, i> e2Var5 = this.shouldReportBuilder_;
                if (e2Var5 == null) {
                    configuration.shouldReport_ = this.shouldReport_;
                } else {
                    configuration.shouldReport_ = (BoolValue) e2Var5.a();
                }
                if (this.configExtensionCase_ == 6) {
                    e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var6 = this.impExtensionBuilder_;
                    if (e2Var6 == null) {
                        configuration.configExtension_ = this.configExtension_;
                    } else {
                        configuration.configExtension_ = e2Var6.a();
                    }
                }
                e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> e2Var7 = this.filterBuilder_;
                if (e2Var7 == null) {
                    configuration.filter_ = this.filter_;
                } else {
                    configuration.filter_ = (EventFilter) e2Var7.a();
                }
                configuration.configExtensionCase_ = this.configExtensionCase_;
                onBuilt();
                return configuration;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Configuration mo164getDefaultInstanceForType() {
                return Configuration.getDefaultInstance();
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
                if (this.nameBuilder_ == null) {
                    this.name_ = null;
                } else {
                    this.name_ = null;
                    this.nameBuilder_ = null;
                }
                if (this.urlBuilder_ == null) {
                    this.url_ = null;
                } else {
                    this.url_ = null;
                    this.urlBuilder_ = null;
                }
                if (this.batchSizeBuilder_ == null) {
                    this.batchSize_ = null;
                } else {
                    this.batchSize_ = null;
                    this.batchSizeBuilder_ = null;
                }
                if (this.intervalBuilder_ == null) {
                    this.interval_ = null;
                } else {
                    this.interval_ = null;
                    this.intervalBuilder_ = null;
                }
                if (this.shouldReportBuilder_ == null) {
                    this.shouldReport_ = null;
                } else {
                    this.shouldReport_ = null;
                    this.shouldReportBuilder_ = null;
                }
                if (this.filterBuilder_ == null) {
                    this.filter_ = null;
                } else {
                    this.filter_ = null;
                    this.filterBuilder_ = null;
                }
                this.configExtensionCase_ = 0;
                this.configExtension_ = null;
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.configExtensionCase_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBatchSize(UInt32Value.Builder builder) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.batchSizeBuilder_;
                if (e2Var == null) {
                    this.batchSize_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setFilter(EventFilter.Builder builder) {
                e2<EventFilter, EventFilter.Builder, EventFilterOrBuilder> e2Var = this.filterBuilder_;
                if (e2Var == null) {
                    this.filter_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setInterval(UInt32Value.Builder builder) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.intervalBuilder_;
                if (e2Var == null) {
                    this.interval_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setName(StringValue.Builder builder) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var == null) {
                    this.name_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setShouldReport(BoolValue.Builder builder) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.shouldReportBuilder_;
                if (e2Var == null) {
                    this.shouldReport_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setUrl(StringValue.Builder builder) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.urlBuilder_;
                if (e2Var == null) {
                    this.url_ = builder.build();
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
                if (message instanceof Configuration) {
                    return mergeFrom((Configuration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setImpExtension(ImpExtension.Builder builder) {
                e2<ImpExtension, ImpExtension.Builder, ImpExtensionOrBuilder> e2Var = this.impExtensionBuilder_;
                if (e2Var == null) {
                    this.configExtension_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.configExtensionCase_ = 6;
                return this;
            }

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasName()) {
                    mergeName(configuration.getName());
                }
                if (configuration.hasUrl()) {
                    mergeUrl(configuration.getUrl());
                }
                if (configuration.hasBatchSize()) {
                    mergeBatchSize(configuration.getBatchSize());
                }
                if (configuration.hasInterval()) {
                    mergeInterval(configuration.getInterval());
                }
                if (configuration.hasShouldReport()) {
                    mergeShouldReport(configuration.getShouldReport());
                }
                if (configuration.hasFilter()) {
                    mergeFilter(configuration.getFilter());
                }
                if (AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Configuration$ConfigExtensionCase[configuration.getConfigExtensionCase().ordinal()] == 1) {
                    mergeImpExtension(configuration.getImpExtension());
                }
                mergeUnknownFields(((j0) configuration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Configuration configuration = null;
                try {
                    try {
                        Configuration configuration2 = (Configuration) Configuration.PARSER.parsePartialFrom(nVar, yVar);
                        if (configuration2 != null) {
                            mergeFrom(configuration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Configuration configuration3 = (Configuration) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            configuration = configuration3;
                            if (configuration != null) {
                                mergeFrom(configuration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (configuration != null) {
                        mergeFrom(configuration);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Configuration(j0.b<?> bVar) {
            super(bVar);
            this.configExtensionCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Configuration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Configuration mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Configuration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        private Configuration() {
            this.configExtensionCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Configuration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) j0.parseWithIOException(PARSER, inputStream);
        }

        private Configuration(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                StringValue stringValue = this.name_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                this.name_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.name_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                StringValue stringValue3 = this.url_;
                                StringValue.Builder builder2 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                StringValue stringValue4 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                this.url_ = stringValue4;
                                if (builder2 != null) {
                                    builder2.mergeFrom(stringValue4);
                                    this.url_ = builder2.buildPartial();
                                }
                            } else if (iK == 26) {
                                UInt32Value uInt32Value = this.batchSize_;
                                UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                UInt32Value uInt32Value2 = (UInt32Value) nVar.A(UInt32Value.parser(), yVar);
                                this.batchSize_ = uInt32Value2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(uInt32Value2);
                                    this.batchSize_ = builder3.buildPartial();
                                }
                            } else if (iK == 34) {
                                UInt32Value uInt32Value3 = this.interval_;
                                UInt32Value.Builder builder4 = uInt32Value3 != null ? uInt32Value3.toBuilder() : null;
                                UInt32Value uInt32Value4 = (UInt32Value) nVar.A(UInt32Value.parser(), yVar);
                                this.interval_ = uInt32Value4;
                                if (builder4 != null) {
                                    builder4.mergeFrom(uInt32Value4);
                                    this.interval_ = builder4.buildPartial();
                                }
                            } else if (iK == 42) {
                                BoolValue boolValue = this.shouldReport_;
                                BoolValue.Builder builder5 = boolValue != null ? boolValue.toBuilder() : null;
                                BoolValue boolValue2 = (BoolValue) nVar.A(BoolValue.parser(), yVar);
                                this.shouldReport_ = boolValue2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(boolValue2);
                                    this.shouldReport_ = builder5.buildPartial();
                                }
                            } else if (iK == 50) {
                                ImpExtension.Builder builder6 = this.configExtensionCase_ == 6 ? ((ImpExtension) this.configExtension_).toBuilder() : null;
                                MessageLite messageLiteA = nVar.A(ImpExtension.parser(), yVar);
                                this.configExtension_ = messageLiteA;
                                if (builder6 != null) {
                                    builder6.mergeFrom((ImpExtension) messageLiteA);
                                    this.configExtension_ = builder6.buildPartial();
                                }
                                this.configExtensionCase_ = 6;
                            } else if (iK != 58) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                EventFilter eventFilter = this.filter_;
                                EventFilter.Builder builder7 = eventFilter != null ? eventFilter.toBuilder() : null;
                                EventFilter eventFilter2 = (EventFilter) nVar.A(EventFilter.parser(), yVar);
                                this.filter_ = eventFilter2;
                                if (builder7 != null) {
                                    builder7.mergeFrom(eventFilter2);
                                    this.filter_ = builder7.buildPartial();
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

        public static Configuration parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Configuration) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Configuration parseFrom(n nVar) throws IOException {
            return (Configuration) j0.parseWithIOException(PARSER, nVar);
        }

        public static Configuration parseFrom(n nVar, y yVar) throws IOException {
            return (Configuration) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface ConfigurationOrBuilder extends MessageOrBuilder {
        UInt32Value getBatchSize();

        r2 getBatchSizeOrBuilder();

        Configuration.ConfigExtensionCase getConfigExtensionCase();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        EventFilter getFilter();

        EventFilterOrBuilder getFilterOrBuilder();

        Configuration.ImpExtension getImpExtension();

        Configuration.ImpExtensionOrBuilder getImpExtensionOrBuilder();

        UInt32Value getInterval();

        r2 getIntervalOrBuilder();

        StringValue getName();

        h2 getNameOrBuilder();

        BoolValue getShouldReport();

        i getShouldReportOrBuilder();

        StringValue getUrl();

        h2 getUrlOrBuilder();

        boolean hasBatchSize();

        boolean hasFilter();

        boolean hasImpExtension();

        boolean hasInterval();

        boolean hasName();

        boolean hasShouldReport();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class EventFilter extends j0 implements EventFilterOrBuilder {
        public static final int EXPR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private FilterExpression expr_;
        private byte memoizedIsInitialized;
        private static final EventFilter DEFAULT_INSTANCE = new EventFilter();
        private static final s1<EventFilter> PARSER = new b<EventFilter>() { // from class: io.bidmachine.protobuf.sdk.Monitor.EventFilter.1
            @Override // com.explorestack.protobuf.s1
            public EventFilter parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new EventFilter(nVar, yVar);
            }
        };

        public static EventFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventFilter) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<EventFilter> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventFilter)) {
                return super.equals(obj);
            }
            EventFilter eventFilter = (EventFilter) obj;
            if (hasExpr() != eventFilter.hasExpr()) {
                return false;
            }
            return (!hasExpr() || getExpr().equals(eventFilter.getExpr())) && this.unknownFields.equals(eventFilter.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
        public FilterExpression getExpr() {
            FilterExpression filterExpression = this.expr_;
            return filterExpression == null ? FilterExpression.getDefaultInstance() : filterExpression;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
        public FilterExpressionOrBuilder getExprOrBuilder() {
            return getExpr();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<EventFilter> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = (this.expr_ != null ? 0 + CodedOutputStream.G(1, getExpr()) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iG;
            return iG;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
        public boolean hasExpr() {
            return this.expr_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasExpr()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getExpr().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable.d(EventFilter.class, Builder.class);
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
            return new EventFilter();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.expr_ != null) {
                codedOutputStream.L0(1, getExpr());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements EventFilterOrBuilder {
            private e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> exprBuilder_;
            private FilterExpression expr_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
            }

            private e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> getExprFieldBuilder() {
                if (this.exprBuilder_ == null) {
                    this.exprBuilder_ = new e2<>(getExpr(), getParentForChildren(), isClean());
                    this.expr_ = null;
                }
                return this.exprBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearExpr() {
                if (this.exprBuilder_ == null) {
                    this.expr_ = null;
                    onChanged();
                } else {
                    this.expr_ = null;
                    this.exprBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
            public FilterExpression getExpr() {
                e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> e2Var = this.exprBuilder_;
                if (e2Var != null) {
                    return (FilterExpression) e2Var.e();
                }
                FilterExpression filterExpression = this.expr_;
                return filterExpression == null ? FilterExpression.getDefaultInstance() : filterExpression;
            }

            public FilterExpression.Builder getExprBuilder() {
                onChanged();
                return (FilterExpression.Builder) getExprFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
            public FilterExpressionOrBuilder getExprOrBuilder() {
                e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> e2Var = this.exprBuilder_;
                if (e2Var != null) {
                    return (FilterExpressionOrBuilder) e2Var.f();
                }
                FilterExpression filterExpression = this.expr_;
                return filterExpression == null ? FilterExpression.getDefaultInstance() : filterExpression;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.EventFilterOrBuilder
            public boolean hasExpr() {
                return (this.exprBuilder_ == null && this.expr_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_EventFilter_fieldAccessorTable.d(EventFilter.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExpr(FilterExpression filterExpression) {
                e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> e2Var = this.exprBuilder_;
                if (e2Var == null) {
                    FilterExpression filterExpression2 = this.expr_;
                    if (filterExpression2 != null) {
                        this.expr_ = FilterExpression.newBuilder(filterExpression2).mergeFrom(filterExpression).buildPartial();
                    } else {
                        this.expr_ = filterExpression;
                    }
                    onChanged();
                } else {
                    e2Var.g(filterExpression);
                }
                return this;
            }

            public Builder setExpr(FilterExpression filterExpression) {
                e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> e2Var = this.exprBuilder_;
                if (e2Var == null) {
                    filterExpression.getClass();
                    this.expr_ = filterExpression;
                    onChanged();
                } else {
                    e2Var.i(filterExpression);
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
            public EventFilter build() {
                EventFilter eventFilterBuildPartial = buildPartial();
                if (eventFilterBuildPartial.isInitialized()) {
                    return eventFilterBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventFilterBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventFilter buildPartial() {
                EventFilter eventFilter = new EventFilter(this);
                e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> e2Var = this.exprBuilder_;
                if (e2Var == null) {
                    eventFilter.expr_ = this.expr_;
                } else {
                    eventFilter.expr_ = (FilterExpression) e2Var.a();
                }
                onBuilt();
                return eventFilter;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public EventFilter mo164getDefaultInstanceForType() {
                return EventFilter.getDefaultInstance();
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
                if (this.exprBuilder_ == null) {
                    this.expr_ = null;
                } else {
                    this.expr_ = null;
                    this.exprBuilder_ = null;
                }
                return this;
            }

            public Builder setExpr(FilterExpression.Builder builder) {
                e2<FilterExpression, FilterExpression.Builder, FilterExpressionOrBuilder> e2Var = this.exprBuilder_;
                if (e2Var == null) {
                    this.expr_ = builder.build();
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
                if (message instanceof EventFilter) {
                    return mergeFrom((EventFilter) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EventFilter eventFilter) {
                if (eventFilter == EventFilter.getDefaultInstance()) {
                    return this;
                }
                if (eventFilter.hasExpr()) {
                    mergeExpr(eventFilter.getExpr());
                }
                mergeUnknownFields(((j0) eventFilter).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                EventFilter eventFilter = null;
                try {
                    try {
                        EventFilter eventFilter2 = (EventFilter) EventFilter.PARSER.parsePartialFrom(nVar, yVar);
                        if (eventFilter2 != null) {
                            mergeFrom(eventFilter2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        EventFilter eventFilter3 = (EventFilter) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            eventFilter = eventFilter3;
                            if (eventFilter != null) {
                                mergeFrom(eventFilter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (eventFilter != null) {
                        mergeFrom(eventFilter);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(EventFilter eventFilter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventFilter);
        }

        public static EventFilter parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private EventFilter(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventFilter parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (EventFilter) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static EventFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public EventFilter mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EventFilter parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EventFilter() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static EventFilter parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private EventFilter(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    FilterExpression filterExpression = this.expr_;
                                    FilterExpression.Builder builder = filterExpression != null ? filterExpression.toBuilder() : null;
                                    FilterExpression filterExpression2 = (FilterExpression) nVar.A(FilterExpression.parser(), yVar);
                                    this.expr_ = filterExpression2;
                                    if (builder != null) {
                                        builder.mergeFrom(filterExpression2);
                                        this.expr_ = builder.buildPartial();
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

        public static EventFilter parseFrom(InputStream inputStream) throws IOException {
            return (EventFilter) j0.parseWithIOException(PARSER, inputStream);
        }

        public static EventFilter parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (EventFilter) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static EventFilter parseFrom(n nVar) throws IOException {
            return (EventFilter) j0.parseWithIOException(PARSER, nVar);
        }

        public static EventFilter parseFrom(n nVar, y yVar) throws IOException {
            return (EventFilter) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface EventFilterOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        FilterExpression getExpr();

        FilterExpressionOrBuilder getExprOrBuilder();

        boolean hasExpr();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class FilterExpression extends j0 implements FilterExpressionOrBuilder {
        public static final int ALL_FIELD_NUMBER = 1;
        public static final int ANY_FIELD_NUMBER = 2;
        private static final FilterExpression DEFAULT_INSTANCE = new FilterExpression();
        private static final s1<FilterExpression> PARSER = new b<FilterExpression>() { // from class: io.bidmachine.protobuf.sdk.Monitor.FilterExpression.1
            @Override // com.explorestack.protobuf.s1
            public FilterExpression parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new FilterExpression(nVar, yVar);
            }
        };
        public static final int RULE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int nodeCase_;
        private Object node_;

        public enum NodeCase implements l0.c {
            ALL(1),
            ANY(2),
            RULE(3),
            NODE_NOT_SET(0);

            private final int value;

            NodeCase(int i10) {
                this.value = i10;
            }

            public static NodeCase forNumber(int i10) {
                if (i10 == 0) {
                    return NODE_NOT_SET;
                }
                if (i10 == 1) {
                    return ALL;
                }
                if (i10 == 2) {
                    return ANY;
                }
                if (i10 != 3) {
                    return null;
                }
                return RULE;
            }

            @Override // com.explorestack.protobuf.l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static NodeCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static FilterExpression getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FilterExpression parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FilterExpression) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FilterExpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<FilterExpression> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FilterExpression)) {
                return super.equals(obj);
            }
            FilterExpression filterExpression = (FilterExpression) obj;
            if (!getNodeCase().equals(filterExpression.getNodeCase())) {
                return false;
            }
            int i10 = this.nodeCase_;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && !getRule().equals(filterExpression.getRule())) {
                        return false;
                    }
                } else if (!getAny().equals(filterExpression.getAny())) {
                    return false;
                }
            } else if (!getAll().equals(filterExpression.getAll())) {
                return false;
            }
            return this.unknownFields.equals(filterExpression.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public All getAll() {
            return this.nodeCase_ == 1 ? (All) this.node_ : All.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public AllOrBuilder getAllOrBuilder() {
            return this.nodeCase_ == 1 ? (All) this.node_ : All.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public Any getAny() {
            return this.nodeCase_ == 2 ? (Any) this.node_ : Any.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public AnyOrBuilder getAnyOrBuilder() {
            return this.nodeCase_ == 2 ? (Any) this.node_ : Any.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public NodeCase getNodeCase() {
            return NodeCase.forNumber(this.nodeCase_);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<FilterExpression> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public Rule getRule() {
            return this.nodeCase_ == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public RuleOrBuilder getRuleOrBuilder() {
            return this.nodeCase_ == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.nodeCase_ == 1 ? 0 + CodedOutputStream.G(1, (All) this.node_) : 0;
            if (this.nodeCase_ == 2) {
                iG += CodedOutputStream.G(2, (Any) this.node_);
            }
            if (this.nodeCase_ == 3) {
                iG += CodedOutputStream.G(3, (Rule) this.node_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public boolean hasAll() {
            return this.nodeCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public boolean hasAny() {
            return this.nodeCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
        public boolean hasRule() {
            return this.nodeCase_ == 3;
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
            int i12 = this.nodeCase_;
            if (i12 == 1) {
                i10 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getAll().hashCode();
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i10 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getRule().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getAny().hashCode();
            }
            iHashCode2 = i10 + iHashCode;
            int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable.d(FilterExpression.class, Builder.class);
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
            return new FilterExpression();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.nodeCase_ == 1) {
                codedOutputStream.L0(1, (All) this.node_);
            }
            if (this.nodeCase_ == 2) {
                codedOutputStream.L0(2, (Any) this.node_);
            }
            if (this.nodeCase_ == 3) {
                codedOutputStream.L0(3, (Rule) this.node_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements FilterExpressionOrBuilder {
            private e2<All, All.Builder, AllOrBuilder> allBuilder_;
            private e2<Any, Any.Builder, AnyOrBuilder> anyBuilder_;
            private int nodeCase_;
            private Object node_;
            private e2<Rule, Rule.Builder, RuleOrBuilder> ruleBuilder_;

            private e2<All, All.Builder, AllOrBuilder> getAllFieldBuilder() {
                if (this.allBuilder_ == null) {
                    if (this.nodeCase_ != 1) {
                        this.node_ = All.getDefaultInstance();
                    }
                    this.allBuilder_ = new e2<>((All) this.node_, getParentForChildren(), isClean());
                    this.node_ = null;
                }
                this.nodeCase_ = 1;
                onChanged();
                return this.allBuilder_;
            }

            private e2<Any, Any.Builder, AnyOrBuilder> getAnyFieldBuilder() {
                if (this.anyBuilder_ == null) {
                    if (this.nodeCase_ != 2) {
                        this.node_ = Any.getDefaultInstance();
                    }
                    this.anyBuilder_ = new e2<>((Any) this.node_, getParentForChildren(), isClean());
                    this.node_ = null;
                }
                this.nodeCase_ = 2;
                onChanged();
                return this.anyBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
            }

            private e2<Rule, Rule.Builder, RuleOrBuilder> getRuleFieldBuilder() {
                if (this.ruleBuilder_ == null) {
                    if (this.nodeCase_ != 3) {
                        this.node_ = Rule.getDefaultInstance();
                    }
                    this.ruleBuilder_ = new e2<>((Rule) this.node_, getParentForChildren(), isClean());
                    this.node_ = null;
                }
                this.nodeCase_ = 3;
                onChanged();
                return this.ruleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearAll() {
                e2<All, All.Builder, AllOrBuilder> e2Var = this.allBuilder_;
                if (e2Var != null) {
                    if (this.nodeCase_ == 1) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                    }
                    e2Var.b();
                } else if (this.nodeCase_ == 1) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearAny() {
                e2<Any, Any.Builder, AnyOrBuilder> e2Var = this.anyBuilder_;
                if (e2Var != null) {
                    if (this.nodeCase_ == 2) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                    }
                    e2Var.b();
                } else if (this.nodeCase_ == 2) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearNode() {
                this.nodeCase_ = 0;
                this.node_ = null;
                onChanged();
                return this;
            }

            public Builder clearRule() {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var != null) {
                    if (this.nodeCase_ == 3) {
                        this.nodeCase_ = 0;
                        this.node_ = null;
                    }
                    e2Var.b();
                } else if (this.nodeCase_ == 3) {
                    this.nodeCase_ = 0;
                    this.node_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public All getAll() {
                e2<All, All.Builder, AllOrBuilder> e2Var = this.allBuilder_;
                if (e2Var == null) {
                    return this.nodeCase_ == 1 ? (All) this.node_ : All.getDefaultInstance();
                }
                return this.nodeCase_ == 1 ? (All) e2Var.e() : All.getDefaultInstance();
            }

            public All.Builder getAllBuilder() {
                return (All.Builder) getAllFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public AllOrBuilder getAllOrBuilder() {
                e2<All, All.Builder, AllOrBuilder> e2Var;
                int i10 = this.nodeCase_;
                if (i10 != 1 || (e2Var = this.allBuilder_) == null) {
                    return i10 == 1 ? (All) this.node_ : All.getDefaultInstance();
                }
                return (AllOrBuilder) e2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public Any getAny() {
                e2<Any, Any.Builder, AnyOrBuilder> e2Var = this.anyBuilder_;
                if (e2Var == null) {
                    return this.nodeCase_ == 2 ? (Any) this.node_ : Any.getDefaultInstance();
                }
                return this.nodeCase_ == 2 ? (Any) e2Var.e() : Any.getDefaultInstance();
            }

            public Any.Builder getAnyBuilder() {
                return (Any.Builder) getAnyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public AnyOrBuilder getAnyOrBuilder() {
                e2<Any, Any.Builder, AnyOrBuilder> e2Var;
                int i10 = this.nodeCase_;
                if (i10 != 2 || (e2Var = this.anyBuilder_) == null) {
                    return i10 == 2 ? (Any) this.node_ : Any.getDefaultInstance();
                }
                return (AnyOrBuilder) e2Var.f();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public NodeCase getNodeCase() {
                return NodeCase.forNumber(this.nodeCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public Rule getRule() {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    return this.nodeCase_ == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
                }
                return this.nodeCase_ == 3 ? (Rule) e2Var.e() : Rule.getDefaultInstance();
            }

            public Rule.Builder getRuleBuilder() {
                return (Rule.Builder) getRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public RuleOrBuilder getRuleOrBuilder() {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var;
                int i10 = this.nodeCase_;
                if (i10 != 3 || (e2Var = this.ruleBuilder_) == null) {
                    return i10 == 3 ? (Rule) this.node_ : Rule.getDefaultInstance();
                }
                return (RuleOrBuilder) e2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public boolean hasAll() {
                return this.nodeCase_ == 1;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public boolean hasAny() {
                return this.nodeCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.FilterExpressionOrBuilder
            public boolean hasRule() {
                return this.nodeCase_ == 3;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_FilterExpression_fieldAccessorTable.d(FilterExpression.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAll(All all) {
                e2<All, All.Builder, AllOrBuilder> e2Var = this.allBuilder_;
                if (e2Var == null) {
                    if (this.nodeCase_ != 1 || this.node_ == All.getDefaultInstance()) {
                        this.node_ = all;
                    } else {
                        this.node_ = All.newBuilder((All) this.node_).mergeFrom(all).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.nodeCase_ == 1) {
                        e2Var.g(all);
                    }
                    this.allBuilder_.i(all);
                }
                this.nodeCase_ = 1;
                return this;
            }

            public Builder mergeAny(Any any) {
                e2<Any, Any.Builder, AnyOrBuilder> e2Var = this.anyBuilder_;
                if (e2Var == null) {
                    if (this.nodeCase_ != 2 || this.node_ == Any.getDefaultInstance()) {
                        this.node_ = any;
                    } else {
                        this.node_ = Any.newBuilder((Any) this.node_).mergeFrom(any).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.nodeCase_ == 2) {
                        e2Var.g(any);
                    }
                    this.anyBuilder_.i(any);
                }
                this.nodeCase_ = 2;
                return this;
            }

            public Builder mergeRule(Rule rule) {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    if (this.nodeCase_ != 3 || this.node_ == Rule.getDefaultInstance()) {
                        this.node_ = rule;
                    } else {
                        this.node_ = Rule.newBuilder((Rule) this.node_).mergeFrom(rule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.nodeCase_ == 3) {
                        e2Var.g(rule);
                    }
                    this.ruleBuilder_.i(rule);
                }
                this.nodeCase_ = 3;
                return this;
            }

            public Builder setAll(All all) {
                e2<All, All.Builder, AllOrBuilder> e2Var = this.allBuilder_;
                if (e2Var == null) {
                    all.getClass();
                    this.node_ = all;
                    onChanged();
                } else {
                    e2Var.i(all);
                }
                this.nodeCase_ = 1;
                return this;
            }

            public Builder setAny(Any any) {
                e2<Any, Any.Builder, AnyOrBuilder> e2Var = this.anyBuilder_;
                if (e2Var == null) {
                    any.getClass();
                    this.node_ = any;
                    onChanged();
                } else {
                    e2Var.i(any);
                }
                this.nodeCase_ = 2;
                return this;
            }

            public Builder setRule(Rule rule) {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    rule.getClass();
                    this.node_ = rule;
                    onChanged();
                } else {
                    e2Var.i(rule);
                }
                this.nodeCase_ = 3;
                return this;
            }

            private Builder() {
                this.nodeCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public FilterExpression build() {
                FilterExpression filterExpressionBuildPartial = buildPartial();
                if (filterExpressionBuildPartial.isInitialized()) {
                    return filterExpressionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) filterExpressionBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public FilterExpression buildPartial() {
                FilterExpression filterExpression = new FilterExpression(this);
                if (this.nodeCase_ == 1) {
                    e2<All, All.Builder, AllOrBuilder> e2Var = this.allBuilder_;
                    if (e2Var == null) {
                        filterExpression.node_ = this.node_;
                    } else {
                        filterExpression.node_ = e2Var.a();
                    }
                }
                if (this.nodeCase_ == 2) {
                    e2<Any, Any.Builder, AnyOrBuilder> e2Var2 = this.anyBuilder_;
                    if (e2Var2 == null) {
                        filterExpression.node_ = this.node_;
                    } else {
                        filterExpression.node_ = e2Var2.a();
                    }
                }
                if (this.nodeCase_ == 3) {
                    e2<Rule, Rule.Builder, RuleOrBuilder> e2Var3 = this.ruleBuilder_;
                    if (e2Var3 == null) {
                        filterExpression.node_ = this.node_;
                    } else {
                        filterExpression.node_ = e2Var3.a();
                    }
                }
                filterExpression.nodeCase_ = this.nodeCase_;
                onBuilt();
                return filterExpression;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public FilterExpression mo164getDefaultInstanceForType() {
                return FilterExpression.getDefaultInstance();
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
                this.nodeCase_ = 0;
                this.node_ = null;
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.nodeCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FilterExpression) {
                    return mergeFrom((FilterExpression) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAll(All.Builder builder) {
                e2<All, All.Builder, AllOrBuilder> e2Var = this.allBuilder_;
                if (e2Var == null) {
                    this.node_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.nodeCase_ = 1;
                return this;
            }

            public Builder setAny(Any.Builder builder) {
                e2<Any, Any.Builder, AnyOrBuilder> e2Var = this.anyBuilder_;
                if (e2Var == null) {
                    this.node_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.nodeCase_ = 2;
                return this;
            }

            public Builder setRule(Rule.Builder builder) {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    this.node_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.nodeCase_ = 3;
                return this;
            }

            public Builder mergeFrom(FilterExpression filterExpression) {
                if (filterExpression == FilterExpression.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Monitor$FilterExpression$NodeCase[filterExpression.getNodeCase().ordinal()];
                if (i10 == 1) {
                    mergeAll(filterExpression.getAll());
                } else if (i10 == 2) {
                    mergeAny(filterExpression.getAny());
                } else if (i10 == 3) {
                    mergeRule(filterExpression.getRule());
                }
                mergeUnknownFields(((j0) filterExpression).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                FilterExpression filterExpression = null;
                try {
                    try {
                        FilterExpression filterExpression2 = (FilterExpression) FilterExpression.PARSER.parsePartialFrom(nVar, yVar);
                        if (filterExpression2 != null) {
                            mergeFrom(filterExpression2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        FilterExpression filterExpression3 = (FilterExpression) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            filterExpression = filterExpression3;
                            if (filterExpression != null) {
                                mergeFrom(filterExpression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (filterExpression != null) {
                        mergeFrom(filterExpression);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(FilterExpression filterExpression) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(filterExpression);
        }

        public static FilterExpression parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private FilterExpression(j0.b<?> bVar) {
            super(bVar);
            this.nodeCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FilterExpression parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (FilterExpression) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static FilterExpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public FilterExpression mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static FilterExpression parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FilterExpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        private FilterExpression() {
            this.nodeCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FilterExpression parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static FilterExpression parseFrom(InputStream inputStream) throws IOException {
            return (FilterExpression) j0.parseWithIOException(PARSER, inputStream);
        }

        private FilterExpression(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    All.Builder builder = this.nodeCase_ == 1 ? ((All) this.node_).toBuilder() : null;
                                    MessageLite messageLiteA = nVar.A(All.parser(), yVar);
                                    this.node_ = messageLiteA;
                                    if (builder != null) {
                                        builder.mergeFrom((All) messageLiteA);
                                        this.node_ = builder.buildPartial();
                                    }
                                    this.nodeCase_ = 1;
                                } else if (iK == 18) {
                                    Any.Builder builder2 = this.nodeCase_ == 2 ? ((Any) this.node_).toBuilder() : null;
                                    MessageLite messageLiteA2 = nVar.A(Any.parser(), yVar);
                                    this.node_ = messageLiteA2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((Any) messageLiteA2);
                                        this.node_ = builder2.buildPartial();
                                    }
                                    this.nodeCase_ = 2;
                                } else if (iK != 26) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    Rule.Builder builder3 = this.nodeCase_ == 3 ? ((Rule) this.node_).toBuilder() : null;
                                    MessageLite messageLiteA3 = nVar.A(Rule.parser(), yVar);
                                    this.node_ = messageLiteA3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((Rule) messageLiteA3);
                                        this.node_ = builder3.buildPartial();
                                    }
                                    this.nodeCase_ = 3;
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

        public static FilterExpression parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (FilterExpression) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static FilterExpression parseFrom(n nVar) throws IOException {
            return (FilterExpression) j0.parseWithIOException(PARSER, nVar);
        }

        public static FilterExpression parseFrom(n nVar, y yVar) throws IOException {
            return (FilterExpression) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface FilterExpressionOrBuilder extends MessageOrBuilder {
        All getAll();

        AllOrBuilder getAllOrBuilder();

        Any getAny();

        AnyOrBuilder getAnyOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        FilterExpression.NodeCase getNodeCase();

        Rule getRule();

        RuleOrBuilder getRuleOrBuilder();

        boolean hasAll();

        boolean hasAny();

        boolean hasRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum MissingBehavior implements l0.c {
        MISSING_UNSPECIFIED(0),
        FAIL(1),
        PASS(2),
        UNRECOGNIZED(-1);

        public static final int FAIL_VALUE = 1;
        public static final int MISSING_UNSPECIFIED_VALUE = 0;
        public static final int PASS_VALUE = 2;
        private final int value;
        private static final l0.d<MissingBehavior> internalValueMap = new l0.d<MissingBehavior>() { // from class: io.bidmachine.protobuf.sdk.Monitor.MissingBehavior.1
            @Override // com.explorestack.protobuf.l0.d
            public MissingBehavior findValueByNumber(int i10) {
                return MissingBehavior.forNumber(i10);
            }
        };
        private static final MissingBehavior[] VALUES = values();

        MissingBehavior(int i10) {
            this.value = i10;
        }

        public static MissingBehavior forNumber(int i10) {
            if (i10 == 0) {
                return MISSING_UNSPECIFIED;
            }
            if (i10 == 1) {
                return FAIL;
            }
            if (i10 != 2) {
                return null;
            }
            return PASS;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Monitor.getDescriptor().getEnumTypes().get(1);
        }

        public static l0.d<MissingBehavior> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static MissingBehavior valueOf(int i10) {
            return forNumber(i10);
        }

        public static MissingBehavior valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum Operator implements l0.c {
        OP_UNSPECIFIED(0),
        IN(1),
        NOT_IN(2),
        EQ(3),
        NEQ(4),
        EXISTS(5),
        NOT_EXISTS(6),
        GREATER_THAN(7),
        GREATER_THAN_OR_EQUAL(8),
        LESS_THAN(9),
        LESS_THAN_OR_EQUAL(10),
        UNRECOGNIZED(-1);

        public static final int EQ_VALUE = 3;
        public static final int EXISTS_VALUE = 5;
        public static final int GREATER_THAN_OR_EQUAL_VALUE = 8;
        public static final int GREATER_THAN_VALUE = 7;
        public static final int IN_VALUE = 1;
        public static final int LESS_THAN_OR_EQUAL_VALUE = 10;
        public static final int LESS_THAN_VALUE = 9;
        public static final int NEQ_VALUE = 4;
        public static final int NOT_EXISTS_VALUE = 6;
        public static final int NOT_IN_VALUE = 2;
        public static final int OP_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final l0.d<Operator> internalValueMap = new l0.d<Operator>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Operator.1
            @Override // com.explorestack.protobuf.l0.d
            public Operator findValueByNumber(int i10) {
                return Operator.forNumber(i10);
            }
        };
        private static final Operator[] VALUES = values();

        Operator(int i10) {
            this.value = i10;
        }

        public static Operator forNumber(int i10) {
            switch (i10) {
                case 0:
                    return OP_UNSPECIFIED;
                case 1:
                    return IN;
                case 2:
                    return NOT_IN;
                case 3:
                    return EQ;
                case 4:
                    return NEQ;
                case 5:
                    return EXISTS;
                case 6:
                    return NOT_EXISTS;
                case 7:
                    return GREATER_THAN;
                case 8:
                    return GREATER_THAN_OR_EQUAL;
                case 9:
                    return LESS_THAN;
                case 10:
                    return LESS_THAN_OR_EQUAL;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Monitor.getDescriptor().getEnumTypes().get(0);
        }

        public static l0.d<Operator> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.explorestack.protobuf.l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static Operator valueOf(int i10) {
            return forNumber(i10);
        }

        public static Operator valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Record extends j0 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private Struct fields_;
        private byte memoizedIsInitialized;
        private Timestamp timestamp_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final s1<Record> PARSER = new b<Record>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Record.1
            @Override // com.explorestack.protobuf.s1
            public Record parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Record(nVar, yVar);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Record parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Record) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Record> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return super.equals(obj);
            }
            Record record = (Record) obj;
            if (hasTimestamp() != record.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && !getTimestamp().equals(record.getTimestamp())) || hasFields() != record.hasFields()) {
                return false;
            }
            if ((!hasFields() || getFields().equals(record.getFields())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Struct getFields() {
            Struct struct = this.fields_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public i2 getFieldsOrBuilder() {
            return getFields();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Record> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.timestamp_ != null ? 0 + CodedOutputStream.G(1, getTimestamp()) : 0;
            if (this.fields_ != null) {
                iG += CodedOutputStream.G(2, getFields());
            }
            if (this.error_ != null) {
                iG += CodedOutputStream.G(3, getError());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public n2 getTimestampOrBuilder() {
            return getTimestamp();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasFields() {
            return this.fields_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getTimestamp().hashCode();
            }
            if (hasFields()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getFields().hashCode();
            }
            if (hasError()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getError().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable.d(Record.class, Builder.class);
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
            return new Record();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.timestamp_ != null) {
                codedOutputStream.L0(1, getTimestamp());
            }
            if (this.fields_ != null) {
                codedOutputStream.L0(2, getFields());
            }
            if (this.error_ != null) {
                codedOutputStream.L0(3, getError());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements RecordOrBuilder {
            private e2<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
            private Error error_;
            private e2<Struct, Struct.Builder, i2> fieldsBuilder_;
            private Struct fields_;
            private e2<Timestamp, Timestamp.Builder, n2> timestampBuilder_;
            private Timestamp timestamp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            private e2<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new e2<>(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private e2<Struct, Struct.Builder, i2> getFieldsFieldBuilder() {
                if (this.fieldsBuilder_ == null) {
                    this.fieldsBuilder_ = new e2<>(getFields(), getParentForChildren(), isClean());
                    this.fields_ = null;
                }
                return this.fieldsBuilder_;
            }

            private e2<Timestamp, Timestamp.Builder, n2> getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new e2<>(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
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

            public Builder clearFields() {
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                    onChanged();
                } else {
                    this.fields_ = null;
                    this.fieldsBuilder_ = null;
                }
                return this;
            }

            public Builder clearTimestamp() {
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                    onChanged();
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Error getError() {
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                if (e2Var != null) {
                    return (Error) e2Var.e();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            public Error.Builder getErrorBuilder() {
                onChanged();
                return (Error.Builder) getErrorFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                if (e2Var != null) {
                    return (ErrorOrBuilder) e2Var.f();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Struct getFields() {
                e2<Struct, Struct.Builder, i2> e2Var = this.fieldsBuilder_;
                if (e2Var != null) {
                    return (Struct) e2Var.e();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getFieldsBuilder() {
                onChanged();
                return (Struct.Builder) getFieldsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public i2 getFieldsOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.fieldsBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.fields_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public Timestamp getTimestamp() {
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var != null) {
                    return (Timestamp) e2Var.e();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public Timestamp.Builder getTimestampBuilder() {
                onChanged();
                return (Timestamp.Builder) getTimestampFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public n2 getTimestampOrBuilder() {
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var != null) {
                    return (n2) e2Var.f();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasFields() {
                return (this.fieldsBuilder_ == null && this.fields_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RecordOrBuilder
            public boolean hasTimestamp() {
                return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable.d(Record.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeError(Error error) {
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                if (e2Var == null) {
                    Error error2 = this.error_;
                    if (error2 != null) {
                        this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                    } else {
                        this.error_ = error;
                    }
                    onChanged();
                } else {
                    e2Var.g(error);
                }
                return this;
            }

            public Builder mergeFields(Struct struct) {
                e2<Struct, Struct.Builder, i2> e2Var = this.fieldsBuilder_;
                if (e2Var == null) {
                    Struct struct2 = this.fields_;
                    if (struct2 != null) {
                        this.fields_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.fields_ = struct;
                    }
                    onChanged();
                } else {
                    e2Var.g(struct);
                }
                return this;
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var == null) {
                    Timestamp timestamp2 = this.timestamp_;
                    if (timestamp2 != null) {
                        this.timestamp_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                    } else {
                        this.timestamp_ = timestamp;
                    }
                    onChanged();
                } else {
                    e2Var.g(timestamp);
                }
                return this;
            }

            public Builder setError(Error error) {
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                if (e2Var == null) {
                    error.getClass();
                    this.error_ = error;
                    onChanged();
                } else {
                    e2Var.i(error);
                }
                return this;
            }

            public Builder setFields(Struct struct) {
                e2<Struct, Struct.Builder, i2> e2Var = this.fieldsBuilder_;
                if (e2Var == null) {
                    struct.getClass();
                    this.fields_ = struct;
                    onChanged();
                } else {
                    e2Var.i(struct);
                }
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var == null) {
                    timestamp.getClass();
                    this.timestamp_ = timestamp;
                    onChanged();
                } else {
                    e2Var.i(timestamp);
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
            public Record build() {
                Record recordBuildPartial = buildPartial();
                if (recordBuildPartial.isInitialized()) {
                    return recordBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) recordBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Record buildPartial() {
                Record record = new Record(this);
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var == null) {
                    record.timestamp_ = this.timestamp_;
                } else {
                    record.timestamp_ = (Timestamp) e2Var.a();
                }
                e2<Struct, Struct.Builder, i2> e2Var2 = this.fieldsBuilder_;
                if (e2Var2 == null) {
                    record.fields_ = this.fields_;
                } else {
                    record.fields_ = (Struct) e2Var2.a();
                }
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var3 = this.errorBuilder_;
                if (e2Var3 == null) {
                    record.error_ = this.error_;
                } else {
                    record.error_ = (Error) e2Var3.a();
                }
                onBuilt();
                return record;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Record mo164getDefaultInstanceForType() {
                return Record.getDefaultInstance();
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
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                if (this.fieldsBuilder_ == null) {
                    this.fields_ = null;
                } else {
                    this.fields_ = null;
                    this.fieldsBuilder_ = null;
                }
                if (this.errorBuilder_ == null) {
                    this.error_ = null;
                } else {
                    this.error_ = null;
                    this.errorBuilder_ = null;
                }
                return this;
            }

            public Builder setError(Error.Builder builder) {
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                if (e2Var == null) {
                    this.error_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setFields(Struct.Builder builder) {
                e2<Struct, Struct.Builder, i2> e2Var = this.fieldsBuilder_;
                if (e2Var == null) {
                    this.fields_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var == null) {
                    this.timestamp_ = builder.build();
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
                if (message instanceof Record) {
                    return mergeFrom((Record) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasTimestamp()) {
                    mergeTimestamp(record.getTimestamp());
                }
                if (record.hasFields()) {
                    mergeFields(record.getFields());
                }
                if (record.hasError()) {
                    mergeError(record.getError());
                }
                mergeUnknownFields(((j0) record).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Record record = null;
                try {
                    try {
                        Record record2 = (Record) Record.PARSER.parsePartialFrom(nVar, yVar);
                        if (record2 != null) {
                            mergeFrom(record2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Record record3 = (Record) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            record = record3;
                            if (record != null) {
                                mergeFrom(record);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (record != null) {
                        mergeFrom(record);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Record record) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(record);
        }

        public static Record parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Record(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Record) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Record parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Record mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Record parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Record() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Record parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Record parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private Record(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                Timestamp timestamp = this.timestamp_;
                                Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                                this.timestamp_ = timestamp2;
                                if (builder != null) {
                                    builder.mergeFrom(timestamp2);
                                    this.timestamp_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                Struct struct = this.fields_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.fields_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.fields_ = builder2.buildPartial();
                                }
                            } else if (iK != 26) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Error error = this.error_;
                                Error.Builder builder3 = error != null ? error.toBuilder() : null;
                                Error error2 = (Error) nVar.A(Error.parser(), yVar);
                                this.error_ = error2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(error2);
                                    this.error_ = builder3.buildPartial();
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

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Record) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Record parseFrom(n nVar) throws IOException {
            return (Record) j0.parseWithIOException(PARSER, nVar);
        }

        public static Record parseFrom(n nVar, y yVar) throws IOException {
            return (Record) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface RecordOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        Error getError();

        ErrorOrBuilder getErrorOrBuilder();

        Struct getFields();

        i2 getFieldsOrBuilder();

        Timestamp getTimestamp();

        n2 getTimestampOrBuilder();

        boolean hasError();

        boolean hasFields();

        boolean hasTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Rule extends j0 implements RuleOrBuilder {
        public static final int MISSING_FIELD_NUMBER = 4;
        public static final int OP_FIELD_NUMBER = 2;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int VALUES_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int missing_;
        private int op_;
        private r0 path_;
        private List<Value> values_;
        private static final Rule DEFAULT_INSTANCE = new Rule();
        private static final s1<Rule> PARSER = new b<Rule>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Rule.1
            @Override // com.explorestack.protobuf.s1
            public Rule parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Rule(nVar, yVar);
            }
        };

        public static final class Builder extends j0.b<Builder> implements RuleOrBuilder {
            private int bitField0_;
            private int missing_;
            private int op_;
            private r0 path_;
            private z1<Value, Value.Builder, ValueOrBuilder> valuesBuilder_;
            private List<Value> values_;

            private void ensurePathIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.path_ = new q0(this.path_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureValuesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.values_ = new ArrayList(this.values_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
            }

            private z1<Value, Value.Builder, ValueOrBuilder> getValuesFieldBuilder() {
                if (this.valuesBuilder_ == null) {
                    this.valuesBuilder_ = new z1<>(this.values_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.values_ = null;
                }
                return this.valuesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getValuesFieldBuilder();
                }
            }

            public Builder addAllPath(Iterable<String> iterable) {
                ensurePathIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.path_);
                onChanged();
                return this;
            }

            public Builder addAllValues(Iterable<? extends Value> iterable) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    ensureValuesIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.values_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addPath(String str) {
                str.getClass();
                ensurePathIsMutable();
                this.path_.add(str);
                onChanged();
                return this;
            }

            public Builder addPathBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                ensurePathIsMutable();
                this.path_.b(byteString);
                onChanged();
                return this;
            }

            public Builder addValues(Value value) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    value.getClass();
                    ensureValuesIsMutable();
                    this.values_.add(value);
                    onChanged();
                } else {
                    z1Var.e(value);
                }
                return this;
            }

            public Value.Builder addValuesBuilder() {
                return (Value.Builder) getValuesFieldBuilder().c(Value.getDefaultInstance());
            }

            public Builder clearMissing() {
                this.missing_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOp() {
                this.op_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPath() {
                this.path_ = q0.f10776d;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearValues() {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    this.values_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public MissingBehavior getMissing() {
                MissingBehavior missingBehaviorValueOf = MissingBehavior.valueOf(this.missing_);
                return missingBehaviorValueOf == null ? MissingBehavior.UNRECOGNIZED : missingBehaviorValueOf;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getMissingValue() {
                return this.missing_;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public Operator getOp() {
                Operator operatorValueOf = Operator.valueOf(this.op_);
                return operatorValueOf == null ? Operator.UNRECOGNIZED : operatorValueOf;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getOpValue() {
                return this.op_;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public String getPath(int i10) {
                return this.path_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public ByteString getPathBytes(int i10) {
                return this.path_.getByteString(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public Value getValues(int i10) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                return z1Var == null ? this.values_.get(i10) : (Value) z1Var.n(i10);
            }

            public Value.Builder getValuesBuilder(int i10) {
                return (Value.Builder) getValuesFieldBuilder().k(i10);
            }

            public List<Value.Builder> getValuesBuilderList() {
                return getValuesFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public int getValuesCount() {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                return z1Var == null ? this.values_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public List<Value> getValuesList() {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.values_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public ValueOrBuilder getValuesOrBuilder(int i10) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                return z1Var == null ? this.values_.get(i10) : (ValueOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.values_);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable.d(Rule.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeValues(int i10) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    ensureValuesIsMutable();
                    this.values_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setMissing(MissingBehavior missingBehavior) {
                missingBehavior.getClass();
                this.missing_ = missingBehavior.getNumber();
                onChanged();
                return this;
            }

            public Builder setMissingValue(int i10) {
                this.missing_ = i10;
                onChanged();
                return this;
            }

            public Builder setOp(Operator operator) {
                operator.getClass();
                this.op_ = operator.getNumber();
                onChanged();
                return this;
            }

            public Builder setOpValue(int i10) {
                this.op_ = i10;
                onChanged();
                return this;
            }

            public Builder setPath(int i10, String str) {
                str.getClass();
                ensurePathIsMutable();
                this.path_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setValues(int i10, Value value) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    value.getClass();
                    ensureValuesIsMutable();
                    this.values_.set(i10, value);
                    onChanged();
                } else {
                    z1Var.w(i10, value);
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
            public w1 getPathList() {
                return this.path_.getUnmodifiableView();
            }

            private Builder() {
                this.path_ = q0.f10776d;
                this.op_ = 0;
                this.values_ = Collections.emptyList();
                this.missing_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule build() {
                Rule ruleBuildPartial = buildPartial();
                if (ruleBuildPartial.isInitialized()) {
                    return ruleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ruleBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Rule buildPartial() {
                Rule rule = new Rule(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.path_ = this.path_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                rule.path_ = this.path_;
                rule.op_ = this.op_;
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var != null) {
                    rule.values_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.values_ = Collections.unmodifiableList(this.values_);
                        this.bitField0_ &= -3;
                    }
                    rule.values_ = this.values_;
                }
                rule.missing_ = this.missing_;
                onBuilt();
                return rule;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Rule mo164getDefaultInstanceForType() {
                return Rule.getDefaultInstance();
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

            public Value.Builder addValuesBuilder(int i10) {
                return (Value.Builder) getValuesFieldBuilder().b(i10, Value.getDefaultInstance());
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
                this.path_ = q0.f10776d;
                this.bitField0_ &= -2;
                this.op_ = 0;
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    this.values_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    z1Var.g();
                }
                this.missing_ = 0;
                return this;
            }

            public Builder addValues(int i10, Value value) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    value.getClass();
                    ensureValuesIsMutable();
                    this.values_.add(i10, value);
                    onChanged();
                } else {
                    z1Var.d(i10, value);
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
                if (message instanceof Rule) {
                    return mergeFrom((Rule) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setValues(int i10, Value.Builder builder) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    ensureValuesIsMutable();
                    this.values_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.path_ = q0.f10776d;
                this.op_ = 0;
                this.values_ = Collections.emptyList();
                this.missing_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Rule rule) {
                if (rule == Rule.getDefaultInstance()) {
                    return this;
                }
                if (!rule.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        this.path_ = rule.path_;
                        this.bitField0_ &= -2;
                    } else {
                        ensurePathIsMutable();
                        this.path_.addAll(rule.path_);
                    }
                    onChanged();
                }
                if (rule.op_ != 0) {
                    setOpValue(rule.getOpValue());
                }
                if (this.valuesBuilder_ == null) {
                    if (!rule.values_.isEmpty()) {
                        if (this.values_.isEmpty()) {
                            this.values_ = rule.values_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureValuesIsMutable();
                            this.values_.addAll(rule.values_);
                        }
                        onChanged();
                    }
                } else if (!rule.values_.isEmpty()) {
                    if (!this.valuesBuilder_.t()) {
                        this.valuesBuilder_.a(rule.values_);
                    } else {
                        this.valuesBuilder_.h();
                        this.valuesBuilder_ = null;
                        this.values_ = rule.values_;
                        this.bitField0_ &= -3;
                        this.valuesBuilder_ = j0.alwaysUseFieldBuilders ? getValuesFieldBuilder() : null;
                    }
                }
                if (rule.missing_ != 0) {
                    setMissingValue(rule.getMissingValue());
                }
                mergeUnknownFields(((j0) rule).unknownFields);
                onChanged();
                return this;
            }

            public Builder addValues(Value.Builder builder) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    ensureValuesIsMutable();
                    this.values_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addValues(int i10, Value.Builder builder) {
                z1<Value, Value.Builder, ValueOrBuilder> z1Var = this.valuesBuilder_;
                if (z1Var == null) {
                    ensureValuesIsMutable();
                    this.values_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Rule rule = null;
                try {
                    try {
                        Rule rule2 = (Rule) Rule.PARSER.parsePartialFrom(nVar, yVar);
                        if (rule2 != null) {
                            mergeFrom(rule2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Rule rule3 = (Rule) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            rule = rule3;
                            if (rule != null) {
                                mergeFrom(rule);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (rule != null) {
                        mergeFrom(rule);
                    }
                    throw th;
                }
            }
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Rule parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rule) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Rule> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return super.equals(obj);
            }
            Rule rule = (Rule) obj;
            return getPathList().equals(rule.getPathList()) && this.op_ == rule.op_ && getValuesList().equals(rule.getValuesList()) && this.missing_ == rule.missing_ && this.unknownFields.equals(rule.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public MissingBehavior getMissing() {
            MissingBehavior missingBehaviorValueOf = MissingBehavior.valueOf(this.missing_);
            return missingBehaviorValueOf == null ? MissingBehavior.UNRECOGNIZED : missingBehaviorValueOf;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getMissingValue() {
            return this.missing_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public Operator getOp() {
            Operator operatorValueOf = Operator.valueOf(this.op_);
            return operatorValueOf == null ? Operator.UNRECOGNIZED : operatorValueOf;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getOpValue() {
            return this.op_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Rule> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public String getPath(int i10) {
            return this.path_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public ByteString getPathBytes(int i10) {
            return this.path_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.path_.size(); i11++) {
                iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.path_.getRaw(i11));
            }
            int size = iComputeStringSizeNoTag + 0 + (getPathList().size() * 1);
            if (this.op_ != Operator.OP_UNSPECIFIED.getNumber()) {
                size += CodedOutputStream.l(2, this.op_);
            }
            for (int i12 = 0; i12 < this.values_.size(); i12++) {
                size += CodedOutputStream.G(3, this.values_.get(i12));
            }
            if (this.missing_ != MissingBehavior.MISSING_UNSPECIFIED.getNumber()) {
                size += CodedOutputStream.l(4, this.missing_);
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public Value getValues(int i10) {
            return this.values_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public int getValuesCount() {
            return this.values_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public List<Value> getValuesList() {
            return this.values_;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public ValueOrBuilder getValuesOrBuilder(int i10) {
            return this.values_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
            return this.values_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getPathCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPathList().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 2) * 53) + this.op_;
            if (getValuesCount() > 0) {
                iHashCode2 = (((iHashCode2 * 37) + 3) * 53) + getValuesList().hashCode();
            }
            int iHashCode3 = (((((iHashCode2 * 37) + 4) * 53) + this.missing_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Rule_fieldAccessorTable.d(Rule.class, Builder.class);
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
            return new Rule();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.path_.size(); i10++) {
                j0.writeString(codedOutputStream, 1, this.path_.getRaw(i10));
            }
            if (this.op_ != Operator.OP_UNSPECIFIED.getNumber()) {
                codedOutputStream.v0(2, this.op_);
            }
            for (int i11 = 0; i11 < this.values_.size(); i11++) {
                codedOutputStream.L0(3, this.values_.get(i11));
            }
            if (this.missing_ != MissingBehavior.MISSING_UNSPECIFIED.getNumber()) {
                codedOutputStream.v0(4, this.missing_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rule);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.RuleOrBuilder
        public w1 getPathList() {
            return this.path_;
        }

        private Rule(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rule parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Rule) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Rule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Rule mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Rule parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Rule() {
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = q0.f10776d;
            this.op_ = 0;
            this.values_ = Collections.emptyList();
            this.missing_ = 0;
        }

        public static Rule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Rule parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Rule parseFrom(InputStream inputStream) throws IOException {
            return (Rule) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Rule parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Rule) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        private Rule(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    this.path_ = new q0();
                                    i10 |= 1;
                                }
                                this.path_.add(strJ);
                            } else if (iK == 16) {
                                this.op_ = nVar.t();
                            } else if (iK == 26) {
                                if ((i10 & 2) == 0) {
                                    this.values_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.values_.add((Value) nVar.A(Value.parser(), yVar));
                            } else if (iK != 32) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                this.missing_ = nVar.t();
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
                        this.path_ = this.path_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.values_ = Collections.unmodifiableList(this.values_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i10 & 1) != 0) {
                this.path_ = this.path_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.values_ = Collections.unmodifiableList(this.values_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Rule parseFrom(n nVar) throws IOException {
            return (Rule) j0.parseWithIOException(PARSER, nVar);
        }

        public static Rule parseFrom(n nVar, y yVar) throws IOException {
            return (Rule) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface RuleOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        MissingBehavior getMissing();

        int getMissingValue();

        Operator getOp();

        int getOpValue();

        String getPath(int i10);

        ByteString getPathBytes(int i10);

        int getPathCount();

        List<String> getPathList();

        Value getValues(int i10);

        int getValuesCount();

        List<Value> getValuesList();

        ValueOrBuilder getValuesOrBuilder(int i10);

        List<? extends ValueOrBuilder> getValuesOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Value extends j0 implements ValueOrBuilder {
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
        public static final int INT_VALUE_FIELD_NUMBER = 2;
        public static final int STRING_VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int kindCase_;
        private Object kind_;
        private byte memoizedIsInitialized;
        private static final Value DEFAULT_INSTANCE = new Value();
        private static final s1<Value> PARSER = new b<Value>() { // from class: io.bidmachine.protobuf.sdk.Monitor.Value.1
            @Override // com.explorestack.protobuf.s1
            public Value parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Value(nVar, yVar);
            }
        };

        public enum KindCase implements l0.c {
            STRING_VALUE(1),
            INT_VALUE(2),
            BOOL_VALUE(3),
            DOUBLE_VALUE(4),
            KIND_NOT_SET(0);

            private final int value;

            KindCase(int i10) {
                this.value = i10;
            }

            public static KindCase forNumber(int i10) {
                if (i10 == 0) {
                    return KIND_NOT_SET;
                }
                if (i10 == 1) {
                    return STRING_VALUE;
                }
                if (i10 == 2) {
                    return INT_VALUE;
                }
                if (i10 == 3) {
                    return BOOL_VALUE;
                }
                if (i10 != 4) {
                    return null;
                }
                return DOUBLE_VALUE;
            }

            @Override // com.explorestack.protobuf.l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static KindCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Value) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Value> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return super.equals(obj);
            }
            Value value = (Value) obj;
            if (!getKindCase().equals(value.getKindCase())) {
                return false;
            }
            int i10 = this.kindCase_;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && Double.doubleToLongBits(getDoubleValue()) != Double.doubleToLongBits(value.getDoubleValue())) {
                            return false;
                        }
                    } else if (getBoolValue() != value.getBoolValue()) {
                        return false;
                    }
                } else if (getIntValue() != value.getIntValue()) {
                    return false;
                }
            } else if (!getStringValue().equals(value.getStringValue())) {
                return false;
            }
            return this.unknownFields.equals(value.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean getBoolValue() {
            if (this.kindCase_ == 3) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public double getDoubleValue() {
            if (this.kindCase_ == 4) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public long getIntValue() {
            if (this.kindCase_ == 2) {
                return ((Long) this.kind_).longValue();
            }
            return 0L;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Value> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = this.kindCase_ == 1 ? 0 + j0.computeStringSize(1, this.kind_) : 0;
            if (this.kindCase_ == 2) {
                iComputeStringSize += CodedOutputStream.z(2, ((Long) this.kind_).longValue());
            }
            if (this.kindCase_ == 3) {
                iComputeStringSize += CodedOutputStream.e(3, ((Boolean) this.kind_).booleanValue());
            }
            if (this.kindCase_ == 4) {
                iComputeStringSize += CodedOutputStream.j(4, ((Double) this.kind_).doubleValue());
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public String getStringValue() {
            Object obj = this.kindCase_ == 1 ? this.kind_ : "";
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            if (this.kindCase_ == 1) {
                this.kind_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public ByteString getStringValueBytes() {
            Object obj = this.kindCase_ == 1 ? this.kind_ : "";
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            if (this.kindCase_ == 1) {
                this.kind_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasBoolValue() {
            return this.kindCase_ == 3;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasDoubleValue() {
            return this.kindCase_ == 4;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasIntValue() {
            return this.kindCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
        public boolean hasStringValue() {
            return this.kindCase_ == 1;
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
            int i12 = this.kindCase_;
            if (i12 == 1) {
                i10 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getStringValue().hashCode();
            } else if (i12 == 2) {
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = l0.i(getIntValue());
            } else {
                if (i12 != 3) {
                    if (i12 == 4) {
                        i10 = ((iHashCode2 * 37) + 4) * 53;
                        iHashCode = l0.i(Double.doubleToLongBits(getDoubleValue()));
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i10 = ((iHashCode2 * 37) + 3) * 53;
                iHashCode = l0.d(getBoolValue());
            }
            iHashCode2 = i10 + iHashCode;
            int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable.d(Value.class, Builder.class);
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
            return new Value();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.kindCase_ == 1) {
                j0.writeString(codedOutputStream, 1, this.kind_);
            }
            if (this.kindCase_ == 2) {
                codedOutputStream.J0(2, ((Long) this.kind_).longValue());
            }
            if (this.kindCase_ == 3) {
                codedOutputStream.n0(3, ((Boolean) this.kind_).booleanValue());
            }
            if (this.kindCase_ == 4) {
                codedOutputStream.t0(4, ((Double) this.kind_).doubleValue());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ValueOrBuilder {
            private int kindCase_;
            private Object kind_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearBoolValue() {
                if (this.kindCase_ == 3) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearDoubleValue() {
                if (this.kindCase_ == 4) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearIntValue() {
                if (this.kindCase_ == 2) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearKind() {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
                return this;
            }

            public Builder clearStringValue() {
                if (this.kindCase_ == 1) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean getBoolValue() {
                if (this.kindCase_ == 3) {
                    return ((Boolean) this.kind_).booleanValue();
                }
                return false;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public double getDoubleValue() {
                if (this.kindCase_ == 4) {
                    return ((Double) this.kind_).doubleValue();
                }
                return 0.0d;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public long getIntValue() {
                if (this.kindCase_ == 2) {
                    return ((Long) this.kind_).longValue();
                }
                return 0L;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public KindCase getKindCase() {
                return KindCase.forNumber(this.kindCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public String getStringValue() {
                Object obj = this.kindCase_ == 1 ? this.kind_ : "";
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                if (this.kindCase_ == 1) {
                    this.kind_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public ByteString getStringValueBytes() {
                Object obj = this.kindCase_ == 1 ? this.kind_ : "";
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                if (this.kindCase_ == 1) {
                    this.kind_ = byteStringCopyFromUtf8;
                }
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasBoolValue() {
                return this.kindCase_ == 3;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasDoubleValue() {
                return this.kindCase_ == 4;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasIntValue() {
                return this.kindCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.sdk.Monitor.ValueOrBuilder
            public boolean hasStringValue() {
                return this.kindCase_ == 1;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Value_fieldAccessorTable.d(Value.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setBoolValue(boolean z10) {
                this.kindCase_ = 3;
                this.kind_ = Boolean.valueOf(z10);
                onChanged();
                return this;
            }

            public Builder setDoubleValue(double d10) {
                this.kindCase_ = 4;
                this.kind_ = Double.valueOf(d10);
                onChanged();
                return this;
            }

            public Builder setIntValue(long j10) {
                this.kindCase_ = 2;
                this.kind_ = Long.valueOf(j10);
                onChanged();
                return this;
            }

            public Builder setStringValue(String str) {
                str.getClass();
                this.kindCase_ = 1;
                this.kind_ = str;
                onChanged();
                return this;
            }

            public Builder setStringValueBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.kindCase_ = 1;
                this.kind_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.kindCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Value build() {
                Value valueBuildPartial = buildPartial();
                if (valueBuildPartial.isInitialized()) {
                    return valueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) valueBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Value buildPartial() {
                Value value = new Value(this);
                if (this.kindCase_ == 1) {
                    value.kind_ = this.kind_;
                }
                if (this.kindCase_ == 2) {
                    value.kind_ = this.kind_;
                }
                if (this.kindCase_ == 3) {
                    value.kind_ = this.kind_;
                }
                if (this.kindCase_ == 4) {
                    value.kind_ = this.kind_;
                }
                value.kindCase_ = this.kindCase_;
                onBuilt();
                return value;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Value mo164getDefaultInstanceForType() {
                return Value.getDefaultInstance();
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
                this.kindCase_ = 0;
                this.kind_ = null;
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.kindCase_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Value) {
                    return mergeFrom((Value) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Value value) {
                if (value == Value.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Monitor$Value$KindCase[value.getKindCase().ordinal()];
                if (i10 == 1) {
                    this.kindCase_ = 1;
                    this.kind_ = value.kind_;
                    onChanged();
                } else if (i10 == 2) {
                    setIntValue(value.getIntValue());
                } else if (i10 == 3) {
                    setBoolValue(value.getBoolValue());
                } else if (i10 == 4) {
                    setDoubleValue(value.getDoubleValue());
                }
                mergeUnknownFields(((j0) value).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Value value = null;
                try {
                    try {
                        Value value2 = (Value) Value.PARSER.parsePartialFrom(nVar, yVar);
                        if (value2 != null) {
                            mergeFrom(value2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Value value3 = (Value) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            value = value3;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (value != null) {
                        mergeFrom(value);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Value value) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
        }

        public static Value parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Value(j0.b<?> bVar) {
            super(bVar);
            this.kindCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Value parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Value) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Value mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Value parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        private Value() {
            this.kindCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Value parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Value parseFrom(InputStream inputStream) throws IOException {
            return (Value) j0.parseWithIOException(PARSER, inputStream);
        }

        private Value(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    String strJ = nVar.J();
                                    this.kindCase_ = 1;
                                    this.kind_ = strJ;
                                } else if (iK == 16) {
                                    this.kindCase_ = 2;
                                    this.kind_ = Long.valueOf(nVar.z());
                                } else if (iK == 24) {
                                    this.kindCase_ = 3;
                                    this.kind_ = Boolean.valueOf(nVar.q());
                                } else if (iK != 33) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    this.kindCase_ = 4;
                                    this.kind_ = Double.valueOf(nVar.s());
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

        public static Value parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Value) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Value parseFrom(n nVar) throws IOException {
            return (Value) j0.parseWithIOException(PARSER, nVar);
        }

        public static Value parseFrom(n nVar, y yVar) throws IOException {
            return (Value) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface ValueOrBuilder extends MessageOrBuilder {
        boolean getBoolValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        double getDoubleValue();

        long getIntValue();

        Value.KindCase getKindCase();

        String getStringValue();

        ByteString getStringValueBytes();

        boolean hasBoolValue();

        boolean hasDoubleValue();

        boolean hasIntValue();

        boolean hasStringValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Monitor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitor) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Monitor> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Monitor)) {
            return super.equals(obj);
        }
        Monitor monitor = (Monitor) obj;
        return getName().equals(monitor.getName()) && getRecordsList().equals(monitor.getRecordsList()) && this.unknownFields.equals(monitor.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
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
    public s1<Monitor> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? j0.computeStringSize(1, this.name_) + 0 : 0;
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iComputeStringSize += CodedOutputStream.G(2, this.records_.get(i11));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (getRecordsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getRecordsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable.d(Monitor.class, Builder.class);
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
        return new Monitor();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            codedOutputStream.L0(2, this.records_.get(i10));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements MonitorOrBuilder {
        private int bitField0_;
        private Object name_;
        private z1<Record, Record.Builder, RecordOrBuilder> recordsBuilder_;
        private List<Record> records_;

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        private z1<Record, Record.Builder, RecordOrBuilder> getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new z1<>(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getRecordsFieldBuilder();
            }
        }

        public Builder addAllRecords(Iterable<? extends Record> iterable) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                ensureRecordsIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.records_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addRecords(Record record) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(record);
                onChanged();
            } else {
                z1Var.e(record);
            }
            return this;
        }

        public Record.Builder addRecordsBuilder() {
            return (Record.Builder) getRecordsFieldBuilder().c(Record.getDefaultInstance());
        }

        public Builder clearName() {
            this.name_ = Monitor.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearRecords() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                this.records_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public Record getRecords(int i10) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.get(i10) : (Record) z1Var.n(i10);
        }

        public Record.Builder getRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().k(i10);
        }

        public List<Record.Builder> getRecordsBuilderList() {
            return getRecordsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public int getRecordsCount() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<Record> getRecordsList() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.records_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.get(i10) : (RecordOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.MonitorOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.records_);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable.d(Monitor.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeRecords(int i10) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                ensureRecordsIsMutable();
                this.records_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
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

        public Builder setRecords(int i10, Record record) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.set(i10, record);
                onChanged();
            } else {
                z1Var.w(i10, record);
            }
            return this;
        }

        private Builder() {
            this.name_ = "";
            this.records_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor build() {
            Monitor monitorBuildPartial = buildPartial();
            if (monitorBuildPartial.isInitialized()) {
                return monitorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) monitorBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Monitor buildPartial() {
            Monitor monitor = new Monitor(this);
            monitor.name_ = this.name_;
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var != null) {
                monitor.records_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = Collections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                monitor.records_ = this.records_;
            }
            onBuilt();
            return monitor;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Monitor mo164getDefaultInstanceForType() {
            return Monitor.getDefaultInstance();
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

        public Record.Builder addRecordsBuilder(int i10) {
            return (Record.Builder) getRecordsFieldBuilder().b(i10, Record.getDefaultInstance());
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
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                this.records_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.name_ = "";
            this.records_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addRecords(int i10, Record record) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                record.getClass();
                ensureRecordsIsMutable();
                this.records_.add(i10, record);
                onChanged();
            } else {
                z1Var.d(i10, record);
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
            if (message instanceof Monitor) {
                return mergeFrom((Monitor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRecords(int i10, Record.Builder builder) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                ensureRecordsIsMutable();
                this.records_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(Monitor monitor) {
            if (monitor == Monitor.getDefaultInstance()) {
                return this;
            }
            if (!monitor.getName().isEmpty()) {
                this.name_ = monitor.name_;
                onChanged();
            }
            if (this.recordsBuilder_ == null) {
                if (!monitor.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = monitor.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(monitor.records_);
                    }
                    onChanged();
                }
            } else if (!monitor.records_.isEmpty()) {
                if (!this.recordsBuilder_.t()) {
                    this.recordsBuilder_.a(monitor.records_);
                } else {
                    this.recordsBuilder_.h();
                    this.recordsBuilder_ = null;
                    this.records_ = monitor.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = j0.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) monitor).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRecords(Record.Builder builder) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addRecords(int i10, Record.Builder builder) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                ensureRecordsIsMutable();
                this.records_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Monitor monitor = null;
            try {
                try {
                    Monitor monitor2 = (Monitor) Monitor.PARSER.parsePartialFrom(nVar, yVar);
                    if (monitor2 != null) {
                        mergeFrom(monitor2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Monitor monitor3 = (Monitor) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        monitor = monitor3;
                        if (monitor != null) {
                            mergeFrom(monitor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (monitor != null) {
                    mergeFrom(monitor);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Monitor monitor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(monitor);
    }

    public static Monitor parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Monitor(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Monitor parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Monitor) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Monitor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Monitor mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Monitor parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Monitor() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.emptyList();
    }

    public static Monitor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Monitor parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Monitor parseFrom(InputStream inputStream) throws IOException {
        return (Monitor) j0.parseWithIOException(PARSER, inputStream);
    }

    private Monitor(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            this.name_ = nVar.J();
                        } else if (iK != 18) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            if (!(z11 & true)) {
                                this.records_ = new ArrayList();
                                z11 |= true;
                            }
                            this.records_.add((Record) nVar.A(Record.parser(), yVar));
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
                    this.records_ = Collections.unmodifiableList(this.records_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.records_ = Collections.unmodifiableList(this.records_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Monitor parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Monitor) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Monitor parseFrom(n nVar) throws IOException {
        return (Monitor) j0.parseWithIOException(PARSER, nVar);
    }

    public static Monitor parseFrom(n nVar, y yVar) throws IOException {
        return (Monitor) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
