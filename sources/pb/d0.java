package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23987e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f23988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f23991d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public d0(e0 eventTaskType, String target, Object obj, List<String> stateGroups) {
        kotlin.jvm.internal.t.f(eventTaskType, "eventTaskType");
        kotlin.jvm.internal.t.f(target, "target");
        kotlin.jvm.internal.t.f(stateGroups, "stateGroups");
        this.f23988a = eventTaskType;
        this.f23989b = target;
        this.f23990c = obj;
        this.f23991d = stateGroups;
    }

    public final e0 a() {
        return this.f23988a;
    }

    public final List<String> b() {
        return this.f23991d;
    }

    public final String c() {
        return this.f23989b;
    }

    public final Object d() {
        return this.f23990c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f23988a == d0Var.f23988a && kotlin.jvm.internal.t.a(this.f23989b, d0Var.f23989b) && kotlin.jvm.internal.t.a(this.f23990c, d0Var.f23990c) && kotlin.jvm.internal.t.a(this.f23991d, d0Var.f23991d);
    }

    public int hashCode() {
        int iHashCode = ((this.f23988a.hashCode() * 31) + this.f23989b.hashCode()) * 31;
        Object obj = this.f23990c;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.f23991d.hashCode();
    }

    public String toString() {
        return "EventTaskParams(eventTaskType=" + this.f23988a + ", target=" + this.f23989b + ", value=" + this.f23990c + ", stateGroups=" + this.f23991d + ')';
    }
}
