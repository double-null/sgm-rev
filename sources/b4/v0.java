package b4;

import android.util.Log;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SharedSessionRepository.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4.j f4035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f4036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0 f4037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y0 f4038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0.k<g0> f4039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f4040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zc.j f4041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f4042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f4045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f4046m;

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {96}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f4047h;

        /* JADX INFO: renamed from: b4.v0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SharedSessionRepository.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
        static final class C0082a extends kotlin.coroutines.jvm.internal.l implements id.q<xd.d<? super g0>, Throwable, zc.f<? super wc.g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4049h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private /* synthetic */ Object f4050i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f4051j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ v0 f4052k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0082a(v0 v0Var, zc.f<? super C0082a> fVar) {
                super(3, fVar);
                this.f4052k = v0Var;
            }

            @Override // id.q
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xd.d<? super g0> dVar, Throwable th, zc.f<? super wc.g0> fVar) {
                C0082a c0082a = new C0082a(this.f4052k, fVar);
                c0082a.f4050i = dVar;
                c0082a.f4051j = th;
                return c0082a.invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f4049h;
                if (i10 == 0) {
                    wc.s.b(obj);
                    xd.d dVar = (xd.d) this.f4050i;
                    Throwable th = (Throwable) this.f4051j;
                    g0 g0Var = new g0(this.f4052k.f4036c.a(null), (x0) null, (Map) null, 4, (kotlin.jvm.internal.k) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + g0Var.h().b());
                    this.f4050i = null;
                    this.f4049h = 1;
                    if (dVar.b(g0Var, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return wc.g0.f27756a;
            }
        }

        /* JADX INFO: compiled from: SharedSessionRepository.kt */
        static final class b<T> implements xd.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ v0 f4053a;

            b(v0 v0Var) {
                this.f4053a = v0Var;
            }

            @Override // xd.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(g0 g0Var, zc.f<? super wc.g0> fVar) throws Throwable {
                this.f4053a.t(g0Var);
                if (this.f4053a.f4044k) {
                    this.f4053a.f4044k = false;
                    this.f4053a.c();
                }
                Object objS = this.f4053a.s(g0Var.h().b(), b.GENERAL, fVar);
                return objS == ad.d.f() ? objS : wc.g0.f27756a;
            }
        }

        a(zc.f<? super a> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return v0.this.new a(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f4047h;
            if (i10 == 0) {
                wc.s.b(obj);
                xd.c cVarC = xd.e.c(v0.this.f4039f.getData(), new C0082a(v0.this, null));
                b bVar = new b(v0.this);
                this.f4047h = 1;
                if (cVarC.a(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    public enum b {
        GENERAL,
        FALLBACK;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ bd.a f4057d = bd.b.a(b());
    }

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {118}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f4058h;

        /* JADX INFO: compiled from: SharedSessionRepository.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<g0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4060h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f4061i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ v0 f4062j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v0 v0Var, zc.f<? super a> fVar) {
                super(2, fVar);
                this.f4062j = v0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                a aVar = new a(this.f4062j, fVar);
                aVar.f4061i = obj;
                return aVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, zc.f<? super g0> fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f4060h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                return g0.e((g0) this.f4061i, null, this.f4062j.f4038e.a(), null, 5, null);
            }
        }

        d(zc.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return v0.this.new d(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f4058h;
            try {
                if (i10 == 0) {
                    wc.s.b(obj);
                    e0.k kVar = v0.this.f4039f;
                    a aVar = new a(v0.this, null);
                    this.f4058h = 1;
                    if (kVar.a(aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
            } catch (Exception e10) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                v0 v0Var = v0.this;
                v0Var.t(g0.e(v0Var.o(), null, v0.this.f4038e.a(), null, 5, null));
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {142, 193}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f4063h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ g0 f4065j;

        /* JADX INFO: compiled from: SharedSessionRepository.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<g0, zc.f<? super g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f4066h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f4067i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ v0 f4068j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v0 v0Var, zc.f<? super a> fVar) {
                super(2, fVar);
                this.f4068j = v0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                a aVar = new a(this.f4068j, fVar);
                aVar.f4067i = obj;
                return aVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, zc.f<? super g0> fVar) {
                return ((a) create(g0Var, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Map<String, w> mapC;
                ad.d.f();
                if (this.f4066h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                g0 g0Var = (g0) this.f4067i;
                boolean zR = this.f4068j.r(g0Var);
                boolean zP = this.f4068j.p(g0Var);
                boolean zQ = this.f4068j.q(g0Var);
                if (zP) {
                    mapC = this.f4068j.f4040g.f();
                } else {
                    mapC = zQ ? this.f4068j.f4040g.c(g0Var.g()) : g0Var.g();
                }
                j0 j0VarH = zP ? null : g0Var.h();
                if (!zR && !zP) {
                    return zQ ? g0.e(g0Var, null, null, this.f4068j.f4040g.c(mapC), 3, null) : g0Var;
                }
                j0 j0VarA = this.f4068j.f4036c.a(j0VarH);
                this.f4068j.f4037d.a(j0VarA);
                this.f4068j.f4040g.d();
                return g0Var.d(j0VarA, null, mapC);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g0 g0Var, zc.f<? super e> fVar) {
            super(2, fVar);
            this.f4065j = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return v0.this.new e(this.f4065j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f4063h;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        wc.s.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wc.s.b(obj);
                    }
                    return wc.g0.f27756a;
                }
                wc.s.b(obj);
                e0.k kVar = v0.this.f4039f;
                a aVar = new a(v0.this, null);
                this.f4063h = 1;
                if (kVar.a(aVar, this) == objF) {
                    return objF;
                }
            } catch (Exception e10) {
                Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e10.getMessage());
                if (v0.this.r(this.f4065j)) {
                    j0 j0VarA = v0.this.f4036c.a(this.f4065j.h());
                    v0.this.t(g0.e(this.f4065j, j0VarA, null, null, 4, null));
                    v0.this.f4037d.a(j0VarA);
                    v0 v0Var = v0.this;
                    String strB = j0VarA.b();
                    b bVar = b.FALLBACK;
                    this.f4063h = 2;
                    if (v0Var.s(strB, bVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: SharedSessionRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {206}, m = "notifySubscribers")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f4069h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f4070i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4071j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f4073l;

        f(zc.f<? super f> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4071j = obj;
            this.f4073l |= Integer.MIN_VALUE;
            return v0.this.s(null, null, this);
        }
    }

    public v0(e4.j sessionsSettings, p0 sessionGenerator, m0 sessionFirelogPublisher, y0 timeProvider, e0.k<g0> sessionDataStore, x processDataManager, @w2.a zc.j backgroundDispatcher) {
        kotlin.jvm.internal.t.f(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.t.f(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.t.f(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.t.f(timeProvider, "timeProvider");
        kotlin.jvm.internal.t.f(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.t.f(processDataManager, "processDataManager");
        kotlin.jvm.internal.t.f(backgroundDispatcher, "backgroundDispatcher");
        this.f4035b = sessionsSettings;
        this.f4036c = sessionGenerator;
        this.f4037d = sessionFirelogPublisher;
        this.f4038e = timeProvider;
        this.f4039f = sessionDataStore;
        this.f4040g = processDataManager;
        this.f4041h = backgroundDispatcher;
        this.f4045l = b.GENERAL;
        this.f4046m = "";
        ud.k.d(ud.p0.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(g0 g0Var) {
        Map<String, w> mapG = g0Var.g();
        if (mapG == null) {
            Log.d("FirebaseSessions", "No process data map");
            return true;
        }
        boolean zE = this.f4040g.e(mapG);
        if (zE) {
            Log.d("FirebaseSessions", "Cold app start detected");
        }
        return zE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(g0 g0Var) {
        Map<String, w> mapG = g0Var.g();
        if (mapG == null) {
            Log.d("FirebaseSessions", "No process data for " + this.f4040g.a());
            return true;
        }
        boolean zB = this.f4040g.b(mapG);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + this.f4040g.a() + " is stale");
        }
        return zB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(g0 g0Var) {
        x0 x0VarF = g0Var.f();
        if (x0VarF == null) {
            Log.d("FirebaseSessions", "Session " + g0Var.h().b() + " has not backgrounded yet");
            return false;
        }
        boolean z10 = sd.a.h(this.f4038e.a().c(x0VarF), this.f4035b.b()) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + g0Var.h().b() + " is expired");
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, b bVar, zc.f<? super wc.g0> fVar) throws Throwable {
        f fVar2;
        String str2;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.f4073l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.f4073l = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(fVar);
            }
        } else {
            fVar2 = new f(fVar);
        }
        Object objD = fVar2.f4071j;
        Object objF = ad.d.f();
        int i11 = fVar2.f4073l;
        if (i11 == 0) {
            wc.s.b(objD);
            this.f4045l = bVar;
            if (kotlin.jvm.internal.t.a(this.f4046m, str)) {
                return wc.g0.f27756a;
            }
            this.f4046m = str;
            c4.c cVar = c4.c.f4718a;
            fVar2.f4069h = str;
            fVar2.f4070i = bVar;
            fVar2.f4073l = 1;
            objD = cVar.d(fVar2);
            if (objD == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) fVar2.f4070i;
            str = (String) fVar2.f4069h;
            wc.s.b(objD);
        }
        for (c4.d dVar : ((Map) objD).values()) {
            dVar.c(new c4.d.b(str));
            int i12 = c.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i12 == 1) {
                str2 = "Notified " + dVar.b() + " of new session " + str;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Notified " + dVar.b() + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return wc.g0.f27756a;
    }

    @Override // b4.u0
    public boolean a() {
        return this.f4043j;
    }

    @Override // b4.u0
    public void b() {
        this.f4043j = false;
        if (this.f4042i == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f4040g.a());
        ud.k.d(ud.p0.a(this.f4041h), null, null, new d(null), 3, null);
    }

    @Override // b4.u0
    public void c() {
        this.f4043j = true;
        if (this.f4042i == null) {
            this.f4044k = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        g0 g0VarO = o();
        Log.d("FirebaseSessions", "App foregrounded on " + this.f4040g.a());
        if (r(g0VarO) || q(g0VarO)) {
            ud.k.d(ud.p0.a(this.f4041h), null, null, new e(g0VarO, null), 3, null);
        }
    }

    public final g0 o() {
        g0 g0Var = this.f4042i;
        if (g0Var != null) {
            return g0Var;
        }
        kotlin.jvm.internal.t.u("localSessionData");
        return null;
    }

    public final void t(g0 g0Var) {
        kotlin.jvm.internal.t.f(g0Var, "<set-?>");
        this.f4042i = g0Var;
    }
}
