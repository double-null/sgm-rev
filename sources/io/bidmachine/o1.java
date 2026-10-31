package io.bidmachine;

import android.content.Context;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.protobuf.InitResponse;

/* JADX INFO: compiled from: BidMachineAnalyticsInitializer.java */
/* JADX INFO: loaded from: classes4.dex */
class o1 {
    o1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        try {
            BidMachineAnalytics.initialize(context);
        } catch (Throwable unused) {
        }
    }

    void a(Context context, String str, InitResponse initResponse, String str2) {
        o7.c.a(context, str, initResponse, str2);
    }
}
