package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zabg implements Runnable {
    final /* synthetic */ Bundle zaa;
    final /* synthetic */ zabk zab;

    zabg(zabk zabkVar, Bundle bundle) {
        this.zaa = bundle;
        Objects.requireNonNull(zabkVar);
        this.zab = zabkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zat(this.zaa);
    }
}
