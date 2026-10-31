package qd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<g<T>> f24740a;

    public a(g<? extends T> sequence) {
        t.f(sequence, "sequence");
        this.f24740a = new AtomicReference<>(sequence);
    }

    @Override // qd.g
    public Iterator<T> iterator() {
        g<T> andSet = this.f24740a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
