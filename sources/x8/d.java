package x8;

import x7.a0;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: AviStreamHeaderChunk.java */
/* JADX INFO: loaded from: classes4.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28237g;

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f28231a = i10;
        this.f28232b = i11;
        this.f28233c = i12;
        this.f28234d = i13;
        this.f28235e = i14;
        this.f28236f = i15;
        this.f28237g = i16;
    }

    public static d c(a0 a0Var) {
        int iU = a0Var.u();
        a0Var.X(12);
        int iU2 = a0Var.u();
        int iU3 = a0Var.u();
        int iU4 = a0Var.u();
        a0Var.X(4);
        int iU5 = a0Var.u();
        int iU6 = a0Var.u();
        a0Var.X(4);
        return new d(iU, iU2, iU3, iU4, iU5, iU6, a0Var.u());
    }

    public long a() {
        return l0.f1(this.f28235e, ((long) this.f28233c) * 1000000, this.f28234d);
    }

    public int b() {
        int i10 = this.f28231a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        r.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f28231a));
        return -1;
    }

    @Override // x8.a
    public int getType() {
        return 1752331379;
    }
}
