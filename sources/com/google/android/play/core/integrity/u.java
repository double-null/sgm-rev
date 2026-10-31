package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11344a;

    private u() {
        throw null;
    }

    /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f11344a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.ba.a(this.f11344a, Context.class);
        return new w(this.f11344a, null);
    }
}
