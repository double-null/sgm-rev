package s7;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import vb.h;

/* JADX INFO: compiled from: InterstitialAd.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends FullScreenAd<a, c, FullScreenAdObject<c>, Object> {
    public a(Context context) {
        super(context, AdsType.Interstitial);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FullScreenAdObject<c> createAdObject(ContextProvider contextProvider, c cVar, NetworkAdapter networkAdapter, ga.b bVar, AdProcessCallback adProcessCallback) {
        h hVarCreateInterstitial = networkAdapter.createInterstitial();
        if (hVarCreateInterstitial == null) {
            return null;
        }
        return new FullScreenAdObject<>(contextProvider, adProcessCallback, cVar, bVar, hVarCreateInterstitial);
    }
}
