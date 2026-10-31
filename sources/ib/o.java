package ib;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import id.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ud.k0;
import ud.o0;
import wb.i0;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pa.h f16351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f16352c;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16359a;

        public b(int i10) {
            this.f16359a = i10;
        }

        private final Object b(Bitmap bitmap) {
            try {
                r.a aVar = r.f27774b;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = this.f16359a;
                if (width <= i10 && height <= i10) {
                    return r.c(bitmap);
                }
                float f10 = i10;
                float f11 = width;
                float f12 = height;
                float fMin = Math.min(f10 / f11, f10 / f12);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f11 * fMin), (int) (f12 * fMin), true);
                t.e(bitmapCreateScaledBitmap, "createScaledBitmap(bitma…idth, scaledHeight, true)");
                if (bitmapCreateScaledBitmap != bitmap) {
                    wb.k.g(bitmap);
                }
                return r.c(bitmapCreateScaledBitmap);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                return r.c(s.a(th));
            }
        }

        public final Bitmap a(Bitmap bitmap) {
            t.f(bitmap, "bitmap");
            Object objB = b(bitmap);
            if (r.k(objB)) {
                objB = null;
            }
            Bitmap bitmap2 = (Bitmap) objB;
            return bitmap2 == null ? bitmap : bitmap2;
        }
    }

    public static final class c implements kb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ud.n f16360a;

        c(ud.n nVar) {
            this.f16360a = nVar;
        }

        @Override // kb.b
        public void a(Bitmap bitmap) {
            t.f(bitmap, "bitmap");
            this.f16360a.resumeWith(r.c(bitmap));
        }

        @Override // kb.b
        public void a() {
            this.f16360a.resumeWith(r.c(null));
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16362h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f16364j;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16365h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ View f16366i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, zc.f fVar) {
                super(2, fVar);
                this.f16366i = view;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new a(this.f16366i, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f16365h;
                if (i10 == 0) {
                    s.b(obj);
                    View view = this.f16366i;
                    this.f16365h = 1;
                    obj = i0.g(view, this);
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
        e(View view, zc.f fVar) {
            super(2, fVar);
            this.f16364j = view;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return o.this.new e(this.f16364j, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004d  */
        /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Bitmap bitmap;
            Object objF = ad.d.f();
            int i10 = this.f16362h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return null;
                }
                o oVar = o.this;
                return new b(oVar.f16350a.b(this.f16364j)).a(bitmap);
            }
            s.b(obj);
            k0 k0VarH = o.this.f16351b.h();
            a aVar = new a(this.f16364j, null);
            this.f16362h = 1;
            if (ud.i.g(k0VarH, aVar, this) == objF) {
                return objF;
            }
            o oVar2 = o.this;
            View view = this.f16364j;
            this.f16362h = 2;
            obj = oVar2.b(view, this);
            if (obj == objF) {
                return objF;
            }
            bitmap = (Bitmap) obj;
            if (bitmap != null) {
                return null;
            }
            o oVar3 = o.this;
            return new b(oVar3.f16350a.b(this.f16364j)).a(bitmap);
        }
    }

    public o(a config, pa.h coroutineDispatchers, Handler handler) {
        t.f(config, "config");
        t.f(coroutineDispatchers, "coroutineDispatchers");
        t.f(handler, "handler");
        this.f16350a = config;
        this.f16351b = coroutineDispatchers;
        this.f16352c = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(View view, zc.f fVar) {
        ud.p pVar = new ud.p(ad.c.c(fVar), 1);
        pVar.G();
        kb.a.f21299a.a(view, this.f16352c, this.f16350a.c(), new c(pVar));
        pVar.H(d.f16361d);
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }

    public final Object d(View view, zc.f fVar) {
        return ud.i.g(this.f16351b.f(), new e(view, null), fVar);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap.Config f16353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC0262a f16356d;

        /* JADX INFO: renamed from: ib.o$a$a, reason: collision with other inner class name */
        public interface InterfaceC0262a {

            /* JADX INFO: renamed from: ib.o$a$a$a, reason: collision with other inner class name */
            public static final class C0263a implements InterfaceC0262a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0263a f16357a = new C0263a();

                private C0263a() {
                }

                @Override // ib.o.a.InterfaceC0262a
                public int a(Context context, int i10, int i11, int i12, int i13) {
                    t.f(context, "context");
                    return i12;
                }
            }

            /* JADX INFO: renamed from: ib.o$a$a$b */
            public static final class b implements InterfaceC0262a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f16358a = new b();

                private b() {
                }

                @Override // ib.o.a.InterfaceC0262a
                public int a(Context context, int i10, int i11, int i12, int i13) {
                    t.f(context, "context");
                    float f10 = i13;
                    return (int) od.k.c(wb.r.a(i12, f10, f10 / Math.max(i10, i11)), 0.0f);
                }
            }

            int a(Context context, int i10, int i11, int i12, int i13);
        }

        public a(Bitmap.Config bitmapConfig, int i10, int i11, InterfaceC0262a scalingStrategy) {
            t.f(bitmapConfig, "bitmapConfig");
            t.f(scalingStrategy, "scalingStrategy");
            this.f16353a = bitmapConfig;
            this.f16354b = i10;
            this.f16355c = i11;
            this.f16356d = scalingStrategy;
        }

        public final int a(Context context, int i10, int i11) {
            t.f(context, "context");
            return this.f16356d.a(context, i10, i11, this.f16354b, this.f16355c);
        }

        public final int b(View view) {
            t.f(view, "view");
            Context context = view.getContext();
            t.e(context, "view.context");
            return a(context, view.getWidth(), view.getHeight());
        }

        public final Bitmap.Config c() {
            return this.f16353a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16353a == aVar.f16353a && this.f16354b == aVar.f16354b && this.f16355c == aVar.f16355c && t.a(this.f16356d, aVar.f16356d);
        }

        public int hashCode() {
            return (((((this.f16353a.hashCode() * 31) + Integer.hashCode(this.f16354b)) * 31) + Integer.hashCode(this.f16355c)) * 31) + this.f16356d.hashCode();
        }

        public String toString() {
            return "Config(bitmapConfig=" + this.f16353a + ", minDimensionPx=" + this.f16354b + ", maxDimensionPx=" + this.f16355c + ", scalingStrategy=" + this.f16356d + ')';
        }

        public /* synthetic */ a(Bitmap.Config config, int i10, int i11, InterfaceC0262a interfaceC0262a, int i12, kotlin.jvm.internal.k kVar) {
            this((i12 & 1) != 0 ? Bitmap.Config.RGB_565 : config, i10, i11, (i12 & 8) != 0 ? InterfaceC0262a.C0263a.f16357a : interfaceC0262a);
        }
    }

    static final class d extends u implements id.l {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f16361d = new d();

        d() {
            super(1);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return g0.f27756a;
        }

        public final void b(Throwable th) {
        }
    }
}
