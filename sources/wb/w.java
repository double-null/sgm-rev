package wb;

import ud.e1;
import ud.k0;

/* JADX INFO: compiled from: SdkDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f27717g = new d(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w f27718h = new w(a.f27725d, b.f27726d, c.f27727d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a<k0> f27719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a<k0> f27720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.a<k0> f27721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.k f27722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wc.k f27723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f27724f;

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    static final class a extends kotlin.jvm.internal.u implements id.a<k0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f27725d = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.c();
        }
    }

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    static final class b extends kotlin.jvm.internal.u implements id.a<k0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f27726d = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.b();
        }
    }

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    static final class c extends kotlin.jvm.internal.u implements id.a<k0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f27727d = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.a();
        }
    }

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final w a() {
            return w.f27718h;
        }
    }

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    static final class e extends kotlin.jvm.internal.u implements id.a<k0> {
        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) w.this.f27721c.invoke();
        }
    }

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    static final class f extends kotlin.jvm.internal.u implements id.a<k0> {
        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) w.this.f27720b.invoke();
        }
    }

    /* JADX INFO: compiled from: SdkDispatchers.kt */
    static final class g extends kotlin.jvm.internal.u implements id.a<k0> {
        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) w.this.f27719a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(id.a<? extends k0> mainProvider, id.a<? extends k0> ioProvider, id.a<? extends k0> defaultProvider) {
        kotlin.jvm.internal.t.f(mainProvider, "mainProvider");
        kotlin.jvm.internal.t.f(ioProvider, "ioProvider");
        kotlin.jvm.internal.t.f(defaultProvider, "defaultProvider");
        this.f27719a = mainProvider;
        this.f27720b = ioProvider;
        this.f27721c = defaultProvider;
        this.f27722d = wc.m.a(new g());
        this.f27723e = wc.m.a(new f());
        this.f27724f = wc.m.a(new e());
    }

    public final k0 e() {
        return (k0) this.f27723e.getValue();
    }

    public final k0 f() {
        return (k0) this.f27722d.getValue();
    }
}
