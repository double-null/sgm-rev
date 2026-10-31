package y6;

import android.content.Context;
import io.bidmachine.AdListener;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BannerAdSize;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import vb.g;

/* JADX INFO: compiled from: BannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
final class a extends ViewAd<a, c, ViewAdObject<c, vb.e, g>, g, AdListener<a>> {
    a(Context context) {
        super(context, AdsType.Banner);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewAdObject<c, vb.e, g> createAdObject(ContextProvider contextProvider, c cVar, NetworkAdapter networkAdapter, ga.b bVar, AdProcessCallback adProcessCallback) {
        vb.e eVarCreateBanner = networkAdapter.createBanner();
        if (eVarCreateBanner == null) {
            return null;
        }
        ViewAdObject<c, vb.e, g> viewAdObject = new ViewAdObject<>(contextProvider, adProcessCallback, cVar, bVar, eVarCreateBanner);
        BannerAdSize bannerAdSizeK = cVar.k();
        if (bannerAdSizeK.isAdaptive()) {
            viewAdObject.setWidthMeasureMode(ViewAdObject.MeasureMode.Match);
            viewAdObject.setWidth(bVar.f());
            viewAdObject.setHeight(bVar.c());
        } else {
            viewAdObject.setWidth(bannerAdSizeK.getWidth());
            viewAdObject.setHeight(bannerAdSizeK.getHeight());
        }
        return viewAdObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerAdSize e() {
        ViewAdObject viewAdObject = (ViewAdObject) getLoadedAdObject();
        if (viewAdObject == null) {
            return null;
        }
        int width = viewAdObject.getWidth();
        int height = viewAdObject.getHeight();
        return ((c) viewAdObject.getAdRequest()).k().isAdaptive() ? BannerAdSize.adaptive(width, height) : BannerAdSize.firstFixedOrNull(width, height);
    }
}
