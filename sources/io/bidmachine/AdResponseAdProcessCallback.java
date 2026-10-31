package io.bidmachine;

import c0.IbU.elEbP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdResponseAdProcessCallback implements AdProcessCallback {
    private final Map<AdProcessCallback, Boolean> adProcessCallbackMap;
    private volatile boolean isFinished;
    private final AtomicBoolean isLoadTracked;
    private final AtomicBoolean isLoaded;
    private final AtomicBoolean isLoading;
    private final AtomicBoolean isResultShownTracked;
    private final AtomicBoolean isShownTracked;
    private final AtomicBoolean isVisibilityTrackerShownTracked;
    private final Object mutexCallback;
    private final Set<TrackEventType> trackedEvents;
    public volatile io.bidmachine.core.j visibilitySource;
    private final WeakReference<AdResponse> weakAdResponse;

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.bidmachine.core.j.values().length];
            try {
                iArr[io.bidmachine.core.j.BidMachine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[io.bidmachine.core.j.Network.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[io.bidmachine.core.j.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class a extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f16384d = new a();

        a() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processClickVerified();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class b extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f16385d = new b();

        b() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processClosed();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class c extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f16386d = new c();

        c() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processDestroy();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class d extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f16387d = new d();

        d() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processExpired();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class e extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f16388d = new e();

        e() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processFillAd();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class f extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f16389d = new f();

        f() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processFinished();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class g extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ oc.a f16390d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(oc.a aVar) {
            super(1);
            this.f16390d = aVar;
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processLoadFail(this.f16390d);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class h extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f16391d = new h();

        h() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processLoadSuccess();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class i extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f16392d = new i();

        i() {
            super(1);
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processShown();
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class j extends kotlin.jvm.internal.u implements id.l<AdProcessCallback, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ oc.a f16393d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(oc.a aVar) {
            super(1);
            this.f16393d = aVar;
        }

        public final void b(AdProcessCallback it) {
            kotlin.jvm.internal.t.f(it, "it");
            it.processShowFail(this.f16393d);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdProcessCallback adProcessCallback) {
            b(adProcessCallback);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AdResponseAdProcessCallback.kt */
    static final class k extends kotlin.jvm.internal.u implements id.l<AdResponse, wc.g0> {
        k() {
            super(1);
        }

        public final void b(AdResponse it) {
            kotlin.jvm.internal.t.f(it, "it");
            Set set = AdResponseAdProcessCallback.this.trackedEvents;
            TrackEventType trackEventType = TrackEventType.Show;
            if (set.add(trackEventType)) {
                it.eventFinish(trackEventType, true);
            }
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(AdResponse adResponse) {
            b(adResponse);
            return wc.g0.f27756a;
        }
    }

    public AdResponseAdProcessCallback(AdResponse adResponse) {
        kotlin.jvm.internal.t.f(adResponse, "adResponse");
        this.weakAdResponse = new WeakReference<>(adResponse);
        this.adProcessCallbackMap = new WeakHashMap();
        this.mutexCallback = new Object();
        this.isLoaded = new AtomicBoolean(false);
        this.isLoading = new AtomicBoolean(false);
        this.isLoadTracked = new AtomicBoolean(false);
        this.isShownTracked = new AtomicBoolean(false);
        this.isVisibilityTrackerShownTracked = new AtomicBoolean(false);
        this.isResultShownTracked = new AtomicBoolean(false);
        this.trackedEvents = new CopyOnWriteArraySet();
        this.visibilitySource = io.bidmachine.core.j.Network;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBrokenCreativeEvent$lambda$22$lambda$21(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "onBrokenCreativeEvent - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processClickVerified$lambda$12$lambda$11(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processClickVerified - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processClosed$lambda$16$lambda$15(AdResponseAdProcessCallback this$0, AdResponse it) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        kotlin.jvm.internal.t.f(it, "$it");
        return "processClosed (" + this$0.isFinished + ") - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processDestroy$lambda$20$lambda$19(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processDestroy - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processExpired$lambda$18$lambda$17(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processExpired - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFillAd$lambda$5$lambda$4(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processFillAd - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFinished$lambda$14$lambda$13(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processFinished - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processLoadFail$lambda$3$lambda$2(oc.a bmError) {
        kotlin.jvm.internal.t.f(bmError, "$bmError");
        return "processLoadFail - " + bmError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processLoadSuccess$lambda$1$lambda$0(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processLoadSuccess - " + it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void processResultShown$default(AdResponseAdProcessCallback adResponseAdProcessCallback, id.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        adResponseAdProcessCallback.processResultShown(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processResultShown$lambda$9$lambda$8(AdResponse it) {
        kotlin.jvm.internal.t.f(it, "$it");
        return "processShown - " + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processShowFail$lambda$7$lambda$6(oc.a bmError) {
        kotlin.jvm.internal.t.f(bmError, "$bmError");
        return "processShowFail - " + bmError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$23(int i10, AdResponse adResponse) {
        kotlin.jvm.internal.t.f(adResponse, "$adResponse");
        return "processViewabilityEvent (Unknown action code - " + i10 + ") - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$24(mc.a actionEvent, oc.a aVar) {
        kotlin.jvm.internal.t.f(actionEvent, "$actionEvent");
        return "processViewabilityEvent (" + actionEvent + "), error - " + aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$25(mc.a actionEvent, AdResponse adResponse) {
        kotlin.jvm.internal.t.f(actionEvent, "$actionEvent");
        kotlin.jvm.internal.t.f(adResponse, "$adResponse");
        return "processViewabilityEvent (" + actionEvent + ") - " + adResponse;
    }

    public final void appendCallback(AdProcessCallback adProcessCallback) {
        kotlin.jvm.internal.t.f(adProcessCallback, "adProcessCallback");
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.put(adProcessCallback, Boolean.TRUE);
        }
    }

    public final boolean canSendShownCallback() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.visibilitySource.ordinal()];
        if (i10 == 1) {
            return isBidMachineShowTracked();
        }
        if (i10 == 2) {
            return isNetworkShowTracked();
        }
        if (i10 == 3) {
            return isBidMachineShowTracked() && isNetworkShowTracked();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void destroy() {
        this.weakAdResponse.clear();
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.clear();
            wc.g0 g0Var = wc.g0.f27756a;
        }
    }

    public final void executeOnCallback(id.l<? super AdProcessCallback, wc.g0> action) {
        kotlin.jvm.internal.t.f(action, "action");
        synchronized (this.mutexCallback) {
            for (AdProcessCallback adProcessCallback : new ArrayList(this.adProcessCallbackMap.keySet())) {
                kotlin.jvm.internal.t.e(adProcessCallback, "adProcessCallback");
                action.invoke(adProcessCallback);
            }
            wc.g0 g0Var = wc.g0.f27756a;
        }
    }

    public final Map<AdProcessCallback, Boolean> getAdProcessCallbackMap() {
        return this.adProcessCallbackMap;
    }

    public final AdResponse getAdResponse() {
        return this.weakAdResponse.get();
    }

    public final boolean isBidMachineShowTracked() {
        return this.isVisibilityTrackerShownTracked.get();
    }

    public final boolean isLoaded() {
        return this.isLoaded.get();
    }

    public final boolean isLoading() {
        return this.isLoading.get();
    }

    public final boolean isNetworkShowTracked() {
        return this.isShownTracked.get();
    }

    public final boolean isShownTracked() {
        return this.isResultShownTracked.get();
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(Map<String, ? extends Object> map) {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.b0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.onBrokenCreativeEvent$lambda$22$lambda$21(adResponse);
                }
            });
            adResponse.eventFinish(TrackEventType.BrokenCreativeDetector, false, (Map<String, Object>) map);
        }
    }

    public final boolean onLoading() {
        return this.isLoading.compareAndSet(false, true);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onNetworkViewabilityEvent(mc.a actionEvent, oc.a aVar) {
        kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
        processViewabilityEvent(actionEvent, aVar);
        if (actionEvent.b() && aVar == null) {
            processNetworkVisibilityEventShown();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClickVerified() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.d0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processClickVerified$lambda$12$lambda$11(adResponse);
                }
            });
            adResponse.processClickVerified();
        }
        executeOnCallback(a.f16384d);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked() {
        AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            processClickVerified();
        } else if (adResponse.processClicked()) {
            processClickVerified();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.c0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processClosed$lambda$16$lambda$15(this.f17520a, adResponse);
                }
            });
            adResponse.processClosed(this.isFinished);
        }
        executeOnCallback(b.f16385d);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
        executeOnCallback(c.f16386d);
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.e0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processDestroy$lambda$20$lambda$19(adResponse);
                }
            });
            adResponse.destroy();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.h0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processExpired$lambda$18$lambda$17(adResponse);
                }
            });
            adResponse.processExpired();
        } else {
            adResponse = null;
        }
        executeOnCallback(d.f16387d);
        if (adResponse != null) {
            adResponse.notifyExpired(false);
        }
        processDestroy();
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.f0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processFillAd$lambda$5$lambda$4(adResponse);
                }
            });
            adResponse.processFillAd();
        }
        executeOnCallback(e.f16388d);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
        final AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.a0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processFinished$lambda$14$lambda$13(adResponse);
                }
            });
            adResponse.processFinished();
            this.isFinished = true;
        }
        executeOnCallback(f.f16389d);
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(final oc.a bmError) {
        kotlin.jvm.internal.t.f(bmError, "bmError");
        if (this.isLoadTracked.compareAndSet(false, true)) {
            this.isLoaded.set(false);
            this.isLoading.set(false);
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.y
                    @Override // qc.b
                    public final Object get() {
                        return AdResponseAdProcessCallback.processLoadFail$lambda$3$lambda$2(bmError);
                    }
                });
                adResponse.processLoadFail(bmError);
            }
            executeOnCallback(new g(bmError));
            processDestroy();
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
        if (this.isLoadTracked.compareAndSet(false, true)) {
            this.isLoaded.set(true);
            this.isLoading.set(false);
            final AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.g0
                    @Override // qc.b
                    public final Object get() {
                        return AdResponseAdProcessCallback.processLoadSuccess$lambda$1$lambda$0(adResponse);
                    }
                });
                adResponse.processLoadSuccess();
            }
            UserAgentManager.updateWebViewUserAgent();
            executeOnCallback(h.f16391d);
        }
    }

    public final void processNetworkVisibilityEventShown() {
        if (this.isShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown$default(this, null, 1, null);
        }
    }

    public final void processResultShown(id.l<? super AdResponse, wc.g0> lVar) {
        if (this.isResultShownTracked.compareAndSet(false, true)) {
            final AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.z
                    @Override // qc.b
                    public final Object get() {
                        return AdResponseAdProcessCallback.processResultShown$lambda$9$lambda$8(adResponse);
                    }
                });
                adResponse.processShown();
                if (lVar != null) {
                    lVar.invoke(adResponse);
                }
            }
            executeOnCallback(i.f16392d);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(final oc.a bmError) {
        kotlin.jvm.internal.t.f(bmError, "bmError");
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.w
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processShowFail$lambda$7$lambda$6(bmError);
                }
            });
            adResponse.processShowFail(bmError);
        }
        executeOnCallback(new j(bmError));
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
        if (this.isShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown(new k());
        }
    }

    public final void processViewabilityEvent(final mc.a actionEvent, final oc.a aVar) {
        kotlin.jvm.internal.t.f(actionEvent, "actionEvent");
        final AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            return;
        }
        final int iA = actionEvent.a();
        TrackEventType trackEventTypeFromNumber = TrackEventType.fromNumber(iA);
        if (trackEventTypeFromNumber == null) {
            io.bidmachine.core.a.e(adResponse.tag, new qc.b() { // from class: io.bidmachine.i0
                @Override // qc.b
                public final Object get() {
                    return AdResponseAdProcessCallback.processViewabilityEvent$lambda$23(iA, adResponse);
                }
            });
        } else if (this.trackedEvents.add(trackEventTypeFromNumber)) {
            if (aVar != null) {
                io.bidmachine.core.a.e(adResponse.tag, new qc.b() { // from class: io.bidmachine.j0
                    @Override // qc.b
                    public final Object get() {
                        return AdResponseAdProcessCallback.processViewabilityEvent$lambda$24(actionEvent, aVar);
                    }
                });
            } else {
                io.bidmachine.core.a.b(adResponse.tag, new qc.b() { // from class: io.bidmachine.x
                    @Override // qc.b
                    public final Object get() {
                        return AdResponseAdProcessCallback.processViewabilityEvent$lambda$25(actionEvent, adResponse);
                    }
                });
            }
            adResponse.eventFinish(trackEventTypeFromNumber, actionEvent.b(), aVar);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerShown() {
        if (this.isVisibilityTrackerShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown$default(this, null, 1, null);
        }
    }

    public final void removeCallback(AdProcessCallback adProcessCallback) {
        kotlin.jvm.internal.t.f(adProcessCallback, "adProcessCallback");
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.remove(adProcessCallback);
        }
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(io.bidmachine.core.j visibilitySource) {
        kotlin.jvm.internal.t.f(visibilitySource, "visibilitySource");
        this.visibilitySource = visibilitySource;
    }

    @Override // io.bidmachine.AdProcessCallback
    public void onVisibilityTrackerViewabilityEvent(mc.a aVar, oc.a aVar2) {
        kotlin.jvm.internal.t.f(aVar, elEbP.VTPIjr);
        processViewabilityEvent(aVar, aVar2);
        if (aVar.b() && aVar2 == null) {
            processVisibilityTrackerShown();
        }
    }
}
