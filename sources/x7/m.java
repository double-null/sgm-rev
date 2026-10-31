package x7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CopyOnWriteMultiset.java */
/* JADX INFO: loaded from: classes4.dex */
public final class m<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28153a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f28154b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f28155c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f28156d = Collections.emptyList();

    public void a(E e10) {
        synchronized (this.f28153a) {
            ArrayList arrayList = new ArrayList(this.f28156d);
            arrayList.add(e10);
            this.f28156d = Collections.unmodifiableList(arrayList);
            Integer num = this.f28154b.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f28155c);
                hashSet.add(e10);
                this.f28155c = Collections.unmodifiableSet(hashSet);
            }
            this.f28154b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public int c(E e10) {
        int iIntValue;
        synchronized (this.f28153a) {
            iIntValue = this.f28154b.containsKey(e10) ? this.f28154b.get(e10).intValue() : 0;
        }
        return iIntValue;
    }

    public void d(E e10) {
        synchronized (this.f28153a) {
            Integer num = this.f28154b.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f28156d);
            arrayList.remove(e10);
            this.f28156d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f28154b.remove(e10);
                HashSet hashSet = new HashSet(this.f28155c);
                hashSet.remove(e10);
                this.f28155c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f28154b.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f28153a) {
            it = this.f28156d.iterator();
        }
        return it;
    }

    public Set<E> k() {
        Set<E> set;
        synchronized (this.f28153a) {
            set = this.f28155c;
        }
        return set;
    }
}
