package com.google.common.collect;

import d5.LXP.wcAlQCOdREZdI;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: Maps.java */
    class a<K, V> extends a1<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.a1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Maps.java */
    private static abstract class b implements com.google.common.base.g<Map.Entry<?, ?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11618a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f11619b = new C0143b(wcAlQCOdREZdI.wHFtEisoUpG, 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f11620c = b();

        /* JADX INFO: compiled from: Maps.java */
        final enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.base.g
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.f0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Maps.java */
        final enum C0143b extends b {
            C0143b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.base.g
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ b[] b() {
            return new b[]{f11618a, f11619b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11620c.clone();
        }

        /* synthetic */ b(String str, int i10, e0 e0Var) {
            this(str, i10);
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static abstract class c<K, V> extends w0.d<Map.Entry<K, V>> {
        c() {
        }

        abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.google.common.collect.w0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.p.l(collection));
            } catch (UnsupportedOperationException unused) {
                return w0.k(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.w0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.p.l(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetH = w0.h(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetH.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(hashSetH);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class d<K, V> extends w0.d<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f11621a;

        d(Map<K, V> map) {
            this.f11621a = (Map) com.google.common.base.p.l(map);
        }

        Map<K, V> a() {
            return this.f11621a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static class e<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, V> f11622a;

        e(Map<K, V> map) {
            this.f11622a = (Map) com.google.common.base.p.l(map);
        }

        final Map<K, V> a() {
            return this.f11622a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f0.m(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (com.google.common.base.l.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) com.google.common.base.p.l(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = w0.g();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetG.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) com.google.common.base.p.l(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = w0.g();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetG.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f11623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Collection<V> f11624b;

        f() {
        }

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f11623a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.f11623a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f11624b;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionB = b();
            this.f11624b = collectionB;
            return collectionB;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            h.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return z.d(m(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new t(k10, v10);
    }

    public static <K, V> HashMap<K, V> e(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> f(int i10) {
        return new HashMap<>(a(i10));
    }

    public static <K, V> IdentityHashMap<K, V> g() {
        return new IdentityHashMap<>();
    }

    static boolean h(Map<?, ?> map, Object obj) {
        com.google.common.base.p.l(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V i(Map<?, V> map, Object obj) {
        com.google.common.base.p.l(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V j(Map<?, V> map, Object obj) {
        com.google.common.base.p.l(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String k(Map<?, ?> map) {
        StringBuilder sbB = i.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    static <V> com.google.common.base.g<Map.Entry<?, V>, V> l() {
        return b.f11619b;
    }

    static <K, V> Iterator<V> m(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
