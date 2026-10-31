package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BillingProgramReportingDetails {
    private final int billingProgram;
    private final String externalTransactionToken;

    BillingProgramReportingDetails(String str, int i10) {
        this.externalTransactionToken = str;
        this.billingProgram = i10;
    }

    public int getBillingProgram() {
        return this.billingProgram;
    }

    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
