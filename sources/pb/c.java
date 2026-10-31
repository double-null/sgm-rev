package pb;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f23946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f23947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mc.d f23948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nc.a f23949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f23950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0 f23951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f23952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l1 f23953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f23954i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mc.d f23955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue f23956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f23957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u f23958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f23959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private nc.a f23960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v0 f23961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private k f23962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private l1 f23963i;

        public a(mc.d viewabilityTrackerParams) {
            kotlin.jvm.internal.t.f(viewabilityTrackerParams, "viewabilityTrackerParams");
            this.f23955a = viewabilityTrackerParams;
            this.f23956b = new LinkedList();
            this.f23957c = new HashMap();
        }

        public final a a(d adPhaseParams) {
            kotlin.jvm.internal.t.f(adPhaseParams, "adPhaseParams");
            this.f23956b.add(adPhaseParams);
            return this;
        }

        public final c b() {
            k kVar = this.f23962h;
            u uVarD = this.f23958d;
            if (uVarD == null) {
                uVarD = pa.i.f23787a.d();
            }
            u uVar = uVarD;
            Queue queue = this.f23956b;
            mc.d dVar = this.f23955a;
            nc.a aVarC = this.f23960f;
            if (aVarC == null) {
                aVarC = nc.a.f22962d.c();
            }
            return new c(uVar, queue, dVar, aVarC, this.f23959e, this.f23961g, kVar, this.f23963i, this.f23957c);
        }

        public final a c(k kVar) {
            this.f23962h = kVar;
            return this;
        }

        public final a d(u cacheType) {
            kotlin.jvm.internal.t.f(cacheType, "cacheType");
            this.f23958d = cacheType;
            return this;
        }

        public final a e(Map<String, String> map) {
            wb.e0.H(this.f23957c, map);
            return this;
        }

        public final a f(v0 v0Var) {
            this.f23961g = v0Var;
            return this;
        }

        public final a g(d dVar) {
            this.f23959e = dVar;
            return this;
        }

        public final a h(nc.a aVar) {
            this.f23960f = aVar;
            return this;
        }

        public final a i(l1 l1Var) {
            this.f23963i = l1Var;
            return this;
        }
    }

    public c(u cacheType, Queue<d> adPhaseParamsQueue, mc.d viewabilityTrackerParams, nc.a visibilityParams, d dVar, v0 v0Var, k kVar, l1 l1Var, Map<String, String> customParams) {
        kotlin.jvm.internal.t.f(cacheType, "cacheType");
        kotlin.jvm.internal.t.f(adPhaseParamsQueue, "adPhaseParamsQueue");
        kotlin.jvm.internal.t.f(viewabilityTrackerParams, "viewabilityTrackerParams");
        kotlin.jvm.internal.t.f(visibilityParams, "visibilityParams");
        kotlin.jvm.internal.t.f(customParams, "customParams");
        this.f23946a = cacheType;
        this.f23947b = adPhaseParamsQueue;
        this.f23948c = viewabilityTrackerParams;
        this.f23949d = visibilityParams;
        this.f23950e = dVar;
        this.f23951f = v0Var;
        this.f23952g = kVar;
        this.f23953h = l1Var;
        this.f23954i = customParams;
    }

    public final Queue<d> a() {
        return this.f23947b;
    }

    public final k b() {
        return this.f23952g;
    }

    public final u c() {
        return this.f23946a;
    }

    public final v0 d() {
        return this.f23951f;
    }

    public final d e() {
        return this.f23950e;
    }

    public final mc.d f() {
        return this.f23948c;
    }

    public final nc.a g() {
        return this.f23949d;
    }

    public final l1 h() {
        return this.f23953h;
    }
}
