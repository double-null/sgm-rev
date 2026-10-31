package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
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
public final class ViewabilityRule extends j0 implements ViewabilityRuleOrBuilder {
    public static final int BILLABLE_FIELD_NUMBER = 2;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int MEASUREMENT_FIELD_NUMBER = 3;
    public static final int REQUIRED_METRICS_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private boolean billable_;
    private int event_;
    private Measurement measurement_;
    private byte memoizedIsInitialized;
    private List<MetricRequirement> requiredMetrics_;
    private static final ViewabilityRule DEFAULT_INSTANCE = new ViewabilityRule();
    private static final s1<ViewabilityRule> PARSER = new b<ViewabilityRule>() { // from class: io.bidmachine.protobuf.sdk.ViewabilityRule.1
        @Override // com.explorestack.protobuf.s1
        public ViewabilityRule parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new ViewabilityRule(nVar, yVar);
        }
    };

    public static ViewabilityRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ViewabilityRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewabilityRule) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ViewabilityRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<ViewabilityRule> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewabilityRule)) {
            return super.equals(obj);
        }
        ViewabilityRule viewabilityRule = (ViewabilityRule) obj;
        if (getEvent() == viewabilityRule.getEvent() && getBillable() == viewabilityRule.getBillable() && hasMeasurement() == viewabilityRule.hasMeasurement()) {
            return (!hasMeasurement() || getMeasurement().equals(viewabilityRule.getMeasurement())) && getRequiredMetricsList().equals(viewabilityRule.getRequiredMetricsList()) && this.unknownFields.equals(viewabilityRule.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public boolean getBillable() {
        return this.billable_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public int getEvent() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public Measurement getMeasurement() {
        Measurement measurement = this.measurement_;
        return measurement == null ? Measurement.getDefaultInstance() : measurement;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MeasurementOrBuilder getMeasurementOrBuilder() {
        return getMeasurement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<ViewabilityRule> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MetricRequirement getRequiredMetrics(int i10) {
        return this.requiredMetrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public int getRequiredMetricsCount() {
        return this.requiredMetrics_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public List<MetricRequirement> getRequiredMetricsList() {
        return this.requiredMetrics_;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i10) {
        return this.requiredMetrics_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList() {
        return this.requiredMetrics_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.event_;
        int iY = i11 != 0 ? CodedOutputStream.Y(1, i11) + 0 : 0;
        boolean z10 = this.billable_;
        if (z10) {
            iY += CodedOutputStream.e(2, z10);
        }
        if (this.measurement_ != null) {
            iY += CodedOutputStream.G(3, getMeasurement());
        }
        for (int i12 = 0; i12 < this.requiredMetrics_.size(); i12++) {
            iY += CodedOutputStream.G(5, this.requiredMetrics_.get(i12));
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
    public boolean hasMeasurement() {
        return this.measurement_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEvent()) * 37) + 2) * 53) + l0.d(getBillable());
        if (hasMeasurement()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getMeasurement().hashCode();
        }
        if (getRequiredMetricsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getRequiredMetricsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable.d(ViewabilityRule.class, Builder.class);
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
        return new ViewabilityRule();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i10 = this.event_;
        if (i10 != 0) {
            codedOutputStream.c1(1, i10);
        }
        boolean z10 = this.billable_;
        if (z10) {
            codedOutputStream.n0(2, z10);
        }
        if (this.measurement_ != null) {
            codedOutputStream.L0(3, getMeasurement());
        }
        for (int i11 = 0; i11 < this.requiredMetrics_.size(); i11++) {
            codedOutputStream.L0(5, this.requiredMetrics_.get(i11));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements ViewabilityRuleOrBuilder {
        private boolean billable_;
        private int bitField0_;
        private int event_;
        private e2<Measurement, Measurement.Builder, MeasurementOrBuilder> measurementBuilder_;
        private Measurement measurement_;
        private z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> requiredMetricsBuilder_;
        private List<MetricRequirement> requiredMetrics_;

        private void ensureRequiredMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requiredMetrics_ = new ArrayList(this.requiredMetrics_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
        }

        private e2<Measurement, Measurement.Builder, MeasurementOrBuilder> getMeasurementFieldBuilder() {
            if (this.measurementBuilder_ == null) {
                this.measurementBuilder_ = new e2<>(getMeasurement(), getParentForChildren(), isClean());
                this.measurement_ = null;
            }
            return this.measurementBuilder_;
        }

        private z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> getRequiredMetricsFieldBuilder() {
            if (this.requiredMetricsBuilder_ == null) {
                this.requiredMetricsBuilder_ = new z1<>(this.requiredMetrics_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.requiredMetrics_ = null;
            }
            return this.requiredMetricsBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getRequiredMetricsFieldBuilder();
            }
        }

        public Builder addAllRequiredMetrics(Iterable<? extends MetricRequirement> iterable) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                ensureRequiredMetricsIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.requiredMetrics_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addRequiredMetrics(MetricRequirement metricRequirement) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(metricRequirement);
                onChanged();
            } else {
                z1Var.e(metricRequirement);
            }
            return this;
        }

        public MetricRequirement.Builder addRequiredMetricsBuilder() {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().c(MetricRequirement.getDefaultInstance());
        }

        public Builder clearBillable() {
            this.billable_ = false;
            onChanged();
            return this;
        }

        public Builder clearEvent() {
            this.event_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMeasurement() {
            if (this.measurementBuilder_ == null) {
                this.measurement_ = null;
                onChanged();
            } else {
                this.measurement_ = null;
                this.measurementBuilder_ = null;
            }
            return this;
        }

        public Builder clearRequiredMetrics() {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                this.requiredMetrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public boolean getBillable() {
            return this.billable_;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public int getEvent() {
            return this.event_;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public Measurement getMeasurement() {
            e2<Measurement, Measurement.Builder, MeasurementOrBuilder> e2Var = this.measurementBuilder_;
            if (e2Var != null) {
                return (Measurement) e2Var.e();
            }
            Measurement measurement = this.measurement_;
            return measurement == null ? Measurement.getDefaultInstance() : measurement;
        }

        public Measurement.Builder getMeasurementBuilder() {
            onChanged();
            return (Measurement.Builder) getMeasurementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MeasurementOrBuilder getMeasurementOrBuilder() {
            e2<Measurement, Measurement.Builder, MeasurementOrBuilder> e2Var = this.measurementBuilder_;
            if (e2Var != null) {
                return (MeasurementOrBuilder) e2Var.f();
            }
            Measurement measurement = this.measurement_;
            return measurement == null ? Measurement.getDefaultInstance() : measurement;
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MetricRequirement getRequiredMetrics(int i10) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            return z1Var == null ? this.requiredMetrics_.get(i10) : (MetricRequirement) z1Var.n(i10);
        }

        public MetricRequirement.Builder getRequiredMetricsBuilder(int i10) {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().k(i10);
        }

        public List<MetricRequirement.Builder> getRequiredMetricsBuilderList() {
            return getRequiredMetricsFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public int getRequiredMetricsCount() {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            return z1Var == null ? this.requiredMetrics_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public List<MetricRequirement> getRequiredMetricsList() {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.requiredMetrics_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i10) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            return z1Var == null ? this.requiredMetrics_.get(i10) : (MetricRequirementOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList() {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.requiredMetrics_);
        }

        @Override // io.bidmachine.protobuf.sdk.ViewabilityRuleOrBuilder
        public boolean hasMeasurement() {
            return (this.measurementBuilder_ == null && this.measurement_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_ViewabilityRule_fieldAccessorTable.d(ViewabilityRule.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeMeasurement(Measurement measurement) {
            e2<Measurement, Measurement.Builder, MeasurementOrBuilder> e2Var = this.measurementBuilder_;
            if (e2Var == null) {
                Measurement measurement2 = this.measurement_;
                if (measurement2 != null) {
                    this.measurement_ = Measurement.newBuilder(measurement2).mergeFrom(measurement).buildPartial();
                } else {
                    this.measurement_ = measurement;
                }
                onChanged();
            } else {
                e2Var.g(measurement);
            }
            return this;
        }

        public Builder removeRequiredMetrics(int i10) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setBillable(boolean z10) {
            this.billable_ = z10;
            onChanged();
            return this;
        }

        public Builder setEvent(int i10) {
            this.event_ = i10;
            onChanged();
            return this;
        }

        public Builder setMeasurement(Measurement measurement) {
            e2<Measurement, Measurement.Builder, MeasurementOrBuilder> e2Var = this.measurementBuilder_;
            if (e2Var == null) {
                measurement.getClass();
                this.measurement_ = measurement;
                onChanged();
            } else {
                e2Var.i(measurement);
            }
            return this;
        }

        public Builder setRequiredMetrics(int i10, MetricRequirement metricRequirement) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.set(i10, metricRequirement);
                onChanged();
            } else {
                z1Var.w(i10, metricRequirement);
            }
            return this;
        }

        private Builder() {
            this.requiredMetrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityRule build() {
            ViewabilityRule viewabilityRuleBuildPartial = buildPartial();
            if (viewabilityRuleBuildPartial.isInitialized()) {
                return viewabilityRuleBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) viewabilityRuleBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ViewabilityRule buildPartial() {
            ViewabilityRule viewabilityRule = new ViewabilityRule(this);
            viewabilityRule.event_ = this.event_;
            viewabilityRule.billable_ = this.billable_;
            e2<Measurement, Measurement.Builder, MeasurementOrBuilder> e2Var = this.measurementBuilder_;
            if (e2Var == null) {
                viewabilityRule.measurement_ = this.measurement_;
            } else {
                viewabilityRule.measurement_ = (Measurement) e2Var.a();
            }
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var != null) {
                viewabilityRule.requiredMetrics_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
                    this.bitField0_ &= -2;
                }
                viewabilityRule.requiredMetrics_ = this.requiredMetrics_;
            }
            onBuilt();
            return viewabilityRule;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public ViewabilityRule mo164getDefaultInstanceForType() {
            return ViewabilityRule.getDefaultInstance();
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

        public MetricRequirement.Builder addRequiredMetricsBuilder(int i10) {
            return (MetricRequirement.Builder) getRequiredMetricsFieldBuilder().b(i10, MetricRequirement.getDefaultInstance());
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
            this.event_ = 0;
            this.billable_ = false;
            if (this.measurementBuilder_ == null) {
                this.measurement_ = null;
            } else {
                this.measurement_ = null;
                this.measurementBuilder_ = null;
            }
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                this.requiredMetrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.requiredMetrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder setMeasurement(Measurement.Builder builder) {
            e2<Measurement, Measurement.Builder, MeasurementOrBuilder> e2Var = this.measurementBuilder_;
            if (e2Var == null) {
                this.measurement_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder addRequiredMetrics(int i10, MetricRequirement metricRequirement) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                metricRequirement.getClass();
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(i10, metricRequirement);
                onChanged();
            } else {
                z1Var.d(i10, metricRequirement);
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
            if (message instanceof ViewabilityRule) {
                return mergeFrom((ViewabilityRule) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setRequiredMetrics(int i10, MetricRequirement.Builder builder) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(ViewabilityRule viewabilityRule) {
            if (viewabilityRule == ViewabilityRule.getDefaultInstance()) {
                return this;
            }
            if (viewabilityRule.getEvent() != 0) {
                setEvent(viewabilityRule.getEvent());
            }
            if (viewabilityRule.getBillable()) {
                setBillable(viewabilityRule.getBillable());
            }
            if (viewabilityRule.hasMeasurement()) {
                mergeMeasurement(viewabilityRule.getMeasurement());
            }
            if (this.requiredMetricsBuilder_ == null) {
                if (!viewabilityRule.requiredMetrics_.isEmpty()) {
                    if (this.requiredMetrics_.isEmpty()) {
                        this.requiredMetrics_ = viewabilityRule.requiredMetrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequiredMetricsIsMutable();
                        this.requiredMetrics_.addAll(viewabilityRule.requiredMetrics_);
                    }
                    onChanged();
                }
            } else if (!viewabilityRule.requiredMetrics_.isEmpty()) {
                if (!this.requiredMetricsBuilder_.t()) {
                    this.requiredMetricsBuilder_.a(viewabilityRule.requiredMetrics_);
                } else {
                    this.requiredMetricsBuilder_.h();
                    this.requiredMetricsBuilder_ = null;
                    this.requiredMetrics_ = viewabilityRule.requiredMetrics_;
                    this.bitField0_ &= -2;
                    this.requiredMetricsBuilder_ = j0.alwaysUseFieldBuilders ? getRequiredMetricsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) viewabilityRule).unknownFields);
            onChanged();
            return this;
        }

        public Builder addRequiredMetrics(MetricRequirement.Builder builder) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addRequiredMetrics(int i10, MetricRequirement.Builder builder) {
            z1<MetricRequirement, MetricRequirement.Builder, MetricRequirementOrBuilder> z1Var = this.requiredMetricsBuilder_;
            if (z1Var == null) {
                ensureRequiredMetricsIsMutable();
                this.requiredMetrics_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            ViewabilityRule viewabilityRule = null;
            try {
                try {
                    ViewabilityRule viewabilityRule2 = (ViewabilityRule) ViewabilityRule.PARSER.parsePartialFrom(nVar, yVar);
                    if (viewabilityRule2 != null) {
                        mergeFrom(viewabilityRule2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    ViewabilityRule viewabilityRule3 = (ViewabilityRule) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        viewabilityRule = viewabilityRule3;
                        if (viewabilityRule != null) {
                            mergeFrom(viewabilityRule);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (viewabilityRule != null) {
                    mergeFrom(viewabilityRule);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(ViewabilityRule viewabilityRule) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(viewabilityRule);
    }

    public static ViewabilityRule parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private ViewabilityRule(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ViewabilityRule parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (ViewabilityRule) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static ViewabilityRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public ViewabilityRule mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ViewabilityRule parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ViewabilityRule() {
        this.memoizedIsInitialized = (byte) -1;
        this.requiredMetrics_ = Collections.emptyList();
    }

    public static ViewabilityRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static ViewabilityRule parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static ViewabilityRule parseFrom(InputStream inputStream) throws IOException {
        return (ViewabilityRule) j0.parseWithIOException(PARSER, inputStream);
    }

    private ViewabilityRule(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            this.event_ = nVar.L();
                        } else if (iK == 16) {
                            this.billable_ = nVar.q();
                        } else if (iK == 26) {
                            Measurement measurement = this.measurement_;
                            Measurement.Builder builder = measurement != null ? measurement.toBuilder() : null;
                            Measurement measurement2 = (Measurement) nVar.A(Measurement.parser(), yVar);
                            this.measurement_ = measurement2;
                            if (builder != null) {
                                builder.mergeFrom(measurement2);
                                this.measurement_ = builder.buildPartial();
                            }
                        } else if (iK != 42) {
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                            }
                        } else {
                            if (!(z11 & true)) {
                                this.requiredMetrics_ = new ArrayList();
                                z11 |= true;
                            }
                            this.requiredMetrics_.add((MetricRequirement) nVar.A(MetricRequirement.parser(), yVar));
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
                    this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z11 & true) {
            this.requiredMetrics_ = Collections.unmodifiableList(this.requiredMetrics_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static ViewabilityRule parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (ViewabilityRule) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static ViewabilityRule parseFrom(n nVar) throws IOException {
        return (ViewabilityRule) j0.parseWithIOException(PARSER, nVar);
    }

    public static ViewabilityRule parseFrom(n nVar, y yVar) throws IOException {
        return (ViewabilityRule) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
