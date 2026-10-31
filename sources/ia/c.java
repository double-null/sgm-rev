package ia;

import android.net.Uri;
import id.p;
import io.bidmachine.core.h;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import la.g;
import pb.j1;
import pb.r0;
import ud.i;
import ud.k;
import ud.k0;
import ud.o0;
import ud.p0;
import ud.t2;
import wb.w;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: DownloadVideoTask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f16161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f16162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f16164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f16165f;

    /* JADX INFO: compiled from: DownloadVideoTask.kt */
    public interface a {
        default void a(c task) {
            t.f(task, "task");
        }

        default void b(c task, Uri videoFileUri) {
            t.f(task, "task");
            t.f(videoFileUri, "videoFileUri");
        }
    }

    /* JADX INFO: compiled from: DownloadVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVideoTask", f = "DownloadVideoTask.kt", l = {47}, m = "execute-IoAF18A")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f16166h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16168j;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16166h = obj;
            this.f16168j |= Integer.MIN_VALUE;
            Object objF = c.this.f(this);
            return objF == ad.d.f() ? objF : r.b(objF);
        }
    }

    /* JADX INFO: renamed from: ia.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVideoTask$run$1", f = "DownloadVideoTask.kt", l = {29, 33, 35}, m = "invokeSuspend")
    static final class C0254c extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16169h;

        /* JADX INFO: renamed from: ia.c$c$a */
        /* JADX INFO: compiled from: DownloadVideoTask.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVideoTask$run$1$uri$1", f = "DownloadVideoTask.kt", l = {30}, m = "invokeSuspend")
        static final class a extends l implements p<o0, zc.f<? super Uri>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16171h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ c f16172i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, zc.f<? super a> fVar) {
                super(2, fVar);
                this.f16172i = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return new a(this.f16172i, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super Uri> fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF;
                Object objF2 = ad.d.f();
                int i10 = this.f16171h;
                if (i10 == 0) {
                    s.b(obj);
                    c cVar = this.f16172i;
                    this.f16171h = 1;
                    objF = cVar.f(this);
                    if (objF == objF2) {
                        return objF2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    objF = ((r) obj).p();
                }
                if (r.k(objF)) {
                    return null;
                }
                return objF;
            }
        }

        C0254c(zc.f<? super C0254c> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return c.this.new C0254c(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((C0254c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16169h;
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
            k0 k0VarE = c.this.f16164e.e();
            a aVar = new a(c.this, null);
            this.f16169h = 1;
            obj = i.g(k0VarE, aVar, this);
            if (obj == objF) {
                return objF;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                c cVar = c.this;
                this.f16169h = 2;
                if (cVar.h(uri, this) == objF) {
                    return objF;
                }
            } else {
                c cVar2 = c.this;
                this.f16169h = 3;
                if (cVar2.g(this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadVideoTask.kt */
    static final class d extends u implements id.l<Throwable, g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f16173d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CountDownLatch countDownLatch) {
            super(1);
            this.f16173d = countDownLatch;
        }

        public final void b(Throwable th) {
            this.f16173d.countDown();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th) {
            b(th);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVideoTask$sendFail$2", f = "DownloadVideoTask.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16174h;

        e(zc.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return c.this.new e(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16174h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            c.this.f16162c.a(c.this);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadVideoTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadVideoTask$sendPathSuccess$2", f = "DownloadVideoTask.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16176h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Uri f16178j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, zc.f<? super f> fVar) {
            super(2, fVar);
            this.f16178j = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return c.this.new f(this.f16178j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16176h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            c.this.f16162c.b(c.this, this.f16178j);
            return g0.f27756a;
        }
    }

    public c(Object assetsHolder, g repository, a listener, String url, w dispatchers) {
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(listener, "listener");
        t.f(url, "url");
        t.f(dispatchers, "dispatchers");
        this.f16160a = assetsHolder;
        this.f16161b = repository;
        this.f16162c = listener;
        this.f16163d = url;
        this.f16164e = dispatchers;
        this.f16165f = p0.a(t2.b(null, 1, null).z(dispatchers.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(zc.f<? super g0> fVar) {
        Object objG = i.g(this.f16164e.f(), new e(null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Uri uri, zc.f<? super g0> fVar) {
        Object objG = i.g(this.f16164e.f(), new f(uri, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zc.f<? super r<? extends Uri>> fVar) {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f16168j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16168j = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f16166h;
        Object objF = ad.d.f();
        int i11 = bVar.f16168j;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return ((r) obj).p();
        }
        s.b(obj);
        if (!h.E(this.f16163d)) {
            r.a aVar = r.f27774b;
            return r.c(s.a(new Exception("Invalid http url: " + this.f16163d)));
        }
        g gVar = this.f16161b;
        j1 j1Var = new j1(this.f16163d, r0.b.PRELOAD);
        Object obj2 = this.f16160a;
        bVar.f16168j = 1;
        Object objF2 = gVar.f(j1Var, obj2, bVar);
        return objF2 == objF ? objF : objF2;
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        k.d(this.f16165f, null, null, new C0254c(null), 3, null).s(new d(countDownLatch));
        try {
            countDownLatch.await();
            g0 g0Var = g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ c(Object obj, g gVar, a aVar, String str, w wVar, int i10, kotlin.jvm.internal.k kVar) {
        this(obj, gVar, aVar, str, (i10 & 16) != 0 ? w.f27717g.a() : wVar);
    }
}
