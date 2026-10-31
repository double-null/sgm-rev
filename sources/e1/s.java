package e1;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: WebViewFeatureInternal.java */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1.a.b f13886a = new e1.a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1.a.b f13888b = new e1.a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1.a.e f13890c = new e1.a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1.a.c f13892d = new e1.a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1.a.f f13894e = new e1.a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final e1.a.f f13896f = new e1.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final e1.a.f f13898g = new e1.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e1.a.f f13900h = new e1.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e1.a.f f13902i = new e1.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e1.a.f f13904j = new e1.a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e1.a.c f13905k = new e1.a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e1.a.c f13906l = new e1.a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e1.a.c f13907m = new e1.a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e1.a.c f13908n = new e1.a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e1.a.c f13909o = new e1.a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e1.a.c f13910p = new e1.a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e1.a.b f13911q = new e1.a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e1.a.b f13912r = new e1.a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e1.a.c f13913s = new e1.a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e1.a.f f13914t = new e1.a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e1.a.c f13915u = new e1.a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e1.a.b f13916v = new e1.a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e1.a.b f13917w = new e1.a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e1.a.f f13918x = new e1.a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e1.a.f f13919y = new e1.a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e1.a.f f13920z = new e1.a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final e1.a.b A = new e1.a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final e1.a.b B = new e1.a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final e1.a.d C = new e1.a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final e1.a.b D = new e1.a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final e1.a.b E = new e1.a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final e1.a.b F = new e1.a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final e1.a.b G = new e1.a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final e1.a.e H = new e1.a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final e1.a.e I = new e1.a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final e1.a.h J = new e1.a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final e1.a.h K = new e1.a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final e1.a.g L = new e1.a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final o.b M = new o.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final o.a N = new o.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final e1.a.h O = new e1.a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final e1.a.i P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final e1.a.d Q = new e1.a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final e1.a.d R = new e1.a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final e1.a.h S = new e1.a.h("FORCE_DARK", "FORCE_DARK");
    public static final e1.a.d T = new e1.a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final e1.a.d U = new e1.a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final e1.a.d V = new e1.a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final e1.a.d W = new e1.a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final e1.a.d X = new e1.a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final e1.a.d Y = new e1.a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final e1.a.d Z = new e1.a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final e1.a.d f13887a0 = new e1.a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final e1.a.d f13889b0 = new e1.a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final e1.a.d f13891c0 = new b(TwDPD.HGqAlwrjibtiGaw, TwDPD.HGqAlwrjibtiGaw);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final e1.a.d f13893d0 = new e1.a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final e1.a.d f13895e0 = new e1.a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final e1.a.d f13897f0 = new e1.a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final e1.a.d f13899g0 = new e1.a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final e1.a.d f13901h0 = new e1.a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final e1.a.d f13903i0 = new e1.a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: compiled from: WebViewFeatureInternal.java */
    /* JADX INFO: loaded from: classes.dex */
    class a extends e1.a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Pattern f13921d;

        a(String str, String str2) {
            super(str, str2);
            this.f13921d = Pattern.compile("\\A\\d+");
        }

        @Override // e1.a
        public boolean c() {
            boolean zC = super.c();
            if (!zC || Build.VERSION.SDK_INT >= 29) {
                return zC;
            }
            PackageInfo packageInfoE = d1.f.e();
            if (packageInfoE == null) {
                return false;
            }
            Matcher matcher = this.f13921d.matcher(packageInfoE.versionName);
            return matcher.find() && Integer.parseInt(packageInfoE.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* JADX INFO: compiled from: WebViewFeatureInternal.java */
    /* JADX INFO: loaded from: classes.dex */
    class b extends e1.a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // e1.a
        public boolean c() {
            if (super.c() && d1.g.a("MULTI_PROCESS")) {
                return d1.f.k();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, e1.a.d());
    }

    public static <T extends h> boolean c(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((h) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
