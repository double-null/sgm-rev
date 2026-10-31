package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06856x {
    public static final C2145mL A0E = new C2145mL(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2145mL A04;
    public final C2145mL A05;
    public final C2135mA A06;
    public final EL A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC1874hX A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C06856x(Timeline timeline, long j10, C2135mA c2135mA, EL el) {
        this(timeline, A0E, j10, -9223372036854775807L, 1, false, c2135mA, el, A0E, j10, j10, j10, EnumC1874hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C06856x(Timeline timeline, C2145mL c2145mL, long j10, long j11, int i10, boolean z10, C2135mA c2135mA, EL el, C2145mL c2145mL2, long j12, long j13, long j14) {
        this(timeline, c2145mL, j10, j11, i10, z10, c2135mA, el, c2145mL2, j12, j13, j14, EnumC1874hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C06856x(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2145mL c2145mL, long j10, long j11, int i10, boolean z10, C2135mA c2135mA, EL el, C2145mL c2145mL2, long j12, long j13, long j14, EnumC1874hX enumC1874hX, boolean z11) {
        this.A03 = timeline;
        this.A05 = c2145mL;
        this.A02 = j10;
        this.A01 = j11;
        this.A0C = j10;
        this.A00 = i10;
        this.A0A = z10;
        this.A06 = c2135mA;
        this.A07 = el;
        this.A04 = c2145mL2;
        this.A0B = j12;
        this.A0D = j13;
        this.A0C = j14;
        this.A08 = enumC1874hX;
        this.A09 = z11;
    }

    public static void A00(C06856x c06856x, C06856x c06856x2) {
        c06856x2.A0C = c06856x.A0C;
        c06856x2.A0B = c06856x.A0B;
        c06856x2.A0D = c06856x.A0D;
    }

    public final C06856x A01(int i10) {
        C06856x c06856x = new C06856x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c06856x);
        return c06856x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C06856x A02(int i10, EnumC1874hX enumC1874hX, boolean z10) {
        C06856x c06856x = new C06856x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC1874hX, z10);
        A00(this, c06856x);
        return c06856x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C06856x A03(int i10, boolean z10) {
        C06856x c06856x = new C06856x(this.A03, this.A05, this.A02, this.A01, i10, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z10);
        A00(this, c06856x);
        return c06856x;
    }

    public final C06856x A04(Timeline timeline) {
        C06856x c06856x = new C06856x(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c06856x);
        return c06856x;
    }

    public final C06856x A05(C2145mL c2145mL) {
        return new C06856x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2145mL, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C06856x A06(C2145mL c2145mL, long j10, long j11, long j12) {
        long j13 = j11;
        Timeline timeline = this.A03;
        if (!c2145mL.A00()) {
            j13 = -9223372036854775807L;
        }
        return new C06856x(timeline, c2145mL, j10, j13, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j12, j10);
    }

    public final C06856x A07(C2135mA c2135mA, EL el) {
        C06856x c06856x = new C06856x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2135mA, el, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c06856x);
        return c06856x;
    }

    public final C06856x A08(boolean z10) {
        C06856x c06856x = new C06856x(this.A03, this.A05, this.A02, this.A01, this.A00, z10, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c06856x);
        return c06856x;
    }
}
