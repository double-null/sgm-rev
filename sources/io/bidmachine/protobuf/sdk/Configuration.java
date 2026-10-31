package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h2;
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
public final class Configuration extends j0 implements ConfigurationOrBuilder {
    public static final int BPK_FIELD_NUMBER = 3;
    public static final int MONITORS_FIELD_NUMBER = 1;
    public static final int READERS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private StringValue bpk_;
    private byte memoizedIsInitialized;
    private List<Monitor.Configuration> monitors_;
    private List<Reader.Configuration> readers_;
    private static final Configuration DEFAULT_INSTANCE = new Configuration();
    private static final s1<Configuration> PARSER = new b<Configuration>() { // from class: io.bidmachine.protobuf.sdk.Configuration.1
        @Override // com.explorestack.protobuf.s1
        public Configuration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Configuration(nVar, yVar);
        }
    };

    public static Configuration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
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
        if (getMonitorsList().equals(configuration.getMonitorsList()) && getReadersList().equals(configuration.getReadersList()) && hasBpk() == configuration.hasBpk()) {
            return (!hasBpk() || getBpk().equals(configuration.getBpk())) && this.unknownFields.equals(configuration.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public StringValue getBpk() {
        StringValue stringValue = this.bpk_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public h2 getBpkOrBuilder() {
        return getBpk();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.Configuration getMonitors(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getMonitorsCount() {
        return this.monitors_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Monitor.Configuration> getMonitorsList() {
        return this.monitors_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
        return this.monitors_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Configuration> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.Configuration getReaders(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getReadersCount() {
        return this.readers_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Reader.Configuration> getReadersList() {
        return this.readers_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
        return this.readers_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.monitors_.size(); i11++) {
            iG += CodedOutputStream.G(1, this.monitors_.get(i11));
        }
        for (int i12 = 0; i12 < this.readers_.size(); i12++) {
            iG += CodedOutputStream.G(2, this.readers_.get(i12));
        }
        if (this.bpk_ != null) {
            iG += CodedOutputStream.G(3, getBpk());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public boolean hasBpk() {
        return this.bpk_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getMonitorsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getMonitorsList().hashCode();
        }
        if (getReadersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getReadersList().hashCode();
        }
        if (hasBpk()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getBpk().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
        for (int i10 = 0; i10 < this.monitors_.size(); i10++) {
            codedOutputStream.L0(1, this.monitors_.get(i10));
        }
        for (int i11 = 0; i11 < this.readers_.size(); i11++) {
            codedOutputStream.L0(2, this.readers_.get(i11));
        }
        if (this.bpk_ != null) {
            codedOutputStream.L0(3, getBpk());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements ConfigurationOrBuilder {
        private int bitField0_;
        private e2<StringValue, StringValue.Builder, h2> bpkBuilder_;
        private StringValue bpk_;
        private z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> monitorsBuilder_;
        private List<Monitor.Configuration> monitors_;
        private z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> readersBuilder_;
        private List<Reader.Configuration> readers_;

        private void ensureMonitorsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.monitors_ = new ArrayList(this.monitors_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureReadersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.readers_ = new ArrayList(this.readers_);
                this.bitField0_ |= 2;
            }
        }

        private e2<StringValue, StringValue.Builder, h2> getBpkFieldBuilder() {
            if (this.bpkBuilder_ == null) {
                this.bpkBuilder_ = new e2<>(getBpk(), getParentForChildren(), isClean());
                this.bpk_ = null;
            }
            return this.bpkBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        private z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> getMonitorsFieldBuilder() {
            if (this.monitorsBuilder_ == null) {
                this.monitorsBuilder_ = new z1<>(this.monitors_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.monitors_ = null;
            }
            return this.monitorsBuilder_;
        }

        private z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> getReadersFieldBuilder() {
            if (this.readersBuilder_ == null) {
                this.readersBuilder_ = new z1<>(this.readers_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.readers_ = null;
            }
            return this.readersBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getMonitorsFieldBuilder();
                getReadersFieldBuilder();
            }
        }

        public Builder addAllMonitors(Iterable<? extends Monitor.Configuration> iterable) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                ensureMonitorsIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.monitors_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addAllReaders(Iterable<? extends Reader.Configuration> iterable) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                ensureReadersIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.readers_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addMonitors(Monitor.Configuration configuration) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.add(configuration);
                onChanged();
            } else {
                z1Var.e(configuration);
            }
            return this;
        }

        public Monitor.Configuration.Builder addMonitorsBuilder() {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().c(Monitor.Configuration.getDefaultInstance());
        }

        public Builder addReaders(Reader.Configuration configuration) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.add(configuration);
                onChanged();
            } else {
                z1Var.e(configuration);
            }
            return this;
        }

        public Reader.Configuration.Builder addReadersBuilder() {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().c(Reader.Configuration.getDefaultInstance());
        }

        public Builder clearBpk() {
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
                onChanged();
            } else {
                this.bpk_ = null;
                this.bpkBuilder_ = null;
            }
            return this;
        }

        public Builder clearMonitors() {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                this.monitors_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearReaders() {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                this.readers_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public StringValue getBpk() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.bpkBuilder_;
            if (e2Var != null) {
                return (StringValue) e2Var.e();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getBpkBuilder() {
            onChanged();
            return (StringValue.Builder) getBpkFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public h2 getBpkOrBuilder() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.bpkBuilder_;
            if (e2Var != null) {
                return (h2) e2Var.f();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.Configuration getMonitors(int i10) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            return z1Var == null ? this.monitors_.get(i10) : (Monitor.Configuration) z1Var.n(i10);
        }

        public Monitor.Configuration.Builder getMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().k(i10);
        }

        public List<Monitor.Configuration.Builder> getMonitorsBuilderList() {
            return getMonitorsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getMonitorsCount() {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            return z1Var == null ? this.monitors_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Monitor.Configuration> getMonitorsList() {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.monitors_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            return z1Var == null ? this.monitors_.get(i10) : (Monitor.ConfigurationOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.monitors_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.Configuration getReaders(int i10) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            return z1Var == null ? this.readers_.get(i10) : (Reader.Configuration) z1Var.n(i10);
        }

        public Reader.Configuration.Builder getReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().k(i10);
        }

        public List<Reader.Configuration.Builder> getReadersBuilderList() {
            return getReadersFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getReadersCount() {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            return z1Var == null ? this.readers_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Reader.Configuration> getReadersList() {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.readers_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            return z1Var == null ? this.readers_.get(i10) : (Reader.ConfigurationOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.readers_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public boolean hasBpk() {
            return (this.bpkBuilder_ == null && this.bpk_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeBpk(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.bpkBuilder_;
            if (e2Var == null) {
                StringValue stringValue2 = this.bpk_;
                if (stringValue2 != null) {
                    this.bpk_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.bpk_ = stringValue;
                }
                onChanged();
            } else {
                e2Var.g(stringValue);
            }
            return this;
        }

        public Builder removeMonitors(int i10) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder removeReaders(int i10) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                ensureReadersIsMutable();
                this.readers_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setBpk(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.bpkBuilder_;
            if (e2Var == null) {
                stringValue.getClass();
                this.bpk_ = stringValue;
                onChanged();
            } else {
                e2Var.i(stringValue);
            }
            return this;
        }

        public Builder setMonitors(int i10, Monitor.Configuration configuration) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.set(i10, configuration);
                onChanged();
            } else {
                z1Var.w(i10, configuration);
            }
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration configuration) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.set(i10, configuration);
                onChanged();
            } else {
                z1Var.w(i10, configuration);
            }
            return this;
        }

        private Builder() {
            this.monitors_ = Collections.emptyList();
            this.readers_ = Collections.emptyList();
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
            int i10 = this.bitField0_;
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                if ((i10 & 1) != 0) {
                    this.monitors_ = Collections.unmodifiableList(this.monitors_);
                    this.bitField0_ &= -2;
                }
                configuration.monitors_ = this.monitors_;
            } else {
                configuration.monitors_ = z1Var.f();
            }
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var2 = this.readersBuilder_;
            if (z1Var2 != null) {
                configuration.readers_ = z1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.readers_ = Collections.unmodifiableList(this.readers_);
                    this.bitField0_ &= -3;
                }
                configuration.readers_ = this.readers_;
            }
            e2<StringValue, StringValue.Builder, h2> e2Var = this.bpkBuilder_;
            if (e2Var == null) {
                configuration.bpk_ = this.bpk_;
            } else {
                configuration.bpk_ = (StringValue) e2Var.a();
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

        public Monitor.Configuration.Builder addMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().b(i10, Monitor.Configuration.getDefaultInstance());
        }

        public Reader.Configuration.Builder addReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().b(i10, Reader.Configuration.getDefaultInstance());
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
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                this.monitors_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var2 = this.readersBuilder_;
            if (z1Var2 == null) {
                this.readers_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                z1Var2.g();
            }
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
            } else {
                this.bpk_ = null;
                this.bpkBuilder_ = null;
            }
            return this;
        }

        public Builder setBpk(StringValue.Builder builder) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.bpkBuilder_;
            if (e2Var == null) {
                this.bpk_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.monitors_ = Collections.emptyList();
            this.readers_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addMonitors(int i10, Monitor.Configuration configuration) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, configuration);
                onChanged();
            } else {
                z1Var.d(i10, configuration);
            }
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration configuration) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.add(i10, configuration);
                onChanged();
            } else {
                z1Var.d(i10, configuration);
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

        public Builder setMonitors(int i10, Monitor.Configuration.Builder builder) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration.Builder builder) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                ensureReadersIsMutable();
                this.readers_.set(i10, builder.build());
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
            if (this.monitorsBuilder_ == null) {
                if (!configuration.monitors_.isEmpty()) {
                    if (this.monitors_.isEmpty()) {
                        this.monitors_ = configuration.monitors_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMonitorsIsMutable();
                        this.monitors_.addAll(configuration.monitors_);
                    }
                    onChanged();
                }
            } else if (!configuration.monitors_.isEmpty()) {
                if (!this.monitorsBuilder_.t()) {
                    this.monitorsBuilder_.a(configuration.monitors_);
                } else {
                    this.monitorsBuilder_.h();
                    this.monitorsBuilder_ = null;
                    this.monitors_ = configuration.monitors_;
                    this.bitField0_ &= -2;
                    this.monitorsBuilder_ = j0.alwaysUseFieldBuilders ? getMonitorsFieldBuilder() : null;
                }
            }
            if (this.readersBuilder_ == null) {
                if (!configuration.readers_.isEmpty()) {
                    if (this.readers_.isEmpty()) {
                        this.readers_ = configuration.readers_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureReadersIsMutable();
                        this.readers_.addAll(configuration.readers_);
                    }
                    onChanged();
                }
            } else if (!configuration.readers_.isEmpty()) {
                if (!this.readersBuilder_.t()) {
                    this.readersBuilder_.a(configuration.readers_);
                } else {
                    this.readersBuilder_.h();
                    this.readersBuilder_ = null;
                    this.readers_ = configuration.readers_;
                    this.bitField0_ &= -3;
                    this.readersBuilder_ = j0.alwaysUseFieldBuilders ? getReadersFieldBuilder() : null;
                }
            }
            if (configuration.hasBpk()) {
                mergeBpk(configuration.getBpk());
            }
            mergeUnknownFields(((j0) configuration).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMonitors(Monitor.Configuration.Builder builder) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addReaders(Reader.Configuration.Builder builder) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                ensureReadersIsMutable();
                this.readers_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addMonitors(int i10, Monitor.Configuration.Builder builder) {
            z1<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> z1Var = this.monitorsBuilder_;
            if (z1Var == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration.Builder builder) {
            z1<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> z1Var = this.readersBuilder_;
            if (z1Var == null) {
                ensureReadersIsMutable();
                this.readers_.add(i10, builder.build());
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
        this.monitors_ = Collections.emptyList();
        this.readers_ = Collections.emptyList();
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
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = nVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if ((i10 & 1) == 0) {
                                    this.monitors_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.monitors_.add((Monitor.Configuration) nVar.A(Monitor.Configuration.parser(), yVar));
                            } else if (iK == 18) {
                                if ((i10 & 2) == 0) {
                                    this.readers_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.readers_.add((Reader.Configuration) nVar.A(Reader.Configuration.parser(), yVar));
                            } else if (iK != 26) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                StringValue stringValue = this.bpk_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                this.bpk_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.bpk_ = builder.buildPartial();
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
                    this.monitors_ = Collections.unmodifiableList(this.monitors_);
                }
                if ((i10 & 2) != 0) {
                    this.readers_ = Collections.unmodifiableList(this.readers_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i10 & 1) != 0) {
            this.monitors_ = Collections.unmodifiableList(this.monitors_);
        }
        if ((i10 & 2) != 0) {
            this.readers_ = Collections.unmodifiableList(this.readers_);
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
