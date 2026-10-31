package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.m;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
import com.explorestack.protobuf.r2;
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
public final class Reader extends j0 implements ReaderOrBuilder {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int RECORDS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Record> records_;
    private Timestamp timestamp_;
    private static final Reader DEFAULT_INSTANCE = new Reader();
    private static final s1<Reader> PARSER = new b<Reader>() { // from class: io.bidmachine.protobuf.sdk.Reader.1
        @Override // com.explorestack.protobuf.s1
        public Reader parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Reader(nVar, yVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.Reader$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase;

        static {
            int[] iArr = new int[Rule.RuleOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase = iArr;
            try {
                iArr[Rule.RuleOneofCase.GENERAL_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.IOS_LOG_RULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.PUR_RULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[Rule.RuleOneofCase.RULEONEOF_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Configuration extends j0 implements ConfigurationOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int RULES_FIELD_NUMBER = 5;
        public static final int UNIQUE_ONLY_FIELD_NUMBER = 4;
        public static final int UPDATE_INTERVAL_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private StringValue name_;
        private List<Rule> rules_;
        private BoolValue uniqueOnly_;
        private UInt32Value updateInterval_;
        private StringValue url_;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final s1<Configuration> PARSER = new b<Configuration>() { // from class: io.bidmachine.protobuf.sdk.Reader.Configuration.1
            @Override // com.explorestack.protobuf.s1
            public Configuration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Configuration(nVar, yVar);
            }
        };

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
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
            if ((hasUrl() && !getUrl().equals(configuration.getUrl())) || hasUpdateInterval() != configuration.hasUpdateInterval()) {
                return false;
            }
            if ((!hasUpdateInterval() || getUpdateInterval().equals(configuration.getUpdateInterval())) && hasUniqueOnly() == configuration.hasUniqueOnly()) {
                return (!hasUniqueOnly() || getUniqueOnly().equals(configuration.getUniqueOnly())) && getRulesList().equals(configuration.getRulesList()) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public StringValue getName() {
            StringValue stringValue = this.name_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public h2 getNameOrBuilder() {
            return getName();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public Rule getRules(int i10) {
            return this.rules_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public int getRulesCount() {
            return this.rules_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public List<Rule> getRulesList() {
            return this.rules_;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public RuleOrBuilder getRulesOrBuilder(int i10) {
            return this.rules_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public List<? extends RuleOrBuilder> getRulesOrBuilderList() {
            return this.rules_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.name_ != null ? CodedOutputStream.G(1, getName()) + 0 : 0;
            if (this.url_ != null) {
                iG += CodedOutputStream.G(2, getUrl());
            }
            if (this.updateInterval_ != null) {
                iG += CodedOutputStream.G(3, getUpdateInterval());
            }
            if (this.uniqueOnly_ != null) {
                iG += CodedOutputStream.G(4, getUniqueOnly());
            }
            for (int i11 = 0; i11 < this.rules_.size(); i11++) {
                iG += CodedOutputStream.G(5, this.rules_.get(i11));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public BoolValue getUniqueOnly() {
            BoolValue boolValue = this.uniqueOnly_;
            return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public i getUniqueOnlyOrBuilder() {
            return getUniqueOnly();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public UInt32Value getUpdateInterval() {
            UInt32Value uInt32Value = this.updateInterval_;
            return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public r2 getUpdateIntervalOrBuilder() {
            return getUpdateInterval();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public StringValue getUrl() {
            StringValue stringValue = this.url_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public h2 getUrlOrBuilder() {
            return getUrl();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasName() {
            return this.name_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUniqueOnly() {
            return this.uniqueOnly_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
        public boolean hasUpdateInterval() {
            return this.updateInterval_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
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
            if (hasUpdateInterval()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getUpdateInterval().hashCode();
            }
            if (hasUniqueOnly()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getUniqueOnly().hashCode();
            }
            if (getRulesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getRulesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
            if (this.updateInterval_ != null) {
                codedOutputStream.L0(3, getUpdateInterval());
            }
            if (this.uniqueOnly_ != null) {
                codedOutputStream.L0(4, getUniqueOnly());
            }
            for (int i10 = 0; i10 < this.rules_.size(); i10++) {
                codedOutputStream.L0(5, this.rules_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ConfigurationOrBuilder {
            private int bitField0_;
            private e2<StringValue, StringValue.Builder, h2> nameBuilder_;
            private StringValue name_;
            private z1<Rule, Rule.Builder, RuleOrBuilder> rulesBuilder_;
            private List<Rule> rules_;
            private e2<BoolValue, BoolValue.Builder, i> uniqueOnlyBuilder_;
            private BoolValue uniqueOnly_;
            private e2<UInt32Value, UInt32Value.Builder, r2> updateIntervalBuilder_;
            private UInt32Value updateInterval_;
            private e2<StringValue, StringValue.Builder, h2> urlBuilder_;
            private StringValue url_;

            private void ensureRulesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.rules_ = new ArrayList(this.rules_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
            }

            private e2<StringValue, StringValue.Builder, h2> getNameFieldBuilder() {
                if (this.nameBuilder_ == null) {
                    this.nameBuilder_ = new e2<>(getName(), getParentForChildren(), isClean());
                    this.name_ = null;
                }
                return this.nameBuilder_;
            }

            private z1<Rule, Rule.Builder, RuleOrBuilder> getRulesFieldBuilder() {
                if (this.rulesBuilder_ == null) {
                    this.rulesBuilder_ = new z1<>(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.rules_ = null;
                }
                return this.rulesBuilder_;
            }

            private e2<BoolValue, BoolValue.Builder, i> getUniqueOnlyFieldBuilder() {
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnlyBuilder_ = new e2<>(getUniqueOnly(), getParentForChildren(), isClean());
                    this.uniqueOnly_ = null;
                }
                return this.uniqueOnlyBuilder_;
            }

            private e2<UInt32Value, UInt32Value.Builder, r2> getUpdateIntervalFieldBuilder() {
                if (this.updateIntervalBuilder_ == null) {
                    this.updateIntervalBuilder_ = new e2<>(getUpdateInterval(), getParentForChildren(), isClean());
                    this.updateInterval_ = null;
                }
                return this.updateIntervalBuilder_;
            }

            private e2<StringValue, StringValue.Builder, h2> getUrlFieldBuilder() {
                if (this.urlBuilder_ == null) {
                    this.urlBuilder_ = new e2<>(getUrl(), getParentForChildren(), isClean());
                    this.url_ = null;
                }
                return this.urlBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getRulesFieldBuilder();
                }
            }

            public Builder addAllRules(Iterable<? extends Rule> iterable) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    ensureRulesIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.rules_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addRules(Rule rule) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    rule.getClass();
                    ensureRulesIsMutable();
                    this.rules_.add(rule);
                    onChanged();
                } else {
                    z1Var.e(rule);
                }
                return this;
            }

            public Rule.Builder addRulesBuilder() {
                return (Rule.Builder) getRulesFieldBuilder().c(Rule.getDefaultInstance());
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

            public Builder clearRules() {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    this.rules_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearUniqueOnly() {
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnly_ = null;
                    onChanged();
                } else {
                    this.uniqueOnly_ = null;
                    this.uniqueOnlyBuilder_ = null;
                }
                return this;
            }

            public Builder clearUpdateInterval() {
                if (this.updateIntervalBuilder_ == null) {
                    this.updateInterval_ = null;
                    onChanged();
                } else {
                    this.updateInterval_ = null;
                    this.updateIntervalBuilder_ = null;
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

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public h2 getNameOrBuilder() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.nameBuilder_;
                if (e2Var != null) {
                    return (h2) e2Var.f();
                }
                StringValue stringValue = this.name_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public Rule getRules(int i10) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                return z1Var == null ? this.rules_.get(i10) : (Rule) z1Var.n(i10);
            }

            public Rule.Builder getRulesBuilder(int i10) {
                return (Rule.Builder) getRulesFieldBuilder().k(i10);
            }

            public List<Rule.Builder> getRulesBuilderList() {
                return getRulesFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public int getRulesCount() {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                return z1Var == null ? this.rules_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public List<Rule> getRulesList() {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.rules_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public RuleOrBuilder getRulesOrBuilder(int i10) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                return z1Var == null ? this.rules_.get(i10) : (RuleOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public List<? extends RuleOrBuilder> getRulesOrBuilderList() {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.rules_);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public BoolValue getUniqueOnly() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.uniqueOnlyBuilder_;
                if (e2Var != null) {
                    return (BoolValue) e2Var.e();
                }
                BoolValue boolValue = this.uniqueOnly_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            public BoolValue.Builder getUniqueOnlyBuilder() {
                onChanged();
                return (BoolValue.Builder) getUniqueOnlyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public i getUniqueOnlyOrBuilder() {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.uniqueOnlyBuilder_;
                if (e2Var != null) {
                    return (i) e2Var.f();
                }
                BoolValue boolValue = this.uniqueOnly_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public UInt32Value getUpdateInterval() {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.updateIntervalBuilder_;
                if (e2Var != null) {
                    return (UInt32Value) e2Var.e();
                }
                UInt32Value uInt32Value = this.updateInterval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            public UInt32Value.Builder getUpdateIntervalBuilder() {
                onChanged();
                return (UInt32Value.Builder) getUpdateIntervalFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public r2 getUpdateIntervalOrBuilder() {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.updateIntervalBuilder_;
                if (e2Var != null) {
                    return (r2) e2Var.f();
                }
                UInt32Value uInt32Value = this.updateInterval_;
                return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public h2 getUrlOrBuilder() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.urlBuilder_;
                if (e2Var != null) {
                    return (h2) e2Var.f();
                }
                StringValue stringValue = this.url_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasName() {
                return (this.nameBuilder_ == null && this.name_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUniqueOnly() {
                return (this.uniqueOnlyBuilder_ == null && this.uniqueOnly_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUpdateInterval() {
                return (this.updateIntervalBuilder_ == null && this.updateInterval_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.ConfigurationOrBuilder
            public boolean hasUrl() {
                return (this.urlBuilder_ == null && this.url_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
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

            public Builder mergeUniqueOnly(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.uniqueOnlyBuilder_;
                if (e2Var == null) {
                    BoolValue boolValue2 = this.uniqueOnly_;
                    if (boolValue2 != null) {
                        this.uniqueOnly_ = BoolValue.newBuilder(boolValue2).mergeFrom(boolValue).buildPartial();
                    } else {
                        this.uniqueOnly_ = boolValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(boolValue);
                }
                return this;
            }

            public Builder mergeUpdateInterval(UInt32Value uInt32Value) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.updateIntervalBuilder_;
                if (e2Var == null) {
                    UInt32Value uInt32Value2 = this.updateInterval_;
                    if (uInt32Value2 != null) {
                        this.updateInterval_ = UInt32Value.newBuilder(uInt32Value2).mergeFrom(uInt32Value).buildPartial();
                    } else {
                        this.updateInterval_ = uInt32Value;
                    }
                    onChanged();
                } else {
                    e2Var.g(uInt32Value);
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

            public Builder removeRules(int i10) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    ensureRulesIsMutable();
                    this.rules_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
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

            public Builder setRules(int i10, Rule rule) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    rule.getClass();
                    ensureRulesIsMutable();
                    this.rules_.set(i10, rule);
                    onChanged();
                } else {
                    z1Var.w(i10, rule);
                }
                return this;
            }

            public Builder setUniqueOnly(BoolValue boolValue) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.uniqueOnlyBuilder_;
                if (e2Var == null) {
                    boolValue.getClass();
                    this.uniqueOnly_ = boolValue;
                    onChanged();
                } else {
                    e2Var.i(boolValue);
                }
                return this;
            }

            public Builder setUpdateInterval(UInt32Value uInt32Value) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.updateIntervalBuilder_;
                if (e2Var == null) {
                    uInt32Value.getClass();
                    this.updateInterval_ = uInt32Value;
                    onChanged();
                } else {
                    e2Var.i(uInt32Value);
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
                this.rules_ = Collections.emptyList();
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
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var3 = this.updateIntervalBuilder_;
                if (e2Var3 == null) {
                    configuration.updateInterval_ = this.updateInterval_;
                } else {
                    configuration.updateInterval_ = (UInt32Value) e2Var3.a();
                }
                e2<BoolValue, BoolValue.Builder, i> e2Var4 = this.uniqueOnlyBuilder_;
                if (e2Var4 == null) {
                    configuration.uniqueOnly_ = this.uniqueOnly_;
                } else {
                    configuration.uniqueOnly_ = (BoolValue) e2Var4.a();
                }
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var != null) {
                    configuration.rules_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.rules_ = Collections.unmodifiableList(this.rules_);
                        this.bitField0_ &= -2;
                    }
                    configuration.rules_ = this.rules_;
                }
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

            public Rule.Builder addRulesBuilder(int i10) {
                return (Rule.Builder) getRulesFieldBuilder().b(i10, Rule.getDefaultInstance());
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
                if (this.updateIntervalBuilder_ == null) {
                    this.updateInterval_ = null;
                } else {
                    this.updateInterval_ = null;
                    this.updateIntervalBuilder_ = null;
                }
                if (this.uniqueOnlyBuilder_ == null) {
                    this.uniqueOnly_ = null;
                } else {
                    this.uniqueOnly_ = null;
                    this.uniqueOnlyBuilder_ = null;
                }
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
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

            public Builder setUniqueOnly(BoolValue.Builder builder) {
                e2<BoolValue, BoolValue.Builder, i> e2Var = this.uniqueOnlyBuilder_;
                if (e2Var == null) {
                    this.uniqueOnly_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setUpdateInterval(UInt32Value.Builder builder) {
                e2<UInt32Value, UInt32Value.Builder, r2> e2Var = this.updateIntervalBuilder_;
                if (e2Var == null) {
                    this.updateInterval_ = builder.build();
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

            public Builder addRules(int i10, Rule rule) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    rule.getClass();
                    ensureRulesIsMutable();
                    this.rules_.add(i10, rule);
                    onChanged();
                } else {
                    z1Var.d(i10, rule);
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

            public Builder setRules(int i10, Rule.Builder builder) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    ensureRulesIsMutable();
                    this.rules_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
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
                if (configuration.hasUpdateInterval()) {
                    mergeUpdateInterval(configuration.getUpdateInterval());
                }
                if (configuration.hasUniqueOnly()) {
                    mergeUniqueOnly(configuration.getUniqueOnly());
                }
                if (this.rulesBuilder_ == null) {
                    if (!configuration.rules_.isEmpty()) {
                        if (this.rules_.isEmpty()) {
                            this.rules_ = configuration.rules_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureRulesIsMutable();
                            this.rules_.addAll(configuration.rules_);
                        }
                        onChanged();
                    }
                } else if (!configuration.rules_.isEmpty()) {
                    if (!this.rulesBuilder_.t()) {
                        this.rulesBuilder_.a(configuration.rules_);
                    } else {
                        this.rulesBuilder_.h();
                        this.rulesBuilder_ = null;
                        this.rules_ = configuration.rules_;
                        this.bitField0_ &= -2;
                        this.rulesBuilder_ = j0.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) configuration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addRules(Rule.Builder builder) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
                if (z1Var == null) {
                    ensureRulesIsMutable();
                    this.rules_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addRules(int i10, Rule.Builder builder) {
                z1<Rule, Rule.Builder, RuleOrBuilder> z1Var = this.rulesBuilder_;
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

        private Configuration() {
            this.memoizedIsInitialized = (byte) -1;
            this.rules_ = Collections.emptyList();
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
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
            boolean z11 = false;
            while (!z10) {
                try {
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
                                    UInt32Value uInt32Value = this.updateInterval_;
                                    UInt32Value.Builder builder3 = uInt32Value != null ? uInt32Value.toBuilder() : null;
                                    UInt32Value uInt32Value2 = (UInt32Value) nVar.A(UInt32Value.parser(), yVar);
                                    this.updateInterval_ = uInt32Value2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(uInt32Value2);
                                        this.updateInterval_ = builder3.buildPartial();
                                    }
                                } else if (iK == 34) {
                                    BoolValue boolValue = this.uniqueOnly_;
                                    BoolValue.Builder builder4 = boolValue != null ? boolValue.toBuilder() : null;
                                    BoolValue boolValue2 = (BoolValue) nVar.A(BoolValue.parser(), yVar);
                                    this.uniqueOnly_ = boolValue2;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(boolValue2);
                                        this.uniqueOnly_ = builder4.buildPartial();
                                    }
                                } else if (iK != 42) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    boolean z12 = (z11 ? 1 : 0) & true;
                                    z11 = z11;
                                    if (!z12) {
                                        this.rules_ = new ArrayList();
                                        z11 = (z11 ? 1 : 0) | true;
                                    }
                                    this.rules_.add((Rule) nVar.A(Rule.parser(), yVar));
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
                    if ((z11 ? 1 : 0) & true) {
                        this.rules_ = Collections.unmodifiableList(this.rules_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((z11 ? 1 : 0) & true) {
                this.rules_ = Collections.unmodifiableList(this.rules_);
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
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        StringValue getName();

        h2 getNameOrBuilder();

        Rule getRules(int i10);

        int getRulesCount();

        List<Rule> getRulesList();

        RuleOrBuilder getRulesOrBuilder(int i10);

        List<? extends RuleOrBuilder> getRulesOrBuilderList();

        BoolValue getUniqueOnly();

        i getUniqueOnlyOrBuilder();

        UInt32Value getUpdateInterval();

        r2 getUpdateIntervalOrBuilder();

        StringValue getUrl();

        h2 getUrlOrBuilder();

        boolean hasName();

        boolean hasUniqueOnly();

        boolean hasUpdateInterval();

        boolean hasUrl();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Record extends j0 implements RecordOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int RAW_DATA_FIELD_NUMBER = 2;
        public static final int RULE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Error error_;
        private byte memoizedIsInitialized;
        private BytesValue rawData_;
        private Rule rule_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final s1<Record> PARSER = new b<Record>() { // from class: io.bidmachine.protobuf.sdk.Reader.Record.1
            @Override // com.explorestack.protobuf.s1
            public Record parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Record(nVar, yVar);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
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
            if (hasRule() != record.hasRule()) {
                return false;
            }
            if ((hasRule() && !getRule().equals(record.getRule())) || hasRawData() != record.hasRawData()) {
                return false;
            }
            if ((!hasRawData() || getRawData().equals(record.getRawData())) && hasError() == record.hasError()) {
                return (!hasError() || getError().equals(record.getError())) && this.unknownFields.equals(record.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public Error getError() {
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            return getError();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Record> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public BytesValue getRawData() {
            BytesValue bytesValue = this.rawData_;
            return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public m getRawDataOrBuilder() {
            return getRawData();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public Rule getRule() {
            Rule rule = this.rule_;
            return rule == null ? Rule.getDefaultInstance() : rule;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public RuleOrBuilder getRuleOrBuilder() {
            return getRule();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.rule_ != null ? 0 + CodedOutputStream.G(1, getRule()) : 0;
            if (this.rawData_ != null) {
                iG += CodedOutputStream.G(2, getRawData());
            }
            if (this.error_ != null) {
                iG += CodedOutputStream.G(3, getError());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasError() {
            return this.error_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasRawData() {
            return this.rawData_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
        public boolean hasRule() {
            return this.rule_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasRule()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getRule().hashCode();
            }
            if (hasRawData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRawData().hashCode();
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
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable.d(Record.class, Builder.class);
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
            if (this.rule_ != null) {
                codedOutputStream.L0(1, getRule());
            }
            if (this.rawData_ != null) {
                codedOutputStream.L0(2, getRawData());
            }
            if (this.error_ != null) {
                codedOutputStream.L0(3, getError());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements RecordOrBuilder {
            private e2<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
            private Error error_;
            private e2<BytesValue, BytesValue.Builder, m> rawDataBuilder_;
            private BytesValue rawData_;
            private e2<Rule, Rule.Builder, RuleOrBuilder> ruleBuilder_;
            private Rule rule_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
            }

            private e2<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                if (this.errorBuilder_ == null) {
                    this.errorBuilder_ = new e2<>(getError(), getParentForChildren(), isClean());
                    this.error_ = null;
                }
                return this.errorBuilder_;
            }

            private e2<BytesValue, BytesValue.Builder, m> getRawDataFieldBuilder() {
                if (this.rawDataBuilder_ == null) {
                    this.rawDataBuilder_ = new e2<>(getRawData(), getParentForChildren(), isClean());
                    this.rawData_ = null;
                }
                return this.rawDataBuilder_;
            }

            private e2<Rule, Rule.Builder, RuleOrBuilder> getRuleFieldBuilder() {
                if (this.ruleBuilder_ == null) {
                    this.ruleBuilder_ = new e2<>(getRule(), getParentForChildren(), isClean());
                    this.rule_ = null;
                }
                return this.ruleBuilder_;
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

            public Builder clearRawData() {
                if (this.rawDataBuilder_ == null) {
                    this.rawData_ = null;
                    onChanged();
                } else {
                    this.rawData_ = null;
                    this.rawDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearRule() {
                if (this.ruleBuilder_ == null) {
                    this.rule_ = null;
                    onChanged();
                } else {
                    this.rule_ = null;
                    this.ruleBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                if (e2Var != null) {
                    return (ErrorOrBuilder) e2Var.f();
                }
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public BytesValue getRawData() {
                e2<BytesValue, BytesValue.Builder, m> e2Var = this.rawDataBuilder_;
                if (e2Var != null) {
                    return (BytesValue) e2Var.e();
                }
                BytesValue bytesValue = this.rawData_;
                return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
            }

            public BytesValue.Builder getRawDataBuilder() {
                onChanged();
                return (BytesValue.Builder) getRawDataFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public m getRawDataOrBuilder() {
                e2<BytesValue, BytesValue.Builder, m> e2Var = this.rawDataBuilder_;
                if (e2Var != null) {
                    return (m) e2Var.f();
                }
                BytesValue bytesValue = this.rawData_;
                return bytesValue == null ? BytesValue.getDefaultInstance() : bytesValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public Rule getRule() {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var != null) {
                    return (Rule) e2Var.e();
                }
                Rule rule = this.rule_;
                return rule == null ? Rule.getDefaultInstance() : rule;
            }

            public Rule.Builder getRuleBuilder() {
                onChanged();
                return (Rule.Builder) getRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public RuleOrBuilder getRuleOrBuilder() {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var != null) {
                    return (RuleOrBuilder) e2Var.f();
                }
                Rule rule = this.rule_;
                return rule == null ? Rule.getDefaultInstance() : rule;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasError() {
                return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasRawData() {
                return (this.rawDataBuilder_ == null && this.rawData_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RecordOrBuilder
            public boolean hasRule() {
                return (this.ruleBuilder_ == null && this.rule_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable.d(Record.class, Builder.class);
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

            public Builder mergeRawData(BytesValue bytesValue) {
                e2<BytesValue, BytesValue.Builder, m> e2Var = this.rawDataBuilder_;
                if (e2Var == null) {
                    BytesValue bytesValue2 = this.rawData_;
                    if (bytesValue2 != null) {
                        this.rawData_ = BytesValue.newBuilder(bytesValue2).mergeFrom(bytesValue).buildPartial();
                    } else {
                        this.rawData_ = bytesValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(bytesValue);
                }
                return this;
            }

            public Builder mergeRule(Rule rule) {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    Rule rule2 = this.rule_;
                    if (rule2 != null) {
                        this.rule_ = Rule.newBuilder(rule2).mergeFrom(rule).buildPartial();
                    } else {
                        this.rule_ = rule;
                    }
                    onChanged();
                } else {
                    e2Var.g(rule);
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

            public Builder setRawData(BytesValue bytesValue) {
                e2<BytesValue, BytesValue.Builder, m> e2Var = this.rawDataBuilder_;
                if (e2Var == null) {
                    bytesValue.getClass();
                    this.rawData_ = bytesValue;
                    onChanged();
                } else {
                    e2Var.i(bytesValue);
                }
                return this;
            }

            public Builder setRule(Rule rule) {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    rule.getClass();
                    this.rule_ = rule;
                    onChanged();
                } else {
                    e2Var.i(rule);
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
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    record.rule_ = this.rule_;
                } else {
                    record.rule_ = (Rule) e2Var.a();
                }
                e2<BytesValue, BytesValue.Builder, m> e2Var2 = this.rawDataBuilder_;
                if (e2Var2 == null) {
                    record.rawData_ = this.rawData_;
                } else {
                    record.rawData_ = (BytesValue) e2Var2.a();
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
                if (this.ruleBuilder_ == null) {
                    this.rule_ = null;
                } else {
                    this.rule_ = null;
                    this.ruleBuilder_ = null;
                }
                if (this.rawDataBuilder_ == null) {
                    this.rawData_ = null;
                } else {
                    this.rawData_ = null;
                    this.rawDataBuilder_ = null;
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

            public Builder setRawData(BytesValue.Builder builder) {
                e2<BytesValue, BytesValue.Builder, m> e2Var = this.rawDataBuilder_;
                if (e2Var == null) {
                    this.rawData_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setRule(Rule.Builder builder) {
                e2<Rule, Rule.Builder, RuleOrBuilder> e2Var = this.ruleBuilder_;
                if (e2Var == null) {
                    this.rule_ = builder.build();
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
                if (record.hasRule()) {
                    mergeRule(record.getRule());
                }
                if (record.hasRawData()) {
                    mergeRawData(record.getRawData());
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
                                Rule rule = this.rule_;
                                Rule.Builder builder = rule != null ? rule.toBuilder() : null;
                                Rule rule2 = (Rule) nVar.A(Rule.parser(), yVar);
                                this.rule_ = rule2;
                                if (builder != null) {
                                    builder.mergeFrom(rule2);
                                    this.rule_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                BytesValue bytesValue = this.rawData_;
                                BytesValue.Builder builder2 = bytesValue != null ? bytesValue.toBuilder() : null;
                                BytesValue bytesValue2 = (BytesValue) nVar.A(BytesValue.parser(), yVar);
                                this.rawData_ = bytesValue2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(bytesValue2);
                                    this.rawData_ = builder2.buildPartial();
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

        BytesValue getRawData();

        m getRawDataOrBuilder();

        Rule getRule();

        RuleOrBuilder getRuleOrBuilder();

        boolean hasError();

        boolean hasRawData();

        boolean hasRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Rule extends j0 implements RuleOrBuilder {
        public static final int GENERAL_RULE_FIELD_NUMBER = 1;
        public static final int IOS_LOG_RULE_FIELD_NUMBER = 2;
        public static final int PUR_RULE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int ruleOneofCase_;
        private Object ruleOneof_;
        private static final Rule DEFAULT_INSTANCE = new Rule();
        private static final s1<Rule> PARSER = new b<Rule>() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.1
            @Override // com.explorestack.protobuf.s1
            public Rule parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Rule(nVar, yVar);
            }
        };

        public static final class GeneralRule extends j0 implements GeneralRuleOrBuilder {
            private static final GeneralRule DEFAULT_INSTANCE = new GeneralRule();
            private static final s1<GeneralRule> PARSER = new b<GeneralRule>() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRule.1
                @Override // com.explorestack.protobuf.s1
                public GeneralRule parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new GeneralRule(nVar, yVar);
                }
            };
            public static final int PATH_FIELD_NUMBER = 2;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private StringValue path_;
            private StringValue tag_;

            public static GeneralRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static GeneralRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (GeneralRule) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static GeneralRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<GeneralRule> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GeneralRule)) {
                    return super.equals(obj);
                }
                GeneralRule generalRule = (GeneralRule) obj;
                if (hasTag() != generalRule.hasTag()) {
                    return false;
                }
                if ((!hasTag() || getTag().equals(generalRule.getTag())) && hasPath() == generalRule.hasPath()) {
                    return (!hasPath() || getPath().equals(generalRule.getPath())) && this.unknownFields.equals(generalRule.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<GeneralRule> getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public StringValue getPath() {
                StringValue stringValue = this.path_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public h2 getPathOrBuilder() {
                return getPath();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.tag_ != null ? 0 + CodedOutputStream.G(1, getTag()) : 0;
                if (this.path_ != null) {
                    iG += CodedOutputStream.G(2, getPath());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public h2 getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public boolean hasPath() {
                return this.path_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasTag()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTag().hashCode();
                }
                if (hasPath()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPath().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable.d(GeneralRule.class, Builder.class);
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
                return new GeneralRule();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.tag_ != null) {
                    codedOutputStream.L0(1, getTag());
                }
                if (this.path_ != null) {
                    codedOutputStream.L0(2, getPath());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements GeneralRuleOrBuilder {
                private e2<StringValue, StringValue.Builder, h2> pathBuilder_;
                private StringValue path_;
                private e2<StringValue, StringValue.Builder, h2> tagBuilder_;
                private StringValue tag_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
                }

                private e2<StringValue, StringValue.Builder, h2> getPathFieldBuilder() {
                    if (this.pathBuilder_ == null) {
                        this.pathBuilder_ = new e2<>(getPath(), getParentForChildren(), isClean());
                        this.path_ = null;
                    }
                    return this.pathBuilder_;
                }

                private e2<StringValue, StringValue.Builder, h2> getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new e2<>(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = j0.alwaysUseFieldBuilders;
                }

                public Builder clearPath() {
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        onChanged();
                    } else {
                        this.path_ = null;
                        this.pathBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public StringValue getPath() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getPathBuilder() {
                    onChanged();
                    return (StringValue.Builder) getPathFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public h2 getPathOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public StringValue getTag() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public h2 getTagOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public boolean hasPath() {
                    return (this.pathBuilder_ == null && this.path_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.GeneralRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable.d(GeneralRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergePath(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.path_;
                        if (stringValue2 != null) {
                            this.path_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.path_ = stringValue;
                        }
                        onChanged();
                    } else {
                        e2Var.g(stringValue);
                    }
                    return this;
                }

                public Builder mergeTag(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.tag_;
                        if (stringValue2 != null) {
                            this.tag_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.tag_ = stringValue;
                        }
                        onChanged();
                    } else {
                        e2Var.g(stringValue);
                    }
                    return this;
                }

                public Builder setPath(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.path_ = stringValue;
                        onChanged();
                    } else {
                        e2Var.i(stringValue);
                    }
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.tag_ = stringValue;
                        onChanged();
                    } else {
                        e2Var.i(stringValue);
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
                public GeneralRule build() {
                    GeneralRule generalRuleBuildPartial = buildPartial();
                    if (generalRuleBuildPartial.isInitialized()) {
                        return generalRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) generalRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public GeneralRule buildPartial() {
                    GeneralRule generalRule = new GeneralRule(this);
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        generalRule.tag_ = this.tag_;
                    } else {
                        generalRule.tag_ = (StringValue) e2Var.a();
                    }
                    e2<StringValue, StringValue.Builder, h2> e2Var2 = this.pathBuilder_;
                    if (e2Var2 == null) {
                        generalRule.path_ = this.path_;
                    } else {
                        generalRule.path_ = (StringValue) e2Var2.a();
                    }
                    onBuilt();
                    return generalRule;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public GeneralRule mo164getDefaultInstanceForType() {
                    return GeneralRule.getDefaultInstance();
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                    } else {
                        this.path_ = null;
                        this.pathBuilder_ = null;
                    }
                    return this;
                }

                public Builder setPath(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var == null) {
                        this.path_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        this.tag_ = builder.build();
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
                    if (message instanceof GeneralRule) {
                        return mergeFrom((GeneralRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(GeneralRule generalRule) {
                    if (generalRule == GeneralRule.getDefaultInstance()) {
                        return this;
                    }
                    if (generalRule.hasTag()) {
                        mergeTag(generalRule.getTag());
                    }
                    if (generalRule.hasPath()) {
                        mergePath(generalRule.getPath());
                    }
                    mergeUnknownFields(((j0) generalRule).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    GeneralRule generalRule = null;
                    try {
                        try {
                            GeneralRule generalRule2 = (GeneralRule) GeneralRule.PARSER.parsePartialFrom(nVar, yVar);
                            if (generalRule2 != null) {
                                mergeFrom(generalRule2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            GeneralRule generalRule3 = (GeneralRule) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                generalRule = generalRule3;
                                if (generalRule != null) {
                                    mergeFrom(generalRule);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (generalRule != null) {
                            mergeFrom(generalRule);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(GeneralRule generalRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(generalRule);
            }

            public static GeneralRule parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private GeneralRule(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GeneralRule parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (GeneralRule) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static GeneralRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public GeneralRule mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static GeneralRule parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private GeneralRule() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static GeneralRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static GeneralRule parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            private GeneralRule(n nVar, y yVar) throws InvalidProtocolBufferException {
                StringValue.Builder builder;
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
                                    StringValue stringValue = this.tag_;
                                    builder = stringValue != null ? stringValue.toBuilder() : null;
                                    StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                    this.tag_ = stringValue2;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue2);
                                        this.tag_ = builder.buildPartial();
                                    }
                                } else if (iK != 18) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    StringValue stringValue3 = this.path_;
                                    builder = stringValue3 != null ? stringValue3.toBuilder() : null;
                                    StringValue stringValue4 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                    this.path_ = stringValue4;
                                    if (builder != null) {
                                        builder.mergeFrom(stringValue4);
                                        this.path_ = builder.buildPartial();
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

            public static GeneralRule parseFrom(InputStream inputStream) throws IOException {
                return (GeneralRule) j0.parseWithIOException(PARSER, inputStream);
            }

            public static GeneralRule parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (GeneralRule) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static GeneralRule parseFrom(n nVar) throws IOException {
                return (GeneralRule) j0.parseWithIOException(PARSER, nVar);
            }

            public static GeneralRule parseFrom(n nVar, y yVar) throws IOException {
                return (GeneralRule) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface GeneralRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            StringValue getPath();

            h2 getPathOrBuilder();

            StringValue getTag();

            h2 getTagOrBuilder();

            boolean hasPath();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class IOSLogRule extends j0 implements IOSLogRuleOrBuilder {
            public static final int LEVELS_FIELD_NUMBER = 2;
            public static final int SOURCES_FIELD_NUMBER = 3;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<StringValue> levels_;
            private byte memoizedIsInitialized;
            private List<StringValue> sources_;
            private StringValue tag_;
            private static final IOSLogRule DEFAULT_INSTANCE = new IOSLogRule();
            private static final s1<IOSLogRule> PARSER = new b<IOSLogRule>() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRule.1
                @Override // com.explorestack.protobuf.s1
                public IOSLogRule parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new IOSLogRule(nVar, yVar);
                }
            };

            public static IOSLogRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static IOSLogRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (IOSLogRule) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static IOSLogRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<IOSLogRule> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof IOSLogRule)) {
                    return super.equals(obj);
                }
                IOSLogRule iOSLogRule = (IOSLogRule) obj;
                if (hasTag() != iOSLogRule.hasTag()) {
                    return false;
                }
                return (!hasTag() || getTag().equals(iOSLogRule.getTag())) && getLevelsList().equals(iOSLogRule.getLevelsList()) && getSourcesList().equals(iOSLogRule.getSourcesList()) && this.unknownFields.equals(iOSLogRule.unknownFields);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getLevels(int i10) {
                return this.levels_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public int getLevelsCount() {
                return this.levels_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<StringValue> getLevelsList() {
                return this.levels_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public h2 getLevelsOrBuilder(int i10) {
                return this.levels_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<? extends h2> getLevelsOrBuilderList() {
                return this.levels_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<IOSLogRule> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.tag_ != null ? CodedOutputStream.G(1, getTag()) + 0 : 0;
                for (int i11 = 0; i11 < this.levels_.size(); i11++) {
                    iG += CodedOutputStream.G(2, this.levels_.get(i11));
                }
                for (int i12 = 0; i12 < this.sources_.size(); i12++) {
                    iG += CodedOutputStream.G(3, this.sources_.get(i12));
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getSources(int i10) {
                return this.sources_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public int getSourcesCount() {
                return this.sources_.size();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<StringValue> getSourcesList() {
                return this.sources_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public h2 getSourcesOrBuilder(int i10) {
                return this.sources_.get(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public List<? extends h2> getSourcesOrBuilderList() {
                return this.sources_;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public h2 getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasTag()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTag().hashCode();
                }
                if (getLevelsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getLevelsList().hashCode();
                }
                if (getSourcesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getSourcesList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable.d(IOSLogRule.class, Builder.class);
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
                return new IOSLogRule();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.tag_ != null) {
                    codedOutputStream.L0(1, getTag());
                }
                for (int i10 = 0; i10 < this.levels_.size(); i10++) {
                    codedOutputStream.L0(2, this.levels_.get(i10));
                }
                for (int i11 = 0; i11 < this.sources_.size(); i11++) {
                    codedOutputStream.L0(3, this.sources_.get(i11));
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements IOSLogRuleOrBuilder {
                private int bitField0_;
                private z1<StringValue, StringValue.Builder, h2> levelsBuilder_;
                private List<StringValue> levels_;
                private z1<StringValue, StringValue.Builder, h2> sourcesBuilder_;
                private List<StringValue> sources_;
                private e2<StringValue, StringValue.Builder, h2> tagBuilder_;
                private StringValue tag_;

                private void ensureLevelsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.levels_ = new ArrayList(this.levels_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureSourcesIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.sources_ = new ArrayList(this.sources_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
                }

                private z1<StringValue, StringValue.Builder, h2> getLevelsFieldBuilder() {
                    if (this.levelsBuilder_ == null) {
                        this.levelsBuilder_ = new z1<>(this.levels_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.levels_ = null;
                    }
                    return this.levelsBuilder_;
                }

                private z1<StringValue, StringValue.Builder, h2> getSourcesFieldBuilder() {
                    if (this.sourcesBuilder_ == null) {
                        this.sourcesBuilder_ = new z1<>(this.sources_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.sources_ = null;
                    }
                    return this.sourcesBuilder_;
                }

                private e2<StringValue, StringValue.Builder, h2> getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new e2<>(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getLevelsFieldBuilder();
                        getSourcesFieldBuilder();
                    }
                }

                public Builder addAllLevels(Iterable<? extends StringValue> iterable) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        ensureLevelsIsMutable();
                        a.AbstractC0128a.addAll((Iterable) iterable, (List) this.levels_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addAllSources(Iterable<? extends StringValue> iterable) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        ensureSourcesIsMutable();
                        a.AbstractC0128a.addAll((Iterable) iterable, (List) this.sources_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addLevels(StringValue stringValue) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        stringValue.getClass();
                        ensureLevelsIsMutable();
                        this.levels_.add(stringValue);
                        onChanged();
                    } else {
                        z1Var.e(stringValue);
                    }
                    return this;
                }

                public StringValue.Builder addLevelsBuilder() {
                    return (StringValue.Builder) getLevelsFieldBuilder().c(StringValue.getDefaultInstance());
                }

                public Builder addSources(StringValue stringValue) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        stringValue.getClass();
                        ensureSourcesIsMutable();
                        this.sources_.add(stringValue);
                        onChanged();
                    } else {
                        z1Var.e(stringValue);
                    }
                    return this;
                }

                public StringValue.Builder addSourcesBuilder() {
                    return (StringValue.Builder) getSourcesFieldBuilder().c(StringValue.getDefaultInstance());
                }

                public Builder clearLevels() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        this.levels_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearSources() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        this.sources_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getLevels(int i10) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    return z1Var == null ? this.levels_.get(i10) : (StringValue) z1Var.n(i10);
                }

                public StringValue.Builder getLevelsBuilder(int i10) {
                    return (StringValue.Builder) getLevelsFieldBuilder().k(i10);
                }

                public List<StringValue.Builder> getLevelsBuilderList() {
                    return getLevelsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public int getLevelsCount() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    return z1Var == null ? this.levels_.size() : z1Var.m();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<StringValue> getLevelsList() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.levels_) : z1Var.p();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public h2 getLevelsOrBuilder(int i10) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    return z1Var == null ? this.levels_.get(i10) : (h2) z1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<? extends h2> getLevelsOrBuilderList() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.levels_);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getSources(int i10) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    return z1Var == null ? this.sources_.get(i10) : (StringValue) z1Var.n(i10);
                }

                public StringValue.Builder getSourcesBuilder(int i10) {
                    return (StringValue.Builder) getSourcesFieldBuilder().k(i10);
                }

                public List<StringValue.Builder> getSourcesBuilderList() {
                    return getSourcesFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public int getSourcesCount() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    return z1Var == null ? this.sources_.size() : z1Var.m();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<StringValue> getSourcesList() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.sources_) : z1Var.p();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public h2 getSourcesOrBuilder(int i10) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    return z1Var == null ? this.sources_.get(i10) : (h2) z1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public List<? extends h2> getSourcesOrBuilderList() {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.sources_);
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public StringValue getTag() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public h2 getTagOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.IOSLogRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable.d(IOSLogRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeTag(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.tag_;
                        if (stringValue2 != null) {
                            this.tag_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.tag_ = stringValue;
                        }
                        onChanged();
                    } else {
                        e2Var.g(stringValue);
                    }
                    return this;
                }

                public Builder removeLevels(int i10) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder removeSources(int i10) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setLevels(int i10, StringValue stringValue) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        stringValue.getClass();
                        ensureLevelsIsMutable();
                        this.levels_.set(i10, stringValue);
                        onChanged();
                    } else {
                        z1Var.w(i10, stringValue);
                    }
                    return this;
                }

                public Builder setSources(int i10, StringValue stringValue) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        stringValue.getClass();
                        ensureSourcesIsMutable();
                        this.sources_.set(i10, stringValue);
                        onChanged();
                    } else {
                        z1Var.w(i10, stringValue);
                    }
                    return this;
                }

                public Builder setTag(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.tag_ = stringValue;
                        onChanged();
                    } else {
                        e2Var.i(stringValue);
                    }
                    return this;
                }

                private Builder() {
                    this.levels_ = Collections.emptyList();
                    this.sources_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public IOSLogRule build() {
                    IOSLogRule iOSLogRuleBuildPartial = buildPartial();
                    if (iOSLogRuleBuildPartial.isInitialized()) {
                        return iOSLogRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) iOSLogRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public IOSLogRule buildPartial() {
                    IOSLogRule iOSLogRule = new IOSLogRule(this);
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        iOSLogRule.tag_ = this.tag_;
                    } else {
                        iOSLogRule.tag_ = (StringValue) e2Var.a();
                    }
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var != null) {
                        iOSLogRule.levels_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.levels_ = Collections.unmodifiableList(this.levels_);
                            this.bitField0_ &= -2;
                        }
                        iOSLogRule.levels_ = this.levels_;
                    }
                    z1<StringValue, StringValue.Builder, h2> z1Var2 = this.sourcesBuilder_;
                    if (z1Var2 != null) {
                        iOSLogRule.sources_ = z1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.sources_ = Collections.unmodifiableList(this.sources_);
                            this.bitField0_ &= -3;
                        }
                        iOSLogRule.sources_ = this.sources_;
                    }
                    onBuilt();
                    return iOSLogRule;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public IOSLogRule mo164getDefaultInstanceForType() {
                    return IOSLogRule.getDefaultInstance();
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

                public StringValue.Builder addLevelsBuilder(int i10) {
                    return (StringValue.Builder) getLevelsFieldBuilder().b(i10, StringValue.getDefaultInstance());
                }

                public StringValue.Builder addSourcesBuilder(int i10) {
                    return (StringValue.Builder) getSourcesFieldBuilder().b(i10, StringValue.getDefaultInstance());
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        this.levels_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        z1Var.g();
                    }
                    z1<StringValue, StringValue.Builder, h2> z1Var2 = this.sourcesBuilder_;
                    if (z1Var2 == null) {
                        this.sources_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        z1Var2.g();
                    }
                    return this;
                }

                public Builder setTag(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        this.tag_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.levels_ = Collections.emptyList();
                    this.sources_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addLevels(int i10, StringValue stringValue) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        stringValue.getClass();
                        ensureLevelsIsMutable();
                        this.levels_.add(i10, stringValue);
                        onChanged();
                    } else {
                        z1Var.d(i10, stringValue);
                    }
                    return this;
                }

                public Builder addSources(int i10, StringValue stringValue) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        stringValue.getClass();
                        ensureSourcesIsMutable();
                        this.sources_.add(i10, stringValue);
                        onChanged();
                    } else {
                        z1Var.d(i10, stringValue);
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
                    if (message instanceof IOSLogRule) {
                        return mergeFrom((IOSLogRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setLevels(int i10, StringValue.Builder builder) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder setSources(int i10, StringValue.Builder builder) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(IOSLogRule iOSLogRule) {
                    if (iOSLogRule == IOSLogRule.getDefaultInstance()) {
                        return this;
                    }
                    if (iOSLogRule.hasTag()) {
                        mergeTag(iOSLogRule.getTag());
                    }
                    if (this.levelsBuilder_ == null) {
                        if (!iOSLogRule.levels_.isEmpty()) {
                            if (this.levels_.isEmpty()) {
                                this.levels_ = iOSLogRule.levels_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureLevelsIsMutable();
                                this.levels_.addAll(iOSLogRule.levels_);
                            }
                            onChanged();
                        }
                    } else if (!iOSLogRule.levels_.isEmpty()) {
                        if (!this.levelsBuilder_.t()) {
                            this.levelsBuilder_.a(iOSLogRule.levels_);
                        } else {
                            this.levelsBuilder_.h();
                            this.levelsBuilder_ = null;
                            this.levels_ = iOSLogRule.levels_;
                            this.bitField0_ &= -2;
                            this.levelsBuilder_ = j0.alwaysUseFieldBuilders ? getLevelsFieldBuilder() : null;
                        }
                    }
                    if (this.sourcesBuilder_ == null) {
                        if (!iOSLogRule.sources_.isEmpty()) {
                            if (this.sources_.isEmpty()) {
                                this.sources_ = iOSLogRule.sources_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureSourcesIsMutable();
                                this.sources_.addAll(iOSLogRule.sources_);
                            }
                            onChanged();
                        }
                    } else if (!iOSLogRule.sources_.isEmpty()) {
                        if (!this.sourcesBuilder_.t()) {
                            this.sourcesBuilder_.a(iOSLogRule.sources_);
                        } else {
                            this.sourcesBuilder_.h();
                            this.sourcesBuilder_ = null;
                            this.sources_ = iOSLogRule.sources_;
                            this.bitField0_ &= -3;
                            this.sourcesBuilder_ = j0.alwaysUseFieldBuilders ? getSourcesFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) iOSLogRule).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addLevels(StringValue.Builder builder) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addSources(StringValue.Builder builder) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addLevels(int i10, StringValue.Builder builder) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.levelsBuilder_;
                    if (z1Var == null) {
                        ensureLevelsIsMutable();
                        this.levels_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                public Builder addSources(int i10, StringValue.Builder builder) {
                    z1<StringValue, StringValue.Builder, h2> z1Var = this.sourcesBuilder_;
                    if (z1Var == null) {
                        ensureSourcesIsMutable();
                        this.sources_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    IOSLogRule iOSLogRule = null;
                    try {
                        try {
                            IOSLogRule iOSLogRule2 = (IOSLogRule) IOSLogRule.PARSER.parsePartialFrom(nVar, yVar);
                            if (iOSLogRule2 != null) {
                                mergeFrom(iOSLogRule2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            IOSLogRule iOSLogRule3 = (IOSLogRule) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                iOSLogRule = iOSLogRule3;
                                if (iOSLogRule != null) {
                                    mergeFrom(iOSLogRule);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (iOSLogRule != null) {
                            mergeFrom(iOSLogRule);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(IOSLogRule iOSLogRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(iOSLogRule);
            }

            public static IOSLogRule parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private IOSLogRule(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static IOSLogRule parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (IOSLogRule) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static IOSLogRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public IOSLogRule mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static IOSLogRule parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private IOSLogRule() {
                this.memoizedIsInitialized = (byte) -1;
                this.levels_ = Collections.emptyList();
                this.sources_ = Collections.emptyList();
            }

            public static IOSLogRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static IOSLogRule parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static IOSLogRule parseFrom(InputStream inputStream) throws IOException {
                return (IOSLogRule) j0.parseWithIOException(PARSER, inputStream);
            }

            private IOSLogRule(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        StringValue stringValue = this.tag_;
                                        StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                        this.tag_ = stringValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(stringValue2);
                                            this.tag_ = builder.buildPartial();
                                        }
                                    } else if (iK == 18) {
                                        if ((i10 & 1) == 0) {
                                            this.levels_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.levels_.add((StringValue) nVar.A(StringValue.parser(), yVar));
                                    } else if (iK != 26) {
                                        if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                        }
                                    } else {
                                        if ((i10 & 2) == 0) {
                                            this.sources_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.sources_.add((StringValue) nVar.A(StringValue.parser(), yVar));
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
                            this.levels_ = Collections.unmodifiableList(this.levels_);
                        }
                        if ((i10 & 2) != 0) {
                            this.sources_ = Collections.unmodifiableList(this.sources_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.levels_ = Collections.unmodifiableList(this.levels_);
                }
                if ((i10 & 2) != 0) {
                    this.sources_ = Collections.unmodifiableList(this.sources_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static IOSLogRule parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (IOSLogRule) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static IOSLogRule parseFrom(n nVar) throws IOException {
                return (IOSLogRule) j0.parseWithIOException(PARSER, nVar);
            }

            public static IOSLogRule parseFrom(n nVar, y yVar) throws IOException {
                return (IOSLogRule) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface IOSLogRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            StringValue getLevels(int i10);

            int getLevelsCount();

            List<StringValue> getLevelsList();

            h2 getLevelsOrBuilder(int i10);

            List<? extends h2> getLevelsOrBuilderList();

            StringValue getSources(int i10);

            int getSourcesCount();

            List<StringValue> getSourcesList();

            h2 getSourcesOrBuilder(int i10);

            List<? extends h2> getSourcesOrBuilderList();

            StringValue getTag();

            h2 getTagOrBuilder();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class PurRule extends j0 implements PurRuleOrBuilder {
            private static final PurRule DEFAULT_INSTANCE = new PurRule();
            private static final s1<PurRule> PARSER = new b<PurRule>() { // from class: io.bidmachine.protobuf.sdk.Reader.Rule.PurRule.1
                @Override // com.explorestack.protobuf.s1
                public PurRule parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new PurRule(nVar, yVar);
                }
            };
            public static final int PATH_FIELD_NUMBER = 2;
            public static final int QUERY_FIELD_NUMBER = 3;
            public static final int SHOULD_REPORT_FIELD_NUMBER = 4;
            public static final int TAG_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private StringValue path_;
            private StringValue query_;
            private BoolValue shouldReport_;
            private StringValue tag_;

            public static PurRule getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static PurRule parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (PurRule) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static PurRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<PurRule> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PurRule)) {
                    return super.equals(obj);
                }
                PurRule purRule = (PurRule) obj;
                if (hasTag() != purRule.hasTag()) {
                    return false;
                }
                if ((hasTag() && !getTag().equals(purRule.getTag())) || hasPath() != purRule.hasPath()) {
                    return false;
                }
                if ((hasPath() && !getPath().equals(purRule.getPath())) || hasQuery() != purRule.hasQuery()) {
                    return false;
                }
                if ((!hasQuery() || getQuery().equals(purRule.getQuery())) && hasShouldReport() == purRule.hasShouldReport()) {
                    return (!hasShouldReport() || getShouldReport().equals(purRule.getShouldReport())) && this.unknownFields.equals(purRule.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<PurRule> getParserForType() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public StringValue getPath() {
                StringValue stringValue = this.path_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public h2 getPathOrBuilder() {
                return getPath();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public StringValue getQuery() {
                StringValue stringValue = this.query_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public h2 getQueryOrBuilder() {
                return getQuery();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.tag_ != null ? 0 + CodedOutputStream.G(1, getTag()) : 0;
                if (this.path_ != null) {
                    iG += CodedOutputStream.G(2, getPath());
                }
                if (this.query_ != null) {
                    iG += CodedOutputStream.G(3, getQuery());
                }
                if (this.shouldReport_ != null) {
                    iG += CodedOutputStream.G(4, getShouldReport());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public BoolValue getShouldReport() {
                BoolValue boolValue = this.shouldReport_;
                return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public i getShouldReportOrBuilder() {
                return getShouldReport();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public StringValue getTag() {
                StringValue stringValue = this.tag_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public h2 getTagOrBuilder() {
                return getTag();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasPath() {
                return this.path_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasQuery() {
                return this.query_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasShouldReport() {
                return this.shouldReport_ != null;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
            public boolean hasTag() {
                return this.tag_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasTag()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTag().hashCode();
                }
                if (hasPath()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPath().hashCode();
                }
                if (hasQuery()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getQuery().hashCode();
                }
                if (hasShouldReport()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getShouldReport().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable.d(PurRule.class, Builder.class);
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
                return new PurRule();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.tag_ != null) {
                    codedOutputStream.L0(1, getTag());
                }
                if (this.path_ != null) {
                    codedOutputStream.L0(2, getPath());
                }
                if (this.query_ != null) {
                    codedOutputStream.L0(3, getQuery());
                }
                if (this.shouldReport_ != null) {
                    codedOutputStream.L0(4, getShouldReport());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements PurRuleOrBuilder {
                private e2<StringValue, StringValue.Builder, h2> pathBuilder_;
                private StringValue path_;
                private e2<StringValue, StringValue.Builder, h2> queryBuilder_;
                private StringValue query_;
                private e2<BoolValue, BoolValue.Builder, i> shouldReportBuilder_;
                private BoolValue shouldReport_;
                private e2<StringValue, StringValue.Builder, h2> tagBuilder_;
                private StringValue tag_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
                }

                private e2<StringValue, StringValue.Builder, h2> getPathFieldBuilder() {
                    if (this.pathBuilder_ == null) {
                        this.pathBuilder_ = new e2<>(getPath(), getParentForChildren(), isClean());
                        this.path_ = null;
                    }
                    return this.pathBuilder_;
                }

                private e2<StringValue, StringValue.Builder, h2> getQueryFieldBuilder() {
                    if (this.queryBuilder_ == null) {
                        this.queryBuilder_ = new e2<>(getQuery(), getParentForChildren(), isClean());
                        this.query_ = null;
                    }
                    return this.queryBuilder_;
                }

                private e2<BoolValue, BoolValue.Builder, i> getShouldReportFieldBuilder() {
                    if (this.shouldReportBuilder_ == null) {
                        this.shouldReportBuilder_ = new e2<>(getShouldReport(), getParentForChildren(), isClean());
                        this.shouldReport_ = null;
                    }
                    return this.shouldReportBuilder_;
                }

                private e2<StringValue, StringValue.Builder, h2> getTagFieldBuilder() {
                    if (this.tagBuilder_ == null) {
                        this.tagBuilder_ = new e2<>(getTag(), getParentForChildren(), isClean());
                        this.tag_ = null;
                    }
                    return this.tagBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = j0.alwaysUseFieldBuilders;
                }

                public Builder clearPath() {
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                        onChanged();
                    } else {
                        this.path_ = null;
                        this.pathBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearQuery() {
                    if (this.queryBuilder_ == null) {
                        this.query_ = null;
                        onChanged();
                    } else {
                        this.query_ = null;
                        this.queryBuilder_ = null;
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

                public Builder clearTag() {
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                        onChanged();
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_descriptor;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public StringValue getPath() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getPathBuilder() {
                    onChanged();
                    return (StringValue.Builder) getPathFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public h2 getPathOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.path_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public StringValue getQuery() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.queryBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.query_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getQueryBuilder() {
                    onChanged();
                    return (StringValue.Builder) getQueryFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public h2 getQueryOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.queryBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.query_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
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

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public i getShouldReportOrBuilder() {
                    e2<BoolValue, BoolValue.Builder, i> e2Var = this.shouldReportBuilder_;
                    if (e2Var != null) {
                        return (i) e2Var.f();
                    }
                    BoolValue boolValue = this.shouldReport_;
                    return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public StringValue getTag() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var != null) {
                        return (StringValue) e2Var.e();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                public StringValue.Builder getTagBuilder() {
                    onChanged();
                    return (StringValue.Builder) getTagFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public h2 getTagOrBuilder() {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var != null) {
                        return (h2) e2Var.f();
                    }
                    StringValue stringValue = this.tag_;
                    return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasPath() {
                    return (this.pathBuilder_ == null && this.path_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasQuery() {
                    return (this.queryBuilder_ == null && this.query_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasShouldReport() {
                    return (this.shouldReportBuilder_ == null && this.shouldReport_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.sdk.Reader.Rule.PurRuleOrBuilder
                public boolean hasTag() {
                    return (this.tagBuilder_ == null && this.tag_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_PurRule_fieldAccessorTable.d(PurRule.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergePath(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.path_;
                        if (stringValue2 != null) {
                            this.path_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.path_ = stringValue;
                        }
                        onChanged();
                    } else {
                        e2Var.g(stringValue);
                    }
                    return this;
                }

                public Builder mergeQuery(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.queryBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.query_;
                        if (stringValue2 != null) {
                            this.query_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.query_ = stringValue;
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

                public Builder mergeTag(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        StringValue stringValue2 = this.tag_;
                        if (stringValue2 != null) {
                            this.tag_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                        } else {
                            this.tag_ = stringValue;
                        }
                        onChanged();
                    } else {
                        e2Var.g(stringValue);
                    }
                    return this;
                }

                public Builder setPath(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.path_ = stringValue;
                        onChanged();
                    } else {
                        e2Var.i(stringValue);
                    }
                    return this;
                }

                public Builder setQuery(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.queryBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.query_ = stringValue;
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

                public Builder setTag(StringValue stringValue) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        stringValue.getClass();
                        this.tag_ = stringValue;
                        onChanged();
                    } else {
                        e2Var.i(stringValue);
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
                public PurRule build() {
                    PurRule purRuleBuildPartial = buildPartial();
                    if (purRuleBuildPartial.isInitialized()) {
                        return purRuleBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) purRuleBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public PurRule buildPartial() {
                    PurRule purRule = new PurRule(this);
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        purRule.tag_ = this.tag_;
                    } else {
                        purRule.tag_ = (StringValue) e2Var.a();
                    }
                    e2<StringValue, StringValue.Builder, h2> e2Var2 = this.pathBuilder_;
                    if (e2Var2 == null) {
                        purRule.path_ = this.path_;
                    } else {
                        purRule.path_ = (StringValue) e2Var2.a();
                    }
                    e2<StringValue, StringValue.Builder, h2> e2Var3 = this.queryBuilder_;
                    if (e2Var3 == null) {
                        purRule.query_ = this.query_;
                    } else {
                        purRule.query_ = (StringValue) e2Var3.a();
                    }
                    e2<BoolValue, BoolValue.Builder, i> e2Var4 = this.shouldReportBuilder_;
                    if (e2Var4 == null) {
                        purRule.shouldReport_ = this.shouldReport_;
                    } else {
                        purRule.shouldReport_ = (BoolValue) e2Var4.a();
                    }
                    onBuilt();
                    return purRule;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public PurRule mo164getDefaultInstanceForType() {
                    return PurRule.getDefaultInstance();
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
                    if (this.tagBuilder_ == null) {
                        this.tag_ = null;
                    } else {
                        this.tag_ = null;
                        this.tagBuilder_ = null;
                    }
                    if (this.pathBuilder_ == null) {
                        this.path_ = null;
                    } else {
                        this.path_ = null;
                        this.pathBuilder_ = null;
                    }
                    if (this.queryBuilder_ == null) {
                        this.query_ = null;
                    } else {
                        this.query_ = null;
                        this.queryBuilder_ = null;
                    }
                    if (this.shouldReportBuilder_ == null) {
                        this.shouldReport_ = null;
                    } else {
                        this.shouldReport_ = null;
                        this.shouldReportBuilder_ = null;
                    }
                    return this;
                }

                public Builder setPath(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.pathBuilder_;
                    if (e2Var == null) {
                        this.path_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder setQuery(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.queryBuilder_;
                    if (e2Var == null) {
                        this.query_ = builder.build();
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

                public Builder setTag(StringValue.Builder builder) {
                    e2<StringValue, StringValue.Builder, h2> e2Var = this.tagBuilder_;
                    if (e2Var == null) {
                        this.tag_ = builder.build();
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
                    if (message instanceof PurRule) {
                        return mergeFrom((PurRule) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(PurRule purRule) {
                    if (purRule == PurRule.getDefaultInstance()) {
                        return this;
                    }
                    if (purRule.hasTag()) {
                        mergeTag(purRule.getTag());
                    }
                    if (purRule.hasPath()) {
                        mergePath(purRule.getPath());
                    }
                    if (purRule.hasQuery()) {
                        mergeQuery(purRule.getQuery());
                    }
                    if (purRule.hasShouldReport()) {
                        mergeShouldReport(purRule.getShouldReport());
                    }
                    mergeUnknownFields(((j0) purRule).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    PurRule purRule = null;
                    try {
                        try {
                            PurRule purRule2 = (PurRule) PurRule.PARSER.parsePartialFrom(nVar, yVar);
                            if (purRule2 != null) {
                                mergeFrom(purRule2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            PurRule purRule3 = (PurRule) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                purRule = purRule3;
                                if (purRule != null) {
                                    mergeFrom(purRule);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (purRule != null) {
                            mergeFrom(purRule);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(PurRule purRule) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(purRule);
            }

            public static PurRule parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private PurRule(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static PurRule parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (PurRule) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static PurRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public PurRule mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static PurRule parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private PurRule() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static PurRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static PurRule parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            private PurRule(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        StringValue stringValue = this.tag_;
                                        StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                        StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                        this.tag_ = stringValue2;
                                        if (builder != null) {
                                            builder.mergeFrom(stringValue2);
                                            this.tag_ = builder.buildPartial();
                                        }
                                    } else if (iK == 18) {
                                        StringValue stringValue3 = this.path_;
                                        StringValue.Builder builder2 = stringValue3 != null ? stringValue3.toBuilder() : null;
                                        StringValue stringValue4 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                        this.path_ = stringValue4;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(stringValue4);
                                            this.path_ = builder2.buildPartial();
                                        }
                                    } else if (iK == 26) {
                                        StringValue stringValue5 = this.query_;
                                        StringValue.Builder builder3 = stringValue5 != null ? stringValue5.toBuilder() : null;
                                        StringValue stringValue6 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                        this.query_ = stringValue6;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(stringValue6);
                                            this.query_ = builder3.buildPartial();
                                        }
                                    } else if (iK != 34) {
                                        if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                        }
                                    } else {
                                        BoolValue boolValue = this.shouldReport_;
                                        BoolValue.Builder builder4 = boolValue != null ? boolValue.toBuilder() : null;
                                        BoolValue boolValue2 = (BoolValue) nVar.A(BoolValue.parser(), yVar);
                                        this.shouldReport_ = boolValue2;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(boolValue2);
                                            this.shouldReport_ = builder4.buildPartial();
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

            public static PurRule parseFrom(InputStream inputStream) throws IOException {
                return (PurRule) j0.parseWithIOException(PARSER, inputStream);
            }

            public static PurRule parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (PurRule) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static PurRule parseFrom(n nVar) throws IOException {
                return (PurRule) j0.parseWithIOException(PARSER, nVar);
            }

            public static PurRule parseFrom(n nVar, y yVar) throws IOException {
                return (PurRule) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface PurRuleOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            StringValue getPath();

            h2 getPathOrBuilder();

            StringValue getQuery();

            h2 getQueryOrBuilder();

            BoolValue getShouldReport();

            i getShouldReportOrBuilder();

            StringValue getTag();

            h2 getTagOrBuilder();

            boolean hasPath();

            boolean hasQuery();

            boolean hasShouldReport();

            boolean hasTag();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public enum RuleOneofCase implements l0.c {
            GENERAL_RULE(1),
            IOS_LOG_RULE(2),
            PUR_RULE(3),
            RULEONEOF_NOT_SET(0);

            private final int value;

            RuleOneofCase(int i10) {
                this.value = i10;
            }

            public static RuleOneofCase forNumber(int i10) {
                if (i10 == 0) {
                    return RULEONEOF_NOT_SET;
                }
                if (i10 == 1) {
                    return GENERAL_RULE;
                }
                if (i10 == 2) {
                    return IOS_LOG_RULE;
                }
                if (i10 != 3) {
                    return null;
                }
                return PUR_RULE;
            }

            @Override // com.explorestack.protobuf.l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static RuleOneofCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
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
            if (!getRuleOneofCase().equals(rule.getRuleOneofCase())) {
                return false;
            }
            int i10 = this.ruleOneofCase_;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && !getPurRule().equals(rule.getPurRule())) {
                        return false;
                    }
                } else if (!getIosLogRule().equals(rule.getIosLogRule())) {
                    return false;
                }
            } else if (!getGeneralRule().equals(rule.getGeneralRule())) {
                return false;
            }
            return this.unknownFields.equals(rule.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public GeneralRule getGeneralRule() {
            return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public GeneralRuleOrBuilder getGeneralRuleOrBuilder() {
            return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public IOSLogRule getIosLogRule() {
            return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public IOSLogRuleOrBuilder getIosLogRuleOrBuilder() {
            return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Rule> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public PurRule getPurRule() {
            return this.ruleOneofCase_ == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public PurRuleOrBuilder getPurRuleOrBuilder() {
            return this.ruleOneofCase_ == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance();
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public RuleOneofCase getRuleOneofCase() {
            return RuleOneofCase.forNumber(this.ruleOneofCase_);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.ruleOneofCase_ == 1 ? 0 + CodedOutputStream.G(1, (GeneralRule) this.ruleOneof_) : 0;
            if (this.ruleOneofCase_ == 2) {
                iG += CodedOutputStream.G(2, (IOSLogRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 3) {
                iG += CodedOutputStream.G(3, (PurRule) this.ruleOneof_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasGeneralRule() {
            return this.ruleOneofCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasIosLogRule() {
            return this.ruleOneofCase_ == 2;
        }

        @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
        public boolean hasPurRule() {
            return this.ruleOneofCase_ == 3;
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
            int i12 = this.ruleOneofCase_;
            if (i12 == 1) {
                i10 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getGeneralRule().hashCode();
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i10 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getPurRule().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getIosLogRule().hashCode();
            }
            iHashCode2 = i10 + iHashCode;
            int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable.d(Rule.class, Builder.class);
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
            if (this.ruleOneofCase_ == 1) {
                codedOutputStream.L0(1, (GeneralRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 2) {
                codedOutputStream.L0(2, (IOSLogRule) this.ruleOneof_);
            }
            if (this.ruleOneofCase_ == 3) {
                codedOutputStream.L0(3, (PurRule) this.ruleOneof_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements RuleOrBuilder {
            private e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> generalRuleBuilder_;
            private e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> iosLogRuleBuilder_;
            private e2<PurRule, PurRule.Builder, PurRuleOrBuilder> purRuleBuilder_;
            private int ruleOneofCase_;
            private Object ruleOneof_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
            }

            private e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> getGeneralRuleFieldBuilder() {
                if (this.generalRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 1) {
                        this.ruleOneof_ = GeneralRule.getDefaultInstance();
                    }
                    this.generalRuleBuilder_ = new e2<>((GeneralRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 1;
                onChanged();
                return this.generalRuleBuilder_;
            }

            private e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> getIosLogRuleFieldBuilder() {
                if (this.iosLogRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 2) {
                        this.ruleOneof_ = IOSLogRule.getDefaultInstance();
                    }
                    this.iosLogRuleBuilder_ = new e2<>((IOSLogRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 2;
                onChanged();
                return this.iosLogRuleBuilder_;
            }

            private e2<PurRule, PurRule.Builder, PurRuleOrBuilder> getPurRuleFieldBuilder() {
                if (this.purRuleBuilder_ == null) {
                    if (this.ruleOneofCase_ != 3) {
                        this.ruleOneof_ = PurRule.getDefaultInstance();
                    }
                    this.purRuleBuilder_ = new e2<>((PurRule) this.ruleOneof_, getParentForChildren(), isClean());
                    this.ruleOneof_ = null;
                }
                this.ruleOneofCase_ = 3;
                onChanged();
                return this.purRuleBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearGeneralRule() {
                e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var = this.generalRuleBuilder_;
                if (e2Var != null) {
                    if (this.ruleOneofCase_ == 1) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                    }
                    e2Var.b();
                } else if (this.ruleOneofCase_ == 1) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearIosLogRule() {
                e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var = this.iosLogRuleBuilder_;
                if (e2Var != null) {
                    if (this.ruleOneofCase_ == 2) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                    }
                    e2Var.b();
                } else if (this.ruleOneofCase_ == 2) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearPurRule() {
                e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var = this.purRuleBuilder_;
                if (e2Var != null) {
                    if (this.ruleOneofCase_ == 3) {
                        this.ruleOneofCase_ = 0;
                        this.ruleOneof_ = null;
                    }
                    e2Var.b();
                } else if (this.ruleOneofCase_ == 3) {
                    this.ruleOneofCase_ = 0;
                    this.ruleOneof_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearRuleOneof() {
                this.ruleOneofCase_ = 0;
                this.ruleOneof_ = null;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public GeneralRule getGeneralRule() {
                e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var = this.generalRuleBuilder_;
                if (e2Var == null) {
                    return this.ruleOneofCase_ == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
                }
                return this.ruleOneofCase_ == 1 ? (GeneralRule) e2Var.e() : GeneralRule.getDefaultInstance();
            }

            public GeneralRule.Builder getGeneralRuleBuilder() {
                return (GeneralRule.Builder) getGeneralRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public GeneralRuleOrBuilder getGeneralRuleOrBuilder() {
                e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var;
                int i10 = this.ruleOneofCase_;
                if (i10 != 1 || (e2Var = this.generalRuleBuilder_) == null) {
                    return i10 == 1 ? (GeneralRule) this.ruleOneof_ : GeneralRule.getDefaultInstance();
                }
                return (GeneralRuleOrBuilder) e2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public IOSLogRule getIosLogRule() {
                e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var = this.iosLogRuleBuilder_;
                if (e2Var == null) {
                    return this.ruleOneofCase_ == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
                }
                return this.ruleOneofCase_ == 2 ? (IOSLogRule) e2Var.e() : IOSLogRule.getDefaultInstance();
            }

            public IOSLogRule.Builder getIosLogRuleBuilder() {
                return (IOSLogRule.Builder) getIosLogRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public IOSLogRuleOrBuilder getIosLogRuleOrBuilder() {
                e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var;
                int i10 = this.ruleOneofCase_;
                if (i10 != 2 || (e2Var = this.iosLogRuleBuilder_) == null) {
                    return i10 == 2 ? (IOSLogRule) this.ruleOneof_ : IOSLogRule.getDefaultInstance();
                }
                return (IOSLogRuleOrBuilder) e2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public PurRule getPurRule() {
                e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var = this.purRuleBuilder_;
                if (e2Var == null) {
                    return this.ruleOneofCase_ == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance();
                }
                return this.ruleOneofCase_ == 3 ? (PurRule) e2Var.e() : PurRule.getDefaultInstance();
            }

            public PurRule.Builder getPurRuleBuilder() {
                return (PurRule.Builder) getPurRuleFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public PurRuleOrBuilder getPurRuleOrBuilder() {
                e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var;
                int i10 = this.ruleOneofCase_;
                if (i10 != 3 || (e2Var = this.purRuleBuilder_) == null) {
                    return i10 == 3 ? (PurRule) this.ruleOneof_ : PurRule.getDefaultInstance();
                }
                return (PurRuleOrBuilder) e2Var.f();
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public RuleOneofCase getRuleOneofCase() {
                return RuleOneofCase.forNumber(this.ruleOneofCase_);
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasGeneralRule() {
                return this.ruleOneofCase_ == 1;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasIosLogRule() {
                return this.ruleOneofCase_ == 2;
            }

            @Override // io.bidmachine.protobuf.sdk.Reader.RuleOrBuilder
            public boolean hasPurRule() {
                return this.ruleOneofCase_ == 3;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable.d(Rule.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeGeneralRule(GeneralRule generalRule) {
                e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var = this.generalRuleBuilder_;
                if (e2Var == null) {
                    if (this.ruleOneofCase_ != 1 || this.ruleOneof_ == GeneralRule.getDefaultInstance()) {
                        this.ruleOneof_ = generalRule;
                    } else {
                        this.ruleOneof_ = GeneralRule.newBuilder((GeneralRule) this.ruleOneof_).mergeFrom(generalRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 1) {
                        e2Var.g(generalRule);
                    }
                    this.generalRuleBuilder_.i(generalRule);
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder mergeIosLogRule(IOSLogRule iOSLogRule) {
                e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var = this.iosLogRuleBuilder_;
                if (e2Var == null) {
                    if (this.ruleOneofCase_ != 2 || this.ruleOneof_ == IOSLogRule.getDefaultInstance()) {
                        this.ruleOneof_ = iOSLogRule;
                    } else {
                        this.ruleOneof_ = IOSLogRule.newBuilder((IOSLogRule) this.ruleOneof_).mergeFrom(iOSLogRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 2) {
                        e2Var.g(iOSLogRule);
                    }
                    this.iosLogRuleBuilder_.i(iOSLogRule);
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder mergePurRule(PurRule purRule) {
                e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var = this.purRuleBuilder_;
                if (e2Var == null) {
                    if (this.ruleOneofCase_ != 3 || this.ruleOneof_ == PurRule.getDefaultInstance()) {
                        this.ruleOneof_ = purRule;
                    } else {
                        this.ruleOneof_ = PurRule.newBuilder((PurRule) this.ruleOneof_).mergeFrom(purRule).buildPartial();
                    }
                    onChanged();
                } else {
                    if (this.ruleOneofCase_ == 3) {
                        e2Var.g(purRule);
                    }
                    this.purRuleBuilder_.i(purRule);
                }
                this.ruleOneofCase_ = 3;
                return this;
            }

            public Builder setGeneralRule(GeneralRule generalRule) {
                e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var = this.generalRuleBuilder_;
                if (e2Var == null) {
                    generalRule.getClass();
                    this.ruleOneof_ = generalRule;
                    onChanged();
                } else {
                    e2Var.i(generalRule);
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder setIosLogRule(IOSLogRule iOSLogRule) {
                e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var = this.iosLogRuleBuilder_;
                if (e2Var == null) {
                    iOSLogRule.getClass();
                    this.ruleOneof_ = iOSLogRule;
                    onChanged();
                } else {
                    e2Var.i(iOSLogRule);
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder setPurRule(PurRule purRule) {
                e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var = this.purRuleBuilder_;
                if (e2Var == null) {
                    purRule.getClass();
                    this.ruleOneof_ = purRule;
                    onChanged();
                } else {
                    e2Var.i(purRule);
                }
                this.ruleOneofCase_ = 3;
                return this;
            }

            private Builder() {
                this.ruleOneofCase_ = 0;
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
                if (this.ruleOneofCase_ == 1) {
                    e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var = this.generalRuleBuilder_;
                    if (e2Var == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = e2Var.a();
                    }
                }
                if (this.ruleOneofCase_ == 2) {
                    e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var2 = this.iosLogRuleBuilder_;
                    if (e2Var2 == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = e2Var2.a();
                    }
                }
                if (this.ruleOneofCase_ == 3) {
                    e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var3 = this.purRuleBuilder_;
                    if (e2Var3 == null) {
                        rule.ruleOneof_ = this.ruleOneof_;
                    } else {
                        rule.ruleOneof_ = e2Var3.a();
                    }
                }
                rule.ruleOneofCase_ = this.ruleOneofCase_;
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
                this.ruleOneofCase_ = 0;
                this.ruleOneof_ = null;
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.ruleOneofCase_ = 0;
                maybeForceBuilderInitialization();
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

            public Builder setGeneralRule(GeneralRule.Builder builder) {
                e2<GeneralRule, GeneralRule.Builder, GeneralRuleOrBuilder> e2Var = this.generalRuleBuilder_;
                if (e2Var == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.ruleOneofCase_ = 1;
                return this;
            }

            public Builder setIosLogRule(IOSLogRule.Builder builder) {
                e2<IOSLogRule, IOSLogRule.Builder, IOSLogRuleOrBuilder> e2Var = this.iosLogRuleBuilder_;
                if (e2Var == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.ruleOneofCase_ = 2;
                return this;
            }

            public Builder setPurRule(PurRule.Builder builder) {
                e2<PurRule, PurRule.Builder, PurRuleOrBuilder> e2Var = this.purRuleBuilder_;
                if (e2Var == null) {
                    this.ruleOneof_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                this.ruleOneofCase_ = 3;
                return this;
            }

            public Builder mergeFrom(Rule rule) {
                if (rule == Rule.getDefaultInstance()) {
                    return this;
                }
                int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Reader$Rule$RuleOneofCase[rule.getRuleOneofCase().ordinal()];
                if (i10 == 1) {
                    mergeGeneralRule(rule.getGeneralRule());
                } else if (i10 == 2) {
                    mergeIosLogRule(rule.getIosLogRule());
                } else if (i10 == 3) {
                    mergePurRule(rule.getPurRule());
                }
                mergeUnknownFields(((j0) rule).unknownFields);
                onChanged();
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

        public static Builder newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rule);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Rule(j0.b<?> bVar) {
            super(bVar);
            this.ruleOneofCase_ = 0;
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

        public static Rule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        private Rule() {
            this.ruleOneofCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Rule parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Rule parseFrom(InputStream inputStream) throws IOException {
            return (Rule) j0.parseWithIOException(PARSER, inputStream);
        }

        private Rule(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    GeneralRule.Builder builder = this.ruleOneofCase_ == 1 ? ((GeneralRule) this.ruleOneof_).toBuilder() : null;
                                    MessageLite messageLiteA = nVar.A(GeneralRule.parser(), yVar);
                                    this.ruleOneof_ = messageLiteA;
                                    if (builder != null) {
                                        builder.mergeFrom((GeneralRule) messageLiteA);
                                        this.ruleOneof_ = builder.buildPartial();
                                    }
                                    this.ruleOneofCase_ = 1;
                                } else if (iK == 18) {
                                    IOSLogRule.Builder builder2 = this.ruleOneofCase_ == 2 ? ((IOSLogRule) this.ruleOneof_).toBuilder() : null;
                                    MessageLite messageLiteA2 = nVar.A(IOSLogRule.parser(), yVar);
                                    this.ruleOneof_ = messageLiteA2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom((IOSLogRule) messageLiteA2);
                                        this.ruleOneof_ = builder2.buildPartial();
                                    }
                                    this.ruleOneofCase_ = 2;
                                } else if (iK != 26) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    PurRule.Builder builder3 = this.ruleOneofCase_ == 3 ? ((PurRule) this.ruleOneof_).toBuilder() : null;
                                    MessageLite messageLiteA3 = nVar.A(PurRule.parser(), yVar);
                                    this.ruleOneof_ = messageLiteA3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom((PurRule) messageLiteA3);
                                        this.ruleOneof_ = builder3.buildPartial();
                                    }
                                    this.ruleOneofCase_ = 3;
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

        public static Rule parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Rule) j0.parseWithIOException(PARSER, inputStream, yVar);
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

        Rule.GeneralRule getGeneralRule();

        Rule.GeneralRuleOrBuilder getGeneralRuleOrBuilder();

        Rule.IOSLogRule getIosLogRule();

        Rule.IOSLogRuleOrBuilder getIosLogRuleOrBuilder();

        Rule.PurRule getPurRule();

        Rule.PurRuleOrBuilder getPurRuleOrBuilder();

        Rule.RuleOneofCase getRuleOneofCase();

        boolean hasGeneralRule();

        boolean hasIosLogRule();

        boolean hasPurRule();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Reader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Reader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Reader) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Reader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Reader> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reader)) {
            return super.equals(obj);
        }
        Reader reader = (Reader) obj;
        if (getName().equals(reader.getName()) && hasTimestamp() == reader.hasTimestamp()) {
            return (!hasTimestamp() || getTimestamp().equals(reader.getTimestamp())) && getRecordsList().equals(reader.getRecordsList()) && this.unknownFields.equals(reader.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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
    public s1<Reader> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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
        if (this.timestamp_ != null) {
            iComputeStringSize += CodedOutputStream.G(2, getTimestamp());
        }
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iComputeStringSize += CodedOutputStream.G(3, this.records_.get(i11));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public n2 getTimestampOrBuilder() {
        return getTimestamp();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (hasTimestamp()) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getTimestamp().hashCode();
        }
        if (getRecordsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getRecordsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable.d(Reader.class, Builder.class);
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
        return new Reader();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.name_);
        }
        if (this.timestamp_ != null) {
            codedOutputStream.L0(2, getTimestamp());
        }
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            codedOutputStream.L0(3, this.records_.get(i10));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements ReaderOrBuilder {
        private int bitField0_;
        private Object name_;
        private z1<Record, Record.Builder, RecordOrBuilder> recordsBuilder_;
        private List<Record> records_;
        private e2<Timestamp, Timestamp.Builder, n2> timestampBuilder_;
        private Timestamp timestamp_;

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
        }

        private z1<Record, Record.Builder, RecordOrBuilder> getRecordsFieldBuilder() {
            if (this.recordsBuilder_ == null) {
                this.recordsBuilder_ = new z1<>(this.records_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.records_ = null;
            }
            return this.recordsBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getTimestampFieldBuilder() {
            if (this.timestampBuilder_ == null) {
                this.timestampBuilder_ = new e2<>(getTimestamp(), getParentForChildren(), isClean());
                this.timestamp_ = null;
            }
            return this.timestampBuilder_;
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
            this.name_ = Reader.getDefaultInstance().getName();
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
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public int getRecordsCount() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public List<Record> getRecordsList() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.records_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.get(i10) : (RecordOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.records_);
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public n2 getTimestampOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.ReaderOrBuilder
        public boolean hasTimestamp() {
            return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable.d(Reader.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
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
            this.name_ = "";
            this.records_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Reader build() {
            Reader readerBuildPartial = buildPartial();
            if (readerBuildPartial.isInitialized()) {
                return readerBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) readerBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Reader buildPartial() {
            Reader reader = new Reader(this);
            reader.name_ = this.name_;
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
            if (e2Var == null) {
                reader.timestamp_ = this.timestamp_;
            } else {
                reader.timestamp_ = (Timestamp) e2Var.a();
            }
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var != null) {
                reader.records_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.records_ = Collections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                reader.records_ = this.records_;
            }
            onBuilt();
            return reader;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Reader mo164getDefaultInstanceForType() {
            return Reader.getDefaultInstance();
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
            if (this.timestampBuilder_ == null) {
                this.timestamp_ = null;
            } else {
                this.timestamp_ = null;
                this.timestampBuilder_ = null;
            }
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                this.records_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
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
            if (message instanceof Reader) {
                return mergeFrom((Reader) message);
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

        public Builder mergeFrom(Reader reader) {
            if (reader == Reader.getDefaultInstance()) {
                return this;
            }
            if (!reader.getName().isEmpty()) {
                this.name_ = reader.name_;
                onChanged();
            }
            if (reader.hasTimestamp()) {
                mergeTimestamp(reader.getTimestamp());
            }
            if (this.recordsBuilder_ == null) {
                if (!reader.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = reader.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(reader.records_);
                    }
                    onChanged();
                }
            } else if (!reader.records_.isEmpty()) {
                if (!this.recordsBuilder_.t()) {
                    this.recordsBuilder_.a(reader.records_);
                } else {
                    this.recordsBuilder_.h();
                    this.recordsBuilder_ = null;
                    this.records_ = reader.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = j0.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) reader).unknownFields);
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
            Reader reader = null;
            try {
                try {
                    Reader reader2 = (Reader) Reader.PARSER.parsePartialFrom(nVar, yVar);
                    if (reader2 != null) {
                        mergeFrom(reader2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Reader reader3 = (Reader) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        reader = reader3;
                        if (reader != null) {
                            mergeFrom(reader);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (reader != null) {
                    mergeFrom(reader);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(Reader reader) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(reader);
    }

    public static Reader parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private Reader(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Reader parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Reader) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Reader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Reader mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Reader parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Reader() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.records_ = Collections.emptyList();
    }

    public static Reader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Reader parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Reader parseFrom(InputStream inputStream) throws IOException {
        return (Reader) j0.parseWithIOException(PARSER, inputStream);
    }

    private Reader(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                        } else if (iK == 18) {
                            Timestamp timestamp = this.timestamp_;
                            Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.timestamp_ = timestamp2;
                            if (builder != null) {
                                builder.mergeFrom(timestamp2);
                                this.timestamp_ = builder.buildPartial();
                            }
                        } else if (iK != 26) {
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

    public static Reader parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Reader) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Reader parseFrom(n nVar) throws IOException {
        return (Reader) j0.parseWithIOException(PARSER, nVar);
    }

    public static Reader parseFrom(n nVar, y yVar) throws IOException {
        return (Reader) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
