package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.t;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements zc.f<Object>, e, Serializable {
    private final zc.f<Object> completion;

    public a(zc.f<Object> fVar) {
        this.completion = fVar;
    }

    public zc.f<g0> create(zc.f<?> completion) {
        t.f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        zc.f<Object> fVar = this.completion;
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    public final zc.f<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    @Override // zc.f
    public final void resumeWith(Object obj) {
        zc.f<Object> fVar = this;
        while (true) {
            h.b(fVar);
            a aVar = (a) fVar;
            zc.f<Object> fVar2 = aVar.completion;
            t.c(fVar2);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == ad.d.f()) {
                    return;
                } else {
                    obj = r.c(objInvokeSuspend);
                }
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                obj = r.c(s.a(th));
            }
            aVar.releaseIntercepted();
            if (!(fVar2 instanceof a)) {
                fVar2.resumeWith(obj);
                return;
            }
            fVar = fVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public zc.f<g0> create(Object obj, zc.f<?> completion) {
        t.f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
