package xc;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SetBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j<E> extends kotlin.collections.g<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f28472b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f28473c = new j(d.f28442n.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<E, ?> f28474a;

    /* JADX INFO: compiled from: SetBuilder.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public j(d<E, ?> backing) {
        t.f(backing, "backing");
        this.f28474a = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f28474a.e0()) {
            return new h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        return this.f28474a.p(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        t.f(elements, "elements");
        this.f28474a.v();
        return super.addAll(elements);
    }

    @Override // kotlin.collections.g
    public int c() {
        return this.f28474a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f28474a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f28474a.containsKey(obj);
    }

    public final Set<E> e() {
        this.f28474a.t();
        return size() > 0 ? this : f28473c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f28474a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f28474a.h0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f28474a.q0(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28474a.v();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        t.f(elements, "elements");
        this.f28474a.v();
        return super.retainAll(elements);
    }

    public j() {
        this(new d());
    }

    public j(int i10) {
        this(new d(i10));
    }
}
