package com.explorestack.protobuf;

import c0.IbU.elEbP;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BinaryReader.java */
/* JADX INFO: loaded from: classes.dex */
abstract class h implements y1 {

    /* JADX INFO: compiled from: BinaryReader.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10460a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10460a = iArr;
            try {
                iArr[c3.b.f10261j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10460a[c3.b.f10265n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10460a[c3.b.f10254c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10460a[c3.b.f10267p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10460a[c3.b.f10260i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10460a[c3.b.f10259h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10460a[c3.b.f10255d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10460a[c3.b.f10258g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10460a[c3.b.f10256e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10460a[c3.b.f10264m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10460a[c3.b.f10268q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10460a[c3.b.f10269r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10460a[c3.b.f10270s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10460a[c3.b.f10271t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10460a[c3.b.f10262k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10460a[c3.b.f10266o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10460a[c3.b.f10257f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: compiled from: BinaryReader.java */
    /* JADX INFO: loaded from: classes2.dex */
    private static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f10461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f10462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f10464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10466f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10467g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f10461a = z10;
            this.f10462b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f10463c = iArrayOffset;
            this.f10464d = iArrayOffset;
            this.f10465e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private void A() throws IOException {
            int i10 = this.f10467g;
            this.f10467g = c3.c(c3.a(this.f10466f), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.f10466f != this.f10467g) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f10467g = i10;
        }

        private void B() throws IOException {
            int i10 = this.f10465e;
            int i11 = this.f10463c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f10462b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f10463c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            C();
        }

        private void C() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (j() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void D(int i10) throws IOException {
            w(i10);
            if ((i10 & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void E(int i10) throws IOException {
            w(i10);
            if ((i10 & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private boolean i() {
            return this.f10463c == this.f10465e;
        }

        private byte j() throws IOException {
            int i10 = this.f10463c;
            if (i10 == this.f10465e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f10462b;
            this.f10463c = i10 + 1;
            return bArr[i10];
        }

        private <T> T l(b2<T> b2Var, y yVar) throws IOException {
            int i10 = this.f10467g;
            this.f10467g = c3.c(c3.a(this.f10466f), 4);
            try {
                T tNewInstance = b2Var.newInstance();
                b2Var.a(tNewInstance, this, yVar);
                b2Var.makeImmutable(tNewInstance);
                if (this.f10466f != this.f10467g) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.f10467g = i10;
                return tNewInstance;
            } catch (Throwable th) {
                this.f10467g = i10;
                throw th;
            }
        }

        private int m() throws IOException {
            w(4);
            return n();
        }

        private int n() {
            int i10 = this.f10463c;
            byte[] bArr = this.f10462b;
            this.f10463c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long o() throws IOException {
            w(8);
            return p();
        }

        private long p() {
            int i10 = this.f10463c;
            byte[] bArr = this.f10462b;
            this.f10463c = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        private <T> T q(b2<T> b2Var, y yVar) throws IOException {
            int iT = t();
            w(iT);
            int i10 = this.f10465e;
            int i11 = this.f10463c + iT;
            this.f10465e = i11;
            try {
                T tNewInstance = b2Var.newInstance();
                b2Var.a(tNewInstance, this, yVar);
                b2Var.makeImmutable(tNewInstance);
                if (this.f10463c != i11) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.f10465e = i10;
                return tNewInstance;
            } catch (Throwable th) {
                this.f10465e = i10;
                throw th;
            }
        }

        private int t() throws IOException {
            int i10;
            int i11 = this.f10463c;
            int i12 = this.f10465e;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f10462b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f10463c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) v();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 < 0) {
                i10 = i15 ^ (-128);
            } else {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        i16 = i14 + 1;
                        byte b11 = bArr[i14];
                        i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                        if (b11 < 0) {
                            i14 = i16 + 1;
                            if (bArr[i16] < 0) {
                                i16 = i14 + 1;
                                if (bArr[i14] < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i14 = i16;
            }
            this.f10463c = i14;
            return i10;
        }

        private long v() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bJ = j();
                j10 |= ((long) (bJ & 127)) << i10;
                if ((bJ & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void w(int i10) throws IOException {
            if (i10 < 0 || i10 > this.f10465e - this.f10463c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void x(int i10) throws IOException {
            if (this.f10463c != i10) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void y(int i10) throws IOException {
            if (c3.b(this.f10466f) != i10) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void z(int i10) throws IOException {
            w(i10);
            this.f10463c += i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.y1
        public <K, V> void a(Map<K, V> map, x0.b<K, V> bVar, y yVar) throws IOException {
            y(2);
            int iT = t();
            w(iT);
            int i10 = this.f10465e;
            this.f10465e = this.f10463c + iT;
            try {
                Object objK = bVar.f10865b;
                Object objK2 = bVar.f10867d;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(objK, objK2);
                        this.f10465e = i10;
                        return;
                    } else if (fieldNumber == 1) {
                        objK = k(bVar.f10864a, null, null);
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
                        objK2 = k(bVar.f10866c, bVar.f10867d.getClass(), yVar);
                    }
                }
            } catch (Throwable th) {
                this.f10465e = i10;
                throw th;
            }
        }

        @Override // com.explorestack.protobuf.y1
        public <T> T b(b2<T> b2Var, y yVar) throws IOException {
            y(2);
            return (T) q(b2Var, yVar);
        }

        @Override // com.explorestack.protobuf.y1
        public <T> T c(Class<T> cls, y yVar) throws IOException {
            y(2);
            return (T) q(v1.a().d(cls), yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.y1
        public <T> void d(List<T> list, b2<T> b2Var, y yVar) throws IOException {
            int i10;
            if (c3.b(this.f10466f) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i11 = this.f10466f;
            do {
                list.add(l(b2Var, yVar));
                if (i()) {
                    return;
                } else {
                    i10 = this.f10463c;
                }
            } while (t() == i11);
            this.f10463c = i10;
        }

        @Override // com.explorestack.protobuf.y1
        public <T> T e(b2<T> b2Var, y yVar) throws IOException {
            y(3);
            return (T) l(b2Var, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.y1
        public <T> void f(List<T> list, b2<T> b2Var, y yVar) throws IOException {
            int i10;
            if (c3.b(this.f10466f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i11 = this.f10466f;
            do {
                list.add(q(b2Var, yVar));
                if (i()) {
                    return;
                } else {
                    i10 = this.f10463c;
                }
            } while (t() == i11);
            this.f10463c = i10;
        }

        @Override // com.explorestack.protobuf.y1
        public <T> T g(Class<T> cls, y yVar) throws IOException {
            y(3);
            return (T) l(v1.a().d(cls), yVar);
        }

        @Override // com.explorestack.protobuf.y1
        public int getFieldNumber() throws IOException {
            if (i()) {
                return Integer.MAX_VALUE;
            }
            int iT = t();
            this.f10466f = iT;
            if (iT == this.f10467g) {
                return Integer.MAX_VALUE;
            }
            return c3.a(iT);
        }

        @Override // com.explorestack.protobuf.y1
        public int getTag() {
            return this.f10466f;
        }

        public String r(boolean z10) throws IOException {
            y(2);
            int iT = t();
            if (iT == 0) {
                return "";
            }
            w(iT);
            if (z10) {
                byte[] bArr = this.f10462b;
                int i10 = this.f10463c;
                if (!a3.t(bArr, i10, i10 + iT)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f10462b, this.f10463c, iT, l0.f10621a);
            this.f10463c += iT;
            return str;
        }

        @Override // com.explorestack.protobuf.y1
        public boolean readBool() throws IOException {
            y(0);
            return t() != 0;
        }

        @Override // com.explorestack.protobuf.y1
        public void readBoolList(List<Boolean> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof j)) {
                int iB = c3.b(this.f10466f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iT = this.f10463c + t();
                    while (this.f10463c < iT) {
                        list.add(Boolean.valueOf(t() != 0));
                    }
                    x(iT);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(readBool()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            j jVar = (j) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT2 = this.f10463c + t();
                while (this.f10463c < iT2) {
                    jVar.addBoolean(t() != 0);
                }
                x(iT2);
                return;
            }
            do {
                jVar.addBoolean(readBool());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public ByteString readBytes() throws IOException {
            y(2);
            int iT = t();
            if (iT == 0) {
                return ByteString.EMPTY;
            }
            w(iT);
            ByteString byteStringWrap = this.f10461a ? ByteString.wrap(this.f10462b, this.f10463c, iT) : ByteString.copyFrom(this.f10462b, this.f10463c, iT);
            this.f10463c += iT;
            return byteStringWrap;
        }

        @Override // com.explorestack.protobuf.y1
        public void readBytesList(List<ByteString> list) throws IOException {
            int i10;
            if (c3.b(this.f10466f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (i()) {
                    return;
                } else {
                    i10 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i10;
        }

        @Override // com.explorestack.protobuf.y1
        public double readDouble() throws IOException {
            y(1);
            return Double.longBitsToDouble(o());
        }

        @Override // com.explorestack.protobuf.y1
        public void readDoubleList(List<Double> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof r)) {
                int iB = c3.b(this.f10466f);
                if (iB == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (i()) {
                            return;
                        } else {
                            i10 = this.f10463c;
                        }
                    } while (t() == this.f10466f);
                    this.f10463c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT = t();
                E(iT);
                int i12 = this.f10463c + iT;
                while (this.f10463c < i12) {
                    list.add(Double.valueOf(Double.longBitsToDouble(p())));
                }
                return;
            }
            r rVar = (r) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 1) {
                do {
                    rVar.addDouble(readDouble());
                    if (i()) {
                        return;
                    } else {
                        i11 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iT2 = t();
            E(iT2);
            int i13 = this.f10463c + iT2;
            while (this.f10463c < i13) {
                rVar.addDouble(Double.longBitsToDouble(p()));
            }
        }

        @Override // com.explorestack.protobuf.y1
        public int readEnum() throws IOException {
            y(0);
            return t();
        }

        @Override // com.explorestack.protobuf.y1
        public void readEnumList(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof k0)) {
                int iB = c3.b(this.f10466f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iT = this.f10463c + t();
                    while (this.f10463c < iT) {
                        list.add(Integer.valueOf(t()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readEnum()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            k0 k0Var = (k0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT2 = this.f10463c + t();
                while (this.f10463c < iT2) {
                    k0Var.addInt(t());
                }
                return;
            }
            do {
                k0Var.addInt(readEnum());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public int readFixed32() throws IOException {
            y(5);
            return m();
        }

        @Override // com.explorestack.protobuf.y1
        public void readFixed32List(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof k0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 2) {
                    int iT = t();
                    D(iT);
                    int i12 = this.f10463c + iT;
                    while (this.f10463c < i12) {
                        list.add(Integer.valueOf(n()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            k0 k0Var = (k0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 2) {
                int iT2 = t();
                D(iT2);
                int i13 = this.f10463c + iT2;
                while (this.f10463c < i13) {
                    k0Var.addInt(n());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k0Var.addInt(readFixed32());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public long readFixed64() throws IOException {
            y(1);
            return o();
        }

        @Override // com.explorestack.protobuf.y1
        public void readFixed64List(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof u0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(readFixed64()));
                        if (i()) {
                            return;
                        } else {
                            i10 = this.f10463c;
                        }
                    } while (t() == this.f10466f);
                    this.f10463c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT = t();
                E(iT);
                int i12 = this.f10463c + iT;
                while (this.f10463c < i12) {
                    list.add(Long.valueOf(p()));
                }
                return;
            }
            u0 u0Var = (u0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 1) {
                do {
                    u0Var.addLong(readFixed64());
                    if (i()) {
                        return;
                    } else {
                        i11 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iT2 = t();
            E(iT2);
            int i13 = this.f10463c + iT2;
            while (this.f10463c < i13) {
                u0Var.addLong(p());
            }
        }

        @Override // com.explorestack.protobuf.y1
        public float readFloat() throws IOException {
            y(5);
            return Float.intBitsToFloat(m());
        }

        @Override // com.explorestack.protobuf.y1
        public void readFloatList(List<Float> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof g0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 2) {
                    int iT = t();
                    D(iT);
                    int i12 = this.f10463c + iT;
                    while (this.f10463c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(n())));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            g0 g0Var = (g0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 2) {
                int iT2 = t();
                D(iT2);
                int i13 = this.f10463c + iT2;
                while (this.f10463c < i13) {
                    g0Var.addFloat(Float.intBitsToFloat(n()));
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                g0Var.addFloat(readFloat());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public int readInt32() throws IOException {
            y(0);
            return t();
        }

        @Override // com.explorestack.protobuf.y1
        public void readInt32List(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof k0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 0) {
                    do {
                        list.add(Integer.valueOf(readInt32()));
                        if (i()) {
                            return;
                        } else {
                            i10 = this.f10463c;
                        }
                    } while (t() == this.f10466f);
                    this.f10463c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT = this.f10463c + t();
                while (this.f10463c < iT) {
                    list.add(Integer.valueOf(t()));
                }
                x(iT);
                return;
            }
            k0 k0Var = (k0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 0) {
                do {
                    k0Var.addInt(readInt32());
                    if (i()) {
                        return;
                    } else {
                        i11 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iT2 = this.f10463c + t();
            while (this.f10463c < iT2) {
                k0Var.addInt(t());
            }
            x(iT2);
        }

        @Override // com.explorestack.protobuf.y1
        public long readInt64() throws IOException {
            y(0);
            return u();
        }

        @Override // com.explorestack.protobuf.y1
        public void readInt64List(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof u0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(readInt64()));
                        if (i()) {
                            return;
                        } else {
                            i10 = this.f10463c;
                        }
                    } while (t() == this.f10466f);
                    this.f10463c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT = this.f10463c + t();
                while (this.f10463c < iT) {
                    list.add(Long.valueOf(u()));
                }
                x(iT);
                return;
            }
            u0 u0Var = (u0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 0) {
                do {
                    u0Var.addLong(readInt64());
                    if (i()) {
                        return;
                    } else {
                        i11 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iT2 = this.f10463c + t();
            while (this.f10463c < iT2) {
                u0Var.addLong(u());
            }
            x(iT2);
        }

        @Override // com.explorestack.protobuf.y1
        public int readSFixed32() throws IOException {
            y(5);
            return m();
        }

        @Override // com.explorestack.protobuf.y1
        public void readSFixed32List(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof k0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 2) {
                    int iT = t();
                    D(iT);
                    int i12 = this.f10463c + iT;
                    while (this.f10463c < i12) {
                        list.add(Integer.valueOf(n()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            k0 k0Var = (k0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 2) {
                int iT2 = t();
                D(iT2);
                int i13 = this.f10463c + iT2;
                while (this.f10463c < i13) {
                    k0Var.addInt(n());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                k0Var.addInt(readSFixed32());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public long readSFixed64() throws IOException {
            y(1);
            return o();
        }

        @Override // com.explorestack.protobuf.y1
        public void readSFixed64List(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof u0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(readSFixed64()));
                        if (i()) {
                            return;
                        } else {
                            i10 = this.f10463c;
                        }
                    } while (t() == this.f10466f);
                    this.f10463c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT = t();
                E(iT);
                int i12 = this.f10463c + iT;
                while (this.f10463c < i12) {
                    list.add(Long.valueOf(p()));
                }
                return;
            }
            u0 u0Var = (u0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 1) {
                do {
                    u0Var.addLong(readSFixed64());
                    if (i()) {
                        return;
                    } else {
                        i11 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iT2 = t();
            E(iT2);
            int i13 = this.f10463c + iT2;
            while (this.f10463c < i13) {
                u0Var.addLong(p());
            }
        }

        @Override // com.explorestack.protobuf.y1
        public int readSInt32() throws IOException {
            y(0);
            return n.b(t());
        }

        @Override // com.explorestack.protobuf.y1
        public void readSInt32List(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof k0)) {
                int iB = c3.b(this.f10466f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iT = this.f10463c + t();
                    while (this.f10463c < iT) {
                        list.add(Integer.valueOf(n.b(t())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readSInt32()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            k0 k0Var = (k0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT2 = this.f10463c + t();
                while (this.f10463c < iT2) {
                    k0Var.addInt(n.b(t()));
                }
                return;
            }
            do {
                k0Var.addInt(readSInt32());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public long readSInt64() throws IOException {
            y(0);
            return n.c(u());
        }

        @Override // com.explorestack.protobuf.y1
        public void readSInt64List(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof u0)) {
                int iB = c3.b(this.f10466f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iT = this.f10463c + t();
                    while (this.f10463c < iT) {
                        list.add(Long.valueOf(n.c(u())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(readSInt64()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            u0 u0Var = (u0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT2 = this.f10463c + t();
                while (this.f10463c < iT2) {
                    u0Var.addLong(n.c(u()));
                }
                return;
            }
            do {
                u0Var.addLong(readSInt64());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public String readString() throws IOException {
            return r(false);
        }

        @Override // com.explorestack.protobuf.y1
        public void readStringList(List<String> list) throws IOException {
            s(list, false);
        }

        @Override // com.explorestack.protobuf.y1
        public void readStringListRequireUtf8(List<String> list) throws IOException {
            s(list, true);
        }

        @Override // com.explorestack.protobuf.y1
        public String readStringRequireUtf8() throws IOException {
            return r(true);
        }

        @Override // com.explorestack.protobuf.y1
        public int readUInt32() throws IOException {
            y(0);
            return t();
        }

        @Override // com.explorestack.protobuf.y1
        public void readUInt32List(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof k0)) {
                int iB = c3.b(this.f10466f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iT = this.f10463c + t();
                    while (this.f10463c < iT) {
                        list.add(Integer.valueOf(t()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(readUInt32()));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            k0 k0Var = (k0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT2 = this.f10463c + t();
                while (this.f10463c < iT2) {
                    k0Var.addInt(t());
                }
                return;
            }
            do {
                k0Var.addInt(readUInt32());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public long readUInt64() throws IOException {
            y(0);
            return u();
        }

        @Override // com.explorestack.protobuf.y1
        public void readUInt64List(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof u0)) {
                int iB = c3.b(this.f10466f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(readUInt64()));
                        if (i()) {
                            return;
                        } else {
                            i10 = this.f10463c;
                        }
                    } while (t() == this.f10466f);
                    this.f10463c = i10;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iT = this.f10463c + t();
                while (this.f10463c < iT) {
                    list.add(Long.valueOf(u()));
                }
                x(iT);
                return;
            }
            u0 u0Var = (u0) list;
            int iB2 = c3.b(this.f10466f);
            if (iB2 == 0) {
                do {
                    u0Var.addLong(readUInt64());
                    if (i()) {
                        return;
                    } else {
                        i11 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i11;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iT2 = this.f10463c + t();
            while (this.f10463c < iT2) {
                u0Var.addLong(u());
            }
            x(iT2);
        }

        public void s(List<String> list, boolean z10) throws IOException {
            int i10;
            int i11;
            if (c3.b(this.f10466f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof r0) || z10) {
                do {
                    list.add(r(z10));
                    if (i()) {
                        return;
                    } else {
                        i10 = this.f10463c;
                    }
                } while (t() == this.f10466f);
                this.f10463c = i10;
                return;
            }
            r0 r0Var = (r0) list;
            do {
                r0Var.b(readBytes());
                if (i()) {
                    return;
                } else {
                    i11 = this.f10463c;
                }
            } while (t() == this.f10466f);
            this.f10463c = i11;
        }

        @Override // com.explorestack.protobuf.y1
        public boolean skipField() throws IOException {
            int i10;
            if (i() || (i10 = this.f10466f) == this.f10467g) {
                return false;
            }
            int iB = c3.b(i10);
            if (iB == 0) {
                B();
                return true;
            }
            if (iB == 1) {
                z(8);
                return true;
            }
            if (iB == 2) {
                z(t());
                return true;
            }
            if (iB == 3) {
                A();
                return true;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            z(4);
            return true;
        }

        public long u() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f10463c;
            int i12 = this.f10465e;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f10462b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f10463c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return v();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 >= 0) {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i14 = i16;
                    j10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        long j13 = i18;
                        int i19 = i14 + 1;
                        long j14 = j13 ^ (((long) bArr[i14]) << 28);
                        if (j14 >= 0) {
                            j12 = 266354560;
                        } else {
                            i14 = i19 + 1;
                            long j15 = j14 ^ (((long) bArr[i19]) << 35);
                            if (j15 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i19 = i14 + 1;
                                j14 = j15 ^ (((long) bArr[i14]) << 42);
                                if (j14 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i14 = i19 + 1;
                                    j15 = j14 ^ (((long) bArr[i19]) << 49);
                                    if (j15 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        int i20 = i14 + 1;
                                        long j16 = (j15 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                        if (j16 < 0) {
                                            i14 = i20 + 1;
                                            if (bArr[i20] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        j10 = j16;
                                    }
                                }
                            }
                            j10 = j15 ^ j11;
                        }
                        j10 = j14 ^ j12;
                        i14 = i19;
                    }
                }
                this.f10463c = i14;
                return j10;
            }
            i10 = i15 ^ (-128);
            j10 = i10;
            this.f10463c = i14;
            return j10;
        }

        private Object k(c3.b bVar, Class<?> cls, y yVar) throws IOException {
            switch (a.f10460a[bVar.ordinal()]) {
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
                    throw new RuntimeException(elEbP.kQE);
            }
        }
    }

    private h() {
    }

    /* synthetic */ h(a aVar) {
        this();
    }

    public static h h(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // com.explorestack.protobuf.y1
    public boolean shouldDiscardUnknownFields() {
        return false;
    }
}
