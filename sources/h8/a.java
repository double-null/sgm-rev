package h8;

import ca.k0;
import java.io.IOException;
import s9.r;
import u7.q;
import v8.i0;
import v8.p;
import x7.g0;

/* JADX INFO: compiled from: BundledHlsMediaChunkExtractor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i0 f15712f = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p f15713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f15714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f15715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r.a f15716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15717e;

    a(p pVar, q qVar, g0 g0Var, r.a aVar, boolean z10) {
        this.f15713a = pVar;
        this.f15714b = qVar;
        this.f15715c = g0Var;
        this.f15716d = aVar;
        this.f15717e = z10;
    }

    @Override // h8.f
    public boolean a(v8.q qVar) throws IOException {
        return this.f15713a.l(qVar, f15712f) == 0;
    }

    @Override // h8.f
    public void c(v8.r rVar) {
        this.f15713a.c(rVar);
    }

    @Override // h8.f
    public void d() {
        this.f15713a.a(0L, 0L);
    }

    @Override // h8.f
    public boolean e() {
        p pVarF = this.f15713a.f();
        return (pVarF instanceof k0) || (pVarF instanceof p9.h);
    }

    @Override // h8.f
    public boolean f() {
        p pVarF = this.f15713a.f();
        return (pVarF instanceof ca.h) || (pVarF instanceof ca.b) || (pVarF instanceof ca.e) || (pVarF instanceof o9.f);
    }

    @Override // h8.f
    public f g() {
        p fVar;
        x7.a.g(!e());
        x7.a.h(this.f15713a.f() == this.f15713a, "Can't recreate wrapped extractors. Outer type: " + this.f15713a.getClass());
        p pVar = this.f15713a;
        if (pVar instanceof j) {
            fVar = new j(this.f15714b.f26241d, this.f15715c, this.f15716d, this.f15717e);
        } else if (pVar instanceof ca.h) {
            fVar = new ca.h();
        } else if (pVar instanceof ca.b) {
            fVar = new ca.b();
        } else if (pVar instanceof ca.e) {
            fVar = new ca.e();
        } else {
            if (!(pVar instanceof o9.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f15713a.getClass().getSimpleName());
            }
            fVar = new o9.f();
        }
        return new a(fVar, this.f15714b, this.f15715c, this.f15716d, this.f15717e);
    }
}
