package com.prime31;

import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Inventory {
    protected static final String TAG = "Prime31-INV";
    Map<String, SkuDetails> mSkuMap = new HashMap();
    Map<String, Purchase> mPurchaseMap = new HashMap();

    Inventory() {
    }

    private JSONArray getAllSkusAsJson() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<SkuDetails> it = this.mSkuMap.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(it.next().getOriginalJson()));
            }
            return jSONArray;
        } catch (JSONException e10) {
            Log.i(TAG, "Error creating JSON from skus" + e10.getMessage());
            return new JSONArray();
        }
    }

    void addPurchase(Purchase purchase) {
        this.mPurchaseMap.put(purchase.getSkus().get(0), purchase);
    }

    void addSkuDetails(SkuDetails skuDetails) {
        this.mSkuMap.put(skuDetails.getSku(), skuDetails);
    }

    public void erasePurchase(String str) {
        if (this.mPurchaseMap.containsKey(str)) {
            this.mPurchaseMap.remove(str);
        }
    }

    List<String> getAllOwnedSkus() {
        return new ArrayList(this.mPurchaseMap.keySet());
    }

    public List<Purchase> getAllPurchases() {
        return new ArrayList(this.mPurchaseMap.values());
    }

    public JSONArray getAllPurchasesAsJson() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Purchase> it = this.mPurchaseMap.values().iterator();
        while (it.hasNext()) {
            jSONArray.put(getPurchaseAsJson(it.next()));
        }
        return jSONArray;
    }

    public List<SkuDetails> getAllSkuDetails() {
        return new ArrayList(this.mSkuMap.values());
    }

    public String getAllSkusAndPurchasesAsJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("purchases", getAllPurchasesAsJson());
            jSONObject.put("skus", getAllSkusAsJson());
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.i(TAG, "Error creating JSON from skus" + e10.getMessage());
            return JsonUtils.EMPTY_JSON;
        }
    }

    public Purchase getPurchase(String str) {
        return this.mPurchaseMap.get(str);
    }

    public SkuDetails getSkuDetails(String str) {
        return this.mSkuMap.get(str);
    }

    public boolean hasDetails(String str) {
        return this.mSkuMap.containsKey(str);
    }

    public boolean hasPurchase(String str) {
        return this.mPurchaseMap.containsKey(str);
    }

    public JSONObject getPurchaseAsJson(Purchase purchase) {
        try {
            JSONObject jSONObject = new JSONObject(purchase.getOriginalJson());
            jSONObject.put(sRGQSqxgxlS.KIPyVIjoBV, purchase.getSignature());
            jSONObject.put("originalJson", purchase.getOriginalJson());
            if (IABConstants.DEBUG) {
                Log.w("Unity", "---------json: " + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException e10) {
            Log.i(TAG, "Error creating JSON from purchase" + e10.getMessage());
            return new JSONObject();
        }
    }
}
