package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class n5 extends k5 implements x3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f7688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f7689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final String f7690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection f7692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f7694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ExecutorService f7695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ExecutorService f7696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected List f7697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d0 f7698q;

    class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f7699a;

        a(e0.a aVar) {
            this.f7699a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.p pVar = n5.this.f6992c;
                if (com.applovin.impl.sdk.p.a()) {
                    n5 n5Var = n5.this;
                    n5Var.f6992c.b(n5Var.f6991b, "Failed to cache video");
                }
                n5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", n5.this.f7688g.getAdIdNumber());
                n5.this.f6990a.u().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.p pVar2 = n5.this.f6992c;
            if (com.applovin.impl.sdk.p.a()) {
                n5 n5Var2 = n5.this;
                n5Var2.f6992c.a(n5Var2.f6991b, "Finish caching video for ad #" + n5.this.f7688g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f7699a.a(uri);
        }
    }

    class b implements d0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f7701a;

        b(c cVar) {
            this.f7701a = cVar;
        }

        @Override // com.applovin.impl.d0.d
        public void a(String str, boolean z10) {
            if (z10) {
                n5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            c cVar = this.f7701a;
            if (cVar != null) {
                cVar.a(str);
            }
        }
    }

    public interface c {
        void a(String str);
    }

    n5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, lVar);
        this.f7690i = UUID.randomUUID().toString();
        this.f7694m = new Object();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f7688g = bVar;
        this.f7689h = appLovinAdLoadListener;
        this.f7691j = lVar.I();
        this.f7692k = g();
        if (((Boolean) lVar.a(z4.J0)).booleanValue()) {
            if (lVar.s0().e()) {
                this.f7695n = lVar.s0().a();
                this.f7696o = lVar.s0().d();
                return;
            }
            String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
            this.f7695n = lVar.s0().a("com.applovin.sdk.caching." + mediationServeId, ((Integer) lVar.a(z4.L0)).intValue());
            this.f7696o = lVar.s0().a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) lVar.a(z4.M0)).intValue());
        }
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f6990a.a(z4.E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // com.applovin.impl.x3.a
    public void a(a3 a3Var) {
        if (a3Var.T().equalsIgnoreCase(this.f7688g.getMediationServeId())) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Updating flag for timeout...");
            }
            f();
        }
        this.f6990a.b0().b(this);
    }

    Uri b(String str) {
        return b(str, this.f7688g.V(), true);
    }

    protected String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f7691j.a(str, list, z10, h2.a((AppLovinAdImpl) this.f7688g));
            if (inputStreamA == null) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                return null;
            }
            try {
                String strA = this.f7691j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } catch (Throwable th) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Unknown failure to read input stream.", th3);
            }
            this.f6992c.a(this.f6991b, th3);
            this.f6990a.E().a(this.f6991b, "readInputStreamAsString", th3);
            return null;
        }
    }

    protected void f() {
        this.f7693l = true;
        List list = this.f7697p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f7697p.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f6990a.s0().e()) {
            d0 d0Var = this.f7698q;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f7695n;
        if (executorService != null) {
            executorService.shutdown();
            this.f7695n = null;
        }
        ExecutorService executorService2 = this.f7696o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f7696o = null;
        }
    }

    protected void h() {
        this.f6990a.b0().b(this);
        if (!this.f6990a.s0().e()) {
            ExecutorService executorService = this.f7695n;
            if (executorService != null) {
                executorService.shutdown();
                this.f7695n = null;
            }
            ExecutorService executorService2 = this.f7696o;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f7696o = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f7688g.getAdZone().d();
        if (((Boolean) this.f6990a.a(z4.f9189b1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f6990a.i().b(this.f7688g);
        }
        this.f6990a.f0().a(this.f7690i);
    }

    protected boolean i() {
        return this.f7693l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7688g.b1()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Subscribing to timeout events...");
            }
            this.f6990a.b0().a(this);
        }
    }

    Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Caching video " + str + "...");
        }
        int iA = this.f6990a.I().a(str, this.f7688g);
        Map mapA = h2.a((AppLovinAdImpl) this.f7688g);
        String strA = this.f7691j.a(a(), str, this.f7688g.getCachePrefix(), list, z10, iA, this.f7690i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f7691j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Finish caching video for ad #" + this.f7688g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    void e() {
        synchronized (this.f7694m) {
            if (this.f7689h == null) {
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Rendered new ad:" + this.f7688g);
            }
            final AppLovinAdLoadListener appLovinAdLoadListener = this.f7689h;
            this.f7689h = null;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.nc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7717a.a(appLovinAdLoadListener);
                }
            });
        }
    }

    protected List a(List list) {
        this.f7697p = list;
        return this.f6990a.s0().a(list, this.f7695n);
    }

    protected e0 a(String str, e0.a aVar) {
        return a(str, this.f7688g.V(), true, aVar);
    }

    protected e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f6992c.a(this.f6991b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Caching video " + str + "...");
        }
        return new e0(str, this.f7688g, list, z10, this.f7690i, this.f6990a, new a(aVar));
    }

    private String c(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f6990a.a(z4.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        List listS = bVar.S();
        List listJ = bVar.J();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < sb2.length()) {
                if (i()) {
                    return str;
                }
                iIndexOf = sb2.indexOf(str2, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = sb2.length();
                int i11 = iIndexOf;
                while (!this.f7692k.contains(Character.valueOf(sb2.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 > iIndexOf && i11 != length) {
                    String strSubstring = sb2.substring(str2.length() + iIndexOf, i11);
                    String str3 = str2 + strSubstring;
                    if (StringUtils.isValidString(strSubstring) && !listJ.contains(str3)) {
                        if (listS.contains(str3)) {
                            Uri uriA = a(str2, strSubstring);
                            if (uriA != null) {
                                sb2.replace(iIndexOf, i11, uriA.toString());
                                bVar.a(uriA.toString(), str3);
                            } else {
                                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                this.f7693l = true;
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f6992c.b(this.f6991b, "Failed to cache HTML Resource: " + str3);
                                }
                                a(str3, "cacheHtmlResource", h2.a((AppLovinAdImpl) bVar));
                            }
                            listS = listS;
                        } else {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6992c.a(this.f6991b, "Skip caching of uncategorized resource: " + strSubstring);
                            }
                            arrayList.add(str3);
                        }
                    } else {
                        listS = listS;
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f6992c.a(this.f6991b, "Skip caching of optional or non-resource: " + strSubstring);
                        }
                    }
                    i10 = i11;
                    listS = listS;
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.b(this.f6991b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        bVar.a(arrayList);
        return sb2.toString();
    }

    protected d0 a(String str, List list, c cVar) {
        d0 d0Var = new d0(str, this.f7688g, list, this.f7696o, this.f7690i, this.f6990a, new b(cVar));
        this.f7698q = d0Var;
        return d0Var;
    }

    Uri a(String str, List list, boolean z10) {
        try {
            int iA = this.f6990a.I().a(str, this.f7688g);
            Map mapA = h2.a((AppLovinAdImpl) this.f7688g);
            String strA = this.f7691j.a(a(), str, this.f7688g.getCachePrefix(), list, z10, iA, this.f7690i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f7691j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.b(this.f6991b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6992c.b(this.f6991b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Failed to cache image at url = " + str, th);
            }
            Map mapA2 = h2.a((AppLovinAdImpl) this.f7688g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f6990a.E().a(this.f6991b, "cacheImageResource", th, mapA2);
            return null;
        }
    }

    private String b(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f6990a.a(z4.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        List listS = bVar.S();
        List listJ = bVar.J();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < sb2.length()) {
                if (i()) {
                    return str;
                }
                iIndexOf = sb2.indexOf(str2, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = sb2.length();
                int i11 = iIndexOf;
                while (!this.f7692k.contains(Character.valueOf(sb2.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 > iIndexOf && i11 != length) {
                    String strSubstring = sb2.substring(str2.length() + iIndexOf, i11);
                    String str3 = str2 + strSubstring;
                    if (StringUtils.isValidString(strSubstring) && !listJ.contains(str3)) {
                        Uri uriA = a(str2, strSubstring);
                        if (uriA != null) {
                            sb2.replace(iIndexOf, i11, uriA.toString());
                            bVar.a(uriA.toString(), str3);
                        } else {
                            if (listS.contains(str3)) {
                                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                this.f7693l = true;
                            }
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6992c.b(this.f6991b, "Failed to cache HTML Resource: " + str3);
                            }
                            a(str3, "cacheHtmlResource", h2.a((AppLovinAdImpl) bVar));
                        }
                    } else if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.a(this.f6991b, "Skip caching of optional or non-resource: " + strSubstring);
                    }
                    i10 = i11;
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6992c.b(this.f6991b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        return sb2.toString();
    }

    String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (((Boolean) this.f6990a.a(z4.Z0)).booleanValue()) {
            return c(str, list, bVar);
        }
        return b(str, list, bVar);
    }

    private Uri a(String str, String str2) {
        File fileA = this.f7691j.a(q7.a(Uri.parse(str2), this.f7688g.getCachePrefix(), this.f6990a), com.applovin.impl.sdk.l.p());
        if (fileA == null) {
            return null;
        }
        String str3 = str + str2;
        if (!this.f7691j.a(fileA, str3, Arrays.asList(str), this.f6990a.I().a(str3, this.f7688g), this.f7690i, h2.a((AppLovinAdImpl) this.f7688g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    void a(int i10) {
        synchronized (this.f7694m) {
            if (this.f7689h == null) {
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Calling back ad load failed with error code: " + i10);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f7689h;
            this.f7689h = null;
            appLovinAdLoadListener.failedToReceiveAd(i10);
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        appLovinAdLoadListener.adReceived(this.f7688g);
    }

    protected void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f6990a.E().a(f2.V0, str2, map2);
    }
}
