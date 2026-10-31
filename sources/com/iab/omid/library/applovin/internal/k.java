package com.iab.omid.library.applovin.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static k f12583d = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f12584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12585b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12586c = false;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k kVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                kVar = k.this;
                z10 = kVar.f12586c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                kVar = k.this;
                z10 = kVar.f12586c;
                z11 = false;
            }
            kVar.a(z11, z10);
            k.this.f12585b = z11;
        }
    }

    public static k b() {
        return f12583d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f12584a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f12585b, zIsDeviceLocked);
        this.f12586c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f12584a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f12586c || this.f12585b)) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z11 || z10);
        }
    }
}
