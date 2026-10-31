package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzbt extends ResultReceiver {
    final /* synthetic */ LaunchExternalLinkResponseListener zza;
    final /* synthetic */ BillingClientImpl zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbt(BillingClientImpl billingClientImpl, Handler handler, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        super(handler);
        this.zza = launchExternalLinkResponseListener;
        Objects.requireNonNull(billingClientImpl);
        this.zzb = billingClientImpl;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        if (i10 != 0) {
            if (bundle == null) {
                this.zzb.zzbc(this.zza, zzdc.zzh, zzjn.NULL_BUNDLE_IN_LAUNCH_EXTERNAL_LINK_RESULT_RECEIVER, null);
                return;
            }
            builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzk(bundle, "BillingClient"));
            int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            BillingClientImpl billingClientImpl = this.zzb;
            zzjn zzjnVarZzb = i11 != 0 ? zzjn.zzb(i11) : zzjn.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            BillingResult billingResultBuild = builderNewBuilder.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i12 = zzcy.zza;
            billingClientImpl.zzbf(zzcy.zzb(zzjnVarZzb, 37, billingResultBuild, string, zzju.BROADCAST_ACTION_UNSPECIFIED));
        }
        this.zza.onLaunchExternalLinkResponse(builderNewBuilder.build());
    }
}
