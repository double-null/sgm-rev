package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.adjust.sdk.Constants;
import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.c0;
import rd.f0;
import wc.m;
import wc.o;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidPlatform implements Platform {
    public static final Companion Companion = new Companion(null);
    private static final String PREF_KEY_SDK_INSTALL_TIME = "sit";
    private static final String TAG = "AndroidPlatform";
    private AdvertisingInfo advertisingInfo;
    private String appSetId;
    private Integer appSetIdScope;
    private final AudioManager audioManager;
    private final Context context;
    private String gpVersion;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private Long sdkInstallationTime;
    private final VungleThreadPoolExecutor uaExecutor;
    private String userAgent;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String getCarrierName$vungle_ads_release(Context context) {
            t.f(context, "context");
            Object systemService = context.getSystemService(ljglrLUdGZhMhQ.NPkMVtKOrRaI);
            t.d(systemService, vgmm.qmwwjrlXmk);
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }
    }

    public AndroidPlatform(Context context, VungleThreadPoolExecutor uaExecutor, PowerManager powerManager, AudioManager audioManager) {
        t.f(context, "context");
        t.f(uaExecutor, "uaExecutor");
        t.f(powerManager, "powerManager");
        t.f(audioManager, "audioManager");
        this.context = context;
        this.uaExecutor = uaExecutor;
        this.powerManager = powerManager;
        this.audioManager = audioManager;
        updateAppSetID();
    }

    private final AdvertisingInfo getAmazonAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = new AdvertisingInfo();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z10 = true;
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z10 = false;
            }
            advertisingInfo.setLimitAdTracking(z10);
            advertisingInfo.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
        } catch (Settings.SettingNotFoundException e10) {
            Logger.Companion.e(TAG, "Error getting Amazon advertising info: Setting not found.", e10);
        } catch (Exception e11) {
            Logger.Companion.e(TAG, "Error getting Amazon advertising info", e11);
        }
        return advertisingInfo;
    }

    private final AdvertisingInfo getGoogleAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = new AdvertisingInfo();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            t.e(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            advertisingInfo.setAdvertisingId(advertisingIdInfo.getId());
            advertisingInfo.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesNotAvailableException e10) {
            Logger.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
        } catch (Exception e11) {
            Logger.Companion.e(TAG, "Error getting Google advertising info: " + e11.getLocalizedMessage());
        } catch (NoClassDefFoundError e12) {
            Logger.Companion.e(TAG, "Play services Not available: " + e12.getLocalizedMessage());
            advertisingInfo.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        return advertisingInfo;
    }

    /* JADX INFO: renamed from: getSDKInstallationTime$lambda-4, reason: not valid java name */
    private static final FilePreferences m272getSDKInstallationTime$lambda4(wc.k<FilePreferences> kVar) {
        return kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m273getUserAgentLazy$lambda0(AndroidPlatform this$0, w.b consumer) {
        t.f(this$0, "this$0");
        t.f(consumer, "$consumer");
        WebViewUtil.INSTANCE.getUserAgent(this$0.context, consumer);
    }

    private final float sanitizeVolume(float f10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10) || f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                t.e(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                t.e(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.vungle.ads.internal.platform.b
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AndroidPlatform.m274updateAppSetID$lambda8(this.f13084a, (AppSetIdInfo) obj);
                    }
                });
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Error getting AppSetID: " + e10.getLocalizedMessage());
            } catch (NoClassDefFoundError e11) {
                Logger.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateAppSetID$lambda-8, reason: not valid java name */
    public static final void m274updateAppSetID$lambda8(AndroidPlatform this$0, AppSetIdInfo appSetIdInfo) {
        t.f(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
            this$0.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public AdvertisingInfo getAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo != null) {
            String advertisingId = advertisingInfo.getAdvertisingId();
            if (!(advertisingId == null || advertisingId.length() == 0)) {
                return advertisingInfo;
            }
        }
        AdvertisingInfo amazonAdvertisingInfo = c0.B(Build.MANUFACTURER, "Amazon", true) ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getBuildTime() {
        return Build.TIME;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        t.e(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getGPVersion() {
        String str = this.gpVersion;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.gpVersion = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getLastBootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getOSInstallationTime() {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            objC = r.c(Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("android", 0)).firstInstallTime));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            if (thG instanceof PackageManager.NameNotFoundException) {
                Logger.Companion.e(TAG, "Error getting OS installation time: " + ((PackageManager.NameNotFoundException) thG).getLocalizedMessage());
            }
            objC = -1L;
        }
        return ((Number) objC).longValue();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getSDKInstallationTime() {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        wc.k kVarB = m.b(o.SYNCHRONIZED, new AndroidPlatform$getSDKInstallationTime$$inlined$inject$1(this.context));
        Long l10 = this.sdkInstallationTime;
        if (l10 != null) {
            return l10.longValue();
        }
        long jCurrentTimeMillis = m272getSDKInstallationTime$lambda4(kVarB).getLong(PREF_KEY_SDK_INSTALL_TIME, 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            m272getSDKInstallationTime$lambda4(kVarB).put(PREF_KEY_SDK_INSTALL_TIME, jCurrentTimeMillis).apply();
        }
        this.sdkInstallationTime = Long.valueOf(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public void getUserAgentLazy(final w.b<String> consumer) {
        t.f(consumer, "consumer");
        this.uaExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.platform.c
            @Override // java.lang.Runnable
            public final void run() {
                AndroidPlatform.m273getUserAgentLazy$lambda0(this.f13085a, consumer);
            }
        });
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public float getVolumeLevel() {
        try {
            return sanitizeVolume(this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isProblematicMaliDevice() {
        String lowerCase;
        boolean z10;
        String str = Build.HARDWARE;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        if (f0.U(lowerCase, "exynos", false, 2, null)) {
            if (Build.VERSION.SDK_INT >= 31) {
                String SOC_MANUFACTURER = Build.SOC_MANUFACTURER;
                t.e(SOC_MANUFACTURER, "SOC_MANUFACTURER");
                if (!f0.S(SOC_MANUFACTURER, Constants.REFERRER_API_SAMSUNG, true)) {
                    z10 = false;
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = f0.U(lowerCase, "mali", false, 2, null) || z10;
        int i10 = Build.VERSION.SDK_INT;
        return z11 && (29 <= i10 && i10 < 34);
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSdCardPresent() {
        try {
            return t.a(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Acquiring external storage state failed", e10);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSilentModeEnabled() {
        try {
            return this.audioManager.getRingerMode() == 0 || this.audioManager.getRingerMode() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AndroidPlatform(Context context, VungleThreadPoolExecutor vungleThreadPoolExecutor, PowerManager powerManager, AudioManager audioManager, int i10, k kVar) {
        if ((i10 & 4) != 0) {
            Object systemService = context.getSystemService("power");
            t.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            powerManager = (PowerManager) systemService;
        }
        if ((i10 & 8) != 0) {
            Object systemService2 = context.getSystemService("audio");
            t.d(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            audioManager = (AudioManager) systemService2;
        }
        this(context, vungleThreadPoolExecutor, powerManager, audioManager);
    }
}
