package b4;

import je.b2;
import je.f1;
import je.g2;
import je.q2;
import je.v2;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SessionDetails.kt */
/* JADX INFO: loaded from: classes4.dex */
@fe.l
public final class j0 {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f3960d;

    /* JADX INFO: compiled from: SessionDetails.kt */
    public /* synthetic */ class a implements je.l0<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3961a;
        private static final he.f descriptor;

        static {
            a aVar = new a();
            f3961a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.SessionDetails", aVar, 4);
            g2Var.p("sessionId", false);
            g2Var.p("firstSessionId", false);
            g2Var.p("sessionIndex", false);
            g2Var.p("sessionStartTimestampUs", false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // fe.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 deserialize(ie.e decoder) {
            String str;
            int i10;
            int iX;
            String str2;
            long jY;
            kotlin.jvm.internal.t.f(decoder, "decoder");
            he.f fVar = descriptor;
            ie.c cVarB = decoder.b(fVar);
            if (cVarB.q()) {
                String strL = cVarB.l(fVar, 0);
                String strL2 = cVarB.l(fVar, 1);
                str = strL;
                i10 = 15;
                iX = cVarB.x(fVar, 2);
                str2 = strL2;
                jY = cVarB.y(fVar, 3);
            } else {
                String strL3 = null;
                String strL4 = null;
                boolean z10 = true;
                long jY2 = 0;
                int i11 = 0;
                int iX2 = 0;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        strL3 = cVarB.l(fVar, 0);
                        i11 |= 1;
                    } else if (iF == 1) {
                        strL4 = cVarB.l(fVar, 1);
                        i11 |= 2;
                    } else if (iF == 2) {
                        iX2 = cVarB.x(fVar, 2);
                        i11 |= 4;
                    } else {
                        if (iF != 3) {
                            throw new UnknownFieldException(iF);
                        }
                        jY2 = cVarB.y(fVar, 3);
                        i11 |= 8;
                    }
                }
                str = strL3;
                i10 = i11;
                iX = iX2;
                str2 = strL4;
                jY = jY2;
            }
            cVarB.c(fVar);
            return new j0(i10, str, str2, iX, jY, null);
        }

        @Override // fe.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(ie.f encoder, j0 value) {
            kotlin.jvm.internal.t.f(encoder, "encoder");
            kotlin.jvm.internal.t.f(value, "value");
            he.f fVar = descriptor;
            ie.d dVarB = encoder.b(fVar);
            j0.e(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // je.l0
        public final fe.d<?>[] childSerializers() {
            v2 v2Var = v2.f21024a;
            return new fe.d[]{v2Var, v2Var, je.u0.f21014a, f1.f20900a};
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

    /* JADX INFO: compiled from: SessionDetails.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final fe.d<j0> serializer() {
            return a.f3961a;
        }
    }

    public /* synthetic */ j0(int i10, String str, String str2, int i11, long j10, q2 q2Var) {
        if (15 != (i10 & 15)) {
            b2.a(i10, 15, a.f3961a.getDescriptor());
        }
        this.f3957a = str;
        this.f3958b = str2;
        this.f3959c = i11;
        this.f3960d = j10;
    }

    public static final /* synthetic */ void e(j0 j0Var, ie.d dVar, he.f fVar) {
        dVar.A(fVar, 0, j0Var.f3957a);
        dVar.A(fVar, 1, j0Var.f3958b);
        dVar.h(fVar, 2, j0Var.f3959c);
        dVar.p(fVar, 3, j0Var.f3960d);
    }

    public final String a() {
        return this.f3958b;
    }

    public final String b() {
        return this.f3957a;
    }

    public final int c() {
        return this.f3959c;
    }

    public final long d() {
        return this.f3960d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.t.a(this.f3957a, j0Var.f3957a) && kotlin.jvm.internal.t.a(this.f3958b, j0Var.f3958b) && this.f3959c == j0Var.f3959c && this.f3960d == j0Var.f3960d;
    }

    public int hashCode() {
        return (((((this.f3957a.hashCode() * 31) + this.f3958b.hashCode()) * 31) + Integer.hashCode(this.f3959c)) * 31) + Long.hashCode(this.f3960d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f3957a + ", firstSessionId=" + this.f3958b + ", sessionIndex=" + this.f3959c + ", sessionStartTimestampUs=" + this.f3960d + ')';
    }

    public j0(String sessionId, String firstSessionId, int i10, long j10) {
        kotlin.jvm.internal.t.f(sessionId, "sessionId");
        kotlin.jvm.internal.t.f(firstSessionId, "firstSessionId");
        this.f3957a = sessionId;
        this.f3958b = firstSessionId;
        this.f3959c = i10;
        this.f3960d = j10;
    }
}
