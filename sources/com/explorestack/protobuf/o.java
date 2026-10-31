package com.explorestack.protobuf;

import c0.IbU.elEbP;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class o implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f10700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10703d = 0;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10704a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10704a = iArr;
            try {
                iArr[c3.b.f10261j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10704a[c3.b.f10265n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10704a[c3.b.f10254c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10704a[c3.b.f10267p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10704a[c3.b.f10260i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10704a[c3.b.f10259h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10704a[c3.b.f10255d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10704a[c3.b.f10258g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10704a[c3.b.f10256e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10704a[c3.b.f10264m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10704a[c3.b.f10268q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10704a[c3.b.f10269r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10704a[c3.b.f10270s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10704a[c3.b.f10271t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10704a[c3.b.f10262k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10704a[c3.b.f10266o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10704a[c3.b.f10257f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private o(n nVar) {
        n nVar2 = (n) l0.b(nVar, "input");
        this.f10700a = nVar2;
        nVar2.f10642d = this;
    }

    public static o h(n nVar) {
        o oVar = nVar.f10642d;
        return oVar != null ? oVar : new o(nVar);
    }

    private <T> T j(b2<T> b2Var, y yVar) throws IOException {
        int i10 = this.f10702c;
        this.f10702c = c3.c(c3.a(this.f10701b), 4);
        try {
            T tNewInstance = b2Var.newInstance();
            b2Var.a(tNewInstance, this, yVar);
            b2Var.makeImmutable(tNewInstance);
            if (this.f10701b != this.f10702c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f10702c = i10;
            return tNewInstance;
        } catch (Throwable th) {
            this.f10702c = i10;
            throw th;
        }
    }

    private <T> T k(b2<T> b2Var, y yVar) throws IOException {
        int iL = this.f10700a.L();
        n nVar = this.f10700a;
        if (nVar.f10639a >= nVar.f10640b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iP = nVar.p(iL);
        T tNewInstance = b2Var.newInstance();
        this.f10700a.f10639a++;
        b2Var.a(tNewInstance, this, yVar);
        b2Var.makeImmutable(tNewInstance);
        this.f10700a.a(0);
        n nVar2 = this.f10700a;
        nVar2.f10639a--;
        nVar2.o(iP);
        return tNewInstance;
    }

    private void m(int i10) throws IOException {
        if (this.f10700a.e() != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void n(int i10) throws IOException {
        if (c3.b(this.f10701b) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void o(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void p(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.y1
    public <K, V> void a(Map<K, V> map, x0.b<K, V> bVar, y yVar) throws IOException {
        n(2);
        int iP = this.f10700a.p(this.f10700a.L());
        Object objI = bVar.f10865b;
        Object objI2 = bVar.f10867d;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f10700a.f()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objI = i(bVar.f10864a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = i(bVar.f10866c, bVar.f10867d.getClass(), yVar);
                }
            } catch (Throwable th) {
                this.f10700a.o(iP);
                throw th;
            }
        }
        map.put(objI, objI2);
        this.f10700a.o(iP);
    }

    @Override // com.explorestack.protobuf.y1
    public <T> T b(b2<T> b2Var, y yVar) throws IOException {
        n(2);
        return (T) k(b2Var, yVar);
    }

    @Override // com.explorestack.protobuf.y1
    public <T> T c(Class<T> cls, y yVar) throws IOException {
        n(2);
        return (T) k(v1.a().d(cls), yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.y1
    public <T> void d(List<T> list, b2<T> b2Var, y yVar) throws IOException {
        int iK;
        if (c3.b(this.f10701b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i10 = this.f10701b;
        do {
            list.add(j(b2Var, yVar));
            if (this.f10700a.f() || this.f10703d != 0) {
                return;
            } else {
                iK = this.f10700a.K();
            }
        } while (iK == i10);
        this.f10703d = iK;
    }

    @Override // com.explorestack.protobuf.y1
    public <T> T e(b2<T> b2Var, y yVar) throws IOException {
        n(3);
        return (T) j(b2Var, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.y1
    public <T> void f(List<T> list, b2<T> b2Var, y yVar) throws IOException {
        int iK;
        if (c3.b(this.f10701b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i10 = this.f10701b;
        do {
            list.add(k(b2Var, yVar));
            if (this.f10700a.f() || this.f10703d != 0) {
                return;
            } else {
                iK = this.f10700a.K();
            }
        } while (iK == i10);
        this.f10703d = iK;
    }

    @Override // com.explorestack.protobuf.y1
    public <T> T g(Class<T> cls, y yVar) throws IOException {
        n(3);
        return (T) j(v1.a().d(cls), yVar);
    }

    @Override // com.explorestack.protobuf.y1
    public int getFieldNumber() throws IOException {
        int i10 = this.f10703d;
        if (i10 != 0) {
            this.f10701b = i10;
            this.f10703d = 0;
        } else {
            this.f10701b = this.f10700a.K();
        }
        int i11 = this.f10701b;
        if (i11 == 0 || i11 == this.f10702c) {
            return Integer.MAX_VALUE;
        }
        return c3.a(i11);
    }

    @Override // com.explorestack.protobuf.y1
    public int getTag() {
        return this.f10701b;
    }

    public void l(List<String> list, boolean z10) throws IOException {
        int iK;
        int iK2;
        if (c3.b(this.f10701b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof r0) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK = this.f10700a.K();
                }
            } while (iK == this.f10701b);
            this.f10703d = iK;
            return;
        }
        r0 r0Var = (r0) list;
        do {
            r0Var.b(readBytes());
            if (this.f10700a.f()) {
                return;
            } else {
                iK2 = this.f10700a.K();
            }
        } while (iK2 == this.f10701b);
        this.f10703d = iK2;
    }

    @Override // com.explorestack.protobuf.y1
    public boolean readBool() throws IOException {
        n(0);
        return this.f10700a.q();
    }

    @Override // com.explorestack.protobuf.y1
    public void readBoolList(List<Boolean> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof j)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f10700a.q()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Boolean.valueOf(this.f10700a.q()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        j jVar = (j) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                jVar.addBoolean(this.f10700a.q());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            jVar.addBoolean(this.f10700a.q());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public ByteString readBytes() throws IOException {
        n(2);
        return this.f10700a.r();
    }

    @Override // com.explorestack.protobuf.y1
    public void readBytesList(List<ByteString> list) throws IOException {
        int iK;
        if (c3.b(this.f10701b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f10700a.f()) {
                return;
            } else {
                iK = this.f10700a.K();
            }
        } while (iK == this.f10701b);
        this.f10703d = iK;
    }

    @Override // com.explorestack.protobuf.y1
    public double readDouble() throws IOException {
        n(1);
        return this.f10700a.s();
    }

    @Override // com.explorestack.protobuf.y1
    public void readDoubleList(List<Double> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof r)) {
            int iB = c3.b(this.f10701b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f10700a.s()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iL = this.f10700a.L();
            p(iL);
            int iE = this.f10700a.e() + iL;
            do {
                list.add(Double.valueOf(this.f10700a.s()));
            } while (this.f10700a.e() < iE);
            return;
        }
        r rVar = (r) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 1) {
            do {
                rVar.addDouble(this.f10700a.s());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iL2 = this.f10700a.L();
        p(iL2);
        int iE2 = this.f10700a.e() + iL2;
        do {
            rVar.addDouble(this.f10700a.s());
        } while (this.f10700a.e() < iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public int readEnum() throws IOException {
        n(0);
        return this.f10700a.t();
    }

    @Override // com.explorestack.protobuf.y1
    public void readEnumList(List<Integer> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof k0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f10700a.t()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Integer.valueOf(this.f10700a.t()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                k0Var.addInt(this.f10700a.t());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            k0Var.addInt(this.f10700a.t());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public int readFixed32() throws IOException {
        n(5);
        return this.f10700a.u();
    }

    @Override // com.explorestack.protobuf.y1
    public void readFixed32List(List<Integer> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof k0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 2) {
                int iL = this.f10700a.L();
                o(iL);
                int iE = this.f10700a.e() + iL;
                do {
                    list.add(Integer.valueOf(this.f10700a.u()));
                } while (this.f10700a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f10700a.u()));
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK = this.f10700a.K();
                }
            } while (iK == this.f10701b);
            this.f10703d = iK;
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 2) {
            int iL2 = this.f10700a.L();
            o(iL2);
            int iE2 = this.f10700a.e() + iL2;
            do {
                k0Var.addInt(this.f10700a.u());
            } while (this.f10700a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            k0Var.addInt(this.f10700a.u());
            if (this.f10700a.f()) {
                return;
            } else {
                iK2 = this.f10700a.K();
            }
        } while (iK2 == this.f10701b);
        this.f10703d = iK2;
    }

    @Override // com.explorestack.protobuf.y1
    public long readFixed64() throws IOException {
        n(1);
        return this.f10700a.v();
    }

    @Override // com.explorestack.protobuf.y1
    public void readFixed64List(List<Long> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof u0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f10700a.v()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iL = this.f10700a.L();
            p(iL);
            int iE = this.f10700a.e() + iL;
            do {
                list.add(Long.valueOf(this.f10700a.v()));
            } while (this.f10700a.e() < iE);
            return;
        }
        u0 u0Var = (u0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 1) {
            do {
                u0Var.addLong(this.f10700a.v());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iL2 = this.f10700a.L();
        p(iL2);
        int iE2 = this.f10700a.e() + iL2;
        do {
            u0Var.addLong(this.f10700a.v());
        } while (this.f10700a.e() < iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public float readFloat() throws IOException {
        n(5);
        return this.f10700a.w();
    }

    @Override // com.explorestack.protobuf.y1
    public void readFloatList(List<Float> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof g0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 2) {
                int iL = this.f10700a.L();
                o(iL);
                int iE = this.f10700a.e() + iL;
                do {
                    list.add(Float.valueOf(this.f10700a.w()));
                } while (this.f10700a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f10700a.w()));
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK = this.f10700a.K();
                }
            } while (iK == this.f10701b);
            this.f10703d = iK;
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 2) {
            int iL2 = this.f10700a.L();
            o(iL2);
            int iE2 = this.f10700a.e() + iL2;
            do {
                g0Var.addFloat(this.f10700a.w());
            } while (this.f10700a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            g0Var.addFloat(this.f10700a.w());
            if (this.f10700a.f()) {
                return;
            } else {
                iK2 = this.f10700a.K();
            }
        } while (iK2 == this.f10701b);
        this.f10703d = iK2;
    }

    @Override // com.explorestack.protobuf.y1
    public int readInt32() throws IOException {
        n(0);
        return this.f10700a.y();
    }

    @Override // com.explorestack.protobuf.y1
    public void readInt32List(List<Integer> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof k0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f10700a.y()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Integer.valueOf(this.f10700a.y()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                k0Var.addInt(this.f10700a.y());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            k0Var.addInt(this.f10700a.y());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public long readInt64() throws IOException {
        n(0);
        return this.f10700a.z();
    }

    @Override // com.explorestack.protobuf.y1
    public void readInt64List(List<Long> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof u0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f10700a.z()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Long.valueOf(this.f10700a.z()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        u0 u0Var = (u0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                u0Var.addLong(this.f10700a.z());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            u0Var.addLong(this.f10700a.z());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public int readSFixed32() throws IOException {
        n(5);
        return this.f10700a.E();
    }

    @Override // com.explorestack.protobuf.y1
    public void readSFixed32List(List<Integer> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof k0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 2) {
                int iL = this.f10700a.L();
                o(iL);
                int iE = this.f10700a.e() + iL;
                do {
                    list.add(Integer.valueOf(this.f10700a.E()));
                } while (this.f10700a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f10700a.E()));
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK = this.f10700a.K();
                }
            } while (iK == this.f10701b);
            this.f10703d = iK;
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 2) {
            int iL2 = this.f10700a.L();
            o(iL2);
            int iE2 = this.f10700a.e() + iL2;
            do {
                k0Var.addInt(this.f10700a.E());
            } while (this.f10700a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            k0Var.addInt(this.f10700a.E());
            if (this.f10700a.f()) {
                return;
            } else {
                iK2 = this.f10700a.K();
            }
        } while (iK2 == this.f10701b);
        this.f10703d = iK2;
    }

    @Override // com.explorestack.protobuf.y1
    public long readSFixed64() throws IOException {
        n(1);
        return this.f10700a.F();
    }

    @Override // com.explorestack.protobuf.y1
    public void readSFixed64List(List<Long> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof u0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f10700a.F()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iL = this.f10700a.L();
            p(iL);
            int iE = this.f10700a.e() + iL;
            do {
                list.add(Long.valueOf(this.f10700a.F()));
            } while (this.f10700a.e() < iE);
            return;
        }
        u0 u0Var = (u0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 1) {
            do {
                u0Var.addLong(this.f10700a.F());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iL2 = this.f10700a.L();
        p(iL2);
        int iE2 = this.f10700a.e() + iL2;
        do {
            u0Var.addLong(this.f10700a.F());
        } while (this.f10700a.e() < iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public int readSInt32() throws IOException {
        n(0);
        return this.f10700a.G();
    }

    @Override // com.explorestack.protobuf.y1
    public void readSInt32List(List<Integer> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof k0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f10700a.G()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Integer.valueOf(this.f10700a.G()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                k0Var.addInt(this.f10700a.G());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            k0Var.addInt(this.f10700a.G());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public long readSInt64() throws IOException {
        n(0);
        return this.f10700a.H();
    }

    @Override // com.explorestack.protobuf.y1
    public void readSInt64List(List<Long> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof u0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f10700a.H()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Long.valueOf(this.f10700a.H()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        u0 u0Var = (u0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                u0Var.addLong(this.f10700a.H());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            u0Var.addLong(this.f10700a.H());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public String readString() throws IOException {
        n(2);
        return this.f10700a.I();
    }

    @Override // com.explorestack.protobuf.y1
    public void readStringList(List<String> list) throws IOException {
        l(list, false);
    }

    @Override // com.explorestack.protobuf.y1
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        l(list, true);
    }

    @Override // com.explorestack.protobuf.y1
    public String readStringRequireUtf8() throws IOException {
        n(2);
        return this.f10700a.J();
    }

    @Override // com.explorestack.protobuf.y1
    public int readUInt32() throws IOException {
        n(0);
        return this.f10700a.L();
    }

    @Override // com.explorestack.protobuf.y1
    public void readUInt32List(List<Integer> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof k0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f10700a.L()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Integer.valueOf(this.f10700a.L()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                k0Var.addInt(this.f10700a.L());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            k0Var.addInt(this.f10700a.L());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public long readUInt64() throws IOException {
        n(0);
        return this.f10700a.M();
    }

    @Override // com.explorestack.protobuf.y1
    public void readUInt64List(List<Long> list) throws IOException {
        int iK;
        int iK2;
        if (!(list instanceof u0)) {
            int iB = c3.b(this.f10701b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f10700a.M()));
                    if (this.f10700a.f()) {
                        return;
                    } else {
                        iK = this.f10700a.K();
                    }
                } while (iK == this.f10701b);
                this.f10703d = iK;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f10700a.e() + this.f10700a.L();
            do {
                list.add(Long.valueOf(this.f10700a.M()));
            } while (this.f10700a.e() < iE);
            m(iE);
            return;
        }
        u0 u0Var = (u0) list;
        int iB2 = c3.b(this.f10701b);
        if (iB2 == 0) {
            do {
                u0Var.addLong(this.f10700a.M());
                if (this.f10700a.f()) {
                    return;
                } else {
                    iK2 = this.f10700a.K();
                }
            } while (iK2 == this.f10701b);
            this.f10703d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f10700a.e() + this.f10700a.L();
        do {
            u0Var.addLong(this.f10700a.M());
        } while (this.f10700a.e() < iE2);
        m(iE2);
    }

    @Override // com.explorestack.protobuf.y1
    public boolean shouldDiscardUnknownFields() {
        return this.f10700a.N();
    }

    @Override // com.explorestack.protobuf.y1
    public boolean skipField() throws IOException {
        int i10;
        if (this.f10700a.f() || (i10 = this.f10701b) == this.f10702c) {
            return false;
        }
        return this.f10700a.O(i10);
    }

    private Object i(c3.b bVar, Class<?> cls, y yVar) throws IOException {
        switch (a.f10704a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return c(cls, yVar);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new RuntimeException(elEbP.RvoWvl);
        }
    }
}
