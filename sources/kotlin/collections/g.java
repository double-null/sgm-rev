package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMutableSet.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g<E> extends AbstractSet<E> implements Set<E>, jd.b {
    protected g() {
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
