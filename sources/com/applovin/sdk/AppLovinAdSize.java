package com.applovin.sdk;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9651c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f9650b = i10;
        this.f9651c = i11;
        this.f9649a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f9651c;
    }

    public String getLabel() {
        return this.f9649a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f9650b;
    }

    public String toString() {
        return getLabel();
    }
}
