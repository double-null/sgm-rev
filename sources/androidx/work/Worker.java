package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    androidx.work.impl.utils.futures.c<ListenableWorker.a> mFuture;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.o(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.p(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.a> startWork() {
        this.mFuture = androidx.work.impl.utils.futures.c.s();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
