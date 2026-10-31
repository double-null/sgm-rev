package qd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes5.dex */
final class f<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a<T> f24753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.l<T, T> f24754b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, jd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f24755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24756b = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f<T> f24757c;

        a(f<T> fVar) {
            this.f24757c = fVar;
        }

        private final void a() {
            T t10;
            if (this.f24756b == -2) {
                t10 = (T) ((f) this.f24757c).f24753a.invoke();
            } else {
                id.l lVar = ((f) this.f24757c).f24754b;
                T t11 = this.f24755a;
                t.c(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f24755a = t10;
            this.f24756b = t10 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24756b < 0) {
                a();
            }
            return this.f24756b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f24756b < 0) {
                a();
            }
            if (this.f24756b == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f24755a;
            t.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f24756b = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(id.a<? extends T> getInitialValue, id.l<? super T, ? extends T> getNextValue) {
        t.f(getInitialValue, "getInitialValue");
        t.f(getNextValue, "getNextValue");
        this.f24753a = getInitialValue;
        this.f24754b = getNextValue;
    }

    @Override // qd.g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
