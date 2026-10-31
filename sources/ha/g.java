package ha;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.MediaAssetType;
import java.util.List;

/* JADX INFO: compiled from: NativeAdRequestParameters.java */
/* JADX INFO: loaded from: classes4.dex */
public class g extends AdRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<MediaAssetType> f15799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15800b;

    public g(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        this.f15800b = true;
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Native) {
            this.f15799a = ((AdFormat.Native) adFormat).getMediaAssetTypes();
        } else {
            this.f15799a = MediaAssetType.DEFAULT;
        }
    }

    private boolean b(g gVar) {
        return MediaAssetType.isAll(gVar.f15799a) || gVar.f15799a.containsAll(this.f15799a);
    }

    public boolean a(MediaAssetType mediaAssetType) {
        return this.f15799a.isEmpty() || this.f15799a.contains(mediaAssetType) || this.f15799a.contains(MediaAssetType.All);
    }

    public boolean c() {
        return this.f15800b;
    }

    void d(boolean z10) {
        this.f15800b = z10;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof g) && b((g) adRequestParameters);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return oc.h.m(placement);
    }
}
