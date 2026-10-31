package g4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l> f15372a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f15372a.equals(this.f15372a));
    }

    public int hashCode() {
        return this.f15372a.hashCode();
    }

    public void i(l lVar) {
        if (lVar == null) {
            lVar = m.f15373a;
        }
        this.f15372a.add(lVar);
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f15372a.iterator();
    }
}
