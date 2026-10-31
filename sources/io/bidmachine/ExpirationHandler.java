package io.bidmachine;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;
    private final c expiredTask;
    private final AtomicBoolean isExpireTrackerSubscribed;
    private final TaskScheduler taskScheduler;

    public interface Listener {
        void onExpired();
    }

    public interface TaskScheduler {
        void cancelTask(sc.b bVar);

        void scheduleTask(sc.b bVar, long j10);
    }

    private static class b implements TaskScheduler {
        private b() {
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void cancelTask(sc.b bVar) {
            bVar.d(true);
            io.bidmachine.core.h.f(bVar);
        }

        @Override // io.bidmachine.ExpirationHandler.TaskScheduler
        public void scheduleTask(sc.b bVar, long j10) {
            bVar.d(false);
            io.bidmachine.core.h.R(bVar, j10);
        }
    }

    private static class c extends sc.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<Listener> f16463b;

        public c(Listener listener) {
            this.f16463b = new WeakReference<>(listener);
        }

        @Override // sc.b
        public void c() {
            Listener listener = this.f16463b.get();
            if (listener != null) {
                listener.onExpired();
            }
        }
    }

    public ExpirationHandler(long j10, Listener listener) {
        this(j10, listener, new b());
    }

    TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs <= 0 || !this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            return;
        }
        this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }

    public ExpirationHandler(long j10, Listener listener, TaskScheduler taskScheduler) {
        this.expiredTask = new c(listener);
        this.expirationTimeMs = j10;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }
}
