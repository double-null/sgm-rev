package o1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import n1.j;

/* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f23004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23005b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f23006c = new a();

    /* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.c(runnable);
        }
    }

    public b(Executor executor) {
        this.f23004a = new j(executor);
    }

    @Override // o1.a
    public Executor a() {
        return this.f23006c;
    }

    @Override // o1.a
    public void b(Runnable runnable) {
        this.f23004a.execute(runnable);
    }

    public void c(Runnable runnable) {
        this.f23005b.post(runnable);
    }

    @Override // o1.a
    public j getBackgroundExecutor() {
        return this.f23004a;
    }
}
