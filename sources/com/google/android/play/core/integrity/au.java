package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class au implements com.google.android.play.integrity.internal.ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f11273b;

    public au(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f11272a = bdVar;
        this.f11273b = bdVar2;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f11272a, this.f11273b);
    }
}
