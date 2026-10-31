package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Range;
import com.applovin.impl.b5;
import com.applovin.impl.e4;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.p7;
import com.applovin.impl.q5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.shadow.okhttp3.internal.http2.Http2Stream;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.common.Scopes;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import pb.vBC.NyXuoef;
import rd.PSo.cNMUz;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f8487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f8488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReference f8489l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReference f8490m = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f8492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f8493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8494d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8496f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8498h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8495e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8497g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference f8499i = new AtomicReference();

    /* JADX INFO: loaded from: classes.dex */
    class a implements q5.a {
        a() {
        }

        @Override // com.applovin.impl.q5.a
        public void a(com.applovin.impl.v.a aVar) {
            m.f8489l.set(aVar);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8502b;

        public b(String str, int i10) {
            this.f8501a = str;
            this.f8502b = i10;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8503a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8504b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f8505c = null;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface d {
        String a(ContentResolver contentResolver, String str);
    }

    protected m(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8491a = lVar;
        this.f8492b = lVar.Q();
        this.f8493c = l.p();
        this.f8494d = D();
        this.f8496f = C();
    }

    private String B() {
        AudioManager audioManager = (AudioManager) this.f8493c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            sb2.append(audioDeviceInfo.getType());
            sb2.append(",");
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string) && p.a()) {
            this.f8492b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map D() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.v.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put("platform", A());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(E()));
        map.put("gy", Boolean.valueOf(u()));
        map.put("country_code", n());
        map.put("mcc", y());
        map.put("mnc", z());
        map.put("carrier", l());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f8493c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", S());
        map.put("supported_abis", CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS));
        map.put("type", Build.TYPE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.f8493c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            com.applovin.impl.p0.b bVarA = com.applovin.impl.p0.a(this.f8493c, this.f8491a);
            if (bVarA != null) {
                map.put("tl_cr", Integer.valueOf(bVarA.c()));
                map.put("tr_cr", Integer.valueOf(bVarA.d()));
                map.put("bl_cr", Integer.valueOf(bVarA.a()));
                map.put("br_cr", Integer.valueOf(bVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(k()));
        map.put("tbalsi_ms", Long.valueOf(this.f8491a.M() - l.o()));
        CollectionUtils.putStringIfValid("process_name", q7.c(this.f8493c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", q7.i(this.f8493c), map);
        try {
            PackageInfo packageInfo = this.f8493c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", n7.a(this.f8493c), map);
        a(map);
        return map;
    }

    private double E() {
        return Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0219  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x01f8, please report this as an issue */
    private JSONArray F() {
        MediaCodecInfo[] mediaCodecInfoArr;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        String[] strArr;
        int i13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i14;
        ArrayList arrayList2 = new ArrayList();
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            int i15 = 0;
            while (i15 < length) {
                MediaCodecInfo mediaCodecInfo = codecInfos[i15];
                if (mediaCodecInfo.isEncoder()) {
                    arrayList = arrayList2;
                    mediaCodecInfoArr = codecInfos;
                    i10 = length;
                    i11 = i15;
                } else {
                    HashMap map = new HashMap();
                    map.put("name", mediaCodecInfo.getName());
                    if (com.applovin.impl.p0.g()) {
                        map.put("is_hardware_accelerated", Boolean.valueOf(mediaCodecInfo.isHardwareAccelerated()));
                        map.put("is_software_only", Boolean.valueOf(mediaCodecInfo.isSoftwareOnly()));
                    }
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    ArrayList arrayList3 = new ArrayList();
                    HashMap map2 = new HashMap();
                    int length2 = supportedTypes.length;
                    int i16 = 0;
                    while (i16 < length2) {
                        String str = supportedTypes[i16];
                        MediaCodecInfo[] mediaCodecInfoArr2 = codecInfos;
                        if (str.toLowerCase(Locale.ROOT).startsWith("video/")) {
                            arrayList3.add(str);
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                if (capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) {
                                    arrayList2 = arrayList2;
                                    i12 = length;
                                    i15 = i15;
                                    map = map;
                                    strArr = supportedTypes;
                                    i13 = length2;
                                } else {
                                    i12 = length;
                                    try {
                                        HashMap map3 = new HashMap();
                                        strArr = supportedTypes;
                                        try {
                                            i13 = length2;
                                            try {
                                                map3.put("max_width", videoCapabilities.getSupportedWidths().getUpper());
                                                map3.put("max_height", videoCapabilities.getSupportedHeights().getUpper());
                                                Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
                                                Integer num = (Integer) bitrateRange.getLower();
                                                Integer num2 = (Integer) bitrateRange.getUpper();
                                                i15 = i15;
                                                arrayList2 = arrayList2;
                                                try {
                                                    Integer[] numArr = new Integer[2];
                                                    try {
                                                        numArr[0] = num;
                                                        numArr[1] = num2;
                                                        map3.put("bitrate_range_bps", Arrays.asList(numArr));
                                                        Range<Integer> supportedFrameRates = videoCapabilities.getSupportedFrameRates();
                                                        Integer num3 = (Integer) supportedFrameRates.getLower();
                                                        Integer num4 = (Integer) supportedFrameRates.getUpper();
                                                        map = map;
                                                        try {
                                                            Integer[] numArr2 = new Integer[2];
                                                            try {
                                                                numArr2[0] = num3;
                                                                numArr2[1] = num4;
                                                                map3.put("overall_frame_rate_range", Arrays.asList(numArr2));
                                                                int iIntValue = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                                                                int iIntValue2 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                                                                if (videoCapabilities.isSizeSupported(iIntValue, iIntValue2)) {
                                                                    try {
                                                                        Range<Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(iIntValue, iIntValue2);
                                                                        if (supportedFrameRatesFor != null) {
                                                                            Double d10 = (Double) supportedFrameRatesFor.getLower();
                                                                            Double d11 = (Double) supportedFrameRatesFor.getUpper();
                                                                            Double[] dArr = new Double[2];
                                                                            i14 = 0;
                                                                            try {
                                                                                dArr[0] = d10;
                                                                                try {
                                                                                    dArr[1] = d11;
                                                                                    map3.put("frame_rate_range_for_max_res", Arrays.asList(dArr));
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    if (p.a()) {
                                                                                        this.f8492b.a("DataCollector", "Could not get frame rates for max resolution for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                th = th2;
                                                                            }
                                                                        } else {
                                                                            i14 = 0;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        i14 = 0;
                                                                    }
                                                                } else {
                                                                    i14 = 0;
                                                                }
                                                                ArrayList arrayList4 = new ArrayList();
                                                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                                                if (codecProfileLevelArr != null && codecProfileLevelArr.length > 0) {
                                                                    int length3 = codecProfileLevelArr.length;
                                                                    int i17 = i14;
                                                                    while (i17 < length3) {
                                                                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i17];
                                                                        HashMap map4 = new HashMap();
                                                                        map4.put(Scopes.PROFILE, Integer.valueOf(codecProfileLevel.profile));
                                                                        map4.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(codecProfileLevel.level));
                                                                        arrayList4.add(map4);
                                                                        i17++;
                                                                        codecProfileLevelArr = codecProfileLevelArr;
                                                                    }
                                                                    map3.put("profile_levels", arrayList4);
                                                                }
                                                                if (!map3.isEmpty()) {
                                                                    map2.put(str, map3);
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                if (p.a()) {
                                                                    this.f8492b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            if (p.a()) {
                                                                this.f8492b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                            }
                                                            i16++;
                                                            codecInfos = mediaCodecInfoArr2;
                                                            length = i12;
                                                            supportedTypes = strArr;
                                                            map = map;
                                                            length2 = i13;
                                                            i15 = i15;
                                                            arrayList2 = arrayList2;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        map = map;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    map = map;
                                                    if (p.a()) {
                                                        this.f8492b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                    }
                                                    i16++;
                                                    codecInfos = mediaCodecInfoArr2;
                                                    length = i12;
                                                    supportedTypes = strArr;
                                                    map = map;
                                                    length2 = i13;
                                                    i15 = i15;
                                                    arrayList2 = arrayList2;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                arrayList2 = arrayList2;
                                                i15 = i15;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            arrayList2 = arrayList2;
                                            i13 = length2;
                                            if (p.a()) {
                                                this.f8492b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                            }
                                            i16++;
                                            codecInfos = mediaCodecInfoArr2;
                                            length = i12;
                                            supportedTypes = strArr;
                                            map = map;
                                            length2 = i13;
                                            i15 = i15;
                                            arrayList2 = arrayList2;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        strArr = supportedTypes;
                                        i13 = length2;
                                        if (p.a()) {
                                            this.f8492b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                        }
                                        i16++;
                                        codecInfos = mediaCodecInfoArr2;
                                        length = i12;
                                        supportedTypes = strArr;
                                        map = map;
                                        length2 = i13;
                                        i15 = i15;
                                        arrayList2 = arrayList2;
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                i12 = length;
                            }
                        } else {
                            arrayList2 = arrayList2;
                            i12 = length;
                            i15 = i15;
                            map = map;
                            strArr = supportedTypes;
                            i13 = length2;
                        }
                        i16++;
                        codecInfos = mediaCodecInfoArr2;
                        length = i12;
                        supportedTypes = strArr;
                        map = map;
                        length2 = i13;
                        i15 = i15;
                        arrayList2 = arrayList2;
                    }
                    ArrayList arrayList5 = arrayList2;
                    mediaCodecInfoArr = codecInfos;
                    i10 = length;
                    i11 = i15;
                    HashMap map5 = map;
                    if (arrayList3.isEmpty()) {
                        arrayList = arrayList5;
                    } else {
                        map5.put("supported_mime_types", arrayList3);
                        if (!map2.isEmpty()) {
                            map5.put("capabilities_by_type", map2);
                        }
                        arrayList = arrayList5;
                        arrayList.add(map5);
                    }
                }
                i15 = i11 + 1;
                arrayList2 = arrayList;
                codecInfos = mediaCodecInfoArr;
                length = i10;
            }
            return new JSONArray((Collection) arrayList2);
        } catch (Throwable th12) {
            if (p.a()) {
                this.f8492b.a("DataCollector", "Failed to get MediaCodecList", th12);
            }
            return new JSONArray();
        }
    }

    public static String J() {
        return f8488k;
    }

    private Map L() {
        return q7.a(a((Map) null, true, false));
    }

    private boolean O() {
        try {
            return b() || c();
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean P() {
        if (com.applovin.impl.p0.g()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(q7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.f8491a)));
    }

    private boolean Q() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.p0.d() && (connectivityManager = (ConnectivityManager) this.f8493c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f8491a.Q();
                if (p.a()) {
                    this.f8491a.Q().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private boolean R() {
        boolean z10 = this.f8493c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f8493c.getPackageManager();
        return z10 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean S() {
        if (com.applovin.impl.p0.e()) {
            return Boolean.valueOf(this.f8493c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f8499i.set(s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        Map mapY = Y();
        List listX = X();
        synchronized (this.f8497g) {
            if (mapY != null) {
                try {
                    this.f8496f.putAll(mapY);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (listX != null) {
                this.f8496f.put("dl", listX);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        JSONArray jSONArrayF = F();
        synchronized (this.f8495e) {
            this.f8494d.put("video_decoders", jSONArrayF);
        }
    }

    private List X() {
        List listC = this.f8491a.c(z4.M4);
        if (CollectionUtils.isEmpty(listC)) {
            return null;
        }
        return q7.a("/proc/self/maps", listC, this.f8491a);
    }

    private Map Y() {
        boolean z10;
        int i10;
        Throwable th;
        if (!((Boolean) this.f8491a.a(z4.L4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z10 = false;
            i10 = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String string = stackTraceElement.toString();
                        if (!z10 && string.contains("de.robv.android.xposed")) {
                            z10 = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i10++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f8491a.E().b("DataCollector", "collectHookingSignals", th);
                }
            }
        } catch (Throwable th3) {
            z10 = false;
            i10 = 0;
            th = th3;
        }
        map.put("xpd", Boolean.valueOf(z10));
        map.put("zi_count", Integer.valueOf(i10));
        CollectionUtils.putBooleanIfValid("fpd", P(), map);
        return map;
    }

    private void a0() {
        this.f8491a.s0().a((k5) new u6(this.f8491a, "collectPostInitAppInfo", new Runnable() { // from class: com.applovin.impl.sdk.s1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8688a.V();
            }
        }), f6.b.OTHER);
    }

    private void b0() {
        this.f8491a.s0().a((k5) new u6(this.f8491a, "collectVideoDecodersInfo", new Runnable() { // from class: com.applovin.impl.sdk.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8692a.W();
            }
        }), f6.b.OTHER);
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f8493c);
        if (orientation == 1) {
            return "portrait";
        }
        return orientation == 2 ? "landscape" : "none";
    }

    private List i() {
        ActivityManager activityManager;
        if (!com.applovin.impl.p0.c()) {
            return null;
        }
        Integer num = (Integer) this.f8491a.a(z4.E4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f8493c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationStartInfo> historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        for (ApplicationStartInfo applicationStartInfo : historicalProcessStartReasons) {
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfo.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfo.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfo.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfo.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfo.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfo.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfo.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfo.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfo.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfo.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfo.getLaunchMode()));
            map.put(SDKConstants.PARAM_INTENT, a(applicationStartInfo.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f8493c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f8504b = -1;
        } else {
            cVar.f8504b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f8503a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1) : -1;
        cVar.f8505c = Boolean.valueOf(Settings.Global.getInt(this.f8493c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private long k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l10 = (Long) this.f8491a.a(z4.K4);
        return (jCurrentTimeMillis / l10.longValue()) * l10.longValue();
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8493c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!p.a()) {
                return "";
            }
            this.f8492b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8493c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveInfoResolveActivity = this.f8493c.getPackageManager().resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f8488k = activityInfo.packageName;
        }
        return f8488k;
    }

    private String q() {
        if (!com.applovin.impl.p0.d()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f8493c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(",");
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Map r() {
        HashMap map = new HashMap();
        JSONObject jSONObjectDeserialize = JsonUtils.deserialize((String) this.f8491a.a(z4.N4));
        if (JsonUtils.isValid(jSONObjectDeserialize)) {
            map.putAll(a(jSONObjectDeserialize, new d() { // from class: com.applovin.impl.sdk.o1
                @Override // com.applovin.impl.sdk.m.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.System.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize2 = JsonUtils.deserialize((String) this.f8491a.a(z4.O4));
        if (JsonUtils.isValid(jSONObjectDeserialize2)) {
            map.putAll(a(jSONObjectDeserialize2, new d() { // from class: com.applovin.impl.sdk.p1
                @Override // com.applovin.impl.sdk.m.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.Secure.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize3 = JsonUtils.deserialize((String) this.f8491a.a(z4.P4));
        if (JsonUtils.isValid(jSONObjectDeserialize3)) {
            map.putAll(a(jSONObjectDeserialize3, new d() { // from class: com.applovin.impl.sdk.q1
                @Override // com.applovin.impl.sdk.m.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.Global.getString(contentResolver, str);
                }
            }));
        }
        return map;
    }

    private Float s() {
        Float f10 = (Float) this.f8491a.a(z4.f9237g4);
        Float fB = this.f8491a.q().b();
        if (fB != null) {
            return Float.valueOf(fB.floatValue() * f10.floatValue());
        }
        return null;
    }

    private float t() {
        try {
            return Settings.System.getFloat(this.f8493c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (!p.a()) {
                return -1.0f;
            }
            this.f8492b.a("DataCollector", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    private boolean u() {
        SensorManager sensorManager = (SensorManager) this.f8493c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map v() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid(Cookie.IABTCF_GDPR_APPLIES, this.f8491a.t0().g(), map);
        CollectionUtils.putStringIfValid(Cookie.IABTCF_TC_STRING, this.f8491a.t0().j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f8491a.t0().c(), map);
        return map;
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.f8493c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean x() {
        AudioManager audioManager = (AudioManager) this.f8493c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8493c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!p.a()) {
                return "";
            }
            this.f8492b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8493c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!p.a()) {
                return "";
            }
            this.f8492b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    public String A() {
        return AppLovinSdkUtils.isFireOS(this.f8493c) ? "fireos" : "android";
    }

    public Map G() {
        Map map;
        synchronized (this.f8497g) {
            map = CollectionUtils.map(this.f8496f);
        }
        String str = StringUtils.isValidString(f8487j) ? f8487j : this.f8493c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f8491a.E0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f8491a.B0()));
        map.put("app_launch_count", Long.valueOf(this.f8491a.O()));
        CollectionUtils.putLongIfValid("last_launch_ms", this.f8491a.N(), map);
        map.put("test_ads", Boolean.valueOf(this.f8498h));
        map.put("test_mode", Integer.valueOf(this.f8491a.u0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f8491a.p0().isMuted()));
        if (((Boolean) this.f8491a.a(z4.G3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f8491a.y0().e(), map);
        }
        if (((Boolean) this.f8491a.a(z4.J3)).booleanValue()) {
            map.put("compass_random_token", this.f8491a.v());
        }
        if (((Boolean) this.f8491a.a(z4.L3)).booleanValue()) {
            map.put("applovin_random_token", this.f8491a.j0());
        }
        if (((Boolean) this.f8491a.a(z4.P3)).booleanValue()) {
            map.put("art", this.f8491a.s());
        }
        map.putAll(v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f8491a.r0().a(b5.T, null), map);
        return map;
    }

    public b H() {
        return (b) f8490m.get();
    }

    protected String I() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f8491a.a(z4.f9337r5)).booleanValue() ? w4.b(strEncodeToString, q7.a(this.f8491a), w4.a.a(((Integer) this.f8491a.a(z4.f9346s5)).intValue()), this.f8491a) : strEncodeToString;
    }

    public String K() {
        ActivityManager activityManager = (ActivityManager) this.f8493c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map M() {
        Map map;
        synchronized (this.f8497g) {
            map = CollectionUtils.map(this.f8496f);
        }
        return map;
    }

    public Map N() {
        Map map;
        synchronized (this.f8495e) {
            map = CollectionUtils.map(this.f8494d);
        }
        return map;
    }

    public boolean T() {
        return this.f8498h;
    }

    public void Z() {
        f6 f6VarS0 = this.f8491a.s0();
        q5 q5Var = new q5(this.f8491a, new a());
        f6.b bVar = f6.b.OTHER;
        f6VarS0.a((k5) q5Var, bVar);
        this.f8491a.s0().a((k5) new u6(this.f8491a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8506a.U();
            }
        }), bVar);
    }

    public void c0() {
        synchronized (this.f8495e) {
            a(this.f8494d);
        }
        a0();
    }

    public com.applovin.impl.v.a f() {
        com.applovin.impl.v.a aVarB = com.applovin.impl.v.b(this.f8493c);
        if (aVarB == null) {
            return new com.applovin.impl.v.a();
        }
        if (((Boolean) this.f8491a.a(z4.E3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f8491a.a(z4.D3)).booleanValue()) {
                aVarB.a("");
            }
            f8489l.set(aVarB);
        } else {
            aVarB = new com.applovin.impl.v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f8491a.L() != null ? this.f8491a.L().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds != null) {
            String strA = aVarB.a();
            if (StringUtils.isValidString(strA)) {
                this.f8498h = testDeviceAdvertisingIds.contains(strA);
            }
            b bVarH = H();
            String str = bVarH != null ? bVarH.f8501a : null;
            if (StringUtils.isValidString(str)) {
                this.f8498h = testDeviceAdvertisingIds.contains(str) | this.f8498h;
            }
        } else {
            this.f8498h = false;
        }
        return aVarB;
    }

    public Map m() {
        HashMap map = new HashMap();
        e4 e4VarF0 = this.f8491a.f0();
        Deque dequeB = e4VarF0.b();
        if (!CollectionUtils.isEmpty(dequeB)) {
            map.put("network_throughput_info", dequeB);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", e4VarF0.a(), map);
        com.applovin.impl.r0.d dVarA = this.f8491a.x().a();
        if (dVarA != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
            map.put("lrm_url", dVarA.d());
            map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
            map.put("lrm_rs", String.valueOf(dVarA.b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public Map p() {
        return a(false);
    }

    private Map C() {
        HashMap map = new HashMap();
        PackageManager packageManager = this.f8493c.getPackageManager();
        ApplicationInfo applicationInfo = this.f8493c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        int i10 = com.applovin.impl.p0.f() ? 134238224 : 20560;
        PackageInfo packageInfoA = q7.a(this.f8493c, 0);
        PackageInfo packageInfoA2 = q7.a(this.f8493c, i10);
        String strA = a(applicationInfo.packageName, packageManager, this.f8491a);
        String strA2 = a(applicationInfo.packageName, packageManager);
        map.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfoA != null ? packageInfoA.versionCode : -1));
        map.put(GEmOVMyH.YqJxIO, StringUtils.emptyIfNull(strA));
        map.put("originating_name", StringUtils.emptyIfNull(strA2));
        map.put("tg", p7.a(this.f8491a));
        map.put("debug", Boolean.valueOf(q7.c(this.f8491a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(l.o()));
        map.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.f8491a.o0().getSessionId());
        map.put("j8", Boolean.valueOf(l.H0()));
        map.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        map.put("last_update_ms", Long.valueOf(packageInfoA != null ? packageInfoA.lastUpdateTime : 0L));
        List listD = d(packageInfoA2);
        if (!CollectionUtils.isEmpty(listD)) {
            map.put("signing_info", listD);
        }
        List listA = a(packageInfoA2);
        if (!CollectionUtils.isEmpty(listA)) {
            map.put("instrumentation", listA);
        }
        map.put("install_location", Integer.valueOf(packageInfoA != null ? packageInfoA.installLocation : 0));
        map.put("split_names", packageInfoA != null ? packageInfoA.splitNames : Collections.emptyList());
        if (((Boolean) this.f8491a.a(z4.Q4)).booleanValue()) {
            Map mapC = c(packageInfoA2);
            if (!CollectionUtils.isEmpty(mapC)) {
                map.put("req_p", mapC);
            }
            List listB = b(packageInfoA2);
            if (!CollectionUtils.isEmpty(listB)) {
                map.put("req_f", listB);
            }
        }
        l lVar = this.f8491a;
        b5 b5Var = b5.f6137h;
        Long l10 = (Long) lVar.a(b5Var);
        if (l10 != null) {
            map.put("ia_v2", l10);
        } else {
            this.f8491a.b(b5Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f8491a.g0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.j.b(), map);
        map.put("api_did", this.f8491a.a(z4.f9223f));
        map.put("first_install_v3_ms", packageInfoA != null ? Long.valueOf(packageInfoA.firstInstallTime) : "");
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (com.applovin.impl.p0.d()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f8491a.J0()) {
            map.put("unity_version", q7.a(this.f8491a.p0()));
        }
        List listI = i();
        if (!CollectionUtils.isEmpty(listI)) {
            map.put("application_start_info", listI);
        }
        List listG = g();
        if (!CollectionUtils.isEmpty(listG)) {
            map.put("application_exit_info", listG);
        }
        if (com.applovin.impl.p0.e()) {
            map.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strI = I();
            if (StringUtils.isValidString(strI)) {
                this.f8491a.Q();
                if (p.a()) {
                    this.f8491a.Q().a("DataCollector", "Successfully retrieved bid token");
                }
                v2.a(appLovinBidTokenCollectionListener, strI);
                return;
            }
            this.f8491a.Q();
            if (p.a()) {
                this.f8491a.Q().b("DataCollector", "Empty bid token");
            }
            v2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (p.a()) {
                this.f8492b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f8491a.E().a("DataCollector", "collectBidToken", th);
            v2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map c(PackageInfo packageInfo) {
        HashMap map = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            map = new HashMap();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                CollectionUtils.putIntegerIfValid(strArr[i10], Integer.valueOf(iArr[i10]), map);
            }
        }
        return map;
    }

    private List d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (com.applovin.impl.p0.f()) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                return a(signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory());
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return a(signatureArr);
            }
        }
        return null;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put(NyXuoef.MEJCd, this.f8491a.a(z4.f9277l));
        map.put("sc2", this.f8491a.a(z4.f9286m));
        map.put("sc3", this.f8491a.a(z4.f9295n));
        map.put(cNMUz.lhP, this.f8491a.a(z4.f9304o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f8491a.a(b5.H), map);
        return map;
    }

    private List g() {
        ActivityManager activityManager;
        String packageName = null;
        if (!com.applovin.impl.p0.b()) {
            return null;
        }
        Integer num = (Integer) this.f8491a.a(z4.F4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f8493c.getSystemService("activity")) == null) {
            return null;
        }
        if (((Boolean) this.f8491a.a(z4.G4)).booleanValue()) {
            packageName = this.f8493c.getPackageName();
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            HashMap map = new HashMap(13);
            int reason = applicationExitInfo.getReason();
            map.put("reason", Integer.valueOf(reason));
            String description = applicationExitInfo.getDescription();
            CollectionUtils.putStringIfValid("description", description, map);
            map.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(applicationExitInfo.getTimestamp()));
            map.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Integer.valueOf(applicationExitInfo.getStatus()));
            map.put("importance", Integer.valueOf(applicationExitInfo.getImportance()));
            map.put(vgmm.UMrNW, Long.valueOf(applicationExitInfo.getPss()));
            map.put("rss", Long.valueOf(applicationExitInfo.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfo.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationExitInfo.getPid()));
            map.put("ruid", Integer.valueOf(applicationExitInfo.getRealUid()));
            map.put("puid", Integer.valueOf(applicationExitInfo.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationExitInfo.getDefiningUid()));
            String strA = a(applicationExitInfo, reason);
            if (StringUtils.isValidString(strA)) {
                map.put("stack_trace", strA);
                b(strA, reason, description);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    protected void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f8491a.s0().a((k5) new u6(this.f8491a, ((Boolean) this.f8491a.a(z4.T3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.r1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8683a.b(appLovinBidTokenCollectionListener);
            }
        }), f6.b.CORE);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z10);
        Map mapG = G();
        Map mapM = m();
        Map mapM0 = this.f8491a.m0();
        if (z11) {
            map2.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, mapA);
            map2.put("app_info", mapG);
            if (mapM != null) {
                map2.put("connection_info", mapM);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapM0)) {
                map2.put("segments", mapM0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapG);
            if (mapM != null) {
                map2.putAll(mapM);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapM0)) {
                map2.putAll(mapM0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f8491a.X(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f8491a.D(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f8491a.a(z4.R3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f8491a.v0()), map2);
        if (!((Boolean) this.f8491a.a(z4.f9319p5)).booleanValue()) {
            map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8491a.k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f8491a.r(), map2);
        map2.putAll(e());
        map2.put("rid", UUID.randomUUID().toString());
        return map2;
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x019a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x01b1, please report this as an issue */
    private long d() {
        long j10;
        int iB;
        int iB2;
        int iB3;
        long j11;
        long j12;
        long j13;
        String strEmptyIfNull = StringUtils.emptyIfNull(Settings.Secure.getString(this.f8493c.getContentResolver(), "enabled_accessibility_services"));
        long j14 = strEmptyIfNull.contains("AccessibilityMenuService") ? 256L : 0L;
        if (strEmptyIfNull.contains("SelectToSpeakService")) {
            j14 |= 512;
        }
        if (strEmptyIfNull.contains("SoundAmplifierService")) {
            j14 |= 2;
        }
        if (strEmptyIfNull.contains("SpeechToTextAccessibilityService")) {
            j14 |= 128;
        }
        if (strEmptyIfNull.contains("SwitchAccessService")) {
            j14 |= 4;
        }
        if ((this.f8493c.getResources().getConfiguration().uiMode & 48) == 32) {
            j14 |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        if (a("accessibility_enabled")) {
            j14 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j14 |= 16;
        }
        if (a("accessibility_display_inversion_enabled")) {
            j14 |= 32;
        }
        if (a("skip_first_use_hints")) {
            j14 |= 64;
        }
        if (a("lock_screen_allow_remote_input")) {
            j14 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j14 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j14 |= 8192;
        }
        if (a("wear_talkback_enabled")) {
            j14 |= Http2Stream.EMIT_BUFFER_SIZE;
        }
        if (a("hush_gesture_used")) {
            j14 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j14 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j14 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j14 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j14 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j14 |= 1048576;
        }
        if (a("accessibility_autoclick_enabled")) {
            j14 |= 2097152;
        }
        if (a("accessibility_large_pointer_icon")) {
            j14 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j14 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j14 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j14 |= 33554432;
        }
        if (a("rtt_calling_mode")) {
            j14 |= 67108864;
        }
        if (a("accessibility_floating_menu_fade_enabled")) {
            j14 |= 134217728;
        }
        if (a("accessibility_show_window_magnification_prompt")) {
            j14 |= 268435456;
        }
        if (a("accessibility_floating_menu_migration_tooltip_prompt")) {
            j14 |= 536870912;
        }
        int iB4 = b("accessibility_magnification_mode");
        if (iB4 == 0) {
            j10 = 1073741824;
        } else if (iB4 == 1) {
            j10 = 2147483648L;
        } else {
            if (iB4 != 2) {
                if (iB4 == 3) {
                    j10 = 8589934592L;
                }
                iB = b("accessibility_button_mode");
                if (iB == 0) {
                    j13 = iB == 1 ? 34359738368L : 17179869184L;
                    iB2 = b("accessibility_floating_menu_size");
                    if (iB2 == 0) {
                        j12 = iB2 == 1 ? 137438953472L : 68719476736L;
                        iB3 = b("accessibility_floating_menu_icon_type");
                        if (iB3 == 0) {
                            j11 = 274877906944L;
                        } else {
                            if (iB3 == 1) {
                                return j14;
                            }
                            j11 = 549755813888L;
                        }
                        return j14 | j11;
                    }
                    j14 |= j12;
                    iB3 = b("accessibility_floating_menu_icon_type");
                    if (iB3 == 0) {
                        j11 = 274877906944L;
                    } else {
                        if (iB3 == 1) {
                            return j14;
                        }
                        j11 = 549755813888L;
                    }
                    return j14 | j11;
                }
                j14 |= j13;
                iB2 = b("accessibility_floating_menu_size");
                if (iB2 == 0) {
                    if (iB2 == 1) {
                    }
                    iB3 = b("accessibility_floating_menu_icon_type");
                    if (iB3 == 0) {
                        j11 = 274877906944L;
                    } else {
                        if (iB3 == 1) {
                            return j14;
                        }
                        j11 = 549755813888L;
                    }
                    return j14 | j11;
                }
                j14 |= j12;
                iB3 = b("accessibility_floating_menu_icon_type");
                if (iB3 == 0) {
                    j11 = 274877906944L;
                } else {
                    if (iB3 == 1) {
                        return j14;
                    }
                    j11 = 549755813888L;
                }
                return j14 | j11;
            }
            j10 = 4294967296L;
        }
        j14 |= j10;
        iB = b("accessibility_button_mode");
        if (iB == 0) {
            if (iB == 1) {
            }
            iB2 = b("accessibility_floating_menu_size");
            if (iB2 == 0) {
                if (iB2 == 1) {
                }
                iB3 = b("accessibility_floating_menu_icon_type");
                if (iB3 == 0) {
                    j11 = 274877906944L;
                } else {
                    if (iB3 == 1) {
                        return j14;
                    }
                    j11 = 549755813888L;
                }
                return j14 | j11;
            }
            j14 |= j12;
            iB3 = b("accessibility_floating_menu_icon_type");
            if (iB3 == 0) {
                j11 = 274877906944L;
            } else {
                if (iB3 == 1) {
                    return j14;
                }
                j11 = 549755813888L;
            }
            return j14 | j11;
        }
        j14 |= j13;
        iB2 = b("accessibility_floating_menu_size");
        if (iB2 == 0) {
            if (iB2 == 1) {
            }
            iB3 = b("accessibility_floating_menu_icon_type");
            if (iB3 == 0) {
                j11 = 274877906944L;
            } else {
                if (iB3 == 1) {
                    return j14;
                }
                j11 = 549755813888L;
            }
            return j14 | j11;
        }
        j14 |= j12;
        iB3 = b("accessibility_floating_menu_icon_type");
        if (iB3 == 0) {
            j11 = 274877906944L;
        } else {
            if (iB3 == 1) {
                return j14;
            }
            j11 = 549755813888L;
        }
        return j14 | j11;
    }

    private List b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    private void b(final String str, final int i10, final String str2) {
        this.f8491a.s0().a((k5) new u6(this.f8491a, "reportAppExitInfoStackTrace", new Runnable() { // from class: com.applovin.impl.sdk.n1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8515a.a(str, i10, str2);
            }
        }), f6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f8493c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private Map a(boolean z10) {
        Map map;
        synchronized (this.f8495e) {
            map = CollectionUtils.map(this.f8494d);
        }
        return a(map, z10);
    }

    private void a(Map map) {
        if (((Boolean) this.f8491a.a(z4.f9184a4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f8491a.a(z4.f9192b4)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(t()));
        }
        if (((Boolean) this.f8491a.a(z4.f9255i4)).booleanValue() && q7.d(this.f8491a)) {
            o8.a(this.f8491a);
        }
        if (((Boolean) this.f8491a.a(z4.f9354t4)).booleanValue()) {
            o8.b(this.f8491a);
        }
        if (((Boolean) this.f8491a.a(z4.f9246h4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f8491a.a(z4.f9210d4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(Q()));
        }
        map.put("is_pc", Boolean.valueOf(R()));
        if (((Boolean) this.f8491a.a(z4.f9372v4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", K(), map);
        }
        if (((Boolean) this.f8491a.a(z4.O6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.f8491a.a(z4.P6)).booleanValue() || map.containsKey("video_decoders")) {
            return;
        }
        b0();
    }

    private Map a(Map map, boolean z10) {
        com.applovin.impl.v.a aVarF;
        Map map2 = CollectionUtils.map(map);
        Point pointB = com.applovin.impl.p0.b(this.f8493c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        DisplayMetrics displayMetrics = this.f8493c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.x, 2.0d) + Math.pow(pointB.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f8493c)));
        if (((Boolean) this.f8491a.a(z4.J4)).booleanValue()) {
            String strB = q7.b(this.f8493c);
            Map mapA = com.applovin.impl.p0.a(strB);
            if (mapA != null) {
                map2.put("display_cutout_insets", mapA);
            }
            Map mapC = com.applovin.impl.p0.c(strB);
            if (mapC != null) {
                map2.put("status_bar_insets", mapC);
            }
            Map mapB = com.applovin.impl.p0.b(strB);
            if (mapB != null) {
                map2.put("nav_bar_insets", mapB);
            }
        }
        if (z10) {
            aVarF = (com.applovin.impl.v.a) f8489l.get();
            if (aVarF != null) {
                Z();
            } else if (q7.i()) {
                aVarF = new com.applovin.impl.v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f8490m.get();
        if (((Boolean) this.f8491a.a(z4.F3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f8501a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f8502b));
        }
        Boolean boolB = com.applovin.impl.q0.b().b(this.f8493c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = com.applovin.impl.q0.c().b(this.f8493c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = com.applovin.impl.q0.a().b(this.f8493c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f8491a.a(z4.U3)).booleanValue()) {
            c cVarJ = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarJ.f8503a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarJ.f8504b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarJ.f8505c, map2);
        }
        if (((Boolean) this.f8491a.a(z4.f9201c4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f8491a.o0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f8491a.a(z4.f9228f4)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(O()));
        }
        Float fS = z10 ? (Float) this.f8499i.get() : s();
        if (fS != null) {
            map2.put("volume", fS);
        }
        CollectionUtils.putBooleanIfValid("ma", w(), map2);
        CollectionUtils.putBooleanIfValid("spo", x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f8491a.o0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f8491a.o0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f8491a.o0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.f8491a.o0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f8493c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e10) {
            if (p.a()) {
                this.f8492b.a("DataCollector", "Unable to collect screen brightness", e10);
            }
        }
        if (((Boolean) this.f8491a.a(z4.f9255i4)).booleanValue() && q7.d(this.f8491a)) {
            o8.a(this.f8491a);
            String strA2 = o8.a();
            if (StringUtils.isValidString(strA2)) {
                map2.put("ua", strA2);
            }
        }
        if (((Boolean) this.f8491a.a(z4.f9354t4)).booleanValue()) {
            o8.b(this.f8491a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(o8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", o8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", o8.b(), map2);
        }
        if (((Boolean) this.f8491a.a(z4.W3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (p.a()) {
                    this.f8492b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f8491a.a(z4.X3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = q7.a((ActivityManager) this.f8493c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f8491a.a(z4.Y3)).booleanValue() && com.applovin.impl.p0.a("android.permission.READ_PHONE_STATE", this.f8493c) && com.applovin.impl.p0.d()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f8493c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f8491a.a(z4.V3)).booleanValue()) {
            String strB2 = B();
            if (!TextUtils.isEmpty(strB2)) {
                map2.put("so", strB2);
            }
        }
        map2.put("device_orientation", q7.b(this.f8493c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.f8491a.a(z4.Z3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(q7.k()));
        }
        PowerManager powerManager = (PowerManager) this.f8493c.getSystemService("power");
        if (powerManager != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f8491a.a(z4.f9273k4)).booleanValue() && this.f8491a.n0() != null) {
            map2.put("da", Float.valueOf(this.f8491a.n0().a()));
        }
        if (((Boolean) this.f8491a.a(z4.f9282l4)).booleanValue() && this.f8491a.n0() != null) {
            map2.put("dm", Float.valueOf(this.f8491a.n0().b()));
        }
        map2.put(wHzciBnJlYkdX.XbVGnQKrBiwpbc, Integer.valueOf(this.f8491a.q().c()));
        map2.put("network", com.applovin.impl.s0.g(this.f8491a));
        String strQ = q();
        if (StringUtils.isValidString(strQ)) {
            map2.put("kb", strQ);
        }
        Map mapR = r();
        if (!CollectionUtils.isEmpty(mapR)) {
            map2.put("ds", mapR);
        }
        return map2;
    }

    private List a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(StringUtils.toHexString(messageDigest.digest()));
            }
        } catch (Throwable th) {
            this.f8491a.E().b("DataCollector", "parseSignatures", th);
        }
        return arrayList;
    }

    private List a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap map = new HashMap();
            map.put("name", instrumentationInfo.name);
            map.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            map.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            map.put("t_pa", instrumentationInfo.targetPackage);
            if (com.applovin.impl.p0.e()) {
                map.put("t_pr", instrumentationInfo.targetProcesses);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(5);
        map.put("action", StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.emptyList());
        return map;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i10) {
        InputStream traceInputStream;
        String line;
        if (this.f8491a.c(z4.I4).contains(Integer.toString(i10))) {
            return null;
        }
        Integer num = (Integer) this.f8491a.a(z4.H4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th) {
            this.f8491a.Q();
            if (p.a()) {
                this.f8491a.Q().a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
            }
            this.f8491a.E().b("DataCollector", "getTraceInputStream", th);
            traceInputStream = null;
        }
        if (traceInputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
            for (int i11 = 0; i11 < num.intValue() && (line = bufferedReader.readLine()) != null; i11++) {
                try {
                    sb2.append(line);
                    sb2.append('\n');
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (Throwable th4) {
            this.f8491a.Q();
            if (p.a()) {
                this.f8491a.Q().a("DataCollector", "Failed to read stack trace from input stream", th4);
            }
            this.f8491a.E().b("DataCollector", "readStackTraceFromInputStream", th4);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i10, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i10), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f8491a.E().d(f2.P0, mapHashMap);
    }

    public static void a(com.applovin.impl.v.a aVar) {
        f8489l.set(aVar);
    }

    public static void a(b bVar) {
        f8490m.set(bVar);
    }

    public static void a(String str, l lVar) {
        String strA = a(l.p().getApplicationInfo().packageName, l.p().getPackageManager(), lVar);
        List listC = lVar.c(z4.f9258i7);
        if (!StringUtils.isValidString(strA) || listC.contains(strA)) {
            f8487j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private Map a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.f8493c.getContentResolver();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject, next, null);
            if (StringUtils.isValidString(string)) {
                map.put(next, StringUtils.emptyIfNull(a(dVar, contentResolver, string)));
            }
        }
        return map;
    }

    private String a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.a(contentResolver, str);
        } catch (Throwable th) {
            this.f8491a.E().a("DataCollector", "retrieveSystemSettingValue", th, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    private String a(String str, PackageManager packageManager) {
        if (!com.applovin.impl.p0.b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th) {
            this.f8491a.E().b("DataCollector", "getOriginatingName", th);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, l lVar) {
        try {
            if (com.applovin.impl.p0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            lVar.E().b("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}
