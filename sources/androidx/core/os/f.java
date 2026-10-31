package androidx.core.os;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
final class f<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.f<R> f1885a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(zc.f<? super R> fVar) {
        super(false);
        this.f1885a = fVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e10) {
        if (compareAndSet(false, true)) {
            zc.f<R> fVar = this.f1885a;
            r.a aVar = r.f27774b;
            fVar.resumeWith(r.c(s.a(e10)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.f1885a.resumeWith(r.c(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
