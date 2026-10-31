package s7;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.FullScreenAdRequestParameters;
import oc.h;

/* JADX INFO: compiled from: InterstitialAdRequestParameters.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends FullScreenAdRequestParameters {
    public b(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return h.l(placement);
    }
}
