package com.vungle.ads.internal.signals;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.PathProvider;
import id.a;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SignalManager$special$$inlined$inject$3 extends u implements a<PathProvider> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalManager$special$$inlined$inject$3(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
    @Override // id.a
    public final PathProvider invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(PathProvider.class);
    }
}
