package b4;

import java.util.Map;
import je.b2;
import je.g2;
import je.q2;
import je.v2;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes4.dex */
@fe.l
public final class g0 {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final wc.k<fe.d<Object>>[] f3944d = {null, null, wc.m.b(wc.o.PUBLICATION, new id.a() { // from class: b4.f0
        @Override // id.a
        public final Object invoke() {
            return g0.b();
        }
    })};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f3945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f3946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, w> f3947c;

    /* JADX INFO: compiled from: SessionData.kt */
    public /* synthetic */ class a implements je.l0<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3948a;
        private static final he.f descriptor;

        static {
            a aVar = new a();
            f3948a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.SessionData", aVar, 3);
            g2Var.p("sessionDetails", false);
            g2Var.p("backgroundTime", true);
            g2Var.p("processDataMap", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // fe.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0 deserialize(ie.e decoder) {
            int i10;
            j0 j0Var;
            x0 x0Var;
            Map map;
            kotlin.jvm.internal.t.f(decoder, "decoder");
            he.f fVar = descriptor;
            ie.c cVarB = decoder.b(fVar);
            wc.k[] kVarArr = g0.f3944d;
            j0 j0Var2 = null;
            if (cVarB.q()) {
                j0 j0Var3 = (j0) cVarB.F(fVar, 0, j0.a.f3961a, null);
                x0 x0Var2 = (x0) cVarB.D(fVar, 1, x0.a.f4087a, null);
                map = (Map) cVarB.D(fVar, 2, (fe.c) kVarArr[2].getValue(), null);
                j0Var = j0Var3;
                i10 = 7;
                x0Var = x0Var2;
            } else {
                boolean z10 = true;
                int i11 = 0;
                x0 x0Var3 = null;
                Map map2 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        j0Var2 = (j0) cVarB.F(fVar, 0, j0.a.f3961a, j0Var2);
                        i11 |= 1;
                    } else if (iF == 1) {
                        x0Var3 = (x0) cVarB.D(fVar, 1, x0.a.f4087a, x0Var3);
                        i11 |= 2;
                    } else {
                        if (iF != 2) {
                            throw new UnknownFieldException(iF);
                        }
                        map2 = (Map) cVarB.D(fVar, 2, (fe.c) kVarArr[2].getValue(), map2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                j0Var = j0Var2;
                x0Var = x0Var3;
                map = map2;
            }
            cVarB.c(fVar);
            return new g0(i10, j0Var, x0Var, map, (q2) null);
        }

        @Override // fe.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(ie.f encoder, g0 value) {
            kotlin.jvm.internal.t.f(encoder, "encoder");
            kotlin.jvm.internal.t.f(value, "value");
            he.f fVar = descriptor;
            ie.d dVarB = encoder.b(fVar);
            g0.i(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // je.l0
        public final fe.d<?>[] childSerializers() {
            return new fe.d[]{j0.a.f3961a, ge.a.t(x0.a.f4087a), ge.a.t((fe.d) g0.f3944d[2].getValue())};
        }

        @Override // fe.d, fe.m, fe.c
        public final he.f getDescriptor() {
            return descriptor;
        }

        @Override // je.l0
        public fe.d<?>[] typeParametersSerializers() {
            return je.l0.a.a(this);
        }
    }

    /* JADX INFO: compiled from: SessionData.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final fe.d<g0> serializer() {
            return a.f3948a;
        }
    }

    public /* synthetic */ g0(int i10, j0 j0Var, x0 x0Var, Map map, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, a.f3948a.getDescriptor());
        }
        this.f3945a = j0Var;
        if ((i10 & 2) == 0) {
            this.f3946b = null;
        } else {
            this.f3946b = x0Var;
        }
        if ((i10 & 4) == 0) {
            this.f3947c = null;
        } else {
            this.f3947c = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ fe.d b() {
        return new je.z0(v2.f21024a, w.a.f4076a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g0 e(g0 g0Var, j0 j0Var, x0 x0Var, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = g0Var.f3945a;
        }
        if ((i10 & 2) != 0) {
            x0Var = g0Var.f3946b;
        }
        if ((i10 & 4) != 0) {
            map = g0Var.f3947c;
        }
        return g0Var.d(j0Var, x0Var, map);
    }

    public static final /* synthetic */ void i(g0 g0Var, ie.d dVar, he.f fVar) {
        wc.k<fe.d<Object>>[] kVarArr = f3944d;
        dVar.E(fVar, 0, j0.a.f3961a, g0Var.f3945a);
        if (dVar.w(fVar, 1) || g0Var.f3946b != null) {
            dVar.o(fVar, 1, x0.a.f4087a, g0Var.f3946b);
        }
        if (dVar.w(fVar, 2) || g0Var.f3947c != null) {
            dVar.o(fVar, 2, kVarArr[2].getValue(), g0Var.f3947c);
        }
    }

    public final g0 d(j0 sessionDetails, x0 x0Var, Map<String, w> map) {
        kotlin.jvm.internal.t.f(sessionDetails, "sessionDetails");
        return new g0(sessionDetails, x0Var, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.t.a(this.f3945a, g0Var.f3945a) && kotlin.jvm.internal.t.a(this.f3946b, g0Var.f3946b) && kotlin.jvm.internal.t.a(this.f3947c, g0Var.f3947c);
    }

    public final x0 f() {
        return this.f3946b;
    }

    public final Map<String, w> g() {
        return this.f3947c;
    }

    public final j0 h() {
        return this.f3945a;
    }

    public int hashCode() {
        int iHashCode = this.f3945a.hashCode() * 31;
        x0 x0Var = this.f3946b;
        int iHashCode2 = (iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        Map<String, w> map = this.f3947c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.f3945a + ", backgroundTime=" + this.f3946b + ", processDataMap=" + this.f3947c + ')';
    }

    public g0(j0 sessionDetails, x0 x0Var, Map<String, w> map) {
        kotlin.jvm.internal.t.f(sessionDetails, "sessionDetails");
        this.f3945a = sessionDetails;
        this.f3946b = x0Var;
        this.f3947c = map;
    }

    public /* synthetic */ g0(j0 j0Var, x0 x0Var, Map map, int i10, kotlin.jvm.internal.k kVar) {
        this(j0Var, (i10 & 2) != 0 ? null : x0Var, (i10 & 4) != 0 ? null : map);
    }
}
