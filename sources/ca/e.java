package ca;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.IOException;

/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements v8.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v8.u f5077d = new v8.u() { // from class: ca.d
        @Override // v8.u
        public final v8.p[] g() {
            return e.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f5078a = new f("audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7.a0 f5079b = new x7.a0(Http2.INITIAL_MAX_FRAME_SIZE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5080c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.p[] d() {
        return new v8.p[]{new e()};
    }

    @Override // v8.p
    public void a(long j10, long j11) {
        this.f5080c = false;
        this.f5078a.b();
    }

    @Override // v8.p
    public void c(v8.r rVar) {
        this.f5078a.d(rVar, new l0.d(0, 1));
        rVar.r();
        rVar.h(new v8.j0.b(-9223372036854775807L));
    }

    @Override // v8.p
    public boolean e(v8.q qVar) throws IOException {
        x7.a0 a0Var = new x7.a0(10);
        int i10 = 0;
        while (true) {
            qVar.n(a0Var.e(), 0, 10);
            a0Var.W(0);
            if (a0Var.K() != 4801587) {
                break;
            }
            a0Var.X(3);
            int iG = a0Var.G();
            i10 += iG + 10;
            qVar.g(iG);
        }
        qVar.d();
        qVar.g(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.n(a0Var.e(), 0, 7);
            a0Var.W(0);
            int iP = a0Var.P();
            if (iP == 44096 || iP == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = v8.c.g(a0Var.e(), iP);
                if (iG2 == -1) {
                    return false;
                }
                qVar.g(iG2 - 7);
            } else {
                qVar.d();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.g(i12);
                i11 = 0;
            }
        }
    }

    @Override // v8.p
    public int l(v8.q qVar, v8.i0 i0Var) throws IOException {
        int i10 = qVar.read(this.f5079b.e(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i10 == -1) {
            return -1;
        }
        this.f5079b.W(0);
        this.f5079b.V(i10);
        if (!this.f5080c) {
            this.f5078a.f(0L, 4);
            this.f5080c = true;
        }
        this.f5078a.c(this.f5079b);
        return 0;
    }

    @Override // v8.p
    public void release() {
    }
}
