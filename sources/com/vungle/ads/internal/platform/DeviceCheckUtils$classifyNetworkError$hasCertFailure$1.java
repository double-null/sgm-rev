package com.vungle.ads.internal.platform;

import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DeviceCheckUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
final class DeviceCheckUtils$classifyNetworkError$hasCertFailure$1 extends u implements l<Throwable, Throwable> {
    public static final DeviceCheckUtils$classifyNetworkError$hasCertFailure$1 INSTANCE = new DeviceCheckUtils$classifyNetworkError$hasCertFailure$1();

    DeviceCheckUtils$classifyNetworkError$hasCertFailure$1() {
        super(1);
    }

    @Override // id.l
    public final Throwable invoke(Throwable it) {
        t.f(it, "it");
        return it.getCause();
    }
}
