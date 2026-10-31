package rd;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final od.h f25059b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.t.a(this.f25058a, jVar.f25058a) && kotlin.jvm.internal.t.a(this.f25059b, jVar.f25059b);
    }

    public int hashCode() {
        return (this.f25058a.hashCode() * 31) + this.f25059b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f25058a + ", range=" + this.f25059b + ')';
    }

    public j(String str, od.h range) {
        kotlin.jvm.internal.t.f(str, UyXgnuLGEkgnZE.Svg);
        kotlin.jvm.internal.t.f(range, "range");
        this.f25058a = str;
        this.f25059b = range;
    }
}
