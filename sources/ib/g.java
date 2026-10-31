package ib;

import android.view.View;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.t2;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f16233l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.j f16234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f16235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wc.k f16236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.k f16237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wc.k f16238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f16239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wc.k f16240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.k f16241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f16242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ib.b f16243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ib.a.C0255a f16244k;

    private static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f16252d = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final fc.a invoke() {
            return new fc.a();
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f16253d = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qb.f invoke() {
            return new qb.f();
        }
    }

    static final class e extends u implements id.a {
        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return new l(g.this.e());
        }
    }

    static final class f extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f16255d = new f();

        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return new n();
        }
    }

    /* JADX INFO: renamed from: ib.g$g, reason: collision with other inner class name */
    static final class C0258g extends u implements id.a {
        C0258g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(new o.a(null, g.this.f16235b.d().a(), g.this.f16235b.d().c(), o.a.InterfaceC0262a.b.f16358a, 1, null), pa.h.f23769i.a(), g.this.a().g());
        }
    }

    static final class h extends u implements id.a {
        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ec.a invoke() {
            return new ec.a(g.this.f16234a);
        }
    }

    public g(zc.j coroutineContext, b config) {
        t.f(coroutineContext, "coroutineContext");
        t.f(config, "config");
        this.f16234a = coroutineContext;
        this.f16235b = config;
        this.f16236c = wc.m.a(new h());
        this.f16237d = wc.m.a(c.f16252d);
        this.f16238e = wc.m.a(d.f16253d);
        this.f16239f = wc.m.a(new e());
        this.f16240g = wc.m.a(f.f16255d);
        this.f16241h = wc.m.a(new C0258g());
        this.f16242i = new ib.e();
        this.f16243j = new ib.b(new ib.b.a(config.e(), config.f(), new ib.d.a(config.d().c())));
        this.f16244k = new ib.a.C0255a(35, new ib.d.a(config.d().c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fc.b a() {
        return (fc.b) this.f16237d.getValue();
    }

    private final ib.a b(Integer num) {
        return new ib.a(this.f16234a, this.f16244k, new ib.c(new ib.c.a(num, this.f16235b.a(), this.f16235b.c(), this.f16235b.b())), this.f16242i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bc.c e() {
        return (bc.c) this.f16238e.getValue();
    }

    private final i f(Integer num) {
        return new i(new i.a(num != null ? num.intValue() : -16777216, this.f16235b.d().c(), this.f16235b.g().a(), this.f16235b.g().c(), i.a.InterfaceC0259a.C0260a.f16286a), this.f16242i);
    }

    private final l j() {
        return (l) this.f16239f.getValue();
    }

    private final n l() {
        return (n) this.f16240g.getValue();
    }

    private final o m() {
        return (o) this.f16241h.getValue();
    }

    private final dc.d n() {
        return (dc.d) this.f16236c.getValue();
    }

    public final void d(View view, Integer num, id.a onFallback, id.l onFinished) {
        t.f(view, "view");
        t.f(onFallback, "onFallback");
        t.f(onFinished, "onFinished");
        n().c(new ib.h(view, 1000L, new j(l(), m(), b(num), f(num), j()), j(), onFallback, onFinished));
    }

    public final void h(View view, Integer num, id.a onFallback, id.l onFinished) {
        t.f(view, "view");
        t.f(onFallback, "onFallback");
        t.f(onFinished, "onFinished");
        n().c(new ib.h(view, 1000L, new k(l(), m(), b(num), this.f16243j, f(num), j()), j(), onFallback, onFinished));
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final od.h f16245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final od.h f16248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f16249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f16250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f16251g;

        public b(od.h dimensionsRangePx, int i10, int i11, od.h sampleStepRangePx, float f10, float f11, float f12) {
            t.f(dimensionsRangePx, "dimensionsRangePx");
            t.f(sampleStepRangePx, "sampleStepRangePx");
            this.f16245a = dimensionsRangePx;
            this.f16246b = i10;
            this.f16247c = i11;
            this.f16248d = sampleStepRangePx;
            this.f16249e = f10;
            this.f16250f = f11;
            this.f16251g = f12;
        }

        public final float a() {
            return this.f16249e;
        }

        public final float b() {
            return this.f16251g;
        }

        public final float c() {
            return this.f16250f;
        }

        public final od.h d() {
            return this.f16245a;
        }

        public final int e() {
            return this.f16246b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.a(this.f16245a, bVar.f16245a) && this.f16246b == bVar.f16246b && this.f16247c == bVar.f16247c && t.a(this.f16248d, bVar.f16248d) && Float.compare(this.f16249e, bVar.f16249e) == 0 && Float.compare(this.f16250f, bVar.f16250f) == 0 && Float.compare(this.f16251g, bVar.f16251g) == 0;
        }

        public final int f() {
            return this.f16247c;
        }

        public final od.h g() {
            return this.f16248d;
        }

        public int hashCode() {
            return (((((((((((this.f16245a.hashCode() * 31) + Integer.hashCode(this.f16246b)) * 31) + Integer.hashCode(this.f16247c)) * 31) + this.f16248d.hashCode()) * 31) + Float.hashCode(this.f16249e)) * 31) + Float.hashCode(this.f16250f)) * 31) + Float.hashCode(this.f16251g);
        }

        public String toString() {
            return "Config(dimensionsRangePx=" + this.f16245a + ", maxOffsetPx=" + this.f16246b + ", maxSampleSizePx=" + this.f16247c + ", sampleStepRangePx=" + this.f16248d + ", detectorAlphaThreshold=" + this.f16249e + ", detectorTolerance=" + this.f16250f + ", detectorBrightnessThreshold=" + this.f16251g + ')';
        }

        public /* synthetic */ b(od.h hVar, int i10, int i11, od.h hVar2, float f10, float f11, float f12, int i12, kotlin.jvm.internal.k kVar) {
            this((i12 & 1) != 0 ? new od.h(200, 512) : hVar, (i12 & 2) != 0 ? 5 : i10, (i12 & 4) != 0 ? 25 : i11, (i12 & 8) != 0 ? new od.h(1, 8) : hVar2, (i12 & 16) != 0 ? 0.01f : f10, (i12 & 32) != 0 ? 0.02f : f11, (i12 & 64) != 0 ? 0.04f : f12);
        }
    }

    public /* synthetic */ g(zc.j jVar, b bVar, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? t2.b(null, 1, null).z(pa.h.f23769i.a().d()) : jVar, (i10 & 2) != 0 ? new b(null, 0, 0, null, 0.0f, 0.0f, 0.0f, 127, null) : bVar);
    }
}
