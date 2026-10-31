package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class w extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f11407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f11408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f11406a = taskCompletionSource2;
        this.f11407b = tVar;
        this.f11408c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f11408c.f11369g) {
            ae.o(this.f11408c, this.f11406a);
            if (this.f11408c.f11375m.getAndIncrement() > 0) {
                this.f11408c.f11365c.d("Already connected to the service.", new Object[0]);
            }
            ae.q(this.f11408c, this.f11407b);
        }
    }
}
