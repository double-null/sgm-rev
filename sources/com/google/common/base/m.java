package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: compiled from: Optional.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class m<T> implements Serializable {
    m() {
    }

    public static <T> m<T> b() {
        return a.k();
    }

    public static <T> m<T> f(T t10) {
        return new s(p.l(t10));
    }

    public abstract T c();

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    public abstract T g(w<? extends T> wVar);

    public abstract T h();

    public abstract int hashCode();
}
