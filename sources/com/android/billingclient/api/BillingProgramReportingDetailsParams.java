package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BillingProgramReportingDetailsParams {
    private final int zza;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
    public static final class Builder {
        private int zza = 0;

        private Builder() {
        }

        public BillingProgramReportingDetailsParams build() {
            int i10 = this.zza;
            if (i10 == 0) {
                throw new IllegalArgumentException("Billing program is not specified.");
            }
            if (i10 != 5) {
                return new BillingProgramReportingDetailsParams(this, null);
            }
            throw new IllegalArgumentException("Developer billing type must be specified for side by side billing.");
        }

        public Builder setBillingProgram(int i10) {
            this.zza = i10;
            return this;
        }

        /* synthetic */ Builder(zzda zzdaVar) {
        }
    }

    /* synthetic */ BillingProgramReportingDetailsParams(Builder builder, zzda zzdaVar) {
        this.zza = builder.zza;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public int getBillingProgram() {
        return this.zza;
    }
}
