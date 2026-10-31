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
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7437b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7438c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7439d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7440e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f7441f = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f7442g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f7443h = new Object();

    class a implements r5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f7445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7446c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c3 f7447d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f7448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0112a f7449f;

        a(long j10, Map map, String str, c3 c3Var, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
            this.f7444a = j10;
            this.f7445b = map;
            this.f7446c = str;
            this.f7447d = c3Var;
            this.f7448e = context;
            this.f7449f = interfaceC0112a;
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONArray jSONArray) {
            this.f7445b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f7444a));
            this.f7445b.put("calfc", Integer.valueOf(e.this.b(this.f7446c)));
            x5 x5Var = new x5(this.f7447d, jSONArray, this.f7448e, e.this.f7436a, this.f7449f);
            if (((Boolean) e.this.f7436a.a(t3.A8)).booleanValue()) {
                e.this.f7436a.s0().a((k5) x5Var, f6.b.MEDIATION);
            } else {
                e.this.f7436a.s0().a(x5Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements com.applovin.impl.mediation.ads.a.InterfaceC0112a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f7451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f7452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f7453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f7454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f7455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f7456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f7457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f7458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f7459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f7460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f7461k;

        /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.l lVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, lVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f7453c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7460j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f7451a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.f7461k, jElapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && q7.c(this.f7451a) && ((Boolean) this.f7451a.a(z4.E6)).booleanValue();
            if (this.f7451a.a(t3.f8813u8, this.f7455e) && this.f7454d.f7464c < this.f7459i && !z10) {
                c.e(this.f7454d);
                final int iPow = (int) Math.pow(2.0d, this.f7454d.f7464c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7624a.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f7454d.f7464c = 0;
            this.f7454d.f7463b.set(false);
            if (this.f7454d.f7465d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f7454d.f7462a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                v2.a(this.f7454d.f7465d, str, maxError);
                this.f7454d.f7465d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            a3 a3Var = (a3) maxAd;
            a3Var.i(this.f7454d.f7462a);
            a3Var.a(SystemClock.elapsedRealtime() - this.f7460j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) a3Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f7451a.Z().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f7461k, a3Var.getRequestLatencyMillis());
            }
            this.f7453c.a(maxAd.getAdUnitId());
            this.f7454d.f7464c = 0;
            if (this.f7454d.f7465d == null) {
                this.f7453c.a(a3Var);
                this.f7454d.f7463b.set(false);
                int iO = a3Var.O();
                synchronized (this.f7453c.f7440e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f7453c.f7439d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iO) {
                    int i10 = sizeSafely + 1;
                    this.f7451a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7451a.Q().a("MediationAdLoadManagerV2", "Preloading waterfall " + i10 + " of " + iO);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            a3Var.B().c().a(this.f7454d.f7465d);
            this.f7454d.f7465d.onAdLoaded(a3Var);
            this.f7453c.f7441f.put(maxAd.getAdUnitId(), a3Var);
            if (a3Var.R().endsWith("load")) {
                this.f7454d.f7465d.onAdRevenuePaid(a3Var);
            }
            this.f7454d.f7465d = null;
            if ((!this.f7451a.c(t3.f8807o8).contains(maxAd.getAdUnitId()) && !this.f7451a.a(t3.f8806n8, maxAd.getFormat())) || this.f7451a.u0().c() || this.f7451a.u0().d()) {
                this.f7454d.f7463b.set(false);
                return;
            }
            int iO2 = a3Var.O();
            this.f7451a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7451a.Q().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iO2);
            }
            a(maxAd);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.l lVar, Context context) {
            this.f7451a = lVar;
            this.f7452b = new WeakReference(context);
            this.f7453c = eVar;
            this.f7454d = cVar;
            this.f7455e = maxAdFormat;
            this.f7457g = map2;
            this.f7456f = map;
            this.f7458h = map3;
            this.f7460j = j10;
            this.f7461k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f7459i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f7459i = Math.min(2, ((Integer) lVar.a(t3.f8812t8)).intValue());
            } else {
                this.f7459i = ((Integer) lVar.a(t3.f8812t8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextP = (Context) this.f7452b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            this.f7460j = SystemClock.elapsedRealtime();
            this.f7461k = System.currentTimeMillis();
            this.f7458h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f7453c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f7456f, this.f7457g, this.f7458h, contextP, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f7457g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f7457g.put("retry_attempt", Integer.valueOf(this.f7454d.f7464c));
            Context contextP = (Context) this.f7452b.get();
            if (contextP == null) {
                contextP = com.applovin.impl.sdk.l.p();
            }
            this.f7458h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f7458h.put("era", Integer.valueOf(this.f7454d.f7464c));
            this.f7461k = System.currentTimeMillis();
            this.f7453c.a(str, this.f7455e, this.f7456f, this.f7457g, this.f7458h, contextP, this);
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
        private final String f7462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f7463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile com.applovin.impl.mediation.ads.a.InterfaceC0112a f7465d;

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f7464c;
            cVar.f7464c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f7463b = new AtomicBoolean();
            this.f7462a = str;
        }
    }

    public e(com.applovin.impl.sdk.l lVar) {
        this.f7436a = lVar;
    }

    private a3 f(String str) {
        synchronized (this.f7440e) {
            Queue queue = (Queue) this.f7439d.get(str);
            if (CollectionUtils.isEmpty(queue)) {
                return null;
            }
            return (a3) queue.poll();
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f7440e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f7439d.get(str));
        }
        return z10;
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

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        a3 a3Var = (a3) this.f7441f.get(str);
        if (a3Var != null) {
            arrayDeque.add(a3Var);
        }
        synchronized (this.f7438c) {
            Queue queue = (Queue) this.f7439d.get(str);
            if (queue != null) {
                arrayDeque.addAll(queue);
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f7443h) {
            this.f7436a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7436a.Q().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f7442g.get(str);
            if (num == null) {
                num = 0;
            }
            this.f7442g.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f7443h) {
            Integer num = (Integer) this.f7442g.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        a3 a3VarF = (this.f7436a.u0().d() || q7.h(com.applovin.impl.sdk.l.p())) ? null : f(str);
        if (a3VarF != null) {
            a3VarF.i(str2);
            a3VarF.B().c().a(interfaceC0112a);
            interfaceC0112a.onAdLoaded(a3VarF);
            this.f7441f.put(str, a3VarF);
            if (a3VarF.R().endsWith("load")) {
                interfaceC0112a.onAdRevenuePaid(a3VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f7463b.compareAndSet(false, true)) {
            if (cVarA.f7465d != null && cVarA.f7465d != interfaceC0112a) {
                com.applovin.impl.sdk.p.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f7465d = interfaceC0112a;
            return;
        }
        if (a3VarF == null) {
            cVarA.f7465d = interfaceC0112a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f7436a, context, null));
    }

    public void c(String str, String str2) {
        synchronized (this.f7438c) {
            this.f7437b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c3 c3Var = new c3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f7436a.s0().a((k5) new r5(c3Var, context, this.f7436a, new a(jElapsedRealtime, map3, str, c3Var, context, interfaceC0112a)), f6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f7436a.a(z4.R4)).booleanValue()) {
            w3 w3VarA0 = this.f7436a.a0();
            u3 u3Var = u3.f8867e;
            Map mapA = w3VarA0.a(u3Var, v3.a(str));
            u3.a aVar = u3.a.SESSION;
            int iA = a(mapA, aVar);
            u3.a aVar2 = u3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f7436a.a0().a(u3Var, v3.a(maxAdFormat));
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
        synchronized (this.f7440e) {
            Queue arrayDeque = (Queue) this.f7439d.get(a3Var.getAdUnitId());
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                this.f7439d.put(a3Var.getAdUnitId(), arrayDeque);
            }
            arrayDeque.add(a3Var);
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f7438c) {
            String strB = b(str, str2);
            cVar = (c) this.f7437b.get(strB);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f7437b.put(strB, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f7443h) {
            this.f7436a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7436a.Q().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f7442g.remove(str);
        }
    }
}
