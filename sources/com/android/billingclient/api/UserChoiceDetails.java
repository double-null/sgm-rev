package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class UserChoiceDetails {
    private final String mOriginalJson;
    private final JSONObject mParsedJson;
    private final List<Product> mProducts;

    UserChoiceDetails(String str) throws JSONException {
        this.mOriginalJson = str;
        JSONObject jSONObject = new JSONObject(str);
        this.mParsedJson = jSONObject;
        this.mProducts = toProductList(jSONObject.optJSONArray("products"));
    }

    private static List<Product> toProductList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public String getExternalTransactionToken() {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String strOptString = this.mParsedJson.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    public List<Product> getProducts() {
        return this.mProducts;
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static class Product {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f5851id;
        private final String offerToken;
        private final String type;

        Product(String str, String str2, String str3) {
            this.f5851id = str;
            this.type = str2;
            this.offerToken = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f5851id.equals(product.getId()) && this.type.equals(product.getType()) && Objects.equals(this.offerToken, product.getOfferToken());
        }

        public String getId() {
            return this.f5851id;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.f5851id, this.type, this.offerToken);
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f5851id, this.type, this.offerToken);
        }

        private Product(JSONObject jSONObject) {
            this.f5851id = jSONObject.optString("productId");
            this.type = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.offerToken = true == strOptString.isEmpty() ? null : strOptString;
        }
    }
}
