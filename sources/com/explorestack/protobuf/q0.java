package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LazyStringArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends c<String> implements r0, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q0 f10775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f10776d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f10777b;

    static {
        q0 q0Var = new q0();
        f10775c = q0Var;
        q0Var.makeImmutable();
        f10776d = q0Var;
    }

    public q0() {
        this(10);
    }

    private static ByteString d(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : l0.m((byte[]) obj);
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.explorestack.protobuf.r0
    public void b(ByteString byteString) {
        a();
        this.f10777b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f10777b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f10777b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f10777b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f10777b.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String strM = l0.m(bArr);
        if (l0.j(bArr)) {
            this.f10777b.set(i10, strM);
        }
        return strM;
    }

    @Override // com.explorestack.protobuf.l0.j, com.explorestack.protobuf.l0.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q0 mutableCopyWithCapacity2(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f10777b);
        return new q0((ArrayList<Object>) arrayList);
    }

    @Override // com.explorestack.protobuf.r0
    public ByteString getByteString(int i10) {
        Object obj = this.f10777b.get(i10);
        ByteString byteStringD = d(obj);
        if (byteStringD != obj) {
            this.f10777b.set(i10, byteStringD);
        }
        return byteStringD;
    }

    @Override // com.explorestack.protobuf.r0
    public Object getRaw(int i10) {
        return this.f10777b.get(i10);
    }

    @Override // com.explorestack.protobuf.r0
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f10777b);
    }

    @Override // com.explorestack.protobuf.r0
    public r0 getUnmodifiableView() {
        return isModifiable() ? new y2(this) : this;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object objRemove = this.f10777b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return e(this.f10777b.set(i10, str));
    }

    @Override // com.explorestack.protobuf.c, com.explorestack.protobuf.l0.j
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10777b.size();
    }

    public q0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof r0) {
            collection = ((r0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f10777b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public q0(r0 r0Var) {
        this.f10777b = new ArrayList(r0Var.size());
        addAll(r0Var);
    }

    private q0(ArrayList<Object> arrayList) {
        this.f10777b = arrayList;
    }
}
