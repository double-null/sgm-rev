package x5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import o5.o;
import s5.e;
import w5.h;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f28052a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, a> f28053b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f28054c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f28055d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f28056e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f28057f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f28058g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f28059h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f28060i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28061j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f28062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f28063b = new ArrayList<>();

        public a(e eVar, String str) {
            this.f28062a = eVar;
            b(str);
        }

        public e a() {
            return this.f28062a;
        }

        public void b(String str) {
            this.f28063b.add(str);
        }

        public ArrayList<String> c() {
            return this.f28063b;
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f28060i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f28060i.containsKey(view)) {
            return this.f28060i.get(view);
        }
        Map<View, Boolean> map = this.f28060i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    private String c(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f28055d.addAll(hashSet);
        return null;
    }

    private void e(o oVar) {
        Iterator<e> it = oVar.n().iterator();
        while (it.hasNext()) {
            f(it.next(), oVar);
        }
    }

    private void f(e eVar, o oVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f28053b.get(view);
        if (aVar != null) {
            aVar.b(oVar.k());
        } else {
            this.f28053b.put(view, new a(eVar, oVar.k()));
        }
    }

    public View a(String str) {
        return this.f28054c.get(str);
    }

    public void d() {
        this.f28052a.clear();
        this.f28053b.clear();
        this.f28054c.clear();
        this.f28055d.clear();
        this.f28056e.clear();
        this.f28057f.clear();
        this.f28058g.clear();
        this.f28061j = false;
        this.f28059h.clear();
    }

    public String g(String str) {
        return this.f28058g.get(str);
    }

    public HashSet<String> h() {
        return this.f28057f;
    }

    public a i(View view) {
        a aVar = this.f28053b.get(view);
        if (aVar != null) {
            this.f28053b.remove(view);
        }
        return aVar;
    }

    public String j(View view) {
        if (this.f28052a.size() == 0) {
            return null;
        }
        String str = this.f28052a.get(view);
        if (str != null) {
            this.f28052a.remove(view);
        }
        return str;
    }

    public HashSet<String> k() {
        return this.f28056e;
    }

    public boolean l(String str) {
        return this.f28059h.contains(str);
    }

    public d m(View view) {
        if (this.f28055d.contains(view)) {
            return d.PARENT_VIEW;
        }
        return this.f28061j ? d.OBSTRUCTION_VIEW : d.UNDERLYING_VIEW;
    }

    public void n() {
        this.f28061j = true;
    }

    public void o() {
        s5.c cVarE = s5.c.e();
        if (cVarE != null) {
            for (o oVar : cVarE.a()) {
                View viewM = oVar.m();
                if (oVar.p()) {
                    String strK = oVar.k();
                    if (viewM != null) {
                        boolean zE = h.e(viewM);
                        if (zE) {
                            this.f28059h.add(strK);
                        }
                        String strC = c(viewM, zE);
                        if (strC == null) {
                            this.f28056e.add(strK);
                            this.f28052a.put(viewM, strK);
                            e(oVar);
                        } else if (strC != "noWindowFocus") {
                            this.f28057f.add(strK);
                            this.f28054c.put(strK, viewM);
                            this.f28058g.put(strK, strC);
                        }
                    } else {
                        this.f28057f.add(strK);
                        this.f28058g.put(strK, "noAdView");
                    }
                }
            }
        }
    }

    public boolean p(View view) {
        if (!this.f28060i.containsKey(view)) {
            return true;
        }
        this.f28060i.put(view, Boolean.TRUE);
        return false;
    }
}
