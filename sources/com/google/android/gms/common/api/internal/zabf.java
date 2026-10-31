package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zabf implements BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ GoogleApiManager zaa;

    zabf(GoogleApiManager googleApiManager) {
        Objects.requireNonNull(googleApiManager);
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zaK().sendMessage(googleApiManager.zaK().obtainMessage(1, boolValueOf));
    }
}
