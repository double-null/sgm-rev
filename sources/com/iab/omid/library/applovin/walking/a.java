package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f12636a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0164a> f12637b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f12638c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f12639d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f12640e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f12641f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f12642g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f12643h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f12644i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12645j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0164a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f12646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f12647b = new ArrayList<>();

        public C0164a(e eVar, String str) {
            this.f12646a = eVar;
            a(str);
        }

        public e a() {
            return this.f12646a;
        }

        public ArrayList<String> b() {
            return this.f12647b;
        }

        public void a(String str) {
            this.f12647b.add(str);
        }
    }

    public View a(String str) {
        return this.f12638c.get(str);
    }

    public C0164a b(View view) {
        C0164a c0164a = this.f12637b.get(view);
        if (c0164a != null) {
            this.f12637b.remove(view);
        }
        return c0164a;
    }

    public String c(View view) {
        if (this.f12636a.size() == 0) {
            return null;
        }
        String str = this.f12636a.get(view);
        if (str != null) {
            this.f12636a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f12639d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f12645j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f12643h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f12640e.add(strC);
                            this.f12636a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != cTJaRZ.KQMa) {
                            this.f12641f.add(strC);
                            this.f12638c.put(strC, viewE);
                            this.f12642g.put(strC, strA);
                        }
                    } else {
                        this.f12641f.add(strC);
                        this.f12642g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f12644i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f12644i.containsKey(view)) {
            return this.f12644i.get(view);
        }
        Map<View, Boolean> map = this.f12644i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f12642g.get(str);
    }

    public HashSet<String> c() {
        return this.f12640e;
    }

    public void d() {
        this.f12645j = true;
    }

    public boolean e(View view) {
        if (!this.f12644i.containsKey(view)) {
            return true;
        }
        this.f12644i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
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
        this.f12639d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f12641f;
    }

    public boolean c(String str) {
        return this.f12643h.contains(str);
    }

    public void a() {
        this.f12636a.clear();
        this.f12637b.clear();
        this.f12638c.clear();
        this.f12639d.clear();
        this.f12640e.clear();
        this.f12641f.clear();
        this.f12642g.clear();
        this.f12645j = false;
        this.f12643h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0164a c0164a = this.f12637b.get(view);
        if (c0164a != null) {
            c0164a.a(aVar.c());
        } else {
            this.f12637b.put(view, new C0164a(eVar, aVar.c()));
        }
    }
}
