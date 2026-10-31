package com.google.zxing;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12483b;

    public int a() {
        return this.f12483b;
    }

    public int b() {
        return this.f12482a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12482a == bVar.f12482a && this.f12483b == bVar.f12483b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f12482a * 32713) + this.f12483b;
    }

    public String toString() {
        return this.f12482a + "x" + this.f12483b;
    }
}
