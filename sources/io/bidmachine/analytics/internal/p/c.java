package io.bidmachine.analytics.internal.p;

import android.content.Context;
import id.l;
import io.bidmachine.analytics.ReaderConfig;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends io.bidmachine.analytics.internal.n.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f17188k = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f17189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f17190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f17191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f17192j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends u implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17193a = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // id.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(e eVar) {
            return new d(eVar, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p.c$c, reason: collision with other inner class name */
    static final class C0299c extends u implements id.a {
        C0299c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return (d) c.this.f17190h.invoke(c.this.e());
        }
    }

    public /* synthetic */ c(io.bidmachine.analytics.internal.p002a.a aVar, l lVar, int i10, kotlin.jvm.internal.k kVar) {
        this(aVar, (i10 & 2) != 0 ? a.f17193a : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e e() {
        return this.f17189g.c().b();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        d().b();
        super.f(context);
    }

    private final d d() {
        return (d) this.f17192j.getValue();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17191i;
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        super.e(context);
        d().a();
    }

    public c(io.bidmachine.analytics.internal.p002a.a aVar, l lVar) {
        this.f17189g = aVar;
        this.f17190h = lVar;
        this.f17191i = "alog";
        this.f17192j = m.a(new C0299c());
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(io.bidmachine.analytics.internal.n.a.C0295a c0295a) {
        super.b(c0295a);
        d().a(c0295a);
    }

    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, zc.f fVar) {
        return d().a(rule);
    }
}
