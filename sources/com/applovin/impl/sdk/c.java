package com.applovin.impl.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements h.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8343b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8344c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8345d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8346e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f8347f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f8348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8349h;

    public interface a {
        void a(List list);
    }

    public c(l lVar) {
        HashSet hashSet = new HashSet();
        this.f8348g = hashSet;
        this.f8349h = false;
        this.f8342a = lVar;
        hashSet.add(h.c.LOADING);
        hashSet.add(h.c.LOAD);
        hashSet.add(h.c.SHOW);
        hashSet.add(h.c.CLICK);
        hashSet.add(h.c.SHOW_ERROR);
        hashSet.add(h.c.DESTROY);
    }

    private boolean c() {
        return this.f8347f.isEmpty() && this.f8345d.isEmpty();
    }

    private void d() {
        List listA = a();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(listA);
        }
    }

    public List a() {
        ArrayList arrayList;
        synchronized (this.f8344c) {
            arrayList = new ArrayList(this.f8343b.size());
            Iterator it = this.f8343b.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((h.b) it.next()).a());
            }
        }
        return arrayList;
    }

    public void b(Object obj) {
        synchronized (this.f8346e) {
            this.f8347f.remove(obj);
            if (this.f8349h && c()) {
                this.f8342a.m().a(this);
                this.f8349h = false;
            }
        }
    }

    @Override // com.applovin.impl.sdk.h.d
    public void a(h.b bVar) {
        b(bVar);
        d();
    }

    public void b(a aVar) {
        synchronized (this.f8346e) {
            this.f8345d.remove(aVar);
            if (this.f8349h && c()) {
                this.f8342a.m().a(this);
                this.f8349h = false;
            }
        }
    }

    public void a(Object obj) {
        synchronized (this.f8346e) {
            this.f8347f.add(obj);
            if (!this.f8349h) {
                this.f8342a.m().a(this, this.f8348g);
                this.f8349h = true;
            }
        }
    }

    private List b() {
        ArrayList arrayList;
        synchronized (this.f8346e) {
            arrayList = new ArrayList(this.f8345d);
        }
        return arrayList;
    }

    public void a(a aVar) {
        synchronized (this.f8346e) {
            if (aVar != null) {
                if (!this.f8345d.contains(aVar)) {
                    this.f8345d.add(aVar);
                    if (!this.f8349h) {
                        this.f8342a.m().a(this, this.f8348g);
                        this.f8349h = true;
                    }
                }
            }
        }
    }

    private void b(h.b bVar) {
        synchronized (this.f8344c) {
            try {
                if (bVar == null) {
                    return;
                }
                String strB = bVar.b();
                if (bVar.c() == h.c.DESTROY) {
                    this.f8343b.remove(strB);
                } else {
                    if (this.f8343b.containsKey(strB)) {
                        return;
                    }
                    this.f8343b.put(strB, bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
