package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f11326b;

    c() {
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f11326b = (byte) (this.f11326b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f11326b == 3) {
            return new e(this.f11325a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f11326b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f11326b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f11325a = j10;
        this.f11326b = (byte) (this.f11326b | 1);
        return this;
    }
}
