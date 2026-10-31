package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c2.YDwL.tFQWuE;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f6613b;

    /* JADX INFO: loaded from: classes.dex */
    class a extends androidx.browser.customtabs.e {
        a() {
        }

        @Override // androidx.browser.customtabs.e
        public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
            g1.this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f6612a.Q().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            g1.this.f6613b = cVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            g1.this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                g1.this.f6612a.Q().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            g1.this.f6613b = null;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private class b extends androidx.browser.customtabs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f6615a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f6615a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.b
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f6615a.get();
            if (aVar == null) {
                g1.this.f6612a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f6612a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                g1.this.f6612a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f6612a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackCustomTabsNavigationStarted(bVarG);
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackCustomTabsNavigationFinished(bVarG);
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackCustomTabsNavigationFailed(bVarG);
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackCustomTabsNavigationAborted(bVarG);
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    v2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    v2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    g1.this.f6612a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        g1.this.f6612a.Q().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.b
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            g1.this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ = g1.this.f6612a.Q();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Validation ");
                sb2.append(z10 ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                pVarQ.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    private class c extends androidx.browser.customtabs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f6617a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f6617a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.b
        public void onNavigationEvent(int i10, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f6617a.get();
            if (appLovinNativeAdImpl == null) {
                g1.this.f6612a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    g1.this.f6612a.Q().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Native ad is null.");
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        g1.this.f6612a.l().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    g1.this.f6612a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        g1.this.f6612a.Q().a("CustomTabsManager", "Unknown navigation event: " + i10);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.b
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            g1.this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ = g1.this.f6612a.Q();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tFQWuE.emrXOPDov);
                sb2.append(z10 ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                pVarQ.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public g1(com.applovin.impl.sdk.l lVar) {
        this.f6612a = lVar;
    }

    public void b(final List list, final androidx.browser.customtabs.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        if (fVar != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.ha
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6770a.a(list, fVar);
                }
            });
            return;
        }
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f6612a.a(z4.f9312o7)).booleanValue() && this.f6613b == null) {
            String strE = androidx.browser.customtabs.c.e(com.applovin.impl.sdk.l.p(), this.f6612a.c(z4.f9321p7), true);
            String strD = androidx.browser.customtabs.c.d(com.applovin.impl.sdk.l.p(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f6612a.a(z4.f9330q7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strD, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strE, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strE, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strD, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f6612a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6612a.Q().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(h1 h1Var, androidx.browser.customtabs.f fVar) {
        this.f6613b.h(0L);
        if (h1Var == null) {
            return;
        }
        Integer numE = h1Var.e();
        String strB = h1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (fVar == null) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        fVar.k(numE.intValue(), Uri.parse(strB), null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_GENERATE] */
    private void a(LinkedList linkedList) {
        boolean zA = false;
        try {
            zA = androidx.browser.customtabs.c.a(com.applovin.impl.sdk.l.p(), (String) linkedList.poll(), new a());
            if (!zA) {
                this.f6612a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6612a.Q().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (zA || linkedList.isEmpty()) {
                return;
            }
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
            }
        } catch (Throwable th) {
            try {
                this.f6612a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6612a.Q().a("CustomTabsManager", "Failed to bind to service", th);
                }
            } finally {
                if (!zA && !linkedList.isEmpty()) {
                    this.f6612a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6612a.Q().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
    }

    public androidx.browser.customtabs.f a(com.applovin.impl.adview.a aVar) {
        if (this.f6613b == null) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            androidx.browser.customtabs.f fVarF = this.f6613b.f(new b(aVar));
            a(fVarF, aVar.g());
            return fVarF;
        } catch (Exception e10) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    public androidx.browser.customtabs.f a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f6613b == null) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            androidx.browser.customtabs.f fVarF = this.f6613b.f(new c(appLovinNativeAdImpl));
            a(fVarF, appLovinNativeAdImpl);
            return fVarF;
        } catch (Exception e10) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, androidx.browser.customtabs.f fVar) {
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zG = fVar.g(Uri.parse(str), null, arrayList);
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVarQ = this.f6612a.Q();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Warmup for URLs ");
            sb2.append(zG ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
            pVarQ.a("CustomTabsManager", sb2.toString());
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.ia
            @Override // java.lang.Runnable
            public final void run() {
                this.f6851a.a(aVar, activity, uri);
            }
        })) {
            this.f6612a.o0().pauseForClick();
            return;
        }
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).a(activity, uri);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        androidx.browser.customtabs.f customTabsSession = appLovinNativeAdImpl.getCustomTabsSession();
        String str = UICvx.CNjdMD;
        if (customTabsSession == null) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().b(str, "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new Runnable() { // from class: com.applovin.impl.ga
            @Override // java.lang.Runnable
            public final void run() {
                this.f6701a.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (zA) {
            this.f6612a.o0().pauseForClick();
        } else {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().b(str, "Opening in Custom Tabs failed: " + uri);
            }
            a(uri, activity);
        }
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).a(activity, uri);
    }

    private void a(androidx.browser.customtabs.f fVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), fVar);
    }

    private void a(androidx.browser.customtabs.f fVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), fVar);
    }

    private void a(final h1 h1Var, final androidx.browser.customtabs.f fVar) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.ja
            @Override // java.lang.Runnable
            public final void run() {
                this.f6925a.b(h1Var, fVar);
            }
        });
    }

    private androidx.browser.customtabs.d a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private androidx.browser.customtabs.d a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private androidx.browser.customtabs.d a(h1 h1Var, Bundle bundle, androidx.browser.customtabs.f fVar, Activity activity) {
        this.f6612a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f6612a.Q().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        androidx.browser.customtabs.d.C0023d c0023d = new androidx.browser.customtabs.d.C0023d(fVar);
        if (((Boolean) this.f6612a.a(z4.f9339r7)).booleanValue()) {
            int i10 = R.anim.applovin_slide_up_animation;
            int i11 = R.anim.applovin_slide_down_animation;
            c0023d.o(activity, i10, i11);
            c0023d.f(activity, i10, i11);
        }
        if (h1Var != null) {
            Integer numH = h1Var.h();
            if (numH != null) {
                c0023d.e(new androidx.browser.customtabs.a.C0020a().b(numH.intValue()).a());
            }
            Integer numA = h1Var.a();
            if (numA != null) {
                c0023d.c(2, new androidx.browser.customtabs.a.C0020a().b(numA.intValue()).a());
            }
            Boolean boolI = h1Var.i();
            if (boolI != null) {
                c0023d.q(boolI.booleanValue());
            }
            Boolean boolG = h1Var.g();
            if (boolG != null) {
                c0023d.n(boolG.booleanValue());
            }
            Boolean boolC = h1Var.c();
            if (boolC != null) {
                c0023d.i(boolC.booleanValue());
            }
            Integer numF = h1Var.f();
            if (numF != null) {
                c0023d.m(numF.intValue());
            }
        }
        androidx.browser.customtabs.d dVarA = c0023d.a();
        if (h1Var != null) {
            String strD = h1Var.d();
            if (strD != null) {
                dVarA.f1558a.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                dVarA.f1558a.putExtra("com.android.browser.headers", bundle);
            }
        }
        return dVarA;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f6612a.a(z4.f9348s7)).booleanValue()) {
            n7.a(uri, activity, this.f6612a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f6612a.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return true;
            }
            this.f6612a.Q().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f6612a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f6612a.Q().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f6612a.E().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
