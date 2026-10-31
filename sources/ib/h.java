package ib;

import android.graphics.Bitmap;
import android.view.View;
import id.p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.t;
import ud.o0;
import ud.y2;
import wc.g0;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends dc.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f16259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f16260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final id.a f16261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final id.l f16262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f16263g;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16264h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f16265i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f16266j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, h hVar, zc.f fVar) {
            super(2, fVar);
            this.f16265i = obj;
            this.f16266j = hVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new a(this.f16265i, this.f16266j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g0 g0Var;
            ad.d.f();
            if (this.f16264h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Object obj2 = this.f16265i;
            if (obj2 != null) {
                this.f16266j.f16262f.invoke(obj2);
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            if (g0Var == null) {
                this.f16266j.f16261e.invoke();
            }
            return g0.f27756a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f16268i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f16269j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f16271l;

        b(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16269j = obj;
            this.f16271l |= Integer.MIN_VALUE;
            return h.this.e(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements id.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16272h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f16273i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f16274j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ zc.j f16275k;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16276h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ h f16277i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ zc.j f16278j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, zc.j jVar, zc.f fVar) {
                super(2, fVar);
                this.f16277i = hVar;
                this.f16278j = jVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new a(this.f16277i, this.f16278j, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f16276h;
                if (i10 == 0) {
                    s.b(obj);
                    View view = (View) this.f16277i.f16263g.get();
                    if (view == null) {
                        return null;
                    }
                    h hVar = this.f16277i;
                    zc.j jVar = this.f16278j;
                    f fVar = hVar.f16259c;
                    this.f16276h = 1;
                    obj = fVar.a(jVar, view, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return (f.a) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, h hVar, zc.j jVar, zc.f fVar) {
            super(1, fVar);
            this.f16273i = j10;
            this.f16274j = hVar;
            this.f16275k = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return new c(this.f16273i, this.f16274j, this.f16275k, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((c) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16272h;
            if (i10 == 0) {
                s.b(obj);
                long j10 = this.f16273i;
                a aVar = new a(this.f16274j, this.f16275k, null);
                this.f16272h = 1;
                obj = y2.c(j10, aVar, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return obj;
        }
    }

    public h(View view, long j10, f meanBackgroundExtractor, l performanceMeasurer, id.a onFallback, id.l onFinished) {
        t.f(view, "view");
        t.f(meanBackgroundExtractor, "meanBackgroundExtractor");
        t.f(performanceMeasurer, "performanceMeasurer");
        t.f(onFallback, "onFallback");
        t.f(onFinished, "onFinished");
        this.f16258b = j10;
        this.f16259c = meanBackgroundExtractor;
        this.f16260d = performanceMeasurer;
        this.f16261e = onFallback;
        this.f16262f = onFinished;
        this.f16263g = new WeakReference(view);
    }

    private final Object g(zc.j jVar, long j10, zc.f fVar) {
        return this.f16260d.a("Mean background extraction", new c(j10, this, jVar, null), fVar);
    }

    private final Object h(zc.j jVar, Object obj, Bitmap bitmap, zc.f fVar) {
        if (bitmap != null) {
            wb.k.g(bitmap);
        }
        Object objG = ud.i.g(jVar.z(pa.h.f23769i.a().i()), new a(obj, this, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dc.c
    public Object e(zc.j jVar, zc.f fVar) throws Throwable {
        b bVar;
        Object obj;
        zc.j jVar2;
        h hVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f16271l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16271l = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj2 = bVar.f16269j;
        Object objF = ad.d.f();
        int i11 = bVar.f16271l;
        if (i11 != 0) {
            if (i11 == 1) {
                zc.j jVar3 = (zc.j) bVar.f16268i;
                h hVar2 = (h) bVar.f16267h;
                s.b(obj2);
                jVar2 = jVar3;
                hVar = hVar2;
                obj = obj2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (h) bVar.f16267h;
                s.b(obj2);
            }
            hVar.a(true);
            return g0.f27756a;
        }
        s.b(obj2);
        long j10 = this.f16258b;
        bVar.f16267h = this;
        bVar.f16268i = jVar;
        bVar.f16271l = 1;
        Object objG = g(jVar, j10, bVar);
        if (objG == objF) {
            return objF;
        }
        obj = objG;
        jVar2 = jVar;
        hVar = this;
        f.a aVar = (f.a) obj;
        if (aVar != null) {
            Object objB = aVar.b();
            Bitmap bitmapA = aVar.a();
            bVar.f16267h = hVar;
            bVar.f16268i = null;
            bVar.f16271l = 2;
            if (hVar.h(jVar2, objB, bitmapA, bVar) == objF) {
                return objF;
            }
        }
        hVar.a(true);
        return g0.f27756a;
    }
}
