package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f6720a = (SensorManager) com.applovin.impl.sdk.l.p().getSystemService("sensor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f6721b;

    public h0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f6721b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i10) {
        return this.f6720a.getDefaultSensor(i10);
    }

    public void b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i10, final com.applovin.impl.sdk.p pVar) {
        this.f6721b.post(new Runnable() { // from class: com.applovin.impl.ra
            @Override // java.lang.Runnable
            public final void run() {
                this.f8136a.a(sensorEventListener, sensor, i10, pVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.p pVar) {
        try {
            this.f6720a.registerListener(sensorEventListener, sensor, i10, this.f6721b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                pVar.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(final SensorEventListener sensorEventListener) {
        this.f6721b.post(new Runnable() { // from class: com.applovin.impl.qa
            @Override // java.lang.Runnable
            public final void run() {
                this.f8016a.a(sensorEventListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f6720a.unregisterListener(sensorEventListener);
    }
}
