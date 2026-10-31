package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class y4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f9144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f9145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f9146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f9148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f9149h;

    public y4(com.applovin.impl.sdk.l lVar) {
        this.f9147f = lVar;
        h0 h0Var = new h0();
        this.f9144c = h0Var;
        this.f9145d = h0Var.a(9);
        this.f9146e = h0Var.a(4);
        this.f9142a = ((Integer) lVar.a(z4.f9300n4)).intValue();
        this.f9143b = ((Float) lVar.a(z4.f9291m4)).floatValue();
    }

    public float a() {
        float[] fArr = this.f9148g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    public float b() {
        return this.f9149h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f9147f.p0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f9144c.b(this);
        if (((Boolean) this.f9147f.q0().a(z4.f9273k4)).booleanValue()) {
            this.f9144c.b(this, this.f9145d, (int) TimeUnit.MILLISECONDS.toMicros(this.f9142a), this.f9147f.Q());
        }
        if (((Boolean) this.f9147f.q0().a(z4.f9282l4)).booleanValue()) {
            this.f9144c.b(this, this.f9146e, (int) TimeUnit.MILLISECONDS.toMicros(this.f9142a), this.f9147f.Q());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f9144c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f9148g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f9149h * this.f9143b;
            this.f9149h = f10;
            this.f9149h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
