package y6;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.BannerAdSize;
import oc.h;

/* JADX INFO: compiled from: BannerAdRequestParameters.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends AdRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAdSize f28671a;

    public b(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Banner) {
            this.f28671a = ((AdFormat.Banner) adFormat).getBannerAdSize();
        } else {
            this.f28671a = BannerAdSize.Banner;
        }
    }

    private boolean b(b bVar) {
        return this.f28671a.isSuitable(bVar.a());
    }

    public BannerAdSize a() {
        return this.f28671a;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof b) && b((b) adRequestParameters);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return h.i(placement, this.f28671a);
    }
}
