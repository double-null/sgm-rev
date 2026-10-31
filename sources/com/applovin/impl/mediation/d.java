package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.c3;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v2;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.x5;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7364b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7365c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7366d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7367e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f7368f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f7369g = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0112a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f7377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f7378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f7379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f7380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f7381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f7382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f7383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f7384h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f7385i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f7386j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f7387k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.l lVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, lVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f7379c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7386j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f7377a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.f7387k, jElapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && q7.c(this.f7377a) && ((Boolean) this.f7377a.a(z4.E6)).booleanValue();
            if (this.f7377a.a(t3.f8813u8, this.f7381e) && this.f7380d.f7390c < this.f7385i && !z10) {
                c.e(this.f7380d);
                final int iPow = (int) Math.pow(2.0d, this.f7380d.f7390c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7619a.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f7380d.f7390c = 0;
            this.f7380d.f7389b.set(false);
            if (this.f7380d.f7391d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f7380d.f7388a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                v2.a(this.f7380d.f7391d, str, maxError);
                this.f7380d.f7391d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a3 a3Var = (a3) maxAd;
            a3Var.i(this.f7380d.f7388a);
            a3Var.a(SystemClock.elapsedRealtime() - this.f7386j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) a3Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f7377a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f7387k, a3Var.getRequestLatencyMillis());
            }
            this.f7379c.a(maxAd.getAdUnitId());
            this.f7380d.f7390c = 0;
            if (this.f7380d.f7391d == null) {
                this.f7379c.a(a3Var);
                this.f7380d.f7389b.set(false);
                return;
            }
            a3Var.B().c().a(this.f7380d.f7391d);
            this.f7380d.f7391d.onAdLoaded(a3Var);
            if (a3Var.R().endsWith("load")) {
                this.f7380d.f7391d.onAdRevenuePaid(a3Var);
            }
            this.f7380d.f7391d = null;
            if (((Boolean) this.f7377a.a(t3.f8809q8)).booleanValue() || !this.f7379c.a(maxAd)) {
                this.f7380d.f7389b.set(false);
                return;
            }
            Context contextP = (Context) this.f7378b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            this.f7386j = SystemClock.elapsedRealtime();
            this.f7387k = System.currentTimeMillis();
            this.f7384h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f7379c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f7382f, this.f7383g, this.f7384h, contextP, this);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.l lVar, Context context) {
            this.f7377a = lVar;
            this.f7378b = new WeakReference(context);
            this.f7379c = dVar;
            this.f7380d = cVar;
            this.f7381e = maxAdFormat;
            this.f7383g = map2;
            this.f7382f = map;
            this.f7384h = map3;
            this.f7386j = j10;
            this.f7387k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f7385i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f7385i = Math.min(2, ((Integer) lVar.a(t3.f8812t8)).intValue());
            } else {
                this.f7385i = ((Integer) lVar.a(t3.f8812t8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f7383g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f7383g.put("retry_attempt", Integer.valueOf(this.f7380d.f7390c));
            Context contextP = (Context) this.f7378b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            this.f7384h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f7384h.put("era", Integer.valueOf(this.f7380d.f7390c));
            this.f7387k = System.currentTimeMillis();
            this.f7379c.a(str, this.f7381e, this.f7382f, this.f7383g, this.f7384h, contextP, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f7389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0112a f7391d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f7390c;
            cVar.f7390c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f7389b = new AtomicBoolean();
            this.f7388a = str;
        }
    }

    public d(com.applovin.impl.sdk.l lVar) {
        this.f7363a = lVar;
    }

    private a3 e(String str) {
        a3 a3Var;
        synchronized (this.f7367e) {
            a3Var = (a3) this.f7366d.get(str);
            this.f7366d.remove(str);
        }
        return a3Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f7365c) {
            this.f7364b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f7367e) {
            z10 = this.f7366d.get(str) != null;
        }
        return z10;
    }

    /* JADX INFO: loaded from: classes2.dex */
    class a implements r5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f7371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c3 f7373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f7374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0112a f7375f;

        a(long j10, Map map, String str, c3 c3Var, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
            this.f7370a = j10;
            this.f7371b = map;
            this.f7372c = str;
            this.f7373d = c3Var;
            this.f7374e = context;
            this.f7375f = interfaceC0112a;
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONArray jSONArray) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7370a;
            this.f7371b.put(ljglrLUdGZhMhQ.aWt, Long.valueOf(jElapsedRealtime));
            this.f7371b.put("calfc", Integer.valueOf(d.this.b(this.f7372c)));
            x5 x5Var = new x5(this.f7373d, jSONArray, this.f7374e, d.this.f7363a, this.f7375f);
            if (((Boolean) d.this.f7363a.a(t3.A8)).booleanValue()) {
                d.this.f7363a.s0().a((k5) x5Var, f6.b.MEDIATION);
            } else {
                d.this.f7363a.s0().a(x5Var);
            }
        }
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f7369g) {
            Integer num = (Integer) this.f7368f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        a3 a3VarE;
        if (this.f7363a.u0().d() || q7.h(com.applovin.impl.sdk.l.p())) {
            a3VarE = null;
        } else if (interfaceC0112a == null && d(str)) {
            return;
        } else {
            a3VarE = e(str);
        }
        if (a3VarE != null) {
            a3VarE.i(str2);
            a3VarE.B().c().a(interfaceC0112a);
            interfaceC0112a.onAdLoaded(a3VarE);
            if (a3VarE.R().endsWith("load")) {
                interfaceC0112a.onAdRevenuePaid(a3VarE);
            }
            if (((Boolean) this.f7363a.a(t3.f8809q8)).booleanValue() && a((MaxAd) a3VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f7389b.compareAndSet(false, true)) {
            if (cVarA.f7391d != null && cVarA.f7391d != interfaceC0112a) {
                com.applovin.impl.sdk.p.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f7391d = interfaceC0112a;
            return;
        }
        if (a3VarE == null) {
            cVarA.f7391d = interfaceC0112a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f7363a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f7369g) {
            this.f7363a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7363a.Q().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f7368f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f7368f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c3 c3Var = new c3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f7363a.s0().a((k5) new r5(c3Var, context, this.f7363a, new a(jElapsedRealtime, map3, str, c3Var, context, interfaceC0112a)), f6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f7363a.a(z4.R4)).booleanValue()) {
            w3 w3VarA0 = this.f7363a.a0();
            u3 u3Var = u3.f8867e;
            Map mapA = w3VarA0.a(u3Var, v3.a(str));
            u3.a aVar = u3.a.SESSION;
            int iA = a(mapA, aVar);
            u3.a aVar2 = u3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f7363a.a0().a(u3Var, v3.a(maxAdFormat));
            return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, u3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var) {
        synchronized (this.f7367e) {
            if (this.f7366d.containsKey(a3Var.getAdUnitId())) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "Ad in cache already: " + a3Var.getAdUnitId());
            }
            this.f7366d.put(a3Var.getAdUnitId(), a3Var);
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f7365c) {
            String strB = b(str, str2);
            cVar = (c) this.f7364b.get(strB);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f7364b.put(strB, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f7369g) {
            this.f7363a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7363a.Q().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f7368f.remove(str);
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f7363a.c(t3.f8807o8).contains(maxAd.getAdUnitId()) && !this.f7363a.a(t3.f8806n8, maxAd.getFormat())) || this.f7363a.u0().c() || this.f7363a.u0().d()) ? false : true;
    }
}
