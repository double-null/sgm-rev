package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f11237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f11238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f11240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f11241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f11237a = bundle;
        this.f11238b = activity;
        this.f11239c = taskCompletionSource2;
        this.f11240d = i10;
        this.f11241e = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.f11241e.f11246a.e();
            Bundle bundle = this.f11237a;
            aj ajVar = this.f11241e;
            nVar.c(bundle, ajVar.f11250e.a(this.f11238b, this.f11239c, ajVar.f11246a));
        } catch (RemoteException e10) {
            this.f11241e.f11247b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f11240d));
            this.f11239c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
