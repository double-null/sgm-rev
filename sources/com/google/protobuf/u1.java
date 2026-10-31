package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class u1 extends AbstractList<String> implements h0, RandomAccess {
    private final h0 list;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    class a implements ListIterator<String> {
        ListIterator<String> iter;
        final /* synthetic */ int val$index;

        a(int i10) {
            this.val$index = i10;
            this.iter = u1.this.list.listIterator(i10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.iter.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.iter.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.iter.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
            return this.iter.next();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.iter.previous();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    class b implements Iterator<String> {
        Iterator<String> iter;

        b() {
            this.iter = u1.this.list.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.iter.next();
        }
    }

    public u1(h0 h0Var) {
        this.list = h0Var;
    }

    @Override // com.google.protobuf.h0
    public void add(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.h0
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.h0
    public boolean addAllByteString(Collection<? extends i> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.h0
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.protobuf.h0, com.google.protobuf.h1
    public List<i> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // com.google.protobuf.h0
    public byte[] getByteArray(int i10) {
        return this.list.getByteArray(i10);
    }

    @Override // com.google.protobuf.h0
    public i getByteString(int i10) {
        return this.list.getByteString(i10);
    }

    @Override // com.google.protobuf.h0
    public Object getRaw(int i10) {
        return this.list.getRaw(i10);
    }

    @Override // com.google.protobuf.h0
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.h0
    public void mergeFrom(h0 h0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.h0
    public void set(int i10, i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.protobuf.h0
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return this.list.get(i10);
    }

    @Override // com.google.protobuf.h0
    public void set(int i10, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.h0
    public h0 getUnmodifiableView() {
        return this;
    }
}
