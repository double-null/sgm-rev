package q9;

import com.google.common.collect.u;
import io.bidmachine.media3.common.ParserException;
import java.util.Arrays;
import java.util.List;
import u7.q;
import u7.v;
import v8.h0;
import v8.r0;
import x7.a0;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f24655o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f24656p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24657n;

    h() {
    }

    private static boolean n(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int iF = a0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.l(bArr2, 0, bArr.length);
        a0Var.W(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(a0 a0Var) {
        return n(a0Var, f24655o);
    }

    @Override // q9.i
    protected long f(a0 a0Var) {
        return c(h0.e(a0Var.e()));
    }

    @Override // q9.i
    protected boolean i(a0 a0Var, long j10, i.b bVar) throws ParserException {
        if (n(a0Var, f24655o)) {
            byte[] bArrCopyOf = Arrays.copyOf(a0Var.e(), a0Var.g());
            int iC = h0.c(bArrCopyOf);
            List<byte[]> listA = h0.a(bArrCopyOf);
            if (bVar.f24671a != null) {
                return true;
            }
            bVar.f24671a = new q.b().U("audio/ogg").u0("audio/opus").R(iC).v0(48000).g0(listA).N();
            return true;
        }
        byte[] bArr = f24656p;
        if (!n(a0Var, bArr)) {
            x7.a.i(bVar.f24671a);
            return false;
        }
        x7.a.i(bVar.f24671a);
        if (this.f24657n) {
            return true;
        }
        this.f24657n = true;
        a0Var.X(bArr.length);
        v vVarD = r0.d(u.D(r0.k(a0Var, false, false).f27419b));
        if (vVarD == null) {
            return true;
        }
        bVar.f24671a = bVar.f24671a.b().n0(vVarD.b(bVar.f24671a.f26249l)).N();
        return true;
    }

    @Override // q9.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f24657n = false;
        }
    }
}
