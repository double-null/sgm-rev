package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.signals.SignalManager;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MRAIDPresenter$special$$inlined$inject$3 extends u implements id.a<SignalManager> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDPresenter$special$$inlined$inject$3(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
    @Override // id.a
    public final SignalManager invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(SignalManager.class);
    }
}
