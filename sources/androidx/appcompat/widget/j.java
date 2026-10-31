package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: compiled from: AppCompatDrawableManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f1317b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static j f1318c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x0 f1319a;

    /* JADX INFO: compiled from: AppCompatDrawableManager.java */
    static class a implements x0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f1320a = {g.e.S, g.e.Q, g.e.f15024a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f1321b = {g.e.f15038o, g.e.B, g.e.f15043t, g.e.f15039p, g.e.f15040q, g.e.f15042s, g.e.f15041r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f1322c = {g.e.P, g.e.R, g.e.f15034k, g.e.I, g.e.J, g.e.L, g.e.N, g.e.K, g.e.M, g.e.O};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f1323d = {g.e.f15046w, g.e.f15032i, g.e.f15045v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f1324e = {g.e.H, g.e.T};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f1325f = {g.e.f15026c, g.e.f15030g, g.e.f15027d, g.e.f15031h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iB = c1.b(context, g.a.f14999v);
            return new ColorStateList(new int[][]{c1.f1216b, c1.f1219e, c1.f1217c, c1.f1223i}, new int[]{c1.a(context, g.a.f14997t), androidx.core.graphics.a.b(iB, i10), androidx.core.graphics.a.b(iB, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, c1.b(context, g.a.f14996s));
        }

        private ColorStateList j(Context context) {
            return h(context, c1.b(context, g.a.f14997t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = g.a.f15001x;
            ColorStateList colorStateListD = c1.d(context, i10);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = c1.f1216b;
                iArr2[0] = c1.a(context, i10);
                iArr[1] = c1.f1220f;
                iArr2[1] = c1.b(context, g.a.f14998u);
                iArr[2] = c1.f1223i;
                iArr2[2] = c1.b(context, i10);
            } else {
                int[] iArr3 = c1.f1216b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = c1.f1220f;
                iArr2[1] = c1.b(context, g.a.f14998u);
                iArr[2] = c1.f1223i;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private void l(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (m0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1317b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.x0.c
        public Drawable a(x0 x0Var, Context context, int i10) {
            if (i10 == g.e.f15033j) {
                return new LayerDrawable(new Drawable[]{x0Var.i(context, g.e.f15032i), x0Var.i(context, g.e.f15034k)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.x0.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == g.e.f15036m) {
                return h.a.a(context, g.c.f15008d);
            }
            if (i10 == g.e.G) {
                return h.a.a(context, g.c.f15011g);
            }
            if (i10 == g.e.F) {
                return k(context);
            }
            if (i10 == g.e.f15029f) {
                return j(context);
            }
            if (i10 == g.e.f15025b) {
                return g(context);
            }
            if (i10 == g.e.f15028e) {
                return i(context);
            }
            if (i10 == g.e.D || i10 == g.e.E) {
                return h.a.a(context, g.c.f15010f);
            }
            if (f(this.f1321b, i10)) {
                return c1.d(context, g.a.f15000w);
            }
            if (f(this.f1324e, i10)) {
                return h.a.a(context, g.c.f15007c);
            }
            if (f(this.f1325f, i10)) {
                return h.a.a(context, g.c.f15006b);
            }
            if (i10 == g.e.A) {
                return h.a.a(context, g.c.f15009e);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x0068  */
        /* JADX WARN: Code duplicated, block: B:29:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.x0.c
        public boolean c(Context context, int i10, Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            PorterDuff.Mode mode = j.f1317b;
            if (!f(this.f1320a, i10)) {
                if (f(this.f1322c, i10)) {
                    i11 = g.a.f14998u;
                } else {
                    if (f(this.f1323d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else if (i10 == g.e.f15044u) {
                        z10 = true;
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        mode = mode;
                    } else if (i10 != g.e.f15035l) {
                        i11 = 0;
                        z10 = false;
                        iRound = -1;
                    }
                    mode = mode;
                    iRound = -1;
                    i11 = 16842801;
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
                if (m0.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(j.e(c1.b(context, i11), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                return true;
            }
            i11 = g.a.f15000w;
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            if (m0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(j.e(c1.b(context, i11), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.x0.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == g.e.F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.x0.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == g.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = g.a.f15000w;
                l(drawableFindDrawableByLayerId, c1.b(context, i11), j.f1317b);
                l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), c1.b(context, i11), j.f1317b);
                l(layerDrawable.findDrawableByLayerId(R.id.progress), c1.b(context, g.a.f14998u), j.f1317b);
                return true;
            }
            if (i10 != g.e.f15048y && i10 != g.e.f15047x && i10 != g.e.f15049z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            l(layerDrawable2.findDrawableByLayerId(R.id.background), c1.a(context, g.a.f15000w), j.f1317b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = g.a.f14998u;
            l(drawableFindDrawableByLayerId2, c1.b(context, i12), j.f1317b);
            l(layerDrawable2.findDrawableByLayerId(R.id.progress), c1.b(context, i12), j.f1317b);
            return true;
        }
    }

    public static synchronized j b() {
        if (f1318c == null) {
            h();
        }
        return f1318c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return x0.k(i10, mode);
    }

    public static synchronized void h() {
        if (f1318c == null) {
            j jVar = new j();
            f1318c = jVar;
            jVar.f1319a = x0.g();
            f1318c.f1319a.t(new a());
        }
    }

    static void i(Drawable drawable, f1 f1Var, int[] iArr) {
        x0.v(drawable, f1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1319a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1319a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f1319a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1319a.r(context);
    }
}
