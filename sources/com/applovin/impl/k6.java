package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class k6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f6996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f6997h;

    private static final class a extends v7 {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
            super(jSONObject, jSONObject2, lVar);
        }

        void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f8954b.add(q8Var);
        }
    }

    private static final class b extends k6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f6998i;

        b(String str, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            this.f6998i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            q8 q8VarB = b(this.f6998i);
            if (q8VarB != null) {
                a(q8VarB);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to process XML: " + this.f6998i);
            }
            c(this.f6998i);
            a(w7.XML_PARSING);
        }
    }

    private static final class c extends k6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JSONObject f6999i;

        c(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            this.f6999i = v7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f6999i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "No VAST response received.");
                }
                a(w7.NO_WRAPPER_RESPONSE);
                return;
            }
            if (string.length() >= ((Integer) this.f6990a.a(z4.U4)).intValue()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "VAST response is over max length");
                }
                a(w7.XML_PARSING);
                return;
            }
            q8 q8VarB = b(string);
            if (q8VarB != null) {
                a(q8VarB);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to process XML: " + string);
            }
            c(string);
            a(w7.XML_PARSING);
        }
    }

    private static final class d extends k6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final q8 f7000i;

        d(q8 q8Var, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            if (q8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (v7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f7000i = q8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Processing VAST Wrapper response...");
            }
            a(this.f7000i);
        }
    }

    k6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessVastResponse", lVar);
        if (v7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f6996g = appLovinAdLoadListener;
        this.f6997h = (a) v7Var;
    }

    public static k6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new c(new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    protected q8 b(String str) {
        try {
            return r8.a(str, this.f6990a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Failed to process VAST response", th);
            }
            a(w7.XML_PARSING);
            this.f6990a.E().a(this.f6991b, th);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f6990a.a(z4.f9301n5)), 1).iterator();
        while (it.hasNext()) {
            q8 q8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (q8VarB != null) {
                this.f6997h.a(q8VarB);
            }
        }
    }

    public static k6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new b(str, new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    public static k6 a(q8 q8Var, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new d(q8Var, v7Var, appLovinAdLoadListener, lVar);
    }

    void a(q8 q8Var) {
        int iD = this.f6997h.d();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Finished parsing XML at depth " + iD);
        }
        this.f6997h.a(q8Var);
        if (d8.b(q8Var)) {
            int iIntValue = ((Integer) this.f6990a.a(z4.V4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.a(this.f6991b, "VAST response is wrapper. Resolving...");
                }
                this.f6990a.s0().a(new s6(this.f6997h, this.f6996g, this.f6990a));
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(w7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (d8.a(q8Var)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "VAST response is inline. Rendering ad...");
            }
            this.f6990a.s0().a(new n6(this.f6997h, this.f6996g, this.f6990a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "VAST response is an error");
        }
        a(w7.NO_WRAPPER_RESPONSE);
    }

    void a(w7 w7Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "Failed to process VAST response due to VAST error code " + w7Var);
        }
        d8.a(this.f6997h, this.f6996g, w7Var, -6, this.f6990a);
    }
}
