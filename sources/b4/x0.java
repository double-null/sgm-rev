package b4;

import je.b2;
import je.f1;
import je.g2;
import je.q2;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: TimeProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
@fe.l
public final class x0 {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4086c;

    /* JADX INFO: compiled from: TimeProvider.kt */
    public /* synthetic */ class a implements je.l0<x0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4087a;
        private static final he.f descriptor;

        static {
            a aVar = new a();
            f4087a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.Time", aVar, 3);
            g2Var.p("ms", false);
            g2Var.p("us", true);
            g2Var.p("seconds", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // fe.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0 deserialize(ie.e decoder) {
            int i10;
            long jY;
            long j10;
            long j11;
            kotlin.jvm.internal.t.f(decoder, "decoder");
            he.f fVar = descriptor;
            ie.c cVarB = decoder.b(fVar);
            if (cVarB.q()) {
                long jY2 = cVarB.y(fVar, 0);
                long jY3 = cVarB.y(fVar, 1);
                jY = cVarB.y(fVar, 2);
                i10 = 7;
                j10 = jY2;
                j11 = jY3;
            } else {
                long jY4 = 0;
                boolean z10 = true;
                int i11 = 0;
                long jY5 = 0;
                long jY6 = 0;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        jY5 = cVarB.y(fVar, 0);
                        i11 |= 1;
                    } else if (iF == 1) {
                        jY6 = cVarB.y(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iF != 2) {
                            throw new UnknownFieldException(iF);
                        }
                        jY4 = cVarB.y(fVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jY = jY4;
                j10 = jY5;
                j11 = jY6;
            }
            cVarB.c(fVar);
            return new x0(i10, j10, j11, jY, null);
        }

        @Override // fe.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(ie.f encoder, x0 value) {
            kotlin.jvm.internal.t.f(encoder, "encoder");
            kotlin.jvm.internal.t.f(value, "value");
            he.f fVar = descriptor;
            ie.d dVarB = encoder.b(fVar);
            x0.d(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // je.l0
        public final fe.d<?>[] childSerializers() {
            f1 f1Var = f1.f20900a;
            return new fe.d[]{f1Var, f1Var, f1Var};
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

    /* JADX INFO: compiled from: TimeProvider.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final fe.d<x0> serializer() {
            return a.f4087a;
        }
    }

    public /* synthetic */ x0(int i10, long j10, long j11, long j12, q2 q2Var) {
        if (1 != (i10 & 1)) {
            b2.a(i10, 1, a.f4087a.getDescriptor());
        }
        this.f4084a = j10;
        this.f4085b = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.f4086c = j10 / ((long) 1000);
        } else {
            this.f4086c = j12;
        }
    }

    public static final /* synthetic */ void d(x0 x0Var, ie.d dVar, he.f fVar) {
        dVar.p(fVar, 0, x0Var.f4084a);
        if (dVar.w(fVar, 1) || x0Var.f4085b != x0Var.f4084a * ((long) 1000)) {
            dVar.p(fVar, 1, x0Var.f4085b);
        }
        if (dVar.w(fVar, 2) || x0Var.f4086c != x0Var.f4084a / ((long) 1000)) {
            dVar.p(fVar, 2, x0Var.f4086c);
        }
    }

    public final long a() {
        return this.f4086c;
    }

    public final long b() {
        return this.f4085b;
    }

    public final long c(x0 time) {
        kotlin.jvm.internal.t.f(time, "time");
        sd.a.C0418a c0418a = sd.a.f25407b;
        return sd.c.t(this.f4084a - time.f4084a, sd.d.MILLISECONDS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.f4084a == ((x0) obj).f4084a;
    }

    public int hashCode() {
        return Long.hashCode(this.f4084a);
    }

    public String toString() {
        return "Time(ms=" + this.f4084a + ')';
    }

    public x0(long j10) {
        this.f4084a = j10;
        long j11 = 1000;
        this.f4085b = j10 * j11;
        this.f4086c = j10 / j11;
    }
}
