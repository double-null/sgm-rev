package com.vungle.ads.internal.network;

import com.vungle.ads.TpatError;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import fe.d;
import fe.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import le.c;
import pd.m;
import rd.o;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TpatSender {
    public static final Companion Companion = new Companion(null);
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final String TAG = "TpatSender";
    private final Executor jobExecutor;
    private final SignalManager signalManager;
    private final FilePreferences tpatFilePreferences;
    private final Object tpatLock;
    private final VungleApiClient vungleApiClient;

    /* JADX INFO: compiled from: TpatSender.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public TpatSender(VungleApiClient vungleApiClient, Executor ioExecutor, Executor jobExecutor, PathProvider pathProvider, SignalManager signalManager) {
        t.f(vungleApiClient, "vungleApiClient");
        t.f(ioExecutor, "ioExecutor");
        t.f(jobExecutor, "jobExecutor");
        t.f(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = FilePreferences.Companion.get(ioExecutor, pathProvider, FilePreferences.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objC;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                r.a aVar = r.f27774b;
                kotlinx.serialization.json.b.a aVar2 = kotlinx.serialization.json.b.f21551d;
                c cVarA = aVar2.a();
                m.a aVar3 = m.f24255c;
                d<Object> dVarB = u.b(cVarA, i0.d(i0.l(Map.class, aVar3.a(i0.j(String.class)), aVar3.a(i0.j(FailedTpat.class)))));
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objC = r.c((Map) aVar2.c(dVarB, string));
            } catch (Throwable th) {
                r.a aVar4 = r.f27774b;
                objC = r.c(s.a(th));
            }
            Throwable thG = r.g(objC);
            if (thG != null) {
                Logger.Companion.e(TAG, "Failed to decode stored tpats: " + thG);
            }
            if (r.g(objC) != null) {
                objC = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objC;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final void logTpatError(TpatRequest tpatRequest, String str, ErrorInfo errorInfo, Sdk.SDKError.Reason reason) {
        String str2 = "tpat key: " + tpatRequest.getTpatKey() + ", error: " + errorInfo.getDescription() + ", errorIsTerminal: " + errorInfo.getErrorIsTerminal() + " url: " + str;
        Logger.Companion.e(TAG, str2);
        new TpatError(reason, str2).setLogEntry$vungle_ads_release(tpatRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    private final ErrorInfo performPriorityRetry(TpatRequest tpatRequest, String str) {
        ErrorInfo errorInfoPingTPAT;
        boolean z10;
        Boolean priorityRetry = tpatRequest.getPriorityRetry();
        boolean zBooleanValue = priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(tpatRequest.getTpatKey());
        int i10 = 0;
        do {
            errorInfoPingTPAT = this.vungleApiClient.pingTPAT(str, tpatRequest.getHeaders(), tpatRequest.getBody(), tpatRequest.getMethod(), tpatRequest.getLogEntry());
            if (!zBooleanValue) {
                break;
            }
            if (errorInfoPingTPAT != null) {
                z10 = errorInfoPingTPAT.isRetryCode();
            }
            if (!z10) {
                break;
            }
            i10++;
        } while (i10 < tpatRequest.getPriorityRetryCount());
        if (errorInfoPingTPAT != null) {
            logTpatError(tpatRequest, str, errorInfoPingTPAT, i10 >= tpatRequest.getPriorityRetryCount() ? Sdk.SDKError.Reason.TPAT_RETRY_FAILED : Sdk.SDKError.Reason.TPAT_ERROR);
        }
        return errorInfoPingTPAT;
    }

    private final void saveStoredTpats(Map<String, FailedTpat> map) {
        Object objC;
        try {
            r.a aVar = r.f27774b;
            FilePreferences filePreferences = this.tpatFilePreferences;
            kotlinx.serialization.json.b.a aVar2 = kotlinx.serialization.json.b.f21551d;
            c cVarA = aVar2.a();
            m.a aVar3 = m.f24255c;
            d<Object> dVarB = u.b(cVarA, i0.d(i0.l(Map.class, aVar3.a(i0.j(String.class)), aVar3.a(i0.j(FailedTpat.class)))));
            t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(FAILED_TPATS, aVar2.b(dVarB, map)).apply();
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar4 = r.f27774b;
            objC = r.c(s.a(th));
        }
        if (r.g(objC) != null) {
            Logger.Companion.e(TAG, "Failed to encode the about to storing tpats: " + map);
        }
    }

    public static /* synthetic */ void sendTpat$default(TpatSender tpatSender, TpatRequest tpatRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        tpatSender.sendTpat(tpatRequest, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m268sendTpat$lambda1(TpatSender this$0, TpatRequest request, String urlWithSessionId, boolean z10) {
        FailedTpat failedTpat;
        t.f(this$0, "this$0");
        t.f(request, "$request");
        t.f(urlWithSessionId, "$urlWithSessionId");
        ErrorInfo errorInfoPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (errorInfoPerformPriorityRetry != null && errorInfoPerformPriorityRetry.getErrorIsTerminal()) {
                return;
            }
            if (errorInfoPerformPriorityRetry != null || z10) {
                synchronized (this$0.tpatLock) {
                    Map<String, FailedTpat> storedTpats = this$0.getStoredTpats();
                    FailedTpat failedTpat2 = storedTpats.get(request.getUrl());
                    int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                    if (errorInfoPerformPriorityRetry == null && retryAttempt > 0) {
                        storedTpats.remove(request.getUrl());
                        this$0.saveStoredTpats(storedTpats);
                    } else if (errorInfoPerformPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                        storedTpats.remove(request.getUrl());
                        this$0.saveStoredTpats(storedTpats);
                        this$0.logTpatError(request, urlWithSessionId, errorInfoPerformPriorityRetry, Sdk.SDKError.Reason.TPAT_RETRY_FAILED);
                    } else if (errorInfoPerformPriorityRetry != null) {
                        FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                        if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                            failedTpat = new FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                        }
                        storedTpats.put(request.getUrl(), failedTpat);
                        this$0.saveStoredTpats(storedTpats);
                    }
                    g0 g0Var = g0.f27756a;
                }
            }
        }
    }

    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    public final SignalManager getSignalManager() {
        return this.signalManager;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final String injectSessionIdToUrl(String url) {
        t.f(url, "url");
        SignalManager signalManager = this.signalManager;
        String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (!(uuid.length() > 0)) {
            return url;
        }
        String strQuote = Pattern.quote(Constants.SESSION_ID);
        t.e(strQuote, "quote(Constants.SESSION_ID)");
        return new o(strQuote).f(url, uuid);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new TpatRequest.Builder(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(final TpatRequest request, final boolean z10) {
        t.f(request, "request");
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(request.getUrl());
        this.jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.network.a
            @Override // java.lang.Runnable
            public final void run() {
                TpatSender.m268sendTpat$lambda1(this.f13076a, request, strInjectSessionIdToUrl, z10);
            }
        });
    }

    private final boolean isPriorityTpat(String str) {
        return t.a(str, oqHAiWkeGzWld.NXWtFM) || t.a(str, Constants.CLICK_URL) || t.a(str, "impression") || t.a(str, Constants.LOAD_AD);
    }

    public /* synthetic */ TpatSender(VungleApiClient vungleApiClient, Executor executor, Executor executor2, PathProvider pathProvider, SignalManager signalManager, int i10, k kVar) {
        this(vungleApiClient, executor, executor2, pathProvider, (i10 & 16) != 0 ? null : signalManager);
    }
}
