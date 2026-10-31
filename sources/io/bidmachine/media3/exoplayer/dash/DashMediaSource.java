package io.bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;
import f8.j;
import f8.l;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.exoplayer.drm.i;
import io.bidmachine.media3.exoplayer.source.q;
import io.bidmachine.media3.exoplayer.source.t;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r8.k;
import s9.r;
import u7.b0;
import u7.d0;
import u7.s;
import x7.l0;
import z7.o;

/* JADX INFO: loaded from: classes4.dex */
public final class DashMediaSource extends io.bidmachine.media3.exoplayer.source.a {
    private Loader A;
    private o B;
    private IOException C;
    private Handler D;
    private s.g E;
    private Uri F;
    private Uri G;
    private f8.c H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private int O;
    private s P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z7.d.a f18354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a f18355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n8.e f18356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i f18357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.b f18358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e8.b f18359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f18360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f18361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.source.s.a f18362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.upstream.c.a<? extends f8.c> f18363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f18364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f18365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SparseArray<io.bidmachine.media3.exoplayer.dash.c> f18366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f18367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f18368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.dash.f.b f18369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final k f18370y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private z7.d f18371z;

    public static final class Factory implements t {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f18372l = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a f18373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z7.d.a f18374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r8.e.a f18375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g8.k f18376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n8.e f18377g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.b f18378h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f18379i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f18380j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private io.bidmachine.media3.exoplayer.upstream.c.a<? extends f8.c> f18381k;

        public Factory(z7.d.a aVar) {
            this(new io.bidmachine.media3.exoplayer.dash.d.a(aVar), aVar);
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public DashMediaSource f(s sVar) {
            x7.a.e(sVar.f26302b);
            io.bidmachine.media3.exoplayer.upstream.c.a dVar = this.f18381k;
            if (dVar == null) {
                dVar = new f8.d();
            }
            List<b0> list = sVar.f26302b.f26397d;
            io.bidmachine.media3.exoplayer.upstream.c.a bVar = !list.isEmpty() ? new m8.b(dVar, list) : dVar;
            r8.e.a aVar = this.f18375e;
            if (aVar != null) {
                aVar.a(sVar);
            }
            return new DashMediaSource(sVar, null, this.f18374d, bVar, this.f18373c, this.f18377g, null, this.f18376f.a(sVar), this.f18378h, this.f18379i, this.f18380j, null);
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        @Deprecated
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(boolean z10) {
            this.f18373c.c(z10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory b(int i10) {
            this.f18373c.b(i10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory e(r8.e.a aVar) {
            this.f18375e = (r8.e.a) x7.a.e(aVar);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory d(g8.k kVar) {
            this.f18376f = (g8.k) x7.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory g(io.bidmachine.media3.exoplayer.upstream.b bVar) {
            this.f18378h = (io.bidmachine.media3.exoplayer.upstream.b) x7.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory a(r.a aVar) {
            this.f18373c.a((r.a) x7.a.e(aVar));
            return this;
        }

        public Factory(io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, z7.d.a aVar) {
            this.f18373c = (io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a) x7.a.e(interfaceC0322a);
            this.f18374d = aVar;
            this.f18376f = new io.bidmachine.media3.exoplayer.drm.g();
            this.f18378h = new io.bidmachine.media3.exoplayer.upstream.a();
            this.f18379i = 30000L;
            this.f18380j = 5000000L;
            this.f18377g = new n8.f();
            c(true);
        }
    }

    class a implements s8.b.InterfaceC0413b {
        a() {
        }

        @Override // s8.b.InterfaceC0413b
        public void a(IOException iOException) {
            DashMediaSource.this.Y(iOException);
        }

        @Override // s8.b.InterfaceC0413b
        public void onInitialized() {
            DashMediaSource.this.Z(s8.b.i());
        }
    }

    private static final class b extends d0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f18383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f18384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f18385g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f18386h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f18387i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f18388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f18389k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final f8.c f18390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final s f18391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final s.g f18392n;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, f8.c cVar, s sVar, s.g gVar) {
            x7.a.g(cVar.f14668d == (gVar != null));
            this.f18383e = j10;
            this.f18384f = j11;
            this.f18385g = j12;
            this.f18386h = i10;
            this.f18387i = j13;
            this.f18388j = j14;
            this.f18389k = j15;
            this.f18390l = cVar;
            this.f18391m = sVar;
            this.f18392n = gVar;
        }

        private long s(long j10) {
            e8.e eVarL;
            long j11 = this.f18389k;
            if (!t(this.f18390l)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f18388j) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f18387i + j11;
            long jG = this.f18390l.g(0);
            int i10 = 0;
            while (i10 < this.f18390l.e() - 1 && j12 >= jG) {
                j12 -= jG;
                i10++;
                jG = this.f18390l.g(i10);
            }
            f8.g gVarD = this.f18390l.d(i10);
            int iA = gVarD.a(2);
            return (iA == -1 || (eVarL = gVarD.f14703c.get(iA).f14657c.get(0).l()) == null || eVarL.h(jG) == 0) ? j11 : (j11 + eVarL.b(eVarL.g(j12, jG))) - j12;
        }

        private static boolean t(f8.c cVar) {
            return cVar.f14668d && cVar.f14669e != -9223372036854775807L && cVar.f14666b == -9223372036854775807L;
        }

        @Override // u7.d0
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f18386h) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // u7.d0
        public d0.b g(int i10, d0.b bVar, boolean z10) {
            x7.a.c(i10, 0, i());
            return bVar.s(z10 ? this.f18390l.d(i10).f14701a : null, z10 ? Integer.valueOf(this.f18386h + i10) : null, 0, this.f18390l.g(i10), l0.S0(this.f18390l.d(i10).f14702b - this.f18390l.d(0).f14702b) - this.f18387i);
        }

        @Override // u7.d0
        public int i() {
            return this.f18390l.e();
        }

        @Override // u7.d0
        public Object m(int i10) {
            x7.a.c(i10, 0, i());
            return Integer.valueOf(this.f18386h + i10);
        }

        @Override // u7.d0
        public d0.c o(int i10, d0.c cVar, long j10) {
            x7.a.c(i10, 0, 1);
            long jS = s(j10);
            Object obj = d0.c.f26025q;
            s sVar = this.f18391m;
            f8.c cVar2 = this.f18390l;
            return cVar.g(obj, sVar, cVar2, this.f18383e, this.f18384f, this.f18385g, true, t(cVar2), this.f18392n, jS, this.f18388j, 0, i() - 1, this.f18387i);
        }

        @Override // u7.d0
        public int p() {
            return 1;
        }
    }

    private final class c implements io.bidmachine.media3.exoplayer.dash.f.b {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.dash.f.b
        public void a(long j10) {
            DashMediaSource.this.Q(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.f.b
        public void b() {
            DashMediaSource.this.R();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements io.bidmachine.media3.exoplayer.upstream.c.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Pattern f18394a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f18394a.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.e("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * ((((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.e(null, e10);
            }
        }
    }

    private final class e implements Loader.b<io.bidmachine.media3.exoplayer.upstream.c<f8.c>> {
        private e() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void o(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.S(cVar, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11) {
            DashMediaSource.this.T(cVar, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.U(cVar, j10, j11, iOException, i10);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void n(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11, int i10) {
            DashMediaSource.this.V(cVar, j10, j11, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements k {
        f() {
        }

        private void b() throws IOException {
            if (DashMediaSource.this.C != null) {
                throw DashMediaSource.this.C;
            }
        }

        @Override // r8.k
        public void a() throws IOException {
            DashMediaSource.this.A.a();
            b();
        }
    }

    private final class g implements Loader.b<io.bidmachine.media3.exoplayer.upstream.c<Long>> {
        private g() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void o(io.bidmachine.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.S(cVar, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m(io.bidmachine.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11) {
            DashMediaSource.this.W(cVar, j10, j11);
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(io.bidmachine.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(cVar, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements io.bidmachine.media3.exoplayer.upstream.c.a<Long> {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(l0.a1(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        u7.t.a("media3.exoplayer.dash");
    }

    /* synthetic */ DashMediaSource(s sVar, f8.c cVar, z7.d.a aVar, io.bidmachine.media3.exoplayer.upstream.c.a aVar2, io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, n8.e eVar, r8.e eVar2, i iVar, io.bidmachine.media3.exoplayer.upstream.b bVar, long j10, long j11, a aVar3) {
        this(sVar, cVar, aVar, aVar2, interfaceC0322a, eVar, eVar2, iVar, bVar, j10, j11);
    }

    private static long I(f8.g gVar, long j10, long j11) {
        long jS0 = l0.S0(gVar.f14702b);
        boolean zM = M(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f14703c.size(); i10++) {
            f8.a aVar = gVar.f14703c.get(i10);
            List<j> list = aVar.f14657c;
            int i11 = aVar.f14656b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zM || !z10) && !list.isEmpty()) {
                e8.e eVarL = list.get(0).l();
                if (eVarL == null) {
                    return jS0 + j10;
                }
                long jK = eVarL.k(j10, j11);
                if (jK == 0) {
                    return jS0;
                }
                long jD = (eVarL.d(j10, j11) + jK) - 1;
                jMin = Math.min(jMin, eVarL.c(jD, j10) + eVarL.b(jD) + jS0);
            }
        }
        return jMin;
    }

    private static long J(f8.g gVar, long j10, long j11) {
        long jS0 = l0.S0(gVar.f14702b);
        boolean zM = M(gVar);
        long jMax = jS0;
        for (int i10 = 0; i10 < gVar.f14703c.size(); i10++) {
            f8.a aVar = gVar.f14703c.get(i10);
            List<j> list = aVar.f14657c;
            int i11 = aVar.f14656b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zM || !z10) && !list.isEmpty()) {
                e8.e eVarL = list.get(0).l();
                if (eVarL == null) {
                    return jS0;
                }
                if (eVarL.k(j10, j11) == 0) {
                    return jS0;
                }
                jMax = Math.max(jMax, eVarL.b(eVarL.d(j10, j11)) + jS0);
            }
        }
        return jMax;
    }

    private static long K(f8.c cVar, long j10) {
        e8.e eVarL;
        int iE = cVar.e() - 1;
        f8.g gVarD = cVar.d(iE);
        long jS0 = l0.S0(gVarD.f14702b);
        long jG = cVar.g(iE);
        long jS1 = l0.S0(j10);
        long jS2 = l0.S0(cVar.f14665a);
        long jS3 = l0.S0(cVar.f14669e);
        if (jS3 == -9223372036854775807L || jS3 >= 5000000) {
            jS3 = 5000000;
        }
        for (int i10 = 0; i10 < gVarD.f14703c.size(); i10++) {
            List<j> list = gVarD.f14703c.get(i10).f14657c;
            if (!list.isEmpty() && (eVarL = list.get(0).l()) != null) {
                long jE = ((jS2 + jS0) + eVarL.e(jG, jS1)) - jS1;
                if (jE > 0 && (jE < jS3 - 100000 || (jE > jS3 && jE < jS3 + 100000))) {
                    jS3 = jE;
                }
            }
        }
        return u2.e.b(jS3, 1000L, RoundingMode.CEILING);
    }

    private long L() {
        return Math.min((this.M - 1) * 1000, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
    }

    private static boolean M(f8.g gVar) {
        for (int i10 = 0; i10 < gVar.f14703c.size(); i10++) {
            int i11 = gVar.f14703c.get(i10).f14656b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean N(f8.g gVar) {
        for (int i10 = 0; i10 < gVar.f14703c.size(); i10++) {
            e8.e eVarL = gVar.f14703c.get(i10).f14657c.get(0).l();
            if (eVarL == null || eVarL.i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        a0(false);
    }

    private void P() {
        s8.b.l(this.A, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(IOException iOException) {
        x7.r.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        a0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(long j10) {
        this.L = j10;
        a0(true);
    }

    private void a0(boolean z10) {
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f18366u.size(); i10++) {
            int iKeyAt = this.f18366u.keyAt(i10);
            if (iKeyAt >= this.O) {
                this.f18366u.valueAt(i10).O(this.H, iKeyAt - this.O);
            }
        }
        f8.g gVarD = this.H.d(0);
        int iE = this.H.e() - 1;
        f8.g gVarD2 = this.H.d(iE);
        long jG = this.H.g(iE);
        long jS0 = l0.S0(l0.h0(this.L));
        long J = J(gVarD, this.H.g(0), jS0);
        long jI = I(gVarD2, jG, jS0);
        boolean z11 = this.H.f14668d && !N(gVarD2);
        if (z11) {
            long j12 = this.H.f14670f;
            if (j12 != -9223372036854775807L) {
                J = Math.max(J, jI - l0.S0(j12));
            }
        }
        long j13 = jI - J;
        f8.c cVar = this.H;
        if (cVar.f14668d) {
            x7.a.g(cVar.f14665a != -9223372036854775807L);
            long jS1 = (jS0 - l0.S0(this.H.f14665a)) - J;
            h0(jS1, j13);
            long jT1 = this.H.f14665a + l0.t1(J);
            long jS2 = jS1 - l0.S0(this.E.f26376a);
            long jMin = Math.min(this.f18361p, j13 / 2);
            j10 = jT1;
            j11 = jS2 < jMin ? jMin : jS2;
        } else {
            j10 = -9223372036854775807L;
            j11 = 0;
        }
        long jS3 = J - l0.S0(gVarD.f14702b);
        f8.c cVar2 = this.H;
        A(new b(cVar2.f14665a, j10, this.L, this.O, jS3, j13, j11, cVar2, e(), this.H.f14668d ? this.E : null));
        if (this.f18353h) {
            return;
        }
        this.D.removeCallbacks(this.f18368w);
        if (z11) {
            this.D.postDelayed(this.f18368w, K(this.H, l0.h0(this.L)));
        }
        if (this.I) {
            g0();
            return;
        }
        if (z10) {
            f8.c cVar3 = this.H;
            if (cVar3.f14668d) {
                long j14 = cVar3.f14669e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    e0(Math.max(0L, (this.J + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void b0(f8.o oVar) {
        String str = oVar.f14755a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            c0(oVar);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            d0(oVar, new d());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            d0(oVar, new h(null));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            P();
        } else {
            Y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void c0(f8.o oVar) {
        try {
            Z(l0.a1(oVar.f14756b) - this.K);
        } catch (ParserException e10) {
            Y(e10);
        }
    }

    private void d0(f8.o oVar, io.bidmachine.media3.exoplayer.upstream.c.a<Long> aVar) {
        f0(new io.bidmachine.media3.exoplayer.upstream.c(this.f18371z, Uri.parse(oVar.f14756b), 5, aVar), new g(this, null), 1);
    }

    private void e0(long j10) {
        this.D.postDelayed(this.f18367v, j10);
    }

    private <T> void f0(io.bidmachine.media3.exoplayer.upstream.c<T> cVar, Loader.b<io.bidmachine.media3.exoplayer.upstream.c<T>> bVar, int i10) {
        this.A.n(cVar, bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        Uri uri;
        this.D.removeCallbacks(this.f18367v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        synchronized (this.f18365t) {
            uri = this.F;
        }
        this.I = false;
        f0(new io.bidmachine.media3.exoplayer.upstream.c(this.f18371z, new z7.g.b().i(uri).b(1).a(), 4, this.f18363r), this.f18364s, this.f18358m.a(4));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    private void h0(long j10, long j11) {
        long j12;
        long jMin;
        long jT1;
        long j13;
        long jQ;
        long j14;
        l lVar;
        long j15;
        long jQ2;
        float f10;
        float f11;
        l lVar2;
        l lVar3;
        l lVar4;
        f8.c cVar;
        l lVar5;
        long j16;
        s.g gVar = e().f26304d;
        long jT2 = l0.t1(j10);
        long j17 = gVar.f26378c;
        if (j17 == -9223372036854775807L) {
            l lVar6 = this.H.f14674j;
            if (lVar6 != null) {
                long j18 = lVar6.f14748c;
                if (j18 != -9223372036854775807L) {
                    jMin = Math.min(jT2, j18);
                }
                jT1 = l0.t1(j10 - j11);
                if (jT1 < 0 && j12 > 0) {
                    jT1 = 0;
                }
                j13 = this.H.f14667c;
                if (j13 != -9223372036854775807L) {
                    jT1 = Math.min(jT1 + j13, jT2);
                }
                jQ = jT1;
                j14 = gVar.f26377b;
                if (j14 != -9223372036854775807L) {
                    jQ = l0.q(j14, jQ, jT2);
                } else {
                    lVar = this.H.f14674j;
                    if (lVar != null) {
                        j15 = lVar.f14747b;
                        if (j15 != -9223372036854775807L) {
                            jQ = l0.q(j15, jQ, jT2);
                        }
                    }
                }
                if (jQ > j12) {
                    j12 = jQ;
                }
                jQ2 = this.E.f26376a;
                if (jQ2 == -9223372036854775807L) {
                    cVar = this.H;
                    lVar5 = cVar.f14674j;
                    if (lVar5 != null) {
                        j16 = lVar5.f14746a;
                        if (j16 != -9223372036854775807L) {
                            jQ2 = j16;
                        } else {
                            jQ2 = cVar.f14671g;
                            if (jQ2 == -9223372036854775807L) {
                                jQ2 = this.f18360o;
                            }
                        }
                    } else {
                        jQ2 = cVar.f14671g;
                        if (jQ2 == -9223372036854775807L) {
                            jQ2 = this.f18360o;
                        }
                    }
                }
                if (jQ2 < jQ) {
                    jQ2 = jQ;
                }
                if (jQ2 > j12) {
                    jQ2 = l0.q(l0.t1(j10 - Math.min(this.f18361p, j11 / 2)), jQ, j12);
                }
                f10 = gVar.f26379d;
                if (f10 == -3.4028235E38f) {
                    lVar4 = this.H.f14674j;
                    if (lVar4 != null) {
                        f10 = lVar4.f14749d;
                    } else {
                        f10 = -3.4028235E38f;
                    }
                }
                f11 = gVar.f26380e;
                if (f11 == -3.4028235E38f) {
                    lVar3 = this.H.f14674j;
                    if (lVar3 != null) {
                        f11 = lVar3.f14750e;
                    } else {
                        f11 = -3.4028235E38f;
                    }
                }
                if (f10 == -3.4028235E38f && f11 == -3.4028235E38f && ((lVar2 = this.H.f14674j) == null || lVar2.f14746a == -9223372036854775807L)) {
                    f10 = 1.0f;
                    f11 = 1.0f;
                }
                this.E = new s.g.a().k(jQ2).i(jQ).g(j12).j(f10).h(f11).f();
            }
            j12 = jT2;
            jT1 = l0.t1(j10 - j11);
            if (jT1 < 0) {
                jT1 = 0;
            }
            j13 = this.H.f14667c;
            if (j13 != -9223372036854775807L) {
                jT1 = Math.min(jT1 + j13, jT2);
            }
            jQ = jT1;
            j14 = gVar.f26377b;
            if (j14 != -9223372036854775807L) {
                jQ = l0.q(j14, jQ, jT2);
            } else {
                lVar = this.H.f14674j;
                if (lVar != null) {
                    j15 = lVar.f14747b;
                    if (j15 != -9223372036854775807L) {
                        jQ = l0.q(j15, jQ, jT2);
                    }
                }
            }
            if (jQ > j12) {
                j12 = jQ;
            }
            jQ2 = this.E.f26376a;
            if (jQ2 == -9223372036854775807L) {
                cVar = this.H;
                lVar5 = cVar.f14674j;
                if (lVar5 != null) {
                    j16 = lVar5.f14746a;
                    if (j16 != -9223372036854775807L) {
                        jQ2 = j16;
                    } else {
                        jQ2 = cVar.f14671g;
                        if (jQ2 == -9223372036854775807L) {
                            jQ2 = this.f18360o;
                        }
                    }
                } else {
                    jQ2 = cVar.f14671g;
                    if (jQ2 == -9223372036854775807L) {
                        jQ2 = this.f18360o;
                    }
                }
            }
            if (jQ2 < jQ) {
                jQ2 = jQ;
            }
            if (jQ2 > j12) {
                jQ2 = l0.q(l0.t1(j10 - Math.min(this.f18361p, j11 / 2)), jQ, j12);
            }
            f10 = gVar.f26379d;
            if (f10 == -3.4028235E38f) {
                lVar4 = this.H.f14674j;
                if (lVar4 != null) {
                    f10 = lVar4.f14749d;
                } else {
                    f10 = -3.4028235E38f;
                }
            }
            f11 = gVar.f26380e;
            if (f11 == -3.4028235E38f) {
                lVar3 = this.H.f14674j;
                if (lVar3 != null) {
                    f11 = lVar3.f14750e;
                } else {
                    f11 = -3.4028235E38f;
                }
            }
            if (f10 == -3.4028235E38f) {
                f10 = 1.0f;
                f11 = 1.0f;
            }
            this.E = new s.g.a().k(jQ2).i(jQ).g(j12).j(f10).h(f11).f();
        }
        jMin = Math.min(jT2, j17);
        j12 = jMin;
        jT1 = l0.t1(j10 - j11);
        if (jT1 < 0) {
            jT1 = 0;
        }
        j13 = this.H.f14667c;
        if (j13 != -9223372036854775807L) {
            jT1 = Math.min(jT1 + j13, jT2);
        }
        jQ = jT1;
        j14 = gVar.f26377b;
        if (j14 != -9223372036854775807L) {
            jQ = l0.q(j14, jQ, jT2);
        } else {
            lVar = this.H.f14674j;
            if (lVar != null) {
                j15 = lVar.f14747b;
                if (j15 != -9223372036854775807L) {
                    jQ = l0.q(j15, jQ, jT2);
                }
            }
        }
        if (jQ > j12) {
            j12 = jQ;
        }
        jQ2 = this.E.f26376a;
        if (jQ2 == -9223372036854775807L) {
            cVar = this.H;
            lVar5 = cVar.f14674j;
            if (lVar5 != null) {
                j16 = lVar5.f14746a;
                if (j16 != -9223372036854775807L) {
                    jQ2 = j16;
                } else {
                    jQ2 = cVar.f14671g;
                    if (jQ2 == -9223372036854775807L) {
                        jQ2 = this.f18360o;
                    }
                }
            } else {
                jQ2 = cVar.f14671g;
                if (jQ2 == -9223372036854775807L) {
                    jQ2 = this.f18360o;
                }
            }
        }
        if (jQ2 < jQ) {
            jQ2 = jQ;
        }
        if (jQ2 > j12) {
            jQ2 = l0.q(l0.t1(j10 - Math.min(this.f18361p, j11 / 2)), jQ, j12);
        }
        f10 = gVar.f26379d;
        if (f10 == -3.4028235E38f) {
            lVar4 = this.H.f14674j;
            if (lVar4 != null) {
                f10 = lVar4.f14749d;
            } else {
                f10 = -3.4028235E38f;
            }
        }
        f11 = gVar.f26380e;
        if (f11 == -3.4028235E38f) {
            lVar3 = this.H.f14674j;
            if (lVar3 != null) {
                f11 = lVar3.f14750e;
            } else {
                f11 = -3.4028235E38f;
            }
        }
        if (f10 == -3.4028235E38f) {
            f10 = 1.0f;
            f11 = 1.0f;
        }
        this.E = new s.g.a().k(jQ2).i(jQ).g(j12).j(f10).h(f11).f();
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void B() {
        this.I = false;
        this.f18371z = null;
        Loader loader = this.A;
        if (loader != null) {
            loader.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f18366u.clear();
        this.f18359n.i();
        this.f18357l.release();
    }

    void Q(long j10) {
        long j11 = this.N;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.N = j10;
        }
    }

    void R() {
        this.D.removeCallbacks(this.f18368w);
        g0();
    }

    void S(io.bidmachine.media3.exoplayer.upstream.c<?> cVar, long j10, long j11) {
        n8.i iVar = new n8.i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        this.f18358m.d(cVar.f19817a);
        this.f18362q.s(iVar, cVar.f19819c);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    void T(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11) {
        boolean z10;
        int i10;
        n8.i iVar = new n8.i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        this.f18358m.d(cVar.f19817a);
        this.f18362q.v(iVar, cVar.f19819c);
        f8.c cVarD = cVar.d();
        f8.c cVar2 = this.H;
        int iE = cVar2 == null ? 0 : cVar2.e();
        long j12 = cVarD.d(0).f14702b;
        int i11 = 0;
        while (i11 < iE && this.H.d(i11).f14702b < j12) {
            i11++;
        }
        if (cVarD.f14668d) {
            if (iE - i11 > cVarD.e()) {
                x7.r.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.N;
                if (j13 == -9223372036854775807L || cVarD.f14672h * 1000 > j13) {
                    z10 = false;
                } else {
                    x7.r.h("DashMediaSource", "Loaded stale dynamic manifest: " + cVarD.f14672h + ", " + this.N);
                }
                if (z10) {
                    i10 = this.M;
                    this.M = i10 + 1;
                    if (i10 < this.f18358m.a(cVar.f19819c)) {
                        e0(L());
                        return;
                    } else {
                        this.C = new DashManifestStaleException();
                        return;
                    }
                }
                this.M = 0;
            }
            z10 = true;
            if (z10) {
                i10 = this.M;
                this.M = i10 + 1;
                if (i10 < this.f18358m.a(cVar.f19819c)) {
                    e0(L());
                    return;
                } else {
                    this.C = new DashManifestStaleException();
                    return;
                }
            }
            this.M = 0;
        }
        this.H = cVarD;
        this.I = cVarD.f14668d & this.I;
        this.J = j10 - j11;
        this.K = j10;
        this.O += i11;
        synchronized (this.f18365t) {
            if (cVar.f19818b.f29009a == this.F) {
                Uri uriE = this.H.f14675k;
                if (uriE == null) {
                    uriE = cVar.e();
                }
                this.F = uriE;
            }
        }
        f8.c cVar3 = this.H;
        if (!cVar3.f14668d || this.L != -9223372036854775807L) {
            a0(true);
            return;
        }
        f8.o oVar = cVar3.f14673i;
        if (oVar != null) {
            b0(oVar);
        } else {
            P();
        }
    }

    Loader.c U(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11, IOException iOException, int i10) {
        n8.i iVar = new n8.i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        long jC = this.f18358m.c(new io.bidmachine.media3.exoplayer.upstream.b.c(iVar, new n8.j(cVar.f19819c), iOException, i10));
        Loader.c cVarH = jC == -9223372036854775807L ? Loader.f19789g : Loader.h(false, jC);
        boolean z10 = !cVarH.c();
        this.f18362q.z(iVar, cVar.f19819c, iOException, z10);
        if (z10) {
            this.f18358m.d(cVar.f19817a);
        }
        return cVarH;
    }

    void V(io.bidmachine.media3.exoplayer.upstream.c<f8.c> cVar, long j10, long j11, int i10) {
        this.f18362q.B(i10 == 0 ? new n8.i(cVar.f19817a, cVar.f19818b, j10) : new n8.i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a()), cVar.f19819c, i10);
    }

    void W(io.bidmachine.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11) {
        n8.i iVar = new n8.i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a());
        this.f18358m.d(cVar.f19817a);
        this.f18362q.v(iVar, cVar.f19819c);
        Z(cVar.d().longValue() - j10);
    }

    Loader.c X(io.bidmachine.media3.exoplayer.upstream.c<Long> cVar, long j10, long j11, IOException iOException) {
        this.f18362q.z(new n8.i(cVar.f19817a, cVar.f19818b, cVar.e(), cVar.c(), j10, j11, cVar.a()), cVar.f19819c, iOException, true);
        this.f18358m.d(cVar.f19817a);
        Y(iOException);
        return Loader.f19788f;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public q a(io.bidmachine.media3.exoplayer.source.r.b bVar, r8.b bVar2, long j10) {
        int iIntValue = ((Integer) bVar.f19684a).intValue() - this.O;
        io.bidmachine.media3.exoplayer.source.s.a aVarU = u(bVar);
        io.bidmachine.media3.exoplayer.dash.c cVar = new io.bidmachine.media3.exoplayer.dash.c(iIntValue + this.O, this.H, this.f18359n, iIntValue, this.f18355j, this.B, null, this.f18357l, s(bVar), this.f18358m, aVarU, this.L, this.f18370y, bVar2, this.f18356k, this.f18369x, x());
        this.f18366u.put(cVar.f18398a, cVar);
        return cVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized s e() {
        return this.P;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void j() throws IOException {
        this.f18370y.a();
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public synchronized void m(s sVar) {
        this.P = sVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.r
    public void n(q qVar) {
        io.bidmachine.media3.exoplayer.dash.c cVar = (io.bidmachine.media3.exoplayer.dash.c) qVar;
        cVar.K();
        this.f18366u.remove(cVar.f18398a);
    }

    @Override // io.bidmachine.media3.exoplayer.source.a
    protected void z(o oVar) {
        this.B = oVar;
        this.f18357l.l(Looper.myLooper(), x());
        this.f18357l.k();
        if (this.f18353h) {
            a0(false);
            return;
        }
        this.f18371z = this.f18354i.a();
        this.A = new Loader("DashMediaSource");
        this.D = l0.A();
        g0();
    }

    private DashMediaSource(s sVar, f8.c cVar, z7.d.a aVar, io.bidmachine.media3.exoplayer.upstream.c.a<? extends f8.c> aVar2, io.bidmachine.media3.exoplayer.dash.a.InterfaceC0322a interfaceC0322a, n8.e eVar, r8.e eVar2, i iVar, io.bidmachine.media3.exoplayer.upstream.b bVar, long j10, long j11) {
        this.P = sVar;
        this.E = sVar.f26304d;
        this.F = ((s.h) x7.a.e(sVar.f26302b)).f26394a;
        this.G = sVar.f26302b.f26394a;
        this.H = cVar;
        this.f18354i = aVar;
        this.f18363r = aVar2;
        this.f18355j = interfaceC0322a;
        this.f18357l = iVar;
        this.f18358m = bVar;
        this.f18360o = j10;
        this.f18361p = j11;
        this.f18356k = eVar;
        this.f18359n = new e8.b();
        boolean z10 = cVar != null;
        this.f18353h = z10;
        a aVar3 = null;
        this.f18362q = u(null);
        this.f18365t = new Object();
        this.f18366u = new SparseArray<>();
        this.f18369x = new c(this, aVar3);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (!z10) {
            this.f18364s = new e(this, aVar3);
            this.f18370y = new f();
            this.f18367v = new Runnable() { // from class: e8.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14509a.g0();
                }
            };
            this.f18368w = new Runnable() { // from class: e8.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14510a.O();
                }
            };
            return;
        }
        x7.a.g(true ^ cVar.f14668d);
        this.f18364s = null;
        this.f18367v = null;
        this.f18368w = null;
        this.f18370y = new k.a();
    }
}
