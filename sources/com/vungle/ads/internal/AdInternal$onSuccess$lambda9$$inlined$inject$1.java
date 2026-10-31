package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.network.TpatSender;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: com.vungle.ads.internal.AdInternal$onSuccess$lambda-9$$inlined$inject$1, reason: invalid class name */
/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdInternal$onSuccess$lambda9$$inlined$inject$1 extends u implements id.a<TpatSender> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInternal$onSuccess$lambda9$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
    @Override // id.a
    public final TpatSender invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(TpatSender.class);
    }
}
