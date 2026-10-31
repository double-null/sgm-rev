package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f6396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f6397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f6398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f6400l;

    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.l lVar, a aVar) {
        super("AsyncTaskCacheResource", lVar);
        this.f6394f = str;
        this.f6395g = bVar;
        this.f6396h = list;
        this.f6397i = z10;
        this.f6398j = str2;
        this.f6399k = lVar;
        this.f6400l = aVar;
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f6216e.get() || (aVar = this.f6400l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f6216e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f6399k.I().a(a(), this.f6394f, this.f6395g.getCachePrefix(), this.f6396h, this.f6397i, this.f6399k.I().a(this.f6394f, this.f6395g), this.f6398j, h2.a((AppLovinAdImpl) this.f6395g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f6216e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f6399k.I().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6214c.b(this.f6213b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f6216e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6214c.b(this.f6213b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f6216e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6394f.equals(((e0) obj).f6394f);
    }

    public int hashCode() {
        String str = this.f6394f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
