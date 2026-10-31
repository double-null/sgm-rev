package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
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

/* JADX INFO: compiled from: AbstractFuture.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f3774d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f3775e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f3776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f3777g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f3779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f3780c;

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f3781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f3782d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f3783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f3784b;

        static {
            if (a.f3774d) {
                f3782d = null;
                f3781c = null;
            } else {
                f3782d = new c(false, null);
                f3781c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f3783a = z10;
            this.f3784b = th;
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f3785b = new d(new C0077a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f3786a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractFuture.java */
        class C0077a extends Throwable {
            C0077a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f3786a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f3787d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f3788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f3789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f3790c;

        e(Runnable runnable, Executor executor) {
            this.f3788a = runnable;
            this.f3789b = executor;
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f3791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f3792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f3793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f3794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f3795e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f3791a = atomicReferenceFieldUpdater;
            this.f3792b = atomicReferenceFieldUpdater2;
            this.f3793c = atomicReferenceFieldUpdater3;
            this.f3794d = atomicReferenceFieldUpdater4;
            this.f3795e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f3794d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f3795e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f3793c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f3792b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f3791a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f3796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ListenableFuture<? extends V> f3797b;

        g(a<V> aVar, ListenableFuture<? extends V> listenableFuture) {
            this.f3796a = aVar;
            this.f3797b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3796a.f3778a != this) {
                return;
            }
            if (a.f3776f.b(this.f3796a, this, a.i(this.f3797b))) {
                a.f(this.f3796a);
            }
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f3779b != eVar) {
                    return false;
                }
                aVar.f3779b = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3778a != obj) {
                    return false;
                }
                aVar.f3778a = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f3780c != iVar) {
                    return false;
                }
                aVar.f3780c = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f3800b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f3799a = thread;
        }
    }

    /* JADX INFO: compiled from: AbstractFuture.java */
    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f3798c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f3799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f3800b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f3776f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f3799a;
            if (thread != null) {
                this.f3799a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f3776f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f3776f = hVar;
        if (th != null) {
            f3775e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3777g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(objJ));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3779b;
        } while (!f3776f.a(this, eVar2, e.f3787d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f3790c;
            eVar4.f3790c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
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
    static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.m();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f3790c;
                Runnable runnable = eVarE.f3788a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f3796a;
                    if (aVar.f3778a == gVar) {
                        if (f3776f.b(aVar, gVar, i(gVar.f3797b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f3789b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f3775e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f3784b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f3786a);
        }
        if (obj == f3777g) {
            return null;
        }
        return obj;
    }

    static Object i(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).f3778a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f3783a) {
                return cVar.f3784b != null ? new c(false, cVar.f3784b) : c.f3782d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f3774d) && zIsCancelled) {
            return c.f3782d;
        }
        try {
            Object objJ = j(listenableFuture);
            return objJ == null ? f3777g : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
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

    private void m() {
        i iVar;
        do {
            iVar = this.f3780c;
        } while (!f3776f.c(this, iVar, i.f3798c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f3800b;
        }
    }

    private void n(i iVar) {
        iVar.f3799a = null;
        while (true) {
            i iVar2 = this.f3780c;
            if (iVar2 == i.f3798c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f3800b;
                if (iVar2.f3799a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f3800b = iVar4;
                    if (iVar3.f3799a == null) {
                    }
                } else if (!f3776f.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f3779b;
        if (eVar != e.f3787d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3790c = eVar;
                if (f3776f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f3779b;
                }
            } while (eVar != e.f3787d);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f3778a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f3774d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f3781c : c.f3782d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f3776f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.k();
                }
                f(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f3797b;
                if (!(listenableFuture instanceof a)) {
                    listenableFuture.cancel(z10);
                    return true;
                }
                aVar = (a) listenableFuture;
                obj = aVar.f3778a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f3778a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3778a;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f3780c;
            if (iVar != i.f3798c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f3776f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3778a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        n(iVar2);
                        break;
                    }
                    iVar = this.f3780c;
                    if (iVar == i.f3798c) {
                    }
                }
            }
            return h(this.f3778a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3778a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
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
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3778a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f3778a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String l() {
        Object obj = this.f3778a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f3797b) + "]";
        }
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
    protected boolean o(V v10) {
        if (v10 == null) {
            v10 = (V) f3777g;
        }
        if (!f3776f.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean p(Throwable th) {
        if (!f3776f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    protected boolean q(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        d(listenableFuture);
        Object obj = this.f3778a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f3776f.b(this, null, i(listenableFuture))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (f3776f.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f3785b;
                    }
                    f3776f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f3778a;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f3783a);
        }
        return false;
    }

    public String toString() {
        String strL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strL = l();
            } catch (RuntimeException e10) {
                strL = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strL != null && !strL.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strL);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void b() {
    }

    protected void k() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3778a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f3780c;
            if (iVar != i.f3798c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f3776f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3778a;
                            } else {
                                n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f3780c;
                } while (iVar != i.f3798c);
            }
            return h(this.f3778a);
        }
        throw new InterruptedException();
    }
}
