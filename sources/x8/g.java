package x8;

import com.google.common.collect.u;
import u7.q;
import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: StreamFormatChunk.java */
/* JADX INFO: loaded from: classes4.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f28254a;

    public g(q qVar) {
        this.f28254a = qVar;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(a0 a0Var) {
        a0Var.X(4);
        int iU = a0Var.u();
        int iU2 = a0Var.u();
        a0Var.X(4);
        int iU3 = a0Var.u();
        String strA = a(iU3);
        if (strA != null) {
            q.b bVar = new q.b();
            bVar.B0(iU).d0(iU2).u0(strA);
            return new g(bVar.N());
        }
        r.h("StreamFormatChunk", "Ignoring track with unsupported compression " + iU3);
        return null;
    }

    public static a d(int i10, a0 a0Var) {
        if (i10 == 2) {
            return c(a0Var);
        }
        if (i10 == 1) {
            return e(a0Var);
        }
        r.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + l0.t0(i10));
        return null;
    }

    private static a e(a0 a0Var) {
        int iZ = a0Var.z();
        String strB = b(iZ);
        if (strB == null) {
            r.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZ);
            return null;
        }
        int iZ2 = a0Var.z();
        int iU = a0Var.u();
        a0Var.X(6);
        int iI0 = l0.i0(a0Var.z());
        int iZ3 = a0Var.a() > 0 ? a0Var.z() : 0;
        q.b bVar = new q.b();
        bVar.u0(strB).R(iZ2).v0(iU);
        if (strB.equals("audio/raw") && iI0 != 0) {
            bVar.o0(iI0);
        }
        if (strB.equals("audio/mp4a-latm") && iZ3 > 0) {
            byte[] bArr = new byte[iZ3];
            a0Var.l(bArr, 0, iZ3);
            bVar.g0(u.I(bArr));
        }
        return new g(bVar.N());
    }

    @Override // x8.a
    public int getType() {
        return 1718776947;
    }
}
