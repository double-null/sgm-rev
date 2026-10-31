package io.bidmachine.protobuf.sdk;

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

/* JADX INFO: loaded from: classes5.dex */
public final class OSLog extends j0 implements OSLogOrBuilder {
    private static final OSLog DEFAULT_INSTANCE = new OSLog();
    private static final s1<OSLog> PARSER = new b<OSLog>() { // from class: io.bidmachine.protobuf.sdk.OSLog.1
        @Override // com.explorestack.protobuf.s1
        public OSLog parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new OSLog(nVar, yVar);
        }
    };
    public static final int RECORDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Record> records_;

    public static final class Record extends j0 implements RecordOrBuilder {
        public static final int LEVEL_FIELD_NUMBER = 3;
        public static final int MESSAGE_FIELD_NUMBER = 5;
        public static final int SOURCE_FIELD_NUMBER = 4;
        public static final int TAG_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object level_;
        private byte memoizedIsInitialized;
        private volatile Object message_;
        private volatile Object source_;
        private volatile Object tag_;
        private Timestamp timestamp_;
        private static final Record DEFAULT_INSTANCE = new Record();
        private static final s1<Record> PARSER = new b<Record>() { // from class: io.bidmachine.protobuf.sdk.OSLog.Record.1
            @Override // com.explorestack.protobuf.s1
            public Record parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new Record(nVar, yVar);
            }
        };

        public static Record getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
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
            return (!hasTimestamp() || getTimestamp().equals(record.getTimestamp())) && getTag().equals(record.getTag()) && getLevel().equals(record.getLevel()) && getSource().equals(record.getSource()) && getMessage().equals(record.getMessage()) && this.unknownFields.equals(record.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getLevel() {
            Object obj = this.level_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.level_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getLevelBytes() {
            Object obj = this.level_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.level_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.message_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.message_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            if (!getTagBytes().isEmpty()) {
                iG += j0.computeStringSize(2, this.tag_);
            }
            if (!getLevelBytes().isEmpty()) {
                iG += j0.computeStringSize(3, this.level_);
            }
            if (!getSourceBytes().isEmpty()) {
                iG += j0.computeStringSize(4, this.source_);
            }
            if (!getMessageBytes().isEmpty()) {
                iG += j0.computeStringSize(5, this.message_);
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getSource() {
            Object obj = this.source_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.source_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public String getTag() {
            Object obj = this.tag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tag_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public ByteString getTagBytes() {
            Object obj = this.tag_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tag_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
        public n2 getTimestampOrBuilder() {
            return getTimestamp();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
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
            int iHashCode2 = (((((((((((((((((iHashCode * 37) + 2) * 53) + getTag().hashCode()) * 37) + 3) * 53) + getLevel().hashCode()) * 37) + 4) * 53) + getSource().hashCode()) * 37) + 5) * 53) + getMessage().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable.d(Record.class, Builder.class);
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
            if (!getTagBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 2, this.tag_);
            }
            if (!getLevelBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 3, this.level_);
            }
            if (!getSourceBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 4, this.source_);
            }
            if (!getMessageBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 5, this.message_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements RecordOrBuilder {
            private Object level_;
            private Object message_;
            private Object source_;
            private Object tag_;
            private e2<Timestamp, Timestamp.Builder, n2> timestampBuilder_;
            private Timestamp timestamp_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
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

            public Builder clearLevel() {
                this.level_ = Record.getDefaultInstance().getLevel();
                onChanged();
                return this;
            }

            public Builder clearMessage() {
                this.message_ = Record.getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.source_ = Record.getDefaultInstance().getSource();
                onChanged();
                return this;
            }

            public Builder clearTag() {
                this.tag_ = Record.getDefaultInstance().getTag();
                onChanged();
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
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getLevel() {
                Object obj = this.level_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.level_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getLevelBytes() {
                Object obj = this.level_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.level_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.message_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.message_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getSource() {
                Object obj = this.source_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.source_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getSourceBytes() {
                Object obj = this.source_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.source_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public String getTag() {
                Object obj = this.tag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tag_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public ByteString getTagBytes() {
                Object obj = this.tag_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tag_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
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

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public n2 getTimestampOrBuilder() {
                e2<Timestamp, Timestamp.Builder, n2> e2Var = this.timestampBuilder_;
                if (e2Var != null) {
                    return (n2) e2Var.f();
                }
                Timestamp timestamp = this.timestamp_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            @Override // io.bidmachine.protobuf.sdk.OSLog.RecordOrBuilder
            public boolean hasTimestamp() {
                return (this.timestampBuilder_ == null && this.timestamp_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable.d(Record.class, Builder.class);
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

            public Builder setLevel(String str) {
                str.getClass();
                this.level_ = str;
                onChanged();
                return this;
            }

            public Builder setLevelBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.level_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMessage(String str) {
                str.getClass();
                this.message_ = str;
                onChanged();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.message_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSource(String str) {
                str.getClass();
                this.source_ = str;
                onChanged();
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.source_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTag(String str) {
                str.getClass();
                this.tag_ = str;
                onChanged();
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.tag_ = byteString;
                onChanged();
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
                this.tag_ = "";
                this.level_ = "";
                this.source_ = "";
                this.message_ = "";
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
                record.tag_ = this.tag_;
                record.level_ = this.level_;
                record.source_ = this.source_;
                record.message_ = this.message_;
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

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.timestampBuilder_ == null) {
                    this.timestamp_ = null;
                } else {
                    this.timestamp_ = null;
                    this.timestampBuilder_ = null;
                }
                this.tag_ = "";
                this.level_ = "";
                this.source_ = "";
                this.message_ = "";
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

            private Builder(j0.c cVar) {
                super(cVar);
                this.tag_ = "";
                this.level_ = "";
                this.source_ = "";
                this.message_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Record record) {
                if (record == Record.getDefaultInstance()) {
                    return this;
                }
                if (record.hasTimestamp()) {
                    mergeTimestamp(record.getTimestamp());
                }
                if (!record.getTag().isEmpty()) {
                    this.tag_ = record.tag_;
                    onChanged();
                }
                if (!record.getLevel().isEmpty()) {
                    this.level_ = record.level_;
                    onChanged();
                }
                if (!record.getSource().isEmpty()) {
                    this.source_ = record.source_;
                    onChanged();
                }
                if (!record.getMessage().isEmpty()) {
                    this.message_ = record.message_;
                    onChanged();
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
            this.tag_ = "";
            this.level_ = "";
            this.source_ = "";
            this.message_ = "";
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

        public static Record parseFrom(InputStream inputStream) throws IOException {
            return (Record) j0.parseWithIOException(PARSER, inputStream);
        }

        public static Record parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Record) j0.parseWithIOException(PARSER, inputStream, yVar);
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
                                this.tag_ = nVar.J();
                            } else if (iK == 26) {
                                this.level_ = nVar.J();
                            } else if (iK == 34) {
                                this.source_ = nVar.J();
                            } else if (iK != 42) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                this.message_ = nVar.J();
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

        String getLevel();

        ByteString getLevelBytes();

        String getMessage();

        ByteString getMessageBytes();

        String getSource();

        ByteString getSourceBytes();

        String getTag();

        ByteString getTagBytes();

        Timestamp getTimestamp();

        n2 getTimestampOrBuilder();

        boolean hasTimestamp();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static OSLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static OSLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OSLog) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static OSLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<OSLog> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OSLog)) {
            return super.equals(obj);
        }
        OSLog oSLog = (OSLog) obj;
        return getRecordsList().equals(oSLog.getRecordsList()) && this.unknownFields.equals(oSLog.unknownFields);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<OSLog> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public Record getRecords(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public int getRecordsCount() {
        return this.records_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public List<Record> getRecordsList() {
        return this.records_;
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public RecordOrBuilder getRecordsOrBuilder(int i10) {
        return this.records_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
    public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
        return this.records_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.records_.size(); i11++) {
            iG += CodedOutputStream.G(1, this.records_.get(i11));
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
        if (getRecordsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getRecordsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable.d(OSLog.class, Builder.class);
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
        return new OSLog();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.records_.size(); i10++) {
            codedOutputStream.L0(1, this.records_.get(i10));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements OSLogOrBuilder {
        private int bitField0_;
        private z1<Record, Record.Builder, RecordOrBuilder> recordsBuilder_;
        private List<Record> records_;

        private void ensureRecordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.records_ = new ArrayList(this.records_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
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
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public int getRecordsCount() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public List<Record> getRecordsList() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.records_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public RecordOrBuilder getRecordsOrBuilder(int i10) {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var == null ? this.records_.get(i10) : (RecordOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.OSLogOrBuilder
        public List<? extends RecordOrBuilder> getRecordsOrBuilderList() {
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.records_);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable.d(OSLog.class, Builder.class);
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
            this.records_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OSLog build() {
            OSLog oSLogBuildPartial = buildPartial();
            if (oSLogBuildPartial.isInitialized()) {
                return oSLogBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) oSLogBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public OSLog buildPartial() {
            OSLog oSLog = new OSLog(this);
            int i10 = this.bitField0_;
            z1<Record, Record.Builder, RecordOrBuilder> z1Var = this.recordsBuilder_;
            if (z1Var == null) {
                if ((i10 & 1) != 0) {
                    this.records_ = Collections.unmodifiableList(this.records_);
                    this.bitField0_ &= -2;
                }
                oSLog.records_ = this.records_;
            } else {
                oSLog.records_ = z1Var.f();
            }
            onBuilt();
            return oSLog;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public OSLog mo164getDefaultInstanceForType() {
            return OSLog.getDefaultInstance();
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
            if (message instanceof OSLog) {
                return mergeFrom((OSLog) message);
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

        public Builder mergeFrom(OSLog oSLog) {
            if (oSLog == OSLog.getDefaultInstance()) {
                return this;
            }
            if (this.recordsBuilder_ == null) {
                if (!oSLog.records_.isEmpty()) {
                    if (this.records_.isEmpty()) {
                        this.records_ = oSLog.records_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRecordsIsMutable();
                        this.records_.addAll(oSLog.records_);
                    }
                    onChanged();
                }
            } else if (!oSLog.records_.isEmpty()) {
                if (!this.recordsBuilder_.t()) {
                    this.recordsBuilder_.a(oSLog.records_);
                } else {
                    this.recordsBuilder_.h();
                    this.recordsBuilder_ = null;
                    this.records_ = oSLog.records_;
                    this.bitField0_ &= -2;
                    this.recordsBuilder_ = j0.alwaysUseFieldBuilders ? getRecordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) oSLog).unknownFields);
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
            OSLog oSLog = null;
            try {
                try {
                    OSLog oSLog2 = (OSLog) OSLog.PARSER.parsePartialFrom(nVar, yVar);
                    if (oSLog2 != null) {
                        mergeFrom(oSLog2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    OSLog oSLog3 = (OSLog) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        oSLog = oSLog3;
                        if (oSLog != null) {
                            mergeFrom(oSLog);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oSLog != null) {
                    mergeFrom(oSLog);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(OSLog oSLog) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(oSLog);
    }

    public static OSLog parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private OSLog(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static OSLog parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (OSLog) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static OSLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public OSLog mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static OSLog parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private OSLog() {
        this.memoizedIsInitialized = (byte) -1;
        this.records_ = Collections.emptyList();
    }

    public static OSLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static OSLog parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static OSLog parseFrom(InputStream inputStream) throws IOException {
        return (OSLog) j0.parseWithIOException(PARSER, inputStream);
    }

    private OSLog(n nVar, y yVar) throws InvalidProtocolBufferException {
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

    public static OSLog parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (OSLog) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static OSLog parseFrom(n nVar) throws IOException {
        return (OSLog) j0.parseWithIOException(PARSER, nVar);
    }

    public static OSLog parseFrom(n nVar, y yVar) throws IOException {
        return (OSLog) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
