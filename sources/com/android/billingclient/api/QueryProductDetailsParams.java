package com.android.billingclient.api;

import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class QueryProductDetailsParams {
    private final com.google.android.gms.internal.play_billing.zzca zza;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        private com.google.android.gms.internal.play_billing.zzca zza;

        private Builder() {
            throw null;
        }

        /* synthetic */ Builder(zzef zzefVar) {
        }

        public Builder setProductList(List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.zza = com.google.android.gms.internal.play_billing.zzca.zzj(list);
            return this;
        }

        public QueryProductDetailsParams build() {
            if (this.zza != null) {
                return new QueryProductDetailsParams(this, null);
            }
            throw new IllegalArgumentException(WKirgUEJJ.nCaeMLlSumoxu);
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static class Product {
        private final String dynamicProductToken;
        private final String zza;
        private final String zzb;

        /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
        /* JADX INFO: loaded from: classes2.dex */
        public static class Builder {
            private String dynamicProductToken;
            private String zza;
            private String zzb;

            private Builder() {
                throw null;
            }

            /* synthetic */ Builder(zzef zzefVar) {
            }

            public Builder setDynamicProductToken(String str) {
                this.dynamicProductToken = str;
                return this;
            }

            public Builder setProductId(String str) {
                this.zza = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.zzb = str;
                return this;
            }

            public Product build() {
                String str = this.zzb;
                if (UomBEukHFwrS.GOpEk.equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.zza == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
        }

        /* synthetic */ Product(Builder builder, zzef zzefVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
            this.dynamicProductToken = builder.dynamicProductToken;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public String getDynamicProductToken() {
            return this.dynamicProductToken;
        }

        public final String zza() {
            return this.zza;
        }

        public final String zzb() {
            return this.zzb;
        }
    }

    /* synthetic */ QueryProductDetailsParams(Builder builder, zzef zzefVar) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzca zza() {
        return this.zza;
    }

    public final String zzb() {
        return ((Product) this.zza.get(0)).zzb();
    }
}
