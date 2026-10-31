package com.applovin.impl;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f5895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5896g;

    public a0(String str, int i10) {
        this.f5894e = str;
        this.f5895f = i10;
        String[] strArrSplit = str.split(",");
        boolean z10 = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f5896g = z10;
        if (z10) {
            this.f5890a = a(strArrSplit[0]);
            this.f5891b = a(strArrSplit[1]);
            this.f5892c = a(strArrSplit[2]);
            this.f5893d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f5890a = "";
        this.f5891b = "";
        this.f5892c = "";
        this.f5893d = "";
    }

    protected boolean a(Object obj) {
        return obj instanceof a0;
    }

    public String b() {
        return this.f5890a;
    }

    public String c() {
        return this.f5891b;
    }

    public String d() {
        return this.f5894e;
    }

    public String e() {
        return this.f5892c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!a0Var.a((Object) this)) {
            return false;
        }
        String strB = b();
        String strB2 = a0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = a0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strE = e();
        String strE2 = a0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = a0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int f() {
        return this.f5895f;
    }

    public boolean g() {
        return this.f5890a.equals("applovin.com");
    }

    public boolean h() {
        return this.f5896g;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    public String a() {
        return this.f5893d;
    }

    public boolean a(a0 a0Var) {
        if (!a0Var.b().equals(this.f5890a) || !a0Var.c().equals(this.f5891b) || !a0Var.e().equals(this.f5892c)) {
            return false;
        }
        if (a0Var.a().equals("")) {
            return true;
        }
        return a0Var.a().equals(this.f5893d);
    }

    private String a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public a0(String str) {
        this(str, -1);
    }
}
