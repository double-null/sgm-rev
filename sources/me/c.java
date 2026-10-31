package me;

import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.u0;
import kotlin.jvm.internal.l0;
import rd.f0;
import wc.g0;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f22322g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.d f22323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22328f;

    /* JADX INFO: compiled from: Cache.kt */
    private static final class a extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pe.d.C0395d f22329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f22331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final af.g f22332d;

        /* JADX INFO: renamed from: me.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class C0368a extends af.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ af.c0 f22333a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f22334b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0368a(af.c0 c0Var, a aVar) {
                super(c0Var);
                this.f22333a = c0Var;
                this.f22334b = aVar;
            }

            @Override // af.k, af.c0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f22334b.b().close();
                super.close();
            }
        }

        public a(pe.d.C0395d snapshot, String str, String str2) {
            kotlin.jvm.internal.t.f(snapshot, "snapshot");
            this.f22329a = snapshot;
            this.f22330b = str;
            this.f22331c = str2;
            this.f22332d = af.q.d(new C0368a(snapshot.c(1), this));
        }

        public final pe.d.C0395d b() {
            return this.f22329a;
        }

        @Override // me.c0
        public long contentLength() {
            String str = this.f22331c;
            if (str == null) {
                return -1L;
            }
            return ne.d.V(str, -1L);
        }

        @Override // me.c0
        public w contentType() {
            String str = this.f22330b;
            if (str == null) {
                return null;
            }
            return w.f22559e.b(str);
        }

        @Override // me.c0
        public af.g source() {
            return this.f22332d;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final Set<String> d(t tVar) {
            int size = tVar.size();
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (rd.c0.B("Vary", tVar.c(i10), true)) {
                    String strE = tVar.e(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(rd.c0.D(l0.f21527a));
                    }
                    Iterator it = f0.J0(strE, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(f0.d1((String) it.next()).toString());
                    }
                }
                i10 = i11;
            }
            return treeSet == null ? u0.e() : treeSet;
        }

        private final t e(t tVar, t tVar2) {
            Set<String> setD = d(tVar2);
            if (setD.isEmpty()) {
                return ne.d.f22992b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String strC = tVar.c(i10);
                if (setD.contains(strC)) {
                    aVar.a(strC, tVar.e(i10));
                }
                i10 = i11;
            }
            return aVar.d();
        }

        public final String b(u url) {
            kotlin.jvm.internal.t.f(url, "url");
            return af.h.f361d.d(url.toString()).v().p();
        }

        public final int c(af.g source) throws IOException {
            kotlin.jvm.internal.t.f(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= 2147483647L) {
                    if (!(utf8LineStrict.length() > 0)) {
                        return (int) decimalLong;
                    }
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final t f(b0 b0Var) {
            kotlin.jvm.internal.t.f(b0Var, "<this>");
            b0 b0VarV = b0Var.v();
            kotlin.jvm.internal.t.c(b0VarV);
            return e(b0VarV.G().f(), b0Var.s());
        }

        public final boolean g(b0 cachedResponse, t cachedRequest, z newRequest) {
            kotlin.jvm.internal.t.f(cachedResponse, "cachedResponse");
            kotlin.jvm.internal.t.f(cachedRequest, "cachedRequest");
            kotlin.jvm.internal.t.f(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.s());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!kotlin.jvm.internal.t.a(cachedRequest.f(str), newRequest.e(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean a(b0 b0Var) {
            kotlin.jvm.internal.t.f(b0Var, "<this>");
            return d(b0Var.s()).contains(vgmm.kwrmDk);
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    private final class d implements pe.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pe.d.b f22348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final af.a0 f22349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final af.a0 f22350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f22352e;

        /* JADX INFO: compiled from: Cache.kt */
        public static final class a extends af.j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f22353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f22354c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, d dVar, af.a0 a0Var) {
                super(a0Var);
                this.f22353b = cVar;
                this.f22354c = dVar;
            }

            @Override // af.j, af.a0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                c cVar = this.f22353b;
                d dVar = this.f22354c;
                synchronized (cVar) {
                    if (dVar.b()) {
                        return;
                    }
                    dVar.c(true);
                    cVar.o(cVar.f() + 1);
                    super.close();
                    this.f22354c.f22348a.b();
                }
            }
        }

        public d(c this$0, pe.d.b editor) {
            kotlin.jvm.internal.t.f(this$0, "this$0");
            kotlin.jvm.internal.t.f(editor, "editor");
            this.f22352e = this$0;
            this.f22348a = editor;
            af.a0 a0VarF = editor.f(1);
            this.f22349b = a0VarF;
            this.f22350c = new a(this$0, this, a0VarF);
        }

        @Override // pe.b
        public void abort() {
            c cVar = this.f22352e;
            synchronized (cVar) {
                if (b()) {
                    return;
                }
                c(true);
                cVar.n(cVar.e() + 1);
                ne.d.m(this.f22349b);
                try {
                    this.f22348a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean b() {
            return this.f22351d;
        }

        @Override // pe.b
        public af.a0 body() {
            return this.f22350c;
        }

        public final void c(boolean z10) {
            this.f22351d = z10;
        }
    }

    public c(File directory, long j10, ve.a fileSystem) {
        kotlin.jvm.internal.t.f(directory, "directory");
        kotlin.jvm.internal.t.f(fileSystem, "fileSystem");
        this.f22323a = new pe.d(fileSystem, directory, 201105, 2, j10, qe.e.f24785i);
    }

    private final void b(pe.d.b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            bVar.a();
        } catch (IOException unused) {
        }
    }

    public final b0 c(z request) {
        kotlin.jvm.internal.t.f(request, "request");
        try {
            pe.d.C0395d c0395dZ = this.f22323a.z(f22322g.b(request.j()));
            if (c0395dZ == null) {
                return null;
            }
            try {
                C0369c c0369c = new C0369c(c0395dZ.c(0));
                b0 b0VarD = c0369c.d(c0395dZ);
                if (c0369c.b(request, b0VarD)) {
                    return b0VarD;
                }
                c0 c0VarB = b0VarD.b();
                if (c0VarB != null) {
                    ne.d.m(c0VarB);
                }
                return null;
            } catch (IOException unused) {
                ne.d.m(c0395dZ);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22323a.close();
    }

    public final int e() {
        return this.f22325c;
    }

    public final int f() {
        return this.f22324b;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f22323a.flush();
    }

    public final pe.b h(b0 response) {
        pe.d.b bVarV;
        kotlin.jvm.internal.t.f(response, "response");
        String strH = response.G().h();
        if (se.f.f25431a.a(response.G().h())) {
            try {
                k(response.G());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.t.a(strH, "GET")) {
            return null;
        }
        b bVar = f22322g;
        if (bVar.a(response)) {
            return null;
        }
        C0369c c0369c = new C0369c(response);
        try {
            bVarV = pe.d.v(this.f22323a, bVar.b(response.G().j()), 0L, 2, null);
            if (bVarV == null) {
                return null;
            }
            try {
                c0369c.f(bVarV);
                return new d(this, bVarV);
            } catch (IOException unused2) {
                b(bVarV);
                return null;
            }
        } catch (IOException unused3) {
            bVarV = null;
        }
    }

    public final void k(z request) throws IOException {
        kotlin.jvm.internal.t.f(request, "request");
        this.f22323a.a0(f22322g.b(request.j()));
    }

    public final void n(int i10) {
        this.f22325c = i10;
    }

    public final void o(int i10) {
        this.f22324b = i10;
    }

    public final synchronized void p() {
        this.f22327e++;
    }

    public final synchronized void s(pe.c cacheStrategy) {
        kotlin.jvm.internal.t.f(cacheStrategy, "cacheStrategy");
        this.f22328f++;
        if (cacheStrategy.b() != null) {
            this.f22326d++;
        } else if (cacheStrategy.a() != null) {
            this.f22327e++;
        }
    }

    public final void t(b0 cached, b0 network) {
        pe.d.b bVarB;
        kotlin.jvm.internal.t.f(cached, "cached");
        kotlin.jvm.internal.t.f(network, "network");
        C0369c c0369c = new C0369c(network);
        c0 c0VarB = cached.b();
        if (c0VarB == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            bVarB = ((a) c0VarB).b().b();
            if (bVarB == null) {
                return;
            }
            try {
                c0369c.f(bVarB);
                bVarB.b();
            } catch (IOException unused) {
                b(bVarB);
            }
        } catch (IOException unused2) {
            bVarB = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(File directory, long j10) {
        this(directory, j10, ve.a.f27482b);
        kotlin.jvm.internal.t.f(directory, "directory");
    }

    /* JADX INFO: renamed from: me.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cache.kt */
    private static final class C0369c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f22335k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f22336l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f22337m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f22338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f22339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f22340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y f22341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f22342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f22343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t f22344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final s f22345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f22346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f22347j;

        /* JADX INFO: renamed from: me.c$c$a */
        /* JADX INFO: compiled from: Cache.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        static {
            we.h.a aVar = we.h.f27895a;
            f22336l = kotlin.jvm.internal.t.n(aVar.g().g(), "-Sent-Millis");
            f22337m = kotlin.jvm.internal.t.n(aVar.g().g(), "-Received-Millis");
        }

        public C0369c(af.c0 rawSource) throws IOException {
            kotlin.jvm.internal.t.f(rawSource, "rawSource");
            try {
                af.g gVarD = af.q.d(rawSource);
                String utf8LineStrict = gVarD.readUtf8LineStrict();
                u uVarF = u.f22538k.f(utf8LineStrict);
                if (uVarF == null) {
                    IOException iOException = new IOException(kotlin.jvm.internal.t.n("Cache corruption for ", utf8LineStrict));
                    we.h.f27895a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f22338a = uVarF;
                this.f22340c = gVarD.readUtf8LineStrict();
                t.a aVar = new t.a();
                int iC = c.f22322g.c(gVarD);
                int i10 = 0;
                while (i10 < iC) {
                    i10++;
                    aVar.b(gVarD.readUtf8LineStrict());
                }
                this.f22339b = aVar.d();
                se.k kVarA = se.k.f25447d.a(gVarD.readUtf8LineStrict());
                this.f22341d = kVarA.f25448a;
                this.f22342e = kVarA.f25449b;
                this.f22343f = kVarA.f25450c;
                t.a aVar2 = new t.a();
                int iC2 = c.f22322g.c(gVarD);
                int i11 = 0;
                while (i11 < iC2) {
                    i11++;
                    aVar2.b(gVarD.readUtf8LineStrict());
                }
                String str = f22336l;
                String strE = aVar2.e(str);
                String str2 = f22337m;
                String strE2 = aVar2.e(str2);
                aVar2.g(str);
                aVar2.g(str2);
                long j10 = 0;
                this.f22346i = strE == null ? 0L : Long.parseLong(strE);
                if (strE2 != null) {
                    j10 = Long.parseLong(strE2);
                }
                this.f22347j = j10;
                this.f22344g = aVar2.d();
                if (a()) {
                    String utf8LineStrict2 = gVarD.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                    }
                    this.f22345h = s.f22527e.b(!gVarD.exhausted() ? e0.f22389b.a(gVarD.readUtf8LineStrict()) : e0.SSL_3_0, i.f22412b.b(gVarD.readUtf8LineStrict()), c(gVarD), c(gVarD));
                } else {
                    this.f22345h = null;
                }
                g0 g0Var = g0.f27756a;
                fd.b.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(rawSource, th);
                    throw th2;
                }
            }
        }

        private final boolean a() {
            return kotlin.jvm.internal.t.a(this.f22338a.p(), "https");
        }

        private final List<Certificate> c(af.g gVar) throws IOException {
            int iC = c.f22322g.c(gVar);
            if (iC == -1) {
                return kotlin.collections.t.k();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                int i10 = 0;
                while (i10 < iC) {
                    i10++;
                    String utf8LineStrict = gVar.readUtf8LineStrict();
                    af.e eVar = new af.e();
                    af.h hVarA = af.h.f361d.a(utf8LineStrict);
                    kotlin.jvm.internal.t.c(hVarA);
                    eVar.D(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(eVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(af.f fVar, List<? extends Certificate> list) throws IOException {
            try {
                fVar.writeDecimalLong(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    af.h.a aVar = af.h.f361d;
                    kotlin.jvm.internal.t.e(bytes, "bytes");
                    fVar.writeUtf8(af.h.a.f(aVar, bytes, 0, 0, 3, null).b()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(z request, b0 response) {
            kotlin.jvm.internal.t.f(request, "request");
            kotlin.jvm.internal.t.f(response, "response");
            return kotlin.jvm.internal.t.a(this.f22338a, request.j()) && kotlin.jvm.internal.t.a(this.f22340c, request.h()) && c.f22322g.g(response, this.f22339b, request);
        }

        public final b0 d(pe.d.C0395d snapshot) {
            kotlin.jvm.internal.t.f(snapshot, "snapshot");
            String strA = this.f22344g.a("Content-Type");
            String strA2 = this.f22344g.a("Content-Length");
            return new b0.a().s(new z.a().o(this.f22338a).g(this.f22340c, null).f(this.f22339b).b()).q(this.f22341d).g(this.f22342e).n(this.f22343f).l(this.f22344g).b(new a(snapshot, strA, strA2)).j(this.f22345h).t(this.f22346i).r(this.f22347j).c();
        }

        public final void f(pe.d.b editor) throws IOException {
            kotlin.jvm.internal.t.f(editor, "editor");
            af.f fVarC = af.q.c(editor.f(0));
            try {
                fVarC.writeUtf8(this.f22338a.toString()).writeByte(10);
                fVarC.writeUtf8(this.f22340c).writeByte(10);
                fVarC.writeDecimalLong(this.f22339b.size()).writeByte(10);
                int size = this.f22339b.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    fVarC.writeUtf8(this.f22339b.c(i10)).writeUtf8(": ").writeUtf8(this.f22339b.e(i10)).writeByte(10);
                    i10 = i11;
                }
                fVarC.writeUtf8(new se.k(this.f22341d, this.f22342e, this.f22343f).toString()).writeByte(10);
                fVarC.writeDecimalLong(this.f22344g.size() + 2).writeByte(10);
                int size2 = this.f22344g.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    fVarC.writeUtf8(this.f22344g.c(i12)).writeUtf8(": ").writeUtf8(this.f22344g.e(i12)).writeByte(10);
                }
                fVarC.writeUtf8(f22336l).writeUtf8(": ").writeDecimalLong(this.f22346i).writeByte(10);
                fVarC.writeUtf8(f22337m).writeUtf8(": ").writeDecimalLong(this.f22347j).writeByte(10);
                if (a()) {
                    fVarC.writeByte(10);
                    s sVar = this.f22345h;
                    kotlin.jvm.internal.t.c(sVar);
                    fVarC.writeUtf8(sVar.a().c()).writeByte(10);
                    e(fVarC, this.f22345h.d());
                    e(fVarC, this.f22345h.c());
                    fVarC.writeUtf8(this.f22345h.e().c()).writeByte(10);
                }
                g0 g0Var = g0.f27756a;
                fd.b.a(fVarC, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(fVarC, th);
                    throw th2;
                }
            }
        }

        public C0369c(b0 response) {
            kotlin.jvm.internal.t.f(response, "response");
            this.f22338a = response.G().j();
            this.f22339b = c.f22322g.f(response);
            this.f22340c = response.G().h();
            this.f22341d = response.C();
            this.f22342e = response.h();
            this.f22343f = response.u();
            this.f22344g = response.s();
            this.f22345h = response.n();
            this.f22346i = response.H();
            this.f22347j = response.F();
        }
    }
}
