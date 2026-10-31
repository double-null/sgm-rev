package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: ResourceManagerInternal.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static x0 f1488i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.i<ColorStateList>> f1490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.a<String, b> f1491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.collection.i<String> f1492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.e<WeakReference<Drawable.ConstantState>>> f1493d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f1494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f1496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1487h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f1489j = new a(6);

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class a extends androidx.collection.f<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i10, mode)));
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    /* JADX INFO: loaded from: classes.dex */
    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    /* JADX INFO: loaded from: classes.dex */
    interface c {
        Drawable a(x0 x0Var, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1493d.get(context);
        if (eVar == null) {
            eVar = new androidx.collection.e<>();
            this.f1493d.put(context, eVar);
        }
        eVar.k(j10, new WeakReference<>(constantState));
        return true;
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1490a == null) {
            this.f1490a = new WeakHashMap<>();
        }
        androidx.collection.i<ColorStateList> iVar = this.f1490a.get(context);
        if (iVar == null) {
            iVar = new androidx.collection.i<>();
            this.f1490a.put(context, iVar);
        }
        iVar.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f1495f) {
            return;
        }
        this.f1495f = true;
        Drawable drawableI = i(context, j.a.f20517a);
        if (drawableI == null || !p(drawableI)) {
            this.f1495f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f1494e == null) {
            this.f1494e = new TypedValue();
        }
        TypedValue typedValue = this.f1494e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f1496g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized x0 g() {
        if (f1488i == null) {
            x0 x0Var = new x0();
            f1488i = x0Var;
            o(x0Var);
        }
        return f1488i;
    }

    private synchronized Drawable h(Context context, long j10) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1493d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceH = eVar.h(j10);
        if (weakReferenceH != null) {
            Drawable.ConstantState constantState = weakReferenceH.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.d(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterB;
        a aVar = f1489j;
        porterDuffColorFilterB = aVar.b(i10, mode);
        if (porterDuffColorFilterB == null) {
            porterDuffColorFilterB = new PorterDuffColorFilter(i10, mode);
            aVar.c(i10, mode, porterDuffColorFilterB);
        }
        return porterDuffColorFilterB;
    }

    private ColorStateList m(Context context, int i10) {
        androidx.collection.i<ColorStateList> iVar;
        WeakHashMap<Context, androidx.collection.i<ColorStateList>> weakHashMap = this.f1490a;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return iVar.h(i10);
    }

    private static void o(x0 x0Var) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof b1.b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL == null) {
            c cVar = this.f1496g;
            if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (m0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableJ = androidx.core.graphics.drawable.a.j(drawable);
        androidx.core.graphics.drawable.a.h(drawableJ, colorStateListL);
        PorterDuff.Mode modeN = n(i10);
        if (modeN == null) {
            return drawableJ;
        }
        androidx.core.graphics.drawable.a.i(drawableJ, modeN);
        return drawableJ;
    }

    static void v(Drawable drawable, f1 f1Var, int[] iArr) {
        if (m0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = f1Var.f1266d;
        if (z10 || f1Var.f1265c) {
            drawable.setColorFilter(f(z10 ? f1Var.f1263a : null, f1Var.f1265c ? f1Var.f1264b : f1487h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        c(context);
        drawableQ = q(context, i10);
        if (drawableQ == null) {
            drawableQ = e(context, i10);
        }
        if (drawableQ == null) {
            drawableQ = androidx.core.content.a.e(context, i10);
        }
        if (drawableQ != null) {
            drawableQ = u(context, i10, z10, drawableQ);
        }
        if (drawableQ != null) {
            m0.b(drawableQ);
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f1496g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f1496g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        androidx.collection.e<WeakReference<Drawable.ConstantState>> eVar = this.f1493d.get(context);
        if (eVar != null) {
            eVar.a();
        }
    }

    synchronized Drawable s(Context context, n1 n1Var, int i10) {
        Drawable drawableQ = q(context, i10);
        if (drawableQ == null) {
            drawableQ = n1Var.c(i10);
        }
        if (drawableQ == null) {
            return null;
        }
        return u(context, i10, false, drawableQ);
    }

    public synchronized void t(c cVar) {
        this.f1496g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f1496g;
        return cVar != null && cVar.c(context, i10, drawable);
    }

    private Drawable q(Context context, int i10) {
        int next;
        androidx.collection.a<String, b> aVar = this.f1491b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        androidx.collection.i<String> iVar = this.f1492c;
        if (iVar != null) {
            String strH = iVar.h(i10);
            if ("appcompat_skip_skip".equals(strH) || (strH != null && this.f1491b.get(strH) == null)) {
                return null;
            }
        } else {
            this.f1492c = new androidx.collection.i<>();
        }
        if (this.f1494e == null) {
            this.f1494e = new TypedValue();
        }
        TypedValue typedValue = this.f1494e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1492c.a(i10, name);
                b bVar = this.f1491b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e(TwDPD.tTkcJdzIaDqe, UyXgnuLGEkgnZE.lCx, e10);
            }
        }
        if (drawableH == null) {
            this.f1492c.a(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }
}
