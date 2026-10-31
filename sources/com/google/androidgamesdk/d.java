package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f11431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReentrantLock f11432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Condition f11433c;

    private d() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f11432b = reentrantLock;
        this.f11433c = reentrantLock.newCondition();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Log.i("SwappyDisplayManager", "Starting looper thread");
        this.f11432b.lock();
        Looper.prepare();
        this.f11431a = new Handler();
        this.f11433c.signal();
        this.f11432b.unlock();
        Looper.loop();
        Log.i("SwappyDisplayManager", "Terminating looper thread");
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f11432b.lock();
        super.start();
        try {
            this.f11433c.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        this.f11432b.unlock();
    }
}
