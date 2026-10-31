package e3;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* JADX INFO: loaded from: classes4.dex */
final class a0 extends h0.f.d.AbstractC0212f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h0.f.d.e> f14105a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    static final class b extends h0.f.d.AbstractC0212f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<h0.f.d.e> f14106a;

        b() {
        }

        @Override // e3.h0.f.d.AbstractC0212f.a
        public h0.f.d.AbstractC0212f a() {
            List<h0.f.d.e> list = this.f14106a;
            if (list != null) {
                return new a0(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // e3.h0.f.d.AbstractC0212f.a
        public h0.f.d.AbstractC0212f.a b(List<h0.f.d.e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f14106a = list;
            return this;
        }
    }

    @Override // e3.h0.f.d.AbstractC0212f
    public List<h0.f.d.e> b() {
        return this.f14105a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.AbstractC0212f) {
            return this.f14105a.equals(((h0.f.d.AbstractC0212f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14105a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f14105a + "}";
    }

    private a0(List<h0.f.d.e> list) {
        this.f14105a = list;
    }
}
