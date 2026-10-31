package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f11286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f11288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f11286a = j10;
        this.f11287b = taskCompletionSource2;
        this.f11288c = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.l(this.f11288c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f11288c, 0)) {
            super.a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f11288c;
            ((com.google.android.play.integrity.internal.i) bnVar.f11308a.e()).e(bn.b(bnVar, this.f11286a, 0), new bl(this.f11288c, this.f11287b));
        } catch (RemoteException e10) {
            this.f11288c.f11309b.c(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f11286a));
            this.f11287b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
