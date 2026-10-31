package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Calendar;

/* JADX INFO: compiled from: TwilightManager.java */
/* JADX INFO: loaded from: classes2.dex */
class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static k f729d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f732c = new a();

    /* JADX INFO: compiled from: TwilightManager.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f738f;

        a() {
        }
    }

    k(Context context, LocationManager locationManager) {
        this.f730a = context;
        this.f731b = locationManager;
    }

    static k a(Context context) {
        if (f729d == null) {
            Context applicationContext = context.getApplicationContext();
            f729d = new k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f729d;
    }

    private Location c(String str) {
        try {
            if (this.f731b.isProviderEnabled(str)) {
                return this.f731b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f732c.f738f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        long j11;
        a aVar = this.f732c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        j jVarB = j.b();
        jVarB.a(jCurrentTimeMillis - SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        long j12 = jVarB.f726a;
        jVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = jVarB.f728c == 1;
        long j13 = jVarB.f727b;
        long j14 = jVarB.f726a;
        jVarB.a(SignalManager.TWENTY_FOUR_HOURS_MILLIS + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j15 = jVarB.f727b;
        if (j13 == -1 || j14 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j14) {
                j11 = 0 + j15;
            } else {
                j11 = jCurrentTimeMillis > j13 ? 0 + j14 : 0 + j13;
            }
            j10 = j11 + 60000;
        }
        aVar.f733a = z10;
        aVar.f734b = j12;
        aVar.f735c = j13;
        aVar.f736d = j14;
        aVar.f737e = j15;
        aVar.f738f = j10;
    }

    boolean d() {
        a aVar = this.f732c;
        if (e()) {
            return aVar.f733a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f733a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    private Location b() {
        Location locationC = androidx.core.content.g.b(this.f730a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.g.b(this.f730a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c(UyXgnuLGEkgnZE.hNpVWfwavIe) : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }
}
