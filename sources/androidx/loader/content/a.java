package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import w.j;

/* JADX INFO: compiled from: AsyncTaskLoader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends b<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0055a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0055a mTask;
    long mUpdateThrottle;

    /* JADX INFO: renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTaskLoader.java */
    final class RunnableC0055a extends c<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final CountDownLatch f2970k = new CountDownLatch(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f2971l;

        RunnableC0055a() {
        }

        @Override // androidx.loader.content.c
        protected void i(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f2970k.countDown();
            }
        }

        @Override // androidx.loader.content.c
        protected void j(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f2970k.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.c
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public D c(Void... voidArr) {
            try {
                return (D) a.this.onLoadInBackground();
            } catch (OperationCanceledException e10) {
                if (g()) {
                    return null;
                }
                throw e10;
            }
        }

        public void q() {
            try {
                this.f2970k.await();
            } catch (InterruptedException unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2971l = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, c.f2975h);
    }

    void dispatchOnCancelled(a<D>.RunnableC0055a runnableC0055a, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == runnableC0055a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(a<D>.RunnableC0055a runnableC0055a, D d10) {
        if (this.mTask != runnableC0055a) {
            dispatchOnCancelled(runnableC0055a, d10);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d10);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d10);
    }

    @Override // androidx.loader.content.b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f2971l);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f2971l);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            j.c(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            j.b(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f2971l) {
            this.mTask.f2971l = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.d(this.mExecutor, null);
        } else {
            this.mTask.f2971l = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.b
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f2971l) {
                this.mTask.f2971l = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f2971l) {
            this.mTask.f2971l = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zA = this.mTask.a(false);
        if (zA) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zA;
    }

    @Override // androidx.loader.content.b
    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0055a();
        executePendingTask();
    }

    protected D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.RunnableC0055a runnableC0055a = this.mTask;
        if (runnableC0055a != null) {
            runnableC0055a.q();
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(D d10) {
    }
}
