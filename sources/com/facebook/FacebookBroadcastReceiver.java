package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: FacebookBroadcastReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
public class FacebookBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: protected */
    public void onFailedAppCall(String appCallId, String action, Bundle extras) {
        kotlin.jvm.internal.t.f(appCallId, "appCallId");
        kotlin.jvm.internal.t.f(action, "action");
        kotlin.jvm.internal.t.f(extras, "extras");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VMRunner.invoke("W0xetg84sMkytP5b", new Object[]{this, context, intent});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onSuccessfulAppCall(String appCallId, String action, Bundle extras) {
        kotlin.jvm.internal.t.f(appCallId, "appCallId");
        kotlin.jvm.internal.t.f(action, "action");
        kotlin.jvm.internal.t.f(extras, "extras");
    }
}
