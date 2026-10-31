package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f11308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f11311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f11312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f11313f;

    bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11311d = taskCompletionSource;
        this.f11310c = context.getPackageName();
        this.f11309b = sVar;
        this.f11312e = atVar;
        this.f11313f = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", bo.f11314a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.h.b(iBinder);
            }
        }, null);
        this.f11308a = aeVar;
        aeVar.c().post(new be(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f11310c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f11310c);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i10) {
        return bnVar.f11311d.getTask().isSuccessful() && ((Integer) bnVar.f11311d.getTask().getResult()).intValue() < 83420000;
    }

    static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.f11311d.getTask().isSuccessful() && ((Integer) bnVar.f11311d.getTask().getResult()).intValue() == 0;
    }

    final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f11309b.d("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11308a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j10, long j11, int i10) {
        this.f11309b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11308a.t(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i10) {
        this.f11309b.d("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11308a.t(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
