package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7851c = a(b5.f6141l);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7852d = a(b5.f6142m);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7853e = (String) c5.a(b5.f6143n, (Object) null, com.applovin.impl.sdk.l.p());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7854f = (String) c5.a(b5.f6144o, (Object) null, com.applovin.impl.sdk.l.p());

    public p7(com.applovin.impl.sdk.l lVar) {
        this.f7849a = lVar;
        a(f());
    }

    public String a() {
        return this.f7852d;
    }

    public String b() {
        return this.f7853e;
    }

    public String c() {
        return this.f7851c;
    }

    public String d() {
        return this.f7854f;
    }

    public String e() {
        return this.f7850b;
    }

    private String a(b5 b5Var) {
        String str = (String) c5.a(b5Var, (Object) null, com.applovin.impl.sdk.l.p());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        c5.b(b5Var, lowerCase, com.applovin.impl.sdk.l.p());
        return lowerCase;
    }

    private String f() {
        if (!((Boolean) this.f7849a.a(z4.Q3)).booleanValue()) {
            this.f7849a.c(b5.f6140k);
        }
        String str = (String) this.f7849a.a(b5.f6140k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f7849a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7849a.Q().a("AppLovinSdk", GEmOVMyH.kShbXbw + str + ") from previous session");
        }
        return str;
    }

    public void b(String str) {
        this.f7853e = str;
        c5.b(b5.f6143n, str, com.applovin.impl.sdk.l.p());
    }

    public void c(String str) {
        this.f7854f = str;
        c5.b(b5.f6144o, str, com.applovin.impl.sdk.l.p());
    }

    public void a(String str) {
        if (((Boolean) this.f7849a.a(z4.Q3)).booleanValue()) {
            this.f7849a.b(b5.f6140k, str);
        }
        this.f7850b = str;
        this.f7849a.u().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.l lVar) {
        b5 b5Var = b5.f6145p;
        String str = (String) lVar.a(b5Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        lVar.b(b5Var, strValueOf);
        return strValueOf;
    }
}
