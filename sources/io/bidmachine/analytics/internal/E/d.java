package io.bidmachine.analytics.internal.E;

import kotlin.jvm.internal.u;
import ud.e1;
import ud.k0;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0275d f16823g = new C0275d(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f16824h = new d(a.f16831a, b.f16832a, c.f16833a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a f16825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a f16826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.a f16827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f16828d = m.a(new g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f16829e = m.a(new f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f16830f = m.a(new e());

    static final class a extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16831a = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.c();
        }
    }

    static final class b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16832a = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.b();
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16833a = new c();

        c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return e1.a();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.E.d$d, reason: collision with other inner class name */
    public static final class C0275d {
        public /* synthetic */ C0275d(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final d a() {
            return d.f16824h;
        }

        private C0275d() {
        }
    }

    static final class e extends u implements id.a {
        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) d.this.f16827c.invoke();
        }
    }

    static final class f extends u implements id.a {
        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) d.this.f16826b.invoke();
        }
    }

    static final class g extends u implements id.a {
        g() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return (k0) d.this.f16825a.invoke();
        }
    }

    public d(id.a aVar, id.a aVar2, id.a aVar3) {
        this.f16825a = aVar;
        this.f16826b = aVar2;
        this.f16827c = aVar3;
    }

    public final k0 b() {
        return (k0) this.f16830f.getValue();
    }

    public final k0 c() {
        return (k0) this.f16829e.getValue();
    }
}
