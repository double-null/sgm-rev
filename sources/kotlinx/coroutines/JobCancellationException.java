package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import ud.b2;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient b2 f21539a;

    public JobCancellationException(String str, Throwable th, b2 b2Var) {
        super(str);
        this.f21539a = b2Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!t.a(jobCancellationException.getMessage(), getMessage()) || !t.a(jobCancellationException.f21539a, this.f21539a) || !t.a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        t.c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f21539a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f21539a;
    }
}
