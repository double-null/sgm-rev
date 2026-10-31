package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class AppRestartDuringAdDetectionService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f6017a;

    public static boolean a() {
        return f6017a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f6017a = false;
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        f6017a = true;
        stopSelf();
    }
}
