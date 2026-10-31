package k1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;

/* JADX INFO: compiled from: StorageNotLowTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class f extends c<Boolean> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f21132i = l.f("StorageNotLowTracker");

    public f(Context context, o1.a aVar) {
        super(context, aVar);
    }

    @Override // k1.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // k1.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        l.c().a(f21132i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // k1.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent intentRegisterReceiver = this.f21120b.registerReceiver(null, g());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
