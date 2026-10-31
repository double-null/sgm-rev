package p9;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.nio.ByteBuffer;
import java.util.UUID;
import x7.a0;

/* JADX INFO: compiled from: PsshAtomUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: compiled from: PsshAtomUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f23655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f23657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID[] f23658d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f23655a = uuid;
            this.f23656b = i10;
            this.f23657c = bArr;
            this.f23658d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        a0 a0Var = new a0(bArr);
        if (a0Var.g() < 32) {
            return null;
        }
        a0Var.W(0);
        int iA = a0Var.a();
        int iQ = a0Var.q();
        if (iQ != iA) {
            x7.r.h("PsshAtomUtil", "Advertised atom size (" + iQ + ") does not match buffer size: " + iA);
            return null;
        }
        int iQ2 = a0Var.q();
        if (iQ2 != 1886614376) {
            x7.r.h("PsshAtomUtil", "Atom type is not pssh: " + iQ2);
            return null;
        }
        int iP = b.p(a0Var.q());
        if (iP > 1) {
            x7.r.h("PsshAtomUtil", "Unsupported pssh version: " + iP);
            return null;
        }
        UUID uuid = new UUID(a0Var.A(), a0Var.A());
        if (iP == 1) {
            int iL = a0Var.L();
            uuidArr = new UUID[iL];
            for (int i10 = 0; i10 < iL; i10++) {
                uuidArr[i10] = new UUID(a0Var.A(), a0Var.A());
            }
        } else {
            uuidArr = null;
        }
        int iL2 = a0Var.L();
        int iA2 = a0Var.a();
        if (iL2 == iA2) {
            byte[] bArr2 = new byte[iL2];
            a0Var.l(bArr2, 0, iL2);
            return new a(uuid, iP, bArr2, uuidArr);
        }
        x7.r.h("PsshAtomUtil", "Atom data size (" + iL2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f23655a)) {
            return aVarD.f23657c;
        }
        x7.r.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f23655a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f23655a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f23656b;
    }
}
