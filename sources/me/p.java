package me;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import wc.g0;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f22517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f22518d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22515a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22516b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<re.e.a> f22519e = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<re.e.a> f22520f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<re.e> f22521g = new ArrayDeque<>();

    private final re.e.a d(String str) {
        for (re.e.a aVar : this.f22520f) {
            if (kotlin.jvm.internal.t.a(aVar.e(), str)) {
                return aVar;
            }
        }
        for (re.e.a aVar2 : this.f22519e) {
            if (kotlin.jvm.internal.t.a(aVar2.e(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> deque, T t10) {
        Runnable runnableH;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnableH = h();
            g0 g0Var = g0.f27756a;
        }
        if (k() || runnableH == null) {
            return;
        }
        runnableH.run();
    }

    private final boolean k() {
        int i10;
        boolean z10;
        if (ne.d.f22998h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<re.e.a> it = this.f22519e.iterator();
            kotlin.jvm.internal.t.e(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                re.e.a asyncCall = it.next();
                if (this.f22520f.size() >= i()) {
                    break;
                }
                if (asyncCall.d().get() < j()) {
                    it.remove();
                    asyncCall.d().incrementAndGet();
                    kotlin.jvm.internal.t.e(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f22520f.add(asyncCall);
                }
            }
            z10 = l() > 0;
            g0 g0Var = g0.f27756a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((re.e.a) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(re.e.a call) {
        re.e.a aVarD;
        kotlin.jvm.internal.t.f(call, "call");
        synchronized (this) {
            this.f22519e.add(call);
            if (!call.c().p() && (aVarD = d(call.e())) != null) {
                call.f(aVarD);
            }
            g0 g0Var = g0.f27756a;
        }
        k();
    }

    public final synchronized void b(re.e call) {
        kotlin.jvm.internal.t.f(call, "call");
        this.f22521g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        if (this.f22518d == null) {
            this.f22518d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ne.d.N(kotlin.jvm.internal.t.n(ne.d.f22999i, " Dispatcher"), false));
        }
        executorService = this.f22518d;
        kotlin.jvm.internal.t.c(executorService);
        return executorService;
    }

    public final void f(re.e.a call) {
        kotlin.jvm.internal.t.f(call, "call");
        call.d().decrementAndGet();
        e(this.f22520f, call);
    }

    public final void g(re.e call) {
        kotlin.jvm.internal.t.f(call, "call");
        e(this.f22521g, call);
    }

    public final synchronized Runnable h() {
        return this.f22517c;
    }

    public final synchronized int i() {
        return this.f22515a;
    }

    public final synchronized int j() {
        return this.f22516b;
    }

    public final synchronized int l() {
        return this.f22520f.size() + this.f22521g.size();
    }
}
