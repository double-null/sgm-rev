package io.bidmachine;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FullScreenAdRequestParameters extends AdRequestParameters {
    @Deprecated(since = "3.5.0")
    public FullScreenAdRequestParameters(AdsFormat adsFormat, AdContentType adContentType) {
        this(new AdPlacementConfig.Builder(adsFormat.toAdFormat(adContentType)).build());
    }

    private boolean isParametersMatchedInternal(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        return isContentTypeMatch(fullScreenAdRequestParameters.getAdContentType());
    }

    public AdContentType getAdContentType() {
        AdFormat adFormat = getAdPlacementConfig().getAdFormat();
        if (adFormat instanceof AdFormat.Interstitial) {
            return ((AdFormat.Interstitial) adFormat).getAdContentType();
        }
        return adFormat instanceof AdFormat.Rewarded ? ((AdFormat.Rewarded) adFormat).getAdContentType() : AdContentType.All;
    }

    public boolean isContentTypeMatch(AdContentType adContentType) {
        AdContentType adContentType2 = getAdContentType();
        return adContentType2 == AdContentType.All || adContentType2 == adContentType;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof FullScreenAdRequestParameters) && isParametersMatchedInternal((FullScreenAdRequestParameters) adRequestParameters);
    }

    protected FullScreenAdRequestParameters(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
    }
}
