package b4;

import je.b2;
import je.g2;
import je.q2;
import je.v2;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes4.dex */
@fe.l
public final class w {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4075b;

    /* JADX INFO: compiled from: SessionData.kt */
    public /* synthetic */ class a implements je.l0<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4076a;
        private static final he.f descriptor;

        static {
            a aVar = new a();
            f4076a = aVar;
            g2 g2Var = new g2("com.google.firebase.sessions.ProcessData", aVar, 2);
            g2Var.p("pid", false);
            g2Var.p("uuid", false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // fe.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w deserialize(ie.e decoder) {
            int iX;
            String strL;
            int i10;
            kotlin.jvm.internal.t.f(decoder, "decoder");
            he.f fVar = descriptor;
            ie.c cVarB = decoder.b(fVar);
            q2 q2Var = null;
            if (cVarB.q()) {
                iX = cVarB.x(fVar, 0);
                strL = cVarB.l(fVar, 1);
                i10 = 3;
            } else {
                boolean z10 = true;
                iX = 0;
                int i11 = 0;
                String strL2 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else if (iF == 0) {
                        iX = cVarB.x(fVar, 0);
                        i11 |= 1;
                    } else {
                        if (iF != 1) {
                            throw new UnknownFieldException(iF);
                        }
                        strL2 = cVarB.l(fVar, 1);
                        i11 |= 2;
                    }
                }
                strL = strL2;
                i10 = i11;
            }
            cVarB.c(fVar);
            return new w(i10, iX, strL, q2Var);
        }

        @Override // fe.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(ie.f encoder, w value) {
            kotlin.jvm.internal.t.f(encoder, "encoder");
            kotlin.jvm.internal.t.f(value, "value");
            he.f fVar = descriptor;
            ie.d dVarB = encoder.b(fVar);
            w.c(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // je.l0
        public final fe.d<?>[] childSerializers() {
            return new fe.d[]{je.u0.f21014a, v2.f21024a};
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

        public final fe.d<w> serializer() {
            return a.f4076a;
        }
    }

    public /* synthetic */ w(int i10, int i11, String str, q2 q2Var) {
        if (3 != (i10 & 3)) {
            b2.a(i10, 3, a.f4076a.getDescriptor());
        }
        this.f4074a = i11;
        this.f4075b = str;
    }

    public static final /* synthetic */ void c(w wVar, ie.d dVar, he.f fVar) {
        dVar.h(fVar, 0, wVar.f4074a);
        dVar.A(fVar, 1, wVar.f4075b);
    }

    public final int a() {
        return this.f4074a;
    }

    public final String b() {
        return this.f4075b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f4074a == wVar.f4074a && kotlin.jvm.internal.t.a(this.f4075b, wVar.f4075b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f4074a) * 31) + this.f4075b.hashCode();
    }

    public String toString() {
        return "ProcessData(pid=" + this.f4074a + ", uuid=" + this.f4075b + ')';
    }

    public w(int i10, String uuid) {
        kotlin.jvm.internal.t.f(uuid, "uuid");
        this.f4074a = i10;
        this.f4075b = uuid;
    }
}
