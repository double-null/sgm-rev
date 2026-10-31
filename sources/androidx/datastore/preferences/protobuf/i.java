package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes.dex */
final class i implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f2189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2192d = 0;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2193a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f2193a = iArr;
            try {
                iArr[p1.b.f2266j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2193a[p1.b.f2270n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2193a[p1.b.f2259c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2193a[p1.b.f2272p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2193a[p1.b.f2265i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2193a[p1.b.f2264h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2193a[p1.b.f2260d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2193a[p1.b.f2263g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2193a[p1.b.f2261e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2193a[p1.b.f2269m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2193a[p1.b.f2273q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2193a[p1.b.f2274r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2193a[p1.b.f2275s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2193a[p1.b.f2276t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2193a[p1.b.f2267k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2193a[p1.b.f2271o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2193a[p1.b.f2262f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) y.b(hVar, "input");
        this.f2189a = hVar2;
        hVar2.f2148d = this;
    }

    public static i h(h hVar) {
        i iVar = hVar.f2148d;
        return iVar != null ? iVar : new i(hVar);
    }

    private <T> void i(T t10, e1<T> e1Var, n nVar) throws IOException {
        int i10 = this.f2191c;
        this.f2191c = p1.c(p1.a(this.f2190b), 4);
        try {
            e1Var.a(t10, this, nVar);
            if (this.f2190b != this.f2191c) {
                throw InvalidProtocolBufferException.n();
            }
            this.f2191c = i10;
        } catch (Throwable th) {
            this.f2191c = i10;
            throw th;
        }
    }

    private <T> void j(T t10, e1<T> e1Var, n nVar) throws IOException {
        int iD = this.f2189a.D();
        h hVar = this.f2189a;
        if (hVar.f2145a >= hVar.f2146b) {
            throw InvalidProtocolBufferException.o();
        }
        int iM = hVar.m(iD);
        this.f2189a.f2145a++;
        e1Var.a(t10, this, nVar);
        this.f2189a.a(0);
        h hVar2 = this.f2189a;
        hVar2.f2145a--;
        hVar2.l(iM);
    }

    private Object k(p1.b bVar, Class<?> cls, n nVar) throws IOException {
        switch (a.f2193a[bVar.ordinal()]) {
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
                return c(cls, nVar);
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
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T l(e1<T> e1Var, n nVar) throws IOException {
        T tNewInstance = e1Var.newInstance();
        i(tNewInstance, e1Var, nVar);
        e1Var.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T m(e1<T> e1Var, n nVar) throws IOException {
        T tNewInstance = e1Var.newInstance();
        j(tNewInstance, e1Var, nVar);
        e1Var.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private void o(int i10) throws IOException {
        if (this.f2189a.e() != i10) {
            throw InvalidProtocolBufferException.v();
        }
    }

    private void p(int i10) throws IOException {
        if (p1.b(this.f2190b) != i10) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void q(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.n();
        }
    }

    private void r(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.n();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> void a(T t10, e1<T> e1Var, n nVar) throws IOException {
        p(2);
        j(t10, e1Var, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> void b(List<T> list, e1<T> e1Var, n nVar) throws IOException {
        int iC;
        if (p1.b(this.f2190b) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int i10 = this.f2190b;
        do {
            list.add(m(e1Var, nVar));
            if (this.f2189a.f() || this.f2192d != 0) {
                return;
            } else {
                iC = this.f2189a.C();
            }
        } while (iC == i10);
        this.f2192d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> T c(Class<T> cls, n nVar) throws IOException {
        p(2);
        return (T) m(a1.a().c(cls), nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    @Deprecated
    public <T> T d(Class<T> cls, n nVar) throws IOException {
        p(3);
        return (T) l(a1.a().c(cls), nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d1
    public <K, V> void e(Map<K, V> map, i0.a<K, V> aVar, n nVar) throws IOException {
        p(2);
        int iM = this.f2189a.m(this.f2189a.D());
        Object objK = aVar.f2198b;
        Object objK2 = aVar.f2200d;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f2189a.f()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objK = k(aVar.f2197a, null, null);
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
                    objK2 = k(aVar.f2199c, aVar.f2200d.getClass(), nVar);
                }
            } catch (Throwable th) {
                this.f2189a.l(iM);
                throw th;
            }
        }
        map.put(objK, objK2);
        this.f2189a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public <T> void f(T t10, e1<T> e1Var, n nVar) throws IOException {
        p(3);
        i(t10, e1Var, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.d1
    @Deprecated
    public <T> void g(List<T> list, e1<T> e1Var, n nVar) throws IOException {
        int iC;
        if (p1.b(this.f2190b) != 3) {
            throw InvalidProtocolBufferException.g();
        }
        int i10 = this.f2190b;
        do {
            list.add(l(e1Var, nVar));
            if (this.f2189a.f() || this.f2192d != 0) {
                return;
            } else {
                iC = this.f2189a.C();
            }
        } while (iC == i10);
        this.f2192d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int getFieldNumber() throws IOException {
        int i10 = this.f2192d;
        if (i10 != 0) {
            this.f2190b = i10;
            this.f2192d = 0;
        } else {
            this.f2190b = this.f2189a.C();
        }
        int i11 = this.f2190b;
        if (i11 == 0 || i11 == this.f2191c) {
            return Integer.MAX_VALUE;
        }
        return p1.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int getTag() {
        return this.f2190b;
    }

    public void n(List<String> list, boolean z10) throws IOException {
        int iC;
        int iC2;
        if (p1.b(this.f2190b) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        if (!(list instanceof c0) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC = this.f2189a.C();
                }
            } while (iC == this.f2190b);
            this.f2192d = iC;
            return;
        }
        c0 c0Var = (c0) list;
        do {
            c0Var.n(readBytes());
            if (this.f2189a.f()) {
                return;
            } else {
                iC2 = this.f2189a.C();
            }
        } while (iC2 == this.f2190b);
        this.f2192d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public boolean readBool() throws IOException {
        p(0);
        return this.f2189a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readBoolList(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof e)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2189a.n()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Boolean.valueOf(this.f2189a.n()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        e eVar = (e) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                eVar.addBoolean(this.f2189a.n());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            eVar.addBoolean(this.f2189a.n());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public g readBytes() throws IOException {
        p(2);
        return this.f2189a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readBytesList(List<g> list) throws IOException {
        int iC;
        if (p1.b(this.f2190b) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            list.add(readBytes());
            if (this.f2189a.f()) {
                return;
            } else {
                iC = this.f2189a.C();
            }
        } while (iC == this.f2190b);
        this.f2192d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public double readDouble() throws IOException {
        p(1);
        return this.f2189a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readDoubleList(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof k)) {
            int iB = p1.b(this.f2190b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f2189a.p()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iD = this.f2189a.D();
            r(iD);
            int iE = this.f2189a.e() + iD;
            do {
                list.add(Double.valueOf(this.f2189a.p()));
            } while (this.f2189a.e() < iE);
            return;
        }
        k kVar = (k) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 1) {
            do {
                kVar.addDouble(this.f2189a.p());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD2 = this.f2189a.D();
        r(iD2);
        int iE2 = this.f2189a.e() + iD2;
        do {
            kVar.addDouble(this.f2189a.p());
        } while (this.f2189a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readEnum() throws IOException {
        p(0);
        return this.f2189a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readEnumList(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2189a.q()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Integer.valueOf(this.f2189a.q()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f2189a.q());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            xVar.addInt(this.f2189a.q());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readFixed32() throws IOException {
        p(5);
        return this.f2189a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readFixed32List(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f2190b);
            if (iB == 2) {
                int iD = this.f2189a.D();
                q(iD);
                int iE = this.f2189a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f2189a.r()));
                } while (this.f2189a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Integer.valueOf(this.f2189a.r()));
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC = this.f2189a.C();
                }
            } while (iC == this.f2190b);
            this.f2192d = iC;
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 2) {
            int iD2 = this.f2189a.D();
            q(iD2);
            int iE2 = this.f2189a.e() + iD2;
            do {
                xVar.addInt(this.f2189a.r());
            } while (this.f2189a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            xVar.addInt(this.f2189a.r());
            if (this.f2189a.f()) {
                return;
            } else {
                iC2 = this.f2189a.C();
            }
        } while (iC2 == this.f2190b);
        this.f2192d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readFixed64() throws IOException {
        p(1);
        return this.f2189a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readFixed64List(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f2190b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2189a.s()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iD = this.f2189a.D();
            r(iD);
            int iE = this.f2189a.e() + iD;
            do {
                list.add(Long.valueOf(this.f2189a.s()));
            } while (this.f2189a.e() < iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 1) {
            do {
                g0Var.addLong(this.f2189a.s());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD2 = this.f2189a.D();
        r(iD2);
        int iE2 = this.f2189a.e() + iD2;
        do {
            g0Var.addLong(this.f2189a.s());
        } while (this.f2189a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public float readFloat() throws IOException {
        p(5);
        return this.f2189a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readFloatList(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof u)) {
            int iB = p1.b(this.f2190b);
            if (iB == 2) {
                int iD = this.f2189a.D();
                q(iD);
                int iE = this.f2189a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f2189a.t()));
                } while (this.f2189a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Float.valueOf(this.f2189a.t()));
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC = this.f2189a.C();
                }
            } while (iC == this.f2190b);
            this.f2192d = iC;
            return;
        }
        u uVar = (u) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 2) {
            int iD2 = this.f2189a.D();
            q(iD2);
            int iE2 = this.f2189a.e() + iD2;
            do {
                uVar.addFloat(this.f2189a.t());
            } while (this.f2189a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            uVar.addFloat(this.f2189a.t());
            if (this.f2189a.f()) {
                return;
            } else {
                iC2 = this.f2189a.C();
            }
        } while (iC2 == this.f2190b);
        this.f2192d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readInt32() throws IOException {
        p(0);
        return this.f2189a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readInt32List(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2189a.u()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Integer.valueOf(this.f2189a.u()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f2189a.u());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            xVar.addInt(this.f2189a.u());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readInt64() throws IOException {
        p(0);
        return this.f2189a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readInt64List(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2189a.v()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Long.valueOf(this.f2189a.v()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                g0Var.addLong(this.f2189a.v());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            g0Var.addLong(this.f2189a.v());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readSFixed32() throws IOException {
        p(5);
        return this.f2189a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSFixed32List(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f2190b);
            if (iB == 2) {
                int iD = this.f2189a.D();
                q(iD);
                int iE = this.f2189a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f2189a.w()));
                } while (this.f2189a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Integer.valueOf(this.f2189a.w()));
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC = this.f2189a.C();
                }
            } while (iC == this.f2190b);
            this.f2192d = iC;
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 2) {
            int iD2 = this.f2189a.D();
            q(iD2);
            int iE2 = this.f2189a.e() + iD2;
            do {
                xVar.addInt(this.f2189a.w());
            } while (this.f2189a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            xVar.addInt(this.f2189a.w());
            if (this.f2189a.f()) {
                return;
            } else {
                iC2 = this.f2189a.C();
            }
        } while (iC2 == this.f2190b);
        this.f2192d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readSFixed64() throws IOException {
        p(1);
        return this.f2189a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSFixed64List(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f2190b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2189a.x()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iD = this.f2189a.D();
            r(iD);
            int iE = this.f2189a.e() + iD;
            do {
                list.add(Long.valueOf(this.f2189a.x()));
            } while (this.f2189a.e() < iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 1) {
            do {
                g0Var.addLong(this.f2189a.x());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iD2 = this.f2189a.D();
        r(iD2);
        int iE2 = this.f2189a.e() + iD2;
        do {
            g0Var.addLong(this.f2189a.x());
        } while (this.f2189a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readSInt32() throws IOException {
        p(0);
        return this.f2189a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSInt32List(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2189a.y()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Integer.valueOf(this.f2189a.y()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f2189a.y());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            xVar.addInt(this.f2189a.y());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readSInt64() throws IOException {
        p(0);
        return this.f2189a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readSInt64List(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2189a.z()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Long.valueOf(this.f2189a.z()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                g0Var.addLong(this.f2189a.z());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            g0Var.addLong(this.f2189a.z());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public String readString() throws IOException {
        p(2);
        return this.f2189a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readStringList(List<String> list) throws IOException {
        n(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        n(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public String readStringRequireUtf8() throws IOException {
        p(2);
        return this.f2189a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public int readUInt32() throws IOException {
        p(0);
        return this.f2189a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readUInt32List(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2189a.D()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Integer.valueOf(this.f2189a.D()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        x xVar = (x) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                xVar.addInt(this.f2189a.D());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            xVar.addInt(this.f2189a.D());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public long readUInt64() throws IOException {
        p(0);
        return this.f2189a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public void readUInt64List(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof g0)) {
            int iB = p1.b(this.f2190b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2189a.E()));
                    if (this.f2189a.f()) {
                        return;
                    } else {
                        iC = this.f2189a.C();
                    }
                } while (iC == this.f2190b);
                this.f2192d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = this.f2189a.e() + this.f2189a.D();
            do {
                list.add(Long.valueOf(this.f2189a.E()));
            } while (this.f2189a.e() < iE);
            o(iE);
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = p1.b(this.f2190b);
        if (iB2 == 0) {
            do {
                g0Var.addLong(this.f2189a.E());
                if (this.f2189a.f()) {
                    return;
                } else {
                    iC2 = this.f2189a.C();
                }
            } while (iC2 == this.f2190b);
            this.f2192d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int iE2 = this.f2189a.e() + this.f2189a.D();
        do {
            g0Var.addLong(this.f2189a.E());
        } while (this.f2189a.e() < iE2);
        o(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public boolean skipField() throws IOException {
        int i10;
        if (this.f2189a.f() || (i10 = this.f2190b) == this.f2191c) {
            return false;
        }
        return this.f2189a.F(i10);
    }
}
