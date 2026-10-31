package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f11262b;

    aq(String str, y yVar) {
        this.f11261a = str;
        this.f11262b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f11262b.a(activity, i10);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f11261a;
    }
}
