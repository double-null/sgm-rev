package a7;

import android.text.TextUtils;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.CustomParams;
import io.bidmachine.Executable;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.Placement;
import java.util.Collection;
import java.util.List;
import vb.d;

/* JADX INFO: compiled from: PlacementBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n<UnifiedAdRequestParamsType extends vb.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdContentType f131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<UnifiedAdRequestParamsType> f132b = new g<>();

    n(AdContentType adContentType) {
        this.f131a = adContentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(builderNewBuilder);
        if (builderNewBuilder.getFieldsCount() > 0) {
            builder.setCustomData(builderNewBuilder);
        }
    }

    public abstract ga.b b(Ad ad2);

    ga.b c(Ad ad2) {
        return this.f132b.a(ad2);
    }

    HeaderBiddingPlacement.Builder d(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i10) {
        return this.f132b.b(contextProvider, unifiedadrequestparamstype, adsType, g(), collection, list, i10);
    }

    public abstract Message.Builder e(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception;

    Placement f(AdPlacementConfig adPlacementConfig, HeaderBiddingPlacement.Builder builder) {
        final Placement.Builder builderNewBuilder = Placement.newBuilder();
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        builderNewBuilder.setAdFormat(oc.h.b(adFormat));
        builderNewBuilder.setAdType(adFormat.getAdsType().getName());
        String placementId = adPlacementConfig.getPlacementId();
        if (!TextUtils.isEmpty(placementId)) {
            builderNewBuilder.setPlacementId(StringValue.of(placementId));
        }
        io.bidmachine.core.h.B(adPlacementConfig.getCustomParams(), new Executable() { // from class: a7.m
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                n.h(builderNewBuilder, (CustomParams) obj);
            }
        });
        if (builder != null) {
            builderNewBuilder.setHbPlacement(builder);
        }
        return builderNewBuilder.build();
    }

    public AdContentType g() {
        return this.f131a;
    }

    public HeaderBiddingAd i(Ad ad2) {
        return this.f132b.c(ad2);
    }
}
