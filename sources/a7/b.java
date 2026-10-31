package a7;

import android.text.TextUtils;
import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import vb.d;

/* JADX INFO: compiled from: DisplayPlacementBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public class b<UnifiedAdRequestParamsType extends vb.d> extends n<UnifiedAdRequestParamsType> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f103c;

    public b(boolean z10) {
        super(AdContentType.Static);
        this.f103c = z10;
    }

    @Override // a7.n
    public ga.b b(Ad ad2) {
        ga.b bVar;
        if (!ad2.hasDisplay()) {
            return null;
        }
        Ad.Display display = ad2.getDisplay();
        ga.b bVarC = c(ad2);
        if (bVarC == null) {
            if (TextUtils.isEmpty(display.getAdm())) {
                bVar = bVarC;
                return null;
            }
            bVar = bVarC;
            a aVar = new a(ad2);
            aVar.m(display.getAdm());
            bVar = aVar;
        }
        bVar = bVarC;
        bVar.l(display.getW());
        bVar.k(display.getH());
        return bVar;
    }

    @Override // a7.n
    public Message.Builder e(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
        Size sizeJ = j(contextProvider, unifiedadrequestparamstype);
        Placement.DisplayPlacement.Builder h10 = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).setW(sizeJ.getWidth()).setH(sizeJ.getHeight());
        if (this.f103c) {
            h10.setInstl(true);
            h10.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        HeaderBiddingPlacement.Builder builderD = d(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i10);
        if (adPlacementConfig == null && builderD != null) {
            h10.addExtProto(Any.pack(builderD.build()));
        } else if (adPlacementConfig != null) {
            h10.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
        }
        return h10;
    }

    public Size j(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype) {
        return io.bidmachine.core.h.y(contextProvider.getContext());
    }
}
