package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes.dex */
public class y2 extends AbstractList<String> implements r0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f10897a;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator<String> f10898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10899b;

        a(int i10) {
            this.f10899b = i10;
            this.f10898a = y2.this.f10897a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f10898a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f10898a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10898a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10898a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10898a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f10898a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<String> f10901a;

        b() {
            this.f10901a = y2.this.f10897a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f10901a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10901a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y2(r0 r0Var) {
        this.f10897a = r0Var;
    }

    @Override // com.explorestack.protobuf.r0
    public void b(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f10897a.get(i10);
    }

    @Override // com.explorestack.protobuf.r0
    public ByteString getByteString(int i10) {
        return this.f10897a.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.r0
    public Object getRaw(int i10) {
        return this.f10897a.getRaw(i10);
    }

    @Override // com.explorestack.protobuf.r0
    public List<?> getUnderlyingElements() {
        return this.f10897a.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10897a.size();
    }

    @Override // com.explorestack.protobuf.r0
    public r0 getUnmodifiableView() {
        return this;
    }
}
