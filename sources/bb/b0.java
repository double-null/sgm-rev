package bb;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m0;
import pa.c0;
import pa.d0;
import pb.a1;
import pb.f0;
import pb.s0;
import ud.o0;
import wc.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements bb.t {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f4232u = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wb.y f4234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lb.c f4235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bb.u f4236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ab.c f4237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f4238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wc.k f4239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.k f4240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private bb.v f4241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fb.f f4242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final db.b f4243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final wc.k f4244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wc.k f4245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final dc.d f4246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f4247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f4248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f4249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f4250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final wc.k f4251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f4252t;

    private final class a extends b {
        public a() {
            super();
        }

        @Override // bb.b0.b, qa.c
        public void c(qa.a adForm, pb.b0 error) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            kotlin.jvm.internal.t.f(error, "error");
            super.c(adForm, error);
            b0.this.B(error);
            b0.this.d().c(adForm);
        }

        @Override // bb.b0.b, qa.c
        public void d(qa.a adForm) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            super.d(adForm);
            b0.this.d().c(adForm);
        }

        @Override // bb.b0.b, qa.c
        public void e(qa.a adForm) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            super.e(adForm);
            if (b0.E(b0.this, adForm, false, 2, null)) {
                if (b0.this.f4247o.isEmpty()) {
                    b0.this.j0();
                }
            } else {
                c(adForm, new pb.b0("Failed to setup ad element (" + adForm + ')'));
            }
        }

        @Override // bb.b0.b, qa.c
        public void b(qa.a aVar, pb.b0 error) {
            kotlin.jvm.internal.t.f(aVar, EFLCCdIRcb.Nyae);
            kotlin.jvm.internal.t.f(error, "error");
            super.b(aVar, error);
            b0.this.B(error);
            b0.this.d().c(aVar);
        }
    }

    private abstract class b implements qa.c {
        public b() {
        }

        @Override // qa.c
        public void a(qa.a adForm, pb.b0 error) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            kotlin.jvm.internal.t.f(error, "error");
            pa.t.b(b0.this.f4234b, "AdsElement (" + adForm + ") - onAdFormFailToShow - " + error, new Object[0]);
        }

        @Override // qa.c
        public void b(qa.a adForm, pb.b0 error) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            kotlin.jvm.internal.t.f(error, "error");
            pa.t.b(b0.this.f4234b, "AdsElement (" + adForm + ") - onAdFormExpired - " + error, new Object[0]);
        }

        @Override // qa.c
        public void c(qa.a adForm, pb.b0 error) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            kotlin.jvm.internal.t.f(error, "error");
            pa.t.b(b0.this.f4234b, "AdsElement (" + adForm + ") - onAdFormFailToLoad - " + error, new Object[0]);
            b0.this.f4247o.remove(adForm);
        }

        @Override // qa.c
        public void d(qa.a adForm) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            pa.t.g(b0.this.f4234b, "AdsElement (" + adForm + ") - onAdFormShown", new Object[0]);
        }

        @Override // qa.c
        public void e(qa.a adForm) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            pa.t.g(b0.this.f4234b, "AdsElement (" + adForm + ") - onAdFormLoaded", new Object[0]);
            b0.this.f4247o.remove(adForm);
        }
    }

    private final class c implements db.b {
        public c() {
        }

        @Override // db.b
        public void i(pb.t brokenCreativeEvent) {
            kotlin.jvm.internal.t.f(brokenCreativeEvent, "brokenCreativeEvent");
            b0.this.A(brokenCreativeEvent);
        }
    }

    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.k kVar) {
            this();
        }

        private d() {
        }
    }

    private final class e extends b {
        public e() {
            super();
        }

        @Override // bb.b0.b, qa.c
        public void b(qa.a adForm, pb.b0 error) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            kotlin.jvm.internal.t.f(error, "error");
            super.b(adForm, error);
            b0 b0Var = b0.this;
            b0Var.x(adForm, b0Var.a0());
        }

        @Override // bb.b0.b, qa.c
        public void c(qa.a adForm, pb.b0 error) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            kotlin.jvm.internal.t.f(error, "error");
            super.c(adForm, error);
            b0 b0Var = b0.this;
            b0Var.x(adForm, b0Var.a0());
        }

        @Override // bb.b0.b, qa.c
        public void e(qa.a adForm) {
            kotlin.jvm.internal.t.f(adForm, "adForm");
            super.e(adForm);
            if (!b0.this.F(adForm, true)) {
                c(adForm, new pb.b0("Failed to setup ad element (" + adForm + ')'));
            }
            if (b0.this.f4247o.isEmpty()) {
                b0.this.j0();
            }
        }
    }

    private final class f implements fb.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f4257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f4258b;

        public static final class a implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4259a;

            public a(Object obj) {
                this.f4259a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.g) this.f4259a).a();
            }
        }

        public static final class b implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4260a;

            public b(Object obj) {
                this.f4260a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.g) this.f4260a).a();
            }
        }

        public static final class c implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4261a;

            public c(Object obj) {
                this.f4261a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.g) this.f4261a).a();
            }
        }

        public static final class d implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4262a;

            public d(Object obj) {
                this.f4262a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.g) this.f4262a).a();
            }
        }

        public static final class e extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4263h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4264i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4265j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4266k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4267l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4268m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ b0 f4269n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Integer f4270o;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4271a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b0 f4272b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Integer f4273c;

                public a(Object obj, b0 b0Var, Integer num) {
                    this.f4271a = obj;
                    this.f4272b = b0Var;
                    this.f4273c = num;
                }

                @Override // wb.v
                public final void p() {
                    qb.m mVar = (qb.m) this.f4271a;
                    this.f4272b.D(mVar, false, this.f4273c != null, new C0085f(mVar));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, b0 b0Var2, Integer num) {
                super(2, fVar);
                this.f4264i = b0Var;
                this.f4265j = str;
                this.f4266k = str2;
                this.f4267l = cls;
                this.f4268m = str3;
                this.f4269n = b0Var2;
                this.f4270o = num;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new e(this.f4264i, this.f4265j, this.f4266k, this.f4267l, this.f4268m, fVar, this.f4269n, this.f4270o);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4263h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4264i.H(this.f4265j);
                if (objH == null) {
                    this.f4264i.s(this.f4266k, this.f4265j);
                } else if (!this.f4267l.isInstance(objH)) {
                    this.f4264i.t(this.f4266k, this.f4265j, this.f4268m);
                } else if (this.f4267l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4269n, this.f4270o));
                }
                return g0.f27756a;
            }
        }

        /* JADX INFO: renamed from: bb.b0$f$f, reason: collision with other inner class name */
        static final class C0085f implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.m f4274a;

            C0085f(qb.m mVar) {
                this.f4274a = mVar;
            }

            @Override // wb.v
            public final void p() {
                this.f4274a.t(false);
            }
        }

        public static final class g extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4275h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4276i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4277j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4278k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4279l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4280m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f4281n;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4282a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f4283b;

                public a(Object obj, boolean z10) {
                    this.f4282a = obj;
                    this.f4283b = z10;
                }

                @Override // wb.v
                public final void p() {
                    ((qb.m) this.f4282a).s(this.f4283b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, boolean z10) {
                super(2, fVar);
                this.f4276i = b0Var;
                this.f4277j = str;
                this.f4278k = str2;
                this.f4279l = cls;
                this.f4280m = str3;
                this.f4281n = z10;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((g) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new g(this.f4276i, this.f4277j, this.f4278k, this.f4279l, this.f4280m, fVar, this.f4281n);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4275h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4276i.H(this.f4277j);
                if (objH == null) {
                    this.f4276i.s(this.f4278k, this.f4277j);
                } else if (!this.f4279l.isInstance(objH)) {
                    this.f4276i.t(this.f4278k, this.f4277j, this.f4280m);
                } else if (this.f4279l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4281n));
                }
                return g0.f27756a;
            }
        }

        public static final class h extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4284h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4285i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4286j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4287k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4288l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4289m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f4290n;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4291a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Integer f4292b;

                public a(Object obj, Integer num) {
                    this.f4291a = obj;
                    this.f4292b = num;
                }

                @Override // wb.v
                public final void p() {
                    ((pa.v) this.f4291a).q(this.f4292b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, Integer num) {
                super(2, fVar);
                this.f4285i = b0Var;
                this.f4286j = str;
                this.f4287k = str2;
                this.f4288l = cls;
                this.f4289m = str3;
                this.f4290n = num;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((h) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new h(this.f4285i, this.f4286j, this.f4287k, this.f4288l, this.f4289m, fVar, this.f4290n);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4284h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4285i.H(this.f4286j);
                if (objH == null) {
                    this.f4285i.s(this.f4287k, this.f4286j);
                } else if (!this.f4288l.isInstance(objH)) {
                    this.f4285i.t(this.f4287k, this.f4286j, this.f4289m);
                } else if (this.f4288l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4290n));
                }
                return g0.f27756a;
            }
        }

        public static final class i implements pa.r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f4293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f4294b;

            public static final class a extends kotlin.coroutines.jvm.internal.l implements id.p {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f4295h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ b0 f4296i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ String f4297j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ String f4298k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ Class f4299l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                final /* synthetic */ String f4300m;

                /* JADX INFO: renamed from: bb.b0$f$i$a$a, reason: collision with other inner class name */
                public static final class C0086a implements pa.s {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Object f4301a;

                    public C0086a(Object obj) {
                        this.f4301a = obj;
                    }

                    @Override // wb.v
                    public final void p() {
                        ((d0) this.f4301a).w();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar) {
                    super(2, fVar);
                    this.f4296i = b0Var;
                    this.f4297j = str;
                    this.f4298k = str2;
                    this.f4299l = cls;
                    this.f4300m = str3;
                }

                @Override // id.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(o0 o0Var, zc.f fVar) {
                    return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zc.f create(Object obj, zc.f fVar) {
                    return new a(this.f4296i, this.f4297j, this.f4298k, this.f4299l, this.f4300m, fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ad.d.f();
                    if (this.f4295h != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                    Object objH = this.f4296i.H(this.f4297j);
                    if (objH == null) {
                        this.f4296i.s(this.f4298k, this.f4297j);
                    } else if (!this.f4299l.isInstance(objH)) {
                        this.f4296i.t(this.f4298k, this.f4297j, this.f4300m);
                    } else if (this.f4299l.isInstance(objH)) {
                        qb.h.d(new C0086a(objH));
                    }
                    return g0.f27756a;
                }
            }

            i(b0 b0Var, String str) {
                this.f4293a = b0Var;
                this.f4294b = str;
            }

            @Override // wb.u
            public /* bridge */ /* synthetic */ void a(Object obj) {
                c(((Boolean) obj).booleanValue());
            }

            public void c(boolean z10) {
                if (z10) {
                    b0 b0Var = this.f4293a;
                    ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new a(b0Var, this.f4294b, "onClickResolved", d0.class, "TargetObject", null), 2, null);
                }
                bb.v vVarD0 = this.f4293a.d0();
                if (vVarD0 != null) {
                    vVarD0.f();
                }
            }
        }

        public static final class j extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4302h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4303i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4304j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4305k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4306l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4307m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f4308n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ long f4309o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ float f4310p;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4311a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ long f4312b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f4313c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f4314d;

                public a(Object obj, long j10, long j11, float f10) {
                    this.f4311a = obj;
                    this.f4312b = j10;
                    this.f4313c = j11;
                    this.f4314d = f10;
                }

                @Override // wb.v
                public final void p() {
                    ((pa.x) this.f4311a).a(this.f4312b, this.f4313c, this.f4314d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, long j10, long j11, float f10) {
                super(2, fVar);
                this.f4303i = b0Var;
                this.f4304j = str;
                this.f4305k = str2;
                this.f4306l = cls;
                this.f4307m = str3;
                this.f4308n = j10;
                this.f4309o = j11;
                this.f4310p = f10;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((j) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new j(this.f4303i, this.f4304j, this.f4305k, this.f4306l, this.f4307m, fVar, this.f4308n, this.f4309o, this.f4310p);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4302h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4303i.H(this.f4304j);
                if (objH == null) {
                    this.f4303i.s(this.f4305k, this.f4304j);
                } else if (!this.f4306l.isInstance(objH)) {
                    this.f4303i.t(this.f4305k, this.f4304j, this.f4307m);
                } else if (this.f4306l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4308n, this.f4309o, this.f4310p));
                }
                return g0.f27756a;
            }
        }

        public static final class k extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4315h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4316i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4317j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4318k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4319l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4320m;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4321a;

                public a(Object obj) {
                    this.f4321a = obj;
                }

                @Override // wb.v
                public final void p() {
                    ((pa.y) this.f4321a).i();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar) {
                super(2, fVar);
                this.f4316i = b0Var;
                this.f4317j = str;
                this.f4318k = str2;
                this.f4319l = cls;
                this.f4320m = str3;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((k) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new k(this.f4316i, this.f4317j, this.f4318k, this.f4319l, this.f4320m, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4315h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4316i.H(this.f4317j);
                if (objH == null) {
                    this.f4316i.s(this.f4318k, this.f4317j);
                } else if (!this.f4319l.isInstance(objH)) {
                    this.f4316i.t(this.f4318k, this.f4317j, this.f4320m);
                } else if (this.f4319l.isInstance(objH)) {
                    qb.h.d(new a(objH));
                }
                return g0.f27756a;
            }
        }

        public static final class l extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4322h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4323i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4324j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4325k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4326l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4327m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f4328n;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4329a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ long f4330b;

                public a(Object obj, long j10) {
                    this.f4329a = obj;
                    this.f4330b = j10;
                }

                @Override // wb.v
                public final void p() {
                    ((pa.a0) this.f4329a).a(this.f4330b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, long j10) {
                super(2, fVar);
                this.f4323i = b0Var;
                this.f4324j = str;
                this.f4325k = str2;
                this.f4326l = cls;
                this.f4327m = str3;
                this.f4328n = j10;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((l) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new l(this.f4323i, this.f4324j, this.f4325k, this.f4326l, this.f4327m, fVar, this.f4328n);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4322h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4323i.H(this.f4324j);
                if (objH == null) {
                    this.f4323i.s(this.f4325k, this.f4324j);
                } else if (!this.f4326l.isInstance(objH)) {
                    this.f4323i.t(this.f4325k, this.f4324j, this.f4327m);
                } else if (this.f4326l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4328n));
                }
                return g0.f27756a;
            }
        }

        public static final class m extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4331h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4332i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4333j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4334k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4335l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4336m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ b0 f4337n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Integer f4338o;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4339a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ b0 f4340b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Integer f4341c;

                public a(Object obj, b0 b0Var, Integer num) {
                    this.f4339a = obj;
                    this.f4340b = b0Var;
                    this.f4341c = num;
                }

                @Override // wb.v
                public final void p() {
                    qb.m mVar = (qb.m) this.f4339a;
                    this.f4340b.D(mVar, true, this.f4341c != null, new n(mVar));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, b0 b0Var2, Integer num) {
                super(2, fVar);
                this.f4332i = b0Var;
                this.f4333j = str;
                this.f4334k = str2;
                this.f4335l = cls;
                this.f4336m = str3;
                this.f4337n = b0Var2;
                this.f4338o = num;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((m) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new m(this.f4332i, this.f4333j, this.f4334k, this.f4335l, this.f4336m, fVar, this.f4337n, this.f4338o);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4331h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4332i.H(this.f4333j);
                if (objH == null) {
                    this.f4332i.s(this.f4334k, this.f4333j);
                } else if (!this.f4335l.isInstance(objH)) {
                    this.f4332i.t(this.f4334k, this.f4333j, this.f4336m);
                } else if (this.f4335l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4337n, this.f4338o));
                }
                return g0.f27756a;
            }
        }

        static final class n implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.m f4342a;

            n(qb.m mVar) {
                this.f4342a = mVar;
            }

            @Override // wb.v
            public final void p() {
                this.f4342a.t(true);
            }
        }

        public static final class o extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4343h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4344i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4345j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4346k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4347l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4348m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ g7.e f4349n;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4350a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g7.e f4351b;

                public a(Object obj, g7.e eVar) {
                    this.f4350a = obj;
                    this.f4351b = eVar;
                }

                @Override // wb.v
                public final void p() {
                    ((pa.d) this.f4350a).c(this.f4351b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, g7.e eVar) {
                super(2, fVar);
                this.f4344i = b0Var;
                this.f4345j = str;
                this.f4346k = str2;
                this.f4347l = cls;
                this.f4348m = str3;
                this.f4349n = eVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((o) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new o(this.f4344i, this.f4345j, this.f4346k, this.f4347l, this.f4348m, fVar, this.f4349n);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4343h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4344i.H(this.f4345j);
                if (objH == null) {
                    this.f4344i.s(this.f4346k, this.f4345j);
                } else if (!this.f4347l.isInstance(objH)) {
                    this.f4344i.t(this.f4346k, this.f4345j, this.f4348m);
                } else if (this.f4347l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4349n));
                }
                return g0.f27756a;
            }
        }

        public static final class p implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4352a;

            public p(Object obj) {
                this.f4352a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.b0) this.f4352a).e();
            }
        }

        public static final class q implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4353a;

            public q(Object obj) {
                this.f4353a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.b0) this.f4353a).e();
            }
        }

        public static final class r implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4354a;

            public r(Object obj) {
                this.f4354a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.b0) this.f4354a).e();
            }
        }

        public static final class s implements pa.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f4355a;

            public s(Object obj) {
                this.f4355a = obj;
            }

            @Override // wb.v
            public final void p() {
                ((pa.b0) this.f4355a).e();
            }
        }

        public static final class t extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4356h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4357i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4358j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4359k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4360l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4361m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f4362n;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4363a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f4364b;

                public a(Object obj, String str) {
                    this.f4363a = obj;
                    this.f4364b = str;
                }

                @Override // wb.v
                public final void p() {
                    ((c0) this.f4363a).a(this.f4364b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, String str4) {
                super(2, fVar);
                this.f4357i = b0Var;
                this.f4358j = str;
                this.f4359k = str2;
                this.f4360l = cls;
                this.f4361m = str3;
                this.f4362n = str4;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((t) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new t(this.f4357i, this.f4358j, this.f4359k, this.f4360l, this.f4361m, fVar, this.f4362n);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4356h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4357i.H(this.f4358j);
                if (objH == null) {
                    this.f4357i.s(this.f4359k, this.f4358j);
                } else if (!this.f4360l.isInstance(objH)) {
                    this.f4357i.t(this.f4359k, this.f4358j, this.f4361m);
                } else if (this.f4360l.isInstance(objH)) {
                    qb.h.d(new a(objH, this.f4362n));
                }
                return g0.f27756a;
            }
        }

        public static final class u extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4365h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4366i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4367j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4368k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4369l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4370m;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4371a;

                public a(Object obj) {
                    this.f4371a = obj;
                }

                @Override // wb.v
                public final void p() {
                    ((qb.m) this.f4371a).r();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar) {
                super(2, fVar);
                this.f4366i = b0Var;
                this.f4367j = str;
                this.f4368k = str2;
                this.f4369l = cls;
                this.f4370m = str3;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((u) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new u(this.f4366i, this.f4367j, this.f4368k, this.f4369l, this.f4370m, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4365h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                Object objH = this.f4366i.H(this.f4367j);
                if (objH == null) {
                    this.f4366i.s(this.f4368k, this.f4367j);
                } else if (!this.f4369l.isInstance(objH)) {
                    this.f4366i.t(this.f4368k, this.f4367j, this.f4370m);
                } else if (this.f4369l.isInstance(objH)) {
                    qb.h.d(new a(objH));
                }
                return g0.f27756a;
            }
        }

        public f(b0 b0Var, Context context) {
            kotlin.jvm.internal.t.f(context, "context");
            this.f4258b = b0Var;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
            this.f4257a = applicationContext;
        }

        private final void r(String str, String str2) {
            bb.v vVarD0 = this.f4258b.d0();
            if (vVarD0 != null) {
                vVarD0.d();
            }
            qb.j.c(this.f4257a, str2, new i(this.f4258b, str));
        }

        @Override // fb.f
        public void a() {
            b0 b0Var = this.f4258b;
            for (pa.d dVar : b0Var.Z()) {
                if (pa.g.class.isInstance(dVar)) {
                    qb.h.d(new a(dVar));
                }
            }
            for (pa.d dVar2 : b0Var.a0()) {
                if (pa.g.class.isInstance(dVar2)) {
                    qb.h.d(new b(dVar2));
                }
            }
            for (pa.u uVar : b0Var.c0()) {
                if (pa.g.class.isInstance(uVar)) {
                    qb.h.d(new c(uVar));
                }
            }
            d0 d0VarB0 = b0Var.b0();
            if (pa.g.class.isInstance(d0VarB0)) {
                qb.h.d(new d(d0VarB0));
            }
        }

        @Override // fb.f
        public void b(String url) {
            kotlin.jvm.internal.t.f(url, "url");
            new qb.c.a(url, qb.c.e.Get).f(la.f.d()).c();
        }

        @Override // fb.f
        public void c() {
            bb.v vVarD0 = this.f4258b.d0();
            if (vVarD0 != null) {
                vVarD0.c();
            }
        }

        @Override // fb.f
        public void d() {
            bb.v vVarD0 = this.f4258b.d0();
            if (vVarD0 != null) {
                vVarD0.g();
            }
        }

        @Override // fb.f
        public void e() {
            b0 b0Var = this.f4258b;
            for (pa.d dVar : b0Var.Z()) {
                if (pa.b0.class.isInstance(dVar)) {
                    qb.h.d(new p(dVar));
                }
            }
            for (pa.d dVar2 : b0Var.a0()) {
                if (pa.b0.class.isInstance(dVar2)) {
                    qb.h.d(new q(dVar2));
                }
            }
            for (pa.u uVar : b0Var.c0()) {
                if (pa.b0.class.isInstance(uVar)) {
                    qb.h.d(new r(uVar));
                }
            }
            d0 d0VarB0 = b0Var.b0();
            if (pa.b0.class.isInstance(d0VarB0)) {
                qb.h.d(new s(d0VarB0));
            }
        }

        @Override // fb.f
        public void f(String sourceName, String url) {
            kotlin.jvm.internal.t.f(sourceName, "sourceName");
            kotlin.jvm.internal.t.f(url, "url");
            r(sourceName, url);
        }

        @Override // fb.f
        public void g(String sourceName, String url) {
            kotlin.jvm.internal.t.f(sourceName, "sourceName");
            kotlin.jvm.internal.t.f(url, "url");
            r(sourceName, url);
        }

        @Override // fb.f
        public void h(String targetElementName, Integer num) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new m(b0Var, targetElementName, "show", qb.m.class, "VisibilityChanger", null, b0Var, num), 2, null);
        }

        @Override // fb.f
        public void i(String targetElementName, Integer num) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new e(b0Var, targetElementName, "hide", qb.m.class, "VisibilityChanger", null, b0Var, num), 2, null);
        }

        @Override // fb.f
        public void j(a1 privacySheetParams) {
            kotlin.jvm.internal.t.f(privacySheetParams, "privacySheetParams");
            bb.v vVarD0 = this.f4258b.d0();
            if (vVarD0 != null) {
                vVarD0.j(privacySheetParams);
            }
        }

        @Override // fb.f
        public void k(String targetElementName, Integer num) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new v(b0Var, targetElementName, "unmute", pa.v.class, "Mutable", null, num), 2, null);
        }

        @Override // fb.f
        public void l(String targetElementName, Integer num) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new h(b0Var, targetElementName, "mute", pa.v.class, "Mutable", null, num), 2, null);
        }

        @Override // fb.f
        public void m(String targetElementName) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new u(b0Var, targetElementName, "unlockVisibility", qb.m.class, "VisibilityChanger", null), 2, null);
        }

        @Override // fb.f
        public void n(String targetElementName, long j10, long j11, float f10) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new j(b0Var, targetElementName, "progress", pa.x.class, "Progress", null, j10, j11, f10), 2, null);
        }

        @Override // fb.f
        public void o(String targetElementName) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new k(b0Var, targetElementName, "repeat", pa.y.class, "Repeatable", null), 2, null);
        }

        @Override // fb.f
        public void p(String sourceName, f0 eventType, String str, List eventTaskParamsList, String url, id.l callback) {
            cc.g<?> gVarA;
            kotlin.jvm.internal.t.f(sourceName, "sourceName");
            kotlin.jvm.internal.t.f(eventType, "eventType");
            kotlin.jvm.internal.t.f(eventTaskParamsList, "eventTaskParamsList");
            kotlin.jvm.internal.t.f(url, "url");
            kotlin.jvm.internal.t.f(callback, "callback");
            qb.d dVarC = la.f.c();
            if (dVarC != null && (gVarA = dVarC.a(sourceName, eventType, str, eventTaskParamsList, url, callback)) != null) {
                cc.g.s(gVarA, null, 1, null);
            } else {
                pa.t.b(this.f4258b.f4234b, "Can't request PermissionRequest. NetworkRequestBuilder is null", new Object[0]);
                callback.invoke(null);
            }
        }

        @Override // fb.f
        public void q(String targetElementName, long j10) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new l(b0Var, targetElementName, "schedule", pa.a0.class, AppEventsConstants.EVENT_NAME_SCHEDULE, null, j10), 2, null);
        }

        public static final class v extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4372h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b0 f4373i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f4374j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ String f4375k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ Class f4376l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f4377m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f4378n;

            public static final class a implements pa.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Object f4379a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Integer f4380b;

                public a(Object obj, Integer num) {
                    this.f4379a = obj;
                    this.f4380b = num;
                }

                @Override // wb.v
                public final void p() {
                    ((pa.v) this.f4379a).p(this.f4380b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(b0 b0Var, String str, String str2, Class cls, String str3, zc.f fVar, Integer num) {
                super(2, fVar);
                this.f4373i = b0Var;
                this.f4374j = str;
                this.f4375k = str2;
                this.f4376l = cls;
                this.f4377m = str3;
                this.f4378n = num;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((v) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new v(this.f4373i, this.f4374j, this.f4375k, this.f4376l, this.f4377m, fVar, this.f4378n);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4372h == 0) {
                    wc.s.b(obj);
                    Object objH = this.f4373i.H(this.f4374j);
                    if (objH == null) {
                        this.f4373i.s(this.f4375k, this.f4374j);
                    } else if (!this.f4376l.isInstance(objH)) {
                        this.f4373i.t(this.f4375k, this.f4374j, this.f4377m);
                    } else if (this.f4376l.isInstance(objH)) {
                        qb.h.d(new a(objH, this.f4378n));
                    }
                    return g0.f27756a;
                }
                throw new IllegalStateException(UomBEukHFwrS.AnONHhP);
            }
        }

        @Override // fb.f
        public void c(String targetElementName, g7.e eVar) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            kotlin.jvm.internal.t.f(eVar, UomBEukHFwrS.lVSGtTkc);
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new o(b0Var, targetElementName, "simulateClick", pa.d.class, "AdElement", null, eVar), 2, null);
        }

        @Override // fb.f
        public void b() {
            bb.v vVarD0 = this.f4258b.d0();
            if (vVarD0 != null) {
                vVarD0.b();
            }
        }

        @Override // fb.f
        public void a(String targetElementName, String str) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new t(b0Var, targetElementName, "start", c0.class, "Startable", null, str), 2, null);
        }

        @Override // fb.f
        public void a(String targetElementName, boolean z10) {
            kotlin.jvm.internal.t.f(targetElementName, "targetElementName");
            b0 b0Var = this.f4258b;
            ud.k.d(b0Var.Y(b0Var), b0Var.V(b0Var).d(), null, new g(b0Var, targetElementName, "lockVisibility", qb.m.class, "VisibilityChanger", null, z10), 2, null);
        }

        @Override // fb.f
        public void a(String stateGroups) {
            kotlin.jvm.internal.t.f(stateGroups, "stateGroups");
            this.f4258b.f0().a(stateGroups);
        }
    }

    private final class g extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f4381c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b0 b0Var, fb.b eventCallback) {
            super(eventCallback);
            kotlin.jvm.internal.t.f(eventCallback, "eventCallback");
            this.f4381c = b0Var;
        }

        @Override // pa.d0, pa.g
        public void a() {
            bb.v vVarD0 = this.f4381c.d0();
            if (vVarD0 != null) {
                vVarD0.a();
            }
        }

        @Override // pa.d0, pa.b0
        public void e() {
            bb.v vVarD0 = this.f4381c.d0();
            if (vVarD0 != null) {
                vVarD0.e();
            }
        }

        @Override // pa.d0, pa.v
        public void p(Integer num) {
            u().p(num);
        }

        @Override // pa.d0, pa.v
        public void q(Integer num) {
            u().q(num);
        }

        @Override // pa.d0
        public String v() {
            return u().g();
        }
    }

    static final class h extends kotlin.jvm.internal.u implements id.a {
        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final qa.b invoke() {
            Context applicationContext = b0.this.f4238f;
            kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
            return new qa.b(applicationContext, b0.this.e0());
        }
    }

    static final class i extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pb.d f4384e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(pb.d dVar) {
            super(0);
            this.f4384e = dVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final pa.e invoke() {
            Object obj = b0.this.f4233a;
            Context applicationContext = b0.this.f4238f;
            kotlin.jvm.internal.t.e(applicationContext, "applicationContext");
            return new pa.e(obj, applicationContext, b0.this.e0(), this.f4384e);
        }
    }

    static final class j extends kotlin.jvm.internal.u implements id.a {
        j() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            ViewGroup viewGroupF = b0.this.d().f();
            if (viewGroupF != null) {
                return Integer.valueOf(viewGroupF.getId());
            }
            return null;
        }
    }

    static final class k extends kotlin.jvm.internal.u implements id.a {
        k() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            b0 b0Var = b0.this;
            return new g(b0Var, b0Var.j("system"));
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f4387h;

        l(zc.f fVar) {
            super(2, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((l) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return b0.this.new l(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f4387h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            if (b0.this.g0()) {
                b0.this.h0();
                b0.this.i0();
            }
            return g0.f27756a;
        }
    }

    public static final class m implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4389a;

        public m(Object obj) {
            this.f4389a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.d) this.f4389a).m();
        }
    }

    public static final class n implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4390a;

        public n(Object obj) {
            this.f4390a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.d) this.f4390a).m();
        }
    }

    public static final class o implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4391a;

        public o(Object obj) {
            this.f4391a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.d) this.f4391a).m();
        }
    }

    public static final class p implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4392a;

        public p(Object obj) {
            this.f4392a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.d) this.f4392a).m();
        }
    }

    public static final class q implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4393a;

        public q(Object obj) {
            this.f4393a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4393a).pause();
        }
    }

    public static final class r implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4394a;

        public r(Object obj) {
            this.f4394a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4394a).pause();
        }
    }

    public static final class s implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4395a;

        public s(Object obj) {
            this.f4395a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4395a).pause();
        }
    }

    public static final class t implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4396a;

        public t(Object obj) {
            this.f4396a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4396a).pause();
        }
    }

    public static final class u implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4397a;

        public u(Object obj) {
            this.f4397a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4397a).j();
        }
    }

    public static final class v implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4398a;

        public v(Object obj) {
            this.f4398a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4398a).j();
        }
    }

    public static final class w implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4399a;

        public w(Object obj) {
            this.f4399a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4399a).j();
        }
    }

    public static final class x implements pa.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4400a;

        public x(Object obj) {
            this.f4400a = obj;
        }

        @Override // wb.v
        public final void p() {
            ((pa.a0) this.f4400a).j();
        }
    }

    static final class y extends kotlin.jvm.internal.u implements id.a {

        static final class a extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f4402d = new a();

            a() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final xb.a invoke() {
                id.a<xb.a> aVarB = la.f.b();
                if (aVarB != null) {
                    return aVarB.invoke();
                }
                return null;
            }
        }

        y() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final jb.a invoke() {
            a aVar = a.f4402d;
            b0 b0Var = b0.this;
            o0 o0VarY = b0Var.Y(b0Var);
            b0 b0Var2 = b0.this;
            return new jb.a(aVar, o0VarY, b0Var2.V(b0Var2));
        }
    }

    static final class z extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pb.d f4403d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(pb.d dVar) {
            super(0);
            this.f4403d = dVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final hb.a invoke() {
            return new hb.a(this.f4403d.i());
        }
    }

    public b0(Context context, pb.d adPhaseParams, Object assetsHolder, wb.y tag, lb.c adState, bb.u adPhaseControllerListener, ab.c adAnimationController) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(adPhaseParams, "adPhaseParams");
        kotlin.jvm.internal.t.f(assetsHolder, "assetsHolder");
        kotlin.jvm.internal.t.f(tag, "tag");
        kotlin.jvm.internal.t.f(adState, "adState");
        kotlin.jvm.internal.t.f(adPhaseControllerListener, "adPhaseControllerListener");
        kotlin.jvm.internal.t.f(adAnimationController, "adAnimationController");
        this.f4233a = assetsHolder;
        this.f4234b = tag;
        this.f4235c = adState;
        this.f4236d = adPhaseControllerListener;
        this.f4237e = adAnimationController;
        this.f4238f = context.getApplicationContext();
        this.f4239g = wc.m.a(new y());
        this.f4240h = wc.m.a(new i(adPhaseParams));
        this.f4242j = new f(this, context);
        this.f4243k = new c();
        this.f4244l = wc.m.a(new z(adPhaseParams));
        this.f4245m = wc.m.a(new k());
        this.f4246n = new ec.a(Y(this).q().z(V(this).f()));
        this.f4247o = new ConcurrentHashMap();
        this.f4248p = new CopyOnWriteArrayList();
        this.f4249q = new CopyOnWriteArrayList();
        this.f4250r = new CopyOnWriteArrayList();
        this.f4251s = wc.m.a(new h());
        this.f4252t = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(pb.t tVar) {
        bb.v vVarD0;
        if (this.f4235c.i() || (vVarD0 = d0()) == null) {
            return;
        }
        vVarD0.i(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(qb.m mVar, boolean z10, boolean z11, Runnable runnable) {
        if ((mVar instanceof pa.d) && this.f4235c.c() && !this.f4235c.i()) {
            this.f4237e.h((pa.d) mVar, z10 ? pb.f.Appear : pb.f.Disappear, z11, z10 ? runnable : null, z10 ? null : runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ boolean E(b0 b0Var, qa.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b0Var.F(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(pa.d adElement) {
        kotlin.jvm.internal.t.f(adElement, "$adElement");
        adElement.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pa.h V(b0 b0Var) {
        return b0Var.f4235c.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 Y(b0 b0Var) {
        return b0Var.f4235c.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 b0() {
        return (d0) this.f4245m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final la.g e0() {
        return (la.g) this.f4239g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb.b f0() {
        return (hb.b) this.f4244l.getValue();
    }

    private final db.a i(pb.a aVar) {
        pb.s sVarD = aVar.d();
        if (sVarD != null) {
            return new db.a(d().e().h(), aVar.j(), sVarD, this.f4243k);
        }
        return null;
    }

    public static /* synthetic */ void p(b0 b0Var, d0 d0Var, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        b0Var.z(d0Var, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String str, String str2) {
        pa.t.b(this.f4234b, "EventTask - " + str + ", target object (" + str2 + ") not found", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str, String str2, String str3) {
        pa.t.b(this.f4234b, "EventTask - " + str + ", target object (" + str2 + ") not " + str3, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(pa.d adElement) {
        kotlin.jvm.internal.t.f(adElement, "$adElement");
        adElement.d();
    }

    public final void B(pb.b0 error) {
        kotlin.jvm.internal.t.f(error, "error");
        if (this.f4235c.a(false)) {
            this.f4236d.k(this, error);
        }
    }

    public final void C(qa.a adForm, qa.c adFormListener) {
        kotlin.jvm.internal.t.f(adForm, "adForm");
        kotlin.jvm.internal.t.f(adFormListener, "adFormListener");
        pa.t.g(this.f4234b, "Load AdElement - " + adForm.g().j(), new Object[0]);
        bb.s sVar = new bb.s(adForm);
        this.f4247o.put(adForm, sVar);
        try {
            this.f4246n.execute(sVar);
        } catch (Throwable th) {
            adFormListener.c(adForm, pb.b0.f23943b.a(th));
        }
    }

    public final boolean F(qa.a item, boolean z10) {
        kotlin.jvm.internal.t.f(item, "item");
        boolean z11 = item.z();
        if (z11) {
            this.f4237e.b(item, z10, pb.f.Appear);
        }
        return z11;
    }

    public final void J(List items) {
        kotlin.jvm.internal.t.f(items, "items");
        pa.t.g(this.f4234b, "Destroy TargetObjects", new Object[0]);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            z((d0) it.next(), items);
        }
        items.clear();
    }

    public final void K(List adElements, boolean z10) {
        kotlin.jvm.internal.t.f(adElements, "adElements");
        pa.t.g(this.f4234b, "Show AdElements, animated: " + z10, new Object[0]);
        Iterator it = adElements.iterator();
        while (it.hasNext()) {
            M((pa.d) it.next(), z10);
        }
    }

    public final void M(final pa.d adElement, boolean z10) {
        kotlin.jvm.internal.t.f(adElement, "adElement");
        pa.t.g(this.f4234b, "Show AdElement - " + adElement.g().j() + ", animated: " + z10, new Object[0]);
        pa.s sVar = new pa.s() { // from class: bb.x
            @Override // wb.v
            public final void p() {
                b0.L(adElement);
            }
        };
        if (z10) {
            ab.c.f(this.f4237e, adElement, pb.f.Appear, false, sVar, null, 20, null);
        } else {
            sVar.run();
        }
    }

    public final void O(boolean z10) {
        if (this.f4252t.compareAndSet(true, false)) {
            v(this.f4248p, z10);
            v(this.f4249q, z10);
        }
    }

    public final void Q(boolean z10) {
        if (this.f4252t.compareAndSet(false, true)) {
            K(this.f4248p, z10);
            K(this.f4249q, z10);
        }
    }

    public final void U() {
        pa.t.g(this.f4234b, "Cancel loading AdElements", new Object[0]);
        Iterator it = this.f4247o.entrySet().iterator();
        while (it.hasNext()) {
            this.f4246n.a((Runnable) ((Map.Entry) it.next()).getValue());
        }
        this.f4247o.clear();
    }

    public final void W() {
        pa.t.g(this.f4234b, "Destroy AdPhase", new Object[0]);
        this.f4237e.d(d());
        final pa.e eVarD = d();
        qb.h.d(new pa.s() { // from class: bb.a0
            @Override // wb.v
            public final void p() {
                eVarD.a();
            }
        });
    }

    public final qa.b X() {
        return (qa.b) this.f4251s.getValue();
    }

    public final List Z() {
        return this.f4248p;
    }

    public final List a0() {
        return this.f4249q;
    }

    @Override // bb.t
    public void b() {
        pa.t.g(this.f4234b, "AdPhase - load", new Object[0]);
        ud.k.d(Y(this), V(this).f(), null, new l(null), 2, null);
    }

    @Override // bb.t
    public void c() {
        pa.t.g(this.f4234b, "AdPhase - performShow", new Object[0]);
        for (pa.d dVar : Z()) {
            if (pa.a0.class.isInstance(dVar)) {
                qb.h.d(new u(dVar));
            }
        }
        for (pa.d dVar2 : a0()) {
            if (pa.a0.class.isInstance(dVar2)) {
                qb.h.d(new v(dVar2));
            }
        }
        for (pa.u uVar : c0()) {
            if (pa.a0.class.isInstance(uVar)) {
                qb.h.d(new w(uVar));
            }
        }
        d0 d0VarB0 = b0();
        if (pa.a0.class.isInstance(d0VarB0)) {
            qb.h.d(new x(d0VarB0));
        }
        if (this.f4235c.h()) {
            Q(false);
        }
        this.f4235c.s();
    }

    public final List c0() {
        return this.f4250r;
    }

    @Override // bb.t
    public pa.e d() {
        return (pa.e) this.f4240h.getValue();
    }

    public bb.v d0() {
        return this.f4241i;
    }

    @Override // bb.t
    public void destroy() {
        pa.t.g(this.f4234b, "AdPhase - destroy", new Object[0]);
        U();
        u(this.f4248p);
        u(this.f4249q);
        W();
        J(this.f4250r);
        p(this, b0(), null, 2, null);
        c(null);
        this.f4235c.destroy();
    }

    @Override // bb.t
    public void e() {
        pa.t.g(this.f4234b, "AdPhase - onCollapsed", new Object[0]);
        b0().u().o();
        for (pa.d dVar : Z()) {
            if (pa.d.class.isInstance(dVar)) {
                qb.h.d(new m(dVar));
            }
        }
        for (pa.d dVar2 : a0()) {
            if (pa.d.class.isInstance(dVar2)) {
                qb.h.d(new n(dVar2));
            }
        }
        for (pa.u uVar : c0()) {
            if (pa.d.class.isInstance(uVar)) {
                qb.h.d(new o(uVar));
            }
        }
        d0 d0VarB0 = b0();
        if (pa.d.class.isInstance(d0VarB0)) {
            qb.h.d(new p(d0VarB0));
        }
    }

    @Override // bb.t
    public void f() {
        pa.t.g(this.f4234b, "AdPhase - onExpanded", new Object[0]);
        b0().u().f();
    }

    public final boolean g0() {
        List<pb.a> listA = d().e().a();
        if (listA.isEmpty()) {
            B(new pb.b0("AdPhase does not contain any ads part"));
            return false;
        }
        if (a()) {
            j0();
            return false;
        }
        if (!this.f4235c.b()) {
            return false;
        }
        this.f4248p.addAll(k(listA, new a()));
        if (!this.f4248p.isEmpty()) {
            return true;
        }
        B(new pb.b0("No supported ads found for the given parameters"));
        return false;
    }

    public final void h0() {
        this.f4249q.addAll(k(d().e().e(), new e()));
    }

    public final void i0() {
        List<s0> listG = d().e().g();
        List list = this.f4250r;
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listG, 10));
        for (s0 s0Var : listG) {
            arrayList.add(new pa.u(s0Var, j(s0Var.a())));
        }
        list.addAll(arrayList);
    }

    public final fb.b j(String sourceName) {
        kotlin.jvm.internal.t.f(sourceName, "sourceName");
        return new fb.c(sourceName, new hb.c(f0()), new ab.d(this.f4237e, new j()), new fb.a(this.f4242j, sourceName), Y(this), V(this), d().e().f(sourceName));
    }

    public final void j0() {
        if (this.f4235c.a(true)) {
            this.f4236d.l(this);
        }
    }

    public final List k(List elementsParams, qa.c adFormListener) {
        kotlin.jvm.internal.t.f(elementsParams, "elementsParams");
        kotlin.jvm.internal.t.f(adFormListener, "adFormListener");
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(elementsParams, 10));
        Iterator it = elementsParams.iterator();
        while (it.hasNext()) {
            arrayList.add(m((pb.a) it.next(), adFormListener));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C((qa.a) it2.next(), adFormListener);
        }
        return arrayList;
    }

    public final qa.a m(pb.a elementParams, qa.c adFormListener) {
        kotlin.jvm.internal.t.f(elementParams, "elementParams");
        kotlin.jvm.internal.t.f(adFormListener, "adFormListener");
        pa.t.g(this.f4234b, "Create AdElement - " + elementParams.j(), new Object[0]);
        return X().b(this.f4233a, elementParams, adFormListener, j(elementParams.j()), i(elementParams));
    }

    public String toString() {
        return this.f4234b.toString();
    }

    public final void u(List item) {
        kotlin.jvm.internal.t.f(item, "item");
        pa.t.g(this.f4234b, "Destroy AdElements", new Object[0]);
        Iterator it = item.iterator();
        while (it.hasNext()) {
            x((pa.d) it.next(), item);
        }
        item.clear();
    }

    public final void v(List adElements, boolean z10) {
        kotlin.jvm.internal.t.f(adElements, "adElements");
        pa.t.g(this.f4234b, "Hide AdElements, animated: " + z10, new Object[0]);
        Iterator it = adElements.iterator();
        while (it.hasNext()) {
            y((pa.d) it.next(), z10);
        }
    }

    public final void x(final pa.d item, List list) {
        kotlin.jvm.internal.t.f(item, "item");
        pa.t.g(this.f4234b, "Destroy AdElement - " + item.g().j(), new Object[0]);
        this.f4237e.c(item);
        if (list != null) {
            list.remove(item);
        }
        qb.h.d(new pa.s() { // from class: bb.w
            @Override // wb.v
            public final void p() {
                item.destroy();
            }
        });
    }

    public final void y(final pa.d adElement, boolean z10) {
        kotlin.jvm.internal.t.f(adElement, "adElement");
        pa.t.g(this.f4234b, "Hide AdElement - " + adElement.g().j() + ", animated: " + z10, new Object[0]);
        pa.s sVar = new pa.s() { // from class: bb.y
            @Override // wb.v
            public final void p() {
                b0.w(adElement);
            }
        };
        if (z10) {
            ab.c.f(this.f4237e, adElement, pb.f.Disappear, false, null, sVar, 12, null);
        } else {
            sVar.run();
        }
    }

    public final void z(final d0 item, List list) {
        kotlin.jvm.internal.t.f(item, "item");
        pa.t.g(this.f4234b, "Destroy TargetObject - " + item.v(), new Object[0]);
        if (list != null) {
            m0.a(list).remove(item);
        }
        qb.h.d(new pa.s() { // from class: bb.z
            @Override // wb.v
            public final void p() {
                item.destroy();
            }
        });
    }

    public final Object H(String str) {
        Object next;
        Object next2;
        kotlin.jvm.internal.t.f(str, KBBdKxoAiHo.tKdHLus);
        if (rd.f0.k0(str)) {
            return null;
        }
        Iterator it = this.f4248p.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!rd.c0.B(((pa.d) next).g().j(), str, true));
        Object next3 = (pa.d) next;
        if (next3 == null) {
            Iterator it2 = this.f4249q.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!rd.c0.B(((pa.d) next2).g().j(), str, true));
            next3 = (pa.d) next2;
            if (next3 == null) {
                Iterator it3 = this.f4250r.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!rd.c0.B(((pa.u) next3).x().a(), str, true));
            }
        }
        if (next3 != null) {
            return next3;
        }
        if (kotlin.jvm.internal.t.a(b0().v(), str)) {
            return b0();
        }
        return null;
    }

    @Override // bb.t
    public boolean a() {
        return this.f4235c.a();
    }

    @Override // bb.t
    public void a(boolean z10) {
        boolean z11 = z10 && this.f4235c.f();
        boolean z12 = !z10 && this.f4235c.j();
        if (z11) {
            pa.t.g(this.f4234b, "AdPhase - onShown (isViewability - %s)", Boolean.valueOf(z10));
            Q(true);
        }
        if (z11) {
            b0().u().d();
        }
        if (z12) {
            b0().u().s();
        }
    }

    @Override // bb.t
    public void b(boolean z10) {
        pa.t.g(this.f4234b, "AdPhase - performHide, isFinishing: " + z10, new Object[0]);
        for (pa.d dVar : Z()) {
            if (pa.a0.class.isInstance(dVar)) {
                qb.h.d(new q(dVar));
            }
        }
        for (pa.d dVar2 : a0()) {
            if (pa.a0.class.isInstance(dVar2)) {
                qb.h.d(new r(dVar2));
            }
        }
        for (pa.u uVar : c0()) {
            if (pa.a0.class.isInstance(uVar)) {
                qb.h.d(new s(uVar));
            }
        }
        d0 d0VarB0 = b0();
        if (pa.a0.class.isInstance(d0VarB0)) {
            qb.h.d(new t(d0VarB0));
        }
        O(z10);
    }

    @Override // bb.t
    public boolean f(ViewGroup rootContainer, ViewGroup container) {
        kotlin.jvm.internal.t.f(rootContainer, "rootContainer");
        kotlin.jvm.internal.t.f(container, "container");
        return d().d(rootContainer, container, this.f4248p, this.f4249q);
    }

    @Override // bb.t
    public void c(bb.v vVar) {
        this.f4241i = vVar;
    }
}
