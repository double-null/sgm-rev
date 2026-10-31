package io.bidmachine;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(since = "3.5.0")
public enum AdsFormat {
    Banner("banner", null),
    Banner_320x50("banner_320x50", Banner),
    Banner_300x250("banner_300x250", Banner),
    Banner_728x90("banner_728x90", Banner),
    Interstitial(com.vungle.ads.internal.Constants.PLACEMENT_TYPE_INTERSTITIAL, null),
    InterstitialVideo("interstitial_video", Interstitial),
    InterstitialStatic("interstitial_static", Interstitial),
    Rewarded(com.vungle.ads.internal.Constants.PLACEMENT_TYPE_REWARDED, null),
    RewardedVideo("rewarded_video", Rewarded),
    RewardedStatic("rewarded_static", Rewarded),
    Native("native", null);

    private final AdsFormat parent;
    private final String remoteName;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16414a;

        static {
            int[] iArr = new int[AdsFormat.values().length];
            f16414a = iArr;
            try {
                iArr[AdsFormat.Native.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16414a[AdsFormat.RewardedVideo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16414a[AdsFormat.RewardedStatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16414a[AdsFormat.Rewarded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16414a[AdsFormat.InterstitialVideo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16414a[AdsFormat.InterstitialStatic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16414a[AdsFormat.Interstitial.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16414a[AdsFormat.Banner_728x90.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16414a[AdsFormat.Banner_300x250.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16414a[AdsFormat.Banner_320x50.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16414a[AdsFormat.Banner.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    AdsFormat(String str, AdsFormat adsFormat) {
        this.remoteName = str;
        this.parent = adsFormat;
    }

    public static AdsFormat byRemoteName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AdsFormat adsFormat : values()) {
            if (adsFormat.remoteName.equals(str)) {
                return adsFormat;
            }
        }
        return null;
    }

    public static AdsFormat fromAdFormat(AdFormat adFormat) {
        if (adFormat instanceof AdFormat.Native) {
            return Native;
        }
        if (adFormat instanceof AdFormat.Rewarded) {
            AdContentType adContentType = ((AdFormat.Rewarded) adFormat).getAdContentType();
            if (adContentType.equals(AdContentType.Video)) {
                return RewardedVideo;
            }
            return adContentType.equals(AdContentType.Static) ? RewardedStatic : Rewarded;
        }
        if (adFormat instanceof AdFormat.Interstitial) {
            AdContentType adContentType2 = ((AdFormat.Interstitial) adFormat).getAdContentType();
            if (adContentType2.equals(AdContentType.Video)) {
                return InterstitialVideo;
            }
            return adContentType2.equals(AdContentType.Static) ? InterstitialStatic : Interstitial;
        }
        if (!(adFormat instanceof AdFormat.Banner)) {
            return Banner;
        }
        BannerAdSize bannerAdSize = ((AdFormat.Banner) adFormat).getBannerAdSize();
        if (bannerAdSize.equals(BannerAdSize.Leaderboard)) {
            return Banner_728x90;
        }
        if (bannerAdSize.equals(BannerAdSize.MediumRectangle)) {
            return Banner_300x250;
        }
        return bannerAdSize.equals(BannerAdSize.Banner) ? Banner_320x50 : Banner;
    }

    public AdsType getAdsType() {
        return toAdFormat().getAdsType();
    }

    public AdsFormat getParent() {
        return this.parent;
    }

    public String getRemoteName() {
        return this.remoteName;
    }

    public AdFormat toAdFormat() {
        return toAdFormat(null);
    }

    public AdFormat toAdFormat(AdContentType adContentType) {
        switch (a.f16414a[ordinal()]) {
            case 1:
                return new AdFormat.Native(MediaAssetType.DEFAULT);
            case 2:
                return new AdFormat.Rewarded(AdContentType.Video);
            case 3:
                return new AdFormat.Rewarded(AdContentType.Static);
            case 4:
                if (adContentType == null) {
                    adContentType = AdContentType.All;
                }
                return new AdFormat.Rewarded(adContentType);
            case 5:
                return new AdFormat.Interstitial(AdContentType.Video);
            case 6:
                return new AdFormat.Interstitial(AdContentType.Static);
            case 7:
                if (adContentType == null) {
                    adContentType = AdContentType.All;
                }
                return new AdFormat.Interstitial(adContentType);
            case 8:
                return new AdFormat.Banner(BannerAdSize.Leaderboard);
            case 9:
                return new AdFormat.Banner(BannerAdSize.MediumRectangle);
            case 10:
                return new AdFormat.Banner(BannerAdSize.Banner);
            default:
                return new AdFormat.Banner(BannerAdSize.Undefined);
        }
    }
}
