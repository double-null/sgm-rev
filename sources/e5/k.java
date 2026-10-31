package e5;

import a5.p;
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
    private static k f14488d = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f14489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14490b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14491c = false;

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
                z10 = kVar.f14491c;
                z11 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                kVar = k.this;
                z10 = kVar.f14491c;
                z11 = false;
            }
            kVar.c(z11, z10);
            k.this.f14490b = z11;
        }
    }

    public static k f() {
        return f14488d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f14489a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        c(this.f14490b, zIsDeviceLocked);
        this.f14491c = zIsDeviceLocked;
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        this.f14489a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void c(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f14491c || this.f14490b)) {
            return;
        }
        Iterator<p> it = c.e().c().iterator();
        while (it.hasNext()) {
            it.next().m().w(z11 || z10);
        }
    }
}
