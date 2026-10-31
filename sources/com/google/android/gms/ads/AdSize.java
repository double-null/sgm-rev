package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    public static final AdSize BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, ykDFMuXDQMaR.ONww);

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    public AdSize(int i10, int i11) {
        String strValueOf = i10 == -1 ? "FULL" : String.valueOf(i10);
        String strValueOf2 = i11 == -2 ? "AUTO" : String.valueOf(i11);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length() + 3);
        sb2.append(strValueOf);
        sb2.append("x");
        sb2.append(strValueOf2);
        sb2.append("_as");
        this(i10, i11, sb2.toString());
    }

    @Deprecated
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i10, 50, 0);
        adSizeZzk.zze = true;
        return adSizeZzk;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 0);
        if (iZzr == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzh = iZzr;
        adSize.zzg = true;
        return adSize;
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        AdSize adSize = new AdSize(i10, 0);
        adSize.zzh = i11;
        adSize.zzg = true;
        if (i11 < 32) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 118);
            sb2.append("The maximum height set for the inline adaptive ad size was ");
            sb2.append(i11);
            sb2.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzo.zzi(sb2.toString());
        }
        return adSize;
    }

    @Deprecated
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i10, 50, 2);
        adSizeZzk.zze = true;
        return adSizeZzk;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 2);
        AdSize adSize = new AdSize(i10, 0);
        if (iZzr == -1) {
            return INVALID;
        }
        adSize.zzh = iZzr;
        adSize.zzg = true;
        return adSize;
    }

    public static AdSize getLargeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i10, 0);
        adSizeZzl.zzf = true;
        return adSizeZzl;
    }

    public static AdSize getLargeLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i10, 2);
        adSizeZzl.zzf = true;
        return adSizeZzl;
    }

    public static AdSize getLargePortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzl = com.google.android.gms.ads.internal.util.client.zzf.zzl(context, i10, 1);
        adSizeZzl.zzf = true;
        return adSizeZzl;
    }

    @Deprecated
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        AdSize adSizeZzk = com.google.android.gms.ads.internal.util.client.zzf.zzk(context, i10, 50, 1);
        adSizeZzk.zze = true;
        return adSizeZzk;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iZzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(context, 1);
        AdSize adSize = new AdSize(i10, 0);
        if (iZzr == -1) {
            return INVALID;
        }
        adSize.zzh = iZzr;
        adSize.zzg = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i10 = this.zzc;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return zzr.zza(context.getResources().getDisplayMetrics());
        }
        zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i10);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i10 = this.zzb;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            zzay.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i10);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    final boolean zza() {
        return this.zze;
    }

    final boolean zzb() {
        return this.zzf;
    }

    final boolean zzc() {
        return this.zzg;
    }

    final void zzd(boolean z10) {
        this.zzg = true;
    }

    final void zze(int i10) {
        this.zzh = i10;
    }

    final int zzf() {
        return this.zzh;
    }

    final boolean zzg() {
        return this.zzi;
    }

    final void zzh(boolean z10) {
        this.zzi = true;
    }

    final int zzi() {
        return this.zzj;
    }

    final void zzj(int i10) {
        this.zzj = i10;
    }

    AdSize(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
            sb2.append("Invalid width for AdSize: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 27);
            sb3.append("Invalid height for AdSize: ");
            sb3.append(i11);
            throw new IllegalArgumentException(sb3.toString());
        }
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = str;
    }
}
