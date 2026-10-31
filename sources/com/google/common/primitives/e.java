package com.google.common.primitives;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.common.base.p;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: ImmutableIntArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f11757d = new e(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f11758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f11759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11760c;

    private e(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static e b(int[] iArr) {
        return iArr.length == 0 ? f11757d : new e(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean f() {
        return this.f11759b > 0 || this.f11760c < this.f11758a.length;
    }

    public static e h() {
        return f11757d;
    }

    public int c(int i10) {
        p.j(i10, g());
        return this.f11758a[this.f11759b + i10];
    }

    public boolean e() {
        return this.f11760c == this.f11759b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (g() != eVar.g()) {
            return false;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            if (c(i10) != eVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int g() {
        return this.f11760c - this.f11759b;
    }

    public int hashCode() {
        int iH = 1;
        for (int i10 = this.f11759b; i10 < this.f11760c; i10++) {
            iH = (iH * 31) + f.h(this.f11758a[i10]);
        }
        return iH;
    }

    public int[] k() {
        return Arrays.copyOfRange(this.f11758a, this.f11759b, this.f11760c);
    }

    public e n() {
        return f() ? new e(k()) : this;
    }

    Object readResolve() {
        return e() ? f11757d : this;
    }

    public String toString() {
        if (e()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(g() * 5);
        sb2.append('[');
        sb2.append(this.f11758a[this.f11759b]);
        int i10 = this.f11759b;
        while (true) {
            i10++;
            if (i10 >= this.f11760c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f11758a[i10]);
        }
    }

    Object writeReplace() {
        return n();
    }

    private e(int[] iArr, int i10, int i11) {
        this.f11758a = iArr;
        this.f11759b = i10;
        this.f11760c = i11;
    }
}
