package e4;

import je.b0;
import je.b2;
import je.f1;
import je.g2;
import je.l0;
import je.q2;
import je.u0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SessionConfigs.kt */
/* JADX INFO: loaded from: classes4.dex */
@fe.l
public final class h {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f14424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f14425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f14426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f14427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f14428e;

    /* JADX INFO: compiled from: SessionConfigs.kt */
    public /* synthetic */ class a implements l0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14429a;
        private static final he.f descriptor;

        static {
            a aVar = new a();
            f14429a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            g2Var.p("sessionsEnabled", false);
            g2Var.p("sessionSamplingRate", false);
            g2Var.p("sessionTimeoutSeconds", false);
            g2Var.p("cacheDurationSeconds", false);
            g2Var.p("cacheUpdatedTimeSeconds", false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // fe.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h deserialize(ie.e decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            t.f(decoder, "decoder");
            he.f fVar = descriptor;
            ie.c cVarB = decoder.b(fVar);
            Boolean bool2 = null;
            if (cVarB.q()) {
                Boolean bool3 = (Boolean) cVarB.D(fVar, 0, je.i.f20933a, null);
                Double d11 = (Double) cVarB.D(fVar, 1, b0.f20867a, null);
                u0 u0Var = u0.f21014a;
                Integer num3 = (Integer) cVarB.D(fVar, 2, u0Var, null);
                bool = bool3;
                num2 = (Integer) cVarB.D(fVar, 3, u0Var, null);
                l10 = (Long) cVarB.D(fVar, 4, f1.f20900a, null);
                num = num3;
                d10 = d11;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d12 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l11 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        bool2 = (Boolean) cVarB.D(fVar, 0, je.i.f20933a, bool2);
                        i11 |= 1;
                    } else if (iF == 1) {
                        d12 = (Double) cVarB.D(fVar, 1, b0.f20867a, d12);
                        i11 |= 2;
                    } else if (iF == 2) {
                        num4 = (Integer) cVarB.D(fVar, 2, u0.f21014a, num4);
                        i11 |= 4;
                    } else if (iF == 3) {
                        num5 = (Integer) cVarB.D(fVar, 3, u0.f21014a, num5);
                        i11 |= 8;
                    } else {
                        if (iF != 4) {
                            throw new UnknownFieldException(iF);
                        }
                        l11 = (Long) cVarB.D(fVar, 4, f1.f20900a, l11);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                bool = bool2;
                d10 = d12;
                num = num4;
                num2 = num5;
                l10 = l11;
            }
            cVarB.c(fVar);
            return new h(i10, bool, d10, num, num2, l10, null);
        }

        @Override // fe.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(ie.f encoder, h value) {
            t.f(encoder, "encoder");
            t.f(value, "value");
            he.f fVar = descriptor;
            ie.d dVarB = encoder.b(fVar);
            h.f(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // je.l0
        public final fe.d<?>[] childSerializers() {
            u0 u0Var = u0.f21014a;
            return new fe.d[]{ge.a.t(je.i.f20933a), ge.a.t(b0.f20867a), ge.a.t(u0Var), ge.a.t(u0Var), ge.a.t(f1.f20900a)};
        }

        @Override // fe.d, fe.m, fe.c
        public final he.f getDescriptor() {
            return descriptor;
        }

        @Override // je.l0
        public fe.d<?>[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: compiled from: SessionConfigs.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final fe.d<h> serializer() {
            return a.f14429a;
        }
    }

    public /* synthetic */ h(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, q2 q2Var) {
        if (31 != (i10 & 31)) {
            b2.a(i10, 31, a.f14429a.getDescriptor());
        }
        this.f14424a = bool;
        this.f14425b = d10;
        this.f14426c = num;
        this.f14427d = num2;
        this.f14428e = l10;
    }

    public static final /* synthetic */ void f(h hVar, ie.d dVar, he.f fVar) {
        dVar.o(fVar, 0, je.i.f20933a, hVar.f14424a);
        dVar.o(fVar, 1, b0.f20867a, hVar.f14425b);
        u0 u0Var = u0.f21014a;
        dVar.o(fVar, 2, u0Var, hVar.f14426c);
        dVar.o(fVar, 3, u0Var, hVar.f14427d);
        dVar.o(fVar, 4, f1.f20900a, hVar.f14428e);
    }

    public final Integer a() {
        return this.f14427d;
    }

    public final Long b() {
        return this.f14428e;
    }

    public final Double c() {
        return this.f14425b;
    }

    public final Integer d() {
        return this.f14426c;
    }

    public final Boolean e() {
        return this.f14424a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return t.a(this.f14424a, hVar.f14424a) && t.a(this.f14425b, hVar.f14425b) && t.a(this.f14426c, hVar.f14426c) && t.a(this.f14427d, hVar.f14427d) && t.a(this.f14428e, hVar.f14428e);
    }

    public int hashCode() {
        Boolean bool = this.f14424a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f14425b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f14426c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f14427d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f14428e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f14424a + ", sessionSamplingRate=" + this.f14425b + ", sessionTimeoutSeconds=" + this.f14426c + ", cacheDurationSeconds=" + this.f14427d + ", cacheUpdatedTimeSeconds=" + this.f14428e + ')';
    }

    public h(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f14424a = bool;
        this.f14425b = d10;
        this.f14426c = num;
        this.f14427d = num2;
        this.f14428e = l10;
    }
}
