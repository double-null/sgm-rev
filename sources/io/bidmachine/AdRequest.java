package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.protobuf.ResponsePayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import vb.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdRequest<SelfType extends AdRequest, AdRequestParametersType extends AdRequestParameters, UnifiedAdRequestParamsType extends vb.d> {
    List<AdRequestListener<SelfType>> adRequestListeners;
    private final AdRequestParametersType adRequestParameters;
    AdResponse adResponse;
    private final k0 adResponseLoader;
    final Queue<String> auctionUrlQueue;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f16375id;
    List<e<SelfType>> internalAdRequestListeners;
    private final AtomicBoolean isApiRequestCanceled;
    private final AtomicBoolean isApiRequestCompleted;
    private final AtomicBoolean isDestroyed;
    private final AtomicBoolean isLoading;
    private final AtomicBoolean isRequestExpired;
    private NetworkAdUnitManager networkAdUnitManager;
    private final oc.p tag = new oc.p("AdRequest");
    private final Runnable timeOutRunnable;
    private final BidMachineTrackingObject trackingObject;
    private UnifiedAdRequestParamsType unifiedAdRequestParams;

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class AdRequestBuilderImpl<SelfType extends ga.f, ReturnType extends AdRequest<ReturnType, AdRequestParametersType, ?>, AdRequestParametersType extends AdRequestParameters> implements ga.f<SelfType, ReturnType> {
        protected AdPlacementConfig adPlacementConfig;
        ResponsePayload bidPayload;
        AdRequestListener<ReturnType> listener;
        List<NetworkConfig> networkConfigList;
        PriceFloorParams priceFloorParams;
        TargetingParams targetingParams;
        Integer timeOutMs;

        protected AdRequestBuilderImpl(AdPlacementConfig adPlacementConfig) {
            this.adPlacementConfig = adPlacementConfig;
        }

        private void fillAdRequestParameters(AdRequestParametersType adrequestparameterstype) {
            adrequestparameterstype.setAdPlacementConfig(this.adPlacementConfig);
            adrequestparameterstype.setPriceFloorParams(this.priceFloorParams);
            adrequestparameterstype.setTargetingParams(this.targetingParams);
            adrequestparameterstype.setNetworkConfigList(this.networkConfigList);
            adrequestparameterstype.setTimeOutMs(this.timeOutMs);
            adrequestparameterstype.setBidPayload(this.bidPayload);
        }

        public ReturnType build() {
            ReturnType returntype = (ReturnType) l2.j(this.bidPayload);
            if (returntype == null) {
                returntype = (ReturnType) build(createAdRequestParameters());
            }
            fillAdRequestParameters(returntype.getAdRequestParameters());
            returntype.addListener(this.listener);
            return returntype;
        }

        protected abstract ReturnType build(AdRequestParametersType adrequestparameterstype);

        protected abstract AdRequestParametersType createAdRequestParameters();

        void fillNetworkConfigs(List<NetworkConfig> list) {
            if (list == null) {
                this.networkConfigList = new ArrayList();
            } else {
                this.networkConfigList = list;
            }
        }

        public SelfType setBidPayload(String str) {
            if (str == null) {
                this.bidPayload = null;
                return this;
            }
            try {
                this.bidPayload = ResponsePayload.parseFrom(Base64.decode(str, 0));
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
            if (this.bidPayload == null) {
                this.bidPayload = ResponsePayload.getDefaultInstance();
            }
            return this;
        }

        @Deprecated(since = "3.5.0")
        public SelfType setCustomParams(CustomParams customParams) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder().withCustomParams(customParams).build();
            return this;
        }

        public SelfType setListener(AdRequestListener<ReturnType> adRequestListener) {
            this.listener = adRequestListener;
            return this;
        }

        public SelfType setLoadingTimeOut(Integer num) {
            this.timeOutMs = num;
            return this;
        }

        public SelfType setNetworks(List<NetworkConfig> list) {
            fillNetworkConfigs(list);
            return this;
        }

        @Deprecated(since = "3.5.0")
        public SelfType setPlacementId(String str) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder().withPlacementId(str).build();
            return this;
        }

        public SelfType setPriceFloorParams(PriceFloorParams priceFloorParams) {
            this.priceFloorParams = priceFloorParams;
            return this;
        }

        public SelfType setTargetingParams(TargetingParams targetingParams) {
            this.targetingParams = targetingParams;
            return this;
        }

        public SelfType setNetworks(String str) {
            ArrayList arrayList = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(str);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            NetworkConfig networkConfigH = o4.h(b2.e().g(), jSONArray.getJSONObject(i10));
                            if (networkConfigH != null) {
                                arrayList2.add(networkConfigH);
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e10) {
                        e = e10;
                        arrayList = arrayList2;
                        io.bidmachine.core.a.o(e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            fillNetworkConfigs(arrayList);
            return this;
        }

        @Deprecated
        public SelfType setSessionAdParams(SessionAdParams sessionAdParams) {
            return this;
        }
    }

    public interface AdRequestListener<AdRequestType extends AdRequest> {
        void onRequestExpired(AdRequestType adrequesttype);

        void onRequestFailed(AdRequestType adrequesttype, oc.a aVar);

        void onRequestSuccess(AdRequestType adrequesttype, ga.c cVar);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdResponse adResponseN = o0.f().n(AdRequest.this.adRequestParameters);
            if (adResponseN != null) {
                AdRequest.this.processApiRequestSuccess(adResponseN);
            } else {
                AdRequest.this.processApiRequestFail(oc.a.f23334f, false);
                AdRequest.this.cancel();
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16377a;

        b(Context context) {
            this.f16377a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "Request start";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdRequest.this.cancel();
                AdRequest.this.unsubscribeTimeOut();
                AdRequest<?, ?, ?> adRequest = AdRequest.this;
                AdResponse adResponse = adRequest.adResponse;
                if (adResponse != null) {
                    adResponse.detachAdRequest(adRequest);
                    AdRequest.this.adResponse = null;
                }
                AdRequest.this.isApiRequestCanceled.set(false);
                AdRequest.this.isApiRequestCompleted.set(false);
                AdRequest.this.subscribeTimeOut();
                AdRequest.this.log(new qc.b() { // from class: io.bidmachine.l
                    @Override // qc.b
                    public final Object get() {
                        return AdRequest.b.c();
                    }
                });
                AdRequest.this.trackingObject.eventStart(TrackEventType.AuctionRequest);
                ResponsePayload bidPayload = AdRequest.this.adRequestParameters.getBidPayload();
                if (bidPayload != null) {
                    AdRequest.this.processBidPayload(bidPayload);
                } else {
                    AdRequest.this.processRequestObject(this.f16377a);
                }
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
                AdRequest.this.processRequestFail(oc.a.l("Exception loading ad request", th));
            }
        }
    }

    class c implements x4.a<AdResponse> {
        c() {
        }

        @Override // io.bidmachine.x4.a
        public void a(oc.a aVar) {
            AdRequest.this.processApiRequestFail(aVar);
        }

        @Override // io.bidmachine.x4.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AdResponse adResponse) {
            AdRequest.this.processApiRequestSuccess(adResponse);
        }
    }

    class d implements k0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ApiRequest.Builder f16381b;

        d(String str, ApiRequest.Builder builder) {
            this.f16380a = str;
            this.f16381b = builder;
        }

        @Override // io.bidmachine.k0.a
        public void a(oc.a aVar) {
            AdRequest.this.processApiRequestLoadedFail(this.f16381b, aVar);
        }

        @Override // io.bidmachine.k0.a
        public void b(AdResponse adResponse) {
            AdRequest.this.setAuctionUrl(this.f16380a);
            AdRequest.this.processApiRequestSuccess(adResponse);
        }

        @Override // io.bidmachine.k0.a
        public void onCancel() {
            AdRequest.this.processApiRequestCancel();
        }
    }

    interface e<AdRequestType extends AdRequest> {
        void a(AdRequestType adrequesttype);
    }

    protected AdRequest(AdRequestParametersType adrequestparameterstype) {
        String string = UUID.randomUUID().toString();
        this.f16375id = string;
        this.isLoading = new AtomicBoolean(false);
        this.isApiRequestCanceled = new AtomicBoolean(false);
        this.isApiRequestCompleted = new AtomicBoolean(false);
        this.isRequestExpired = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.timeOutRunnable = new a();
        this.trackingObject = new BidMachineTrackingObject(string);
        this.adRequestParameters = adrequestparameterstype;
        this.adResponseLoader = new k0(string);
        this.auctionUrlQueue = new LinkedList();
    }

    private boolean canProcessApiRequestResult() {
        return (isCompleted() || isCanceled() || isDestroyed()) ? false : true;
    }

    private boolean canSendApiRequest() {
        return !isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$collectNetworkConfig$0(NetworkConfig networkConfig, String str) {
        return String.format("%s was removed from AdRequest: %s", networkConfig.getNetworkKey(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$destroy$3() {
        return "destroy";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$log$7(qc.b bVar) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$logError$8(qc.b bVar) {
        return String.format("%s - %s", this.adRequestParameters.getAdsType(), bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationLoss$2(String str, Double d10) {
        return String.format("notifyMediationLoss (winnerNetworkName - %s, winnerNetworkPrice - %s)", str, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$notifyMediationWin$1() {
        return "notifyMediationWin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processApiRequestSuccess$5(AdResponse adResponse) {
        return String.format("Request success - %s", adResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processExpired$4() {
        return "Request expired";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$processRequestFail$6(oc.a aVar) {
        return String.format("Request fail - %s", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(final qc.b<String> bVar) {
        io.bidmachine.core.a.b(this.tag, new qc.b() { // from class: io.bidmachine.h
            @Override // qc.b
            public final Object get() {
                return this.f17584a.lambda$log$7(bVar);
            }
        });
    }

    private void logError(final qc.b<String> bVar) {
        io.bidmachine.core.a.e(this.tag, new qc.b() { // from class: io.bidmachine.f
            @Override // qc.b
            public final Object get() {
                return this.f17570a.lambda$logError$8(bVar);
            }
        });
    }

    private NetworkAdUnitManager obtainNetworkAdUnitManager() {
        if (this.networkAdUnitManager == null) {
            this.networkAdUnitManager = new NetworkAdUnitManager();
        }
        return this.networkAdUnitManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processApiRequestCancel() {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCanceled.set(true);
            unsubscribeTimeOut();
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestCancel, getAdsType(), null, null);
            this.trackingObject.clearEvent(TrackEventType.AuctionRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRequestObject(Context context) {
        prepareUrls();
        Object objBuild = build(context);
        if (objBuild instanceof Request) {
            processRequestBuilder(new ApiRequest.Builder().setRequestData((Request) objBuild).setDataBinder(getAdsType().getBinder()), pollUrl());
        } else {
            processRequestFail(objBuild instanceof oc.a ? (oc.a) objBuild : oc.a.i("Failed to create ad request"));
        }
    }

    private void setLoading(boolean z10) {
        this.isLoading.set(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeTimeOut() {
        int iObtainTimeOutMs = obtainTimeOutMs();
        if (iObtainTimeOutMs > 0) {
            io.bidmachine.core.h.R(this.timeOutRunnable, iObtainTimeOutMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unsubscribeTimeOut() {
        io.bidmachine.core.h.f(this.timeOutRunnable);
    }

    void addInternalListener(e<SelfType> eVar) {
        if (eVar != null) {
            if (this.internalAdRequestListeners == null) {
                this.internalAdRequestListeners = new CopyOnWriteArrayList();
            }
            this.internalAdRequestListeners.add(eVar);
        }
    }

    public void addListener(AdRequestListener<SelfType> adRequestListener) {
        if (adRequestListener != null) {
            if (this.adRequestListeners == null) {
                this.adRequestListeners = new CopyOnWriteArrayList();
            }
            this.adRequestListeners.add(adRequestListener);
        }
    }

    Object build(Context context) {
        try {
            String strR = b2.e().r();
            if (TextUtils.isEmpty(strR)) {
                return oc.a.k("SellerId");
            }
            b2 b2VarE = b2.e();
            SessionManager sessionManager = SessionManager.get();
            AdvertisingDataManager.d(context);
            TargetingParams targetingParams = (TargetingParams) ga.g.resolveParams(this.adRequestParameters.getTargetingParams(), b2VarE.u());
            w5 w5VarW = b2VarE.w();
            PriceFloorParams priceFloorParams = this.adRequestParameters.getPriceFloorParams();
            Map<String, Double> priceFloors = (priceFloorParams == null || priceFloorParams.getPriceFloors().isEmpty()) ? b2VarE.n().getPriceFloors() : priceFloorParams.getPriceFloors();
            if (priceFloors.isEmpty()) {
                return oc.a.k("PriceFloors");
            }
            Request.Builder builderNewBuilder = Request.newBuilder();
            Request.Item.Builder builderNewBuilder2 = Request.Item.newBuilder();
            builderNewBuilder2.setId(UUID.randomUUID().toString());
            builderNewBuilder2.setQty(1);
            for (Map.Entry<String, Double> entry : priceFloors.entrySet()) {
                Request.Item.Deal.Builder builderNewBuilder3 = Request.Item.Deal.newBuilder();
                builderNewBuilder3.setId(entry.getKey());
                builderNewBuilder3.setFlr(entry.getValue().doubleValue());
                builderNewBuilder3.setFlrcur("USD");
                builderNewBuilder2.addDeal(builderNewBuilder3);
            }
            builderNewBuilder.setContext(Any.pack(RequestDataRetriever.collectContext(context, b2VarE, w5VarW, targetingParams, null, getAdsType())));
            builderNewBuilder.setTest(b2VarE.E());
            builderNewBuilder.addCur("USD");
            builderNewBuilder.setAt(2);
            builderNewBuilder.setTmax(10000);
            Placement.Builder builderNewBuilder4 = Placement.newBuilder();
            builderNewBuilder4.setSsai(0);
            builderNewBuilder4.setSdk(BidMachine.NAME);
            builderNewBuilder4.setSdkver("3.6.1");
            builderNewBuilder4.setSecure(!io.bidmachine.core.h.e());
            for (Message.Builder builder : collectPlacementFormats(context, null, this.adRequestParameters.getAdPlacementConfig())) {
                if (builder instanceof Placement.DisplayPlacement.Builder) {
                    Placement.DisplayPlacement.Builder builder2 = (Placement.DisplayPlacement.Builder) builder;
                    onBeforeSetDisplayPlacementBuilder(builder2);
                    builderNewBuilder4.setDisplay(builder2);
                } else {
                    if (!(builder instanceof Placement.VideoPlacement.Builder)) {
                        throw new IllegalArgumentException("Unsupported display type: " + builder);
                    }
                    Placement.VideoPlacement.Builder builder3 = (Placement.VideoPlacement.Builder) builder;
                    onBeforeSetVideoPlacementBuilder(builder3);
                    builderNewBuilder4.setVideo(builder3);
                }
            }
            Struct.Builder builderNewBuilder5 = Struct.newBuilder();
            t7.c.d(builderNewBuilder5);
            ListValue.Builder builderNewBuilder6 = ListValue.newBuilder();
            Iterator<AdResponse> it = o0.f().m(this.adRequestParameters).iterator();
            while (it.hasNext()) {
                builderNewBuilder6.addValues(it.next().createBidCacheExtensionValue());
            }
            if (builderNewBuilder6.getValuesCount() > 0) {
                builderNewBuilder5.putFields("bid_cache", Value.newBuilder().setListValue(builderNewBuilder6).build());
            }
            if (builderNewBuilder5.getFieldsCount() > 0) {
                builderNewBuilder4.setExt(builderNewBuilder5);
            }
            onBuildPlacement(builderNewBuilder4);
            builderNewBuilder2.setSpec(Any.pack(builderNewBuilder4.build()));
            builderNewBuilder.addItem(builderNewBuilder2.build());
            Struct.Builder builderNewBuilder7 = Struct.newBuilder();
            Struct privateStruct = ExtraParamsManager.get().getPrivateStruct(context);
            if (privateStruct != null) {
                builderNewBuilder7.putAllFields(privateStruct.getFieldsMap());
            }
            if (builderNewBuilder7.getFieldsCount() > 0) {
                builderNewBuilder.setExt(builderNewBuilder7.build());
            }
            RequestExtension.Builder builderNewBuilder8 = RequestExtension.newBuilder();
            builderNewBuilder8.setSellerId(strR);
            String strJ = b2VarE.j();
            if (!TextUtils.isEmpty(strJ)) {
                builderNewBuilder8.setIfv(strJ);
            }
            builderNewBuilder8.setBmIfv(b2VarE.K(context));
            builderNewBuilder8.setSessionId(sessionManager.getSessionId());
            builderNewBuilder.addExtProto(Any.pack(builderNewBuilder8.build()));
            return builderNewBuilder.build();
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            return oc.a.l("Exception creating ad request", th);
        }
    }

    void cancel() {
        this.adResponseLoader.a();
    }

    void clearNetworkAdUnits() {
        obtainNetworkAdUnitManager().notifyNetworkClearAuction();
    }

    List<NetworkConfig> collectNetworkConfig(Context context, AdsType adsType, List<String> list) {
        HashMap map = new HashMap();
        List<NetworkConfig> networkConfigList = this.adRequestParameters.getNetworkConfigList();
        if (networkConfigList == null) {
            io.bidmachine.core.h.a0(map, NetworkRegistry.copyOrNullInitializedNetworkConfigs(adsType));
        } else {
            map.putAll(NetworkRegistry.createInitNetworkConfigMap());
            for (final NetworkConfig networkConfig : networkConfigList) {
                final String strCheckAndPutNetwork = NetworkRegistry.checkAndPutNetwork(context, adsType, networkConfig, map);
                if (strCheckAndPutNetwork != null) {
                    logError(new qc.b() { // from class: io.bidmachine.c
                        @Override // qc.b
                        public final Object get() {
                            return AdRequest.lambda$collectNetworkConfig$0(networkConfig, strCheckAndPutNetwork);
                        }
                    });
                }
            }
        }
        if (list != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!list.contains((String) ((Map.Entry) it.next()).getKey())) {
                    it.remove();
                }
            }
        }
        io.bidmachine.core.h.a0(map, NetworkRegistry.copyOrNullInitializedCoreNetworkConfigs(adsType));
        return new ArrayList(map.values());
    }

    List<Message.Builder> collectPlacementFormats(Context context, List<String> list, AdPlacementConfig adPlacementConfig) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        AdsType adsType = getAdsType();
        adsType.collectPlacements(new SimpleContextProvider(context), this, obtainUnifiedRequestParams(), collectNetworkConfig(context, adsType, list), arrayList, copyOnWriteArrayList, adPlacementConfig, b2.e().m());
        this.networkAdUnitManager = new NetworkAdUnitManager(copyOnWriteArrayList);
        return arrayList;
    }

    protected abstract UnifiedAdRequestParamsType createUnifiedAdRequestParams(AdRequestParametersType adrequestparameterstype, TargetingParams targetingParams, ga.d dVar);

    public void destroy() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            log(new qc.b() { // from class: io.bidmachine.d
                @Override // qc.b
                public final Object get() {
                    return AdRequest.lambda$destroy$3();
                }
            });
            this.trackingObject.eventFinish(TrackEventType.AuctionRequestDestroy, false, getAdsType(), this.adResponse, null);
            cancel();
            unsubscribeTimeOut();
            this.trackingObject.clear();
            BidMachineFetcher.release(this);
            notifyRequestDestroyed();
            this.unifiedAdRequestParams = null;
            AdResponse adResponse = this.adResponse;
            if (adResponse != null) {
                adResponse.detachAdRequest(this);
                this.adResponse = null;
            }
        }
    }

    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    AdResponse getAdResponse() {
        return this.adResponse;
    }

    protected final AdsType getAdsType() {
        return this.adRequestParameters.getAdsType();
    }

    public ga.c getAuctionResult() {
        AdResponse adResponse = this.adResponse;
        if (adResponse != null) {
            return adResponse.getAuctionResult();
        }
        return null;
    }

    boolean isAdResponseExpired() {
        AdResponse adResponse = this.adResponse;
        return adResponse != null && adResponse.isExpired();
    }

    boolean isBidPayloadValid(ResponsePayload responsePayload) {
        Placement requestItemSpec = responsePayload.getRequestItemSpec();
        try {
            return requestItemSpec == Placement.getDefaultInstance() || this.adRequestParameters.isPlacementObjectValid(requestItemSpec);
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
            return false;
        }
    }

    boolean isCanceled() {
        return this.isApiRequestCanceled.get();
    }

    boolean isCompleted() {
        return this.isApiRequestCompleted.get();
    }

    public boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    public boolean isExpired() {
        return isAdResponseExpired() || this.isRequestExpired.get();
    }

    boolean isLoading() {
        return this.isLoading.get();
    }

    boolean isPlacementBuilderMatch(a7.n nVar) {
        return true;
    }

    public void notifyMediationLoss() {
        notifyMediationLoss(null, null);
    }

    public void notifyMediationWin() {
        oc.a aVar;
        if (isCompleted()) {
            log(new qc.b() { // from class: io.bidmachine.e
                @Override // qc.b
                public final Object get() {
                    return AdRequest.lambda$notifyMediationWin$1();
                }
            });
            if (isDestroyed()) {
                aVar = oc.a.f23338j;
            } else {
                aVar = isExpired() ? oc.a.f23337i : null;
            }
            this.trackingObject.eventFinish(TrackEventType.MediationWin, false, getAdsType(), this.adResponse, aVar);
        }
    }

    void notifyRequestDestroyed() {
        List<e<SelfType>> list = this.internalAdRequestListeners;
        if (list != null) {
            Iterator<e<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    int obtainTimeOutMs() {
        Integer timeOutMs;
        int iP = b2.e().p();
        return (iP > 0 || (timeOutMs = this.adRequestParameters.getTimeOutMs()) == null || timeOutMs.intValue() <= 0) ? iP : timeOutMs.intValue();
    }

    final UnifiedAdRequestParamsType obtainUnifiedRequestParams() {
        if (this.unifiedAdRequestParams == null) {
            b2 b2VarE = b2.e();
            this.unifiedAdRequestParams = (UnifiedAdRequestParamsType) createUnifiedAdRequestParams(this.adRequestParameters, (TargetingParams) ga.g.resolveParams(this.adRequestParameters.getTargetingParams(), b2VarE.u()), b2VarE.w());
        }
        return this.unifiedAdRequestParams;
    }

    String pollUrl() {
        if (this.auctionUrlQueue.isEmpty()) {
            this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
        }
        return this.auctionUrlQueue.poll();
    }

    void prepareUrls() {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.addAll(UrlProvider.getAuctionUrlQueue());
    }

    void processApiRequestFail(oc.a aVar) {
        processApiRequestFail(aVar, true);
    }

    void processApiRequestLoadedFail(ApiRequest.Builder<Request, Response> builder, oc.a aVar) {
        String strPoll;
        if (canProcessApiRequestResult()) {
            if (aVar == oc.a.f23347s || (strPoll = this.auctionUrlQueue.poll()) == null) {
                processApiRequestFail(aVar);
            } else {
                processRequestBuilder(builder, strPoll);
            }
        }
    }

    void processApiRequestSuccess(final AdResponse adResponse) {
        if (!canProcessApiRequestResult()) {
            adResponse.detachAdRequest(this);
            return;
        }
        setLoading(false);
        this.isApiRequestCompleted.set(true);
        unsubscribeTimeOut();
        log(new qc.b() { // from class: io.bidmachine.g
            @Override // qc.b
            public final Object get() {
                return AdRequest.lambda$processApiRequestSuccess$5(adResponse);
            }
        });
        setAdResponse(adResponse);
        adResponse.attachAdRequest(this);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestSuccess(this, adResponse.getAuctionResult());
            }
        }
        Iterator<AdRequestListener<?>> it2 = b2.e().f().iterator();
        while (it2.hasNext()) {
            it2.next().onRequestSuccess(this, adResponse.getAuctionResult());
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, false, getAdsType(), adResponse, null);
    }

    protected void processBidPayload(ResponsePayload responsePayload) {
        if (responsePayload == ResponsePayload.getDefaultInstance()) {
            processRequestFail(oc.a.h("BidPayload has invalid content"));
            return;
        }
        if (!isBidPayloadValid(responsePayload)) {
            processRequestFail(oc.a.h("BidPayload does not match with AdRequest"));
            return;
        }
        Openrtb responseCache = responsePayload.getResponseCache();
        if (responseCache != null && responseCache != Openrtb.getDefaultInstance()) {
            x4.a(this.adRequestParameters, obtainNetworkAdUnitManager(), responseCache.getResponse(), new c());
            return;
        }
        String responseCacheUrl = responsePayload.getResponseCacheUrl();
        if (TextUtils.isEmpty(responseCacheUrl) || !io.bidmachine.core.h.E(responseCacheUrl)) {
            processRequestFail(oc.a.h("BidPayload does not contain Response or URL"));
        } else {
            retrieveBody(responseCacheUrl);
        }
    }

    void processExpired() {
        log(new qc.b() { // from class: io.bidmachine.j
            @Override // qc.b
            public final Object get() {
                return AdRequest.lambda$processExpired$4();
            }
        });
        this.isRequestExpired.set(true);
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestExpired(this);
            }
        }
        Iterator<AdRequestListener<?>> it2 = b2.e().f().iterator();
        while (it2.hasNext()) {
            it2.next().onRequestExpired(this);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequestExpired, false, getAdsType(), this.adResponse, null);
    }

    void processRequestBuilder(ApiRequest.Builder<Request, Response> builder, String str) {
        if (canSendApiRequest()) {
            builder.url(str);
            this.adResponseLoader.b(this.adRequestParameters, obtainNetworkAdUnitManager(), builder, new d(str, builder));
        }
    }

    void processRequestFail(oc.a aVar) {
        processRequestFail(aVar, true);
    }

    void removeInternalListener(e<SelfType> eVar) {
        List<e<SelfType>> list = this.internalAdRequestListeners;
        if (list == null || eVar == null) {
            return;
        }
        list.remove(eVar);
    }

    public void removeListener(AdRequestListener<SelfType> adRequestListener) {
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list == null || adRequestListener == null) {
            return;
        }
        list.remove(adRequestListener);
    }

    public void request(Context context) {
        if (!b2.e().C()) {
            processRequestFail(oc.a.i("BidMachine not initialized"));
            return;
        }
        if (isDestroyed()) {
            processRequestFail(oc.a.f23338j);
            return;
        }
        oc.a aVarVerifyRequest = verifyRequest();
        if (aVarVerifyRequest != null) {
            processRequestFail(aVarVerifyRequest);
        } else {
            if (isLoading()) {
                return;
            }
            setLoading(true);
            m.b().execute(new b(context.getApplicationContext()));
        }
    }

    void retrieveBody(String str) {
        processRequestBuilder(new ApiRequest.Builder().setMethod(io.bidmachine.core.b.e.Get).setDataBinder(new ApiRequest.ApiResponseAuctionDataBinder()), str);
    }

    void setAdResponse(AdResponse adResponse) {
        this.adResponse = adResponse;
        this.trackingObject.setAdResponse(adResponse);
    }

    void setAuctionUrl(String str) {
        this.auctionUrlQueue.clear();
        this.auctionUrlQueue.add(str);
    }

    public String toString() {
        return this.tag.toString();
    }

    protected oc.a verifyRequest() {
        return null;
    }

    public void notifyMediationLoss(final String str, final Double d10) {
        oc.a aVar;
        if (isCompleted()) {
            log(new qc.b() { // from class: io.bidmachine.i
                @Override // qc.b
                public final Object get() {
                    return AdRequest.lambda$notifyMediationLoss$2(str, d10);
                }
            });
            if (isDestroyed()) {
                aVar = oc.a.f23338j;
            } else {
                aVar = isExpired() ? oc.a.f23337i : null;
            }
            this.trackingObject.eventFinish(TrackEventType.MediationLoss, getAdsType(), new ub.a().k(str).l(d10), aVar);
        }
    }

    void processApiRequestFail(oc.a aVar, boolean z10) {
        if (canProcessApiRequestResult()) {
            setLoading(false);
            this.isApiRequestCompleted.set(true);
            if (aVar == null) {
                aVar = oc.a.f23347s;
            }
            processRequestFail(aVar, z10);
        }
    }

    void processRequestFail(final oc.a aVar, boolean z10) {
        log(new qc.b() { // from class: io.bidmachine.k
            @Override // qc.b
            public final Object get() {
                return AdRequest.lambda$processRequestFail$6(aVar);
            }
        });
        unsubscribeTimeOut();
        if (z10) {
            clearNetworkAdUnits();
        }
        List<AdRequestListener<SelfType>> list = this.adRequestListeners;
        if (list != null) {
            Iterator<AdRequestListener<SelfType>> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRequestFailed(this, aVar);
            }
        }
        Iterator<AdRequestListener<?>> it2 = b2.e().f().iterator();
        while (it2.hasNext()) {
            it2.next().onRequestFailed(this, aVar);
        }
        this.trackingObject.eventFinish(TrackEventType.AuctionRequest, getAdsType(), null, aVar);
    }

    protected void onBeforeSetDisplayPlacementBuilder(Placement.DisplayPlacement.Builder builder) {
    }

    protected void onBeforeSetVideoPlacementBuilder(Placement.VideoPlacement.Builder builder) {
    }

    protected void onBuildPlacement(Placement.Builder builder) {
    }
}
