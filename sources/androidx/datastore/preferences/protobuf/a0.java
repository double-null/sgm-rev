package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes.dex */
public class a0 extends b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f2098e;

    /* JADX INFO: compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry<K, a0> f2099a;

        public a0 a() {
            return this.f2099a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2099a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a0 value = this.f2099a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof p0) {
                return this.f2099a.getValue().d((p0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, a0> entry) {
            this.f2099a = entry;
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f2100a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2100a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2100a.next();
            return next.getValue() instanceof a0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2100a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2100a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public p0 f() {
        return c(this.f2098e);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
