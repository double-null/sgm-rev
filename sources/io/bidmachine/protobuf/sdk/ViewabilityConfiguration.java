package io.bidmachine.protobuf.sdk;

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
public final class ViewabilityConfiguration extends j0 implements ViewabilityConfigurationOrBuilder {
    private static final ViewabilityConfiguration DEFAULT_INSTANCE = new ViewabilityConfiguration();
    private static final s1<ViewabilityConfiguration> PARSER = new b<ViewabilityConfiguration>() { // from class: io.bidmachine.protobuf.sdk.ViewabilityConfiguration.1
        @Override // com.explorestack.protobuf.s1
        public ViewabilityConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new ViewabilityConfiguration(nVar, yVar);
        }
    };
    public static final int RULES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<ViewabilityRule> rules_;

    public static ViewabilityConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ViewabilityConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewabilityConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ViewabilityConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<ViewabilityConfiguration> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewabilityConfiguration)) {
            return super.equals(obj);
        }
        ViewabilityConfiguration viewabilityConfiguration = (ViewabilityConfiguration) obj;
        return getRulesList().equals(viewabilityConfiguration.getRulesList()) && this.unknownFields.equals(viewabilityConfiguration.unknownFields);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<ViewabilityConfiguration> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public ViewabilityRule getRules(int i10) {
        return this.rules_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public List<ViewabilityRule> getRulesList() {
        return this.rules_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public ViewabilityRuleOrBuilder getRulesOrBuilder(int i10) {
        return this.rules_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
    public List<? extends ViewabilityRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.rules_.size(); i11++) {
            iG += CodedOutputStream.G(1, this.rules_.get(i11));
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
        if (getRulesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getRulesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_fieldAccessorTable.d(ViewabilityConfiguration.class, Builder.class);
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
        return new ViewabilityConfiguration();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.rules_.size(); i10++) {
            codedOutputStream.L0(1, this.rules_.get(i10));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements ViewabilityConfigurationOrBuilder {
        private int bitField0_;
        private z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> rulesBuilder_;
        private List<ViewabilityRule> rules_;

        private void ensureRulesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.rules_ = new ArrayList(this.rules_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
        }

        private z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> getRulesFieldBuilder() {
            if (this.rulesBuilder_ == null) {
                this.rulesBuilder_ = new z1<>(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.rules_ = null;
            }
            return this.rulesBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getRulesFieldBuilder();
            }
        }

        public Builder addAllRules(Iterable<? extends ViewabilityRule> iterable) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                ensureRulesIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.rules_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addRules(ViewabilityRule viewabilityRule) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                viewabilityRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(viewabilityRule);
                onChanged();
            } else {
                z1Var.e(viewabilityRule);
            }
            return this;
        }

        public ViewabilityRule.Builder addRulesBuilder() {
            return (ViewabilityRule.Builder) getRulesFieldBuilder().c(ViewabilityRule.getDefaultInstance());
        }

        public Builder clearRules() {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public ViewabilityRule getRules(int i10) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            return z1Var == null ? this.rules_.get(i10) : (ViewabilityRule) z1Var.n(i10);
        }

        public ViewabilityRule.Builder getRulesBuilder(int i10) {
            return (ViewabilityRule.Builder) getRulesFieldBuilder().k(i10);
        }

        public List<ViewabilityRule.Builder> getRulesBuilderList() {
            return getRulesFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public int getRulesCount() {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            return z1Var == null ? this.rules_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public List<ViewabilityRule> getRulesList() {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.rules_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public ViewabilityRuleOrBuilder getRulesOrBuilder(int i10) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            return z1Var == null ? this.rules_.get(i10) : (ViewabilityRuleOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder
        public List<? extends ViewabilityRuleOrBuilder> getRulesOrBuilderList() {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.rules_);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityConfiguration_fieldAccessorTable.d(ViewabilityConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeRules(int i10) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                ensureRulesIsMutable();
                this.rules_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setRules(int i10, ViewabilityRule viewabilityRule) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                viewabilityRule.getClass();
                ensureRulesIsMutable();
                this.rules_.set(i10, viewabilityRule);
                onChanged();
            } else {
                z1Var.w(i10, viewabilityRule);
            }
            return this;
        }

        private Builder() {
            this.rules_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityConfiguration build() {
            ViewabilityConfiguration viewabilityConfigurationBuildPartial = buildPartial();
            if (viewabilityConfigurationBuildPartial.isInitialized()) {
                return viewabilityConfigurationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) viewabilityConfigurationBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityConfiguration buildPartial() {
            ViewabilityConfiguration viewabilityConfiguration = new ViewabilityConfiguration(this);
            int i10 = this.bitField0_;
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                if ((i10 & 1) != 0) {
                    this.rules_ = Collections.unmodifiableList(this.rules_);
                    this.bitField0_ &= -2;
                }
                viewabilityConfiguration.rules_ = this.rules_;
            } else {
                viewabilityConfiguration.rules_ = z1Var.f();
            }
            onBuilt();
            return viewabilityConfiguration;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public ViewabilityConfiguration mo164getDefaultInstanceForType() {
            return ViewabilityConfiguration.getDefaultInstance();
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

        public ViewabilityRule.Builder addRulesBuilder(int i10) {
            return (ViewabilityRule.Builder) getRulesFieldBuilder().b(i10, ViewabilityRule.getDefaultInstance());
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
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.rules_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addRules(int i10, ViewabilityRule viewabilityRule) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                viewabilityRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(i10, viewabilityRule);
                onChanged();
            } else {
                z1Var.d(i10, viewabilityRule);
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
            if (message instanceof ViewabilityConfiguration) {
                return mergeFrom((ViewabilityConfiguration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRules(int i10, ViewabilityRule.Builder builder) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                ensureRulesIsMutable();
                this.rules_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(ViewabilityConfiguration viewabilityConfiguration) {
            if (viewabilityConfiguration == ViewabilityConfiguration.getDefaultInstance()) {
                return this;
            }
            if (this.rulesBuilder_ == null) {
                if (!viewabilityConfiguration.rules_.isEmpty()) {
                    if (this.rules_.isEmpty()) {
                        this.rules_ = viewabilityConfiguration.rules_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRulesIsMutable();
                        this.rules_.addAll(viewabilityConfiguration.rules_);
                    }
                    onChanged();
                }
            } else if (!viewabilityConfiguration.rules_.isEmpty()) {
                if (!this.rulesBuilder_.t()) {
                    this.rulesBuilder_.a(viewabilityConfiguration.rules_);
                } else {
                    this.rulesBuilder_.h();
                    this.rulesBuilder_ = null;
                    this.rules_ = viewabilityConfiguration.rules_;
                    this.bitField0_ &= -2;
                    this.rulesBuilder_ = j0.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) viewabilityConfiguration).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRules(ViewabilityRule.Builder builder) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                ensureRulesIsMutable();
                this.rules_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addRules(int i10, ViewabilityRule.Builder builder) {
            z1<ViewabilityRule, ViewabilityRule.Builder, ViewabilityRuleOrBuilder> z1Var = this.rulesBuilder_;
            if (z1Var == null) {
                ensureRulesIsMutable();
                this.rules_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            ViewabilityConfiguration viewabilityConfiguration = null;
            try {
                try {
                    ViewabilityConfiguration viewabilityConfiguration2 = (ViewabilityConfiguration) ViewabilityConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                    if (viewabilityConfiguration2 != null) {
                        mergeFrom(viewabilityConfiguration2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    ViewabilityConfiguration viewabilityConfiguration3 = (ViewabilityConfiguration) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        viewabilityConfiguration = viewabilityConfiguration3;
                        if (viewabilityConfiguration != null) {
                            mergeFrom(viewabilityConfiguration);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (viewabilityConfiguration != null) {
                    mergeFrom(viewabilityConfiguration);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(ViewabilityConfiguration viewabilityConfiguration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(viewabilityConfiguration);
    }

    public static ViewabilityConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private ViewabilityConfiguration(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ViewabilityConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (ViewabilityConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static ViewabilityConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public ViewabilityConfiguration mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ViewabilityConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ViewabilityConfiguration() {
        this.memoizedIsInitialized = (byte) -1;
        this.rules_ = Collections.emptyList();
    }

    public static ViewabilityConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static ViewabilityConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static ViewabilityConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (ViewabilityConfiguration) j0.parseWithIOException(PARSER, inputStream);
    }

    private ViewabilityConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.rules_ = new ArrayList();
                                z11 |= true;
                            }
                            this.rules_.add((ViewabilityRule) nVar.A(ViewabilityRule.parser(), yVar));
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
                    this.rules_ = Collections.unmodifiableList(this.rules_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.rules_ = Collections.unmodifiableList(this.rules_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static ViewabilityConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (ViewabilityConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static ViewabilityConfiguration parseFrom(n nVar) throws IOException {
        return (ViewabilityConfiguration) j0.parseWithIOException(PARSER, nVar);
    }

    public static ViewabilityConfiguration parseFrom(n nVar, y yVar) throws IOException {
        return (ViewabilityConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
