package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12100c;

    b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f12098a = str;
        this.f12099b = str2;
        this.f12100c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    public String c() {
        return this.f12098a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    public String d() {
        return this.f12100c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    public String e() {
        return this.f12099b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0.a)) {
            return false;
        }
        o0.a aVar = (o0.a) obj;
        if (this.f12098a.equals(aVar.c()) && ((str = this.f12099b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f12100c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f12098a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12099b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12100c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f12098a + ", firebaseInstallationId=" + this.f12099b + ", firebaseAuthenticationToken=" + this.f12100c + "}";
    }
}
