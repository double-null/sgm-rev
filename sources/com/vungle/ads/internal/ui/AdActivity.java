package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.core.view.b3;
import androidx.core.view.d3;
import androidx.core.view.y3;
import com.pairip.VMRunner;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.FullscreenAdInternal;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.OpenActivityDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.k;
import wc.q;
import wc.r;
import wc.s;
import wc.w;

/* JADX INFO: compiled from: AdActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AdActivity extends Activity {
    public static final String AD_INVISIBLE_LOGGED_KEY = "ad_invisible_logged";
    public static final Companion Companion = new Companion(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static volatile AdEventListener eventListener;
    private static volatile FullscreenAdInternal.PendingData pendingData;
    private LogEntry logEntry;
    private MRAIDAdWidget mraidAdWidget;
    private MRAIDPresenter mraidPresenter;
    private Object onBackInvokedCallback;
    private UnclosedAd unclosedAd;
    private final RingerModeReceiver ringerModeReceiver = new RingerModeReceiver();
    private final AdActivity$lifeCycleCallback$1 lifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.ui.AdActivity$lifeCycleCallback$1
        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onBackground() {
            MRAIDPresenter mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
            Long viewStatus = mraidPresenter$vungle_ads_release != null ? mraidPresenter$vungle_ads_release.getViewStatus() : null;
            Logger.Companion.d("AdActivity", "App is in background, status: " + viewStatus);
            if (viewStatus != null) {
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION, viewStatus.longValue(), this.this$0.logEntry, null, 8, null);
            }
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onForeground() {
        }
    };
    private final AtomicBoolean willPresentInlineInstall = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.AdActivity$onActivityResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: AdActivity.kt */
    static final class AnonymousClass1 extends u implements id.a<String> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, int i11, Intent intent) {
            super(0);
            this.$requestCode = i10;
            this.$resultCode = i11;
            this.$data = intent;
        }

        @Override // id.a
        public final String invoke() {
            return "onActivityResult: " + this.$requestCode + ", " + this.$resultCode + ", " + this.$data;
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.ui.AdActivity$onCreate$5, reason: invalid class name */
    /* JADX INFO: compiled from: AdActivity.kt */
    public static final class AnonymousClass5 implements OpenActivityDelegate {
        AnonymousClass5() {
        }

        @Override // com.vungle.ads.internal.presenter.OpenActivityDelegate
        public q<Boolean, String> openInlineInstall(Intent intent) {
            Object objC;
            t.f(intent, "intent");
            AdActivity adActivity = AdActivity.this;
            try {
                r.a aVar = r.f27774b;
                adActivity.willPresentInlineInstall.set(true);
                adActivity.startActivityForResult(intent, 10001);
                objC = r.c(g0.f27756a);
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                objC = r.c(s.a(th));
            }
            AdActivity adActivity2 = AdActivity.this;
            Throwable thG = r.g(objC);
            if (thG == null) {
                return new q<>(Boolean.TRUE, null);
            }
            adActivity2.willPresentInlineInstall.set(false);
            return new q<>(Boolean.FALSE, thG.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSystemUi() {
        y3 y3VarA = b3.a(getWindow(), getWindow().getDecorView());
        t.e(y3VarA, "getInsetsController(window, window.decorView)");
        y3VarA.b(2);
        y3VarA.a(d3.m.c());
    }

    private final void onConcurrentPlaybackError(String str, String str2) {
        VungleError vungleErrorLogError$vungle_ads_release = new ConcurrentPlaybackUnsupported("Trying to show " + str + " but " + str2 + " is already showing").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release();
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(vungleErrorLogError$vungle_ads_release, str);
        }
        Logger.Companion.e(TAG, "onConcurrentPlaybackError: " + vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final SignalManager m291onCreate$lambda1(k<SignalManager> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-9, reason: not valid java name */
    public static final d3 m295onCreate$lambda9(AdActivity this$0, View v10, d3 insets) {
        t.f(this$0, "this$0");
        t.f(v10, "v");
        t.f(insets, "insets");
        if (!this$0.willPresentInlineInstall.get()) {
            androidx.core.graphics.g gVarF = insets.f(d3.m.c() | d3.m.a());
            t.e(gVarF, "insets.getInsets(\n      …t()\n                    )");
            v10.setPadding(gVarF.f1851a, gVarF.f1852b, gVarF.f1853c, gVarF.f1854d);
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerBackCallback() {
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.vungle.ads.internal.ui.a
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                AdActivity.m296registerBackCallback$lambda13(this.f13096a);
            }
        };
        this.onBackInvokedCallback = onBackInvokedCallback;
        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerBackCallback$lambda-13, reason: not valid java name */
    public static final void m296registerBackCallback$lambda13(AdActivity this$0) {
        t.f(this$0, "this$0");
        MRAIDPresenter mRAIDPresenter = this$0.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    private final void unregisterBackCallback() {
        Object obj = this.onBackInvokedCallback;
        OnBackInvokedCallback onBackInvokedCallback = obj instanceof OnBackInvokedCallback ? (OnBackInvokedCallback) obj : null;
        if (onBackInvokedCallback != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        this.onBackInvokedCallback = null;
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final MRAIDAdWidget getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final MRAIDPresenter getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Logger.Companion.w(TAG, new AnonymousClass1(i10, i11, intent));
        if (i10 == 10001) {
            this.willPresentInlineInstall.set(false);
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release("onActivityResultCode=" + i11);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        t.f(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i10 = newConfig.orientation;
            if (i10 == 2) {
                Logger.Companion.d(TAG, "landscape");
            } else if (i10 == 1) {
                Logger.Companion.d(TAG, "portrait");
            }
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.onViewConfigurationChanged();
            }
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "onConfigurationChanged: " + e10.getLocalizedMessage());
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("Y8k4USrLRunMVFjs", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (Build.VERSION.SDK_INT >= 33) {
            unregisterBackCallback();
        }
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        MRAIDPresenter mRAIDPresenter2 = this.mraidPresenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.setOpenActivityDelegate$vungle_ads_release(null);
        }
        ActivityManager.Companion.removeLifecycleListener(this.lifeCycleCallback);
        try {
            r.a aVar = r.f27774b;
            unregisterReceiver(this.ringerModeReceiver);
            r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(s.a(th));
        }
        this.mraidPresenter = null;
        eventListener = null;
        pendingData = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        t.f(intent, "intent");
        super.onNewIntent(intent);
        Companion companion = Companion;
        Intent intent2 = getIntent();
        t.e(intent2, "getIntent()");
        q qVarA = w.a(companion.getPlacement(intent2), companion.getPlacement(intent));
        String str = (String) qVarA.b();
        String str2 = (String) qVarA.c();
        Intent intent3 = getIntent();
        t.e(intent3, "getIntent()");
        q qVarA2 = w.a(companion.getEventId(intent3), companion.getEventId(intent));
        String str3 = (String) qVarA2.b();
        String str4 = (String) qVarA2.c();
        if ((str == null || str2 == null || t.a(str, str2)) && (str3 == null || str4 == null || t.a(str3, str4))) {
            return;
        }
        Logger.Companion.d(TAG, "Tried to play another placement " + str2 + " while playing " + str);
        onConcurrentPlaybackError(str2, str);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            hideSystemUi();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i10);
        }
    }

    /* JADX INFO: compiled from: AdActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString("request");
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        public final Intent createIntent(Context context, String placement, String str) {
            t.f(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString("request", placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        public final AdEventListener getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        public final FullscreenAdInternal.PendingData getPendingData$vungle_ads_release() {
            return AdActivity.pendingData;
        }

        public final void setEventListener$vungle_ads_release(AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPendingData$vungle_ads_release(FullscreenAdInternal.PendingData pendingData) {
            AdActivity.pendingData = pendingData;
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }
    }
}
