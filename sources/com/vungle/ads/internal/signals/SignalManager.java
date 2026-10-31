package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.DeviceCheckUtils;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import fe.d;
import id.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.v;
import pd.m;
import wc.k;
import wc.o;

/* JADX INFO: compiled from: SignalManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SignalManager {
    public static final Companion Companion = new Companion(null);
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 2;
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;
    private final Context context;
    private SessionData currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;
    private final k filePreferences$delegate;
    private final b json;
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private UnclosedAdDetector unclosedAdDetector;

    /* JADX INFO: renamed from: com.vungle.ads.internal.signals.SignalManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: SignalManager.kt */
    static final class AnonymousClass1 extends u implements a<String> {
        AnonymousClass1() {
            super(0);
        }

        @Override // id.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unclosedad: ");
            b bVar = SignalManager.this.json;
            List<UnclosedAd> unclosedAd = SignalManager.this.getCurrentSession$vungle_ads_release().getUnclosedAd();
            d<Object> dVarB = fe.u.b(bVar.a(), i0.k(List.class, m.f24255c.a(i0.j(UnclosedAd.class))));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb2.append(bVar.b(dVarB, unclosedAd));
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: SignalManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public SignalManager(Context context) {
        t.f(context, "context");
        this.context = context;
        int i10 = 1;
        this.json = v.b(null, SignalManager$json$1.INSTANCE, 1, null);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVar = o.SYNCHRONIZED;
        this.filePreferences$delegate = wc.m.b(oVar, new SignalManager$special$$inlined$inject$1(context));
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new SessionData(this.sessionCount);
        UnclosedAdDetector unclosedAdDetector = new UnclosedAdDetector(context, this.currentSession.getSessionId(), m286_init_$lambda0(wc.m.b(oVar, new SignalManager$special$$inlined$inject$2(context))), m287_init_$lambda1(wc.m.b(oVar, new SignalManager$special$$inlined$inject$3(context))));
        this.unclosedAdDetector = unclosedAdDetector;
        this.currentSession.setUnclosedAd(unclosedAdDetector.retrieveUnclosedAd());
        Logger.Companion.w(TAG, new AnonymousClass1());
        try {
            SessionData sessionData = this.currentSession;
            DeviceCheckUtils deviceCheckUtils = DeviceCheckUtils.INSTANCE;
            sessionData.setDevice(deviceCheckUtils.isEmulator() ? 0 : 1);
            this.currentSession.setVPNConnected(deviceCheckUtils.isVpnConnected(context) ? 1 : 0);
            this.currentSession.setOverlayGranted(deviceCheckUtils.hasSystemAlertWindowPermission(context) ? 1 : 0);
            this.currentSession.setSensorCount(deviceCheckUtils.getSensorCount(context));
            SessionData sessionData2 = this.currentSession;
            if (!deviceCheckUtils.isProxyEnabled(context)) {
                i10 = 0;
            }
            sessionData2.setHttpProxyEnabled(i10);
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to collect device signals: " + e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    private static final Executors m286_init_$lambda0(k<? extends Executors> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    private static final PathProvider m287_init_$lambda1(k<PathProvider> kVar) {
        return kVar.getValue();
    }

    private final void registerNotifications() {
        ActivityManager.Companion.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.signals.SignalManager.registerNotifications.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                Logger.Companion.d(SignalManager.TAG, "SignalManager#onBackground()");
                SignalManager.this.setEnterBackgroundTime(System.currentTimeMillis());
                SignalManager signalManager = SignalManager.this;
                signalManager.setSessionDuration(signalManager.getSessionDuration() + (SignalManager.this.getEnterBackgroundTime() - SignalManager.this.getEnterForegroundTime()));
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                Logger.Companion.d(SignalManager.TAG, "SignalManager#onForeground()");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - SignalManager.this.getEnterBackgroundTime() > ConfigManager.INSTANCE.getSignalsSessionTimeout()) {
                    SignalManager.this.createNewSessionData();
                }
                SignalManager.this.setEnterForegroundTime(jCurrentTimeMillis);
                SignalManager.this.setEnterBackgroundTime(0L);
            }
        });
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.sessionSeriesCreatedTime;
        long j11 = jCurrentTimeMillis - j10;
        if (j10 < 0 || j11 >= TWENTY_FOUR_HOURS_MILLIS) {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, jCurrentTimeMillis);
            this.sessionSeriesCreatedTime = jCurrentTimeMillis;
        } else {
            this.sessionCount++;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((this.sessionDuration + System.currentTimeMillis()) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new SessionData(this.sessionCount);
    }

    public final String generateSignals() {
        updateSessionDuration();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("2:");
            b bVar = this.json;
            SessionData sessionData = this.currentSession;
            d<Object> dVarB = fe.u.b(bVar.a(), i0.j(SessionData.class));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb2.append(bVar.b(dVarB, sessionData));
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final SessionData getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    public final FilePreferences getFilePreferences() {
        return (FilePreferences) this.filePreferences$delegate.getValue();
    }

    public final ConcurrentHashMap<String, Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    public final synchronized SignaledAd getSignaledAd(String placementId) {
        long jCurrentTimeMillis;
        Long l10;
        t.f(placementId, "placementId");
        jCurrentTimeMillis = System.currentTimeMillis();
        l10 = this.mapOfLastLoadTimes.containsKey(placementId) ? this.mapOfLastLoadTimes.get(placementId) : null;
        this.mapOfLastLoadTimes.put(placementId, Long.valueOf(jCurrentTimeMillis));
        return new SignaledAd(l10, jCurrentTimeMillis);
    }

    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        SessionData sessionData = this.currentSession;
        sessionData.setSessionDepthCounter(sessionData.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(UnclosedAd unclosedAd) {
        t.f(unclosedAd, "unclosedAd");
        if (ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(Context context, SignaledAd signaledAd) {
        t.f(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(UnclosedAd unclosedAd) {
        t.f(unclosedAd, "unclosedAd");
        if (ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
    }

    public final int screenOrientation(Context context) {
        Configuration configuration;
        if (context == null) {
            context = this.context;
        }
        Resources resources = context.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 1;
        }
        return (numValueOf != null && numValueOf.intValue() == 0) ? 0 : -1;
    }

    public final void setCurrentSession$vungle_ads_release(SessionData sessionData) {
        t.f(sessionData, "<set-?>");
        this.currentSession = sessionData;
    }

    public final void setEnterBackgroundTime(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setEnterForegroundTime(long j10) {
        this.enterForegroundTime = j10;
    }

    public final void setMapOfLastLoadTimes(ConcurrentHashMap<String, Long> concurrentHashMap) {
        t.f(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i10) {
        this.sessionCount = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSessionSeriesCreatedTime(long j10) {
        this.sessionSeriesCreatedTime = j10;
    }

    public final void updateTemplateSignals(String str) {
        if ((str == null || str.length() == 0) || !(true ^ this.currentSession.getSignaledAd().isEmpty())) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
    }

    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }
}
