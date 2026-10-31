package f8;

import java.util.Objects;

/* JADX INFO: compiled from: BaseUrl.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14664d;

    public b(String str, String str2, int i10, int i11) {
        this.f14661a = str;
        this.f14662b = str2;
        this.f14663c = i10;
        this.f14664d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14663c == bVar.f14663c && this.f14664d == bVar.f14664d && Objects.equals(this.f14661a, bVar.f14661a) && Objects.equals(this.f14662b, bVar.f14662b);
    }

    public int hashCode() {
        return Objects.hash(this.f14661a, this.f14662b, Integer.valueOf(this.f14663c), Integer.valueOf(this.f14664d));
    }
}
