package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2152mS implements CL {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C07007m A02;
    public final ArrayList<CK> A05 = new ArrayList<>(1);
    public final HashSet<CK> A06 = new HashSet<>(1);
    public final CW A04 = new CW();
    public final C9P A03 = new C9P();

    public abstract void A09();

    public abstract void A0A(C5H c5h);

    public final C07007m A00() {
        return (C07007m) C3M.A02(this.A02);
    }

    public final C9P A01(C2145mL c2145mL) {
        return this.A03.A00(0, c2145mL);
    }

    public final CW A02(C2145mL c2145mL) {
        return this.A04.A02(0, c2145mL, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<CK> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AFI(this, timeline);
        }
    }

    public final void A06(CK ck) {
        boolean z10 = !this.A06.isEmpty();
        this.A06.remove(ck);
        if (z10) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(CK ck) {
        C3M.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(ck);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void A08(CK ck, C5H c5h, C07007m c07007m) {
        boolean z10;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.A00;
        if (looper != null) {
            Looper looper2 = this.A00;
            if (looper2 == looperMyLooper) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        C3M.A07(z10);
        this.A02 = c07007m;
        Timeline timeline = this.A01;
        this.A05.add(ck);
        Looper looper3 = this.A00;
        if (looper3 == null) {
            this.A00 = looperMyLooper;
            this.A06.add(ck);
            A0A(c5h);
        } else {
            if (timeline == null) {
                return;
            }
            A07(ck);
            ck.AFI(this, timeline);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void A3r(Handler handler, CX cx) {
        C3M.A01(handler);
        C3M.A01(cx);
        this.A04.A04(handler, cx);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AGN(CK ck, C5H c5h) {
        A08(ck, c5h, C07007m.A03);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH1(CK ck) {
        this.A05.remove(ck);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(ck);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AHi(CX cx) {
        this.A04.A0D(cx);
    }
}
