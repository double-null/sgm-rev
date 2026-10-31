package a7;

import com.explorestack.protobuf.adcom.Ad;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.vungle.ads.internal.Constants;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.TrackEventType;
import pb.vBC.NyXuoef;
import wb.d0;

/* JADX INFO: compiled from: NativeAdObjectParams.java */
/* JADX INFO: loaded from: classes4.dex */
final class k extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b7.b f121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b7.a f122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b7.c f123f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(LabelData labelData) {
        b().put("adLabel", labelData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(PrivacySheetData privacySheetData) {
        b().put("privacySheet", privacySheetData);
    }

    @Override // a7.h, ga.b
    public boolean g() {
        return true;
    }

    k(Ad ad2) {
        super(ad2);
        b7.b bVar = new b7.b();
        this.f121d = bVar;
        b7.a aVar = new b7.a(bVar);
        this.f122e = aVar;
        this.f123f = new b7.c(aVar);
        Ad.Display.Native r10 = ad2.getDisplay().getNative();
        Ad.Display.Native.LinkAsset link = r10.getLink();
        if (link != null && link != Ad.Display.Native.LinkAsset.getDefaultInstance()) {
            b().put(Constants.CLICK_URL, link.getUrl());
            for (int i10 = 0; i10 < link.getTrkrCount(); i10++) {
                a(TrackEventType.Click, link.getTrkr(i10));
            }
        }
        for (Ad.Display.Native.Asset asset : r10.getAssetList()) {
            int id2 = asset.getId();
            if (id2 != 4) {
                if (id2 != 7) {
                    if (id2 != 8) {
                        if (id2 != 101) {
                            if (id2 != 102) {
                                if (id2 != 123) {
                                    if (id2 != 124) {
                                        if (id2 != 127) {
                                            if (id2 == 128) {
                                                b().put(NyXuoef.myLUewhyHcz, asset.getImage().getUrl());
                                            }
                                        } else {
                                            b().put("description", asset.getData().getValue());
                                        }
                                    } else {
                                        b().put("iconUrl", asset.getImage().getUrl());
                                    }
                                } else {
                                    b().put("title", asset.getTitle().getText());
                                }
                            } else {
                                d0.r(this.f123f.a(asset), new wb.i() { // from class: a7.j
                                    @Override // wb.i
                                    public final void execute(Object obj) {
                                        this.f120a.q((PrivacySheetData) obj);
                                    }
                                });
                            }
                        } else {
                            d0.r(this.f122e.a(asset.getLabel()), new wb.i() { // from class: a7.i
                                @Override // wb.i
                                public final void execute(Object obj) {
                                    this.f119a.p((LabelData) obj);
                                }
                            });
                        }
                    } else {
                        b().put(SDKConstants.PARAM_GAME_REQUESTS_CTA, asset.getData().getValue());
                    }
                } else {
                    try {
                        b().put("rating", Float.valueOf(asset.getData().getValue()));
                    } catch (NumberFormatException unused) {
                    }
                }
            } else {
                Ad.Display.Native.Asset.VideoAsset defaultInstance = Ad.Display.Native.Asset.VideoAsset.getDefaultInstance();
                if (!asset.getVideo().getCurl().equals(defaultInstance.getCurl())) {
                    b().put("videoUrl", asset.getVideo().getCurl());
                }
                if (!asset.getVideo().getAdm().equals(defaultInstance.getAdm())) {
                    b().put("videoAdm", asset.getVideo().getAdm());
                }
            }
        }
    }
}
