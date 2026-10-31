package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f11259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11260c = null;

    /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f11258a = str;
        this.f11259b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f11259b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f11258a.equals(integrityTokenRequest.nonce()) || ((l10 = this.f11259b) != null ? !l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (!(obj instanceof ao) || !a()) {
            return z10;
        }
        ao aoVar = (ao) obj;
        if (!z10) {
            return false;
        }
        Object obj2 = aoVar.f11260c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f11258a.hashCode() ^ 1000003;
        Long l10 = this.f11259b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f11258a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f11258a + ", cloudProjectNumber=" + this.f11259b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
