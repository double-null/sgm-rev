package ke;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 writer, boolean z10) {
        super(writer);
        kotlin.jvm.internal.t.f(writer, "writer");
        this.f21319c = z10;
    }

    @Override // ke.s
    public void e(byte b10) {
        boolean z10 = this.f21319c;
        String strE = wc.x.e(wc.x.b(b10));
        if (z10) {
            n(strE);
        } else {
            k(strE);
        }
    }

    @Override // ke.s
    public void i(int i10) {
        boolean z10 = this.f21319c;
        int iB = wc.z.b(i10);
        if (z10) {
            n(Long.toString(((long) iB) & 4294967295L, 10));
        } else {
            k(Long.toString(((long) iB) & 4294967295L, 10));
        }
    }

    @Override // ke.s
    public void j(long j10) {
        boolean z10 = this.f21319c;
        long jB = wc.b0.b(j10);
        if (z10) {
            n(z.a(jB, 10));
        } else {
            k(y.a(jB, 10));
        }
    }

    @Override // ke.s
    public void l(short s10) {
        boolean z10 = this.f21319c;
        String strE = wc.e0.e(wc.e0.b(s10));
        if (z10) {
            n(strE);
        } else {
            k(strE);
        }
    }
}
