package io.bidmachine;

import android.util.Size;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Banner' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class AdsType {
    public static final AdsType Banner;
    public static final AdsType Interstitial;
    public static final AdsType Rewarded;
    private final ApiRequest.ApiAuctionDataBinder binder;
    private final String name;
    private final a7.n[] placementBuilders;
    private final Executor placementCreateExecutor;
    public static final AdsType Native = new AdsType("Native", 3, "native", new ApiRequest.ApiAuctionDataBinder(), new a7.n[]{new a7.n<vb.n>() { // from class: a7.l

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f129h;

        static {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f124c = builderNewBuilder;
            builderNewBuilder.setId(123);
            builderNewBuilder.setReq(true);
            builderNewBuilder.setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f125d = builderNewBuilder2;
            builderNewBuilder2.setId(127);
            builderNewBuilder2.setReq(true);
            builderNewBuilder2.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f126e = builderNewBuilder3;
            builderNewBuilder3.setId(8);
            builderNewBuilder3.setReq(true);
            builderNewBuilder3.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f127f = builderNewBuilder4;
            builderNewBuilder4.setId(7);
            builderNewBuilder4.setReq(false);
            builderNewBuilder4.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder5 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f128g = builderNewBuilder5;
            builderNewBuilder5.setId(101);
            builderNewBuilder5.setReq(false);
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder6 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f129h = builderNewBuilder6;
            builderNewBuilder6.setId(102);
            builderNewBuilder6.setReq(false);
        }

        {
            AdContentType adContentType = AdContentType.All;
        }

        static Placement.DisplayPlacement.NativeFormat.AssetFormat j(vb.n nVar) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(124);
            builderNewBuilder.setReq(nVar.getAdRequestParameters().a(MediaAssetType.Icon));
            builderNewBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return builderNewBuilder.build();
        }

        static Placement.DisplayPlacement.NativeFormat.AssetFormat k(vb.n nVar) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(128);
            builderNewBuilder.setReq(nVar.getAdRequestParameters().a(MediaAssetType.Image));
            builderNewBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
            return builderNewBuilder.build();
        }

        static Placement.DisplayPlacement.NativeFormat.AssetFormat m(vb.n nVar) {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder.setId(4);
            builderNewBuilder.setReq(nVar.getAdRequestParameters().a(MediaAssetType.Video));
            builderNewBuilder.setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build());
            return builderNewBuilder.build();
        }

        @Override // a7.n
        public ga.b b(Ad ad2) {
            ga.b bVarC = c(ad2);
            return (bVarC == null && ad2.hasDisplay() && ad2.getDisplay().hasNative()) ? new k(ad2) : bVarC;
        }

        @Override // a7.n
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Message.Builder e(ContextProvider contextProvider, vb.n nVar, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
            Placement.DisplayPlacement.Builder builderAddAllMime = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES));
            Placement.DisplayPlacement.NativeFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
            builderNewBuilder.addAsset(f124c);
            builderNewBuilder.addAsset(f125d);
            builderNewBuilder.addAsset(f126e);
            builderNewBuilder.addAsset(f127f);
            builderNewBuilder.addAsset(j(nVar));
            builderNewBuilder.addAsset(k(nVar));
            builderNewBuilder.addAsset(m(nVar));
            builderNewBuilder.addAsset(f128g);
            builderNewBuilder.addAsset(f129h);
            builderAddAllMime.setNativefmt(builderNewBuilder);
            HeaderBiddingPlacement.Builder builderD = d(contextProvider, nVar, adsType, collection, list, i10);
            if (adPlacementConfig == null && builderD != null) {
                builderAddAllMime.addExtProto(Any.pack(builderD.build()));
            } else if (adPlacementConfig != null) {
                builderAddAllMime.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
            }
            return builderAddAllMime;
        }
    }});
    private static final /* synthetic */ AdsType[] $VALUES = $values();

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a7.n f16415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContextProvider f16416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vb.d f16417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Collection f16418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f16419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AdPlacementConfig f16420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f16421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f16422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f16423i;

        b(a7.n nVar, ContextProvider contextProvider, vb.d dVar, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10, List list2, CountDownLatch countDownLatch) {
            this.f16415a = nVar;
            this.f16416b = contextProvider;
            this.f16417c = dVar;
            this.f16418d = collection;
            this.f16419e = list;
            this.f16420f = adPlacementConfig;
            this.f16421g = i10;
            this.f16422h = list2;
            this.f16423i = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Message.Builder builderE = this.f16415a.e(this.f16416b, this.f16417c, AdsType.this, this.f16418d, this.f16419e, this.f16420f, this.f16421g);
                synchronized (this.f16422h) {
                    this.f16422h.add(builderE);
                }
                this.f16423i.countDown();
            } catch (Exception e10) {
                io.bidmachine.core.a.o(e10);
                this.f16423i.countDown();
            }
        }
    }

    private static /* synthetic */ AdsType[] $values() {
        return new AdsType[]{Banner, Interstitial, Rewarded, Native};
    }

    static {
        final boolean z10 = true;
        final boolean z11 = false;
        Banner = new AdsType("Banner", 0, "banner", new ApiRequest.ApiAuctionDataBinder(), new a7.n[]{new a7.b<vb.g>(z11) { // from class: io.bidmachine.AdsType.a
            @Override // a7.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Size j(ContextProvider contextProvider, vb.g gVar) {
                return gVar.getAdRequestParameters().a().toSize();
            }
        }});
        Interstitial = new AdsType("Interstitial", 1, com.vungle.ads.internal.Constants.PLACEMENT_TYPE_INTERSTITIAL, new ApiRequest.ApiAuctionDataBinder(), new a7.n[]{new a7.b(true), new a7.n<UnifiedAdRequestParamsType>(z10) { // from class: a7.p

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f133c;

            {
                super(AdContentType.Video);
                this.f133c = z10;
            }

            @Override // a7.n
            public ga.b b(Ad ad2) {
                if (!ad2.hasVideo()) {
                    return null;
                }
                ga.b bVarC = c(ad2);
                if (bVarC != null) {
                    return bVarC;
                }
                Ad.Video video = ad2.getVideo();
                o oVar = new o(ad2);
                oVar.m(video.getAdm());
                return oVar;
            }

            @Override // a7.n
            public Message.Builder e(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
                Size sizeJ = j(contextProvider, unifiedadrequestparamstype);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.f133c).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(sizeJ.getWidth()).setH(sizeJ.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder builderD = d(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i10);
                if (adPlacementConfig == null && builderD != null) {
                    linearValue.addExtProto(Any.pack(builderD.build()));
                } else if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
                }
                return linearValue;
            }

            public Size j(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype) {
                return io.bidmachine.core.h.y(contextProvider.getContext());
            }
        }});
        Rewarded = new AdsType("Rewarded", 2, com.vungle.ads.internal.Constants.PLACEMENT_TYPE_REWARDED, new ApiRequest.ApiAuctionDataBinder(), new a7.n[]{new a7.b(true), new a7.n<UnifiedAdRequestParamsType>(z11) { // from class: a7.p

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f133c;

            {
                super(AdContentType.Video);
                this.f133c = z11;
            }

            @Override // a7.n
            public ga.b b(Ad ad2) {
                if (!ad2.hasVideo()) {
                    return null;
                }
                ga.b bVarC = c(ad2);
                if (bVarC != null) {
                    return bVarC;
                }
                Ad.Video video = ad2.getVideo();
                o oVar = new o(ad2);
                oVar.m(video.getAdm());
                return oVar;
            }

            @Override // a7.n
            public Message.Builder e(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
                Size sizeJ = j(contextProvider, unifiedadrequestparamstype);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.f133c).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(sizeJ.getWidth()).setH(sizeJ.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder builderD = d(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i10);
                if (adPlacementConfig == null && builderD != null) {
                    linearValue.addExtProto(Any.pack(builderD.build()));
                } else if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(f(adPlacementConfig, builderD)));
                }
                return linearValue;
            }

            public Size j(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype) {
                return io.bidmachine.core.h.y(contextProvider.getContext());
            }
        }});
    }

    private AdsType(String str, int i10, String str2, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, a7.n[] nVarArr) {
        super(str, i10);
        this.name = str2;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = nVarArr;
        this.placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
    }

    public static AdsType valueOf(String str) {
        return (AdsType) Enum.valueOf(AdsType.class, str);
    }

    public static AdsType[] values() {
        return (AdsType[]) $VALUES.clone();
    }

    void collectPlacements(ContextProvider contextProvider, AdRequest adRequest, vb.d dVar, Collection<NetworkConfig> collection, List<Message.Builder> list, List<NetworkAdUnit> list2, AdPlacementConfig adPlacementConfig, int i10) {
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        a7.n[] nVarArr = adsType.placementBuilders;
        int length = nVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            a7.n nVar = nVarArr[i11];
            if (adRequest.isPlacementBuilderMatch(nVar)) {
                adsType.placementCreateExecutor.execute(new b(nVar, contextProvider, dVar, collection, list2, adPlacementConfig, i10, list, countDownLatch));
            } else {
                countDownLatch.countDown();
            }
            i11++;
            adsType = this;
            nVarArr = nVarArr;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            io.bidmachine.core.a.o(e10);
        }
    }

    ga.b createAdObjectParams(String str, Ad ad2) {
        for (a7.n nVar : this.placementBuilders) {
            ga.b bVarB = nVar.b(ad2);
            if (bVarB != null) {
                bVarB.b().put("bidId", str);
                return bVarB;
            }
        }
        return null;
    }

    NetworkAdapter findNetworkAdapter(Ad ad2) {
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(ad2);
        NetworkAdapter adapter = headerBiddingAdObtainHeaderBiddingAd != null ? NetworkRegistry.getAdapter(headerBiddingAdObtainHeaderBiddingAd.getBidder()) : null;
        if (adapter != null) {
            return adapter;
        }
        if (this == Native) {
            return NetworkRegistry.getAdapter("nast");
        }
        if (ad2.hasDisplay()) {
            return NetworkRegistry.getAdapter("mraid");
        }
        return ad2.hasVideo() ? NetworkRegistry.getAdapter("vast") : adapter;
    }

    ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        return this == Interstitial || this == Rewarded;
    }

    HeaderBiddingAd obtainHeaderBiddingAd(Ad ad2) {
        for (a7.n nVar : this.placementBuilders) {
            HeaderBiddingAd headerBiddingAdI = nVar.i(ad2);
            if (headerBiddingAdI != null) {
                return headerBiddingAdI;
            }
        }
        return null;
    }
}
