package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.m;
import androidx.work.l;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends m implements androidx.work.impl.foreground.a.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f3739f = l.f("SystemFgService");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SystemForegroundService f3740g = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.a f3743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    NotificationManager f3744e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f3746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3747c;

        a(int i10, Notification notification, int i11) {
            this.f3745a = i10;
            this.f3746b = notification;
            this.f3747c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f3745a, this.f3746b, this.f3747c);
            } else {
                SystemForegroundService.this.startForeground(this.f3745a, this.f3746b);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f3750b;

        b(int i10, Notification notification) {
            this.f3749a = i10;
            this.f3750b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f3744e.notify(this.f3749a, this.f3750b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3752a;

        c(int i10) {
            this.f3752a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f3744e.cancel(this.f3752a);
        }
    }

    private void e() {
        this.f3741b = new Handler(Looper.getMainLooper());
        this.f3744e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3743d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f3741b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        this.f3741b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f3741b.post(new c(i10));
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onCreate() {
        super.onCreate();
        f3740g = this;
        e();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3743d.k();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3742c) {
            l.c().d(f3739f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f3743d.k();
            e();
            this.f3742c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3743d.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f3742c = true;
        l.c().a(f3739f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f3740g = null;
        stopSelf();
    }
}
