package com.android.billingclient.api;

import android.text.TextUtils;
import be.LNO.fzLzfW;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.facebook.appevents.internal.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ProductDetails {
    private final String zza;
    private final JSONObject zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final List zzj;
    private final List zzk;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static final class InstallmentPlanDetails {
        private final int commitmentPaymentsCount;
        private final int subsequentCommitmentPaymentsCount;

        InstallmentPlanDetails(JSONObject jSONObject) throws JSONException {
            this.commitmentPaymentsCount = jSONObject.getInt("commitmentPaymentsCount");
            this.subsequentCommitmentPaymentsCount = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static final class PricingPhase {
        private final String zza;
        private final long zzb;
        private final String zzc;
        private final String zzd;
        private final int zze;
        private final int zzf;

        PricingPhase(JSONObject jSONObject) {
            this.zzd = jSONObject.optString(Constants.GP_IAP_BILLING_PERIOD);
            this.zzc = jSONObject.optString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7);
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7);
            this.zzf = jSONObject.optInt(Constants.GP_IAP_RECURRENCE_MODE);
            this.zze = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.zze;
        }

        public String getBillingPeriod() {
            return this.zzd;
        }

        public String getFormattedPrice() {
            return this.zza;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        public String getPriceCurrencyCode() {
            return this.zzc;
        }

        public int getRecurrenceMode() {
            return this.zzf;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static class PricingPhases {
        private final List zza;

        PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.zza = arrayList;
        }

        public List<PricingPhase> getPricingPhaseList() {
            return this.zza;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    ProductDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.zzc = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.zzd = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.zze = jSONObject.optString("title");
        this.zzf = jSONObject.optString("name");
        this.zzg = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.zzh = jSONObject.optString("skuDetailsToken");
        this.zzi = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS);
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.zzj = arrayList;
        } else {
            this.zzj = (strOptString2.equals(BillingClient.ProductType.SUBS) || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.zzb.optJSONObject(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS);
        JSONArray jSONArrayOptJSONArray2 = this.zzb.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.zzk = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.zzk = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.zzk = arrayList2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.zza, ((ProductDetails) obj).zza);
        }
        return false;
    }

    public String getDescription() {
        return this.zzg;
    }

    public String getName() {
        return this.zzf;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.zzk;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) list.get(0);
    }

    public List<OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.zzk;
    }

    public String getProductId() {
        return this.zzc;
    }

    public String getProductType() {
        return this.zzd;
    }

    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.zzj;
    }

    public String getTitle() {
        return this.zze;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public String toString() {
        List list = this.zzj;
        return "ProductDetails{jsonString='" + this.zza + "', parsedJson=" + this.zzb.toString() + ", productId='" + this.zzc + "', productType='" + this.zzd + "', title='" + this.zze + "', productDetailsToken='" + this.zzh + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    public final String zza() {
        return this.zzb.optString("packageName");
    }

    final String zzb() {
        return this.zzh;
    }

    final String zzc(String str) {
        List<OneTimePurchaseOfferDetails> list;
        if (!TextUtils.isEmpty(str) && (list = this.zzk) != null && !list.isEmpty()) {
            for (OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails : list) {
                if (!TextUtils.isEmpty(oneTimePurchaseOfferDetails.zzb()) && Objects.equals(oneTimePurchaseOfferDetails.getOfferToken(), str)) {
                    return oneTimePurchaseOfferDetails.zzb();
                }
            }
        }
        return this.zzi;
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class OneTimePurchaseOfferDetails {
        private final String zza;
        private final long zzb;
        private final String zzc;
        private final String zzd;
        private final String zze;
        private final String zzf;
        private final List zzg;
        private final Long zzh;
        private final DiscountDisplayInfo zzi;
        private final ValidTimeWindow zzj;
        private final LimitedQuantityInfo zzk;
        private final String zzl;
        private final PreorderDetails zzm;
        private final RentalDetails zzn;
        private final zzdv zzo;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        /* JADX INFO: loaded from: classes.dex */
        public static final class DiscountDisplayInfo {
            private final Integer zza;
            private final DiscountAmount zzb;

            /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
            public static final class DiscountAmount {
                private final String zza;
                private final long zzb;
                private final String zzc;

                DiscountAmount(JSONObject jSONObject) {
                    this.zza = jSONObject.optString("formattedDiscountAmount");
                    this.zzb = jSONObject.optLong("discountAmountMicros");
                    this.zzc = jSONObject.optString("discountAmountCurrencyCode");
                }

                public String getDiscountAmountCurrencyCode() {
                    return this.zzc;
                }

                public long getDiscountAmountMicros() {
                    return this.zzb;
                }

                public String getFormattedDiscountAmount() {
                    return this.zza;
                }
            }

            DiscountDisplayInfo(JSONObject jSONObject) throws JSONException {
                this.zza = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.zzb = jSONObjectOptJSONObject != null ? new DiscountAmount(jSONObjectOptJSONObject) : null;
            }

            public DiscountAmount getDiscountAmount() {
                return this.zzb;
            }

            public Integer getPercentageDiscount() {
                return this.zza;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        /* JADX INFO: loaded from: classes.dex */
        public static final class LimitedQuantityInfo {
            private final int zza;
            private final int zzb;

            LimitedQuantityInfo(JSONObject jSONObject) throws JSONException {
                this.zza = jSONObject.getInt("maximumQuantity");
                this.zzb = jSONObject.getInt("remainingQuantity");
            }

            public int getMaximumQuantity() {
                return this.zza;
            }

            public int getRemainingQuantity() {
                return this.zzb;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        /* JADX INFO: loaded from: classes.dex */
        public static final class PreorderDetails {
            private final long preorderPresaleEndTimeMillis;
            private final long preorderReleaseTimeMillis;

            PreorderDetails(JSONObject jSONObject) throws JSONException {
                this.preorderReleaseTimeMillis = jSONObject.getLong("preorderReleaseTimeMillis");
                this.preorderPresaleEndTimeMillis = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }

            public long getPreorderPresaleEndTimeMillis() {
                return this.preorderPresaleEndTimeMillis;
            }

            public long getPreorderReleaseTimeMillis() {
                return this.preorderReleaseTimeMillis;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        /* JADX INFO: loaded from: classes.dex */
        public static final class RentalDetails {
            private final String rentalExpirationPeriod;
            private final String rentalPeriod;

            RentalDetails(JSONObject jSONObject) throws JSONException {
                this.rentalPeriod = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.rentalExpirationPeriod = true == strOptString.isEmpty() ? null : strOptString;
            }

            public String getRentalExpirationPeriod() {
                return this.rentalExpirationPeriod;
            }

            public String getRentalPeriod() {
                return this.rentalPeriod;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        /* JADX INFO: loaded from: classes.dex */
        public static final class ValidTimeWindow {
            private final Long zza;
            private final Long zzb;

            ValidTimeWindow(JSONObject jSONObject) throws JSONException {
                this.zza = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.zzb = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            public Long getEndTimeMillis() {
                return this.zzb;
            }

            public Long getStartTimeMillis() {
                return this.zza;
            }
        }

        public DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.zzi;
        }

        public String getFormattedPrice() {
            return this.zza;
        }

        public Long getFullPriceMicros() {
            return this.zzh;
        }

        public LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.zzk;
        }

        public String getOfferId() {
            return this.zze;
        }

        public List<String> getOfferTags() {
            return this.zzg;
        }

        public String getOfferToken() {
            return this.zzd;
        }

        public PreorderDetails getPreorderDetails() {
            return this.zzm;
        }

        public long getPriceAmountMicros() {
            return this.zzb;
        }

        public String getPriceCurrencyCode() {
            return this.zzc;
        }

        public String getPurchaseOptionId() {
            return this.zzf;
        }

        public RentalDetails getRentalDetails() {
            return this.zzn;
        }

        public ValidTimeWindow getValidTimeWindow() {
            return this.zzj;
        }

        public final zzdv zza() {
            return this.zzo;
        }

        final String zzb() {
            return this.zzl;
        }

        OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            Long lValueOf;
            DiscountDisplayInfo discountDisplayInfo;
            ValidTimeWindow validTimeWindow;
            LimitedQuantityInfo limitedQuantityInfo;
            PreorderDetails preorderDetails;
            RentalDetails rentalDetails;
            this.zza = jSONObject.optString("formattedPrice");
            this.zzb = jSONObject.optLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7);
            this.zzc = jSONObject.optString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7);
            String strOptString = jSONObject.optString("offerIdToken");
            this.zzd = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString(Constants.GP_IAP_OFFER_ID);
            this.zze = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.zzf = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.zzg = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.zzg.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            if (jSONObject.has("fullPriceMicros")) {
                lValueOf = Long.valueOf(jSONObject.optLong("fullPriceMicros"));
            } else {
                lValueOf = null;
            }
            this.zzh = lValueOf;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject == null) {
                discountDisplayInfo = null;
            } else {
                discountDisplayInfo = new DiscountDisplayInfo(jSONObjectOptJSONObject);
            }
            this.zzi = discountDisplayInfo;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 == null) {
                validTimeWindow = null;
            } else {
                validTimeWindow = new ValidTimeWindow(jSONObjectOptJSONObject2);
            }
            this.zzj = validTimeWindow;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 == null) {
                limitedQuantityInfo = null;
            } else {
                limitedQuantityInfo = new LimitedQuantityInfo(jSONObjectOptJSONObject3);
            }
            this.zzk = limitedQuantityInfo;
            this.zzl = jSONObject.optString(fzLzfW.AlXCuI);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 == null) {
                preorderDetails = null;
            } else {
                preorderDetails = new PreorderDetails(jSONObjectOptJSONObject4);
            }
            this.zzm = preorderDetails;
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 == null) {
                rentalDetails = null;
            } else {
                rentalDetails = new RentalDetails(jSONObjectOptJSONObject5);
            }
            this.zzn = rentalDetails;
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.zzo = jSONObjectOptJSONObject6 != null ? new zzdv(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES);
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new PricingPhases(jSONArrayOptJSONArray2);
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class SubscriptionOfferDetails {
        private final String zza;
        private final String zzb;
        private final String zzc;
        private final PricingPhases zzd;
        private final List zze;
        private final InstallmentPlanDetails zzf;

        public String getBasePlanId() {
            return this.zza;
        }

        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.zzf;
        }

        public String getOfferId() {
            return this.zzb;
        }

        public List<String> getOfferTags() {
            return this.zze;
        }

        public String getOfferToken() {
            return this.zzc;
        }

        public PricingPhases getPricingPhases() {
            return this.zzd;
        }

        SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.zza = jSONObject.optString(Constants.GP_IAP_BASE_PLAN_ID);
            String strOptString = jSONObject.optString(Constants.GP_IAP_OFFER_ID);
            this.zzb = true == strOptString.isEmpty() ? null : strOptString;
            this.zzc = jSONObject.getString("offerIdToken");
            this.zzd = new PricingPhases(jSONObject.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(sRGQSqxgxlS.KNFvDFLi);
            this.zzf = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString(Constants.GP_IAP_BASE_PLAN_ID);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.zze = arrayList;
        }
    }
}
