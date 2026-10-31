package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7041c;

    l1(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f7039a = JsonUtils.getString(jSONObject, "name", "");
        this.f7040b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f7041c = q7.a(list);
        } else {
            this.f7041c = q7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
    }

    public String a() {
        return this.f7040b;
    }

    public String b() {
        return this.f7039a;
    }

    public boolean c() {
        return this.f7041c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null || q7.a(str2, str) != 1) {
            return str3 == null || q7.a(str3, str) != -1;
        }
        return false;
    }
}
