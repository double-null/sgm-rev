package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f11227b;

    a() {
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap a(y yVar) {
        this.f11227b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap b(String str) {
        this.f11226a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final aq c() {
        y yVar;
        String str = this.f11226a;
        if (str != null && (yVar = this.f11227b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11226a == null) {
            sb2.append(" token");
        }
        if (this.f11227b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
