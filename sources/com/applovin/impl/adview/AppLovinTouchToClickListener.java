package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.p0;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f5979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f5981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f5983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OnClickListener f5984i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.l lVar, z4 z4Var, Context context, OnClickListener onClickListener) {
        this.f5976a = ((Long) lVar.a(z4.f9197c0)).longValue();
        this.f5977b = ((Integer) lVar.a(z4.f9206d0)).intValue();
        this.f5978c = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.f9242h0)).intValue());
        this.f5979d = ClickRecognitionState.values()[((Integer) lVar.a(z4Var)).intValue()];
        this.f5983h = context;
        this.f5984i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f5984i.onClick(view, motionEvent);
        this.f5982g = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f5982g && this.f5979d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f5982g && this.f5979d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f5979d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5980e;
                float fA = a(this.f5981f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f5982g) {
                    long j10 = this.f5976a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f5977b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f5979d != ClickRecognitionState.ACTION_DOWN) {
            this.f5980e = SystemClock.elapsedRealtime();
            this.f5981f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f5982g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    private float a(float f10) {
        return f10 / this.f5983h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f5978c <= 0) {
            return true;
        }
        Point pointB = p0.b(this.f5983h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f5978c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }
}
