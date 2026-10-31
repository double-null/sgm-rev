package pa;

import ud.e1;
import ud.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f23769i = new e(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f23770j = new h(a.f23779d, b.f23780d, c.f23781d, d.f23782d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a f23771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a f23772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.a f23773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.a f23774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wc.k f23775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f23776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wc.k f23777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.k f23778h;

    static final class a extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f23779d = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.c();
        }
    }

    static final class b extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23780d = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.c().q0();
        }
    }

    static final class c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f23781d = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.b();
        }
    }

    static final class d extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f23782d = new d();

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.a();
        }
    }

    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            return h.f23770j;
        }

        private e() {
        }
    }

    static final class f extends kotlin.jvm.internal.u implements id.a {
        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) h.this.f23774d.invoke();
        }
    }

    static final class g extends kotlin.jvm.internal.u implements id.a {
        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) h.this.f23773c.invoke();
        }
    }

    /* JADX INFO: renamed from: pa.h$h, reason: collision with other inner class name */
    static final class C0392h extends kotlin.jvm.internal.u implements id.a {
        C0392h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) h.this.f23771a.invoke();
        }
    }

    static final class i extends kotlin.jvm.internal.u implements id.a {
        i() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) h.this.f23772b.invoke();
        }
    }

    public h(id.a mainProvider, id.a mainImmediateProvider, id.a ioProvider, id.a defaultProvider) {
        kotlin.jvm.internal.t.f(mainProvider, "mainProvider");
        kotlin.jvm.internal.t.f(mainImmediateProvider, "mainImmediateProvider");
        kotlin.jvm.internal.t.f(ioProvider, "ioProvider");
        kotlin.jvm.internal.t.f(defaultProvider, "defaultProvider");
        this.f23771a = mainProvider;
        this.f23772b = mainImmediateProvider;
        this.f23773c = ioProvider;
        this.f23774d = defaultProvider;
        this.f23775e = wc.m.a(new C0392h());
        this.f23776f = wc.m.a(new i());
        this.f23777g = wc.m.a(new g());
        this.f23778h = wc.m.a(new f());
    }

    public static final h j() {
        return f23769i.a();
    }

    public final k0 d() {
        return (k0) this.f23778h.getValue();
    }

    public final k0 f() {
        return (k0) this.f23777g.getValue();
    }

    public final k0 h() {
        return (k0) this.f23775e.getValue();
    }

    public final k0 i() {
        return (k0) this.f23776f.getValue();
    }
}
