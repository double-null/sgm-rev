package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f8163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f8164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f6.b f8165i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            s5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (s5.this.f8164h != null) {
                s5.this.f8164h.onPostbackSuccess(s5.this.f8163g.f());
            }
        }
    }

    public s5(com.applovin.impl.sdk.network.e eVar, f6.b bVar, com.applovin.impl.sdk.l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", lVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8163g = eVar;
        this.f8164h = appLovinPostbackListener;
        this.f8165i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f8163g, b());
        bVar.a(this.f8165i);
        b().s0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f8163g.f())) {
            if (this.f8163g.u()) {
                b().z0().a(this.f8163g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.d(this.f6991b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f8164h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f8163g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    class b extends o6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f8167n;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
            this.f8167n = s5.this.f8163g.f();
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f6990a.c(z4.f9251i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                s0.c(jSONObject, this.f6990a);
                                s0.b(jSONObject, this.f6990a);
                                s0.a(jSONObject, this.f6990a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (s5.this.f8164h != null) {
                s5.this.f8164h.onPostbackSuccess(this.f8167n);
            }
            if (s5.this.f8163g.t()) {
                this.f6990a.u().a(s5.this.f8163g.s(), this.f8167n, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f8167n);
            }
            if (s5.this.f8164h != null) {
                s5.this.f8164h.onPostbackFailure(this.f8167n, i10);
            }
            if (s5.this.f8163g.t()) {
                this.f6990a.u().a(s5.this.f8163g.s(), this.f8167n, i10, obj, str2, false);
            }
        }
    }
}
