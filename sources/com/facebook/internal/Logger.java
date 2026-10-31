package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.l0;
import rd.c0;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Logger {
    public static final String LOG_TAG_BASE = "FacebookSDK.";
    private final LoggingBehavior behavior;
    private StringBuilder contents;
    private int priority;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, String> stringsToReplace = new HashMap<>();

    /* JADX INFO: compiled from: Logger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String replaceStrings(String str) {
            String strK;
            strK = str;
            for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                strK = c0.K(strK, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strK;
        }

        public final void log(LoggingBehavior behavior, String tag, String string) {
            kotlin.jvm.internal.t.f(behavior, "behavior");
            kotlin.jvm.internal.t.f(tag, "tag");
            kotlin.jvm.internal.t.f(string, "string");
            log(behavior, 3, tag, string);
        }

        public final synchronized void registerAccessToken(String accessToken) {
            kotlin.jvm.internal.t.f(accessToken, "accessToken");
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void registerStringToReplace(String original, String replace) {
            kotlin.jvm.internal.t.f(original, "original");
            kotlin.jvm.internal.t.f(replace, "replace");
            Logger.stringsToReplace.put(original, replace);
        }

        public final void log(LoggingBehavior behavior, String tag, String format, Object... args) {
            kotlin.jvm.internal.t.f(behavior, "behavior");
            kotlin.jvm.internal.t.f(tag, "tag");
            kotlin.jvm.internal.t.f(format, "format");
            kotlin.jvm.internal.t.f(args, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                l0 l0Var = l0.f21527a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.t.e(str, "format(format, *args)");
                log(behavior, 3, tag, str);
            }
        }

        public final void log(LoggingBehavior behavior, int i10, String tag, String format, Object... args) {
            kotlin.jvm.internal.t.f(behavior, "behavior");
            kotlin.jvm.internal.t.f(tag, "tag");
            kotlin.jvm.internal.t.f(format, "format");
            kotlin.jvm.internal.t.f(args, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                l0 l0Var = l0.f21527a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                kotlin.jvm.internal.t.e(str, "format(format, *args)");
                log(behavior, i10, tag, str);
            }
        }

        public final void log(LoggingBehavior behavior, int i10, String tag, String string) {
            kotlin.jvm.internal.t.f(behavior, "behavior");
            kotlin.jvm.internal.t.f(tag, "tag");
            kotlin.jvm.internal.t.f(string, "string");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                String strReplaceStrings = replaceStrings(string);
                if (!c0.O(tag, Logger.LOG_TAG_BASE, false, 2, null)) {
                    tag = Logger.LOG_TAG_BASE + tag;
                }
                Log.println(i10, tag, strReplaceStrings);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }
    }

    public Logger(LoggingBehavior behavior, String tag) {
        kotlin.jvm.internal.t.f(behavior, "behavior");
        kotlin.jvm.internal.t.f(tag, "tag");
        this.priority = 3;
        this.behavior = behavior;
        this.tag = LOG_TAG_BASE + Validate.notNullOrEmpty(tag, "tag");
        this.contents = new StringBuilder();
    }

    public static final void log(LoggingBehavior loggingBehavior, int i10, String str, String str2) {
        Companion.log(loggingBehavior, i10, str, str2);
    }

    public static final synchronized void registerAccessToken(String str) {
        Companion.registerAccessToken(str);
    }

    public static final synchronized void registerStringToReplace(String str, String str2) {
        Companion.registerStringToReplace(str, str2);
    }

    private final boolean shouldLog() {
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    public final void append(StringBuilder stringBuilder) {
        kotlin.jvm.internal.t.f(stringBuilder, "stringBuilder");
        if (shouldLog()) {
            this.contents.append((CharSequence) stringBuilder);
        }
    }

    public final void appendKeyValue(String key, Object value) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(value, "value");
        append("  %s:\t%s\n", key, value);
    }

    public final String getContents() {
        Companion companion = Companion;
        String string = this.contents.toString();
        kotlin.jvm.internal.t.e(string, "contents.toString()");
        return companion.replaceStrings(string);
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void logString(String string) {
        kotlin.jvm.internal.t.f(string, "string");
        Companion.log(this.behavior, this.priority, this.tag, string);
    }

    public final void setPriority(int i10) {
        Validate.oneOf(Integer.valueOf(i10), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i10);
    }

    public static final void log(LoggingBehavior loggingBehavior, int i10, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, i10, str, str2, objArr);
    }

    public static final void log(LoggingBehavior loggingBehavior, String str, String str2) {
        Companion.log(loggingBehavior, str, str2);
    }

    public final void append(String string) {
        kotlin.jvm.internal.t.f(string, "string");
        if (shouldLog()) {
            this.contents.append(string);
        }
    }

    public static final void log(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, str, str2, objArr);
    }

    public final void append(String format, Object... args) {
        kotlin.jvm.internal.t.f(format, "format");
        kotlin.jvm.internal.t.f(args, "args");
        if (shouldLog()) {
            StringBuilder sb2 = this.contents;
            l0 l0Var = l0.f21527a;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            kotlin.jvm.internal.t.e(str, "format(format, *args)");
            sb2.append(str);
        }
    }

    public final void log() {
        String string = this.contents.toString();
        kotlin.jvm.internal.t.e(string, "contents.toString()");
        logString(string);
        this.contents = new StringBuilder();
    }
}
