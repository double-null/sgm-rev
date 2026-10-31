package y6;

import android.content.Context;
import io.bidmachine.AdView;
import io.bidmachine.BannerAdSize;
import io.bidmachine.ViewAdObject;
import vb.g;

/* JADX INFO: compiled from: BannerView.java */
/* JADX INFO: loaded from: classes4.dex */
public class e extends AdView<e, a, c, ViewAdObject<c, vb.e, g>, Object> {
    public e(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createAd(Context context) {
        return new a(context);
    }

    public BannerAdSize getAdSize() {
        a ad2 = getAd();
        if (ad2 != null) {
            return ad2.e();
        }
        return null;
    }
}
