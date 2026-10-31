package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f11302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f11302c = bnVar;
        this.f11303d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.f11304e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f11303d.d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f11302c.f11313f.a(bundle);
        if (apiExceptionA != null) {
            this.f11299a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f11302c.f11310c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f11299a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
