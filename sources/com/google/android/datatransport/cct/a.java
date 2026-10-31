package com.google.android.datatransport.cct;

import com.adjust.sdk.Constants;
import d2.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: CCTDestination.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f11194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f11195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<b2.b> f11197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11199h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11201b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11194c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f11195d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11196e = strA3;
        f11197f = Collections.unmodifiableSet(new HashSet(Arrays.asList(b2.b.b("proto"), b2.b.b("json"))));
        f11198g = new a(strA, null);
        f11199h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f11200a = str;
        this.f11201b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // d2.g
    public Set<b2.b> a() {
        return f11197f;
    }

    public byte[] b() {
        String str = this.f11201b;
        if (str == null && this.f11200a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f11200a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Constants.ENCODING));
    }

    public String d() {
        return this.f11201b;
    }

    public String e() {
        return this.f11200a;
    }

    @Override // d2.f
    public byte[] getExtras() {
        return b();
    }

    @Override // d2.f
    public String getName() {
        return "cct";
    }
}
