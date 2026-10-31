package io.bidmachine.analytics.internal.p002a;

import io.bidmachine.analytics.internal.p.e;
import io.bidmachine.analytics.internal.q.g;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f16856a = m.a(b.f16860a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f16857b = m.a(C0278c.f16861a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f16858c = m.a(a.f16859a);

    static final class a extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16859a = new a();

        a() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.o.b invoke() {
            return new io.bidmachine.analytics.internal.o.b();
        }
    }

    static final class b extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16860a = new b();

        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(0, 1, null);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.a.c$c, reason: collision with other inner class name */
    static final class C0278c extends u implements id.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0278c f16861a = new C0278c();

        C0278c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g();
        }
    }

    public final io.bidmachine.analytics.internal.o.b a() {
        return (io.bidmachine.analytics.internal.o.b) this.f16858c.getValue();
    }

    public final e b() {
        return (e) this.f16856a.getValue();
    }

    public final g c() {
        return (g) this.f16857b.getValue();
    }
}
