package kotlinx.coroutines.internal;

import zc.j;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j f21542a;

    public DiagnosticCoroutineContextException(j jVar) {
        this.f21542a = jVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f21542a.toString();
    }
}
