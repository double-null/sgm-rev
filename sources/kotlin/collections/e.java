package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e<E> extends AbstractCollection<E> implements Collection<E>, jd.b {
    protected e() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
