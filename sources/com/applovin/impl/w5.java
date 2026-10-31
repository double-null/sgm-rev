package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class w5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9011g;

    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public w5(com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskFetchDeveloperUri", lVar);
        this.f9011g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f6990a.B().G().get("package_name"));
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f6990a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.f6990a).c("GET").b("https://play.google.com/store/apps/details?id=" + strValueOf).a((Object) "").a(false).a(), this.f6990a));
    }

    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "No developer URI found - response from the Play Store is empty");
                }
                w5.this.f9011g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                w5.this.f9011g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "Developer URI (" + strGroup + ") is not valid");
                }
                w5.this.f9011g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Found developer URI: " + strGroup);
            }
            w5.this.f9011g.a(strGroup);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i10);
            }
            w5.this.f9011g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
