package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f11350f;

    /* synthetic */ w(Context context, v vVar) {
        com.google.android.play.integrity.internal.ay ayVarB = com.google.android.play.integrity.internal.az.b(context);
        this.f11345a = ayVarB;
        com.google.android.play.integrity.internal.bb bbVarB = com.google.android.play.integrity.internal.ax.b(bb.f11283a);
        this.f11346b = bbVarB;
        au auVar = new au(ayVarB, n.f11337a);
        this.f11347c = auVar;
        com.google.android.play.integrity.internal.bb bbVarB2 = com.google.android.play.integrity.internal.ax.b(new bp(ayVarB, bbVarB, auVar, n.f11337a));
        this.f11348d = bbVarB2;
        com.google.android.play.integrity.internal.bb bbVarB3 = com.google.android.play.integrity.internal.ax.b(new bu(bbVarB2));
        this.f11349e = bbVarB3;
        this.f11350f = com.google.android.play.integrity.internal.ax.b(new ba(bbVarB2, bbVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f11350f.a();
    }
}
