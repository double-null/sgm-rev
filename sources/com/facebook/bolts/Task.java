package com.facebook.bolts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;
import sc.NfwM.XDucgbzInpQa;
import wc.g0;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    public static final Companion Companion = new Companion(null);
    private static final Executor IMMEDIATE_EXECUTOR;
    private static final Task<?> TASK_CANCELLED;
    private static final Task<Boolean> TASK_FALSE;
    private static final Task<?> TASK_NULL;
    private static final Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final Condition condition;
    private List<Continuation<TResult, Void>> continuations;
    private Exception errorField;
    private boolean errorHasBeenObserved;
    private final ReentrantLock lock;
    private TResult resultField;
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* JADX INFO: compiled from: Task.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void call$lambda$2(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Callable callable) {
            t.f(tcs, "$tcs");
            t.f(callable, "$callable");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(callable.call());
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e10) {
                tcs.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeAfterTask(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.completeAfterTask$lambda$7(cancellationToken, taskCompletionSource, continuation, task);
                    }
                });
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void completeAfterTask$lambda$7(final CancellationToken cancellationToken, final com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Task task) {
            t.f(tcs, "$tcs");
            t.f(continuation, "$continuation");
            t.f(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 == null || task2.continueWith(new Continuation() { // from class: com.facebook.bolts.k
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task3) {
                        return Task.Companion.completeAfterTask$lambda$7$lambda$6(cancellationToken, tcs, task3);
                    }
                }) == null) {
                    tcs.setResult(null);
                    g0 g0Var = g0.f27756a;
                }
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e10) {
                tcs.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Void completeAfterTask$lambda$7$lambda$6(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Task task) {
            t.f(tcs, "$tcs");
            t.f(task, "task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return null;
            }
            if (task.isCancelled()) {
                tcs.setCancelled();
            } else if (task.isFaulted()) {
                tcs.setError(task.getError());
            } else {
                tcs.setResult(task.getResult());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void completeImmediately(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.completeImmediately$lambda$5(cancellationToken, taskCompletionSource, continuation, task);
                    }
                });
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void completeImmediately$lambda$5(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Task task) {
            t.f(tcs, "$tcs");
            t.f(continuation, "$continuation");
            t.f(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e10) {
                tcs.setError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void delay$lambda$0(com.facebook.bolts.TaskCompletionSource tcs) {
            t.f(tcs, "$tcs");
            tcs.trySetResult(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void delay$lambda$1(ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource tcs) {
            t.f(tcs, "$tcs");
            scheduledFuture.cancel(true);
            tcs.trySetCancelled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void whenAny$lambda$4(AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, Task it) {
            t.f(isAnyTaskComplete, "$isAnyTaskComplete");
            t.f(firstCompleted, "$firstCompleted");
            t.f(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void whenAnyResult$lambda$3(AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, Task it) {
            t.f(isAnyTaskComplete, "$isAnyTaskComplete");
            t.f(firstCompleted, "$firstCompleted");
            t.f(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
            t.f(callable, "callable");
            t.f(executor, "executor");
            return call(callable, executor, null);
        }

        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
            t.f(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, null);
        }

        public final <TResult> Task<TResult> cancelled() {
            Task<TResult> task = Task.TASK_CANCELLED;
            t.d(task, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult of com.facebook.bolts.Task.Companion.cancelled>");
            return task;
        }

        public final Task<Void> delay(long j10) {
            return delay$facebook_bolts_release(j10, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), null);
        }

        public final Task<Void> delay$facebook_bolts_release(long j10, ScheduledExecutorService executor, CancellationToken cancellationToken) {
            t.f(executor, "executor");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (j10 <= 0) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final ScheduledFuture<?> scheduledFutureSchedule = executor.schedule(new Runnable() { // from class: com.facebook.bolts.l
                @Override // java.lang.Runnable
                public final void run() {
                    Task.Companion.delay$lambda$0(taskCompletionSource);
                }
            }, j10, TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new Runnable() { // from class: com.facebook.bolts.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.delay$lambda$1(scheduledFutureSchedule, taskCompletionSource);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> forError(Exception exc) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(exc);
            return taskCompletionSource.getTask();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <TResult> Task<TResult> forResult(TResult tresult) {
            if (tresult == 0) {
                Task<TResult> task = Task.TASK_NULL;
                t.d(task, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult of com.facebook.bolts.Task.Companion.forResult>");
                return task;
            }
            if (tresult instanceof Boolean) {
                Task<TResult> task2 = ((Boolean) tresult).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
                t.d(task2, "null cannot be cast to non-null type com.facebook.bolts.Task<TResult of com.facebook.bolts.Task.Companion.forResult>");
                return task2;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(tresult);
            return taskCompletionSource.getTask();
        }

        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.unobservedExceptionHandler;
        }

        public final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler) {
            Task.unobservedExceptionHandler = unobservedExceptionHandler;
        }

        public final Task<Void> whenAll(Collection<? extends Task<?>> tasks) {
            t.f(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final ArrayList arrayList = new ArrayList();
            final ReentrantLock reentrantLock = new ReentrantLock();
            final AtomicInteger atomicInteger = new AtomicInteger(tasks.size());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                t.d(task, "null cannot be cast to non-null type com.facebook.bolts.Task<kotlin.Any>");
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.Task$Companion$whenAll$1
                    @Override // com.facebook.bolts.Continuation
                    public /* bridge */ /* synthetic */ Object then(Task task2) {
                        return then((Task<Object>) task2);
                    }

                    @Override // com.facebook.bolts.Continuation
                    public final Void then(Task<Object> it) {
                        t.f(it, "it");
                        if (it.isFaulted()) {
                            ReentrantLock reentrantLock2 = reentrantLock;
                            ArrayList<Exception> arrayList2 = arrayList;
                            reentrantLock2.lock();
                            try {
                                arrayList2.add(it.getError());
                                reentrantLock2.unlock();
                            } catch (Throwable th) {
                                reentrantLock2.unlock();
                                throw th;
                            }
                        }
                        if (it.isCancelled()) {
                            atomicBoolean.set(true);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (arrayList.size() != 0) {
                                if (arrayList.size() == 1) {
                                    taskCompletionSource.setError(arrayList.get(0));
                                } else {
                                    l0 l0Var = l0.f21527a;
                                    String str = String.format(XDucgbzInpQa.xUfZUQjUmtoCSC, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size())}, 1));
                                    t.e(str, "format(format, *args)");
                                    taskCompletionSource.setError(new AggregateException(str, arrayList));
                                }
                            } else if (atomicBoolean.get()) {
                                taskCompletionSource.setCancelled();
                            } else {
                                taskCompletionSource.setResult(null);
                            }
                        }
                        return null;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<List<TResult>> whenAllResult(final Collection<Task<TResult>> tasks) {
            t.f(tasks, "tasks");
            return (Task<List<TResult>>) whenAll(tasks).onSuccess(new Continuation<Void, List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                public List<TResult> then(Task<Void> task) {
                    t.f(task, "task");
                    if (tasks.isEmpty()) {
                        return kotlin.collections.t.k();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<Task<TResult>> it = tasks.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getResult());
                    }
                    return arrayList;
                }
            });
        }

        public final Task<Task<?>> whenAny(Collection<? extends Task<?>> tasks) {
            t.f(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                t.d(task, "null cannot be cast to non-null type com.facebook.bolts.Task<kotlin.Any>");
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.n
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task2) {
                        return Task.Companion.whenAny$lambda$4(atomicBoolean, taskCompletionSource, task2);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> tasks) {
            t.f(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<Task<TResult>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().continueWith(new Continuation() { // from class: com.facebook.bolts.g
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        return Task.Companion.whenAnyResult$lambda$3(atomicBoolean, taskCompletionSource, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> call(final Callable<TResult> callable, Executor executor, final CancellationToken cancellationToken) {
            t.f(callable, "callable");
            t.f(executor, "executor");
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.call$lambda$2(cancellationToken, taskCompletionSource, callable);
                    }
                });
            } catch (Exception e10) {
                taskCompletionSource.setError(new ExecutorException(e10));
            }
            return taskCompletionSource.getTask();
        }

        public final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
            t.f(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, cancellationToken);
        }

        public final Task<Void> delay(long j10, CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(j10, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), cancellationToken);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable) {
            t.f(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, null);
        }

        public final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
            t.f(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, cancellationToken);
        }
    }

    /* JADX INFO: compiled from: Task.kt */
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        public TaskCompletionSource() {
        }
    }

    /* JADX INFO: compiled from: Task.kt */
    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.Companion;
        BACKGROUND_EXECUTOR = companion.background();
        IMMEDIATE_EXECUTOR = companion.immediate$facebook_bolts_release();
        UI_THREAD_EXECUTOR = AndroidExecutors.Companion.uiThread();
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable) {
        return Companion.call(callable);
    }

    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return Companion.callInBackground(callable);
    }

    public static final <TResult> Task<TResult> cancelled() {
        return Companion.cancelled();
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i10 & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void continueWith$lambda$10$lambda$9(com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        t.f(tcs, "$tcs");
        t.f(continuation, "$continuation");
        t.f(executor, "$executor");
        t.f(task, "task");
        Companion.completeImmediately(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void continueWithTask$lambda$12$lambda$11(com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        t.f(tcs, "$tcs");
        t.f(continuation, "$continuation");
        t.f(executor, "$executor");
        t.f(task, "task");
        Companion.completeAfterTask(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    public static final Task<Void> delay(long j10) {
        return Companion.delay(j10);
    }

    public static final <TResult> Task<TResult> forError(Exception exc) {
        return Companion.forError(exc);
    }

    public static final <TResult> Task<TResult> forResult(TResult tresult) {
        return Companion.forResult(tresult);
    }

    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return Companion.getUnobservedExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task makeVoid$lambda$8(Task task) {
        t.f(task, "task");
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.isFaulted() ? Companion.forError(task.getError()) : Companion.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccess$lambda$13(CancellationToken cancellationToken, Continuation continuation, Task task) {
        t.f(continuation, "$continuation");
        t.f(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        return task.isCancelled() ? Companion.cancelled() : task.continueWith(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task onSuccessTask$lambda$14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        t.f(continuation, "$continuation");
        t.f(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        return task.isCancelled() ? Companion.cancelled() : task.continueWithTask(continuation);
    }

    private final void runContinuations() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((Continuation) it.next()).then(this);
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler2) {
        Companion.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    public static final Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        return Companion.whenAll(collection);
    }

    public static final <TResult> Task<List<TResult>> whenAllResult(Collection<Task<TResult>> collection) {
        return Companion.whenAllResult(collection);
    }

    public static final Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        return Companion.whenAny(collection);
    }

    public static final <TResult> Task<Task<TResult>> whenAnyResult(Collection<Task<TResult>> collection) {
        return Companion.whenAnyResult(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <TOut> Task<TOut> cast() {
        t.d(this, "null cannot be cast to non-null type com.facebook.bolts.Task<TOut of com.facebook.bolts.Task.cast>");
        return this;
    }

    public final Task<Void> continueWhile(Callable<Boolean> predicate, Continuation<Void, Task<Void>> continuation) {
        t.f(predicate, "predicate");
        t.f(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return continueWith(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return continueWithTask(continuation, executor, null);
    }

    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.errorField != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Task<Void> makeVoid() {
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.e
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                return Task.makeVoid$lambda$8(task);
            }
        });
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor) {
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return onSuccess(continuation, executor, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor) {
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return onSuccessTask(continuation, executor, null);
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(Exception exc) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = exc;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(TResult tresult) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.resultField = tresult;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            g0 g0Var = g0.f27756a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.call(callable, cancellationToken);
    }

    public static final <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
        return Companion.callInBackground(callable, cancellationToken);
    }

    public static final Task<Void> delay(long j10, CancellationToken cancellationToken) {
        return Companion.delay(j10, cancellationToken);
    }

    public final Task<Void> continueWhile(Callable<Boolean> predicate, Continuation<Void, Task<Void>> continuation, CancellationToken cancellationToken) {
        t.f(predicate, "predicate");
        t.f(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(final Continuation<TResult, TContinuationResult> continuation, final Executor executor, final CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsCompleted = isCompleted();
            if (!zIsCompleted && (list = this.continuations) != null) {
                list.add(new Continuation() { // from class: com.facebook.bolts.c
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        return Task.continueWith$lambda$10$lambda$9(taskCompletionSource, continuation, executor, cancellationToken, task);
                    }
                });
            }
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
            if (zIsCompleted) {
                Companion.completeImmediately(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(final Continuation<TResult, Task<TContinuationResult>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsCompleted = isCompleted();
            if (!zIsCompleted && (list = this.continuations) != null) {
                list.add(new Continuation() { // from class: com.facebook.bolts.d
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        return Task.continueWithTask$lambda$12$lambda$11(taskCompletionSource, continuation, executor, cancellationToken, task);
                    }
                });
            }
            g0 g0Var = g0.f27756a;
            reentrantLock.unlock();
            if (zIsCompleted) {
                Companion.completeAfterTask(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(final Continuation<TResult, TContinuationResult> continuation, Executor executor, final CancellationToken cancellationToken) {
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.b
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                return Task.onSuccess$lambda$13(cancellationToken, continuation, task);
            }
        }, executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(final Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, final CancellationToken cancellationToken) {
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.f
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                return Task.onSuccessTask$lambda$14(cancellationToken, continuation, task);
            }
        }, executor);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return Companion.call(callable, executor);
    }

    public final Task<Void> continueWhile(final Callable<Boolean> predicate, final Continuation<Void, Task<Void>> continuation, final Executor executor, final CancellationToken cancellationToken) {
        t.f(predicate, "predicate");
        t.f(continuation, "continuation");
        t.f(executor, "executor");
        return makeVoid().continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.facebook.bolts.Continuation
            public Task<Void> then(Task<Void> task) throws Exception {
                t.f(task, "task");
                CancellationToken cancellationToken2 = cancellationToken;
                if (cancellationToken2 != null && cancellationToken2.isCancellationRequested()) {
                    return Task.Companion.cancelled();
                }
                Boolean boolCall = predicate.call();
                t.e(boolCall, "predicate.call()");
                return boolCall.booleanValue() ? Task.Companion.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor) : Task.Companion.forResult(null);
            }
        }, executor);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation) {
        t.f(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        t.f(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    public static final <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
        return Companion.call(callable, executor, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        t.f(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        t.f(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        trySetResult(tresult);
    }

    public final boolean waitForCompletion(long j10, TimeUnit timeUnit) throws InterruptedException {
        t.f(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(j10, timeUnit);
            }
            return isCompleted();
        } finally {
            reentrantLock.unlock();
        }
    }

    private Task(boolean z10) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z10) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        t.f(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        t.f(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken) {
        t.f(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken) {
        t.f(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }
}
