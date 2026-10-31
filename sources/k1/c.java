package k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;

/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f21115h = l.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f21116g;

    /* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, o1.a aVar) {
        super(context, aVar);
        this.f21116g = new a();
    }

    @Override // k1.d
    public void e() {
        l.c().a(f21115h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f21120b.registerReceiver(this.f21116g, g());
    }

    @Override // k1.d
    public void f() {
        l.c().a(f21115h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f21120b.unregisterReceiver(this.f21116g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
