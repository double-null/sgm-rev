package xb;

import android.os.SystemClock;
import com.vungle.ads.internal.protos.Sdk;
import d5.LXP.wcAlQCOdREZdI;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.f0;
import sc.NfwM.XDucgbzInpQa;
import ud.k0;
import ud.o0;
import ud.p0;
import ud.t2;
import ud.v0;
import wc.g0;

/* JADX INFO: compiled from: MediaFileCacheManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f28277l = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f28278m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f28279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zb.a f28280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ac.c f28281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wb.w f28282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bc.c f28283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f28284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c f28285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.k f28286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final de.a f28287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f28288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Set<Object>> f28289k;

    /* JADX INFO: renamed from: xb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class C0471a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f28291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f28292c;

        public C0471a(boolean z10, boolean z11, boolean z12) {
            this.f28290a = z10;
            this.f28291b = z11;
            this.f28292c = z12;
        }

        public final boolean a() {
            return this.f28291b;
        }

        public final boolean b() {
            return this.f28292c;
        }

        public final boolean c() {
            return this.f28290a;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class a0 extends kotlin.jvm.internal.u implements id.a<o0> {
        a0() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(a.this.f28282d.e()));
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class b0 extends kotlin.jvm.internal.u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f28294d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(Object obj) {
            super(0);
            this.f28294d = obj;
        }

        @Override // id.a
        public final String invoke() {
            return "Unhold holder's media files, holder: " + this.f28294d;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0471a f28295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f28296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f28297c;

        public c(C0471a cleanConfiguration, d connectionConfiguration, g policyConfiguration) {
            kotlin.jvm.internal.t.f(cleanConfiguration, "cleanConfiguration");
            kotlin.jvm.internal.t.f(connectionConfiguration, "connectionConfiguration");
            kotlin.jvm.internal.t.f(policyConfiguration, "policyConfiguration");
            this.f28295a = cleanConfiguration;
            this.f28296b = connectionConfiguration;
            this.f28297c = policyConfiguration;
        }

        public final C0471a a() {
            return this.f28295a;
        }

        public final d b() {
            return this.f28296b;
        }

        public final g c() {
            return this.f28297c;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$withContextAndLock$2", f = "MediaFileCacheManager.kt", l = {601, 402}, m = "invokeSuspend")
    static final class c0<T> extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super T>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28298h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28299i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28300j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f28301k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ de.a f28302l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ id.p<o0, zc.f<? super T>, Object> f28303m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c0(de.a aVar, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super c0> fVar) {
            super(2, fVar);
            this.f28302l = aVar;
            this.f28303m = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            c0 c0Var = new c0(this.f28302l, this.f28303m, fVar);
            c0Var.f28301k = obj;
            return c0Var;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super T> fVar) {
            return ((c0) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o0 o0Var;
            de.a aVar;
            id.p<o0, zc.f<? super T>, Object> pVar;
            de.a aVar2;
            Throwable th;
            Object objF = ad.d.f();
            int i10 = this.f28300j;
            try {
                if (i10 == 0) {
                    wc.s.b(obj);
                    o0Var = (o0) this.f28301k;
                    aVar = this.f28302l;
                    pVar = this.f28303m;
                    this.f28301k = o0Var;
                    this.f28298h = aVar;
                    this.f28299i = pVar;
                    this.f28300j = 1;
                    if (aVar.d(null, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (de.a) this.f28301k;
                        try {
                            wc.s.b(obj);
                            aVar2.c(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.c(null);
                            throw th;
                        }
                    }
                    pVar = (id.p) this.f28299i;
                    de.a aVar3 = (de.a) this.f28298h;
                    o0Var = (o0) this.f28301k;
                    wc.s.b(obj);
                    aVar = aVar3;
                }
                this.f28301k = aVar;
                this.f28298h = null;
                this.f28299i = null;
                this.f28300j = 2;
                Object objInvoke = pVar.invoke(o0Var, this);
                if (objInvoke == objF) {
                    return objF;
                }
                aVar2 = aVar;
                obj = objInvoke;
                aVar2.c(null);
                return obj;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.c(null);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f28304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f28305b;

        public /* synthetic */ d(long j10, long j11, kotlin.jvm.internal.k kVar) {
            this(j10, j11);
        }

        public final long a() {
            return this.f28305b;
        }

        public final long b() {
            return this.f28304a;
        }

        private d(long j10, long j11) {
            this.f28304a = j10;
            this.f28305b = j11;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f28306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f28307b;

        public e(h maxPingTimeMs, h maxFileSizeBytes) {
            kotlin.jvm.internal.t.f(maxPingTimeMs, "maxPingTimeMs");
            kotlin.jvm.internal.t.f(maxFileSizeBytes, "maxFileSizeBytes");
            this.f28306a = maxPingTimeMs;
            this.f28307b = maxFileSizeBytes;
        }

        public final h a() {
            return this.f28307b;
        }

        public final h b() {
            return this.f28306a;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f28308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f28309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f28310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f28311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final h f28312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h f28313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f28314g;

        public f(double d10, double d11, double d12, h maxTtlMs, h minFrequency, h maxImageSizeBytes, h maxVideoSizeBytes) {
            kotlin.jvm.internal.t.f(maxTtlMs, "maxTtlMs");
            kotlin.jvm.internal.t.f(minFrequency, "minFrequency");
            kotlin.jvm.internal.t.f(maxImageSizeBytes, "maxImageSizeBytes");
            kotlin.jvm.internal.t.f(maxVideoSizeBytes, "maxVideoSizeBytes");
            this.f28308a = d10;
            this.f28309b = d11;
            this.f28310c = d12;
            this.f28311d = maxTtlMs;
            this.f28312e = minFrequency;
            this.f28313f = maxImageSizeBytes;
            this.f28314g = maxVideoSizeBytes;
        }

        public final double a() {
            return this.f28310c;
        }

        public final h b() {
            return this.f28313f;
        }

        public final h c() {
            return this.f28311d;
        }

        public final h d() {
            return this.f28314g;
        }

        public final double e() {
            return this.f28309b;
        }

        public final h f() {
            return this.f28312e;
        }

        public final double g() {
            return this.f28308a;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f28315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<f> f28316b;

        public g(e downloadPolicy, List<f> evictionPolicyList) {
            kotlin.jvm.internal.t.f(downloadPolicy, "downloadPolicy");
            kotlin.jvm.internal.t.f(evictionPolicyList, "evictionPolicyList");
            this.f28315a = downloadPolicy;
            this.f28316b = evictionPolicyList;
        }

        public final e a() {
            return this.f28315a;
        }

        public final List<f> b() {
            return this.f28316b;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f28317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f28318b;

        public h(long j10, double d10) {
            this.f28317a = j10;
            this.f28318b = d10;
        }

        public final double a(double d10) {
            long j10 = this.f28317a;
            if (j10 == 0) {
                return 0.0d;
            }
            return this.f28318b * od.k.h(d10 / j10, 0.0d, 1.0d);
        }

        public final double b(double d10) {
            long j10 = this.f28317a;
            if (j10 == 0) {
                return 0.0d;
            }
            return this.f28318b * od.k.h(((double) 1) - (d10 / j10), 0.0d, 1.0d);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f28320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f28321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f28322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f28323e;

        public /* synthetic */ i(String str, long j10, String str2, long j11, double d10, kotlin.jvm.internal.k kVar) {
            this(str, j10, str2, j11, d10);
        }

        public static /* synthetic */ i b(i iVar, String str, long j10, String str2, long j11, double d10, int i10, Object obj) {
            return iVar.a((i10 & 1) != 0 ? iVar.f28319a : str, (i10 & 2) != 0 ? iVar.f28320b : j10, (i10 & 4) != 0 ? iVar.f28321c : str2, (i10 & 8) != 0 ? iVar.f28322d : j11, (i10 & 16) != 0 ? iVar.f28323e : d10);
        }

        public final String c() {
            return this.f28321c;
        }

        public final long d() {
            return this.f28320b;
        }

        public final double e() {
            return this.f28323e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.t.a(this.f28319a, iVar.f28319a) && sd.a.k(this.f28320b, iVar.f28320b) && kotlin.jvm.internal.t.a(this.f28321c, iVar.f28321c) && this.f28322d == iVar.f28322d && Double.compare(this.f28323e, iVar.f28323e) == 0;
        }

        public final long f() {
            return this.f28322d;
        }

        public final String g() {
            return this.f28319a;
        }

        public int hashCode() {
            return (((((((this.f28319a.hashCode() * 31) + sd.a.x(this.f28320b)) * 31) + this.f28321c.hashCode()) * 31) + Long.hashCode(this.f28322d)) * 31) + Double.hashCode(this.f28323e);
        }

        public String toString() {
            return "RemoteMediaFileInfo(url=" + this.f28319a + ", pingTime=" + ((Object) sd.a.H(this.f28320b)) + ", contentType=" + this.f28321c + ", size=" + this.f28322d + ", score=" + this.f28323e + ')';
        }

        private i(String str, long j10, String str2, long j11, double d10) {
            this.f28319a = str;
            this.f28320b = j10;
            this.f28321c = str2;
            this.f28322d = j11;
            this.f28323e = d10;
        }

        public final i a(String url, long j10, String str, long j11, double d10) {
            kotlin.jvm.internal.t.f(url, "url");
            kotlin.jvm.internal.t.f(str, XDucgbzInpQa.RmuWuVyubBRCavG);
            return new i(url, j10, str, j11, d10, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ i(String str, long j10, String str2, long j11, double d10, int i10, kotlin.jvm.internal.k kVar) {
            long jS;
            if ((i10 & 2) != 0) {
                sd.a.C0418a c0418a = sd.a.f25407b;
                jS = sd.c.s(0, sd.d.MILLISECONDS);
            } else {
                jS = j10;
            }
            this(str, jS, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? Long.MAX_VALUE : j11, (i10 & 16) != 0 ? 0.0d : d10, null);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager", f = "MediaFileCacheManager.kt", l = {276, 286}, m = "awaitDownloadTask-0E7RQCE")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28324h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28325i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f28326j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f28328l;

        j(zc.f<? super j> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f28326j = obj;
            this.f28328l |= Integer.MIN_VALUE;
            Object objQ = a.this.q(null, null, this);
            return objQ == ad.d.f() ? objQ : wc.r.b(objQ);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$cleanup$2", f = "MediaFileCacheManager.kt", l = {369}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28329h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28330i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f28331j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f28332k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f28333l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f28334m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f28335n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f28336o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c f28337p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a f28338q;

        /* JADX INFO: renamed from: xb.a$k$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class C0472a extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0472a f28339d = new C0472a();

            C0472a() {
                super(0);
            }

            @Override // id.a
            public final String invoke() {
                return "Cleanup is skipped due to empty eviction policy list";
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class b extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ac.c.b f28340d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ac.c.b bVar) {
                super(0);
                this.f28340d = bVar;
            }

            @Override // id.a
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cleanup is skipped due not existing eviction policy (free space ");
                ac.c.b bVar = this.f28340d;
                sb2.append(bVar != null ? Double.valueOf(bVar.a()) : null);
                sb2.append("%)");
                return sb2.toString();
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class c extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f28341d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(File file) {
                super(0);
                this.f28341d = file;
            }

            @Override // id.a
            public final String invoke() {
                return "Remove from cache: " + this.f28341d.getName();
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class d extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0 f28342d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(f0 f0Var) {
                super(0);
                this.f28342d = f0Var;
            }

            @Override // id.a
            public final String invoke() {
                return "Cleanup is finished, total removed count: " + this.f28342d.f21511a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c cVar, a aVar, zc.f<? super k> fVar) {
            super(2, fVar);
            this.f28337p = cVar;
            this.f28338q = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a aVar, File file) {
            kotlin.jvm.internal.t.e(file, "file");
            return aVar.C(file);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new k(this.f28337p, this.f28338q, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((k) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0122  */
        /* JADX WARN: Code duplicated, block: B:48:0x012d  */
        /* JADX WARN: Code duplicated, block: B:49:0x0130  */
        /* JADX WARN: Code duplicated, block: B:51:0x014a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x014b  */
        /* JADX WARN: Code duplicated, block: B:55:0x0158  */
        /* JADX WARN: Code duplicated, block: B:56:0x0160  */
        /* JADX WARN: Code duplicated, block: B:58:0x0194  */
        /* JADX WARN: Code duplicated, block: B:59:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:62:0x01bd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x012d -> B:64:0x01e8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x014b -> B:53:0x0154). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.dex.attributes.AttributeStorage.contains(AttributeStorage.java:94)
            	at jadx.core.dex.attributes.AttrNode.contains(AttrNode.java:103)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextIfNodeInfo(IfRegionMaker.java:613)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.getNextIf(IfRegionMaker.java:602)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.mergeNestedIfNodes(IfRegionMaker.java:409)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:68)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 524
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xb.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager", f = "MediaFileCacheManager.kt", l = {180}, m = "getMediaFile-gIAlu-s")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28343h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28345j;

        l(zc.f<? super l> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f28343h = obj;
            this.f28345j |= Integer.MIN_VALUE;
            Object objU = a.this.u(null, this);
            return objU == ad.d.f() ? objU : wc.r.b(objU);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFile$4", f = "MediaFileCacheManager.kt", l = {181, 184}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super wc.r<? extends File>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28346h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f28347i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<String> f28349k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List<String> list, zc.f<? super m> fVar) {
            super(2, fVar);
            this.f28349k = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new m(this.f28349k, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super wc.r<? extends File>> fVar) {
            return ((m) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objV;
            Object obj2;
            Object objF = ad.d.f();
            int i10 = this.f28347i;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                    objV = ((wc.r) obj).p();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f28346h;
                    wc.s.b(obj);
                }
                objV = obj2;
                return wc.r.b(objV);
            }
            wc.s.b(obj);
            a aVar = a.this;
            List<String> list = this.f28349k;
            this.f28347i = 1;
            objV = aVar.v(list, this);
            if (objV == objF) {
                return objF;
            }
            File file = (File) (wc.r.k(objV) ? null : objV);
            if (file != null) {
                a aVar2 = a.this;
                if (ac.b.g(file)) {
                    xb.d dVarY = aVar2.y();
                    this.f28346h = objV;
                    this.f28347i = 2;
                    Object objQ = dVarY.q(file, this);
                    if (objQ == objF) {
                        return objF;
                    }
                    obj2 = objV;
                    obj = objQ;
                    objV = obj2;
                } else {
                    aVar2.y().g(file);
                }
            }
            return wc.r.b(objV);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager", f = "MediaFileCacheManager.kt", l = {194}, m = "getMediaFileInternal-gIAlu-s")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f28350h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f28352j;

        n(zc.f<? super n> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f28350h = obj;
            this.f28352j |= Integer.MIN_VALUE;
            Object objV = a.this.v(null, this);
            return objV == ad.d.f() ? objV : wc.r.b(objV);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2", f = "MediaFileCacheManager.kt", l = {Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 232, 235, 251}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super wc.r<? extends File>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28353h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f28354i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<String> f28355j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a f28356k;

        /* JADX INFO: renamed from: xb.a$o$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class C0473a extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wc.q<String, File> f28357d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0473a(wc.q<String, ? extends File> qVar) {
                super(0);
                this.f28357d = qVar;
            }

            @Override // id.a
            public final String invoke() {
                return "Return from cache: " + this.f28357d.e();
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileInternal$2$2", f = "MediaFileCacheManager.kt", l = {252}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.l implements id.p<zb.a.b, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f28358h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f28359i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ a f28360j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ i f28361k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, i iVar, zc.f<? super b> fVar) {
                super(2, fVar);
                this.f28360j = aVar;
                this.f28361k = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                b bVar = new b(this.f28360j, this.f28361k, fVar);
                bVar.f28359i = obj;
                return bVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zb.a.b bVar, zc.f<? super g0> fVar) {
                return ((b) create(bVar, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objH;
                zb.a.b bVar;
                Object objF = ad.d.f();
                int i10 = this.f28358h;
                if (i10 == 0) {
                    wc.s.b(obj);
                    zb.a.b bVar2 = (zb.a.b) this.f28359i;
                    xb.d dVarY = this.f28360j.y();
                    File fileB = bVar2.b();
                    this.f28359i = bVar2;
                    this.f28358h = 1;
                    objH = dVarY.h(fileB, this);
                    if (objH == objF) {
                        return objF;
                    }
                    bVar = bVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (zb.a.b) this.f28359i;
                    wc.s.b(obj);
                    objH = obj;
                }
                xb.c cVar = (xb.c) objH;
                if (cVar == null) {
                    return g0.f27756a;
                }
                String strG = cVar.g();
                wb.s sVar = wb.s.f27716a;
                if (!sVar.g(strG)) {
                    strG = sVar.g(this.f28361k.c()) ? this.f28361k.c() : sVar.a(bVar.b());
                }
                this.f28360j.y().n(cVar.a((205 & 1) != 0 ? cVar.f28395a : null, (205 & 2) != 0 ? cVar.f28396b : strG, (205 & 4) != 0 ? cVar.f28397c : 0L, (205 & 8) != 0 ? cVar.f28398d : 0L, (205 & 16) != 0 ? cVar.f28399e : this.f28361k.d(), (205 & 32) != 0 ? cVar.f28400f : bVar.a(), (205 & 64) != 0 ? cVar.f28401g : null, (205 & 128) != 0 ? cVar.f28402h : null));
                return g0.f27756a;
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class c extends kotlin.jvm.internal.u implements id.l<String, wc.q<? extends String, ? extends File>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f28362d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a aVar) {
                super(1);
                this.f28362d = aVar;
            }

            @Override // id.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final wc.q<String, File> invoke(String mediaUrl) {
                kotlin.jvm.internal.t.f(mediaUrl, "mediaUrl");
                File fileZ = this.f28362d.z(mediaUrl);
                if (fileZ != null) {
                    return new wc.q<>(mediaUrl, fileZ);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(List<String> list, a aVar, zc.f<? super o> fVar) {
            super(2, fVar);
            this.f28355j = list;
            this.f28356k = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new o(this.f28355j, this.f28356k, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super wc.r<? extends File>> fVar) {
            return ((o) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:55:0x012f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            c cVar;
            Object objR;
            String next2;
            File fileZ;
            wc.q qVar;
            Object objQ;
            File parentFile;
            Object objF = ad.d.f();
            int i10 = this.f28354i;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                    objR = ((wc.r) obj).p();
                    return wc.r.b(objR);
                }
                if (i10 == 2) {
                    cVar = (c) this.f28353h;
                    wc.s.b(obj);
                    a aVar = this.f28356k;
                    List<String> list = this.f28355j;
                    this.f28353h = cVar;
                    this.f28354i = 3;
                    obj = aVar.H(cVar, list, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else if (i10 == 3) {
                    cVar = (c) this.f28353h;
                    wc.s.b(obj);
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                    objQ = ((wc.r) obj).p();
                }
                return wc.r.b(objQ);
            }
            wc.s.b(obj);
            if (this.f28355j.isEmpty()) {
                wc.r.a aVar2 = wc.r.f27774b;
                return wc.r.b(wc.r.c(wc.s.a(new Exception("Url list is empty"))));
            }
            c cVar2 = this.f28356k.f28285g;
            Iterator it = qd.r.w(kotlin.collections.b0.E(this.f28355j), new c(this.f28356k)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                qVar = (wc.q) next;
            } while (!(((File) qVar.f()).exists() && ((File) qVar.f()).length() > 0));
            wc.q qVar2 = (wc.q) next;
            if (qVar2 != null) {
                this.f28356k.f28283e.b("MediaFileCacheManager", new C0473a(qVar2));
                wc.r.a aVar3 = wc.r.f27774b;
                return wc.r.b(wc.r.c(qVar2.f()));
            }
            Iterator<String> it2 = this.f28355j.iterator();
            zb.a.c cVarA = null;
            while (it2.hasNext() && ((fileZ = this.f28356k.z((next2 = it2.next()))) == null || (cVarA = this.f28356k.f28280b.a(next2, fileZ)) == null)) {
            }
            zb.a.c cVar3 = cVarA;
            if (cVar3 != null) {
                a aVar4 = this.f28356k;
                this.f28354i = 1;
                objR = a.r(aVar4, cVar3, null, this, 2, null);
                if (objR == objF) {
                    return objF;
                }
                return wc.r.b(objR);
            }
            a aVar5 = this.f28356k;
            this.f28353h = cVar2;
            this.f28354i = 2;
            if (aVar5.E(this) == objF) {
                return objF;
            }
            cVar = cVar2;
            a aVar6 = this.f28356k;
            List<String> list2 = this.f28355j;
            this.f28353h = cVar;
            this.f28354i = 3;
            obj = aVar6.H(cVar, list2, this);
            if (obj == objF) {
                return objF;
            }
            i iVar = (i) obj;
            String strG = iVar.g();
            File fileZ2 = this.f28356k.z(strG);
            if (fileZ2 != null && (parentFile = fileZ2.getParentFile()) != null) {
                kotlin.coroutines.jvm.internal.b.a(parentFile.mkdirs());
            }
            if (fileZ2 == null) {
                wc.r.a aVar7 = wc.r.f27774b;
                return wc.r.b(wc.r.c(wc.s.a(new Exception("Can't create file for media file by url (" + strG + ')'))));
            }
            zb.a.c cVarC = this.f28356k.f28280b.c(strG, fileZ2, sd.a.e(cVar.b().a()));
            a aVar8 = this.f28356k;
            b bVar = new b(aVar8, iVar, null);
            this.f28353h = null;
            this.f28354i = 4;
            objQ = aVar8.q(cVarC, bVar, this);
            if (objQ == objF) {
                return objF;
            }
            return wc.r.b(objQ);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileMetadata$2", f = "MediaFileCacheManager.kt", l = {152}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super xb.c>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28363h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f28365j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(File file, zc.f<? super p> fVar) {
            super(2, fVar);
            this.f28365j = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new p(this.f28365j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super xb.c> fVar) {
            return ((p) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28363h;
            if (i10 == 0) {
                wc.s.b(obj);
                xb.d dVarY = a.this.y();
                File file = this.f28365j;
                this.f28363h = 1;
                obj = dVarY.h(file, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$getMediaFileMetadata$4", f = "MediaFileCacheManager.kt", l = {158}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super xb.c>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28366h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f28368j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, zc.f<? super q> fVar) {
            super(2, fVar);
            this.f28368j = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new q(this.f28368j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super xb.c> fVar) {
            return ((q) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28366h;
            if (i10 == 0) {
                wc.s.b(obj);
                a aVar = a.this;
                File fileZ = aVar.z(this.f28368j);
                if (fileZ == null) {
                    return null;
                }
                this.f28366h = 1;
                obj = aVar.w(fileZ, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class r extends kotlin.jvm.internal.u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f28369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f28370e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(File file, Object obj) {
            super(0);
            this.f28369d = file;
            this.f28370e = obj;
        }

        @Override // id.a
        public final String invoke() {
            return "Hold media file " + this.f28369d.getName() + ", holder: " + this.f28370e;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class s extends kotlin.jvm.internal.u implements id.a<xb.d> {
        s() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final xb.d invoke() {
            return new xb.d(a.this.f28282d, a.this.f28283e);
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class t extends kotlin.jvm.internal.u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final t f28372d = new t();

        t() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "Cleanup is triggered by cache started event";
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class u extends kotlin.jvm.internal.u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final u f28373d = new u();

        u() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "Cleanup is triggered by low disk space event";
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$onLowDiskSpace$2", f = "MediaFileCacheManager.kt", l = {81}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28374h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c f28376j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(c cVar, zc.f<? super v> fVar) {
            super(2, fVar);
            this.f28376j = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new v(this.f28376j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((v) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28374h;
            if (i10 == 0) {
                wc.s.b(obj);
                a aVar = a.this;
                c cVar = this.f28376j;
                this.f28374h = 1;
                if (aVar.s(cVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class w extends kotlin.jvm.internal.u implements id.a<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final w f28377d = new w();

        w() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            return "Cleanup is triggered by new session event";
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$onSessionStarted$2", f = "MediaFileCacheManager.kt", l = {65}, m = "invokeSuspend")
    static final class x extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28378h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c f28380j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(c cVar, zc.f<? super x> fVar) {
            super(2, fVar);
            this.f28380j = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return a.this.new x(this.f28380j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((x) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f28378h;
            if (i10 == 0) {
                wc.s.b(obj);
                a aVar = a.this;
                c cVar = this.f28380j;
                this.f28378h = 1;
                if (aVar.s(cVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$pickRemoteMediaFile$2", f = "MediaFileCacheManager.kt", l = {303}, m = "invokeSuspend")
    static final class y extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super i>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f28381h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f28382i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f28383j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ c f28385l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List<String> f28386m;

        /* JADX INFO: renamed from: xb.a$y$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class C0474a extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<String> f28387d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0474a(List<String> list) {
                super(0);
                this.f28387d = list;
            }

            @Override // id.a
            public final String invoke() {
                return "Start picking best file from:\n" + kotlin.collections.b0.V(this.f28387d, "\n", null, null, 0, null, null, 62, null);
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        static final class b extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<i> f28388d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List<i> list) {
                super(0);
                this.f28388d = list;
            }

            @Override // id.a
            public final String invoke() {
                return "Download and score stat:\n" + kotlin.collections.b0.V(this.f28388d, "\n", null, null, 0, null, null, 62, null);
            }
        }

        /* JADX INFO: compiled from: MediaFileCacheManager.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileCacheManager$pickRemoteMediaFile$2$remoteMediaFileInfoList$1$1", f = "MediaFileCacheManager.kt", l = {Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.l implements id.p<o0, zc.f<? super wc.r<? extends zb.a.C0493a>>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f28389h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f28390i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f28391j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ long f28392k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a aVar, String str, long j10, zc.f<? super c> fVar) {
                super(2, fVar);
                this.f28390i = aVar;
                this.f28391j = str;
                this.f28392k = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
                return new c(this.f28390i, this.f28391j, this.f28392k, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f<? super wc.r<zb.a.C0493a>> fVar) {
                return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objB;
                Object objF = ad.d.f();
                int i10 = this.f28389h;
                if (i10 == 0) {
                    wc.s.b(obj);
                    zb.a aVar = this.f28390i.f28280b;
                    String str = this.f28391j;
                    sd.a aVarE = sd.a.e(this.f28392k);
                    this.f28389h = 1;
                    objB = aVar.b(str, aVarE, this);
                    if (objB == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                    objB = ((wc.r) obj).p();
                }
                return wc.r.b(objB);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(c cVar, List<String> list, zc.f<? super y> fVar) {
            super(2, fVar);
            this.f28385l = cVar;
            this.f28386m = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            y yVar = a.this.new y(this.f28385l, this.f28386m, fVar);
            yVar.f28383j = obj;
            return yVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super i> fVar) {
            return ((y) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            long j10;
            Object objA;
            e eVar;
            Object objF = ad.d.f();
            int i10 = this.f28382i;
            String str2 = "MediaFileCacheManager";
            if (i10 == 0) {
                wc.s.b(obj);
                o0 o0Var = (o0) this.f28383j;
                a.this.f28283e.b("MediaFileCacheManager", new C0474a(this.f28386m));
                e eVarA = this.f28385l.c().a();
                long jB = this.f28385l.b().b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<String> list = this.f28386m;
                a aVar = a.this;
                ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(ud.k.b(o0Var, null, null, new c(aVar, (String) it.next(), jB, null), 3, null));
                    jElapsedRealtime = jElapsedRealtime;
                    arrayList = arrayList2;
                    aVar = aVar;
                    str2 = str2;
                }
                str = str2;
                j10 = jElapsedRealtime;
                this.f28383j = eVarA;
                this.f28381h = j10;
                this.f28382i = 1;
                objA = ud.f.a(arrayList, this);
                if (objA == objF) {
                    return objF;
                }
                eVar = eVarA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = this.f28381h;
                eVar = (e) this.f28383j;
                wc.s.b(obj);
                str = "MediaFileCacheManager";
                j10 = j11;
                objA = obj;
            }
            List<String> list2 = this.f28386m;
            ArrayList<i> arrayList3 = new ArrayList();
            int i11 = 0;
            for (Object obj2 : (Iterable) objA) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    kotlin.collections.t.t();
                }
                Object objP = ((wc.r) obj2).p();
                i iVar = null;
                if (wc.r.k(objP)) {
                    objP = null;
                }
                zb.a.C0493a c0493a = (zb.a.C0493a) objP;
                if (c0493a != null) {
                    String str3 = list2.get(i11);
                    long jC = c0493a.c();
                    String strB = c0493a.b();
                    if (strB == null) {
                        strB = wcAlQCOdREZdI.qGfragaEgxpXl;
                    }
                    String str4 = strB;
                    Long lA = c0493a.a();
                    iVar = new i(str3, jC, str4, lA != null ? lA.longValue() : Long.MAX_VALUE, 0.0d, 16, null);
                }
                if (iVar != null) {
                    arrayList3.add(iVar);
                }
                i11 = i12;
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.u.u(arrayList3, 10));
            for (i iVar2 : arrayList3) {
                arrayList4.add(i.b(iVar2, null, 0L, null, 0L, eVar.b().b(sd.a.p(iVar2.d())) + eVar.a().b(iVar2.f()), 15, null));
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j10;
            if (arrayList4.isEmpty()) {
                String str5 = (String) kotlin.collections.b0.O(this.f28386m);
                sd.a.C0418a c0418a = sd.a.f25407b;
                return new i(str5, sd.c.t(jElapsedRealtime2, sd.d.MILLISECONDS), null, 0L, 0.0d, 28, null);
            }
            Iterator it2 = arrayList4.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                double dE = ((i) next).e();
                do {
                    Object next2 = it2.next();
                    double dE2 = ((i) next2).e();
                    if (Double.compare(dE, dE2) < 0) {
                        next = next2;
                        dE = dE2;
                    }
                } while (it2.hasNext());
            }
            i iVar3 = (i) next;
            a.this.f28283e.b(str, new b(arrayList4));
            if (iVar3.e() > 1.0E-4d) {
                return iVar3;
            }
            Iterator it3 = arrayList4.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next3 = it3.next();
            if (it3.hasNext()) {
                long jF = ((i) next3).f();
                do {
                    Object next4 = it3.next();
                    long jF2 = ((i) next4).f();
                    if (jF > jF2) {
                        next3 = next4;
                        jF = jF2;
                    }
                } while (it3.hasNext());
            }
            return (i) next3;
        }
    }

    /* JADX INFO: compiled from: MediaFileCacheManager.kt */
    static final class z extends kotlin.jvm.internal.u implements id.a<String> {
        z() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Holder stat:");
            Object obj = a.this.f28288j;
            a aVar = a.this;
            synchronized (obj) {
                if (aVar.f28289k.isEmpty()) {
                    sb2.append("\n No active holds");
                } else {
                    for (Map.Entry entry : aVar.f28289k.entrySet()) {
                        sb2.append("\nFile: " + ((String) entry.getKey()) + "\nHolders: [" + kotlin.collections.b0.V((Iterable) entry.getValue(), ", ", null, null, 0, null, null, 62, null) + ']');
                    }
                    g0 g0Var = g0.f27756a;
                }
            }
            String string = sb2.toString();
            kotlin.jvm.internal.t.e(string, "sb.toString()");
            return string;
        }
    }

    static {
        C0471a c0471a = new C0471a(true, true, true);
        sd.a.C0418a c0418a = sd.a.f25407b;
        f28278m = new c(c0471a, new d(sd.c.s(10, sd.d.SECONDS), sd.c.s(10, sd.d.MINUTES), null), new g(new e(new h(500L, 0.8d), new h(5242880L, 0.4d)), kotlin.collections.s.e(new f(0.1d, 0.0d, 1.0d, new h(sd.a.p(sd.c.s(3, sd.d.DAYS)), 1.0d), new h(0L, 0.0d), new h(0L, 0.0d), new h(0L, 0.0d)))));
    }

    public a(File cacheDir, zb.a downloadManager, ac.c storageSpaceMonitor, wb.w dispatchers, bc.c logger) {
        kotlin.jvm.internal.t.f(cacheDir, "cacheDir");
        kotlin.jvm.internal.t.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.t.f(storageSpaceMonitor, "storageSpaceMonitor");
        kotlin.jvm.internal.t.f(dispatchers, "dispatchers");
        kotlin.jvm.internal.t.f(logger, "logger");
        this.f28279a = cacheDir;
        this.f28280b = downloadManager;
        this.f28281c = storageSpaceMonitor;
        this.f28282d = dispatchers;
        this.f28283e = logger;
        this.f28284f = wc.m.a(new a0());
        this.f28285g = f28278m;
        this.f28286h = wc.m.a(new s());
        this.f28287i = de.g.b(false, 1, null);
        this.f28288j = new Object();
        this.f28289k = new LinkedHashMap();
    }

    private final o0 A() {
        return (o0) this.f28284f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C(File file) {
        return rd.f0.k0(fd.j.n(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D(File file) {
        boolean z10;
        synchronized (this.f28288j) {
            z10 = this.f28289k.get(file.getPath()) != null;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(zc.f<? super g0> fVar) {
        c cVar = this.f28285g;
        if (!cVar.a().a()) {
            return g0.f27756a;
        }
        this.f28283e.b("MediaFileCacheManager", t.f28372d);
        Object objS = s(cVar, fVar);
        return objS == ad.d.f() ? objS : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(c cVar, List<String> list, zc.f<? super i> fVar) {
        return ud.i.g(this.f28282d.e(), new y(cVar, list, null), fVar);
    }

    private final void I() {
        this.f28283e.b("MediaFileCacheManager", new z());
    }

    private final <T> Object K(zc.j jVar, de.a aVar, id.p<? super o0, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) {
        return ud.i.g(jVar, new c0(aVar, pVar, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(zb.a.c cVar, id.p<? super zb.a.b, ? super zc.f<? super g0>, ? extends Object> pVar, zc.f<? super wc.r<? extends File>> fVar) throws Throwable {
        j jVar;
        String str;
        zb.a.b bVar;
        zb.a.b bVar2;
        if (fVar instanceof j) {
            jVar = (j) fVar;
            int i10 = jVar.f28328l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f28328l = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(fVar);
            }
        } else {
            jVar = new j(fVar);
        }
        Object obj = jVar.f28326j;
        Object objF = ad.d.f();
        int i11 = jVar.f28328l;
        if (i11 != 0) {
            if (i11 == 1) {
                str = (String) jVar.f28325i;
                pVar = (id.p) jVar.f28324h;
                wc.s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (zb.a.b) jVar.f28324h;
                wc.s.b(obj);
            }
            bVar = bVar2;
            wc.r.a aVar = wc.r.f27774b;
            return wc.r.c(bVar.b());
        }
        wc.s.b(obj);
        String strB = cVar.b();
        v0<wc.r<zb.a.b>> v0VarA = cVar.a();
        jVar.f28324h = pVar;
        jVar.f28325i = strB;
        jVar.f28328l = 1;
        Object objJ0 = v0VarA.j0(jVar);
        if (objJ0 == objF) {
            return objF;
        }
        obj = objJ0;
        str = strB;
        Object objP = ((wc.r) obj).p();
        if (wc.r.k(objP)) {
            Throwable thG = wc.r.g(objP);
            if (thG == null) {
                thG = new Exception("Unknown error while download " + str);
            }
            return wc.r.c(wc.s.a(thG));
        }
        if (wc.r.k(objP)) {
            objP = null;
        }
        bVar = (zb.a.b) objP;
        if (bVar == null || !bVar.b().exists()) {
            return wc.r.c(wc.s.a(new Exception("Download task (" + str + ") completed, but file not found")));
        }
        if (pVar != null) {
            jVar.f28324h = bVar;
            jVar.f28325i = null;
            jVar.f28328l = 2;
            if (pVar.invoke(bVar, jVar) == objF) {
                return objF;
            }
            bVar2 = bVar;
            bVar = bVar2;
        }
        wc.r.a aVar2 = wc.r.f27774b;
        return wc.r.c(bVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object r(a aVar, zb.a.c cVar, id.p pVar, zc.f fVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return aVar.q(cVar, pVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(c cVar, zc.f<? super g0> fVar) {
        Object objK = K(this.f28282d.e(), this.f28287i, new k(cVar, this, null), fVar);
        return objK == ad.d.f() ? objK : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(List<String> list, zc.f<? super wc.r<? extends File>> fVar) throws Throwable {
        n nVar;
        if (fVar instanceof n) {
            nVar = (n) fVar;
            int i10 = nVar.f28352j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f28352j = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(fVar);
            }
        } else {
            nVar = new n(fVar);
        }
        Object objG = nVar.f28350h;
        Object objF = ad.d.f();
        int i11 = nVar.f28352j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarE = this.f28282d.e();
            o oVar = new o(list, this, null);
            nVar.f28352j = 1;
            objG = ud.i.g(k0VarE, oVar, nVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xb.d y() {
        return (xb.d) this.f28286h.getValue();
    }

    public final void B(File mediaFile, Object holder) {
        kotlin.jvm.internal.t.f(mediaFile, "mediaFile");
        kotlin.jvm.internal.t.f(holder, "holder");
        this.f28283e.b("MediaFileCacheManager", new r(mediaFile, holder));
        synchronized (this.f28288j) {
            Set<Object> linkedHashSet = this.f28289k.get(mediaFile.getPath());
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                Map<String, Set<Object>> map = this.f28289k;
                String path = mediaFile.getPath();
                kotlin.jvm.internal.t.e(path, "mediaFile.path");
                map.put(path, linkedHashSet);
            }
            linkedHashSet.add(holder);
        }
        I();
    }

    public final void F() {
        c cVar = this.f28285g;
        if (cVar.a().b()) {
            this.f28283e.b("MediaFileCacheManager", u.f28373d);
            ud.k.d(A(), null, null, new v(cVar, null), 3, null);
        }
    }

    public final void G() {
        c cVar = this.f28285g;
        if (cVar.a().c()) {
            this.f28283e.b("MediaFileCacheManager", w.f28377d);
            ud.k.d(A(), null, null, new x(cVar, null), 3, null);
        }
    }

    public final void J(Object holder) {
        kotlin.jvm.internal.t.f(holder, "holder");
        this.f28283e.b("MediaFileCacheManager", new b0(holder));
        synchronized (this.f28288j) {
            for (String str : kotlin.collections.b0.p0(this.f28289k.keySet())) {
                Set<Object> set = this.f28289k.get(str);
                if (set != null) {
                    set.remove(holder);
                }
                if (set != null && set.isEmpty()) {
                    this.f28289k.remove(str);
                }
            }
            g0 g0Var = g0.f27756a;
        }
        I();
    }

    public final void t(c configuration) {
        kotlin.jvm.internal.t.f(configuration, "configuration");
        this.f28285g = configuration;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(List<String> list, zc.f<? super wc.r<? extends File>> fVar) throws Throwable {
        l lVar;
        if (fVar instanceof l) {
            lVar = (l) fVar;
            int i10 = lVar.f28345j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f28345j = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(fVar);
            }
        } else {
            lVar = new l(fVar);
        }
        Object objG = lVar.f28343h;
        Object objF = ad.d.f();
        int i11 = lVar.f28345j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarE = this.f28282d.e();
            m mVar = new m(list, null);
            lVar.f28345j = 1;
            objG = ud.i.g(k0VarE, mVar, lVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    public final Object w(File file, zc.f<? super xb.c> fVar) {
        return ud.i.g(this.f28282d.e(), new p(file, null), fVar);
    }

    public final Object x(String str, zc.f<? super xb.c> fVar) {
        return ud.i.g(this.f28282d.e(), new q(str, null), fVar);
    }

    public final File z(String url) {
        kotlin.jvm.internal.t.f(url, "url");
        return ac.b.b(this.f28279a, url);
    }
}
