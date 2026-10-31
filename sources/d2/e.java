package d2;

import android.content.Context;
import java.util.concurrent.Executor;
import k2.x;
import l2.m0;
import l2.n0;
import l2.w0;

/* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
    private static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f13208a;

        private b() {
        }

        @Override // d2.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f13208a = (Context) f2.d.b(context);
            return this;
        }

        @Override // d2.v.a
        public v build() {
            f2.d.a(this.f13208a, Context.class);
            return new c(this.f13208a);
        }
    }

    /* JADX INFO: compiled from: DaggerTransportRuntimeComponent.java */
    private static final class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f13209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private vc.a<Executor> f13210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private vc.a<Context> f13211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private vc.a f13212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private vc.a f13213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private vc.a f13214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private vc.a<String> f13215g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private vc.a<m0> f13216h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private vc.a<k2.f> f13217i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private vc.a<x> f13218j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private vc.a<j2.c> f13219k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private vc.a<k2.r> f13220l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private vc.a<k2.v> f13221m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private vc.a<u> f13222n;

        private void e(Context context) {
            this.f13210b = f2.a.a(k.a());
            f2.b bVarA = f2.c.a(context);
            this.f13211c = bVarA;
            e2.j jVarA = e2.j.a(bVarA, n2.c.a(), n2.d.a());
            this.f13212d = jVarA;
            this.f13213e = f2.a.a(e2.l.a(this.f13211c, jVarA));
            this.f13214f = w0.a(this.f13211c, l2.g.a(), l2.i.a());
            this.f13215g = f2.a.a(l2.h.a(this.f13211c));
            this.f13216h = f2.a.a(n0.a(n2.c.a(), n2.d.a(), l2.j.a(), this.f13214f, this.f13215g));
            j2.g gVarB = j2.g.b(n2.c.a());
            this.f13217i = gVarB;
            j2.i iVarA = j2.i.a(this.f13211c, this.f13216h, gVarB, n2.d.a());
            this.f13218j = iVarA;
            vc.a<Executor> aVar = this.f13210b;
            vc.a aVar2 = this.f13213e;
            vc.a<m0> aVar3 = this.f13216h;
            this.f13219k = j2.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
            vc.a<Context> aVar4 = this.f13211c;
            vc.a aVar5 = this.f13213e;
            vc.a<m0> aVar6 = this.f13216h;
            this.f13220l = k2.s.a(aVar4, aVar5, aVar6, this.f13218j, this.f13210b, aVar6, n2.c.a(), n2.d.a(), this.f13216h);
            vc.a<Executor> aVar7 = this.f13210b;
            vc.a<m0> aVar8 = this.f13216h;
            this.f13221m = k2.w.a(aVar7, aVar8, this.f13218j, aVar8);
            this.f13222n = f2.a.a(w.a(n2.c.a(), n2.d.a(), this.f13219k, this.f13220l, this.f13221m));
        }

        @Override // d2.v
        l2.d b() {
            return this.f13216h.get();
        }

        @Override // d2.v
        u c() {
            return this.f13222n.get();
        }

        private c(Context context) {
            this.f13209a = this;
            e(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
