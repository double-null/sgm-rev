package ec;

import ad.d;
import dc.c;
import id.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import ud.b2;
import ud.k;
import ud.o0;
import ud.p0;
import ud.q0;
import ud.y0;
import wc.g0;
import wc.s;
import zc.j;

/* JADX INFO: compiled from: CoroutineTaskManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a extends dc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f14519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Runnable, b2> f14520b;

    /* JADX INFO: renamed from: ec.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CoroutineTaskManager.kt */
    @f(c = "io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager$scheduleTask$job$1", f = "CoroutineTaskManager.kt", l = {25, 29}, m = "invokeSuspend")
    static final class C0217a extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14521h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f14522i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f14523j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Runnable f14524k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ a f14525l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0217a(long j10, Runnable runnable, a aVar, zc.f<? super C0217a> fVar) {
            super(2, fVar);
            this.f14523j = j10;
            this.f14524k = runnable;
            this.f14525l = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            C0217a c0217a = new C0217a(this.f14523j, this.f14524k, this.f14525l, fVar);
            c0217a.f14522i = obj;
            return c0217a;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((C0217a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o0 o0Var;
            Object objF = d.f();
            int i10 = this.f14521h;
            try {
                try {
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                o0Var = (o0) this.f14522i;
                                s.b(obj);
                            } else {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj);
                            }
                            g0 g0Var = g0.f27756a;
                            this.f14525l.e(this.f14524k);
                            g0 g0Var2 = g0.f27756a;
                            return g0.f27756a;
                        }
                        s.b(obj);
                        o0Var = (o0) this.f14522i;
                        long j10 = this.f14523j;
                        if (j10 > 0) {
                            this.f14522i = o0Var;
                            this.f14521h = 1;
                            if (y0.a(j10, this) == objF) {
                                return objF;
                            }
                        }
                        Runnable runnable = this.f14524k;
                        if (runnable instanceof c) {
                            j jVarQ = o0Var.q();
                            this.f14522i = o0Var;
                            this.f14521h = 2;
                            if (((c) runnable).d(jVarQ, this) == objF) {
                                return objF;
                            }
                        } else {
                            runnable.run();
                        }
                        g0 g0Var3 = g0.f27756a;
                    } catch (Throwable th) {
                        try {
                            this.f14525l.e(this.f14524k);
                            g0 g0Var4 = g0.f27756a;
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable unused2) {
                }
                this.f14525l.e(this.f14524k);
                g0 g0Var5 = g0.f27756a;
            } catch (Throwable unused3) {
            }
            return g0.f27756a;
        }
    }

    public a(o0 coroutineScope) {
        t.f(coroutineScope, "coroutineScope");
        this.f14519a = coroutineScope;
        this.f14520b = new ConcurrentHashMap();
    }

    @Override // dc.a
    protected void e(Runnable task) throws Throwable {
        t.f(task, "task");
        b2 b2VarRemove = this.f14520b.remove(task);
        if (b2VarRemove != null) {
            b2.a.a(b2VarRemove, null, 1, null);
        }
    }

    @Override // dc.a
    protected void f(Runnable task, long j10) throws Throwable {
        t.f(task, "task");
        b2 b2VarD = k.d(this.f14519a, null, q0.f26806b, new C0217a(j10, task, this, null), 1, null);
        this.f14520b.put(task, b2VarD);
        b2VarD.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(j coroutineContext) {
        this(p0.a(coroutineContext));
        t.f(coroutineContext, "coroutineContext");
    }
}
