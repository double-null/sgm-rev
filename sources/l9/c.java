package l9;

import java.nio.ByteBuffer;
import u7.v;
import x7.a0;
import x7.g0;
import x7.z;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f21878a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f21879b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g0 f21880c;

    @Override // e9.c
    protected v b(e9.b bVar, ByteBuffer byteBuffer) {
        v.a eVar;
        g0 g0Var = this.f21880c;
        if (g0Var == null || bVar.f14513j != g0Var.f()) {
            g0 g0Var2 = new g0(bVar.f18059f);
            this.f21880c = g0Var2;
            g0Var2.a(bVar.f18059f - bVar.f14513j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f21878a.U(bArrArray, iLimit);
        this.f21879b.o(bArrArray, iLimit);
        this.f21879b.r(39);
        long jH = (((long) this.f21879b.h(1)) << 32) | ((long) this.f21879b.h(32));
        this.f21879b.r(20);
        int iH = this.f21879b.h(12);
        int iH2 = this.f21879b.h(8);
        this.f21878a.X(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.d(this.f21878a, iH, jH);
        } else if (iH2 == 4) {
            eVar = f.d(this.f21878a);
        } else if (iH2 != 5) {
            eVar = iH2 != 6 ? null : g.d(this.f21878a, jH, this.f21880c);
        } else {
            eVar = d.d(this.f21878a, jH, this.f21880c);
        }
        return eVar == null ? new v(new v.a[0]) : new v(eVar);
    }
}
