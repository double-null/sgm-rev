package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f12565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f12567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12568d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f12565a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f12566b = view.getClass().getCanonicalName();
        this.f12567c = friendlyObstructionPurpose;
        this.f12568d = str;
    }

    public String a() {
        return this.f12568d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f12567c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f12565a;
    }

    public String d() {
        return this.f12566b;
    }
}
