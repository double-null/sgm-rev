package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f<E> extends AbstractList<E> implements List<E>, jd.c {
    protected f() {
    }

    public abstract int c();

    public abstract E e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
