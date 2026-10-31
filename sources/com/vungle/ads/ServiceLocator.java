package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.locale.LocaleInfo;
import com.vungle.ads.internal.locale.SystemLocaleInfo;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.task.JobCreator;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.JobRunnerThreadPriorityHelper;
import com.vungle.ads.internal.task.VungleJobCreator;
import com.vungle.ads.internal.task.VungleJobRunner;
import com.vungle.ads.internal.util.ConcurrencyTimeoutProvider;
import com.vungle.ads.internal.util.PathProvider;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: ServiceLocator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceLocator {
    public static final Companion Companion = new Companion(null);
    private static volatile ServiceLocator INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, Creator<?>> creators;
    private final Context ctx;

    /* JADX INFO: compiled from: ServiceLocator.kt */
    private abstract class Creator<T> {
        private final boolean isSingleton;

        public Creator(boolean z10) {
            this.isSingleton = z10;
        }

        public abstract T create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }

        public /* synthetic */ Creator(ServiceLocator serviceLocator, boolean z10, int i10, k kVar) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    public /* synthetic */ ServiceLocator(Context context, k kVar) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(JobCreator.class, new Creator<JobCreator>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.1
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobCreator create() {
                return new VungleJobCreator(ServiceLocator.this.ctx, (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class));
            }
        });
        this.creators.put(JobRunner.class, new Creator<JobRunner>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.2
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobRunner create() {
                return new VungleJobRunner((JobCreator) ServiceLocator.this.getOrBuild(JobCreator.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getJobExecutor(), new JobRunnerThreadPriorityHelper());
            }
        });
        this.creators.put(VungleApiClient.class, new Creator<VungleApiClient>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.3
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public VungleApiClient create() {
                return new VungleApiClient(ServiceLocator.this.ctx, (Platform) ServiceLocator.this.getOrBuild(Platform.class), (FilePreferences) ServiceLocator.this.getOrBuild(FilePreferences.class));
            }
        });
        this.creators.put(Platform.class, new Creator<Platform>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.4
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Platform create() {
                return new AndroidPlatform(ServiceLocator.this.ctx, ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getUaExecutor(), null, null, 12, null);
            }
        });
        this.creators.put(Executors.class, new Creator<Executors>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.5
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Executors create() {
                return new SDKExecutors();
            }
        });
        this.creators.put(OMInjector.class, new Creator<OMInjector>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.6
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMInjector create() {
                return new OMInjector(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(OMTracker.Factory.class, new Creator<OMTracker.Factory>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.7
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMTracker.Factory create() {
                return new OMTracker.Factory();
            }
        });
        this.creators.put(FilePreferences.class, new Creator<FilePreferences>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.8
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public FilePreferences create() {
                return FilePreferences.Companion.get$default(FilePreferences.Companion, ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getIoExecutor(), (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class), null, 4, null);
            }
        });
        this.creators.put(LocaleInfo.class, new Creator<LocaleInfo>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.9
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public LocaleInfo create() {
                return new SystemLocaleInfo();
            }
        });
        this.creators.put(BidTokenEncoder.class, new Creator<BidTokenEncoder>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.10
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public BidTokenEncoder create() {
                return new BidTokenEncoder(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(PathProvider.class, new Creator<PathProvider>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.11
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public PathProvider create() {
                return new PathProvider(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(Downloader.class, new Creator<Downloader>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.12
            {
                super(false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Downloader create() {
                return new AssetDownloader(((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getDownloaderExecutor(), (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class));
            }
        });
        this.creators.put(ConcurrencyTimeoutProvider.class, new Creator<ConcurrencyTimeoutProvider>(this) { // from class: com.vungle.ads.ServiceLocator.buildCreators.13
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public ConcurrencyTimeoutProvider create() {
                return new ConcurrencyTimeoutProvider();
            }
        });
        this.creators.put(SignalManager.class, new Creator<SignalManager>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.14
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public SignalManager create() {
                return new SignalManager(ServiceLocator.this.ctx);
            }
        });
        this.creators.put(TpatSender.class, new Creator<TpatSender>() { // from class: com.vungle.ads.ServiceLocator.buildCreators.15
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public TpatSender create() {
                return new TpatSender((VungleApiClient) ServiceLocator.this.getOrBuild(VungleApiClient.class), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getIoExecutor(), ((Executors) ServiceLocator.this.getOrBuild(Executors.class)).getJobExecutor(), (PathProvider) ServiceLocator.this.getOrBuild(PathProvider.class), (SignalManager) ServiceLocator.this.getOrBuild(SignalManager.class));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t10 = (T) this.cache.get(serviceClass);
        if (t10 != null) {
            return t10;
        }
        Creator<?> creator = this.creators.get(serviceClass);
        if (creator == null) {
            throw new IllegalArgumentException("Unknown class");
        }
        T t11 = (T) creator.create();
        if (creator.isSingleton()) {
            this.cache.put(serviceClass, t11);
        }
        return t11;
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public final <T> void bindService$vungle_ads_release(Class<?> serviceClass, T t10) {
        t.f(serviceClass, "serviceClass");
        this.cache.put(serviceClass, t10);
    }

    public final synchronized <T> T getService(Class<T> serviceClass) {
        t.f(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(Class<T> serviceClass) {
        t.f(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    private ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        t.e(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }

    /* JADX INFO: compiled from: ServiceLocator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }

        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        public final ServiceLocator getInstance(Context context) {
            t.f(context, "context");
            ServiceLocator iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
            if (iNSTANCE$vungle_ads_release == null) {
                synchronized (this) {
                    Companion companion = ServiceLocator.Companion;
                    ServiceLocator iNSTANCE$vungle_ads_release2 = companion.getINSTANCE$vungle_ads_release();
                    if (iNSTANCE$vungle_ads_release2 == null) {
                        iNSTANCE$vungle_ads_release2 = new ServiceLocator(context, null);
                        companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release2);
                    }
                    iNSTANCE$vungle_ads_release = iNSTANCE$vungle_ads_release2;
                }
            }
            return iNSTANCE$vungle_ads_release;
        }

        public final /* synthetic */ <T> wc.k<T> inject(Context context) {
            t.f(context, "context");
            o oVar = o.SYNCHRONIZED;
            t.j();
            return m.b(oVar, new ServiceLocator$Companion$inject$1(context));
        }

        public final void setINSTANCE$vungle_ads_release(ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }

        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }
    }
}
