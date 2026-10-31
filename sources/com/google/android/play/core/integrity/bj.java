package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import g7.EinF.ZHgPsTG;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class bj extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f11301a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bk bkVar, String str, long j10) {
        super(str, j10);
        this.f11301a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        bundle.putLong(ZHgPsTG.clAqDhRpRcIjzxn, this.f11301a.f11304e);
        return this.f11301a.f11302c.c(activity, bundle);
    }
}
