package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f11323a;

    bt(bn bnVar) {
        this.f11323a = bnVar;
    }

    final /* synthetic */ Task a(long j10, long j11, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f11323a.d(standardIntegrityTokenRequest, j10, j11, 0);
    }
}
