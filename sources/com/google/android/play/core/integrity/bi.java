package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f11300b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f11300b = bnVar;
        this.f11299a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.f11300b.f11308a.v(this.f11299a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.f11300b.f11308a.v(this.f11299a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.f11300b.f11308a.v(this.f11299a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.f11300b.f11308a.v(this.f11299a);
    }
}
