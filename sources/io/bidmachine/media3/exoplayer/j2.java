package io.bidmachine.media3.exoplayer;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: RendererHolder.java */
/* JADX INFO: loaded from: classes4.dex */
class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2 f19111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h2 f19113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19114d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19115e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19116f = false;

    public j2(h2 h2Var, h2 h2Var2, int i10) {
        this.f19111a = h2Var;
        this.f19112b = i10;
        this.f19113c = h2Var2;
    }

    private boolean A() {
        return this.f19114d == 3;
    }

    private void C(h2 h2Var, n8.s sVar, k kVar, long j10, boolean z10) throws ExoPlaybackException {
        if (y(h2Var)) {
            if (sVar != h2Var.j()) {
                d(h2Var, kVar);
            } else if (z10) {
                h2Var.Q(j10);
            }
        }
    }

    private void E(boolean z10) {
        if (z10) {
            if (this.f19115e) {
                this.f19111a.reset();
                this.f19115e = false;
                return;
            }
            return;
        }
        if (this.f19116f) {
            ((h2) x7.a.e(this.f19113c)).reset();
            this.f19116f = false;
        }
    }

    private int K(h2 h2Var, l1 l1Var, q8.w wVar, k kVar) throws ExoPlaybackException {
        if (h2Var == null || !y(h2Var) || ((h2Var == this.f19111a && v()) || (h2Var == this.f19113c && A()))) {
            return 1;
        }
        n8.s sVarJ = h2Var.j();
        n8.s[] sVarArr = l1Var.f19146c;
        int i10 = this.f19112b;
        boolean z10 = sVarJ != sVarArr[i10];
        boolean zC = wVar.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!h2Var.D()) {
            h2Var.O(i(wVar.f24613c[this.f19112b]), (n8.s) x7.a.e(l1Var.f19146c[this.f19112b]), l1Var.n(), l1Var.m(), l1Var.f19151h.f19165a);
            return 3;
        }
        if (!h2Var.b()) {
            return 0;
        }
        d(h2Var, kVar);
        if (!zC || u()) {
            E(h2Var == this.f19111a);
        }
        return 1;
    }

    private void P(h2 h2Var, long j10) {
        h2Var.q();
        if (h2Var instanceof p8.i) {
            ((p8.i) h2Var).J0(j10);
        }
    }

    private void X(boolean z10) throws ExoPlaybackException {
        if (z10) {
            ((h2) x7.a.e(this.f19113c)).z(17, this.f19111a);
        } else {
            this.f19111a.z(17, x7.a.e(this.f19113c));
        }
    }

    private void d(h2 h2Var, k kVar) {
        x7.a.g(this.f19111a == h2Var || this.f19113c == h2Var);
        if (y(h2Var)) {
            kVar.a(h2Var);
            g(h2Var);
            h2Var.d();
        }
    }

    private void g(h2 h2Var) {
        if (h2Var.k() == 2) {
            h2Var.stop();
        }
    }

    private static u7.q[] i(q8.q qVar) {
        int length = qVar != null ? qVar.length() : 0;
        u7.q[] qVarArr = new u7.q[length];
        for (int i10 = 0; i10 < length; i10++) {
            qVarArr[i10] = ((q8.q) x7.a.e(qVar)).e(i10);
        }
        return qVarArr;
    }

    private h2 l(l1 l1Var) {
        if (l1Var != null && l1Var.f19146c[this.f19112b] != null) {
            if (this.f19111a.j() == l1Var.f19146c[this.f19112b]) {
                return this.f19111a;
            }
            h2 h2Var = this.f19113c;
            if (h2Var != null && h2Var.j() == l1Var.f19146c[this.f19112b]) {
                return this.f19113c;
            }
        }
        return null;
    }

    private boolean p(l1 l1Var, h2 h2Var) {
        if (h2Var == null) {
            return true;
        }
        n8.s sVar = l1Var.f19146c[this.f19112b];
        if (h2Var.j() == null) {
            return true;
        }
        if (h2Var.j() == sVar && (sVar == null || h2Var.n() || q(h2Var, l1Var))) {
            return true;
        }
        l1 l1VarK = l1Var.k();
        return l1VarK != null && l1VarK.f19146c[this.f19112b] == h2Var.j();
    }

    private boolean q(h2 h2Var, l1 l1Var) {
        l1 l1VarK = l1Var.k();
        return l1Var.f19151h.f19171g && l1VarK != null && l1VarK.f19149f && ((h2Var instanceof p8.i) || (h2Var instanceof l8.c) || h2Var.P() >= l1VarK.n());
    }

    private boolean v() {
        int i10 = this.f19114d;
        return i10 == 2 || i10 == 4;
    }

    private static boolean y(h2 h2Var) {
        return h2Var.k() != 0;
    }

    public void B(n8.s sVar, k kVar, long j10, boolean z10) throws ExoPlaybackException {
        C(this.f19111a, sVar, kVar, j10, z10);
        h2 h2Var = this.f19113c;
        if (h2Var != null) {
            C(h2Var, sVar, kVar, j10, z10);
        }
    }

    public void D() throws ExoPlaybackException {
        int i10 = this.f19114d;
        if (i10 == 3 || i10 == 4) {
            X(i10 == 4);
            this.f19114d = this.f19114d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f19114d = 0;
        }
    }

    public void F(q8.w wVar, q8.w wVar2, long j10) {
        int i10;
        boolean zC = wVar.c(this.f19112b);
        boolean zC2 = wVar2.c(this.f19112b);
        h2 h2Var = this.f19113c == null || (i10 = this.f19114d) == 3 || (i10 == 0 && y(this.f19111a)) ? this.f19111a : (h2) x7.a.e(this.f19113c);
        if (!zC || h2Var.D()) {
            return;
        }
        boolean z10 = m() == -2;
        b8.y[] yVarArr = wVar.f24612b;
        int i11 = this.f19112b;
        b8.y yVar = yVarArr[i11];
        b8.y yVar2 = wVar2.f24612b[i11];
        if (!zC2 || !Objects.equals(yVar2, yVar) || z10 || u()) {
            P(h2Var, j10);
        }
    }

    public void G(l1 l1Var) throws IOException {
        ((h2) x7.a.e(l(l1Var))).A();
    }

    public void H() {
        this.f19111a.release();
        this.f19115e = false;
        h2 h2Var = this.f19113c;
        if (h2Var != null) {
            h2Var.release();
            this.f19116f = false;
        }
    }

    public void I(long j10, long j11) throws ExoPlaybackException {
        if (y(this.f19111a)) {
            this.f19111a.i(j10, j11);
        }
        h2 h2Var = this.f19113c;
        if (h2Var == null || !y(h2Var)) {
            return;
        }
        this.f19113c.i(j10, j11);
    }

    public int J(l1 l1Var, q8.w wVar, k kVar) throws ExoPlaybackException {
        int iK = K(this.f19111a, l1Var, wVar, kVar);
        return iK == 1 ? K(this.f19113c, l1Var, wVar, kVar) : iK;
    }

    public void L() {
        if (!y(this.f19111a)) {
            E(true);
        }
        h2 h2Var = this.f19113c;
        if (h2Var == null || y(h2Var)) {
            return;
        }
        E(false);
    }

    public void M(l1 l1Var, long j10) throws ExoPlaybackException {
        h2 h2VarL = l(l1Var);
        if (h2VarL != null) {
            h2VarL.Q(j10);
        }
    }

    public void N(long j10) {
        int i10;
        if (y(this.f19111a) && (i10 = this.f19114d) != 4 && i10 != 2) {
            P(this.f19111a, j10);
        }
        h2 h2Var = this.f19113c;
        if (h2Var == null || !y(h2Var) || this.f19114d == 3) {
            return;
        }
        P(this.f19113c, j10);
    }

    public void O(l1 l1Var, long j10) {
        P((h2) x7.a.e(l(l1Var)), j10);
    }

    public void Q(float f10, float f11) throws ExoPlaybackException {
        this.f19111a.L(f10, f11);
        h2 h2Var = this.f19113c;
        if (h2Var != null) {
            h2Var.L(f10, f11);
        }
    }

    public void R(u7.d0 d0Var) {
        this.f19111a.I(d0Var);
        h2 h2Var = this.f19113c;
        if (h2Var != null) {
            h2Var.I(d0Var);
        }
    }

    public void S(Object obj) throws ExoPlaybackException {
        if (m() != 2) {
            return;
        }
        int i10 = this.f19114d;
        if (i10 == 4 || i10 == 1) {
            ((h2) x7.a.e(this.f19113c)).z(1, obj);
        } else {
            this.f19111a.z(1, obj);
        }
    }

    public void T(float f10) throws ExoPlaybackException {
        if (m() != 1) {
            return;
        }
        this.f19111a.z(2, Float.valueOf(f10));
        h2 h2Var = this.f19113c;
        if (h2Var != null) {
            h2Var.z(2, Float.valueOf(f10));
        }
    }

    public void U() throws ExoPlaybackException {
        if (this.f19111a.k() == 1 && this.f19114d != 4) {
            this.f19111a.start();
            return;
        }
        h2 h2Var = this.f19113c;
        if (h2Var == null || h2Var.k() != 1 || this.f19114d == 3) {
            return;
        }
        this.f19113c.start();
    }

    public void V() {
        int i10;
        x7.a.g(!u());
        if (y(this.f19111a)) {
            i10 = 3;
        } else {
            h2 h2Var = this.f19113c;
            i10 = (h2Var == null || !y(h2Var)) ? 2 : 4;
        }
        this.f19114d = i10;
    }

    public void W() {
        if (y(this.f19111a)) {
            g(this.f19111a);
        }
        h2 h2Var = this.f19113c;
        if (h2Var == null || !y(h2Var)) {
            return;
        }
        g(this.f19113c);
    }

    public boolean a(l1 l1Var) {
        h2 h2VarL = l(l1Var);
        return h2VarL == null || h2VarL.n() || h2VarL.h() || h2VarL.b();
    }

    public void b(k kVar) throws ExoPlaybackException {
        d(this.f19111a, kVar);
        h2 h2Var = this.f19113c;
        if (h2Var != null) {
            boolean z10 = y(h2Var) && this.f19114d != 3;
            d(this.f19113c, kVar);
            E(false);
            if (z10) {
                X(true);
            }
        }
        this.f19114d = 0;
    }

    public void c(k kVar) {
        if (u()) {
            int i10 = this.f19114d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 == 4 ? 1 : 0;
            d(z10 ? this.f19111a : (h2) x7.a.e(this.f19113c), kVar);
            E(z10);
            this.f19114d = i11;
        }
    }

    public void e(b8.y yVar, q8.q qVar, n8.s sVar, long j10, boolean z10, boolean z11, long j11, long j12, io.bidmachine.media3.exoplayer.source.r.b bVar, k kVar) throws ExoPlaybackException {
        u7.q[] qVarArrI = i(qVar);
        int i10 = this.f19114d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f19115e = true;
            this.f19111a.y(yVar, qVarArrI, sVar, j10, z10, z11, j11, j12, bVar);
            kVar.b(this.f19111a);
        } else {
            this.f19116f = true;
            ((h2) x7.a.e(this.f19113c)).y(yVar, qVarArrI, sVar, j10, z10, z11, j11, j12, bVar);
            kVar.b(this.f19113c);
        }
    }

    public void f() {
        if (y(this.f19111a)) {
            this.f19111a.f();
            return;
        }
        h2 h2Var = this.f19113c;
        if (h2Var == null || !y(h2Var)) {
            return;
        }
        this.f19113c.f();
    }

    public int h() {
        int i10 = 0;
        int i11 = (y(this.f19111a) ? 1 : 0) + 0;
        h2 h2Var = this.f19113c;
        if (h2Var != null && y(h2Var)) {
            i10 = 1;
        }
        return i11 + i10;
    }

    public long j(long j10, long j11) {
        long jG = y(this.f19111a) ? this.f19111a.G(j10, j11) : Long.MAX_VALUE;
        h2 h2Var = this.f19113c;
        return (h2Var == null || !y(h2Var)) ? jG : Math.min(jG, this.f19113c.G(j10, j11));
    }

    public long k(l1 l1Var) {
        h2 h2VarL = l(l1Var);
        Objects.requireNonNull(h2VarL);
        return h2VarL.P();
    }

    public int m() {
        return this.f19111a.g();
    }

    public void n(int i10, Object obj, l1 l1Var) throws ExoPlaybackException {
        ((h2) x7.a.e(l(l1Var))).z(i10, obj);
    }

    public boolean o(l1 l1Var) {
        return p(l1Var, this.f19111a) && p(l1Var, this.f19113c);
    }

    public boolean r(l1 l1Var) {
        return ((h2) x7.a.e(l(l1Var))).n();
    }

    public boolean s() {
        return this.f19113c != null;
    }

    public boolean t() {
        boolean zB = y(this.f19111a) ? true & this.f19111a.b() : true;
        h2 h2Var = this.f19113c;
        return (h2Var == null || !y(h2Var)) ? zB : zB & this.f19113c.b();
    }

    public boolean u() {
        return v() || A();
    }

    public boolean w(l1 l1Var) {
        return l(l1Var) != null;
    }

    public boolean x() {
        int i10 = this.f19114d;
        return i10 == 0 || i10 == 2 || i10 == 4 ? y(this.f19111a) : y((h2) x7.a.e(this.f19113c));
    }

    public boolean z(int i10) {
        return (v() && i10 == this.f19112b) || (A() && i10 != this.f19112b);
    }
}
