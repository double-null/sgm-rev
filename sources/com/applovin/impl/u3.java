package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class u3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f8865c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f8866d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3 f8867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3 f8868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3 f8869g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f8871b;

    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8875a;

        a(String str) {
            this.f8875a = str;
        }

        public String b() {
            return this.f8875a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f8867e = a("ars", aVar, a.INSTALL);
        f8868f = a("ar", aVar);
        f8869g = a("ttdasi_ms", aVar);
    }

    private u3(String str, Set set) {
        this.f8870a = str;
        this.f8871b = set;
    }

    protected boolean a(Object obj) {
        return obj instanceof u3;
    }

    public Set b() {
        return this.f8871b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        if (!u3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = u3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = u3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f8870a;
    }

    public String a() {
        return this.f8870a;
    }

    private static u3 a(String str, a... aVarArr) {
        Set set = f8865c;
        if (!set.contains(str)) {
            u3 u3Var = new u3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f8866d.put(str, u3Var);
            return u3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public boolean a(a aVar) {
        return this.f8871b.contains(aVar);
    }

    public static u3 a(String str) {
        return (u3) f8866d.get(str);
    }
}
