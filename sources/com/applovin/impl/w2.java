package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class w2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g3 f8994d;

    w2(String str, String str2, boolean z10, g3 g3Var) {
        this.f8991a = str;
        this.f8992b = str2;
        this.f8993c = z10;
        this.f8994d = g3Var;
    }

    public String a() {
        return this.f8992b;
    }

    public List b() {
        List listL = this.f8994d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f8991a) : listL;
    }

    public String c() {
        return this.f8991a;
    }

    public g3 d() {
        return this.f8994d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w2 w2Var = (w2) obj;
        String str = this.f8991a;
        if (str == null ? w2Var.f8991a != null : !str.equals(w2Var.f8991a)) {
            return false;
        }
        String str2 = this.f8992b;
        if (str2 == null ? w2Var.f8992b == null : str2.equals(w2Var.f8992b)) {
            return this.f8993c == w2Var.f8993c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8991a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8992b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f8993c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w2 w2Var) {
        return this.f8992b.compareToIgnoreCase(w2Var.f8992b);
    }
}
