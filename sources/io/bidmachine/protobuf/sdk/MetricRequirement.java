package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
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
public final class MetricRequirement extends j0 implements MetricRequirementOrBuilder {
    public static final int GEOMETRY_FIELD_NUMBER = 5;
    public static final int LIFECYCLE_FIELD_NUMBER = 7;
    public static final int MEASUREMENT_INDEX_FIELD_NUMBER = 1;
    public static final int OVERLAP_FIELD_NUMBER = 8;
    public static final int VISIBILITY_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int measurementIndex_;
    private byte memoizedIsInitialized;
    private int metricCase_;
    private Object metric_;
    private static final MetricRequirement DEFAULT_INSTANCE = new MetricRequirement();
    private static final s1<MetricRequirement> PARSER = new b<MetricRequirement>() { // from class: io.bidmachine.protobuf.sdk.MetricRequirement.1
        @Override // com.explorestack.protobuf.s1
        public MetricRequirement parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new MetricRequirement(nVar, yVar);
        }
    };

    /* JADX INFO: renamed from: io.bidmachine.protobuf.sdk.MetricRequirement$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase;

        static {
            int[] iArr = new int[MetricCase.values().length];
            $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase = iArr;
            try {
                iArr[MetricCase.GEOMETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.VISIBILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.LIFECYCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.OVERLAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[MetricCase.METRIC_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum MetricCase implements l0.c {
        GEOMETRY(5),
        VISIBILITY(6),
        LIFECYCLE(7),
        OVERLAP(8),
        METRIC_NOT_SET(0);

        private final int value;

        MetricCase(int i10) {
            this.value = i10;
        }

        public static MetricCase forNumber(int i10) {
            if (i10 == 0) {
                return METRIC_NOT_SET;
            }
            if (i10 == 5) {
                return GEOMETRY;
            }
            if (i10 == 6) {
                return VISIBILITY;
            }
            if (i10 == 7) {
                return LIFECYCLE;
            }
            if (i10 != 8) {
                return null;
            }
            return OVERLAP;
        }

        @Override // com.explorestack.protobuf.l0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MetricCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static MetricRequirement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MetricRequirement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricRequirement) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MetricRequirement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<MetricRequirement> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricRequirement)) {
            return super.equals(obj);
        }
        MetricRequirement metricRequirement = (MetricRequirement) obj;
        if (getMeasurementIndex() != metricRequirement.getMeasurementIndex() || !getMetricCase().equals(metricRequirement.getMetricCase())) {
            return false;
        }
        int i10 = this.metricCase_;
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 == 8 && !getOverlap().equals(metricRequirement.getOverlap())) {
                        return false;
                    }
                } else if (!getLifecycle().equals(metricRequirement.getLifecycle())) {
                    return false;
                }
            } else if (!getVisibility().equals(metricRequirement.getVisibility())) {
                return false;
            }
        } else if (!getGeometry().equals(metricRequirement.getGeometry())) {
            return false;
        }
        return this.unknownFields.equals(metricRequirement.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public GeometryMetric getGeometry() {
        return this.metricCase_ == 5 ? (GeometryMetric) this.metric_ : GeometryMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public GeometryMetricOrBuilder getGeometryOrBuilder() {
        return this.metricCase_ == 5 ? (GeometryMetric) this.metric_ : GeometryMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public LifecycleMetric getLifecycle() {
        return this.metricCase_ == 7 ? (LifecycleMetric) this.metric_ : LifecycleMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public LifecycleMetricOrBuilder getLifecycleOrBuilder() {
        return this.metricCase_ == 7 ? (LifecycleMetric) this.metric_ : LifecycleMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public int getMeasurementIndex() {
        return this.measurementIndex_;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public MetricCase getMetricCase() {
        return MetricCase.forNumber(this.metricCase_);
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public OverlapMetric getOverlap() {
        return this.metricCase_ == 8 ? (OverlapMetric) this.metric_ : OverlapMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public OverlapMetricOrBuilder getOverlapOrBuilder() {
        return this.metricCase_ == 8 ? (OverlapMetric) this.metric_ : OverlapMetric.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<MetricRequirement> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.measurementIndex_;
        int iY = i11 != 0 ? 0 + CodedOutputStream.Y(1, i11) : 0;
        if (this.metricCase_ == 5) {
            iY += CodedOutputStream.G(5, (GeometryMetric) this.metric_);
        }
        if (this.metricCase_ == 6) {
            iY += CodedOutputStream.G(6, (VisibilityMetric) this.metric_);
        }
        if (this.metricCase_ == 7) {
            iY += CodedOutputStream.G(7, (LifecycleMetric) this.metric_);
        }
        if (this.metricCase_ == 8) {
            iY += CodedOutputStream.G(8, (OverlapMetric) this.metric_);
        }
        int serializedSize = iY + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public VisibilityMetric getVisibility() {
        return this.metricCase_ == 6 ? (VisibilityMetric) this.metric_ : VisibilityMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public VisibilityMetricOrBuilder getVisibilityOrBuilder() {
        return this.metricCase_ == 6 ? (VisibilityMetric) this.metric_ : VisibilityMetric.getDefaultInstance();
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasGeometry() {
        return this.metricCase_ == 5;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasLifecycle() {
        return this.metricCase_ == 7;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasOverlap() {
        return this.metricCase_ == 8;
    }

    @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
    public boolean hasVisibility() {
        return this.metricCase_ == 6;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10;
        int iHashCode;
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode2 = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMeasurementIndex();
        int i12 = this.metricCase_;
        if (i12 == 5) {
            i10 = ((iHashCode2 * 37) + 5) * 53;
            iHashCode = getGeometry().hashCode();
        } else if (i12 == 6) {
            i10 = ((iHashCode2 * 37) + 6) * 53;
            iHashCode = getVisibility().hashCode();
        } else {
            if (i12 != 7) {
                if (i12 == 8) {
                    i10 = ((iHashCode2 * 37) + 8) * 53;
                    iHashCode = getOverlap().hashCode();
                }
                int iHashCode3 = (iHashCode2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            i10 = ((iHashCode2 * 37) + 7) * 53;
            iHashCode = getLifecycle().hashCode();
        }
        iHashCode2 = i10 + iHashCode;
        int iHashCode4 = (iHashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_fieldAccessorTable.d(MetricRequirement.class, Builder.class);
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
        return new MetricRequirement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i10 = this.measurementIndex_;
        if (i10 != 0) {
            codedOutputStream.c1(1, i10);
        }
        if (this.metricCase_ == 5) {
            codedOutputStream.L0(5, (GeometryMetric) this.metric_);
        }
        if (this.metricCase_ == 6) {
            codedOutputStream.L0(6, (VisibilityMetric) this.metric_);
        }
        if (this.metricCase_ == 7) {
            codedOutputStream.L0(7, (LifecycleMetric) this.metric_);
        }
        if (this.metricCase_ == 8) {
            codedOutputStream.L0(8, (OverlapMetric) this.metric_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements MetricRequirementOrBuilder {
        private e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> geometryBuilder_;
        private e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> lifecycleBuilder_;
        private int measurementIndex_;
        private int metricCase_;
        private Object metric_;
        private e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> overlapBuilder_;
        private e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> visibilityBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
        }

        private e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> getGeometryFieldBuilder() {
            if (this.geometryBuilder_ == null) {
                if (this.metricCase_ != 5) {
                    this.metric_ = GeometryMetric.getDefaultInstance();
                }
                this.geometryBuilder_ = new e2<>((GeometryMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 5;
            onChanged();
            return this.geometryBuilder_;
        }

        private e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> getLifecycleFieldBuilder() {
            if (this.lifecycleBuilder_ == null) {
                if (this.metricCase_ != 7) {
                    this.metric_ = LifecycleMetric.getDefaultInstance();
                }
                this.lifecycleBuilder_ = new e2<>((LifecycleMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 7;
            onChanged();
            return this.lifecycleBuilder_;
        }

        private e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> getOverlapFieldBuilder() {
            if (this.overlapBuilder_ == null) {
                if (this.metricCase_ != 8) {
                    this.metric_ = OverlapMetric.getDefaultInstance();
                }
                this.overlapBuilder_ = new e2<>((OverlapMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 8;
            onChanged();
            return this.overlapBuilder_;
        }

        private e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> getVisibilityFieldBuilder() {
            if (this.visibilityBuilder_ == null) {
                if (this.metricCase_ != 6) {
                    this.metric_ = VisibilityMetric.getDefaultInstance();
                }
                this.visibilityBuilder_ = new e2<>((VisibilityMetric) this.metric_, getParentForChildren(), isClean());
                this.metric_ = null;
            }
            this.metricCase_ = 6;
            onChanged();
            return this.visibilityBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearGeometry() {
            e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var = this.geometryBuilder_;
            if (e2Var != null) {
                if (this.metricCase_ == 5) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                e2Var.b();
            } else if (this.metricCase_ == 5) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearLifecycle() {
            e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var = this.lifecycleBuilder_;
            if (e2Var != null) {
                if (this.metricCase_ == 7) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                e2Var.b();
            } else if (this.metricCase_ == 7) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearMeasurementIndex() {
            this.measurementIndex_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMetric() {
            this.metricCase_ = 0;
            this.metric_ = null;
            onChanged();
            return this;
        }

        public Builder clearOverlap() {
            e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var = this.overlapBuilder_;
            if (e2Var != null) {
                if (this.metricCase_ == 8) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                e2Var.b();
            } else if (this.metricCase_ == 8) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearVisibility() {
            e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var = this.visibilityBuilder_;
            if (e2Var != null) {
                if (this.metricCase_ == 6) {
                    this.metricCase_ = 0;
                    this.metric_ = null;
                }
                e2Var.b();
            } else if (this.metricCase_ == 6) {
                this.metricCase_ = 0;
                this.metric_ = null;
                onChanged();
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public GeometryMetric getGeometry() {
            e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var = this.geometryBuilder_;
            if (e2Var == null) {
                return this.metricCase_ == 5 ? (GeometryMetric) this.metric_ : GeometryMetric.getDefaultInstance();
            }
            return this.metricCase_ == 5 ? (GeometryMetric) e2Var.e() : GeometryMetric.getDefaultInstance();
        }

        public GeometryMetric.Builder getGeometryBuilder() {
            return (GeometryMetric.Builder) getGeometryFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public GeometryMetricOrBuilder getGeometryOrBuilder() {
            e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var;
            int i10 = this.metricCase_;
            if (i10 != 5 || (e2Var = this.geometryBuilder_) == null) {
                return i10 == 5 ? (GeometryMetric) this.metric_ : GeometryMetric.getDefaultInstance();
            }
            return (GeometryMetricOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public LifecycleMetric getLifecycle() {
            e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var = this.lifecycleBuilder_;
            if (e2Var == null) {
                return this.metricCase_ == 7 ? (LifecycleMetric) this.metric_ : LifecycleMetric.getDefaultInstance();
            }
            return this.metricCase_ == 7 ? (LifecycleMetric) e2Var.e() : LifecycleMetric.getDefaultInstance();
        }

        public LifecycleMetric.Builder getLifecycleBuilder() {
            return (LifecycleMetric.Builder) getLifecycleFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public LifecycleMetricOrBuilder getLifecycleOrBuilder() {
            e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var;
            int i10 = this.metricCase_;
            if (i10 != 7 || (e2Var = this.lifecycleBuilder_) == null) {
                return i10 == 7 ? (LifecycleMetric) this.metric_ : LifecycleMetric.getDefaultInstance();
            }
            return (LifecycleMetricOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public int getMeasurementIndex() {
            return this.measurementIndex_;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public MetricCase getMetricCase() {
            return MetricCase.forNumber(this.metricCase_);
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public OverlapMetric getOverlap() {
            e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var = this.overlapBuilder_;
            if (e2Var == null) {
                return this.metricCase_ == 8 ? (OverlapMetric) this.metric_ : OverlapMetric.getDefaultInstance();
            }
            return this.metricCase_ == 8 ? (OverlapMetric) e2Var.e() : OverlapMetric.getDefaultInstance();
        }

        public OverlapMetric.Builder getOverlapBuilder() {
            return (OverlapMetric.Builder) getOverlapFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public OverlapMetricOrBuilder getOverlapOrBuilder() {
            e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var;
            int i10 = this.metricCase_;
            if (i10 != 8 || (e2Var = this.overlapBuilder_) == null) {
                return i10 == 8 ? (OverlapMetric) this.metric_ : OverlapMetric.getDefaultInstance();
            }
            return (OverlapMetricOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public VisibilityMetric getVisibility() {
            e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var = this.visibilityBuilder_;
            if (e2Var == null) {
                return this.metricCase_ == 6 ? (VisibilityMetric) this.metric_ : VisibilityMetric.getDefaultInstance();
            }
            return this.metricCase_ == 6 ? (VisibilityMetric) e2Var.e() : VisibilityMetric.getDefaultInstance();
        }

        public VisibilityMetric.Builder getVisibilityBuilder() {
            return (VisibilityMetric.Builder) getVisibilityFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public VisibilityMetricOrBuilder getVisibilityOrBuilder() {
            e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var;
            int i10 = this.metricCase_;
            if (i10 != 6 || (e2Var = this.visibilityBuilder_) == null) {
                return i10 == 6 ? (VisibilityMetric) this.metric_ : VisibilityMetric.getDefaultInstance();
            }
            return (VisibilityMetricOrBuilder) e2Var.f();
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasGeometry() {
            return this.metricCase_ == 5;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasLifecycle() {
            return this.metricCase_ == 7;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasOverlap() {
            return this.metricCase_ == 8;
        }

        @Override // io.bidmachine.protobuf.sdk.MetricRequirementOrBuilder
        public boolean hasVisibility() {
            return this.metricCase_ == 6;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return SDKViewabilityProto.internal_static_bidmachine_protobuf_sdk_viewability_MetricRequirement_fieldAccessorTable.d(MetricRequirement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeGeometry(GeometryMetric geometryMetric) {
            e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var = this.geometryBuilder_;
            if (e2Var == null) {
                if (this.metricCase_ != 5 || this.metric_ == GeometryMetric.getDefaultInstance()) {
                    this.metric_ = geometryMetric;
                } else {
                    this.metric_ = GeometryMetric.newBuilder((GeometryMetric) this.metric_).mergeFrom(geometryMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 5) {
                    e2Var.g(geometryMetric);
                }
                this.geometryBuilder_.i(geometryMetric);
            }
            this.metricCase_ = 5;
            return this;
        }

        public Builder mergeLifecycle(LifecycleMetric lifecycleMetric) {
            e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var = this.lifecycleBuilder_;
            if (e2Var == null) {
                if (this.metricCase_ != 7 || this.metric_ == LifecycleMetric.getDefaultInstance()) {
                    this.metric_ = lifecycleMetric;
                } else {
                    this.metric_ = LifecycleMetric.newBuilder((LifecycleMetric) this.metric_).mergeFrom(lifecycleMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 7) {
                    e2Var.g(lifecycleMetric);
                }
                this.lifecycleBuilder_.i(lifecycleMetric);
            }
            this.metricCase_ = 7;
            return this;
        }

        public Builder mergeOverlap(OverlapMetric overlapMetric) {
            e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var = this.overlapBuilder_;
            if (e2Var == null) {
                if (this.metricCase_ != 8 || this.metric_ == OverlapMetric.getDefaultInstance()) {
                    this.metric_ = overlapMetric;
                } else {
                    this.metric_ = OverlapMetric.newBuilder((OverlapMetric) this.metric_).mergeFrom(overlapMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 8) {
                    e2Var.g(overlapMetric);
                }
                this.overlapBuilder_.i(overlapMetric);
            }
            this.metricCase_ = 8;
            return this;
        }

        public Builder mergeVisibility(VisibilityMetric visibilityMetric) {
            e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var = this.visibilityBuilder_;
            if (e2Var == null) {
                if (this.metricCase_ != 6 || this.metric_ == VisibilityMetric.getDefaultInstance()) {
                    this.metric_ = visibilityMetric;
                } else {
                    this.metric_ = VisibilityMetric.newBuilder((VisibilityMetric) this.metric_).mergeFrom(visibilityMetric).buildPartial();
                }
                onChanged();
            } else {
                if (this.metricCase_ == 6) {
                    e2Var.g(visibilityMetric);
                }
                this.visibilityBuilder_.i(visibilityMetric);
            }
            this.metricCase_ = 6;
            return this;
        }

        public Builder setGeometry(GeometryMetric geometryMetric) {
            e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var = this.geometryBuilder_;
            if (e2Var == null) {
                geometryMetric.getClass();
                this.metric_ = geometryMetric;
                onChanged();
            } else {
                e2Var.i(geometryMetric);
            }
            this.metricCase_ = 5;
            return this;
        }

        public Builder setLifecycle(LifecycleMetric lifecycleMetric) {
            e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var = this.lifecycleBuilder_;
            if (e2Var == null) {
                lifecycleMetric.getClass();
                this.metric_ = lifecycleMetric;
                onChanged();
            } else {
                e2Var.i(lifecycleMetric);
            }
            this.metricCase_ = 7;
            return this;
        }

        public Builder setMeasurementIndex(int i10) {
            this.measurementIndex_ = i10;
            onChanged();
            return this;
        }

        public Builder setOverlap(OverlapMetric overlapMetric) {
            e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var = this.overlapBuilder_;
            if (e2Var == null) {
                overlapMetric.getClass();
                this.metric_ = overlapMetric;
                onChanged();
            } else {
                e2Var.i(overlapMetric);
            }
            this.metricCase_ = 8;
            return this;
        }

        public Builder setVisibility(VisibilityMetric visibilityMetric) {
            e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var = this.visibilityBuilder_;
            if (e2Var == null) {
                visibilityMetric.getClass();
                this.metric_ = visibilityMetric;
                onChanged();
            } else {
                e2Var.i(visibilityMetric);
            }
            this.metricCase_ = 6;
            return this;
        }

        private Builder() {
            this.metricCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MetricRequirement build() {
            MetricRequirement metricRequirementBuildPartial = buildPartial();
            if (metricRequirementBuildPartial.isInitialized()) {
                return metricRequirementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricRequirementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public MetricRequirement buildPartial() {
            MetricRequirement metricRequirement = new MetricRequirement(this);
            metricRequirement.measurementIndex_ = this.measurementIndex_;
            if (this.metricCase_ == 5) {
                e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var = this.geometryBuilder_;
                if (e2Var == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = e2Var.a();
                }
            }
            if (this.metricCase_ == 6) {
                e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var2 = this.visibilityBuilder_;
                if (e2Var2 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = e2Var2.a();
                }
            }
            if (this.metricCase_ == 7) {
                e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var3 = this.lifecycleBuilder_;
                if (e2Var3 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = e2Var3.a();
                }
            }
            if (this.metricCase_ == 8) {
                e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var4 = this.overlapBuilder_;
                if (e2Var4 == null) {
                    metricRequirement.metric_ = this.metric_;
                } else {
                    metricRequirement.metric_ = e2Var4.a();
                }
            }
            metricRequirement.metricCase_ = this.metricCase_;
            onBuilt();
            return metricRequirement;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public MetricRequirement mo164getDefaultInstanceForType() {
            return MetricRequirement.getDefaultInstance();
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
            this.measurementIndex_ = 0;
            this.metricCase_ = 0;
            this.metric_ = null;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.metricCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof MetricRequirement) {
                return mergeFrom((MetricRequirement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setGeometry(GeometryMetric.Builder builder) {
            e2<GeometryMetric, GeometryMetric.Builder, GeometryMetricOrBuilder> e2Var = this.geometryBuilder_;
            if (e2Var == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.metricCase_ = 5;
            return this;
        }

        public Builder setLifecycle(LifecycleMetric.Builder builder) {
            e2<LifecycleMetric, LifecycleMetric.Builder, LifecycleMetricOrBuilder> e2Var = this.lifecycleBuilder_;
            if (e2Var == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.metricCase_ = 7;
            return this;
        }

        public Builder setOverlap(OverlapMetric.Builder builder) {
            e2<OverlapMetric, OverlapMetric.Builder, OverlapMetricOrBuilder> e2Var = this.overlapBuilder_;
            if (e2Var == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.metricCase_ = 8;
            return this;
        }

        public Builder setVisibility(VisibilityMetric.Builder builder) {
            e2<VisibilityMetric, VisibilityMetric.Builder, VisibilityMetricOrBuilder> e2Var = this.visibilityBuilder_;
            if (e2Var == null) {
                this.metric_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.metricCase_ = 6;
            return this;
        }

        public Builder mergeFrom(MetricRequirement metricRequirement) {
            if (metricRequirement == MetricRequirement.getDefaultInstance()) {
                return this;
            }
            if (metricRequirement.getMeasurementIndex() != 0) {
                setMeasurementIndex(metricRequirement.getMeasurementIndex());
            }
            int i10 = AnonymousClass2.$SwitchMap$io$bidmachine$protobuf$sdk$MetricRequirement$MetricCase[metricRequirement.getMetricCase().ordinal()];
            if (i10 == 1) {
                mergeGeometry(metricRequirement.getGeometry());
            } else if (i10 == 2) {
                mergeVisibility(metricRequirement.getVisibility());
            } else if (i10 == 3) {
                mergeLifecycle(metricRequirement.getLifecycle());
            } else if (i10 == 4) {
                mergeOverlap(metricRequirement.getOverlap());
            }
            mergeUnknownFields(((j0) metricRequirement).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            MetricRequirement metricRequirement = null;
            try {
                try {
                    MetricRequirement metricRequirement2 = (MetricRequirement) MetricRequirement.PARSER.parsePartialFrom(nVar, yVar);
                    if (metricRequirement2 != null) {
                        mergeFrom(metricRequirement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    MetricRequirement metricRequirement3 = (MetricRequirement) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        metricRequirement = metricRequirement3;
                        if (metricRequirement != null) {
                            mergeFrom(metricRequirement);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (metricRequirement != null) {
                    mergeFrom(metricRequirement);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(MetricRequirement metricRequirement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricRequirement);
    }

    public static MetricRequirement parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private MetricRequirement(j0.b<?> bVar) {
        super(bVar);
        this.metricCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static MetricRequirement parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (MetricRequirement) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static MetricRequirement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public MetricRequirement mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static MetricRequirement parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static MetricRequirement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    private MetricRequirement() {
        this.metricCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static MetricRequirement parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static MetricRequirement parseFrom(InputStream inputStream) throws IOException {
        return (MetricRequirement) j0.parseWithIOException(PARSER, inputStream);
    }

    private MetricRequirement(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK != 8) {
                            if (iK == 42) {
                                GeometryMetric.Builder builder = this.metricCase_ == 5 ? ((GeometryMetric) this.metric_).toBuilder() : null;
                                MessageLite messageLiteA = nVar.A(GeometryMetric.parser(), yVar);
                                this.metric_ = messageLiteA;
                                if (builder != null) {
                                    builder.mergeFrom((GeometryMetric) messageLiteA);
                                    this.metric_ = builder.buildPartial();
                                }
                                this.metricCase_ = 5;
                            } else if (iK == 50) {
                                VisibilityMetric.Builder builder2 = this.metricCase_ == 6 ? ((VisibilityMetric) this.metric_).toBuilder() : null;
                                MessageLite messageLiteA2 = nVar.A(VisibilityMetric.parser(), yVar);
                                this.metric_ = messageLiteA2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((VisibilityMetric) messageLiteA2);
                                    this.metric_ = builder2.buildPartial();
                                }
                                this.metricCase_ = 6;
                            } else if (iK == 58) {
                                LifecycleMetric.Builder builder3 = this.metricCase_ == 7 ? ((LifecycleMetric) this.metric_).toBuilder() : null;
                                MessageLite messageLiteA3 = nVar.A(LifecycleMetric.parser(), yVar);
                                this.metric_ = messageLiteA3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((LifecycleMetric) messageLiteA3);
                                    this.metric_ = builder3.buildPartial();
                                }
                                this.metricCase_ = 7;
                            } else if (iK != 66) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                OverlapMetric.Builder builder4 = this.metricCase_ == 8 ? ((OverlapMetric) this.metric_).toBuilder() : null;
                                MessageLite messageLiteA4 = nVar.A(OverlapMetric.parser(), yVar);
                                this.metric_ = messageLiteA4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((OverlapMetric) messageLiteA4);
                                    this.metric_ = builder4.buildPartial();
                                }
                                this.metricCase_ = 8;
                            }
                        } else {
                            this.measurementIndex_ = nVar.L();
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

    public static MetricRequirement parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (MetricRequirement) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static MetricRequirement parseFrom(n nVar) throws IOException {
        return (MetricRequirement) j0.parseWithIOException(PARSER, nVar);
    }

    public static MetricRequirement parseFrom(n nVar, y yVar) throws IOException {
        return (MetricRequirement) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
