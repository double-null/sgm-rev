package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v0<T> implements Iterator<T>, jd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.l<T, Iterator<T>> f1975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Iterator<T>> f1976b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<? extends T> f1977c;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(Iterator<? extends T> it, id.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.f1975a = lVar;
        this.f1977c = it;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void a(T t10) {
        Iterator<T> itInvoke = this.f1975a.invoke(t10);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.f1976b.add((Iterator<T>) this.f1977c);
            this.f1977c = itInvoke;
        } else {
            while (!this.f1977c.hasNext() && (!this.f1976b.isEmpty())) {
                this.f1977c = (Iterator) kotlin.collections.b0.X(this.f1976b);
                kotlin.collections.y.C(this.f1976b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1977c.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.f1977c.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
