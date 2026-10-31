package io.bidmachine.media3.exoplayer;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;

/* JADX INFO: loaded from: classes4.dex */
public final class ExoTimeoutException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18100a;

    public ExoTimeoutException(int i10) {
        super(b(i10));
        this.f18100a = i10;
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? sRGQSqxgxlS.QloMsOY : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
