package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes.dex */
final class t0<T> implements e1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1<?, ?> f2364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o<?> f2366d;

    private t0(k1<?, ?> k1Var, o<?> oVar, p0 p0Var) {
        this.f2364b = k1Var;
        this.f2365c = oVar.e(p0Var);
        this.f2366d = oVar;
        this.f2363a = p0Var;
    }

    private <UT, UB> int c(k1<UT, UB> k1Var, T t10) {
        return k1Var.i(k1Var.g(t10));
    }

    private <UT, UB, ET extends s.b<ET>> void d(k1<UT, UB> k1Var, o<ET> oVar, T t10, d1 d1Var, n nVar) throws IOException {
        UB ubF = k1Var.f(t10);
        s<ET> sVarD = oVar.d(t10);
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!f(d1Var, nVar, oVar, sVarD, k1Var, ubF)) {
                    return;
                }
            } finally {
                k1Var.o(t10, ubF);
            }
        }
    }

    static <T> t0<T> e(k1<?, ?> k1Var, o<?> oVar, p0 p0Var) {
        return new t0<>(k1Var, oVar, p0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends s.b<ET>> boolean f(d1 d1Var, n nVar, o<ET> oVar, s<ET> sVar, k1<UT, UB> k1Var, UB ub2) throws IOException {
        int tag = d1Var.getTag();
        int uInt32 = 0;
        if (tag != p1.f2255a) {
            if (p1.b(tag) != 2) {
                return d1Var.skipField();
            }
            Object objB = oVar.b(nVar, this.f2363a, p1.a(tag));
            if (objB == null) {
                return k1Var.m(ub2, d1Var, 0);
            }
            oVar.h(d1Var, objB, nVar, sVar);
            return true;
        }
        Object objB2 = null;
        g bytes = null;
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = d1Var.getTag();
            if (tag2 == p1.f2257c) {
                uInt32 = d1Var.readUInt32();
                objB2 = oVar.b(nVar, this.f2363a, uInt32);
            } else if (tag2 == p1.f2258d) {
                if (objB2 != null) {
                    oVar.h(d1Var, objB2, nVar, sVar);
                } else {
                    bytes = d1Var.readBytes();
                }
            } else if (!d1Var.skipField()) {
                break;
            }
        }
        if (d1Var.getTag() != p1.f2256b) {
            throw InvalidProtocolBufferException.c();
        }
        if (bytes != null) {
            if (objB2 != null) {
                oVar.i(bytes, objB2, nVar, sVar);
            } else {
                k1Var.d(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void g(k1<UT, UB> k1Var, T t10, q1 q1Var) throws IOException {
        k1Var.s(k1Var.g(t10), q1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void a(T t10, d1 d1Var, n nVar) throws IOException {
        d(this.f2364b, this.f2366d, t10, d1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void b(T t10, q1 q1Var) throws IOException {
        Iterator itT = this.f2366d.c(t10).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            s.b bVar = (s.b) entry.getKey();
            if (bVar.getLiteJavaType() != p1.c.MESSAGE || bVar.isRepeated() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof a0.b) {
                q1Var.writeMessageSetItem(bVar.getNumber(), ((a0.b) entry).a().e());
            } else {
                q1Var.writeMessageSetItem(bVar.getNumber(), entry.getValue());
            }
        }
        g(this.f2364b, t10, q1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public boolean equals(T t10, T t11) {
        if (!this.f2364b.g(t10).equals(this.f2364b.g(t11))) {
            return false;
        }
        if (this.f2365c) {
            return this.f2366d.c(t10).equals(this.f2366d.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int getSerializedSize(T t10) {
        int iC = c(this.f2364b, t10) + 0;
        return this.f2365c ? iC + this.f2366d.c(t10).j() : iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public int hashCode(T t10) {
        int iHashCode = this.f2364b.g(t10).hashCode();
        return this.f2365c ? (iHashCode * 53) + this.f2366d.c(t10).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public final boolean isInitialized(T t10) {
        return this.f2366d.c(t10).p();
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void makeImmutable(T t10) {
        this.f2364b.j(t10);
        this.f2366d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public void mergeFrom(T t10, T t11) {
        g1.G(this.f2364b, t10, t11);
        if (this.f2365c) {
            g1.E(this.f2366d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e1
    public T newInstance() {
        p0 p0Var = this.f2363a;
        return p0Var instanceof w ? (T) ((w) p0Var).H() : (T) p0Var.newBuilderForType().buildPartial();
    }
}
