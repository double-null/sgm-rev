package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class b extends bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f11280b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq a(y yVar) {
        this.f11280b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f11279a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final br c() {
        y yVar;
        String str = this.f11279a;
        if (str != null && (yVar = this.f11280b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11279a == null) {
            sb2.append(" token");
        }
        if (this.f11280b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
