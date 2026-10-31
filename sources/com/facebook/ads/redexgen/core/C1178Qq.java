package com.facebook.ads.redexgen.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1178Qq extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C1180Qs A02;
    public final C1621dL A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C1178Qq.class.getName();
    }

    public C1178Qq(C1621dL c1621dL, C1180Qs c1180Qs) {
        this(c1621dL, c1180Qs, U7.A08(c1621dL));
    }

    public C1178Qq(C1621dL c1621dL, C1180Qs c1180Qs, int i10) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new RunnableC1177Qp(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i10;
        this.A03 = c1621dL;
        this.A02 = c1180Qs;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC1300Vl.A02(this)) {
            return;
        }
        try {
            long j10 = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z10 = interval == 0;
                this.A05 = j10;
                if (z10) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j10);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A08().AAy(A01(15, 7, 8), AbstractC1234Sv.A1D, new C1235Sw(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC1300Vl.A00(th, this);
        }
    }
}
