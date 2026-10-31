package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11353c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11355e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11351a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f11354d = new Object();

    y(String str, long j10) {
        this.f11352b = str;
        this.f11353c = j10;
    }

    public final Task a(Activity activity, int i10) {
        synchronized (this.f11354d) {
            if (this.f11355e) {
                return Tasks.forResult(0);
            }
            this.f11355e = true;
            this.f11351a.a("checkAndShowDialog(%s)", Integer.valueOf(i10));
            Bundle bundle = new Bundle();
            bundle.putInt("dialog.intent.type", i10);
            bundle.putString("package.name", this.f11352b);
            bundle.putInt("playcore.integrity.version.major", 1);
            bundle.putInt("playcore.integrity.version.minor", 4);
            bundle.putInt("playcore.integrity.version.patch", 0);
            bundle.putLong("request.token.sid", this.f11353c);
            return b(activity, bundle);
        }
    }

    abstract Task b(Activity activity, Bundle bundle);
}
