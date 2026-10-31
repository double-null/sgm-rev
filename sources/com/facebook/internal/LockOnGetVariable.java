package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: LockOnGetVariable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LockOnGetVariable<T> {
    private CountDownLatch initLatch;
    private T storedValue;

    public LockOnGetVariable(T t10) {
        this.storedValue = t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void _init_$lambda$0(LockOnGetVariable this$0, Callable callable) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(callable, "$callable");
        try {
            this$0.storedValue = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void waitOnInit() {
        CountDownLatch countDownLatch = this.initLatch;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public final T getValue() {
        waitOnInit();
        return this.storedValue;
    }

    public LockOnGetVariable(final Callable<T> callable) {
        kotlin.jvm.internal.t.f(callable, "callable");
        this.initLatch = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LockOnGetVariable._init_$lambda$0(this.f11107a, callable);
            }
        }));
    }
}
