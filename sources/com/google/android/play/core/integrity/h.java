package com.google.android.play.core.integrity;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f11331b;

    /* synthetic */ h(String str, Set set, g gVar) {
        this.f11330a = str;
        this.f11331b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
            String str = this.f11330a;
            if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
                if (this.f11331b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11330a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11331b.hashCode();
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.f11330a;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f11330a + ", verdictOptOut=" + this.f11331b.toString() + "}";
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.f11331b;
    }
}
