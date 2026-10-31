package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;

/* JADX INFO: loaded from: classes.dex */
public class c7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f6262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f6263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f6264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f6265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f6267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f6268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f6269j;

    public c7(com.applovin.impl.sdk.l lVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.l.p());
        this.f6261b = defaultSharedPreferences;
        this.f6260a = lVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f6262c = a(b5.f6150u.a());
        this.f6263d = a(b5.f6151v.a());
        this.f6264e = h();
        this.f6265f = (String) c5.a(b5.f6153x, (Object) null, defaultSharedPreferences, false);
        this.f6266g = (String) c5.a(b5.f6154y, (Object) null, defaultSharedPreferences, false);
        this.f6267h = (String) c5.a(b5.f6155z, (Object) null, defaultSharedPreferences, false);
        this.f6268i = (String) c5.a(b5.B, (Object) null, defaultSharedPreferences, false);
        this.f6269j = (String) c5.a(b5.D, (Object) null, defaultSharedPreferences, false);
        b(this.f6266g);
    }

    private Integer h() {
        String strA = b5.f6152w.a();
        if (this.f6261b.contains(strA)) {
            Integer num = (Integer) c5.a(strA, null, Integer.class, this.f6261b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f6260a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6260a.Q().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l10 = (Long) c5.a(strA, null, Long.class, this.f6261b, false);
            if (l10 != null) {
                if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                }
                this.f6260a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6260a.Q().b("TcfManager", "Long value (" + l10 + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) c5.a(strA, null, Boolean.class, this.f6261b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) c5.a(strA, null, String.class, this.f6261b, false);
            if (str != null) {
                if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str) || ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(str)) {
                    return 1;
                }
                if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f6260a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6260a.Q().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i10) {
        return f7.a(i10, this.f6266g);
    }

    public boolean b() {
        return f7.a(this.f6266g);
    }

    public String c() {
        return this.f6266g;
    }

    public String d() {
        return a7.a(this.f6262c);
    }

    public Integer e() {
        return this.f6262c;
    }

    public Integer f() {
        return this.f6263d;
    }

    public Integer g() {
        return this.f6264e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f6262c) + a("CMP SDK Version", this.f6263d) + a(b5.f6152w.a(), this.f6264e) + a(b5.f6153x.a(), this.f6265f) + a(b5.f6154y.a(), this.f6266g);
    }

    public String j() {
        return this.f6265f;
    }

    public String k() {
        return this.f6267h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(b5.f6150u.a())) {
            this.f6262c = a(str);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6262c);
            }
            this.f6260a.S0();
            return;
        }
        if (str.equals(b5.f6151v.a())) {
            this.f6263d = a(str);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6263d);
                return;
            }
            return;
        }
        if (str.equals(b5.f6152w.a())) {
            this.f6264e = h();
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6264e);
                return;
            }
            return;
        }
        if (str.equals(b5.f6153x.a())) {
            this.f6265f = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6265f);
            }
            this.f6260a.S0();
            return;
        }
        if (str.equals(b5.f6154y.a())) {
            this.f6266g = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6266g);
            }
            b(this.f6266g);
            return;
        }
        if (str.equals(b5.f6155z.a())) {
            this.f6267h = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6267h);
                return;
            }
            return;
        }
        if (str.equals(b5.A.a())) {
            String str2 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(b5.B.a())) {
            this.f6268i = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6268i);
                return;
            }
            return;
        }
        if (str.equals(b5.C.a())) {
            String str3 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(b5.D.a())) {
            this.f6269j = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f6269j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f6260a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6260a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    private Integer a(String str) {
        if (this.f6261b.contains(str)) {
            Integer num = (Integer) c5.a(str, null, Integer.class, this.f6261b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) c5.a(str, null, Long.class, this.f6261b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) c5.a(str, null, String.class, this.f6261b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f6260a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6260a.Q().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public Boolean b(int i10) {
        String str = this.f6268i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f6269j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f6267h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i10 - 1));
    }

    private void b(String str) {
        this.f6260a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6260a.Q().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = f7.a(1301, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f6260a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6260a.Q().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                q0.b(true, com.applovin.impl.sdk.l.p());
            } else {
                this.f6260a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6260a.Q().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                q0.b(false, com.applovin.impl.sdk.l.p());
            }
            this.f6260a.S0();
            return;
        }
        this.f6260a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6260a.Q().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f6262c = null;
        this.f6264e = null;
        this.f6265f = null;
        this.f6266g = null;
        this.f6267h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n");
        sb2.append(str);
        sb2.append(" - ");
        sb2.append(obj != null ? obj.toString() : "No value set");
        return sb2.toString();
    }
}
