package androidx.concurrent.futures;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
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

/* JADX INFO: compiled from: AbstractResolvableFuture.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f1651d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f1652e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f1653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f1654g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f1655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f1656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f1657c;

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f1658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f1659d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f1660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f1661b;

        static {
            if (a.f1651d) {
                f1659d = null;
                f1658c = null;
            } else {
                f1659d = new c(false, null);
                f1658c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f1660a = z10;
            this.f1661b = th;
        }
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f1662b = new d(new C0026a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f1663a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractResolvableFuture.java */
        class C0026a extends Throwable {
            C0026a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1663a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f1664d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f1665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f1666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f1667c;

        e(Runnable runnable, Executor executor) {
            this.f1665a = runnable;
            this.f1666b = executor;
        }
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1672e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1668a = atomicReferenceFieldUpdater;
            this.f1669b = atomicReferenceFieldUpdater2;
            this.f1670c = atomicReferenceFieldUpdater3;
            this.f1671d = atomicReferenceFieldUpdater4;
            this.f1672e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1671d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1672e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f1670c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1669b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1668a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f1673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ListenableFuture<? extends V> f1674b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1673a.f1655a != this) {
                return;
            }
            if (a.f1653f.b(this.f1673a, this, a.j(this.f1674b))) {
                a.g(this.f1673a);
            }
        }
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1656b != eVar) {
                    return false;
                }
                aVar.f1656b = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1655a != obj) {
                    return false;
                }
                aVar.f1655a = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1657c != iVar) {
                    return false;
                }
                aVar.f1657c = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1677b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1676a = thread;
        }
    }

    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    /* JADX INFO: loaded from: classes.dex */
    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f1675c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f1676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f1677b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f1653f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1676a;
            if (thread != null) {
                this.f1676a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f1653f.e(this, Thread.currentThread());
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
        f1653f = hVar;
        if (th != null) {
            f1652e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1654g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb2) {
        try {
            Object objK = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(objK));
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
            eVar2 = this.f1656b;
        } while (!f1653f.a(this, eVar2, e.f1664d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1667c;
            eVar4.f1667c = eVar3;
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
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f1667c;
                Runnable runnable = eVarE.f1665a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1673a;
                    if (aVar.f1655a == gVar) {
                        if (f1653f.b(aVar, gVar, j(gVar.f1674b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarE.f1666b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f1661b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1663a);
        }
        if (obj == f1654g) {
            return null;
        }
        return obj;
    }

    static Object j(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).f1655a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f1660a) {
                return cVar.f1661b != null ? new c(false, cVar.f1661b) : c.f1659d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f1651d) && zIsCancelled) {
            return c.f1659d;
        }
        try {
            Object objK = k(listenableFuture);
            return objK == null ? f1654g : objK;
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

    static <V> V k(Future<V> future) throws ExecutionException {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f1657c;
        } while (!f1653f.c(this, iVar, i.f1675c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1677b;
        }
    }

    private void o(i iVar) {
        iVar.f1676a = null;
        while (true) {
            i iVar2 = this.f1657c;
            if (iVar2 == i.f1675c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1677b;
                if (iVar2.f1676a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1677b = iVar4;
                    if (iVar3.f1676a == null) {
                    }
                } else if (!f1653f.c(this, iVar2, iVar4)) {
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
        e eVar = this.f1656b;
        if (eVar != e.f1664d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1667c = eVar;
                if (f1653f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1656b;
                }
            } while (eVar != e.f1664d);
        }
        h(runnable, executor);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f1655a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f1651d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f1658c : c.f1659d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f1653f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f1674b;
                if (!(listenableFuture instanceof a)) {
                    listenableFuture.cancel(z10);
                    return true;
                }
                aVar = (a) listenableFuture;
                obj = aVar.f1655a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f1655a;
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
        Object obj = this.f1655a;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1657c;
            if (iVar != i.f1675c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f1653f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1655a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                        break;
                    }
                    iVar = this.f1657c;
                    if (iVar == i.f1675c) {
                    }
                }
            }
            return i(this.f1655a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1655a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
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
        return this.f1655a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f1655a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f1655a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f1674b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) f1654g;
        }
        if (!f1653f.b(this, null, v10)) {
            return false;
        }
        g(this);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (!f1653f.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected final boolean s() {
        Object obj = this.f1655a;
        return (obj instanceof c) && ((c) obj).f1660a;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM);
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

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f1652e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + ljglrLUdGZhMhQ.SJpMhCTQjKfZrz + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1655a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f1657c;
            if (iVar != i.f1675c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1653f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1655a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f1657c;
                } while (iVar != i.f1675c);
            }
            return i(this.f1655a);
        }
        throw new InterruptedException();
    }
}
