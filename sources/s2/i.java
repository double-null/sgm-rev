package s2;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Murmur3_128HashFunction.java */
/* JADX INFO: loaded from: classes4.dex */
final class i extends s2.a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e f25198b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final e f25199c = new i(g.f25197a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25200a;

    /* JADX INFO: compiled from: Murmur3_128HashFunction.java */
    private static final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f25201d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f25202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f25203f;

        a(int i10) {
            super(16);
            long j10 = i10;
            this.f25201d = j10;
            this.f25202e = j10;
            this.f25203f = 0;
        }

        private void k(long j10, long j11) {
            long jM = m(j10) ^ this.f25201d;
            this.f25201d = jM;
            long jRotateLeft = Long.rotateLeft(jM, 27);
            long j12 = this.f25202e;
            this.f25201d = ((jRotateLeft + j12) * 5) + 1390208809;
            long jN = n(j11) ^ j12;
            this.f25202e = jN;
            this.f25202e = ((Long.rotateLeft(jN, 31) + this.f25201d) * 5) + 944331445;
        }

        private static long l(long j10) {
            long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
            long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
            return j12 ^ (j12 >>> 33);
        }

        private static long m(long j10) {
            return Long.rotateLeft(j10 * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        private static long n(long j10) {
            return Long.rotateLeft(j10 * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // s2.c
        protected d e() {
            long j10 = this.f25201d;
            int i10 = this.f25203f;
            long j11 = j10 ^ ((long) i10);
            long j12 = this.f25202e ^ ((long) i10);
            long j13 = j11 + j12;
            this.f25201d = j13;
            this.f25202e = j12 + j13;
            this.f25201d = l(j13);
            long jL = l(this.f25202e);
            long j14 = this.f25201d + jL;
            this.f25201d = j14;
            this.f25202e = jL + j14;
            return d.g(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f25201d).putLong(this.f25202e).array());
        }

        @Override // s2.c
        protected void h(ByteBuffer byteBuffer) {
            k(byteBuffer.getLong(), byteBuffer.getLong());
            this.f25203f += 16;
        }

        @Override // s2.c
        protected void i(ByteBuffer byteBuffer) {
            long jB;
            long jB2;
            long jB3;
            long jB4;
            long jB5;
            long jB6;
            long jB7;
            long jB8;
            long jB9;
            long jB10;
            long jB11;
            long jB12;
            long jB13;
            long jB14;
            this.f25203f += byteBuffer.remaining();
            long j10 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jB = 0;
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 2:
                    jB2 = 0;
                    jB = jB2 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(1))) << 8);
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 3:
                    jB3 = 0;
                    jB2 = jB3 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(2))) << 16);
                    jB = jB2 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(1))) << 8);
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 4:
                    jB4 = 0;
                    jB3 = jB4 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(3))) << 24);
                    jB2 = jB3 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(2))) << 16);
                    jB = jB2 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(1))) << 8);
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 5:
                    jB5 = 0;
                    jB4 = jB5 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(3))) << 24);
                    jB2 = jB3 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(2))) << 16);
                    jB = jB2 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(1))) << 8);
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 6:
                    jB6 = 0;
                    jB5 = jB6 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(5))) << 40);
                    jB4 = jB5 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(3))) << 24);
                    jB2 = jB3 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(2))) << 16);
                    jB = jB2 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(1))) << 8);
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 7:
                    jB6 = (((long) com.google.common.primitives.i.b(byteBuffer.get(6))) << 48) ^ 0;
                    jB5 = jB6 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(5))) << 40);
                    jB4 = jB5 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(3))) << 24);
                    jB2 = jB3 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(2))) << 16);
                    jB = jB2 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(1))) << 8);
                    jB7 = ((long) com.google.common.primitives.i.b(byteBuffer.get(0))) ^ jB;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 8:
                    jB8 = 0;
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 9:
                    jB9 = 0;
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 10:
                    jB10 = 0;
                    jB9 = jB10 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(9))) << 8);
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 11:
                    jB11 = 0;
                    jB10 = jB11 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(10))) << 16);
                    jB9 = jB10 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(9))) << 8);
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 12:
                    jB12 = 0;
                    jB11 = jB12 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(11))) << 24);
                    jB10 = jB11 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(10))) << 16);
                    jB9 = jB10 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(9))) << 8);
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 13:
                    jB13 = 0;
                    jB12 = jB13 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(12))) << 32);
                    jB11 = jB12 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(11))) << 24);
                    jB10 = jB11 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(10))) << 16);
                    jB9 = jB10 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(9))) << 8);
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 14:
                    jB14 = 0;
                    jB13 = jB14 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(13))) << 40);
                    jB12 = jB13 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(12))) << 32);
                    jB11 = jB12 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(11))) << 24);
                    jB10 = jB11 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(10))) << 16);
                    jB9 = jB10 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(9))) << 8);
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                case 15:
                    jB14 = (((long) com.google.common.primitives.i.b(byteBuffer.get(14))) << 48) ^ 0;
                    jB13 = jB14 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(13))) << 40);
                    jB12 = jB13 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(12))) << 32);
                    jB11 = jB12 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(11))) << 24);
                    jB10 = jB11 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(10))) << 16);
                    jB9 = jB10 ^ (((long) com.google.common.primitives.i.b(byteBuffer.get(9))) << 8);
                    jB8 = jB9 ^ ((long) com.google.common.primitives.i.b(byteBuffer.get(8)));
                    jB7 = byteBuffer.getLong() ^ 0;
                    j10 = jB8;
                    this.f25201d ^= m(jB7);
                    this.f25202e ^= n(j10);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    i(int i10) {
        this.f25200a = i10;
    }

    @Override // s2.e
    public f b() {
        return new a(this.f25200a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f25200a == ((i) obj).f25200a;
    }

    public int hashCode() {
        return i.class.hashCode() ^ this.f25200a;
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f25200a + ")";
    }
}
