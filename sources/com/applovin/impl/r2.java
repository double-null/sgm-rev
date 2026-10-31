package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8058d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8062d;

        a() {
        }

        public r2 a() {
            return new r2(this.f8059a, this.f8060b, this.f8061c, this.f8062d);
        }

        public a b(int i10) {
            this.f8061c = i10;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f8059a + ", signature=" + this.f8060b + ", responseCode=" + this.f8061c + ", nonce=" + this.f8062d + ")";
        }

        public a a(int i10) {
            this.f8062d = i10;
            return this;
        }

        public a b(String str) {
            this.f8059a = str;
            return this;
        }

        public a a(String str) {
            this.f8060b = str;
            return this;
        }
    }

    r2(String str, String str2, int i10, int i11) {
        this.f8055a = str;
        this.f8056b = str2;
        this.f8057c = i10;
        this.f8058d = i11;
    }

    protected boolean a(Object obj) {
        return obj instanceof r2;
    }

    public int b() {
        return this.f8058d;
    }

    public int c() {
        return this.f8057c;
    }

    public String d() {
        return this.f8056b;
    }

    public String e() {
        return this.f8055a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        if (!r2Var.a(this) || c() != r2Var.c() || b() != r2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = r2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = r2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int iHashCode = (iC * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        return (iHashCode * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
