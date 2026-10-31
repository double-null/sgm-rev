package s2;

import com.google.common.base.p;
import java.io.Serializable;

/* JADX INFO: compiled from: HashCode.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f25195a = "0123456789abcdef".toCharArray();

    /* JADX INFO: compiled from: HashCode.java */
    private static final class a extends d implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f25196b;

        a(byte[] bArr) {
            this.f25196b = (byte[]) p.l(bArr);
        }

        @Override // s2.d
        public byte[] b() {
            return (byte[]) this.f25196b.clone();
        }

        @Override // s2.d
        public int c() {
            byte[] bArr = this.f25196b;
            p.t(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f25196b;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // s2.d
        public int e() {
            return this.f25196b.length * 8;
        }

        @Override // s2.d
        boolean f(d dVar) {
            if (this.f25196b.length != dVar.h().length) {
                return false;
            }
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f25196b;
                if (i10 >= bArr.length) {
                    return z10;
                }
                z10 &= bArr[i10] == dVar.h()[i10];
                i10++;
            }
        }

        @Override // s2.d
        byte[] h() {
            return this.f25196b;
        }
    }

    d() {
    }

    static d g(byte[] bArr) {
        return new a(bArr);
    }

    public abstract byte[] b();

    public abstract int c();

    public abstract int e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e() == dVar.e() && f(dVar);
    }

    abstract boolean f(d dVar);

    byte[] h() {
        return b();
    }

    public final int hashCode() {
        if (e() >= 32) {
            return c();
        }
        byte[] bArrH = h();
        int i10 = bArrH[0] & 255;
        for (int i11 = 1; i11 < bArrH.length; i11++) {
            i10 |= (bArrH[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArrH = h();
        StringBuilder sb2 = new StringBuilder(bArrH.length * 2);
        for (byte b10 : bArrH) {
            char[] cArr = f25195a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
