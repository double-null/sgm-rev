package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: CallbackToFutureAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<T> f1679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d<Void> f1680c = androidx.concurrent.futures.d.t();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1681d;

        a() {
        }

        private void e() {
            this.f1678a = null;
            this.f1679b = null;
            this.f1680c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            androidx.concurrent.futures.d<Void> dVar = this.f1680c;
            if (dVar != null) {
                dVar.addListener(runnable, executor);
            }
        }

        void b() {
            this.f1678a = null;
            this.f1679b = null;
            this.f1680c.p(null);
        }

        public boolean c(T t10) {
            this.f1681d = true;
            d<T> dVar = this.f1679b;
            boolean z10 = dVar != null && dVar.b(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f1681d = true;
            d<T> dVar = this.f1679b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th) {
            this.f1681d = true;
            d<T> dVar = this.f1679b;
            boolean z10 = dVar != null && dVar.c(th);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f1679b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1678a));
            }
            if (this.f1681d || (dVar = this.f1680c) == null) {
                return;
            }
            dVar.p(null);
        }
    }

    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    public interface InterfaceC0027c<T> {
        Object attachCompleter(a<T> aVar) throws Exception;
    }

    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    private static final class d<T> implements ListenableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f1682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f1683b = new a();

        /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String m() {
                a<T> aVar = d.this.f1682a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1678a + "]";
            }
        }

        d(a<T> aVar) {
            this.f1682a = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f1683b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f1683b.addListener(runnable, executor);
        }

        boolean b(T t10) {
            return this.f1683b.p(t10);
        }

        boolean c(Throwable th) {
            return this.f1683b.q(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f1682a.get();
            boolean zCancel = this.f1683b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f1683b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1683b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1683b.isDone();
        }

        public String toString() {
            return this.f1683b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f1683b.get(j10, timeUnit);
        }
    }

    public static <T> ListenableFuture<T> a(InterfaceC0027c<T> interfaceC0027c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f1679b = dVar;
        aVar.f1678a = interfaceC0027c.getClass();
        try {
            Object objAttachCompleter = interfaceC0027c.attachCompleter(aVar);
            if (objAttachCompleter != null) {
                aVar.f1678a = objAttachCompleter;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}
