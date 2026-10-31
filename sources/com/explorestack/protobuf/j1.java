package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes.dex */
final class j1<T> implements b2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MessageLite f10591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t2<?, ?> f10592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z<?> f10594d;

    private j1(t2<?, ?> t2Var, z<?> zVar, MessageLite messageLite) {
        this.f10592b = t2Var;
        this.f10593c = zVar.e(messageLite);
        this.f10594d = zVar;
        this.f10591a = messageLite;
    }

    private <UT, UB> int d(t2<UT, UB> t2Var, T t10) {
        return t2Var.i(t2Var.g(t10));
    }

    private <UT, UB, ET extends e0.c<ET>> void e(t2<UT, UB> t2Var, z<ET> zVar, T t10, y1 y1Var, y yVar) throws IOException {
        UB ubF = t2Var.f(t10);
        e0<ET> e0VarD = zVar.d(t10);
        while (y1Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!g(y1Var, yVar, zVar, e0VarD, t2Var, ubF)) {
                    return;
                }
            } finally {
                t2Var.o(t10, ubF);
            }
        }
    }

    static <T> j1<T> f(t2<?, ?> t2Var, z<?> zVar, MessageLite messageLite) {
        return new j1<>(t2Var, zVar, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends e0.c<ET>> boolean g(y1 y1Var, y yVar, z<ET> zVar, e0<ET> e0Var, t2<UT, UB> t2Var, UB ub2) throws IOException {
        int tag = y1Var.getTag();
        if (tag != c3.f10249a) {
            if (c3.b(tag) != 2) {
                return y1Var.skipField();
            }
            Object objB = zVar.b(yVar, this.f10591a, c3.a(tag));
            if (objB == null) {
                return t2Var.m(ub2, y1Var);
            }
            zVar.h(y1Var, objB, yVar, e0Var);
            return true;
        }
        Object objB2 = null;
        int uInt32 = 0;
        ByteString bytes = null;
        while (y1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = y1Var.getTag();
            if (tag2 == c3.f10251c) {
                uInt32 = y1Var.readUInt32();
                objB2 = zVar.b(yVar, this.f10591a, uInt32);
            } else if (tag2 == c3.f10252d) {
                if (objB2 != null) {
                    zVar.h(y1Var, objB2, yVar, e0Var);
                } else {
                    bytes = y1Var.readBytes();
                }
            } else if (!y1Var.skipField()) {
                break;
            }
        }
        if (y1Var.getTag() != c3.f10250b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objB2 != null) {
                zVar.i(bytes, objB2, yVar, e0Var);
            } else {
                t2Var.d(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void h(t2<UT, UB> t2Var, T t10, e3 e3Var) throws IOException {
        t2Var.s(t2Var.g(t10), e3Var);
    }

    @Override // com.explorestack.protobuf.b2
    public void a(T t10, y1 y1Var, y yVar) throws IOException {
        e(this.f10592b, this.f10594d, t10, y1Var, yVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.b2
    public void b(T t10, byte[] bArr, int i10, int i11, g.b bVar) throws IOException {
        i0 i0Var = (i0) t10;
        v2 v2VarJ = i0Var.f10476a;
        if (v2VarJ == v2.c()) {
            v2VarJ = v2.j();
            i0Var.f10476a = v2VarJ;
        }
        e0<i0.c> e0VarS = ((i0.b) t10).s();
        i0.d dVar = null;
        while (i10 < i11) {
            int I = g.I(bArr, i10, bVar);
            int i12 = bVar.f10450a;
            if (i12 == c3.f10249a) {
                int i13 = 0;
                ByteString byteString = null;
                while (I < i11) {
                    I = g.I(bArr, I, bVar);
                    int i14 = bVar.f10450a;
                    int iA = c3.a(i14);
                    int iB = c3.b(i14);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (dVar != null) {
                                I = g.p(v1.a().d(dVar.c().getClass()), bArr, I, i11, bVar);
                                e0VarS.N(dVar.f10488b, bVar.f10452c);
                            } else if (iB == 2) {
                                I = g.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.f10452c;
                            }
                        }
                        if (i14 == c3.f10250b) {
                            break;
                        } else {
                            I = g.N(i14, bArr, I, i11, bVar);
                        }
                    } else if (iB == 0) {
                        I = g.I(bArr, I, bVar);
                        i13 = bVar.f10450a;
                        dVar = (i0.d) this.f10594d.b(bVar.f10453d, this.f10591a, i13);
                    } else {
                        if (i14 == c3.f10250b) {
                            break;
                            break;
                        }
                        I = g.N(i14, bArr, I, i11, bVar);
                    }
                }
                if (byteString != null) {
                    v2VarJ.m(c3.c(i13, 2), byteString);
                }
                i10 = I;
            } else if (c3.b(i12) == 2) {
                i0.d dVar2 = (i0.d) this.f10594d.b(bVar.f10453d, this.f10591a, c3.a(i12));
                if (dVar2 != null) {
                    i10 = g.p(v1.a().d(dVar2.c().getClass()), bArr, I, i11, bVar);
                    e0VarS.N(dVar2.f10488b, bVar.f10452c);
                } else {
                    i10 = g.G(i12, bArr, I, i11, v2VarJ, bVar);
                }
                dVar = dVar2;
            } else {
                i10 = g.N(i12, bArr, I, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.explorestack.protobuf.b2
    public void c(T t10, e3 e3Var) throws IOException {
        Iterator itG = this.f10594d.c(t10).G();
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            e0.c cVar = (e0.c) entry.getKey();
            if (cVar.getLiteJavaType() != c3.c.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof o0.b) {
                e3Var.writeMessageSetItem(cVar.getNumber(), ((o0.b) entry).a().f());
            } else {
                e3Var.writeMessageSetItem(cVar.getNumber(), entry.getValue());
            }
        }
        h(this.f10592b, t10, e3Var);
    }

    @Override // com.explorestack.protobuf.b2
    public boolean equals(T t10, T t11) {
        if (!this.f10592b.g(t10).equals(this.f10592b.g(t11))) {
            return false;
        }
        if (this.f10593c) {
            return this.f10594d.c(t10).equals(this.f10594d.c(t11));
        }
        return true;
    }

    @Override // com.explorestack.protobuf.b2
    public int getSerializedSize(T t10) {
        int iD = d(this.f10592b, t10) + 0;
        return this.f10593c ? iD + this.f10594d.c(t10).u() : iD;
    }

    @Override // com.explorestack.protobuf.b2
    public int hashCode(T t10) {
        int iHashCode = this.f10592b.g(t10).hashCode();
        return this.f10593c ? (iHashCode * 53) + this.f10594d.c(t10).hashCode() : iHashCode;
    }

    @Override // com.explorestack.protobuf.b2
    public final boolean isInitialized(T t10) {
        return this.f10594d.c(t10).D();
    }

    @Override // com.explorestack.protobuf.b2
    public void makeImmutable(T t10) {
        this.f10592b.j(t10);
        this.f10594d.f(t10);
    }

    @Override // com.explorestack.protobuf.b2
    public void mergeFrom(T t10, T t11) {
        d2.H(this.f10592b, t10, t11);
        if (this.f10593c) {
            d2.F(this.f10594d, t10, t11);
        }
    }

    @Override // com.explorestack.protobuf.b2
    public T newInstance() {
        return (T) this.f10591a.newBuilderForType().buildPartial();
    }
}
