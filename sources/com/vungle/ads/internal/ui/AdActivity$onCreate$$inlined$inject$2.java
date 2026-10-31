package com.vungle.ads.internal.ui;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.Executors;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdActivity$onCreate$$inlined$inject$2 extends u implements id.a<Executors> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdActivity$onCreate$$inlined$inject$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
    @Override // id.a
    public final Executors invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(Executors.class);
    }
}
