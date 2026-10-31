package io.bidmachine.protobuf.rendering;

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

/* JADX INFO: loaded from: classes4.dex */
public final class RenderingTaskPermission extends j0 implements RenderingTaskPermissionOrBuilder {
    private static final RenderingTaskPermission DEFAULT_INSTANCE = new RenderingTaskPermission();
    private static final s1<RenderingTaskPermission> PARSER = new b<RenderingTaskPermission>() { // from class: io.bidmachine.protobuf.rendering.RenderingTaskPermission.1
        @Override // com.explorestack.protobuf.s1
        public RenderingTaskPermission parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new RenderingTaskPermission(nVar, yVar);
        }
    };
    public static final int REQUEST_FIELD_NUMBER = 1;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int payloadOneofCase_;
    private Object payloadOneof_;

    /* JADX INFO: renamed from: io.bidmachine.protobuf.rendering.RenderingTaskPermission$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase;

        static {
            int[] iArr = new int[PayloadOneofCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase = iArr;
            try {
                iArr[PayloadOneofCase.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase[PayloadOneofCase.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase[PayloadOneofCase.PAYLOADONEOF_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum PayloadOneofCase implements l0.c {
        REQUEST(1),
        RESPONSE(2),
        PAYLOADONEOF_NOT_SET(0);

        private final int value;

        PayloadOneofCase(int i10) {
            this.value = i10;
        }

        public static PayloadOneofCase forNumber(int i10) {
            if (i10 == 0) {
                return PAYLOADONEOF_NOT_SET;
            }
            if (i10 == 1) {
                return REQUEST;
            }
            if (i10 != 2) {
                return null;
            }
            return RESPONSE;
        }

        @Override // com.explorestack.protobuf.l0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadOneofCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class Request extends j0 implements RequestOrBuilder {
        public static final int EVENT_NAME_FIELD_NUMBER = 1;
        public static final int EVENT_SOURCE_FIELD_NUMBER = 2;
        public static final int EVENT_TASKS_FIELD_NUMBER = 4;
        public static final int EVENT_VALUE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int eventName_;
        private volatile Object eventSource_;
        private List<Rendering.Phase.Event.Task> eventTasks_;
        private volatile Object eventValue_;
        private byte memoizedIsInitialized;
        private static final Request DEFAULT_INSTANCE = new Request();
        private static final s1<Request> PARSER = new b<Request>() { // from class: io.bidmachine.protobuf.rendering.RenderingTaskPermission.Request.1
            @Override // com.explorestack.protobuf.s1
            public Request parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Request(nVar, yVar);
            }
        };

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Request> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return super.equals(obj);
            }
            Request request = (Request) obj;
            return this.eventName_ == request.eventName_ && getEventSource().equals(request.getEventSource()) && getEventValue().equals(request.getEventValue()) && getEventTasksList().equals(request.getEventTasksList()) && this.unknownFields.equals(request.unknownFields);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public Rendering.Phase.Event.EventName getEventName() {
            Rendering.Phase.Event.EventName eventNameValueOf = Rendering.Phase.Event.EventName.valueOf(this.eventName_);
            return eventNameValueOf == null ? Rendering.Phase.Event.EventName.UNRECOGNIZED : eventNameValueOf;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public int getEventNameValue() {
            return this.eventName_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public String getEventSource() {
            Object obj = this.eventSource_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.eventSource_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public ByteString getEventSourceBytes() {
            Object obj = this.eventSource_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventSource_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public Rendering.Phase.Event.Task getEventTasks(int i10) {
            return this.eventTasks_.get(i10);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public int getEventTasksCount() {
            return this.eventTasks_.size();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public List<Rendering.Phase.Event.Task> getEventTasksList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i10) {
            return this.eventTasks_.get(i10);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public String getEventValue() {
            Object obj = this.eventValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.eventValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
        public ByteString getEventValueBytes() {
            Object obj = this.eventValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Request> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.eventName_ != Rendering.Phase.Event.EventName.EVENT_NAME_INVALID.getNumber() ? CodedOutputStream.l(1, this.eventName_) + 0 : 0;
            if (!getEventSourceBytes().isEmpty()) {
                iL += j0.computeStringSize(2, this.eventSource_);
            }
            if (!getEventValueBytes().isEmpty()) {
                iL += j0.computeStringSize(3, this.eventValue_);
            }
            for (int i11 = 0; i11 < this.eventTasks_.size(); i11++) {
                iL += CodedOutputStream.G(4, this.eventTasks_.get(i11));
            }
            int serializedSize = iL + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.eventName_) * 37) + 2) * 53) + getEventSource().hashCode()) * 37) + 3) * 53) + getEventValue().hashCode();
            if (getEventTasksCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getEventTasksList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_fieldAccessorTable.d(Request.class, Builder.class);
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
            return new Request();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.eventName_ != Rendering.Phase.Event.EventName.EVENT_NAME_INVALID.getNumber()) {
                codedOutputStream.v0(1, this.eventName_);
            }
            if (!getEventSourceBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 2, this.eventSource_);
            }
            if (!getEventValueBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 3, this.eventValue_);
            }
            for (int i10 = 0; i10 < this.eventTasks_.size(); i10++) {
                codedOutputStream.L0(4, this.eventTasks_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements RequestOrBuilder {
            private int bitField0_;
            private int eventName_;
            private Object eventSource_;
            private z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> eventTasksBuilder_;
            private List<Rendering.Phase.Event.Task> eventTasks_;
            private Object eventValue_;

            private void ensureEventTasksIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.eventTasks_ = new ArrayList(this.eventTasks_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
            }

            private z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> getEventTasksFieldBuilder() {
                if (this.eventTasksBuilder_ == null) {
                    this.eventTasksBuilder_ = new z1<>(this.eventTasks_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.eventTasks_ = null;
                }
                return this.eventTasksBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getEventTasksFieldBuilder();
                }
            }

            public Builder addAllEventTasks(Iterable<? extends Rendering.Phase.Event.Task> iterable) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.eventTasks_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task task) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(task);
                    onChanged();
                } else {
                    z1Var.e(task);
                }
                return this;
            }

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder() {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().c(Rendering.Phase.Event.Task.getDefaultInstance());
            }

            public Builder clearEventName() {
                this.eventName_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEventSource() {
                this.eventSource_ = Request.getDefaultInstance().getEventSource();
                onChanged();
                return this;
            }

            public Builder clearEventTasks() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearEventValue() {
                this.eventValue_ = Request.getDefaultInstance().getEventValue();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_descriptor;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public Rendering.Phase.Event.EventName getEventName() {
                Rendering.Phase.Event.EventName eventNameValueOf = Rendering.Phase.Event.EventName.valueOf(this.eventName_);
                return eventNameValueOf == null ? Rendering.Phase.Event.EventName.UNRECOGNIZED : eventNameValueOf;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public int getEventNameValue() {
                return this.eventName_;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public String getEventSource() {
                Object obj = this.eventSource_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.eventSource_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public ByteString getEventSourceBytes() {
                Object obj = this.eventSource_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventSource_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public Rendering.Phase.Event.Task getEventTasks(int i10) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? this.eventTasks_.get(i10) : (Rendering.Phase.Event.Task) z1Var.n(i10);
            }

            public Rendering.Phase.Event.Task.Builder getEventTasksBuilder(int i10) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().k(i10);
            }

            public List<Rendering.Phase.Event.Task.Builder> getEventTasksBuilderList() {
                return getEventTasksFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public int getEventTasksCount() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? this.eventTasks_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public List<Rendering.Phase.Event.Task> getEventTasksList() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.eventTasks_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i10) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? this.eventTasks_.get(i10) : (Rendering.Phase.Event.TaskOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.eventTasks_);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public String getEventValue() {
                Object obj = this.eventValue_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.eventValue_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.RequestOrBuilder
            public ByteString getEventValueBytes() {
                Object obj = this.eventValue_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventValue_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Request_fieldAccessorTable.d(Request.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeEventTasks(int i10) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setEventName(Rendering.Phase.Event.EventName eventName) {
                eventName.getClass();
                this.eventName_ = eventName.getNumber();
                onChanged();
                return this;
            }

            public Builder setEventNameValue(int i10) {
                this.eventName_ = i10;
                onChanged();
                return this;
            }

            public Builder setEventSource(String str) {
                str.getClass();
                this.eventSource_ = str;
                onChanged();
                return this;
            }

            public Builder setEventSourceBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.eventSource_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEventTasks(int i10, Rendering.Phase.Event.Task task) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i10, task);
                    onChanged();
                } else {
                    z1Var.w(i10, task);
                }
                return this;
            }

            public Builder setEventValue(String str) {
                str.getClass();
                this.eventValue_ = str;
                onChanged();
                return this;
            }

            public Builder setEventValueBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.eventValue_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.eventName_ = 0;
                this.eventSource_ = "";
                this.eventValue_ = "";
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Request build() {
                Request requestBuildPartial = buildPartial();
                if (requestBuildPartial.isInitialized()) {
                    return requestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Request buildPartial() {
                Request request = new Request(this);
                request.eventName_ = this.eventName_;
                request.eventSource_ = this.eventSource_;
                request.eventValue_ = this.eventValue_;
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var != null) {
                    request.eventTasks_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                        this.bitField0_ &= -2;
                    }
                    request.eventTasks_ = this.eventTasks_;
                }
                onBuilt();
                return request;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Request mo164getDefaultInstanceForType() {
                return Request.getDefaultInstance();
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

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder(int i10) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().b(i10, Rendering.Phase.Event.Task.getDefaultInstance());
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
                this.eventName_ = 0;
                this.eventSource_ = "";
                this.eventValue_ = "";
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder addEventTasks(int i10, Rendering.Phase.Event.Task task) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i10, task);
                    onChanged();
                } else {
                    z1Var.d(i10, task);
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
                if (message instanceof Request) {
                    return mergeFrom((Request) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEventTasks(int i10, Rendering.Phase.Event.Task.Builder builder) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.eventName_ = 0;
                this.eventSource_ = "";
                this.eventValue_ = "";
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Request request) {
                if (request == Request.getDefaultInstance()) {
                    return this;
                }
                if (request.eventName_ != 0) {
                    setEventNameValue(request.getEventNameValue());
                }
                if (!request.getEventSource().isEmpty()) {
                    this.eventSource_ = request.eventSource_;
                    onChanged();
                }
                if (!request.getEventValue().isEmpty()) {
                    this.eventValue_ = request.eventValue_;
                    onChanged();
                }
                if (this.eventTasksBuilder_ == null) {
                    if (!request.eventTasks_.isEmpty()) {
                        if (this.eventTasks_.isEmpty()) {
                            this.eventTasks_ = request.eventTasks_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEventTasksIsMutable();
                            this.eventTasks_.addAll(request.eventTasks_);
                        }
                        onChanged();
                    }
                } else if (!request.eventTasks_.isEmpty()) {
                    if (!this.eventTasksBuilder_.t()) {
                        this.eventTasksBuilder_.a(request.eventTasks_);
                    } else {
                        this.eventTasksBuilder_.h();
                        this.eventTasksBuilder_ = null;
                        this.eventTasks_ = request.eventTasks_;
                        this.bitField0_ &= -2;
                        this.eventTasksBuilder_ = j0.alwaysUseFieldBuilders ? getEventTasksFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) request).unknownFields);
                onChanged();
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task.Builder builder) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addEventTasks(int i10, Rendering.Phase.Event.Task.Builder builder) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Request request = null;
                try {
                    try {
                        Request request2 = (Request) Request.PARSER.parsePartialFrom(nVar, yVar);
                        if (request2 != null) {
                            mergeFrom(request2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Request request3 = (Request) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            request = request3;
                            if (request != null) {
                                mergeFrom(request);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (request != null) {
                        mergeFrom(request);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Request request) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Request(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Request parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Request) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Request mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Request parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Request() {
            this.memoizedIsInitialized = (byte) -1;
            this.eventName_ = 0;
            this.eventSource_ = "";
            this.eventValue_ = "";
            this.eventTasks_ = Collections.emptyList();
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Request parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Request) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        private Request(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                this.eventName_ = nVar.t();
                            } else if (iK == 18) {
                                this.eventSource_ = nVar.J();
                            } else if (iK == 26) {
                                this.eventValue_ = nVar.J();
                            } else if (iK != 34) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.eventTasks_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.eventTasks_.add((Rendering.Phase.Event.Task) nVar.A(Rendering.Phase.Event.Task.parser(), yVar));
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
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Request parseFrom(n nVar) throws IOException {
            return (Request) j0.parseWithIOException(PARSER, nVar);
        }

        public static Request parseFrom(n nVar, y yVar) throws IOException {
            return (Request) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface RequestOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        Rendering.Phase.Event.EventName getEventName();

        int getEventNameValue();

        String getEventSource();

        ByteString getEventSourceBytes();

        Rendering.Phase.Event.Task getEventTasks(int i10);

        int getEventTasksCount();

        List<Rendering.Phase.Event.Task> getEventTasksList();

        Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i10);

        List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList();

        String getEventValue();

        ByteString getEventValueBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Response extends j0 implements ResponseOrBuilder {
        public static final int EVENT_TASKS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Rendering.Phase.Event.Task> eventTasks_;
        private byte memoizedIsInitialized;
        private static final Response DEFAULT_INSTANCE = new Response();
        private static final s1<Response> PARSER = new b<Response>() { // from class: io.bidmachine.protobuf.rendering.RenderingTaskPermission.Response.1
            @Override // com.explorestack.protobuf.s1
            public Response parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Response(nVar, yVar);
            }
        };

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<Response> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return super.equals(obj);
            }
            Response response = (Response) obj;
            return getEventTasksList().equals(response.getEventTasksList()) && this.unknownFields.equals(response.unknownFields);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public Rendering.Phase.Event.Task getEventTasks(int i10) {
            return this.eventTasks_.get(i10);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public int getEventTasksCount() {
            return this.eventTasks_.size();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public List<Rendering.Phase.Event.Task> getEventTasksList() {
            return this.eventTasks_;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i10) {
            return this.eventTasks_.get(i10);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
        public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
            return this.eventTasks_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<Response> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.eventTasks_.size(); i11++) {
                iG += CodedOutputStream.G(1, this.eventTasks_.get(i11));
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
            if (getEventTasksCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getEventTasksList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_fieldAccessorTable.d(Response.class, Builder.class);
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
            return new Response();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.eventTasks_.size(); i10++) {
                codedOutputStream.L0(1, this.eventTasks_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ResponseOrBuilder {
            private int bitField0_;
            private z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> eventTasksBuilder_;
            private List<Rendering.Phase.Event.Task> eventTasks_;

            private void ensureEventTasksIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.eventTasks_ = new ArrayList(this.eventTasks_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
            }

            private z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> getEventTasksFieldBuilder() {
                if (this.eventTasksBuilder_ == null) {
                    this.eventTasksBuilder_ = new z1<>(this.eventTasks_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.eventTasks_ = null;
                }
                return this.eventTasksBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getEventTasksFieldBuilder();
                }
            }

            public Builder addAllEventTasks(Iterable<? extends Rendering.Phase.Event.Task> iterable) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    a.AbstractC0128a.addAll((Iterable) iterable, (List) this.eventTasks_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task task) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(task);
                    onChanged();
                } else {
                    z1Var.e(task);
                }
                return this;
            }

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder() {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().c(Rendering.Phase.Event.Task.getDefaultInstance());
            }

            public Builder clearEventTasks() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_descriptor;
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public Rendering.Phase.Event.Task getEventTasks(int i10) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? this.eventTasks_.get(i10) : (Rendering.Phase.Event.Task) z1Var.n(i10);
            }

            public Rendering.Phase.Event.Task.Builder getEventTasksBuilder(int i10) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().k(i10);
            }

            public List<Rendering.Phase.Event.Task.Builder> getEventTasksBuilderList() {
                return getEventTasksFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public int getEventTasksCount() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? this.eventTasks_.size() : z1Var.m();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public List<Rendering.Phase.Event.Task> getEventTasksList() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.eventTasks_) : z1Var.p();
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i10) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var == null ? this.eventTasks_.get(i10) : (Rendering.Phase.Event.TaskOrBuilder) z1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermission.ResponseOrBuilder
            public List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList() {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.eventTasks_);
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_Response_fieldAccessorTable.d(Response.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeEventTasks(int i10) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setEventTasks(int i10, Rendering.Phase.Event.Task task) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i10, task);
                    onChanged();
                } else {
                    z1Var.w(i10, task);
                }
                return this;
            }

            private Builder() {
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Response build() {
                Response responseBuildPartial = buildPartial();
                if (responseBuildPartial.isInitialized()) {
                    return responseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) responseBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Response buildPartial() {
                Response response = new Response(this);
                int i10 = this.bitField0_;
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    if ((i10 & 1) != 0) {
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                        this.bitField0_ &= -2;
                    }
                    response.eventTasks_ = this.eventTasks_;
                } else {
                    response.eventTasks_ = z1Var.f();
                }
                onBuilt();
                return response;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Response mo164getDefaultInstanceForType() {
                return Response.getDefaultInstance();
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

            public Rendering.Phase.Event.Task.Builder addEventTasksBuilder(int i10) {
                return (Rendering.Phase.Event.Task.Builder) getEventTasksFieldBuilder().b(i10, Rendering.Phase.Event.Task.getDefaultInstance());
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
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    this.eventTasks_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    z1Var.g();
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.eventTasks_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addEventTasks(int i10, Rendering.Phase.Event.Task task) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    task.getClass();
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i10, task);
                    onChanged();
                } else {
                    z1Var.d(i10, task);
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
                if (message instanceof Response) {
                    return mergeFrom((Response) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEventTasks(int i10, Rendering.Phase.Event.Task.Builder builder) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Response response) {
                if (response == Response.getDefaultInstance()) {
                    return this;
                }
                if (this.eventTasksBuilder_ == null) {
                    if (!response.eventTasks_.isEmpty()) {
                        if (this.eventTasks_.isEmpty()) {
                            this.eventTasks_ = response.eventTasks_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureEventTasksIsMutable();
                            this.eventTasks_.addAll(response.eventTasks_);
                        }
                        onChanged();
                    }
                } else if (!response.eventTasks_.isEmpty()) {
                    if (!this.eventTasksBuilder_.t()) {
                        this.eventTasksBuilder_.a(response.eventTasks_);
                    } else {
                        this.eventTasksBuilder_.h();
                        this.eventTasksBuilder_ = null;
                        this.eventTasks_ = response.eventTasks_;
                        this.bitField0_ &= -2;
                        this.eventTasksBuilder_ = j0.alwaysUseFieldBuilders ? getEventTasksFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) response).unknownFields);
                onChanged();
                return this;
            }

            public Builder addEventTasks(Rendering.Phase.Event.Task.Builder builder) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addEventTasks(int i10, Rendering.Phase.Event.Task.Builder builder) {
                z1<Rendering.Phase.Event.Task, Rendering.Phase.Event.Task.Builder, Rendering.Phase.Event.TaskOrBuilder> z1Var = this.eventTasksBuilder_;
                if (z1Var == null) {
                    ensureEventTasksIsMutable();
                    this.eventTasks_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                Response response = null;
                try {
                    try {
                        Response response2 = (Response) Response.PARSER.parsePartialFrom(nVar, yVar);
                        if (response2 != null) {
                            mergeFrom(response2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Response response3 = (Response) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            response = response3;
                            if (response != null) {
                                mergeFrom(response);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (response != null) {
                        mergeFrom(response);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Response response) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private Response(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Response parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Response) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Response mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Response parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Response() {
            this.memoizedIsInitialized = (byte) -1;
            this.eventTasks_ = Collections.emptyList();
        }

        public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static Response parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response) j0.parseWithIOException(PARSER, inputStream);
        }

        private Response(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                    this.eventTasks_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.eventTasks_.add((Rendering.Phase.Event.Task) nVar.A(Rendering.Phase.Event.Task.parser(), yVar));
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
                        this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.eventTasks_ = Collections.unmodifiableList(this.eventTasks_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Response parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Response) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Response parseFrom(n nVar) throws IOException {
            return (Response) j0.parseWithIOException(PARSER, nVar);
        }

        public static Response parseFrom(n nVar, y yVar) throws IOException {
            return (Response) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface ResponseOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        Rendering.Phase.Event.Task getEventTasks(int i10);

        int getEventTasksCount();

        List<Rendering.Phase.Event.Task> getEventTasksList();

        Rendering.Phase.Event.TaskOrBuilder getEventTasksOrBuilder(int i10);

        List<? extends Rendering.Phase.Event.TaskOrBuilder> getEventTasksOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static RenderingTaskPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RenderingTaskPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RenderingTaskPermission) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RenderingTaskPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<RenderingTaskPermission> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RenderingTaskPermission)) {
            return super.equals(obj);
        }
        RenderingTaskPermission renderingTaskPermission = (RenderingTaskPermission) obj;
        if (!getPayloadOneofCase().equals(renderingTaskPermission.getPayloadOneofCase())) {
            return false;
        }
        int i10 = this.payloadOneofCase_;
        if (i10 != 1) {
            if (i10 == 2 && !getResponse().equals(renderingTaskPermission.getResponse())) {
                return false;
            }
        } else if (!getRequest().equals(renderingTaskPermission.getRequest())) {
            return false;
        }
        return this.unknownFields.equals(renderingTaskPermission.unknownFields);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<RenderingTaskPermission> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public PayloadOneofCase getPayloadOneofCase() {
        return PayloadOneofCase.forNumber(this.payloadOneofCase_);
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public Request getRequest() {
        return this.payloadOneofCase_ == 1 ? (Request) this.payloadOneof_ : Request.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public RequestOrBuilder getRequestOrBuilder() {
        return this.payloadOneofCase_ == 1 ? (Request) this.payloadOneof_ : Request.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public Response getResponse() {
        return this.payloadOneofCase_ == 2 ? (Response) this.payloadOneof_ : Response.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public ResponseOrBuilder getResponseOrBuilder() {
        return this.payloadOneofCase_ == 2 ? (Response) this.payloadOneof_ : Response.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.payloadOneofCase_ == 1 ? 0 + CodedOutputStream.G(1, (Request) this.payloadOneof_) : 0;
        if (this.payloadOneofCase_ == 2) {
            iG += CodedOutputStream.G(2, (Response) this.payloadOneof_);
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public boolean hasRequest() {
        return this.payloadOneofCase_ == 1;
    }

    @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
    public boolean hasResponse() {
        return this.payloadOneofCase_ == 2;
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
        int i12 = this.payloadOneofCase_;
        if (i12 != 1) {
            if (i12 == 2) {
                i10 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getResponse().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }
        i10 = ((iHashCode2 * 37) + 1) * 53;
        iHashCode = getRequest().hashCode();
        iHashCode2 = i10 + iHashCode;
        int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_fieldAccessorTable.d(RenderingTaskPermission.class, Builder.class);
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
        return new RenderingTaskPermission();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.payloadOneofCase_ == 1) {
            codedOutputStream.L0(1, (Request) this.payloadOneof_);
        }
        if (this.payloadOneofCase_ == 2) {
            codedOutputStream.L0(2, (Response) this.payloadOneof_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements RenderingTaskPermissionOrBuilder {
        private int payloadOneofCase_;
        private Object payloadOneof_;
        private e2<Request, Request.Builder, RequestOrBuilder> requestBuilder_;
        private e2<Response, Response.Builder, ResponseOrBuilder> responseBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
        }

        private e2<Request, Request.Builder, RequestOrBuilder> getRequestFieldBuilder() {
            if (this.requestBuilder_ == null) {
                if (this.payloadOneofCase_ != 1) {
                    this.payloadOneof_ = Request.getDefaultInstance();
                }
                this.requestBuilder_ = new e2<>((Request) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 1;
            onChanged();
            return this.requestBuilder_;
        }

        private e2<Response, Response.Builder, ResponseOrBuilder> getResponseFieldBuilder() {
            if (this.responseBuilder_ == null) {
                if (this.payloadOneofCase_ != 2) {
                    this.payloadOneof_ = Response.getDefaultInstance();
                }
                this.responseBuilder_ = new e2<>((Response) this.payloadOneof_, getParentForChildren(), isClean());
                this.payloadOneof_ = null;
            }
            this.payloadOneofCase_ = 2;
            onChanged();
            return this.responseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearPayloadOneof() {
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            onChanged();
            return this;
        }

        public Builder clearRequest() {
            e2<Request, Request.Builder, RequestOrBuilder> e2Var = this.requestBuilder_;
            if (e2Var != null) {
                if (this.payloadOneofCase_ == 1) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                e2Var.b();
            } else if (this.payloadOneofCase_ == 1) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearResponse() {
            e2<Response, Response.Builder, ResponseOrBuilder> e2Var = this.responseBuilder_;
            if (e2Var != null) {
                if (this.payloadOneofCase_ == 2) {
                    this.payloadOneofCase_ = 0;
                    this.payloadOneof_ = null;
                }
                e2Var.b();
            } else if (this.payloadOneofCase_ == 2) {
                this.payloadOneofCase_ = 0;
                this.payloadOneof_ = null;
                onChanged();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_descriptor;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public PayloadOneofCase getPayloadOneofCase() {
            return PayloadOneofCase.forNumber(this.payloadOneofCase_);
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public Request getRequest() {
            e2<Request, Request.Builder, RequestOrBuilder> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                return this.payloadOneofCase_ == 1 ? (Request) this.payloadOneof_ : Request.getDefaultInstance();
            }
            return this.payloadOneofCase_ == 1 ? (Request) e2Var.e() : Request.getDefaultInstance();
        }

        public Request.Builder getRequestBuilder() {
            return (Request.Builder) getRequestFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public RequestOrBuilder getRequestOrBuilder() {
            e2<Request, Request.Builder, RequestOrBuilder> e2Var;
            int i10 = this.payloadOneofCase_;
            if (i10 != 1 || (e2Var = this.requestBuilder_) == null) {
                return i10 == 1 ? (Request) this.payloadOneof_ : Request.getDefaultInstance();
            }
            return (RequestOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public Response getResponse() {
            e2<Response, Response.Builder, ResponseOrBuilder> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                return this.payloadOneofCase_ == 2 ? (Response) this.payloadOneof_ : Response.getDefaultInstance();
            }
            return this.payloadOneofCase_ == 2 ? (Response) e2Var.e() : Response.getDefaultInstance();
        }

        public Response.Builder getResponseBuilder() {
            return (Response.Builder) getResponseFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public ResponseOrBuilder getResponseOrBuilder() {
            e2<Response, Response.Builder, ResponseOrBuilder> e2Var;
            int i10 = this.payloadOneofCase_;
            if (i10 != 2 || (e2Var = this.responseBuilder_) == null) {
                return i10 == 2 ? (Response) this.payloadOneof_ : Response.getDefaultInstance();
            }
            return (ResponseOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public boolean hasRequest() {
            return this.payloadOneofCase_ == 1;
        }

        @Override // io.bidmachine.protobuf.rendering.RenderingTaskPermissionOrBuilder
        public boolean hasResponse() {
            return this.payloadOneofCase_ == 2;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return TaskPermissionProto.internal_static_bidmachine_protobuf_RenderingTaskPermission_fieldAccessorTable.d(RenderingTaskPermission.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeRequest(Request request) {
            e2<Request, Request.Builder, RequestOrBuilder> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                if (this.payloadOneofCase_ != 1 || this.payloadOneof_ == Request.getDefaultInstance()) {
                    this.payloadOneof_ = request;
                } else {
                    this.payloadOneof_ = Request.newBuilder((Request) this.payloadOneof_).mergeFrom(request).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 1) {
                    e2Var.g(request);
                }
                this.requestBuilder_.i(request);
            }
            this.payloadOneofCase_ = 1;
            return this;
        }

        public Builder mergeResponse(Response response) {
            e2<Response, Response.Builder, ResponseOrBuilder> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                if (this.payloadOneofCase_ != 2 || this.payloadOneof_ == Response.getDefaultInstance()) {
                    this.payloadOneof_ = response;
                } else {
                    this.payloadOneof_ = Response.newBuilder((Response) this.payloadOneof_).mergeFrom(response).buildPartial();
                }
                onChanged();
            } else {
                if (this.payloadOneofCase_ == 2) {
                    e2Var.g(response);
                }
                this.responseBuilder_.i(response);
            }
            this.payloadOneofCase_ = 2;
            return this;
        }

        public Builder setRequest(Request request) {
            e2<Request, Request.Builder, RequestOrBuilder> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                request.getClass();
                this.payloadOneof_ = request;
                onChanged();
            } else {
                e2Var.i(request);
            }
            this.payloadOneofCase_ = 1;
            return this;
        }

        public Builder setResponse(Response response) {
            e2<Response, Response.Builder, ResponseOrBuilder> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                response.getClass();
                this.payloadOneof_ = response;
                onChanged();
            } else {
                e2Var.i(response);
            }
            this.payloadOneofCase_ = 2;
            return this;
        }

        private Builder() {
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingTaskPermission build() {
            RenderingTaskPermission renderingTaskPermissionBuildPartial = buildPartial();
            if (renderingTaskPermissionBuildPartial.isInitialized()) {
                return renderingTaskPermissionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) renderingTaskPermissionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RenderingTaskPermission buildPartial() {
            RenderingTaskPermission renderingTaskPermission = new RenderingTaskPermission(this);
            if (this.payloadOneofCase_ == 1) {
                e2<Request, Request.Builder, RequestOrBuilder> e2Var = this.requestBuilder_;
                if (e2Var == null) {
                    renderingTaskPermission.payloadOneof_ = this.payloadOneof_;
                } else {
                    renderingTaskPermission.payloadOneof_ = e2Var.a();
                }
            }
            if (this.payloadOneofCase_ == 2) {
                e2<Response, Response.Builder, ResponseOrBuilder> e2Var2 = this.responseBuilder_;
                if (e2Var2 == null) {
                    renderingTaskPermission.payloadOneof_ = this.payloadOneof_;
                } else {
                    renderingTaskPermission.payloadOneof_ = e2Var2.a();
                }
            }
            renderingTaskPermission.payloadOneofCase_ = this.payloadOneofCase_;
            onBuilt();
            return renderingTaskPermission;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public RenderingTaskPermission mo164getDefaultInstanceForType() {
            return RenderingTaskPermission.getDefaultInstance();
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
            this.payloadOneofCase_ = 0;
            this.payloadOneof_ = null;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.payloadOneofCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RenderingTaskPermission) {
                return mergeFrom((RenderingTaskPermission) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            e2<Request, Request.Builder, RequestOrBuilder> e2Var = this.requestBuilder_;
            if (e2Var == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadOneofCase_ = 1;
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            e2<Response, Response.Builder, ResponseOrBuilder> e2Var = this.responseBuilder_;
            if (e2Var == null) {
                this.payloadOneof_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.payloadOneofCase_ = 2;
            return this;
        }

        public Builder mergeFrom(RenderingTaskPermission renderingTaskPermission) {
            if (renderingTaskPermission == RenderingTaskPermission.getDefaultInstance()) {
                return this;
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$rendering$RenderingTaskPermission$PayloadOneofCase[renderingTaskPermission.getPayloadOneofCase().ordinal()];
            if (i10 == 1) {
                mergeRequest(renderingTaskPermission.getRequest());
            } else if (i10 == 2) {
                mergeResponse(renderingTaskPermission.getResponse());
            }
            mergeUnknownFields(((j0) renderingTaskPermission).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            RenderingTaskPermission renderingTaskPermission = null;
            try {
                try {
                    RenderingTaskPermission renderingTaskPermission2 = (RenderingTaskPermission) RenderingTaskPermission.PARSER.parsePartialFrom(nVar, yVar);
                    if (renderingTaskPermission2 != null) {
                        mergeFrom(renderingTaskPermission2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    RenderingTaskPermission renderingTaskPermission3 = (RenderingTaskPermission) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        renderingTaskPermission = renderingTaskPermission3;
                        if (renderingTaskPermission != null) {
                            mergeFrom(renderingTaskPermission);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (renderingTaskPermission != null) {
                    mergeFrom(renderingTaskPermission);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(RenderingTaskPermission renderingTaskPermission) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(renderingTaskPermission);
    }

    public static RenderingTaskPermission parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private RenderingTaskPermission(j0.b<?> bVar) {
        super(bVar);
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RenderingTaskPermission parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (RenderingTaskPermission) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static RenderingTaskPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public RenderingTaskPermission mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RenderingTaskPermission parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static RenderingTaskPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    private RenderingTaskPermission() {
        this.payloadOneofCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RenderingTaskPermission parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static RenderingTaskPermission parseFrom(InputStream inputStream) throws IOException {
        return (RenderingTaskPermission) j0.parseWithIOException(PARSER, inputStream);
    }

    private RenderingTaskPermission(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                Request.Builder builder = this.payloadOneofCase_ == 1 ? ((Request) this.payloadOneof_).toBuilder() : null;
                                MessageLite messageLiteA = nVar.A(Request.parser(), yVar);
                                this.payloadOneof_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((Request) messageLiteA);
                                    this.payloadOneof_ = builder.buildPartial();
                                }
                                this.payloadOneofCase_ = 1;
                            } else if (iK != 18) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Response.Builder builder2 = this.payloadOneofCase_ == 2 ? ((Response) this.payloadOneof_).toBuilder() : null;
                                MessageLite messageLiteA2 = nVar.A(Response.parser(), yVar);
                                this.payloadOneof_ = messageLiteA2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((Response) messageLiteA2);
                                    this.payloadOneof_ = builder2.buildPartial();
                                }
                                this.payloadOneofCase_ = 2;
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

    public static RenderingTaskPermission parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (RenderingTaskPermission) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static RenderingTaskPermission parseFrom(n nVar) throws IOException {
        return (RenderingTaskPermission) j0.parseWithIOException(PARSER, nVar);
    }

    public static RenderingTaskPermission parseFrom(n nVar, y yVar) throws IOException {
        return (RenderingTaskPermission) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
