package ib;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import id.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import ud.o0;
import wc.g0;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f16307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f16308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ib.a f16309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ib.b f16310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f16311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f16312f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f16314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f16315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f16316k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f16318m;

        a(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16316k = obj;
            this.f16318m |= Integer.MIN_VALUE;
            return k.this.a(null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements id.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16319h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ zc.j f16320i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k f16321j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Rect f16322k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Bitmap f16323l;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16324h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private /* synthetic */ Object f16325i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k f16326j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Rect f16327k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ zc.j f16328l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Bitmap f16329m;

            /* JADX INFO: renamed from: ib.k$b$a$a, reason: collision with other inner class name */
            static final class C0261a extends kotlin.coroutines.jvm.internal.l implements p {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f16330h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ k f16331i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ Bitmap f16332j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ Rect f16333k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0261a(k kVar, Bitmap bitmap, Rect rect, zc.f fVar) {
                    super(2, fVar);
                    this.f16331i = kVar;
                    this.f16332j = bitmap;
                    this.f16333k = rect;
                }

                @Override // id.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(o0 o0Var, zc.f fVar) {
                    return ((C0261a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final zc.f create(Object obj, zc.f fVar) {
                    return new C0261a(this.f16331i, this.f16332j, this.f16333k, fVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ad.d.f();
                    if (this.f16330h != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return kotlin.coroutines.jvm.internal.b.c(this.f16331i.f16311e.a(this.f16332j, this.f16333k));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, Rect rect, zc.j jVar, Bitmap bitmap, zc.f fVar) {
                super(2, fVar);
                this.f16326j = kVar;
                this.f16327k = rect;
                this.f16328l = jVar;
                this.f16329m = bitmap;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                a aVar = new a(this.f16326j, this.f16327k, this.f16328l, this.f16329m, fVar);
                aVar.f16325i = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f16324h;
                if (i10 == 0) {
                    s.b(obj);
                    o0 o0Var = (o0) this.f16325i;
                    List listB = this.f16326j.f16310d.b(this.f16327k);
                    zc.j jVar = this.f16328l;
                    k kVar = this.f16326j;
                    Bitmap bitmap = this.f16329m;
                    ArrayList arrayList = new ArrayList(u.u(listB, 10));
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ud.k.b(o0Var, jVar.z(pa.h.f23769i.a().d()), null, new C0261a(kVar, bitmap, (Rect) it.next(), null), 2, null));
                    }
                    this.f16324h = 1;
                    obj = ud.f.a(arrayList, this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zc.j jVar, k kVar, Rect rect, Bitmap bitmap, zc.f fVar) {
            super(1, fVar);
            this.f16320i = jVar;
            this.f16321j = kVar;
            this.f16322k = rect;
            this.f16323l = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return new b(this.f16320i, this.f16321j, this.f16322k, this.f16323l, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((b) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16319h;
            if (i10 == 0) {
                s.b(obj);
                zc.j jVar = this.f16320i;
                a aVar = new a(this.f16321j, this.f16322k, jVar, this.f16323l, null);
                this.f16319h = 1;
                obj = ud.i.g(jVar, aVar, this);
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

    static final class c extends kotlin.coroutines.jvm.internal.l implements id.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16334h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bitmap f16336j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, zc.f fVar) {
            super(1, fVar);
            this.f16336j = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return k.this.new c(this.f16336j, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((c) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16334h;
            if (i10 == 0) {
                s.b(obj);
                ib.a aVar = k.this.f16309c;
                Bitmap bitmap = this.f16336j;
                this.f16334h = 1;
                obj = ib.a.f(aVar, bitmap, null, this, 2, null);
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

    static final class d extends kotlin.coroutines.jvm.internal.l implements id.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16337h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f16339j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, zc.f fVar) {
            super(1, fVar);
            this.f16339j = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return k.this.new d(this.f16339j, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((d) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16337h;
            if (i10 == 0) {
                s.b(obj);
                o oVar = k.this.f16308b;
                View viewA = k.this.f16307a.a(this.f16339j);
                this.f16337h = 1;
                obj = oVar.d(viewA, this);
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

    public k(n viewExtractor, o viewScreenshot, ib.a contentBoundsScanner, ib.b contentCornerExtractor, i meanColorCalculator, l performanceMeasurer) {
        t.f(viewExtractor, "viewExtractor");
        t.f(viewScreenshot, "viewScreenshot");
        t.f(contentBoundsScanner, "contentBoundsScanner");
        t.f(contentCornerExtractor, "contentCornerExtractor");
        t.f(meanColorCalculator, "meanColorCalculator");
        t.f(performanceMeasurer, "performanceMeasurer");
        this.f16307a = viewExtractor;
        this.f16308b = viewScreenshot;
        this.f16309c = contentBoundsScanner;
        this.f16310d = contentCornerExtractor;
        this.f16311e = meanColorCalculator;
        this.f16312f = performanceMeasurer;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ib.f
    public Object a(zc.j jVar, View view, zc.f fVar) throws Throwable {
        a aVar;
        zc.j jVar2;
        k kVar;
        zc.j jVar3;
        k kVar2;
        Bitmap bitmap;
        Rect rect;
        Bitmap bitmap2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f16318m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f16318m = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object objA = aVar.f16316k;
        Object objF = ad.d.f();
        int i11 = aVar.f16318m;
        if (i11 != 0) {
            if (i11 == 1) {
                jVar2 = (zc.j) aVar.f16314i;
                kVar = (k) aVar.f16313h;
                s.b(objA);
            } else if (i11 == 2) {
                bitmap = (Bitmap) aVar.f16315j;
                zc.j jVar4 = (zc.j) aVar.f16314i;
                k kVar3 = (k) aVar.f16313h;
                s.b(objA);
                jVar3 = jVar4;
                kVar2 = kVar3;
                rect = (Rect) objA;
                if (rect == null) {
                    return new f.a(null, bitmap, 1, null);
                }
                l lVar = kVar2.f16312f;
                b bVar = new b(jVar3, kVar2, rect, bitmap, null);
                aVar.f16313h = bitmap;
                aVar.f16314i = null;
                aVar.f16315j = null;
                aVar.f16318m = 3;
                objA = lVar.a("Extract content corners", bVar, aVar);
                if (objA == objF) {
                    return objF;
                }
                bitmap2 = bitmap;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap2 = (Bitmap) aVar.f16313h;
                s.b(objA);
            }
            return new f.a((List) objA, bitmap2);
        }
        s.b(objA);
        l lVar2 = this.f16312f;
        d dVar = new d(view, null);
        aVar.f16313h = this;
        aVar.f16314i = jVar;
        aVar.f16318m = 1;
        objA = lVar2.a("Screenshot", dVar, aVar);
        if (objA == objF) {
            return objF;
        }
        jVar2 = jVar;
        kVar = this;
        Bitmap bitmap3 = (Bitmap) objA;
        if (bitmap3 == null) {
            return new f.a(null, null, 3, null);
        }
        l lVar3 = kVar.f16312f;
        c cVar = kVar.new c(bitmap3, null);
        aVar.f16313h = kVar;
        aVar.f16314i = jVar2;
        aVar.f16315j = bitmap3;
        aVar.f16318m = 2;
        Object objA2 = lVar3.a("Scan bounds", cVar, aVar);
        if (objA2 == objF) {
            return objF;
        }
        jVar3 = jVar2;
        kVar2 = kVar;
        bitmap = bitmap3;
        objA = objA2;
        rect = (Rect) objA;
        if (rect == null) {
            return new f.a(null, bitmap, 1, null);
        }
        l lVar4 = kVar2.f16312f;
        b bVar2 = new b(jVar3, kVar2, rect, bitmap, null);
        aVar.f16313h = bitmap;
        aVar.f16314i = null;
        aVar.f16315j = null;
        aVar.f16318m = 3;
        objA = lVar4.a("Extract content corners", bVar2, aVar);
        if (objA == objF) {
            return objF;
        }
        bitmap2 = bitmap;
        return new f.a((List) objA, bitmap2);
    }
}
