package ib;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f16287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f16288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ib.a f16289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f16290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f16291e;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16292h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f16293i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f16294j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f16296l;

        a(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16294j = obj;
            this.f16296l |= Integer.MIN_VALUE;
            return j.this.a(null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements id.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16297h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bitmap f16299j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Rect f16300k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, Rect rect, zc.f fVar) {
            super(1, fVar);
            this.f16299j = bitmap;
            this.f16300k = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return j.this.new b(this.f16299j, this.f16300k, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((b) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16297h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return kotlin.coroutines.jvm.internal.b.c(j.this.f16290d.a(this.f16299j, this.f16300k));
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements id.l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16301h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bitmap f16303j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, zc.f fVar) {
            super(1, fVar);
            this.f16303j = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return j.this.new c(this.f16303j, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((c) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16301h;
            if (i10 == 0) {
                s.b(obj);
                ib.a aVar = j.this.f16289c;
                Bitmap bitmap = this.f16303j;
                this.f16301h = 1;
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
        int f16304h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f16306j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, zc.f fVar) {
            super(1, fVar);
            this.f16306j = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(zc.f fVar) {
            return j.this.new d(this.f16306j, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f fVar) {
            return ((d) create(fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16304h;
            if (i10 == 0) {
                s.b(obj);
                o oVar = j.this.f16288b;
                View viewA = j.this.f16287a.a(this.f16306j);
                this.f16304h = 1;
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

    public j(n viewExtractor, o viewScreenshot, ib.a contentBoundsScanner, i meanColorCalculator, l performanceMeasurer) {
        t.f(viewExtractor, "viewExtractor");
        t.f(viewScreenshot, "viewScreenshot");
        t.f(contentBoundsScanner, "contentBoundsScanner");
        t.f(meanColorCalculator, "meanColorCalculator");
        t.f(performanceMeasurer, "performanceMeasurer");
        this.f16287a = viewExtractor;
        this.f16288b = viewScreenshot;
        this.f16289c = contentBoundsScanner;
        this.f16290d = meanColorCalculator;
        this.f16291e = performanceMeasurer;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ib.f
    public Object a(zc.j jVar, View view, zc.f fVar) throws Throwable {
        a aVar;
        j jVar2;
        Bitmap bitmap;
        Rect rect;
        Bitmap bitmap2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f16296l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f16296l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object objA = aVar.f16294j;
        Object objF = ad.d.f();
        int i11 = aVar.f16296l;
        if (i11 != 0) {
            if (i11 == 1) {
                j jVar3 = (j) aVar.f16292h;
                s.b(objA);
                jVar2 = jVar3;
            } else if (i11 == 2) {
                bitmap = (Bitmap) aVar.f16293i;
                jVar2 = (j) aVar.f16292h;
                s.b(objA);
                rect = (Rect) objA;
                if (rect == null) {
                    return new f.a(null, bitmap, 1, null);
                }
                l lVar = jVar2.f16291e;
                b bVar = jVar2.new b(bitmap, rect, null);
                aVar.f16292h = bitmap;
                aVar.f16293i = null;
                aVar.f16296l = 3;
                objA = lVar.a("Mean color", bVar, aVar);
                if (objA == objF) {
                    return objF;
                }
                bitmap2 = bitmap;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap2 = (Bitmap) aVar.f16292h;
                s.b(objA);
            }
            return new f.a(kotlin.coroutines.jvm.internal.b.c(((Number) objA).intValue()), bitmap2);
        }
        s.b(objA);
        l lVar2 = this.f16291e;
        d dVar = new d(view, null);
        aVar.f16292h = this;
        aVar.f16296l = 1;
        objA = lVar2.a("Screenshot", dVar, aVar);
        if (objA == objF) {
            return objF;
        }
        jVar2 = this;
        Bitmap bitmap3 = (Bitmap) objA;
        if (bitmap3 == null) {
            return new f.a(null, null, 3, null);
        }
        l lVar3 = jVar2.f16291e;
        c cVar = jVar2.new c(bitmap3, null);
        aVar.f16292h = jVar2;
        aVar.f16293i = bitmap3;
        aVar.f16296l = 2;
        Object objA2 = lVar3.a("Scan bounds", cVar, aVar);
        if (objA2 == objF) {
            return objF;
        }
        objA = objA2;
        bitmap = bitmap3;
        rect = (Rect) objA;
        if (rect == null) {
            return new f.a(null, bitmap, 1, null);
        }
        l lVar4 = jVar2.f16291e;
        b bVar2 = jVar2.new b(bitmap, rect, null);
        aVar.f16292h = bitmap;
        aVar.f16293i = null;
        aVar.f16296l = 3;
        objA = lVar4.a("Mean color", bVar2, aVar);
        if (objA == objF) {
            return objF;
        }
        bitmap2 = bitmap;
        return new f.a(kotlin.coroutines.jvm.internal.b.c(((Number) objA).intValue()), bitmap2);
    }
}
