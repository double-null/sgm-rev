package z7;

import java.util.ArrayList;
import x7.l0;

/* JADX INFO: compiled from: BaseDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<o> f28996b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f28998d;

    protected a(boolean z10) {
        this.f28995a = z10;
    }

    @Override // z7.d
    public final void a(o oVar) {
        x7.a.e(oVar);
        if (this.f28996b.contains(oVar)) {
            return;
        }
        this.f28996b.add(oVar);
        this.f28997c++;
    }

    protected final void o(int i10) {
        g gVar = (g) l0.i(this.f28998d);
        for (int i11 = 0; i11 < this.f28997c; i11++) {
            this.f28996b.get(i11).b(this, gVar, this.f28995a, i10);
        }
    }

    protected final void p() {
        g gVar = (g) l0.i(this.f28998d);
        for (int i10 = 0; i10 < this.f28997c; i10++) {
            this.f28996b.get(i10).h(this, gVar, this.f28995a);
        }
        this.f28998d = null;
    }

    protected final void q(g gVar) {
        for (int i10 = 0; i10 < this.f28997c; i10++) {
            this.f28996b.get(i10).f(this, gVar, this.f28995a);
        }
    }

    protected final void r(g gVar) {
        this.f28998d = gVar;
        for (int i10 = 0; i10 < this.f28997c; i10++) {
            this.f28996b.get(i10).i(this, gVar, this.f28995a);
        }
    }
}
