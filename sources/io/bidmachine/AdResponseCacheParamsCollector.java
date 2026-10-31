package io.bidmachine;

import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdResponseCacheParamsCollector {
    public static final Companion Companion = new Companion(null);
    public static final List<TrackEventType> DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS;
    public static final List<TrackEventType> DEFAULT_AD_RESPONSE_CACHE_EVENTS;
    private static final String TAG = "AdResponseCacheParamsCollector";
    private final List<TrackEventType> adResponseCacheEnabledEvents;
    private final z6.c<AdResponse> adResponseCacheParamsAdapter;
    private final List<TrackEventType> adaptiveResourcesCacheEnabledEvents;
    private final z6.c<vb.k> adaptiveResourcesCacheParamsAdapter;
    private final ud.k0 ioDispatcher;
    private final rc.j logger;
    private final ud.k0 mainDispatcher;
    private final wc.k taskManager$delegate;

    /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
    public interface Callback {
        void onCollected(Map<String, ? extends Object> map);
    }

    /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
    private final class a extends dc.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TrackEventType f16395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AdResponse f16396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Callback f16397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AdResponseCacheParamsCollector f16398e;

        /* JADX INFO: renamed from: io.bidmachine.AdResponseCacheParamsCollector$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.AdResponseCacheParamsCollector$Task", f = "AdResponseCacheParamsCollector.kt", l = {62, 70, 78}, m = "runTask")
        static final class C0265a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f16399h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f16400i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f16401j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f16402k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f16403l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f16404m;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f16406o;

            C0265a(zc.f<? super C0265a> fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f16404m = obj;
                this.f16406o |= Integer.MIN_VALUE;
                return a.this.e(null, this);
            }
        }

        /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
        static final class b extends kotlin.jvm.internal.u implements id.a<String> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Map<String, Object> f16408e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Map<String, ? extends Object> map) {
                super(0);
                this.f16408e = map;
            }

            @Override // id.a
            public final String invoke() {
                return a.this.f16395b.getActionValue() + ". Collected cache params: " + wb.e0.R(this.f16408e);
            }
        }

        /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.AdResponseCacheParamsCollector$Task$runTask$3", f = "AdResponseCacheParamsCollector.kt", l = {}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f16409h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Map<String, Object> f16411j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Map<String, ? extends Object> map, zc.f<? super c> fVar) {
                super(2, fVar);
                this.f16411j = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                return a.this.new c(this.f16411j, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
                return ((c) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f16409h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                a.this.f16397d.onCollected(this.f16411j);
                return wc.g0.f27756a;
            }
        }

        public a(AdResponseCacheParamsCollector adResponseCacheParamsCollector, TrackEventType trackEventType, AdResponse adResponse, Callback callback) {
            kotlin.jvm.internal.t.f(trackEventType, "trackEventType");
            kotlin.jvm.internal.t.f(callback, "callback");
            this.f16398e = adResponseCacheParamsCollector;
            this.f16395b = trackEventType;
            this.f16396c = adResponse;
            this.f16397d = callback;
        }

        /* JADX WARN: Code duplicated, block: B:59:0x0122 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:70:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dc.c
        public Object e(zc.j jVar, zc.f<? super wc.g0> fVar) throws Throwable {
            C0265a c0265a;
            AdResponseCacheParamsCollector adResponseCacheParamsCollector;
            Map mapC;
            a aVar;
            Map map;
            Map map2;
            Map map3;
            a aVar2;
            Map map4;
            AdResponse adResponse;
            Map map5;
            ga.a adObject;
            ga.b params;
            vb.k kVarD;
            ud.k0 k0Var;
            c cVar;
            if (fVar instanceof C0265a) {
                c0265a = (C0265a) fVar;
                int i10 = c0265a.f16406o;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0265a.f16406o = i10 - Integer.MIN_VALUE;
                } else {
                    c0265a = new C0265a(fVar);
                }
            } else {
                c0265a = new C0265a(fVar);
            }
            Object cacheParams = c0265a.f16404m;
            Object objF = ad.d.f();
            int i11 = c0265a.f16406o;
            if (i11 != 0) {
                if (i11 == 1) {
                    mapC = (Map) c0265a.f16403l;
                    map = (Map) c0265a.f16402k;
                    map2 = (Map) c0265a.f16401j;
                    adResponseCacheParamsCollector = (AdResponseCacheParamsCollector) c0265a.f16400i;
                    aVar = (a) c0265a.f16399h;
                    try {
                        wc.s.b(cacheParams);
                    } catch (Throwable unused) {
                    }
                } else if (i11 == 2) {
                    mapC = (Map) c0265a.f16401j;
                    map4 = (Map) c0265a.f16400i;
                    aVar2 = (a) c0265a.f16399h;
                    try {
                        wc.s.b(cacheParams);
                        map5 = (Map) cacheParams;
                        wb.e0.A(mapC, map5);
                        wc.g0 g0Var = wc.g0.f27756a;
                    } catch (Throwable unused2) {
                    }
                    map2 = map4;
                    Map mapB = kotlin.collections.n0.b(map2);
                    aVar2.f16398e.logger.b(AdResponseCacheParamsCollector.TAG, aVar2.new b(mapB));
                    k0Var = aVar2.f16398e.mainDispatcher;
                    cVar = aVar2.new c(mapB, null);
                    c0265a.f16399h = null;
                    c0265a.f16400i = null;
                    c0265a.f16401j = null;
                    c0265a.f16402k = null;
                    c0265a.f16403l = null;
                    c0265a.f16406o = 3;
                    if (ud.i.g(k0Var, cVar, c0265a) == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(cacheParams);
                }
                return wc.g0.f27756a;
            }
            wc.s.b(cacheParams);
            adResponseCacheParamsCollector = this.f16398e;
            mapC = kotlin.collections.n0.c();
            if (adResponseCacheParamsCollector.adResponseCacheEnabledEvents.contains(this.f16395b)) {
                try {
                    AdResponse adResponse2 = this.f16396c;
                    if (adResponse2 != null) {
                        z6.c cVar2 = adResponseCacheParamsCollector.adResponseCacheParamsAdapter;
                        c0265a.f16399h = this;
                        c0265a.f16400i = adResponseCacheParamsCollector;
                        c0265a.f16401j = mapC;
                        c0265a.f16402k = mapC;
                        c0265a.f16403l = mapC;
                        c0265a.f16406o = 1;
                        cacheParams = cVar2.getCacheParams(adResponse2, c0265a);
                        if (cacheParams == objF) {
                            return objF;
                        }
                        aVar = this;
                        map = mapC;
                        map2 = map;
                    } else {
                        aVar = this;
                        map = mapC;
                        map2 = map;
                        map3 = null;
                    }
                    wb.e0.A(mapC, map3);
                    wc.g0 g0Var2 = wc.g0.f27756a;
                } catch (Throwable unused3) {
                    aVar = this;
                    map = mapC;
                    map2 = map;
                }
                mapC = map;
                aVar2 = aVar;
            } else {
                aVar2 = this;
                map2 = mapC;
            }
            if (adResponseCacheParamsCollector.adaptiveResourcesCacheEnabledEvents.contains(aVar2.f16395b)) {
                try {
                    adResponse = aVar2.f16396c;
                    if (adResponse != null || (adObject = adResponse.getAdObject()) == null || (params = adObject.getParams()) == null || (kVarD = params.d()) == null) {
                        map5 = null;
                        map4 = map2;
                    } else {
                        z6.c cVar3 = adResponseCacheParamsCollector.adaptiveResourcesCacheParamsAdapter;
                        c0265a.f16399h = aVar2;
                        c0265a.f16400i = map2;
                        c0265a.f16401j = mapC;
                        c0265a.f16402k = null;
                        c0265a.f16403l = null;
                        c0265a.f16406o = 2;
                        cacheParams = cVar3.getCacheParams(kVarD, c0265a);
                        if (cacheParams == objF) {
                            return objF;
                        }
                        map4 = map2;
                        map5 = (Map) cacheParams;
                    }
                    wb.e0.A(mapC, map5);
                    wc.g0 g0Var3 = wc.g0.f27756a;
                } catch (Throwable unused4) {
                    map4 = map2;
                }
                map2 = map4;
            }
            Map mapB2 = kotlin.collections.n0.b(map2);
            aVar2.f16398e.logger.b(AdResponseCacheParamsCollector.TAG, aVar2.new b(mapB2));
            k0Var = aVar2.f16398e.mainDispatcher;
            cVar = aVar2.new c(mapB2, null);
            c0265a.f16399h = null;
            c0265a.f16400i = null;
            c0265a.f16401j = null;
            c0265a.f16402k = null;
            c0265a.f16403l = null;
            c0265a.f16406o = 3;
            if (ud.i.g(k0Var, cVar, c0265a) == objF) {
                return objF;
            }
            return wc.g0.f27756a;
            map3 = (Map) cacheParams;
            wb.e0.A(mapC, map3);
            wc.g0 g0Var4 = wc.g0.f27756a;
            mapC = map;
            aVar2 = aVar;
            if (adResponseCacheParamsCollector.adaptiveResourcesCacheEnabledEvents.contains(aVar2.f16395b)) {
                adResponse = aVar2.f16396c;
                if (adResponse != null) {
                }
                map5 = null;
                map4 = map2;
                wb.e0.A(mapC, map5);
                wc.g0 g0Var5 = wc.g0.f27756a;
                map2 = map4;
            }
            Map mapB3 = kotlin.collections.n0.b(map2);
            aVar2.f16398e.logger.b(AdResponseCacheParamsCollector.TAG, aVar2.new b(mapB3));
            k0Var = aVar2.f16398e.mainDispatcher;
            cVar = aVar2.new c(mapB3, null);
            c0265a.f16399h = null;
            c0265a.f16400i = null;
            c0265a.f16401j = null;
            c0265a.f16402k = null;
            c0265a.f16403l = null;
            c0265a.f16406o = 3;
            if (ud.i.g(k0Var, cVar, c0265a) == objF) {
                return objF;
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseCacheParamsCollector.kt */
    static final class b extends kotlin.jvm.internal.u implements id.a<ec.a> {
        b() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ec.a invoke() {
            return new ec.a(AdResponseCacheParamsCollector.this.ioDispatcher);
        }
    }

    static {
        TrackEventType trackEventType = TrackEventType.AuctionRequest;
        TrackEventType trackEventType2 = TrackEventType.AuctionRequestExpired;
        TrackEventType trackEventType3 = TrackEventType.Click;
        TrackEventType trackEventType4 = TrackEventType.Close;
        TrackEventType trackEventType5 = TrackEventType.Destroy;
        TrackEventType trackEventType6 = TrackEventType.Expired;
        TrackEventType trackEventType7 = TrackEventType.FillAd;
        TrackEventType trackEventType8 = TrackEventType.Show;
        DEFAULT_AD_RESPONSE_CACHE_EVENTS = kotlin.collections.t.n(trackEventType, trackEventType2, trackEventType3, trackEventType4, trackEventType5, trackEventType6, trackEventType7, TrackEventType.ImpressionOpportunity, trackEventType8);
        DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS = kotlin.collections.t.n(trackEventType, trackEventType2, TrackEventType.BrokenCreativeDetector, trackEventType3, trackEventType4, trackEventType5, trackEventType6, trackEventType7, TrackEventType.Load, trackEventType8);
    }

    public AdResponseCacheParamsCollector() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final dc.d getTaskManager() {
        return (dc.d) this.taskManager$delegate.getValue();
    }

    public final void collect(TrackEventType trackEventType, AdResponse adResponse, Callback callback) throws Throwable {
        kotlin.jvm.internal.t.f(trackEventType, "trackEventType");
        kotlin.jvm.internal.t.f(callback, "callback");
        getTaskManager().execute(new a(this, trackEventType, adResponse, callback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(ud.k0 mainDispatcher) {
        this(mainDispatcher, null, null, null, null, null, 62, null);
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(ud.k0 mainDispatcher, ud.k0 ioDispatcher) {
        this(mainDispatcher, ioDispatcher, null, null, null, null, 60, null);
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.f(ioDispatcher, "ioDispatcher");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(ud.k0 mainDispatcher, ud.k0 ioDispatcher, List<? extends TrackEventType> adResponseCacheEnabledEvents) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, null, null, null, 56, null);
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.f(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.f(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(ud.k0 mainDispatcher, ud.k0 k0Var, List<? extends TrackEventType> adResponseCacheEnabledEvents, List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents) {
        this(mainDispatcher, k0Var, adResponseCacheEnabledEvents, adaptiveResourcesCacheEnabledEvents, null, null, 48, null);
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.f(k0Var, UyXgnuLGEkgnZE.KUv);
        kotlin.jvm.internal.t.f(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        kotlin.jvm.internal.t.f(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdResponseCacheParamsCollector(ud.k0 mainDispatcher, ud.k0 ioDispatcher, List<? extends TrackEventType> adResponseCacheEnabledEvents, List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents, z6.c<AdResponse> adResponseCacheParamsAdapter) {
        this(mainDispatcher, ioDispatcher, adResponseCacheEnabledEvents, adaptiveResourcesCacheEnabledEvents, adResponseCacheParamsAdapter, null, 32, null);
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.f(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.f(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        kotlin.jvm.internal.t.f(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
        kotlin.jvm.internal.t.f(adResponseCacheParamsAdapter, "adResponseCacheParamsAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdResponseCacheParamsCollector(ud.k0 mainDispatcher, ud.k0 ioDispatcher, List<? extends TrackEventType> adResponseCacheEnabledEvents, List<? extends TrackEventType> adaptiveResourcesCacheEnabledEvents, z6.c<AdResponse> adResponseCacheParamsAdapter, z6.c<vb.k> adaptiveResourcesCacheParamsAdapter) {
        kotlin.jvm.internal.t.f(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.t.f(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.t.f(adResponseCacheEnabledEvents, "adResponseCacheEnabledEvents");
        kotlin.jvm.internal.t.f(adaptiveResourcesCacheEnabledEvents, "adaptiveResourcesCacheEnabledEvents");
        kotlin.jvm.internal.t.f(adResponseCacheParamsAdapter, "adResponseCacheParamsAdapter");
        kotlin.jvm.internal.t.f(adaptiveResourcesCacheParamsAdapter, "adaptiveResourcesCacheParamsAdapter");
        this.mainDispatcher = mainDispatcher;
        this.ioDispatcher = ioDispatcher;
        this.adResponseCacheEnabledEvents = adResponseCacheEnabledEvents;
        this.adaptiveResourcesCacheEnabledEvents = adaptiveResourcesCacheEnabledEvents;
        this.adResponseCacheParamsAdapter = adResponseCacheParamsAdapter;
        this.adaptiveResourcesCacheParamsAdapter = adaptiveResourcesCacheParamsAdapter;
        this.taskManager$delegate = wc.m.a(new b());
        this.logger = new rc.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AdResponseCacheParamsCollector(ud.k0 k0Var, ud.k0 k0Var2, List list, List list2, z6.c cVar, z6.c cVar2, int i10, kotlin.jvm.internal.k kVar) {
        k0Var = (i10 & 1) != 0 ? wb.w.f27717g.a().f() : k0Var;
        ud.k0 k0VarE = (i10 & 2) != 0 ? wb.w.f27717g.a().e() : k0Var2;
        List list3 = (i10 & 4) != 0 ? DEFAULT_AD_RESPONSE_CACHE_EVENTS : list;
        List list4 = (i10 & 8) != 0 ? DEFAULT_ADAPTIVE_RESOURCES_CACHE_EVENTS : list2;
        if ((i10 & 16) != 0) {
            o0 o0VarF = o0.f();
            kotlin.jvm.internal.t.e(o0VarF, "get()");
            cVar = new AdResponseCacheParamsAdapter(o0VarF);
        }
        this(k0Var, k0VarE, list3, list4, cVar, (i10 & 32) != 0 ? new z6.b(null, la.f.b(), 1, 0 == true ? 1 : 0) : cVar2);
    }
}
