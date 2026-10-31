package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.m;
import androidx.work.l;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends m implements e.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f3696d = l.f("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f3697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3698c;

    private void e() {
        e eVar = new e(this);
        this.f3697b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f3698c = true;
        l.c().a(f3696d, "All commands completed in dispatcher", new Throwable[0]);
        n1.m.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f3698c = false;
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3698c = true;
        this.f3697b.j();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3698c) {
            l.c().d(f3696d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3697b.j();
            e();
            this.f3698c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3697b.a(intent, i11);
        return 3;
    }
}
