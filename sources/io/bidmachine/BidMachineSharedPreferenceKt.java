package io.bidmachine;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: BidMachineSharedPreferenceKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidMachineSharedPreferenceKt {
    public static final BidMachineSharedPreferenceKt INSTANCE = new BidMachineSharedPreferenceKt();

    private BidMachineSharedPreferenceKt() {
    }

    public final /* synthetic */ void clear(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        f2.c(context);
    }

    public final /* synthetic */ r7.f getCurrentVersionMilestone(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return f2.f(context);
    }

    public final /* synthetic */ List getHistoryVersionMilestoneList(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        List<r7.f> listG = f2.g(context);
        kotlin.jvm.internal.t.e(listG, "getHistoryVersionMilestoneList(context)");
        return listG;
    }

    public final /* synthetic */ long getSdkInstallTime(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return f2.s(context);
    }

    public final /* synthetic */ boolean hasBMIFV(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return f2.y(context);
    }

    public final /* synthetic */ String obtainBMIFV(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        String strC = f2.C(context);
        kotlin.jvm.internal.t.e(strC, "obtainBMIFV(context)");
        return strC;
    }

    public final /* synthetic */ void setCurrentVersionMilestone(Context context, r7.f fVar) {
        kotlin.jvm.internal.t.f(context, "context");
        f2.G(context, fVar);
    }

    public final /* synthetic */ void setHistoryVersionMilestoneList(Context context, List historyVersionMilestoneList) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(historyVersionMilestoneList, "historyVersionMilestoneList");
        f2.H(context, historyVersionMilestoneList);
    }

    public final /* synthetic */ void setSdkInstallTime(Context context, long j10) {
        kotlin.jvm.internal.t.f(context, "context");
        f2.K(context, j10);
    }
}
