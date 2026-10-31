package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a4;
import com.applovin.impl.a5;
import com.applovin.impl.b3;
import com.applovin.impl.b5;
import com.applovin.impl.c5;
import com.applovin.impl.c7;
import com.applovin.impl.e4;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.i7;
import com.applovin.impl.j8;
import com.applovin.impl.k5;
import com.applovin.impl.l4;
import com.applovin.impl.m2;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n3;
import com.applovin.impl.n8;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q2;
import com.applovin.impl.q7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.v5;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import rd.PSo.cNMUz;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    public static l E0;
    protected static Context F0;
    private static boolean G0;
    private static final boolean I0;
    private static volatile com.applovin.impl.c J0;
    private AppLovinSdk.SdkInitializationListener A0;
    private AppLovinSdk.SdkInitializationListener B0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f8432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f8440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8442h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f8446j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f8447j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f8448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f8450l;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private List f8453m0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f8460q;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f8463r0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private String f8473w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f8475x0;
    private static final Object K0 = new Object();
    private static final long H0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f8444i = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference f8452m = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f8454n = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference f8456o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f8458p = new AtomicReference();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p f8462r = new p(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f8464s = new com.applovin.impl.f(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b3 f8466t = new b3(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.applovin.impl.s1 f8468u = new com.applovin.impl.s1(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o7 f8470v = new o7(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f8472w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicReference f8474x = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicReference f8476y = new AtomicReference();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicReference f8478z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final AtomicReference f8429a0 = new AtomicReference();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final AtomicReference f8431b0 = new AtomicReference();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final AtomicReference f8433c0 = new AtomicReference();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final AtomicReference f8435d0 = new AtomicReference();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final AtomicReference f8437e0 = new AtomicReference();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final AtomicReference f8439f0 = new AtomicReference();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final AtomicReference f8441g0 = new AtomicReference();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final AtomicReference f8443h0 = new AtomicReference();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final AtomicReference f8445i0 = new AtomicReference();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final AtomicReference f8449k0 = new AtomicReference();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AtomicReference f8451l0 = new AtomicReference();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Object f8455n0 = new Object();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f8457o0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final AtomicBoolean f8459p0 = new AtomicBoolean();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final AtomicBoolean f8461q0 = new AtomicBoolean();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f8465s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f8467t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f8469u0 = false;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f8471v0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final Object f8477y0 = new Object();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private SdkConfigurationImpl f8479z0 = new SdkConfigurationImpl(this);
    private final k5 C0 = new u6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.o0
        @Override // java.lang.Runnable
        public final void run() {
            this.f8665a.M0();
        }
    });
    private final k5 D0 = new u6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.p0
        @Override // java.lang.Runnable
        public final void run() {
            this.f8668a.N0();
        }
    });

    /* JADX INFO: loaded from: classes.dex */
    class a implements v5.b {
        a() {
        }

        @Override // com.applovin.impl.v5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            l.this.c(jSONObject);
            if (((Boolean) l.this.a(t3.f8808p8)).booleanValue()) {
                l lVar = l.this;
                lVar.f8447j0 = new com.applovin.impl.mediation.e(lVar);
            }
            l.this.n().a();
            com.applovin.impl.s0.a(jSONObject, zIsValid, l.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            l.this.W().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            l.this.E().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(m.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(l.F0).getAll().size());
            l.this.x0().d(f2.f6482f, CollectionUtils.map("details", jSONObject2.toString()));
            l lVar2 = l.this;
            lVar2.f8453m0 = lVar2.a(jSONObject);
            if (zIsValid) {
                l.this.f8479z0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            l.this.u0().a(jSONObject);
            l.this.b(jSONObject);
            v2.b(((Boolean) l.this.a(z4.A6)).booleanValue());
            v2.a(((Boolean) l.this.a(z4.B6)).booleanValue());
            l.this.R0();
            if (!((Boolean) l.this.a(z4.f9254i3)).booleanValue() || zIsValid || !com.applovin.impl.s0.a(l.p())) {
                l.this.P0();
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            l.this.U0();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements com.applovin.impl.v0.c {
        b() {
        }

        @Override // com.applovin.impl.v0.c
        public void a(com.applovin.impl.v0.b bVar) {
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            l.this.f8461q0.set(bVar.b());
            if (!bVar.a()) {
                l.this.c("Initializing SDK in MAX environment...");
                return;
            }
            l.this.Q();
            if (p.a()) {
                l.this.Q().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            l.this.T0();
            l.this.S0();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    class c implements v5.b {
        c() {
        }

        @Override // com.applovin.impl.v5.b
        public void a(JSONObject jSONObject) {
            l.this.c(jSONObject);
            l.this.f8444i.set(false);
            l.this.P0();
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.m0
                @Override // java.lang.Runnable
                public final void run() {
                    q7.c();
                }
            });
            I0 = true;
        } catch (Throwable unused) {
            I0 = false;
        }
    }

    public l(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f8463r0 = false;
        E0 = this;
        this.f8446j = appLovinSdkSettings;
        this.f8434d = System.currentTimeMillis();
        this.f8463r0 = true;
        if (!H0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        F0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f8432c = new WeakReference((Activity) context);
        }
    }

    private void C0() {
        Context context = F0;
        p pVarQ = Q();
        c5 c5VarR0 = r0();
        com.applovin.impl.v0 v0VarY = y();
        a(context);
        o0();
        k();
        e0();
        U().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f8428a;
        if (str == null || str.length() != 86) {
            p.h("AppLovinSdk", "SDK key provided is invalid (" + this.f8428a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f8430b) && this.f8430b.length() != 36) {
            String str2 = "Axon event key length " + this.f8430b + " is invalid - expected 36";
            if (q7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            p.h("AppLovinSdk", str2);
        }
        if (v0VarY.l()) {
            String str3 = "Terms Flow has been replaced. " + v0VarY.g();
            if (q7.c(this)) {
                throw new IllegalStateException(str3);
            }
            p.h("AppLovinSdk", str3);
        }
        if (q7.j()) {
            p.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!q7.b(this)) {
            p.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (q7.m(context)) {
            this.f8446j.setVerboseLogging(true);
        }
        q0().a(z4.f9268k, Boolean.valueOf(this.f8446j.isVerboseLoggingEnabled()));
        y3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        b5 b5Var = b5.f6132c;
        if (TextUtils.isEmpty((String) c5VarR0.a(b5Var, (Object) null, defaultSharedPreferences))) {
            this.f8467t0 = true;
            c5VarR0.b(b5Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            c5VarR0.b(b5Var, Boolean.toString(false), defaultSharedPreferences);
        }
        b5 b5Var2 = b5.f6133d;
        if (((Boolean) c5VarR0.a(b5Var2, Boolean.FALSE)).booleanValue()) {
            if (p.a()) {
                pVarQ.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f8469u0 = true;
        } else {
            if (p.a()) {
                pVarQ.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            c5VarR0.b(b5Var2, Boolean.TRUE);
            c5VarR0.b(b5.f6149t, Boolean.valueOf(v0VarY.j()));
        }
        b5 b5Var3 = b5.f6134e;
        this.f8438f = ((Long) c5VarR0.a(b5Var3, 0L)).longValue() + 1;
        r0().b(b5Var3, Long.valueOf(this.f8438f));
        b5 b5Var4 = b5.f6135f;
        this.f8440g = (Long) c5VarR0.a(b5Var4, null);
        r0().b(b5Var4, Long.valueOf(H0));
        b5 b5Var5 = b5.f6136g;
        String str4 = (String) c5VarR0.a(b5Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > q7.g(str4)) {
                c5VarR0.b(b5Var5, AppLovinSdk.VERSION);
            }
        } else {
            c5VarR0.b(b5Var5, AppLovinSdk.VERSION);
        }
        x0().d(f2.f6479e, CollectionUtils.map("details", "isInitProviderContextSet=" + G0));
    }

    public static boolean H0() {
        return I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (s0().f()) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Timing out adapters init...");
        }
        s0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        f6 f6VarS0 = s0();
        int i10 = this.f8471v0 + 1;
        this.f8471v0 = i10;
        f6VarS0.a((k5) new v5(i10, this, new c()), f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        if (I0()) {
            m2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0() {
        synchronized (this.f8455n0) {
            boolean zA = com.applovin.impl.s0.a(p());
            if (!I0()) {
                Q();
                if (p.a()) {
                    Q().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + X());
                }
            }
            if (!((Boolean) a(z4.f9263j3)).booleanValue() || zA) {
                T0();
            }
            if (((Boolean) a(z4.f9254i3)).booleanValue() && !zA) {
                Q();
                if (p.a()) {
                    Q().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                U0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        Long l10 = (Long) a(z4.f9335r3);
        if (l10.longValue() >= 0 && this.f8444i.compareAndSet(false, true)) {
            j8.a(l10.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8687a.L0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        if (!I0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f8459p0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!y().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            y().a(w0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        a4 a4VarE0 = e0();
        a4VarE0.a(new d(a4VarE0));
    }

    private Map Y() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(z4.f9309o4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public com.applovin.impl.g1 A() {
        Object g1Var = this.U.get();
        if (g1Var == null) {
            synchronized (this.U) {
                g1Var = this.U.get();
                if (g1Var == null) {
                    g1Var = new com.applovin.impl.g1(this);
                    this.U.set(g1Var);
                }
            }
        }
        if (g1Var == this.U) {
            g1Var = null;
        }
        return (com.applovin.impl.g1) g1Var;
    }

    public AppLovinSdk A0() {
        return this.f8460q;
    }

    public m B() {
        Object mVar = this.A.get();
        if (mVar == null) {
            synchronized (this.A) {
                mVar = this.A.get();
                if (mVar == null) {
                    mVar = new m(this);
                    this.A.set(mVar);
                }
            }
        }
        if (mVar == this.A) {
            mVar = null;
        }
        return (m) mVar;
    }

    public boolean B0() {
        return this.f8469u0;
    }

    public com.applovin.impl.k1 C() {
        Object k1Var = this.D.get();
        if (k1Var == null) {
            synchronized (this.D) {
                k1Var = this.D.get();
                if (k1Var == null) {
                    k1Var = new com.applovin.impl.k1(this);
                    this.D.set(k1Var);
                }
            }
        }
        if (k1Var == this.D) {
            k1Var = null;
        }
        return (com.applovin.impl.k1) k1Var;
    }

    public String D() {
        return this.f8473w0;
    }

    public boolean D0() {
        boolean z10;
        synchronized (this.f8455n0) {
            z10 = this.f8465s0;
        }
        return z10;
    }

    public com.applovin.impl.s1 E() {
        return this.f8468u;
    }

    public boolean E0() {
        return this.f8467t0;
    }

    public String F() {
        return y0().d();
    }

    public boolean F0() {
        boolean z10;
        synchronized (this.f8477y0) {
            z10 = this.f8475x0 != null;
        }
        return z10;
    }

    public EventServiceImpl G() {
        Object eventServiceImpl = this.f8456o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f8456o) {
                eventServiceImpl = this.f8456o.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new EventServiceImpl(this);
                    this.f8456o.set(eventServiceImpl);
                }
            }
        }
        if (eventServiceImpl == this.f8456o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public boolean G0() {
        boolean z10;
        synchronized (this.f8455n0) {
            z10 = this.f8463r0;
        }
        return z10;
    }

    public com.applovin.impl.v1 H() {
        Object v1Var = this.f8449k0.get();
        if (v1Var == null) {
            synchronized (this.f8449k0) {
                v1Var = this.f8449k0.get();
                if (v1Var == null) {
                    v1Var = new com.applovin.impl.v1(this);
                    this.f8449k0.set(v1Var);
                }
            }
        }
        if (v1Var == this.f8449k0) {
            v1Var = null;
        }
        return (com.applovin.impl.v1) v1Var;
    }

    public n I() {
        Object nVar = this.G.get();
        if (nVar == null) {
            synchronized (this.G) {
                nVar = this.G.get();
                if (nVar == null) {
                    nVar = new n(this);
                    this.G.set(nVar);
                }
            }
        }
        if (nVar == this.G) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean I0() {
        return StringUtils.containsIgnoreCase(X(), AppLovinMediationProvider.MAX);
    }

    public o J() {
        Object oVar = this.I.get();
        if (oVar == null) {
            synchronized (this.I) {
                oVar = this.I.get();
                if (oVar == null) {
                    oVar = new o(this);
                    this.I.set(oVar);
                }
            }
        }
        if (oVar == this.I) {
            oVar = null;
        }
        return (o) oVar;
    }

    public boolean J0() {
        return q7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity K() {
        WeakReference weakReference;
        if (!((Boolean) a(z4.D4)).booleanValue() || (weakReference = this.f8432c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration L() {
        return this.f8475x0;
    }

    public long M() {
        return this.f8434d;
    }

    public Long N() {
        return this.f8440g;
    }

    public long O() {
        return this.f8438f;
    }

    protected void O0() {
        b(false);
    }

    public q2 P() {
        Object q2Var = this.Y.get();
        if (q2Var == null) {
            synchronized (this.Y) {
                q2Var = this.Y.get();
                if (q2Var == null) {
                    q2Var = new q2(this);
                    this.Y.set(q2Var);
                }
            }
        }
        if (q2Var == this.Y) {
            q2Var = null;
        }
        return (q2) q2Var;
    }

    public p Q() {
        return this.f8462r;
    }

    public void Q0() {
        if (StringUtils.isValidString(this.f8450l)) {
            return;
        }
        this.f8450l = AppLovinMediationProvider.MAX;
    }

    public b3 R() {
        return this.f8466t;
    }

    public com.applovin.impl.mediation.d S() {
        Object dVar = this.f8445i0.get();
        if (dVar == null) {
            synchronized (this.f8445i0) {
                dVar = this.f8445i0.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.mediation.d(this);
                    this.f8445i0.set(dVar);
                }
            }
        }
        if (dVar == this.f8445i0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void S0() {
        u().a();
    }

    public com.applovin.impl.mediation.e T() {
        return this.f8447j0;
    }

    public void T0() {
        synchronized (this.f8455n0) {
            this.f8463r0 = true;
            s0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f U() {
        Object fVar = this.f8435d0.get();
        if (fVar == null) {
            synchronized (this.f8435d0) {
                fVar = this.f8435d0.get();
                if (fVar == null) {
                    fVar = new com.applovin.impl.mediation.f(this);
                    this.f8435d0.set(fVar);
                }
            }
        }
        if (fVar == this.f8435d0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public com.applovin.impl.mediation.g V() {
        Object gVar = this.f8433c0.get();
        if (gVar == null) {
            synchronized (this.f8433c0) {
                gVar = this.f8433c0.get();
                if (gVar == null) {
                    gVar = new com.applovin.impl.mediation.g(this);
                    this.f8433c0.set(gVar);
                }
            }
        }
        if (gVar == this.f8433c0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void V0() {
        p.h("AppLovinSdk", "Resetting SDK state...");
        q0().a();
        q0().e();
        if (this.f8457o0.compareAndSet(true, false)) {
            T0();
        } else {
            this.f8457o0.set(true);
        }
    }

    public r3 W() {
        Object r3Var = this.f8441g0.get();
        if (r3Var == null) {
            synchronized (this.f8441g0) {
                r3Var = this.f8441g0.get();
                if (r3Var == null) {
                    r3Var = new r3(this);
                    this.f8441g0.set(r3Var);
                }
            }
        }
        if (r3Var == this.f8441g0) {
            r3Var = null;
        }
        return (r3) r3Var;
    }

    public void W0() {
        if (StringUtils.isValidString(this.f8473w0)) {
            return;
        }
        this.f8473w0 = AppLovinMediationProvider.MAX;
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String X() {
        return this.f8450l;
    }

    public void X0() {
        z().n();
    }

    public void Y0() {
        a((Map) null);
    }

    public MediationServiceImpl Z() {
        Object mediationServiceImpl = this.f8437e0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f8437e0) {
                mediationServiceImpl = this.f8437e0.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new MediationServiceImpl(this);
                    this.f8437e0.set(mediationServiceImpl);
                }
            }
        }
        if (mediationServiceImpl == this.f8437e0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public w3 a0() {
        Object w3Var = this.f8478z.get();
        if (w3Var == null) {
            synchronized (this.f8478z) {
                w3Var = this.f8478z.get();
                if (w3Var == null) {
                    w3Var = new w3(this);
                    this.f8478z.set(w3Var);
                }
            }
        }
        if (w3Var == this.f8478z) {
            w3Var = null;
        }
        return (w3) w3Var;
    }

    public x3 b0() {
        Object x3Var = this.f8439f0.get();
        if (x3Var == null) {
            synchronized (this.f8439f0) {
                x3Var = this.f8439f0.get();
                if (x3Var == null) {
                    x3Var = new x3();
                    this.f8439f0.set(x3Var);
                }
            }
        }
        if (x3Var == this.f8439f0) {
            x3Var = null;
        }
        return (x3) x3Var;
    }

    public q c0() {
        Object qVar = this.f8443h0.get();
        if (qVar == null) {
            synchronized (this.f8443h0) {
                qVar = this.f8443h0.get();
                if (qVar == null) {
                    qVar = new q(this);
                    this.f8443h0.set(qVar);
                }
            }
        }
        if (qVar == this.f8443h0) {
            qVar = null;
        }
        return (q) qVar;
    }

    public AppLovinNativeAdService d0() {
        Object appLovinNativeAdService = this.f8454n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f8454n) {
                appLovinNativeAdService = this.f8454n.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new AppLovinNativeAdService(this);
                    this.f8454n.set(appLovinNativeAdService);
                }
            }
        }
        if (appLovinNativeAdService == this.f8454n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public a4 e0() {
        Object a4Var = this.M.get();
        if (a4Var == null) {
            synchronized (this.M) {
                a4Var = this.M.get();
                if (a4Var == null) {
                    a4Var = new a4(p());
                    this.M.set(a4Var);
                }
            }
        }
        if (a4Var == this.M) {
            a4Var = null;
        }
        return (a4) a4Var;
    }

    public e4 f0() {
        Object e4Var = this.X.get();
        if (e4Var == null) {
            synchronized (this.X) {
                e4Var = this.X.get();
                if (e4Var == null) {
                    e4Var = new e4(this);
                    this.X.set(e4Var);
                }
            }
        }
        if (e4Var == this.X) {
            e4Var = null;
        }
        return (e4) e4Var;
    }

    public l4 g0() {
        Object l4Var = this.T.get();
        if (l4Var == null) {
            synchronized (this.T) {
                l4Var = this.T.get();
                if (l4Var == null) {
                    l4Var = new l4(this);
                    this.T.set(l4Var);
                }
            }
        }
        if (l4Var == this.T) {
            l4Var = null;
        }
        return (l4) l4Var;
    }

    public com.applovin.impl.sdk.network.b h0() {
        Object bVar = this.f8429a0.get();
        if (bVar == null) {
            synchronized (this.f8429a0) {
                bVar = this.f8429a0.get();
                if (bVar == null) {
                    bVar = new com.applovin.impl.sdk.network.b(this);
                    this.f8429a0.set(bVar);
                }
            }
        }
        if (bVar == this.f8429a0) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl i0() {
        Object postbackServiceImpl = this.Z.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Z) {
                postbackServiceImpl = this.Z.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new PostbackServiceImpl(this);
                    this.Z.set(postbackServiceImpl);
                }
            }
        }
        if (postbackServiceImpl == this.Z) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public String j0() {
        return y0().a();
    }

    public String k0() {
        return this.f8428a;
    }

    public MaxSegmentCollectionImpl l0() {
        return (MaxSegmentCollectionImpl) this.f8448k;
    }

    public Map m0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplL0 = l0();
        if (maxSegmentCollectionImplL0 == null) {
            return null;
        }
        return maxSegmentCollectionImplL0.getJsonData();
    }

    public y4 n0() {
        Object y4Var = this.O.get();
        if (y4Var == null) {
            synchronized (this.O) {
                y4Var = this.O.get();
                if (y4Var == null) {
                    y4Var = new y4(this);
                    this.O.set(y4Var);
                }
            }
        }
        if (y4Var == this.O) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public SessionTracker o0() {
        Object sessionTracker = this.H.get();
        if (sessionTracker == null) {
            synchronized (this.H) {
                sessionTracker = this.H.get();
                if (sessionTracker == null) {
                    sessionTracker = new SessionTracker(this);
                    this.H.set(sessionTracker);
                }
            }
        }
        if (sessionTracker == this.H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings p0() {
        return this.f8446j;
    }

    public j q() {
        Object jVar = this.P.get();
        if (jVar == null) {
            synchronized (this.P) {
                jVar = this.P.get();
                if (jVar == null) {
                    jVar = new j(this);
                    this.P.set(jVar);
                }
            }
        }
        if (jVar == this.P) {
            jVar = null;
        }
        return (j) jVar;
    }

    public a5 q0() {
        Object a5Var = this.f8474x.get();
        if (a5Var == null) {
            synchronized (this.f8474x) {
                a5Var = this.f8474x.get();
                if (a5Var == null) {
                    a5Var = new a5(this);
                    this.f8474x.set(a5Var);
                }
            }
        }
        if (a5Var == this.f8474x) {
            a5Var = null;
        }
        return (a5) a5Var;
    }

    public String r() {
        return this.f8430b;
    }

    public c5 r0() {
        Object c5Var = this.B.get();
        if (c5Var == null) {
            synchronized (this.B) {
                c5Var = this.B.get();
                if (c5Var == null) {
                    c5Var = new c5(this);
                    this.B.set(c5Var);
                }
            }
        }
        if (c5Var == this.B) {
            c5Var = null;
        }
        return (c5) c5Var;
    }

    public String s() {
        return y0().b();
    }

    public f6 s0() {
        Object f6Var = this.f8472w.get();
        if (f6Var == null) {
            synchronized (this.f8472w) {
                f6Var = this.f8472w.get();
                if (f6Var == null) {
                    f6Var = new f6(this);
                    this.f8472w.set(f6Var);
                }
            }
        }
        if (f6Var == this.f8472w) {
            f6Var = null;
        }
        return (f6) f6Var;
    }

    public CmpServiceImpl t() {
        Object cmpServiceImpl = this.f8458p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f8458p) {
                cmpServiceImpl = this.f8458p.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new CmpServiceImpl(this);
                    this.f8458p.set(cmpServiceImpl);
                }
            }
        }
        if (cmpServiceImpl == this.f8458p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public c7 t0() {
        Object c7Var = this.R.get();
        if (c7Var == null) {
            synchronized (this.R) {
                c7Var = this.R.get();
                if (c7Var == null) {
                    c7Var = new c7(this);
                    this.R.set(c7Var);
                }
            }
        }
        if (c7Var == this.R) {
            c7Var = null;
        }
        return (c7) c7Var;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f8428a + "', enabled=" + this.f8465s0 + ", isFirstSession=" + this.f8467t0 + '}';
    }

    public k u() {
        Object kVar = this.N.get();
        if (kVar == null) {
            synchronized (this.N) {
                kVar = this.N.get();
                if (kVar == null) {
                    kVar = new k(this);
                    this.N.set(kVar);
                }
            }
        }
        if (kVar == this.N) {
            kVar = null;
        }
        return (k) kVar;
    }

    public i7 u0() {
        Object i7Var = this.f8451l0.get();
        if (i7Var == null) {
            synchronized (this.f8451l0) {
                i7Var = this.f8451l0.get();
                if (i7Var == null) {
                    i7Var = new i7(this);
                    this.f8451l0.set(i7Var);
                }
            }
        }
        if (i7Var == this.f8451l0) {
            i7Var = null;
        }
        return (i7) i7Var;
    }

    public String v() {
        return y0().c();
    }

    public long v0() {
        if (this.f8442h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f8442h;
    }

    public SdkConfigurationImpl w() {
        return this.f8479z0;
    }

    public Activity w0() {
        Activity activityB = a(p()).b();
        return activityB != null ? activityB : K();
    }

    public com.applovin.impl.r0 x() {
        Object r0Var = this.f8476y.get();
        if (r0Var == null) {
            synchronized (this.f8476y) {
                r0Var = this.f8476y.get();
                if (r0Var == null) {
                    r0Var = new com.applovin.impl.r0(this);
                    this.f8476y.set(r0Var);
                }
            }
        }
        if (r0Var == this.f8476y) {
            r0Var = null;
        }
        return (com.applovin.impl.r0) r0Var;
    }

    public o7 x0() {
        return this.f8470v;
    }

    public com.applovin.impl.v0 y() {
        Object v0Var = this.Q.get();
        if (v0Var == null) {
            synchronized (this.Q) {
                v0Var = this.Q.get();
                if (v0Var == null) {
                    v0Var = new com.applovin.impl.v0(this);
                    this.Q.set(v0Var);
                }
            }
        }
        if (v0Var == this.Q) {
            v0Var = null;
        }
        return (com.applovin.impl.v0) v0Var;
    }

    public p7 y0() {
        Object p7Var = this.C.get();
        if (p7Var == null) {
            synchronized (this.C) {
                p7Var = this.C.get();
                if (p7Var == null) {
                    p7Var = new p7(this);
                    this.C.set(p7Var);
                }
            }
        }
        if (p7Var == this.C) {
            p7Var = null;
        }
        return (p7) p7Var;
    }

    public com.applovin.impl.f1 z() {
        Object f1Var = this.S.get();
        if (f1Var == null) {
            synchronized (this.S) {
                f1Var = this.S.get();
                if (f1Var == null) {
                    f1Var = new com.applovin.impl.f1(this);
                    this.S.set(f1Var);
                }
            }
        }
        if (f1Var == this.S) {
            f1Var = null;
        }
        return (com.applovin.impl.f1) f1Var;
    }

    public n8 z0() {
        Object n8Var = this.L.get();
        if (n8Var == null) {
            synchronized (this.L) {
                n8Var = this.L.get();
                if (n8Var == null) {
                    n8Var = new n8(this);
                    this.L.set(n8Var);
                }
            }
        }
        if (n8Var == this.L) {
            n8Var = null;
        }
        return (n8) n8Var;
    }

    private void d() {
        f6 f6VarS0 = s0();
        int i10 = this.f8471v0 + 1;
        this.f8471v0 = i10;
        f6VarS0.a((k5) new v5(i10, this, new a()), f6.b.CORE);
    }

    public static long o() {
        return H0;
    }

    public static Context p() {
        return F0;
    }

    public void Z0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.f8450l) && ((Boolean) a(z4.S3)).booleanValue()) {
            String str = (String) a(z4.R3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb2.append(str2);
            sb2.append(GEmOVMyH.ABBWOmAgmWsaQ);
            if (str.startsWith(sb2.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            p.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8426a.b(str3);
                }
            });
        }
    }

    public com.applovin.impl.c e() {
        return a(F0);
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.F.get();
        if (aVar == null) {
            synchronized (this.F) {
                aVar = this.F.get();
                if (aVar == null) {
                    aVar = new com.applovin.impl.sdk.a(this);
                    this.F.set(aVar);
                }
            }
        }
        if (aVar == this.F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.f g() {
        return this.f8464s;
    }

    public com.applovin.impl.sdk.c h() {
        Object cVar = this.K.get();
        if (cVar == null) {
            synchronized (this.K) {
                cVar = this.K.get();
                if (cVar == null) {
                    cVar = new com.applovin.impl.sdk.c(this);
                    this.K.set(cVar);
                }
            }
        }
        if (cVar == this.K) {
            cVar = null;
        }
        return (com.applovin.impl.sdk.c) cVar;
    }

    public e i() {
        Object eVar = this.V.get();
        if (eVar == null) {
            synchronized (this.V) {
                eVar = this.V.get();
                if (eVar == null) {
                    eVar = new e(this);
                    this.V.set(eVar);
                }
            }
        }
        if (eVar == this.V) {
            eVar = null;
        }
        return (e) eVar;
    }

    public f j() {
        Object fVar = this.E.get();
        if (fVar == null) {
            synchronized (this.E) {
                fVar = this.E.get();
                if (fVar == null) {
                    fVar = new f(this);
                    this.E.set(fVar);
                }
            }
        }
        if (fVar == this.E) {
            fVar = null;
        }
        return (f) fVar;
    }

    public com.applovin.impl.j k() {
        Object jVar = this.f8431b0.get();
        if (jVar == null) {
            synchronized (this.f8431b0) {
                jVar = this.f8431b0.get();
                if (jVar == null) {
                    jVar = new com.applovin.impl.j(this);
                    this.f8431b0.set(jVar);
                }
            }
        }
        if (jVar == this.f8431b0) {
            jVar = null;
        }
        return (com.applovin.impl.j) jVar;
    }

    public AppLovinAdServiceImpl l() {
        Object appLovinAdServiceImpl = this.f8452m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f8452m) {
                appLovinAdServiceImpl = this.f8452m.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                    this.f8452m.set(appLovinAdServiceImpl);
                }
            }
        }
        if (appLovinAdServiceImpl == this.f8452m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public h m() {
        Object hVar = this.J.get();
        if (hVar == null) {
            synchronized (this.J) {
                hVar = this.J.get();
                if (hVar == null) {
                    hVar = new h();
                    this.J.set(hVar);
                }
            }
        }
        if (hVar == this.J) {
            hVar = null;
        }
        return (h) hVar;
    }

    public i n() {
        Object iVar = this.W.get();
        if (iVar == null) {
            synchronized (this.W) {
                iVar = this.W.get();
                if (iVar == null) {
                    iVar = new i(this);
                    this.W.set(iVar);
                }
            }
        }
        if (iVar == this.W) {
            iVar = null;
        }
        return (i) iVar;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        F0 = context.getApplicationContext();
        G0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f8442h = System.currentTimeMillis();
            com.applovin.impl.s0.c(jSONObject, this);
            com.applovin.impl.s0.b(jSONObject, this);
            com.applovin.impl.s0.a(jSONObject, this);
            n3.f(jSONObject, this);
            n3.d(jSONObject, this);
            n3.e(jSONObject, this);
            n3.g(jSONObject, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        C0();
        this.f8446j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            p.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            q0().a(z4.R3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(z4.f9340s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        f6 f6VarS0 = s0();
        k5 k5Var = this.C0;
        f6.b bVar = f6.b.CORE;
        f6VarS0.a(k5Var, bVar);
        s0().a(this.D0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f8460q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextP = p();
        return a(contextP.getResources().getIdentifier(str, "string", contextP.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", str);
        }
        s0().a(new e6(this));
    }

    public static String a(int i10, List list) {
        String string = p().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            p.h("AppLovinSdk", (String) it.next());
        }
    }

    public void c() {
        synchronized (this.f8455n0) {
            if (!this.f8463r0 && !this.f8465s0) {
                T0();
            }
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (J0 == null) {
            synchronized (K0) {
                if (J0 == null) {
                    J0 = new com.applovin.impl.c(context);
                }
            }
        }
        return J0;
    }

    /* JADX INFO: loaded from: classes.dex */
    class d implements a4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a4 f8483a;

        d(a4 a4Var) {
            this.f8483a = a4Var;
        }

        @Override // com.applovin.impl.a4.a
        public void a() {
            l.this.Q();
            if (p.a()) {
                l.this.Q().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (l.this.f8455n0) {
                if (!l.this.f8463r0) {
                    l.this.T0();
                }
            }
            this.f8483a.b(this);
        }

        @Override // com.applovin.impl.a4.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!q7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            E().a(f2.f6472b1, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(z4 z4Var) {
        return q0().c(z4Var);
    }

    public void c(b5 b5Var) {
        r0().b(b5Var);
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f8477y0) {
            if (this.f8475x0 != null) {
                p.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f8475x0 + ". Ignoring the provided initialization configuration.");
                if (!D0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8677a.a(sdkInitializationListener);
                    }
                });
                return;
            }
            this.f8436e = System.currentTimeMillis();
            this.f8475x0 = appLovinSdkInitializationConfiguration;
            this.A0 = sdkInitializationListener;
            if (p.a()) {
                p pVar = this.f8462r;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Initializing with configuration: ");
                sb2.append(this.f8475x0);
                sb2.append(", listener: ");
                sb2.append(this.A0 != null ? "configured" : "none");
                pVar.a("AppLovinSdk", sb2.toString());
            }
            this.f8428a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.f8430b = appLovinSdkInitializationConfiguration.getAxonEventKey();
            this.f8450l = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.f8448k = appLovinSdkInitializationConfiguration.getSegmentCollection();
            q7.a(new Runnable() { // from class: com.applovin.impl.sdk.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8681a.a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    protected void b(boolean z10) {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (y().i() || (sdkInitializationListener = this.A0) == null) {
            return;
        }
        if (D0()) {
            this.A0 = null;
            this.B0 = null;
            U().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.B0 == sdkInitializationListener) {
                return;
            }
            U().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(z4.f9313p)).booleanValue()) {
                this.A0 = null;
            } else {
                this.B0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", D0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, cNMUz.JSLRDe, this.f8461q0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f8436e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f8470v.d(f2.f6494j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8485a.b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(z4.f9322q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f8479z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f8479z0);
    }

    public void a(boolean z10) {
        synchronized (this.f8455n0) {
            this.f8463r0 = false;
            this.f8465s0 = z10;
        }
        if (z10) {
            List listA = y3.a(this);
            if (listA.isEmpty()) {
                s0().g();
                O0();
                return;
            }
            Long l10 = (Long) a(t3.f8820z7);
            u6 u6Var = new u6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8514a.K0();
                }
            });
            Q();
            if (p.a()) {
                Q().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l10 + "ms...");
            }
            s0().a(u6Var, f6.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public List b(z4 z4Var) {
        return q0().b(z4Var);
    }

    public void b(b5 b5Var, Object obj) {
        r0().b(b5Var, obj);
    }

    public Object b(b5 b5Var) {
        return r0().a(b5Var);
    }

    public String b() {
        if (StringUtils.isValidString(this.f8473w0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map mapY = Y();
        List listC = c(z4.f9327q4);
        Boolean bool = (Boolean) a(z4.f9336r4);
        if (mapY.isEmpty() && !bool.booleanValue()) {
            return null;
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Integer numValueOf = (Integer) a(z4.f9318p4);
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (numValueOf.intValue() <= 0) {
                    break;
                }
                String className = stackTraceElement.getClassName();
                Iterator it = listC.iterator();
                do {
                    if (!it.hasNext()) {
                        for (Map.Entry entry : mapY.entrySet()) {
                            if (className.startsWith((String) entry.getKey())) {
                                this.f8473w0 = (String) entry.getValue();
                                Q();
                                if (p.a()) {
                                    Q().a("AppLovinSdk", "Detected mediation provider: " + this.f8473w0);
                                }
                                return null;
                            }
                        }
                        if (bool.booleanValue()) {
                            arrayList.add(className);
                        }
                        numValueOf = Integer.valueOf(numValueOf.intValue() - 1);
                        break;
                    }
                } while (!className.startsWith((String) it.next()));
            }
        } catch (Throwable th) {
            E().a("AppLovinSdk", "detectMediationProvider", th);
        }
        this.f8473w0 = "unknown";
        Q();
        if (p.a()) {
            Q().k("AppLovinSdk", "Unable to detect mediation provider");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strJoin = StringUtils.join(",", arrayList);
        if (!((Boolean) a(z4.f9345s4)).booleanValue()) {
            return strJoin;
        }
        E().a(f2.f6476d, "detectMediationProvider", CollectionUtils.hashMap("details", strJoin));
        return null;
    }

    public void a(m3 m3Var) {
        if (s0().f()) {
            return;
        }
        List listA = y3.a(this);
        if (listA.size() <= 0 || !U().a().containsAll(listA)) {
            return;
        }
        Q();
        if (p.a()) {
            Q().a("AppLovinSdk", "All required adapters initialized");
        }
        s0().g();
        O0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f8453m0;
        return (list == null || list.size() <= 0 || this.f8453m0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) r0().a(b5.f6136g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < q7.g(str)) {
                p.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(z4 z4Var) {
        return q0().a(z4Var);
    }

    public boolean a(z4 z4Var, MaxAdFormat maxAdFormat) {
        return b(z4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        W().a(map);
    }

    public void a(Uri uri) {
        C().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        r0().a(str, obj, editor);
    }

    public Object a(b5 b5Var) {
        return a(b5Var, (Object) null);
    }

    public Object a(b5 b5Var, Object obj) {
        return r0().a(b5Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return c5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        r0().a(sharedPreferences);
    }
}
