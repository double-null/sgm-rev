package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f7735h;

    public o0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
        super("CommunicatorRequestTask", lVar, str);
        this.f7734g = str;
        this.f7735h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6990a.s0().a(new a(this.f7735h, this.f6990a, d()));
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10) {
            super(aVar, lVar, z10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f6990a.u().a(o0.this.f7734g, o0.this.f7735h.f(), i10, jSONObject, null, true);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f6990a.u().a(o0.this.f7734g, o0.this.f7735h.f(), i10, jSONObject, str2, false);
        }
    }
}
