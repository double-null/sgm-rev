package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: RingerModeReceiver.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RingerModeReceiver extends BroadcastReceiver {
    private OnSilentModeChangeListener listener;

    public final OnSilentModeChangeListener getListener() {
        return this.listener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VMRunner.invoke("cwkTUDB9MZOWFAbh", new Object[]{this, context, intent});
    }

    public final void setListener(OnSilentModeChangeListener onSilentModeChangeListener) {
        this.listener = onSilentModeChangeListener;
    }
}
