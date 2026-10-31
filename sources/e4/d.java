package e4;

import android.os.Build;
import android.util.Log;
import b4.u;
import b4.y0;
import com.google.firebase.installations.FirebaseInstallationsApi;
import id.p;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;
import wc.g0;
import wc.s;
import wc.w;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f14391g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f14392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final rd.o f14393i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f14394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseInstallationsApi f14395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4.b f14396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e4.a f14397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f14398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final de.a f14399f;

    /* JADX INFO: compiled from: RemoteSettings.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final int a() {
            return d.f14392h;
        }
    }

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f14400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f14401i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f14403k;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14401i = obj;
            this.f14403k |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {126}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<JSONObject, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14404h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f14405i;

        c(zc.f<? super c> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            c cVar = d.this.new c(fVar);
            cVar.f14405i = obj;
            return cVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, zc.f<? super g0> fVar) {
            return ((c) create(jSONObject, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool;
            Double d10;
            Integer num;
            JSONException jSONException;
            Integer num2;
            Integer num3;
            Double d11;
            Object objF = ad.d.f();
            int i10 = this.f14404h;
            if (i10 == 0) {
                s.b(obj);
                JSONObject jSONObject = (JSONObject) this.f14405i;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                Integer num4 = null;
                num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    t.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d11 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    g0 g0Var = g0.f27756a;
                                    num = num3;
                                    d10 = d11;
                                    bool = bool3;
                                } catch (JSONException e10) {
                                    Boolean bool4 = bool3;
                                    jSONException = e10;
                                    num2 = num4;
                                    bool2 = bool4;
                                    kotlin.coroutines.jvm.internal.b.c(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", jSONException));
                                    num = num3;
                                    d10 = d11;
                                    bool = bool2;
                                    num4 = num2;
                                }
                            } catch (JSONException e11) {
                                num3 = null;
                                bool2 = bool3;
                                jSONException = e11;
                                num2 = null;
                            }
                        } catch (JSONException e12) {
                            num3 = null;
                            d11 = null;
                            bool2 = bool3;
                            jSONException = e12;
                            num2 = null;
                        }
                    } catch (JSONException e13) {
                        jSONException = e13;
                        num2 = null;
                        num3 = null;
                        d11 = null;
                    }
                } else {
                    bool = null;
                    d10 = null;
                    num = null;
                }
                l lVar = d.this.f14398e;
                h hVar = new h(bool, d10, num, kotlin.coroutines.jvm.internal.b.c(num4 != null ? num4.intValue() : d.f14391g.a()), kotlin.coroutines.jvm.internal.b.d(d.this.f14394a.a().a()));
                this.f14404h = 1;
                if (lVar.a(hVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: renamed from: e4.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    static final class C0214d extends kotlin.coroutines.jvm.internal.l implements p<String, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14407h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f14408i;

        C0214d(zc.f<? super C0214d> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            C0214d c0214d = new C0214d(fVar);
            c0214d.f14408i = obj;
            return c0214d;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, zc.f<? super g0> fVar) {
            return ((C0214d) create(str, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f14407h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f14408i));
            return g0.f27756a;
        }
    }

    static {
        sd.a.C0418a c0418a = sd.a.f25407b;
        f14392h = (int) sd.a.r(sd.c.s(24, sd.d.HOURS));
        f14393i = new rd.o("com/google/firebase/sessions//");
    }

    public d(y0 timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, b4.b appInfo, e4.a configsFetcher, l settingsCache) {
        t.f(timeProvider, "timeProvider");
        t.f(firebaseInstallationsApi, "firebaseInstallationsApi");
        t.f(appInfo, "appInfo");
        t.f(configsFetcher, "configsFetcher");
        t.f(settingsCache, "settingsCache");
        this.f14394a = timeProvider;
        this.f14395b = firebaseInstallationsApi;
        this.f14396c = appInfo;
        this.f14397d = configsFetcher;
        this.f14398e = settingsCache;
        this.f14399f = de.g.b(false, 1, null);
    }

    private final String i(String str) {
        return f14393i.f(str, "");
    }

    @Override // e4.o
    public Boolean a() {
        return this.f14398e.d();
    }

    @Override // e4.o
    public sd.a b() {
        Integer numE = this.f14398e.e();
        if (numE == null) {
            return null;
        }
        sd.a.C0418a c0418a = sd.a.f25407b;
        return sd.a.e(sd.c.s(numE.intValue(), sd.d.SECONDS));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:21:0x0046, B:44:0x009f, B:46:0x00ad, B:50:0x00b9), top: B:64:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e4.o
    public Object c(zc.f<? super g0> fVar) throws Throwable {
        b bVar;
        de.a aVar;
        de.a aVar2;
        Throwable th;
        de.a aVar3;
        String strB;
        Map<String, String> mapK;
        e4.a aVar4;
        c cVar;
        C0214d c0214d;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f14403k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f14403k = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f14401i;
        Object objF = ad.d.f();
        int i11 = bVar.f14403k;
        try {
            if (i11 == 0) {
                s.b(obj);
                if (!this.f14399f.b() && !this.f14398e.c()) {
                    return g0.f27756a;
                }
                aVar = this.f14399f;
                bVar.f14400h = aVar;
                bVar.f14403k = 1;
                if (aVar.d(null, bVar) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (de.a) bVar.f14400h;
                        try {
                            s.b(obj);
                            g0 g0Var = g0.f27756a;
                            aVar2.c(null);
                            return g0.f27756a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.c(null);
                            throw th;
                        }
                    }
                    aVar3 = (de.a) bVar.f14400h;
                    try {
                        s.b(obj);
                        strB = ((u) obj).b();
                        if (t.a(strB, "")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            g0 g0Var2 = g0.f27756a;
                            aVar3.c(null);
                            return g0Var2;
                        }
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        t.e(INCREMENTAL, "INCREMENTAL");
                        String RELEASE = Build.VERSION.RELEASE;
                        t.e(RELEASE, "RELEASE");
                        mapK = o0.k(w.a("X-Crashlytics-Installation-ID", strB), w.a("X-Crashlytics-Device-Model", i(Build.MANUFACTURER + Build.MODEL)), w.a("X-Crashlytics-OS-Build-Version", i(INCREMENTAL)), w.a("X-Crashlytics-OS-Display-Version", i(RELEASE)), w.a("X-Crashlytics-API-Client-Version", this.f14396c.f()));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        aVar4 = this.f14397d;
                        cVar = new c(null);
                        c0214d = new C0214d(null);
                        bVar.f14400h = aVar3;
                        bVar.f14403k = 3;
                        if (aVar4.a(mapK, cVar, c0214d, bVar) == objF) {
                            return objF;
                        }
                        aVar2 = aVar3;
                        g0 g0Var3 = g0.f27756a;
                        aVar2.c(null);
                        return g0.f27756a;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar3;
                        aVar2.c(null);
                        throw th;
                    }
                }
                de.a aVar5 = (de.a) bVar.f14400h;
                s.b(obj);
                aVar = aVar5;
            }
            if (!this.f14398e.c()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                g0 g0Var4 = g0.f27756a;
                aVar.c(null);
                return g0Var4;
            }
            u.a aVar6 = u.f4019c;
            FirebaseInstallationsApi firebaseInstallationsApi = this.f14395b;
            bVar.f14400h = aVar;
            bVar.f14403k = 2;
            Object objA = aVar6.a(firebaseInstallationsApi, bVar);
            if (objA == objF) {
                return objF;
            }
            aVar3 = aVar;
            obj = objA;
            strB = ((u) obj).b();
            if (t.a(strB, "")) {
                Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                g0 g0Var5 = g0.f27756a;
                aVar3.c(null);
                return g0Var5;
            }
            String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
            t.e(INCREMENTAL2, "INCREMENTAL");
            String RELEASE2 = Build.VERSION.RELEASE;
            t.e(RELEASE2, "RELEASE");
            mapK = o0.k(w.a("X-Crashlytics-Installation-ID", strB), w.a("X-Crashlytics-Device-Model", i(Build.MANUFACTURER + Build.MODEL)), w.a("X-Crashlytics-OS-Build-Version", i(INCREMENTAL2)), w.a("X-Crashlytics-OS-Display-Version", i(RELEASE2)), w.a("X-Crashlytics-API-Client-Version", this.f14396c.f()));
            Log.d("FirebaseSessions", "Fetching settings from server.");
            aVar4 = this.f14397d;
            cVar = new c(null);
            c0214d = new C0214d(null);
            bVar.f14400h = aVar3;
            bVar.f14403k = 3;
            if (aVar4.a(mapK, cVar, c0214d, bVar) == objF) {
                return objF;
            }
            aVar2 = aVar3;
            g0 g0Var6 = g0.f27756a;
            aVar2.c(null);
            return g0.f27756a;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th = th4;
            aVar2.c(null);
            throw th;
        }
    }

    @Override // e4.o
    public Double d() {
        return this.f14398e.b();
    }
}
