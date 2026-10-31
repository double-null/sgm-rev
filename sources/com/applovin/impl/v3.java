package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: loaded from: classes.dex */
public class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f8936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8937b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    protected v3(a aVar, String str) {
        this.f8936a = aVar;
        this.f8937b = str;
    }

    public a a() {
        return this.f8936a;
    }

    public String b() {
        return this.f8937b;
    }

    public static v3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new v3(a.AD_UNIT_ID, str);
    }

    public static v3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new v3(a.AD_FORMAT, label);
    }

    public static v3 a(a3 a3Var) {
        String strT = a3Var.T();
        MaxAdFormat format = a3Var.getFormat();
        if (TextUtils.isEmpty(strT) || format == null) {
            return null;
        }
        return new s3(new l3(strT, format));
    }
}
