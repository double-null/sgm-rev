package af;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f414g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(byte[][] segments, int[] directory) {
        super(h.f362e.h());
        kotlin.jvm.internal.t.f(segments, "segments");
        kotlin.jvm.internal.t.f(directory, "directory");
        this.f413f = segments;
        this.f414g = directory;
    }

    private final h a0() {
        return new h(Y());
    }

    private final Object writeReplace() {
        h hVarA0 = a0();
        kotlin.jvm.internal.t.d(hVarA0, "null cannot be cast to non-null type java.lang.Object");
        return hVarA0;
    }

    @Override // af.h
    public h H() {
        return a0().H();
    }

    @Override // af.h
    public void K(e buffer, int i10, int i11) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = bf.c.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : N()[iB - 1];
            int i14 = N()[iB] - i13;
            int i15 = N()[U().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            x xVar = new x(U()[iB], i16, i16 + iMin, true, false);
            x xVar2 = buffer.f352a;
            if (xVar2 == null) {
                xVar.f407g = xVar;
                xVar.f406f = xVar;
                buffer.f352a = xVar;
            } else {
                kotlin.jvm.internal.t.c(xVar2);
                x xVar3 = xVar2.f407g;
                kotlin.jvm.internal.t.c(xVar3);
                xVar3.c(xVar);
            }
            i10 += iMin;
            iB++;
        }
        buffer.z(buffer.size() + ((long) i11));
    }

    public final int[] N() {
        return this.f414g;
    }

    public final byte[][] U() {
        return this.f413f;
    }

    public byte[] Y() {
        byte[] bArr = new byte[F()];
        int length = U().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = N()[length + i10];
            int i14 = N()[i10];
            int i15 = i14 - i11;
            kotlin.collections.m.d(U()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // af.h
    public String b() {
        return a0().b();
    }

    @Override // af.h
    public h e(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = U().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = N()[length + i10];
            int i13 = N()[i10];
            messageDigest.update(U()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.t.e(digestBytes, "digestBytes");
        return new h(digestBytes);
    }

    @Override // af.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.F() == F() && w(0, hVar, 0, F())) {
                return true;
            }
        }
        return false;
    }

    @Override // af.h
    public int hashCode() {
        int iK = k();
        if (iK != 0) {
            return iK;
        }
        int length = U().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = N()[length + i10];
            int i14 = N()[i10];
            byte[] bArr = U()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        z(i11);
        return i11;
    }

    @Override // af.h
    public int n() {
        return N()[U().length - 1];
    }

    @Override // af.h
    public String p() {
        return a0().p();
    }

    @Override // af.h
    public byte[] s() {
        return Y();
    }

    @Override // af.h
    public byte t(int i10) {
        b.b(N()[U().length - 1], i10, 1L);
        int iB = bf.c.b(this, i10);
        return U()[iB][(i10 - (iB == 0 ? 0 : N()[iB - 1])) + N()[U().length + iB]];
    }

    @Override // af.h
    public String toString() {
        return a0().toString();
    }

    @Override // af.h
    public boolean w(int i10, h other, int i11, int i12) {
        kotlin.jvm.internal.t.f(other, "other");
        if (i10 < 0 || i10 > F() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = bf.c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : N()[iB - 1];
            int i15 = N()[iB] - i14;
            int i16 = N()[U().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.x(i11, U()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // af.h
    public boolean x(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.t.f(other, "other");
        if (i10 < 0 || i10 > F() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = bf.c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : N()[iB - 1];
            int i15 = N()[iB] - i14;
            int i16 = N()[U().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!b.a(U()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }
}
