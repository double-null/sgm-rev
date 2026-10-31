package s9;

import android.util.SparseArray;
import v8.j0;
import v8.o0;

/* JADX INFO: compiled from: SubtitleTranscodingExtractorOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements v8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v8.r f25347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f25348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<u> f25349c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25350d;

    public s(v8.r rVar, r.a aVar) {
        this.f25347a = rVar;
        this.f25348b = aVar;
    }

    @Override // v8.r
    public o0 e(int i10, int i11) {
        if (i11 != 3) {
            this.f25350d = true;
            return this.f25347a.e(i10, i11);
        }
        u uVar = this.f25349c.get(i10);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f25347a.e(i10, i11), this.f25348b);
        this.f25349c.put(i10, uVar2);
        return uVar2;
    }

    @Override // v8.r
    public void h(j0 j0Var) {
        this.f25347a.h(j0Var);
    }

    @Override // v8.r
    public void r() {
        this.f25347a.r();
        if (this.f25350d) {
            for (int i10 = 0; i10 < this.f25349c.size(); i10++) {
                this.f25349c.valueAt(i10).l(true);
            }
        }
    }
}
