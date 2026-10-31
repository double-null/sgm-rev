package oc;

import c2.YDwL.tFQWuE;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.sdk.GeometryMetric;
import io.bidmachine.protobuf.sdk.LifecycleMetric;
import io.bidmachine.protobuf.sdk.Measurement;
import io.bidmachine.protobuf.sdk.MetricRequirement;
import io.bidmachine.protobuf.sdk.OverlapMetric;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import io.bidmachine.protobuf.sdk.ViewabilityRule;
import io.bidmachine.protobuf.sdk.VisibilityMetric;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import sc.NfwM.XDucgbzInpQa;
import wb.d0;
import wb.e0;

/* JADX INFO: compiled from: ProtoUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: compiled from: ProtoUtils.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VisibilityMetric.VisibilityScope.values().length];
            try {
                iArr[VisibilityMetric.VisibilityScope.PARENT_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisibilityMetric.VisibilityScope.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisibilityMetric.VisibilityScope.SAFE_AREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LifecycleMetric.LifecycleState.values().length];
            try {
                iArr2[LifecycleMetric.LifecycleState.HAS_WINDOW_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OverlapMetric.OverlapScope.values().length];
            try {
                iArr3[OverlapMetric.OverlapScope.VIEW_SIBLINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OverlapMetric.OverlapScope.ALL_VIEWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OverlapMetric.OverlapScope.WINDOWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return yc.b.a(Integer.valueOf(((MetricRequirement) t10).getMeasurementIndex()), Integer.valueOf(((MetricRequirement) t11).getMeasurementIndex()));
        }
    }

    public static final Value.Builder A(Struct.Builder builder) {
        t.f(builder, "<this>");
        Value.Builder structValue = Value.newBuilder().setStructValue(builder);
        t.e(structValue, "newBuilder()\n        .setStructValue(this)");
        return structValue;
    }

    public static final Value.Builder B(Struct struct) {
        t.f(struct, "<this>");
        Value.Builder structValue = Value.newBuilder().setStructValue(struct);
        t.e(structValue, "newBuilder()\n        .setStructValue(this)");
        return structValue;
    }

    public static final Value.Builder D(String str) {
        t.f(str, "<this>");
        Value.Builder stringValue = Value.newBuilder().setStringValue(str);
        t.e(stringValue, "newBuilder()\n        .setStringValue(this)");
        return stringValue;
    }

    public static final Value.Builder E(boolean z10) {
        Value.Builder boolValue = Value.newBuilder().setBoolValue(z10);
        t.e(boolValue, "newBuilder()\n        .setBoolValue(this)");
        return boolValue;
    }

    public static final Struct.Builder F(Map<?, ?> map) {
        Value.Builder builderG;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        t.e(builderNewBuilder, "newBuilder()");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String string = key.toString();
                if (!(string.length() == 0) && (builderG = G(entry.getValue())) != null) {
                    builderNewBuilder.putFields(string, builderG.build());
                }
            }
        }
        return builderNewBuilder;
    }

    public static final Value.Builder G(Object obj) {
        Struct.Builder builderF;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return ((Value) obj).toBuilder();
        }
        if (obj instanceof Value.Builder) {
            return (Value.Builder) obj;
        }
        if (obj instanceof String) {
            return D((String) obj);
        }
        if (obj instanceof Number) {
            return C((Number) obj);
        }
        if (obj instanceof Boolean) {
            return E(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            ListValue.Builder builderO = o((List) obj);
            if (builderO != null) {
                return y(builderO);
            }
            return null;
        }
        if (!(obj instanceof Map) || (builderF = F((Map) obj)) == null) {
            return null;
        }
        return A(builderF);
    }

    public static final Value H(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return (Value) obj;
        }
        if (obj instanceof Value.Builder) {
            return ((Value.Builder) obj).build();
        }
        Value.Builder builderG = G(obj);
        if (builderG != null) {
            return builderG.build();
        }
        return null;
    }

    public static final lc.b I(GeometryMetric geometryMetric) {
        t.f(geometryMetric, "<this>");
        return new lc.b(geometryMetric.getVisible(), geometryMetric.hasMinAlpha() ? Float.valueOf((float) geometryMetric.getMinAlpha()) : null, geometryMetric.hasMinWidth() ? Float.valueOf(geometryMetric.getMinWidth()) : null, geometryMetric.hasMinHeight() ? Float.valueOf(geometryMetric.getMinHeight()) : null);
    }

    public static final lc.c J(LifecycleMetric lifecycleMetric) {
        ArrayList arrayList;
        lc.c.b bVar;
        t.f(lifecycleMetric, "<this>");
        List<LifecycleMetric.LifecycleState> requiredStatesList = lifecycleMetric.getRequiredStatesList();
        boolean z10 = true;
        if (requiredStatesList != null) {
            arrayList = new ArrayList();
            for (final LifecycleMetric.LifecycleState lifecycleState : requiredStatesList) {
                if ((lifecycleState == null ? -1 : a.$EnumSwitchMapping$1[lifecycleState.ordinal()]) == 1) {
                    bVar = lc.c.b.HAS_WINDOW_FOCUS;
                } else {
                    io.bidmachine.core.a.g(new qc.b() { // from class: oc.l
                        @Override // qc.b
                        public final Object get() {
                            return m.K(lifecycleState);
                        }
                    });
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return new lc.c(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String K(LifecycleMetric.LifecycleState lifecycleState) {
        return "Unsupported LifecycleState - " + lifecycleState.name();
    }

    public static final mc.b L(Measurement measurement) {
        t.f(measurement, "<this>");
        return new mc.b(measurement.getCount(), measurement.getIntervalMs(), measurement.hasFailureTimeoutMs() ? Long.valueOf(measurement.getFailureTimeoutMs()) : null);
    }

    public static final lc.d M(OverlapMetric overlapMetric) {
        lc.d.b bVar;
        t.f(overlapMetric, "<this>");
        final OverlapMetric.OverlapScope scope = overlapMetric.getScope();
        t.e(scope, "scope");
        int i10 = a.$EnumSwitchMapping$2[scope.ordinal()];
        if (i10 == 1) {
            bVar = lc.d.b.VIEW_SIBLINGS;
        } else if (i10 == 2) {
            bVar = lc.d.b.ALL_VIEWS;
        } else {
            if (i10 != 3) {
                io.bidmachine.core.a.g(new qc.b() { // from class: oc.j
                    @Override // qc.b
                    public final Object get() {
                        return m.N(scope);
                    }
                });
                return null;
            }
            bVar = lc.d.b.WINDOWS;
        }
        return new lc.d(bVar, (float) overlapMetric.getMaxOverlapPercentage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(OverlapMetric.OverlapScope overlapScope) {
        t.f(overlapScope, "$overlapScope");
        return "Unsupported OverlapScope - " + overlapScope.name();
    }

    public static final mc.d O(ViewabilityConfiguration viewabilityConfiguration) {
        t.f(viewabilityConfiguration, "<this>");
        if (viewabilityConfiguration == ViewabilityConfiguration.getDefaultInstance()) {
            return null;
        }
        List<ViewabilityRule> rulesList = viewabilityConfiguration.getRulesList();
        t.e(rulesList, "rulesList");
        ArrayList arrayList = new ArrayList(u.u(rulesList, 10));
        for (ViewabilityRule viewabilityRule : rulesList) {
            mc.a aVar = new mc.a(viewabilityRule.getEvent(), viewabilityRule.getBillable());
            Measurement measurement = viewabilityRule.getMeasurement();
            t.e(measurement, "rule.measurement");
            mc.b bVarL = L(measurement);
            List<MetricRequirement> requiredMetricsList = viewabilityRule.getRequiredMetricsList();
            t.e(requiredMetricsList, "rule.requiredMetricsList");
            List<MetricRequirement> listI0 = b0.i0(requiredMetricsList, new b());
            ArrayList arrayList2 = new ArrayList();
            for (MetricRequirement metricRequirement : listI0) {
                t.e(metricRequirement, "metricRequirement");
                lc.a aVarP = p(metricRequirement);
                if (aVarP != null) {
                    arrayList2.add(aVarP);
                }
            }
            arrayList.add(new mc.c(aVar, bVarL, arrayList2));
        }
        return new mc.d(arrayList);
    }

    public static final lc.e P(VisibilityMetric visibilityMetric) {
        lc.e.b bVar;
        t.f(visibilityMetric, "<this>");
        final VisibilityMetric.VisibilityScope scope = visibilityMetric.getScope();
        t.e(scope, "scope");
        int i10 = a.$EnumSwitchMapping$0[scope.ordinal()];
        if (i10 == 1) {
            bVar = lc.e.b.PARENT_VIEW;
        } else if (i10 == 2) {
            bVar = lc.e.b.SCREEN;
        } else {
            if (i10 != 3) {
                io.bidmachine.core.a.g(new qc.b() { // from class: oc.k
                    @Override // qc.b
                    public final Object get() {
                        return m.Q(scope);
                    }
                });
                return null;
            }
            bVar = lc.e.b.SAFE_AREA;
        }
        return new lc.e(bVar, (float) visibilityMetric.getMinVisiblePercentage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q(VisibilityMetric.VisibilityScope visibilityScope) {
        t.f(visibilityScope, "$visibilityScope");
        return "Unsupported VisibilityScope - " + visibilityScope.name();
    }

    public static final AdExtension e(Ad ad2) {
        t.f(ad2, "<this>");
        int extProtoCount = ad2.getExtProtoCount();
        for (int i10 = 0; i10 < extProtoCount; i10++) {
            try {
                Any extProto = ad2.getExtProto(i10);
                t.e(extProto, "getExtProto(i)");
                if (extProto.is(AdExtension.class)) {
                    return (AdExtension) extProto.unpack(AdExtension.class);
                }
                continue;
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
        return null;
    }

    public static final String f(Struct struct, String key) {
        t.f(struct, "<this>");
        t.f(key, "key");
        Value valueH = h(struct, key);
        if (valueH != null) {
            return g(valueH);
        }
        return null;
    }

    public static final String g(Value value) {
        t.f(value, "<this>");
        if (value.hasStringValue()) {
            return value.getStringValue();
        }
        return null;
    }

    public static final Value h(Struct struct, String key) {
        t.f(struct, "<this>");
        t.f(key, "key");
        return struct.getFieldsMap().get(key);
    }

    public static final <T> ListValue i(List<? extends T> list, id.l<? super T, Value> transform) {
        t.f(list, "<this>");
        t.f(transform, "transform");
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        t.e(builderNewBuilder, "newBuilder()");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Value valueInvoke = transform.invoke(it.next());
            if (valueInvoke != null) {
                builderNewBuilder.addValues(valueInvoke);
            }
        }
        ListValue listValueBuild = builderNewBuilder.build();
        t.e(listValueBuild, "listValueBuilder.build()");
        return listValueBuild;
    }

    public static final Struct.Builder j(Struct.Builder builder, String key, ListValue value) {
        t.f(builder, "<this>");
        t.f(key, "key");
        t.f(value, "value");
        builder.putFields(key, t(value));
        return builder;
    }

    public static final Struct.Builder l(Struct.Builder builder, String key, Number value) {
        t.f(builder, "<this>");
        t.f(key, "key");
        t.f(value, "value");
        builder.putFields(key, w(value));
        return builder;
    }

    public static final Struct.Builder m(Struct.Builder builder, String key, String value) {
        t.f(builder, "<this>");
        t.f(key, "key");
        t.f(value, "value");
        builder.putFields(key, x(value));
        return builder;
    }

    public static final g7.n n(AdExtension.ControlAsset controlAsset) {
        t.f(controlAsset, "<this>");
        try {
            g7.n nVar = new g7.n();
            nVar.r0(controlAsset.getMargin());
            nVar.v0(controlAsset.getPadding());
            nVar.j0(controlAsset.getContent());
            nVar.k0(d0.w(controlAsset.getFill()));
            nVar.m0(Integer.valueOf(controlAsset.getFontStyle()));
            nVar.B0(Integer.valueOf(controlAsset.getWidth()));
            nVar.n0(Integer.valueOf(controlAsset.getHeight()));
            nVar.o0(Float.valueOf(controlAsset.getHideafter()));
            nVar.p0(io.bidmachine.core.h.W(controlAsset.getX()));
            nVar.z0(io.bidmachine.core.h.Z(controlAsset.getY()));
            nVar.s0(Float.valueOf(controlAsset.getOpacity()));
            nVar.t0(Boolean.valueOf(controlAsset.getOutlined()));
            nVar.w0(d0.w(controlAsset.getStroke()));
            nVar.x0(Float.valueOf(controlAsset.getStrokeWidth()));
            nVar.y0(controlAsset.getStyle());
            nVar.A0(Boolean.valueOf(controlAsset.getVisible()));
            return nVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final ListValue.Builder o(List<?> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        t.e(builderNewBuilder, "newBuilder()");
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Value.Builder builderG = G(it.next());
            if (builderG != null) {
                builderNewBuilder.addValues(builderG);
            }
        }
        return builderNewBuilder;
    }

    public static final lc.a p(final MetricRequirement metricRequirement) {
        t.f(metricRequirement, "<this>");
        if (metricRequirement.hasGeometry()) {
            GeometryMetric geometry = metricRequirement.getGeometry();
            t.e(geometry, "geometry");
            return I(geometry);
        }
        if (metricRequirement.hasVisibility()) {
            VisibilityMetric visibility = metricRequirement.getVisibility();
            t.e(visibility, "visibility");
            return P(visibility);
        }
        if (metricRequirement.hasLifecycle()) {
            LifecycleMetric lifecycle = metricRequirement.getLifecycle();
            t.e(lifecycle, "lifecycle");
            return J(lifecycle);
        }
        if (!metricRequirement.hasOverlap()) {
            io.bidmachine.core.a.g(new qc.b() { // from class: oc.i
                @Override // qc.b
                public final Object get() {
                    return m.q(metricRequirement);
                }
            });
            return null;
        }
        OverlapMetric overlap = metricRequirement.getOverlap();
        t.e(overlap, "overlap");
        return M(overlap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(MetricRequirement this_toMetricOrNull) {
        t.f(this_toMetricOrNull, "$this_toMetricOrNull");
        return "Unsupported Metric - " + this_toMetricOrNull.getMetricCase().name() + ", it must be GeometryMetric or VisibilityMetric or LifecycleMetric or OverlapMetric";
    }

    public static final StringValue r(String str) {
        t.f(str, "<this>");
        StringValue stringValueBuild = s(str).build();
        t.e(stringValueBuild, "toProtoStringValueBuilder().build()");
        return stringValueBuild;
    }

    public static final StringValue.Builder s(String str) {
        t.f(str, "<this>");
        StringValue.Builder value = StringValue.newBuilder().setValue(str);
        t.e(value, "newBuilder()\n        .setValue(this)");
        return value;
    }

    public static final Value t(ListValue listValue) {
        t.f(listValue, "<this>");
        Value valueBuild = z(listValue).build();
        t.e(valueBuild, "toProtoValueBuilder().build()");
        return valueBuild;
    }

    public static final Value u(Struct.Builder builder) {
        t.f(builder, "<this>");
        Value valueBuild = A(builder).build();
        t.e(valueBuild, "toProtoValueBuilder().build()");
        return valueBuild;
    }

    public static final Value v(Struct struct) {
        t.f(struct, "<this>");
        Value valueBuild = B(struct).build();
        t.e(valueBuild, "toProtoValueBuilder().build()");
        return valueBuild;
    }

    public static final Value w(Number number) {
        t.f(number, "<this>");
        Value valueBuild = C(number).build();
        t.e(valueBuild, "toProtoValueBuilder().build()");
        return valueBuild;
    }

    public static final Value x(String str) {
        t.f(str, "<this>");
        Value valueBuild = D(str).build();
        t.e(valueBuild, "toProtoValueBuilder().build()");
        return valueBuild;
    }

    public static final Value.Builder y(ListValue.Builder builder) {
        t.f(builder, "<this>");
        Value.Builder listValue = Value.newBuilder().setListValue(builder);
        t.e(listValue, "newBuilder()\n        .setListValue(this)");
        return listValue;
    }

    public static final Value.Builder z(ListValue listValue) {
        t.f(listValue, "<this>");
        Value.Builder listValue2 = Value.newBuilder().setListValue(listValue);
        t.e(listValue2, "newBuilder()\n        .setListValue(this)");
        return listValue2;
    }

    public static final Value.Builder C(Number number) {
        t.f(number, tFQWuE.iZSplczY);
        Value.Builder builderNewBuilder = Value.newBuilder();
        Double dL = e0.L(number, null, 1, null);
        Value.Builder numberValue = builderNewBuilder.setNumberValue(dL != null ? dL.doubleValue() : number.doubleValue());
        t.e(numberValue, "newBuilder()\n        .se…rDefault() ?: toDouble())");
        return numberValue;
    }

    public static final Struct.Builder k(Struct.Builder builder, String key, Struct value) {
        t.f(builder, XDucgbzInpQa.JamrTQwXzQI);
        t.f(key, "key");
        t.f(value, "value");
        builder.putFields(key, v(value));
        return builder;
    }
}
