package com.google.common.util.concurrent;

import b2.Bo.yeILL;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: AbstractFuture.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<V> extends com.google.common.util.concurrent.internal.a implements ListenableFuture<V> {
    private static final AbstractC0148b ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final c0 log;
    private volatile e listeners;
    private volatile Object value;
    private volatile l waiters;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractFuture.java */
    private static abstract class AbstractC0148b {
        private AbstractC0148b() {
        }

        abstract boolean a(b<?> bVar, e eVar, e eVar2);

        abstract boolean b(b<?> bVar, Object obj, Object obj2);

        abstract boolean c(b<?> bVar, l lVar, l lVar2);

        abstract e d(b<?> bVar, e eVar);

        abstract l e(b<?> bVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f11778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f11779d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f11780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f11781b;

        static {
            if (b.GENERATE_CANCELLATION_CAUSES) {
                f11779d = null;
                f11778c = null;
            } else {
                f11779d = new c(false, null);
                f11778c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f11780a = z10;
            this.f11781b = th;
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f11782b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f11783a;

        /* JADX INFO: compiled from: AbstractFuture.java */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f11783a = (Throwable) com.google.common.base.p.l(th);
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class f extends AbstractC0148b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f11788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f11789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super b<?>, l> f11790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super b<?>, e> f11791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super b<?>, Object> f11792e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super b<?>, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super b<?>, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super b<?>, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f11788a = atomicReferenceFieldUpdater;
            this.f11789b = atomicReferenceFieldUpdater2;
            this.f11790c = atomicReferenceFieldUpdater3;
            this.f11791d = atomicReferenceFieldUpdater4;
            this.f11792e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean a(b<?> bVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f11791d, bVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f11792e, bVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean c(b<?> bVar, l lVar, l lVar2) {
            return androidx.concurrent.futures.b.a(this.f11790c, bVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        e d(b<?> bVar, e eVar) {
            return this.f11791d.getAndSet(bVar, eVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        l e(b<?> bVar, l lVar) {
            return this.f11790c.getAndSet(bVar, lVar);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        void f(l lVar, l lVar2) {
            this.f11789b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        void g(l lVar, Thread thread) {
            this.f11788a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<V> f11793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ListenableFuture<? extends V> f11794b;

        g(b<V> bVar, ListenableFuture<? extends V> listenableFuture) {
            this.f11793a = bVar;
            this.f11794b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((b) this.f11793a).value != this) {
                return;
            }
            if (b.ATOMIC_HELPER.b(this.f11793a, this, b.getFutureValue(this.f11794b))) {
                b.complete(this.f11793a, false);
            }
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class h extends AbstractC0148b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean a(b<?> bVar, e eVar, e eVar2) {
            synchronized (bVar) {
                if (((b) bVar).listeners != eVar) {
                    return false;
                }
                ((b) bVar).listeners = eVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (((b) bVar).value != obj) {
                    return false;
                }
                ((b) bVar).value = obj2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean c(b<?> bVar, l lVar, l lVar2) {
            synchronized (bVar) {
                if (((b) bVar).waiters != lVar) {
                    return false;
                }
                ((b) bVar).waiters = lVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        e d(b<?> bVar, e eVar) {
            e eVar2;
            synchronized (bVar) {
                eVar2 = ((b) bVar).listeners;
                if (eVar2 != eVar) {
                    ((b) bVar).listeners = eVar;
                }
            }
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        l e(b<?> bVar, l lVar) {
            l lVar2;
            synchronized (bVar) {
                lVar2 = ((b) bVar).waiters;
                if (lVar2 != lVar) {
                    ((b) bVar).waiters = lVar;
                }
            }
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        void f(l lVar, l lVar2) {
            lVar.f11803b = lVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        void g(l lVar, Thread thread) {
            lVar.f11802a = thread;
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    interface i<V> extends ListenableFuture<V> {
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    static abstract class j<V> extends b<V> implements i<V> {
        j() {
        }

        @Override // com.google.common.util.concurrent.b, com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.b, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class k extends AbstractC0148b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f11795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f11796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f11797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f11798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f11799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f11800f;

        /* JADX INFO: compiled from: AbstractFuture.java */
        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f11797c = unsafe.objectFieldOffset(b.class.getDeclaredField("waiters"));
                f11796b = unsafe.objectFieldOffset(b.class.getDeclaredField("listeners"));
                f11798d = unsafe.objectFieldOffset(b.class.getDeclaredField("value"));
                f11799e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f11800f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f11795a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean a(b<?> bVar, e eVar, e eVar2) {
            return com.google.android.gms.internal.ads.d0.a(f11795a, bVar, f11796b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean b(b<?> bVar, Object obj, Object obj2) {
            return com.google.android.gms.internal.ads.d0.a(f11795a, bVar, f11798d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        boolean c(b<?> bVar, l lVar, l lVar2) {
            return com.google.android.gms.internal.ads.d0.a(f11795a, bVar, f11797c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        e d(b<?> bVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((b) bVar).listeners;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(bVar, eVar2, eVar));
            return eVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        l e(b<?> bVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((b) bVar).waiters;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(bVar, lVar2, lVar));
            return lVar2;
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        void f(l lVar, l lVar2) {
            f11795a.putObject(lVar, f11800f, lVar2);
        }

        @Override // com.google.common.util.concurrent.b.AbstractC0148b
        void g(l lVar, Thread thread) {
            f11795a.putObject(lVar, f11799e, thread);
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final l f11801c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f11802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile l f11803b;

        l() {
            b.ATOMIC_HELPER.g(this, Thread.currentThread());
        }

        l(boolean z10) {
        }

        void a(l lVar) {
            b.ATOMIC_HELPER.f(this, lVar);
        }

        void b() {
            Thread thread = this.f11802a;
            if (thread != null) {
                this.f11802a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.b$a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    static {
        boolean z10;
        AbstractC0148b hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        GENERATE_CANCELLATION_CAUSES = z10;
        log = new c0(b.class);
        ?? r10 = 0;
        r10 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | Exception e10) {
            e = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, l.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(b.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "value"));
            } catch (Error | Exception e11) {
                hVar = new h();
                r10 = e11;
            }
        }
        ATOMIC_HELPER = hVar;
        if (r10 != 0) {
            c0 c0Var = log;
            Logger loggerA = c0Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", e);
            c0Var.a().log(level, "SafeAtomicHelper is broken!", r10);
        }
        NULL = new Object();
    }

    protected b() {
    }

    private void addDoneString(StringBuilder sb2) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb2.append("SUCCESS, result=[");
            appendResultObject(sb2, uninterruptibly);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private void addPendingString(StringBuilder sb2) {
        String strA;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.value;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            appendUserObject(sb2, ((g) obj).f11794b);
            sb2.append("]");
        } else {
            try {
                strA = com.google.common.base.v.a(pendingToString());
            } catch (Exception | StackOverflowError e10) {
                strA = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strA != null) {
                sb2.append(", info=[");
                sb2.append(strA);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            addDoneString(sb2);
        }
    }

    private void appendResultObject(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void appendUserObject(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e clearListeners(e eVar) {
        e eVar2 = eVar;
        e eVarD = ATOMIC_HELPER.d(this, e.f11784d);
        while (eVarD != null) {
            e eVar3 = eVarD.f11787c;
            eVarD.f11787c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void complete(b<?> bVar, boolean z10) {
        e eVar = null;
        while (true) {
            bVar.releaseWaiters();
            if (z10) {
                bVar.interruptTask();
                z10 = false;
            }
            bVar.afterDone();
            e eVarClearListeners = bVar.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f11787c;
                Runnable runnable = eVarClearListeners.f11785a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    bVar = gVar.f11793a;
                    if (((b) bVar).value == gVar) {
                        if (ATOMIC_HELPER.b(bVar, gVar, getFutureValue(gVar.f11794b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarClearListeners.f11786b;
                    Objects.requireNonNull(executor);
                    executeListener(runnable2, executor);
                }
                eVarClearListeners = eVar;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f11781b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f11783a);
        }
        return obj == NULL ? (V) h0.b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        Throwable thA;
        if (listenableFuture instanceof i) {
            Object cVar = ((b) listenableFuture).value;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f11780a) {
                    cVar = cVar2.f11781b != null ? new c(false, cVar2.f11781b) : c.f11779d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((listenableFuture instanceof com.google.common.util.concurrent.internal.a) && (thA = com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) listenableFuture)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            c cVar3 = c.f11779d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            if (!zIsCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
        } catch (Error e10) {
            e = e10;
            return new d(e);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e12));
        } catch (Exception e13) {
            e = e13;
            return new d(e);
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void releaseWaiters() {
        for (l lVarE = ATOMIC_HELPER.e(this, l.f11801c); lVarE != null; lVarE = lVarE.f11803b) {
            lVarE.b();
        }
    }

    private void removeWaiter(l lVar) {
        lVar.f11802a = null;
        while (true) {
            l lVar2 = this.waiters;
            if (lVar2 == l.f11801c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f11803b;
                if (lVar2.f11802a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f11803b = lVar4;
                    if (lVar3.f11802a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, lVar2, lVar4)) {
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        com.google.common.base.p.m(runnable, "Runnable was null.");
        com.google.common.base.p.m(executor, "Executor was null.");
        if (!isDone() && (eVar = this.listeners) != e.f11784d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f11787c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f11784d);
        }
        executeListener(runnable, executor);
    }

    protected void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f11778c : c.f11779d;
            Objects.requireNonNull(cVar);
        }
        b<V> bVar = this;
        boolean z11 = false;
        while (true) {
            if (ATOMIC_HELPER.b(bVar, obj, cVar)) {
                complete(bVar, z10);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f11794b;
                if (!(listenableFuture instanceof i)) {
                    listenableFuture.cancel(z10);
                    return true;
                }
                bVar = (b) listenableFuture;
                obj = bVar.value;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = bVar.value;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            l lVar = this.waiters;
            if (lVar != l.f11801c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (ATOMIC_HELPER.c(this, lVar, lVar2)) {
                        do {
                            i0.a(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        removeWaiter(lVar2);
                        break;
                    }
                    lVar = this.waiters;
                    if (lVar == l.f11801c) {
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return getDoneValue(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > SPIN_THRESHOLD_NANOS;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    protected void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof g)) & (obj != null);
    }

    final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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
    protected boolean set(V v10) {
        if (v10 == null) {
            v10 = (V) NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, v10)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) com.google.common.base.p.l(th)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        com.google.common.base.p.l(listenableFuture);
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.b(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, n.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Error | Exception unused) {
                        dVar = d.f11782b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f11780a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb2);
        } else {
            addPendingString(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.common.util.concurrent.internal.a
    protected final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof d) {
            return ((d) obj).f11783a;
        }
        return null;
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f11780a;
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f11784d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f11785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f11786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f11787c;

        e(Runnable runnable, Executor executor) {
            this.f11785a = runnable;
            this.f11786b = executor;
        }

        e() {
            this.f11785a = null;
            this.f11786b = null;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + yeILL.CslzffgKgOBPpm + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            l lVar = this.waiters;
            if (lVar != l.f11801c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (ATOMIC_HELPER.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    lVar = this.waiters;
                } while (lVar != l.f11801c);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        throw new InterruptedException();
    }
}
