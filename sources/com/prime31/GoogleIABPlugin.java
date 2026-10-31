package com.prime31;

import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import org.json.JSONException;
import org.json.JSONObject;
import rd.PSo.cNMUz;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleIABPlugin extends GoogleIABPluginBase {
    private static String BILLING_NOT_RUNNING_ERROR = "The billing service is not running or billing is not supported. Aborting.";
    BillingClient billingClient;
    Inventory inventory;
    int queryInventoryResponseCount;
    boolean serviceDisconnected;
    private List<Purchase> _purchases = new ArrayList();
    private PurchasesUpdatedListener purchasesUpdatedListener = new PurchasesUpdatedListener() { // from class: com.prime31.GoogleIABPlugin.1
        @Override // com.android.billingclient.api.PurchasesUpdatedListener
        public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
            Log.i("Prime31", "------------------- onPurchasesUpdated. response code: " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() != 0 || list == null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", billingResult.getDebugMessage());
                    jSONObject.put("response", billingResult.getResponseCode());
                    GoogleIABPlugin.this.UnitySendMessage("purchaseFailed", jSONObject.toString());
                    return;
                } catch (JSONException e10) {
                    Log.i("Prime31", "failed to create JSON packet: " + e10.getMessage());
                    return;
                }
            }
            for (Purchase purchase : list) {
                GoogleIABPlugin.this.inventory.addPurchase(purchase);
                Log.i("Prime31", "---------- total purchases in inventory: " + GoogleIABPlugin.this.inventory.mPurchaseMap.size());
                GoogleIABPlugin googleIABPlugin = GoogleIABPlugin.this;
                googleIABPlugin.UnitySendMessage("purchaseSucceeded", googleIABPlugin.inventory.getPurchaseAsJson(purchase).toString());
            }
        }
    };
    private SkuDetailsResponseListener skuListener = new SkuDetailsResponseListener() { // from class: com.prime31.GoogleIABPlugin.2
        public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
            if (billingResult.getResponseCode() == 0) {
                Log.i("Prime31", "------------------- onSkuDetailsResponse. total sku details: " + list.size());
                Iterator<SkuDetails> it = list.iterator();
                while (it.hasNext()) {
                    GoogleIABPlugin.this.inventory.addSkuDetails(it.next());
                }
            } else {
                Log.i("Prime31", "queryInventoryFailed failed: " + billingResult.getDebugMessage());
                GoogleIABPlugin.this.UnitySendMessage("queryInventoryFailed", String.valueOf(billingResult.getResponseCode()));
            }
            GoogleIABPlugin.this.queryInventoryOperationCompleted();
        }
    };
    private PurchasesResponseListener purchaseListener = new PurchasesResponseListener() { // from class: com.prime31.GoogleIABPlugin.3
        @Override // com.android.billingclient.api.PurchasesResponseListener
        public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
            if (billingResult.getResponseCode() == 0) {
                Log.i("Prime31", "------------------- onQueryPurchasesResponse. total purchases: " + list.size());
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    GoogleIABPlugin.this.inventory.addPurchase(it.next());
                }
            } else {
                Log.i("Prime31", "onQueryPurchasesResponse failed: " + billingResult.getDebugMessage());
                GoogleIABPlugin.this.UnitySendMessage("queryInventoryFailed", String.valueOf(billingResult.getResponseCode()));
            }
            GoogleIABPlugin.this.queryInventoryOperationCompleted();
        }
    };

    private void connectBillingService() {
        this.billingClient.startConnection(new BillingClientStateListener() { // from class: com.prime31.GoogleIABPlugin.4
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                Log.i("Prime31", "------------------- onBillingServiceDisconnected");
                GoogleIABPlugin.this.serviceDisconnected = true;
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    GoogleIABPlugin googleIABPlugin = GoogleIABPlugin.this;
                    googleIABPlugin.serviceDisconnected = false;
                    googleIABPlugin.UnitySendMessage("billingSupported", cNMUz.ZOBVA);
                } else {
                    GoogleIABPlugin.this.UnitySendMessage("billingNotSupported", String.valueOf(billingResult.getResponseCode()));
                }
                Log.i("Prime31", KBBdKxoAiHo.jnxHuEvj + billingResult.getResponseCode());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryInventoryOperationCompleted() {
        this.queryInventoryResponseCount--;
        Log.i("Prime31", "------------------ queryInventoryResponseCount: " + this.queryInventoryResponseCount);
        if (this.queryInventoryResponseCount == 0) {
            UnitySendMessage("queryInventorySucceeded", this.inventory.getAllSkusAndPurchasesAsJson());
        }
    }

    public void acknowledgePurchase(final String str) {
        IABConstants.logEntering(getClass().getSimpleName(), "acknowledgePurchase", str);
        if (this.serviceDisconnected) {
            Log.i("Prime31", BILLING_NOT_RUNNING_ERROR);
            return;
        }
        if (!this.inventory.hasPurchase(str)) {
            UnitySendMessage("consumePurchaseFailed", "sku does not have a purchase in the inventory");
            return;
        }
        final Purchase purchase = this.inventory.getPurchase(str);
        if (purchase.getPurchaseState() != 1 || purchase.isAcknowledged()) {
            return;
        }
        this.billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new AcknowledgePurchaseResponseListener() { // from class: com.prime31.GoogleIABPlugin.6
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                if (billingResult.getResponseCode() == 0) {
                    GoogleIABPlugin.this.inventory.erasePurchase(str);
                    GoogleIABPlugin googleIABPlugin = GoogleIABPlugin.this;
                    googleIABPlugin.UnitySendMessage("acknowledgePurchaseSucceeded", googleIABPlugin.inventory.getPurchaseAsJson(purchase).toString());
                } else {
                    GoogleIABPlugin.this.UnitySendMessage("acknowledgePurchaseFailed", purchase.getSkus().get(0) + ": " + billingResult.getDebugMessage());
                }
            }
        });
    }

    public boolean areSubscriptionsSupported() {
        IABConstants.logEntering(getClass().getSimpleName(), "areSubscriptionsSupported");
        if (!this.serviceDisconnected) {
            return this.billingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS).getResponseCode() == 0;
        }
        Log.i("Prime31", BILLING_NOT_RUNNING_ERROR);
        return false;
    }

    public void consumeProduct(final String str) {
        IABConstants.logEntering(getClass().getSimpleName(), "consumeProduct", str);
        if (this.serviceDisconnected) {
            Log.i("Prime31", BILLING_NOT_RUNNING_ERROR);
            return;
        }
        if (!this.inventory.hasPurchase(str)) {
            UnitySendMessage("consumePurchaseFailed", "sku does not have a purchase in the inventory");
            return;
        }
        final Purchase purchase = this.inventory.getPurchase(str);
        this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() { // from class: com.prime31.GoogleIABPlugin.5
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public void onConsumeResponse(BillingResult billingResult, String str2) {
                if (billingResult.getResponseCode() == 0) {
                    GoogleIABPlugin.this.inventory.erasePurchase(str);
                    GoogleIABPlugin googleIABPlugin = GoogleIABPlugin.this;
                    googleIABPlugin.UnitySendMessage("consumePurchaseSucceeded", googleIABPlugin.inventory.getPurchaseAsJson(purchase).toString());
                } else {
                    GoogleIABPlugin.this.UnitySendMessage("consumePurchaseFailed", purchase.getSkus().get(0) + ": " + billingResult.getDebugMessage());
                }
            }
        });
    }

    public void enableLogging(boolean z10) {
        IABConstants.DEBUG = z10;
    }

    public String getPurchaseHistory() {
        return this.inventory.getAllPurchasesAsJson().toString();
    }

    public void init(String str) {
        IABConstants.logEntering(getClass().getSimpleName(), "init", str);
        this.billingClient = BillingClient.newBuilder(getActivity()).setListener(this.purchasesUpdatedListener).enablePendingPurchases().build();
        connectBillingService();
        this.inventory = new Inventory();
    }

    public void queryInventory(Object[] objArr) {
        IABConstants.logEntering(getClass().getSimpleName(), "queryInventory", objArr);
        IABConstants.logDebug("in queryInventory with Object[] parameter. Converting to String[] now.");
        queryInventory((String[]) Arrays.asList(objArr).toArray(new String[objArr.length]));
    }

    public void unbindService() {
        IABConstants.logEntering(getClass().getSimpleName(), "unbindService");
        this.billingClient.endConnection();
        this.serviceDisconnected = true;
    }

    public void purchaseProduct(String str) {
        IABConstants.logEntering(getClass().getSimpleName(), "purchaseProduct", str);
        boolean z10 = this.serviceDisconnected;
        String str2 = oqHAiWkeGzWld.PhXpm;
        if (z10) {
            Log.i(str2, BILLING_NOT_RUNNING_ERROR);
            return;
        }
        if (!str.startsWith("android.test") && !this.inventory.hasDetails(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", "developer error. Sku does not exist in the Inventory");
                jSONObject.put("response", -666);
                UnitySendMessage("purchaseFailed", jSONObject.toString());
                return;
            } catch (JSONException e10) {
                Log.i(str2, "failed to create JSON packet: " + e10.getMessage());
                return;
            }
        }
        Log.i(str2, "--------------- purchaseProduct Activity launch responseCode: " + this.billingClient.launchBillingFlow(getActivity(), BillingFlowParams.newBuilder().setSkuDetails(this.inventory.getSkuDetails(str)).build()).getResponseCode());
    }

    public void queryInventory(String[] strArr) {
        IABConstants.logEntering(getClass().getSimpleName(), "queryInventory", (Object[]) strArr);
        if (this.serviceDisconnected) {
            Log.i("Prime31", BILLING_NOT_RUNNING_ERROR);
            return;
        }
        this.queryInventoryResponseCount = 4;
        List listAsList = Arrays.asList(strArr);
        SkuDetailsParams.Builder builderNewBuilder = SkuDetailsParams.newBuilder();
        SkuDetailsParams.Builder skusList = builderNewBuilder.setSkusList(listAsList);
        String str = edUJlCZxhVnO.mobrgyB;
        skusList.setType(str);
        this.billingClient.querySkuDetailsAsync(builderNewBuilder.build(), this.skuListener);
        SkuDetailsParams.Builder builderNewBuilder2 = SkuDetailsParams.newBuilder();
        builderNewBuilder2.setSkusList(listAsList).setType(BillingClient.ProductType.INAPP);
        this.billingClient.querySkuDetailsAsync(builderNewBuilder2.build(), this.skuListener);
        this.billingClient.queryPurchasesAsync(str, this.purchaseListener);
        this.billingClient.queryPurchasesAsync(BillingClient.ProductType.INAPP, this.purchaseListener);
    }
}
