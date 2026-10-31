package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f21541a;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f21541a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
