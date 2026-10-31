package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f11243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11244b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f11245c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f11243a = ajVar;
        this.f11245c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f11243a.f11246a.v(this.f11245c);
        this.f11244b.d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f11243a.f11251f.a(bundle);
        if (apiExceptionA != null) {
            this.f11245c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f11245c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f11243a.f11248c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f11245c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
