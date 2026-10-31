package s9;

import java.io.EOFException;
import java.io.IOException;
import u7.w;
import v8.o0;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: SubtitleTranscodingTrackOutput.java */
/* JADX INFO: loaded from: classes4.dex */
final class u implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f25354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f25355b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f25361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u7.q f25362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25363j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f25356c = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25358e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25359f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f25360g = l0.f28141f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f25357d = new a0();

    public u(o0 o0Var, r.a aVar) {
        this.f25354a = o0Var;
        this.f25355b = aVar;
    }

    private void i(int i10) {
        int length = this.f25360g.length;
        int i11 = this.f25359f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f25358e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f25360g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f25358e, bArr2, 0, i12);
        this.f25358e = 0;
        this.f25359f = i12;
        this.f25360g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void j(e eVar, long j10, int i10) {
        x7.a.i(this.f25362i);
        byte[] bArrA = this.f25356c.a(eVar.f25316a, eVar.f25318c);
        this.f25357d.T(bArrA);
        this.f25354a.b(this.f25357d, bArrA.length);
        long j11 = eVar.f25317b;
        if (j11 == -9223372036854775807L) {
            x7.a.g(this.f25362i.f26257t == Long.MAX_VALUE);
        } else {
            long j12 = this.f25362i.f26257t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f25354a.f(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // v8.o0
    public void a(u7.q qVar) {
        x7.a.e(qVar.f26252o);
        x7.a.a(w.k(qVar.f26252o) == 3);
        if (!qVar.equals(this.f25362i)) {
            this.f25362i = qVar;
            this.f25361h = this.f25355b.a(qVar) ? this.f25355b.c(qVar) : null;
        }
        if (this.f25361h == null) {
            this.f25354a.a(qVar);
        } else {
            this.f25354a.a(qVar.b().u0("application/x-media3-cues").S(qVar.f26252o).y0(Long.MAX_VALUE).W(this.f25355b.b(qVar)).N());
        }
    }

    @Override // v8.o0
    public void d(a0 a0Var, int i10, int i11) {
        if (this.f25361h == null) {
            this.f25354a.d(a0Var, i10, i11);
            return;
        }
        i(i10);
        a0Var.l(this.f25360g, this.f25359f, i10);
        this.f25359f += i10;
    }

    @Override // v8.o0
    public int e(u7.h hVar, int i10, boolean z10, int i11) throws IOException {
        if (this.f25361h == null) {
            return this.f25354a.e(hVar, i10, z10, i11);
        }
        i(i10);
        int i12 = hVar.read(this.f25360g, this.f25359f, i10);
        if (i12 != -1) {
            this.f25359f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // v8.o0
    public void f(final long j10, final int i10, int i11, int i12, o0.a aVar) {
        if (this.f25361h == null) {
            this.f25354a.f(j10, i10, i11, i12, aVar);
            return;
        }
        x7.a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f25359f - i12) - i11;
        try {
            this.f25361h.b(this.f25360g, i13, i11, r.b.b(), new x7.l() { // from class: s9.t
                @Override // x7.l
                public final void accept(Object obj) {
                    this.f25351a.j(j10, i10, (e) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f25363j) {
                throw e10;
            }
            x7.r.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f25358e = i14;
        if (i14 == this.f25359f) {
            this.f25358e = 0;
            this.f25359f = 0;
        }
    }

    public void l(boolean z10) {
        this.f25363j = z10;
    }
}
