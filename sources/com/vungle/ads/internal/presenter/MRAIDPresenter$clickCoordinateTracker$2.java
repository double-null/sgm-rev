package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.ClickCoordinateTracker;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MRAIDPresenter.kt */
/* JADX INFO: loaded from: classes4.dex */
final class MRAIDPresenter$clickCoordinateTracker$2 extends u implements id.a<ClickCoordinateTracker> {
    final /* synthetic */ MRAIDPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MRAIDPresenter$clickCoordinateTracker$2(MRAIDPresenter mRAIDPresenter) {
        super(0);
        this.this$0 = mRAIDPresenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final ClickCoordinateTracker invoke() {
        Context context = this.this$0.adWidget.getContext();
        t.e(context, "adWidget.context");
        return new ClickCoordinateTracker(context, this.this$0.advertisement);
    }
}
