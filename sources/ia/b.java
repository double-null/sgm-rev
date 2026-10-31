package ia;

import android.content.Context;
import android.net.Uri;
import id.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l7.n;
import ud.i;
import ud.k;
import ud.k0;
import ud.o0;
import ud.p0;
import ud.t2;
import wb.e0;
import wb.w;
import wc.g0;
import wc.q;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: DownloadVastVideoTask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final la.g f16137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f16138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f16140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f16141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference<Context> f16142g;

    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    public interface a {
        void a(b bVar, Uri uri, h7.g gVar);

        void b(b bVar);
    }

    /* JADX INFO: renamed from: ia.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVastVideoTask", f = "DownloadVastVideoTask.kt", l = {48}, m = "execute-IoAF18A")
    static final class C0253b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f16143h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16145j;

        C0253b(zc.f<? super C0253b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16143h = obj;
            this.f16145j |= Integer.MIN_VALUE;
            Object objI = b.this.i(this);
            return objI == ad.d.f() ? objI : r.b(objI);
        }
    }

    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVastVideoTask$execute$2", f = "DownloadVastVideoTask.kt", l = {57}, m = "invokeSuspend")
    static final class c extends l implements p<o0, zc.f<? super r<? extends q<? extends Uri, ? extends h7.g>>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16146h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f16147i;

        /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
        public static final class a implements ia.c.a {
            a() {
            }
        }

        c(zc.f<? super c> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new c(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super r<? extends q<? extends Uri, ? extends h7.g>>> fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF;
            q qVar;
            Object objC;
            Object objF2 = ad.d.f();
            int i10 = this.f16147i;
            if (i10 == 0) {
                s.b(obj);
                Object objJ = b.this.j();
                q qVar2 = (q) (r.k(objJ) ? null : objJ);
                if (qVar2 == null) {
                    Throwable thG = r.g(objJ);
                    if (thG == null) {
                        thG = new Exception("Unknown error");
                    }
                    objC = r.c(s.a(thG));
                } else {
                    ia.c cVar = new ia.c(b.this.f16136a, b.this.f16137b, new a(), (String) qVar2.e(), b.this.f16140e);
                    this.f16146h = qVar2;
                    this.f16147i = 1;
                    objF = cVar.f(this);
                    if (objF == objF2) {
                        return objF2;
                    }
                    qVar = qVar2;
                }
                return r.b(objC);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) this.f16146h;
            s.b(obj);
            objF = ((r) obj).p();
            Uri uri = (Uri) (r.k(objF) ? null : objF);
            if (uri != null) {
                objC = r.c(new q(uri, qVar.f()));
            } else {
                Throwable thG2 = r.g(objF);
                if (thG2 == null) {
                    thG2 = new Exception("Unknown error");
                }
                objC = r.c(s.a(thG2));
            }
            return r.b(objC);
        }
    }

    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVastVideoTask$run$1", f = "DownloadVastVideoTask.kt", l = {34, 38, 40}, m = "invokeSuspend")
    static final class d extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16149h;

        /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVastVideoTask$run$1$result$1", f = "DownloadVastVideoTask.kt", l = {35}, m = "invokeSuspend")
        static final class a extends l implements p<o0, zc.f<? super q<? extends Uri, ? extends h7.g>>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16151h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ b f16152i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, zc.f<? super a> fVar) {
                super(2, fVar);
                this.f16152i = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return new a(this.f16152i, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super q<? extends Uri, ? extends h7.g>> fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objI;
                Object objF = ad.d.f();
                int i10 = this.f16151h;
                if (i10 == 0) {
                    s.b(obj);
                    b bVar = this.f16152i;
                    this.f16151h = 1;
                    objI = bVar.i(this);
                    if (objI == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    objI = ((r) obj).p();
                }
                if (r.k(objI)) {
                    return null;
                }
                return objI;
            }
        }

        d(zc.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new d(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16149h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k0 k0VarE = b.this.f16140e.e();
            a aVar = new a(b.this, null);
            this.f16149h = 1;
            obj = i.g(k0VarE, aVar, this);
            if (obj == objF) {
                return objF;
            }
            q qVar = (q) obj;
            if (qVar != null) {
                b bVar = b.this;
                Uri uri = (Uri) qVar.e();
                h7.g gVar = (h7.g) qVar.f();
                this.f16149h = 2;
                if (bVar.l(uri, gVar, this) == objF) {
                    return objF;
                }
            } else {
                b bVar2 = b.this;
                this.f16149h = 3;
                if (bVar2.k(this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    static final class e extends u implements id.l<Throwable, g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f16153d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CountDownLatch countDownLatch) {
            super(1);
            this.f16153d = countDownLatch;
        }

        public final void b(Throwable th) {
            this.f16153d.countDown();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th) {
            b(th);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVastVideoTask$sendFail$2", f = "DownloadVastVideoTask.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16154h;

        f(zc.f<? super f> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new f(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16154h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            b.this.f16138c.b(b.this);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadVastVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVastVideoTask$sendSuccess$2", f = "DownloadVastVideoTask.kt", l = {}, m = "invokeSuspend")
    static final class g extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16156h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Uri f16158j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ h7.g f16159k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Uri uri, h7.g gVar, zc.f<? super g> fVar) {
            super(2, fVar);
            this.f16158j = uri;
            this.f16159k = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new g(this.f16158j, this.f16159k, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((g) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16156h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            b.this.f16138c.a(b.this, this.f16158j, this.f16159k);
            return g0.f27756a;
        }
    }

    public b(Context context, Object assetsHolder, la.g repository, a listener, String videoTag, w dispatchers) {
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(listener, "listener");
        t.f(videoTag, "videoTag");
        t.f(dispatchers, "dispatchers");
        this.f16136a = assetsHolder;
        this.f16137b = repository;
        this.f16138c = listener;
        this.f16139d = videoTag;
        this.f16140e = dispatchers;
        this.f16141f = p0.a(t2.b(null, 1, null).z(dispatchers.f()));
        this.f16142g = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j() {
        n nVarQ;
        Context context = this.f16142g.get();
        if (context == null) {
            r.a aVar = r.f27774b;
            return r.c(s.a(new Exception("Context is detached")));
        }
        try {
            h7.g gVarA = h7.g.V().d(c7.a.Stream).a();
            t.e(gVarA, "newBuilder()\n           …\n                .build()");
            String strL0 = null;
            gVarA.U(context, this.f16139d, null);
            j7.b bVarM = gVarA.M();
            if (bVarM != null && (nVarQ = bVarM.q()) != null) {
                strL0 = nVarQ.l0();
            }
            String strZ = e0.z(strL0);
            if (strZ != null) {
                r.a aVar2 = r.f27774b;
                return r.c(new q(strZ, gVarA));
            }
            r.a aVar3 = r.f27774b;
            return r.c(s.a(new Exception("Vast video url is empty")));
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
            r.a aVar4 = r.f27774b;
            return r.c(s.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(zc.f<? super g0> fVar) {
        Object objG = i.g(this.f16140e.f(), new f(null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(Uri uri, h7.g gVar, zc.f<? super g0> fVar) {
        Object objG = i.g(this.f16140e.f(), new g(uri, gVar, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zc.f<? super r<? extends q<? extends Uri, ? extends h7.g>>> fVar) throws Throwable {
        C0253b c0253b;
        if (fVar instanceof C0253b) {
            c0253b = (C0253b) fVar;
            int i10 = c0253b.f16145j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0253b.f16145j = i10 - Integer.MIN_VALUE;
            } else {
                c0253b = new C0253b(fVar);
            }
        } else {
            c0253b = new C0253b(fVar);
        }
        Object objG = c0253b.f16143h;
        Object objF = ad.d.f();
        int i11 = c0253b.f16145j;
        if (i11 == 0) {
            s.b(objG);
            k0 k0VarE = this.f16140e.e();
            c cVar = new c(null);
            c0253b.f16145j = 1;
            objG = i.g(k0VarE, cVar, c0253b);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(objG);
        }
        return ((r) objG).p();
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        k.d(this.f16141f, null, null, new d(null), 3, null).s(new e(countDownLatch));
        try {
            countDownLatch.await();
            g0 g0Var = g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ b(Context context, Object obj, la.g gVar, a aVar, String str, w wVar, int i10, kotlin.jvm.internal.k kVar) {
        this(context, obj, gVar, aVar, str, (i10 & 32) != 0 ? w.f27717g.a() : wVar);
    }
}
