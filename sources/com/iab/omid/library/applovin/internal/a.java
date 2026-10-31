package com.iab.omid.library.applovin.internal;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class a implements d.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f12552f = new a(new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f12553a = new com.iab.omid.library.applovin.utils.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f12554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f12556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12557e;

    private a(d dVar) {
        this.f12556d = dVar;
    }

    public static a a() {
        return f12552f;
    }

    private void c() {
        if (!this.f12555c || this.f12554b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f12554b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f12553a.a();
        Date date = this.f12554b;
        if (date == null || dateA.after(date)) {
            this.f12554b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f12555c) {
            return;
        }
        this.f12556d.a(context);
        this.f12556d.a(this);
        this.f12556d.e();
        this.f12557e = this.f12556d.c();
        this.f12555c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f12557e && z10) {
            d();
        }
        this.f12557e = z10;
    }
}
