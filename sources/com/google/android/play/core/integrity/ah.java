package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class ah extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f11242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, String str, long j10) {
        super(str, j10);
        this.f11242a = aiVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        return this.f11242a.f11243a.b(activity, bundle);
    }
}
