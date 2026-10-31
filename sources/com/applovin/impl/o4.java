package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class o4 implements Set, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f7755a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f7756b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(a()) > 0) {
            this.f7755a.add(comparable);
        } else {
            this.f7755a.add(b(comparable), comparable);
        }
        return this.f7756b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public Comparable b(int i10) {
        Comparable comparable = (Comparable) this.f7755a.remove(i10);
        this.f7756b.remove(comparable);
        return comparable;
    }

    public int c(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f7755a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch < size() && comparableA == a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f7755a.clear();
        this.f7756b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f7756b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f7756b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f7755a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f7755a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iD = d((Comparable) obj);
        if (iD == -1) {
            return false;
        }
        this.f7755a.remove(iD);
        return this.f7756b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f7755a.get(size);
            if (!collection.contains(comparable)) {
                this.f7755a.remove(size);
                this.f7756b.remove(comparable);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f7755a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f7755a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f7755a.toArray(objArr);
    }

    public int b(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f7755a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableA == a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    public Comparable a(int i10) {
        return (Comparable) this.f7755a.get(i10);
    }

    public void a(int i10, Comparable comparable) {
        this.f7756b.remove((Comparable) this.f7755a.get(i10));
        this.f7755a.set(i10, comparable);
        this.f7756b.add(comparable);
    }

    public Comparable a() {
        return (Comparable) this.f7755a.get(size() - 1);
    }
}
