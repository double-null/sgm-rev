package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* JADX INFO: loaded from: classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f7871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7874d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f7873c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f7874d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f7871a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f7872b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.f7871a = code;
        this.f7872b = str;
        this.f7873c = i10;
        this.f7874d = str2;
    }
}
