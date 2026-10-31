package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.a;
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
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class SDKEvent extends j0 implements SDKEventOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AD_TYPE_FIELD_NUMBER = 6;
    public static final int BILLABLE_FIELD_NUMBER = 10;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 9;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int FINISH_TIME_FIELD_NUMBER = 5;
    public static final int NETWORK_FIELD_NUMBER = 3;
    public static final int PRICE_FIELD_NUMBER = 7;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int action_;
    private StringValue adType_;
    private boolean billable_;
    private int bitField0_;
    private volatile Object context_;
    private Struct customParams_;
    private Error error_;
    private Timestamp finishTime_;
    private byte memoizedIsInitialized;
    private StringValue network_;
    private double price_;
    private Timestamp startTime_;
    private static final SDKEvent DEFAULT_INSTANCE = new SDKEvent();
    private static final s1<SDKEvent> PARSER = new b<SDKEvent>() { // from class: io.bidmachine.protobuf.analytics.events.SDKEvent.1
        @Override // com.explorestack.protobuf.s1
        public SDKEvent parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new SDKEvent(nVar, yVar);
        }
    };

    public static SDKEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<SDKEvent> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKEvent)) {
            return super.equals(obj);
        }
        SDKEvent sDKEvent = (SDKEvent) obj;
        if (getAction() != sDKEvent.getAction() || !getContext().equals(sDKEvent.getContext()) || hasNetwork() != sDKEvent.hasNetwork()) {
            return false;
        }
        if ((hasNetwork() && !getNetwork().equals(sDKEvent.getNetwork())) || hasStartTime() != sDKEvent.hasStartTime()) {
            return false;
        }
        if ((hasStartTime() && !getStartTime().equals(sDKEvent.getStartTime())) || hasFinishTime() != sDKEvent.hasFinishTime()) {
            return false;
        }
        if ((hasFinishTime() && !getFinishTime().equals(sDKEvent.getFinishTime())) || hasAdType() != sDKEvent.hasAdType()) {
            return false;
        }
        if ((hasAdType() && !getAdType().equals(sDKEvent.getAdType())) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(sDKEvent.getPrice()) || hasError() != sDKEvent.hasError()) {
            return false;
        }
        if ((hasError() && !getError().equals(sDKEvent.getError())) || hasCustomParams() != sDKEvent.hasCustomParams()) {
            return false;
        }
        if ((!hasCustomParams() || getCustomParams().equals(sDKEvent.getCustomParams())) && hasBillable() == sDKEvent.hasBillable()) {
            return (!hasBillable() || getBillable() == sDKEvent.getBillable()) && this.unknownFields.equals(sDKEvent.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public int getAction() {
        return this.action_;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getAdType() {
        StringValue stringValue = this.adType_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public h2 getAdTypeOrBuilder() {
        return getAdType();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean getBillable() {
        return this.billable_;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.context_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Struct getCustomParams() {
        Struct struct = this.customParams_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public i2 getCustomParamsOrBuilder() {
        return getCustomParams();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Error getError() {
        Error error = this.error_;
        return error == null ? Error.getDefaultInstance() : error;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public ErrorOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getFinishTime() {
        Timestamp timestamp = this.finishTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public n2 getFinishTimeOrBuilder() {
        return getFinishTime();
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public StringValue getNetwork() {
        StringValue stringValue = this.network_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public h2 getNetworkOrBuilder() {
        return getNetwork();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<SDKEvent> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public double getPrice() {
        return this.price_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.action_;
        int iY = i11 != 0 ? 0 + CodedOutputStream.Y(1, i11) : 0;
        if (!getContextBytes().isEmpty()) {
            iY += j0.computeStringSize(2, this.context_);
        }
        if (this.network_ != null) {
            iY += CodedOutputStream.G(3, getNetwork());
        }
        if (this.startTime_ != null) {
            iY += CodedOutputStream.G(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            iY += CodedOutputStream.G(5, getFinishTime());
        }
        if (this.adType_ != null) {
            iY += CodedOutputStream.G(6, getAdType());
        }
        double d10 = this.price_;
        if (d10 != 0.0d) {
            iY += CodedOutputStream.j(7, d10);
        }
        if (this.error_ != null) {
            iY += CodedOutputStream.G(8, getError());
        }
        if (this.customParams_ != null) {
            iY += CodedOutputStream.G(9, getCustomParams());
        }
        if ((this.bitField0_ & 1) != 0) {
            iY += CodedOutputStream.e(10, this.billable_);
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public n2 getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasAdType() {
        return this.adType_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasBillable() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasCustomParams() {
        return this.customParams_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasFinishTime() {
        return this.finishTime_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasNetwork() {
        return this.network_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAction()) * 37) + 2) * 53) + getContext().hashCode();
        if (hasNetwork()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getNetwork().hashCode();
        }
        if (hasStartTime()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getStartTime().hashCode();
        }
        if (hasFinishTime()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getFinishTime().hashCode();
        }
        if (hasAdType()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getAdType().hashCode();
        }
        int i11 = (((iHashCode * 37) + 7) * 53) + l0.i(Double.doubleToLongBits(getPrice()));
        if (hasError()) {
            i11 = (((i11 * 37) + 8) * 53) + getError().hashCode();
        }
        if (hasCustomParams()) {
            i11 = (((i11 * 37) + 9) * 53) + getCustomParams().hashCode();
        }
        if (hasBillable()) {
            i11 = (((i11 * 37) + 10) * 53) + l0.d(getBillable());
        }
        int iHashCode2 = (i11 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.d(SDKEvent.class, Builder.class);
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
        return new SDKEvent();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i10 = this.action_;
        if (i10 != 0) {
            codedOutputStream.c1(1, i10);
        }
        if (!getContextBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.context_);
        }
        if (this.network_ != null) {
            codedOutputStream.L0(3, getNetwork());
        }
        if (this.startTime_ != null) {
            codedOutputStream.L0(4, getStartTime());
        }
        if (this.finishTime_ != null) {
            codedOutputStream.L0(5, getFinishTime());
        }
        if (this.adType_ != null) {
            codedOutputStream.L0(6, getAdType());
        }
        double d10 = this.price_;
        if (d10 != 0.0d) {
            codedOutputStream.t0(7, d10);
        }
        if (this.error_ != null) {
            codedOutputStream.L0(8, getError());
        }
        if (this.customParams_ != null) {
            codedOutputStream.L0(9, getCustomParams());
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.n0(10, this.billable_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements SDKEventOrBuilder {
        private int action_;
        private e2<StringValue, StringValue.Builder, h2> adTypeBuilder_;
        private StringValue adType_;
        private boolean billable_;
        private int bitField0_;
        private Object context_;
        private e2<Struct, Struct.Builder, i2> customParamsBuilder_;
        private Struct customParams_;
        private e2<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
        private Error error_;
        private e2<Timestamp, Timestamp.Builder, n2> finishTimeBuilder_;
        private Timestamp finishTime_;
        private e2<StringValue, StringValue.Builder, h2> networkBuilder_;
        private StringValue network_;
        private double price_;
        private e2<Timestamp, Timestamp.Builder, n2> startTimeBuilder_;
        private Timestamp startTime_;

        private e2<StringValue, StringValue.Builder, h2> getAdTypeFieldBuilder() {
            if (this.adTypeBuilder_ == null) {
                this.adTypeBuilder_ = new e2<>(getAdType(), getParentForChildren(), isClean());
                this.adType_ = null;
            }
            return this.adTypeBuilder_;
        }

        private e2<Struct, Struct.Builder, i2> getCustomParamsFieldBuilder() {
            if (this.customParamsBuilder_ == null) {
                this.customParamsBuilder_ = new e2<>(getCustomParams(), getParentForChildren(), isClean());
                this.customParams_ = null;
            }
            return this.customParamsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        private e2<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new e2<>(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getFinishTimeFieldBuilder() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTimeBuilder_ = new e2<>(getFinishTime(), getParentForChildren(), isClean());
                this.finishTime_ = null;
            }
            return this.finishTimeBuilder_;
        }

        private e2<StringValue, StringValue.Builder, h2> getNetworkFieldBuilder() {
            if (this.networkBuilder_ == null) {
                this.networkBuilder_ = new e2<>(getNetwork(), getParentForChildren(), isClean());
                this.network_ = null;
            }
            return this.networkBuilder_;
        }

        private e2<Timestamp, Timestamp.Builder, n2> getStartTimeFieldBuilder() {
            if (this.startTimeBuilder_ == null) {
                this.startTimeBuilder_ = new e2<>(getStartTime(), getParentForChildren(), isClean());
                this.startTime_ = null;
            }
            return this.startTimeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearAction() {
            this.action_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdType() {
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
                onChanged();
            } else {
                this.adType_ = null;
                this.adTypeBuilder_ = null;
            }
            return this;
        }

        public Builder clearBillable() {
            this.bitField0_ &= -2;
            this.billable_ = false;
            onChanged();
            return this;
        }

        public Builder clearContext() {
            this.context_ = SDKEvent.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
                onChanged();
            } else {
                this.customParams_ = null;
                this.customParamsBuilder_ = null;
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

        public Builder clearFinishTime() {
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
                onChanged();
            } else {
                this.finishTime_ = null;
                this.finishTimeBuilder_ = null;
            }
            return this;
        }

        public Builder clearNetwork() {
            if (this.networkBuilder_ == null) {
                this.network_ = null;
                onChanged();
            } else {
                this.network_ = null;
                this.networkBuilder_ = null;
            }
            return this;
        }

        public Builder clearPrice() {
            this.price_ = 0.0d;
            onChanged();
            return this;
        }

        public Builder clearStartTime() {
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
                onChanged();
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public int getAction() {
            return this.action_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getAdType() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.adTypeBuilder_;
            if (e2Var != null) {
                return (StringValue) e2Var.e();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getAdTypeBuilder() {
            onChanged();
            return (StringValue.Builder) getAdTypeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public h2 getAdTypeOrBuilder() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.adTypeBuilder_;
            if (e2Var != null) {
                return (h2) e2Var.f();
            }
            StringValue stringValue = this.adType_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean getBillable() {
            return this.billable_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Struct getCustomParams() {
            e2<Struct, Struct.Builder, i2> e2Var = this.customParamsBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getCustomParamsBuilder() {
            onChanged();
            return (Struct.Builder) getCustomParamsFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public i2 getCustomParamsOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.customParamsBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.customParams_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
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

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public ErrorOrBuilder getErrorOrBuilder() {
            e2<Error, Error.Builder, ErrorOrBuilder> e2Var = this.errorBuilder_;
            if (e2Var != null) {
                return (ErrorOrBuilder) e2Var.f();
            }
            Error error = this.error_;
            return error == null ? Error.getDefaultInstance() : error;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getFinishTime() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.finishTimeBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getFinishTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFinishTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public n2 getFinishTimeOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.finishTimeBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.finishTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public StringValue getNetwork() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.networkBuilder_;
            if (e2Var != null) {
                return (StringValue) e2Var.e();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getNetworkBuilder() {
            onChanged();
            return (StringValue.Builder) getNetworkFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public h2 getNetworkOrBuilder() {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.networkBuilder_;
            if (e2Var != null) {
                return (h2) e2Var.f();
            }
            StringValue stringValue = this.network_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public double getPrice() {
            return this.price_;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public Timestamp getStartTime() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startTimeBuilder_;
            if (e2Var != null) {
                return (Timestamp) e2Var.e();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getStartTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getStartTimeFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public n2 getStartTimeOrBuilder() {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startTimeBuilder_;
            if (e2Var != null) {
                return (n2) e2Var.f();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasAdType() {
            return (this.adTypeBuilder_ == null && this.adType_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasBillable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasCustomParams() {
            return (this.customParamsBuilder_ == null && this.customParams_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasFinishTime() {
            return (this.finishTimeBuilder_ == null && this.finishTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasNetwork() {
            return (this.networkBuilder_ == null && this.network_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.events.SDKEventOrBuilder
        public boolean hasStartTime() {
            return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return EventsProto.internal_static_bidmachine_protobuf_analytics_events_SDKEvent_fieldAccessorTable.d(SDKEvent.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAdType(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.adTypeBuilder_;
            if (e2Var == null) {
                StringValue stringValue2 = this.adType_;
                if (stringValue2 != null) {
                    this.adType_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.adType_ = stringValue;
                }
                onChanged();
            } else {
                e2Var.g(stringValue);
            }
            return this;
        }

        public Builder mergeCustomParams(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.customParamsBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.customParams_;
                if (struct2 != null) {
                    this.customParams_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.customParams_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
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

        public Builder mergeFinishTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.finishTimeBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.finishTime_;
                if (timestamp2 != null) {
                    this.finishTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.finishTime_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder mergeNetwork(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.networkBuilder_;
            if (e2Var == null) {
                StringValue stringValue2 = this.network_;
                if (stringValue2 != null) {
                    this.network_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.network_ = stringValue;
                }
                onChanged();
            } else {
                e2Var.g(stringValue);
            }
            return this;
        }

        public Builder mergeStartTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startTimeBuilder_;
            if (e2Var == null) {
                Timestamp timestamp2 = this.startTime_;
                if (timestamp2 != null) {
                    this.startTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.startTime_ = timestamp;
                }
                onChanged();
            } else {
                e2Var.g(timestamp);
            }
            return this;
        }

        public Builder setAction(int i10) {
            this.action_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdType(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.adTypeBuilder_;
            if (e2Var == null) {
                stringValue.getClass();
                this.adType_ = stringValue;
                onChanged();
            } else {
                e2Var.i(stringValue);
            }
            return this;
        }

        public Builder setBillable(boolean z10) {
            this.bitField0_ |= 1;
            this.billable_ = z10;
            onChanged();
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

        public Builder setCustomParams(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.customParamsBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.customParams_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
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

        public Builder setFinishTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.finishTimeBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.finishTime_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        public Builder setNetwork(StringValue stringValue) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.networkBuilder_;
            if (e2Var == null) {
                stringValue.getClass();
                this.network_ = stringValue;
                onChanged();
            } else {
                e2Var.i(stringValue);
            }
            return this;
        }

        public Builder setPrice(double d10) {
            this.price_ = d10;
            onChanged();
            return this;
        }

        public Builder setStartTime(Timestamp timestamp) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startTimeBuilder_;
            if (e2Var == null) {
                timestamp.getClass();
                this.startTime_ = timestamp;
                onChanged();
            } else {
                e2Var.i(timestamp);
            }
            return this;
        }

        private Builder() {
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent build() {
            SDKEvent sDKEventBuildPartial = buildPartial();
            if (sDKEventBuildPartial.isInitialized()) {
                return sDKEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sDKEventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDKEvent buildPartial() {
            SDKEvent sDKEvent = new SDKEvent(this);
            int i10 = this.bitField0_;
            sDKEvent.action_ = this.action_;
            sDKEvent.context_ = this.context_;
            e2<StringValue, StringValue.Builder, h2> e2Var = this.networkBuilder_;
            if (e2Var == null) {
                sDKEvent.network_ = this.network_;
            } else {
                sDKEvent.network_ = (StringValue) e2Var.a();
            }
            e2<Timestamp, Timestamp.Builder, n2> e2Var2 = this.startTimeBuilder_;
            if (e2Var2 == null) {
                sDKEvent.startTime_ = this.startTime_;
            } else {
                sDKEvent.startTime_ = (Timestamp) e2Var2.a();
            }
            e2<Timestamp, Timestamp.Builder, n2> e2Var3 = this.finishTimeBuilder_;
            if (e2Var3 == null) {
                sDKEvent.finishTime_ = this.finishTime_;
            } else {
                sDKEvent.finishTime_ = (Timestamp) e2Var3.a();
            }
            e2<StringValue, StringValue.Builder, h2> e2Var4 = this.adTypeBuilder_;
            if (e2Var4 == null) {
                sDKEvent.adType_ = this.adType_;
            } else {
                sDKEvent.adType_ = (StringValue) e2Var4.a();
            }
            sDKEvent.price_ = this.price_;
            e2<Error, Error.Builder, ErrorOrBuilder> e2Var5 = this.errorBuilder_;
            if (e2Var5 == null) {
                sDKEvent.error_ = this.error_;
            } else {
                sDKEvent.error_ = (Error) e2Var5.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var6 = this.customParamsBuilder_;
            if (e2Var6 == null) {
                sDKEvent.customParams_ = this.customParams_;
            } else {
                sDKEvent.customParams_ = (Struct) e2Var6.a();
            }
            int i11 = 1;
            if ((i10 & 1) != 0) {
                sDKEvent.billable_ = this.billable_;
            } else {
                i11 = 0;
            }
            sDKEvent.bitField0_ = i11;
            onBuilt();
            return sDKEvent;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public SDKEvent mo164getDefaultInstanceForType() {
            return SDKEvent.getDefaultInstance();
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
            this.action_ = 0;
            this.context_ = "";
            if (this.networkBuilder_ == null) {
                this.network_ = null;
            } else {
                this.network_ = null;
                this.networkBuilder_ = null;
            }
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            if (this.finishTimeBuilder_ == null) {
                this.finishTime_ = null;
            } else {
                this.finishTime_ = null;
                this.finishTimeBuilder_ = null;
            }
            if (this.adTypeBuilder_ == null) {
                this.adType_ = null;
            } else {
                this.adType_ = null;
                this.adTypeBuilder_ = null;
            }
            this.price_ = 0.0d;
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.customParamsBuilder_ == null) {
                this.customParams_ = null;
            } else {
                this.customParams_ = null;
                this.customParamsBuilder_ = null;
            }
            this.billable_ = false;
            this.bitField0_ &= -2;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.context_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setAdType(StringValue.Builder builder) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.adTypeBuilder_;
            if (e2Var == null) {
                this.adType_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setCustomParams(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.customParamsBuilder_;
            if (e2Var == null) {
                this.customParams_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
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

        public Builder setFinishTime(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.finishTimeBuilder_;
            if (e2Var == null) {
                this.finishTime_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setNetwork(StringValue.Builder builder) {
            e2<StringValue, StringValue.Builder, h2> e2Var = this.networkBuilder_;
            if (e2Var == null) {
                this.network_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setStartTime(Timestamp.Builder builder) {
            e2<Timestamp, Timestamp.Builder, n2> e2Var = this.startTimeBuilder_;
            if (e2Var == null) {
                this.startTime_ = builder.build();
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
            if (message instanceof SDKEvent) {
                return mergeFrom((SDKEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SDKEvent sDKEvent) {
            if (sDKEvent == SDKEvent.getDefaultInstance()) {
                return this;
            }
            if (sDKEvent.getAction() != 0) {
                setAction(sDKEvent.getAction());
            }
            if (!sDKEvent.getContext().isEmpty()) {
                this.context_ = sDKEvent.context_;
                onChanged();
            }
            if (sDKEvent.hasNetwork()) {
                mergeNetwork(sDKEvent.getNetwork());
            }
            if (sDKEvent.hasStartTime()) {
                mergeStartTime(sDKEvent.getStartTime());
            }
            if (sDKEvent.hasFinishTime()) {
                mergeFinishTime(sDKEvent.getFinishTime());
            }
            if (sDKEvent.hasAdType()) {
                mergeAdType(sDKEvent.getAdType());
            }
            if (sDKEvent.getPrice() != 0.0d) {
                setPrice(sDKEvent.getPrice());
            }
            if (sDKEvent.hasError()) {
                mergeError(sDKEvent.getError());
            }
            if (sDKEvent.hasCustomParams()) {
                mergeCustomParams(sDKEvent.getCustomParams());
            }
            if (sDKEvent.hasBillable()) {
                setBillable(sDKEvent.getBillable());
            }
            mergeUnknownFields(((j0) sDKEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            SDKEvent sDKEvent = null;
            try {
                try {
                    SDKEvent sDKEvent2 = (SDKEvent) SDKEvent.PARSER.parsePartialFrom(nVar, yVar);
                    if (sDKEvent2 != null) {
                        mergeFrom(sDKEvent2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    SDKEvent sDKEvent3 = (SDKEvent) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        sDKEvent = sDKEvent3;
                        if (sDKEvent != null) {
                            mergeFrom(sDKEvent);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (sDKEvent != null) {
                    mergeFrom(sDKEvent);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(SDKEvent sDKEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKEvent);
    }

    public static SDKEvent parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private SDKEvent(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDKEvent parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (SDKEvent) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static SDKEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public SDKEvent mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDKEvent parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDKEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.context_ = "";
    }

    public static SDKEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static SDKEvent parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static SDKEvent parseFrom(InputStream inputStream) throws IOException {
        return (SDKEvent) j0.parseWithIOException(PARSER, inputStream);
    }

    private SDKEvent(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                        case 8:
                            this.action_ = nVar.L();
                            continue;
                        case 18:
                            this.context_ = nVar.J();
                            continue;
                        case 26:
                            StringValue stringValue = this.network_;
                            StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                            StringValue stringValue2 = (StringValue) nVar.A(StringValue.parser(), yVar);
                            this.network_ = stringValue2;
                            if (builder != null) {
                                builder.mergeFrom(stringValue2);
                                this.network_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 34:
                            Timestamp timestamp = this.startTime_;
                            Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                            Timestamp timestamp2 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.startTime_ = timestamp2;
                            if (builder2 != null) {
                                builder2.mergeFrom(timestamp2);
                                this.startTime_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 42:
                            Timestamp timestamp3 = this.finishTime_;
                            Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                            Timestamp timestamp4 = (Timestamp) nVar.A(Timestamp.parser(), yVar);
                            this.finishTime_ = timestamp4;
                            if (builder3 != null) {
                                builder3.mergeFrom(timestamp4);
                                this.finishTime_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 50:
                            StringValue stringValue3 = this.adType_;
                            StringValue.Builder builder4 = stringValue3 != null ? stringValue3.toBuilder() : null;
                            StringValue stringValue4 = (StringValue) nVar.A(StringValue.parser(), yVar);
                            this.adType_ = stringValue4;
                            if (builder4 != null) {
                                builder4.mergeFrom(stringValue4);
                                this.adType_ = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 57:
                            this.price_ = nVar.s();
                            continue;
                        case 66:
                            Error error = this.error_;
                            Error.Builder builder5 = error != null ? error.toBuilder() : null;
                            Error error2 = (Error) nVar.A(Error.parser(), yVar);
                            this.error_ = error2;
                            if (builder5 != null) {
                                builder5.mergeFrom(error2);
                                this.error_ = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 74:
                            Struct struct = this.customParams_;
                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                            this.customParams_ = struct2;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct2);
                                this.customParams_ = builder6.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 80:
                            this.bitField0_ |= 1;
                            this.billable_ = nVar.q();
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

    public static SDKEvent parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (SDKEvent) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static SDKEvent parseFrom(n nVar) throws IOException {
        return (SDKEvent) j0.parseWithIOException(PARSER, nVar);
    }

    public static SDKEvent parseFrom(n nVar, y yVar) throws IOException {
        return (SDKEvent) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
