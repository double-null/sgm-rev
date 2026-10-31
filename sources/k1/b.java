package k1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: compiled from: BatteryNotLowTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f21114i = l.f("BatteryNotLowTracker");

    public b(Context context, o1.a aVar) {
        super(context, aVar);
    }

    @Override // k1.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // k1.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        l.c().a(f21114i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // k1.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f21120b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        l.c().b(f21114i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
