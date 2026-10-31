package com.vungle.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceLocator$Companion$inject$1<T> extends u implements id.a<T> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$Companion$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // id.a
    public final T invoke() {
        ServiceLocator companion = ServiceLocator.Companion.getInstance(this.$context);
        t.k(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) companion.getService(Object.class);
    }
}
