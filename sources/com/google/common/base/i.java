package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: Joiner.java */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11448a;

    private i(String str) {
        this.f11448a = (String) p.l(str);
    }

    public static i f(char c10) {
        return new i(String.valueOf(c10));
    }

    public static i g(String str) {
        return new i(str);
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) throws IOException {
        p.l(a10);
        if (it.hasNext()) {
            a10.append(h(it.next()));
            while (it.hasNext()) {
                a10.append(this.f11448a);
                a10.append(h(it.next()));
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
