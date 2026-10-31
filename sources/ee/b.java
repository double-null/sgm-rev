package ee;

import ad.c;
import ad.d;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import id.l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import ud.n;
import ud.p;
import wc.g0;
import wc.r;
import wc.s;
import zc.f;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: compiled from: Tasks.kt */
    static final class a<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f14529a;

        /* JADX WARN: Multi-variable type inference failed */
        a(n<? super T> nVar) {
            this.f14529a = nVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                f fVar = this.f14529a;
                r.a aVar = r.f27774b;
                fVar.resumeWith(r.c(s.a(exception)));
            } else {
                if (task.isCanceled()) {
                    n.a.a(this.f14529a, null, 1, null);
                    return;
                }
                f fVar2 = this.f14529a;
                r.a aVar2 = r.f27774b;
                fVar2.resumeWith(r.c(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: ee.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Tasks.kt */
    static final class C0219b implements l<Throwable, g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f14530a;

        C0219b(CancellationTokenSource cancellationTokenSource) {
            this.f14530a = cancellationTokenSource;
        }

        public final void a(Throwable th) {
            this.f14530a.cancel();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th) {
            a(th);
            return g0.f27756a;
        }
    }

    public static final <T> Object a(Task<T> task, f<? super T> fVar) {
        return b(task, null, fVar);
    }

    private static final <T> Object b(Task<T> task, CancellationTokenSource cancellationTokenSource, f<? super T> fVar) throws Exception {
        if (!task.isComplete()) {
            p pVar = new p(c.c(fVar), 1);
            pVar.G();
            task.addOnCompleteListener(ee.a.f14528a, new a(pVar));
            if (cancellationTokenSource != null) {
                pVar.H(new C0219b(cancellationTokenSource));
            }
            Object objZ = pVar.z();
            if (objZ == d.f()) {
                h.c(fVar);
            }
            return objZ;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
