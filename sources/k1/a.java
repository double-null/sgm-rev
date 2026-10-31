package k1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;
import com.facebook.internal.AnalyticsEvents;
import d5.LXP.wcAlQCOdREZdI;

/* JADX INFO: compiled from: BatteryChargingTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f21113i = l.f("BatteryChrgTracker");

    public a(Context context, o1.a aVar) {
        super(context, aVar);
    }

    private boolean j(Intent intent) {
        int intExtra = intent.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // k1.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // k1.c
    public void h(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        byte b10 = 1;
        l.c().a(f21113i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                b10 = !action.equals("android.intent.action.ACTION_POWER_DISCONNECTED") ? (byte) -1 : (byte) 0;
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b10 = -1;
                }
                break;
            case 948344062:
                b10 = !action.equals("android.os.action.CHARGING") ? (byte) -1 : (byte) 2;
                break;
            case 1019184907:
                b10 = !action.equals("android.intent.action.ACTION_POWER_CONNECTED") ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                d(Boolean.FALSE);
                break;
            case 1:
                d(Boolean.FALSE);
                break;
            case 2:
                d(Boolean.TRUE);
                break;
            case 3:
                d(Boolean.TRUE);
                break;
        }
    }

    @Override // k1.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f21120b.registerReceiver(null, new IntentFilter(wcAlQCOdREZdI.ZdZgMXChtq));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(j(intentRegisterReceiver));
        }
        l.c().b(f21113i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
