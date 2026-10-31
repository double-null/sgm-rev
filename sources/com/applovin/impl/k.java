package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6938b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6943a;

        a(String str) {
            this.f6943a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6943a;
        }
    }

    public k(String str, com.applovin.impl.sdk.l lVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f6938b = str;
        this.f6937a = lVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f6938b.substring(d().length()), 0), Constants.ENCODING));
                this.f6937a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6937a.Q().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e10) {
                this.f6937a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6937a.Q().a("AdToken", "Unable to decode token '" + this.f6938b + "' into JSON", e10);
                }
                this.f6937a.E().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f6937a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6937a.Q().a("AdToken", "Unable to process ad response from token '" + this.f6938b + "'", e11);
            }
            this.f6937a.E().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public String b() {
        return this.f6938b;
    }

    public a c() {
        if (a(z4.f9386x0) != null) {
            return a.REGULAR;
        }
        return a(z4.f9394y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(z4.f9386x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(z4.f9394y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f6938b;
        String str2 = ((k) obj).f6938b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.f6938b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.f6938b) + ", type=" + c() + '}';
    }

    private String a(z4 z4Var) {
        for (String str : this.f6937a.c(z4Var)) {
            if (this.f6938b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
