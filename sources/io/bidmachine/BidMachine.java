package io.bidmachine;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "3.6.1";

    @Deprecated
    public static String getBidToken(Context context, AdsFormat adsFormat) {
        return getBidToken(context, new AdPlacementConfig.Builder(adsFormat.toAdFormat()).build());
    }

    public static Object getExtrasParam(Context context, String str) {
        return ExtraParamsManager.get().getPublic(context, str);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    public static boolean isInitialized() {
        return b2.e().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getBidToken$8(String str) {
        return String.format("getBidToken - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBidToken$9(BidTokenCallback bidTokenCallback, Context context, AdPlacementConfig adPlacementConfig) {
        bidTokenCallback.onCollected(getBidToken(context, adPlacementConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$initialize$0(String str) {
        return String.format("initialize - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setConsentConfig$3(boolean z10, String str) {
        return String.format("setConsentConfig - %s, %s", Boolean.valueOf(z10), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setCoppa$5(Boolean bool) {
        return String.format("setCoppa - %s", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$1(String str) {
        return String.format("setEndpoint - %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setGPP$7(String str, List list) {
        return String.format("setGPP - %s, [%s]", str, io.bidmachine.core.h.K(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setSubjectToGDPR$4(Boolean bool) {
        return String.format("setSubjectToGDPR - %s", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setTestMode$2(boolean z10) {
        return String.format("setTestMode - %s", Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setUSPrivacyString$6(String str) {
        return String.format("setUSPrivacyString - %s", str);
    }

    public static void registerAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        io.bidmachine.core.a.a("BidMachine", "registerAdRequestListener");
        b2.e().N(adRequestListener);
    }

    public static void registerNetworks(NetworkConfig... networkConfigArr) {
        io.bidmachine.core.a.a("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    public static void setConsentConfig(final boolean z10, final String str) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.z0
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$setConsentConfig$3(z10, str);
            }
        });
        b2.e().w().r(z10, str);
    }

    public static void setCoppa(final Boolean bool) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.y0
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$setCoppa$5(bool);
            }
        });
        b2.e().w().s(bool);
    }

    public static void setEndpoint(final String str) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.b1
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$setEndpoint$1(str);
            }
        });
        UrlProvider.setEndpoint(str);
    }

    public static void setGPP(final String str, final List<Integer> list) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.x0
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$setGPP$7(str, list);
            }
        });
        b2.e().w().t(str, list);
    }

    public static void setLoggingEnabled(boolean z10) {
        if (Debugger.isLoggingLock()) {
            io.bidmachine.core.a.a("BidMachine", "setLoggingEnabled skipped");
            return;
        }
        if (z10) {
            io.bidmachine.core.a.j(true);
            io.bidmachine.core.a.a("BidMachine", "setLoggingEnabled - true");
        } else {
            io.bidmachine.core.a.a("BidMachine", "setLoggingEnabled - false");
            io.bidmachine.core.a.j(false);
        }
        NetworkRegistry.setLoggingEnabled(z10);
    }

    public static void setPublisher(Publisher publisher) {
        io.bidmachine.core.a.a("BidMachine", "setPublisher");
        b2.e().P(publisher);
    }

    public static void setSubjectToGDPR(final Boolean bool) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.c1
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$setSubjectToGDPR$4(bool);
            }
        });
        b2.e().w().u(bool);
    }

    public static void setTargetingParams(TargetingParams targetingParams) {
        io.bidmachine.core.a.a("BidMachine", "setTargetingParams");
        b2.e().Q(targetingParams);
    }

    public static void setTestMode(final boolean z10) {
        if (Debugger.isTestModeLock()) {
            io.bidmachine.core.a.a("BidMachine", "setTestMode skipped");
        } else {
            io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.a1
                @Override // qc.b
                public final Object get() {
                    return BidMachine.lambda$setTestMode$2(z10);
                }
            });
            b2.e().R(z10);
        }
    }

    public static void setUSPrivacyString(final String str) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.v0
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$setUSPrivacyString$6(str);
            }
        });
        b2.e().w().v(str);
    }

    public static void unregisterAdRequestListener(AdRequest.AdRequestListener<?> adRequestListener) {
        io.bidmachine.core.a.a("BidMachine", "unregisterAdRequestListener");
        b2.e().S(adRequestListener);
    }

    public static String getBidToken(Context context, AdPlacementConfig adPlacementConfig) {
        final String strF = l2.f(context.getApplicationContext(), adPlacementConfig);
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.e1
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$getBidToken$8(strF);
            }
        });
        return strF;
    }

    public static void initialize(Context context, final String str, InitializationCallback initializationCallback) {
        io.bidmachine.core.a.b("BidMachine", new qc.b() { // from class: io.bidmachine.d1
            @Override // qc.b
            public final Object get() {
                return BidMachine.lambda$initialize$0(str);
            }
        });
        b2.e().y(context, str, initializationCallback);
    }

    public static void registerNetworks(Context context, String str) {
        io.bidmachine.core.a.a("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    @Deprecated
    public static void getBidToken(Context context, AdsFormat adsFormat, BidTokenCallback bidTokenCallback) {
        getBidToken(context, new AdPlacementConfig.Builder(adsFormat.toAdFormat()).build(), bidTokenCallback);
    }

    public static void getBidToken(Context context, final AdPlacementConfig adPlacementConfig, final BidTokenCallback bidTokenCallback) {
        final Context applicationContext = context.getApplicationContext();
        BidTokenTaskManager.execute(new Runnable() { // from class: io.bidmachine.w0
            @Override // java.lang.Runnable
            public final void run() {
                BidMachine.lambda$getBidToken$9(bidTokenCallback, applicationContext, adPlacementConfig);
            }
        });
    }

    public static void registerNetworks(Context context, String str, NetworkRegistryCallback networkRegistryCallback) {
        io.bidmachine.core.a.a("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str, networkRegistryCallback);
    }
}
