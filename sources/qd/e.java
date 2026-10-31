package qd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<T> f24746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.l<T, Boolean> f24748c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<T> f24749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24750b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f24751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<T> f24752d;

        a(e<T> eVar) {
            this.f24752d = eVar;
            this.f24749a = ((e) eVar).f24746a.iterator();
        }

        private final void a() {
            while (this.f24749a.hasNext()) {
                T next = this.f24749a.next();
                if (((Boolean) ((e) this.f24752d).f24748c.invoke(next)).booleanValue() == ((e) this.f24752d).f24747b) {
                    this.f24751c = next;
                    this.f24750b = 1;
                    return;
                }
            }
            this.f24750b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24750b == -1) {
                a();
            }
            return this.f24750b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f24750b == -1) {
                a();
            }
            if (this.f24750b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f24751c;
            this.f24751c = null;
            this.f24750b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> sequence, boolean z10, id.l<? super T, Boolean> predicate) {
        t.f(sequence, "sequence");
        t.f(predicate, "predicate");
        this.f24746a = sequence;
        this.f24747b = z10;
        this.f24748c = predicate;
    }

    @Override // qd.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
