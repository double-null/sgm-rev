package pb;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f23968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f23969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f23970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f23971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f23972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f23973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f23974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f23975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f23976j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23977a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private k f23985i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f23978b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f23979c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f23980d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f23981e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f23982f = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f23983g = new EnumMap(f.class);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f23984h = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f23986j = -16777216;

        public a(int i10) {
            this.f23977a = i10;
        }

        public final a a(pb.a adElementParams) {
            kotlin.jvm.internal.t.f(adElementParams, "adElementParams");
            this.f23978b.add(adElementParams);
            return this;
        }

        public final a b(pb.a adElementParams) {
            kotlin.jvm.internal.t.f(adElementParams, "adElementParams");
            this.f23979c.add(adElementParams);
            return this;
        }

        public final a c(c0 eventParams) {
            kotlin.jvm.internal.t.f(eventParams, "eventParams");
            List<d0> listA = eventParams.a();
            if (!listA.isEmpty()) {
                String strC = eventParams.c();
                Map enumMap = (Map) this.f23981e.get(strC);
                if (enumMap == null) {
                    enumMap = new EnumMap(f0.class);
                    this.f23981e.put(strC, enumMap);
                }
                f0 f0VarB = eventParams.b();
                List arrayList = (List) enumMap.get(f0VarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    enumMap.put(f0VarB, arrayList);
                }
                arrayList.addAll(listA);
            }
            return this;
        }

        public final a d(s0 methodParams) {
            kotlin.jvm.internal.t.f(methodParams, "methodParams");
            this.f23980d.add(methodParams);
            return this;
        }

        public final d e() {
            return new d(this.f23977a, this.f23985i, Integer.valueOf(this.f23986j), this.f23978b, this.f23979c, this.f23980d, this.f23981e, this.f23982f, this.f23983g, this.f23984h);
        }

        public final a f(Map<f, h> map) {
            wb.e0.H(this.f23983g, map);
            return this;
        }

        public final a g(k kVar) {
            this.f23985i = kVar;
            return this;
        }

        public final a h(int i10) {
            this.f23986j = i10;
            return this;
        }

        public final a i(Map<String, String> map) {
            wb.e0.H(this.f23982f, map);
            return this;
        }

        public final a j(List<String> list) {
            wb.e0.G(this.f23984h, list);
            return this;
        }
    }

    public d(int i10, k kVar, Integer num, List<pb.a> adsList, List<pb.a> controlsList, List<s0> methodParamsList, Map<String, ? extends Map<f0, ? extends List<d0>>> sourceEventTypeMap, Map<String, String> customParams, Map<f, h> animationParams, List<String> stateGroups) {
        kotlin.jvm.internal.t.f(adsList, "adsList");
        kotlin.jvm.internal.t.f(controlsList, "controlsList");
        kotlin.jvm.internal.t.f(methodParamsList, "methodParamsList");
        kotlin.jvm.internal.t.f(sourceEventTypeMap, "sourceEventTypeMap");
        kotlin.jvm.internal.t.f(customParams, "customParams");
        kotlin.jvm.internal.t.f(animationParams, "animationParams");
        kotlin.jvm.internal.t.f(stateGroups, "stateGroups");
        this.f23967a = i10;
        this.f23968b = kVar;
        this.f23969c = num;
        this.f23970d = adsList;
        this.f23971e = controlsList;
        this.f23972f = methodParamsList;
        this.f23973g = sourceEventTypeMap;
        this.f23974h = customParams;
        this.f23975i = animationParams;
        this.f23976j = stateGroups;
    }

    public final List<pb.a> a() {
        return this.f23970d;
    }

    public final Map<f, h> b() {
        return this.f23975i;
    }

    public final k c() {
        return this.f23968b;
    }

    public final Integer d() {
        return this.f23969c;
    }

    public final List<pb.a> e() {
        return this.f23971e;
    }

    public final Map<f0, List<d0>> f(String sourceName) {
        kotlin.jvm.internal.t.f(sourceName, "sourceName");
        return (Map) this.f23973g.get(sourceName);
    }

    public final List<s0> g() {
        return this.f23972f;
    }

    public final int h() {
        return this.f23967a;
    }

    public final List<String> i() {
        return this.f23976j;
    }
}
