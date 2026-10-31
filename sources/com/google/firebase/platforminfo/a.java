package com.google.firebase.platforminfo;

/* JADX INFO: compiled from: AutoValue_LibraryVersion.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12283b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f12282a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f12283b = str2;
    }

    @Override // com.google.firebase.platforminfo.e
    public String b() {
        return this.f12282a;
    }

    @Override // com.google.firebase.platforminfo.e
    public String c() {
        return this.f12283b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12282a.equals(eVar.b()) && this.f12283b.equals(eVar.c());
    }

    public int hashCode() {
        return ((this.f12282a.hashCode() ^ 1000003) * 1000003) ^ this.f12283b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f12282a + ", version=" + this.f12283b + "}";
    }
}
