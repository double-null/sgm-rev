package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f8413h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Float f8414i = Float.valueOf(15.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f8415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f8417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8418d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8419e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8421g;

    public interface a {
        void a(int i10);
    }

    j(l lVar) {
        this.f8417c = lVar;
        Context contextP = l.p();
        this.f8416b = contextP;
        this.f8415a = (AudioManager) contextP.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void d() {
        this.f8417c.Q();
        if (p.a()) {
            this.f8417c.Q().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f8421g = f8413h;
        this.f8416b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f8417c.Q();
        if (p.a()) {
            this.f8417c.Q().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f8416b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f8415a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f8415a.getRingerMode());
        }
    }

    private Float a() {
        AudioManager audioManager = this.f8415a;
        if (audioManager == null) {
            return f8414i;
        }
        try {
            return Float.valueOf(audioManager.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.f8417c.Q();
            if (p.a()) {
                this.f8417c.Q().a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return f8414i;
        }
    }

    public Float b() {
        AudioManager audioManager = this.f8415a;
        if (audioManager == null) {
            return null;
        }
        try {
            return Float.valueOf(audioManager.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th) {
            this.f8417c.Q();
            if (p.a()) {
                this.f8417c.Q().a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8420f = true;
            this.f8421g = this.f8415a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f8420f = false;
            if (this.f8421g != this.f8415a.getRingerMode()) {
                this.f8421g = f8413h;
                b(this.f8415a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f8419e) {
            if (this.f8418d.contains(aVar)) {
                this.f8418d.remove(aVar);
                if (this.f8418d.isEmpty()) {
                    e();
                }
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f8419e) {
            if (this.f8418d.contains(aVar)) {
                return;
            }
            this.f8418d.add(aVar);
            if (this.f8418d.size() == 1) {
                d();
            }
        }
    }

    private void b(final int i10) {
        if (this.f8420f) {
            return;
        }
        this.f8417c.Q();
        if (p.a()) {
            this.f8417c.Q().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f8419e) {
            for (final a aVar : this.f8418d) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(i10);
                    }
                });
            }
        }
    }
}
