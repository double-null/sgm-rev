package com.vungle.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AdConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
public class AdConfig {
    public static final int AUTO_ROTATE = 2;
    public static final Companion Companion = new Companion(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    /* JADX INFO: compiled from: AdConfig.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AdConfig.kt */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Orientation {
    }

    /* JADX INFO: compiled from: AdConfig.kt */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Settings {
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i10) {
        this.adOrientation = i10;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z10) {
        this.settings = z10 ? this.settings | 2 : this.settings & (-3);
    }

    public final void setWatermark(String watermark) {
        t.f(watermark, "watermark");
        this.extras.put(WATERMARK, watermark);
    }

    @Orientation
    public static /* synthetic */ void getAdOrientation$annotations() {
    }
}
