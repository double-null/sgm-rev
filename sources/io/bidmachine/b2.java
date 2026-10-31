package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.InitResponse;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: BidMachineImpl.java */
/* JADX INFO: loaded from: classes4.dex */
final class b2 {
    private static final AtomicBoolean D = new AtomicBoolean(false);
    private static volatile b2 E;
    long A;
    a4 B;
    private final a4.d C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<InitializationCallback> f17487a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17488b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f17489c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ub.e f17490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ub.f f17491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w5 f17492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PriceFloorParams f17493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppParams f17494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r3 f17495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q5 f17496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t3 f17497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<TrackEventType, List<String>> f17498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<AdRequest.AdRequestListener<?>> f17499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s0 f17500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o1 f17501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BidMachineAssetCacheInitializer f17502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InstallInfoProvider f17503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Context f17504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f17505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TargetingParams f17506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CustomParams f17507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Publisher f17508v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f17510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    String f17512z;

    /* JADX INFO: compiled from: BidMachineImpl.java */
    class a extends rc.a {
        a(String str) {
            super(str);
        }

        @Override // rc.a
        protected String n(Object obj, String str, qc.b<String> bVar, Throwable th) {
            String strN = super.n(obj, str, bVar, th);
            if (!b2.e().E()) {
                return strN;
            }
            return "(TEST MODE) " + strN;
        }
    }

    /* JADX INFO: compiled from: BidMachineImpl.java */
    private class b implements a4.d {
        private b() {
        }

        @Override // io.bidmachine.a4.d
        public void a(a4.b bVar) {
            b2 b2Var = b2.this;
            Context context = b2Var.f17504r;
            if (context == null) {
                return;
            }
            b2Var.z(context, bVar.a().getAdNetworksList());
        }

        @Override // io.bidmachine.a4.d
        public void b(a4.b bVar) {
            InitResponse initResponseA = bVar.a();
            b2.this.x(SessionManager.get().getSessionId(), initResponseA, bVar.b());
            if (b2.this.f17504r == null) {
                return;
            }
            ExtraParamsManager.get().setExtras(b2.this.f17504r, initResponseA.getExtras());
            b2 b2Var = b2.this;
            b2Var.z(b2Var.f17504r, initResponseA.getAdNetworksList());
        }

        @Override // io.bidmachine.a4.d
        public void c(a4.b bVar) {
            b2.this.x(SessionManager.get().getSessionId(), bVar.a(), bVar.b());
        }

        /* synthetic */ b(b2 b2Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BidMachineImpl.java */
    static class c implements qb.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f17514a;

        public c(Context context) {
            this.f17514a = context.getApplicationContext();
        }

        @Override // qb.k
        public String getUserAgent() {
            return UserAgentManager.getUserAgent(this.f17514a);
        }
    }

    static {
        io.bidmachine.core.a.i(new a("BidMachineLog"));
    }

    b2() {
        ub.e eVar = new ub.e();
        this.f17490d = eVar;
        this.f17491e = new c2(eVar);
        this.f17492f = new w5();
        this.f17493g = new PriceFloorParams().m332addPriceFloor(UUID.randomUUID().toString(), 0.01d);
        this.f17494h = new AppParams(new t0());
        this.f17495i = new r3(new p2());
        this.f17496j = new q5();
        this.f17497k = new u3();
        this.f17498l = new EnumMap(TrackEventType.class);
        this.f17499m = new CopyOnWriteArrayList();
        this.f17500n = new s0();
        this.f17501o = new o1();
        this.f17502p = new BidMachineAssetCacheInitializer();
        this.f17503q = new InstallInfoProvider();
        this.f17506t = new TargetingParams();
        this.f17507u = new CustomParams();
        this.f17510x = 0;
        this.f17511y = 0;
        this.A = 0L;
        this.C = new b(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(String str, InitResponse initResponse, String str2, Context context) {
        this.f17501o.a(context, str, initResponse, str2);
        this.f17502p.configure(context, initResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Context context) {
        try {
            Debugger.setup(context);
            this.f17497k.a(context);
            this.f17500n.e(context);
            this.B.f();
            L(context);
            this.f17503q.initialize(context);
            A(context, null);
            J();
            this.B.e();
            o7.h.a();
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    static void M(final Context context) {
        if (D.compareAndSet(false, true)) {
            io.bidmachine.core.h.c0(new oc.q() { // from class: io.bidmachine.w1
                @Override // oc.q
                public final void run() {
                    f1.b(context);
                }
            });
            io.bidmachine.core.h.c0(new oc.q() { // from class: io.bidmachine.x1
                @Override // oc.q
                public final void run() {
                    o1.b(context);
                }
            });
        }
    }

    private static void O(final InitializationCallback initializationCallback) {
        if (initializationCallback == null) {
            return;
        }
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.a2
            @Override // java.lang.Runnable
            public final void run() {
                initializationCallback.onInitialized();
            }
        });
    }

    static b2 e() {
        b2 b2Var = E;
        if (b2Var == null) {
            synchronized (b2.class) {
                b2Var = E;
                if (b2Var == null) {
                    b2Var = new b2();
                    E = b2Var;
                }
            }
        }
        return b2Var;
    }

    void A(Context context, NetworkRegistry.c cVar) {
        NetworkRegistry.registerCoreNetworks();
        NetworkRegistry.initializeNetworksAsync(context, cVar);
    }

    boolean B() {
        return D() || C();
    }

    boolean C() {
        return this.f17489c.get();
    }

    boolean D() {
        return this.f17488b.get();
    }

    boolean E() {
        return this.f17509w;
    }

    void J() {
        io.bidmachine.core.a.c("Notify initialization finished");
        this.f17489c.set(true);
        this.f17488b.set(false);
        Iterator<InitializationCallback> it = this.f17487a.iterator();
        while (it.hasNext()) {
            O(it.next());
        }
        this.f17487a.clear();
    }

    String K(Context context) {
        if (!this.f17492f.f()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        if (!TextUtils.isEmpty(this.f17512z)) {
            return this.f17512z;
        }
        String strC = f2.C(context);
        this.f17512z = strC;
        return strC;
    }

    long L(Context context) {
        long j10 = this.A;
        if (j10 != 0) {
            return j10;
        }
        long jD = f2.D(context);
        this.A = jD;
        return jD;
    }

    void N(AdRequest.AdRequestListener<?> adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.f17499m.add(adRequestListener);
    }

    void P(Publisher publisher) {
        this.f17508v = publisher;
    }

    void Q(TargetingParams targetingParams) {
        if (targetingParams == null) {
            targetingParams = new TargetingParams();
        }
        this.f17506t = targetingParams;
    }

    void R(boolean z10) {
        this.f17509w = z10;
    }

    void S(AdRequest.AdRequestListener<?> adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.f17499m.remove(adRequestListener);
    }

    List<AdRequest.AdRequestListener<?>> f() {
        return this.f17499m;
    }

    Context g() {
        return this.f17504r;
    }

    AppParams h() {
        return this.f17494h;
    }

    r3 i() {
        return this.f17495i;
    }

    String j() {
        return this.f17500n.c();
    }

    t3 k() {
        return this.f17497k;
    }

    InstallInfoProvider l() {
        return this.f17503q;
    }

    int m() {
        return this.f17511y;
    }

    PriceFloorParams n() {
        return this.f17493g;
    }

    Publisher o() {
        return this.f17508v;
    }

    int p() {
        return this.f17510x;
    }

    long q(Context context) {
        return f2.s(context);
    }

    String r() {
        return this.f17505s;
    }

    public q5 s() {
        return this.f17496j;
    }

    ub.f t() {
        return this.f17491e;
    }

    TargetingParams u() {
        return this.f17506t;
    }

    List<String> v(TrackEventType trackEventType) {
        return this.f17498l.get(trackEventType);
    }

    w5 w() {
        return this.f17492f;
    }

    void x(final String str, final InitResponse initResponse, final String str2) {
        UrlProvider.setAuctionUrlFromInit(initResponse.getEndpoint());
        this.f17498l.clear();
        oc.h.q(this.f17498l, initResponse.getEventList());
        this.f17490d.i(initResponse.getEventConfiguration());
        SessionManager.get().setSessionResetAfter(initResponse.getSessionResetAfter());
        this.f17510x = initResponse.getAdRequestTmax();
        this.f17511y = initResponse.getAdNetworksLoadingTimeout();
        d2.b(initResponse.getShowWithoutInternet());
        l2.y(initResponse.getTokenConfigurationsList());
        Map<String, AdCachePlacementControl> adCachePlacementControlMap = initResponse.getAdCachePlacementControlMap();
        if (adCachePlacementControlMap != null) {
            o0.p(adCachePlacementControlMap);
            AdCachePlacementControl adCachePlacementControl = adCachePlacementControlMap.get(AdsType.Interstitial.getName());
            int maxCacheSize = adCachePlacementControl != null ? 0 + adCachePlacementControl.getMaxCacheSize() : 0;
            AdCachePlacementControl adCachePlacementControl2 = adCachePlacementControlMap.get(AdsType.Rewarded.getName());
            if (adCachePlacementControl2 != null) {
                maxCacheSize += adCachePlacementControl2.getMaxCacheSize();
            }
            if (maxCacheSize > 5) {
                h7.g.Y(maxCacheSize);
            }
        }
        io.bidmachine.iab.mraid.l0.f17747e = oc.m.f(initResponse.getExtras().getInternal(), "mraid_js");
        io.bidmachine.core.h.B(this.f17504r, new Executable() { // from class: io.bidmachine.z1
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                this.f20510a.F(str, initResponse, str2, (Context) obj);
            }
        });
    }

    void y(Context context, String str, InitializationCallback initializationCallback) {
        M(context);
        if (C()) {
            O(initializationCallback);
            return;
        }
        if (context == null) {
            io.bidmachine.core.a.c("Initialization fail: Context is not provided");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            io.bidmachine.core.a.c("Initialization fail: Source id is not provided");
            return;
        }
        if (initializationCallback != null) {
            this.f17487a.add(initializationCallback);
        }
        if (this.f17488b.compareAndSet(false, true)) {
            final Context applicationContext = context.getApplicationContext();
            SessionManager sessionManager = SessionManager.get();
            sessionManager.attachContext(applicationContext);
            this.f17504r = applicationContext;
            this.f17505s = str;
            sessionManager.resume();
            oc.b.e(applicationContext);
            UserAgentManager.initialize(context);
            la.f.g(new c(applicationContext));
            this.B = new a4(applicationContext, str, this.C);
            io.bidmachine.core.h.Q(new Runnable() { // from class: io.bidmachine.y1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20487a.G(applicationContext);
                }
            });
        }
    }

    void z(Context context, List<AdNetwork> list) {
        if (list == null) {
            return;
        }
        Iterator<AdNetwork> it = list.iterator();
        while (it.hasNext()) {
            NetworkRegistry.registerInitNetwork(context, it.next());
        }
    }
}
