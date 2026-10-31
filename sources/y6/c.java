package y6;

import ga.f;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.BannerAdSize;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import java.util.List;
import vb.g;

/* JADX INFO: compiled from: BannerRequest.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends AdRequest<c, y6.b, g> {

    /* JADX INFO: compiled from: BannerRequest.java */
    private static class b extends UnifiedAdRequestParamsImpl<y6.b> implements g {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, vb.d, vb.n
        public /* bridge */ /* synthetic */ y6.b getAdRequestParameters() {
            return (y6.b) super.getAdRequestParameters();
        }

        private b(y6.b bVar, TargetingParams targetingParams, ga.d dVar) {
            super(bVar, targetingParams, dVar);
        }
    }

    /* JADX INFO: renamed from: y6.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerRequest.java */
    public static final class C0486c extends AdRequest.AdRequestBuilderImpl<C0486c, c, y6.b> {
        @Deprecated(since = "3.5.0")
        public C0486c() {
            super(AdPlacementConfig.bannerBuilder().build());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build(y6.b bVar) {
            return new c(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y6.b createAdRequestParameters() {
            return new y6.b(this.adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        @Deprecated(since = "3.5.0")
        public C0486c c(d dVar) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createBanner(d.c(dVar))).build();
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setBidPayload(String str) {
            return super.setBidPayload(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @Deprecated(since = "3.5.0")
        public /* bridge */ /* synthetic */ f setCustomParams(CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setListener(AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setLoadingTimeOut(Integer num) {
            return super.setLoadingTimeOut(num);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setNetworks(String str) {
            return super.setNetworks(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @Deprecated(since = "3.5.0")
        public /* bridge */ /* synthetic */ f setPlacementId(String str) {
            return super.setPlacementId(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setPriceFloorParams(PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @Deprecated
        public /* bridge */ /* synthetic */ f setSessionAdParams(SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setTargetingParams(TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public C0486c(AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ f setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g createUnifiedAdRequestParams(y6.b bVar, TargetingParams targetingParams, ga.d dVar) {
        return new b(bVar, targetingParams, dVar);
    }

    public BannerAdSize k() {
        return getAdRequestParameters().a();
    }

    private c(y6.b bVar) {
        super(bVar);
    }
}
