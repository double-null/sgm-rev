package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.o;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Logger {
    public static final Companion Companion = new Companion(null);
    private static final o IP_REGEX = new o("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    private static boolean enabled;

    public static final int d(String str, String str2) {
        return Companion.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return Companion.e(str, str2);
    }

    public static final int i(String str, String str2) {
        return Companion.i(str, str2);
    }

    public static final int w(String str, id.a<String> aVar) {
        return Companion.w(str, aVar);
    }

    /* JADX INFO: compiled from: Logger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int d(String tag, String message) {
            t.f(tag, "tag");
            t.f(message, "message");
            if (Logger.enabled) {
                return Log.d(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final int e(String tag, String message) {
            t.f(tag, "tag");
            t.f(message, "message");
            if (Logger.enabled) {
                return Log.e(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final /* synthetic */ void enable$vungle_ads_release(boolean z10) {
            Logger.enabled = z10;
        }

        public final /* synthetic */ String eraseSensitiveData$vungle_ads_release(String str) {
            t.f(str, "<this>");
            return Logger.IP_REGEX.f(str, "xxx.xxx.xxx.xxx");
        }

        public final int i(String tag, String message) {
            t.f(tag, "tag");
            t.f(message, "message");
            if (Logger.enabled) {
                return Log.i(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final int w(String tag, String message) {
            t.f(tag, "tag");
            t.f(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData$vungle_ads_release(message));
            }
            return -1;
        }

        public final int e(String tag, String message, Throwable throwable) {
            t.f(tag, "tag");
            t.f(message, "message");
            t.f(throwable, "throwable");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData$vungle_ads_release(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int w(String tag, id.a<String> message) {
            t.f(tag, "tag");
            t.f(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData$vungle_ads_release(message.invoke()));
            }
            return -1;
        }
    }

    public static final int e(String str, String str2, Throwable th) {
        return Companion.e(str, str2, th);
    }

    public static final int w(String str, String str2) {
        return Companion.w(str, str2);
    }
}
