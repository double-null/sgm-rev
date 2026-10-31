package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.h1;
import androidx.appcompat.widget.m0;
import androidx.core.view.e0;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SupportMenuInflater.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class<?>[] f21068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class<?>[] f21069f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f21070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f21071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f21072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f21073d;

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f21074c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f21075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f21076b;

        public a(Object obj, String str) {
            this.f21075a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f21076b = cls.getMethod(str, f21074c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f21076b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f21076b.invoke(this.f21075a, menuItem)).booleanValue();
                }
                this.f21076b.invoke(this.f21075a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    /* JADX INFO: loaded from: classes.dex */
    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f21077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f21083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f21084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f21085i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f21086j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f21087k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f21088l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f21089m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f21090n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f21091o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f21092p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f21093q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f21094r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f21095s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f21096t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f21097u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f21098v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f21099w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f21100x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f21101y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f21102z;

        public b(Menu menu) {
            this.f21077a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f21072c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f21095s).setVisible(this.f21096t).setEnabled(this.f21097u).setCheckable(this.f21094r >= 1).setTitleCondensed(this.f21088l).setIcon(this.f21089m);
            int i10 = this.f21098v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f21102z != null) {
                if (g.this.f21072c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f21102z));
            }
            boolean z11 = menuItem instanceof androidx.appcompat.view.menu.g;
            if (z11) {
            }
            if (this.f21094r >= 2) {
                if (z11) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof l.c) {
                    ((l.c) menuItem).h(true);
                }
            }
            String str = this.f21100x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f21068e, g.this.f21070a));
                z10 = true;
            }
            int i11 = this.f21099w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                e0.a(menuItem, bVar);
            }
            e0.c(menuItem, this.B);
            e0.g(menuItem, this.C);
            e0.b(menuItem, this.f21090n, this.f21091o);
            e0.f(menuItem, this.f21092p, this.f21093q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                e0.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                e0.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f21084h = true;
            i(this.f21077a.add(this.f21078b, this.f21085i, this.f21086j, this.f21087k));
        }

        public SubMenu b() {
            this.f21084h = true;
            SubMenu subMenuAddSubMenu = this.f21077a.addSubMenu(this.f21078b, this.f21085i, this.f21086j, this.f21087k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f21084h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f21072c.obtainStyledAttributes(attributeSet, g.j.f15198r1);
            this.f21078b = typedArrayObtainStyledAttributes.getResourceId(g.j.f15208t1, 0);
            this.f21079c = typedArrayObtainStyledAttributes.getInt(g.j.f15218v1, 0);
            this.f21080d = typedArrayObtainStyledAttributes.getInt(g.j.f15223w1, 0);
            this.f21081e = typedArrayObtainStyledAttributes.getInt(g.j.f15228x1, 0);
            this.f21082f = typedArrayObtainStyledAttributes.getBoolean(g.j.f15213u1, true);
            this.f21083g = typedArrayObtainStyledAttributes.getBoolean(g.j.f15203s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            h1 h1VarS = h1.s(g.this.f21072c, attributeSet, g.j.f15233y1);
            this.f21085i = h1VarS.m(g.j.B1, 0);
            this.f21086j = (h1VarS.j(g.j.E1, this.f21079c) & (-65536)) | (h1VarS.j(g.j.F1, this.f21080d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f21087k = h1VarS.o(g.j.G1);
            this.f21088l = h1VarS.o(g.j.H1);
            this.f21089m = h1VarS.m(g.j.f15238z1, 0);
            this.f21090n = c(h1VarS.n(g.j.I1));
            this.f21091o = h1VarS.j(g.j.P1, 4096);
            this.f21092p = c(h1VarS.n(g.j.J1));
            this.f21093q = h1VarS.j(g.j.T1, 4096);
            int i10 = g.j.K1;
            if (h1VarS.q(i10)) {
                this.f21094r = h1VarS.a(i10, false) ? 1 : 0;
            } else {
                this.f21094r = this.f21081e;
            }
            this.f21095s = h1VarS.a(g.j.C1, false);
            this.f21096t = h1VarS.a(g.j.D1, this.f21082f);
            this.f21097u = h1VarS.a(g.j.A1, this.f21083g);
            this.f21098v = h1VarS.j(g.j.U1, -1);
            this.f21102z = h1VarS.n(g.j.L1);
            this.f21099w = h1VarS.m(g.j.M1, 0);
            this.f21100x = h1VarS.n(g.j.O1);
            String strN = h1VarS.n(g.j.N1);
            this.f21101y = strN;
            boolean z10 = strN != null;
            if (z10 && this.f21099w == 0 && this.f21100x == null) {
                this.A = (androidx.core.view.b) e(strN, g.f21069f, g.this.f21071b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = h1VarS.o(g.j.Q1);
            this.C = h1VarS.o(g.j.V1);
            int i11 = g.j.S1;
            if (h1VarS.q(i11)) {
                this.E = m0.c(h1VarS.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = g.j.R1;
            if (h1VarS.q(i12)) {
                this.D = h1VarS.c(i12);
            } else {
                this.D = null;
            }
            h1VarS.u();
            this.f21084h = false;
        }

        public void h() {
            this.f21078b = 0;
            this.f21079c = 0;
            this.f21080d = 0;
            this.f21081e = 0;
            this.f21082f = true;
            this.f21083g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f21068e = clsArr;
        f21069f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f21072c = context;
        Object[] objArr = {context};
        this.f21070a = objArr;
        this.f21071b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f21073d == null) {
            this.f21073d = a(this.f21072c);
        }
        return this.f21073d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        String str = KBBdKxoAiHo.eyOSNrb;
        if (!(menu instanceof s.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                layout = this.f21072c.getResources().getLayout(i10);
                c(layout, Xml.asAttributeSet(layout), menu);
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException(str, e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(str, e11);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
