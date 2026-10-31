package com.facebook.appevents.iap;

/* JADX INFO: compiled from: InAppPurchaseBillingClientWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InAppPurchaseBillingClientWrapper {
    Object getBillingClient();

    void queryPurchaseHistory(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable);

    void queryPurchases(InAppPurchaseUtils.IAPProductType iAPProductType, Runnable runnable);
}
