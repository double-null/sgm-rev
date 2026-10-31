package qd;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements g<T>, c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f24741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24742b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f24743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24744b;

        a(b<T> bVar) {
            this.f24743a = ((b) bVar).f24741a.iterator();
            this.f24744b = ((b) bVar).f24742b;
        }

        private final void a() {
            while (this.f24744b > 0 && this.f24743a.hasNext()) {
                this.f24743a.next();
                this.f24744b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f24743a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f24743a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> sequence, int i10) {
        t.f(sequence, "sequence");
        this.f24741a = sequence;
        this.f24742b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // qd.c
    public g<T> a(int i10) {
        int i11 = this.f24742b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f24741a, i11);
    }

    @Override // qd.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
