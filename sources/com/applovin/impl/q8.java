package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q8 f8010f = new q8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q8 f8011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f8014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final List f8015e;

    public q8(String str, Map map, q8 q8Var) {
        this.f8011a = q8Var;
        this.f8012b = str;
        this.f8013c = Collections.unmodifiableMap(map);
        this.f8015e = new ArrayList();
    }

    public Map a() {
        return this.f8013c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f8015e);
    }

    public String c() {
        return this.f8012b;
    }

    public String d() {
        return this.f8014d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f8012b + "', text='" + this.f8014d + "', attributes=" + this.f8013c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f8015e.size());
        for (q8 q8Var : this.f8015e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                arrayList.add(q8Var);
            }
        }
        return arrayList;
    }

    public q8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f8015e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            q8 q8Var = (q8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
            arrayList.addAll(q8Var.b());
        }
        return null;
    }

    public q8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (q8 q8Var : this.f8015e) {
            if (str.equalsIgnoreCase(q8Var.c())) {
                return q8Var;
            }
        }
        return null;
    }

    private q8() {
        this.f8011a = null;
        this.f8012b = "";
        this.f8013c = Collections.emptyMap();
        this.f8014d = "";
        this.f8015e = Collections.emptyList();
    }
}
