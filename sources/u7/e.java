package u7;

import java.util.List;

/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d0.c f26051a = new d0.c();

    protected e() {
    }

    private int f0() {
        int iV = V();
        if (iV == 1) {
            return 0;
        }
        return iV;
    }

    private void g0(int i10) {
        i0(-1, -9223372036854775807L, i10, false);
    }

    private void h0(int i10) {
        i0(S(), -9223372036854775807L, i10, true);
    }

    private void j0(long j10, int i10) {
        i0(S(), j10, i10, false);
    }

    private void k0(int i10, int i11) {
        i0(i10, -9223372036854775807L, i11, false);
    }

    private void l0(int i10) {
        int iD0 = d0();
        if (iD0 == -1) {
            g0(i10);
        } else if (iD0 == S()) {
            h0(i10);
        } else {
            k0(iD0, i10);
        }
    }

    private void m0(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        j0(Math.max(currentPosition, 0L), i10);
    }

    private void n0(int i10) {
        int iE0 = e0();
        if (iE0 == -1) {
            g0(i10);
        } else if (iE0 == S()) {
            h0(i10);
        } else {
            k0(iE0, i10);
        }
    }

    @Override // u7.y
    public final void B(int i10, long j10) {
        i0(i10, j10, 10, false);
    }

    @Override // u7.y
    public final long G() {
        d0 d0VarU = u();
        if (d0VarU.q()) {
            return -9223372036854775807L;
        }
        return d0VarU.n(S(), this.f26051a).d();
    }

    @Override // u7.y
    public final void K(s sVar) {
        o0(com.google.common.collect.u.I(sVar));
    }

    @Override // u7.y
    public final boolean L() {
        return e0() != -1;
    }

    @Override // u7.y
    public final void N(long j10) {
        j0(j10, 5);
    }

    @Override // u7.y
    public final boolean Q() {
        d0 d0VarU = u();
        return !d0VarU.q() && d0VarU.n(S(), this.f26051a).f26042h;
    }

    @Override // u7.y
    public final void Y() {
        m0(O(), 12);
    }

    @Override // u7.y
    public final void Z() {
        m0(-b0(), 11);
    }

    @Override // u7.y
    public final boolean c0() {
        d0 d0VarU = u();
        return !d0VarU.q() && d0VarU.n(S(), this.f26051a).f();
    }

    public final int d0() {
        d0 d0VarU = u();
        if (d0VarU.q()) {
            return -1;
        }
        return d0VarU.e(S(), f0(), W());
    }

    public final int e0() {
        d0 d0VarU = u();
        if (d0VarU.q()) {
            return -1;
        }
        return d0VarU.l(S(), f0(), W());
    }

    @Override // u7.y
    public final void f() {
        k0(S(), 4);
    }

    protected abstract void i0(int i10, long j10, int i11, boolean z10);

    @Override // u7.y
    public final boolean isPlaying() {
        return R() == 3 && D() && t() == 0;
    }

    @Override // u7.y
    public final void j() {
        if (u().q() || b()) {
            g0(7);
            return;
        }
        boolean zL = L();
        if (c0() && !Q()) {
            if (zL) {
                n0(7);
                return;
            } else {
                g0(7);
                return;
            }
        }
        if (!zL || getCurrentPosition() > F()) {
            j0(0L, 7);
        } else {
            n0(7);
        }
    }

    @Override // u7.y
    public final void n() {
        l(true);
    }

    @Override // u7.y
    public final boolean o() {
        return d0() != -1;
    }

    public final void o0(List<s> list) {
        g(list, true);
    }

    @Override // u7.y
    public final void pause() {
        l(false);
    }

    @Override // u7.y
    public final boolean r(int i10) {
        return C().b(i10);
    }

    @Override // u7.y
    public final boolean s() {
        d0 d0VarU = u();
        return !d0VarU.q() && d0VarU.n(S(), this.f26051a).f26043i;
    }

    @Override // u7.y
    public final void x() {
        if (u().q() || b()) {
            g0(9);
            return;
        }
        if (o()) {
            l0(9);
        } else if (c0() && s()) {
            k0(S(), 9);
        } else {
            g0(9);
        }
    }
}
