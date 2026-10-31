package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class u5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f8886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8888i;

    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public u5(com.applovin.impl.sdk.l lVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", lVar);
        this.f8887h = str;
        this.f8886g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f8887h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f6990a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f8888i = uriBuild.toString();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Looking up app-ads.txt at " + this.f8888i);
        }
        this.f6990a.s0().a(new a(aVarA, this.f6990a));
    }

    /* JADX INFO: loaded from: classes2.dex */
    class a extends o6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "No app-ads.txt found");
                }
                u5.this.f8886g.a(b0.b.APPADSTXT_NOT_FOUND, u5.this.f8888i);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.a(this.f6991b, UICvx.KpHOrYvbmpwciG);
                }
                u5.this.f8886g.a(str2, u5.this.f8888i);
            }
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            u5.this.f8886g.a(b0.b.APPADSTXT_NOT_FOUND, u5.this.f8888i);
        }
    }
}
