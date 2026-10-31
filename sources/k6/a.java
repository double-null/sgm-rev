package k6;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: k6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
    static final class C0345a extends kotlin.jvm.internal.u implements id.l<pb.q, Value> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0345a f21232d = new C0345a();

        C0345a() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Value invoke(pb.q brokenCreativeAlgorithmResult) {
            kotlin.jvm.internal.t.f(brokenCreativeAlgorithmResult, "brokenCreativeAlgorithmResult");
            pb.p pVarA = brokenCreativeAlgorithmResult.a();
            Struct.Builder builderNewBuilder = Struct.newBuilder();
            kotlin.jvm.internal.t.e(builderNewBuilder, "newBuilder()");
            Struct structBuild = oc.m.l(oc.m.l(oc.m.m(builderNewBuilder, "name", pVarA.b().getKey()), "weight", Float.valueOf(pVarA.c())), "threshold", Float.valueOf(pVarA.a())).build();
            kotlin.jvm.internal.t.e(structBuild, "brokenCreativeAlgorithmR…build()\n                }");
            Struct.Builder builderNewBuilder2 = Struct.newBuilder();
            kotlin.jvm.internal.t.e(builderNewBuilder2, "newBuilder()");
            return oc.m.u(oc.m.l(oc.m.l(oc.m.k(builderNewBuilder2, "algorithm", structBuild), "result", Integer.valueOf(io.bidmachine.core.i.b(brokenCreativeAlgorithmResult.c()))), "duration", Long.valueOf(brokenCreativeAlgorithmResult.b())));
        }
    }

    public static final oc.a a(pb.b0 b0Var, oc.a baseBMError) {
        kotlin.jvm.internal.t.f(b0Var, "<this>");
        kotlin.jvm.internal.t.f(baseBMError, "baseBMError");
        return new oc.a(baseBMError, -1, b0Var.b());
    }

    public static final oc.a b(wb.h hVar) {
        kotlin.jvm.internal.t.f(hVar, "<this>");
        return new oc.a(108, hVar.a());
    }

    public static final Map<String, Object> c(pb.t tVar) {
        kotlin.jvm.internal.t.f(tVar, "<this>");
        try {
            ListValue listValueI = oc.m.i(tVar.c(), C0345a.f21232d);
            Struct.Builder builderNewBuilder = Struct.newBuilder();
            kotlin.jvm.internal.t.e(builderNewBuilder, "newBuilder()");
            Value valueU = oc.m.u(oc.m.j(oc.m.l(oc.m.m(oc.m.l(oc.m.l(builderNewBuilder, "result", Double.valueOf(tVar.e())), "phase", Integer.valueOf(tVar.b())), "component", tVar.a()), "duration", Long.valueOf(tVar.d())), "algorithms", listValueI));
            HashMap map = new HashMap();
            map.put("adaptive_rendering_context", valueU);
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }
}
