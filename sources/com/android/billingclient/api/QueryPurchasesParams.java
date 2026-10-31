package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchasesParams {
    private final String zza;
    private final boolean zzb;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static class Builder {
        private String zza;
        private boolean zzb = false;

        private Builder() {
        }

        public QueryPurchasesParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.zzb || str.equals(BillingClient.ProductType.SUBS)) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        public Builder includeSuspendedSubscriptions(boolean z10) {
            this.zzb = z10;
            return this;
        }

        public Builder setProductType(String str) {
            this.zza = str;
            return this;
        }

        /* synthetic */ Builder(zzeg zzegVar) {
        }
    }

    /* synthetic */ QueryPurchasesParams(Builder builder, zzeg zzegVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getIncludeSuspendedSubscriptions() {
        return this.zzb;
    }

    public final String zza() {
        return this.zza;
    }
}
