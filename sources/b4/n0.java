package b4;

import android.util.Log;
import c2.YDwL.tFQWuE;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3975f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double f3976g = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FirebaseApp f3977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FirebaseInstallationsApi f3978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4.j f3979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f3980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zc.j f3981e;

    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, 77}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f3983i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f3984j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f3985k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f3986l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f3987m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3988n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j0 f3990p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0 j0Var, zc.f<? super b> fVar) {
            super(2, fVar);
            this.f3990p = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return n0.this.new b(this.f3990p, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u uVar;
            n0 n0Var;
            l0 l0Var;
            FirebaseApp firebaseApp;
            j0 j0Var;
            e4.j jVar;
            Object objD;
            l0 l0Var2;
            n0 n0Var2;
            e4.j jVar2;
            FirebaseApp firebaseApp2;
            j0 j0Var2;
            Object objF = ad.d.f();
            int i10 = this.f3988n;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                } else if (i10 == 2) {
                    wc.s.b(obj);
                    uVar = (u) obj;
                    n0Var = n0.this;
                    l0Var = l0.f3972a;
                    firebaseApp = n0Var.f3977a;
                    j0Var = this.f3990p;
                    jVar = n0.this.f3979c;
                    c4.c cVar = c4.c.f4718a;
                    this.f3982h = uVar;
                    this.f3983i = n0Var;
                    this.f3984j = l0Var;
                    this.f3985k = firebaseApp;
                    this.f3986l = j0Var;
                    this.f3987m = jVar;
                    this.f3988n = 3;
                    objD = cVar.d(this);
                    if (objD == objF) {
                        return objF;
                    }
                    l0Var2 = l0Var;
                    n0Var2 = n0Var;
                    jVar2 = jVar;
                    firebaseApp2 = firebaseApp;
                    obj = objD;
                    j0Var2 = j0Var;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e4.j jVar3 = (e4.j) this.f3987m;
                    j0 j0Var3 = (j0) this.f3986l;
                    FirebaseApp firebaseApp3 = (FirebaseApp) this.f3985k;
                    l0 l0Var3 = (l0) this.f3984j;
                    n0 n0Var3 = (n0) this.f3983i;
                    uVar = (u) this.f3982h;
                    wc.s.b(obj);
                    n0Var2 = n0Var3;
                    jVar2 = jVar3;
                    l0Var2 = l0Var3;
                    j0Var2 = j0Var3;
                    firebaseApp2 = firebaseApp3;
                }
                n0Var2.g(l0Var2.a(firebaseApp2, j0Var2, jVar2, (Map) obj, uVar.b(), uVar.a()));
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            n0 n0Var4 = n0.this;
            this.f3988n = 1;
            obj = n0Var4.i(this);
            if (obj == objF) {
                return objF;
            }
            if (((Boolean) obj).booleanValue()) {
                u.a aVar = u.f4019c;
                FirebaseInstallationsApi firebaseInstallationsApi = n0.this.f3978b;
                this.f3988n = 2;
                obj = aVar.a(firebaseInstallationsApi, this);
                if (obj == objF) {
                    return objF;
                }
                uVar = (u) obj;
                n0Var = n0.this;
                l0Var = l0.f3972a;
                firebaseApp = n0Var.f3977a;
                j0Var = this.f3990p;
                jVar = n0.this.f3979c;
                c4.c cVar2 = c4.c.f4718a;
                this.f3982h = uVar;
                this.f3983i = n0Var;
                this.f3984j = l0Var;
                this.f3985k = firebaseApp;
                this.f3986l = j0Var;
                this.f3987m = jVar;
                this.f3988n = 3;
                objD = cVar2.d(this);
                if (objD == objF) {
                    return objF;
                }
                l0Var2 = l0Var;
                n0Var2 = n0Var;
                jVar2 = jVar;
                firebaseApp2 = firebaseApp;
                obj = objD;
                j0Var2 = j0Var;
                n0Var2.g(l0Var2.a(firebaseApp2, j0Var2, jVar2, (Map) obj, uVar.b(), uVar.a()));
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {98, 104}, m = "shouldLogSession")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f3991h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3993j;

        c(zc.f<? super c> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3991h = obj;
            this.f3993j |= Integer.MIN_VALUE;
            return n0.this.i(this);
        }
    }

    public n0(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallations, e4.j sessionSettings, h eventGDTLogger, @w2.a zc.j backgroundDispatcher) {
        kotlin.jvm.internal.t.f(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.t.f(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.t.f(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.t.f(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.t.f(backgroundDispatcher, "backgroundDispatcher");
        this.f3977a = firebaseApp;
        this.f3978b = firebaseInstallations;
        this.f3979c = sessionSettings;
        this.f3980d = eventGDTLogger;
        this.f3981e = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(k0 k0Var) {
        try {
            this.f3980d.a(k0Var);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        return f3976g <= this.f3979c.a();
    }

    @Override // b4.m0
    public void a(j0 sessionDetails) {
        kotlin.jvm.internal.t.f(sessionDetails, "sessionDetails");
        ud.k.d(ud.p0.a(this.f3981e), null, null, new b(sessionDetails, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zc.f<? super Boolean> fVar) throws Throwable {
        c cVar;
        boolean z10;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f3993j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f3993j = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object objD = cVar.f3991h;
        Object objF = ad.d.f();
        int i11 = cVar.f3993j;
        if (i11 != 0) {
            if (i11 == 1) {
                wc.s.b(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(objD);
            }
            if (!this.f3979c.c()) {
                Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            if (!h()) {
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            Log.d("FirebaseSessions", tFQWuE.AvLoKLrc);
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        wc.s.b(objD);
        c4.c cVar2 = c4.c.f4718a;
        cVar.f3993j = 1;
        objD = cVar2.d(cVar);
        if (objD == objF) {
            return objF;
        }
        Collection collectionValues = ((Map) objD).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (((c4.d) it.next()).a()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        e4.j jVar = this.f3979c;
        cVar.f3993j = 2;
        if (jVar.f(cVar) == objF) {
            return objF;
        }
        if (!this.f3979c.c()) {
            Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        if (!h()) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        Log.d("FirebaseSessions", tFQWuE.AvLoKLrc);
        return kotlin.coroutines.jvm.internal.b.a(false);
    }
}
