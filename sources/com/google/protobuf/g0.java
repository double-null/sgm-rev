package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes4.dex */
public class g0 extends c<String> implements h0, RandomAccess {

    @Deprecated
    public static final h0 EMPTY;
    private static final g0 EMPTY_LIST;
    private final List<Object> list;

    /* JADX INFO: compiled from: LazyStringArrayList.java */
    private static class a extends AbstractList<byte[]> implements RandomAccess {
        private final g0 list;

        a(g0 g0Var) {
            this.list = g0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, byte[] bArr) {
            this.list.add(i10, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i10) {
            return this.list.getByteArray(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i10) {
            String strRemove = this.list.remove(i10);
            ((AbstractList) this).modCount++;
            return g0.asByteArray(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i10, byte[] bArr) {
            Object andReturn = this.list.setAndReturn(i10, bArr);
            ((AbstractList) this).modCount++;
            return g0.asByteArray(andReturn);
        }
    }

    /* JADX INFO: compiled from: LazyStringArrayList.java */
    private static class b extends AbstractList<i> implements RandomAccess {
        private final g0 list;

        b(g0 g0Var) {
            this.list = g0Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, i iVar) {
            this.list.add(i10, iVar);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public i get(int i10) {
            return this.list.getByteString(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public i remove(int i10) {
            String strRemove = this.list.remove(i10);
            ((AbstractList) this).modCount++;
            return g0.asByteString(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public i set(int i10, i iVar) {
            Object andReturn = this.list.setAndReturn(i10, iVar);
            ((AbstractList) this).modCount++;
            return g0.asByteString(andReturn);
        }
    }

    static {
        g0 g0Var = new g0(false);
        EMPTY_LIST = g0Var;
        EMPTY = g0Var;
    }

    public g0() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return obj instanceof String ? a0.toByteArray((String) obj) : ((i) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i asByteString(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        return obj instanceof String ? i.copyFromUtf8((String) obj) : i.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof i ? ((i) obj).toStringUtf8() : a0.toStringUtf8((byte[]) obj);
    }

    public static g0 emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i10, i iVar) {
        ensureIsMutable();
        return this.list.set(i10, iVar);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.h0
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.h0
    public boolean addAllByteString(Collection<? extends i> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.h0
    public List<byte[]> asByteArrayList() {
        return new a(this);
    }

    @Override // com.google.protobuf.h0, com.google.protobuf.h1
    public List<i> asByteStringList() {
        return new b(this);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.h0
    public byte[] getByteArray(int i10) {
        Object obj = this.list.get(i10);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.list.set(i10, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // com.google.protobuf.h0
    public i getByteString(int i10) {
        Object obj = this.list.get(i10);
        i iVarAsByteString = asByteString(obj);
        if (iVarAsByteString != obj) {
            this.list.set(i10, iVarAsByteString);
        }
        return iVarAsByteString;
    }

    @Override // com.google.protobuf.h0
    public Object getRaw(int i10) {
        return this.list.get(i10);
    }

    @Override // com.google.protobuf.h0
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.h0
    public h0 getUnmodifiableView() {
        return isModifiable() ? new u1(this) : this;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.c, com.google.protobuf.a0.i
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.h0
    public void mergeFrom(h0 h0Var) {
        ensureIsMutable();
        for (Object obj : h0Var.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    private g0(boolean z10) {
        super(z10);
        this.list = Collections.emptyList();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof h0) {
            collection = ((h0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        Object obj = this.list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String stringUtf8 = iVar.toStringUtf8();
            if (iVar.isValidUtf8()) {
                this.list.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf9 = a0.toStringUtf8(bArr);
        if (a0.isValidUtf8(bArr)) {
            this.list.set(i10, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // com.google.protobuf.c, com.google.protobuf.a0.i
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public g0 mutableCopyWithCapacity2(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.list);
        return new g0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public String set(int i10, String str) {
        ensureIsMutable();
        return asString(this.list.set(i10, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int i10, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i10, bArr);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public void add(int i10, String str) {
        ensureIsMutable();
        this.list.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public String remove(int i10) {
        ensureIsMutable();
        Object objRemove = this.list.remove(i10);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    public g0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public g0(h0 h0Var) {
        this.list = new ArrayList(h0Var.size());
        addAll(h0Var);
    }

    @Override // com.google.protobuf.h0
    public void set(int i10, i iVar) {
        setAndReturn(i10, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i10, i iVar) {
        ensureIsMutable();
        this.list.add(i10, iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.h0
    public void set(int i10, byte[] bArr) {
        setAndReturn(i10, bArr);
    }

    public g0(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    private g0(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int i10, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i10, bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.h0
    public void add(i iVar) {
        ensureIsMutable();
        this.list.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.h0
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }
}
