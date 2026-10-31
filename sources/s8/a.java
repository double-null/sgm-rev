package s8;

import java.util.concurrent.Executor;
import x7.l;

/* JADX INFO: compiled from: ReleasableExecutor.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends Executor {

    /* JADX INFO: renamed from: s8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReleasableExecutor.java */
    class C0412a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f25305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f25306b;

        C0412a(Executor executor, l lVar) {
            this.f25305a = executor;
            this.f25306b = lVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f25305a.execute(runnable);
        }

        @Override // s8.a
        public void release() {
            this.f25306b.accept(this.f25305a);
        }
    }

    static <T extends Executor> a H(T t10, l<T> lVar) {
        return new C0412a(t10, lVar);
    }

    void release();
}
