package com.android.billingclient.api;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzkv;
import com.google.android.gms.internal.play_billing.zzky;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {
    static final String EXTERNAL_BROADCAST_PERMISSION = "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST";
    private static final String KEY_ACTIVITY_CODE = "activity_code";
    static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    static final int RESULT_CODE_PLAY_CANCELED_WITH_ON_CREATE_RUNTIME_EXCEPTION = 5;
    static final int RESULT_CODE_PLAY_CANCELLED = 3;
    static final int RESULT_CODE_PLAY_CANCELLED_WITHOUT_COMPLETE_ACTION = 4;
    private static final String TAG = "ProxyBillingActivity";
    private int activityCode;
    private long billingClientTransactionId;
    zzcz billingLogger;
    private ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    zzec proxyBillingBroadcastReceiver;
    private boolean sendCancelledBroadcastIfFinished;
    private boolean wasServiceAutoReconnected;

    private zzjn getLoggingErrorReason(int i10, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return zzjn.NULL_BUNDLE_IN_ACTIVITY_RESULT;
            }
            return i10 == 5 ? zzjn.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : zzjn.REASON_UNSPECIFIED;
        }
        if (i10 == -1) {
            return zzjn.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 == 0) {
            return zzjn.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 != 3) {
            return i10 != 4 ? zzjn.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjn.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
        }
        return zzjn.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInAppMessageFlow(Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
    }

    private boolean isKnownError(int i10, Intent intent) {
        return !getLoggingErrorReason(i10, intent).equals(zzjn.REASON_UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isProxyBillingBroadcastReceiverRegistered() {
        return this.proxyBillingBroadcastReceiver != null;
    }

    private Intent makeAlternativeBillingIntent(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0068  */
    public Intent makePurchaseUpdatedIntentWithResponseCodeAndReason(zzjn zzjnVar, long j10, boolean z10) {
        Intent intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
        if (!z10) {
            intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
            intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(6);
            builderNewBuilder.setDebugMessage("An internal error occurred.");
            BillingResult billingResultBuild = builderNewBuilder.build();
            int i10 = zzcy.zza;
            intentMakePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", zzcy.zzb(zzjnVar, 2, billingResultBuild, null, zzju.BROADCAST_ACTION_UNSPECIFIED).zzQ());
        } else if (isProxyBillingBroadcastReceiverRegistered() && this.proxyBillingBroadcastReceiver.zza() != null) {
            BillingResult billingResultZza = this.proxyBillingBroadcastReceiver.zza();
            intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", billingResultZza.getResponseCode());
            intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", billingResultZza.getDebugMessage());
        } else if (!isProxyBillingBroadcastReceiverRegistered() || this.proxyBillingBroadcastReceiver.zzc()) {
            intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
            intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
            builderNewBuilder2.setResponseCode(6);
            builderNewBuilder2.setDebugMessage("An internal error occurred.");
            BillingResult billingResultBuild2 = builderNewBuilder2.build();
            int i11 = zzcy.zza;
            intentMakePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", zzcy.zzb(zzjnVar, 2, billingResultBuild2, null, zzju.BROADCAST_ACTION_UNSPECIFIED).zzQ());
        } else {
            intentMakePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 3);
            intentMakePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
            BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
            builderNewBuilder3.setResponseCode(3);
            builderNewBuilder3.setDebugMessage("Play Store is blocked.");
            BillingResult billingResultBuild3 = builderNewBuilder3.build();
            zzjn zzjnVar2 = zzjn.PLAY_STORE_APP_BLOCKED;
            int i12 = zzcy.zza;
            intentMakePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", zzcy.zzb(zzjnVar2, 2, billingResultBuild3, null, zzju.BROADCAST_ACTION_UNSPECIFIED).zzQ());
        }
        intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentMakePurchasesUpdatedIntent.putExtra("billingClientTransactionId", j10);
        intentMakePurchasesUpdatedIntent.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
        return intentMakePurchasesUpdatedIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent makePurchasesUpdatedIntent() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void registerProxyBillingBroadcastReceiver() {
        try {
            this.proxyBillingBroadcastReceiver = new zzec(this.billingLogger);
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
            intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
            androidx.core.content.a.h(this, this.proxyBillingBroadcastReceiver, intentFilter, EXTERNAL_BROADCAST_PERMISSION, null, 2);
        } catch (NoSuchMethodError | RuntimeException e10) {
            this.proxyBillingBroadcastReceiver = null;
            if (e10 instanceof NoSuchMethodError) {
                zzcz zzczVar = this.billingLogger;
                zzkv zzkvVarZza = zzky.zza();
                zzkvVarZza.zza(2);
                zzczVar.zzl((zzky) zzkvVarZza.zzi());
            } else {
                zzcz zzczVar2 = this.billingLogger;
                zzkv zzkvVarZza2 = zzky.zza();
                zzkvVarZza2.zza(1);
                zzczVar2.zzl((zzky) zzkvVarZza2.zzi());
            }
            com.google.android.gms.internal.play_billing.zzc.zzp(TAG, "Failed to register receiver.", e10);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("tUKbn0cGIdaTxbVf", new Object[]{this, bundle});
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        VMRunner.invoke("keLYSeihsRFXfKBP", new Object[]{this});
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver);
        }
        bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
        bundle.putInt(KEY_ACTIVITY_CODE, this.activityCode);
        bundle.putLong("billingClientTransactionId", this.billingClientTransactionId);
        bundle.putBoolean("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[PHI: r10
      0x005a: PHI (r10v1 int) = (r10v0 int), (r10v15 int) binds: [B:20:0x0055, B:22:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x005a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0079, please report this as an issue */
    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        boolean z10;
        int responseCode;
        int i12;
        String string;
        Intent intentMakePurchasesUpdatedIntent;
        boolean z11;
        Bundle extras;
        super.onActivityResult(i10, i11, intent);
        if (i10 != 100) {
            if (i10 == 110) {
                if (intent == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intent, TAG).getResponseCode();
                i12 = -1;
                if (i11 != -1) {
                    if (responseCode != 0) {
                        i11 = -1;
                        com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
                        i12 = i11;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
                    i12 = i11;
                }
                if (true != z10) {
                    com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Got null data with resultCode " + i12 + "!");
                } else if (intent.getExtras() == null) {
                    com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Got null bundle!");
                }
                if (isKnownError(i12, intent)) {
                    zzjn loggingErrorReason = getLoggingErrorReason(i12, intent);
                    long j10 = this.billingClientTransactionId;
                    if (intent == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    intentMakePurchasesUpdatedIntent = makePurchaseUpdatedIntentWithResponseCodeAndReason(loggingErrorReason, j10, z11);
                } else {
                    string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentMakePurchasesUpdatedIntent = makeAlternativeBillingIntent(string);
                        intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                        intentMakePurchasesUpdatedIntent.putExtras(intent.getExtras());
                        intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                    intentMakePurchasesUpdatedIntent.putExtra("billingClientTransactionId", this.billingClientTransactionId);
                    intentMakePurchasesUpdatedIntent.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
                }
                if (i10 == 110) {
                    intentMakePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentMakePurchasesUpdatedIntent);
            } else if (i10 == 101) {
                int iZza = com.google.android.gms.internal.play_billing.zzc.zza(intent, TAG);
                ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(iZza, extras);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo(TAG, ykDFMuXDQMaR.tjhdQZEfbKlhCy + i10 + "; skipping...");
            }
        } else {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            responseCode = com.google.android.gms.internal.play_billing.zzc.zzi(intent, TAG).getResponseCode();
            i12 = -1;
            if (i11 != -1) {
                if (responseCode != 0) {
                    i11 = -1;
                    com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
                    i12 = i11;
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
                i12 = i11;
            }
            if (true != z10) {
                com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                com.google.android.gms.internal.play_billing.zzc.zzo(TAG, "Got null bundle!");
            }
            if (isKnownError(i12, intent)) {
                zzjn loggingErrorReason2 = getLoggingErrorReason(i12, intent);
                long j11 = this.billingClientTransactionId;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentMakePurchasesUpdatedIntent = makePurchaseUpdatedIntentWithResponseCodeAndReason(loggingErrorReason2, j11, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentMakePurchasesUpdatedIntent = makeAlternativeBillingIntent(string);
                    intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentMakePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                    intentMakePurchasesUpdatedIntent.putExtras(intent.getExtras());
                    intentMakePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentMakePurchasesUpdatedIntent.putExtra("billingClientTransactionId", this.billingClientTransactionId);
                intentMakePurchasesUpdatedIntent.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
            }
            if (i10 == 110) {
                intentMakePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentMakePurchasesUpdatedIntent);
        }
        this.sendCancelledBroadcastIfFinished = false;
        if (isProxyBillingBroadcastReceiverRegistered()) {
            this.proxyBillingBroadcastReceiver.zzb();
        }
        finish();
    }
}
