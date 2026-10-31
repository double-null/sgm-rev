package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zabx implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    zabx(GoogleApiManager googleApiManager, int i10, ApiKey apiKey, long j10, long j11, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i10;
        this.zac = apiKey;
        this.zad = j10;
        this.zae = j11;
    }

    static zabx zaa(GoogleApiManager googleApiManager, int i10, ApiKey apiKey) {
        boolean methodTimingTelemetryEnabled;
        if (!googleApiManager.zam()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            methodTimingTelemetryEnabled = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
            zabk zabkVarZag = googleApiManager.zag(apiKey);
            if (zabkVarZag != null) {
                if (!(zabkVarZag.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabkVarZag.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zabkVarZag, baseGmsClient, i10);
                    if (connectionTelemetryConfigurationZab == null) {
                        return null;
                    }
                    zabkVarZag.zas();
                    methodTimingTelemetryEnabled = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zabx(googleApiManager, i10, apiKey, methodTimingTelemetryEnabled ? System.currentTimeMillis() : 0L, methodTimingTelemetryEnabled ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabk zabkVar, BaseGmsClient baseGmsClient, int i10) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i10) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i10))) || zabkVar.zar() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabk zabkVarZag;
        int batchPeriodMillis;
        int i10;
        int maxMethodInvocationsLogged;
        int i11;
        Exception exception;
        int statusCode;
        int errorCode;
        int i12;
        ConnectionResult connectionResult;
        long j10;
        long j11;
        int iElapsedRealtime;
        GoogleApiManager googleApiManager = this.zaa;
        if (googleApiManager.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zabkVarZag = googleApiManager.zag(this.zac)) != null && (zabkVarZag.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabkVarZag.zaf();
                long j12 = this.zad;
                boolean methodTimingTelemetryEnabled = j12 > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    int version = config.getVersion();
                    if (!baseGmsClient.hasConnectionInfo() || baseGmsClient.isConnecting()) {
                        i10 = version;
                        i11 = batchPeriodMillis;
                        maxMethodInvocationsLogged = maxMethodInvocationsInBatch;
                    } else {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationZab = zab(zabkVarZag, baseGmsClient, this.zab);
                        if (connectionTelemetryConfigurationZab == null) {
                            return;
                        }
                        boolean z10 = connectionTelemetryConfigurationZab.getMethodTimingTelemetryEnabled() && j12 > 0;
                        maxMethodInvocationsLogged = connectionTelemetryConfigurationZab.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z10;
                        i10 = version;
                    }
                    if (task.isSuccessful()) {
                        i12 = 0;
                        errorCode = 0;
                    } else if (task.isCanceled()) {
                        errorCode = -1;
                        i12 = 100;
                    } else {
                        exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            statusCode = status.getStatusCode();
                            connectionResult = status.getConnectionResult();
                            if (connectionResult == null) {
                                errorCode = connectionResult.getErrorCode();
                            }
                            i12 = statusCode;
                        } else {
                            statusCode = 101;
                        }
                        errorCode = -1;
                        i12 = statusCode;
                    }
                    if (methodTimingTelemetryEnabled) {
                        long j13 = this.zae;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                        j10 = j12;
                        j11 = jCurrentTimeMillis;
                    } else {
                        j10 = 0;
                        j11 = 0;
                        iElapsedRealtime = -1;
                    }
                    googleApiManager.zas(new MethodInvocation(this.zab, i12, errorCode, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), i10, i11, maxMethodInvocationsLogged);
                }
                batchPeriodMillis = Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE;
                i10 = 0;
                maxMethodInvocationsLogged = 100;
                i11 = batchPeriodMillis;
                if (task.isSuccessful()) {
                    i12 = 0;
                    errorCode = 0;
                } else if (task.isCanceled()) {
                    errorCode = -1;
                    i12 = 100;
                } else {
                    exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status2 = ((ApiException) exception).getStatus();
                        statusCode = status2.getStatusCode();
                        connectionResult = status2.getConnectionResult();
                        if (connectionResult == null) {
                            errorCode = connectionResult.getErrorCode();
                        }
                        i12 = statusCode;
                    } else {
                        statusCode = 101;
                    }
                    errorCode = -1;
                    i12 = statusCode;
                }
                if (methodTimingTelemetryEnabled) {
                    long j14 = this.zae;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j14);
                    j10 = j12;
                    j11 = jCurrentTimeMillis2;
                } else {
                    j10 = 0;
                    j11 = 0;
                    iElapsedRealtime = -1;
                }
                googleApiManager.zas(new MethodInvocation(this.zab, i12, errorCode, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), i10, i11, maxMethodInvocationsLogged);
            }
        }
    }
}
