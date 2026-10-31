package pe;

import af.a0;
import af.d0;
import af.f;
import af.g;
import af.q;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import me.b0;
import me.r;
import me.t;
import me.v;
import me.y;
import me.z;
import rd.c0;
import se.h;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0394a f24270b = new C0394a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final me.c f24271a;

    /* JADX INFO: renamed from: pe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheInterceptor.kt */
    public static final class C0394a {
        private C0394a() {
        }

        public /* synthetic */ C0394a(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final t c(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                String strC = tVar.c(i11);
                String strE = tVar.e(i11);
                if ((!c0.B("Warning", strC, true) || !c0.O(strE, AppEventsConstants.EVENT_PARAM_VALUE_YES, false, 2, null)) && (d(strC) || !e(strC) || tVar2.a(strC) == null)) {
                    aVar.c(strC, strE);
                }
                i11 = i12;
            }
            int size2 = tVar2.size();
            while (i10 < size2) {
                int i13 = i10 + 1;
                String strC2 = tVar2.c(i10);
                if (!d(strC2) && e(strC2)) {
                    aVar.c(strC2, tVar2.e(i10));
                }
                i10 = i13;
            }
            return aVar.d();
        }

        private final boolean d(String str) {
            return c0.B("Content-Length", str, true) || c0.B("Content-Encoding", str, true) || c0.B("Content-Type", str, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b0 f(b0 b0Var) {
            return (b0Var == null ? null : b0Var.b()) != null ? b0Var.z().b(null).c() : b0Var;
        }

        private final boolean e(String str) {
            return (c0.B("Connection", str, true) || c0.B("Keep-Alive", str, true) || c0.B("Proxy-Authenticate", str, true) || c0.B("Proxy-Authorization", str, true) || c0.B("TE", str, true) || c0.B(edUJlCZxhVnO.OTIJsSD, str, true) || c0.B("Transfer-Encoding", str, true) || c0.B("Upgrade", str, true)) ? false : true;
        }
    }

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    public static final class b implements af.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f24272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f24273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pe.b f24274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f24275d;

        b(g gVar, pe.b bVar, f fVar) {
            this.f24273b = gVar;
            this.f24274c = bVar;
            this.f24275d = fVar;
        }

        @Override // af.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f24272a && !ne.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f24272a = true;
                this.f24274c.abort();
            }
            this.f24273b.close();
        }

        @Override // af.c0
        public long read(af.e sink, long j10) throws IOException {
            kotlin.jvm.internal.t.f(sink, "sink");
            try {
                long j11 = this.f24273b.read(sink, j10);
                if (j11 != -1) {
                    sink.o(this.f24275d.getBuffer(), sink.size() - j11, j11);
                    this.f24275d.emitCompleteSegments();
                    return j11;
                }
                if (!this.f24272a) {
                    this.f24272a = true;
                    this.f24275d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (!this.f24272a) {
                    this.f24272a = true;
                    this.f24274c.abort();
                }
                throw e10;
            }
        }

        @Override // af.c0
        public d0 timeout() {
            return this.f24273b.timeout();
        }
    }

    public a(me.c cVar) {
        this.f24271a = cVar;
    }

    private final b0 a(pe.b bVar, b0 b0Var) throws IOException {
        if (bVar == null) {
            return b0Var;
        }
        a0 a0VarBody = bVar.body();
        me.c0 c0VarB = b0Var.b();
        kotlin.jvm.internal.t.c(c0VarB);
        b bVar2 = new b(c0VarB.source(), bVar, q.c(a0VarBody));
        return b0Var.z().b(new h(b0.p(b0Var, "Content-Type", null, 2, null), b0Var.b().contentLength(), q.d(bVar2))).c();
    }

    @Override // me.v
    public b0 intercept(v.a chain) throws IOException {
        me.c0 c0VarB;
        me.c0 c0VarB2;
        me.c0 c0VarB3;
        kotlin.jvm.internal.t.f(chain, "chain");
        me.e eVarCall = chain.call();
        me.c cVar = this.f24271a;
        b0 b0VarC = cVar == null ? null : cVar.c(chain.request());
        c cVarB = new c.b(System.currentTimeMillis(), chain.request(), b0VarC).b();
        z zVarB = cVarB.b();
        b0 b0VarA = cVarB.a();
        me.c cVar2 = this.f24271a;
        if (cVar2 != null) {
            cVar2.s(cVarB);
        }
        re.e eVar = eVarCall instanceof re.e ? (re.e) eVarCall : null;
        r rVarO = eVar != null ? eVar.o() : null;
        if (rVarO == null) {
            rVarO = r.f22526b;
        }
        if (b0VarC != null && b0VarA == null && (c0VarB3 = b0VarC.b()) != null) {
            ne.d.m(c0VarB3);
        }
        if (zVarB == null && b0VarA == null) {
            b0 b0VarC2 = new b0.a().s(chain.request()).q(y.HTTP_1_1).g(504).n("Unsatisfiable Request (only-if-cached)").b(ne.d.f22993c).t(-1L).r(System.currentTimeMillis()).c();
            rVarO.A(eVarCall, b0VarC2);
            return b0VarC2;
        }
        if (zVarB == null) {
            kotlin.jvm.internal.t.c(b0VarA);
            b0 b0VarC3 = b0VarA.z().d(f24270b.f(b0VarA)).c();
            rVarO.b(eVarCall, b0VarC3);
            return b0VarC3;
        }
        if (b0VarA != null) {
            rVarO.a(eVarCall, b0VarA);
        } else if (this.f24271a != null) {
            rVarO.c(eVarCall);
        }
        try {
            b0 b0VarA2 = chain.a(zVarB);
            if (b0VarA2 == null && b0VarC != null && (c0VarB2 = b0VarC.b()) != null) {
                ne.d.m(c0VarB2);
            }
            if (b0VarA != null) {
                boolean z10 = false;
                if (b0VarA2 != null && b0VarA2.h() == 304) {
                    z10 = true;
                }
                if (z10) {
                    b0.a aVarZ = b0VarA.z();
                    C0394a c0394a = f24270b;
                    b0 b0VarC4 = aVarZ.l(c0394a.c(b0VarA.s(), b0VarA2.s())).t(b0VarA2.H()).r(b0VarA2.F()).d(c0394a.f(b0VarA)).o(c0394a.f(b0VarA2)).c();
                    me.c0 c0VarB4 = b0VarA2.b();
                    kotlin.jvm.internal.t.c(c0VarB4);
                    c0VarB4.close();
                    me.c cVar3 = this.f24271a;
                    kotlin.jvm.internal.t.c(cVar3);
                    cVar3.p();
                    this.f24271a.t(b0VarA, b0VarC4);
                    rVarO.b(eVarCall, b0VarC4);
                    return b0VarC4;
                }
                me.c0 c0VarB5 = b0VarA.b();
                if (c0VarB5 != null) {
                    ne.d.m(c0VarB5);
                }
            }
            kotlin.jvm.internal.t.c(b0VarA2);
            b0.a aVarZ2 = b0VarA2.z();
            C0394a c0394a2 = f24270b;
            b0 b0VarC5 = aVarZ2.d(c0394a2.f(b0VarA)).o(c0394a2.f(b0VarA2)).c();
            if (this.f24271a != null) {
                if (se.e.b(b0VarC5) && c.f24276c.a(b0VarC5, zVarB)) {
                    b0 b0VarA3 = a(this.f24271a.h(b0VarC5), b0VarC5);
                    if (b0VarA != null) {
                        rVarO.c(eVarCall);
                    }
                    return b0VarA3;
                }
                if (se.f.f25431a.a(zVarB.h())) {
                    try {
                        this.f24271a.k(zVarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return b0VarC5;
        } catch (Throwable th) {
            if (b0VarC != null && (c0VarB = b0VarC.b()) != null) {
                ne.d.m(c0VarB);
            }
            throw th;
        }
    }
}
