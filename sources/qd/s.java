package qd;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s<T, R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f24767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.l<T, R> f24768b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f24769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s<T, R> f24770b;

        a(s<T, R> sVar) {
            this.f24770b = sVar;
            this.f24769a = ((s) sVar).f24767a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24769a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((s) this.f24770b).f24768b.invoke(this.f24769a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(g<? extends T> sequence, id.l<? super T, ? extends R> transformer) {
        t.f(sequence, "sequence");
        t.f(transformer, "transformer");
        this.f24767a = sequence;
        this.f24768b = transformer;
    }

    @Override // qd.g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
