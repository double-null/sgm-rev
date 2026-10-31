package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f11289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f11290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f11291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f11293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f11289a = standardIntegrityTokenRequest;
        this.f11290b = j10;
        this.f11291c = j11;
        this.f11292d = taskCompletionSource2;
        this.f11293e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.l(this.f11293e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f11293e, 0)) {
            super.a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f11293e;
            ((com.google.android.play.integrity.internal.i) bnVar.f11308a.e()).d(bn.a(bnVar, this.f11289a, this.f11290b, this.f11291c, 0), new bk(this.f11293e, this.f11292d, this.f11290b));
        } catch (RemoteException e10) {
            this.f11293e.f11309b.c(e10, "requestExpressIntegrityToken(%s, %s, %s)", this.f11289a.requestHash(), this.f11289a.verdictOptOut(), Long.valueOf(this.f11290b));
            this.f11292d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
