package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
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
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import com.explorestack.protobuf.adcom.c;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.h2;
import com.explorestack.protobuf.i2;
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
public final class InitRequest extends j0 implements InitRequestOrBuilder {
    public static final int ANDROID_FIELD_NUMBER = 20;
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 19;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXT_FIELD_NUMBER = 15;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int HWV_FIELD_NUMBER = 18;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int IOS_FIELD_NUMBER = 21;
    public static final int MAKE_FIELD_NUMBER = 16;
    public static final int MODEL_FIELD_NUMBER = 17;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int SDKVER_FIELD_NUMBER = 7;
    public static final int SDK_FIELD_NUMBER = 6;
    public static final int SELLER_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private volatile Object appVer_;
    private volatile Object bmIfv_;
    private volatile Object bundle_;
    private Context context_;
    private int contype_;
    private int deviceType_;
    private Struct ext_;
    private Context.Geo geo_;
    private volatile Object hwv_;
    private volatile Object ifa_;
    private volatile Object ifv_;
    private volatile Object make_;
    private byte memoizedIsInitialized;
    private volatile Object model_;
    private int os_;
    private volatile Object osv_;
    private int platformDataCase_;
    private Object platformData_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private volatile Object sellerId_;
    private volatile Object sessionId_;
    private static final InitRequest DEFAULT_INSTANCE = new InitRequest();
    private static final s1<InitRequest> PARSER = new b<InitRequest>() { // from class: io.bidmachine.protobuf.InitRequest.1
        @Override // com.explorestack.protobuf.s1
        public InitRequest parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new InitRequest(nVar, yVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.InitRequest$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase;

        static {
            int[] iArr = new int[PlatformDataCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase = iArr;
            try {
                iArr[PlatformDataCase.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[PlatformDataCase.IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[PlatformDataCase.PLATFORMDATA_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class AndroidPlatformData extends j0 implements AndroidPlatformDataOrBuilder {
        public static final int CONTENT_PROVIDER_STARTUP_METRICS_FIELD_NUMBER = 3;
        public static final int KOTLIN_VERSION_FIELD_NUMBER = 2;
        public static final int MIN_API_LEVEL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ContentProviderStartupMetrics> contentProviderStartupMetrics_;
        private volatile Object kotlinVersion_;
        private byte memoizedIsInitialized;
        private int minApiLevel_;
        private static final AndroidPlatformData DEFAULT_INSTANCE = new AndroidPlatformData();
        private static final s1<AndroidPlatformData> PARSER = new b<AndroidPlatformData>() { // from class: io.bidmachine.protobuf.InitRequest.AndroidPlatformData.1
            @Override // com.explorestack.protobuf.s1
            public AndroidPlatformData parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new AndroidPlatformData(nVar, yVar);
            }
        };

        public static final class ContentProviderStartupMetrics extends j0 implements ContentProviderStartupMetricsOrBuilder {
            public static final int INIT_COMPLETED_FIELD_NUMBER = 3;
            public static final int INIT_DURATION_FIELD_NUMBER = 2;
            public static final int START_INIT_TIME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private boolean initCompleted_;
            private long initDuration_;
            private byte memoizedIsInitialized;
            private Timestamp startInitTime_;
            private static final ContentProviderStartupMetrics DEFAULT_INSTANCE = new ContentProviderStartupMetrics();
            private static final s1<ContentProviderStartupMetrics> PARSER = new b<ContentProviderStartupMetrics>() { // from class: io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetrics.1
                @Override // com.explorestack.protobuf.s1
                public ContentProviderStartupMetrics parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new ContentProviderStartupMetrics(nVar, yVar);
                }
            };

            public static ContentProviderStartupMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ContentProviderStartupMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ContentProviderStartupMetrics) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<ContentProviderStartupMetrics> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ContentProviderStartupMetrics)) {
                    return super.equals(obj);
                }
                ContentProviderStartupMetrics contentProviderStartupMetrics = (ContentProviderStartupMetrics) obj;
                if (hasStartInitTime() != contentProviderStartupMetrics.hasStartInitTime()) {
                    return false;
                }
                return (!hasStartInitTime() || getStartInitTime().equals(contentProviderStartupMetrics.getStartInitTime())) && getInitDuration() == contentProviderStartupMetrics.getInitDuration() && getInitCompleted() == contentProviderStartupMetrics.getInitCompleted() && this.unknownFields.equals(contentProviderStartupMetrics.unknownFields);
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public boolean getInitCompleted() {
                return this.initCompleted_;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public long getInitDuration() {
                return this.initDuration_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<ContentProviderStartupMetrics> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = this.startInitTime_ != null ? 0 + CodedOutputStream.G(1, getStartInitTime()) : 0;
                long j10 = this.initDuration_;
                if (j10 != 0) {
                    iG += CodedOutputStream.a0(2, j10);
                }
                boolean z10 = this.initCompleted_;
                if (z10) {
                    iG += CodedOutputStream.e(3, z10);
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public Timestamp getStartInitTime() {
                Timestamp timestamp = this.startInitTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public n2 getStartInitTimeOrBuilder() {
                return getStartInitTime();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
            public boolean hasStartInitTime() {
                return this.startInitTime_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (hasStartInitTime()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getStartInitTime().hashCode();
                }
                int i11 = (((((((((iHashCode * 37) + 2) * 53) + l0.i(getInitDuration())) * 37) + 3) * 53) + l0.d(getInitCompleted())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = i11;
                return i11;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_fieldAccessorTable.d(ContentProviderStartupMetrics.class, Builder.class);
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
                return new ContentProviderStartupMetrics();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.startInitTime_ != null) {
                    codedOutputStream.L0(1, getStartInitTime());
                }
                long j10 = this.initDuration_;
                if (j10 != 0) {
                    codedOutputStream.e1(2, j10);
                }
                boolean z10 = this.initCompleted_;
                if (z10) {
                    codedOutputStream.n0(3, z10);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements ContentProviderStartupMetricsOrBuilder {
                private boolean initCompleted_;
                private long initDuration_;
                private e2<Timestamp, Timestamp.Builder, n2> startInitTimeBuilder_;
                private Timestamp startInitTime_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_descriptor;
                }

                private e2<Timestamp, Timestamp.Builder, n2> getStartInitTimeFieldBuilder() {
                    if (this.startInitTimeBuilder_ == null) {
                        this.startInitTimeBuilder_ = new e2<>(getStartInitTime(), getParentForChildren(), isClean());
                        this.startInitTime_ = null;
                    }
                    return this.startInitTimeBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = j0.alwaysUseFieldBuilders;
                }

                public Builder clearInitCompleted() {
                    this.initCompleted_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearInitDuration() {
                    this.initDuration_ = 0L;
                    onChanged();
                    return this;
                }

                public Builder clearStartInitTime() {
                    if (this.startInitTimeBuilder_ == null) {
                        this.startInitTime_ = null;
                        onChanged();
                    } else {
                        this.startInitTime_ = null;
                        this.startInitTimeBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_descriptor;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public boolean getInitCompleted() {
                    return this.initCompleted_;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public long getInitDuration() {
                    return this.initDuration_;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public Timestamp getStartInitTime() {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startInitTimeBuilder_;
                    if (e2Var != null) {
                        return (Timestamp) e2Var.e();
                    }
                    Timestamp timestamp = this.startInitTime_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                public Timestamp.Builder getStartInitTimeBuilder() {
                    onChanged();
                    return (Timestamp.Builder) getStartInitTimeFieldBuilder().d();
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public n2 getStartInitTimeOrBuilder() {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startInitTimeBuilder_;
                    if (e2Var != null) {
                        return (n2) e2Var.f();
                    }
                    Timestamp timestamp = this.startInitTime_;
                    return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
                }

                @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformData.ContentProviderStartupMetricsOrBuilder
                public boolean hasStartInitTime() {
                    return (this.startInitTimeBuilder_ == null && this.startInitTime_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_ContentProviderStartupMetrics_fieldAccessorTable.d(ContentProviderStartupMetrics.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeStartInitTime(Timestamp timestamp) {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startInitTimeBuilder_;
                    if (e2Var == null) {
                        Timestamp timestamp2 = this.startInitTime_;
                        if (timestamp2 != null) {
                            this.startInitTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                        } else {
                            this.startInitTime_ = timestamp;
                        }
                        onChanged();
                    } else {
                        e2Var.g(timestamp);
                    }
                    return this;
                }

                public Builder setInitCompleted(boolean z10) {
                    this.initCompleted_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setInitDuration(long j10) {
                    this.initDuration_ = j10;
                    onChanged();
                    return this;
                }

                public Builder setStartInitTime(Timestamp timestamp) {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startInitTimeBuilder_;
                    if (e2Var == null) {
                        timestamp.getClass();
                        this.startInitTime_ = timestamp;
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
                public ContentProviderStartupMetrics build() {
                    ContentProviderStartupMetrics contentProviderStartupMetricsBuildPartial = buildPartial();
                    if (contentProviderStartupMetricsBuildPartial.isInitialized()) {
                        return contentProviderStartupMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) contentProviderStartupMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public ContentProviderStartupMetrics buildPartial() {
                    ContentProviderStartupMetrics contentProviderStartupMetrics = new ContentProviderStartupMetrics(this);
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startInitTimeBuilder_;
                    if (e2Var == null) {
                        contentProviderStartupMetrics.startInitTime_ = this.startInitTime_;
                    } else {
                        contentProviderStartupMetrics.startInitTime_ = (Timestamp) e2Var.a();
                    }
                    contentProviderStartupMetrics.initDuration_ = this.initDuration_;
                    contentProviderStartupMetrics.initCompleted_ = this.initCompleted_;
                    onBuilt();
                    return contentProviderStartupMetrics;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public ContentProviderStartupMetrics mo164getDefaultInstanceForType() {
                    return ContentProviderStartupMetrics.getDefaultInstance();
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
                    if (this.startInitTimeBuilder_ == null) {
                        this.startInitTime_ = null;
                    } else {
                        this.startInitTime_ = null;
                        this.startInitTimeBuilder_ = null;
                    }
                    this.initDuration_ = 0L;
                    this.initCompleted_ = false;
                    return this;
                }

                public Builder setStartInitTime(Timestamp.Builder builder) {
                    e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startInitTimeBuilder_;
                    if (e2Var == null) {
                        this.startInitTime_ = builder.build();
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
                    if (message instanceof ContentProviderStartupMetrics) {
                        return mergeFrom((ContentProviderStartupMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ContentProviderStartupMetrics contentProviderStartupMetrics) {
                    if (contentProviderStartupMetrics == ContentProviderStartupMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (contentProviderStartupMetrics.hasStartInitTime()) {
                        mergeStartInitTime(contentProviderStartupMetrics.getStartInitTime());
                    }
                    if (contentProviderStartupMetrics.getInitDuration() != 0) {
                        setInitDuration(contentProviderStartupMetrics.getInitDuration());
                    }
                    if (contentProviderStartupMetrics.getInitCompleted()) {
                        setInitCompleted(contentProviderStartupMetrics.getInitCompleted());
                    }
                    mergeUnknownFields(((j0) contentProviderStartupMetrics).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    ContentProviderStartupMetrics contentProviderStartupMetrics = null;
                    try {
                        try {
                            ContentProviderStartupMetrics contentProviderStartupMetrics2 = (ContentProviderStartupMetrics) ContentProviderStartupMetrics.PARSER.parsePartialFrom(nVar, yVar);
                            if (contentProviderStartupMetrics2 != null) {
                                mergeFrom(contentProviderStartupMetrics2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            ContentProviderStartupMetrics contentProviderStartupMetrics3 = (ContentProviderStartupMetrics) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                contentProviderStartupMetrics = contentProviderStartupMetrics3;
                                if (contentProviderStartupMetrics != null) {
                                    mergeFrom(contentProviderStartupMetrics);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (contentProviderStartupMetrics != null) {
                            mergeFrom(contentProviderStartupMetrics);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(ContentProviderStartupMetrics contentProviderStartupMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(contentProviderStartupMetrics);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private ContentProviderStartupMetrics(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ContentProviderStartupMetrics parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (ContentProviderStartupMetrics) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public ContentProviderStartupMetrics mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static ContentProviderStartupMetrics parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private ContentProviderStartupMetrics() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static ContentProviderStartupMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static ContentProviderStartupMetrics parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            private ContentProviderStartupMetrics(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    Timestamp timestamp = this.startInitTime_;
                                    Timestamp.Builder builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                                    this.startInitTime_ = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.startInitTime_ = builder.buildPartial();
                                    }
                                } else if (iK == 16) {
                                    this.initDuration_ = nVar.M();
                                } else if (iK != 24) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    this.initCompleted_ = nVar.q();
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

            public static ContentProviderStartupMetrics parseFrom(InputStream inputStream) throws IOException {
                return (ContentProviderStartupMetrics) j0.parseWithIOException(PARSER, inputStream);
            }

            public static ContentProviderStartupMetrics parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (ContentProviderStartupMetrics) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static ContentProviderStartupMetrics parseFrom(n nVar) throws IOException {
                return (ContentProviderStartupMetrics) j0.parseWithIOException(PARSER, nVar);
            }

            public static ContentProviderStartupMetrics parseFrom(n nVar, y yVar) throws IOException {
                return (ContentProviderStartupMetrics) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface ContentProviderStartupMetricsOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            boolean getInitCompleted();

            long getInitDuration();

            Timestamp getStartInitTime();

            n2 getStartInitTimeOrBuilder();

            boolean hasStartInitTime();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static AndroidPlatformData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AndroidPlatformData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AndroidPlatformData) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AndroidPlatformData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<AndroidPlatformData> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidPlatformData)) {
                return super.equals(obj);
            }
            AndroidPlatformData androidPlatformData = (AndroidPlatformData) obj;
            return getMinApiLevel() == androidPlatformData.getMinApiLevel() && getKotlinVersion().equals(androidPlatformData.getKotlinVersion()) && getContentProviderStartupMetricsList().equals(androidPlatformData.getContentProviderStartupMetricsList()) && this.unknownFields.equals(androidPlatformData.unknownFields);
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ContentProviderStartupMetrics getContentProviderStartupMetrics(int i10) {
            return this.contentProviderStartupMetrics_.get(i10);
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public int getContentProviderStartupMetricsCount() {
            return this.contentProviderStartupMetrics_.size();
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public List<ContentProviderStartupMetrics> getContentProviderStartupMetricsList() {
            return this.contentProviderStartupMetrics_;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ContentProviderStartupMetricsOrBuilder getContentProviderStartupMetricsOrBuilder(int i10) {
            return this.contentProviderStartupMetrics_.get(i10);
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public List<? extends ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsOrBuilderList() {
            return this.contentProviderStartupMetrics_;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public String getKotlinVersion() {
            Object obj = this.kotlinVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kotlinVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public ByteString getKotlinVersionBytes() {
            Object obj = this.kotlinVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kotlinVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
        public int getMinApiLevel() {
            return this.minApiLevel_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<AndroidPlatformData> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.minApiLevel_;
            int iY = i11 != 0 ? CodedOutputStream.Y(1, i11) + 0 : 0;
            if (!getKotlinVersionBytes().isEmpty()) {
                iY += j0.computeStringSize(2, this.kotlinVersion_);
            }
            for (int i12 = 0; i12 < this.contentProviderStartupMetrics_.size(); i12++) {
                iY += CodedOutputStream.G(3, this.contentProviderStartupMetrics_.get(i12));
            }
            int serializedSize = iY + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMinApiLevel()) * 37) + 2) * 53) + getKotlinVersion().hashCode();
            if (getContentProviderStartupMetricsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getContentProviderStartupMetricsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable.d(AndroidPlatformData.class, Builder.class);
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
            return new AndroidPlatformData();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i10 = this.minApiLevel_;
            if (i10 != 0) {
                codedOutputStream.c1(1, i10);
            }
            if (!getKotlinVersionBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 2, this.kotlinVersion_);
            }
            for (int i11 = 0; i11 < this.contentProviderStartupMetrics_.size(); i11++) {
                codedOutputStream.L0(3, this.contentProviderStartupMetrics_.get(i11));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements AndroidPlatformDataOrBuilder {
            private int bitField0_;
            private z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> contentProviderStartupMetricsBuilder_;
            private List<ContentProviderStartupMetrics> contentProviderStartupMetrics_;
            private Object kotlinVersion_;
            private int minApiLevel_;

            private void ensureContentProviderStartupMetricsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.contentProviderStartupMetrics_ = new ArrayList(this.contentProviderStartupMetrics_);
                    this.bitField0_ |= 1;
                }
            }

            private z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsFieldBuilder() {
                if (this.contentProviderStartupMetricsBuilder_ == null) {
                    this.contentProviderStartupMetricsBuilder_ = new z1<>(this.contentProviderStartupMetrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.contentProviderStartupMetrics_ = null;
                }
                return this.contentProviderStartupMetricsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getContentProviderStartupMetricsFieldBuilder();
                }
            }

            public Builder addAllContentProviderStartupMetrics(Iterable<? extends ContentProviderStartupMetrics> iterable) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.contentProviderStartupMetrics_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addContentProviderStartupMetrics(ContentProviderStartupMetrics contentProviderStartupMetrics) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    contentProviderStartupMetrics.getClass();
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(contentProviderStartupMetrics);
                    onChanged();
                } else {
                    z1Var.e(contentProviderStartupMetrics);
                }
                return this;
            }

            public ContentProviderStartupMetrics.Builder addContentProviderStartupMetricsBuilder() {
                return (ContentProviderStartupMetrics.Builder) getContentProviderStartupMetricsFieldBuilder().c(ContentProviderStartupMetrics.getDefaultInstance());
            }

            public Builder clearContentProviderStartupMetrics() {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    this.contentProviderStartupMetrics_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearKotlinVersion() {
                this.kotlinVersion_ = AndroidPlatformData.getDefaultInstance().getKotlinVersion();
                onChanged();
                return this;
            }

            public Builder clearMinApiLevel() {
                this.minApiLevel_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ContentProviderStartupMetrics getContentProviderStartupMetrics(int i10) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                return z1Var == null ? this.contentProviderStartupMetrics_.get(i10) : (ContentProviderStartupMetrics) z1Var.n(i10);
            }

            public ContentProviderStartupMetrics.Builder getContentProviderStartupMetricsBuilder(int i10) {
                return (ContentProviderStartupMetrics.Builder) getContentProviderStartupMetricsFieldBuilder().k(i10);
            }

            public List<ContentProviderStartupMetrics.Builder> getContentProviderStartupMetricsBuilderList() {
                return getContentProviderStartupMetricsFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public int getContentProviderStartupMetricsCount() {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                return z1Var == null ? this.contentProviderStartupMetrics_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public List<ContentProviderStartupMetrics> getContentProviderStartupMetricsList() {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.contentProviderStartupMetrics_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ContentProviderStartupMetricsOrBuilder getContentProviderStartupMetricsOrBuilder(int i10) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                return z1Var == null ? this.contentProviderStartupMetrics_.get(i10) : (ContentProviderStartupMetricsOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public List<? extends ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsOrBuilderList() {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.contentProviderStartupMetrics_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public String getKotlinVersion() {
                Object obj = this.kotlinVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.kotlinVersion_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public ByteString getKotlinVersionBytes() {
                Object obj = this.kotlinVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.kotlinVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.InitRequest.AndroidPlatformDataOrBuilder
            public int getMinApiLevel() {
                return this.minApiLevel_;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable.d(AndroidPlatformData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeContentProviderStartupMetrics(int i10) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setContentProviderStartupMetrics(int i10, ContentProviderStartupMetrics contentProviderStartupMetrics) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    contentProviderStartupMetrics.getClass();
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.set(i10, contentProviderStartupMetrics);
                    onChanged();
                } else {
                    z1Var.w(i10, contentProviderStartupMetrics);
                }
                return this;
            }

            public Builder setKotlinVersion(String str) {
                str.getClass();
                this.kotlinVersion_ = str;
                onChanged();
                return this;
            }

            public Builder setKotlinVersionBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.kotlinVersion_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMinApiLevel(int i10) {
                this.minApiLevel_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.kotlinVersion_ = "";
                this.contentProviderStartupMetrics_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AndroidPlatformData build() {
                AndroidPlatformData androidPlatformDataBuildPartial = buildPartial();
                if (androidPlatformDataBuildPartial.isInitialized()) {
                    return androidPlatformDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) androidPlatformDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AndroidPlatformData buildPartial() {
                AndroidPlatformData androidPlatformData = new AndroidPlatformData(this);
                androidPlatformData.minApiLevel_ = this.minApiLevel_;
                androidPlatformData.kotlinVersion_ = this.kotlinVersion_;
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var != null) {
                    androidPlatformData.contentProviderStartupMetrics_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.contentProviderStartupMetrics_ = Collections.unmodifiableList(this.contentProviderStartupMetrics_);
                        this.bitField0_ &= -2;
                    }
                    androidPlatformData.contentProviderStartupMetrics_ = this.contentProviderStartupMetrics_;
                }
                onBuilt();
                return androidPlatformData;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public AndroidPlatformData mo164getDefaultInstanceForType() {
                return AndroidPlatformData.getDefaultInstance();
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

            public ContentProviderStartupMetrics.Builder addContentProviderStartupMetricsBuilder(int i10) {
                return (ContentProviderStartupMetrics.Builder) getContentProviderStartupMetricsFieldBuilder().b(i10, ContentProviderStartupMetrics.getDefaultInstance());
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
                this.minApiLevel_ = 0;
                this.kotlinVersion_ = "";
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    this.contentProviderStartupMetrics_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.kotlinVersion_ = "";
                this.contentProviderStartupMetrics_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addContentProviderStartupMetrics(int i10, ContentProviderStartupMetrics contentProviderStartupMetrics) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    contentProviderStartupMetrics.getClass();
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(i10, contentProviderStartupMetrics);
                    onChanged();
                } else {
                    z1Var.d(i10, contentProviderStartupMetrics);
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
                if (message instanceof AndroidPlatformData) {
                    return mergeFrom((AndroidPlatformData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setContentProviderStartupMetrics(int i10, ContentProviderStartupMetrics.Builder builder) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(AndroidPlatformData androidPlatformData) {
                if (androidPlatformData == AndroidPlatformData.getDefaultInstance()) {
                    return this;
                }
                if (androidPlatformData.getMinApiLevel() != 0) {
                    setMinApiLevel(androidPlatformData.getMinApiLevel());
                }
                if (!androidPlatformData.getKotlinVersion().isEmpty()) {
                    this.kotlinVersion_ = androidPlatformData.kotlinVersion_;
                    onChanged();
                }
                if (this.contentProviderStartupMetricsBuilder_ == null) {
                    if (!androidPlatformData.contentProviderStartupMetrics_.isEmpty()) {
                        if (this.contentProviderStartupMetrics_.isEmpty()) {
                            this.contentProviderStartupMetrics_ = androidPlatformData.contentProviderStartupMetrics_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureContentProviderStartupMetricsIsMutable();
                            this.contentProviderStartupMetrics_.addAll(androidPlatformData.contentProviderStartupMetrics_);
                        }
                        onChanged();
                    }
                } else if (!androidPlatformData.contentProviderStartupMetrics_.isEmpty()) {
                    if (!this.contentProviderStartupMetricsBuilder_.t()) {
                        this.contentProviderStartupMetricsBuilder_.a(androidPlatformData.contentProviderStartupMetrics_);
                    } else {
                        this.contentProviderStartupMetricsBuilder_.h();
                        this.contentProviderStartupMetricsBuilder_ = null;
                        this.contentProviderStartupMetrics_ = androidPlatformData.contentProviderStartupMetrics_;
                        this.bitField0_ &= -2;
                        this.contentProviderStartupMetricsBuilder_ = j0.alwaysUseFieldBuilders ? getContentProviderStartupMetricsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) androidPlatformData).unknownFields);
                onChanged();
                return this;
            }

            public Builder addContentProviderStartupMetrics(ContentProviderStartupMetrics.Builder builder) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addContentProviderStartupMetrics(int i10, ContentProviderStartupMetrics.Builder builder) {
                z1<ContentProviderStartupMetrics, ContentProviderStartupMetrics.Builder, ContentProviderStartupMetricsOrBuilder> z1Var = this.contentProviderStartupMetricsBuilder_;
                if (z1Var == null) {
                    ensureContentProviderStartupMetricsIsMutable();
                    this.contentProviderStartupMetrics_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                AndroidPlatformData androidPlatformData = null;
                try {
                    try {
                        AndroidPlatformData androidPlatformData2 = (AndroidPlatformData) AndroidPlatformData.PARSER.parsePartialFrom(nVar, yVar);
                        if (androidPlatformData2 != null) {
                            mergeFrom(androidPlatformData2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        AndroidPlatformData androidPlatformData3 = (AndroidPlatformData) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            androidPlatformData = androidPlatformData3;
                            if (androidPlatformData != null) {
                                mergeFrom(androidPlatformData);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (androidPlatformData != null) {
                        mergeFrom(androidPlatformData);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(AndroidPlatformData androidPlatformData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(androidPlatformData);
        }

        public static AndroidPlatformData parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private AndroidPlatformData(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AndroidPlatformData parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (AndroidPlatformData) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static AndroidPlatformData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public AndroidPlatformData mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AndroidPlatformData parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AndroidPlatformData() {
            this.memoizedIsInitialized = (byte) -1;
            this.kotlinVersion_ = "";
            this.contentProviderStartupMetrics_ = Collections.emptyList();
        }

        public static AndroidPlatformData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static AndroidPlatformData parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static AndroidPlatformData parseFrom(InputStream inputStream) throws IOException {
            return (AndroidPlatformData) j0.parseWithIOException(PARSER, inputStream);
        }

        private AndroidPlatformData(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                if (iK == 8) {
                                    this.minApiLevel_ = nVar.L();
                                } else if (iK == 18) {
                                    this.kotlinVersion_ = nVar.J();
                                } else if (iK != 26) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    if (!(z11 & true)) {
                                        this.contentProviderStartupMetrics_ = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.contentProviderStartupMetrics_.add((ContentProviderStartupMetrics) nVar.A(ContentProviderStartupMetrics.parser(), yVar));
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
                        this.contentProviderStartupMetrics_ = Collections.unmodifiableList(this.contentProviderStartupMetrics_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.contentProviderStartupMetrics_ = Collections.unmodifiableList(this.contentProviderStartupMetrics_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static AndroidPlatformData parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (AndroidPlatformData) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static AndroidPlatformData parseFrom(n nVar) throws IOException {
            return (AndroidPlatformData) j0.parseWithIOException(PARSER, nVar);
        }

        public static AndroidPlatformData parseFrom(n nVar, y yVar) throws IOException {
            return (AndroidPlatformData) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface AndroidPlatformDataOrBuilder extends MessageOrBuilder {
        AndroidPlatformData.ContentProviderStartupMetrics getContentProviderStartupMetrics(int i10);

        int getContentProviderStartupMetricsCount();

        List<AndroidPlatformData.ContentProviderStartupMetrics> getContentProviderStartupMetricsList();

        AndroidPlatformData.ContentProviderStartupMetricsOrBuilder getContentProviderStartupMetricsOrBuilder(int i10);

        List<? extends AndroidPlatformData.ContentProviderStartupMetricsOrBuilder> getContentProviderStartupMetricsOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        String getKotlinVersion();

        ByteString getKotlinVersionBytes();

        int getMinApiLevel();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum PlatformDataCase implements l0.c {
        ANDROID(20),
        IOS(21),
        PLATFORMDATA_NOT_SET(0);

        private final int value;

        PlatformDataCase(int i10) {
            this.value = i10;
        }

        public static PlatformDataCase forNumber(int i10) {
            if (i10 == 0) {
                return PLATFORMDATA_NOT_SET;
            }
            if (i10 == 20) {
                return ANDROID;
            }
            if (i10 != 21) {
                return null;
            }
            return IOS;
        }

        @Override // com.explorestack.protobuf.l0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlatformDataCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class iOSPlatformData extends j0 implements iOSPlatformDataOrBuilder {
        public static final int MIN_OS_VERSION_FIELD_NUMBER = 1;
        public static final int OS_EXECUTION_ENV_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private StringValue minOsVersion_;
        private int osExecutionEnv_;
        private static final iOSPlatformData DEFAULT_INSTANCE = new iOSPlatformData();
        private static final s1<iOSPlatformData> PARSER = new b<iOSPlatformData>() { // from class: io.bidmachine.protobuf.InitRequest.iOSPlatformData.1
            @Override // com.explorestack.protobuf.s1
            public iOSPlatformData parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new iOSPlatformData(nVar, yVar);
            }
        };

        public static iOSPlatformData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static iOSPlatformData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (iOSPlatformData) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static iOSPlatformData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<iOSPlatformData> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iOSPlatformData)) {
                return super.equals(obj);
            }
            iOSPlatformData iosplatformdata = (iOSPlatformData) obj;
            if (hasMinOsVersion() != iosplatformdata.hasMinOsVersion()) {
                return false;
            }
            return (!hasMinOsVersion() || getMinOsVersion().equals(iosplatformdata.getMinOsVersion())) && this.osExecutionEnv_ == iosplatformdata.osExecutionEnv_ && this.unknownFields.equals(iosplatformdata.unknownFields);
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public StringValue getMinOsVersion() {
            StringValue stringValue = this.minOsVersion_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public h2 getMinOsVersionOrBuilder() {
            return getMinOsVersion();
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public OSExecutionEnvironment getOsExecutionEnv() {
            OSExecutionEnvironment oSExecutionEnvironmentValueOf = OSExecutionEnvironment.valueOf(this.osExecutionEnv_);
            return oSExecutionEnvironmentValueOf == null ? OSExecutionEnvironment.UNRECOGNIZED : oSExecutionEnvironmentValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public int getOsExecutionEnvValue() {
            return this.osExecutionEnv_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<iOSPlatformData> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.minOsVersion_ != null ? 0 + CodedOutputStream.G(1, getMinOsVersion()) : 0;
            if (this.osExecutionEnv_ != OSExecutionEnvironment.OS_EXECUTION_ENVIRONMENT_UNKNOWN.getNumber()) {
                iG += CodedOutputStream.l(2, this.osExecutionEnv_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
        public boolean hasMinOsVersion() {
            return this.minOsVersion_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMinOsVersion()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMinOsVersion().hashCode();
            }
            int iHashCode2 = (((((iHashCode * 37) + 2) * 53) + this.osExecutionEnv_) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable.d(iOSPlatformData.class, Builder.class);
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
            return new iOSPlatformData();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.minOsVersion_ != null) {
                codedOutputStream.L0(1, getMinOsVersion());
            }
            if (this.osExecutionEnv_ != OSExecutionEnvironment.OS_EXECUTION_ENVIRONMENT_UNKNOWN.getNumber()) {
                codedOutputStream.v0(2, this.osExecutionEnv_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements iOSPlatformDataOrBuilder {
            private e2<StringValue, StringValue.Builder, h2> minOsVersionBuilder_;
            private StringValue minOsVersion_;
            private int osExecutionEnv_;

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
            }

            private e2<StringValue, StringValue.Builder, h2> getMinOsVersionFieldBuilder() {
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersionBuilder_ = new e2<>(getMinOsVersion(), getParentForChildren(), isClean());
                    this.minOsVersion_ = null;
                }
                return this.minOsVersionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearMinOsVersion() {
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersion_ = null;
                    onChanged();
                } else {
                    this.minOsVersion_ = null;
                    this.minOsVersionBuilder_ = null;
                }
                return this;
            }

            public Builder clearOsExecutionEnv() {
                this.osExecutionEnv_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public StringValue getMinOsVersion() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.minOsVersionBuilder_;
                if (e2Var != null) {
                    return (StringValue) e2Var.e();
                }
                StringValue stringValue = this.minOsVersion_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            public StringValue.Builder getMinOsVersionBuilder() {
                onChanged();
                return (StringValue.Builder) getMinOsVersionFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public h2 getMinOsVersionOrBuilder() {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.minOsVersionBuilder_;
                if (e2Var != null) {
                    return (h2) e2Var.f();
                }
                StringValue stringValue = this.minOsVersion_;
                return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public OSExecutionEnvironment getOsExecutionEnv() {
                OSExecutionEnvironment oSExecutionEnvironmentValueOf = OSExecutionEnvironment.valueOf(this.osExecutionEnv_);
                return oSExecutionEnvironmentValueOf == null ? OSExecutionEnvironment.UNRECOGNIZED : oSExecutionEnvironmentValueOf;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public int getOsExecutionEnvValue() {
                return this.osExecutionEnv_;
            }

            @Override // io.bidmachine.protobuf.InitRequest.iOSPlatformDataOrBuilder
            public boolean hasMinOsVersion() {
                return (this.minOsVersionBuilder_ == null && this.minOsVersion_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable.d(iOSPlatformData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMinOsVersion(StringValue stringValue) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.minOsVersionBuilder_;
                if (e2Var == null) {
                    StringValue stringValue2 = this.minOsVersion_;
                    if (stringValue2 != null) {
                        this.minOsVersion_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                    } else {
                        this.minOsVersion_ = stringValue;
                    }
                    onChanged();
                } else {
                    e2Var.g(stringValue);
                }
                return this;
            }

            public Builder setMinOsVersion(StringValue stringValue) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.minOsVersionBuilder_;
                if (e2Var == null) {
                    stringValue.getClass();
                    this.minOsVersion_ = stringValue;
                    onChanged();
                } else {
                    e2Var.i(stringValue);
                }
                return this;
            }

            public Builder setOsExecutionEnv(OSExecutionEnvironment oSExecutionEnvironment) {
                oSExecutionEnvironment.getClass();
                this.osExecutionEnv_ = oSExecutionEnvironment.getNumber();
                onChanged();
                return this;
            }

            public Builder setOsExecutionEnvValue(int i10) {
                this.osExecutionEnv_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.osExecutionEnv_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public iOSPlatformData build() {
                iOSPlatformData iosplatformdataBuildPartial = buildPartial();
                if (iosplatformdataBuildPartial.isInitialized()) {
                    return iosplatformdataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iosplatformdataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public iOSPlatformData buildPartial() {
                iOSPlatformData iosplatformdata = new iOSPlatformData(this);
                e2<StringValue, StringValue.Builder, h2> e2Var = this.minOsVersionBuilder_;
                if (e2Var == null) {
                    iosplatformdata.minOsVersion_ = this.minOsVersion_;
                } else {
                    iosplatformdata.minOsVersion_ = (StringValue) e2Var.a();
                }
                iosplatformdata.osExecutionEnv_ = this.osExecutionEnv_;
                onBuilt();
                return iosplatformdata;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public iOSPlatformData mo164getDefaultInstanceForType() {
                return iOSPlatformData.getDefaultInstance();
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
                if (this.minOsVersionBuilder_ == null) {
                    this.minOsVersion_ = null;
                } else {
                    this.minOsVersion_ = null;
                    this.minOsVersionBuilder_ = null;
                }
                this.osExecutionEnv_ = 0;
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.osExecutionEnv_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setMinOsVersion(StringValue.Builder builder) {
                e2<StringValue, StringValue.Builder, h2> e2Var = this.minOsVersionBuilder_;
                if (e2Var == null) {
                    this.minOsVersion_ = builder.build();
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
                if (message instanceof iOSPlatformData) {
                    return mergeFrom((iOSPlatformData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(iOSPlatformData iosplatformdata) {
                if (iosplatformdata == iOSPlatformData.getDefaultInstance()) {
                    return this;
                }
                if (iosplatformdata.hasMinOsVersion()) {
                    mergeMinOsVersion(iosplatformdata.getMinOsVersion());
                }
                if (iosplatformdata.osExecutionEnv_ != 0) {
                    setOsExecutionEnvValue(iosplatformdata.getOsExecutionEnvValue());
                }
                mergeUnknownFields(((j0) iosplatformdata).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                iOSPlatformData iosplatformdata = null;
                try {
                    try {
                        iOSPlatformData iosplatformdata2 = (iOSPlatformData) iOSPlatformData.PARSER.parsePartialFrom(nVar, yVar);
                        if (iosplatformdata2 != null) {
                            mergeFrom(iosplatformdata2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        iOSPlatformData iosplatformdata3 = (iOSPlatformData) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            iosplatformdata = iosplatformdata3;
                            if (iosplatformdata != null) {
                                mergeFrom(iosplatformdata);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (iosplatformdata != null) {
                        mergeFrom(iosplatformdata);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(iOSPlatformData iosplatformdata) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iosplatformdata);
        }

        public static iOSPlatformData parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private iOSPlatformData(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static iOSPlatformData parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (iOSPlatformData) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static iOSPlatformData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public iOSPlatformData mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static iOSPlatformData parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private iOSPlatformData() {
            this.memoizedIsInitialized = (byte) -1;
            this.osExecutionEnv_ = 0;
        }

        public static iOSPlatformData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static iOSPlatformData parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static iOSPlatformData parseFrom(InputStream inputStream) throws IOException {
            return (iOSPlatformData) j0.parseWithIOException(PARSER, inputStream);
        }

        private iOSPlatformData(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                StringValue stringValue = this.minOsVersion_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                                this.minOsVersion_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.minOsVersion_ = builder.buildPartial();
                                }
                            } else if (iK != 16) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                this.osExecutionEnv_ = nVar.t();
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

        public static iOSPlatformData parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (iOSPlatformData) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static iOSPlatformData parseFrom(n nVar) throws IOException {
            return (iOSPlatformData) j0.parseWithIOException(PARSER, nVar);
        }

        public static iOSPlatformData parseFrom(n nVar, y yVar) throws IOException {
            return (iOSPlatformData) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface iOSPlatformDataOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        StringValue getMinOsVersion();

        h2 getMinOsVersionOrBuilder();

        OSExecutionEnvironment getOsExecutionEnv();

        int getOsExecutionEnvValue();

        boolean hasMinOsVersion();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static InitRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitRequest) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<InitRequest> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitRequest)) {
            return super.equals(obj);
        }
        InitRequest initRequest = (InitRequest) obj;
        if (!getSellerId().equals(initRequest.getSellerId()) || !getBundle().equals(initRequest.getBundle()) || this.os_ != initRequest.os_ || !getOsv().equals(initRequest.getOsv()) || hasGeo() != initRequest.hasGeo()) {
            return false;
        }
        if ((hasGeo() && !getGeo().equals(initRequest.getGeo())) || !getSdk().equals(initRequest.getSdk()) || !getSdkver().equals(initRequest.getSdkver()) || !getIfa().equals(initRequest.getIfa()) || !getIfv().equals(initRequest.getIfv()) || !getBmIfv().equals(initRequest.getBmIfv()) || this.deviceType_ != initRequest.deviceType_ || this.contype_ != initRequest.contype_ || !getAppVer().equals(initRequest.getAppVer()) || !getSessionId().equals(initRequest.getSessionId()) || hasExt() != initRequest.hasExt()) {
            return false;
        }
        if ((hasExt() && !getExt().equals(initRequest.getExt())) || !getMake().equals(initRequest.getMake()) || !getModel().equals(initRequest.getModel()) || !getHwv().equals(initRequest.getHwv()) || hasContext() != initRequest.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(initRequest.getContext())) || !getPlatformDataCase().equals(initRequest.getPlatformDataCase())) {
            return false;
        }
        int i10 = this.platformDataCase_;
        if (i10 != 20) {
            if (i10 == 21 && !getIos().equals(initRequest.getIos())) {
                return false;
            }
        } else if (!getAndroid().equals(initRequest.getAndroid())) {
            return false;
        }
        return this.unknownFields.equals(initRequest.unknownFields);
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public AndroidPlatformData getAndroid() {
        return this.platformDataCase_ == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public AndroidPlatformDataOrBuilder getAndroidOrBuilder() {
        return this.platformDataCase_ == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bundle_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public c getContextOrBuilder() {
        return getContext();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ConnectionType getContype() {
        ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
        return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getContypeValue() {
        return this.contype_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public DeviceType getDeviceType() {
        DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
        return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public i2 getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context.Geo getGeo() {
        Context.Geo geo = this.geo_;
        return geo == null ? Context.Geo.getDefaultInstance() : geo;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public Context.GeoOrBuilder getGeoOrBuilder() {
        return getGeo();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getHwv() {
        Object obj = this.hwv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.hwv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getHwvBytes() {
        Object obj = this.hwv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.hwv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getIfa() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getIfaBytes() {
        Object obj = this.ifa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifa_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public iOSPlatformData getIos() {
        return this.platformDataCase_ == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public iOSPlatformDataOrBuilder getIosOrBuilder() {
        return this.platformDataCase_ == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getMake() {
        Object obj = this.make_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.make_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getMakeBytes() {
        Object obj = this.make_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.make_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.model_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public OS getOs() {
        OS osValueOf = OS.valueOf(this.os_);
        return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public int getOsValue() {
        return this.os_;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getOsv() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getOsvBytes() {
        Object obj = this.osv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<InitRequest> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public PlatformDataCase getPlatformDataCase() {
        return PlatformDataCase.forNumber(this.platformDataCase_);
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSellerId() {
        Object obj = this.sellerId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sellerId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public ByteString getSellerIdBytes() {
        Object obj = this.sellerId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sellerId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getSellerIdBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.sellerId_);
        if (!getBundleBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(4, this.osv_);
        }
        if (this.geo_ != null) {
            iComputeStringSize += CodedOutputStream.G(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(14, this.sessionId_);
        }
        if (this.ext_ != null) {
            iComputeStringSize += CodedOutputStream.G(15, getExt());
        }
        if (!getMakeBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(16, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(17, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(18, this.hwv_);
        }
        if (this.context_ != null) {
            iComputeStringSize += CodedOutputStream.G(19, getContext());
        }
        if (this.platformDataCase_ == 20) {
            iComputeStringSize += CodedOutputStream.G(20, (AndroidPlatformData) this.platformData_);
        }
        if (this.platformDataCase_ == 21) {
            iComputeStringSize += CodedOutputStream.G(21, (iOSPlatformData) this.platformData_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
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

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasAndroid() {
        return this.platformDataCase_ == 20;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasGeo() {
        return this.geo_ != null;
    }

    @Override // io.bidmachine.protobuf.InitRequestOrBuilder
    public boolean hasIos() {
        return this.platformDataCase_ == 21;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSellerId().hashCode()) * 37) + 2) * 53) + getBundle().hashCode()) * 37) + 3) * 53) + this.os_) * 37) + 4) * 53) + getOsv().hashCode();
        if (hasGeo()) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getGeo().hashCode();
        }
        int iHashCode3 = (((((((((((((((((((((((((((((((((((iHashCode2 * 37) + 6) * 53) + getSdk().hashCode()) * 37) + 7) * 53) + getSdkver().hashCode()) * 37) + 8) * 53) + getIfa().hashCode()) * 37) + 11) * 53) + getIfv().hashCode()) * 37) + 12) * 53) + getBmIfv().hashCode()) * 37) + 9) * 53) + this.deviceType_) * 37) + 10) * 53) + this.contype_) * 37) + 13) * 53) + getAppVer().hashCode()) * 37) + 14) * 53) + getSessionId().hashCode();
        if (hasExt()) {
            iHashCode3 = (((iHashCode3 * 37) + 15) * 53) + getExt().hashCode();
        }
        int iHashCode4 = (((((((((((iHashCode3 * 37) + 16) * 53) + getMake().hashCode()) * 37) + 17) * 53) + getModel().hashCode()) * 37) + 18) * 53) + getHwv().hashCode();
        if (hasContext()) {
            iHashCode4 = (((iHashCode4 * 37) + 19) * 53) + getContext().hashCode();
        }
        int i12 = this.platformDataCase_;
        if (i12 != 20) {
            if (i12 == 21) {
                i10 = ((iHashCode4 * 37) + 21) * 53;
                iHashCode = getIos().hashCode();
            }
            int iHashCode5 = (iHashCode4 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode5;
            return iHashCode5;
        }
        i10 = ((iHashCode4 * 37) + 20) * 53;
        iHashCode = getAndroid().hashCode();
        iHashCode4 = i10 + iHashCode;
        int iHashCode6 = (iHashCode4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.d(InitRequest.class, Builder.class);
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
        return new InitRequest();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getSellerIdBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.sellerId_);
        }
        if (!getBundleBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            codedOutputStream.v0(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 4, this.osv_);
        }
        if (this.geo_ != null) {
            codedOutputStream.L0(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            codedOutputStream.v0(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            codedOutputStream.v0(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 14, this.sessionId_);
        }
        if (this.ext_ != null) {
            codedOutputStream.L0(15, getExt());
        }
        if (!getMakeBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 16, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 17, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 18, this.hwv_);
        }
        if (this.context_ != null) {
            codedOutputStream.L0(19, getContext());
        }
        if (this.platformDataCase_ == 20) {
            codedOutputStream.L0(20, (AndroidPlatformData) this.platformData_);
        }
        if (this.platformDataCase_ == 21) {
            codedOutputStream.L0(21, (iOSPlatformData) this.platformData_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements InitRequestOrBuilder {
        private e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> androidBuilder_;
        private Object appVer_;
        private Object bmIfv_;
        private Object bundle_;
        private e2<Context, Context.Builder, c> contextBuilder_;
        private Context context_;
        private int contype_;
        private int deviceType_;
        private e2<Struct, Struct.Builder, i2> extBuilder_;
        private Struct ext_;
        private e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> geoBuilder_;
        private Context.Geo geo_;
        private Object hwv_;
        private Object ifa_;
        private Object ifv_;
        private e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> iosBuilder_;
        private Object make_;
        private Object model_;
        private int os_;
        private Object osv_;
        private int platformDataCase_;
        private Object platformData_;
        private Object sdk_;
        private Object sdkver_;
        private Object sellerId_;
        private Object sessionId_;

        private e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> getAndroidFieldBuilder() {
            if (this.androidBuilder_ == null) {
                if (this.platformDataCase_ != 20) {
                    this.platformData_ = AndroidPlatformData.getDefaultInstance();
                }
                this.androidBuilder_ = new e2<>((AndroidPlatformData) this.platformData_, getParentForChildren(), isClean());
                this.platformData_ = null;
            }
            this.platformDataCase_ = 20;
            onChanged();
            return this.androidBuilder_;
        }

        private e2<Context, Context.Builder, c> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new e2<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> getGeoFieldBuilder() {
            if (this.geoBuilder_ == null) {
                this.geoBuilder_ = new e2<>(getGeo(), getParentForChildren(), isClean());
                this.geo_ = null;
            }
            return this.geoBuilder_;
        }

        private e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> getIosFieldBuilder() {
            if (this.iosBuilder_ == null) {
                if (this.platformDataCase_ != 21) {
                    this.platformData_ = iOSPlatformData.getDefaultInstance();
                }
                this.iosBuilder_ = new e2<>((iOSPlatformData) this.platformData_, getParentForChildren(), isClean());
                this.platformData_ = null;
            }
            this.platformDataCase_ = 21;
            onChanged();
            return this.iosBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearAndroid() {
            e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var = this.androidBuilder_;
            if (e2Var != null) {
                if (this.platformDataCase_ == 20) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                }
                e2Var.b();
            } else if (this.platformDataCase_ == 20) {
                this.platformDataCase_ = 0;
                this.platformData_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = InitRequest.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = InitRequest.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = InitRequest.getDefaultInstance().getBundle();
            onChanged();
            return this;
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

        public Builder clearContype() {
            this.contype_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDeviceType() {
            this.deviceType_ = 0;
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

        public Builder clearGeo() {
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
                onChanged();
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            return this;
        }

        public Builder clearHwv() {
            this.hwv_ = InitRequest.getDefaultInstance().getHwv();
            onChanged();
            return this;
        }

        public Builder clearIfa() {
            this.ifa_ = InitRequest.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = InitRequest.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearIos() {
            e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var = this.iosBuilder_;
            if (e2Var != null) {
                if (this.platformDataCase_ == 21) {
                    this.platformDataCase_ = 0;
                    this.platformData_ = null;
                }
                e2Var.b();
            } else if (this.platformDataCase_ == 21) {
                this.platformDataCase_ = 0;
                this.platformData_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearMake() {
            this.make_ = InitRequest.getDefaultInstance().getMake();
            onChanged();
            return this;
        }

        public Builder clearModel() {
            this.model_ = InitRequest.getDefaultInstance().getModel();
            onChanged();
            return this;
        }

        public Builder clearOs() {
            this.os_ = 0;
            onChanged();
            return this;
        }

        public Builder clearOsv() {
            this.osv_ = InitRequest.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder clearPlatformData() {
            this.platformDataCase_ = 0;
            this.platformData_ = null;
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = InitRequest.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = InitRequest.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSellerId() {
            this.sellerId_ = InitRequest.getDefaultInstance().getSellerId();
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = InitRequest.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public AndroidPlatformData getAndroid() {
            e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var = this.androidBuilder_;
            if (e2Var == null) {
                return this.platformDataCase_ == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance();
            }
            return this.platformDataCase_ == 20 ? (AndroidPlatformData) e2Var.e() : AndroidPlatformData.getDefaultInstance();
        }

        public AndroidPlatformData.Builder getAndroidBuilder() {
            return (AndroidPlatformData.Builder) getAndroidFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public AndroidPlatformDataOrBuilder getAndroidOrBuilder() {
            e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var;
            int i10 = this.platformDataCase_;
            if (i10 != 20 || (e2Var = this.androidBuilder_) == null) {
                return i10 == 20 ? (AndroidPlatformData) this.platformData_ : AndroidPlatformData.getDefaultInstance();
            }
            return (AndroidPlatformDataOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context getContext() {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
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

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public c getContextOrBuilder() {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var != null) {
                return (c) e2Var.f();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_descriptor;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
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

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public i2 getExtOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context.Geo getGeo() {
            e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> e2Var = this.geoBuilder_;
            if (e2Var != null) {
                return (Context.Geo) e2Var.e();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        public Context.Geo.Builder getGeoBuilder() {
            onChanged();
            return (Context.Geo.Builder) getGeoFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public Context.GeoOrBuilder getGeoOrBuilder() {
            e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> e2Var = this.geoBuilder_;
            if (e2Var != null) {
                return (Context.GeoOrBuilder) e2Var.f();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public iOSPlatformData getIos() {
            e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var = this.iosBuilder_;
            if (e2Var == null) {
                return this.platformDataCase_ == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance();
            }
            return this.platformDataCase_ == 21 ? (iOSPlatformData) e2Var.e() : iOSPlatformData.getDefaultInstance();
        }

        public iOSPlatformData.Builder getIosBuilder() {
            return (iOSPlatformData.Builder) getIosFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public iOSPlatformDataOrBuilder getIosOrBuilder() {
            e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var;
            int i10 = this.platformDataCase_;
            if (i10 != 21 || (e2Var = this.iosBuilder_) == null) {
                return i10 == 21 ? (iOSPlatformData) this.platformData_ : iOSPlatformData.getDefaultInstance();
            }
            return (iOSPlatformDataOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public PlatformDataCase getPlatformDataCase() {
            return PlatformDataCase.forNumber(this.platformDataCase_);
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSellerId() {
            Object obj = this.sellerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sellerId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSellerIdBytes() {
            Object obj = this.sellerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sellerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasAndroid() {
            return this.platformDataCase_ == 20;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasGeo() {
            return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitRequestOrBuilder
        public boolean hasIos() {
            return this.platformDataCase_ == 21;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable.d(InitRequest.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAndroid(AndroidPlatformData androidPlatformData) {
            e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var = this.androidBuilder_;
            if (e2Var == null) {
                if (this.platformDataCase_ != 20 || this.platformData_ == AndroidPlatformData.getDefaultInstance()) {
                    this.platformData_ = androidPlatformData;
                } else {
                    this.platformData_ = AndroidPlatformData.newBuilder((AndroidPlatformData) this.platformData_).mergeFrom(androidPlatformData).buildPartial();
                }
                onChanged();
            } else {
                if (this.platformDataCase_ == 20) {
                    e2Var.g(androidPlatformData);
                }
                this.androidBuilder_.i(androidPlatformData);
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder mergeContext(Context context) {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
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

        public Builder mergeGeo(Context.Geo geo) {
            e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> e2Var = this.geoBuilder_;
            if (e2Var == null) {
                Context.Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Context.Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                onChanged();
            } else {
                e2Var.g(geo);
            }
            return this;
        }

        public Builder mergeIos(iOSPlatformData iosplatformdata) {
            e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var = this.iosBuilder_;
            if (e2Var == null) {
                if (this.platformDataCase_ != 21 || this.platformData_ == iOSPlatformData.getDefaultInstance()) {
                    this.platformData_ = iosplatformdata;
                } else {
                    this.platformData_ = iOSPlatformData.newBuilder((iOSPlatformData) this.platformData_).mergeFrom(iosplatformdata).buildPartial();
                }
                onChanged();
            } else {
                if (this.platformDataCase_ == 21) {
                    e2Var.g(iosplatformdata);
                }
                this.iosBuilder_.i(iosplatformdata);
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder setAndroid(AndroidPlatformData androidPlatformData) {
            e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var = this.androidBuilder_;
            if (e2Var == null) {
                androidPlatformData.getClass();
                this.platformData_ = androidPlatformData;
                onChanged();
            } else {
                e2Var.i(androidPlatformData);
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setBundle(String str) {
            str.getClass();
            this.bundle_ = str;
            onChanged();
            return this;
        }

        public Builder setBundleBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.bundle_ = byteString;
            onChanged();
            return this;
        }

        public Builder setContext(Context context) {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                context.getClass();
                this.context_ = context;
                onChanged();
            } else {
                e2Var.i(context);
            }
            return this;
        }

        public Builder setContype(ConnectionType connectionType) {
            connectionType.getClass();
            this.contype_ = connectionType.getNumber();
            onChanged();
            return this;
        }

        public Builder setContypeValue(int i10) {
            this.contype_ = i10;
            onChanged();
            return this;
        }

        public Builder setDeviceType(DeviceType deviceType) {
            deviceType.getClass();
            this.deviceType_ = deviceType.getNumber();
            onChanged();
            return this;
        }

        public Builder setDeviceTypeValue(int i10) {
            this.deviceType_ = i10;
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

        public Builder setGeo(Context.Geo geo) {
            e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> e2Var = this.geoBuilder_;
            if (e2Var == null) {
                geo.getClass();
                this.geo_ = geo;
                onChanged();
            } else {
                e2Var.i(geo);
            }
            return this;
        }

        public Builder setHwv(String str) {
            str.getClass();
            this.hwv_ = str;
            onChanged();
            return this;
        }

        public Builder setHwvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.hwv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfa(String str) {
            str.getClass();
            this.ifa_ = str;
            onChanged();
            return this;
        }

        public Builder setIfaBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifa_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIos(iOSPlatformData iosplatformdata) {
            e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var = this.iosBuilder_;
            if (e2Var == null) {
                iosplatformdata.getClass();
                this.platformData_ = iosplatformdata;
                onChanged();
            } else {
                e2Var.i(iosplatformdata);
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder setMake(String str) {
            str.getClass();
            this.make_ = str;
            onChanged();
            return this;
        }

        public Builder setMakeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.make_ = byteString;
            onChanged();
            return this;
        }

        public Builder setModel(String str) {
            str.getClass();
            this.model_ = str;
            onChanged();
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.model_ = byteString;
            onChanged();
            return this;
        }

        public Builder setOs(OS os) {
            os.getClass();
            this.os_ = os.getNumber();
            onChanged();
            return this;
        }

        public Builder setOsValue(int i10) {
            this.os_ = i10;
            onChanged();
            return this;
        }

        public Builder setOsv(String str) {
            str.getClass();
            this.osv_ = str;
            onChanged();
            return this;
        }

        public Builder setOsvBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.osv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSellerId(String str) {
            str.getClass();
            this.sellerId_ = str;
            onChanged();
            return this;
        }

        public Builder setSellerIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.sellerId_ = byteString;
            onChanged();
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
            this.platformDataCase_ = 0;
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequest build() {
            InitRequest initRequestBuildPartial = buildPartial();
            if (initRequestBuildPartial.isInitialized()) {
                return initRequestBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initRequestBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitRequest buildPartial() {
            InitRequest initRequest = new InitRequest(this);
            initRequest.sellerId_ = this.sellerId_;
            initRequest.bundle_ = this.bundle_;
            initRequest.os_ = this.os_;
            initRequest.osv_ = this.osv_;
            e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> e2Var = this.geoBuilder_;
            if (e2Var == null) {
                initRequest.geo_ = this.geo_;
            } else {
                initRequest.geo_ = (Context.Geo) e2Var.a();
            }
            initRequest.sdk_ = this.sdk_;
            initRequest.sdkver_ = this.sdkver_;
            initRequest.ifa_ = this.ifa_;
            initRequest.ifv_ = this.ifv_;
            initRequest.bmIfv_ = this.bmIfv_;
            initRequest.deviceType_ = this.deviceType_;
            initRequest.contype_ = this.contype_;
            initRequest.appVer_ = this.appVer_;
            initRequest.sessionId_ = this.sessionId_;
            e2<Struct, Struct.Builder, i2> e2Var2 = this.extBuilder_;
            if (e2Var2 == null) {
                initRequest.ext_ = this.ext_;
            } else {
                initRequest.ext_ = (Struct) e2Var2.a();
            }
            initRequest.make_ = this.make_;
            initRequest.model_ = this.model_;
            initRequest.hwv_ = this.hwv_;
            e2<Context, Context.Builder, c> e2Var3 = this.contextBuilder_;
            if (e2Var3 == null) {
                initRequest.context_ = this.context_;
            } else {
                initRequest.context_ = (Context) e2Var3.a();
            }
            if (this.platformDataCase_ == 20) {
                e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var4 = this.androidBuilder_;
                if (e2Var4 == null) {
                    initRequest.platformData_ = this.platformData_;
                } else {
                    initRequest.platformData_ = e2Var4.a();
                }
            }
            if (this.platformDataCase_ == 21) {
                e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var5 = this.iosBuilder_;
                if (e2Var5 == null) {
                    initRequest.platformData_ = this.platformData_;
                } else {
                    initRequest.platformData_ = e2Var5.a();
                }
            }
            initRequest.platformDataCase_ = this.platformDataCase_;
            onBuilt();
            return initRequest;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public InitRequest mo164getDefaultInstanceForType() {
            return InitRequest.getDefaultInstance();
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
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            this.platformDataCase_ = 0;
            this.platformData_ = null;
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                this.context_ = builder.build();
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

        public Builder setGeo(Context.Geo.Builder builder) {
            e2<Context.Geo, Context.Geo.Builder, Context.GeoOrBuilder> e2Var = this.geoBuilder_;
            if (e2Var == null) {
                this.geo_ = builder.build();
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
            if (message instanceof InitRequest) {
                return mergeFrom((InitRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAndroid(AndroidPlatformData.Builder builder) {
            e2<AndroidPlatformData, AndroidPlatformData.Builder, AndroidPlatformDataOrBuilder> e2Var = this.androidBuilder_;
            if (e2Var == null) {
                this.platformData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.platformDataCase_ = 20;
            return this;
        }

        public Builder setIos(iOSPlatformData.Builder builder) {
            e2<iOSPlatformData, iOSPlatformData.Builder, iOSPlatformDataOrBuilder> e2Var = this.iosBuilder_;
            if (e2Var == null) {
                this.platformData_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.platformDataCase_ = 21;
            return this;
        }

        public Builder mergeFrom(InitRequest initRequest) {
            if (initRequest == InitRequest.getDefaultInstance()) {
                return this;
            }
            if (!initRequest.getSellerId().isEmpty()) {
                this.sellerId_ = initRequest.sellerId_;
                onChanged();
            }
            if (!initRequest.getBundle().isEmpty()) {
                this.bundle_ = initRequest.bundle_;
                onChanged();
            }
            if (initRequest.os_ != 0) {
                setOsValue(initRequest.getOsValue());
            }
            if (!initRequest.getOsv().isEmpty()) {
                this.osv_ = initRequest.osv_;
                onChanged();
            }
            if (initRequest.hasGeo()) {
                mergeGeo(initRequest.getGeo());
            }
            if (!initRequest.getSdk().isEmpty()) {
                this.sdk_ = initRequest.sdk_;
                onChanged();
            }
            if (!initRequest.getSdkver().isEmpty()) {
                this.sdkver_ = initRequest.sdkver_;
                onChanged();
            }
            if (!initRequest.getIfa().isEmpty()) {
                this.ifa_ = initRequest.ifa_;
                onChanged();
            }
            if (!initRequest.getIfv().isEmpty()) {
                this.ifv_ = initRequest.ifv_;
                onChanged();
            }
            if (!initRequest.getBmIfv().isEmpty()) {
                this.bmIfv_ = initRequest.bmIfv_;
                onChanged();
            }
            if (initRequest.deviceType_ != 0) {
                setDeviceTypeValue(initRequest.getDeviceTypeValue());
            }
            if (initRequest.contype_ != 0) {
                setContypeValue(initRequest.getContypeValue());
            }
            if (!initRequest.getAppVer().isEmpty()) {
                this.appVer_ = initRequest.appVer_;
                onChanged();
            }
            if (!initRequest.getSessionId().isEmpty()) {
                this.sessionId_ = initRequest.sessionId_;
                onChanged();
            }
            if (initRequest.hasExt()) {
                mergeExt(initRequest.getExt());
            }
            if (!initRequest.getMake().isEmpty()) {
                this.make_ = initRequest.make_;
                onChanged();
            }
            if (!initRequest.getModel().isEmpty()) {
                this.model_ = initRequest.model_;
                onChanged();
            }
            if (!initRequest.getHwv().isEmpty()) {
                this.hwv_ = initRequest.hwv_;
                onChanged();
            }
            if (initRequest.hasContext()) {
                mergeContext(initRequest.getContext());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$InitRequest$PlatformDataCase[initRequest.getPlatformDataCase().ordinal()];
            if (i10 == 1) {
                mergeAndroid(initRequest.getAndroid());
            } else if (i10 == 2) {
                mergeIos(initRequest.getIos());
            }
            mergeUnknownFields(((j0) initRequest).unknownFields);
            onChanged();
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.platformDataCase_ = 0;
            this.sellerId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            InitRequest initRequest = null;
            try {
                try {
                    InitRequest initRequest2 = (InitRequest) InitRequest.PARSER.parsePartialFrom(nVar, yVar);
                    if (initRequest2 != null) {
                        mergeFrom(initRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    InitRequest initRequest3 = (InitRequest) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        initRequest = initRequest3;
                        if (initRequest != null) {
                            mergeFrom(initRequest);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (initRequest != null) {
                    mergeFrom(initRequest);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(InitRequest initRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initRequest);
    }

    public static InitRequest parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private InitRequest(j0.b<?> bVar) {
        super(bVar);
        this.platformDataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitRequest parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (InitRequest) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static InitRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public InitRequest mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InitRequest parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static InitRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    private InitRequest() {
        this.platformDataCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.sellerId_ = "";
        this.bundle_ = "";
        this.os_ = 0;
        this.osv_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.ifa_ = "";
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.deviceType_ = 0;
        this.contype_ = 0;
        this.appVer_ = "";
        this.sessionId_ = "";
        this.make_ = "";
        this.model_ = "";
        this.hwv_ = "";
    }

    public static InitRequest parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static InitRequest parseFrom(InputStream inputStream) throws IOException {
        return (InitRequest) j0.parseWithIOException(PARSER, inputStream);
    }

    public static InitRequest parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (InitRequest) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static InitRequest parseFrom(n nVar) throws IOException {
        return (InitRequest) j0.parseWithIOException(PARSER, nVar);
    }

    public static InitRequest parseFrom(n nVar, y yVar) throws IOException {
        return (InitRequest) j0.parseWithIOException(PARSER, nVar, yVar);
    }

    private InitRequest(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    switch (iK) {
                        case 0:
                            break;
                        case 10:
                            this.sellerId_ = nVar.J();
                            continue;
                        case 18:
                            this.bundle_ = nVar.J();
                            continue;
                        case 24:
                            this.os_ = nVar.t();
                            continue;
                        case 34:
                            this.osv_ = nVar.J();
                            continue;
                        case 42:
                            Context.Geo geo = this.geo_;
                            Context.Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                            Context.Geo geo2 = (Context.Geo) nVar.A(Context.Geo.parser(), yVar);
                            this.geo_ = geo2;
                            if (builder != null) {
                                builder.mergeFrom(geo2);
                                this.geo_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 50:
                            this.sdk_ = nVar.J();
                            continue;
                        case 58:
                            this.sdkver_ = nVar.J();
                            continue;
                        case 66:
                            this.ifa_ = nVar.J();
                            continue;
                        case 72:
                            this.deviceType_ = nVar.t();
                            continue;
                        case 80:
                            this.contype_ = nVar.t();
                            continue;
                        case 90:
                            this.ifv_ = nVar.J();
                            continue;
                        case 98:
                            this.bmIfv_ = nVar.J();
                            continue;
                        case 106:
                            this.appVer_ = nVar.J();
                            continue;
                        case 114:
                            this.sessionId_ = nVar.J();
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
                        case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                            this.make_ = nVar.J();
                            continue;
                        case CONFIG_REFRESH_FAILED_VALUE:
                            this.model_ = nVar.J();
                            continue;
                        case 146:
                            this.hwv_ = nVar.J();
                            continue;
                        case 154:
                            Context context = this.context_;
                            Context.Builder builder3 = context != null ? context.toBuilder() : null;
                            Context context2 = (Context) nVar.A(Context.parser(), yVar);
                            this.context_ = context2;
                            if (builder3 != null) {
                                builder3.mergeFrom(context2);
                                this.context_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 162:
                            AndroidPlatformData.Builder builder4 = this.platformDataCase_ == 20 ? ((AndroidPlatformData) this.platformData_).toBuilder() : null;
                            MessageLite messageLiteA = nVar.A(AndroidPlatformData.parser(), yVar);
                            this.platformData_ = messageLiteA;
                            if (builder4 != null) {
                                builder4.mergeFrom((AndroidPlatformData) messageLiteA);
                                this.platformData_ = builder4.buildPartial();
                            }
                            this.platformDataCase_ = 20;
                            continue;
                        case 170:
                            iOSPlatformData.Builder builder5 = this.platformDataCase_ == 21 ? ((iOSPlatformData) this.platformData_).toBuilder() : null;
                            MessageLite messageLiteA2 = nVar.A(iOSPlatformData.parser(), yVar);
                            this.platformData_ = messageLiteA2;
                            if (builder5 != null) {
                                builder5.mergeFrom((iOSPlatformData) messageLiteA2);
                                this.platformData_ = builder5.buildPartial();
                            }
                            this.platformDataCase_ = 21;
                            continue;
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
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
