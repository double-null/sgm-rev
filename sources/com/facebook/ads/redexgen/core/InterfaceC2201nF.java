package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC2201nF extends InterfaceC05762s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC2201nF A00 = new InterfaceC2201nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void ACv(C2247o0 c2247o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i10, C2145mL c2145mL, CG cg) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i10, C2145mL c2145mL, CE ce2, CG cg) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i10, C2145mL c2145mL, CE ce2, CG cg, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i10, C2145mL c2145mL, CE ce2, CG cg, IOException iOException, boolean z10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void AEb(C2282ob c2282ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void AEd(C2284od c2284od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void AEf(boolean z10, int i10) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void AFQ(Timeline timeline, int i10) {
            AbstractC05752r.A00(this, timeline, i10);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC05762s
        public final /* synthetic */ void AFU(C2253o6 c2253o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2201nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2201nF
        public final void AIv(InterfaceC05832z interfaceC05832z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC05832z interfaceC05832z, Looper looper);
}
