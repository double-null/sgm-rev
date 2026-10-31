package j5;

import a5.p;
import android.view.View;
import e5.e;
import i5.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f20626a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, a> f20627b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f20628c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f20629d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f20630e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f20631f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f20632g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f20633h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f20634i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20635j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f20636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f20637b = new ArrayList<>();

        public a(e eVar, String str) {
            this.f20636a = eVar;
            b(str);
        }

        public e a() {
            return this.f20636a;
        }

        public void b(String str) {
            this.f20637b.add(str);
        }

        public ArrayList<String> c() {
            return this.f20637b;
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f20634i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f20634i.containsKey(view)) {
            return this.f20634i.get(view);
        }
        Map<View, Boolean> map = this.f20634i;
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
        this.f20629d.addAll(hashSet);
        return null;
    }

    private void e(p pVar) {
        Iterator<e> it = pVar.o().iterator();
        while (it.hasNext()) {
            f(it.next(), pVar);
        }
    }

    private void f(e eVar, p pVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        a aVar = this.f20627b.get(view);
        if (aVar != null) {
            aVar.b(pVar.l());
        } else {
            this.f20627b.put(view, new a(eVar, pVar.l()));
        }
    }

    public View a(String str) {
        return this.f20628c.get(str);
    }

    public void d() {
        this.f20626a.clear();
        this.f20627b.clear();
        this.f20628c.clear();
        this.f20629d.clear();
        this.f20630e.clear();
        this.f20631f.clear();
        this.f20632g.clear();
        this.f20635j = false;
        this.f20633h.clear();
    }

    public a g(View view) {
        a aVar = this.f20627b.get(view);
        if (aVar != null) {
            this.f20627b.remove(view);
        }
        return aVar;
    }

    public String h(String str) {
        return this.f20632g.get(str);
    }

    public HashSet<String> i() {
        return this.f20631f;
    }

    public String j(View view) {
        if (this.f20626a.size() == 0) {
            return null;
        }
        String str = this.f20626a.get(view);
        if (str != null) {
            this.f20626a.remove(view);
        }
        return str;
    }

    public HashSet<String> k() {
        return this.f20630e;
    }

    public boolean l(String str) {
        return this.f20633h.contains(str);
    }

    public d m(View view) {
        if (this.f20629d.contains(view)) {
            return d.PARENT_VIEW;
        }
        return this.f20635j ? d.OBSTRUCTION_VIEW : d.UNDERLYING_VIEW;
    }

    public void n() {
        this.f20635j = true;
    }

    public void o() {
        e5.c cVarE = e5.c.e();
        if (cVarE != null) {
            for (p pVar : cVarE.a()) {
                View viewN = pVar.n();
                if (pVar.q()) {
                    String strL = pVar.l();
                    if (viewN != null) {
                        boolean zE = h.e(viewN);
                        if (zE) {
                            this.f20633h.add(strL);
                        }
                        String strC = c(viewN, zE);
                        if (strC == null) {
                            this.f20630e.add(strL);
                            this.f20626a.put(viewN, strL);
                            e(pVar);
                        } else if (strC != "noWindowFocus") {
                            this.f20631f.add(strL);
                            this.f20628c.put(strL, viewN);
                            this.f20632g.put(strL, strC);
                        }
                    } else {
                        this.f20631f.add(strL);
                        this.f20632g.put(strL, "noAdView");
                    }
                }
            }
        }
    }

    public boolean p(View view) {
        if (!this.f20634i.containsKey(view)) {
            return true;
        }
        this.f20634i.put(view, Boolean.TRUE);
        return false;
    }
}
