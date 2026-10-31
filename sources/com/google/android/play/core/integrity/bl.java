package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bl extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f11305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f11305c = bnVar;
        this.f11306d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f11306d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f11305c.f11313f.a(bundle);
        if (apiExceptionA != null) {
            this.f11299a.trySetException(apiExceptionA);
        } else {
            this.f11299a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
