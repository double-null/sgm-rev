package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f11232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Parcelable f11233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f11235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ aj f11236f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f11231a = bArr;
        this.f11232b = l10;
        this.f11233c = parcelable;
        this.f11234d = taskCompletionSource2;
        this.f11235e = integrityTokenRequest;
        this.f11236f = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            ((com.google.android.play.integrity.internal.n) this.f11236f.f11246a.e()).d(aj.a(this.f11236f, this.f11231a, this.f11232b, this.f11233c), new ai(this.f11236f, this.f11234d));
        } catch (RemoteException e10) {
            this.f11236f.f11247b.c(e10, "requestIntegrityToken(%s)", this.f11235e);
            this.f11234d.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
