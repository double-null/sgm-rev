package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11338a;

    private q() {
        throw null;
    }

    /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f11338a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.ba.a(this.f11338a, Context.class);
        return new s(this.f11338a, null);
    }
}
