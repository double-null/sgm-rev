package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f11284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f11285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f11284a = context;
        this.f11285b = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        this.f11285b.f11311d.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(this.f11284a)));
    }
}
