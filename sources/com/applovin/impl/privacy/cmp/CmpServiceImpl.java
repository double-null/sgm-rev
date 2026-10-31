package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.m0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, com.applovin.impl.privacy.cmp.a.InterfaceC0116a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f7875a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f7879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f7880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f7881g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7877c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f7878d = d.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f7876b = c();

    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f7882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f7883b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        class C0115a implements f {
            C0115a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f7882a.onCompleted(appLovinCmpError);
            }
        }

        a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f7882a = onCompletedListener;
            this.f7883b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f7882a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f7883b, new C0115a());
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f7886a;

        b(Activity activity) {
            this.f7886a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f7876b.b(this.f7886a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f7888a;

        c(Activity activity) {
            this.f7888a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f7876b.a(this.f7888a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    private enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(l lVar) {
        this.f7875a = lVar;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (q7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f7875a);
        }
        if (!this.f7875a.y().j()) {
            return null;
        }
        p.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f7876b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f7876b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0116a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0116a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f7877c) {
            if (this.f7880f == null) {
                this.f7878d = d.COMPLETED;
                this.f7879e = cmpErrorImpl;
            } else {
                this.f7878d = d.NONE;
                a(cmpErrorImpl);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0116a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f7877c) {
            if (this.f7880f == null) {
                this.f7878d = d.COMPLETED;
            } else {
                this.f7878d = d.NONE;
                a((AppLovinCmpError) null);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0116a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f7881g = fVar;
        if (this.f7876b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f7875a.Q();
        if (p.a()) {
            this.f7875a.Q().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f7875a.y().j()) {
            p.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f7880f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f7880f = null;
        this.f7879e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f7881g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f7881g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f7876b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z10;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f7877c) {
            if (eVar != null) {
                this.f7880f = eVar;
            }
            d dVar = this.f7878d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f7878d = d.LOADING;
                z10 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f7878d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f7879e);
                return;
            }
            c cVar = new c(activity);
            if (this.f7876b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m0 a() {
        return new m0(this.f7875a.y().d());
    }
}
