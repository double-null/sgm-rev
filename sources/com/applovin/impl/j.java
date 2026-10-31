package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6869b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f6870c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f6871d = Collections.synchronizedSet(new HashSet());

    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.l lVar) {
        this.f6868a = lVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.l.p()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f6871d.remove(bVar);
    }

    public void c(String str) {
        this.f6868a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6868a.Q().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f6869b) {
            this.f6870c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return j.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f6868a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6868a.Q().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f6868a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6868a.Q().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f6868a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6868a.Q().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f6868a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6868a.Q().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f6869b) {
                this.f6868a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6868a.Q().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                }
                this.f6870c.put(string, bundle);
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.f6868a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6868a.Q().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.f6871d.isEmpty()) {
                return;
            }
            HashSet<b> hashSet = new HashSet(this.f6871d);
            this.f6868a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6868a.Q().a("AdReviewManager", "Notifying listeners: " + this.f6871d);
            }
            for (final b bVar : hashSet) {
                this.f6868a.s0().a((k5) new u6(this.f6868a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.ib
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6855a.a(bVar, string, string2);
                    }
                }), f6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f6869b) {
            bundle = (Bundle) this.f6870c.get(str);
        }
        this.f6868a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6868a.Q().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.f6871d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f6868a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6868a.Q().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
