package tb;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import vb.h;

/* JADX INFO: compiled from: RewardedAd.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends FullScreenAd<a, c, FullScreenAdObject<c>, Object> {
    public a(Context context) {
        super(context, AdsType.Rewarded);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FullScreenAdObject<c> createAdObject(ContextProvider contextProvider, c cVar, NetworkAdapter networkAdapter, ga.b bVar, AdProcessCallback adProcessCallback) {
        h hVarCreateRewarded = networkAdapter.createRewarded();
        if (hVarCreateRewarded == null) {
            return null;
        }
        return new FullScreenAdObject<>(contextProvider, adProcessCallback, cVar, bVar, hVarCreateRewarded);
    }
}
