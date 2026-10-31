package x7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: NetworkTypeObserver.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static w f28188f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f28189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f28190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f28191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28193e;

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    private static final class b {

        /* JADX INFO: compiled from: NetworkTypeObserver.java */
        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final w f28194a;

            public a(w wVar) {
                this.f28194a = wVar;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f28194a.n(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, w wVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) x7.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(wVar);
                telephonyManager.registerTelephonyCallback(wVar.f28189a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                wVar.n(5);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    public interface c {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f28195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f28196b;

        public d(c cVar, Executor executor) {
            this.f28195a = new WeakReference<>(cVar);
            this.f28196b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            c cVar = this.f28195a.get();
            if (cVar != null) {
                cVar.a(w.this.g());
            }
        }

        public void b() {
            this.f28196b.execute(new Runnable() { // from class: x7.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28199a.d();
                }
            });
        }

        public boolean c() {
            return this.f28195a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: NetworkTypeObserver.java */
    final class e extends BroadcastReceiver {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Context context) {
            w.this.i(context);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            w.this.f28189a.execute(new Runnable() { // from class: x7.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28200a.b(context);
                }
            });
        }
    }

    private w(final Context context) {
        Executor executorA = x7.b.a();
        this.f28189a = executorA;
        this.f28190b = new CopyOnWriteArrayList<>();
        this.f28191c = new Object();
        this.f28192d = 0;
        executorA.execute(new Runnable() { // from class: x7.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f28186a.k(context);
            }
        });
    }

    public static synchronized w e(Context context) {
        if (f28188f == null) {
            f28188f = new w(context);
        }
        return f28188f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return l0.f28136a >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (l0.f28136a < 31 || iH != 5) {
            n(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void k(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void m() {
        for (d dVar : this.f28190b) {
            if (dVar.c()) {
                this.f28190b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i10) {
        m();
        synchronized (this.f28191c) {
            if (this.f28193e && this.f28192d == i10) {
                return;
            }
            this.f28193e = true;
            this.f28192d = i10;
            Iterator<d> it = this.f28190b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public int g() {
        int i10;
        synchronized (this.f28191c) {
            i10 = this.f28192d;
        }
        return i10;
    }

    public void l(c cVar, Executor executor) {
        boolean z10;
        m();
        d dVar = new d(cVar, executor);
        synchronized (this.f28191c) {
            this.f28190b.add(dVar);
            z10 = this.f28193e;
        }
        if (z10) {
            dVar.b();
        }
    }
}
