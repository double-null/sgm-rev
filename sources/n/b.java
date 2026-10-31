package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c<K, V> f22639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<K, V> f22640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f22641c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22642d = 0;

    /* JADX INFO: compiled from: SafeIterableMap.java */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f22646d;
        }

        @Override // n.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f22645c;
        }
    }

    /* JADX INFO: renamed from: n.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    private static class C0374b<K, V> extends e<K, V> {
        C0374b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f22645c;
        }

        @Override // n.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f22646d;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f22643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final V f22644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f22645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f22646d;

        c(K k10, V v10) {
            this.f22643a = k10;
            this.f22644b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22643a.equals(cVar.f22643a) && this.f22644b.equals(cVar.f22644b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f22643a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f22644b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f22643a.hashCode() ^ this.f22644b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f22643a + "=" + this.f22644b;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c<K, V> f22647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22648b = true;

        d() {
        }

        @Override // n.b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f22647a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f22646d;
                this.f22647a = cVar3;
                this.f22648b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f22648b) {
                this.f22648b = false;
                this.f22647a = b.this.f22639a;
            } else {
                c<K, V> cVar = this.f22647a;
                this.f22647a = cVar != null ? cVar.f22645c : null;
            }
            return this.f22647a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22648b) {
                return b.this.f22639a != null;
            }
            c<K, V> cVar = this.f22647a;
            return (cVar == null || cVar.f22645c == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c<K, V> f22650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f22651b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f22650a = cVar2;
            this.f22651b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f22651b;
            c<K, V> cVar2 = this.f22650a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // n.b.f
        public void a(c<K, V> cVar) {
            if (this.f22650a == cVar && cVar == this.f22651b) {
                this.f22651b = null;
                this.f22650a = null;
            }
            c<K, V> cVar2 = this.f22650a;
            if (cVar2 == cVar) {
                this.f22650a = b(cVar2);
            }
            if (this.f22651b == cVar) {
                this.f22651b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f22651b;
            this.f22651b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22651b != null;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f22639a;
    }

    protected c<K, V> c(K k10) {
        c<K, V> cVar = this.f22639a;
        while (cVar != null && !cVar.f22643a.equals(k10)) {
            cVar = cVar.f22645c;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f22641c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0374b c0374b = new C0374b(this.f22640b, this.f22639a);
        this.f22641c.put(c0374b, Boolean.FALSE);
        return c0374b;
    }

    public Map.Entry<K, V> e() {
        return this.f22640b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    c<K, V> f(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f22642d++;
        c<K, V> cVar2 = this.f22640b;
        if (cVar2 == null) {
            this.f22639a = cVar;
            this.f22640b = cVar;
            return cVar;
        }
        cVar2.f22645c = cVar;
        cVar.f22646d = cVar2;
        this.f22640b = cVar;
        return cVar;
    }

    public V g(K k10, V v10) {
        c<K, V> cVarC = c(k10);
        if (cVarC != null) {
            return cVarC.f22644b;
        }
        f(k10, v10);
        return null;
    }

    public V h(K k10) {
        c<K, V> cVarC = c(k10);
        if (cVarC == null) {
            return null;
        }
        this.f22642d--;
        if (!this.f22641c.isEmpty()) {
            Iterator<f<K, V>> it = this.f22641c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f22646d;
        if (cVar != null) {
            cVar.f22645c = cVarC.f22645c;
        } else {
            this.f22639a = cVarC.f22645c;
        }
        c<K, V> cVar2 = cVarC.f22645c;
        if (cVar2 != null) {
            cVar2.f22646d = cVar;
        } else {
            this.f22640b = cVar;
        }
        cVarC.f22645c = null;
        cVarC.f22646d = null;
        return cVarC.f22644b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f22639a, this.f22640b);
        this.f22641c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f22642d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
