package com.vungle.ads.internal.ui;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.platform.Platform;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdActivity$onCreate$$inlined$inject$3 extends u implements id.a<Platform> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdActivity$onCreate$$inlined$inject$3(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
    @Override // id.a
    public final Platform invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(Platform.class);
    }
}
