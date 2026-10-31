package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ModernAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
abstract class c<Params, Progress, Result> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f2973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f2974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f2975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static f f2976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile Executor f2977j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<Params, Result> f2978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask<Result> f2979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile g f2980c = g.PENDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f2981d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f2982e = new AtomicBoolean();

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2983a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f2983a.getAndIncrement());
        }
    }

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    class b extends h<Params, Result> {
        b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            c.this.f2982e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.c(this.f2993a);
                Binder.flushPendingCommands();
                c.this.m(result);
                return result;
            } catch (Throwable th) {
                try {
                    c.this.f2981d.set(true);
                    throw th;
                } catch (Throwable th2) {
                    c.this.m(result);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    class C0057c extends FutureTask<Result> {
        C0057c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.n(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.n(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2986a;

        static {
            int[] iArr = new int[g.values().length];
            f2986a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2986a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    private static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f2987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Data[] f2988b;

        e(c cVar, Data... dataArr) {
            this.f2987a = cVar;
            this.f2988b = dataArr;
        }
    }

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f2987a.e(eVar.f2988b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f2987a.l(eVar.f2988b);
            }
        }
    }

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: compiled from: ModernAsyncTask.java */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Params[] f2993a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f2973f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f2974g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f2975h = threadPoolExecutor;
        f2977j = threadPoolExecutor;
    }

    c() {
        b bVar = new b();
        this.f2978a = bVar;
        this.f2979b = new C0057c(bVar);
    }

    private static Handler f() {
        f fVar;
        synchronized (c.class) {
            if (f2976i == null) {
                f2976i = new f();
            }
            fVar = f2976i;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f2981d.set(true);
        return this.f2979b.cancel(z10);
    }

    protected abstract Result c(Params... paramsArr);

    public final c<Params, Progress, Result> d(Executor executor, Params... paramsArr) {
        if (this.f2980c == g.PENDING) {
            this.f2980c = g.RUNNING;
            k();
            this.f2978a.f2993a = paramsArr;
            executor.execute(this.f2979b);
            return this;
        }
        int i10 = d.f2986a[this.f2980c.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void e(Result result) {
        if (g()) {
            i(result);
        } else {
            j(result);
        }
        this.f2980c = g.FINISHED;
    }

    public final boolean g() {
        return this.f2981d.get();
    }

    protected void i(Result result) {
        h();
    }

    Result m(Result result) {
        f().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void n(Result result) {
        if (this.f2982e.get()) {
            return;
        }
        m(result);
    }

    protected void h() {
    }

    protected void k() {
    }

    protected void j(Result result) {
    }

    protected void l(Progress... progressArr) {
    }
}
