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

/* JADX INFO: compiled from: DownloadImageTask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f16118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0251a f16119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f16121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o0 f16122f;

    /* JADX INFO: renamed from: ia.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadImageTask.kt */
    public interface InterfaceC0251a {
        void a(a aVar);

        void b(a aVar, Uri uri);
    }

    /* JADX INFO: compiled from: DownloadImageTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadImageTask", f = "DownloadImageTask.kt", l = {47}, m = "execute-IoAF18A")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f16123h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f16125j;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f16123h = obj;
            this.f16125j |= Integer.MIN_VALUE;
            Object objF = a.this.f(this);
            return objF == ad.d.f() ? objF : r.b(objF);
        }
    }

    /* JADX INFO: compiled from: DownloadImageTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadImageTask$run$1", f = "DownloadImageTask.kt", l = {29, 33, 35}, m = "invokeSuspend")
    static final class c extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16126h;

        /* JADX INFO: renamed from: ia.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DownloadImageTask.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadImageTask$run$1$uri$1", f = "DownloadImageTask.kt", l = {30}, m = "invokeSuspend")
        static final class C0252a extends l implements p<o0, zc.f<? super Uri>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16128h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f16129i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0252a(a aVar, zc.f<? super C0252a> fVar) {
                super(2, fVar);
                this.f16129i = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return new C0252a(this.f16129i, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super Uri> fVar) {
                return ((C0252a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF;
                Object objF2 = ad.d.f();
                int i10 = this.f16128h;
                if (i10 == 0) {
                    s.b(obj);
                    a aVar = this.f16129i;
                    this.f16128h = 1;
                    objF = aVar.f(this);
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

        c(zc.f<? super c> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new c(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f16126h;
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
            k0 k0VarE = a.this.f16121e.e();
            C0252a c0252a = new C0252a(a.this, null);
            this.f16126h = 1;
            obj = i.g(k0VarE, c0252a, this);
            if (obj == objF) {
                return objF;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                a aVar = a.this;
                this.f16126h = 2;
                if (aVar.h(uri, this) == objF) {
                    return objF;
                }
            } else {
                a aVar2 = a.this;
                this.f16126h = 3;
                if (aVar2.g(this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadImageTask.kt */
    static final class d extends u implements id.l<Throwable, g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f16130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CountDownLatch countDownLatch) {
            super(1);
            this.f16130d = countDownLatch;
        }

        public final void b(Throwable th) {
            this.f16130d.countDown();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Throwable th) {
            b(th);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadImageTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadImageTask$sendFail$2", f = "DownloadImageTask.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16131h;

        e(zc.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new e(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16131h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a.this.f16119c.a(a.this);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadImageTask.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.nativead.tasks.DownloadImageTask$sendPathSuccess$2", f = "DownloadImageTask.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16133h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Uri f16135j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, zc.f<? super f> fVar) {
            super(2, fVar);
            this.f16135j = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new f(this.f16135j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f16133h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a.this.f16119c.b(a.this, this.f16135j);
            return g0.f27756a;
        }
    }

    public a(Object assetsHolder, g repository, InterfaceC0251a listener, String url, w dispatchers) {
        t.f(assetsHolder, "assetsHolder");
        t.f(repository, "repository");
        t.f(listener, "listener");
        t.f(url, "url");
        t.f(dispatchers, "dispatchers");
        this.f16117a = assetsHolder;
        this.f16118b = repository;
        this.f16119c = listener;
        this.f16120d = url;
        this.f16121e = dispatchers;
        this.f16122f = p0.a(t2.b(null, 1, null).z(dispatchers.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(zc.f<? super g0> fVar) {
        Object objG = i.g(this.f16121e.f(), new e(null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(Uri uri, zc.f<? super g0> fVar) {
        Object objG = i.g(this.f16121e.f(), new f(uri, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zc.f<? super r<? extends Uri>> fVar) throws Throwable {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f16125j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16125j = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f16123h;
        Object objF = ad.d.f();
        int i11 = bVar.f16125j;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return ((r) obj).p();
        }
        s.b(obj);
        if (!h.E(this.f16120d)) {
            r.a aVar = r.f27774b;
            return r.c(s.a(new Exception("Invalid http url: " + this.f16120d)));
        }
        g gVar = this.f16118b;
        j1 j1Var = new j1(this.f16120d, r0.b.PRELOAD);
        Object obj2 = this.f16117a;
        bVar.f16125j = 1;
        Object objA = gVar.a(j1Var, obj2, bVar);
        return objA == objF ? objF : objA;
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        k.d(this.f16122f, null, null, new c(null), 3, null).s(new d(countDownLatch));
        try {
            countDownLatch.await();
            g0 g0Var = g0.f27756a;
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ a(Object obj, g gVar, InterfaceC0251a interfaceC0251a, String str, w wVar, int i10, kotlin.jvm.internal.k kVar) {
        this(obj, gVar, interfaceC0251a, str, (i10 & 16) != 0 ? w.f27717g.a() : wVar);
    }
}
