package y7;

import u7.v;

/* JADX INFO: compiled from: Mp4AlternateGroupData.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28683a;

    public b(int i10) {
        this.f28683a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f28683a == ((b) obj).f28683a;
    }

    public int hashCode() {
        return this.f28683a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f28683a;
    }
}
