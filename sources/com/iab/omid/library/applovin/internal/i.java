package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f12577f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f12578a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f12579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f12580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f12581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f12582e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f12579b = eVar;
        this.f12580c = bVar;
    }

    private c a() {
        if (this.f12582e == null) {
            this.f12582e = c.c();
        }
        return this.f12582e;
    }

    public static i c() {
        if (f12577f == null) {
            f12577f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f12577f;
    }

    public float b() {
        return this.f12578a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f12581d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f12581d.c();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f12578a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f12581d = this.f12579b.a(new Handler(), context, this.f12580c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
