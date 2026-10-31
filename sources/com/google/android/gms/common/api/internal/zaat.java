package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zaat implements com.google.android.gms.common.internal.zat {
    final /* synthetic */ zaaz zaa;

    zaat(zaaz zaazVar) {
        Objects.requireNonNull(zaazVar);
        this.zaa = zaazVar;
    }

    @Override // com.google.android.gms.common.internal.zat
    public final boolean isConnected() {
        return this.zaa.isConnected();
    }
}
