package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class ap extends an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ar f11382a;

    ap(ar arVar, int i10) {
        super(arVar.size(), i10);
        this.f11382a = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    protected final Object a(int i10) {
        return this.f11382a.get(i10);
    }
}
