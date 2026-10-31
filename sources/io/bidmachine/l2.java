package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BidTokenManager.java */
/* JADX INFO: loaded from: classes4.dex */
class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ub.k f17903a = new BidMachineTrackingObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<AdFormat, TokenConfiguration> f17904b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, BidToken> f17905c = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: BidTokenManager.java */
    static class b implements ExpirationListener<BidToken> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(BidToken bidToken) {
            return String.format("BidToken expired - %s", bidToken.getId());
        }

        @Override // io.bidmachine.ExpirationListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onExpired(final BidToken bidToken) {
            io.bidmachine.core.a.b("BidTokenManager", new qc.b() { // from class: io.bidmachine.m2
                @Override // qc.b
                public final Object get() {
                    return l2.b.b(bidToken);
                }
            });
            l2.u(bidToken);
            bidToken.destroyAdRequest();
        }
    }

    private static void A(AdsType adsType, oc.a aVar) {
        f17903a.eventFinish(TrackEventType.GetBidToken, adsType, null, aVar);
    }

    static String f(Context context, AdPlacementConfig adPlacementConfig) {
        AdsType adsType = adPlacementConfig.getAdFormat().getAdsType();
        RequestTokenPayload requestTokenPayloadG = g(context, adPlacementConfig);
        if (requestTokenPayloadG == null) {
            w(adsType, oc.a.i("Failed to create RequestTokenPayload"));
            return "";
        }
        try {
            String strEncodeToString = Base64.encodeToString(requestTokenPayloadG.toByteArray(), 2);
            x(adsType);
            return strEncodeToString;
        } catch (Exception e10) {
            w(adsType, oc.a.l("Failed to encode RequestTokenPayload", e10));
            v(requestTokenPayloadG.getTokenHashValue());
            return "";
        }
    }

    private static RequestTokenPayload g(Context context, AdPlacementConfig adPlacementConfig) {
        try {
            AdFormat adFormat = adPlacementConfig.getAdFormat();
            AdsType adsType = adFormat.getAdsType();
            b2 b2VarE = b2.e();
            RequestTokenPayload.Builder builderNewBuilder = RequestTokenPayload.newBuilder();
            final Placement.Builder placementBuilder = builderNewBuilder.getPlacementBuilder();
            placementBuilder.setAdFormat(oc.h.b(adFormat));
            placementBuilder.setAdType(adsType.getName());
            io.bidmachine.core.h.B(adPlacementConfig.getPlacementId(), new Executable() { // from class: io.bidmachine.i2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    l2.m(placementBuilder, (String) obj);
                }
            });
            io.bidmachine.core.h.B(adPlacementConfig.getCustomParams(), new Executable() { // from class: io.bidmachine.j2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    l2.n(placementBuilder, (CustomParams) obj);
                }
            });
            App.Builder builderNewBuilder2 = App.newBuilder();
            b2VarE.h().build(context, builderNewBuilder2);
            builderNewBuilder.setAppData(builderNewBuilder2);
            User.Builder builderH = h(b2VarE);
            if (builderH != null) {
                builderNewBuilder.setUserData(builderH);
            }
            SDK.Builder sdkver = SDK.newBuilder().setSdk(BidMachine.NAME).setSdkver("3.6.1");
            t7.c.c(sdkver);
            builderNewBuilder.setPlacementData(sdkver);
            b2VarE.i().e(context, builderNewBuilder, b2VarE.w());
            b2VarE.s().i(context, builderNewBuilder, adsType);
            t(context, builderNewBuilder, adPlacementConfig);
            Struct.Builder builderNewBuilder3 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder3.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder3.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder3.build());
            }
            return builderNewBuilder.build();
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            return null;
        }
    }

    private static User.Builder h(b2 b2Var) {
        try {
            w5 w5VarW = b2Var.w();
            User.Builder builderNewBuilder = User.newBuilder();
            w5VarW.h(builderNewBuilder);
            return builderNewBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void i(HeaderBiddingPlacement.Builder builder, List<Any> list) {
        Iterator<Any> it = list.iterator();
        while (it.hasNext()) {
            try {
                builder.addAllAdUnits(((HeaderBiddingPlacement) it.next().unpack(HeaderBiddingPlacement.class)).getAdUnitsList());
            } catch (Throwable unused) {
            }
        }
    }

    static <T extends AdRequest<?, ?, ?>> T j(ResponsePayload responsePayload) {
        if (responsePayload == null) {
            return null;
        }
        final String strK = k(responsePayload);
        io.bidmachine.core.a.b("BidTokenManager", new qc.b() { // from class: io.bidmachine.g2
            @Override // qc.b
            public final Object get() {
                return l2.o(strK);
            }
        });
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        BidToken bidTokenV = v(strK);
        if (bidTokenV != null) {
            return (T) bidTokenV.getAdRequest();
        }
        io.bidmachine.core.a.b("BidTokenManager", new qc.b() { // from class: io.bidmachine.h2
            @Override // qc.b
            public final Object get() {
                return l2.p(strK);
            }
        });
        return null;
    }

    private static String k(ResponsePayload responsePayload) {
        try {
            Value value = responsePayload.getResponseCache().getResponse().getExt().getFieldsMap().get("tokenHashValue");
            if (value == null) {
                return null;
            }
            return value.getStringValue();
        } catch (Throwable unused) {
            return null;
        }
    }

    static TokenConfiguration l(AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        return f17904b.get(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Placement.Builder builder, String str) {
        builder.setPlacementId(StringValue.of(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Placement.Builder builder, CustomParams customParams) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        customParams.fillStructBuilder(builderNewBuilder);
        if (builderNewBuilder.getFieldsCount() > 0) {
            builder.setCustomData(builderNewBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(String str) {
        return String.format("BidTokenId from bidPayload - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(String str) {
        return String.format("BidToken is null by bidTokenId - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(BidToken bidToken) {
        return String.format("BidTokenId - %s", bidToken.getId());
    }

    private static AdRequest<?, ?, ?> r(AdPlacementConfig adPlacementConfig) {
        AdRequest.AdRequestBuilderImpl bVar;
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Banner) {
            bVar = new y6.c.C0486c(adPlacementConfig);
        } else if (adFormat instanceof AdFormat.Interstitial) {
            bVar = new s7.c.b(adPlacementConfig);
        } else if (adFormat instanceof AdFormat.Rewarded) {
            bVar = new tb.c.b(adPlacementConfig);
        } else {
            bVar = adFormat instanceof AdFormat.Native ? new ha.n.b(adPlacementConfig) : null;
        }
        if (bVar == null) {
            return null;
        }
        return bVar.build();
    }

    private static TokenConfiguration s(AdFormat adFormat) {
        TokenConfiguration tokenConfigurationL = l(adFormat);
        return tokenConfigurationL == null ? TokenConfiguration.newBuilder().setExpirationTime(300).build() : tokenConfigurationL;
    }

    private static void t(Context context, RequestTokenPayload.Builder builder, AdPlacementConfig adPlacementConfig) {
        try {
            AdRequest<?, ?, ?> adRequestR = r(adPlacementConfig);
            if (adRequestR == null) {
                return;
            }
            NetworkRegistry.registerAndInitializeCoreNetworks(context);
            TokenConfiguration tokenConfigurationS = s(adPlacementConfig.getAdFormat());
            HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
            for (Message.Builder builder2 : adRequestR.collectPlacementFormats(context, tokenConfigurationS.getAdNetworksList(), null)) {
                if (builder2 instanceof com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder) {
                    i(builderNewBuilder, ((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder) builder2).getExtProtoList());
                } else if (builder2 instanceof com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder) {
                    i(builderNewBuilder, ((com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder) builder2).getExtProtoList());
                }
            }
            if (builderNewBuilder.getAdUnitsList().isEmpty()) {
                return;
            }
            final BidToken bidToken = new BidToken(adRequestR, tokenConfigurationS.getExpirationTime(), new b());
            z(bidToken);
            builder.getPlacementBuilder().setHbPlacement(builderNewBuilder);
            builder.setTokenHashValue(bidToken.getId());
            io.bidmachine.core.a.b("BidTokenManager", new qc.b() { // from class: io.bidmachine.k2
                @Override // qc.b
                public final Object get() {
                    return l2.q(bidToken);
                }
            });
        } catch (Throwable unused) {
            v(builder.getTokenHashValue());
        }
    }

    static BidToken u(BidToken bidToken) {
        return v(bidToken.getId());
    }

    static BidToken v(String str) {
        BidToken bidTokenRemove = f17905c.remove(str);
        if (bidTokenRemove != null) {
            bidTokenRemove.stopExpiration();
        }
        return bidTokenRemove;
    }

    private static void w(AdsType adsType, oc.a aVar) {
        A(adsType, aVar);
    }

    private static void x(AdsType adsType) {
        A(adsType, null);
    }

    static void y(List<TokenConfiguration> list) {
        f17904b.clear();
        if (list == null) {
            return;
        }
        for (TokenConfiguration tokenConfiguration : list) {
            AdFormat adFormatByRemoteName = AdFormat.byRemoteName(tokenConfiguration.getType());
            if (adFormatByRemoteName != null) {
                f17904b.put(adFormatByRemoteName, tokenConfiguration);
            }
        }
    }

    static void z(BidToken bidToken) {
        f17905c.put(bidToken.getId(), bidToken);
        bidToken.startExpiration();
    }
}
