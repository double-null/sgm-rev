package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes4.dex */
public class HFPStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12731a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f12734d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f12732b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12733c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12735e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12736f = 1;

    public HFPStatus(Context context) {
        this.f12734d = null;
        this.f12731a = context;
        this.f12734d = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    protected void clearHFPStat() {
        BroadcastReceiver broadcastReceiver = this.f12732b;
        if (broadcastReceiver != null) {
            this.f12731a.unregisterReceiver(broadcastReceiver);
            this.f12732b = null;
        }
        this.f12736f = 1;
        a();
    }

    protected boolean getHFPStat() {
        return this.f12736f == 2;
    }

    protected void requestHFPStat() {
        clearHFPStat();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) != 1) {
                    return;
                }
                HFPStatus hFPStatus = HFPStatus.this;
                hFPStatus.f12736f = 2;
                hFPStatus.a();
                HFPStatus hFPStatus2 = HFPStatus.this;
                if (hFPStatus2.f12733c) {
                    hFPStatus2.f12734d.setMode(3);
                }
            }
        };
        this.f12732b = broadcastReceiver;
        this.f12731a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f12735e = true;
            this.f12734d.startBluetoothSco();
        } catch (NullPointerException unused) {
            AbstractC2409z.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z10) {
        this.f12733c = z10;
        if (z10) {
            return;
        }
        this.f12734d.setMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f12735e) {
            this.f12735e = false;
            this.f12734d.stopBluetoothSco();
        }
    }

    public final void b() {
        clearHFPStat();
        deinitHFPStatusJni();
    }
}
