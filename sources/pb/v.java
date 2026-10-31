package pb;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24230d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final PointF f24231e = new PointF(0.5f, 0.5f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final PointF f24232f = new PointF(0.1f, 0.1f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f24233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f24234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f24235c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final PointF a() {
            return v.f24231e;
        }

        public final PointF b() {
            return v.f24232f;
        }

        private a() {
        }
    }

    public v() {
        this(null, null, null, 7, null);
    }

    public final PointF c() {
        return this.f24233a;
    }

    public final Long d() {
        return this.f24235c;
    }

    public final PointF e() {
        return this.f24234b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.t.a(this.f24233a, vVar.f24233a) && kotlin.jvm.internal.t.a(this.f24234b, vVar.f24234b) && kotlin.jvm.internal.t.a(this.f24235c, vVar.f24235c);
    }

    public int hashCode() {
        int iHashCode = ((this.f24233a.hashCode() * 31) + this.f24234b.hashCode()) * 31;
        Long l10 = this.f24235c;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "ClickArea(center=" + this.f24233a + ", spread=" + this.f24234b + ", seed=" + this.f24235c + ')';
    }

    public v(PointF center, PointF spread, Long l10) {
        kotlin.jvm.internal.t.f(center, "center");
        kotlin.jvm.internal.t.f(spread, "spread");
        this.f24233a = center;
        this.f24234b = spread;
        this.f24235c = l10;
    }

    public /* synthetic */ v(PointF pointF, PointF pointF2, Long l10, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? f24231e : pointF, (i10 & 2) != 0 ? f24232f : pointF2, (i10 & 4) != 0 ? null : l10);
    }
}
