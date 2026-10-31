package io.bidmachine.iab.mraid;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ud.b2;
import ud.t2;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f17631j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a f17632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a f17633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f17634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ud.k0 f17635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ud.k0 f17636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ud.o0 f17637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g7.f f17638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f17639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b2 f17640i;

    public static final class a {

        /* JADX INFO: renamed from: io.bidmachine.iab.mraid.c$a$a, reason: collision with other inner class name */
        private enum EnumC0316a {
            Idle,
            Processing
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17644h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pb.v f17646j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f17647k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f17648l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ b1 f17649m;

        static final class a extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g7.f.b f17650d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ PointF f17651e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g7.f.b bVar, PointF pointF) {
                super(0);
                this.f17650d = bVar;
                this.f17651e = pointF;
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SimulateClick: distribution=" + this.f17650d + ", normalized=(" + this.f17651e.x + ", " + this.f17651e.y + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(pb.v vVar, int i10, int i11, b1 b1Var, zc.f fVar) {
            super(2, fVar);
            this.f17646j = vVar;
            this.f17647k = i10;
            this.f17648l = i11;
            this.f17649m = b1Var;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return c.this.new b(this.f17646j, this.f17647k, this.f17648l, this.f17649m, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f17644h;
            try {
                if (i10 == 0) {
                    wc.s.b(obj);
                    g7.f.b bVar = x.a((List) c.this.f17633b.invoke()) ? g7.f.b.C0234b.f15455a : g7.f.b.a.f15454a;
                    PointF pointFA = c.this.f17638g.a(this.f17646j, bVar);
                    b0.c("MraidAdRedirectHandler", new a(bVar, pointFA));
                    c cVar = c.this;
                    int i11 = this.f17647k;
                    int i12 = this.f17648l;
                    b1 b1Var = this.f17649m;
                    this.f17644h = 1;
                    if (cVar.b(pointFA, i11, i12, b1Var, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
            } catch (Exception unused) {
            } finally {
                c.this.f17639h.set(a.EnumC0316a.Idle);
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.iab.mraid.c$c, reason: collision with other inner class name */
    static final class C0317c extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f17652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f17653i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ PointF f17654j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f17655k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f17656l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c f17657m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b1 f17658n;

        /* JADX INFO: renamed from: io.bidmachine.iab.mraid.c$c$a */
        static final class a extends kotlin.jvm.internal.u implements id.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Point f17659d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f17660e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f17661f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Point point, int i10, int i11) {
                super(0);
                this.f17659d = point;
                this.f17660e = i10;
                this.f17661f = i11;
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SimulateClick: absolute=(" + this.f17659d.x + ", " + this.f17659d.y + "), view=" + this.f17660e + 'x' + this.f17661f;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0317c(PointF pointF, int i10, int i11, c cVar, b1 b1Var, zc.f fVar) {
            super(2, fVar);
            this.f17654j = pointF;
            this.f17655k = i10;
            this.f17656l = i11;
            this.f17657m = cVar;
            this.f17658n = b1Var;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f fVar) {
            return ((C0317c) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new C0317c(this.f17654j, this.f17655k, this.f17656l, this.f17657m, this.f17658n, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0084 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Point point;
            c cVar;
            b1 b1Var;
            Object objF = ad.d.f();
            int i10 = this.f17653i;
            if (i10 != 0) {
                if (i10 == 1) {
                    point = (Point) this.f17652h;
                    wc.s.b(obj);
                } else if (i10 == 2) {
                    point = (Point) this.f17652h;
                    wc.s.b(obj);
                    cVar = this.f17657m;
                    b1Var = this.f17658n;
                    this.f17652h = null;
                    this.f17653i = 3;
                    if (cVar.k(point, b1Var, this) == objF) {
                        return objF;
                    }
                    this.f17653i = 4;
                    if (ud.y0.a(150L, this) == objF) {
                        return objF;
                    }
                } else if (i10 == 3) {
                    wc.s.b(obj);
                    this.f17653i = 4;
                    if (ud.y0.a(150L, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                this.f17657m.f17634c.run();
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            Point pointA = g7.g.a(this.f17654j, this.f17655k, this.f17656l);
            b0.c("MraidAdRedirectHandler", new a(pointA, this.f17655k, this.f17656l));
            c cVar2 = this.f17657m;
            b1 b1Var2 = this.f17658n;
            this.f17652h = pointA;
            this.f17653i = 1;
            if (cVar2.a(pointA, b1Var2, this) == objF) {
                return objF;
            }
            point = pointA;
            this.f17652h = point;
            this.f17653i = 2;
            if (ud.y0.a(150L, this) == objF) {
                return objF;
            }
            cVar = this.f17657m;
            b1Var = this.f17658n;
            this.f17652h = null;
            this.f17653i = 3;
            if (cVar.k(point, b1Var, this) == objF) {
                return objF;
            }
            this.f17653i = 4;
            if (ud.y0.a(150L, this) == objF) {
                return objF;
            }
            this.f17657m.f17634c.run();
            return wc.g0.f27756a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17662h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ b1 f17663i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Point f17664j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b1 b1Var, Point point, zc.f fVar) {
            super(2, fVar);
            this.f17663i = b1Var;
            this.f17664j = point;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new d(this.f17663i, this.f17664j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f17662h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            s0 s0VarJ = this.f17663i.J();
            Point point = this.f17664j;
            Integer[] numArr = {kotlin.coroutines.jvm.internal.b.c(0), kotlin.coroutines.jvm.internal.b.c(1)};
            for (int i10 = 0; i10 < 2; i10++) {
                MotionEvent motionEventQ = g7.y.q(numArr[i10].intValue(), point);
                s0VarJ.dispatchTouchEvent(motionEventQ);
                motionEventQ.recycle();
            }
            return wc.g0.f27756a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ b1 f17666i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Point f17667j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b1 b1Var, Point point, zc.f fVar) {
            super(2, fVar);
            this.f17666i = b1Var;
            this.f17667j = point;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new e(this.f17666i, this.f17667j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f17665h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            this.f17666i.n(this.f17667j);
            return wc.g0.f27756a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(id.a<? extends b1> controllerProvider, id.a<? extends List<pb.f1>> scriptConfigsProvider, Runnable onOpenProductLink) {
        this(controllerProvider, scriptConfigsProvider, onOpenProductLink, null, null, 24, null);
        kotlin.jvm.internal.t.f(controllerProvider, "controllerProvider");
        kotlin.jvm.internal.t.f(scriptConfigsProvider, "scriptConfigsProvider");
        kotlin.jvm.internal.t.f(onOpenProductLink, "onOpenProductLink");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Point point, b1 b1Var, zc.f fVar) {
        Object objG = ud.i.g(this.f17635d, new d(b1Var, point, null), fVar);
        return objG == ad.d.f() ? objG : wc.g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(PointF pointF, int i10, int i11, b1 b1Var, zc.f fVar) {
        Object objG = ud.i.g(this.f17636e, new C0317c(pointF, i10, i11, this, b1Var, null), fVar);
        return objG == ad.d.f() ? objG : wc.g0.f27756a;
    }

    private final void c(b1 b1Var, int i10, int i11, pb.v vVar) {
        if (com.applovin.impl.sdk.i0.a(this.f17639h, a.EnumC0316a.Idle, a.EnumC0316a.Processing)) {
            this.f17640i = ud.k.d(this.f17637f, this.f17636e, null, new b(vVar, i10, i11, b1Var, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(Point point, b1 b1Var, zc.f fVar) {
        Object objG = ud.i.g(this.f17635d, new e(b1Var, point, null), fVar);
        return objG == ad.d.f() ? objG : wc.g0.f27756a;
    }

    public final void l() {
        b2 b2Var = this.f17640i;
        if (b2Var != null) {
            b2.a.a(b2Var, null, 1, null);
        }
        this.f17640i = null;
    }

    public final void m(g7.e clickAreaFactory) {
        kotlin.jvm.internal.t.f(clickAreaFactory, "clickAreaFactory");
        b1 b1Var = (b1) this.f17632a.invoke();
        c(b1Var, b1Var.J().getMeasuredWidth(), b1Var.J().getMeasuredHeight(), clickAreaFactory.d());
    }

    public c(id.a<? extends b1> controllerProvider, id.a<? extends List<pb.f1>> scriptConfigsProvider, Runnable onOpenProductLink, ud.k0 mainDispatcher, ud.k0 ioDispatcher) {
        kotlin.jvm.internal.t.f(controllerProvider, "controllerProvider");
        kotlin.jvm.internal.t.f(scriptConfigsProvider, "scriptConfigsProvider");
        kotlin.jvm.internal.t.f(onOpenProductLink, "onOpenProductLink");
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.f(ioDispatcher, "ioDispatcher");
        this.f17632a = controllerProvider;
        this.f17633b = scriptConfigsProvider;
        this.f17634c = onOpenProductLink;
        this.f17635d = mainDispatcher;
        this.f17636e = ioDispatcher;
        this.f17637f = ud.p0.a(t2.b(null, 1, null).z(mainDispatcher));
        this.f17638g = new g7.f();
        this.f17639h = new AtomicReference(a.EnumC0316a.Idle);
    }

    public /* synthetic */ c(id.a aVar, id.a aVar2, Runnable runnable, ud.k0 k0Var, ud.k0 k0Var2, int i10, kotlin.jvm.internal.k kVar) {
        this(aVar, aVar2, runnable, (i10 & 8) != 0 ? wb.w.f27717g.a().f() : k0Var, (i10 & 16) != 0 ? wb.w.f27717g.a().e() : k0Var2);
    }
}
