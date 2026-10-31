package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: UserAgentManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UserAgentManager {
    private static final String SYSTEM_HTTP_AGENT;
    private static final String SYSTEM_PROPERTY_HTTP_AGENT = "http.agent";
    private static final AtomicBoolean WEB_USER_AGENT_PROCESSED;
    private static final AtomicBoolean WEB_USER_AGENT_UPDATED;
    private static Context applicationContext;
    private static String generatedUserAgent;
    public static String webUserAgent;
    public static final UserAgentManager INSTANCE = new UserAgentManager();
    private static final long DEFAULT_EXPIRATION_MS = TimeUnit.DAYS.toMillis(14);

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public static final class ApplovinUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplovinUserAgentSource(Context context) {
            super(context, "com.applovin.sdk.shared", "com.applovin.sdk.user_agent");
            kotlin.jvm.internal.t.f(context, "context");
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public static final class BidMachineUserAgentSource implements UserAgentSource, Runnable {
        private final Context applicationContext;
        private final long expirationMs;

        public BidMachineUserAgentSource(Context context, long j10) {
            kotlin.jvm.internal.t.f(context, "context");
            this.expirationMs = j10;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        public final long calculateExpirationMs() {
            return System.currentTimeMillis() + this.expirationMs;
        }

        public final void checkAndUpdate() {
            String str = get();
            if (str == null || str.length() == 0) {
                wb.a0.c(this);
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            return f2.x(this.applicationContext);
        }

        public final long getExpirationMs() {
            return this.expirationMs;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserAgentManager userAgentManager = UserAgentManager.INSTANCE;
                String defaultUserAgent = WebSettings.getDefaultUserAgent(this.applicationContext);
                if (defaultUserAgent != null) {
                    kotlin.jvm.internal.t.e(defaultUserAgent, "getDefaultUserAgent(applicationContext)");
                    f2.O(this.applicationContext, defaultUserAgent, calculateExpirationMs());
                } else {
                    defaultUserAgent = null;
                }
                UserAgentManager.webUserAgent = defaultUserAgent;
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public static final class FacebookUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookUserAgentSource(Context context) {
            super(context, "com.facebook.ads.internal.ua", "user_agent");
            kotlin.jvm.internal.t.f(context, "context");
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public static final class GeneratedUserAgentSource implements UserAgentSource {
        private final Context applicationContext;

        public GeneratedUserAgentSource(Context context) {
            kotlin.jvm.internal.t.f(context, "context");
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        private final void appendChromeToUserAgent(PackageManager packageManager, StringBuilder sb2) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i10], 0);
                    sb2.append(" Chrome/");
                    sb2.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                }
            }
        }

        private final void appendMobileToUserAgent(Context context, PackageManager packageManager, StringBuilder sb2) {
            String string;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb2.append(" Mobile");
                sb2.append(" ");
                int i10 = applicationInfo.labelRes;
                if (i10 == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i10);
                    kotlin.jvm.internal.t.e(string, "{\n                      …                        }");
                }
                sb2.append(string);
                sb2.append("/");
                sb2.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            return create(this.applicationContext);
        }

        private final String create(Context context) {
            try {
                StringBuilder userAgentBuilder = new StringBuilder("Mozilla/5.0");
                userAgentBuilder.append(" (Linux; Android ");
                userAgentBuilder.append(wb.f.d());
                userAgentBuilder.append("; ");
                userAgentBuilder.append(wb.f.c());
                userAgentBuilder.append(" Build/");
                userAgentBuilder.append(wb.f.a());
                userAgentBuilder.append("; wv)");
                userAgentBuilder.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                userAgentBuilder.append(" Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                kotlin.jvm.internal.t.e(packageManager, TwDPD.dOjmnfd);
                kotlin.jvm.internal.t.e(userAgentBuilder, "userAgentBuilder");
                appendChromeToUserAgent(packageManager, userAgentBuilder);
                appendMobileToUserAgent(context, packageManager, userAgentBuilder);
                String string = userAgentBuilder.toString();
                kotlin.jvm.internal.t.e(string, "userAgentBuilder.toString()");
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public static final class IronSourceUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IronSourceUserAgentSource(Context context) {
            super(context, "Mediation_Shared_Preferences", "browser_user_agent");
            kotlin.jvm.internal.t.f(context, "context");
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public static class SharedPreferenceUserAgentSource implements UserAgentSource {
        private final Context applicationContext;
        private final String field;
        private final String name;
        private SharedPreferences sharedPreferences;

        public SharedPreferenceUserAgentSource(Context context, String name, String field) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(name, "name");
            kotlin.jvm.internal.t.f(field, "field");
            this.name = name;
            this.field = field;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.t.e(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            try {
                if (this.sharedPreferences == null) {
                    this.sharedPreferences = this.applicationContext.getSharedPreferences(this.name, 0);
                }
                SharedPreferences sharedPreferences = this.sharedPreferences;
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(this.field, null);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    public interface UserAgentSource {
        String get();
    }

    static {
        String property;
        try {
            property = System.getProperty(SYSTEM_PROPERTY_HTTP_AGENT);
        } catch (Throwable unused) {
            property = null;
        }
        SYSTEM_HTTP_AGENT = property;
        WEB_USER_AGENT_PROCESSED = new AtomicBoolean(false);
        WEB_USER_AGENT_UPDATED = new AtomicBoolean(false);
    }

    private UserAgentManager() {
    }

    public static final void clear() {
        WEB_USER_AGENT_PROCESSED.set(false);
        webUserAgent = null;
        generatedUserAgent = null;
    }

    public static final String getUserAgent() {
        return getUserAgent(applicationContext);
    }

    public static final void initialize(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        applicationContext = context.getApplicationContext();
        INSTANCE.findWebUserAgent$bidmachine_android_sdk_ba_3_6_1(context);
    }

    public static final void updateWebViewUserAgent() {
        Context context;
        if (WEB_USER_AGENT_UPDATED.compareAndSet(false, true) && (context = applicationContext) != null) {
            try {
                new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).checkAndUpdate();
                wc.g0 g0Var = wc.g0.f27756a;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    public final String findWebUserAgent$bidmachine_android_sdk_ba_3_6_1(Context context) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.t.f(context, "context");
        boolean z13 = false;
        if (!WEB_USER_AGENT_PROCESSED.compareAndSet(false, true)) {
            return webUserAgent;
        }
        String str = new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).get();
        if (str == null) {
            z10 = false;
        } else {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return str;
        }
        String str2 = new ApplovinUserAgentSource(context).get();
        if (str2 == null) {
            z11 = false;
        } else {
            if (str2.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return str2;
        }
        String str3 = new IronSourceUserAgentSource(context).get();
        if (str3 == null) {
            z12 = false;
        } else {
            if (str3.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (z12) {
            return str3;
        }
        String str4 = new FacebookUserAgentSource(context).get();
        if (str4 != null) {
            if (str4.length() > 0) {
                z13 = true;
            }
        }
        if (z13) {
            return str4;
        }
        updateWebViewUserAgent();
        return webUserAgent;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Code duplicated, block: B:32:0x004c  */
    public static final String getUserAgent(Context context) {
        boolean z10;
        boolean z11;
        if (context == null) {
            context = applicationContext;
        }
        if (webUserAgent == null && context != null) {
            webUserAgent = INSTANCE.findWebUserAgent$bidmachine_android_sdk_ba_3_6_1(context);
        }
        String str = webUserAgent;
        if (str == null) {
            z10 = false;
        } else {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return webUserAgent;
        }
        if (generatedUserAgent == null && context != null) {
            generatedUserAgent = new GeneratedUserAgentSource(context).get();
        }
        String str2 = generatedUserAgent;
        if (str2 != null) {
            z11 = str2.length() > 0;
        }
        return z11 ? generatedUserAgent : SYSTEM_HTTP_AGENT;
    }
}
