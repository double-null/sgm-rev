package com.android.billingclient.api;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.google.android.gms.internal.play_billing.zzjn;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    private ActivityResultLauncher zza;
    private ActivityResultLauncher zzb;
    private ActivityResultLauncher zzc;
    private ActivityResultLauncher zzd;
    private ActivityResultLauncher zze;
    private ActivityResultLauncher zzf;
    private ResultReceiver zzg;
    private ResultReceiver zzh;
    private ResultReceiver zzi;
    private ResultReceiver zzj;
    private ResultReceiver zzk;
    private ResultReceiver zzl;

    private static final ActivityOptionsCompat zzg() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            return ActivityOptionsCompat.a().setPendingIntentBackgroundActivityStartMode(3);
        }
        if (i10 >= 34) {
            return ActivityOptionsCompat.a().setPendingIntentBackgroundActivityStartMode(1);
        }
        return null;
    }

    @Override // androidx.lifecycle.e
    public /* bridge */ /* synthetic */ m0.a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        VMRunner.invoke("HpNJObLtSoL2oWQe", new Object[]{this, bundle});
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzg;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzh;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.zzi;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.zzj;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.zzk;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.zzl;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }

    final void zza(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzg;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    final void zzb(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzk;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    final void zzc(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzh;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(responseCode)));
        }
        finish();
    }

    final void zzd(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        Bundle extras = intentA == null ? null : intentA.getExtras();
        if (aVar.b() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(aVar.b())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjn.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(aVar.b())));
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzi;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, extras);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(responseCode)));
        }
        finish();
    }

    final void zze(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        Bundle extras = intentA == null ? null : intentA.getExtras();
        if (aVar.b() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", Integer.valueOf(aVar.b())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjn.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", Integer.valueOf(aVar.b())));
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzj;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, extras);
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(responseCode)));
        }
        finish();
    }

    final void zzf(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intentA, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzl;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzc.zzo("ProxyBillingActivityV2", String.format("Subscription management action finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(responseCode)));
        }
        finish();
    }
}
