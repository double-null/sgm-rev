package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class BillingFlowParams {
    private boolean zza;
    private String zzb;
    private String zzc;
    private SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzca zze;
    private ArrayList zzf;
    private boolean zzg;
    private DeveloperBillingOptionParams zzh;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private boolean zzd;
        private SubscriptionUpdateParams.Builder zze;
        private DeveloperBillingOptionParams zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.zze = builderNewBuilder;
        }

        public BillingFlowParams build() {
            List list = this.zzc;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            List list2 = this.zzc;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((ProductDetailsParams) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(null);
            billingFlowParams.zza = !((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty();
            billingFlowParams.zzb = this.zza;
            billingFlowParams.zzc = this.zzb;
            billingFlowParams.zzd = this.zze.build();
            billingFlowParams.zzf = new ArrayList();
            billingFlowParams.zzg = this.zzd;
            List list3 = this.zzc;
            billingFlowParams.zze = list3 != null ? com.google.android.gms.internal.play_billing.zzca.zzj(list3) : com.google.android.gms.internal.play_billing.zzca.zzk();
            billingFlowParams.zzh = this.zzf;
            return billingFlowParams;
        }

        public Builder enableDeveloperBillingOption(DeveloperBillingOptionParams developerBillingOptionParams) {
            this.zzf = developerBillingOptionParams;
            return this;
        }

        public Builder setIsOfferPersonalized(boolean z10) {
            this.zzd = z10;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.zza = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zze = SubscriptionUpdateParams.zzb(subscriptionUpdateParams);
            return this;
        }

        /* synthetic */ Builder(zzcx zzcxVar) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(builderNewBuilder);
            this.zze = builderNewBuilder;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static final class ProductDetailsParams {
        private final SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;
        private final ProductDetails zza;
        private final String zzb;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        public static class Builder {
            private SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;
            private ProductDetails zza;
            private String zzb;

            private Builder() {
                throw null;
            }

            /* synthetic */ Builder(zzcx zzcxVar) {
            }

            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzbl.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            public Builder setOfferToken(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.zzb = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.zzb = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }

            public Builder setSubscriptionProductReplacementParams(SubscriptionProductReplacementParams subscriptionProductReplacementParams) {
                this.mSubscriptionProductReplacementParams = subscriptionProductReplacementParams;
                return this;
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        public static class SubscriptionProductReplacementParams {
            private String oldProductId;
            private int replacementMode;

            /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
            public static class Builder {
                private String oldProductId;
                private int replacementMode;

                private Builder() {
                    this.replacementMode = 0;
                }

                public SubscriptionProductReplacementParams build() {
                    SubscriptionProductReplacementParams subscriptionProductReplacementParams = new SubscriptionProductReplacementParams();
                    subscriptionProductReplacementParams.oldProductId = this.oldProductId;
                    subscriptionProductReplacementParams.replacementMode = this.replacementMode;
                    return subscriptionProductReplacementParams;
                }

                public Builder setOldProductId(String str) {
                    this.oldProductId = str;
                    return this;
                }

                public Builder setReplacementMode(int i10) {
                    this.replacementMode = i10;
                    return this;
                }
            }

            /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
            @Retention(RetentionPolicy.SOURCE)
            public @interface ReplacementMode {
                public static final int CHARGE_FULL_PRICE = 4;
                public static final int CHARGE_PRORATED_PRICE = 2;
                public static final int DEFERRED = 5;
                public static final int KEEP_EXISTING = 6;
                public static final int UNKNOWN_REPLACEMENT_MODE = 0;
                public static final int WITHOUT_PRORATION = 3;
                public static final int WITH_TIME_PRORATION = 1;
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public String getOldProductId() {
                return this.oldProductId;
            }

            public int getReplacementMode() {
                return this.replacementMode;
            }
        }

        /* synthetic */ ProductDetailsParams(Builder builder, zzcx zzcxVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
            this.mSubscriptionProductReplacementParams = builder.mSubscriptionProductReplacementParams;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public SubscriptionProductReplacementParams getSubscriptionProductReplacementParams() {
            return this.mSubscriptionProductReplacementParams;
        }

        public final ProductDetails zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static class SubscriptionUpdateParams {
        private String zza;
        private String zzb;
        private int zzc = 0;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        public static class Builder {
            private String zza;
            private String zzb;
            private boolean zzc;
            private int zzd = 0;

            private Builder() {
            }

            static /* synthetic */ Builder zza(Builder builder) {
                builder.zzc = true;
                return builder;
            }

            public SubscriptionUpdateParams build() {
                zzcx zzcxVar = null;
                boolean z10 = (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(this.zzb);
                if (z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.zzc && !z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(zzcxVar);
                subscriptionUpdateParams.zza = this.zza;
                subscriptionUpdateParams.zzc = this.zzd;
                subscriptionUpdateParams.zzb = this.zzb;
                return subscriptionUpdateParams;
            }

            public Builder setOldPurchaseToken(String str) {
                this.zza = str;
                return this;
            }

            public Builder setOriginalExternalTransactionId(String str) {
                this.zzb = str;
                return this;
            }

            @Deprecated
            public Builder setSubscriptionReplacementMode(int i10) {
                this.zzd = i10;
                return this;
            }

            /* synthetic */ Builder(zzcx zzcxVar) {
            }
        }

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        static /* bridge */ /* synthetic */ Builder zzb(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder builderNewBuilder = newBuilder();
            builderNewBuilder.setOldPurchaseToken(subscriptionUpdateParams.zza);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzc);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return builderNewBuilder;
        }

        final int zza() {
            return this.zzc;
        }

        final String zzc() {
            return this.zza;
        }

        final String zzd() {
            return this.zzb;
        }

        /* synthetic */ SubscriptionUpdateParams(zzcx zzcxVar) {
        }
    }

    private BillingFlowParams() {
        throw null;
    }

    /* synthetic */ BillingFlowParams(zzcx zzcxVar) {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public DeveloperBillingOptionParams getDeveloperBillingOptionParams() {
        return this.zzh;
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.zzd.zza();
    }

    public long zzc() {
        return 0L;
    }

    final BillingResult zzd() {
        ProductDetails.OneTimePurchaseOfferDetails next;
        ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams;
        BillingResult billingResultZza;
        if (this.zze.isEmpty()) {
            return zzdc.zzi;
        }
        char c10 = 0;
        ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zze.get(0);
        for (int i10 = 1; i10 < this.zze.size(); i10++) {
            ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zze.get(i10);
            if (!productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                return zzdc.zza(5, "All products should have same ProductType.");
            }
        }
        String strZza = productDetailsParams.zza().zza();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.zzca zzcaVar = this.zze;
        int size = zzcaVar.size();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            ProductDetailsParams productDetailsParams3 = (ProductDetailsParams) zzcaVar.get(i11);
            ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams2 = productDetailsParams3.getSubscriptionProductReplacementParams();
            if (subscriptionProductReplacementParams2 != null) {
                if (!productDetailsParams3.zza().getProductType().equals(BillingClient.ProductType.SUBS)) {
                    Object[] objArr = new Object[1];
                    objArr[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza = zzdc.zza(5, String.format("Non-subscription product cannot have SubscriptionProductReplacementParams. Invalid product id: %s", objArr));
                } else if (subscriptionProductReplacementParams2.getReplacementMode() <= 0) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = productDetailsParams3.zza().getProductId();
                    billingResultZza = zzdc.zza(5, String.format("replacementMode is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: %s", objArr2));
                } else {
                    billingResultZza = com.google.android.gms.internal.play_billing.zzbo.zzd(subscriptionProductReplacementParams2.oldProductId) ? zzdc.zza(5, String.format("oldProductId is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: %s", productDetailsParams3.zza().getProductId())) : zzdc.zzi;
                }
                if (billingResultZza != zzdc.zzi) {
                    return billingResultZza;
                }
            }
            if (subscriptionProductReplacementParams2 != null && subscriptionProductReplacementParams2.getReplacementMode() == 6) {
                BillingResult billingResultZza2 = productDetailsParams3.zzb() != null ? zzdc.zza(5, String.format("When using KEEP_EXISTING mode, offerToken in ProductDetailsParams should not be set. Offer token is set for product id: %s", productDetailsParams3.zza().getProductId())) : !subscriptionProductReplacementParams2.getOldProductId().equals(productDetailsParams3.zza().getProductId()) ? zzdc.zza(5, String.format("When using KEEP_EXISTING mode, oldProductId in SubscriptionProductReplacementParams should be the same as the product id in ProductDetails. Value is invalid for product id: %s", productDetailsParams3.zza().getProductId())) : zzdc.zzi;
                if (billingResultZza2 != zzdc.zzi) {
                    return billingResultZza2;
                }
            }
            if (productDetailsParams3.zza().getSubscriptionOfferDetails() != null && productDetailsParams3.zzb() == null && (subscriptionProductReplacementParams2 == null || subscriptionProductReplacementParams2.getReplacementMode() != 6)) {
                return zzdc.zza(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", productDetailsParams3.zza().getProductId()));
            }
            if (map.containsKey(productDetailsParams3.zza().getProductId())) {
                return zzdc.zza(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", productDetailsParams3.zza().getProductId()));
            }
            map.put(productDetailsParams3.zza().getProductId(), productDetailsParams3);
            if (subscriptionProductReplacementParams2 != null) {
                if (hashSet.contains(subscriptionProductReplacementParams2.getOldProductId())) {
                    return zzdc.zza(5, String.format("OldProductId can not be duplicated. Invalid old product id: %s.", subscriptionProductReplacementParams2.getOldProductId()));
                }
                hashSet.add(subscriptionProductReplacementParams2.getOldProductId());
                z10 = true;
            }
            if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !strZza.equals(productDetailsParams3.zza().zza())) {
                return zzdc.zza(5, "All products must have the same package name.");
            }
            i11++;
            c10 = 0;
        }
        for (String str : hashSet) {
            if (map.containsKey(str) && ((subscriptionProductReplacementParams = ((ProductDetailsParams) map.get(str)).getSubscriptionProductReplacementParams()) == null || !subscriptionProductReplacementParams.getOldProductId().equals(str))) {
                return zzdc.zza(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        if (z10 && this.zzd.zza() != 0) {
            return zzdc.zza(5, "SubscriptionUpdateParams.setSubscriptionReplaceMode and  ProductDetailsParams.setSubscriptionProductReplacementParams cannot be called at the same time.");
        }
        List<ProductDetails.OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetailsList = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
        String strZzb = productDetailsParams.zzb();
        if (strZzb != null && oneTimePurchaseOfferDetailsList != null) {
            Iterator<ProductDetails.OneTimePurchaseOfferDetails> it = oneTimePurchaseOfferDetailsList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!strZzb.equals(next.getOfferToken()));
            if (next != null && next.zza() != null) {
                return zzdc.zza(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return zzdc.zzi;
    }

    public final String zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }

    @Deprecated
    public String zzg() {
        return null;
    }

    @Deprecated
    public final String zzh() {
        return this.zzd.zzc();
    }

    public final String zzi() {
        return this.zzd.zzd();
    }

    public final ArrayList zzj() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    public final List zzk() {
        return this.zze;
    }

    public final boolean zzt() {
        return this.zzg;
    }

    final boolean zzu() {
        if (this.zzb != null || this.zzc != null || this.zzd.zzd() != null || this.zzd.zza() != 0 || this.zza || this.zzg) {
            return true;
        }
        com.google.android.gms.internal.play_billing.zzca zzcaVar = this.zze;
        if (zzcaVar != null) {
            int size = zzcaVar.size();
            int i10 = 0;
            while (i10 < size) {
                ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams = ((ProductDetailsParams) zzcaVar.get(i10)).getSubscriptionProductReplacementParams();
                i10++;
                if (subscriptionProductReplacementParams != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
