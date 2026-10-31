package v8;

import com.facebook.internal.NativeProtocol;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u7.h f27338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27340d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27343g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f27341e = new byte[NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27337a = new byte[4096];

    static {
        u7.t.a("media3.extractor");
    }

    public i(u7.h hVar, long j10, long j11) {
        this.f27338b = hVar;
        this.f27340d = j10;
        this.f27339c = j11;
    }

    private void o(int i10) {
        if (i10 != -1) {
            this.f27340d += (long) i10;
        }
    }

    private void p(int i10) {
        int i11 = this.f27342f + i10;
        byte[] bArr = this.f27341e;
        if (i11 > bArr.length) {
            this.f27341e = Arrays.copyOf(this.f27341e, x7.l0.p(bArr.length * 2, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i11, i11 + 524288));
        }
    }

    private int q(byte[] bArr, int i10, int i11) {
        int i12 = this.f27343g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f27341e, 0, bArr, i10, iMin);
        u(iMin);
        return iMin;
    }

    private int r(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f27338b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int s(int i10) {
        int iMin = Math.min(this.f27343g, i10);
        u(iMin);
        return iMin;
    }

    private void u(int i10) {
        int i11 = this.f27343g - i10;
        this.f27343g = i11;
        this.f27342f = 0;
        byte[] bArr = this.f27341e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f27341e = bArr2;
    }

    @Override // v8.q
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!l(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f27341e, this.f27342f - i11, bArr, i10, i11);
        return true;
    }

    @Override // v8.q
    public void d() {
        this.f27342f = 0;
    }

    @Override // v8.q
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iQ = q(bArr, i10, i11);
        while (iQ < i11 && iQ != -1) {
            iQ = r(bArr, i10, i11, iQ, z10);
        }
        o(iQ);
        return iQ != -1;
    }

    @Override // v8.q
    public long f() {
        return this.f27340d + ((long) this.f27342f);
    }

    @Override // v8.q
    public void g(int i10) throws IOException {
        l(i10, false);
    }

    @Override // v8.q
    public long getLength() {
        return this.f27339c;
    }

    @Override // v8.q
    public long getPosition() {
        return this.f27340d;
    }

    @Override // v8.q
    public int h(int i10) throws IOException {
        int iS = s(i10);
        if (iS == 0) {
            byte[] bArr = this.f27337a;
            iS = r(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        o(iS);
        return iS;
    }

    @Override // v8.q
    public int j(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        p(i11);
        int i12 = this.f27343g;
        int i13 = this.f27342f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            iMin = r(this.f27341e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f27343g += iMin;
        } else {
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(this.f27341e, this.f27342f, bArr, i10, iMin);
        this.f27342f += iMin;
        return iMin;
    }

    @Override // v8.q
    public void k(int i10) throws IOException {
        t(i10, false);
    }

    @Override // v8.q
    public boolean l(int i10, boolean z10) throws IOException {
        p(i10);
        int iR = this.f27343g - this.f27342f;
        while (iR < i10) {
            iR = r(this.f27341e, this.f27342f, i10, iR, z10);
            if (iR == -1) {
                return false;
            }
            this.f27343g = this.f27342f + iR;
        }
        this.f27342f += i10;
        return true;
    }

    @Override // v8.q
    public void n(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    @Override // v8.q, u7.h
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iQ = q(bArr, i10, i11);
        if (iQ == 0) {
            iQ = r(bArr, i10, i11, 0, true);
        }
        o(iQ);
        return iQ;
    }

    @Override // v8.q
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        e(bArr, i10, i11, false);
    }

    public boolean t(int i10, boolean z10) throws IOException {
        int iS = s(i10);
        while (iS < i10 && iS != -1) {
            iS = r(this.f27337a, -iS, Math.min(i10, this.f27337a.length + iS), iS, z10);
        }
        o(iS);
        return iS != -1;
    }
}
