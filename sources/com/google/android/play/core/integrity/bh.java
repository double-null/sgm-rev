package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f11294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f11295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f11297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f11298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f11294a = bundle;
        this.f11295b = activity;
        this.f11296c = taskCompletionSource2;
        this.f11297d = i10;
        this.f11298e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.l(this.f11298e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f11298e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f11308a;
            ((com.google.android.play.integrity.internal.i) aeVar.e()).c(this.f11294a, bnVar.f11312e.a(this.f11295b, this.f11296c, aeVar));
        } catch (RemoteException e10) {
            this.f11298e.f11309b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f11297d));
            this.f11296c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
