package e4;

import kotlin.jvm.internal.t;
import wc.g0;
import wc.s;

/* JADX INFO: compiled from: SessionsSettings.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14432c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f14433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f14434b;

    /* JADX INFO: compiled from: SessionsSettings.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SessionsSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {98, 99}, m = "updateSettings")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f14435h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f14437j;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14435h = obj;
            this.f14437j |= Integer.MIN_VALUE;
            return j.this.f(this);
        }
    }

    public j(o localOverrideSettings, o remoteSettings) {
        t.f(localOverrideSettings, "localOverrideSettings");
        t.f(remoteSettings, "remoteSettings");
        this.f14433a = localOverrideSettings;
        this.f14434b = remoteSettings;
    }

    private final boolean d(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean e(long j10) {
        return sd.a.D(j10) && sd.a.y(j10);
    }

    public final double a() {
        Double d10 = this.f14433a.d();
        if (d10 != null) {
            double dDoubleValue = d10.doubleValue();
            if (d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double d11 = this.f14434b.d();
        if (d11 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = d11.doubleValue();
        if (d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long b() {
        sd.a aVarB = this.f14433a.b();
        if (aVarB != null) {
            long J = aVarB.J();
            if (e(J)) {
                return J;
            }
        }
        sd.a aVarB2 = this.f14434b.b();
        if (aVarB2 != null) {
            long J2 = aVarB2.J();
            if (e(J2)) {
                return J2;
            }
        }
        sd.a.C0418a c0418a = sd.a.f25407b;
        return sd.c.s(30, sd.d.MINUTES);
    }

    public final boolean c() {
        Boolean boolA = this.f14433a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f14434b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zc.f<? super g0> fVar) throws Throwable {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f14437j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f14437j = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.f14435h;
        Object objF = ad.d.f();
        int i11 = bVar.f14437j;
        if (i11 != 0) {
            if (i11 == 1) {
                s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return g0.f27756a;
        }
        s.b(obj);
        o oVar = this.f14433a;
        bVar.f14437j = 1;
        if (oVar.c(bVar) == objF) {
            return objF;
        }
        o oVar2 = this.f14434b;
        bVar.f14437j = 2;
        if (oVar2.c(bVar) == objF) {
            return objF;
        }
        return g0.f27756a;
    }
}
