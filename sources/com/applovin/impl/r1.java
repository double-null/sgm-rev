package com.applovin.impl;

import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes.dex */
public class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f8052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a3 f8053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f8054d;

    public r1(Object obj, long j10) {
        this.f8051a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f8054d = bVar;
            this.f8052b = bVar.getAdZone().d() != null ? this.f8054d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            this.f8053c = a3Var;
            this.f8052b = a3Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f8054d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof a3) {
            this.f8053c = (a3) obj;
        }
    }

    public long b() {
        return this.f8051a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f8054d;
    }

    public String d() {
        String str = this.f8052b;
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public a3 e() {
        return this.f8053c;
    }

    public String f() {
        if (this.f8054d != null) {
            return "AppLovin";
        }
        a3 a3Var = this.f8053c;
        return a3Var != null ? a3Var.getNetworkName() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f8054d;
        return bVar != null ? bVar : this.f8053c;
    }
}
