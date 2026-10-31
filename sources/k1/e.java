package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.l;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: NetworkStateTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends d<i1.b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f21126j = l.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f21127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f21128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f21129i;

    /* JADX INFO: compiled from: NetworkStateTracker.java */
    /* JADX INFO: loaded from: classes2.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("BtWtUzmIB4McFNfZ", new Object[]{this, context, intent});
        }
    }

    /* JADX INFO: compiled from: NetworkStateTracker.java */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.c().a(e.f21126j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            l.c().a(e.f21126j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, o1.a aVar) {
        super(context, aVar);
        this.f21127g = (ConnectivityManager) this.f21120b.getSystemService("connectivity");
        if (j()) {
            this.f21128h = new b();
        } else {
            this.f21129i = new a();
        }
    }

    private static boolean j() {
        return true;
    }

    @Override // k1.d
    public void e() {
        if (!j()) {
            l.c().a(f21126j, "Registering broadcast receiver", new Throwable[0]);
            this.f21120b.registerReceiver(this.f21129i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            l.c().a(f21126j, "Registering network callback", new Throwable[0]);
            this.f21127g.registerDefaultNetworkCallback(this.f21128h);
        } catch (IllegalArgumentException | SecurityException e10) {
            l.c().b(f21126j, "Received exception while registering network callback", e10);
        }
    }

    @Override // k1.d
    public void f() {
        if (!j()) {
            l.c().a(f21126j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f21120b.unregisterReceiver(this.f21129i);
            return;
        }
        try {
            l.c().a(f21126j, "Unregistering network callback", new Throwable[0]);
            this.f21127g.unregisterNetworkCallback(this.f21128h);
        } catch (IllegalArgumentException | SecurityException e10) {
            l.c().b(f21126j, "Received exception while unregistering network callback", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1.b g() {
        NetworkInfo activeNetworkInfo = this.f21127g.getActiveNetworkInfo();
        return new i1.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), t.a.a(this.f21127g), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // k1.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i1.b b() {
        return g();
    }

    boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f21127g.getNetworkCapabilities(this.f21127g.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e10) {
            l.c().b(f21126j, "Unable to validate active network", e10);
            return false;
        }
    }
}
