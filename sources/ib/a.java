package ib;

import android.graphics.Bitmap;
import android.graphics.Rect;
import id.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.jvm.internal.t;
import ud.o0;
import wc.g0;
import wc.q;
import wc.s;
import wc.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0255a f16179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib.c f16180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f16181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zc.j f16182d;

    /* JADX INFO: renamed from: ib.a$a, reason: collision with other inner class name */
    public static final class C0255a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ib.d f16184b;

        public C0255a(int i10, ib.d samplingStrategy) {
            t.f(samplingStrategy, "samplingStrategy");
            this.f16183a = i10;
            this.f16184b = samplingStrategy;
        }

        public final int a(Rect rect) {
            t.f(rect, "rect");
            return this.f16184b.a(rect.width(), rect.height(), this.f16183a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0255a)) {
                return false;
            }
            C0255a c0255a = (C0255a) obj;
            return this.f16183a == c0255a.f16183a && t.a(this.f16184b, c0255a.f16184b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f16183a) * 31) + this.f16184b.hashCode();
        }

        public String toString() {
            return "Config(minContentDimensionPx=" + this.f16183a + ", samplingStrategy=" + this.f16184b + ')';
        }
    }

    public enum b {
        Horizontal,
        Vertical
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f16188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f16189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f16190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f16191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ c[] f16192f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f16193a;

        static {
            b bVar = b.Horizontal;
            f16188b = new c("Left", 0, bVar);
            b bVar2 = b.Vertical;
            f16189c = new c("Top", 1, bVar2);
            f16190d = new c("Right", 2, bVar);
            f16191e = new c("Bottom", 3, bVar2);
            f16192f = b();
        }

        private c(String str, int i10, b bVar) {
            super(str, i10);
            this.f16193a = bVar;
        }

        private static final /* synthetic */ c[] b() {
            return new c[]{f16188b, f16189c, f16190d, f16191e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f16192f.clone();
        }

        public final b c() {
            return this.f16193a;
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16194a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f16189c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f16191e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f16188b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f16190d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16194a = iArr;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f16196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f16198k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Bitmap f16200m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Rect f16201n;

        /* JADX INFO: renamed from: ib.a$e$a, reason: collision with other inner class name */
        static final class C0256a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16202h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f16203i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f16204j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Rect f16205k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int[] f16206l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f16207m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ List f16208n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0256a(a aVar, c cVar, Rect rect, int[] iArr, boolean z10, List list, zc.f fVar) {
                super(2, fVar);
                this.f16203i = aVar;
                this.f16204j = cVar;
                this.f16205k = rect;
                this.f16206l = iArr;
                this.f16207m = z10;
                this.f16208n = list;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((C0256a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new C0256a(this.f16203i, this.f16204j, this.f16205k, this.f16206l, this.f16207m, this.f16208n, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f16202h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return this.f16203i.b(this.f16204j, this.f16205k, this.f16206l, this.f16207m, new od.h(((Number) this.f16208n.get(0)).intValue(), ((Number) this.f16208n.get(1)).intValue()));
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16209h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f16210i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f16211j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Rect f16212k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int[] f16213l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f16214m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, c cVar, Rect rect, int[] iArr, boolean z10, zc.f fVar) {
                super(2, fVar);
                this.f16210i = aVar;
                this.f16211j = cVar;
                this.f16212k = rect;
                this.f16213l = iArr;
                this.f16214m = z10;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new b(this.f16210i, this.f16211j, this.f16212k, this.f16213l, this.f16214m, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f16209h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return a.d(this.f16210i, this.f16211j, this.f16212k, this.f16213l, this.f16214m, null, 16, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, Rect rect, zc.f fVar) {
            super(2, fVar);
            this.f16200m = bitmap;
            this.f16201n = rect;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            e eVar = a.this.new e(this.f16200m, this.f16201n, fVar);
            eVar.f16198k = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0138 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x0139  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int[] iArr;
            Object objA;
            o0 o0Var;
            boolean z10;
            Object objA2;
            List list;
            List listL;
            int iA;
            Rect rect;
            Object objF = ad.d.f();
            int i10 = this.f16197j;
            if (i10 != 0) {
                if (i10 == 1) {
                    z10 = this.f16196i;
                    int[] iArr2 = (int[]) this.f16195h;
                    o0 o0Var2 = (o0) this.f16198k;
                    s.b(obj);
                    objA = obj;
                    iArr = iArr2;
                    o0Var = o0Var2;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f16198k;
                    s.b(obj);
                    objA2 = obj;
                }
                listL = b0.L((Iterable) objA2);
                if (listL.size() != 2) {
                    return null;
                }
                iA = a.this.f16179a.a(this.f16201n);
                rect = new Rect(((Number) listL.get(0)).intValue(), ((Number) list.get(0)).intValue(), ((Number) listL.get(1)).intValue() + 1, ((Number) list.get(1)).intValue() + 1);
                if (rect.width() < iA && rect.height() >= iA) {
                    return rect;
                }
            }
            s.b(obj);
            o0 o0Var3 = (o0) this.f16198k;
            int[] iArrA = a.this.f16181c.a(this.f16200m, this.f16201n);
            boolean zHasAlpha = this.f16200m.hasAlpha();
            c[] cVarArr = {c.f16189c, c.f16191e};
            a aVar = a.this;
            Rect rect2 = this.f16201n;
            ArrayList arrayList = new ArrayList(2);
            int i11 = 0;
            while (i11 < 2) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(ud.k.b(o0Var3, aVar.f16182d, null, new b(aVar, cVarArr[i11], rect2, iArrA, zHasAlpha, null), 2, null));
                i11++;
                cVarArr = cVarArr;
                zHasAlpha = zHasAlpha;
                iArrA = iArrA;
                rect2 = rect2;
                aVar = aVar;
                arrayList = arrayList2;
            }
            boolean z11 = zHasAlpha;
            iArr = iArrA;
            this.f16198k = o0Var3;
            this.f16195h = iArr;
            this.f16196i = z11;
            this.f16197j = 1;
            objA = ud.f.a(arrayList, this);
            if (objA == objF) {
                return objF;
            }
            o0Var = o0Var3;
            z10 = z11;
            List listL2 = b0.L((Iterable) objA);
            if (listL2.size() != 2) {
                return null;
            }
            c[] cVarArr2 = {c.f16188b, c.f16190d};
            a aVar2 = a.this;
            Rect rect3 = this.f16201n;
            ArrayList arrayList3 = new ArrayList(2);
            int i12 = 0;
            while (i12 < 2) {
                ArrayList arrayList4 = arrayList3;
                arrayList4.add(ud.k.b(o0Var, aVar2.f16182d, null, new C0256a(aVar2, cVarArr2[i12], rect3, iArr, z10, listL2, null), 2, null));
                i12++;
                arrayList3 = arrayList4;
                rect3 = rect3;
                aVar2 = aVar2;
                cVarArr2 = cVarArr2;
            }
            this.f16198k = listL2;
            this.f16195h = null;
            this.f16197j = 2;
            objA2 = ud.f.a(arrayList3, this);
            if (objA2 == objF) {
                return objF;
            }
            list = listL2;
            listL = b0.L((Iterable) objA2);
            if (listL.size() != 2) {
                return null;
            }
            iA = a.this.f16179a.a(this.f16201n);
            rect = new Rect(((Number) listL.get(0)).intValue(), ((Number) list.get(0)).intValue(), ((Number) listL.get(1)).intValue() + 1, ((Number) list.get(1)).intValue() + 1);
            return rect.width() < iA ? null : null;
        }
    }

    public a(zc.j coroutineContext, C0255a config, ib.c detector, m pixelsExtractor) {
        t.f(coroutineContext, "coroutineContext");
        t.f(config, "config");
        t.f(detector, "detector");
        t.f(pixelsExtractor, "pixelsExtractor");
        this.f16179a = config;
        this.f16180b = detector;
        this.f16181c = pixelsExtractor;
        this.f16182d = coroutineContext.z(pa.h.f23769i.a().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer b(c cVar, Rect rect, int[] iArr, boolean z10, od.f fVar) {
        Integer numValueOf;
        Integer numValueOf2;
        q qVarG = g(cVar, rect, fVar);
        od.f fVar2 = (od.f) qVarG.b();
        od.f fVar3 = (od.f) qVarG.c();
        int iWidth = rect.width();
        int iA = fVar2.a();
        int iC = fVar2.c();
        int iD = fVar2.d();
        if ((iD <= 0 || iA > iC) && (iD >= 0 || iC > iA)) {
            return null;
        }
        while (true) {
            int iA2 = fVar3.a();
            int iC2 = fVar3.c();
            int iD2 = fVar3.d();
            if ((iD2 > 0 && iA2 <= iC2) || (iD2 < 0 && iC2 <= iA2)) {
                while (true) {
                    if (cVar.c() == b.Horizontal) {
                        numValueOf = Integer.valueOf(iA);
                        numValueOf2 = Integer.valueOf(iA2);
                    } else {
                        numValueOf = Integer.valueOf(iA2);
                        numValueOf2 = Integer.valueOf(iA);
                    }
                    q qVarA = w.a(numValueOf, numValueOf2);
                    int iIntValue = ((Number) qVarA.b()).intValue();
                    if (!this.f16180b.a(iArr[((((Number) qVarA.c()).intValue() - rect.top) * iWidth) + (iIntValue - rect.left)], z10)) {
                        if (iA2 == iC2) {
                            break;
                        }
                        iA2 += iD2;
                    } else {
                        return Integer.valueOf(iA);
                    }
                }
            }
            if (iA == iC) {
                return null;
            }
            iA += iD;
        }
    }

    static /* synthetic */ Integer d(a aVar, c cVar, Rect rect, int[] iArr, boolean z10, od.f fVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            fVar = null;
        }
        return aVar.b(cVar, rect, iArr, z10, fVar);
    }

    public static /* synthetic */ Object f(a aVar, Bitmap bitmap, Rect rect, zc.f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        return aVar.e(bitmap, rect, fVar);
    }

    private final q g(c cVar, Rect rect, od.f fVar) {
        int i10 = d.f16194a[cVar.ordinal()];
        if (i10 == 1) {
            return new q(od.k.n(rect.top, rect.bottom), od.k.n(rect.left, rect.right));
        }
        if (i10 == 2) {
            return new q(od.k.l(rect.bottom - 1, rect.top), od.k.n(rect.left, rect.right));
        }
        if (i10 == 3) {
            od.h hVarN = od.k.n(rect.left, rect.right);
            if (fVar == null) {
                fVar = od.k.n(rect.top, rect.bottom);
            }
            return new q(hVarN, fVar);
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        od.f fVarL = od.k.l(rect.right - 1, rect.left);
        if (fVar == null) {
            fVar = od.k.n(rect.top, rect.bottom);
        }
        return new q(fVarL, fVar);
    }

    public final Object e(Bitmap bitmap, Rect rect, zc.f fVar) {
        return ud.i.g(this.f16182d, new e(bitmap, rect, null), fVar);
    }
}
