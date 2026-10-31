package io.bidmachine.protobuf.analytics;

import c2.YDwL.tFQWuE;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.n2;
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

/* JADX INFO: loaded from: classes4.dex */
public final class SDKAnalyticPayload extends j0 implements SDKAnalyticPayloadOrBuilder {
    public static final int METRICS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Metric> metrics_;
    private static final SDKAnalyticPayload DEFAULT_INSTANCE = new SDKAnalyticPayload();
    private static final s1<SDKAnalyticPayload> PARSER = new b<SDKAnalyticPayload>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.1
        @Override // com.explorestack.protobuf.s1
        public SDKAnalyticPayload parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new SDKAnalyticPayload(nVar, yVar);
        }
    };

    public static final class Metric extends j0 implements MetricOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Metric DEFAULT_INSTANCE = new Metric();
        private static final s1<Metric> PARSER = new b<Metric>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.1
            @Override // com.explorestack.protobuf.s1
            public Metric parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Metric(nVar, yVar);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object context_;
        private List<MetricData> data_;
        private byte memoizedIsInitialized;

        public static final class MetricData extends j0 implements MetricDataOrBuilder {
            public static final int DIMENSIONS_FIELD_NUMBER = 3;
            public static final int ERROR_FIELD_NUMBER = 5;
            public static final int MEASURES_FIELD_NUMBER = 4;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int TIMESTAMP_FIELD_NUMBER = 1;
            public static final int TS_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private List<Dimension> dimensions_;
            private Error error_;
            private List<Measure> measures_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object timestamp_;
            private Timestamp ts_;
            private static final MetricData DEFAULT_INSTANCE = new MetricData();
            private static final s1<MetricData> PARSER = new b<MetricData>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.1
                @Override // com.explorestack.protobuf.s1
                public MetricData parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new MetricData(nVar, yVar);
                }
            };

            public static final class Dimension extends j0 implements DimensionOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private volatile Object value_;
                private static final Dimension DEFAULT_INSTANCE = new Dimension();
                private static final s1<Dimension> PARSER = new b<Dimension>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.1
                    @Override // com.explorestack.protobuf.s1
                    public Dimension parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new Dimension(nVar, yVar);
                    }
                };

                public static Dimension getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Dimension) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<Dimension> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Dimension)) {
                        return super.equals(obj);
                    }
                    Dimension dimension = (Dimension) obj;
                    return getName().equals(dimension.getName()) && getValue().equals(dimension.getValue()) && this.unknownFields.equals(dimension.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
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
                public s1<Dimension> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = getNameBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.name_);
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += j0.computeStringSize(2, this.value_);
                    }
                    int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                public final u2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.j0
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.d(Dimension.class, Builder.class);
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
                    return new Dimension();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 2, this.value_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static final class Builder extends j0.b<Builder> implements DimensionOrBuilder {
                    private Object name_;
                    private Object value_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = j0.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Dimension.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Dimension.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.DimensionOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.d(Dimension.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        byteString.getClass();
                        a.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension build() {
                        Dimension dimensionBuildPartial = buildPartial();
                        if (dimensionBuildPartial.isInitialized()) {
                            return dimensionBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) dimensionBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Dimension buildPartial() {
                        Dimension dimension = new Dimension(this);
                        dimension.name_ = this.name_;
                        dimension.value_ = this.value_;
                        onBuilt();
                        return dimension;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public Dimension mo164getDefaultInstanceForType() {
                        return Dimension.getDefaultInstance();
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
                        this.name_ = "";
                        this.value_ = "";
                        return this;
                    }

                    private Builder(j0.c cVar) {
                        super(cVar);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                    /* JADX INFO: renamed from: clone */
                    public Builder mo162clone() {
                        return (Builder) super.mo162clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Dimension) {
                            return mergeFrom((Dimension) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Dimension dimension) {
                        if (dimension == Dimension.getDefaultInstance()) {
                            return this;
                        }
                        if (!dimension.getName().isEmpty()) {
                            this.name_ = dimension.name_;
                            onChanged();
                        }
                        if (!dimension.getValue().isEmpty()) {
                            this.value_ = dimension.value_;
                            onChanged();
                        }
                        mergeUnknownFields(((j0) dimension).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                        Dimension dimension = null;
                        try {
                            try {
                                Dimension dimension2 = (Dimension) Dimension.PARSER.parsePartialFrom(nVar, yVar);
                                if (dimension2 != null) {
                                    mergeFrom(dimension2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Dimension dimension3 = (Dimension) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    dimension = dimension3;
                                    if (dimension != null) {
                                        mergeFrom(dimension);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (dimension != null) {
                                mergeFrom(dimension);
                            }
                            throw th;
                        }
                    }
                }

                public static Builder newBuilder(Dimension dimension) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(dimension);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                private Dimension(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Dimension) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Dimension mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Dimension parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Dimension() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.value_ = "";
                }

                public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static Dimension parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static Dimension parseFrom(InputStream inputStream) throws IOException {
                    return (Dimension) j0.parseWithIOException(PARSER, inputStream);
                }

                private Dimension(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.name_ = nVar.J();
                                        } else if (iK != 18) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            this.value_ = nVar.J();
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

                public static Dimension parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Dimension) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                public static Dimension parseFrom(n nVar) throws IOException {
                    return (Dimension) j0.parseWithIOException(PARSER, nVar);
                }

                public static Dimension parseFrom(n nVar, y yVar) throws IOException {
                    return (Dimension) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface DimensionOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                String getValue();

                ByteString getValueBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static final class Error extends j0 implements ErrorOrBuilder {
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private volatile Object description_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Error DEFAULT_INSTANCE = new Error();
                private static final s1<Error> PARSER = new b<Error>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.1
                    @Override // com.explorestack.protobuf.s1
                    public Error parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new Error(nVar, yVar);
                    }
                };

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Error) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<Error> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return super.equals(obj);
                    }
                    Error error = (Error) obj;
                    return getName().equals(error.getName()) && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
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
                public s1<Error> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = getNameBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.name_);
                    if (!getDescriptionBytes().isEmpty()) {
                        iComputeStringSize += j0.computeStringSize(2, this.description_);
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
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.j0
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.d(Error.class, Builder.class);
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
                    return new Error();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 1, this.name_);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 2, this.description_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static final class Builder extends j0.b<Builder> implements ErrorOrBuilder {
                    private Object description_;
                    private Object name_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = j0.alwaysUseFieldBuilders;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Error.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public ByteString getDescriptionBytes() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.ErrorOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.d(Error.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder setDescription(String str) {
                        str.getClass();
                        this.description_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) {
                        byteString.getClass();
                        a.checkByteStringIsUtf8(byteString);
                        this.description_ = byteString;
                        onChanged();
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

                    private Builder() {
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error build() {
                        Error errorBuildPartial = buildPartial();
                        if (errorBuildPartial.isInitialized()) {
                            return errorBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Error buildPartial() {
                        Error error = new Error(this);
                        error.name_ = this.name_;
                        error.description_ = this.description_;
                        onBuilt();
                        return error;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public Error mo164getDefaultInstanceForType() {
                        return Error.getDefaultInstance();
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
                        this.name_ = "";
                        this.description_ = "";
                        return this;
                    }

                    private Builder(j0.c cVar) {
                        super(cVar);
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                    /* JADX INFO: renamed from: clone */
                    public Builder mo162clone() {
                        return (Builder) super.mo162clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Error) {
                            return mergeFrom((Error) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Error error) {
                        if (error == Error.getDefaultInstance()) {
                            return this;
                        }
                        if (!error.getName().isEmpty()) {
                            this.name_ = error.name_;
                            onChanged();
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(((j0) error).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                        Error error = null;
                        try {
                            try {
                                Error error2 = (Error) Error.PARSER.parsePartialFrom(nVar, yVar);
                                if (error2 != null) {
                                    mergeFrom(error2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Error error3 = (Error) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    error = error3;
                                    if (error != null) {
                                        mergeFrom(error);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (error != null) {
                                mergeFrom(error);
                            }
                            throw th;
                        }
                    }
                }

                public static Builder newBuilder(Error error) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
                }

                public static Error parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                private Error(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Error parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Error) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Error mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Error parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Error() {
                    this.memoizedIsInitialized = (byte) -1;
                    String str = tFQWuE.qvWhzxkgC;
                    this.name_ = str;
                    this.description_ = str;
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static Error parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static Error parseFrom(InputStream inputStream) throws IOException {
                    return (Error) j0.parseWithIOException(PARSER, inputStream);
                }

                private Error(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.name_ = nVar.J();
                                        } else if (iK != 18) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            this.description_ = nVar.J();
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

                public static Error parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Error) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                public static Error parseFrom(n nVar) throws IOException {
                    return (Error) j0.parseWithIOException(PARSER, nVar);
                }

                public static Error parseFrom(n nVar, y yVar) throws IOException {
                    return (Error) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface ErrorOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                String getDescription();

                ByteString getDescriptionBytes();

                String getName();

                ByteString getNameBytes();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static final class Measure extends j0 implements MeasureOrBuilder {
                public static final int NAME_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private double value_;
                private static final Measure DEFAULT_INSTANCE = new Measure();
                private static final s1<Measure> PARSER = new b<Measure>() { // from class: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.1
                    @Override // com.explorestack.protobuf.s1
                    public Measure parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new Measure(nVar, yVar);
                    }
                };

                public static Measure getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Measure parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Measure) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<Measure> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Measure)) {
                        return super.equals(obj);
                    }
                    Measure measure = (Measure) obj;
                    return getName().equals(measure.getName()) && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(measure.getValue()) && this.unknownFields.equals(measure.unknownFields);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
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
                public s1<Measure> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = getNameBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.name_);
                    double d10 = this.value_;
                    if (d10 != 0.0d) {
                        iComputeStringSize += CodedOutputStream.j(2, d10);
                    }
                    int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                public final u2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                public double getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + l0.i(Double.doubleToLongBits(getValue()))) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.j0
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.d(Measure.class, Builder.class);
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
                    return new Measure();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!getNameBytes().isEmpty()) {
                        j0.writeString(codedOutputStream, 1, this.name_);
                    }
                    double d10 = this.value_;
                    if (d10 != 0.0d) {
                        codedOutputStream.t0(2, d10);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static final class Builder extends j0.b<Builder> implements MeasureOrBuilder {
                    private Object name_;
                    private double value_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = j0.alwaysUseFieldBuilders;
                    }

                    public Builder clearName() {
                        this.name_ = Measure.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = 0.0d;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.MeasureOrBuilder
                    public double getValue() {
                        return this.value_;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.d(Measure.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
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

                    public Builder setValue(double d10) {
                        this.value_ = d10;
                        onChanged();
                        return this;
                    }

                    private Builder() {
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure build() {
                        Measure measureBuildPartial = buildPartial();
                        if (measureBuildPartial.isInitialized()) {
                            return measureBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) measureBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Measure buildPartial() {
                        Measure measure = new Measure(this);
                        measure.name_ = this.name_;
                        measure.value_ = this.value_;
                        onBuilt();
                        return measure;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public Measure mo164getDefaultInstanceForType() {
                        return Measure.getDefaultInstance();
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
                        this.name_ = "";
                        this.value_ = 0.0d;
                        return this;
                    }

                    private Builder(j0.c cVar) {
                        super(cVar);
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
                    /* JADX INFO: renamed from: clone */
                    public Builder mo162clone() {
                        return (Builder) super.mo162clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Measure) {
                            return mergeFrom((Measure) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Measure measure) {
                        if (measure == Measure.getDefaultInstance()) {
                            return this;
                        }
                        if (!measure.getName().isEmpty()) {
                            this.name_ = measure.name_;
                            onChanged();
                        }
                        if (measure.getValue() != 0.0d) {
                            setValue(measure.getValue());
                        }
                        mergeUnknownFields(((j0) measure).unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                        Measure measure = null;
                        try {
                            try {
                                Measure measure2 = (Measure) Measure.PARSER.parsePartialFrom(nVar, yVar);
                                if (measure2 != null) {
                                    mergeFrom(measure2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Measure measure3 = (Measure) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    measure = measure3;
                                    if (measure != null) {
                                        mergeFrom(measure);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (measure != null) {
                                mergeFrom(measure);
                            }
                            throw th;
                        }
                    }
                }

                public static Builder newBuilder(Measure measure) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(measure);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                private Measure(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Measure parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Measure) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static Measure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Measure mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Measure parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Measure() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                }

                public static Measure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static Measure parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static Measure parseFrom(InputStream inputStream) throws IOException {
                    return (Measure) j0.parseWithIOException(PARSER, inputStream);
                }

                private Measure(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                            this.name_ = nVar.J();
                                        } else if (iK != 17) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            this.value_ = nVar.s();
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

                public static Measure parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (Measure) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                public static Measure parseFrom(n nVar) throws IOException {
                    return (Measure) j0.parseWithIOException(PARSER, nVar);
                }

                public static Measure parseFrom(n nVar, y yVar) throws IOException {
                    return (Measure) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface MeasureOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                String getName();

                ByteString getNameBytes();

                double getValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static MetricData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MetricData) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<MetricData> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetricData)) {
                    return super.equals(obj);
                }
                MetricData metricData = (MetricData) obj;
                if (!getTimestamp().equals(metricData.getTimestamp()) || !getName().equals(metricData.getName()) || !getDimensionsList().equals(metricData.getDimensionsList()) || !getMeasuresList().equals(metricData.getMeasuresList()) || hasError() != metricData.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(metricData.getError())) && hasTs() == metricData.hasTs()) {
                    return (!hasTs() || getTs().equals(metricData.getTs())) && this.unknownFields.equals(metricData.unknownFields);
                }
                return false;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Dimension getDimensions(int i10) {
                return this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Dimension> getDimensionsList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public DimensionOrBuilder getDimensionsOrBuilder(int i10) {
                return this.dimensions_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                return this.dimensions_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Measure getMeasures(int i10) {
                return this.measures_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public int getMeasuresCount() {
                return this.measures_.size();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<Measure> getMeasuresList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public MeasureOrBuilder getMeasuresOrBuilder(int i10) {
                return this.measures_.get(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                return this.measures_;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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
            public s1<MetricData> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getTimestampBytes().isEmpty() ? j0.computeStringSize(1, this.timestamp_) + 0 : 0;
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += j0.computeStringSize(2, this.name_);
                }
                for (int i11 = 0; i11 < this.dimensions_.size(); i11++) {
                    iComputeStringSize += CodedOutputStream.G(3, this.dimensions_.get(i11));
                }
                for (int i12 = 0; i12 < this.measures_.size(); i12++) {
                    iComputeStringSize += CodedOutputStream.G(4, this.measures_.get(i12));
                }
                if (this.error_ != null) {
                    iComputeStringSize += CodedOutputStream.G(5, getError());
                }
                if (this.ts_ != null) {
                    iComputeStringSize += CodedOutputStream.G(6, getTs());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public String getTimestamp() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            @Deprecated
            public ByteString getTimestampBytes() {
                Object obj = this.timestamp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.timestamp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public Timestamp getTs() {
                Timestamp timestamp = this.ts_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public n2 getTsOrBuilder() {
                return getTs();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasError() {
                return this.error_ != null;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
            public boolean hasTs() {
                return this.ts_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getName().hashCode();
                if (getDimensionsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getDimensionsList().hashCode();
                }
                if (getMeasuresCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getMeasuresList().hashCode();
                }
                if (hasError()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getError().hashCode();
                }
                if (hasTs()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getTs().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.d(MetricData.class, Builder.class);
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
                return new MetricData();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getTimestampBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 1, this.timestamp_);
                }
                if (!getNameBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 2, this.name_);
                }
                for (int i10 = 0; i10 < this.dimensions_.size(); i10++) {
                    codedOutputStream.L0(3, this.dimensions_.get(i10));
                }
                for (int i11 = 0; i11 < this.measures_.size(); i11++) {
                    codedOutputStream.L0(4, this.measures_.get(i11));
                }
                if (this.error_ != null) {
                    codedOutputStream.L0(5, getError());
                }
                if (this.ts_ != null) {
                    codedOutputStream.L0(6, getTs());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements MetricDataOrBuilder {
                private int bitField0_;
                private z1<Dimension, Dimension.Builder, DimensionOrBuilder> dimensionsBuilder_;
                private List<Dimension> dimensions_;
                private e2<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
                private Error error_;
                private z1<Measure, Measure.Builder, MeasureOrBuilder> measuresBuilder_;
                private List<Measure> measures_;
                private Object name_;
                private Object timestamp_;
                private e2<Timestamp, Timestamp.Builder, n2> tsBuilder_;
                private Timestamp ts_;

                private void ensureDimensionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.dimensions_ = new ArrayList(this.dimensions_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureMeasuresIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.measures_ = new ArrayList(this.measures_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                private z1<Dimension, Dimension.Builder, DimensionOrBuilder> getDimensionsFieldBuilder() {
                    if (this.dimensionsBuilder_ == null) {
                        this.dimensionsBuilder_ = new z1<>(this.dimensions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.dimensions_ = null;
                    }
                    return this.dimensionsBuilder_;
                }

                private e2<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new e2<>(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                private z1<Measure, Measure.Builder, MeasureOrBuilder> getMeasuresFieldBuilder() {
                    if (this.measuresBuilder_ == null) {
                        this.measuresBuilder_ = new z1<>(this.measures_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.measures_ = null;
                    }
                    return this.measuresBuilder_;
                }

                private e2<Timestamp, Timestamp.Builder, n2> getTsFieldBuilder() {
                    if (this.tsBuilder_ == null) {
                        this.tsBuilder_ = new e2<>(getTs(), getParentForChildren(), isClean());
                        this.ts_ = null;
                    }
                    return this.tsBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getDimensionsFieldBuilder();
                        getMeasuresFieldBuilder();
                    }
                }

                public Builder addAllDimensions(Iterable<? extends Dimension> iterable) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        ensureDimensionsIsMutable();
                        a.AbstractC0128a.addAll((Iterable) iterable, (List) this.dimensions_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addAllMeasures(Iterable<? extends Measure> iterable) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        ensureMeasuresIsMutable();
                        a.AbstractC0128a.addAll((Iterable) iterable, (List) this.measures_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addDimensions(Dimension dimension) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(dimension);
                        onChanged();
                    } else {
                        z1Var.e(dimension);
                    }
                    return this;
                }

                public Dimension.Builder addDimensionsBuilder() {
                    return (Dimension.Builder) getDimensionsFieldBuilder().c(Dimension.getDefaultInstance());
                }

                public Builder addMeasures(Measure measure) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(measure);
                        onChanged();
                    } else {
                        z1Var.e(measure);
                    }
                    return this;
                }

                public Measure.Builder addMeasuresBuilder() {
                    return (Measure.Builder) getMeasuresFieldBuilder().c(Measure.getDefaultInstance());
                }

                public Builder clearDimensions() {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        this.dimensions_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
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

                public Builder clearMeasures() {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        this.measures_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearName() {
                    this.name_ = MetricData.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder clearTimestamp() {
                    this.timestamp_ = MetricData.getDefaultInstance().getTimestamp();
                    onChanged();
                    return this;
                }

                public Builder clearTs() {
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                        onChanged();
                    } else {
                        this.ts_ = null;
                        this.tsBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Dimension getDimensions(int i10) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    return z1Var == null ? this.dimensions_.get(i10) : (Dimension) z1Var.n(i10);
                }

                public Dimension.Builder getDimensionsBuilder(int i10) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().k(i10);
                }

                public List<Dimension.Builder> getDimensionsBuilderList() {
                    return getDimensionsFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getDimensionsCount() {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    return z1Var == null ? this.dimensions_.size() : z1Var.m();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Dimension> getDimensionsList() {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.dimensions_) : z1Var.p();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public DimensionOrBuilder getDimensionsOrBuilder(int i10) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    return z1Var == null ? this.dimensions_.get(i10) : (DimensionOrBuilder) z1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.dimensions_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
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

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ErrorOrBuilder getErrorOrBuilder() {
                    e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                    if (e2Var != null) {
                        return (ErrorOrBuilder) e2Var.f();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Measure getMeasures(int i10) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    return z1Var == null ? this.measures_.get(i10) : (Measure) z1Var.n(i10);
                }

                public Measure.Builder getMeasuresBuilder(int i10) {
                    return (Measure.Builder) getMeasuresFieldBuilder().k(i10);
                }

                public List<Measure.Builder> getMeasuresBuilderList() {
                    return getMeasuresFieldBuilder().l();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public int getMeasuresCount() {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    return z1Var == null ? this.measures_.size() : z1Var.m();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<Measure> getMeasuresList() {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.measures_) : z1Var.p();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public MeasureOrBuilder getMeasuresOrBuilder(int i10) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    return z1Var == null ? this.measures_.get(i10) : (MeasureOrBuilder) z1Var.q(i10);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.measures_);
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public String getTimestamp() {
                    Object obj = this.timestamp_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.timestamp_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                @Deprecated
                public ByteString getTimestampBytes() {
                    Object obj = this.timestamp_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.timestamp_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public Timestamp getTs() {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.tsBuilder_;
                    if (e2Var != null) {
                        return (Timestamp) e2Var.e();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                public Timestamp.Builder getTsBuilder() {
                    onChanged();
                    return (Timestamp.Builder) getTsFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public n2 getTsOrBuilder() {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.tsBuilder_;
                    if (e2Var != null) {
                        return (n2) e2Var.f();
                    }
                    Timestamp timestamp = this.ts_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricDataOrBuilder
                public boolean hasTs() {
                    return (this.tsBuilder_ == null && this.ts_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.d(MetricData.class, Builder.class);
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

                public Builder mergeTs(Timestamp timestamp) {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.tsBuilder_;
                    if (e2Var == null) {
                        Timestamp timestamp2 = this.ts_;
                        if (timestamp2 != null) {
                            this.ts_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                        } else {
                            this.ts_ = timestamp;
                        }
                        onChanged();
                    } else {
                        e2Var.g(timestamp);
                    }
                    return this;
                }

                public Builder removeDimensions(int i10) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder removeMeasures(int i10) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setDimensions(int i10, Dimension dimension) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i10, dimension);
                        onChanged();
                    } else {
                        z1Var.w(i10, dimension);
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

                public Builder setMeasures(int i10, Measure measure) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.set(i10, measure);
                        onChanged();
                    } else {
                        z1Var.w(i10, measure);
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

                @Deprecated
                public Builder setTimestamp(String str) {
                    str.getClass();
                    this.timestamp_ = str;
                    onChanged();
                    return this;
                }

                @Deprecated
                public Builder setTimestampBytes(ByteString byteString) {
                    byteString.getClass();
                    a.checkByteStringIsUtf8(byteString);
                    this.timestamp_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTs(Timestamp timestamp) {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.tsBuilder_;
                    if (e2Var == null) {
                        timestamp.getClass();
                        this.ts_ = timestamp;
                        onChanged();
                    } else {
                        e2Var.i(timestamp);
                    }
                    return this;
                }

                private Builder() {
                    this.timestamp_ = "";
                    this.name_ = "";
                    this.dimensions_ = Collections.emptyList();
                    this.measures_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData build() {
                    MetricData metricDataBuildPartial = buildPartial();
                    if (metricDataBuildPartial.isInitialized()) {
                        return metricDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public MetricData buildPartial() {
                    MetricData metricData = new MetricData(this);
                    metricData.timestamp_ = this.timestamp_;
                    metricData.name_ = this.name_;
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var != null) {
                        metricData.dimensions_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                            this.bitField0_ &= -2;
                        }
                        metricData.dimensions_ = this.dimensions_;
                    }
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var2 = this.measuresBuilder_;
                    if (z1Var2 != null) {
                        metricData.measures_ = z1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                            this.bitField0_ &= -3;
                        }
                        metricData.measures_ = this.measures_;
                    }
                    e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
                    if (e2Var == null) {
                        metricData.error_ = this.error_;
                    } else {
                        metricData.error_ = (Error) e2Var.a();
                    }
                    e2<Timestamp, Timestamp.Builder, n2> e2Var2 = this.tsBuilder_;
                    if (e2Var2 == null) {
                        metricData.ts_ = this.ts_;
                    } else {
                        metricData.ts_ = (Timestamp) e2Var2.a();
                    }
                    onBuilt();
                    return metricData;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public MetricData mo164getDefaultInstanceForType() {
                    return MetricData.getDefaultInstance();
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

                public Dimension.Builder addDimensionsBuilder(int i10) {
                    return (Dimension.Builder) getDimensionsFieldBuilder().b(i10, Dimension.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder(int i10) {
                    return (Measure.Builder) getMeasuresFieldBuilder().b(i10, Measure.getDefaultInstance());
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
                    this.timestamp_ = "";
                    this.name_ = "";
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        this.dimensions_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        z1Var.g();
                    }
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var2 = this.measuresBuilder_;
                    if (z1Var2 == null) {
                        this.measures_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        z1Var2.g();
                    }
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    if (this.tsBuilder_ == null) {
                        this.ts_ = null;
                    } else {
                        this.ts_ = null;
                        this.tsBuilder_ = null;
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

                public Builder setTs(Timestamp.Builder builder) {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.tsBuilder_;
                    if (e2Var == null) {
                        this.ts_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder addDimensions(int i10, Dimension dimension) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        dimension.getClass();
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i10, dimension);
                        onChanged();
                    } else {
                        z1Var.d(i10, dimension);
                    }
                    return this;
                }

                public Builder addMeasures(int i10, Measure measure) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        measure.getClass();
                        ensureMeasuresIsMutable();
                        this.measures_.add(i10, measure);
                        onChanged();
                    } else {
                        z1Var.d(i10, measure);
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
                    if (message instanceof MetricData) {
                        return mergeFrom((MetricData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setDimensions(int i10, Dimension.Builder builder) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder setMeasures(int i10, Measure.Builder builder) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.timestamp_ = "";
                    this.name_ = "";
                    this.dimensions_ = Collections.emptyList();
                    this.measures_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(MetricData metricData) {
                    if (metricData == MetricData.getDefaultInstance()) {
                        return this;
                    }
                    if (!metricData.getTimestamp().isEmpty()) {
                        this.timestamp_ = metricData.timestamp_;
                        onChanged();
                    }
                    if (!metricData.getName().isEmpty()) {
                        this.name_ = metricData.name_;
                        onChanged();
                    }
                    if (this.dimensionsBuilder_ == null) {
                        if (!metricData.dimensions_.isEmpty()) {
                            if (this.dimensions_.isEmpty()) {
                                this.dimensions_ = metricData.dimensions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureDimensionsIsMutable();
                                this.dimensions_.addAll(metricData.dimensions_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.dimensions_.isEmpty()) {
                        if (!this.dimensionsBuilder_.t()) {
                            this.dimensionsBuilder_.a(metricData.dimensions_);
                        } else {
                            this.dimensionsBuilder_.h();
                            this.dimensionsBuilder_ = null;
                            this.dimensions_ = metricData.dimensions_;
                            this.bitField0_ &= -2;
                            this.dimensionsBuilder_ = j0.alwaysUseFieldBuilders ? getDimensionsFieldBuilder() : null;
                        }
                    }
                    if (this.measuresBuilder_ == null) {
                        if (!metricData.measures_.isEmpty()) {
                            if (this.measures_.isEmpty()) {
                                this.measures_ = metricData.measures_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMeasuresIsMutable();
                                this.measures_.addAll(metricData.measures_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.measures_.isEmpty()) {
                        if (!this.measuresBuilder_.t()) {
                            this.measuresBuilder_.a(metricData.measures_);
                        } else {
                            this.measuresBuilder_.h();
                            this.measuresBuilder_ = null;
                            this.measures_ = metricData.measures_;
                            this.bitField0_ &= -3;
                            this.measuresBuilder_ = j0.alwaysUseFieldBuilders ? getMeasuresFieldBuilder() : null;
                        }
                    }
                    if (metricData.hasError()) {
                        mergeError(metricData.getError());
                    }
                    if (metricData.hasTs()) {
                        mergeTs(metricData.getTs());
                    }
                    mergeUnknownFields(((j0) metricData).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addDimensions(Dimension.Builder builder) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addMeasures(Measure.Builder builder) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addDimensions(int i10, Dimension.Builder builder) {
                    z1<Dimension, Dimension.Builder, DimensionOrBuilder> z1Var = this.dimensionsBuilder_;
                    if (z1Var == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                public Builder addMeasures(int i10, Measure.Builder builder) {
                    z1<Measure, Measure.Builder, MeasureOrBuilder> z1Var = this.measuresBuilder_;
                    if (z1Var == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    MetricData metricData = null;
                    try {
                        try {
                            MetricData metricData2 = (MetricData) MetricData.PARSER.parsePartialFrom(nVar, yVar);
                            if (metricData2 != null) {
                                mergeFrom(metricData2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            MetricData metricData3 = (MetricData) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                metricData = metricData3;
                                if (metricData != null) {
                                    mergeFrom(metricData);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (metricData != null) {
                            mergeFrom(metricData);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(MetricData metricData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricData);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private MetricData(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (MetricData) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static MetricData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public MetricData mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static MetricData parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private MetricData() {
                this.memoizedIsInitialized = (byte) -1;
                this.timestamp_ = "";
                this.name_ = "";
                this.dimensions_ = Collections.emptyList();
                this.measures_ = Collections.emptyList();
            }

            public static MetricData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static MetricData parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static MetricData parseFrom(InputStream inputStream) throws IOException {
                return (MetricData) j0.parseWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (MetricData) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            private MetricData(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        this.timestamp_ = nVar.J();
                                    } else if (iK == 18) {
                                        this.name_ = nVar.J();
                                    } else if (iK == 26) {
                                        int i11 = (i10 == true ? 1 : 0) & 1;
                                        i10 = i10;
                                        if (i11 == 0) {
                                            this.dimensions_ = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 1;
                                        }
                                        this.dimensions_.add((Dimension) nVar.A(Dimension.parser(), yVar));
                                    } else if (iK != 34) {
                                        if (iK == 42) {
                                            Error error = this.error_;
                                            Error.Builder builder = error != null ? error.toBuilder() : null;
                                            Error error2 = (Error) nVar.A(Error.parser(), yVar);
                                            this.error_ = error2;
                                            if (builder != null) {
                                                builder.mergeFrom(error2);
                                                this.error_ = builder.buildPartial();
                                            }
                                        } else if (iK != 50) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            Timestamp timestamp = this.ts_;
                                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                            Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                                            this.ts_ = timestamp2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(timestamp2);
                                                this.ts_ = builder2.buildPartial();
                                            }
                                        }
                                    } else {
                                        int i12 = (i10 == true ? 1 : 0) & 2;
                                        i10 = i10;
                                        if (i12 == 0) {
                                            this.measures_ = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 2;
                                        }
                                        this.measures_.add((Measure) nVar.A(Measure.parser(), yVar));
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
                        if (((i10 == true ? 1 : 0) & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                        }
                        if (((i10 == true ? 1 : 0) & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.measures_ = Collections.unmodifiableList(this.measures_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static MetricData parseFrom(n nVar) throws IOException {
                return (MetricData) j0.parseWithIOException(PARSER, nVar);
            }

            public static MetricData parseFrom(n nVar, y yVar) throws IOException {
                return (MetricData) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface MetricDataOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            MetricData.Dimension getDimensions(int i10);

            int getDimensionsCount();

            List<MetricData.Dimension> getDimensionsList();

            MetricData.DimensionOrBuilder getDimensionsOrBuilder(int i10);

            List<? extends MetricData.DimensionOrBuilder> getDimensionsOrBuilderList();

            MetricData.Error getError();

            MetricData.ErrorOrBuilder getErrorOrBuilder();

            MetricData.Measure getMeasures(int i10);

            int getMeasuresCount();

            List<MetricData.Measure> getMeasuresList();

            MetricData.MeasureOrBuilder getMeasuresOrBuilder(int i10);

            List<? extends MetricData.MeasureOrBuilder> getMeasuresOrBuilderList();

            String getName();

            ByteString getNameBytes();

            @Deprecated
            String getTimestamp();

            @Deprecated
            ByteString getTimestampBytes();

            Timestamp getTs();

            n2 getTsOrBuilder();

            boolean hasError();

            boolean hasTs();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Metric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metric) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Metric> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metric)) {
                return super.equals(obj);
            }
            Metric metric = (Metric) obj;
            return getContext().equals(metric.getContext()) && getDataList().equals(metric.getDataList()) && this.unknownFields.equals(metric.unknownFields);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricData getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<MetricData> getDataList() {
            return this.data_;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public MetricDataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
        public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Metric> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getContextBytes().isEmpty() ? j0.computeStringSize(1, this.context_) + 0 : 0;
            for (int i11 = 0; i11 < this.data_.size(); i11++) {
                iComputeStringSize += CodedOutputStream.G(2, this.data_.get(i11));
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContext().hashCode();
            if (getDataCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDataList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.d(Metric.class, Builder.class);
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
            return new Metric();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getContextBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 1, this.context_);
            }
            for (int i10 = 0; i10 < this.data_.size(); i10++) {
                codedOutputStream.L0(2, this.data_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements MetricOrBuilder {
            private int bitField0_;
            private Object context_;
            private z1<MetricData, MetricData.Builder, MetricDataOrBuilder> dataBuilder_;
            private List<MetricData> data_;

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private z1<MetricData, MetricData.Builder, MetricDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new z1<>(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends MetricData> iterable) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.data_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addData(MetricData metricData) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(metricData);
                    onChanged();
                } else {
                    z1Var.e(metricData);
                }
                return this;
            }

            public MetricData.Builder addDataBuilder() {
                return (MetricData.Builder) getDataFieldBuilder().c(MetricData.getDefaultInstance());
            }

            public Builder clearContext() {
                this.context_ = Metric.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder clearData() {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricData getData(int i10) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? this.data_.get(i10) : (MetricData) z1Var.n(i10);
            }

            public MetricData.Builder getDataBuilder(int i10) {
                return (MetricData.Builder) getDataFieldBuilder().k(i10);
            }

            public List<MetricData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public int getDataCount() {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? this.data_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<MetricData> getDataList() {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.data_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public MetricDataOrBuilder getDataOrBuilder(int i10) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var == null ? this.data_.get(i10) : (MetricDataOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayload.MetricOrBuilder
            public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.d(Metric.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeData(int i10) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
                onChanged();
                return this;
            }

            public Builder setData(int i10, MetricData metricData) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i10, metricData);
                    onChanged();
                } else {
                    z1Var.w(i10, metricData);
                }
                return this;
            }

            private Builder() {
                this.context_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric build() {
                Metric metricBuildPartial = buildPartial();
                if (metricBuildPartial.isInitialized()) {
                    return metricBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Metric buildPartial() {
                Metric metric = new Metric(this);
                metric.context_ = this.context_;
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var != null) {
                    metric.data_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    metric.data_ = this.data_;
                }
                onBuilt();
                return metric;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Metric mo164getDefaultInstanceForType() {
                return Metric.getDefaultInstance();
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

            public MetricData.Builder addDataBuilder(int i10) {
                return (MetricData.Builder) getDataFieldBuilder().b(i10, MetricData.getDefaultInstance());
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
                this.context_ = "";
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.context_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addData(int i10, MetricData metricData) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    metricData.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, metricData);
                    onChanged();
                } else {
                    z1Var.d(i10, metricData);
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
                if (message instanceof Metric) {
                    return mergeFrom((Metric) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, MetricData.Builder builder) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Metric metric) {
                if (metric == Metric.getDefaultInstance()) {
                    return this;
                }
                if (!metric.getContext().isEmpty()) {
                    this.context_ = metric.context_;
                    onChanged();
                }
                if (this.dataBuilder_ == null) {
                    if (!metric.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = metric.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(metric.data_);
                        }
                        onChanged();
                    }
                } else if (!metric.data_.isEmpty()) {
                    if (!this.dataBuilder_.t()) {
                        this.dataBuilder_.a(metric.data_);
                    } else {
                        this.dataBuilder_.h();
                        this.dataBuilder_ = null;
                        this.data_ = metric.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = j0.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) metric).unknownFields);
                onChanged();
                return this;
            }

            public Builder addData(MetricData.Builder builder) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
                if (z1Var == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addData(int i10, MetricData.Builder builder) {
                z1<MetricData, MetricData.Builder, MetricDataOrBuilder> z1Var = this.dataBuilder_;
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
                Metric metric = null;
                try {
                    try {
                        Metric metric2 = (Metric) Metric.PARSER.parsePartialFrom(nVar, yVar);
                        if (metric2 != null) {
                            mergeFrom(metric2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Metric metric3 = (Metric) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            metric = metric3;
                            if (metric != null) {
                                mergeFrom(metric);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (metric != null) {
                        mergeFrom(metric);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Metric metric) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric);
        }

        public static Metric parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Metric(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Metric parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Metric) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Metric mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Metric parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Metric() {
            this.memoizedIsInitialized = (byte) -1;
            this.context_ = "";
            this.data_ = Collections.emptyList();
        }

        public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Metric parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Metric parseFrom(InputStream inputStream) throws IOException {
            return (Metric) j0.parseWithIOException(PARSER, inputStream);
        }

        private Metric(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.context_ = nVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.data_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.data_.add((MetricData) nVar.A(MetricData.parser(), yVar));
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

        public static Metric parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Metric) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Metric parseFrom(n nVar) throws IOException {
            return (Metric) j0.parseWithIOException(PARSER, nVar);
        }

        public static Metric parseFrom(n nVar, y yVar) throws IOException {
            return (Metric) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface MetricOrBuilder extends MessageOrBuilder {
        String getContext();

        ByteString getContextBytes();

        Metric.MetricData getData(int i10);

        int getDataCount();

        List<Metric.MetricData> getDataList();

        Metric.MetricDataOrBuilder getDataOrBuilder(int i10);

        List<? extends Metric.MetricDataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static SDKAnalyticPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<SDKAnalyticPayload> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKAnalyticPayload)) {
            return super.equals(obj);
        }
        SDKAnalyticPayload sDKAnalyticPayload = (SDKAnalyticPayload) obj;
        return getMetricsList().equals(sDKAnalyticPayload.getMetricsList()) && this.unknownFields.equals(sDKAnalyticPayload.unknownFields);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public Metric getMetrics(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public MetricOrBuilder getMetricsOrBuilder(int i10) {
        return this.metrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<SDKAnalyticPayload> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.metrics_.size(); i11++) {
            iG += CodedOutputStream.G(1, this.metrics_.get(i11));
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
        if (getMetricsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getMetricsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.d(SDKAnalyticPayload.class, Builder.class);
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
        return new SDKAnalyticPayload();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.metrics_.size(); i10++) {
            codedOutputStream.L0(1, this.metrics_.get(i10));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements SDKAnalyticPayloadOrBuilder {
        private int bitField0_;
        private z1<Metric, Metric.Builder, MetricOrBuilder> metricsBuilder_;
        private List<Metric> metrics_;

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        private z1<Metric, Metric.Builder, MetricOrBuilder> getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                this.metricsBuilder_ = new z1<>(this.metrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getMetricsFieldBuilder();
            }
        }

        public Builder addAllMetrics(Iterable<? extends Metric> iterable) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                ensureMetricsIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.metrics_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addMetrics(Metric metric) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(metric);
                onChanged();
            } else {
                z1Var.e(metric);
            }
            return this;
        }

        public Metric.Builder addMetricsBuilder() {
            return (Metric.Builder) getMetricsFieldBuilder().c(Metric.getDefaultInstance());
        }

        public Builder clearMetrics() {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public Metric getMetrics(int i10) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            return z1Var == null ? this.metrics_.get(i10) : (Metric) z1Var.n(i10);
        }

        public Metric.Builder getMetricsBuilder(int i10) {
            return (Metric.Builder) getMetricsFieldBuilder().k(i10);
        }

        public List<Metric.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public int getMetricsCount() {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            return z1Var == null ? this.metrics_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<Metric> getMetricsList() {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.metrics_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public MetricOrBuilder getMetricsOrBuilder(int i10) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            return z1Var == null ? this.metrics_.get(i10) : (MetricOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.analytics.SDKAnalyticPayloadOrBuilder
        public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.metrics_);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.d(SDKAnalyticPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMetrics(int i10) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setMetrics(int i10, Metric metric) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.set(i10, metric);
                onChanged();
            } else {
                z1Var.w(i10, metric);
            }
            return this;
        }

        private Builder() {
            this.metrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload build() {
            SDKAnalyticPayload sDKAnalyticPayloadBuildPartial = buildPartial();
            if (sDKAnalyticPayloadBuildPartial.isInitialized()) {
                return sDKAnalyticPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKAnalyticPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKAnalyticPayload buildPartial() {
            SDKAnalyticPayload sDKAnalyticPayload = new SDKAnalyticPayload(this);
            int i10 = this.bitField0_;
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                if ((i10 & 1) != 0) {
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -2;
                }
                sDKAnalyticPayload.metrics_ = this.metrics_;
            } else {
                sDKAnalyticPayload.metrics_ = z1Var.f();
            }
            onBuilt();
            return sDKAnalyticPayload;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public SDKAnalyticPayload mo164getDefaultInstanceForType() {
            return SDKAnalyticPayload.getDefaultInstance();
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

        public Metric.Builder addMetricsBuilder(int i10) {
            return (Metric.Builder) getMetricsFieldBuilder().b(i10, Metric.getDefaultInstance());
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
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.metrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addMetrics(int i10, Metric metric) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                metric.getClass();
                ensureMetricsIsMutable();
                this.metrics_.add(i10, metric);
                onChanged();
            } else {
                z1Var.d(i10, metric);
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
            if (message instanceof SDKAnalyticPayload) {
                return mergeFrom((SDKAnalyticPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMetrics(int i10, Metric.Builder builder) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(SDKAnalyticPayload sDKAnalyticPayload) {
            if (sDKAnalyticPayload == SDKAnalyticPayload.getDefaultInstance()) {
                return this;
            }
            if (this.metricsBuilder_ == null) {
                if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = sDKAnalyticPayload.metrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(sDKAnalyticPayload.metrics_);
                    }
                    onChanged();
                }
            } else if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                if (!this.metricsBuilder_.t()) {
                    this.metricsBuilder_.a(sDKAnalyticPayload.metrics_);
                } else {
                    this.metricsBuilder_.h();
                    this.metricsBuilder_ = null;
                    this.metrics_ = sDKAnalyticPayload.metrics_;
                    this.bitField0_ &= -2;
                    this.metricsBuilder_ = j0.alwaysUseFieldBuilders ? getMetricsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) sDKAnalyticPayload).unknownFields);
            onChanged();
            return this;
        }

        public Builder addMetrics(Metric.Builder builder) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addMetrics(int i10, Metric.Builder builder) {
            z1<Metric, Metric.Builder, MetricOrBuilder> z1Var = this.metricsBuilder_;
            if (z1Var == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            SDKAnalyticPayload sDKAnalyticPayload = null;
            try {
                try {
                    SDKAnalyticPayload sDKAnalyticPayload2 = (SDKAnalyticPayload) SDKAnalyticPayload.PARSER.parsePartialFrom(nVar, yVar);
                    if (sDKAnalyticPayload2 != null) {
                        mergeFrom(sDKAnalyticPayload2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    SDKAnalyticPayload sDKAnalyticPayload3 = (SDKAnalyticPayload) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        sDKAnalyticPayload = sDKAnalyticPayload3;
                        if (sDKAnalyticPayload != null) {
                            mergeFrom(sDKAnalyticPayload);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (sDKAnalyticPayload != null) {
                    mergeFrom(sDKAnalyticPayload);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(SDKAnalyticPayload sDKAnalyticPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKAnalyticPayload);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private SDKAnalyticPayload(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (SDKAnalyticPayload) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public SDKAnalyticPayload mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKAnalyticPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.metrics_ = Collections.emptyList();
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) j0.parseWithIOException(PARSER, inputStream);
    }

    private SDKAnalyticPayload(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.metrics_ = new ArrayList();
                                z11 |= true;
                            }
                            this.metrics_.add((Metric) nVar.A(Metric.parser(), yVar));
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
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.metrics_ = Collections.unmodifiableList(this.metrics_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (SDKAnalyticPayload) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static SDKAnalyticPayload parseFrom(n nVar) throws IOException {
        return (SDKAnalyticPayload) j0.parseWithIOException(PARSER, nVar);
    }

    public static SDKAnalyticPayload parseFrom(n nVar, y yVar) throws IOException {
        return (SDKAnalyticPayload) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
