package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: CrashlyticsWorker.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f12217b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task<?> f12218c = Tasks.forResult(null);

    a(ExecutorService executorService) {
        this.f12216a = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task d(Runnable runnable, Task task) throws Exception {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task e(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    public ExecutorService c() {
        return this.f12216a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12216a.execute(runnable);
    }

    public Task<Void> f(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f12217b) {
            taskContinueWithTask = this.f12218c.continueWithTask(this.f12216a, new Continuation() { // from class: c3.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.a.d(runnable, task);
                }
            });
            this.f12218c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public <T> Task<T> g(final Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.f12217b) {
            zzwVar = (Task<T>) this.f12218c.continueWithTask(this.f12216a, new Continuation() { // from class: c3.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return com.google.firebase.crashlytics.internal.concurrency.a.e(callable, task);
                }
            });
            this.f12218c = zzwVar;
        }
        return zzwVar;
    }
}
