package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
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
public final class AssetCache extends j0 implements AssetCacheOrBuilder {
    private static final AssetCache DEFAULT_INSTANCE = new AssetCache();
    private static final s1<AssetCache> PARSER = new b<AssetCache>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.1
        @Override // com.explorestack.protobuf.s1
        public AssetCache parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new AssetCache(nVar, yVar);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    public static final class CleanConfiguration extends j0 implements CleanConfigurationOrBuilder {
        private static final CleanConfiguration DEFAULT_INSTANCE = new CleanConfiguration();
        private static final s1<CleanConfiguration> PARSER = new b<CleanConfiguration>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.CleanConfiguration.1
            @Override // com.explorestack.protobuf.s1
            public CleanConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new CleanConfiguration(nVar, yVar);
            }
        };
        public static final int TRIGGER_ON_CACHING_FIELD_NUMBER = 2;
        public static final int TRIGGER_ON_DISK_ISSUE_FIELD_NUMBER = 3;
        public static final int TRIGGER_ON_STARTUP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private boolean triggerOnCaching_;
        private boolean triggerOnDiskIssue_;
        private boolean triggerOnStartup_;

        public static CleanConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CleanConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CleanConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CleanConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<CleanConfiguration> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CleanConfiguration)) {
                return super.equals(obj);
            }
            CleanConfiguration cleanConfiguration = (CleanConfiguration) obj;
            return getTriggerOnStartup() == cleanConfiguration.getTriggerOnStartup() && getTriggerOnCaching() == cleanConfiguration.getTriggerOnCaching() && getTriggerOnDiskIssue() == cleanConfiguration.getTriggerOnDiskIssue() && this.unknownFields.equals(cleanConfiguration.unknownFields);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<CleanConfiguration> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            boolean z10 = this.triggerOnStartup_;
            int iE = z10 ? 0 + CodedOutputStream.e(1, z10) : 0;
            boolean z11 = this.triggerOnCaching_;
            if (z11) {
                iE += CodedOutputStream.e(2, z11);
            }
            boolean z12 = this.triggerOnDiskIssue_;
            if (z12) {
                iE += CodedOutputStream.e(3, z12);
            }
            int serializedSize = iE + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnCaching() {
            return this.triggerOnCaching_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnDiskIssue() {
            return this.triggerOnDiskIssue_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
        public boolean getTriggerOnStartup() {
            return this.triggerOnStartup_;
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
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + l0.d(getTriggerOnStartup())) * 37) + 2) * 53) + l0.d(getTriggerOnCaching())) * 37) + 3) * 53) + l0.d(getTriggerOnDiskIssue())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable.d(CleanConfiguration.class, Builder.class);
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
            return new CleanConfiguration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean z10 = this.triggerOnStartup_;
            if (z10) {
                codedOutputStream.n0(1, z10);
            }
            boolean z11 = this.triggerOnCaching_;
            if (z11) {
                codedOutputStream.n0(2, z11);
            }
            boolean z12 = this.triggerOnDiskIssue_;
            if (z12) {
                codedOutputStream.n0(3, z12);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements CleanConfigurationOrBuilder {
            private boolean triggerOnCaching_;
            private boolean triggerOnDiskIssue_;
            private boolean triggerOnStartup_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearTriggerOnCaching() {
                this.triggerOnCaching_ = false;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnDiskIssue() {
                this.triggerOnDiskIssue_ = false;
                onChanged();
                return this;
            }

            public Builder clearTriggerOnStartup() {
                this.triggerOnStartup_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnCaching() {
                return this.triggerOnCaching_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnDiskIssue() {
                return this.triggerOnDiskIssue_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.CleanConfigurationOrBuilder
            public boolean getTriggerOnStartup() {
                return this.triggerOnStartup_;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_CleanConfiguration_fieldAccessorTable.d(CleanConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setTriggerOnCaching(boolean z10) {
                this.triggerOnCaching_ = z10;
                onChanged();
                return this;
            }

            public Builder setTriggerOnDiskIssue(boolean z10) {
                this.triggerOnDiskIssue_ = z10;
                onChanged();
                return this;
            }

            public Builder setTriggerOnStartup(boolean z10) {
                this.triggerOnStartup_ = z10;
                onChanged();
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
            public CleanConfiguration build() {
                CleanConfiguration cleanConfigurationBuildPartial = buildPartial();
                if (cleanConfigurationBuildPartial.isInitialized()) {
                    return cleanConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cleanConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public CleanConfiguration buildPartial() {
                CleanConfiguration cleanConfiguration = new CleanConfiguration(this);
                cleanConfiguration.triggerOnStartup_ = this.triggerOnStartup_;
                cleanConfiguration.triggerOnCaching_ = this.triggerOnCaching_;
                cleanConfiguration.triggerOnDiskIssue_ = this.triggerOnDiskIssue_;
                onBuilt();
                return cleanConfiguration;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public CleanConfiguration mo164getDefaultInstanceForType() {
                return CleanConfiguration.getDefaultInstance();
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
                this.triggerOnStartup_ = false;
                this.triggerOnCaching_ = false;
                this.triggerOnDiskIssue_ = false;
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CleanConfiguration) {
                    return mergeFrom((CleanConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CleanConfiguration cleanConfiguration) {
                if (cleanConfiguration == CleanConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (cleanConfiguration.getTriggerOnStartup()) {
                    setTriggerOnStartup(cleanConfiguration.getTriggerOnStartup());
                }
                if (cleanConfiguration.getTriggerOnCaching()) {
                    setTriggerOnCaching(cleanConfiguration.getTriggerOnCaching());
                }
                if (cleanConfiguration.getTriggerOnDiskIssue()) {
                    setTriggerOnDiskIssue(cleanConfiguration.getTriggerOnDiskIssue());
                }
                mergeUnknownFields(((j0) cleanConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                CleanConfiguration cleanConfiguration = null;
                try {
                    try {
                        CleanConfiguration cleanConfiguration2 = (CleanConfiguration) CleanConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                        if (cleanConfiguration2 != null) {
                            mergeFrom(cleanConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        CleanConfiguration cleanConfiguration3 = (CleanConfiguration) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            cleanConfiguration = cleanConfiguration3;
                            if (cleanConfiguration != null) {
                                mergeFrom(cleanConfiguration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cleanConfiguration != null) {
                        mergeFrom(cleanConfiguration);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(CleanConfiguration cleanConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cleanConfiguration);
        }

        public static CleanConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private CleanConfiguration(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CleanConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (CleanConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static CleanConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public CleanConfiguration mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static CleanConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private CleanConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CleanConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static CleanConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private CleanConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.triggerOnStartup_ = nVar.q();
                            } else if (iK == 16) {
                                this.triggerOnCaching_ = nVar.q();
                            } else if (iK != 24) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                this.triggerOnDiskIssue_ = nVar.q();
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

        public static CleanConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (CleanConfiguration) j0.parseWithIOException(PARSER, inputStream);
        }

        public static CleanConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (CleanConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static CleanConfiguration parseFrom(n nVar) throws IOException {
            return (CleanConfiguration) j0.parseWithIOException(PARSER, nVar);
        }

        public static CleanConfiguration parseFrom(n nVar, y yVar) throws IOException {
            return (CleanConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface CleanConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        boolean getTriggerOnCaching();

        boolean getTriggerOnDiskIssue();

        boolean getTriggerOnStartup();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Configuration extends j0 implements ConfigurationOrBuilder {
        public static final int CLEAN_CONFIGURATION_FIELD_NUMBER = 1;
        public static final int CONNECTION_CONFIGURATION_FIELD_NUMBER = 2;
        private static final Configuration DEFAULT_INSTANCE = new Configuration();
        private static final s1<Configuration> PARSER = new b<Configuration>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.Configuration.1
            @Override // com.explorestack.protobuf.s1
            public Configuration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Configuration(nVar, yVar);
            }
        };
        public static final int POLICY_CONFIGURATION_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private CleanConfiguration cleanConfiguration_;
        private ConnectionConfiguration connectionConfiguration_;
        private byte memoizedIsInitialized;
        private PolicyConfiguration policyConfiguration_;

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
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
            if (hasCleanConfiguration() != configuration.hasCleanConfiguration()) {
                return false;
            }
            if ((hasCleanConfiguration() && !getCleanConfiguration().equals(configuration.getCleanConfiguration())) || hasConnectionConfiguration() != configuration.hasConnectionConfiguration()) {
                return false;
            }
            if ((!hasConnectionConfiguration() || getConnectionConfiguration().equals(configuration.getConnectionConfiguration())) && hasPolicyConfiguration() == configuration.hasPolicyConfiguration()) {
                return (!hasPolicyConfiguration() || getPolicyConfiguration().equals(configuration.getPolicyConfiguration())) && this.unknownFields.equals(configuration.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public CleanConfiguration getCleanConfiguration() {
            CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
            return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public CleanConfigurationOrBuilder getCleanConfigurationOrBuilder() {
            return getCleanConfiguration();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public ConnectionConfiguration getConnectionConfiguration() {
            ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
            return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder() {
            return getConnectionConfiguration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Configuration> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public PolicyConfiguration getPolicyConfiguration() {
            PolicyConfiguration policyConfiguration = this.policyConfiguration_;
            return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder() {
            return getPolicyConfiguration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.cleanConfiguration_ != null ? 0 + CodedOutputStream.G(1, getCleanConfiguration()) : 0;
            if (this.connectionConfiguration_ != null) {
                iG += CodedOutputStream.G(2, getConnectionConfiguration());
            }
            if (this.policyConfiguration_ != null) {
                iG += CodedOutputStream.G(3, getPolicyConfiguration());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasCleanConfiguration() {
            return this.cleanConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasConnectionConfiguration() {
            return this.connectionConfiguration_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
        public boolean hasPolicyConfiguration() {
            return this.policyConfiguration_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasCleanConfiguration()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCleanConfiguration().hashCode();
            }
            if (hasConnectionConfiguration()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getConnectionConfiguration().hashCode();
            }
            if (hasPolicyConfiguration()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getPolicyConfiguration().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
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
            if (this.cleanConfiguration_ != null) {
                codedOutputStream.L0(1, getCleanConfiguration());
            }
            if (this.connectionConfiguration_ != null) {
                codedOutputStream.L0(2, getConnectionConfiguration());
            }
            if (this.policyConfiguration_ != null) {
                codedOutputStream.L0(3, getPolicyConfiguration());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ConfigurationOrBuilder {
            private e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> cleanConfigurationBuilder_;
            private CleanConfiguration cleanConfiguration_;
            private e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> connectionConfigurationBuilder_;
            private ConnectionConfiguration connectionConfiguration_;
            private e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> policyConfigurationBuilder_;
            private PolicyConfiguration policyConfiguration_;

            private e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> getCleanConfigurationFieldBuilder() {
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfigurationBuilder_ = new e2<>(getCleanConfiguration(), getParentForChildren(), isClean());
                    this.cleanConfiguration_ = null;
                }
                return this.cleanConfigurationBuilder_;
            }

            private e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> getConnectionConfigurationFieldBuilder() {
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfigurationBuilder_ = new e2<>(getConnectionConfiguration(), getParentForChildren(), isClean());
                    this.connectionConfiguration_ = null;
                }
                return this.connectionConfigurationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
            }

            private e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> getPolicyConfigurationFieldBuilder() {
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfigurationBuilder_ = new e2<>(getPolicyConfiguration(), getParentForChildren(), isClean());
                    this.policyConfiguration_ = null;
                }
                return this.policyConfigurationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearCleanConfiguration() {
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfiguration_ = null;
                    onChanged();
                } else {
                    this.cleanConfiguration_ = null;
                    this.cleanConfigurationBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectionConfiguration() {
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfiguration_ = null;
                    onChanged();
                } else {
                    this.connectionConfiguration_ = null;
                    this.connectionConfigurationBuilder_ = null;
                }
                return this;
            }

            public Builder clearPolicyConfiguration() {
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfiguration_ = null;
                    onChanged();
                } else {
                    this.policyConfiguration_ = null;
                    this.policyConfigurationBuilder_ = null;
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public CleanConfiguration getCleanConfiguration() {
                e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> e2Var = this.cleanConfigurationBuilder_;
                if (e2Var != null) {
                    return (CleanConfiguration) e2Var.e();
                }
                CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
            }

            public CleanConfiguration.Builder getCleanConfigurationBuilder() {
                onChanged();
                return (CleanConfiguration.Builder) getCleanConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public CleanConfigurationOrBuilder getCleanConfigurationOrBuilder() {
                e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> e2Var = this.cleanConfigurationBuilder_;
                if (e2Var != null) {
                    return (CleanConfigurationOrBuilder) e2Var.f();
                }
                CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                return cleanConfiguration == null ? CleanConfiguration.getDefaultInstance() : cleanConfiguration;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public ConnectionConfiguration getConnectionConfiguration() {
                e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> e2Var = this.connectionConfigurationBuilder_;
                if (e2Var != null) {
                    return (ConnectionConfiguration) e2Var.e();
                }
                ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
            }

            public ConnectionConfiguration.Builder getConnectionConfigurationBuilder() {
                onChanged();
                return (ConnectionConfiguration.Builder) getConnectionConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder() {
                e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> e2Var = this.connectionConfigurationBuilder_;
                if (e2Var != null) {
                    return (ConnectionConfigurationOrBuilder) e2Var.f();
                }
                ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                return connectionConfiguration == null ? ConnectionConfiguration.getDefaultInstance() : connectionConfiguration;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public PolicyConfiguration getPolicyConfiguration() {
                e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> e2Var = this.policyConfigurationBuilder_;
                if (e2Var != null) {
                    return (PolicyConfiguration) e2Var.e();
                }
                PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
            }

            public PolicyConfiguration.Builder getPolicyConfigurationBuilder() {
                onChanged();
                return (PolicyConfiguration.Builder) getPolicyConfigurationFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder() {
                e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> e2Var = this.policyConfigurationBuilder_;
                if (e2Var != null) {
                    return (PolicyConfigurationOrBuilder) e2Var.f();
                }
                PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                return policyConfiguration == null ? PolicyConfiguration.getDefaultInstance() : policyConfiguration;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasCleanConfiguration() {
                return (this.cleanConfigurationBuilder_ == null && this.cleanConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasConnectionConfiguration() {
                return (this.connectionConfigurationBuilder_ == null && this.connectionConfiguration_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConfigurationOrBuilder
            public boolean hasPolicyConfiguration() {
                return (this.policyConfigurationBuilder_ == null && this.policyConfiguration_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_Configuration_fieldAccessorTable.d(Configuration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCleanConfiguration(CleanConfiguration cleanConfiguration) {
                e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> e2Var = this.cleanConfigurationBuilder_;
                if (e2Var == null) {
                    CleanConfiguration cleanConfiguration2 = this.cleanConfiguration_;
                    if (cleanConfiguration2 != null) {
                        this.cleanConfiguration_ = CleanConfiguration.newBuilder(cleanConfiguration2).mergeFrom(cleanConfiguration).buildPartial();
                    } else {
                        this.cleanConfiguration_ = cleanConfiguration;
                    }
                    onChanged();
                } else {
                    e2Var.g(cleanConfiguration);
                }
                return this;
            }

            public Builder mergeConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
                e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> e2Var = this.connectionConfigurationBuilder_;
                if (e2Var == null) {
                    ConnectionConfiguration connectionConfiguration2 = this.connectionConfiguration_;
                    if (connectionConfiguration2 != null) {
                        this.connectionConfiguration_ = ConnectionConfiguration.newBuilder(connectionConfiguration2).mergeFrom(connectionConfiguration).buildPartial();
                    } else {
                        this.connectionConfiguration_ = connectionConfiguration;
                    }
                    onChanged();
                } else {
                    e2Var.g(connectionConfiguration);
                }
                return this;
            }

            public Builder mergePolicyConfiguration(PolicyConfiguration policyConfiguration) {
                e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> e2Var = this.policyConfigurationBuilder_;
                if (e2Var == null) {
                    PolicyConfiguration policyConfiguration2 = this.policyConfiguration_;
                    if (policyConfiguration2 != null) {
                        this.policyConfiguration_ = PolicyConfiguration.newBuilder(policyConfiguration2).mergeFrom(policyConfiguration).buildPartial();
                    } else {
                        this.policyConfiguration_ = policyConfiguration;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyConfiguration);
                }
                return this;
            }

            public Builder setCleanConfiguration(CleanConfiguration cleanConfiguration) {
                e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> e2Var = this.cleanConfigurationBuilder_;
                if (e2Var == null) {
                    cleanConfiguration.getClass();
                    this.cleanConfiguration_ = cleanConfiguration;
                    onChanged();
                } else {
                    e2Var.i(cleanConfiguration);
                }
                return this;
            }

            public Builder setConnectionConfiguration(ConnectionConfiguration connectionConfiguration) {
                e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> e2Var = this.connectionConfigurationBuilder_;
                if (e2Var == null) {
                    connectionConfiguration.getClass();
                    this.connectionConfiguration_ = connectionConfiguration;
                    onChanged();
                } else {
                    e2Var.i(connectionConfiguration);
                }
                return this;
            }

            public Builder setPolicyConfiguration(PolicyConfiguration policyConfiguration) {
                e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> e2Var = this.policyConfigurationBuilder_;
                if (e2Var == null) {
                    policyConfiguration.getClass();
                    this.policyConfiguration_ = policyConfiguration;
                    onChanged();
                } else {
                    e2Var.i(policyConfiguration);
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
                e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> e2Var = this.cleanConfigurationBuilder_;
                if (e2Var == null) {
                    configuration.cleanConfiguration_ = this.cleanConfiguration_;
                } else {
                    configuration.cleanConfiguration_ = (CleanConfiguration) e2Var.a();
                }
                e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> e2Var2 = this.connectionConfigurationBuilder_;
                if (e2Var2 == null) {
                    configuration.connectionConfiguration_ = this.connectionConfiguration_;
                } else {
                    configuration.connectionConfiguration_ = (ConnectionConfiguration) e2Var2.a();
                }
                e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> e2Var3 = this.policyConfigurationBuilder_;
                if (e2Var3 == null) {
                    configuration.policyConfiguration_ = this.policyConfiguration_;
                } else {
                    configuration.policyConfiguration_ = (PolicyConfiguration) e2Var3.a();
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
                if (this.cleanConfigurationBuilder_ == null) {
                    this.cleanConfiguration_ = null;
                } else {
                    this.cleanConfiguration_ = null;
                    this.cleanConfigurationBuilder_ = null;
                }
                if (this.connectionConfigurationBuilder_ == null) {
                    this.connectionConfiguration_ = null;
                } else {
                    this.connectionConfiguration_ = null;
                    this.connectionConfigurationBuilder_ = null;
                }
                if (this.policyConfigurationBuilder_ == null) {
                    this.policyConfiguration_ = null;
                } else {
                    this.policyConfiguration_ = null;
                    this.policyConfigurationBuilder_ = null;
                }
                return this;
            }

            public Builder setCleanConfiguration(CleanConfiguration.Builder builder) {
                e2<CleanConfiguration, CleanConfiguration.Builder, CleanConfigurationOrBuilder> e2Var = this.cleanConfigurationBuilder_;
                if (e2Var == null) {
                    this.cleanConfiguration_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setConnectionConfiguration(ConnectionConfiguration.Builder builder) {
                e2<ConnectionConfiguration, ConnectionConfiguration.Builder, ConnectionConfigurationOrBuilder> e2Var = this.connectionConfigurationBuilder_;
                if (e2Var == null) {
                    this.connectionConfiguration_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setPolicyConfiguration(PolicyConfiguration.Builder builder) {
                e2<PolicyConfiguration, PolicyConfiguration.Builder, PolicyConfigurationOrBuilder> e2Var = this.policyConfigurationBuilder_;
                if (e2Var == null) {
                    this.policyConfiguration_ = builder.build();
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

            public Builder mergeFrom(Configuration configuration) {
                if (configuration == Configuration.getDefaultInstance()) {
                    return this;
                }
                if (configuration.hasCleanConfiguration()) {
                    mergeCleanConfiguration(configuration.getCleanConfiguration());
                }
                if (configuration.hasConnectionConfiguration()) {
                    mergeConnectionConfiguration(configuration.getConnectionConfiguration());
                }
                if (configuration.hasPolicyConfiguration()) {
                    mergePolicyConfiguration(configuration.getPolicyConfiguration());
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
                                CleanConfiguration cleanConfiguration = this.cleanConfiguration_;
                                CleanConfiguration.Builder builder = cleanConfiguration != null ? cleanConfiguration.toBuilder() : null;
                                CleanConfiguration cleanConfiguration2 = (CleanConfiguration) nVar.A(CleanConfiguration.parser(), yVar);
                                this.cleanConfiguration_ = cleanConfiguration2;
                                if (builder != null) {
                                    builder.mergeFrom(cleanConfiguration2);
                                    this.cleanConfiguration_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                ConnectionConfiguration connectionConfiguration = this.connectionConfiguration_;
                                ConnectionConfiguration.Builder builder2 = connectionConfiguration != null ? connectionConfiguration.toBuilder() : null;
                                ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) nVar.A(ConnectionConfiguration.parser(), yVar);
                                this.connectionConfiguration_ = connectionConfiguration2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(connectionConfiguration2);
                                    this.connectionConfiguration_ = builder2.buildPartial();
                                }
                            } else if (iK != 26) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                PolicyConfiguration policyConfiguration = this.policyConfiguration_;
                                PolicyConfiguration.Builder builder3 = policyConfiguration != null ? policyConfiguration.toBuilder() : null;
                                PolicyConfiguration policyConfiguration2 = (PolicyConfiguration) nVar.A(PolicyConfiguration.parser(), yVar);
                                this.policyConfiguration_ = policyConfiguration2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(policyConfiguration2);
                                    this.policyConfiguration_ = builder3.buildPartial();
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

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) j0.parseWithIOException(PARSER, inputStream);
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
        CleanConfiguration getCleanConfiguration();

        CleanConfigurationOrBuilder getCleanConfigurationOrBuilder();

        ConnectionConfiguration getConnectionConfiguration();

        ConnectionConfigurationOrBuilder getConnectionConfigurationOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        PolicyConfiguration getPolicyConfiguration();

        PolicyConfigurationOrBuilder getPolicyConfigurationOrBuilder();

        boolean hasCleanConfiguration();

        boolean hasConnectionConfiguration();

        boolean hasPolicyConfiguration();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class ConnectionConfiguration extends j0 implements ConnectionConfigurationOrBuilder {
        public static final int DOWNLOAD_REQUEST_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int HEAD_REQUEST_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private long downloadRequestTimeoutMs_;
        private long headRequestTimeoutMs_;
        private byte memoizedIsInitialized;
        private static final ConnectionConfiguration DEFAULT_INSTANCE = new ConnectionConfiguration();
        private static final s1<ConnectionConfiguration> PARSER = new b<ConnectionConfiguration>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfiguration.1
            @Override // com.explorestack.protobuf.s1
            public ConnectionConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new ConnectionConfiguration(nVar, yVar);
            }
        };

        public static ConnectionConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConnectionConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<ConnectionConfiguration> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionConfiguration)) {
                return super.equals(obj);
            }
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            return getHeadRequestTimeoutMs() == connectionConfiguration.getHeadRequestTimeoutMs() && getDownloadRequestTimeoutMs() == connectionConfiguration.getDownloadRequestTimeoutMs() && this.unknownFields.equals(connectionConfiguration.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
        public long getDownloadRequestTimeoutMs() {
            return this.downloadRequestTimeoutMs_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
        public long getHeadRequestTimeoutMs() {
            return this.headRequestTimeoutMs_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<ConnectionConfiguration> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.headRequestTimeoutMs_;
            int iZ = j10 != 0 ? 0 + CodedOutputStream.z(1, j10) : 0;
            long j11 = this.downloadRequestTimeoutMs_;
            if (j11 != 0) {
                iZ += CodedOutputStream.z(2, j11);
            }
            int serializedSize = iZ + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + l0.i(getHeadRequestTimeoutMs())) * 37) + 2) * 53) + l0.i(getDownloadRequestTimeoutMs())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable.d(ConnectionConfiguration.class, Builder.class);
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
            return new ConnectionConfiguration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.headRequestTimeoutMs_;
            if (j10 != 0) {
                codedOutputStream.J0(1, j10);
            }
            long j11 = this.downloadRequestTimeoutMs_;
            if (j11 != 0) {
                codedOutputStream.J0(2, j11);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ConnectionConfigurationOrBuilder {
            private long downloadRequestTimeoutMs_;
            private long headRequestTimeoutMs_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearDownloadRequestTimeoutMs() {
                this.downloadRequestTimeoutMs_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearHeadRequestTimeoutMs() {
                this.headRequestTimeoutMs_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
            public long getDownloadRequestTimeoutMs() {
                return this.downloadRequestTimeoutMs_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.ConnectionConfigurationOrBuilder
            public long getHeadRequestTimeoutMs() {
                return this.headRequestTimeoutMs_;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_ConnectionConfiguration_fieldAccessorTable.d(ConnectionConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDownloadRequestTimeoutMs(long j10) {
                this.downloadRequestTimeoutMs_ = j10;
                onChanged();
                return this;
            }

            public Builder setHeadRequestTimeoutMs(long j10) {
                this.headRequestTimeoutMs_ = j10;
                onChanged();
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
            public ConnectionConfiguration build() {
                ConnectionConfiguration connectionConfigurationBuildPartial = buildPartial();
                if (connectionConfigurationBuildPartial.isInitialized()) {
                    return connectionConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ConnectionConfiguration buildPartial() {
                ConnectionConfiguration connectionConfiguration = new ConnectionConfiguration(this);
                connectionConfiguration.headRequestTimeoutMs_ = this.headRequestTimeoutMs_;
                connectionConfiguration.downloadRequestTimeoutMs_ = this.downloadRequestTimeoutMs_;
                onBuilt();
                return connectionConfiguration;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public ConnectionConfiguration mo164getDefaultInstanceForType() {
                return ConnectionConfiguration.getDefaultInstance();
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
                this.headRequestTimeoutMs_ = 0L;
                this.downloadRequestTimeoutMs_ = 0L;
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionConfiguration) {
                    return mergeFrom((ConnectionConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionConfiguration connectionConfiguration) {
                if (connectionConfiguration == ConnectionConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (connectionConfiguration.getHeadRequestTimeoutMs() != 0) {
                    setHeadRequestTimeoutMs(connectionConfiguration.getHeadRequestTimeoutMs());
                }
                if (connectionConfiguration.getDownloadRequestTimeoutMs() != 0) {
                    setDownloadRequestTimeoutMs(connectionConfiguration.getDownloadRequestTimeoutMs());
                }
                mergeUnknownFields(((j0) connectionConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                ConnectionConfiguration connectionConfiguration = null;
                try {
                    try {
                        ConnectionConfiguration connectionConfiguration2 = (ConnectionConfiguration) ConnectionConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                        if (connectionConfiguration2 != null) {
                            mergeFrom(connectionConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        ConnectionConfiguration connectionConfiguration3 = (ConnectionConfiguration) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            connectionConfiguration = connectionConfiguration3;
                            if (connectionConfiguration != null) {
                                mergeFrom(connectionConfiguration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (connectionConfiguration != null) {
                        mergeFrom(connectionConfiguration);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(ConnectionConfiguration connectionConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionConfiguration);
        }

        public static ConnectionConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private ConnectionConfiguration(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (ConnectionConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static ConnectionConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public ConnectionConfiguration mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ConnectionConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ConnectionConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static ConnectionConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private ConnectionConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                if (iK == 8) {
                                    this.headRequestTimeoutMs_ = nVar.z();
                                } else if (iK != 16) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    this.downloadRequestTimeoutMs_ = nVar.z();
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

        public static ConnectionConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (ConnectionConfiguration) j0.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (ConnectionConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static ConnectionConfiguration parseFrom(n nVar) throws IOException {
            return (ConnectionConfiguration) j0.parseWithIOException(PARSER, nVar);
        }

        public static ConnectionConfiguration parseFrom(n nVar, y yVar) throws IOException {
            return (ConnectionConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface ConnectionConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        long getDownloadRequestTimeoutMs();

        long getHeadRequestTimeoutMs();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DownloadPolicy extends j0 implements DownloadPolicyOrBuilder {
        public static final int MAX_FILE_SIZE_BYTES_FIELD_NUMBER = 2;
        public static final int MAX_PING_TIME_MS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private PolicyLimit maxFileSizeBytes_;
        private PolicyLimit maxPingTimeMs_;
        private byte memoizedIsInitialized;
        private static final DownloadPolicy DEFAULT_INSTANCE = new DownloadPolicy();
        private static final s1<DownloadPolicy> PARSER = new b<DownloadPolicy>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicy.1
            @Override // com.explorestack.protobuf.s1
            public DownloadPolicy parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new DownloadPolicy(nVar, yVar);
            }
        };

        public static DownloadPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DownloadPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DownloadPolicy) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<DownloadPolicy> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DownloadPolicy)) {
                return super.equals(obj);
            }
            DownloadPolicy downloadPolicy = (DownloadPolicy) obj;
            if (hasMaxPingTimeMs() != downloadPolicy.hasMaxPingTimeMs()) {
                return false;
            }
            if ((!hasMaxPingTimeMs() || getMaxPingTimeMs().equals(downloadPolicy.getMaxPingTimeMs())) && hasMaxFileSizeBytes() == downloadPolicy.hasMaxFileSizeBytes()) {
                return (!hasMaxFileSizeBytes() || getMaxFileSizeBytes().equals(downloadPolicy.getMaxFileSizeBytes())) && this.unknownFields.equals(downloadPolicy.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimit getMaxFileSizeBytes() {
            PolicyLimit policyLimit = this.maxFileSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder() {
            return getMaxFileSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimit getMaxPingTimeMs() {
            PolicyLimit policyLimit = this.maxPingTimeMs_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder() {
            return getMaxPingTimeMs();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<DownloadPolicy> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.maxPingTimeMs_ != null ? 0 + CodedOutputStream.G(1, getMaxPingTimeMs()) : 0;
            if (this.maxFileSizeBytes_ != null) {
                iG += CodedOutputStream.G(2, getMaxFileSizeBytes());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public boolean hasMaxFileSizeBytes() {
            return this.maxFileSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
        public boolean hasMaxPingTimeMs() {
            return this.maxPingTimeMs_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMaxPingTimeMs()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMaxPingTimeMs().hashCode();
            }
            if (hasMaxFileSizeBytes()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMaxFileSizeBytes().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable.d(DownloadPolicy.class, Builder.class);
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
            return new DownloadPolicy();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.maxPingTimeMs_ != null) {
                codedOutputStream.L0(1, getMaxPingTimeMs());
            }
            if (this.maxFileSizeBytes_ != null) {
                codedOutputStream.L0(2, getMaxFileSizeBytes());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements DownloadPolicyOrBuilder {
            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> maxFileSizeBytesBuilder_;
            private PolicyLimit maxFileSizeBytes_;
            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> maxPingTimeMsBuilder_;
            private PolicyLimit maxPingTimeMs_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
            }

            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> getMaxFileSizeBytesFieldBuilder() {
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytesBuilder_ = new e2<>(getMaxFileSizeBytes(), getParentForChildren(), isClean());
                    this.maxFileSizeBytes_ = null;
                }
                return this.maxFileSizeBytesBuilder_;
            }

            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> getMaxPingTimeMsFieldBuilder() {
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMsBuilder_ = new e2<>(getMaxPingTimeMs(), getParentForChildren(), isClean());
                    this.maxPingTimeMs_ = null;
                }
                return this.maxPingTimeMsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearMaxFileSizeBytes() {
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytes_ = null;
                    onChanged();
                } else {
                    this.maxFileSizeBytes_ = null;
                    this.maxFileSizeBytesBuilder_ = null;
                }
                return this;
            }

            public Builder clearMaxPingTimeMs() {
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMs_ = null;
                    onChanged();
                } else {
                    this.maxPingTimeMs_ = null;
                    this.maxPingTimeMsBuilder_ = null;
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimit getMaxFileSizeBytes() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxFileSizeBytesBuilder_;
                if (e2Var != null) {
                    return (PolicyLimit) e2Var.e();
                }
                PolicyLimit policyLimit = this.maxFileSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxFileSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxFileSizeBytesFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxFileSizeBytesBuilder_;
                if (e2Var != null) {
                    return (PolicyLimitOrBuilder) e2Var.f();
                }
                PolicyLimit policyLimit = this.maxFileSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimit getMaxPingTimeMs() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxPingTimeMsBuilder_;
                if (e2Var != null) {
                    return (PolicyLimit) e2Var.e();
                }
                PolicyLimit policyLimit = this.maxPingTimeMs_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxPingTimeMsBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxPingTimeMsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxPingTimeMsBuilder_;
                if (e2Var != null) {
                    return (PolicyLimitOrBuilder) e2Var.f();
                }
                PolicyLimit policyLimit = this.maxPingTimeMs_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public boolean hasMaxFileSizeBytes() {
                return (this.maxFileSizeBytesBuilder_ == null && this.maxFileSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.DownloadPolicyOrBuilder
            public boolean hasMaxPingTimeMs() {
                return (this.maxPingTimeMsBuilder_ == null && this.maxPingTimeMs_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_DownloadPolicy_fieldAccessorTable.d(DownloadPolicy.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMaxFileSizeBytes(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxFileSizeBytesBuilder_;
                if (e2Var == null) {
                    PolicyLimit policyLimit2 = this.maxFileSizeBytes_;
                    if (policyLimit2 != null) {
                        this.maxFileSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxFileSizeBytes_ = policyLimit;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyLimit);
                }
                return this;
            }

            public Builder mergeMaxPingTimeMs(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxPingTimeMsBuilder_;
                if (e2Var == null) {
                    PolicyLimit policyLimit2 = this.maxPingTimeMs_;
                    if (policyLimit2 != null) {
                        this.maxPingTimeMs_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxPingTimeMs_ = policyLimit;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyLimit);
                }
                return this;
            }

            public Builder setMaxFileSizeBytes(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxFileSizeBytesBuilder_;
                if (e2Var == null) {
                    policyLimit.getClass();
                    this.maxFileSizeBytes_ = policyLimit;
                    onChanged();
                } else {
                    e2Var.i(policyLimit);
                }
                return this;
            }

            public Builder setMaxPingTimeMs(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxPingTimeMsBuilder_;
                if (e2Var == null) {
                    policyLimit.getClass();
                    this.maxPingTimeMs_ = policyLimit;
                    onChanged();
                } else {
                    e2Var.i(policyLimit);
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
            public DownloadPolicy build() {
                DownloadPolicy downloadPolicyBuildPartial = buildPartial();
                if (downloadPolicyBuildPartial.isInitialized()) {
                    return downloadPolicyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) downloadPolicyBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DownloadPolicy buildPartial() {
                DownloadPolicy downloadPolicy = new DownloadPolicy(this);
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxPingTimeMsBuilder_;
                if (e2Var == null) {
                    downloadPolicy.maxPingTimeMs_ = this.maxPingTimeMs_;
                } else {
                    downloadPolicy.maxPingTimeMs_ = (PolicyLimit) e2Var.a();
                }
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var2 = this.maxFileSizeBytesBuilder_;
                if (e2Var2 == null) {
                    downloadPolicy.maxFileSizeBytes_ = this.maxFileSizeBytes_;
                } else {
                    downloadPolicy.maxFileSizeBytes_ = (PolicyLimit) e2Var2.a();
                }
                onBuilt();
                return downloadPolicy;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public DownloadPolicy mo164getDefaultInstanceForType() {
                return DownloadPolicy.getDefaultInstance();
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
                if (this.maxPingTimeMsBuilder_ == null) {
                    this.maxPingTimeMs_ = null;
                } else {
                    this.maxPingTimeMs_ = null;
                    this.maxPingTimeMsBuilder_ = null;
                }
                if (this.maxFileSizeBytesBuilder_ == null) {
                    this.maxFileSizeBytes_ = null;
                } else {
                    this.maxFileSizeBytes_ = null;
                    this.maxFileSizeBytesBuilder_ = null;
                }
                return this;
            }

            public Builder setMaxFileSizeBytes(PolicyLimit.Builder builder) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxFileSizeBytesBuilder_;
                if (e2Var == null) {
                    this.maxFileSizeBytes_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setMaxPingTimeMs(PolicyLimit.Builder builder) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxPingTimeMsBuilder_;
                if (e2Var == null) {
                    this.maxPingTimeMs_ = builder.build();
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
                if (message instanceof DownloadPolicy) {
                    return mergeFrom((DownloadPolicy) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadPolicy downloadPolicy) {
                if (downloadPolicy == DownloadPolicy.getDefaultInstance()) {
                    return this;
                }
                if (downloadPolicy.hasMaxPingTimeMs()) {
                    mergeMaxPingTimeMs(downloadPolicy.getMaxPingTimeMs());
                }
                if (downloadPolicy.hasMaxFileSizeBytes()) {
                    mergeMaxFileSizeBytes(downloadPolicy.getMaxFileSizeBytes());
                }
                mergeUnknownFields(((j0) downloadPolicy).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                DownloadPolicy downloadPolicy = null;
                try {
                    try {
                        DownloadPolicy downloadPolicy2 = (DownloadPolicy) DownloadPolicy.PARSER.parsePartialFrom(nVar, yVar);
                        if (downloadPolicy2 != null) {
                            mergeFrom(downloadPolicy2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        DownloadPolicy downloadPolicy3 = (DownloadPolicy) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            downloadPolicy = downloadPolicy3;
                            if (downloadPolicy != null) {
                                mergeFrom(downloadPolicy);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (downloadPolicy != null) {
                        mergeFrom(downloadPolicy);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(DownloadPolicy downloadPolicy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadPolicy);
        }

        public static DownloadPolicy parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private DownloadPolicy(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadPolicy parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (DownloadPolicy) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DownloadPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public DownloadPolicy mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DownloadPolicy parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DownloadPolicy() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static DownloadPolicy parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private DownloadPolicy(n nVar, y yVar) throws InvalidProtocolBufferException {
            PolicyLimit.Builder builder;
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
                                PolicyLimit policyLimit = this.maxPingTimeMs_;
                                builder = policyLimit != null ? policyLimit.toBuilder() : null;
                                PolicyLimit policyLimit2 = (PolicyLimit) nVar.A(PolicyLimit.parser(), yVar);
                                this.maxPingTimeMs_ = policyLimit2;
                                if (builder != null) {
                                    builder.mergeFrom(policyLimit2);
                                    this.maxPingTimeMs_ = builder.buildPartial();
                                }
                            } else if (iK != 18) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                PolicyLimit policyLimit3 = this.maxFileSizeBytes_;
                                builder = policyLimit3 != null ? policyLimit3.toBuilder() : null;
                                PolicyLimit policyLimit4 = (PolicyLimit) nVar.A(PolicyLimit.parser(), yVar);
                                this.maxFileSizeBytes_ = policyLimit4;
                                if (builder != null) {
                                    builder.mergeFrom(policyLimit4);
                                    this.maxFileSizeBytes_ = builder.buildPartial();
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

        public static DownloadPolicy parseFrom(InputStream inputStream) throws IOException {
            return (DownloadPolicy) j0.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadPolicy parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (DownloadPolicy) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DownloadPolicy parseFrom(n nVar) throws IOException {
            return (DownloadPolicy) j0.parseWithIOException(PARSER, nVar);
        }

        public static DownloadPolicy parseFrom(n nVar, y yVar) throws IOException {
            return (DownloadPolicy) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface DownloadPolicyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        PolicyLimit getMaxFileSizeBytes();

        PolicyLimitOrBuilder getMaxFileSizeBytesOrBuilder();

        PolicyLimit getMaxPingTimeMs();

        PolicyLimitOrBuilder getMaxPingTimeMsOrBuilder();

        boolean hasMaxFileSizeBytes();

        boolean hasMaxPingTimeMs();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class EvictionPolicy extends j0 implements EvictionPolicyOrBuilder {
        public static final int MAX_DISK_APPLIED_PERCENT_FIELD_NUMBER = 3;
        public static final int MAX_IMAGE_SIZE_BYTES_FIELD_NUMBER = 6;
        public static final int MAX_TTL_SECONDS_FIELD_NUMBER = 4;
        public static final int MAX_VIDEO_SIZE_BYTES_FIELD_NUMBER = 7;
        public static final int MIN_DISK_APPLIED_PERCENT_FIELD_NUMBER = 2;
        public static final int MIN_FREQUENCY_FIELD_NUMBER = 5;
        public static final int SCORE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private double maxDiskAppliedPercent_;
        private PolicyLimit maxImageSizeBytes_;
        private PolicyLimit maxTtlSeconds_;
        private PolicyLimit maxVideoSizeBytes_;
        private byte memoizedIsInitialized;
        private double minDiskAppliedPercent_;
        private PolicyLimit minFrequency_;
        private double score_;
        private static final EvictionPolicy DEFAULT_INSTANCE = new EvictionPolicy();
        private static final s1<EvictionPolicy> PARSER = new b<EvictionPolicy>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicy.1
            @Override // com.explorestack.protobuf.s1
            public EvictionPolicy parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new EvictionPolicy(nVar, yVar);
            }
        };

        public static EvictionPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EvictionPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EvictionPolicy) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EvictionPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<EvictionPolicy> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EvictionPolicy)) {
                return super.equals(obj);
            }
            EvictionPolicy evictionPolicy = (EvictionPolicy) obj;
            if (Double.doubleToLongBits(getScore()) != Double.doubleToLongBits(evictionPolicy.getScore()) || Double.doubleToLongBits(getMinDiskAppliedPercent()) != Double.doubleToLongBits(evictionPolicy.getMinDiskAppliedPercent()) || Double.doubleToLongBits(getMaxDiskAppliedPercent()) != Double.doubleToLongBits(evictionPolicy.getMaxDiskAppliedPercent()) || hasMaxTtlSeconds() != evictionPolicy.hasMaxTtlSeconds()) {
                return false;
            }
            if ((hasMaxTtlSeconds() && !getMaxTtlSeconds().equals(evictionPolicy.getMaxTtlSeconds())) || hasMinFrequency() != evictionPolicy.hasMinFrequency()) {
                return false;
            }
            if ((hasMinFrequency() && !getMinFrequency().equals(evictionPolicy.getMinFrequency())) || hasMaxImageSizeBytes() != evictionPolicy.hasMaxImageSizeBytes()) {
                return false;
            }
            if ((!hasMaxImageSizeBytes() || getMaxImageSizeBytes().equals(evictionPolicy.getMaxImageSizeBytes())) && hasMaxVideoSizeBytes() == evictionPolicy.hasMaxVideoSizeBytes()) {
                return (!hasMaxVideoSizeBytes() || getMaxVideoSizeBytes().equals(evictionPolicy.getMaxVideoSizeBytes())) && this.unknownFields.equals(evictionPolicy.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getMaxDiskAppliedPercent() {
            return this.maxDiskAppliedPercent_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxImageSizeBytes() {
            PolicyLimit policyLimit = this.maxImageSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder() {
            return getMaxImageSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxTtlSeconds() {
            PolicyLimit policyLimit = this.maxTtlSeconds_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder() {
            return getMaxTtlSeconds();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMaxVideoSizeBytes() {
            PolicyLimit policyLimit = this.maxVideoSizeBytes_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder() {
            return getMaxVideoSizeBytes();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getMinDiskAppliedPercent() {
            return this.minDiskAppliedPercent_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimit getMinFrequency() {
            PolicyLimit policyLimit = this.minFrequency_;
            return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public PolicyLimitOrBuilder getMinFrequencyOrBuilder() {
            return getMinFrequency();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<EvictionPolicy> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public double getScore() {
            return this.score_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            double d10 = this.score_;
            int iJ = d10 != 0.0d ? 0 + CodedOutputStream.j(1, d10) : 0;
            double d11 = this.minDiskAppliedPercent_;
            if (d11 != 0.0d) {
                iJ += CodedOutputStream.j(2, d11);
            }
            double d12 = this.maxDiskAppliedPercent_;
            if (d12 != 0.0d) {
                iJ += CodedOutputStream.j(3, d12);
            }
            if (this.maxTtlSeconds_ != null) {
                iJ += CodedOutputStream.G(4, getMaxTtlSeconds());
            }
            if (this.minFrequency_ != null) {
                iJ += CodedOutputStream.G(5, getMinFrequency());
            }
            if (this.maxImageSizeBytes_ != null) {
                iJ += CodedOutputStream.G(6, getMaxImageSizeBytes());
            }
            if (this.maxVideoSizeBytes_ != null) {
                iJ += CodedOutputStream.G(7, getMaxVideoSizeBytes());
            }
            int serializedSize = iJ + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxImageSizeBytes() {
            return this.maxImageSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxTtlSeconds() {
            return this.maxTtlSeconds_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMaxVideoSizeBytes() {
            return this.maxVideoSizeBytes_ != null;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
        public boolean hasMinFrequency() {
            return this.minFrequency_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + l0.i(Double.doubleToLongBits(getScore()))) * 37) + 2) * 53) + l0.i(Double.doubleToLongBits(getMinDiskAppliedPercent()))) * 37) + 3) * 53) + l0.i(Double.doubleToLongBits(getMaxDiskAppliedPercent()));
            if (hasMaxTtlSeconds()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getMaxTtlSeconds().hashCode();
            }
            if (hasMinFrequency()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getMinFrequency().hashCode();
            }
            if (hasMaxImageSizeBytes()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getMaxImageSizeBytes().hashCode();
            }
            if (hasMaxVideoSizeBytes()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getMaxVideoSizeBytes().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable.d(EvictionPolicy.class, Builder.class);
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
            return new EvictionPolicy();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            double d10 = this.score_;
            if (d10 != 0.0d) {
                codedOutputStream.t0(1, d10);
            }
            double d11 = this.minDiskAppliedPercent_;
            if (d11 != 0.0d) {
                codedOutputStream.t0(2, d11);
            }
            double d12 = this.maxDiskAppliedPercent_;
            if (d12 != 0.0d) {
                codedOutputStream.t0(3, d12);
            }
            if (this.maxTtlSeconds_ != null) {
                codedOutputStream.L0(4, getMaxTtlSeconds());
            }
            if (this.minFrequency_ != null) {
                codedOutputStream.L0(5, getMinFrequency());
            }
            if (this.maxImageSizeBytes_ != null) {
                codedOutputStream.L0(6, getMaxImageSizeBytes());
            }
            if (this.maxVideoSizeBytes_ != null) {
                codedOutputStream.L0(7, getMaxVideoSizeBytes());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements EvictionPolicyOrBuilder {
            private double maxDiskAppliedPercent_;
            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> maxImageSizeBytesBuilder_;
            private PolicyLimit maxImageSizeBytes_;
            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> maxTtlSecondsBuilder_;
            private PolicyLimit maxTtlSeconds_;
            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> maxVideoSizeBytesBuilder_;
            private PolicyLimit maxVideoSizeBytes_;
            private double minDiskAppliedPercent_;
            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> minFrequencyBuilder_;
            private PolicyLimit minFrequency_;
            private double score_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
            }

            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> getMaxImageSizeBytesFieldBuilder() {
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytesBuilder_ = new e2<>(getMaxImageSizeBytes(), getParentForChildren(), isClean());
                    this.maxImageSizeBytes_ = null;
                }
                return this.maxImageSizeBytesBuilder_;
            }

            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> getMaxTtlSecondsFieldBuilder() {
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSecondsBuilder_ = new e2<>(getMaxTtlSeconds(), getParentForChildren(), isClean());
                    this.maxTtlSeconds_ = null;
                }
                return this.maxTtlSecondsBuilder_;
            }

            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> getMaxVideoSizeBytesFieldBuilder() {
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytesBuilder_ = new e2<>(getMaxVideoSizeBytes(), getParentForChildren(), isClean());
                    this.maxVideoSizeBytes_ = null;
                }
                return this.maxVideoSizeBytesBuilder_;
            }

            private e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> getMinFrequencyFieldBuilder() {
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequencyBuilder_ = new e2<>(getMinFrequency(), getParentForChildren(), isClean());
                    this.minFrequency_ = null;
                }
                return this.minFrequencyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearMaxDiskAppliedPercent() {
                this.maxDiskAppliedPercent_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearMaxImageSizeBytes() {
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytes_ = null;
                    onChanged();
                } else {
                    this.maxImageSizeBytes_ = null;
                    this.maxImageSizeBytesBuilder_ = null;
                }
                return this;
            }

            public Builder clearMaxTtlSeconds() {
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSeconds_ = null;
                    onChanged();
                } else {
                    this.maxTtlSeconds_ = null;
                    this.maxTtlSecondsBuilder_ = null;
                }
                return this;
            }

            public Builder clearMaxVideoSizeBytes() {
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytes_ = null;
                    onChanged();
                } else {
                    this.maxVideoSizeBytes_ = null;
                    this.maxVideoSizeBytesBuilder_ = null;
                }
                return this;
            }

            public Builder clearMinDiskAppliedPercent() {
                this.minDiskAppliedPercent_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearMinFrequency() {
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequency_ = null;
                    onChanged();
                } else {
                    this.minFrequency_ = null;
                    this.minFrequencyBuilder_ = null;
                }
                return this;
            }

            public Builder clearScore() {
                this.score_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getMaxDiskAppliedPercent() {
                return this.maxDiskAppliedPercent_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxImageSizeBytes() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxImageSizeBytesBuilder_;
                if (e2Var != null) {
                    return (PolicyLimit) e2Var.e();
                }
                PolicyLimit policyLimit = this.maxImageSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxImageSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxImageSizeBytesFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxImageSizeBytesBuilder_;
                if (e2Var != null) {
                    return (PolicyLimitOrBuilder) e2Var.f();
                }
                PolicyLimit policyLimit = this.maxImageSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxTtlSeconds() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxTtlSecondsBuilder_;
                if (e2Var != null) {
                    return (PolicyLimit) e2Var.e();
                }
                PolicyLimit policyLimit = this.maxTtlSeconds_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxTtlSecondsBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxTtlSecondsFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxTtlSecondsBuilder_;
                if (e2Var != null) {
                    return (PolicyLimitOrBuilder) e2Var.f();
                }
                PolicyLimit policyLimit = this.maxTtlSeconds_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMaxVideoSizeBytes() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxVideoSizeBytesBuilder_;
                if (e2Var != null) {
                    return (PolicyLimit) e2Var.e();
                }
                PolicyLimit policyLimit = this.maxVideoSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMaxVideoSizeBytesBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMaxVideoSizeBytesFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxVideoSizeBytesBuilder_;
                if (e2Var != null) {
                    return (PolicyLimitOrBuilder) e2Var.f();
                }
                PolicyLimit policyLimit = this.maxVideoSizeBytes_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getMinDiskAppliedPercent() {
                return this.minDiskAppliedPercent_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimit getMinFrequency() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.minFrequencyBuilder_;
                if (e2Var != null) {
                    return (PolicyLimit) e2Var.e();
                }
                PolicyLimit policyLimit = this.minFrequency_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            public PolicyLimit.Builder getMinFrequencyBuilder() {
                onChanged();
                return (PolicyLimit.Builder) getMinFrequencyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public PolicyLimitOrBuilder getMinFrequencyOrBuilder() {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.minFrequencyBuilder_;
                if (e2Var != null) {
                    return (PolicyLimitOrBuilder) e2Var.f();
                }
                PolicyLimit policyLimit = this.minFrequency_;
                return policyLimit == null ? PolicyLimit.getDefaultInstance() : policyLimit;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public double getScore() {
                return this.score_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxImageSizeBytes() {
                return (this.maxImageSizeBytesBuilder_ == null && this.maxImageSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxTtlSeconds() {
                return (this.maxTtlSecondsBuilder_ == null && this.maxTtlSeconds_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMaxVideoSizeBytes() {
                return (this.maxVideoSizeBytesBuilder_ == null && this.maxVideoSizeBytes_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.EvictionPolicyOrBuilder
            public boolean hasMinFrequency() {
                return (this.minFrequencyBuilder_ == null && this.minFrequency_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_EvictionPolicy_fieldAccessorTable.d(EvictionPolicy.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMaxImageSizeBytes(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxImageSizeBytesBuilder_;
                if (e2Var == null) {
                    PolicyLimit policyLimit2 = this.maxImageSizeBytes_;
                    if (policyLimit2 != null) {
                        this.maxImageSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxImageSizeBytes_ = policyLimit;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyLimit);
                }
                return this;
            }

            public Builder mergeMaxTtlSeconds(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxTtlSecondsBuilder_;
                if (e2Var == null) {
                    PolicyLimit policyLimit2 = this.maxTtlSeconds_;
                    if (policyLimit2 != null) {
                        this.maxTtlSeconds_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxTtlSeconds_ = policyLimit;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyLimit);
                }
                return this;
            }

            public Builder mergeMaxVideoSizeBytes(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxVideoSizeBytesBuilder_;
                if (e2Var == null) {
                    PolicyLimit policyLimit2 = this.maxVideoSizeBytes_;
                    if (policyLimit2 != null) {
                        this.maxVideoSizeBytes_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.maxVideoSizeBytes_ = policyLimit;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyLimit);
                }
                return this;
            }

            public Builder mergeMinFrequency(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.minFrequencyBuilder_;
                if (e2Var == null) {
                    PolicyLimit policyLimit2 = this.minFrequency_;
                    if (policyLimit2 != null) {
                        this.minFrequency_ = PolicyLimit.newBuilder(policyLimit2).mergeFrom(policyLimit).buildPartial();
                    } else {
                        this.minFrequency_ = policyLimit;
                    }
                    onChanged();
                } else {
                    e2Var.g(policyLimit);
                }
                return this;
            }

            public Builder setMaxDiskAppliedPercent(double d10) {
                this.maxDiskAppliedPercent_ = d10;
                onChanged();
                return this;
            }

            public Builder setMaxImageSizeBytes(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxImageSizeBytesBuilder_;
                if (e2Var == null) {
                    policyLimit.getClass();
                    this.maxImageSizeBytes_ = policyLimit;
                    onChanged();
                } else {
                    e2Var.i(policyLimit);
                }
                return this;
            }

            public Builder setMaxTtlSeconds(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxTtlSecondsBuilder_;
                if (e2Var == null) {
                    policyLimit.getClass();
                    this.maxTtlSeconds_ = policyLimit;
                    onChanged();
                } else {
                    e2Var.i(policyLimit);
                }
                return this;
            }

            public Builder setMaxVideoSizeBytes(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxVideoSizeBytesBuilder_;
                if (e2Var == null) {
                    policyLimit.getClass();
                    this.maxVideoSizeBytes_ = policyLimit;
                    onChanged();
                } else {
                    e2Var.i(policyLimit);
                }
                return this;
            }

            public Builder setMinDiskAppliedPercent(double d10) {
                this.minDiskAppliedPercent_ = d10;
                onChanged();
                return this;
            }

            public Builder setMinFrequency(PolicyLimit policyLimit) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.minFrequencyBuilder_;
                if (e2Var == null) {
                    policyLimit.getClass();
                    this.minFrequency_ = policyLimit;
                    onChanged();
                } else {
                    e2Var.i(policyLimit);
                }
                return this;
            }

            public Builder setScore(double d10) {
                this.score_ = d10;
                onChanged();
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
            public EvictionPolicy build() {
                EvictionPolicy evictionPolicyBuildPartial = buildPartial();
                if (evictionPolicyBuildPartial.isInitialized()) {
                    return evictionPolicyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) evictionPolicyBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EvictionPolicy buildPartial() {
                EvictionPolicy evictionPolicy = new EvictionPolicy(this);
                evictionPolicy.score_ = this.score_;
                evictionPolicy.minDiskAppliedPercent_ = this.minDiskAppliedPercent_;
                evictionPolicy.maxDiskAppliedPercent_ = this.maxDiskAppliedPercent_;
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxTtlSecondsBuilder_;
                if (e2Var == null) {
                    evictionPolicy.maxTtlSeconds_ = this.maxTtlSeconds_;
                } else {
                    evictionPolicy.maxTtlSeconds_ = (PolicyLimit) e2Var.a();
                }
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var2 = this.minFrequencyBuilder_;
                if (e2Var2 == null) {
                    evictionPolicy.minFrequency_ = this.minFrequency_;
                } else {
                    evictionPolicy.minFrequency_ = (PolicyLimit) e2Var2.a();
                }
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var3 = this.maxImageSizeBytesBuilder_;
                if (e2Var3 == null) {
                    evictionPolicy.maxImageSizeBytes_ = this.maxImageSizeBytes_;
                } else {
                    evictionPolicy.maxImageSizeBytes_ = (PolicyLimit) e2Var3.a();
                }
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var4 = this.maxVideoSizeBytesBuilder_;
                if (e2Var4 == null) {
                    evictionPolicy.maxVideoSizeBytes_ = this.maxVideoSizeBytes_;
                } else {
                    evictionPolicy.maxVideoSizeBytes_ = (PolicyLimit) e2Var4.a();
                }
                onBuilt();
                return evictionPolicy;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public EvictionPolicy mo164getDefaultInstanceForType() {
                return EvictionPolicy.getDefaultInstance();
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
                this.score_ = 0.0d;
                this.minDiskAppliedPercent_ = 0.0d;
                this.maxDiskAppliedPercent_ = 0.0d;
                if (this.maxTtlSecondsBuilder_ == null) {
                    this.maxTtlSeconds_ = null;
                } else {
                    this.maxTtlSeconds_ = null;
                    this.maxTtlSecondsBuilder_ = null;
                }
                if (this.minFrequencyBuilder_ == null) {
                    this.minFrequency_ = null;
                } else {
                    this.minFrequency_ = null;
                    this.minFrequencyBuilder_ = null;
                }
                if (this.maxImageSizeBytesBuilder_ == null) {
                    this.maxImageSizeBytes_ = null;
                } else {
                    this.maxImageSizeBytes_ = null;
                    this.maxImageSizeBytesBuilder_ = null;
                }
                if (this.maxVideoSizeBytesBuilder_ == null) {
                    this.maxVideoSizeBytes_ = null;
                } else {
                    this.maxVideoSizeBytes_ = null;
                    this.maxVideoSizeBytesBuilder_ = null;
                }
                return this;
            }

            public Builder setMaxImageSizeBytes(PolicyLimit.Builder builder) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxImageSizeBytesBuilder_;
                if (e2Var == null) {
                    this.maxImageSizeBytes_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setMaxTtlSeconds(PolicyLimit.Builder builder) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxTtlSecondsBuilder_;
                if (e2Var == null) {
                    this.maxTtlSeconds_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setMaxVideoSizeBytes(PolicyLimit.Builder builder) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.maxVideoSizeBytesBuilder_;
                if (e2Var == null) {
                    this.maxVideoSizeBytes_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setMinFrequency(PolicyLimit.Builder builder) {
                e2<PolicyLimit, PolicyLimit.Builder, PolicyLimitOrBuilder> e2Var = this.minFrequencyBuilder_;
                if (e2Var == null) {
                    this.minFrequency_ = builder.build();
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
                if (message instanceof EvictionPolicy) {
                    return mergeFrom((EvictionPolicy) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EvictionPolicy evictionPolicy) {
                if (evictionPolicy == EvictionPolicy.getDefaultInstance()) {
                    return this;
                }
                if (evictionPolicy.getScore() != 0.0d) {
                    setScore(evictionPolicy.getScore());
                }
                if (evictionPolicy.getMinDiskAppliedPercent() != 0.0d) {
                    setMinDiskAppliedPercent(evictionPolicy.getMinDiskAppliedPercent());
                }
                if (evictionPolicy.getMaxDiskAppliedPercent() != 0.0d) {
                    setMaxDiskAppliedPercent(evictionPolicy.getMaxDiskAppliedPercent());
                }
                if (evictionPolicy.hasMaxTtlSeconds()) {
                    mergeMaxTtlSeconds(evictionPolicy.getMaxTtlSeconds());
                }
                if (evictionPolicy.hasMinFrequency()) {
                    mergeMinFrequency(evictionPolicy.getMinFrequency());
                }
                if (evictionPolicy.hasMaxImageSizeBytes()) {
                    mergeMaxImageSizeBytes(evictionPolicy.getMaxImageSizeBytes());
                }
                if (evictionPolicy.hasMaxVideoSizeBytes()) {
                    mergeMaxVideoSizeBytes(evictionPolicy.getMaxVideoSizeBytes());
                }
                mergeUnknownFields(((j0) evictionPolicy).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                EvictionPolicy evictionPolicy = null;
                try {
                    try {
                        EvictionPolicy evictionPolicy2 = (EvictionPolicy) EvictionPolicy.PARSER.parsePartialFrom(nVar, yVar);
                        if (evictionPolicy2 != null) {
                            mergeFrom(evictionPolicy2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        EvictionPolicy evictionPolicy3 = (EvictionPolicy) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            evictionPolicy = evictionPolicy3;
                            if (evictionPolicy != null) {
                                mergeFrom(evictionPolicy);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (evictionPolicy != null) {
                        mergeFrom(evictionPolicy);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(EvictionPolicy evictionPolicy) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(evictionPolicy);
        }

        public static EvictionPolicy parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private EvictionPolicy(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EvictionPolicy parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (EvictionPolicy) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static EvictionPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public EvictionPolicy mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EvictionPolicy parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EvictionPolicy() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EvictionPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static EvictionPolicy parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private EvictionPolicy(n nVar, y yVar) throws InvalidProtocolBufferException {
            PolicyLimit.Builder builder;
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = nVar.K();
                        if (iK != 0) {
                            if (iK == 9) {
                                this.score_ = nVar.s();
                            } else if (iK == 17) {
                                this.minDiskAppliedPercent_ = nVar.s();
                            } else if (iK != 25) {
                                if (iK == 34) {
                                    PolicyLimit policyLimit = this.maxTtlSeconds_;
                                    builder = policyLimit != null ? policyLimit.toBuilder() : null;
                                    PolicyLimit policyLimit2 = (PolicyLimit) nVar.A(PolicyLimit.parser(), yVar);
                                    this.maxTtlSeconds_ = policyLimit2;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit2);
                                        this.maxTtlSeconds_ = builder.buildPartial();
                                    }
                                } else if (iK == 42) {
                                    PolicyLimit policyLimit3 = this.minFrequency_;
                                    builder = policyLimit3 != null ? policyLimit3.toBuilder() : null;
                                    PolicyLimit policyLimit4 = (PolicyLimit) nVar.A(PolicyLimit.parser(), yVar);
                                    this.minFrequency_ = policyLimit4;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit4);
                                        this.minFrequency_ = builder.buildPartial();
                                    }
                                } else if (iK == 50) {
                                    PolicyLimit policyLimit5 = this.maxImageSizeBytes_;
                                    builder = policyLimit5 != null ? policyLimit5.toBuilder() : null;
                                    PolicyLimit policyLimit6 = (PolicyLimit) nVar.A(PolicyLimit.parser(), yVar);
                                    this.maxImageSizeBytes_ = policyLimit6;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit6);
                                        this.maxImageSizeBytes_ = builder.buildPartial();
                                    }
                                } else if (iK != 58) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    PolicyLimit policyLimit7 = this.maxVideoSizeBytes_;
                                    builder = policyLimit7 != null ? policyLimit7.toBuilder() : null;
                                    PolicyLimit policyLimit8 = (PolicyLimit) nVar.A(PolicyLimit.parser(), yVar);
                                    this.maxVideoSizeBytes_ = policyLimit8;
                                    if (builder != null) {
                                        builder.mergeFrom(policyLimit8);
                                        this.maxVideoSizeBytes_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.maxDiskAppliedPercent_ = nVar.s();
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

        public static EvictionPolicy parseFrom(InputStream inputStream) throws IOException {
            return (EvictionPolicy) j0.parseWithIOException(PARSER, inputStream);
        }

        public static EvictionPolicy parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (EvictionPolicy) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static EvictionPolicy parseFrom(n nVar) throws IOException {
            return (EvictionPolicy) j0.parseWithIOException(PARSER, nVar);
        }

        public static EvictionPolicy parseFrom(n nVar, y yVar) throws IOException {
            return (EvictionPolicy) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface EvictionPolicyOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        double getMaxDiskAppliedPercent();

        PolicyLimit getMaxImageSizeBytes();

        PolicyLimitOrBuilder getMaxImageSizeBytesOrBuilder();

        PolicyLimit getMaxTtlSeconds();

        PolicyLimitOrBuilder getMaxTtlSecondsOrBuilder();

        PolicyLimit getMaxVideoSizeBytes();

        PolicyLimitOrBuilder getMaxVideoSizeBytesOrBuilder();

        double getMinDiskAppliedPercent();

        PolicyLimit getMinFrequency();

        PolicyLimitOrBuilder getMinFrequencyOrBuilder();

        double getScore();

        boolean hasMaxImageSizeBytes();

        boolean hasMaxTtlSeconds();

        boolean hasMaxVideoSizeBytes();

        boolean hasMinFrequency();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class PolicyConfiguration extends j0 implements PolicyConfigurationOrBuilder {
        public static final int DOWNLOAD_POLICY_FIELD_NUMBER = 1;
        public static final int EVICTION_POLICIES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private DownloadPolicy downloadPolicy_;
        private List<EvictionPolicy> evictionPolicies_;
        private byte memoizedIsInitialized;
        private static final PolicyConfiguration DEFAULT_INSTANCE = new PolicyConfiguration();
        private static final s1<PolicyConfiguration> PARSER = new b<PolicyConfiguration>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.PolicyConfiguration.1
            @Override // com.explorestack.protobuf.s1
            public PolicyConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new PolicyConfiguration(nVar, yVar);
            }
        };

        public static PolicyConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PolicyConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PolicyConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PolicyConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<PolicyConfiguration> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PolicyConfiguration)) {
                return super.equals(obj);
            }
            PolicyConfiguration policyConfiguration = (PolicyConfiguration) obj;
            if (hasDownloadPolicy() != policyConfiguration.hasDownloadPolicy()) {
                return false;
            }
            return (!hasDownloadPolicy() || getDownloadPolicy().equals(policyConfiguration.getDownloadPolicy())) && getEvictionPoliciesList().equals(policyConfiguration.getEvictionPoliciesList()) && this.unknownFields.equals(policyConfiguration.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public DownloadPolicy getDownloadPolicy() {
            DownloadPolicy downloadPolicy = this.downloadPolicy_;
            return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public DownloadPolicyOrBuilder getDownloadPolicyOrBuilder() {
            return getDownloadPolicy();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public EvictionPolicy getEvictionPolicies(int i10) {
            return this.evictionPolicies_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public int getEvictionPoliciesCount() {
            return this.evictionPolicies_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public List<EvictionPolicy> getEvictionPoliciesList() {
            return this.evictionPolicies_;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i10) {
            return this.evictionPolicies_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList() {
            return this.evictionPolicies_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<PolicyConfiguration> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.downloadPolicy_ != null ? CodedOutputStream.G(1, getDownloadPolicy()) + 0 : 0;
            for (int i11 = 0; i11 < this.evictionPolicies_.size(); i11++) {
                iG += CodedOutputStream.G(2, this.evictionPolicies_.get(i11));
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
        public boolean hasDownloadPolicy() {
            return this.downloadPolicy_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasDownloadPolicy()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getDownloadPolicy().hashCode();
            }
            if (getEvictionPoliciesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEvictionPoliciesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable.d(PolicyConfiguration.class, Builder.class);
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
            return new PolicyConfiguration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.downloadPolicy_ != null) {
                codedOutputStream.L0(1, getDownloadPolicy());
            }
            for (int i10 = 0; i10 < this.evictionPolicies_.size(); i10++) {
                codedOutputStream.L0(2, this.evictionPolicies_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements PolicyConfigurationOrBuilder {
            private int bitField0_;
            private e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> downloadPolicyBuilder_;
            private DownloadPolicy downloadPolicy_;
            private z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> evictionPoliciesBuilder_;
            private List<EvictionPolicy> evictionPolicies_;

            private void ensureEvictionPoliciesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.evictionPolicies_ = new ArrayList(this.evictionPolicies_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
            }

            private e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> getDownloadPolicyFieldBuilder() {
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicyBuilder_ = new e2<>(getDownloadPolicy(), getParentForChildren(), isClean());
                    this.downloadPolicy_ = null;
                }
                return this.downloadPolicyBuilder_;
            }

            private z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> getEvictionPoliciesFieldBuilder() {
                if (this.evictionPoliciesBuilder_ == null) {
                    this.evictionPoliciesBuilder_ = new z1<>(this.evictionPolicies_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.evictionPolicies_ = null;
                }
                return this.evictionPoliciesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getEvictionPoliciesFieldBuilder();
                }
            }

            public Builder addAllEvictionPolicies(Iterable<? extends EvictionPolicy> iterable) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.evictionPolicies_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addEvictionPolicies(EvictionPolicy evictionPolicy) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(evictionPolicy);
                    onChanged();
                } else {
                    z1Var.e(evictionPolicy);
                }
                return this;
            }

            public EvictionPolicy.Builder addEvictionPoliciesBuilder() {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().c(EvictionPolicy.getDefaultInstance());
            }

            public Builder clearDownloadPolicy() {
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicy_ = null;
                    onChanged();
                } else {
                    this.downloadPolicy_ = null;
                    this.downloadPolicyBuilder_ = null;
                }
                return this;
            }

            public Builder clearEvictionPolicies() {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    this.evictionPolicies_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public DownloadPolicy getDownloadPolicy() {
                e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> e2Var = this.downloadPolicyBuilder_;
                if (e2Var != null) {
                    return (DownloadPolicy) e2Var.e();
                }
                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
            }

            public DownloadPolicy.Builder getDownloadPolicyBuilder() {
                onChanged();
                return (DownloadPolicy.Builder) getDownloadPolicyFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public DownloadPolicyOrBuilder getDownloadPolicyOrBuilder() {
                e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> e2Var = this.downloadPolicyBuilder_;
                if (e2Var != null) {
                    return (DownloadPolicyOrBuilder) e2Var.f();
                }
                DownloadPolicy downloadPolicy = this.downloadPolicy_;
                return downloadPolicy == null ? DownloadPolicy.getDefaultInstance() : downloadPolicy;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public EvictionPolicy getEvictionPolicies(int i10) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                return z1Var == null ? this.evictionPolicies_.get(i10) : (EvictionPolicy) z1Var.n(i10);
            }

            public EvictionPolicy.Builder getEvictionPoliciesBuilder(int i10) {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().k(i10);
            }

            public List<EvictionPolicy.Builder> getEvictionPoliciesBuilderList() {
                return getEvictionPoliciesFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public int getEvictionPoliciesCount() {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                return z1Var == null ? this.evictionPolicies_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public List<EvictionPolicy> getEvictionPoliciesList() {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.evictionPolicies_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i10) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                return z1Var == null ? this.evictionPolicies_.get(i10) : (EvictionPolicyOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList() {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.evictionPolicies_);
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyConfigurationOrBuilder
            public boolean hasDownloadPolicy() {
                return (this.downloadPolicyBuilder_ == null && this.downloadPolicy_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyConfiguration_fieldAccessorTable.d(PolicyConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDownloadPolicy(DownloadPolicy downloadPolicy) {
                e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> e2Var = this.downloadPolicyBuilder_;
                if (e2Var == null) {
                    DownloadPolicy downloadPolicy2 = this.downloadPolicy_;
                    if (downloadPolicy2 != null) {
                        this.downloadPolicy_ = DownloadPolicy.newBuilder(downloadPolicy2).mergeFrom(downloadPolicy).buildPartial();
                    } else {
                        this.downloadPolicy_ = downloadPolicy;
                    }
                    onChanged();
                } else {
                    e2Var.g(downloadPolicy);
                }
                return this;
            }

            public Builder removeEvictionPolicies(int i10) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setDownloadPolicy(DownloadPolicy downloadPolicy) {
                e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> e2Var = this.downloadPolicyBuilder_;
                if (e2Var == null) {
                    downloadPolicy.getClass();
                    this.downloadPolicy_ = downloadPolicy;
                    onChanged();
                } else {
                    e2Var.i(downloadPolicy);
                }
                return this;
            }

            public Builder setEvictionPolicies(int i10, EvictionPolicy evictionPolicy) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.set(i10, evictionPolicy);
                    onChanged();
                } else {
                    z1Var.w(i10, evictionPolicy);
                }
                return this;
            }

            private Builder() {
                this.evictionPolicies_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyConfiguration build() {
                PolicyConfiguration policyConfigurationBuildPartial = buildPartial();
                if (policyConfigurationBuildPartial.isInitialized()) {
                    return policyConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) policyConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyConfiguration buildPartial() {
                PolicyConfiguration policyConfiguration = new PolicyConfiguration(this);
                e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> e2Var = this.downloadPolicyBuilder_;
                if (e2Var == null) {
                    policyConfiguration.downloadPolicy_ = this.downloadPolicy_;
                } else {
                    policyConfiguration.downloadPolicy_ = (DownloadPolicy) e2Var.a();
                }
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var != null) {
                    policyConfiguration.evictionPolicies_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.evictionPolicies_ = Collections.unmodifiableList(this.evictionPolicies_);
                        this.bitField0_ &= -2;
                    }
                    policyConfiguration.evictionPolicies_ = this.evictionPolicies_;
                }
                onBuilt();
                return policyConfiguration;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public PolicyConfiguration mo164getDefaultInstanceForType() {
                return PolicyConfiguration.getDefaultInstance();
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

            public EvictionPolicy.Builder addEvictionPoliciesBuilder(int i10) {
                return (EvictionPolicy.Builder) getEvictionPoliciesFieldBuilder().b(i10, EvictionPolicy.getDefaultInstance());
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
                if (this.downloadPolicyBuilder_ == null) {
                    this.downloadPolicy_ = null;
                } else {
                    this.downloadPolicy_ = null;
                    this.downloadPolicyBuilder_ = null;
                }
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    this.evictionPolicies_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.evictionPolicies_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder setDownloadPolicy(DownloadPolicy.Builder builder) {
                e2<DownloadPolicy, DownloadPolicy.Builder, DownloadPolicyOrBuilder> e2Var = this.downloadPolicyBuilder_;
                if (e2Var == null) {
                    this.downloadPolicy_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder addEvictionPolicies(int i10, EvictionPolicy evictionPolicy) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    evictionPolicy.getClass();
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(i10, evictionPolicy);
                    onChanged();
                } else {
                    z1Var.d(i10, evictionPolicy);
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
                if (message instanceof PolicyConfiguration) {
                    return mergeFrom((PolicyConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEvictionPolicies(int i10, EvictionPolicy.Builder builder) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(PolicyConfiguration policyConfiguration) {
                if (policyConfiguration == PolicyConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (policyConfiguration.hasDownloadPolicy()) {
                    mergeDownloadPolicy(policyConfiguration.getDownloadPolicy());
                }
                if (this.evictionPoliciesBuilder_ == null) {
                    if (!policyConfiguration.evictionPolicies_.isEmpty()) {
                        if (this.evictionPolicies_.isEmpty()) {
                            this.evictionPolicies_ = policyConfiguration.evictionPolicies_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEvictionPoliciesIsMutable();
                            this.evictionPolicies_.addAll(policyConfiguration.evictionPolicies_);
                        }
                        onChanged();
                    }
                } else if (!policyConfiguration.evictionPolicies_.isEmpty()) {
                    if (!this.evictionPoliciesBuilder_.t()) {
                        this.evictionPoliciesBuilder_.a(policyConfiguration.evictionPolicies_);
                    } else {
                        this.evictionPoliciesBuilder_.h();
                        this.evictionPoliciesBuilder_ = null;
                        this.evictionPolicies_ = policyConfiguration.evictionPolicies_;
                        this.bitField0_ &= -2;
                        this.evictionPoliciesBuilder_ = j0.alwaysUseFieldBuilders ? getEvictionPoliciesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) policyConfiguration).unknownFields);
                onChanged();
                return this;
            }

            public Builder addEvictionPolicies(EvictionPolicy.Builder builder) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addEvictionPolicies(int i10, EvictionPolicy.Builder builder) {
                z1<EvictionPolicy, EvictionPolicy.Builder, EvictionPolicyOrBuilder> z1Var = this.evictionPoliciesBuilder_;
                if (z1Var == null) {
                    ensureEvictionPoliciesIsMutable();
                    this.evictionPolicies_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                PolicyConfiguration policyConfiguration = null;
                try {
                    try {
                        PolicyConfiguration policyConfiguration2 = (PolicyConfiguration) PolicyConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                        if (policyConfiguration2 != null) {
                            mergeFrom(policyConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        PolicyConfiguration policyConfiguration3 = (PolicyConfiguration) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            policyConfiguration = policyConfiguration3;
                            if (policyConfiguration != null) {
                                mergeFrom(policyConfiguration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (policyConfiguration != null) {
                        mergeFrom(policyConfiguration);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(PolicyConfiguration policyConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyConfiguration);
        }

        public static PolicyConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private PolicyConfiguration(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PolicyConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (PolicyConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static PolicyConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public PolicyConfiguration mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static PolicyConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private PolicyConfiguration() {
            this.memoizedIsInitialized = (byte) -1;
            this.evictionPolicies_ = Collections.emptyList();
        }

        public static PolicyConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static PolicyConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static PolicyConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (PolicyConfiguration) j0.parseWithIOException(PARSER, inputStream);
        }

        private PolicyConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    DownloadPolicy downloadPolicy = this.downloadPolicy_;
                                    DownloadPolicy.Builder builder = downloadPolicy != null ? downloadPolicy.toBuilder() : null;
                                    DownloadPolicy downloadPolicy2 = (DownloadPolicy) nVar.A(DownloadPolicy.parser(), yVar);
                                    this.downloadPolicy_ = downloadPolicy2;
                                    if (builder != null) {
                                        builder.mergeFrom(downloadPolicy2);
                                        this.downloadPolicy_ = builder.buildPartial();
                                    }
                                } else if (iK != 18) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    if (!(z11 & true)) {
                                        this.evictionPolicies_ = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.evictionPolicies_.add((EvictionPolicy) nVar.A(EvictionPolicy.parser(), yVar));
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
                        this.evictionPolicies_ = Collections.unmodifiableList(this.evictionPolicies_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.evictionPolicies_ = Collections.unmodifiableList(this.evictionPolicies_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static PolicyConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (PolicyConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static PolicyConfiguration parseFrom(n nVar) throws IOException {
            return (PolicyConfiguration) j0.parseWithIOException(PARSER, nVar);
        }

        public static PolicyConfiguration parseFrom(n nVar, y yVar) throws IOException {
            return (PolicyConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface PolicyConfigurationOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        DownloadPolicy getDownloadPolicy();

        DownloadPolicyOrBuilder getDownloadPolicyOrBuilder();

        EvictionPolicy getEvictionPolicies(int i10);

        int getEvictionPoliciesCount();

        List<EvictionPolicy> getEvictionPoliciesList();

        EvictionPolicyOrBuilder getEvictionPoliciesOrBuilder(int i10);

        List<? extends EvictionPolicyOrBuilder> getEvictionPoliciesOrBuilderList();

        boolean hasDownloadPolicy();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class PolicyLimit extends j0 implements PolicyLimitOrBuilder {
        private static final PolicyLimit DEFAULT_INSTANCE = new PolicyLimit();
        private static final s1<PolicyLimit> PARSER = new b<PolicyLimit>() { // from class: io.bidmachine.protobuf.sdk.AssetCache.PolicyLimit.1
            @Override // com.explorestack.protobuf.s1
            public PolicyLimit parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new PolicyLimit(nVar, yVar);
            }
        };
        public static final int THRESHOLD_FIELD_NUMBER = 1;
        public static final int WEIGHT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long threshold_;
        private double weight_;

        public static PolicyLimit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PolicyLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PolicyLimit) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PolicyLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<PolicyLimit> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PolicyLimit)) {
                return super.equals(obj);
            }
            PolicyLimit policyLimit = (PolicyLimit) obj;
            return getThreshold() == policyLimit.getThreshold() && Double.doubleToLongBits(getWeight()) == Double.doubleToLongBits(policyLimit.getWeight()) && this.unknownFields.equals(policyLimit.unknownFields);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<PolicyLimit> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.threshold_;
            int iZ = j10 != 0 ? 0 + CodedOutputStream.z(1, j10) : 0;
            double d10 = this.weight_;
            if (d10 != 0.0d) {
                iZ += CodedOutputStream.j(2, d10);
            }
            int serializedSize = iZ + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
        public long getThreshold() {
            return this.threshold_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
        public double getWeight() {
            return this.weight_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + l0.i(getThreshold())) * 37) + 2) * 53) + l0.i(Double.doubleToLongBits(getWeight()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable.d(PolicyLimit.class, Builder.class);
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
            return new PolicyLimit();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.threshold_;
            if (j10 != 0) {
                codedOutputStream.J0(1, j10);
            }
            double d10 = this.weight_;
            if (d10 != 0.0d) {
                codedOutputStream.t0(2, d10);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements PolicyLimitOrBuilder {
            private long threshold_;
            private double weight_;

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearThreshold() {
                this.threshold_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearWeight() {
                this.weight_ = 0.0d;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
            public long getThreshold() {
                return this.threshold_;
            }

            @Override // io.bidmachine.protobuf.sdk.AssetCache.PolicyLimitOrBuilder
            public double getWeight() {
                return this.weight_;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_PolicyLimit_fieldAccessorTable.d(PolicyLimit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setThreshold(long j10) {
                this.threshold_ = j10;
                onChanged();
                return this;
            }

            public Builder setWeight(double d10) {
                this.weight_ = d10;
                onChanged();
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
            public PolicyLimit build() {
                PolicyLimit policyLimitBuildPartial = buildPartial();
                if (policyLimitBuildPartial.isInitialized()) {
                    return policyLimitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) policyLimitBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public PolicyLimit buildPartial() {
                PolicyLimit policyLimit = new PolicyLimit(this);
                policyLimit.threshold_ = this.threshold_;
                policyLimit.weight_ = this.weight_;
                onBuilt();
                return policyLimit;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public PolicyLimit mo164getDefaultInstanceForType() {
                return PolicyLimit.getDefaultInstance();
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
                this.threshold_ = 0L;
                this.weight_ = 0.0d;
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PolicyLimit) {
                    return mergeFrom((PolicyLimit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PolicyLimit policyLimit) {
                if (policyLimit == PolicyLimit.getDefaultInstance()) {
                    return this;
                }
                if (policyLimit.getThreshold() != 0) {
                    setThreshold(policyLimit.getThreshold());
                }
                if (policyLimit.getWeight() != 0.0d) {
                    setWeight(policyLimit.getWeight());
                }
                mergeUnknownFields(((j0) policyLimit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                PolicyLimit policyLimit = null;
                try {
                    try {
                        PolicyLimit policyLimit2 = (PolicyLimit) PolicyLimit.PARSER.parsePartialFrom(nVar, yVar);
                        if (policyLimit2 != null) {
                            mergeFrom(policyLimit2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        PolicyLimit policyLimit3 = (PolicyLimit) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            policyLimit = policyLimit3;
                            if (policyLimit != null) {
                                mergeFrom(policyLimit);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (policyLimit != null) {
                        mergeFrom(policyLimit);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(PolicyLimit policyLimit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(policyLimit);
        }

        public static PolicyLimit parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private PolicyLimit(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PolicyLimit parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (PolicyLimit) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static PolicyLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public PolicyLimit mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static PolicyLimit parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private PolicyLimit() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PolicyLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static PolicyLimit parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        private PolicyLimit(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                if (iK == 8) {
                                    this.threshold_ = nVar.z();
                                } else if (iK != 17) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    this.weight_ = nVar.s();
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

        public static PolicyLimit parseFrom(InputStream inputStream) throws IOException {
            return (PolicyLimit) j0.parseWithIOException(PARSER, inputStream);
        }

        public static PolicyLimit parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (PolicyLimit) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static PolicyLimit parseFrom(n nVar) throws IOException {
            return (PolicyLimit) j0.parseWithIOException(PARSER, nVar);
        }

        public static PolicyLimit parseFrom(n nVar, y yVar) throws IOException {
            return (PolicyLimit) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface PolicyLimitOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        long getThreshold();

        double getWeight();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static AssetCache getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AssetCache parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AssetCache) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AssetCache parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<AssetCache> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetCache) {
            return this.unknownFields.equals(((AssetCache) obj).unknownFields);
        }
        return super.equals(obj);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<AssetCache> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = this.unknownFields.getSerializedSize() + 0;
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
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable.d(AssetCache.class, Builder.class);
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
        return new AssetCache();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements AssetCacheOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_descriptor;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_sdk_cache_AssetCache_fieldAccessorTable.d(AssetCache.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AssetCache build() {
            AssetCache assetCacheBuildPartial = buildPartial();
            if (assetCacheBuildPartial.isInitialized()) {
                return assetCacheBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetCacheBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AssetCache buildPartial() {
            AssetCache assetCache = new AssetCache(this);
            onBuilt();
            return assetCache;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public AssetCache mo164getDefaultInstanceForType() {
            return AssetCache.getDefaultInstance();
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
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AssetCache) {
                return mergeFrom((AssetCache) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AssetCache assetCache) {
            if (assetCache == AssetCache.getDefaultInstance()) {
                return this;
            }
            mergeUnknownFields(((j0) assetCache).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            AssetCache assetCache = null;
            try {
                try {
                    AssetCache assetCache2 = (AssetCache) AssetCache.PARSER.parsePartialFrom(nVar, yVar);
                    if (assetCache2 != null) {
                        mergeFrom(assetCache2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    AssetCache assetCache3 = (AssetCache) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        assetCache = assetCache3;
                        if (assetCache != null) {
                            mergeFrom(assetCache);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (assetCache != null) {
                    mergeFrom(assetCache);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(AssetCache assetCache) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetCache);
    }

    public static AssetCache parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private AssetCache(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AssetCache parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (AssetCache) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static AssetCache parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public AssetCache mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AssetCache parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AssetCache() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AssetCache parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static AssetCache parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    private AssetCache(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK == 0 || !parseUnknownField(nVar, bVarG, yVar, iK)) {
                        z10 = true;
                    }
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

    public static AssetCache parseFrom(InputStream inputStream) throws IOException {
        return (AssetCache) j0.parseWithIOException(PARSER, inputStream);
    }

    public static AssetCache parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (AssetCache) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static AssetCache parseFrom(n nVar) throws IOException {
        return (AssetCache) j0.parseWithIOException(PARSER, nVar);
    }

    public static AssetCache parseFrom(n nVar, y yVar) throws IOException {
        return (AssetCache) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
