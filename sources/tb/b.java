package tb;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.FullScreenAdRequestParameters;
import oc.h;

/* JADX INFO: compiled from: RewardedAdRequestParameters.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends FullScreenAdRequestParameters {
    public b(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return h.n(placement);
    }
}
