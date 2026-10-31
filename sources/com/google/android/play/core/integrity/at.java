package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11271b;

    at(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f11270a = bdVar;
        this.f11271b = bdVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        Context context = (Context) this.f11270a.a();
        context.getClass();
        k kVar = (k) this.f11271b.a();
        kVar.getClass();
        activity.getClass();
        aeVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, aeVar);
    }
}
