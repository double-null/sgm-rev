package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Event extends j0 implements EventOrBuilder {
    public static final int EXTRAS_PRIVATE_FIELD_NUMBER = 3;
    public static final int MONITOR_FIELD_NUMBER = 1;
    public static final int READER_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private Struct extrasPrivate_;
    private byte memoizedIsInitialized;
    private int payloadCase_;
    private Object payload_;
    private static final Event DEFAULT_INSTANCE = new Event();
    private static final s1<Event> PARSER = new b<Event>() { // from class: io.bidmachine.protobuf.sdk.Event.1
        @Override // com.explorestack.protobuf.s1
        public Event parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Event(nVar, yVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.Event$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase;

        static {
            int[] iArr = new int[PayloadCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase = iArr;
            try {
                iArr[PayloadCase.MONITOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[PayloadCase.READER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[PayloadCase.PAYLOAD_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum PayloadCase implements l0.c {
        MONITOR(1),
        READER(2),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i10) {
            this.value = i10;
        }

        public static PayloadCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i10 == 1) {
                return MONITOR;
            }
            if (i10 != 2) {
                return null;
            }
            return READER;
        }

        @Override // com.explorestack.protobuf.l0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
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

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        if (hasExtrasPrivate() != event.hasExtrasPrivate()) {
            return false;
        }
        if ((hasExtrasPrivate() && !getExtrasPrivate().equals(event.getExtrasPrivate())) || !getPayloadCase().equals(event.getPayloadCase())) {
            return false;
        }
        int i10 = this.payloadCase_;
        if (i10 != 1) {
            if (i10 == 2 && !getReader().equals(event.getReader())) {
                return false;
            }
        } else if (!getMonitor().equals(event.getMonitor())) {
            return false;
        }
        return this.unknownFields.equals(event.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Struct getExtrasPrivate() {
        Struct struct = this.extrasPrivate_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public i2 getExtrasPrivateOrBuilder() {
        return getExtrasPrivate();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Monitor getMonitor() {
        return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public MonitorOrBuilder getMonitorOrBuilder() {
        return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Event> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public Reader getReader() {
        return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public ReaderOrBuilder getReaderOrBuilder() {
        return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.payloadCase_ == 1 ? 0 + CodedOutputStream.G(1, (Monitor) this.payload_) : 0;
        if (this.payloadCase_ == 2) {
            iG += CodedOutputStream.G(2, (Reader) this.payload_);
        }
        if (this.extrasPrivate_ != null) {
            iG += CodedOutputStream.G(3, getExtrasPrivate());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasExtrasPrivate() {
        return this.extrasPrivate_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasMonitor() {
        return this.payloadCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
    public boolean hasReader() {
        return this.payloadCase_ == 2;
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
        if (hasExtrasPrivate()) {
            iHashCode2 = (((iHashCode2 * 37) + 3) * 53) + getExtrasPrivate().hashCode();
        }
        int i12 = this.payloadCase_;
        if (i12 != 1) {
            if (i12 == 2) {
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getReader().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 1) * 53;
        iHashCode = getMonitor().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable.d(Event.class, Builder.class);
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
        if (this.payloadCase_ == 1) {
            codedOutputStream.L0(1, (Monitor) this.payload_);
        }
        if (this.payloadCase_ == 2) {
            codedOutputStream.L0(2, (Reader) this.payload_);
        }
        if (this.extrasPrivate_ != null) {
            codedOutputStream.L0(3, getExtrasPrivate());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements EventOrBuilder {
        private e2<Struct, Struct.Builder, i2> extrasPrivateBuilder_;
        private Struct extrasPrivate_;
        private e2<Monitor, Monitor.Builder, MonitorOrBuilder> monitorBuilder_;
        private int payloadCase_;
        private Object payload_;
        private e2<Reader, Reader.Builder, ReaderOrBuilder> readerBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
        }

        private e2<Struct, Struct.Builder, i2> getExtrasPrivateFieldBuilder() {
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivateBuilder_ = new e2<>(getExtrasPrivate(), getParentForChildren(), isClean());
                this.extrasPrivate_ = null;
            }
            return this.extrasPrivateBuilder_;
        }

        private e2<Monitor, Monitor.Builder, MonitorOrBuilder> getMonitorFieldBuilder() {
            if (this.monitorBuilder_ == null) {
                if (this.payloadCase_ != 1) {
                    this.payload_ = Monitor.getDefaultInstance();
                }
                this.monitorBuilder_ = new e2<>((Monitor) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 1;
            onChanged();
            return this.monitorBuilder_;
        }

        private e2<Reader, Reader.Builder, ReaderOrBuilder> getReaderFieldBuilder() {
            if (this.readerBuilder_ == null) {
                if (this.payloadCase_ != 2) {
                    this.payload_ = Reader.getDefaultInstance();
                }
                this.readerBuilder_ = new e2<>((Reader) this.payload_, getParentForChildren(), isClean());
                this.payload_ = null;
            }
            this.payloadCase_ = 2;
            onChanged();
            return this.readerBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearExtrasPrivate() {
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivate_ = null;
                onChanged();
            } else {
                this.extrasPrivate_ = null;
                this.extrasPrivateBuilder_ = null;
            }
            return this;
        }

        public Builder clearMonitor() {
            e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var = this.monitorBuilder_;
            if (e2Var != null) {
                if (this.payloadCase_ == 1) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                e2Var.b();
            } else if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
            onChanged();
            return this;
        }

        public Builder clearReader() {
            e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var = this.readerBuilder_;
            if (e2Var != null) {
                if (this.payloadCase_ == 2) {
                    this.payloadCase_ = 0;
                    this.payload_ = null;
                }
                e2Var.b();
            } else if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
                onChanged();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Struct getExtrasPrivate() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extrasPrivateBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.extrasPrivate_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtrasPrivateBuilder() {
            onChanged();
            return (Struct.Builder) getExtrasPrivateFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public i2 getExtrasPrivateOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extrasPrivateBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.extrasPrivate_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Monitor getMonitor() {
            e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var = this.monitorBuilder_;
            if (e2Var == null) {
                return this.payloadCase_ == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
            }
            return this.payloadCase_ == 1 ? (Monitor) e2Var.e() : Monitor.getDefaultInstance();
        }

        public Monitor.Builder getMonitorBuilder() {
            return (Monitor.Builder) getMonitorFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public MonitorOrBuilder getMonitorOrBuilder() {
            e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var;
            int i10 = this.payloadCase_;
            if (i10 != 1 || (e2Var = this.monitorBuilder_) == null) {
                return i10 == 1 ? (Monitor) this.payload_ : Monitor.getDefaultInstance();
            }
            return (MonitorOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public Reader getReader() {
            e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var = this.readerBuilder_;
            if (e2Var == null) {
                return this.payloadCase_ == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
            }
            return this.payloadCase_ == 2 ? (Reader) e2Var.e() : Reader.getDefaultInstance();
        }

        public Reader.Builder getReaderBuilder() {
            return (Reader.Builder) getReaderFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public ReaderOrBuilder getReaderOrBuilder() {
            e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var;
            int i10 = this.payloadCase_;
            if (i10 != 2 || (e2Var = this.readerBuilder_) == null) {
                return i10 == 2 ? (Reader) this.payload_ : Reader.getDefaultInstance();
            }
            return (ReaderOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasExtrasPrivate() {
            return (this.extrasPrivateBuilder_ == null && this.extrasPrivate_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasMonitor() {
            return this.payloadCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.sdk.EventOrBuilder
        public boolean hasReader() {
            return this.payloadCase_ == 2;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable.d(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeExtrasPrivate(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extrasPrivateBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.extrasPrivate_;
                if (struct2 != null) {
                    this.extrasPrivate_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.extrasPrivate_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        public Builder mergeMonitor(Monitor monitor) {
            e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var = this.monitorBuilder_;
            if (e2Var == null) {
                if (this.payloadCase_ != 1 || this.payload_ == Monitor.getDefaultInstance()) {
                    this.payload_ = monitor;
                } else {
                    this.payload_ = Monitor.newBuilder((Monitor) this.payload_).mergeFrom(monitor).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 1) {
                    e2Var.g(monitor);
                }
                this.monitorBuilder_.i(monitor);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder mergeReader(Reader reader) {
            e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var = this.readerBuilder_;
            if (e2Var == null) {
                if (this.payloadCase_ != 2 || this.payload_ == Reader.getDefaultInstance()) {
                    this.payload_ = reader;
                } else {
                    this.payload_ = Reader.newBuilder((Reader) this.payload_).mergeFrom(reader).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadCase_ == 2) {
                    e2Var.g(reader);
                }
                this.readerBuilder_.i(reader);
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder setExtrasPrivate(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extrasPrivateBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.extrasPrivate_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
            return this;
        }

        public Builder setMonitor(Monitor monitor) {
            e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var = this.monitorBuilder_;
            if (e2Var == null) {
                monitor.getClass();
                this.payload_ = monitor;
                onChanged();
            } else {
                e2Var.i(monitor);
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setReader(Reader reader) {
            e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var = this.readerBuilder_;
            if (e2Var == null) {
                reader.getClass();
                this.payload_ = reader;
                onChanged();
            } else {
                e2Var.i(reader);
            }
            this.payloadCase_ = 2;
            return this;
        }

        private Builder() {
            this.payloadCase_ = 0;
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
            if (this.payloadCase_ == 1) {
                e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var = this.monitorBuilder_;
                if (e2Var == null) {
                    event.payload_ = this.payload_;
                } else {
                    event.payload_ = e2Var.a();
                }
            }
            if (this.payloadCase_ == 2) {
                e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var2 = this.readerBuilder_;
                if (e2Var2 == null) {
                    event.payload_ = this.payload_;
                } else {
                    event.payload_ = e2Var2.a();
                }
            }
            e2<Struct, Struct.Builder, i2> e2Var3 = this.extrasPrivateBuilder_;
            if (e2Var3 == null) {
                event.extrasPrivate_ = this.extrasPrivate_;
            } else {
                event.extrasPrivate_ = (Struct) e2Var3.a();
            }
            event.payloadCase_ = this.payloadCase_;
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
            if (this.extrasPrivateBuilder_ == null) {
                this.extrasPrivate_ = null;
            } else {
                this.extrasPrivate_ = null;
                this.extrasPrivateBuilder_ = null;
            }
            this.payloadCase_ = 0;
            this.payload_ = null;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.payloadCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setExtrasPrivate(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extrasPrivateBuilder_;
            if (e2Var == null) {
                this.extrasPrivate_ = builder.build();
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
            if (message instanceof Event) {
                return mergeFrom((Event) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMonitor(Monitor.Builder builder) {
            e2<Monitor, Monitor.Builder, MonitorOrBuilder> e2Var = this.monitorBuilder_;
            if (e2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadCase_ = 1;
            return this;
        }

        public Builder setReader(Reader.Builder builder) {
            e2<Reader, Reader.Builder, ReaderOrBuilder> e2Var = this.readerBuilder_;
            if (e2Var == null) {
                this.payload_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadCase_ = 2;
            return this;
        }

        public Builder mergeFrom(Event event) {
            if (event == Event.getDefaultInstance()) {
                return this;
            }
            if (event.hasExtrasPrivate()) {
                mergeExtrasPrivate(event.getExtrasPrivate());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$Event$PayloadCase[event.getPayloadCase().ordinal()];
            if (i10 == 1) {
                mergeMonitor(event.getMonitor());
            } else if (i10 == 2) {
                mergeReader(event.getReader());
            }
            mergeUnknownFields(((j0) event).unknownFields);
            onChanged();
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
        this.payloadCase_ = 0;
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

    public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    private Event() {
        this.payloadCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Event parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Event parseFrom(InputStream inputStream) throws IOException {
        return (Event) j0.parseWithIOException(PARSER, inputStream);
    }

    private Event(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            Monitor.Builder builder = this.payloadCase_ == 1 ? ((Monitor) this.payload_).toBuilder() : null;
                            MessageLite messageLiteA = nVar.A(Monitor.parser(), yVar);
                            this.payload_ = messageLiteA;
                            if (builder != null) {
                                builder.mergeFrom((Monitor) messageLiteA);
                                this.payload_ = builder.buildPartial();
                            }
                            this.payloadCase_ = 1;
                        } else if (iK == 18) {
                            Reader.Builder builder2 = this.payloadCase_ == 2 ? ((Reader) this.payload_).toBuilder() : null;
                            MessageLite messageLiteA2 = nVar.A(Reader.parser(), yVar);
                            this.payload_ = messageLiteA2;
                            if (builder2 != null) {
                                builder2.mergeFrom((Reader) messageLiteA2);
                                this.payload_ = builder2.buildPartial();
                            }
                            this.payloadCase_ = 2;
                        } else if (iK != 26) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            Struct struct = this.extrasPrivate_;
                            Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                            this.extrasPrivate_ = struct2;
                            if (builder3 != null) {
                                builder3.mergeFrom(struct2);
                                this.extrasPrivate_ = builder3.buildPartial();
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

    public static Event parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Event) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Event parseFrom(n nVar) throws IOException {
        return (Event) j0.parseWithIOException(PARSER, nVar);
    }

    public static Event parseFrom(n nVar, y yVar) throws IOException {
        return (Event) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
