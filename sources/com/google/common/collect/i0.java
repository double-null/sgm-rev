package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: Multimaps.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: compiled from: Multimaps.java */
    private static class a<K, V> extends c<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient com.google.common.base.w<? extends List<V>> f11634g;

        a(Map<K, Collection<V>> map, com.google.common.base.w<? extends List<V>> wVar) {
            super(map);
            this.f11634g = (com.google.common.base.w) com.google.common.base.p.l(wVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f11634g = (com.google.common.base.w) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            U((Map) object2);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f11634g);
            objectOutputStream.writeObject(D());
        }

        @Override // com.google.common.collect.f
        Map<K, Collection<V>> g() {
            return H();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public List<V> F() {
            return this.f11634g.get();
        }

        @Override // com.google.common.collect.f
        Set<K> k() {
            return I();
        }
    }

    /* JADX INFO: compiled from: Multimaps.java */
    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        abstract g0<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().e(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    static boolean a(g0<?, ?> g0Var, Object obj) {
        if (obj == g0Var) {
            return true;
        }
        if (obj instanceof g0) {
            return g0Var.c().equals(((g0) obj).c());
        }
        return false;
    }

    public static <K, V> a0<K, V> b(Map<K, Collection<V>> map, com.google.common.base.w<? extends List<V>> wVar) {
        return new a(map, wVar);
    }
}
