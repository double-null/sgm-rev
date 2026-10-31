package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9058a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(a3 a3Var);
    }

    public void a(a aVar) {
        this.f9058a.add(aVar);
    }

    public void b(a aVar) {
        this.f9058a.remove(aVar);
    }

    public void a(a3 a3Var) {
        Iterator it = new ArrayList(this.f9058a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(a3Var);
        }
    }
}
