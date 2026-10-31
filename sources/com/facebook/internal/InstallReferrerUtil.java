package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rd.f0;

/* JADX INFO: compiled from: InstallReferrerUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InstallReferrerUtil {
    public static final InstallReferrerUtil INSTANCE = new InstallReferrerUtil();
    private static final String IS_REFERRER_UPDATED = "is_referrer_updated";
    private static final long REFERRER_FETCH_TIMEOUT = 5;

    /* JADX INFO: compiled from: InstallReferrerUtil.kt */
    /* JADX INFO: loaded from: classes.dex */
    public interface Callback {
        void onReceiveReferrerUrl(String str);
    }

    private InstallReferrerUtil() {
    }

    private final boolean isUpdated() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean(IS_REFERRER_UPDATED, false);
    }

    private final void tryConnectReferrerInfo(final Callback callback, final CountDownLatch countDownLatch) {
        final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
        try {
            installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.facebook.internal.InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i10) {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        try {
                            if (i10 == 0) {
                                try {
                                    ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                    kotlin.jvm.internal.t.e(installReferrer, "{\n                      …r\n                      }");
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null && (f0.U(installReferrer2, "fb", false, 2, null) || f0.U(installReferrer2, AccessToken.DEFAULT_GRAPH_DOMAIN, false, 2, null))) {
                                        callback.onReceiveReferrerUrl(installReferrer2);
                                    }
                                    InstallReferrerUtil.INSTANCE.updateReferrer();
                                } catch (RemoteException unused) {
                                    CountDownLatch countDownLatch2 = countDownLatch;
                                    if (countDownLatch2 != null) {
                                        countDownLatch2.countDown();
                                        return;
                                    }
                                    return;
                                }
                            } else if (i10 == 2) {
                                InstallReferrerUtil.INSTANCE.updateReferrer();
                            }
                            try {
                                installReferrerClientBuild.endConnection();
                            } catch (Exception unused2) {
                            }
                            CountDownLatch countDownLatch3 = countDownLatch;
                            if (countDownLatch3 != null) {
                                countDownLatch3.countDown();
                            }
                        } catch (Throwable th) {
                            CountDownLatch countDownLatch4 = countDownLatch;
                            if (countDownLatch4 != null) {
                                countDownLatch4.countDown();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        CrashShieldHandler.handleThrowable(th2, this);
                    }
                }
            });
        } catch (Exception unused) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    static /* synthetic */ void tryConnectReferrerInfo$default(InstallReferrerUtil installReferrerUtil, Callback callback, CountDownLatch countDownLatch, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            countDownLatch = null;
        }
        installReferrerUtil.tryConnectReferrerInfo(callback, countDownLatch);
    }

    public static final void tryUpdateReferrerInfo(Callback callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        tryConnectReferrerInfo$default(installReferrerUtil, callback, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReferrer() {
        FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean(IS_REFERRER_UPDATED, true).apply();
    }

    public static final void tryUpdateReferrerInfoBlocking(Callback callback) {
        kotlin.jvm.internal.t.f(callback, wHzciBnJlYkdX.KDaFEqcnRAZUc);
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        installReferrerUtil.tryConnectReferrerInfo(callback, countDownLatch);
        try {
            countDownLatch.await(REFERRER_FETCH_TIMEOUT, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
    }
}
