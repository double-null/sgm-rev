package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11343e;

    /* synthetic */ s(Context context, r rVar) {
        com.google.android.play.integrity.internal.ay ayVarB = com.google.android.play.integrity.internal.az.b(context);
        this.f11339a = ayVarB;
        com.google.android.play.integrity.internal.bb bbVarB = com.google.android.play.integrity.internal.ax.b(ac.f11230a);
        this.f11340b = bbVarB;
        au auVar = new au(ayVarB, l.f11332a);
        this.f11341c = auVar;
        com.google.android.play.integrity.internal.bb bbVarB2 = com.google.android.play.integrity.internal.ax.b(new al(ayVarB, bbVarB, auVar, l.f11332a));
        this.f11342d = bbVarB2;
        this.f11343e = com.google.android.play.integrity.internal.ax.b(new ab(bbVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f11343e.a();
    }
}
