package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ba implements com.google.android.play.integrity.internal.ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11282b;

    public ba(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f11281a = bdVar;
        this.f11282b = bdVar2;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final /* bridge */ /* synthetic */ Object a() {
        com.google.android.play.integrity.internal.bd bdVar = this.f11282b;
        return new az((bn) this.f11281a.a(), (bt) bdVar.a());
    }
}
