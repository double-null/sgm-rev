package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import io.bidmachine.ads.networks.mraid.MraidConfig;
import io.bidmachine.ads.networks.nast.NastConfig;
import io.bidmachine.ads.networks.vast.VastConfig;
import io.bidmachine.protobuf.AdNetwork;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkRegistry {
    static final Map<String, NetworkAdapter> NETWORK_ADAPTER_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> CORE_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> FROM_INIT_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> PENDING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> INITIALIZING_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<String, NetworkConfig> INITIALIZED_NETWORK_CONFIG_MAP = new ConcurrentHashMap();
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);
    static final Map<AdsType, Map<String, NetworkConfig>> INITIALIZED_NETWORK_CONFIG_TYPED_MAP = new ConcurrentHashMap(AdsType.values().length);
    private static final AtomicBoolean IS_NETWORKS_INITIALIZING_EXECUTED = new AtomicBoolean(false);
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZING = new AtomicBoolean(false);
    private static final AtomicBoolean IS_CORE_NETWORKS_INITIALIZED = new AtomicBoolean(false);
    private static final Object CORE_INITIALIZING_LOCK = new Object();
    private static final Object INITIALIZING_LOCK = new Object();

    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f16471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f16472b;

        a(Context context, c cVar) {
            this.f16471a = context;
            this.f16472b = cVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            NetworkRegistry.initializeNetworksAwait(this.f16471a);
            c cVar = this.f16472b;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    static final class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Executor f16473g = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Object f16474h = new Object();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final List<b> f16475i = new CopyOnWriteArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContextProvider f16476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InitializationParams f16477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NetworkConfig f16478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f16479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f16480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ub.k f16481f;

        private static class a implements InternalNetworkInitializationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<b> f16482a;

            public a(b bVar) {
                this.f16482a = new WeakReference<>(bVar);
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onFail(NetworkAdapter networkAdapter, String str) {
                b bVar = this.f16482a.get();
                if (bVar != null) {
                    bVar.h(str);
                }
            }

            @Override // io.bidmachine.InternalNetworkInitializationCallback
            public void onSuccess(NetworkAdapter networkAdapter) {
                b bVar = this.f16482a.get();
                if (bVar != null) {
                    bVar.i(networkAdapter);
                }
            }
        }

        /* synthetic */ b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar, a aVar) {
            this(contextProvider, initializationParams, networkConfig, cVar);
        }

        private void d(Map<AdsType, Map<String, NetworkConfig>> map, AdsType adsType, String str, NetworkConfig networkConfig) {
            Map<String, NetworkConfig> concurrentHashMap = map.get(adsType);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                map.put(adsType, concurrentHashMap);
            }
            concurrentHashMap.put(str, networkConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(String str) {
            return String.format("Initialization error: %s", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(NetworkAdapter networkAdapter) {
            return String.format("Initialization completed: %s, %s", networkAdapter.obtainNetworkSdkVersion(), networkAdapter.getAdapterVersion());
        }

        void e() {
            f16475i.add(this);
            try {
                f16473g.execute(this);
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
                h("Exception creating network initialization task");
            }
        }

        void h(final String str) {
            io.bidmachine.core.a.e(this.f16480e, new qc.b() { // from class: io.bidmachine.s4
                @Override // qc.b
                public final Object get() {
                    return NetworkRegistry.b.f(str);
                }
            });
            this.f16481f.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new ub.a().k(this.f16480e), oc.a.c(str));
            f16475i.remove(this);
        }

        void i(final NetworkAdapter networkAdapter) {
            io.bidmachine.core.a.b(this.f16480e, new qc.b() { // from class: io.bidmachine.t4
                @Override // qc.b
                public final Object get() {
                    return NetworkRegistry.b.g(networkAdapter);
                }
            });
            if (networkAdapter instanceof HeaderBiddingAdapter) {
                this.f16481f.eventFinish(TrackEventType.HeaderBiddingNetworkInitialize, null, new ub.a().k(this.f16480e), null);
            } else {
                this.f16481f.clearEvent(TrackEventType.HeaderBiddingNetworkInitialize);
            }
            f16475i.remove(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            io.bidmachine.core.a.a(this.f16480e, "Initialization started");
            try {
                this.f16481f.eventStart(TrackEventType.HeaderBiddingNetworkInitialize, new ub.j().e("HB_NETWORK", this.f16480e));
                NetworkAdapter networkAdapterObtainAdapter = NetworkRegistry.obtainAdapter(this.f16478c);
                networkAdapterObtainAdapter.setLogging(io.bidmachine.core.a.h());
                networkAdapterObtainAdapter.initialize(this.f16476a, this.f16477b, this.f16478c.getNetworkConfigParams(), new a(this));
                Map<String, NetworkConfig> map = NetworkRegistry.INITIALIZED_NETWORK_CONFIG_MAP;
                if (!map.containsKey(this.f16480e)) {
                    map.put(this.f16480e, this.f16478c);
                }
                for (AdsType adsType : this.f16478c.getSupportedAdsTypes(networkAdapterObtainAdapter)) {
                    synchronized (f16474h) {
                        if (NetworkRegistry.CORE_NETWORK_CONFIG_MAP.containsKey(this.f16480e)) {
                            d(NetworkRegistry.INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP, adsType, this.f16480e, this.f16478c);
                        }
                        d(NetworkRegistry.INITIALIZED_NETWORK_CONFIG_TYPED_MAP, adsType, this.f16480e, this.f16478c);
                    }
                }
                NetworkRegistry.PENDING_NETWORK_CONFIG_MAP.remove(this.f16480e);
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
                h("Network initialization exception");
            }
            c cVar = this.f16479d;
            if (cVar != null) {
                cVar.a();
            }
        }

        private b(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar) {
            this.f16476a = contextProvider;
            this.f16477b = initializationParams;
            this.f16478c = networkConfig;
            this.f16479d = cVar;
            String networkKey = networkConfig.getNetworkKey();
            this.f16480e = networkKey;
            this.f16481f = new BidMachineTrackingObject(networkKey + "_initialize");
        }
    }

    interface c {
        void a();
    }

    static String checkAndPutNetwork(Context context, AdsType adsType, NetworkConfig networkConfig, Map<String, NetworkConfig> map) {
        NetworkAdapter adapter = getAdapter(networkConfig.getNetworkKey());
        if (adapter == null) {
            return "Network not registered";
        }
        if (!adapter.isAdsTypeSupported(adsType)) {
            return "Network does not support this ad type";
        }
        if (!adapter.isInitialized(context)) {
            return "Network not initialized";
        }
        map.put(networkConfig.getNetworkKey(), networkConfig);
        return null;
    }

    static Map<String, NetworkConfig> copyOrNullInitializedCoreNetworkConfigs(AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    static Map<String, NetworkConfig> copyOrNullInitializedNetworkConfigs(AdsType adsType) {
        Map<String, NetworkConfig> map = INITIALIZED_NETWORK_CONFIG_TYPED_MAP.get(adsType);
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    static Map<String, NetworkConfig> createInitNetworkConfigMap() {
        return new HashMap(FROM_INIT_NETWORK_CONFIG_MAP);
    }

    public static NetworkAdapter getAdapter(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return NETWORK_ADAPTER_MAP.get(str);
    }

    static NetworkConfig getConfig(String str) {
        if (str == null) {
            return null;
        }
        return INITIALIZED_NETWORK_CONFIG_MAP.get(str);
    }

    static Collection<NetworkConfig> getCoreNetworkConfigList() {
        return CORE_NETWORK_CONFIG_MAP.values();
    }

    static Collection<NetworkConfig> getPendingNetworkConfigList() {
        return PENDING_NETWORK_CONFIG_MAP.values();
    }

    private static void initializeNetwork(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfig networkConfig, c cVar) {
        synchronized (INITIALIZING_LOCK) {
            String networkKey = networkConfig.getNetworkKey();
            Map<String, NetworkConfig> map = INITIALIZING_NETWORK_CONFIG_MAP;
            if (!map.containsKey(networkKey)) {
                map.put(networkKey, networkConfig);
                new b(contextProvider, initializationParams, networkConfig, cVar, null).e();
            } else {
                PENDING_NETWORK_CONFIG_MAP.remove(networkKey);
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    static void initializeNetworksAsync(Context context, c cVar) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            new a(context.getApplicationContext(), cVar).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initializeNetworksAwait(Context context) {
        initializeNetworksAwait(context, getPendingNetworkConfigList());
    }

    static void initializeNetworksSync(Context context) {
        if (IS_NETWORKS_INITIALIZING_EXECUTED.compareAndSet(false, true)) {
            initializeNetworksAwait(context.getApplicationContext());
        }
    }

    static boolean isNetworkRegistered(String str) {
        return getAdapter(str) != null;
    }

    static boolean isNetworksInitializingExecuted() {
        return IS_NETWORKS_INITIALIZING_EXECUTED.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$0(NetworkRegistryCallback networkRegistryCallback) {
        if (networkRegistryCallback != null) {
            networkRegistryCallback.onRegistered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerNetworks$1(Context context, String str, final NetworkRegistryCallback networkRegistryCallback) throws Throwable {
        registerNetworks(context, str);
        io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.r4
            @Override // java.lang.Runnable
            public final void run() {
                NetworkRegistry.lambda$registerNetworks$0(networkRegistryCallback);
            }
        });
    }

    static NetworkAdapter obtainAdapter(NetworkConfig networkConfig) {
        synchronized (NetworkRegistry.class) {
            String networkKey = networkConfig.getNetworkKey();
            NetworkAdapter adapter = getAdapter(networkKey);
            if (adapter != null) {
                return adapter;
            }
            NetworkAdapter networkAdapterCreateNetworkAdapter = networkConfig.createNetworkAdapter();
            NETWORK_ADAPTER_MAP.put(networkKey, networkAdapterCreateNetworkAdapter);
            return networkAdapterCreateNetworkAdapter;
        }
    }

    static void registerAndInitializeCoreNetworks(Context context) {
        AtomicBoolean atomicBoolean = IS_CORE_NETWORKS_INITIALIZED;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (CORE_INITIALIZING_LOCK) {
            if (IS_CORE_NETWORKS_INITIALIZING.compareAndSet(false, true)) {
                registerCoreNetworks();
                initializeNetworksAwait(context, getCoreNetworkConfigList());
                atomicBoolean.set(true);
            }
        }
    }

    static void registerCoreNetwork(NetworkConfig networkConfig) {
        String networkKey = networkConfig.getNetworkKey();
        Map<String, NetworkConfig> map = CORE_NETWORK_CONFIG_MAP;
        if (map.containsKey(networkKey)) {
            return;
        }
        map.put(networkKey, networkConfig);
        registerNetwork(networkConfig);
    }

    static void registerCoreNetworks() {
        MraidConfig mraidConfig = new MraidConfig();
        AdsFormat adsFormat = AdsFormat.Banner;
        registerCoreNetwork(mraidConfig.withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.InterstitialStatic, new HashMap()).withMediationConfig(AdsFormat.RewardedStatic, new HashMap()));
        registerCoreNetwork(new VastConfig().withMediationConfig(AdsFormat.InterstitialVideo, new HashMap()).withMediationConfig(AdsFormat.RewardedVideo, new HashMap()));
        registerCoreNetwork(new NastConfig().withMediationConfig(AdsFormat.Native, new HashMap()));
        registerCoreNetwork(new AdaptiveRenderingConfig().withMediationConfig(adsFormat, new HashMap()).withMediationConfig(AdsFormat.Interstitial, new HashMap()).withMediationConfig(AdsFormat.Rewarded, new HashMap()));
    }

    static void registerInitNetwork(Context context, AdNetwork adNetwork) {
        NetworkConfig networkConfigF;
        if (isNetworkRegistered(adNetwork.getName()) || (networkConfigF = o4.f(context, adNetwork)) == null) {
            return;
        }
        FROM_INIT_NETWORK_CONFIG_MAP.put(networkConfigF.getNetworkKey(), networkConfigF);
        registerNetwork(networkConfigF);
    }

    static void registerNetwork(NetworkConfig networkConfig) {
        b2 b2VarE;
        Context contextG;
        if (networkConfig == null || isNetworkRegistered(networkConfig.getNetworkKey())) {
            return;
        }
        obtainAdapter(networkConfig);
        PENDING_NETWORK_CONFIG_MAP.put(networkConfig.getNetworkKey(), networkConfig);
        if (!isNetworksInitializingExecuted() || (contextG = (b2VarE = b2.e()).g()) == null) {
            return;
        }
        initializeNetwork(new SimpleContextProvider(contextG), new c4(b2VarE.u(), b2VarE.w()), networkConfig, null);
    }

    static void registerNetworks(NetworkConfig... networkConfigArr) {
        if (networkConfigArr == null) {
            return;
        }
        for (NetworkConfig networkConfig : networkConfigArr) {
            registerNetwork(networkConfig);
        }
    }

    static void reset() {
        NETWORK_ADAPTER_MAP.clear();
        CORE_NETWORK_CONFIG_MAP.clear();
        FROM_INIT_NETWORK_CONFIG_MAP.clear();
        PENDING_NETWORK_CONFIG_MAP.clear();
        INITIALIZING_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_MAP.clear();
        INITIALIZED_CORE_NETWORK_CONFIG_TYPED_MAP.clear();
        INITIALIZED_NETWORK_CONFIG_TYPED_MAP.clear();
        IS_NETWORKS_INITIALIZING_EXECUTED.set(false);
        IS_CORE_NETWORKS_INITIALIZING.set(false);
        IS_CORE_NETWORKS_INITIALIZED.set(false);
        b.f16475i.clear();
    }

    static void setLoggingEnabled(boolean z10) {
        Iterator<Map.Entry<String, NetworkAdapter>> it = NETWORK_ADAPTER_MAP.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().setLogging(z10);
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
    }

    private static void initializeNetworksAwait(Context context, Collection<NetworkConfig> collection) {
        b2 b2VarE = b2.e();
        initializeNetworksAwait(new SimpleContextProvider(context), new c4(b2VarE.u(), b2VarE.w()), collection);
    }

    static void registerNetworks(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                NetworkConfig networkConfigH = o4.h(context, jSONArray.getJSONObject(i10));
                if (networkConfigH != null) {
                    registerNetwork(networkConfigH);
                }
            }
        } catch (JSONException e10) {
            io.bidmachine.core.a.o(e10);
        }
    }

    private static void initializeNetworksAwait(ContextProvider contextProvider, InitializationParams initializationParams, Collection<NetworkConfig> collection) {
        if (collection.isEmpty()) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(collection.size());
        Iterator<NetworkConfig> it = collection.iterator();
        while (it.hasNext()) {
            initializeNetwork(contextProvider, initializationParams, it.next(), new c() { // from class: io.bidmachine.q4
                @Override // io.bidmachine.NetworkRegistry.c
                public final void a() {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            io.bidmachine.core.a.o(e10);
        }
    }

    static void registerNetworks(final Context context, final String str, final NetworkRegistryCallback networkRegistryCallback) {
        o2.a().execute(new q7.a() { // from class: io.bidmachine.p4
            @Override // oc.o
            public final void p() throws Throwable {
                NetworkRegistry.lambda$registerNetworks$1(context, str, networkRegistryCallback);
            }
        });
    }
}
