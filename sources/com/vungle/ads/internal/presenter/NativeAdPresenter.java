package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import c2.YDwL.tFQWuE;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.omsdk.NativeOMTracker;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.collections.s;
import kotlin.jvm.internal.t;
import wc.k;
import wc.m;
import wc.o;
import wc.w;

/* JADX INFO: compiled from: NativeAdPresenter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeAdPresenter {
    public static final Companion Companion = new Companion(null);
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    private Long adStartTime;
    private final AdPayload advertisement;
    private AdEventListener bus;
    private ClickCoordinateTracker clickCoordinateTracker;
    private final Context context;
    private Dialog currentDialog;
    private final NativePresenterDelegate delegate;
    private final Map<Integer, Boolean> firedOMEventMap;
    private final Map<String, Boolean> firedTpatMap;
    private final k logEntry$delegate;
    private final Map<Integer, Boolean> multipleOMEventEnabledMap;
    private final Map<String, Boolean> multipleTpatEnabledMap;
    private NativeOMTracker omTracker;
    private final Platform platform;
    private final k tpatSender$delegate;

    /* JADX INFO: compiled from: NativeAdPresenter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry$delegate.getValue();
    }

    public static /* synthetic */ void getOmTracker$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender$delegate.getValue();
    }

    /* JADX INFO: renamed from: initAndStartOMTracker$lambda-9, reason: not valid java name */
    private static final OMInjector m278initAndStartOMTracker$lambda9(k<OMInjector> kVar) {
        return kVar.getValue();
    }

    private final boolean needShowGdpr() {
        return ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && t.a("unknown", PrivacyManager.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        AdEventListener adEventListener;
        processCommand$default(this, "tpat", Constants.CLICK_URL, null, 4, null);
        processCommand("tpat", Constants.CTA_URL, str);
        AdPayload.AdUnit adUnit = this.advertisement.adUnit();
        final String deeplinkUrl = adUnit != null ? adUnit.getDeeplinkUrl() : null;
        boolean zLaunch$vungle_ads_release = ExternalRouter.INSTANCE.launch$vungle_ads_release(deeplinkUrl, str, this.context, getLogEntry(), new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$launched$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean z10) {
                if (!z10) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                List tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, Constants.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null);
                if (tpatUrls$default != null) {
                    NativeAdPresenter nativeAdPresenter = this;
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(nativeAdPresenter.getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(nativeAdPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        });
        AdEventListener adEventListener2 = this.bus;
        if (adEventListener2 != null) {
            adEventListener2.onNext(MRAIDPresenter.OPEN, "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch$vungle_ads_release || (adEventListener = this.bus) == null) {
            return;
        }
        adEventListener.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onOMEvent$default(NativeAdPresenter nativeAdPresenter, int i10, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        nativeAdPresenter.onOMEvent(i10, map);
    }

    private final void onPrivacy(String str) {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (str != null) {
            if (!FileUtility.INSTANCE.isValidUrl(str)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!ExternalRouter.INSTANCE.launch$vungle_ads_release((16 & 1) != 0 ? null : null, (16 & 2) != 0 ? null : str, this.context, (16 & 8) != 0 ? null : getLogEntry(), (16 & 16) != 0 ? null : null)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            AdEventListener adEventListener = this.bus;
            if (adEventListener != null) {
                adEventListener.onNext(MRAIDPresenter.OPEN, "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        nativeAdPresenter.processCommand(str, str2, str3);
    }

    private final void showGdpr() {
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            Logger.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NativeAdPresenter.m279showGdpr$lambda7(this.f13090a, dialogInterface, i10);
            }
        };
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        boolean z10 = true;
        if (!(gDPRConsentTitle == null || gDPRConsentTitle.length() == 0)) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            z10 = false;
        }
        if (!z10) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NativeAdPresenter.m280showGdpr$lambda8(this.f13091a, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-7, reason: not valid java name */
    public static final void m279showGdpr$lambda7(NativeAdPresenter this$0, DialogInterface dialogInterface, int i10) {
        String value;
        t.f(this$0, "this$0");
        if (i10 != -2) {
            value = i10 != -1 ? "opted_out_by_timeout" : PrivacyConsent.OPT_IN.getValue();
        } else {
            value = PrivacyConsent.OPT_OUT.getValue();
        }
        PrivacyManager.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m280showGdpr$lambda8(NativeAdPresenter this$0, DialogInterface dialogInterface) {
        t.f(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void detach() {
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l10 = this.adStartTime;
        if (l10 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("end", null, this.delegate.getPlacementRefId());
        }
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return this.clickCoordinateTracker;
    }

    public final NativeOMTracker getOmTracker$vungle_ads_release() {
        return this.omTracker;
    }

    public final void initAndStartOMTracker(View view, String omSdkData) {
        t.f(view, "view");
        t.f(omSdkData, "omSdkData");
        boolean zOmEnabled = this.advertisement.omEnabled();
        if ((omSdkData.length() > 0) && zOmEnabled) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            String oMSDKJS$vungle_ads_release = m278initAndStartOMTracker$lambda9(m.b(o.SYNCHRONIZED, new NativeAdPresenter$initAndStartOMTracker$$inlined$inject$1(this.context))).getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                NativeOMTracker nativeOMTracker = new NativeOMTracker(omSdkData, oMSDKJS$vungle_ads_release, this.delegate.isNativeVideo());
                nativeOMTracker.start(view);
                this.omTracker = nativeOMTracker;
            }
        }
    }

    public final void onOMEvent(int i10, Map<String, ? extends Object> map) {
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "onOMEvent: event=" + i10 + " value=" + map);
        Boolean bool = this.multipleOMEventEnabledMap.get(Integer.valueOf(i10));
        Boolean bool2 = Boolean.TRUE;
        if (!t.a(bool, bool2) && t.a(this.firedOMEventMap.get(Integer.valueOf(i10)), bool2)) {
            companion.d(TAG, "Ignore this already fired om event: " + i10);
        }
        this.firedOMEventMap.put(Integer.valueOf(i10), bool2);
        switch (i10) {
            case 1:
                NativeOMTracker nativeOMTracker = this.omTracker;
                if (nativeOMTracker != null) {
                    nativeOMTracker.onStatePlay();
                }
                break;
            case 2:
                NativeOMTracker nativeOMTracker2 = this.omTracker;
                if (nativeOMTracker2 != null) {
                    nativeOMTracker2.onStatePaused();
                }
                break;
            case 3:
                NativeOMTracker nativeOMTracker3 = this.omTracker;
                if (nativeOMTracker3 != null) {
                    nativeOMTracker3.onStateCompleted();
                }
                break;
            case 4:
                Object obj = map != null ? map.get(NativeAdInternal.QUARTILE_START_KEY_DURATION) : null;
                Number number = obj instanceof Number ? (Number) obj : null;
                float fFloatValue = number != null ? number.floatValue() : 0.0f;
                Object obj2 = map != null ? map.get(NativeAdInternal.QUARTILE_START_KEY_VOLUME) : null;
                Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
                float fFloatValue2 = number2 != null ? number2.floatValue() : 0.0f;
                NativeOMTracker nativeOMTracker4 = this.omTracker;
                if (nativeOMTracker4 != null) {
                    nativeOMTracker4.onQuartileStart(fFloatValue, fFloatValue2);
                }
                break;
            case 5:
            case 6:
            case 7:
                NativeOMTracker nativeOMTracker5 = this.omTracker;
                if (nativeOMTracker5 != null) {
                    nativeOMTracker5.onQuartileChanged(i10);
                }
                break;
            case 8:
                NativeOMTracker nativeOMTracker6 = this.omTracker;
                if (nativeOMTracker6 != null) {
                    nativeOMTracker6.onUserInteraction();
                }
                break;
            case 9:
                NativeOMTracker nativeOMTracker7 = this.omTracker;
                if (nativeOMTracker7 != null) {
                    nativeOMTracker7.onMuteChanged(true);
                }
                break;
            case 10:
                NativeOMTracker nativeOMTracker8 = this.omTracker;
                if (nativeOMTracker8 != null) {
                    nativeOMTracker8.onMuteChanged(false);
                }
                break;
            case 11:
                NativeOMTracker nativeOMTracker9 = this.omTracker;
                if (nativeOMTracker9 != null) {
                    nativeOMTracker9.impressionOccurred();
                }
                break;
        }
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Logger.Companion.d(TAG, "user interaction on Native ad");
            this.clickCoordinateTracker.trackCoordinate(motionEvent);
        }
    }

    public final void prepare() {
        start();
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    public final void setClickCoordinateTracker$vungle_ads_release(ClickCoordinateTracker clickCoordinateTracker) {
        t.f(clickCoordinateTracker, "<set-?>");
        this.clickCoordinateTracker = clickCoordinateTracker;
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setOmTracker$vungle_ads_release(NativeOMTracker nativeOMTracker) {
        this.omTracker = nativeOMTracker;
    }

    public NativeAdPresenter(Context context, NativePresenterDelegate delegate, AdPayload advertisement, Platform platform) {
        t.f(context, "context");
        t.f(delegate, "delegate");
        t.f(advertisement, "advertisement");
        t.f(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = advertisement;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.tpatSender$delegate = m.b(o.SYNCHRONIZED, new NativeAdPresenter$special$$inlined$inject$1(context));
        this.logEntry$delegate = m.a(new NativeAdPresenter$logEntry$2(this));
        this.firedTpatMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        this.multipleTpatEnabledMap = o0.k(w.a(Constants.TPAT_VIDEO_MUTE, bool), w.a(tFQWuE.VnHEzTftX, bool));
        this.firedOMEventMap = new LinkedHashMap();
        this.multipleOMEventEnabledMap = o0.k(w.a(8, bool), w.a(9, bool), w.a(10, bool));
        this.clickCoordinateTracker = new ClickCoordinateTracker(context, advertisement);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final void processCommand(String action, String str, String str2) {
        List<String> tpatUrls;
        t.f(action, "action");
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "processCommand: action=" + action + UyXgnuLGEkgnZE.Fpa + str + " value=" + str2);
        int iHashCode = action.hashCode();
        if (iHashCode != -511324706) {
            if (iHashCode != 3566511) {
                if (iHashCode == 1427818632 && action.equals(DOWNLOAD)) {
                    onDownload(str2);
                    return;
                }
            } else if (action.equals("tpat")) {
                boolean z10 = true;
                if (str == null || str.length() == 0) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                Boolean bool = this.multipleTpatEnabledMap.get(str);
                Boolean bool2 = Boolean.TRUE;
                if (!t.a(bool, bool2) && t.a(this.firedTpatMap.get(str), bool2)) {
                    companion.d(TAG, "Ignore this already fired TPAT: " + str);
                    return;
                }
                this.firedTpatMap.put(str, bool2);
                int iHashCode2 = str.hashCode();
                if (iHashCode2 != -2125915830) {
                    if (iHashCode2 != -747709511) {
                        if (iHashCode2 == 1082060480 && str.equals(Constants.CTA_URL)) {
                            tpatUrls = str2 != null ? s.e(str2) : null;
                        } else {
                            tpatUrls = AdPayload.getTpatUrls$default(this.advertisement, str, null, null, 6, null);
                        }
                    } else if (str.equals(WKirgUEJJ.PfNtpzWWaX)) {
                        tpatUrls = AdPayload.getTpatUrls$default(this.advertisement, str, str2, null, 4, null);
                    } else {
                        tpatUrls = AdPayload.getTpatUrls$default(this.advertisement, str, null, null, 6, null);
                    }
                } else if (str.equals(Constants.CHECKPOINT_0)) {
                    tpatUrls = this.advertisement.getTpatUrls(str, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel()));
                } else {
                    tpatUrls = AdPayload.getTpatUrls$default(this.advertisement, str, null, null, 6, null);
                }
                if (tpatUrls != null && !tpatUrls.isEmpty()) {
                    z10 = false;
                }
                if (z10) {
                    new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Empty urls for tpat: " + str + " value=" + str2).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    Iterator<T> it = tpatUrls.iterator();
                    while (it.hasNext()) {
                        TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(str).withLogEntry(getLogEntry()).build(), false, 2, null);
                    }
                }
                if (t.a(str, Constants.CHECKPOINT_0)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), getLogEntry(), (String) null, 4, (Object) null);
                    AdEventListener adEventListener = this.bus;
                    if (adEventListener != null) {
                        adEventListener.onNext("adViewed", null, this.delegate.getPlacementRefId());
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (action.equals("openPrivacy")) {
            onPrivacy(str2);
            return;
        }
        companion.w(TAG, "Unknown native ad action: " + action);
    }
}
