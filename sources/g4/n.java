package g4;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.g<String, l> f15374a = new i4.g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f15374a.equals(this.f15374a));
    }

    public int hashCode() {
        return this.f15374a.hashCode();
    }

    public void i(String str, l lVar) {
        i4.g<String, l> gVar = this.f15374a;
        if (lVar == null) {
            lVar = m.f15373a;
        }
        gVar.put(str, lVar);
    }

    public Set<Map.Entry<String, l>> j() {
        return this.f15374a.entrySet();
    }
}
