package com.vungle.ads.internal.presenter;

import com.vungle.ads.internal.util.HandlerScheduler;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MRAIDPresenter.kt */
/* JADX INFO: loaded from: classes4.dex */
final class MRAIDPresenter$scheduler$2 extends u implements id.a<HandlerScheduler> {
    public static final MRAIDPresenter$scheduler$2 INSTANCE = new MRAIDPresenter$scheduler$2();

    MRAIDPresenter$scheduler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final HandlerScheduler invoke() {
        return new HandlerScheduler();
    }
}
