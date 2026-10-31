package io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.vungle.ads.internal.Constants;
import ha.g;
import io.bidmachine.Function;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import vb.c;
import vb.k;
import vb.n;
import vb.o;

/* JADX INFO: compiled from: NastParams.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f16719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f16720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f16721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Float f16722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f16723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f16724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f16725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f16726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f16727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final LabelData f16728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final PrivacySheetData f16729l;

    b(k kVar) {
        super(kVar);
        this.f16719b = kVar.i("title");
        this.f16720c = kVar.i("description");
        this.f16721d = kVar.i(SDKConstants.PARAM_GAME_REQUESTS_CTA);
        this.f16722e = kVar.d("rating");
        this.f16723f = kVar.i("iconUrl");
        this.f16724g = kVar.i("imageUrl");
        this.f16725h = kVar.i("videoUrl");
        this.f16726i = kVar.i("videoAdm");
        this.f16727j = kVar.i(Constants.CLICK_URL);
        this.f16728k = (LabelData) kVar.b("adLabel", new Function() { // from class: w6.a
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return io.bidmachine.ads.networks.nast.b.e(obj);
            }
        });
        this.f16729l = (PrivacySheetData) kVar.b("privacySheet", new Function() { // from class: w6.b
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return io.bidmachine.ads.networks.nast.b.f(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LabelData e(Object obj) {
        return (LabelData) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PrivacySheetData f(Object obj) {
        return (PrivacySheetData) obj;
    }

    public boolean c(c cVar) {
        if (TextUtils.isEmpty(this.f16719b)) {
            cVar.c(oc.a.k("title"));
            return false;
        }
        if (!TextUtils.isEmpty(this.f16721d)) {
            return true;
        }
        cVar.c(oc.a.k(SDKConstants.PARAM_GAME_REQUESTS_CTA));
        return false;
    }

    boolean d(n nVar, c cVar) {
        if (!c(cVar)) {
            return false;
        }
        g adRequestParameters = nVar.getAdRequestParameters();
        if (adRequestParameters.c() && adRequestParameters.a(MediaAssetType.Icon) && TextUtils.isEmpty(this.f16723f)) {
            cVar.c(oc.a.k("iconUrl"));
            return false;
        }
        if (adRequestParameters.c() && adRequestParameters.a(MediaAssetType.Image) && TextUtils.isEmpty(this.f16724g)) {
            cVar.c(oc.a.k("imageUrl"));
            return false;
        }
        if (!adRequestParameters.c() || !adRequestParameters.a(MediaAssetType.Video) || !TextUtils.isEmpty(this.f16726i) || !TextUtils.isEmpty(this.f16725h)) {
            return true;
        }
        cVar.c(oc.a.k("videoAdm or videoUrl"));
        return false;
    }
}
