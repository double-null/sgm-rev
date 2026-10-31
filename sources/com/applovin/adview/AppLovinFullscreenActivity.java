package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.AppRestartDuringAdDetectionService;
import com.applovin.impl.b5;
import com.applovin.impl.f2;
import com.applovin.impl.h2;
import com.applovin.impl.i0;
import com.applovin.impl.o1;
import com.applovin.impl.p0;
import com.applovin.impl.p2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.facebook.share.internal.ShareConstants;
import com.pairip.VMRunner;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinFullscreenActivity extends Activity implements o1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f5854n = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f5855o = new Object();
    public static p2 parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f5856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y1 f5857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5858c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f5860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f5861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i0 f5862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5868m;

    /* JADX INFO: loaded from: classes.dex */
    class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f5869a;

        a(Boolean bool) {
            this.f5869a = bool;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f5869a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (AppLovinFullscreenActivity.this.f5868m) {
                int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f5856a.a(z4.f9396y2)).intValue();
                Insets insets = windowInsets.getInsets(AppLovinFullscreenActivity.this.f5867l ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
            } else {
                Insets insets2 = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f5856a.a(z4.f9396y2)).intValue());
                view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            }
            return windowInsets;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    private static class c implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f5872a;

        protected c(Runnable runnable) {
            this.f5872a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.f5872a.run();
        }
    }

    public void configureSystemUiBars(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f5868m = z10 || z11 || z12;
        if (!p0.b() || !this.f5868m) {
            getWindow().setFlags(1024, 1024);
            com.applovin.impl.d.c(this);
            return;
        }
        this.f5864i = z10;
        this.f5865j = z11;
        this.f5866k = z12;
        this.f5867l = z13;
        if (z12) {
            this.f5864i = false;
            this.f5865j = false;
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        if (this.f5864i) {
            com.applovin.impl.d.b((Activity) this);
        } else {
            com.applovin.impl.d.f(this);
        }
        if (this.f5865j) {
            com.applovin.impl.d.a((Activity) this);
        } else {
            com.applovin.impl.d.e(this);
        }
    }

    @Override // com.applovin.impl.o1
    public void dismiss(String str) {
        if (p0.h() && this.f5861f != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f5861f);
            this.f5861f = null;
        }
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.a(str);
        } else {
            finishFromSdk();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        l lVar = this.f5856a;
        if (lVar != null && !this.f5859d) {
            if (((Boolean) lVar.a(z4.f9204c7)).booleanValue()) {
                p2 p2Var = parentInterstitialWrapper;
                Map mapA = h2.a((AppLovinAdImpl) (p2Var != null ? p2Var.f() : null));
                CollectionUtils.putStringIfValid("details", a(lVar), mapA);
                lVar.E().d(f2.N0, mapA);
            }
            if (((Boolean) lVar.a(z4.f9213d7)).booleanValue()) {
                return;
            }
        }
        super.finish();
    }

    public void finishFromSdk() {
        this.f5859d = true;
        finish();
    }

    public boolean isAllowingAdRenderingWithinDisplayCutout() {
        return this.f5867l;
    }

    public boolean isHidingNavigationBar() {
        return this.f5865j;
    }

    public boolean isHidingStatusBar() {
        return this.f5864i;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("CsucK873mqTFp4yj", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        VMRunner.invoke("L6KxmmhKhP4lKKCi", new Object[]{this});
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.s();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        y1 y1Var;
        try {
            super.onResume();
            if (this.f5858c.get() || (y1Var = this.f5857b) == null) {
                return;
            }
            y1Var.t();
        } catch (IllegalArgumentException e10) {
            this.f5856a.Q();
            if (p.a()) {
                this.f5856a.Q().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            this.f5856a.E().a("AppLovinFullscreenActivity", "onResume", e10);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        l lVar = this.f5856a;
        if (lVar != null && ((Boolean) lVar.a(z4.U6)).booleanValue()) {
            if (z10) {
                stopService(new Intent(this, (Class<?>) AppRestartDuringAdDetectionService.class));
            } else {
                getApplicationContext().startService(new Intent(getApplicationContext(), (Class<?>) AppRestartDuringAdDetectionService.class));
            }
        }
        if (this.f5857b != null) {
            if (!this.f5858c.getAndSet(false)) {
                this.f5857b.b(z10);
            }
            if (z10) {
                configureSystemUiBars(this.f5864i, this.f5865j, this.f5866k, this.f5867l);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(y1 y1Var) {
        this.f5857b = y1Var;
    }

    /* JADX INFO: loaded from: classes.dex */
    class b implements y1.g {
        b() {
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            AppLovinFullscreenActivity.this.f5857b = y1Var;
            y1Var.w();
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            p2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f5856a.g().a(f2.G, bVarF, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.q();
        }
        if (q7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        l lVar = this.f5856a;
        if (lVar == null || !((Boolean) lVar.a(z4.C2)).booleanValue()) {
            return;
        }
        final Long l10 = (Long) this.f5856a.a(z4.D2);
        this.f5862g = i0.a(l10.longValue(), true, this.f5856a, new Runnable() { // from class: com.applovin.adview.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5878a.a(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        p0.a aVarA = p0.a(windowInsets, this.f5856a);
        p0.a aVarC = p0.c(windowInsets, this.f5856a);
        p0.a aVarB = p0.b(windowInsets, this.f5856a);
        String strB = q7.b(this);
        p0.a(aVarA, strB);
        p0.c(aVarC, strB);
        p0.b(aVarB, strB);
        y1 y1Var = this.f5857b;
        if (y1Var != null) {
            y1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(p2 p2Var) {
        boolean zY = this.f5857b.y();
        boolean zI = (p2Var == null || !zY) ? false : p2Var.i();
        if (!zI) {
            this.f5857b.d(false);
        }
        a(this.f5857b, zY, zI);
    }

    private String a(l lVar) {
        Integer num = (Integer) lVar.a(z4.f9222e7);
        if (num.intValue() < 0) {
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length <= num.intValue()) {
            return null;
        }
        return stackTrace[num.intValue()].toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y1 y1Var, boolean z10, boolean z11) {
        y1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f5856a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ShareConstants.FEED_SOURCE_PARAM, "onDestroyAppLovinFullScreenActivity");
            p2 p2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = p2Var != null ? p2Var.f() : null;
            mapHashMap.putAll(h2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z10);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z11);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.T());
                JsonUtils.putInt(jSONObject, "reshow_count_from_render_process_gone", bVarF.U());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f5856a.E().d(f2.K0, mapHashMap);
        }
        y1Var.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        p2 p2Var;
        l lVar = this.f5856a;
        if (lVar == null || !((Boolean) lVar.a(z4.B2)).booleanValue() || (p2Var = parentInterstitialWrapper) == null || p2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listK = bVarF.k();
        if (CollectionUtils.isEmpty(listK)) {
            return;
        }
        com.applovin.impl.e eVar = (com.applovin.impl.e) listK.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.f5856a.r0().b(b5.P, jSONObject.toString());
        this.f5856a.r0().b(b5.N, Long.valueOf(System.currentTimeMillis()));
        this.f5856a.r0().b(b5.Q, CollectionUtils.toJsonString(h2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f5863h += l10.longValue();
        this.f5856a.r0().b(b5.O, Long.valueOf(this.f5863h));
    }
}
