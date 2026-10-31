package io.bidmachine;

import java.util.List;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: AdFormat.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AdFormat {
    public static final Companion Companion = new Companion(null);
    private final AdsType adsType;

    /* JADX INFO: compiled from: AdFormat.kt */
    public static final class Banner extends AdFormat {
        private final BannerAdSize bannerAdSize;
        private final Matcher matcher;
        private final String remoteName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Banner(BannerAdSize bannerAdSize) {
            super(AdsType.Banner, null);
            kotlin.jvm.internal.t.f(bannerAdSize, "bannerAdSize");
            this.bannerAdSize = bannerAdSize;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Banner$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends vb.d> boolean isMatch(T adRequestParams, AdContentType adContentType) {
                    kotlin.jvm.internal.t.f(adRequestParams, "adRequestParams");
                    kotlin.jvm.internal.t.f(adContentType, "adContentType");
                    if (adRequestParams instanceof vb.g) {
                        return kotlin.jvm.internal.t.a(this.this$0.getBannerAdSize(), BannerAdSize.Undefined) || kotlin.jvm.internal.t.a(this.this$0.getBannerAdSize().toSize(), ((vb.g) adRequestParams).getAdRequestParameters().a().toSize());
                    }
                    return false;
                }
            };
            this.remoteName = kotlin.jvm.internal.t.a(bannerAdSize, BannerAdSize.Leaderboard) ? "banner_728x90" : kotlin.jvm.internal.t.a(bannerAdSize, BannerAdSize.MediumRectangle) ? "banner_300x250" : kotlin.jvm.internal.t.a(bannerAdSize, BannerAdSize.Banner) ? "banner_320x50" : "banner";
        }

        public static /* synthetic */ Banner copy$default(Banner banner, BannerAdSize bannerAdSize, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bannerAdSize = banner.bannerAdSize;
            }
            return banner.copy(bannerAdSize);
        }

        public final BannerAdSize component1() {
            return this.bannerAdSize;
        }

        public final Banner copy(BannerAdSize bannerAdSize) {
            kotlin.jvm.internal.t.f(bannerAdSize, "bannerAdSize");
            return new Banner(bannerAdSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Banner) && kotlin.jvm.internal.t.a(this.bannerAdSize, ((Banner) obj).bannerAdSize);
        }

        public final BannerAdSize getBannerAdSize() {
            return this.bannerAdSize;
        }

        @Override // io.bidmachine.AdFormat
        public Matcher getMatcher$bidmachine_android_sdk_ba_3_6_1() {
            return this.matcher;
        }

        @Override // io.bidmachine.AdFormat
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.bannerAdSize.hashCode();
        }

        public String toString() {
            return "Banner(bannerAdSize=" + this.bannerAdSize + ')';
        }
    }

    /* JADX INFO: compiled from: AdFormat.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final AdFormat createBanner(BannerAdSize bannerAdSize) {
            kotlin.jvm.internal.t.f(bannerAdSize, "bannerAdSize");
            return new Banner(bannerAdSize);
        }

        public final AdFormat createInterstitial(AdContentType adContentType) {
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            return new Interstitial(adContentType);
        }

        public final AdFormat createNative(List<? extends MediaAssetType> mediaAssetTypes) {
            kotlin.jvm.internal.t.f(mediaAssetTypes, "mediaAssetTypes");
            return new Native(mediaAssetTypes);
        }

        public final AdFormat createRewarded(AdContentType adContentType) {
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            return new Rewarded(adContentType);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final AdFormat byRemoteName(String remoteName) {
            kotlin.jvm.internal.t.f(remoteName, "remoteName");
            switch (remoteName.hashCode()) {
                case -1396342996:
                    if (remoteName.equals(GEmOVMyH.XfObWPl)) {
                        return createBanner(BannerAdSize.Undefined);
                    }
                    return null;
                case -1364000502:
                    if (remoteName.equals("rewarded_video")) {
                        return createRewarded(AdContentType.Video);
                    }
                    return null;
                case -1052618729:
                    if (remoteName.equals("native")) {
                        List<MediaAssetType> DEFAULT = MediaAssetType.DEFAULT;
                        kotlin.jvm.internal.t.e(DEFAULT, "DEFAULT");
                        return createNative(DEFAULT);
                    }
                    return null;
                case -421482955:
                    if (remoteName.equals("banner_320x50")) {
                        return createBanner(BannerAdSize.Banner);
                    }
                    return null;
                case -306727899:
                    if (remoteName.equals("banner_728x90")) {
                        return createBanner(BannerAdSize.Leaderboard);
                    }
                    return null;
                case -239580146:
                    if (remoteName.equals(com.vungle.ads.internal.Constants.PLACEMENT_TYPE_REWARDED)) {
                        return createRewarded(AdContentType.All);
                    }
                    return null;
                case -238330699:
                    if (remoteName.equals("banner_300x250")) {
                        return createBanner(BannerAdSize.MediumRectangle);
                    }
                    return null;
                case 302042536:
                    if (remoteName.equals("interstitial_video")) {
                        return createInterstitial(AdContentType.Video);
                    }
                    return null;
                case 589853631:
                    if (remoteName.equals("rewarded_static")) {
                        return createRewarded(AdContentType.Static);
                    }
                    return null;
                case 604727084:
                    if (remoteName.equals(com.vungle.ads.internal.Constants.PLACEMENT_TYPE_INTERSTITIAL)) {
                        return createInterstitial(AdContentType.All);
                    }
                    return null;
                case 697580257:
                    if (remoteName.equals("interstitial_static")) {
                        return createInterstitial(AdContentType.Static);
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: compiled from: AdFormat.kt */
    public static final class Interstitial extends AdFormat {
        private final AdContentType adContentType;
        private final Matcher matcher;
        private final String remoteName;

        /* JADX INFO: compiled from: AdFormat.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdContentType.values().length];
                try {
                    iArr[AdContentType.Video.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdContentType.Static.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interstitial(AdContentType adContentType) {
            super(AdsType.Interstitial, null);
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            this.adContentType = adContentType;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Interstitial$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends vb.d> boolean isMatch(T adRequestParams, AdContentType adContentType2) {
                    kotlin.jvm.internal.t.f(adRequestParams, "adRequestParams");
                    kotlin.jvm.internal.t.f(adContentType2, "adContentType");
                    AdContentType adContentType3 = this.this$0.getAdContentType();
                    return adContentType3 == AdContentType.All || adContentType3 == adContentType2;
                }
            };
            int i10 = WhenMappings.$EnumSwitchMapping$0[adContentType.ordinal()];
            this.remoteName = i10 != 1 ? i10 != 2 ? com.vungle.ads.internal.Constants.PLACEMENT_TYPE_INTERSTITIAL : "interstitial_static" : "interstitial_video";
        }

        public static /* synthetic */ Interstitial copy$default(Interstitial interstitial, AdContentType adContentType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adContentType = interstitial.adContentType;
            }
            return interstitial.copy(adContentType);
        }

        public final AdContentType component1() {
            return this.adContentType;
        }

        public final Interstitial copy(AdContentType adContentType) {
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            return new Interstitial(adContentType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Interstitial) && this.adContentType == ((Interstitial) obj).adContentType;
        }

        public final AdContentType getAdContentType() {
            return this.adContentType;
        }

        @Override // io.bidmachine.AdFormat
        public Matcher getMatcher$bidmachine_android_sdk_ba_3_6_1() {
            return this.matcher;
        }

        @Override // io.bidmachine.AdFormat
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.adContentType.hashCode();
        }

        public String toString() {
            return "Interstitial(adContentType=" + this.adContentType + ')';
        }
    }

    /* JADX INFO: compiled from: AdFormat.kt */
    public static abstract class Matcher {
        private final AdsType adsType;

        public Matcher(AdsType adsType) {
            kotlin.jvm.internal.t.f(adsType, "adsType");
            this.adsType = adsType;
        }

        public final <T extends vb.d> boolean isMatch(AdsType adsType, T adRequestParams, AdContentType adContentType) {
            kotlin.jvm.internal.t.f(adsType, "adsType");
            kotlin.jvm.internal.t.f(adRequestParams, "adRequestParams");
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            return adsType == this.adsType && isMatch(adRequestParams, adContentType);
        }

        public abstract <T extends vb.d> boolean isMatch(T t10, AdContentType adContentType);
    }

    /* JADX INFO: compiled from: AdFormat.kt */
    public static final class Native extends AdFormat {
        private final Matcher matcher;
        private final List<MediaAssetType> mediaAssetTypes;
        private final String remoteName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Native(List<? extends MediaAssetType> mediaAssetTypes) {
            super(AdsType.Native, null);
            kotlin.jvm.internal.t.f(mediaAssetTypes, "mediaAssetTypes");
            this.mediaAssetTypes = mediaAssetTypes;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Native$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends vb.d> boolean isMatch(T adRequestParams, AdContentType adContentType) {
                    kotlin.jvm.internal.t.f(adRequestParams, "adRequestParams");
                    kotlin.jvm.internal.t.f(adContentType, "adContentType");
                    return true;
                }
            };
            this.remoteName = "native";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Native copy$default(Native r10, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = r10.mediaAssetTypes;
            }
            return r10.copy(list);
        }

        public final List<MediaAssetType> component1() {
            return this.mediaAssetTypes;
        }

        public final Native copy(List<? extends MediaAssetType> mediaAssetTypes) {
            kotlin.jvm.internal.t.f(mediaAssetTypes, "mediaAssetTypes");
            return new Native(mediaAssetTypes);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Native) && kotlin.jvm.internal.t.a(this.mediaAssetTypes, ((Native) obj).mediaAssetTypes);
        }

        @Override // io.bidmachine.AdFormat
        public Matcher getMatcher$bidmachine_android_sdk_ba_3_6_1() {
            return this.matcher;
        }

        public final List<MediaAssetType> getMediaAssetTypes() {
            return this.mediaAssetTypes;
        }

        @Override // io.bidmachine.AdFormat
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.mediaAssetTypes.hashCode();
        }

        public String toString() {
            return "Native(mediaAssetTypes=" + this.mediaAssetTypes + ')';
        }
    }

    /* JADX INFO: compiled from: AdFormat.kt */
    public static final class Rewarded extends AdFormat {
        private final AdContentType adContentType;
        private final Matcher matcher;
        private final String remoteName;

        /* JADX INFO: compiled from: AdFormat.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdContentType.values().length];
                try {
                    iArr[AdContentType.Video.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdContentType.Static.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rewarded(AdContentType adContentType) {
            super(AdsType.Rewarded, null);
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            this.adContentType = adContentType;
            final AdsType adsType = getAdsType();
            this.matcher = new Matcher(adsType) { // from class: io.bidmachine.AdFormat$Rewarded$matcher$1
                @Override // io.bidmachine.AdFormat.Matcher
                public <T extends vb.d> boolean isMatch(T adRequestParams, AdContentType adContentType2) {
                    kotlin.jvm.internal.t.f(adRequestParams, "adRequestParams");
                    kotlin.jvm.internal.t.f(adContentType2, "adContentType");
                    AdContentType adContentType3 = this.this$0.getAdContentType();
                    return adContentType3 == AdContentType.All || adContentType3 == adContentType2;
                }
            };
            int i10 = WhenMappings.$EnumSwitchMapping$0[adContentType.ordinal()];
            this.remoteName = i10 != 1 ? i10 != 2 ? com.vungle.ads.internal.Constants.PLACEMENT_TYPE_REWARDED : "rewarded_static" : "rewarded_video";
        }

        public static /* synthetic */ Rewarded copy$default(Rewarded rewarded, AdContentType adContentType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                adContentType = rewarded.adContentType;
            }
            return rewarded.copy(adContentType);
        }

        public final AdContentType component1() {
            return this.adContentType;
        }

        public final Rewarded copy(AdContentType adContentType) {
            kotlin.jvm.internal.t.f(adContentType, "adContentType");
            return new Rewarded(adContentType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rewarded) && this.adContentType == ((Rewarded) obj).adContentType;
        }

        public final AdContentType getAdContentType() {
            return this.adContentType;
        }

        @Override // io.bidmachine.AdFormat
        public Matcher getMatcher$bidmachine_android_sdk_ba_3_6_1() {
            return this.matcher;
        }

        @Override // io.bidmachine.AdFormat
        public String getRemoteName() {
            return this.remoteName;
        }

        public int hashCode() {
            return this.adContentType.hashCode();
        }

        public String toString() {
            return "Rewarded(adContentType=" + this.adContentType + ')';
        }
    }

    public /* synthetic */ AdFormat(AdsType adsType, kotlin.jvm.internal.k kVar) {
        this(adsType);
    }

    public static final AdFormat byRemoteName(String str) {
        return Companion.byRemoteName(str);
    }

    public static final AdFormat createBanner(BannerAdSize bannerAdSize) {
        return Companion.createBanner(bannerAdSize);
    }

    public static final AdFormat createInterstitial(AdContentType adContentType) {
        return Companion.createInterstitial(adContentType);
    }

    public static final AdFormat createNative(List<? extends MediaAssetType> list) {
        return Companion.createNative(list);
    }

    public static final AdFormat createRewarded(AdContentType adContentType) {
        return Companion.createRewarded(adContentType);
    }

    public final AdsType getAdsType() {
        return this.adsType;
    }

    public abstract Matcher getMatcher$bidmachine_android_sdk_ba_3_6_1();

    public abstract String getRemoteName();

    public final <T extends vb.d> boolean isMatch(AdsType adsType, T adRequestParams, AdContentType adContentType) {
        kotlin.jvm.internal.t.f(adsType, "adsType");
        kotlin.jvm.internal.t.f(adRequestParams, "adRequestParams");
        kotlin.jvm.internal.t.f(adContentType, "adContentType");
        return getMatcher$bidmachine_android_sdk_ba_3_6_1().isMatch(adsType, adRequestParams, adContentType);
    }

    private AdFormat(AdsType adsType) {
        this.adsType = adsType;
    }
}
