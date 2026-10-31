package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f6835c;

    public i7(com.applovin.impl.sdk.l lVar) {
        this.f6833a = lVar;
        b5 b5Var = b5.I;
        this.f6834b = ((Boolean) lVar.a(b5Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.l.p()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || lVar.B().T();
        lVar.c(b5Var);
    }

    private void e() {
        com.applovin.impl.sdk.k kVarU = this.f6833a.u();
        if (this.f6834b) {
            kVarU.b(this.f6835c);
        } else {
            kVarU.a(this.f6835c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f6835c;
    }

    public boolean c() {
        return this.f6834b;
    }

    public boolean d() {
        List list = this.f6835c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f6835c == null) {
            return;
        }
        if (list == null || !list.equals(this.f6835c)) {
            this.f6835c = list;
            e();
        }
    }

    public void a() {
        this.f6833a.b(b5.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f6834b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.m mVarB = this.f6833a.B();
        boolean zT = mVarB.T();
        String strA = mVarB.f().a();
        com.applovin.impl.sdk.m.b bVarH = mVarB.H();
        this.f6834b = zT || JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f8501a : null, jSONArray);
    }
}
