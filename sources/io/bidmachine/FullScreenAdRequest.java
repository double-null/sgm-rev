package io.bidmachine;

import io.bidmachine.FullScreenAdRequest;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, vb.j> {

    private static class b extends UnifiedAdRequestParamsImpl<FullScreenAdRequestParameters> implements vb.j {
        private b(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingParams targetingParams, ga.d dVar) {
            super(fullScreenAdRequestParameters, targetingParams, dVar);
        }
    }

    protected FullScreenAdRequest(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    public AdContentType getAdContentType() {
        return getAdRequestParameters().getAdContentType();
    }

    @Override // io.bidmachine.AdRequest
    boolean isPlacementBuilderMatch(a7.n nVar) {
        return super.isPlacementBuilderMatch(nVar) && getAdRequestParameters().isContentTypeMatch(nVar.g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    public vb.j createUnifiedAdRequestParams(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingParams targetingParams, ga.d dVar) {
        return new b(fullScreenAdRequestParameters, targetingParams, dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        protected FullScreenRequestBuilder(AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        protected SelfType setAdContentType(AdContentType adContentType) {
            return this;
        }
    }
}
