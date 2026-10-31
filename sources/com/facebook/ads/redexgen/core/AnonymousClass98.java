package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass98 extends AbstractC2152mS implements InterfaceC0808Cg {
    public long A00;
    public C5H A01;
    public InterfaceC1974jM<InterfaceExecutorC0879Ez> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C2Q A07;
    public final C2289oi A08;
    public final InterfaceC06324w A09;
    public final C9U A0A;
    public final InterfaceC0802Ca A0B;
    public final InterfaceC0857Ed A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public AnonymousClass98(C2289oi c2289oi, InterfaceC06324w interfaceC06324w, InterfaceC0802Ca interfaceC0802Ca, C9U c9u, InterfaceC0857Ed interfaceC0857Ed, int i10, InterfaceC1974jM<InterfaceExecutorC0879Ez> interfaceC1974jM) {
        this.A07 = (C2Q) C3M.A01(c2289oi.A03);
        this.A08 = c2289oi;
        this.A09 = interfaceC06324w;
        this.A0B = interfaceC0802Ca;
        this.A0A = c9u == null ? C9U.A00 : c9u;
        this.A0C = interfaceC0857Ed;
        this.A06 = i10;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC1974jM;
    }

    private void A00() {
        final Timeline anonymousClass97 = new AnonymousClass97(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9C(anonymousClass97) { // from class: com.facebook.ads.redexgen.X.12
                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C2269oN A0I(int i10, C2269oN c2269oN, boolean z10) {
                    super.A0I(i10, c2269oN, z10);
                    c2269oN.A05 = true;
                    return c2269oN;
                }

                @Override // com.facebook.ads.redexgen.core.C9C, com.facebook.ads.androidx.media3.common.Timeline
                public final C2267oL A0L(int i10, C2267oL c2267oL, long j10) {
                    super.A0L(i10, c2267oL, j10);
                    c2267oL.A0F = true;
                    return c2267oL;
                }
            };
            anonymousClass97 = timeline;
        }
        A05(anonymousClass97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2152mS
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2152mS
    public final void A0A(C5H c5h) {
        this.A01 = c5h;
        this.A0A.AGK();
        this.A0A.AIu((Looper) C3M.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2146mM A5O(C2145mL c2145mL, EO eo, long j10) {
        InterfaceExecutorC0879Ez interfaceExecutorC0879Ez;
        InterfaceC2233nl interfaceC2233nlA5A = this.A09.A5A();
        if (this.A01 != null) {
            interfaceC2233nlA5A.A3v(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC0803Cb interfaceC0803CbA5P = this.A0B.A5P(C07007m.A03);
        C9U c9u = this.A0A;
        C9P c9pA01 = A01(c2145mL);
        InterfaceC0857Ed interfaceC0857Ed = this.A0C;
        CW cwA02 = A02(c2145mL);
        String str = this.A07.A04;
        int i10 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0879Ez = this.A02.get();
        } else {
            interfaceExecutorC0879Ez = null;
        }
        return new C9A(uri, interfaceC2233nlA5A, interfaceC0803CbA5P, c9u, c9pA01, interfaceC0857Ed, cwA02, this, eo, str, i10, interfaceExecutorC0879Ez);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void ABu() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0808Cg
    public final void AFH(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (!this.A04 && this.A00 == j10 && this.A05 == z10 && this.A03 == z11) {
            return;
        }
        this.A00 = j10;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH0(InterfaceC2146mM interfaceC2146mM) {
        ((C9A) interfaceC2146mM).A0a();
    }
}
