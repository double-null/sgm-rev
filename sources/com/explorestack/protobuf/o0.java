package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MessageLite f10705f;

    /* JADX INFO: compiled from: LazyField.java */
    static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry<K, o0> f10706a;

        public o0 a() {
            return this.f10706a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10706a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            o0 value = this.f10706a.getValue();
            if (value == null) {
                return null;
            }
            return value.g();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f10706a.getValue().e((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, o0> entry) {
            this.f10706a = entry;
        }
    }

    /* JADX INFO: compiled from: LazyField.java */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f10707a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f10707a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f10707a.next();
            return next.getValue() instanceof o0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10707a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f10707a.remove();
        }
    }

    public o0(MessageLite messageLite, y yVar, ByteString byteString) {
        super(yVar, byteString);
        this.f10705f = messageLite;
    }

    @Override // com.explorestack.protobuf.p0
    public boolean equals(Object obj) {
        return g().equals(obj);
    }

    public MessageLite g() {
        return d(this.f10705f);
    }

    @Override // com.explorestack.protobuf.p0
    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return g().toString();
    }
}
