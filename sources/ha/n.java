package ha;

import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: NativeRequest.java */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends AdRequest<n, g, vb.n> {

    /* JADX INFO: compiled from: NativeRequest.java */
    public static final class b extends AdRequest.AdRequestBuilderImpl<b, n, g> {
        @Deprecated(since = "3.5.0")
        public b() {
            this(AdPlacementConfig.nativeBuilder().build());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n build(g gVar) {
            return new n(gVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g createAdRequestParameters() {
            return new g(this.adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        @Deprecated(since = "3.5.0")
        public b c(MediaAssetType... mediaAssetTypeArr) {
            if (mediaAssetTypeArr.length == 0) {
                return this;
            }
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createNative(Arrays.asList(mediaAssetTypeArr))).build();
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setBidPayload(String str) {
            return super.setBidPayload(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @Deprecated(since = "3.5.0")
        public /* bridge */ /* synthetic */ ga.f setCustomParams(CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setListener(AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setLoadingTimeOut(Integer num) {
            return super.setLoadingTimeOut(num);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setNetworks(String str) {
            return super.setNetworks(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @Deprecated(since = "3.5.0")
        public /* bridge */ /* synthetic */ ga.f setPlacementId(String str) {
            return super.setPlacementId(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setPriceFloorParams(PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @Deprecated
        public /* bridge */ /* synthetic */ ga.f setSessionAdParams(SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setTargetingParams(TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public b(AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        public /* bridge */ /* synthetic */ ga.f setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }
    }

    /* JADX INFO: compiled from: NativeRequest.java */
    private static class c extends UnifiedAdRequestParamsImpl<g> implements vb.n {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, vb.d, vb.n
        public /* bridge */ /* synthetic */ g getAdRequestParameters() {
            return (g) super.getAdRequestParameters();
        }

        private c(g gVar, TargetingParams targetingParams, ga.d dVar) {
            super(gVar, targetingParams, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public vb.n createUnifiedAdRequestParams(g gVar, TargetingParams targetingParams, ga.d dVar) {
        return new c(gVar, targetingParams, dVar);
    }

    @Override // io.bidmachine.AdRequest
    protected void processBidPayload(ResponsePayload responsePayload) {
        getAdRequestParameters().d(false);
        super.processBidPayload(responsePayload);
    }

    private n(g gVar) {
        super(gVar);
    }
}
