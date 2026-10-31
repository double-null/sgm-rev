package x8;

import x7.a0;

/* JADX INFO: compiled from: AviMainHeaderChunk.java */
/* JADX INFO: loaded from: classes4.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28230d;

    private c(int i10, int i11, int i12, int i13) {
        this.f28227a = i10;
        this.f28228b = i11;
        this.f28229c = i12;
        this.f28230d = i13;
    }

    public static c b(a0 a0Var) {
        int iU = a0Var.u();
        a0Var.X(8);
        int iU2 = a0Var.u();
        int iU3 = a0Var.u();
        a0Var.X(4);
        int iU4 = a0Var.u();
        a0Var.X(12);
        return new c(iU, iU2, iU3, iU4);
    }

    public boolean a() {
        return (this.f28228b & 16) == 16;
    }

    @Override // x8.a
    public int getType() {
        return 1751742049;
    }
}
