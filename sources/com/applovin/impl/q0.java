package com.applovin.impl;

import android.content.Context;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f7933a = new a("Age Restricted User", b5.f6147r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f7934b = new a("Has User Consent", b5.f6146q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f7935c = new a("\"Do Not Sell\"", b5.f6148s);

    /* JADX INFO: loaded from: classes2.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b5 f7937b;

        a(String str, b5 b5Var) {
            this.f7936a = str;
            this.f7937b = b5Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) c5.a(this.f7937b, (Object) null, context);
            }
            com.applovin.impl.sdk.p.h(cNMUz.sBAGpMXNLjyBxh, yhXxbqGRMeI.MjSJZ + this.f7937b);
            return null;
        }

        public String a() {
            return this.f7936a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f7935c;
    }

    public static a b() {
        return f7934b;
    }

    public static a c() {
        return f7933a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(b5.f6148s, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(b5.f6146q, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f7934b, context) + a(f7935c, context);
    }

    private static boolean a(b5 b5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to update compliance value for key: " + b5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) c5.a(b5Var, (Object) null, context);
            c5.b(b5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
            if (lVar != null) {
                lVar.E().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f7936a + " - " + aVar.a(context);
    }
}
