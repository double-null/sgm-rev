package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PurchaseVerificationHandler implements IPurchaseVerificationHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final String SCHEDULED_EXECUTOR_SOURCE = "PurchaseVerificationHandler";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private boolean isSendingPurchaseVerificationPackage;
    private long lastPackageRetryInMilli = 0;
    private ILogger logger;
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler;

    /* JADX INFO: loaded from: classes.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f5694a;

        public a(ActivityPackage activityPackage) {
            this.f5694a = activityPackage;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PurchaseVerificationHandler.this.sendPurchaseVerificationPackageI(this.f5694a);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackageI();
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PurchaseVerificationHandler.this.lastPackageRetryInMilli = 0L;
            PurchaseVerificationHandler.this.sendNextPurchaseVerificationPackage();
        }
    }

    public PurchaseVerificationHandler(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z10, iActivityPackageSender);
        this.logger = AdjustFactory.getLogger();
        this.scheduler = new SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackage() {
        this.scheduler.submit(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNextPurchaseVerificationPackageI() {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() == null || this.packageQueue.isEmpty()) {
            return;
        }
        if (iActivityHandler.getActivityState().isGdprForgotten) {
            this.logger.debug("purchase_verification request won't be sent for GDPR forgotten user", new Object[0]);
            return;
        }
        if (this.paused) {
            this.logger.debug("PurchaseVerificationHandler is paused", new Object[0]);
            return;
        }
        if (this.isSendingPurchaseVerificationPackage) {
            this.logger.debug("PurchaseVerificationHandler is is already sending a package", new Object[0]);
            return;
        }
        long jWaitTime = waitTime();
        if (jWaitTime > 0) {
            this.scheduler.schedule(new c(), jWaitTime);
        } else {
            ActivityPackage activityPackage = this.packageQueue.get(0);
            this.isSendingPurchaseVerificationPackage = true;
            sendPurchaseVerificationPackageSync(activityPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPurchaseVerificationPackageI(ActivityPackage activityPackage) {
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added purchase_verification %d", Integer.valueOf(this.packageQueue.size()));
        this.logger.verbose("%s", activityPackage.getExtendedString());
        sendNextPurchaseVerificationPackage();
    }

    private long waitTime() {
        long j10 = this.lastPackageRetryInMilli;
        if (j10 <= 0) {
            return 0L;
        }
        this.logger.verbose("Waiting for %d ms before retrying purchase_verification with retry_in", Long.valueOf(j10));
        return this.lastPackageRetryInMilli;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void init(IActivityHandler iActivityHandler, boolean z10, IActivityPackageSender iActivityPackageSender) {
        this.paused = !z10;
        this.packageQueue = new ArrayList();
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
        this.isSendingPurchaseVerificationPackage = false;
        this.lastPackageRetryInMilli = 0L;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void pauseSending() {
        this.paused = true;
        this.isSendingPurchaseVerificationPackage = false;
        this.lastPackageRetryInMilli = 0L;
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void resumeSending() {
        this.paused = false;
        sendNextPurchaseVerificationPackage();
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void sendPurchaseVerificationPackage(ActivityPackage activityPackage) {
        this.scheduler.submit(new a(activityPackage));
    }

    @Override // com.adjust.sdk.IPurchaseVerificationHandler
    public void teardown() {
        this.logger.verbose("PurchaseVerificationHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.scheduler = null;
        this.isSendingPurchaseVerificationPackage = false;
        this.lastPackageRetryInMilli = 0L;
    }

    private void sendPurchaseVerificationPackageSync(ActivityPackage activityPackage) {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        ResponseData responseDataSendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, null);
        if (responseDataSendActivityPackageSync instanceof PurchaseVerificationResponseData) {
            this.isSendingPurchaseVerificationPackage = false;
            PurchaseVerificationResponseData purchaseVerificationResponseData = (PurchaseVerificationResponseData) responseDataSendActivityPackageSync;
            if (purchaseVerificationResponseData.jsonResponse == null) {
                this.logger.error(CwEo.UfGeBZovamsMKaN, purchaseVerificationResponseData.message);
            } else {
                if (iActivityHandler == null) {
                    return;
                }
                if (purchaseVerificationResponseData.trackingState == TrackingState.OPTED_OUT) {
                    iActivityHandler.gotOptOutResponse();
                    return;
                }
                if (purchaseVerificationResponseData.willRetry) {
                    Long l10 = responseDataSendActivityPackageSync.retryIn;
                    if (l10 != null && l10.longValue() > 0) {
                        long jLongValue = responseDataSendActivityPackageSync.retryIn.longValue();
                        this.lastPackageRetryInMilli = jLongValue;
                        this.logger.error("Retrying purchase_verification package with retry in %d ms", Long.valueOf(jLongValue));
                    }
                    sendNextPurchaseVerificationPackage();
                    return;
                }
                this.lastPackageRetryInMilli = 0L;
            }
            if (!this.packageQueue.isEmpty()) {
                this.packageQueue.remove(0);
            }
            iActivityHandler.finishedTrackingActivity(purchaseVerificationResponseData);
            sendNextPurchaseVerificationPackage();
        }
    }
}
