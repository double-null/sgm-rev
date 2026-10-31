package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f11264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f11265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11266c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f11268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f11269f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.f11267d = context.getPackageName();
        this.f11268e = kVar;
        this.f11264a = taskCompletionSource;
        this.f11269f = activity;
        this.f11265b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f11265b.v(this.f11264a);
        this.f11266c.d("onRequestDialog(%s)", this.f11267d);
        ApiException apiExceptionA = this.f11268e.a(bundle);
        if (apiExceptionA != null) {
            this.f11264a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f11266c.b(xjwcmjDeOXR.hrfynOUNwuhLFS, this.f11267d);
            this.f11264a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f11269f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f11265b.c()));
        this.f11266c.a("Starting dialog intent...", new Object[0]);
        this.f11269f.startActivityForResult(intent, 0);
    }
}
