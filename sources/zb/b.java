package zb;

import android.content.Context;
import id.p;
import id.q;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pb.vBC.NyXuoef;
import ud.k0;
import ud.n;
import ud.p0;
import ud.t2;
import ud.v0;
import wb.w;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: DownloadManagerImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements zb.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0494b f29107k = new C0494b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f29108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q<Context, File, bc.c, c> f29109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f29110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bc.c f29111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f29112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f29113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wc.k f29114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f29115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<e, zb.a.c> f29116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final v0<g0> f29117j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    public static final class a extends u implements q<Context, File, bc.c, f> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f29118d = new a();

        a() {
            super(3);
        }

        @Override // id.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke(Context context, File tempDownloadDir, bc.c logger) {
            t.f(context, NyXuoef.trrMpBvPArDVT);
            t.f(tempDownloadDir, "tempDownloadDir");
            t.f(logger, "logger");
            return new f(context, tempDownloadDir, logger);
        }
    }

    /* JADX INFO: renamed from: zb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    public static final class C0494b {
        private C0494b() {
        }

        public /* synthetic */ C0494b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    public interface c {
        Object a(String str, sd.a aVar, zc.f<? super r<zb.a.C0493a>> fVar);

        Object b(String str, File file, sd.a aVar, zc.f<? super r<zb.a.b>> fVar);
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    private static final class d<T, R> implements cc.g.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n<R> f29119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p<cc.g<T>, T, R> f29120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p<cc.g<T>, cc.e, R> f29121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private cc.g<T> f29122d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(n<? super R> continuation, p<? super cc.g<T>, ? super T, ? extends R> successBuilder, p<? super cc.g<T>, ? super cc.e, ? extends R> errorBuilder) {
            t.f(continuation, "continuation");
            t.f(successBuilder, "successBuilder");
            t.f(errorBuilder, "errorBuilder");
            this.f29119a = continuation;
            this.f29120b = successBuilder;
            this.f29121c = errorBuilder;
        }

        @Override // cc.g.c
        public void a(cc.e networkError) {
            t.f(networkError, "networkError");
            if (this.f29119a.c()) {
                n<R> nVar = this.f29119a;
                r.a aVar = r.f27774b;
                nVar.resumeWith(r.c(this.f29121c.invoke(this.f29122d, networkError)));
            }
        }

        public final void b(cc.g<T> gVar) {
            this.f29122d = gVar;
        }

        @Override // cc.g.c
        public void onSuccess(T t10) {
            if (this.f29119a.c()) {
                n<R> nVar = this.f29119a;
                r.a aVar = r.f27774b;
                nVar.resumeWith(r.c(this.f29120b.invoke(this.f29122d, t10)));
            }
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29124b;

        public e(String url, String outputFilePath) {
            t.f(url, "url");
            t.f(outputFilePath, "outputFilePath");
            this.f29123a = url;
            this.f29124b = outputFilePath;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return t.a(this.f29123a, eVar.f29123a) && t.a(this.f29124b, eVar.f29124b);
        }

        public int hashCode() {
            return (this.f29123a.hashCode() * 31) + this.f29124b.hashCode();
        }

        public String toString() {
            return "DownloadKey(url=" + this.f29123a + ", outputFilePath=" + this.f29124b + ')';
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    public static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f29125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bc.c f29126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f29127c;

        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher", f = "DownloadManagerImpl.kt", l = {258}, m = "get-WS52aQU")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f29128h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f29129i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f29130j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f29131k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            /* synthetic */ Object f29132l;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f29134n;

            a(zc.f<? super a> fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                this.f29132l = obj;
                this.f29134n |= Integer.MIN_VALUE;
                Object objB = f.this.b(null, null, null, this);
                return objB == ad.d.f() ? objB : r.b(objB);
            }
        }

        /* JADX INFO: renamed from: zb.b$f$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class C0495b extends u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29135d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0495b(String str) {
                super(0);
                this.f29135d = str;
            }

            @Override // id.a
            public final String invoke() {
                return "Starting download " + this.f29135d;
            }
        }

        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class c extends u implements p<cc.g<File>, File, r<? extends zb.a.b>> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29137e;

            /* JADX INFO: compiled from: DownloadManagerImpl.kt */
            static final class a extends u implements id.a<String> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f29138d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(String str) {
                    super(0);
                    this.f29138d = str;
                }

                @Override // id.a
                public final String invoke() {
                    return "Download success: " + this.f29138d;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(2);
                this.f29137e = str;
            }

            public final Object b(cc.g<File> gVar, File file) {
                f.this.f29126b.b("DownloadManager", new a(this.f29137e));
                sd.a aVarH = gVar != null ? gVar.h() : null;
                if (file == null || aVarH == null) {
                    return r.c(null);
                }
                r.a aVar = r.f27774b;
                return r.c(new zb.a.b(aVarH.J(), file, null));
            }

            @Override // id.p
            public /* bridge */ /* synthetic */ r<? extends zb.a.b> invoke(cc.g<File> gVar, File file) {
                return r.b(b(gVar, file));
            }
        }

        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class d extends u implements p<cc.g<File>, cc.e, r<? extends zb.a.b>> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f29140e;

            /* JADX INFO: compiled from: DownloadManagerImpl.kt */
            static final class a extends u implements id.a<String> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ cc.e f29141d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f29142e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(cc.e eVar, String str) {
                    super(0);
                    this.f29141d = eVar;
                    this.f29142e = str;
                }

                @Override // id.a
                public final String invoke() {
                    return "Download failed (" + this.f29141d.a().getMessage() + "): " + this.f29142e;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str) {
                super(2);
                this.f29140e = str;
            }

            public final Object b(cc.g<File> gVar, cc.e networkError) {
                t.f(networkError, "networkError");
                f.this.f29126b.g("DownloadManager", new a(networkError, this.f29140e));
                r.a aVar = r.f27774b;
                return r.c(s.a(networkError.a()));
            }

            @Override // id.p
            public /* bridge */ /* synthetic */ r<? extends zb.a.b> invoke(cc.g<File> gVar, cc.e eVar) {
                return r.b(b(gVar, eVar));
            }
        }

        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.download.DownloadManagerImpl$NetworkContentFetcher", f = "DownloadManagerImpl.kt", l = {258}, m = "head-2Ivn440")
        static final class e extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f29143h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f29144i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f29145j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f29147l;

            e(zc.f<? super e> fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                this.f29145j = obj;
                this.f29147l |= Integer.MIN_VALUE;
                Object objA = f.this.a(null, null, this);
                return objA == ad.d.f() ? objA : r.b(objA);
            }
        }

        /* JADX INFO: renamed from: zb.b$f$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class C0496f extends u implements p<cc.g<Map<String, ? extends List<? extends String>>>, Map<String, ? extends List<? extends String>>, r<? extends zb.a.C0493a>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0496f f29148d = new C0496f();

            C0496f() {
                super(2);
            }

            public final Object b(cc.g<Map<String, List<String>>> gVar, Map<String, ? extends List<String>> map) {
                long jS;
                sd.a aVarH;
                r.a aVar = r.f27774b;
                if (gVar == null || (aVarH = gVar.h()) == null) {
                    sd.a.C0418a c0418a = sd.a.f25407b;
                    jS = sd.c.s(0, sd.d.MILLISECONDS);
                } else {
                    jS = aVarH.J();
                }
                if (map == null) {
                    map = o0.h();
                }
                return r.c(new zb.a.C0493a(jS, map, null));
            }

            @Override // id.p
            public /* bridge */ /* synthetic */ r<? extends zb.a.C0493a> invoke(cc.g<Map<String, ? extends List<? extends String>>> gVar, Map<String, ? extends List<? extends String>> map) {
                return r.b(b(gVar, map));
            }
        }

        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class g extends u implements p<cc.g<Map<String, ? extends List<? extends String>>>, cc.e, r<? extends zb.a.C0493a>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final g f29149d = new g();

            g() {
                super(2);
            }

            public final Object b(cc.g<Map<String, List<String>>> gVar, cc.e networkError) {
                t.f(networkError, "networkError");
                r.a aVar = r.f27774b;
                return r.c(s.a(networkError.a()));
            }

            @Override // id.p
            public /* bridge */ /* synthetic */ r<? extends zb.a.C0493a> invoke(cc.g<Map<String, ? extends List<? extends String>>> gVar, cc.e eVar) {
                return r.b(b(gVar, eVar));
            }
        }

        public f(Context context, File tempDownloadDir, bc.c logger) {
            t.f(context, "context");
            t.f(tempDownloadDir, "tempDownloadDir");
            t.f(logger, "logger");
            this.f29125a = tempDownloadDir;
            this.f29126b = logger;
            Context applicationContext = context.getApplicationContext();
            t.e(applicationContext, "context.applicationContext");
            this.f29127c = applicationContext;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // zb.b.c
        public Object a(String str, sd.a aVar, zc.f<? super r<zb.a.C0493a>> fVar) throws Throwable {
            e eVar;
            if (fVar instanceof e) {
                eVar = (e) fVar;
                int i10 = eVar.f29147l;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    eVar.f29147l = i10 - Integer.MIN_VALUE;
                } else {
                    eVar = new e(fVar);
                }
            } else {
                eVar = new e(fVar);
            }
            Object objZ = eVar.f29145j;
            Object objF = ad.d.f();
            int i11 = eVar.f29147l;
            if (i11 == 0) {
                s.b(objZ);
                eVar.f29143h = str;
                eVar.f29144i = aVar;
                eVar.f29147l = 1;
                ud.p pVar = new ud.p(ad.c.c(eVar), 1);
                pVar.G();
                d dVar = new d(pVar, C0496f.f29148d, g.f29149d);
                cc.g gVarA = new cc.g.a(str, cc.d.Head).h(new cc.c()).d(dVar).i(aVar != null ? kotlin.coroutines.jvm.internal.b.d(sd.a.p(aVar.J())) : null).a();
                dVar.b(gVarA);
                cc.g.s(gVarA, null, 1, null);
                objZ = pVar.z();
                if (objZ == ad.d.f()) {
                    kotlin.coroutines.jvm.internal.h.c(eVar);
                }
                if (objZ == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(objZ);
            }
            return ((r) objZ).p();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // zb.b.c
        public Object b(String str, File file, sd.a aVar, zc.f<? super r<zb.a.b>> fVar) throws Throwable {
            a aVar2;
            if (fVar instanceof a) {
                aVar2 = (a) fVar;
                int i10 = aVar2.f29134n;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar2.f29134n = i10 - Integer.MIN_VALUE;
                } else {
                    aVar2 = new a(fVar);
                }
            } else {
                aVar2 = new a(fVar);
            }
            Object objZ = aVar2.f29132l;
            Object objF = ad.d.f();
            int i11 = aVar2.f29134n;
            if (i11 == 0) {
                s.b(objZ);
                aVar2.f29128h = this;
                aVar2.f29129i = str;
                aVar2.f29130j = file;
                aVar2.f29131k = aVar;
                aVar2.f29134n = 1;
                ud.p pVar = new ud.p(ad.c.c(aVar2), 1);
                pVar.G();
                d dVar = new d(pVar, new c(str), new d(str));
                cc.g gVarA = new cc.g.a(str, cc.d.Get).h(new cc.b(this.f29127c, file, this.f29125a)).d(dVar).i(aVar != null ? kotlin.coroutines.jvm.internal.b.d(sd.a.p(aVar.J())) : null).a();
                dVar.b(gVarA);
                this.f29126b.b("DownloadManager", new C0495b(str));
                cc.g.s(gVarA, null, 1, null);
                objZ = pVar.z();
                if (objZ == ad.d.f()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar2);
                }
                if (objZ == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(objZ);
            }
            return ((r) objZ).p();
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.download.DownloadManagerImpl$cleanupNotCompletedDownloads$1", f = "DownloadManagerImpl.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<ud.o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f29150h;

        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class a extends u implements id.l<File, Boolean> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0 f29152d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var) {
                super(1);
                this.f29152d = f0Var;
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(File it) {
                t.f(it, "it");
                boolean zIsFile = it.isFile();
                if (zIsFile) {
                    this.f29152d.f21511a++;
                }
                return Boolean.valueOf(zIsFile);
            }
        }

        /* JADX INFO: renamed from: zb.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DownloadManagerImpl.kt */
        static final class C0497b extends u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0 f29153d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0497b(f0 f0Var) {
                super(0);
                this.f29153d = f0Var;
            }

            @Override // id.a
            public final String invoke() {
                return "Cleanup unused files completed, removed count: " + this.f29153d.f21511a;
            }
        }

        g(zc.f<? super g> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new g(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super g0> fVar) {
            return ((g) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f29150h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            f0 f0Var = new f0();
            ac.b.e(b.this.f29108a, new a(f0Var));
            b.this.f29111d.b("DownloadManager", new C0497b(f0Var));
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    static final class h extends u implements id.a<c> {
        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return (c) b.this.f29109b.invoke(b.this.f29112e, b.this.f29108a, b.this.f29111d);
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    static final class i extends u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.f29155d = str;
        }

        @Override // id.a
        public final String invoke() {
            return "Active download detected: " + this.f29155d;
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.download.DownloadManagerImpl", f = "DownloadManagerImpl.kt", l = {76}, m = "getHeadCallData-2Ivn440")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f29156h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f29158j;

        j(zc.f<? super j> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f29156h = obj;
            this.f29158j |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, null, this);
            return objB == ad.d.f() ? objB : r.b(objB);
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.download.DownloadManagerImpl$getHeadCallData$2", f = "DownloadManagerImpl.kt", l = {77, 78}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<ud.o0, zc.f<? super r<? extends zb.a.C0493a>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f29159h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f29161j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ sd.a f29162k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, sd.a aVar, zc.f<? super k> fVar) {
            super(2, fVar);
            this.f29161j = str;
            this.f29162k = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new k(this.f29161j, this.f29162k, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super r<zb.a.C0493a>> fVar) {
            return ((k) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objA;
            Object objF = ad.d.f();
            int i10 = this.f29159h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    objA = ((r) obj).p();
                }
                return r.b(objA);
            }
            s.b(obj);
            b bVar = b.this;
            this.f29159h = 1;
            if (bVar.n(this) == objF) {
                return objF;
            }
            c cVarO = b.this.o();
            String str = this.f29161j;
            sd.a aVar = this.f29162k;
            this.f29159h = 2;
            objA = cVarO.a(str, aVar, this);
            if (objA == objF) {
                return objF;
            }
            return r.b(objA);
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.download.DownloadManagerImpl$runDownload$1", f = "DownloadManagerImpl.kt", l = {118, 120}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<ud.o0, zc.f<? super r<? extends zb.a.b>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f29163h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f29165j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ File f29166k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ sd.a f29167l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ e f29168m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, File file, sd.a aVar, e eVar, zc.f<? super l> fVar) {
            super(2, fVar);
            this.f29165j = str;
            this.f29166k = file;
            this.f29167l = aVar;
            this.f29168m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return b.this.new l(this.f29165j, this.f29166k, this.f29167l, this.f29168m, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super r<zb.a.b>> fVar) {
            return ((l) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004d  */
        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        /* JADX WARN: Code duplicated, block: B:26:0x006f  */
        /* JADX WARN: Code duplicated, block: B:32:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:26:0x006f, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object obj2;
            zb.a.b bVar;
            Object obj3;
            b bVar2;
            e eVar;
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f29163h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    objB = ((r) obj).p();
                }
                if (r.k(objB)) {
                    obj2 = null;
                } else {
                    obj2 = objB;
                }
                bVar = (zb.a.b) obj2;
                obj3 = b.this.f29115h;
                bVar2 = b.this;
                eVar = this.f29168m;
                synchronized (obj3) {
                }
                if (bVar != null) {
                    objC = r.c(bVar);
                } else {
                    objC = r.c(s.a(new Exception("Failed to download content from url (" + this.f29165j + ')', r.g(objB))));
                }
                return r.b(objC);
            }
            s.b(obj);
            b bVar3 = b.this;
            this.f29163h = 1;
            if (bVar3.n(this) == objF) {
                return objF;
            }
            c cVarO = b.this.o();
            String str = this.f29165j;
            File file = this.f29166k;
            sd.a aVar = this.f29167l;
            this.f29163h = 2;
            objB = cVarO.b(str, file, aVar, this);
            if (objB == objF) {
                return objF;
            }
            if (r.k(objB)) {
                obj2 = null;
            } else {
                obj2 = objB;
            }
            bVar = (zb.a.b) obj2;
            obj3 = b.this.f29115h;
            bVar2 = b.this;
            eVar = this.f29168m;
            synchronized (obj3) {
                if (bVar != null) {
                    objC = r.c(bVar);
                } else {
                    objC = r.c(s.a(new Exception("Failed to download content from url (" + this.f29165j + ')', r.g(objB))));
                }
                return r.b(objC);
            }
        }
    }

    /* JADX INFO: compiled from: DownloadManagerImpl.kt */
    static final class m extends u implements id.a<ud.o0> {
        m() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ud.o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(b.this.f29110c.e()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, File tempDir, q<? super Context, ? super File, ? super bc.c, ? extends c> contentFetcherBuilder, w dispatchers, bc.c logger) {
        t.f(context, "context");
        t.f(tempDir, "tempDir");
        t.f(contentFetcherBuilder, "contentFetcherBuilder");
        t.f(dispatchers, "dispatchers");
        t.f(logger, "logger");
        this.f29108a = tempDir;
        this.f29109b = contentFetcherBuilder;
        this.f29110c = dispatchers;
        this.f29111d = logger;
        Context applicationContext = context.getApplicationContext();
        t.e(applicationContext, "context.applicationContext");
        this.f29112e = applicationContext;
        this.f29113f = wc.m.a(new m());
        this.f29114g = wc.m.a(new h());
        this.f29115h = new Object();
        this.f29116i = new LinkedHashMap();
        this.f29117j = l();
    }

    private final v0<g0> l() {
        return ud.k.b(p(), this.f29110c.e(), null, new g(null), 2, null);
    }

    private final e m(String str, File file) {
        String path = file.getPath();
        t.e(path, "outputFile.path");
        return new e(str, path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c o() {
        return (c) this.f29114g.getValue();
    }

    private final ud.o0 p() {
        return (ud.o0) this.f29113f.getValue();
    }

    private final v0<r<zb.a.b>> q(e eVar, String str, File file, sd.a aVar) {
        return ud.k.b(p(), null, null, new l(str, file, aVar, eVar, null), 3, null);
    }

    @Override // zb.a
    public zb.a.c a(String url, File outputFile) {
        zb.a.c cVar;
        t.f(url, "url");
        t.f(outputFile, "outputFile");
        synchronized (this.f29115h) {
            cVar = this.f29116i.get(m(url, outputFile));
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zb.a
    public Object b(String str, sd.a aVar, zc.f<? super r<zb.a.C0493a>> fVar) throws Throwable {
        j jVar;
        if (fVar instanceof j) {
            jVar = (j) fVar;
            int i10 = jVar.f29158j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f29158j = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(fVar);
            }
        } else {
            jVar = new j(fVar);
        }
        Object objG = jVar.f29156h;
        Object objF = ad.d.f();
        int i11 = jVar.f29158j;
        if (i11 == 0) {
            s.b(objG);
            k0 k0VarE = this.f29110c.e();
            k kVar = new k(str, aVar, null);
            jVar.f29158j = 1;
            objG = ud.i.g(k0VarE, kVar, jVar);
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

    @Override // zb.a
    public zb.a.c c(String url, File outputFile, sd.a aVar) {
        t.f(url, "url");
        t.f(outputFile, "outputFile");
        synchronized (this.f29115h) {
            e eVarM = m(url, outputFile);
            zb.a.c cVar = this.f29116i.get(eVarM);
            if (cVar != null) {
                this.f29111d.b("DownloadManager", new i(url));
                return cVar;
            }
            zb.a.c cVar2 = new zb.a.c(url, q(eVarM, url, outputFile, aVar));
            this.f29116i.put(eVarM, cVar2);
            return cVar2;
        }
    }

    public final Object n(zc.f<? super g0> fVar) {
        Object objJ0 = this.f29117j.j0(fVar);
        return objJ0 == ad.d.f() ? objJ0 : g0.f27756a;
    }

    public /* synthetic */ b(Context context, File file, q qVar, w wVar, bc.c cVar, int i10, kotlin.jvm.internal.k kVar) {
        this(context, file, (i10 & 4) != 0 ? a.f29118d : qVar, (i10 & 8) != 0 ? w.f27717g.a() : wVar, (i10 & 16) != 0 ? bc.b.f4446a.a() : cVar);
    }
}
