package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: LifecycleService.kt */
/* JADX INFO: loaded from: classes.dex */
public class m extends Service implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f2927a = new b0(this);

    @Override // androidx.lifecycle.j
    public f getLifecycle() {
        return this.f2927a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.t.f(intent, "intent");
        this.f2927a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2927a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f2927a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f2927a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
