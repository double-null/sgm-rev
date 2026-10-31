package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f6293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f6295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d f6296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f6297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f6298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f6299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f6300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f6301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f6302o;

    class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6303a;

        a(String str) {
            this.f6303a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f6212a.a(z4.U0)).booleanValue()) {
                    synchronized (d0.this.f6298k) {
                        StringUtils.replaceAll(d0.this.f6297j, this.f6303a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f6297j, this.f6303a, uri.toString());
                }
                d0.this.f6294g.a(uri.toString(), this.f6303a);
                return;
            }
            com.applovin.impl.sdk.p pVar = d0.this.f6214c;
            if (com.applovin.impl.sdk.p.a()) {
                d0 d0Var = d0.this;
                d0Var.f6214c.a(d0Var.f6213b, "Failed to cache JavaScript resource " + this.f6303a);
            }
            if (d0.this.f6296i != null) {
                d0.this.f6296i.a(d0.this.f6293f, true);
            }
        }
    }

    class b implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6307c;

        b(String str, String str2, String str3) {
            this.f6305a = str;
            this.f6306b = str2;
            this.f6307c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f6212a.a(z4.U0)).booleanValue()) {
                    synchronized (d0.this.f6298k) {
                        StringUtils.replaceAll(d0.this.f6297j, this.f6305a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f6297j, this.f6305a, uri.toString());
                }
                d0.this.f6294g.a(uri.toString(), this.f6305a);
                return;
            }
            if (!d0.this.f6294g.S().contains(this.f6306b + this.f6307c) || d0.this.f6296i == null) {
                return;
            }
            d0.this.f6296i.a(d0.this.f6293f, true);
        }
    }

    class c implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6309a;

        c(String str) {
            this.f6309a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                if (d0.this.f6296i != null) {
                    d0.this.f6296i.a(d0.this.f6293f, true);
                }
            } else {
                if (((Boolean) d0.this.f6212a.a(z4.U0)).booleanValue()) {
                    synchronized (d0.this.f6298k) {
                        StringUtils.replaceAll(d0.this.f6297j, this.f6309a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f6297j, this.f6309a, uri.toString());
                }
                d0.this.f6294g.a(uri.toString(), this.f6309a);
            }
        }
    }

    public interface d {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.l lVar, d dVar) {
        super("AsyncTaskCacheHTMLResources", lVar);
        this.f6293f = str;
        this.f6294g = bVar;
        this.f6295h = list;
        this.f6299l = executorService;
        this.f6300m = str2;
        this.f6296i = dVar;
        this.f6297j = new StringBuffer(str);
        this.f6298k = new Object();
    }

    private HashSet f() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f6293f, (String) this.f6212a.a(z4.f9292m5)), 1)) {
            if (this.f6216e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f6294g, Collections.emptyList(), false, this.f6300m, this.f6212a, new a(str)));
            } else if (com.applovin.impl.sdk.p.a()) {
                this.f6214c.a(this.f6213b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    private Collection g() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f6212a.a(z4.E0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f6299l.submit((e0) it.next()));
        }
        this.f6302o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        List listJ = this.f6294g.J();
        Collection collectionG = g();
        for (String str : this.f6295h) {
            char c10 = 0;
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < this.f6293f.length()) {
                if (this.f6216e.get()) {
                    return null;
                }
                iIndexOf = this.f6293f.indexOf(str, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f6293f.length();
                int i11 = iIndexOf;
                while (!collectionG.contains(Character.valueOf(this.f6293f.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6214c.b(this.f6213b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f6293f.substring(str.length() + iIndexOf, i11);
                String str2 = str + strSubstring;
                if (StringUtils.isValidString(strSubstring) && !listJ.contains(str2)) {
                    com.applovin.impl.sdk.ad.b bVar = this.f6294g;
                    String[] strArr = new String[1];
                    strArr[c10] = str;
                    hashSet.add(new e0(str2, bVar, Arrays.asList(strArr), true, this.f6300m, this.f6212a, new b(str2, str, strSubstring)));
                } else if (com.applovin.impl.sdk.p.a()) {
                    this.f6214c.a(this.f6213b, "Skip caching of optional or non-resource " + strSubstring);
                }
                i10 = i11;
                c10 = 0;
            }
        }
        return hashSet;
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        List listS = this.f6294g.S();
        List listJ = this.f6294g.J();
        ArrayList arrayList = new ArrayList();
        Collection collectionG = g();
        for (String str : this.f6295h) {
            char c10 = 0;
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < this.f6293f.length()) {
                if (this.f6216e.get()) {
                    return null;
                }
                iIndexOf = this.f6293f.indexOf(str, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f6293f.length();
                int i11 = iIndexOf;
                while (!collectionG.contains(Character.valueOf(this.f6293f.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6214c.b(this.f6213b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f6293f.substring(str.length() + iIndexOf, i11);
                String str2 = str + strSubstring;
                if (!StringUtils.isValidString(strSubstring) || listJ.contains(str2)) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6214c.a(this.f6213b, "Skip caching of optional or non-resource " + strSubstring);
                    }
                } else if (listS.contains(str2)) {
                    com.applovin.impl.sdk.ad.b bVar = this.f6294g;
                    String[] strArr = new String[1];
                    strArr[c10] = str;
                    hashSet.add(new e0(str2, bVar, Arrays.asList(strArr), true, this.f6300m, this.f6212a, new c(str2)));
                } else {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6214c.a(this.f6213b, "Skip caching of uncategorized resource: " + strSubstring);
                    }
                    arrayList.add(str2);
                }
                i10 = i11;
                c10 = 0;
            }
        }
        this.f6294g.a(arrayList);
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetF;
        if (this.f6216e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f6293f)) {
            a(this.f6293f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f6212a.a(z4.F0)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6214c.a(this.f6213b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f6293f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetE = ((Boolean) this.f6212a.a(z4.Z0)).booleanValue() ? e() : d();
        if (hashSetE != null) {
            hashSet.addAll(hashSetE);
        }
        if (((Boolean) this.f6212a.a(z4.f9283l5)).booleanValue() && (hashSetF = f()) != null) {
            hashSet.addAll(hashSetF);
        }
        this.f6301n = new ArrayList(hashSet);
        if (this.f6216e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f6301n;
        if (list == null || list.isEmpty()) {
            a(this.f6293f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6214c.a(this.f6213b, "Executing " + this.f6301n.size() + " caching operations...");
        }
        if (this.f6212a.s0().e()) {
            a(this.f6301n);
        } else {
            this.f6299l.invokeAll(this.f6301n);
        }
        if (((Boolean) this.f6212a.a(z4.U0)).booleanValue()) {
            synchronized (this.f6298k) {
                a(this.f6297j.toString());
            }
        } else {
            a(this.f6297j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f6301n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f6302o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        d dVar;
        if (this.f6216e.get() || (dVar = this.f6296i) == null) {
            return;
        }
        dVar.a(str, false);
    }
}
