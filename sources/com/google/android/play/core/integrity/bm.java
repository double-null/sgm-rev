package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class bm extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f11307f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f11307f = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.af)) {
            super.a(exc);
        } else if (bn.l(this.f11307f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
