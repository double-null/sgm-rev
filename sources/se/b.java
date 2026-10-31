package se;

import af.q;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import me.a0;
import me.b0;
import me.v;
import me.z;
import rd.c0;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25425a;

    public b(boolean z10) {
        this.f25425a = z10;
    }

    @Override // me.v
    public b0 intercept(v.a chain) throws IOException {
        boolean z10;
        b0.a aVarP;
        t.f(chain, "chain");
        g gVar = (g) chain;
        re.c cVarF = gVar.f();
        t.c(cVarF);
        z zVarH = gVar.h();
        a0 a0VarA = zVarH.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cVarF.t(zVarH);
        if (!f.b(zVarH.h()) || a0VarA == null) {
            cVarF.n();
            z10 = true;
            aVarP = null;
        } else {
            if (c0.B("100-continue", zVarH.d("Expect"), true)) {
                cVarF.f();
                aVarP = cVarF.p(true);
                cVarF.r();
                z10 = false;
            } else {
                z10 = true;
                aVarP = null;
            }
            if (aVarP != null) {
                cVarF.n();
                if (!cVarF.h().v()) {
                    cVarF.m();
                }
            } else if (a0VarA.isDuplex()) {
                cVarF.f();
                a0VarA.writeTo(q.c(cVarF.c(zVarH, true)));
            } else {
                af.f fVarC = q.c(cVarF.c(zVarH, false));
                a0VarA.writeTo(fVarC);
                fVarC.close();
            }
        }
        if (a0VarA == null || !a0VarA.isDuplex()) {
            cVarF.e();
        }
        if (aVarP == null) {
            aVarP = cVarF.p(false);
            t.c(aVarP);
            if (z10) {
                cVarF.r();
                z10 = false;
            }
        }
        b0 b0VarC = aVarP.s(zVarH).j(cVarF.h().r()).t(jCurrentTimeMillis).r(System.currentTimeMillis()).c();
        int iH = b0VarC.h();
        if (iH == 100) {
            b0.a aVarP2 = cVarF.p(false);
            t.c(aVarP2);
            if (z10) {
                cVarF.r();
            }
            b0VarC = aVarP2.s(zVarH).j(cVarF.h().r()).t(jCurrentTimeMillis).r(System.currentTimeMillis()).c();
            iH = b0VarC.h();
        }
        cVarF.q(b0VarC);
        b0 b0VarC2 = (this.f25425a && iH == 101) ? b0VarC.z().b(ne.d.f22993c).c() : b0VarC.z().b(cVarF.o(b0VarC)).c();
        if (c0.B(MRAIDPresenter.CLOSE, b0VarC2.G().d("Connection"), true) || c0.B(MRAIDPresenter.CLOSE, b0.p(b0VarC2, "Connection", null, 2, null), true)) {
            cVarF.m();
        }
        if (iH == 204 || iH == 205) {
            me.c0 c0VarB = b0VarC2.b();
            if ((c0VarB == null ? -1L : c0VarB.contentLength()) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iH);
                sb2.append(" had non-zero Content-Length: ");
                me.c0 c0VarB2 = b0VarC2.b();
                sb2.append(c0VarB2 != null ? Long.valueOf(c0VarB2.contentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return b0VarC2;
    }
}
