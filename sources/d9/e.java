package d9;

import v8.a0;
import v8.j0;
import v8.k0;
import v8.o0;
import v8.r;

/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f13435b;

    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f13436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var, j0 j0Var2) {
            super(j0Var);
            this.f13436b = j0Var2;
        }

        @Override // v8.a0, v8.j0
        public j0.a d(long j10) {
            j0.a aVarD = this.f13436b.d(j10);
            k0 k0Var = aVarD.f27345a;
            k0 k0Var2 = new k0(k0Var.f27350a, k0Var.f27351b + e.this.f13434a);
            k0 k0Var3 = aVarD.f27346b;
            return new j0.a(k0Var2, new k0(k0Var3.f27350a, k0Var3.f27351b + e.this.f13434a));
        }
    }

    public e(long j10, r rVar) {
        this.f13434a = j10;
        this.f13435b = rVar;
    }

    @Override // v8.r
    public o0 e(int i10, int i11) {
        return this.f13435b.e(i10, i11);
    }

    @Override // v8.r
    public void h(j0 j0Var) {
        this.f13435b.h(new a(j0Var, j0Var));
    }

    @Override // v8.r
    public void r() {
        this.f13435b.r();
    }
}
